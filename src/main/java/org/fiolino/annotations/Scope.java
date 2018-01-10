package org.fiolino.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Specifies the scope in which the injected instance is running.
 */
@Documented
@Retention(RUNTIME)
@Target({METHOD, FIELD, TYPE})
public @interface Scope {

    /**
     * Defines the lifetime scope of the target instance.
     */
    Class<? extends ScopeSetter> value();
}
