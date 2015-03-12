package com.misc.common.moplaf.time.continuous.calc;

import org.eclipse.emf.common.notify.Notification;

import com.misc.common.moplaf.propagator.PropagatorFunctionAdapter;
import com.misc.common.moplaf.propagator.PropagatorFunctionAdapters;
import com.misc.common.moplaf.propagator.Util;
import com.misc.common.moplaf.time.continuous.ContinuousPackage;
import com.misc.common.moplaf.time.continuous.SlopeImpulsion;

public class PropagatorCalcSlopeImpulsionSlopeAfter extends
		PropagatorCalcEventSlopeAfter {

	@Override
	public void notifyChanged(Notification msg) {
		super.notifyChanged(msg);
		if (  this.isFeatureChanged(msg, ContinuousPackage.eINSTANCE.getSlopeImpulsion_SlopeImpulsion() )) {
			this.touch();				
		}
	}

	@Override
	protected PropagatorFunctionAdapters getAntecedents() {
		PropagatorFunctionAdapters antecedents = super.getAntecedents();
		
		SlopeImpulsion event = (SlopeImpulsion)this.target;
		
		PropagatorFunctionAdapter calcCapacitySlopeImpulsionSlopeImpulsion = Util.getPropagatorFunctionAdapter(event, PropagatorCalcSlopeImpulsionSlopeImpulsion.class);
		
		antecedents.add(calcCapacitySlopeImpulsionSlopeImpulsion);

		return antecedents;
	}
}
