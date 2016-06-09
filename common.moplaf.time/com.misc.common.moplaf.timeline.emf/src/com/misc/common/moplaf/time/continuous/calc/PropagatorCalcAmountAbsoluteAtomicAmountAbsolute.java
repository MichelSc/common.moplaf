package com.misc.common.moplaf.time.continuous.calc;

import com.misc.common.moplaf.propagator.PropagatorDependencyAdapter;
import com.misc.common.moplaf.time.continuous.ContinuousPackage;


public class PropagatorCalcAmountAbsoluteAtomicAmountAbsolute extends PropagatorCalcAmountAbsoluteAmountAbsolute {

	@Override
	protected void addBindings() {
		super.addBindings();
		this.addInboundBindingNavigationFeature(ContinuousPackage.Literals.AMOUNT_ABSOLUTE_ATOMIC__PROVIDER, DependencyProvider.class);
	}

	static public class DependencyProvider extends PropagatorDependencyAdapter{
		@Override
		protected void addBindings() {
			super.addBindings();
			this.addInboundBindingFeature(ContinuousPackage.Literals.AMOUNT_ABSOLUTE_PROVIDER__AMOUNT_ABSOLUTE);
		}
	}; 
	
};
