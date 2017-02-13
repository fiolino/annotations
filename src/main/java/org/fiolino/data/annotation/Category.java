package org.fiolino.data.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Specifies an alternate category name for entities.
 * If not given, the class' simple name is used.
 *
 * Created by kuli on 08.02.16.
 */
@Retention(RUNTIME)
@Target(TYPE)
public @interface Category {
  /**
   * The name of the category. By default, it's the simple class name.
   */
  String value();
}
