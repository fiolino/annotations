package org.fiolino.data.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Declares text fields that should be returned from Solr as highlighted.
 *
 * A highlighted field should always also be annotated with @Indexed.
 *
 * Created by kuli on 11.02.15.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.PARAMETER})
public @interface Highlighted {

    /**
     * The maximum number of returned snippets.
     */
    int snippets() default -1;

    /**
     * The maximum size of each fragment. The default is 120, which is unchanged by default.
     */
    int fragmentSize() default -1;

}
