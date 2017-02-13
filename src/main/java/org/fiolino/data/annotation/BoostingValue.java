
package org.fiolino.data.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Defines a boosting value for the whole document.
 * Shall be added to a field that returns some kind of boosting value
 *
 * If the field type is a String, then the boosting value will be read from a property. If it's null then, it will be ignored.
 *
 * If the field type is a Number, then the boosting value will be used directly.
 * If multiple fields of a kind specify boosting values, then these will be multiplied.
 * If the resulting value is zero or less than, then the document won't get indexed at all.
 *
 * @author Michael Kuhlmann <michael@kuhlmann.org>
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.METHOD})
public @interface BoostingValue {
  /**
   * The value itself, is a factor multiplied to the result.
   */
  float value() default 1.0f;

  /**
   * Gets a boosting value from a property.
   */
  String property() default "";
}
