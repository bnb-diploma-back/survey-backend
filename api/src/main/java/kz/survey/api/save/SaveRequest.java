package kz.survey.api.save;

import java.util.List;
import kz.survey.api.save.dto.Gender;
import kz.survey.api.save.dto.SurveyQuestion;
import lombok.Data;

@Data
public class SaveRequest {
  private Integer age;
  private Gender gender;
  private Double averageScreenTime;
  private List<SurveyQuestion> questions;
}
