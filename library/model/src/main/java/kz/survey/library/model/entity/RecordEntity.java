package kz.survey.library.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.util.UUID;
import kz.survey.library.model.enums.LikertEnum;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

@Entity
@Table(name = "records", schema = "survey")
@Accessors(chain = true)
public class RecordEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "uuid")
  @Getter
  @Setter
  private UUID uuid;

  @ManyToOne(optional = false)
  @JoinColumn(name = "question_id")
  @Getter
  @Setter
  private QuestionEntity questionEntity;

  @ManyToOne(optional = false)
  @JoinColumn(name = "section_id")
  @Getter
  @Setter
  private SectionEntity sectionEntity;

  @Enumerated(EnumType.STRING)
  @JdbcTypeCode(SqlTypes.NAMED_ENUM)
  @Column(name = "likert_value", nullable = false, columnDefinition = "survey.likert_enum")
  @Getter
  private LikertEnum likert;

  public RecordEntity setLikert(String likertStr) {
    if (likertStr == null) {
      this.likert = null;
    } else {
      String normalized = likertStr.trim().toUpperCase().replace(' ', '_');
      try {
        this.likert = LikertEnum.valueOf(normalized);
      } catch (IllegalArgumentException e) {
        this.likert = LikertEnum.fromLabel(likertStr.trim());
      }
    }
    return this;
  }
}