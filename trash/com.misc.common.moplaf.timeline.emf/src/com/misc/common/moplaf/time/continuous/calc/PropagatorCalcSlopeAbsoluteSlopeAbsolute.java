package com.misc.common.moplaf.time.continuous.calc;

import com.misc.common.moplaf.propagator.PropagatorFunctionAdapter;
import com.misc.common.moplaf.propagator.Util;
import com.misc.common.moplaf.time.continuous.ContinuousPackage;
import com.misc.common.moplaf.time.continuous.Distribution;
import com.misc.common.moplaf.time.continuous.SlopeAbsolute;


public class PropagatorCalcSlopeAbsoluteSlopeAbsolute extends PropagatorFunctionAdapter {

	@Override
	protected PropagatorFunctionAdapter getParent() {
		SlopeAbsolute event = (SlopeAbsolute)this.target;
		Distribution distribution = event.getDistribution();
		PropagatorFunctionAdapter parent = Util.getPropagatorFunctionAdapter(distribution, PropagatorLayerDistributionSlopes.class);
		return parent;
	}

	@Override
	protected void calculate() {
		SlopeAbsolute event = (SlopeAbsolute)this.target;
		event.refreshSlopeAbsolute();
	}

	@Override
	protected void addBindings() {
		super.addBindings();
		this.addOutboundBindingFeature(ContinuousPackage.Literals.SLOPE_ABSOLUTE__SLOPE_ABSOLUTE);
	}
};
