/**
 */
package com.misc.common.moplaf.time.continuous;

import com.misc.common.moplaf.propagator.ObjectWithPropagatorFunctionAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Event</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see com.misc.common.moplaf.time.continuous.ContinuousPackage#getCompositeEvent()
 * @model abstract="true"
 * @generated
 */
public interface CompositeEvent extends ObjectWithPropagatorFunctionAdapter, DistributionEventsProvider {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void refreshEvent();

} // CompositeEvent
