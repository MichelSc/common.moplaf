package com.misc.common.moplaf.time.continuous.calc;

import com.misc.common.moplaf.propagator.PropagatorFunctionAdapter;
import com.misc.common.moplaf.propagator.PropagatorFunctionAdapters;
import com.misc.common.moplaf.propagator.Util;
import com.misc.common.moplaf.time.continuous.Distribution;

public class PropagatorScopeDistribution extends PropagatorFunctionAdapter {

	@Override
	protected PropagatorFunctionAdapters getAntecedents() {
		Distribution distribution = (Distribution)this.target;
		PropagatorFunctionAdapters antecedents = super.getAntecedents();
		for ( Distribution childDistribution : distribution.getChildDistribution()){
			PropagatorFunctionAdapter scopeChildDistribution= Util.getPropagatorFunctionAdapter(childDistribution, PropagatorScopeDistribution.class);
			antecedents.add(scopeChildDistribution);
		}
		return antecedents;
	}
};
