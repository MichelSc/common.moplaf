package com.misc.common.moplaf.time.continuous.calc;

import com.misc.common.moplaf.propagator.PropagatorDependencyAdapter;
import com.misc.common.moplaf.time.continuous.ContinuousPackage;

public class PropagatorCalcStockChangeEndMoment extends PropagatorCalcEventMoment {

	@Override
	protected void addBindings() {
		super.addBindings();
		this.addInboundBindingNavigationFeature(ContinuousPackage.Literals.STOCK_CHANGE_END__PROVIDER, DependencyStockChangeEnd.class);
	}

	static public class DependencyStockChangeEnd extends PropagatorDependencyAdapter{
		@Override
		protected void addBindings() {
			super.addBindings();
			this.addInboundBindingFeature(ContinuousPackage.Literals.STOCK_CHANGE__END);
		}
	};
}
