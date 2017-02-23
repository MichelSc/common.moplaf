/**
 */
package com.misc.common.moplaf.time.continuous.calc.impl;

import com.misc.common.moplaf.propagator2.util.Bindings;
import com.misc.common.moplaf.time.continuous.TimeContinuousPackage;
import com.misc.common.moplaf.time.continuous.calc.PropagatorCalcChildEventMoment;
import com.misc.common.moplaf.time.continuous.calc.TimeContinuousCalcPackage;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Propagator Calc Child Event Moment</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class PropagatorCalcChildEventMomentImpl extends PropagatorCalcEventMomentImpl implements PropagatorCalcChildEventMoment {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropagatorCalcChildEventMomentImpl() {
		super();
	}


	// extract from the old implementation
	// not sure this is sill necessary
//	@Override
//	protected PropagatorFunctionAdapters getAntecedents() {
//		PropagatorFunctionAdapters antecedents = super.getAntecedents();
//
//		ChildEvent event = (ChildEvent)this.target;
// 
//		DistributionEvent originalEvent = event.getOriginal();
//		
//		if ( originalEvent!=null){
//			PropagatorFunctionAdapter calcOrignalEventMoment= Util.getPropagatorFunctionAdapter(originalEvent, PropagatorCalcEventMoment.class);
//			antecedents.add(calcOrignalEventMoment);
//		}
//		
//		return antecedents;
//	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TimeContinuousCalcPackage.Literals.PROPAGATOR_CALC_CHILD_EVENT_MOMENT;
	}

	private static Bindings originalEventBindings = Bindings.constructBindings()
			.addInboundBinding(TimeContinuousPackage.Literals.DISTRIBUTION_EVENT__MOMENT);
	
	protected static Bindings distributionEventBindings = PropagatorCalcEventMomentImpl.distributionEventBindings.copy()
			.addInboundBinding(TimeContinuousPackage.Literals.CHILD_EVENT__ORIGINAL, originalEventBindings);
	
	/*
	 * (non-Javadoc)
	 * @see com.misc.common.moplaf.propagator2.impl.PropagatorFunctionBindingsImpl#doGetBindings()
	 */
	@Override
	public Bindings doGetBindings() {
		return distributionEventBindings;
	}

} //PropagatorCalcChildEventMomentImpl
