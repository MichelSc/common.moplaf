/**
 */
package com.misc.common.moplaf.macroplanner;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Routing Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.macroplanner.RoutingResource#getRouting <em>Routing</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.RoutingResource#getLocationResource <em>Location Resource</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.RoutingResource#getReservation <em>Reservation</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.RoutingResource#getOffset <em>Offset</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.RoutingResource#getCode <em>Code</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.macroplanner.MacroPlannerPackage#getRoutingResource()
 * @model
 * @generated
 */
public interface RoutingResource extends EObject {
	/**
	 * Returns the value of the '<em><b>Routing</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.macroplanner.Routing#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Routing</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Routing</em>' container reference.
	 * @see #setRouting(Routing)
	 * @see com.misc.common.moplaf.macroplanner.MacroPlannerPackage#getRoutingResource_Routing()
	 * @see com.misc.common.moplaf.macroplanner.Routing#getResources
	 * @model opposite="Resources" required="true" transient="false"
	 * @generated
	 */
	Routing getRouting();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.macroplanner.RoutingResource#getRouting <em>Routing</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Routing</em>' container reference.
	 * @see #getRouting()
	 * @generated
	 */
	void setRouting(Routing value);

	/**
	 * Returns the value of the '<em><b>Reservation</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reservation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reservation</em>' attribute.
	 * @see #setReservation(double)
	 * @see com.misc.common.moplaf.macroplanner.MacroPlannerPackage#getRoutingResource_Reservation()
	 * @model default="0.0"
	 * @generated
	 */
	double getReservation();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.macroplanner.RoutingResource#getReservation <em>Reservation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reservation</em>' attribute.
	 * @see #getReservation()
	 * @generated
	 */
	void setReservation(double value);

	/**
	 * Returns the value of the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Offset</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offset</em>' attribute.
	 * @see #setOffset(float)
	 * @see com.misc.common.moplaf.macroplanner.MacroPlannerPackage#getRoutingResource_Offset()
	 * @model
	 * @generated
	 */
	float getOffset();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.macroplanner.RoutingResource#getOffset <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Offset</em>' attribute.
	 * @see #getOffset()
	 * @generated
	 */
	void setOffset(float value);

	/**
	 * Returns the value of the '<em><b>Location Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location Resource</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location Resource</em>' reference.
	 * @see #setLocationResource(LocationResource)
	 * @see com.misc.common.moplaf.macroplanner.MacroPlannerPackage#getRoutingResource_LocationResource()
	 * @model
	 * @generated
	 */
	LocationResource getLocationResource();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.macroplanner.RoutingResource#getLocationResource <em>Location Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location Resource</em>' reference.
	 * @see #getLocationResource()
	 * @generated
	 */
	void setLocationResource(LocationResource value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see com.misc.common.moplaf.macroplanner.MacroPlannerPackage#getRoutingResource_Code()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getCode();

} // RoutingResource
