package kz.survey.library.model.repository;

import kz.survey.library.model.entity.SectionEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface SectionRepository extends CrudRepository<SectionEntity, Long> {
  @Query("select u.sectionEntity from QuestionEntity u where u.fullQuestion = :fullQuestion")
  SectionEntity findByFullQuestion(@Param("fullQuestion") String fullQuestion);
}
