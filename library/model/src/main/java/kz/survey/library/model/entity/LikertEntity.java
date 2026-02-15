package kz.survey.library.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import kz.survey.library.model.enums.LikertEnum;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "likerts", schema = "survey")
public class LikertEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Getter
  private Long id;

  @Enumerated(EnumType.STRING)
  @Getter
  @Setter
  @Column(name = "likert_value", nullable = false)
  private LikertEnum value;
}
