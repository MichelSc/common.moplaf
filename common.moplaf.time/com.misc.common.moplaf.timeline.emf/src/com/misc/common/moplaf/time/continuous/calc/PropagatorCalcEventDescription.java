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
		Distribution distribution = event.getDistributionAsProvidedEvent();
		PropagatorFunctionAdapter parent = Util.getPropagatorFunctionAdapter(distribution, PropagatorLayerDistributionDescriptions.class);
		return parent;
	}

	@Override
	protected void calculate() {
		DistributionEvent event = (DistributionEvent)this.target;
		event.refreshDescription();
	}

	protected void addListeners() {
		super.addListeners();
		this.addFeatureListener(ContinuousPackage.Literals.DISTRIBUTION_EVENT__AMOUNT_BEFORE);
		this.addFeatureListener(ContinuousPackage.Literals.DISTRIBUTION_EVENT__AMOUNT_AFTER);
		this.addFeatureListener(ContinuousPackage.Literals.DISTRIBUTION_EVENT__MOMENT);
	}
};
