package org.fiolino.data.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by kuli on 19.12.16.
 */
@Retention(RUNTIME)
@Target({FIELD, METHOD, TYPE})
public @interface Register {
  /**
   * The types under which to register.
   */
  Type[] value();

  /**
   * Used to order fields, if necessary.
   */
  int order() default 1;

  /**
   * Specifies the actual fields, if this just points to a relation.
   */
  String[] fields() default {};

  /**
   * Alias names to fine these fields.
   */
  String[] aliases() default {};
}
