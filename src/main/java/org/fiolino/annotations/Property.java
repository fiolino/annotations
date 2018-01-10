package org.fiolino.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by kuli on 26.03.15.
 */
@Retention(RUNTIME)
@Target(PARAMETER)
public @interface Property {
    /**
     * The property key
     */
    String value();

    /**
     * The default value, if nothing is configured.
     */
    String defaultValue() default "";
}
