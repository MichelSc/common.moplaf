package com.misc.common.moplaf.time.continuous.calc;

import com.misc.common.moplaf.propagator.PropagatorDependencyAdapter;
import com.misc.common.moplaf.time.continuous.ContinuousPackage;

public class PropagatorCalcCapacityChangeStartMoment extends PropagatorCalcEventMoment {

	@Override
	protected void addListeners() {
		super.addListeners();
		this.addNavigationFeatureListener(ContinuousPackage.Literals.CAPACITY_CHANGE_START__PROVIDER, DependencyCapacityChangeStart.class);
	}

	static public class DependencyCapacityChangeStart extends PropagatorDependencyAdapter{
		@Override
		protected void addListeners() {
			super.addListeners();
			this.addFeatureListener(ContinuousPackage.Literals.CAPACITY_CHANGE__START);
		}
	};
}
