package kz.survey.library.model.repository;

import kz.survey.library.model.entity.QuestionEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface QuestionRepository extends CrudRepository<QuestionEntity, Long> {
  @Query("select u from QuestionEntity u where u.fullQuestion = :fullQuestion")
  QuestionEntity findByFullQuestion(@Param("fullQuestion") String fullQuestion);
}
