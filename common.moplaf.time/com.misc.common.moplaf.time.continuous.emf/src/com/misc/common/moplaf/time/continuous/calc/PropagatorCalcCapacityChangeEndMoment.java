package com.misc.common.moplaf.time.continuous.calc;

import com.misc.common.moplaf.propagator.PropagatorDependencyAdapter;
import com.misc.common.moplaf.time.continuous.ContinuousPackage;

public class PropagatorCalcCapacityChangeEndMoment extends	PropagatorCalcEventMoment {

	@Override
	protected void addBindings() {
		super.addBindings();
		this.addInboundBindingNavigationFeature(ContinuousPackage.Literals.CAPACITY_CHANGE_END__PROVIDER, DependencyCapacityChangeStart.class);
	}

	static public class DependencyCapacityChangeStart extends PropagatorDependencyAdapter{
		@Override
		protected void addBindings() {
			super.addBindings();
			this.addInboundBindingFeature(ContinuousPackage.Literals.CAPACITY_CHANGE__END);
		}
	};
}
