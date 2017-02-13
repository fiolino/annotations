package org.fiolino.data.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Specifies an alternative index value for a given discrete value.
 *
 * You should only annotate enum values with this, other fields are not supported.
 *
 * Created by kuli on 18.01.17.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface IndexedAs {
  /**
   * The alternate value that goes into the index.
   */
  String value();

  /**
   * Alternative values from the index to get mapped to this field.
   * Used for backwards compatibility with former values.
   * The original field name is used as an alternative by default and doesn't need to be specified here,
   * but you can overwrite existing enum names with this.
   */
  String[] alternatives() default {};
}
