package kz.survey.api.get;

/**
 * Whether higher raw score means better (PROTECTIVE) or worse (RISK).
 * RISK dimensions get risk inversion: normalizedPercent = 100 - normalizedPercent.
 */
public enum DimensionType {
  /** Higher normalizedPercent = better. No inversion. */
  PROTECTIVE,
  /** Higher raw = worse (e.g. anxiety). Invert so higher normalizedPercent = better. */
  RISK
}
