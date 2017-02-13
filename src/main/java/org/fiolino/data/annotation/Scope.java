package org.fiolino.data.annotation;

/**
 * Declares the scope of id-to-model maps while reading from database.
 * <p>
 * Created by Michael Kuhlmann on 19.02.2016.
 */
public enum Scope {
  /**
   * This scope means cached relations will be discarded after the owning beans are processed.
   */
  BEAN_LOCAL {
    @Override
    public Scope orDefault(Scope defaultScope) {
      return BEAN_LOCAL;
    }
  },

  /**
   * This scope desclares cached relations to be valid independent of their owners.
   */
  GLOBAL {
    @Override
    public Scope orDefault(Scope defaultScope) {
      return GLOBAL;
    }
  },

  /**
   * The scope will be LOCAL for One-to-many relation, and GLOBAL in all other cases.
   */
  UNDECLARED {
    @Override
    public Scope orDefault(Scope defaultScope) {
      return defaultScope;
    }
  };

  public abstract Scope orDefault(Scope defaultScope);
}
