package com.misc.common.moplaf.time.continuous.calc;

import com.misc.common.moplaf.time.continuous.ContinuousPackage;

public class PropagatorCalcStartEventAmountAfter extends
		PropagatorCalcEventAmountAfter{

	@Override
	protected void addListeners() {
		super.addListeners();
		this.addFeatureListener(ContinuousPackage.Literals.START_EVENT__AMOUNT_AT_START);
	}
}
