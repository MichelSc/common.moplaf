package com.misc.common.moplaf.time.continuous.calc;

import com.misc.common.moplaf.propagator.PropagatorDependencyAdapter;
import com.misc.common.moplaf.propagator.PropagatorFunctionAdapter;
import com.misc.common.moplaf.propagator.Util;
import com.misc.common.moplaf.time.continuous.ContinuousPackage;
import com.misc.common.moplaf.time.continuous.Distribution;
import com.misc.common.moplaf.time.continuous.DistributionEvent;


public class PropagatorCalcEventAmountBefore extends PropagatorFunctionAdapter {

	@Override
	protected PropagatorFunctionAdapter getParent() {
		DistributionEvent event = (DistributionEvent)this.target;
		Distribution distribution = event.getDistribution();
		PropagatorFunctionAdapter parent = Util.getPropagatorFunctionAdapter(distribution, PropagatorLayerDistributionAmounts.class);
		return parent;
	}

	@Override
	protected void calculate() {
		DistributionEvent event = (DistributionEvent)this.target;
		event.refreshAmountBefore();
	}

	@Override
	protected void addBindings() {
		super.addBindings();
		this.addOutboundBindingFeature(ContinuousPackage.Literals.DISTRIBUTION_EVENT__AMOUNT_BEFORE);

		this.addInboundBindingFeature(ContinuousPackage.Literals.DISTRIBUTION_EVENT__DISTRIBUTION_AS_SEQUENCE);
		this.addInboundBindingFeature(ContinuousPackage.Literals.DISTRIBUTION_EVENT__SLOPE_BEFORE);
		this.addInboundBindingFeature(ContinuousPackage.Literals.DISTRIBUTION_EVENT__MOMENT);
		this.addInboundBindingNavigationFeature(ContinuousPackage.Literals.DISTRIBUTION_EVENT__PREVIOUS, DependencyEventBefore.class);
	}

	static public class DependencyEventBefore extends PropagatorDependencyAdapter{
		@Override
		protected void addBindings() {
			super.addBindings();
			this.addInboundBindingFeature(ContinuousPackage.Literals.DISTRIBUTION_EVENT__AMOUNT_AFTER);
			this.addInboundBindingFeature(ContinuousPackage.Literals.DISTRIBUTION_EVENT__MOMENT);
		}
	}; 
};