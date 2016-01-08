package com.misc.common.moplaf.time.continuous.calc;

import com.misc.common.moplaf.propagator.PropagatorFunctionAdapter;
import com.misc.common.moplaf.propagator.Util;
import com.misc.common.moplaf.time.continuous.ContinuousPackage;
import com.misc.common.moplaf.time.continuous.Distribution;
import com.misc.common.moplaf.time.continuous.EventsProviderAbstract;


public class PropagatorCalcEventsProviderRefreshEvents extends PropagatorFunctionAdapter {

	@Override
	protected PropagatorFunctionAdapter getParent() {
		EventsProviderAbstract provider = (EventsProviderAbstract)this.target;
		Distribution distribution = provider.getDistribution();
		PropagatorFunctionAdapter parent = Util.getPropagatorFunctionAdapter(distribution, PropagatorLayerCompositeEventRefresh.class);
		return parent;
	}
	
	@Override
	protected void calculate() {
		EventsProviderAbstract provider = (EventsProviderAbstract)this.target;
		provider.refreshEvents();
	}

	@Override
	protected void addListeners() {
		super.addListeners();
		this.addFeatureListener(ContinuousPackage.Literals.EVENTS_PROVIDER_ABSTRACT__DISTRIBUTION);
	}

};
