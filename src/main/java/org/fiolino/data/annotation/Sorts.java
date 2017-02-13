package org.fiolino.data.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 *
 * @author Michael Kuhlmann <michael@kuhlmann.org>
 */
@Retention(RUNTIME)
@Target({FIELD, METHOD})
public @interface Sorts {

    String RELEVANCE = "RELEVANCE";
    String DATE = "DATE";
    String BUSINESS_PROJECT = "BUSINESS_PROJECT";
    String CONCEPT_SCORE = "CONCEPT_SCORE";
    String CONCEPT_TYPE = "CONCEPT_TYPE";
    String CONCEPT_THEME = "CONCEPT_THEME";
    String COM_CONCEPT_ROUTE = "COM_CONCEPT_ROUTE";

    /**
     * The sorting name of this field.
     */
    String value();

    /**
     * The direction of this field.
     */
    SortDirection direction() default SortDirection.DESC;

    /**
     * The order of the field - necessary in case of multiple fields for same sorting.
     */
    int order() default 1;
}
