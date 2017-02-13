package org.fiolino.data.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * This annotation specifies how fields shall be named in Solr.
 * 
 * @author Michael Kuhlmann <michael@kuhlmann.org>
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
public @interface Naming {
    
    /**
     * The NamingPolicy implementation.
     */
    String value();
}
