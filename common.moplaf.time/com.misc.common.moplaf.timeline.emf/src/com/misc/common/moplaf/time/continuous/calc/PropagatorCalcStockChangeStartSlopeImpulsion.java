package com.misc.common.moplaf.time.continuous.calc;

import com.misc.common.moplaf.propagator.PropagatorDependencyAdapter;
import com.misc.common.moplaf.time.continuous.ContinuousPackage;


public class PropagatorCalcStockChangeStartSlopeImpulsion extends PropagatorCalcSlopeImpulsionSlopeImpulsion {

	@Override
	protected void addListeners() {
		super.addListeners();
		this.addNavigationFeatureListener(ContinuousPackage.Literals.STOCK_CHANGE_START__STOCK_CHANGE, DependencyStockChangeSlope.class);
	}

	static public class DependencyStockChangeSlope extends PropagatorDependencyAdapter{
		@Override
		protected void addListeners() {
			super.addListeners();
			this.addFeatureListener(ContinuousPackage.Literals.STOCK_CHANGE__SLOPE);
		}
	}; 
	
};
