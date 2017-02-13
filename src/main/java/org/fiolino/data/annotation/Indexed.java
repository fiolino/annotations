package org.fiolino.data.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * This annotation marks fields and methods whose values shall be indexed into Solr.
 *
 * @author Michael Kuhlmann <michael@kuhlmann.org>
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
public @interface Indexed {

  /**
   * The target name in the index. Defaults to the name of the column, if there is one, or the field's name.
   */
  String value() default "";

  /**
   * The boosting value of that field.
   */
  float boost() default 1.0f;

  /**
   * Gets the boosting value from a property.
   */
  String boostProperty() default "";

  /**
   * Specify fields that should be looked up as well.
   * Used for compatibility when you change the schema but still want to be able to read older documents.
   */
  String[] compatibleTo() default {};
}
