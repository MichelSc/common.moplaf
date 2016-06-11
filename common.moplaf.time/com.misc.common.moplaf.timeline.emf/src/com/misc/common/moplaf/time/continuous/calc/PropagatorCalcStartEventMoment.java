package com.misc.common.moplaf.time.continuous.calc;

import com.misc.common.moplaf.propagator.PropagatorDependencyAdapter;
import com.misc.common.moplaf.time.continuous.ContinuousPackage;

public class PropagatorCalcStartEventMoment extends PropagatorCalcEventMoment {

	@Override
	protected void addBindings() {
		super.addBindings();
		this.addInboundBindingNavigationFeature(ContinuousPackage.Literals.DISTRIBUTION_EVENT__DISTRIBUTION, DependencyDistributionStart.class);
	}

	static public class DependencyDistributionStart extends PropagatorDependencyAdapter{
		@Override
		protected void addBindings() {
			super.addBindings();
			this.addInboundBindingFeature(ContinuousPackage.Literals.DISTRIBUTION__HORIZON_START);
		}
	};
}
