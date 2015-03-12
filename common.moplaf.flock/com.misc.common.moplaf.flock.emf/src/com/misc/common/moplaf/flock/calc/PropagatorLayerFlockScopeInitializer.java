package com.misc.common.moplaf.flock.calc;

import com.misc.common.moplaf.flock.FlockScope;
import com.misc.common.moplaf.propagator.PropagatorFunctionAdapter;
import com.misc.common.moplaf.propagator.Util;

public class PropagatorLayerFlockScopeInitializer extends
		PropagatorFunctionAdapter {

	@Override
	protected PropagatorFunctionAdapter getParent() {
		FlockScope flockScope = (FlockScope) this.target;
		PropagatorFunctionAdapter parent = Util.getPropagatorFunctionAdapter(flockScope, PropagatorScopeFlockScope                                   .class);
		return parent;
	}
}
