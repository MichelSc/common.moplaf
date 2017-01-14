package com.misc.common.moplaf.time.continuous.calc;

import com.misc.common.moplaf.propagator.PropagatorFunctionAdapter;
import com.misc.common.moplaf.propagator.Util;
import com.misc.common.moplaf.time.continuous.ContinuousPackage;
import com.misc.common.moplaf.time.continuous.Distribution;
import com.misc.common.moplaf.time.continuous.DistributionEvent;

public class PropagatorCalcEventDescription extends PropagatorFunctionAdapter {

	@Override
	protected PropagatorFunctionAdapter getParent() {
		DistributionEvent event = (DistributionEvent)this.target;
		Distribution distribution = event.getDistribution();
		PropagatorFunctionAdapter parent = Util.getPropagatorFunctionAdapter(distribution, PropagatorLayerDistributionDescriptions.class);
		return parent;
	}

	@Override
	protected void calculate() {
		DistributionEvent event = (DistributionEvent)this.target;
		event.refreshDescription();
	}

	protected void addBindings() {
		super.addBindings();
		this.addInboundBindingFeature(ContinuousPackage.Literals.DISTRIBUTION_EVENT__AMOUNT_BEFORE);
		this.addInboundBindingFeature(ContinuousPackage.Literals.DISTRIBUTION_EVENT__AMOUNT_AFTER);
		this.addInboundBindingFeature(ContinuousPackage.Literals.DISTRIBUTION_EVENT__MOMENT);
	}
};
