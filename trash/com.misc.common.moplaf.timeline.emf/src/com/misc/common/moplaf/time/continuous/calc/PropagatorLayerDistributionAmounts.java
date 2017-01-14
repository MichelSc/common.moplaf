package com.misc.common.moplaf.time.continuous.calc;

import com.misc.common.moplaf.propagator.PropagatorFunctionAdapter;
import com.misc.common.moplaf.propagator.PropagatorFunctionAdapters;
import com.misc.common.moplaf.propagator.Util;
import com.misc.common.moplaf.time.continuous.Distribution;

public class PropagatorLayerDistributionAmounts extends PropagatorFunctionAdapter {

	@Override
	protected PropagatorFunctionAdapter getParent() {
		Distribution distribution = (Distribution)this.target;
		PropagatorFunctionAdapter parent = Util.getPropagatorFunctionAdapter(distribution, PropagatorScopeDistribution.class);
		return parent;
	}
	
	@Override
	protected PropagatorFunctionAdapters getAntecedents() {
		Distribution distribution = (Distribution)this.target;
		PropagatorFunctionAdapters antecedents = super.getAntecedents();
		PropagatorFunctionAdapter calcDistributionSequence = Util.getPropagatorFunctionAdapter(distribution, PropagatorCalcDistributionSequence.class);
		PropagatorFunctionAdapter layerDistributionSlopes  = Util.getPropagatorFunctionAdapter(distribution, PropagatorLayerDistributionSlopes.class);
		antecedents.add(calcDistributionSequence);
		antecedents.add(layerDistributionSlopes);
		return antecedents;
	}
	
};
