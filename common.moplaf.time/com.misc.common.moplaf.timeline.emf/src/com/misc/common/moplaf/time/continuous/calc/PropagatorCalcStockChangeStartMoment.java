package com.misc.common.moplaf.time.continuous.calc;

import com.misc.common.moplaf.propagator.PropagatorDependencyAdapter;
import com.misc.common.moplaf.time.continuous.ContinuousPackage;

public class PropagatorCalcStockChangeStartMoment extends PropagatorCalcEventMoment {

	@Override
	protected void addInboundBindings() {
		super.addInboundBindings();
		this.addInboundBindingNavigationFeature(ContinuousPackage.Literals.STOCK_CHANGE_START__PROVIDER, DependencyStockChangeStart.class);
	}

	static public class DependencyStockChangeStart extends PropagatorDependencyAdapter{
		@Override
		protected void addInboundBindings() {
			super.addInboundBindings();
			this.addInboundBindingFeature(ContinuousPackage.Literals.STOCK_CHANGE__START);
		}
	};
}
