package com.misc.common.moplaf.time.continuous.calc;

import com.misc.common.moplaf.time.continuous.ContinuousPackage;

public class PropagatorCalcAmountAbsoluteAmountAfter extends
		PropagatorCalcEventAmountAfter {

	@Override
	protected void addListeners() {
		super.addListeners();
		this.addFeatureListener(ContinuousPackage.Literals.AMOUNT_ABSOLUTE__AMOUNT_ABSOLUTE);
	}
	
}
