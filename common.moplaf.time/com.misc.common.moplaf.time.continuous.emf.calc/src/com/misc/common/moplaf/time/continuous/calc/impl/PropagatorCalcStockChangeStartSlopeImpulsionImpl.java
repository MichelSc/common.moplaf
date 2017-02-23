/**
 */
package com.misc.common.moplaf.time.continuous.calc.impl;

import com.misc.common.moplaf.propagator2.util.Bindings;
import com.misc.common.moplaf.time.continuous.TimeContinuousPackage;
import com.misc.common.moplaf.time.continuous.calc.PropagatorCalcStockChangeStartSlopeImpulsion;
import com.misc.common.moplaf.time.continuous.calc.TimeContinuousCalcPackage;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Propagator Calc Stock Change Start Slope Impulsion</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class PropagatorCalcStockChangeStartSlopeImpulsionImpl extends PropagatorCalcSlopeImpulsionSlopeImpulsionImpl implements PropagatorCalcStockChangeStartSlopeImpulsion {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropagatorCalcStockChangeStartSlopeImpulsionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TimeContinuousCalcPackage.Literals.PROPAGATOR_CALC_STOCK_CHANGE_START_SLOPE_IMPULSION;
	}

	protected static Bindings providerBindings = Bindings.constructBindings()
			.addInboundBinding(TimeContinuousPackage.Literals.STOCK_CHANGE__SLOPE);

	protected static Bindings distributionEventBindings = PropagatorCalcSlopeAbsoluteSlopeAbsoluteImpl.distributionEventBindings.copy()
			.addInboundBinding(TimeContinuousPackage.Literals.STOCK_CHANGE_START__PROVIDER, providerBindings);
	
	/*
	 * (non-Javadoc)
	 * @see com.misc.common.moplaf.propagator2.impl.PropagatorFunctionBindingsImpl#doGetBindings()
	 */
	@Override
	public Bindings doGetBindings() {
		return distributionEventBindings;
	}

} //PropagatorCalcStockChangeStartSlopeImpulsionImpl
