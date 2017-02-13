package org.fiolino.data.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Mark fields that point to an externally defined relation.
 *
 * @author Michael Kuhlmann <michael@kuhlmann.org>
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.METHOD})
public @interface Relation {

  /**
   * The name of the mapped relation. Defaults to the name of the field, if it is such.
   */
  String value() default "";

  /**
   * Defines a path from the original relation to the target relation.
   * <p/>
   * You can also use the dot notation in the value, or use a dollar sign in the field name.
   */
  String[] path() default {};

  /**
   * Specify a typename in which the attribute is looked by.
   * Useful if several subclasses have the same field (like status).
   * If not specified, the whole hierarchy is looked up.
   */
  String typename() default "";

  /**
   * The scope of that relation. Not useful for standard fields.
   */
  Scope scope() default Scope.UNDECLARED;
}
