/**
 */
package com.misc.common.moplaf.gis;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Route Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.gis.GisRouteInfo#getFromLocation <em>From Location</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.GisRouteInfo#getDistance <em>Distance</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.GisRouteInfo#getDuration <em>Duration</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.GisRouteInfo#getToLocation <em>To Location</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.gis.GisPackage#getGisRouteInfo()
 * @model
 * @generated
 */
public interface GisRouteInfo extends EObject {
	/**
	 * Returns the value of the '<em><b>From Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Location</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Location</em>' reference.
	 * @see #setFromLocation(GisLocation)
	 * @see com.misc.common.moplaf.gis.GisPackage#getGisRouteInfo_FromLocation()
	 * @model required="true"
	 * @generated
	 */
	GisLocation getFromLocation();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.gis.GisRouteInfo#getFromLocation <em>From Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Location</em>' reference.
	 * @see #getFromLocation()
	 * @generated
	 */
	void setFromLocation(GisLocation value);

	/**
	 * Returns the value of the '<em><b>Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Distance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distance</em>' attribute.
	 * @see #setDistance(double)
	 * @see com.misc.common.moplaf.gis.GisPackage#getGisRouteInfo_Distance()
	 * @model
	 * @generated
	 */
	double getDistance();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.gis.GisRouteInfo#getDistance <em>Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distance</em>' attribute.
	 * @see #getDistance()
	 * @generated
	 */
	void setDistance(double value);

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see #setDuration(double)
	 * @see com.misc.common.moplaf.gis.GisPackage#getGisRouteInfo_Duration()
	 * @model
	 * @generated
	 */
	double getDuration();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.gis.GisRouteInfo#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(double value);

	/**
	 * Returns the value of the '<em><b>To Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Location</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Location</em>' reference.
	 * @see #setToLocation(GisLocation)
	 * @see com.misc.common.moplaf.gis.GisPackage#getGisRouteInfo_ToLocation()
	 * @model required="true"
	 * @generated
	 */
	GisLocation getToLocation();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.gis.GisRouteInfo#getToLocation <em>To Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Location</em>' reference.
	 * @see #getToLocation()
	 * @generated
	 */
	void setToLocation(GisLocation value);

} // GisRouteInfo
