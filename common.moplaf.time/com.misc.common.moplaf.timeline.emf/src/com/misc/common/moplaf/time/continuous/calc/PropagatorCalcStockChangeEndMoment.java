package com.misc.common.moplaf.time.continuous.calc;

import com.misc.common.moplaf.propagator.PropagatorDependencyAdapter;
import com.misc.common.moplaf.time.continuous.ContinuousPackage;

public class PropagatorCalcStockChangeEndMoment extends PropagatorCalcEventMoment {

	@Override
	protected void addListeners() {
		super.addListeners();
		this.addNavigationFeatureListener(ContinuousPackage.Literals.STOCK_CHANGE_END__STOCK_CHANGE, DependencyStockChangeEnd.class);
	}

	static public class DependencyStockChangeEnd extends PropagatorDependencyAdapter{
		@Override
		protected void addListeners() {
			super.addListeners();
			this.addFeatureListener(ContinuousPackage.Literals.STOCK_CHANGE__END);
		}
	};
}
