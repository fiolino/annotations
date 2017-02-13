package org.fiolino.data.annotation;

import java.lang.annotation.*;

/**
 * Declares values that are not optional.
 *
 * Created by kuli on 11.02.15.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.PARAMETER, ElementType.METHOD})
public @interface Mandatory {
}
