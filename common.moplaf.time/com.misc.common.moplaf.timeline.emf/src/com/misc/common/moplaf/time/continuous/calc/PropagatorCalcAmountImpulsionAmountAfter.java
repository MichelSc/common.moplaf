package com.misc.common.moplaf.time.continuous.calc;

import com.misc.common.moplaf.time.continuous.ContinuousPackage;

public class PropagatorCalcAmountImpulsionAmountAfter extends
		PropagatorCalcEventAmountAfter {

	@Override
	protected void addBindings() {
		super.addBindings();
		this.addInboundBindingFeature(ContinuousPackage.Literals.AMOUNT_IMPULSION__AMOUNT_IMPULSION);
	};
};
