/**
 */
package com.misc.common.moplaf.time.continuous;


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
	 * @see #setProvidedEvent(DistributionEvent)
	 * @see com.misc.common.moplaf.time.continuous.ContinuousPackage#getEventProvider_ProvidedEvent()
	 * @model
	 * @generated
	 */
	DistributionEvent getProvidedEvent();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.time.continuous.EventProvider#getProvidedEvent <em>Provided Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provided Event</em>' reference.
	 * @see #getProvidedEvent()
	 * @generated
	 */
	void setProvidedEvent(DistributionEvent value);

} // EventProvider
