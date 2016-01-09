package com.misc.common.moplaf.time.continuous.calc;

import com.misc.common.moplaf.propagator.PropagatorFunctionAdapter;
import com.misc.common.moplaf.propagator.Util;
import com.misc.common.moplaf.time.continuous.AmountImpulsion;
import com.misc.common.moplaf.time.continuous.Distribution;
import com.misc.common.moplaf.time.continuous.SlopeAbsolute;


public class PropagatorCalcSlopeAbsoluteSlopeAbsolute extends PropagatorFunctionAdapter {

	@Override
	protected PropagatorFunctionAdapter getParent() {
		AmountImpulsion event = (AmountImpulsion)this.target;
		Distribution distribution = event.getDistributionAsProvidedEvent();
		PropagatorFunctionAdapter parent = Util.getPropagatorFunctionAdapter(distribution, PropagatorLayerDistributionSlopes.class);
		return parent;
	}

	@Override
	protected void calculate() {
		SlopeAbsolute event = (SlopeAbsolute)this.target;
		event.refreshSlopeAbsolute();
	}

};
