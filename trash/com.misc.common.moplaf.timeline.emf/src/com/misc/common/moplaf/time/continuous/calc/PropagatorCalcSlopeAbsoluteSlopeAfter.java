package com.misc.common.moplaf.time.continuous.calc;

import com.misc.common.moplaf.time.continuous.ContinuousPackage;

public class PropagatorCalcSlopeAbsoluteSlopeAfter extends
		PropagatorCalcEventSlopeAfter {

	@Override
	protected void addBindings() {
		super.addBindings();
		this.addInboundBindingFeature(ContinuousPackage.Literals.SLOPE_ABSOLUTE__SLOPE_ABSOLUTE);
	}
}
