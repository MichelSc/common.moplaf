package com.misc.common.moplaf.time.continuous.calc;

import com.misc.common.moplaf.propagator.PropagatorDependencyAdapter;
import com.misc.common.moplaf.time.continuous.ContinuousPackage;


public class PropagatorCalcStockChangeEndSlopeImpulsion extends PropagatorCalcSlopeImpulsionSlopeImpulsion {
	
	@Override
	protected void addBindings() {
		super.addBindings();
		this.addInboundBindingNavigationFeature(ContinuousPackage.Literals.STOCK_CHANGE_END__PROVIDER, DependencyStockChangeSlope.class);
	}

	static public class DependencyStockChangeSlope extends PropagatorDependencyAdapter{
		@Override
		protected void addBindings() {
			super.addBindings();
			this.addInboundBindingFeature(ContinuousPackage.Literals.STOCK_CHANGE__SLOPE);
		}
	};
	
};
