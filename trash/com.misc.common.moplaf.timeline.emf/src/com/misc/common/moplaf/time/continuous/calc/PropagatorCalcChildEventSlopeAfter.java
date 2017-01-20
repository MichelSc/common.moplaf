package com.misc.common.moplaf.time.continuous.calc;

import com.misc.common.moplaf.propagator.PropagatorDependencyAdapter;
import com.misc.common.moplaf.time.continuous.ContinuousPackage;


public class PropagatorCalcChildEventSlopeAfter extends PropagatorCalcEventSlopeAfter {

	@Override
	protected void addBindings() {
		super.addBindings();
		this.addInboundBindingNavigationFeature(ContinuousPackage.Literals.CHILD_EVENT__ORIGINAL, DependencyDistributionEventSlopes.class);
	}


	static public class DependencyDistributionEventSlopes extends PropagatorDependencyAdapter{
		protected void addBindings() {
			super.addBindings();
			this.addInboundBindingFeature(ContinuousPackage.Literals.DISTRIBUTION_EVENT__SLOPE_AFTER);
			this.addInboundBindingFeature(ContinuousPackage.Literals.DISTRIBUTION_EVENT__SLOPE_BEFORE);
		} 
	}; 
	
};
