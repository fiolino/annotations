package org.fiolino.data.annotation;

/**
 * The sort direction used in @Sorts annotation.
 * <p>
 * Created by kuli on 16.02.16.
 */
public enum SortDirection {
  ASC("asc"),
  DESC("desc");

  private final String representation;

  SortDirection(String representation) {
    this.representation = representation;
  }

  @Override
  public String toString() {
    return representation;
  }
}
