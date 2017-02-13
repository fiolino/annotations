package org.fiolino.data.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by kuli on 29.01.16.
 */
@Retention(RUNTIME)
@Target({FIELD, METHOD})
public @interface SearchFields {

    /**
     * Specifies the field names that should be used for full text searching.
     *
     * Leave this empty (default) to don't allow any fields in this relation.
     */
    String[] value() default {};
}
