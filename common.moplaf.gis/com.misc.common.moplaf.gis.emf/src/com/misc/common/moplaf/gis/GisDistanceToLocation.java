/**
 */
package com.misc.common.moplaf.gis;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Distance To Location</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.misc.common.moplaf.gis.GisDistanceToLocation#getFromLocations <em>From Locations</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.GisDistanceToLocation#getLocation <em>Location</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.misc.common.moplaf.gis.GisPackage#getGisDistanceToLocation()
 * @model
 * @generated
 */
public interface GisDistanceToLocation extends EObject {
	/**
	 * Returns the value of the '<em><b>From Locations</b></em>' reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.gis.GisDistanceMatrixElement}.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.gis.GisDistanceMatrixElement#getToLocation <em>To Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Locations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Locations</em>' reference list.
	 * @see com.misc.common.moplaf.gis.GisPackage#getGisDistanceToLocation_FromLocations()
	 * @see com.misc.common.moplaf.gis.GisDistanceMatrixElement#getToLocation
	 * @model opposite="toLocation"
	 * @generated
	 */
	EList<GisDistanceMatrixElement> getFromLocations();

	/**
	 * Returns the value of the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' reference.
	 * @see #setLocation(GisLocation)
	 * @see com.misc.common.moplaf.gis.GisPackage#getGisDistanceToLocation_Location()
	 * @model required="true"
	 * @generated
	 */
	GisLocation getLocation();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.gis.GisDistanceToLocation#getLocation <em>Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(GisLocation value);

} // GisDistanceToLocation
