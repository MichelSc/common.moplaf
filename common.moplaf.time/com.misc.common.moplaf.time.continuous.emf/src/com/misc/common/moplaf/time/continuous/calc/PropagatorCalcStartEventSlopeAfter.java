package com.misc.common.moplaf.time.continuous.calc;

import com.misc.common.moplaf.time.continuous.ContinuousPackage;

public class PropagatorCalcStartEventSlopeAfter extends
		PropagatorCalcEventSlopeAfter{

	@Override
	protected void addBindings() {
		super.addBindings();
		this.addInboundBindingFeature(ContinuousPackage.Literals.START_EVENT__SLOPE_AT_START);
	}
}
