package kz.survey.api.get;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Score for a single dimension: raw sum, normalized 0–100%, and tier.
 * normalizedPercent is the raw normalized value (no risk inversion). Risk inversion is used only when computing overallIndex.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DimensionScore {
  /** RAW = Σ(weight × likert). Null if no answers with non-zero weight. */
  private Double raw;
  /** Normalized percentage in [0, 100] (no inversion). Null if no data. */
  private Double normalizedPercent;
  /** Gamification tier: 1 (90–100), 2 (75–89), 3 (50–74), 4 (&lt;50). Null if no data. */
  private Integer tier;
}
