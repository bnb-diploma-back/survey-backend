package kz.survey.api.get;

import static kz.survey.library.jooq.survey.ddl.survey.Tables.QUESTIONS;
import static kz.survey.library.jooq.survey.ddl.survey.Tables.RECORDS;

import java.util.UUID;
import lombok.RequiredArgsConstructor;
import org.jooq.DSLContext;
import org.springframework.stereotype.Service;

/**
 * Computes the 8 dimension scores for a respondent using per-question dimension weights.
 * For each dimension: weighted average of Likert (1–7) over all answers, using the question's
 * weight for that dimension. Score = sum(weight * likert) / sum(weight); null if no data.
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

    // sumWeight[i], sumWeightedLikert[i] for each of the 8 dimensions
    double[] sumWeight = new double[8];
    double[] sumWeightedLikert = new double[8];

    for (var row : rows) {
      Double likert = numericalLikertValue(row.get(likertField));
      if (likert == null) continue;

      accumulate(row.get(QUESTIONS.LIFE_SATISFACTION), likert, sumWeight, sumWeightedLikert, 0);
      accumulate(row.get(QUESTIONS.DIGITAL_SELF_REGULATION), likert, sumWeight, sumWeightedLikert, 1);
      accumulate(row.get(QUESTIONS.ONLINE_PRIVACY_AND_CONTROL), likert, sumWeight, sumWeightedLikert, 2);
      accumulate(row.get(QUESTIONS.EMOTIONAL_RESILIENCE), likert, sumWeight, sumWeightedLikert, 3);
      accumulate(row.get(QUESTIONS.PROBLEMATIC_INTERNET_USE_ANXIETY), likert, sumWeight, sumWeightedLikert, 4);
      accumulate(row.get(QUESTIONS.COMMUNITY_ENGAGEMENT), likert, sumWeight, sumWeightedLikert, 5);
      accumulate(row.get(QUESTIONS.SOCIAL_PRESSURE), likert, sumWeight, sumWeightedLikert, 6);
      accumulate(row.get(QUESTIONS.RECOMMENDATION_SATISFACTION), likert, sumWeight, sumWeightedLikert, 7);
    }

    return SurveyResponse.builder()
        .lifeSatisfaction(weightedAvg(sumWeight[0], sumWeightedLikert[0]))
        .digitalSelfRegulation(weightedAvg(sumWeight[1], sumWeightedLikert[1]))
        .onlinePrivacyAndControl(weightedAvg(sumWeight[2], sumWeightedLikert[2]))
        .emotionalResilience(weightedAvg(sumWeight[3], sumWeightedLikert[3]))
        .problematicInternetUseAnxiety(weightedAvg(sumWeight[4], sumWeightedLikert[4]))
        .communityEngagement(weightedAvg(sumWeight[5], sumWeightedLikert[5]))
        .socialPressure(weightedAvg(sumWeight[6], sumWeightedLikert[6]))
        .recommendationSatisfaction(weightedAvg(sumWeight[7], sumWeightedLikert[7]))
        .build();
  }

  private static void accumulate(Double weight, Double likert, double[] sumWeight, double[] sumWeightedLikert, int i) {
    if (weight != null && weight != 0) {
      sumWeight[i] += weight;
      sumWeightedLikert[i] += weight * likert;
    }
  }

  private static Double weightedAvg(double sumWeight, double sumWeightedLikert) {
    if (sumWeight == 0) return null;
    return sumWeightedLikert / sumWeight;
  }

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
