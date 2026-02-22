package kz.survey.api.get;

/**
 * Bounded normalization for dimension scores, with risk inversion and tier logic.
 * Theoretical min/max always; output 0–100; division-by-zero safe.
 */
public final class SurveyScoring {

  private static final double LIKERT_MIN = 1.0;
  private static final double LIKERT_MAX = 7.0;

  /** Tier thresholds: 90–100 → 1, 75–89 → 2, 50–74 → 3, &lt;50 → 4 */
  private static final double TIER_1_MIN = 90.0;
  private static final double TIER_2_MIN = 75.0;
  private static final double TIER_3_MIN = 50.0;

  private SurveyScoring() {}

  /**
   * Normalize to 0–100 and compute tier. Returns DimensionScore with raw, normalizedPercent, tier.
   * normalizedPercent is the raw normalized value (no inversion in response).
   * Tier for RISK dimensions is based on (100 - n) so higher inverted = better tier.
   */
  public static DimensionScore normalizeWithTier(
      double raw,
      double positiveWeightSum,
      double negativeWeightSum,
      DimensionType dimensionType) {
    DimensionScore base = normalize(raw, positiveWeightSum, negativeWeightSum);
    if (base.getRaw() == null && base.getNormalizedPercent() == null) {
      return DimensionScore.builder().raw(null).normalizedPercent(null).tier(null).build();
    }
    Double percent = base.getNormalizedPercent();
    Integer tier = percent != null ? computeTierForDimension(percent, dimensionType) : null;
    return DimensionScore.builder()
        .raw(base.getRaw())
        .normalizedPercent(round1Decimal(percent))
        .tier(tier)
        .build();
  }

  /**
   * Tier from normalized percent. For RISK use (100 - n) so higher inverted = better = tier 1.
   * For PROTECTIVE use n as-is. Tier 1: 90–100, 2: 75–89, 3: 50–74, 4: &lt;50.
   */
  public static Integer computeTierForDimension(Double normalizedPercent, DimensionType dimensionType) {
    if (normalizedPercent == null) return null;
    double value = dimensionType == DimensionType.RISK
        ? (100.0 - normalizedPercent)
        : normalizedPercent;
    return computeTier(value);
  }

  /** Tier 1: 90–100, Tier 2: 75–89, Tier 3: 50–74, Tier 4: &lt;50. Returns null if percent is null. */
  public static Integer computeTier(Double normalizedPercent) {
    if (normalizedPercent == null) return null;
    if (normalizedPercent >= TIER_1_MIN) return 1;
    if (normalizedPercent >= TIER_2_MIN) return 2;
    if (normalizedPercent >= TIER_3_MIN) return 3;
    return 4;
  }

  /**
   * Compute normalized percentage from raw sum and weight sums (no inversion, no tier).
   * MIN = (7 × negativeWeightSum) + (1 × positiveWeightSum)
   * MAX = (7 × positiveWeightSum) + (1 × negativeWeightSum)
   * percent = (RAW − MIN) / (MAX − MIN) × 100, clamped to [0, 100].
   */
  public static DimensionScore normalize(
      double raw,
      double positiveWeightSum,
      double negativeWeightSum) {
    if (positiveWeightSum == 0 && negativeWeightSum == 0) {
      return DimensionScore.builder().raw(null).normalizedPercent(null).tier(null).build();
    }

    double min = (LIKERT_MAX * negativeWeightSum) + (LIKERT_MIN * positiveWeightSum);
    double max = (LIKERT_MAX * positiveWeightSum) + (LIKERT_MIN * negativeWeightSum);

    double percent;
    if (max > min) {
      percent = (raw - min) / (max - min) * 100.0;
      percent = Math.max(0.0, Math.min(100.0, percent));
    } else {
      percent = 50.0;
    }

    return DimensionScore.builder()
        .raw(raw)
        .normalizedPercent(percent)
        .tier(null)
        .build();
  }

  /** Round to 1 decimal place. Returns null if value is null. */
  public static Double round1Decimal(Double value) {
    if (value == null) return null;
    return Math.round(value * 10.0) / 10.0;
  }

  /**
   * Overall Digital Wellbeing Index: average across 7 core dimensions (exclude Recommendation Satisfaction).
   * For RISK dimensions use (100 - normalizedPercent) so higher = better; for PROTECTIVE use normalizedPercent.
   * Only non-null dimensions; result 0–100, rounded to 1 decimal.
   */
  public static Double overallIndex(java.util.Map<SurveyDimension, DimensionScore> scores) {
    double sum = 0.0;
    int count = 0;
    for (SurveyDimension dim : SurveyDimension.values()) {
      if (!dim.isIncludedInOverallIndex()) continue;
      DimensionScore score = scores.get(dim);
      if (score != null && score.getNormalizedPercent() != null) {
        double value = dim.getDimensionType() == DimensionType.RISK
            ? (100.0 - score.getNormalizedPercent())
            : score.getNormalizedPercent();
        sum += value;
        count++;
      }
    }
    if (count == 0) return null;
    return round1Decimal(sum / count);
  }
}
