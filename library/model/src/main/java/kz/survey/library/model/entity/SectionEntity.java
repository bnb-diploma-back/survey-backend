package kz.survey.library.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import kz.survey.library.model.enums.QuestionCategory;

@Entity
@Table(name = "sections", schema = "survey")
public class SectionEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Enumerated(EnumType.STRING)
  @Column(name = "category", nullable = false, unique = true)
  private QuestionCategory category;

  @Column(nullable = false)
  private String title;
}
