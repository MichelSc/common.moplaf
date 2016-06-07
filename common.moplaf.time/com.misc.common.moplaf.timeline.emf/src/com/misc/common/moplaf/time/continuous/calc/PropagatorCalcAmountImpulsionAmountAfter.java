package com.misc.common.moplaf.time.continuous.calc;

import com.misc.common.moplaf.propagator.PropagatorFunctionAdapter;
import com.misc.common.moplaf.propagator.PropagatorFunctionAdapters;
import com.misc.common.moplaf.propagator.Util;
import com.misc.common.moplaf.time.continuous.AmountImpulsion;
import com.misc.common.moplaf.time.continuous.ContinuousPackage;

public class PropagatorCalcAmountImpulsionAmountAfter extends
		PropagatorCalcEventAmountAfter {

	@Override
	protected PropagatorFunctionAdapters getAntecedents() {
		PropagatorFunctionAdapters antecedents = super.getAntecedents();
		
		AmountImpulsion event = (AmountImpulsion)this.target;
		
		PropagatorFunctionAdapter calcCapacityAmountImpulsionAmountImpulsion = Util.getPropagatorFunctionAdapter(event, PropagatorCalcAmountImpulsionAmountImpulsion.class);
		
		antecedents.add(calcCapacityAmountImpulsionAmountImpulsion);

		return antecedents;
	}

	@Override
	protected void addInboundBindings() {
		super.addInboundBindings();
		this.addInboundBindingFeature(ContinuousPackage.Literals.AMOUNT_IMPULSION__AMOUNT_IMPULSION);
	}

}
