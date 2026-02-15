package kz.survey.api.save;

import jakarta.transaction.Transactional;
import java.util.UUID;
import kz.survey.api.save.dto.SurveyQuestion;
import kz.survey.library.model.entity.RecordEntity;
import kz.survey.library.model.entity.RespondentEntity;
import kz.survey.library.model.repository.QuestionRepository;
import kz.survey.library.model.repository.RecordRepository;
import kz.survey.library.model.repository.RespondentRepository;
import kz.survey.library.model.repository.SectionRepository;
import lombok.AllArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class SurveySaveApi {
  private final RespondentRepository respondentRepository;
  private final QuestionRepository questionRepository;
  private final SectionRepository sectionRepository;
  private final RecordRepository recordRepository;
  private final ApplicationEventPublisher publisher;

  @Transactional
  public SaveResponse save(SaveRequest toSave) {
    final var uuid = UUID.randomUUID();
    final var respondent = new RespondentEntity()
        .setUuid(uuid)
        .setAge(toSave.getAge())
        .setGender(toSave.getGender().toString())
        .setAverageScreenTime(toSave.getAverageScreenTime());
    respondentRepository.save(respondent);

    for (SurveyQuestion item : toSave.getQuestions()) {
      final var question = item.getQuestion();
      final var answer = item.getAnswer();
      if (question == null || answer == null) continue;

      final var questionEntity = questionRepository.findByFullQuestion(question);
      final var section = sectionRepository.findByFullQuestion(question);
      if (questionEntity == null || section == null) continue;

      final var record = new RecordEntity()
          .setUuid(uuid)
          .setQuestionEntity(questionEntity)
          .setSectionEntity(section)
          .setLikert(answer.toString());

      recordRepository.save(record);
    }
    return new SaveResponse(uuid);
  }

}
