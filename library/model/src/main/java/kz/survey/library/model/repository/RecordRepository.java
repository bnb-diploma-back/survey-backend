package kz.survey.library.model.repository;

import kz.survey.library.model.entity.RecordEntity;
import org.springframework.data.repository.CrudRepository;

public interface RecordRepository extends CrudRepository<RecordEntity, Long> {

}
