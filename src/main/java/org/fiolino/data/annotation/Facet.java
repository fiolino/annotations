package org.fiolino.data.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author Michael Kuhlmann <michael@kuhlmann.org>
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.METHOD})
public @interface Facet {

  /**
   * The identifying names of the category.
   */
  String[] value();

  /**
   * The name of the Solr field. Defaults to a combination of the values, lowercased.
   */
  String fieldName() default "";

  /**
   * The tag name is used for excluding filters. For instance, specify an alternative category name,
   * or a solr field name without the suffix.
   */
  String tagName() default "";

  /**
   * Distinguish between ranges of few or many values.
   */
  Hint hint() default Hint.LIMITED_SIZE;

  /**
   * If it's not filterable, then there's no !ex tag needed.
   */
  boolean filterable() default true;

  /**
   * If this is true, then there are multiple attributes for the same facet name allowed.
   */
  boolean allowMulti() default false;
}
