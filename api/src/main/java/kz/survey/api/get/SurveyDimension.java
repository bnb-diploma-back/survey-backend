package kz.survey.api.get;

import lombok.Getter;

/**
 * The 8 survey dimensions with metadata: display name, type (PROTECTIVE/RISK), and whether
 * the dimension is included in the overall Digital Wellbeing Index (7 core dimensions only).
 */
@Getter
public enum SurveyDimension {
  LIFE_SATISFACTION("Life Satisfaction", DimensionType.PROTECTIVE),
  DIGITAL_SELF_REGULATION("Digital Self-Regulation", DimensionType.PROTECTIVE),
  ONLINE_PRIVACY_AND_CONTROL("Online Privacy & Control", DimensionType.PROTECTIVE),
  EMOTIONAL_RESILIENCE("Emotional Resilience", DimensionType.PROTECTIVE),
  PROBLEMATIC_INTERNET_USE_ANXIETY("Problematic Internet Use (PIU) / Anxiety", DimensionType.RISK),
  COMMUNITY_ENGAGEMENT("Community Engagement", DimensionType.PROTECTIVE),
  SOCIAL_PRESSURE("Social Pressure", DimensionType.RISK),
  RECOMMENDATION_SATISFACTION("Recommendation Satisfaction", DimensionType.PROTECTIVE);

  private final String displayName;
  private final DimensionType dimensionType;

  SurveyDimension(String displayName, DimensionType dimensionType) {
    this.displayName = displayName;
    this.dimensionType = dimensionType;
  }

  /** True for the 7 core dimensions; false for Recommendation Satisfaction (excluded from overall index). */
  public boolean isIncludedInOverallIndex() {
    return this != RECOMMENDATION_SATISFACTION;
  }

  /**
   * Maps DB section category (question_category enum) to the 8 survey dimensions.
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
