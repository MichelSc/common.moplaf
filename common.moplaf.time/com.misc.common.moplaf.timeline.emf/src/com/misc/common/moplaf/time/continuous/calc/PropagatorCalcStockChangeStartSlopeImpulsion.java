package com.misc.common.moplaf.time.continuous.calc;

import com.misc.common.moplaf.propagator.PropagatorDependencyAdapter;
import com.misc.common.moplaf.time.continuous.ContinuousPackage;


public class PropagatorCalcStockChangeStartSlopeImpulsion extends PropagatorCalcSlopeImpulsionSlopeImpulsion {

	@Override
	protected void addInboundBindings() {
		super.addInboundBindings();
		this.addInboundBindingNavigationFeature(ContinuousPackage.Literals.STOCK_CHANGE_START__PROVIDER, DependencyStockChangeSlope.class);
	}

	static public class DependencyStockChangeSlope extends PropagatorDependencyAdapter{
		@Override
		protected void addInboundBindings() {
			super.addInboundBindings();
			this.addInboundBindingFeature(ContinuousPackage.Literals.STOCK_CHANGE__SLOPE);
		}
	}; 
	
};
