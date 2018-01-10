package org.fiolino.annotations;

import java.lang.invoke.MethodHandle;

/**
 * Sets the scope of some factory handle so that it gets cached or called regularly, depending on the scope.
 */
public interface ScopeSetter {

    /**
     * Adjusts the target so that it gets called only once with its scope.
     *
     * @param target Has no parameters, returns some type
     * @return A handle of the same type
     */
    MethodHandle adjust(MethodHandle target);
}
