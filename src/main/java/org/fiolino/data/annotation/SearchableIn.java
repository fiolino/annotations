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
public @interface SearchableIn {

    /**
     * Specifies the scopes, i.e. the starting model classes, from where this field is filterable.
     */
    Class<?>[] value();
}
