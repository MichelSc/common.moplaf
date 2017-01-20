package com.misc.common.moplaf.time.continuous.calc;

import org.eclipse.emf.common.notify.Notifier;

import com.misc.common.moplaf.propagator.PropagatorFunctionAdapter;
import com.misc.common.moplaf.propagator.PropagatorFunctionAdapters;
import com.misc.common.moplaf.propagator.Util;
import com.misc.common.moplaf.time.continuous.Distribution;


public class PropagatorLayerDistributionSlopes extends PropagatorFunctionAdapter {

	@Override
	protected PropagatorFunctionAdapter getParent() {
		Notifier target = this.target;
		Distribution distribution = (Distribution)target;
		PropagatorFunctionAdapter parent = Util.getPropagatorFunctionAdapter(distribution, PropagatorScopeDistribution.class);
		return parent;
	}
	@Override
	protected PropagatorFunctionAdapters getAntecedents() {
		Notifier target = this.target;
		Distribution distribution = (Distribution)target;
		PropagatorFunctionAdapters antecedents = super.getAntecedents();
		PropagatorFunctionAdapter calcDistributionSequence = Util.getPropagatorFunctionAdapter(distribution, PropagatorCalcDistributionSequence.class);
		antecedents.add(calcDistributionSequence);
		return antecedents;
	}
	
};
