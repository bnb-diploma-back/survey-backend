package kz.survey.api;

import java.util.UUID;
import kz.survey.api.get.SurveyResponse;
import kz.survey.api.save.SaveRequest;
import kz.survey.api.save.SaveResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/survey")
@RequiredArgsConstructor
public class SurveyController {
  private final SurveyDelegate delegate;

  @PostMapping
  public SaveResponse save(@RequestBody SaveRequest toSave){
    return delegate.save(toSave);
  }

  @GetMapping("/{id}")
  public SurveyResponse getById(@PathVariable("id") UUID id){
    return delegate.getById(id);
  }

}
