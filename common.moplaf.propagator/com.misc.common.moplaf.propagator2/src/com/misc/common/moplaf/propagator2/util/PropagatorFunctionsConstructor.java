package com.misc.common.moplaf.propagator2.util;

import com.misc.common.moplaf.propagator2.ObjectWithPropagatorFunctions;

/**
 * A PropagatorFunctionsConstructor will initialize an {@link ObjectWithPropagatorFunctions} with its PropagatoryFunctions}
 * @author michel
 *
 */
public interface PropagatorFunctionsConstructor {
	public void addPropagatorFunctions(ObjectWithPropagatorFunctions object);
	public PropagatorFunctionsConstructor copy();
}
