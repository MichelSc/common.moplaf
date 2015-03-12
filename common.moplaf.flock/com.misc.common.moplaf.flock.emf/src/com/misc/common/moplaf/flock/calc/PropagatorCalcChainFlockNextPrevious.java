package com.misc.common.moplaf.flock.calc;

import com.misc.common.moplaf.flock.Chain;
import com.misc.common.moplaf.flock.FlockPackage;
import com.misc.common.moplaf.flock.FlockScope;
import com.misc.common.moplaf.propagator.PropagatorFunctionAdapter;
import com.misc.common.moplaf.propagator.Util;

public class PropagatorCalcChainFlockNextPrevious extends
		PropagatorFunctionAdapter {

	protected PropagatorFunctionAdapter getParent() {
		Chain chain = (Chain) this.target;
		FlockScope flockScope = chain.getFlockScope();
		PropagatorFunctionAdapter parent = Util.getPropagatorFunctionAdapter(flockScope, PropagatorLayerChainFlockNextPrevious.class);
		return parent;
	}

	@Override
	protected void addListeners() {
		super.addListeners();
		this.addFeatureListener(FlockPackage.Literals.CHAIN__FLOCKS);
	}

	/* (non-Javadoc)
	 * @see com.misc.common.moplaf.propagator.PropagatorFunctionAdapter#calculate()
	 */
	@Override
	protected void calculate() {
		Chain chain = (Chain) this.target;
		chain.refreshChainFlockNextPrevious();
	}
	
	
}
