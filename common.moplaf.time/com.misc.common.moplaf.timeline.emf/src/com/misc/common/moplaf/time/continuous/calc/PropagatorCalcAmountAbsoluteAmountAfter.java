package com.misc.common.moplaf.time.continuous.calc;

import com.misc.common.moplaf.time.continuous.ContinuousPackage;

public class PropagatorCalcAmountAbsoluteAmountAfter extends
		PropagatorCalcEventAmountAfter {

	@Override
	protected void addInboundBindings() {
		super.addInboundBindings();
		this.addInboundBindingFeature(ContinuousPackage.Literals.AMOUNT_ABSOLUTE__AMOUNT_ABSOLUTE);
	}
	
}
