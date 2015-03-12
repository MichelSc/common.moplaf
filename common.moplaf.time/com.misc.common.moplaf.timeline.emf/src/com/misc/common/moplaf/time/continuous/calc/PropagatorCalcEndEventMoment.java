package com.misc.common.moplaf.time.continuous.calc;

import com.misc.common.moplaf.propagator.PropagatorDependencyAdapter;
import com.misc.common.moplaf.time.continuous.ContinuousPackage;

public class PropagatorCalcEndEventMoment extends PropagatorCalcEventMoment {

	@Override
	protected void addListeners() {
		super.addListeners();
		this.addNavigationFeatureListener(ContinuousPackage.Literals.END_EVENT__DISTRIBUTION_AS_END, DependencyDistributionEnd.class);
	}

	static public class DependencyDistributionEnd extends PropagatorDependencyAdapter{
		@Override
		protected void addListeners() {
			super.addListeners();
			this.addFeatureListener(ContinuousPackage.Literals.DISTRIBUTION__HORIZON_END);
		}
	};
}
