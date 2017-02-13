package org.fiolino.data.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by Michael Kuhlmann on 29.01.2016.
 */
@Retention(RUNTIME)
@Target({FIELD, METHOD})
public @interface TargetType {
    /**
     * The real type.
     */
    Class<?> value();
}
