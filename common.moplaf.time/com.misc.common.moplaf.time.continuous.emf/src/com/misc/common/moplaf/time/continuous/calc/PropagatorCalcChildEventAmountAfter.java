package com.misc.common.moplaf.time.continuous.calc;

import com.misc.common.moplaf.propagator.PropagatorDependencyAdapter;
import com.misc.common.moplaf.time.continuous.ContinuousPackage;


public class PropagatorCalcChildEventAmountAfter extends PropagatorCalcEventAmountAfter {

	@Override
	protected void addBindings() {
		super.addBindings();
		this.addInboundBindingNavigationFeature(ContinuousPackage.Literals.CHILD_EVENT__ORIGINAL, DependencyDistributionEventAmounts.class);
	}

	
	static public class DependencyDistributionEventAmounts extends PropagatorDependencyAdapter{
		@Override
		protected void addBindings() {
			super.addBindings();
			this.addInboundBindingFeature(ContinuousPackage.Literals.DISTRIBUTION_EVENT__AMOUNT_AFTER);
			this.addInboundBindingFeature(ContinuousPackage.Literals.DISTRIBUTION_EVENT__AMOUNT_BEFORE);
		}
	}; 
};
