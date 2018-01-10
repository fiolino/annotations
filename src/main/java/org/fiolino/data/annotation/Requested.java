package org.fiolino.data.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * This annotation marks provider and post construct method parameters.
 *
 * A provider method can have some parameter that describes which class is requested. You can mark some parameter
 * of type {@link Class} with @Requested, and that method will be used as a generic provider method.
 *
 * Created by kuli on 06.03.17.
 */
@Retention(RUNTIME)
@Target(PARAMETER)
public @interface Requested {
}
