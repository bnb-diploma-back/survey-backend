package kz.survey.api.get;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Response with scores for each of the 8 survey dimensions.
 * Each score is a weighted average: sum(question_weight * likert) / sum(question_weight)
 * over all answers for that respondent; null if no questions have a weight for that dimension.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SurveyResponse {
  /** 1) Life Satisfaction */
  private Double lifeSatisfaction;
  /** 2) Digital Self-Regulation */
  private Double digitalSelfRegulation;
  /** 3) Online Privacy & Control */
  private Double onlinePrivacyAndControl;
  /** 4) Emotional Resilience */
  private Double emotionalResilience;
  /** 5) Problematic Internet Use (PIU) / Anxiety */
  private Double problematicInternetUseAnxiety;
  /** 6) Community Engagement */
  private Double communityEngagement;
  /** 7) Social Pressure */
  private Double socialPressure;
  /** 8) Recommendation Satisfaction */
  private Double recommendationSatisfaction;
}
