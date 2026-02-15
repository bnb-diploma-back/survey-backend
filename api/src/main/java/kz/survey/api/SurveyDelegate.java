package kz.survey.api;

import java.util.UUID;
import kz.survey.api.get.SurveyGetApi;
import kz.survey.api.get.SurveyResponse;
import kz.survey.api.save.SaveRequest;
import kz.survey.api.save.SaveResponse;
import kz.survey.api.save.SurveySaveApi;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SurveyDelegate {
  private final SurveySaveApi surveySaveApi;
  private final SurveyGetApi surveyGetApi;

  public SaveResponse save(SaveRequest toSave){
    return surveySaveApi.save(toSave);
  }

  public SurveyResponse getById(UUID id){
    return surveyGetApi.getById(id);
  }

}
