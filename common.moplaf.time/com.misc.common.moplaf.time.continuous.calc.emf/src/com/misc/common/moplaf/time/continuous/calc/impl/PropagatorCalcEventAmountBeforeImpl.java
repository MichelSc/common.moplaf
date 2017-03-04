/**
 */
package com.misc.common.moplaf.time.continuous.calc.impl;

import com.misc.common.moplaf.propagator2.util.Bindings;
import com.misc.common.moplaf.time.continuous.DistributionEvent;
import com.misc.common.moplaf.time.continuous.TimeContinuousPackage;
import com.misc.common.moplaf.time.continuous.calc.PropagatorCalcEventAmountBefore;
import com.misc.common.moplaf.time.continuous.calc.TimeContinuousCalcPackage;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Propagator Calc Event Amount Before</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class PropagatorCalcEventAmountBeforeImpl extends PropagatorCalcEventAmountImpl implements PropagatorCalcEventAmountBefore {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropagatorCalcEventAmountBeforeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TimeContinuousCalcPackage.Literals.PROPAGATOR_CALC_EVENT_AMOUNT_BEFORE;
	}
	
	protected static Bindings eventBeforeBindings = Bindings.constructBindings()
			.addInboundBinding(TimeContinuousPackage.Literals.DISTRIBUTION_EVENT__AMOUNT_AFTER)
			.addInboundBinding(TimeContinuousPackage.Literals.DISTRIBUTION_EVENT__MOMENT);
	
	protected static Bindings distributionEventBindings = Bindings.constructBindings()
			.addOutboundBinding(TimeContinuousPackage.Literals.DISTRIBUTION_EVENT__AMOUNT_BEFORE)
			.addInboundBinding(TimeContinuousPackage.Literals.DISTRIBUTION_EVENT__DISTRIBUTION_AS_SEQUENCE)
			.addInboundBinding(TimeContinuousPackage.Literals.DISTRIBUTION_EVENT__SLOPE_BEFORE)
			.addInboundBinding(TimeContinuousPackage.Literals.DISTRIBUTION_EVENT__MOMENT)
			.addInboundBinding(TimeContinuousPackage.Literals.DISTRIBUTION_EVENT__PREVIOUS, eventBeforeBindings);
	
	/*
	 * (non-Javadoc)
	 * @see com.misc.common.moplaf.propagator2.impl.PropagatorFunctionBindingsImpl#doGetBindings()
	 */
	@Override
	public Bindings doGetBindings() {
		return distributionEventBindings;
	}
	
	/**
	 * 
	 * (non-Javadoc)
	 * @see com.misc.common.moplaf.propagator2.impl.PropagatorFunctionImpl#doRefresh()
	 */
	@Override
	public void doRefresh() {
		DistributionEvent event = this.getDistributionEvent();
		event.refreshAmountBefore();
	}


} //PropagatorCalcEventAmountBeforeImpl
