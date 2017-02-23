/**
 */
package com.misc.common.moplaf.time.continuous.calc.impl;

import com.misc.common.moplaf.propagator2.util.Bindings;
import com.misc.common.moplaf.time.continuous.SlopeImpulsion;
import com.misc.common.moplaf.time.continuous.TimeContinuousPackage;
import com.misc.common.moplaf.time.continuous.calc.PropagatorCalcSlopeImpulsionSlopeImpulsion;
import com.misc.common.moplaf.time.continuous.calc.TimeContinuousCalcPackage;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Propagator Calc Slope Impulsion Slope Impulsion</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class PropagatorCalcSlopeImpulsionSlopeImpulsionImpl extends PropagatorCalcEventSlopeImpl implements PropagatorCalcSlopeImpulsionSlopeImpulsion {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropagatorCalcSlopeImpulsionSlopeImpulsionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TimeContinuousCalcPackage.Literals.PROPAGATOR_CALC_SLOPE_IMPULSION_SLOPE_IMPULSION;
	}
	
	protected static Bindings distributionEventBindings = Bindings.constructBindings()
			.addOutboundBinding(TimeContinuousPackage.Literals.SLOPE_IMPULSION__SLOPE_IMPULSION);
	
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
		SlopeImpulsion event = (SlopeImpulsion) this.getDistributionEvent();
		event.refreshSlopeImpulsion();
	}

} //PropagatorCalcSlopeImpulsionSlopeImpulsionImpl
