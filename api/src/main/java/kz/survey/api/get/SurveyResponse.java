package kz.survey.api.get;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Response with scores for each of the 8 survey dimensions (raw, normalizedPercent, tier)
 * and overall Digital Wellbeing Index (average of 7 core dimensions, 0–100, 1 decimal).
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SurveyResponse {
  /** 1) Life Satisfaction */
  private DimensionScore lifeSatisfaction;
  /** 2) Digital Self-Regulation */
  private DimensionScore digitalSelfRegulation;
  /** 3) Online Privacy & Control */
  private DimensionScore onlinePrivacyAndControl;
  /** 4) Emotional Resilience */
  private DimensionScore emotionalResilience;
  /** 5) Problematic Internet Use (PIU) / Anxiety */
  private DimensionScore problematicInternetUseAnxiety;
  /** 6) Community Engagement */
  private DimensionScore communityEngagement;
  /** 7) Social Pressure */
  private DimensionScore socialPressure;
  /** 8) Recommendation Satisfaction */
  private DimensionScore recommendationSatisfaction;
  /** Average of normalizedPercent across 7 core dimensions (excl. Recommendation Satisfaction). 0–100, 1 decimal. */
  private Double overallIndex;
}
