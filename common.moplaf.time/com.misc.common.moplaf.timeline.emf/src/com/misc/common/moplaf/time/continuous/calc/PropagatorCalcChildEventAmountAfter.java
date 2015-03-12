package com.misc.common.moplaf.time.continuous.calc;

import com.misc.common.moplaf.propagator.PropagatorDependencyAdapter;
import com.misc.common.moplaf.propagator.PropagatorFunctionAdapter;
import com.misc.common.moplaf.propagator.PropagatorFunctionAdapters;
import com.misc.common.moplaf.propagator.Util;
import com.misc.common.moplaf.time.continuous.ChildEvent;
import com.misc.common.moplaf.time.continuous.ContinuousPackage;
import com.misc.common.moplaf.time.continuous.DistributionEvent;


public class PropagatorCalcChildEventAmountAfter extends PropagatorCalcEventAmountAfter {

	@Override
	protected PropagatorFunctionAdapters getAntecedents() {
		PropagatorFunctionAdapters antecedents = super.getAntecedents();

		ChildEvent event = (ChildEvent)this.target;
 
		DistributionEvent originalEvent = event.getOriginal();
		
		if ( originalEvent!=null){
			PropagatorFunctionAdapter calcOrignalEventAmountAfter = Util.getPropagatorFunctionAdapter(originalEvent, PropagatorCalcEventAmountAfter.class);
			antecedents.add(calcOrignalEventAmountAfter);
			PropagatorFunctionAdapter calcOrignalEventAmountBefore = Util.getPropagatorFunctionAdapter(originalEvent, PropagatorCalcEventAmountBefore.class);
			antecedents.add(calcOrignalEventAmountBefore);
		}
		
		return antecedents;
	}

	@Override
	protected void addListeners() {
		super.addListeners();
		this.addNavigationFeatureListener(ContinuousPackage.Literals.CHILD_EVENT__ORIGINAL, DependencyDistributionEventAmounts.class);
	}

	
	static public class DependencyDistributionEventAmounts extends PropagatorDependencyAdapter{
		@Override
		protected void addListeners() {
			super.addListeners();
			this.addFeatureListener(ContinuousPackage.Literals.DISTRIBUTION_EVENT__AMOUNT_AFTER);
			this.addFeatureListener(ContinuousPackage.Literals.DISTRIBUTION_EVENT__AMOUNT_BEFORE);
		}
	}; 
	
};
