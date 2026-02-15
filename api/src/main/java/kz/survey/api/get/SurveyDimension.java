package kz.survey.api.get;

import lombok.Getter;

/**
 * The 8 survey dimensions (categories) for which we compute scores.
 */
@Getter
public enum SurveyDimension {
  LIFE_SATISFACTION("Life Satisfaction"),
  DIGITAL_SELF_REGULATION("Digital Self-Regulation"),
  ONLINE_PRIVACY_AND_CONTROL("Online Privacy & Control"),
  EMOTIONAL_RESILIENCE("Emotional Resilience"),
  PROBLEMATIC_INTERNET_USE_ANXIETY("Problematic Internet Use (PIU) / Anxiety"),
  COMMUNITY_ENGAGEMENT("Community Engagement"),
  SOCIAL_PRESSURE("Social Pressure"),
  RECOMMENDATION_SATISFACTION("Recommendation Satisfaction");

  private final String displayName;

  SurveyDimension(String displayName) {
    this.displayName = displayName;
  }

  /**
   * Maps DB section category (question_category enum) to the 8 survey dimensions.
   * Your 5 categories map to 5 of the 8; the other 3 dimensions stay null until you add sections.
   */
  public static SurveyDimension fromDbCategory(String dbCategory) {
    if (dbCategory == null) return null;
    return switch (dbCategory) {
      case "PERSONAL_FOCUS_AND_WELL_BEING" -> LIFE_SATISFACTION;
      case "DIGITAL_CONSUMPTION" -> DIGITAL_SELF_REGULATION;
      case "PERCEPTION_EVALUATION" -> RECOMMENDATION_SATISFACTION;
      case "INTERNET_USAGE_FREQUENCY" -> PROBLEMATIC_INTERNET_USE_ANXIETY;
      case "DISCUSSION_AND_SHARING_BEHAVIOR" -> COMMUNITY_ENGAGEMENT;
      case "ONLINE_PRIVACY_AND_CONTROL" -> ONLINE_PRIVACY_AND_CONTROL;
      case "EMOTIONAL_RESILIENCE" -> EMOTIONAL_RESILIENCE;
      case "SOCIAL_PRESSURE" -> SOCIAL_PRESSURE;
      default -> null;
    };
  }
}
