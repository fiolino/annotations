package org.fiolino.data.base;

import java.io.Serializable;

/**
 * Created by kuli on 11.12.15.
 */
public interface Identified extends Serializable {
    /**
     * The id of the entity.
     */
    long getId();
}
