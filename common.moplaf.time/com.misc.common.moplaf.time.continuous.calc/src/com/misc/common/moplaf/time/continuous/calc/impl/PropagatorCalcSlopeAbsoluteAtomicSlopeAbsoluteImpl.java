/**
 */
package com.misc.common.moplaf.time.continuous.calc.impl;

import com.misc.common.moplaf.propagator2.util.Bindings;
import com.misc.common.moplaf.time.continuous.TimeContinuousPackage;
import com.misc.common.moplaf.time.continuous.calc.PropagatorCalcSlopeAbsoluteAtomicSlopeAbsolute;
import com.misc.common.moplaf.time.continuous.calc.TimeContinuousCalcPackage;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Propagator Calc Slope Absolute Atomic Slope Absolute</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class PropagatorCalcSlopeAbsoluteAtomicSlopeAbsoluteImpl extends PropagatorCalcSlopeAbsoluteSlopeAbsoluteImpl implements PropagatorCalcSlopeAbsoluteAtomicSlopeAbsolute {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropagatorCalcSlopeAbsoluteAtomicSlopeAbsoluteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TimeContinuousCalcPackage.Literals.PROPAGATOR_CALC_SLOPE_ABSOLUTE_ATOMIC_SLOPE_ABSOLUTE;
	}
	
	protected static Bindings providerBindings = Bindings.constructBindings()
			.addInboundBinding(TimeContinuousPackage.Literals.SLOPE_ABSOLUTE_PROVIDER__SLOPE_ABSOLUTE);

	protected static Bindings distributionEventBindings = PropagatorCalcSlopeAbsoluteSlopeAbsoluteImpl.distributionEventBindings.copy()
			.addInboundBinding(TimeContinuousPackage.Literals.SLOPE_ABSOLUTE_ATOMIC__PROVIDER, providerBindings);
	
	/*
	 * (non-Javadoc)
	 * @see com.misc.common.moplaf.propagator2.impl.PropagatorFunctionBindingsImpl#doGetBindings()
	 */
	@Override
	public Bindings doGetBindings() {
		return distributionEventBindings;
	}

} //PropagatorCalcSlopeAbsoluteAtomicSlopeAbsoluteImpl
