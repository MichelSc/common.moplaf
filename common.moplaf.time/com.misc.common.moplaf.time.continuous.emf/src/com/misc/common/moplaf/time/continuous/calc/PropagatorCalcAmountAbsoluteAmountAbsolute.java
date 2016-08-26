package com.misc.common.moplaf.time.continuous.calc;

import com.misc.common.moplaf.propagator.PropagatorFunctionAdapter;
import com.misc.common.moplaf.propagator.Util;
import com.misc.common.moplaf.time.continuous.AmountAbsolute;
import com.misc.common.moplaf.time.continuous.ContinuousPackage;
import com.misc.common.moplaf.time.continuous.Distribution;


public class PropagatorCalcAmountAbsoluteAmountAbsolute extends PropagatorFunctionAdapter {

	@Override
	protected PropagatorFunctionAdapter getParent() {
		AmountAbsolute event = (AmountAbsolute)this.target;
		Distribution distribution = event.getDistribution();
		PropagatorFunctionAdapter parent = Util.getPropagatorFunctionAdapter(distribution, PropagatorLayerDistributionAmounts.class);
		return parent;
	}

	@Override
	protected void calculate() {
		AmountAbsolute event = (AmountAbsolute)this.target;
		event.refreshAmountAbsolute();
	}

	@Override
	protected void addBindings() {
		super.addBindings();
		this.addOutboundBindingFeature(ContinuousPackage.Literals.AMOUNT_ABSOLUTE__AMOUNT_ABSOLUTE);
	}
};
