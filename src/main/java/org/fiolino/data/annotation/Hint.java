package org.fiolino.data.annotation;

/**
 * Created by kuli on 27.09.16.
 */
public enum Hint {
  LIMITED_SIZE(ValueRange.LIMITED),
  LARGE_SIZE(ValueRange.LARGE),
  ONLY_COUNT(ValueRange.LARGE);

  private final ValueRange valueRange;

  Hint(ValueRange valueRange) {
    this.valueRange = valueRange;
  }

  public ValueRange getValueRange() {
    return valueRange;
  }
}
