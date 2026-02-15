package kz.survey.api.save.dto;

public enum LikertEnum {

  STRONGLY_DISAGREE(1, "Strongly Disagree"),
  DISAGREE(2, "Disagree"),
  SOMEWHAT_DISAGREE(3, "Somewhat Disagree"),
  NEITHER_AGREE_NOR_DISAGREE(4, "Neither Agree nor Disagree"),
  SOMEWHAT_AGREE(5, "Somewhat Agree"),
  AGREE(6, "Agree"),
  STRONGLY_AGREE(7, "Strongly Agree");

  private final int score;
  private final String label;

  LikertEnum(int score, String label) {
    this.score = score;
    this.label = label;
  }

  public int getScore() {
    return score;
  }

  public String getLabel() {
    return label;
  }

  /**
   * Convert from numeric score to enum
   */
  public static LikertEnum fromScore(int score) {
    for (LikertEnum value : values()) {
      if (value.score == score) {
        return value;
      }
    }
    throw new IllegalArgumentException("Invalid Likert score: " + score);
  }

  /**
   * Convert from label (case-insensitive)
   */
  public static LikertEnum fromLabel(String label) {
    for (LikertEnum value : values()) {
      if (value.label.equalsIgnoreCase(label)) {
        return value;
      }
    }
    throw new IllegalArgumentException("Invalid Likert label: " + label);
  }
}
