package kz.survey.api.get;

import lombok.Data;

@Data
public class SurveyRecord {

  private String fullQuestion;
  private String likertValue;
  private Long sectionId;
}
