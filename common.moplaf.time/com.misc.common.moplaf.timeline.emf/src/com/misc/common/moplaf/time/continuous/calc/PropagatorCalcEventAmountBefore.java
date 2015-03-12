package com.misc.common.moplaf.time.continuous.calc;

import com.misc.common.moplaf.propagator.PropagatorDependencyAdapter;
import com.misc.common.moplaf.propagator.PropagatorFunctionAdapter;
import com.misc.common.moplaf.propagator.PropagatorFunctionAdapters;
import com.misc.common.moplaf.propagator.Util;
import com.misc.common.moplaf.time.continuous.ContinuousPackage;
import com.misc.common.moplaf.time.continuous.Distribution;
import com.misc.common.moplaf.time.continuous.DistributionEvent;


public class PropagatorCalcEventAmountBefore extends PropagatorFunctionAdapter {

	@Override
	protected PropagatorFunctionAdapter getParent() {
		DistributionEvent event = (DistributionEvent)this.target;
		Distribution distribution = event.getDistribution();
		PropagatorFunctionAdapter parent = Util.getPropagatorFunctionAdapter(distribution, PropagatorLayerDistributionAmounts.class);
		return parent;
	}

	@Override
	protected PropagatorFunctionAdapters getAntecedents() {
		DistributionEvent event = (DistributionEvent)this.target;
 
		DistributionEvent previousevent = event.getPrevious();
		PropagatorFunctionAdapters antecedents = super.getAntecedents();
		
		if ( previousevent!=null){
			PropagatorFunctionAdapter calcPreviousEventAmountAfter = Util.getPropagatorFunctionAdapter(previousevent, PropagatorCalcEventAmountAfter.class);
			antecedents.add(calcPreviousEventAmountAfter);
		}
		
		PropagatorFunctionAdapter calcEventSlopeBefore = Util.getPropagatorFunctionAdapter(event, PropagatorCalcEventSlopeBefore.class);
		antecedents.add(calcEventSlopeBefore);
		
		return antecedents;
	}

	@Override
	protected void calculate() {
		DistributionEvent event = (DistributionEvent)this.target;
		event.refreshAmountBefore();
	}

	@Override
	protected void addListeners() {
		super.addListeners();
		this.addFeatureListener(ContinuousPackage.Literals.DISTRIBUTION_EVENT__SLOPE_BEFORE);
		this.addNavigationFeatureListener(ContinuousPackage.Literals.DISTRIBUTION_EVENT__PREVIOUS, DependencyEventBeforeAmountAfter.class);
	}

	static public class DependencyEventBeforeAmountAfter extends PropagatorDependencyAdapter{
		@Override
		protected void addListeners() {
			super.addListeners();
			this.addFeatureListener(ContinuousPackage.Literals.DISTRIBUTION_EVENT__AMOUNT_AFTER);
		}
	}; 
	
};
