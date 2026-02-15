package kz.survey.library.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "questions", schema = "survey")
@Getter
@Setter
public class QuestionEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "full_question", nullable = false, length = 1000)
  private String fullQuestion;

  @ManyToOne(optional = false)
  @JoinColumn(name = "section_id")
  private SectionEntity sectionEntity;

  /** 1) Life Satisfaction */
  @Column(name = "life_satisfaction")
  private Double lifeSatisfaction;

  /** 2) Digital Self-Regulation */
  @Column(name = "digital_self_regulation")
  private Double digitalSelfRegulation;

  /** 3) Online Privacy & Control */
  @Column(name = "online_privacy_and_control")
  private Double onlinePrivacyAndControl;

  /** 4) Emotional Resilience */
  @Column(name = "emotional_resilience")
  private Double emotionalResilience;

  /** 5) Problematic Internet Use (PIU) / Anxiety */
  @Column(name = "problematic_internet_use_anxiety")
  private Double problematicInternetUseAnxiety;

  /** 6) Community Engagement */
  @Column(name = "community_engagement")
  private Double communityEngagement;

  /** 7) Social Pressure */
  @Column(name = "social_pressure")
  private Double socialPressure;

  /** 8) Recommendation Satisfaction */
  @Column(name = "recommendation_satisfaction")
  private Double recommendationSatisfaction;
}
