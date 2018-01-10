package org.fiolino.annotations;

/**
 * You can implement this to have a factory for the beans instantiator.
 *
 * Created by kuli on 26.03.15.
 */
public interface Factory<T> {

    T create() throws Exception;
}
