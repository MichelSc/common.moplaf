package com.misc.common.moplaf.time.continuous.calc;


import com.misc.common.moplaf.propagator.PropagatorDependencyAdapter;
import com.misc.common.moplaf.time.continuous.ContinuousPackage;


public class PropagatorCalcCapacityChangeEndAmountImpulsion extends PropagatorCalcAmountImpulsionAmountImpulsion {

	@Override
	protected void addListeners() {
		super.addListeners();
		this.addNavigationFeatureListener(ContinuousPackage.Literals.CAPACITY_CHANGE_END__CAPACITY_CHANGE, DependencyCapacityChangeAmount.class);
	}

	static public class DependencyCapacityChangeAmount extends PropagatorDependencyAdapter{
		@Override
		protected void addListeners() {
			super.addListeners();
			this.addFeatureListener(ContinuousPackage.Literals.CAPACITY_CHANGE__AMOUNT);
		}
	}; 
	
};
