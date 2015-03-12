package com.misc.common.moplaf.time.continuous.calc;

import com.misc.common.moplaf.time.continuous.ContinuousPackage;

public class PropagatorCalcSlopeAbsoluteSlopeAfter extends
		PropagatorCalcEventSlopeAfter {

	@Override
	protected void addListeners() {
		super.addListeners();
		this.addFeatureListener(ContinuousPackage.Literals.SLOPE_ABSOLUTE__SLOPE_ABSOLUTE);
	}
}
