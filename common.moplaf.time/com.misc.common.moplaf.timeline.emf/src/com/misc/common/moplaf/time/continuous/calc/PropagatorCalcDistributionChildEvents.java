package com.misc.common.moplaf.time.continuous.calc;

import com.misc.common.moplaf.propagator.PropagatorDependencyAdapter;
import com.misc.common.moplaf.propagator.PropagatorFunctionAdapter;
import com.misc.common.moplaf.propagator.Util;
import com.misc.common.moplaf.time.continuous.ContinuousPackage;
import com.misc.common.moplaf.time.continuous.Distribution;


public class PropagatorCalcDistributionChildEvents extends PropagatorFunctionAdapter {

	@Override
	protected PropagatorFunctionAdapter getParent() {
		Distribution distribution = (Distribution)this.target;
		PropagatorFunctionAdapter parent = Util.getPropagatorFunctionAdapter(distribution, PropagatorScopeDistribution.class);
		return parent;
	}

	@Override
	protected void calculate() {
		Distribution distribution = (Distribution)this.target;
		distribution.refreshChildEvent();
	}
	
	@Override
	protected void addListeners() {
		super.addListeners();
		this.addNavigationFeatureListener(ContinuousPackage.Literals.DISTRIBUTION__CHILD_DISTRIBUTION, DependencyDistributionChildDistribution.class);
	}

	static public class DependencyDistributionChildDistribution extends PropagatorDependencyAdapter{
		@Override
		protected void addListeners() {
			super.addListeners();
			this.addNavigationFeatureListener(ContinuousPackage.Literals.DISTRIBUTION__CHILD_DISTRIBUTION, DependencyDistributionChildDistribution.class);
			this.addFeatureListener(ContinuousPackage.Literals.DISTRIBUTION__CHILD_EVENT);
		}
	}; 
};
