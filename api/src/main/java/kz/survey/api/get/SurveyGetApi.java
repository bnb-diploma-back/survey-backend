package kz.survey.api.get;

import static kz.survey.library.jooq.survey.ddl.survey.Tables.QUESTIONS;
import static kz.survey.library.jooq.survey.ddl.survey.Tables.RECORDS;

import java.util.EnumMap;
import java.util.Map;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import org.jooq.DSLContext;
import org.jooq.Record;
import org.springframework.stereotype.Service;

/**
 * Computes the 8 dimension scores for a respondent using enum-driven bounded normalization,
 * risk inversion for RISK dimensions, tier logic, and overall Digital Wellbeing Index (7 dimensions).
 */
@Service
@RequiredArgsConstructor
public class SurveyGetApi {

  private final DSLContext dsl;

  public SurveyResponse getById(UUID id) {
    var likertField = RECORDS.LIKERT_VALUE.cast(String.class);
    var rows = dsl
        .select(
            likertField,
            QUESTIONS.LIFE_SATISFACTION,
            QUESTIONS.DIGITAL_SELF_REGULATION,
            QUESTIONS.ONLINE_PRIVACY_AND_CONTROL,
            QUESTIONS.EMOTIONAL_RESILIENCE,
            QUESTIONS.PROBLEMATIC_INTERNET_USE_ANXIETY,
            QUESTIONS.COMMUNITY_ENGAGEMENT,
            QUESTIONS.SOCIAL_PRESSURE,
            QUESTIONS.RECOMMENDATION_SATISFACTION)
        .from(RECORDS)
        .join(QUESTIONS).on(RECORDS.QUESTION_ID.eq(QUESTIONS.ID))
        .where(RECORDS.UUID.eq(id))
        .fetch();

    Map<SurveyDimension, Accumulator> acc = new EnumMap<>(SurveyDimension.class);
    for (SurveyDimension dim : SurveyDimension.values()) {
      acc.put(dim, new Accumulator(0.0, 0.0, 0.0));
    }

    for (var row : rows) {
      Double likert = numericalLikertValue(row.get(likertField));
      if (likert == null) continue;

      for (SurveyDimension dim : SurveyDimension.values()) {
        Double weight = getWeight(row, dim);
        if (weight != null && weight != 0) {
          Accumulator a = acc.get(dim);
          acc.put(dim, new Accumulator(
              a.raw + weight * likert,
              a.positiveWeightSum + (weight > 0 ? weight : 0),
              a.negativeWeightSum + (weight < 0 ? weight : 0)));
        }
      }
    }

    Map<SurveyDimension, DimensionScore> scores = new EnumMap<>(SurveyDimension.class);
    for (SurveyDimension dim : SurveyDimension.values()) {
      Accumulator a = acc.get(dim);
      scores.put(dim, SurveyScoring.normalizeWithTier(
          a.raw, a.positiveWeightSum, a.negativeWeightSum, dim.getDimensionType()));
    }

    Double overallIndex = SurveyScoring.overallIndex(scores);

    return SurveyResponse.builder()
        .lifeSatisfaction(scores.get(SurveyDimension.LIFE_SATISFACTION))
        .digitalSelfRegulation(scores.get(SurveyDimension.DIGITAL_SELF_REGULATION))
        .onlinePrivacyAndControl(scores.get(SurveyDimension.ONLINE_PRIVACY_AND_CONTROL))
        .emotionalResilience(scores.get(SurveyDimension.EMOTIONAL_RESILIENCE))
        .problematicInternetUseAnxiety(scores.get(SurveyDimension.PROBLEMATIC_INTERNET_USE_ANXIETY))
        .communityEngagement(scores.get(SurveyDimension.COMMUNITY_ENGAGEMENT))
        .socialPressure(scores.get(SurveyDimension.SOCIAL_PRESSURE))
        .recommendationSatisfaction(scores.get(SurveyDimension.RECOMMENDATION_SATISFACTION))
        .overallIndex(overallIndex)
        .build();
  }

  /** Resolve DB weight field for this dimension (dimension-agnostic, extensible). */
  private static Double getWeight(Record row, SurveyDimension dim) {
    return switch (dim) {
      case LIFE_SATISFACTION -> row.get(QUESTIONS.LIFE_SATISFACTION);
      case DIGITAL_SELF_REGULATION -> row.get(QUESTIONS.DIGITAL_SELF_REGULATION);
      case ONLINE_PRIVACY_AND_CONTROL -> row.get(QUESTIONS.ONLINE_PRIVACY_AND_CONTROL);
      case EMOTIONAL_RESILIENCE -> row.get(QUESTIONS.EMOTIONAL_RESILIENCE);
      case PROBLEMATIC_INTERNET_USE_ANXIETY -> row.get(QUESTIONS.PROBLEMATIC_INTERNET_USE_ANXIETY);
      case COMMUNITY_ENGAGEMENT -> row.get(QUESTIONS.COMMUNITY_ENGAGEMENT);
      case SOCIAL_PRESSURE -> row.get(QUESTIONS.SOCIAL_PRESSURE);
      case RECOMMENDATION_SATISFACTION -> row.get(QUESTIONS.RECOMMENDATION_SATISFACTION);
    };
  }

  private record Accumulator(double raw, double positiveWeightSum, double negativeWeightSum) {}

  public Double numericalLikertValue(String likert) {
    if (likert == null) return null;
    return switch (likert.toUpperCase()) {
      case "STRONGLY_DISAGREE" -> 1.0;
      case "DISAGREE" -> 2.0;
      case "SOMEWHAT_DISAGREE" -> 3.0;
      case "NEITHER_AGREE_NOR_DISAGREE" -> 4.0;
      case "SOMEWHAT_AGREE" -> 5.0;
      case "AGREE" -> 6.0;
      case "STRONGLY_AGREE" -> 7.0;
      default -> null;
    };
  }
}
