package com.misc.common.moplaf.time.continuous.calc;

import com.misc.common.moplaf.propagator.PropagatorFunctionAdapter;
import com.misc.common.moplaf.propagator.Util;
import com.misc.common.moplaf.time.continuous.ContinuousPackage;
import com.misc.common.moplaf.time.continuous.Distribution;
import com.misc.common.moplaf.time.continuous.DistributionEvent;

// this means that the object is touched upon containment
//   as a consequence, it will be refreshed
//   should this not be the rule rather than the exception?
public class PropagatorCalcEventMoment extends PropagatorFunctionAdapter {

	@Override
	protected PropagatorFunctionAdapter getParent() {
		DistributionEvent event = (DistributionEvent)this.target;
		Distribution distribution = event.getDistribution();
		PropagatorFunctionAdapter parent = Util.getPropagatorFunctionAdapter(distribution, PropagatorCalcDistributionSequence.class);
		return parent;
	}
	
	@Override
	protected void calculate() {
		DistributionEvent event = (DistributionEvent)this.target;
		event.refreshMoment();
	}

	@Override
	protected void addBindings() {
		super.addBindings();
		this.addInboundBindingFeature(ContinuousPackage.Literals.DISTRIBUTION_EVENT__DISTRIBUTION_AS_PROVIDED_EVENT);
	}
};