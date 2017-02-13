package org.fiolino.data.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Mark static methods that behave as factories,
 *
 * @author Michael Kuhlmann <michael@kuhlmann.org>
 */
@Retention(RUNTIME)
@Target({METHOD})
public @interface Factory {
}
