package org.fiolino.data.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 *
 * @author Michael Kuhlmann <michael@kuhlmann.org>
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.METHOD})
public @interface DateFacet {
    
    String month();
    String year();
    String day() default "";

    /**
     * The name of the Solr field. Defaults to a combination of the values, lowercased.
     */
    String fieldName() default "";
}
