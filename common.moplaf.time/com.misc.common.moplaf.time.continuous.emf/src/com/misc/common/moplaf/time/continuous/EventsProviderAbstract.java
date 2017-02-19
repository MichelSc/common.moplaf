/**
 */
package com.misc.common.moplaf.time.continuous;

import com.misc.common.moplaf.propagator2.ObjectWithPropagatorFunctions;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Events Provider Abstract</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.time.continuous.EventsProviderAbstract#getDistribution <em>Distribution</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.time.continuous.TimeContinuousPackage#getEventsProviderAbstract()
 * @model abstract="true"
 * @generated
 */
public interface EventsProviderAbstract extends ObjectWithPropagatorFunctions {
	/**
	 * Returns the value of the '<em><b>Distribution</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.time.continuous.Distribution#getEventsProviders <em>Events Providers</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Distribution</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distribution</em>' container reference.
	 * @see #setDistribution(Distribution)
	 * @see com.misc.common.moplaf.time.continuous.TimeContinuousPackage#getEventsProviderAbstract_Distribution()
	 * @see com.misc.common.moplaf.time.continuous.Distribution#getEventsProviders
	 * @model opposite="EventsProviders" required="true" transient="false"
	 * @generated
	 */
	Distribution getDistribution();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.time.continuous.EventsProviderAbstract#getDistribution <em>Distribution</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distribution</em>' container reference.
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
	void refreshEvents();

} // EventsProviderAbstract
