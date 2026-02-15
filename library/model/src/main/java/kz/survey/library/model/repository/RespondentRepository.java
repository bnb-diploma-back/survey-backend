package kz.survey.library.model.repository;

import kz.survey.library.model.entity.RespondentEntity;
import org.springframework.data.repository.CrudRepository;

public interface RespondentRepository extends CrudRepository<RespondentEntity, Long> {

}
