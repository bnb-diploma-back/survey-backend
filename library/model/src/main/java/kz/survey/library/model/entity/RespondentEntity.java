package kz.survey.library.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.UUID;
import kz.survey.library.model.enums.Gender;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

@Entity
@Table(name = "respondents", schema = "survey")
@Accessors(chain = true)
public class RespondentEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "uuid", nullable = false)
  @Getter
  @Setter
  private UUID uuid;

  @Getter
  @Setter
  private Integer age;

  @Getter
  @Enumerated(EnumType.STRING)
  @JdbcTypeCode(SqlTypes.NAMED_ENUM)
  @Column(name = "gender", columnDefinition = "survey.gender")
  private Gender gender;

  @Getter
  @Setter
  @Column(name = "avg_screen_time_hours")
  private Double averageScreenTime;

  public RespondentEntity setGender(String genderStr) {
    if (genderStr == null) {
      this.gender = null;
    } else {
      this.gender = Gender.valueOf(genderStr.toUpperCase());
    }
    return this;
  }
}
