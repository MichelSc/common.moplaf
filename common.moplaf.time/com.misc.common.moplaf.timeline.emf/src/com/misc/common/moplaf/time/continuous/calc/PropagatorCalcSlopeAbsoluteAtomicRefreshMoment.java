package com.misc.common.moplaf.time.continuous.calc;

import com.misc.common.moplaf.propagator.PropagatorDependencyAdapter;
import com.misc.common.moplaf.time.continuous.ContinuousPackage;

public class PropagatorCalcSlopeAbsoluteAtomicRefreshMoment extends	PropagatorCalcEventMoment {

	@Override
	protected void addListeners() {
		super.addListeners();
		this.addNavigationFeatureListener(ContinuousPackage.Literals.AMOUNT_ABSOLUTE_ATOMIC__PROVIDER, DependencyProvider.class);
	}

	static public class DependencyProvider extends PropagatorDependencyAdapter{
		@Override
		protected void addListeners() {
			super.addListeners();
			this.addFeatureListener(ContinuousPackage.Literals.EVENT_PROVIDER__MOMENT);
		}
	};
}
