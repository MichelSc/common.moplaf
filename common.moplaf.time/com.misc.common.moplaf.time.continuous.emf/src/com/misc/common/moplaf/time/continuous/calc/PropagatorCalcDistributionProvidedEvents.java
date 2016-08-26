package com.misc.common.moplaf.time.continuous.calc;


import com.misc.common.moplaf.propagator.PropagatorFunctionAdapter;
import com.misc.common.moplaf.propagator.PropagatorFunctionAdapters;
import com.misc.common.moplaf.propagator.Util;
import com.misc.common.moplaf.time.continuous.ContinuousPackage;
import com.misc.common.moplaf.time.continuous.Distribution;

public class PropagatorCalcDistributionProvidedEvents extends PropagatorFunctionAdapter {

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
		PropagatorFunctionAdapter calccompositeEvents = Util.getPropagatorFunctionAdapter(distribution, PropagatorLayerCompositeEventRefresh.class);
		antecedents.add(calccompositeEvents);
		PropagatorFunctionAdapter calcDistributionChildEvent = Util.getPropagatorFunctionAdapter(distribution, PropagatorCalcDistributionChildEvents.class);
		antecedents.add(calcDistributionChildEvent);
		return antecedents;
	}
	
	@Override
	protected void calculate() {
		Distribution distribution = (Distribution)this.target;
		distribution.refreshProvidedEvents();
	}

	@Override
	protected void addBindings() {
		super.addBindings();
		this.addInboundBindingFeature(ContinuousPackage.Literals.DISTRIBUTION__EVENTS_PROVIDERS);
		this.addInboundBindingFeature(ContinuousPackage.Literals.DISTRIBUTION__CHILD_EVENTS);
	}

};
