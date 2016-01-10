package com.misc.common.moplaf.time.continuous.calc;

import com.misc.common.moplaf.propagator.PropagatorFunctionAdapter;
import com.misc.common.moplaf.propagator.PropagatorFunctionAdapters;
import com.misc.common.moplaf.propagator.Util;
import com.misc.common.moplaf.time.continuous.ContinuousPackage;
import com.misc.common.moplaf.time.continuous.Distribution;
import com.misc.common.moplaf.time.continuous.DistributionEvent;


public class PropagatorCalcEventSlopeAfter extends PropagatorFunctionAdapter {

	@Override
	protected PropagatorFunctionAdapter getParent() {
		DistributionEvent event = (DistributionEvent)this.target;
		Distribution distribution = event.getDistributionAsSequence();
		PropagatorFunctionAdapter parent = Util.getPropagatorFunctionAdapter(distribution, PropagatorLayerDistributionSlopes.class);
		return parent;
	}

	@Override
	protected void calculate() {
		DistributionEvent event = (DistributionEvent)this.target;
		event.refreshSlopeAfter();
	}

	@Override
	protected PropagatorFunctionAdapters getAntecedents() {
		DistributionEvent event = (DistributionEvent)this.target;
		PropagatorFunctionAdapters antecedents = super.getAntecedents();
		PropagatorFunctionAdapter calcEventSlopeBefore = Util.getPropagatorFunctionAdapter(event, PropagatorCalcEventSlopeBefore.class);
		antecedents.add(calcEventSlopeBefore);
		return antecedents;
	}

	@Override
	protected void addListeners() {
		super.addListeners();
		this.addFeatureListener(ContinuousPackage.Literals.DISTRIBUTION_EVENT__SLOPE_BEFORE);
		this.addFeatureListener(ContinuousPackage.Literals.DISTRIBUTION_EVENT__DISTRIBUTION_AS_SEQUENCE);
	}
};
