package com.misc.common.moplaf.time.continuous.calc;

import com.misc.common.moplaf.propagator.PropagatorFunctionAdapter;
import com.misc.common.moplaf.propagator.Util;
import com.misc.common.moplaf.time.continuous.AmountImpulsion;
import com.misc.common.moplaf.time.continuous.Distribution;


public class PropagatorCalcAmountImpulsionAmountImpulsion extends PropagatorFunctionAdapter {

	@Override
	protected PropagatorFunctionAdapter getParent() {
		AmountImpulsion event = (AmountImpulsion)this.target;
		Distribution distribution = event.getDistributionAsSequence();
		PropagatorFunctionAdapter parent = Util.getPropagatorFunctionAdapter(distribution, PropagatorLayerDistributionAmounts.class);
		return parent;
	}

	@Override
	protected void calculate() {
		AmountImpulsion event = (AmountImpulsion)this.target;
		event.refreshAmountImpulsion();
	}

};
