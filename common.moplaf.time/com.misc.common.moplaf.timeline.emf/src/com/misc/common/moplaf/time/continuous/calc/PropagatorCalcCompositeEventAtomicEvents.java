package com.misc.common.moplaf.time.continuous.calc;

import com.misc.common.moplaf.propagator.PropagatorFunctionAdapter;
import com.misc.common.moplaf.propagator.Util;
import com.misc.common.moplaf.time.continuous.CompositeDistributionEvent;
import com.misc.common.moplaf.time.continuous.ContinuousPackage;
import com.misc.common.moplaf.time.continuous.Distribution;


public class PropagatorCalcCompositeEventAtomicEvents extends PropagatorFunctionAdapter {

	@Override
	protected PropagatorFunctionAdapter getParent() {
		CompositeDistributionEvent event = (CompositeDistributionEvent)this.target;
		Distribution distribution = event.getDistribution();
		PropagatorFunctionAdapter parent = Util.getPropagatorFunctionAdapter(distribution, PropagatorLayerDistributionAtomicEvents.class);
		return parent;
	}
	
	@Override
	protected void calculate() {
		CompositeDistributionEvent event = (CompositeDistributionEvent)this.target;
		event.refreshEvent();
	}

	@Override
	protected void addListeners() {
		super.addListeners();
		this.addFeatureListener(ContinuousPackage.Literals.COMPOSITE_DISTRIBUTION_EVENT__DISTRIBUTION);
	}

};
