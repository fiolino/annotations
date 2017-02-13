package org.fiolino.data.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Mark fields and parameters that shall automatically be filled from the database.
 *
 * @author Michael Kuhlmann <michael@kuhlmann.org>
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
public @interface Source {

  /**
   * The name of the mapped column. Defaults to the name of the field, if it is such,
   * and is mandatory for parameters.
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

  /**
   * Here you can specify a class with various converter methods. These must be annotated either
   * with @ExecuteDirect or @MethodFinder (see Methods for further information).
   * <p/>
   * One of these methods' return types must match the value's type. The methods must either have a
   * wingle parameters whose type will be used for fetching the correct value from the ResultSet,
   * or it must be the ResultSet and a column index (or SelectedColumn) for fetching the values directly.
   */
  Class<?> converter() default void.class;

  /**
   * Sets whether either the value can be null, or it just doesn't care, or it is check to not be null.
   */
  Binding binding() default Binding.IGNORED;
}
