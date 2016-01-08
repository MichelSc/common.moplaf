package com.misc.common.moplaf.time.continuous.calc;

import com.misc.common.moplaf.propagator.PropagatorFunctionAdapter;
import com.misc.common.moplaf.propagator.Util;
import com.misc.common.moplaf.time.continuous.Distribution;
import com.misc.common.moplaf.time.continuous.SlopeImpulsion;


public class PropagatorCalcSlopeImpulsionSlopeImpulsion extends PropagatorFunctionAdapter {

	@Override
	protected PropagatorFunctionAdapter getParent() {
		SlopeImpulsion event = (SlopeImpulsion)this.target;
		Distribution distribution = event.getDistributionAsProvidedEvent();
		PropagatorFunctionAdapter parent = Util.getPropagatorFunctionAdapter(distribution, PropagatorLayerDistributionSlopes.class);
		return parent;
	}

	@Override
	protected void calculate() {
		SlopeImpulsion event = (SlopeImpulsion)this.target;
		event.refreshSlopeImpulsion();
	}

};
