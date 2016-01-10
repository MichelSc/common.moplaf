package com.misc.common.moplaf.time.continuous.calc;

import com.misc.common.moplaf.propagator.PropagatorDependencyAdapter;
import com.misc.common.moplaf.propagator.PropagatorFunctionAdapter;
import com.misc.common.moplaf.propagator.PropagatorFunctionAdapters;
import com.misc.common.moplaf.propagator.Util;
import com.misc.common.moplaf.time.continuous.ContinuousPackage;
import com.misc.common.moplaf.time.continuous.Distribution;
import com.misc.common.moplaf.time.continuous.DistributionEvent;

public class PropagatorCalcEventSlopeBefore extends PropagatorFunctionAdapter {

	@Override
	protected PropagatorFunctionAdapter getParent() {
		DistributionEvent event = (DistributionEvent)this.target;
		Distribution distribution = event.getDistributionAsSequence();
		PropagatorFunctionAdapter parent = Util.getPropagatorFunctionAdapter(distribution, PropagatorLayerDistributionSlopes.class);
		return parent;
	}

	@Override
	protected PropagatorFunctionAdapters getAntecedents() {
		DistributionEvent event = (DistributionEvent)this.target;
		PropagatorFunctionAdapters antecedents = super.getAntecedents();
		DistributionEvent previousevent = event.getPrevious();
		if ( previousevent!=null){
			PropagatorFunctionAdapter calcPreviousEventSlopeAfter = Util.getPropagatorFunctionAdapter(previousevent, PropagatorCalcEventSlopeAfter.class);
			antecedents.add(calcPreviousEventSlopeAfter);
		}
		return antecedents;
	}

	@Override
	protected void calculate() {
		DistributionEvent event = (DistributionEvent)this.target;
		event.refreshSlopeBefore();
	}

	@Override
	protected void addListeners() {
		super.addListeners();
		this.addFeatureListener(ContinuousPackage.Literals.DISTRIBUTION_EVENT__DISTRIBUTION_AS_SEQUENCE);
		this.addNavigationFeatureListener(ContinuousPackage.Literals.DISTRIBUTION_EVENT__PREVIOUS, DependencyEventBeforeSlopeAfter.class);
	}

	static public class DependencyEventBeforeSlopeAfter extends PropagatorDependencyAdapter{
		@Override
		protected void addListeners() {
			super.addListeners();
			this.addFeatureListener(ContinuousPackage.Literals.DISTRIBUTION_EVENT__SLOPE_AFTER);
		}
	}; 
	
};
