package com.misc.common.moplaf.time.continuous.calc;

import com.misc.common.moplaf.propagator.PropagatorFunctionAdapter;
import com.misc.common.moplaf.propagator.Util;
import com.misc.common.moplaf.time.continuous.CompositeEvent;
import com.misc.common.moplaf.time.continuous.ContinuousPackage;
import com.misc.common.moplaf.time.continuous.Distribution;


public class PropagatorCalcCompositeEventRefreshEvents extends PropagatorFunctionAdapter {

	@Override
	protected PropagatorFunctionAdapter getParent() {
		CompositeEvent composite = (CompositeEvent)this.target;
		Distribution distribution = composite.getDistribution();
		PropagatorFunctionAdapter parent = Util.getPropagatorFunctionAdapter(distribution, PropagatorLayerCompositeEventRefresh.class);
		return parent;
	}
	
	@Override
	protected void calculate() {
		CompositeEvent composite = (CompositeEvent)this.target;
		composite.refreshEvent();
	}

	@Override
	protected void addListeners() {
		super.addListeners();
		this.addFeatureListener(ContinuousPackage.Literals.DISTRIBUTION_EVENTS_PROVIDER__DISTRIBUTION);
	}

};
