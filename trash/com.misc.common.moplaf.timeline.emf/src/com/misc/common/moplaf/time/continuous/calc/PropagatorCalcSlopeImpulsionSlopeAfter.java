package com.misc.common.moplaf.time.continuous.calc;

import com.misc.common.moplaf.time.continuous.ContinuousPackage;

public class PropagatorCalcSlopeImpulsionSlopeAfter extends
		PropagatorCalcEventSlopeAfter {

	@Override
	protected void addBindings() {
		super.addBindings();
		this.addInboundBindingFeature(ContinuousPackage.Literals.SLOPE_IMPULSION__SLOPE_IMPULSION);
	}

}
