package org.fiolino.data.base;

/**
 * Created by kuli on 23.09.16.
 */
public final class WeightedText extends Text {
  private float weight;

  private WeightedText() {
  }

  public static WeightedText valueOf(String t, float weight) {
    return new WeightedText(t, weight);
  }

  private WeightedText(String text, float weight) {
    super(text);
    this.weight = weight;
  }

  public float getWeight() {
    return weight;
  }

  public void setWeight(float weight) {
    this.weight = weight;
  }
}
