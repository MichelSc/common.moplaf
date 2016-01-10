package com.misc.common.moplaf.time.continuous.calc;


import com.misc.common.moplaf.propagator.PropagatorDependencyAdapter;
import com.misc.common.moplaf.propagator.PropagatorFunctionAdapter;
import com.misc.common.moplaf.propagator.PropagatorFunctionAdapters;
import com.misc.common.moplaf.propagator.Util;
import com.misc.common.moplaf.time.continuous.ContinuousPackage;
import com.misc.common.moplaf.time.continuous.Distribution;

public class PropagatorCalcDistributionSequence extends PropagatorFunctionAdapter {

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
		PropagatorFunctionAdapter calcDistributionSequence = Util.getPropagatorFunctionAdapter(distribution, PropagatorCalcDistributionProvidedEvents.class);
		antecedents.add(calcDistributionSequence);
		return antecedents;
	}
	
	@Override
	protected void calculate() {
		Distribution distribution = (Distribution)this.target;
		distribution.refreshSequence();
	}

	@Override
	protected void addListeners() {
		super.addListeners();
		this.addNavigationFeatureListener(ContinuousPackage.Literals.DISTRIBUTION__PROVIDED_EVENTS, DependencyDistributionEvent.class);
	}

	static public class DependencyDistributionEvent extends PropagatorDependencyAdapter{
		@Override
		protected void addListeners() {
			super.addListeners();
			this.addFeatureListener(ContinuousPackage.Literals.DISTRIBUTION_EVENT__MOMENT);
		}
	}; 
};
