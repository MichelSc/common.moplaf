package com.misc.common.moplaf.time.continuous.calc;

import com.misc.common.moplaf.propagator.PropagatorDependencyAdapter;
import com.misc.common.moplaf.propagator.PropagatorFunctionAdapter;
import com.misc.common.moplaf.propagator.PropagatorFunctionAdapters;
import com.misc.common.moplaf.propagator.Util;
import com.misc.common.moplaf.time.continuous.ChildEvent;
import com.misc.common.moplaf.time.continuous.ContinuousPackage;
import com.misc.common.moplaf.time.continuous.DistributionEvent;

public class PropagatorCalcChildEventMoment extends PropagatorCalcEventMoment {

	@Override
	protected PropagatorFunctionAdapters getAntecedents() {
		PropagatorFunctionAdapters antecedents = super.getAntecedents();

		ChildEvent event = (ChildEvent)this.target;
 
		DistributionEvent originalEvent = event.getOriginal();
		
		if ( originalEvent!=null){
			PropagatorFunctionAdapter calcOrignalEventMoment= Util.getPropagatorFunctionAdapter(originalEvent, PropagatorCalcEventMoment.class);
			antecedents.add(calcOrignalEventMoment);
		}
		
		return antecedents;
	}

	@Override
	protected void addBindings() {
		super.addBindings();
		this.addInboundBindingNavigationFeature(ContinuousPackage.Literals.CHILD_EVENT__ORIGINAL, DependencyDistributionEventMoment.class);
	}

	static public class DependencyDistributionEventMoment extends PropagatorDependencyAdapter{
		protected void addBindings() {
			super.addBindings();
			this.addInboundBindingFeature(ContinuousPackage.Literals.DISTRIBUTION_EVENT__MOMENT);
		} 
	}; 
	
};
