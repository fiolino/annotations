package org.fiolino.data.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Declares a relation to be ordered.
 *
 * Created by kuli on 11.02.15.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.METHOD})
public @interface Ordered {
  /**
   * Can be ordered by a field name of the target type.
   * If empty, the default ordering specified in the Hibernate setting is used.
   */
  String value() default "";
}
