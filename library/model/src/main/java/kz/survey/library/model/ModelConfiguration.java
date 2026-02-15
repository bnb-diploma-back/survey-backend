package kz.survey.library.model;

import kz.survey.library.model.entity.EntityScanner;
import kz.survey.library.model.repository.RepositoryScanner;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.persistence.autoconfigure.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@AutoConfiguration
@EnableJpaAuditing
@EntityScan(basePackageClasses = EntityScanner.class)
@EnableJpaRepositories(basePackageClasses = {RepositoryScanner.class})
public class ModelConfiguration {
}
