package com.misc.common.moplaf.time.continuous.calc;

import com.misc.common.moplaf.propagator.PropagatorDependencyAdapter;
import com.misc.common.moplaf.propagator.PropagatorFunctionAdapter;
import com.misc.common.moplaf.propagator.PropagatorFunctionAdapters;
import com.misc.common.moplaf.propagator.Util;
import com.misc.common.moplaf.time.continuous.ChildEvent;
import com.misc.common.moplaf.time.continuous.ContinuousPackage;
import com.misc.common.moplaf.time.continuous.DistributionEvent;


public class PropagatorCalcChildEventSlopeAfter extends PropagatorCalcEventSlopeAfter {

	@Override
	protected PropagatorFunctionAdapters getAntecedents() {
		PropagatorFunctionAdapters antecedents = super.getAntecedents();

		ChildEvent event = (ChildEvent)this.target;
 
		DistributionEvent originalEvent = event.getOriginal();
		
		if ( originalEvent!=null){
			PropagatorFunctionAdapter calcOrignalEventSlopeAfter = Util.getPropagatorFunctionAdapter(originalEvent, PropagatorCalcEventSlopeAfter.class);
			antecedents.add(calcOrignalEventSlopeAfter);
			PropagatorFunctionAdapter calcOrignalEventSlopeBefore = Util.getPropagatorFunctionAdapter(originalEvent, PropagatorCalcEventSlopeBefore.class);
			antecedents.add(calcOrignalEventSlopeBefore);
		}
		
		return antecedents;
	}

	@Override
	protected void addInboundBindings() {
		super.addInboundBindings();
		this.addInboundBindingNavigationFeature(ContinuousPackage.Literals.CHILD_EVENT__ORIGINAL, DependencyDistributionEventSlopes.class);
	}


	static public class DependencyDistributionEventSlopes extends PropagatorDependencyAdapter{
		protected void addInboundBindings() {
			super.addInboundBindings();
			this.addInboundBindingFeature(ContinuousPackage.Literals.DISTRIBUTION_EVENT__SLOPE_AFTER);
			this.addInboundBindingFeature(ContinuousPackage.Literals.DISTRIBUTION_EVENT__SLOPE_BEFORE);
		} 
	}; 
	
};
