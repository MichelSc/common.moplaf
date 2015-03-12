/**
 */
package com.misc.common.moplaf.time.continuous;

import com.misc.common.moplaf.propagator.ObjectWithPropagatorFunctionAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Distribution Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.misc.common.moplaf.time.continuous.CompositeDistributionEvent#getDistribution <em>Distribution</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.misc.common.moplaf.time.continuous.ContinuousPackage#getCompositeDistributionEvent()
 * @model
 * @generated
 */
public interface CompositeDistributionEvent extends ObjectWithPropagatorFunctionAdapter {
	/**
	 * Returns the value of the '<em><b>Distribution</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.time.continuous.Distribution#getCompositeEvent <em>Composite Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Distribution</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distribution</em>' reference.
	 * @see #setDistribution(Distribution)
	 * @see com.misc.common.moplaf.time.continuous.ContinuousPackage#getCompositeDistributionEvent_Distribution()
	 * @see com.misc.common.moplaf.time.continuous.Distribution#getCompositeEvent
	 * @model opposite="CompositeEvent"
	 * @generated
	 */
	Distribution getDistribution();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.time.continuous.CompositeDistributionEvent#getDistribution <em>Distribution</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distribution</em>' reference.
	 * @see #getDistribution()
	 * @generated
	 */
	void setDistribution(Distribution value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void refreshEvent();

} // CompositeDistributionEvent
