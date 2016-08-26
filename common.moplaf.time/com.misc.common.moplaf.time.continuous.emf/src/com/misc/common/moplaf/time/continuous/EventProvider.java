/**
 */
package com.misc.common.moplaf.time.continuous;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.time.continuous.EventProvider#getProvidedEvent <em>Provided Event</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.continuous.EventProvider#getMoment <em>Moment</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.time.continuous.ContinuousPackage#getEventProvider()
 * @model abstract="true"
 * @generated
 */
public interface EventProvider extends EventsProviderAbstract {
	/**
	 * Returns the value of the '<em><b>Provided Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provided Event</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provided Event</em>' reference.
	 * @see com.misc.common.moplaf.time.continuous.ContinuousPackage#getEventProvider_ProvidedEvent()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	ProvidedEvent getProvidedEvent();

	/**
	 * Returns the value of the '<em><b>Moment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Moment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Moment</em>' attribute.
	 * @see #setMoment(Date)
	 * @see com.misc.common.moplaf.time.continuous.ContinuousPackage#getEventProvider_Moment()
	 * @model
	 * @generated
	 */
	Date getMoment();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.time.continuous.EventProvider#getMoment <em>Moment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Moment</em>' attribute.
	 * @see #getMoment()
	 * @generated
	 */
	void setMoment(Date value);

} // EventProvider
