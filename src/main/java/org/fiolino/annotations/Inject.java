package org.fiolino.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Marks parameters that will have a bean injected.
 *
 * Created by kuli on 26.03.15.
 */
@Retention(RUNTIME)
@Target({TYPE, METHOD, PARAMETER})
public @interface Inject {
    /**
     * The property key
     */
    String value() default "";
}
