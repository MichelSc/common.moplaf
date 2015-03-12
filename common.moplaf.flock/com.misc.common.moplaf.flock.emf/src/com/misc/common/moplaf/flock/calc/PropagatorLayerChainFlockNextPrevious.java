package com.misc.common.moplaf.flock.calc;

import com.misc.common.moplaf.flock.FlockScope;
import com.misc.common.moplaf.propagator.PropagatorFunctionAdapter;
import com.misc.common.moplaf.propagator.PropagatorFunctionAdapters;
import com.misc.common.moplaf.propagator.Util;

public class PropagatorLayerChainFlockNextPrevious extends
		PropagatorFunctionAdapter {

	@Override
	protected PropagatorFunctionAdapter getParent() {
		FlockScope flockScope = (FlockScope) this.target;
		PropagatorFunctionAdapter parent = Util.getPropagatorFunctionAdapter(flockScope, PropagatorScopeFlockScope                                   .class);
		return parent;
	}

	@Override
	protected PropagatorFunctionAdapters getAntecedents() {
		FlockScope flockScope = (FlockScope) this.target;
		PropagatorFunctionAdapters antecedents = super.getAntecedents();
		PropagatorFunctionAdapter layerInitialization = Util.getPropagatorFunctionAdapter(flockScope, PropagatorLayerFlockScopeInitializer.class);
		antecedents.add(layerInitialization);
		return antecedents;
	}
	
	
	
}
