/**
 */
package com.misc.common.moplaf.time.continuous;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Provided Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.time.continuous.ProvidedEvent#getEventProvider <em>Event Provider</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.time.continuous.TimeContinuousPackage#getProvidedEvent()
 * @model abstract="true"
 * @generated
 */
public interface ProvidedEvent extends DistributionEvent {
	/**
	 * Returns the value of the '<em><b>Event Provider</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event Provider</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Provider</em>' reference.
	 * @see com.misc.common.moplaf.time.continuous.TimeContinuousPackage#getProvidedEvent_EventProvider()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EventsProviderAbstract getEventProvider();

} // ProvidedEvent
