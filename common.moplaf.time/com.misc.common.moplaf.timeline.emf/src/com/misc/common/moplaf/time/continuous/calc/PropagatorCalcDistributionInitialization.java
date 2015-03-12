package com.misc.common.moplaf.time.continuous.calc;

import com.misc.common.moplaf.propagator.PropagatorFunctionAdapter;
import com.misc.common.moplaf.propagator.PropagatorFunctionAdapter;
import com.misc.common.moplaf.propagator.Util;
import com.misc.common.moplaf.time.continuous.Distribution;

public class PropagatorCalcDistributionInitialization extends PropagatorFunctionAdapter {

	@Override
	protected PropagatorFunctionAdapter getParent() {
		Distribution distribution = (Distribution)this.target;
		PropagatorFunctionAdapter parent = Util.getPropagatorFunctionAdapter(distribution, PropagatorScopeDistribution.class);
		return parent;
	}
	
	/* (non-Javadoc)
	 * @see com.misc.common.moplaf.propagator.PropagatorFunctionAdapter#isTouchOnOwned()
	 */
	@Override
	protected boolean isTouchOnOwned() {
		// TODO Auto-generated method stub
		return true;
	}


	@Override
	protected void calculate() {
		Distribution distribution = (Distribution)this.target;
		distribution.refreshInit();
	}
	
};
