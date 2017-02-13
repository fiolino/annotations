package org.fiolino.data.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 *
 * @author Michael Kuhlmann <michael@kuhlmann.org>
 */
@Retention(RUNTIME)
@Target({FIELD, METHOD})
public @interface Filterable {

    /**
     * Specify a filter name; defaults to the field name.
     */
    String value() default "";
}
