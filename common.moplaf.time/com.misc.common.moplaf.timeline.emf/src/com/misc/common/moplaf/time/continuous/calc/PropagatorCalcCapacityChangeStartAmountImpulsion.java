package com.misc.common.moplaf.time.continuous.calc;

import com.misc.common.moplaf.propagator.PropagatorDependencyAdapter;
import com.misc.common.moplaf.time.continuous.ContinuousPackage;


public class PropagatorCalcCapacityChangeStartAmountImpulsion extends PropagatorCalcAmountImpulsionAmountImpulsion {

	@Override
	protected void addBindings() {
		super.addBindings();
		this.addInboundBindingNavigationFeature(ContinuousPackage.Literals.CAPACITY_CHANGE_START__PROVIDER, DependencyCapacityChangeAmount.class);
	}

	static public class DependencyCapacityChangeAmount extends PropagatorDependencyAdapter{
		@Override
		protected void addBindings() {
			super.addBindings();
			this.addInboundBindingFeature(ContinuousPackage.Literals.CAPACITY_CHANGE__AMOUNT);
		}
	}; 
};
