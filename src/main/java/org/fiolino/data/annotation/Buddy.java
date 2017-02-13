package org.fiolino.data.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Marks a class that behaves as a buddy for other types.
 *
 * Created by kuli on 13.03.15.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Inherited
public @interface Buddy {
  /**
   * Is a buddy for all these types.
   */
  Class<?>[] value() default Object.class;
}
