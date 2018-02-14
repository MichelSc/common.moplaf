/**
 */
package com.misc.common.moplaf.gis;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Location Pinpointed</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.gis.GisLocationPinpointed#getDistance <em>Distance</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.GisLocationPinpointed#getLocationPinpointed <em>Location Pinpointed</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.gis.GisPackage#getGisLocationPinpointed()
 * @model
 * @generated
 */
public interface GisLocationPinpointed extends GisCoordinatesAbstract {
	/**
	 * Returns the value of the '<em><b>Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Distance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distance</em>' attribute.
	 * @see #setDistance(float)
	 * @see com.misc.common.moplaf.gis.GisPackage#getGisLocationPinpointed_Distance()
	 * @model
	 * @generated
	 */
	float getDistance();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.gis.GisLocationPinpointed#getDistance <em>Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distance</em>' attribute.
	 * @see #getDistance()
	 * @generated
	 */
	void setDistance(float value);

	/**
	 * Returns the value of the '<em><b>Location Pinpointed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location Pinpointed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location Pinpointed</em>' attribute.
	 * @see #setLocationPinpointed(String)
	 * @see com.misc.common.moplaf.gis.GisPackage#getGisLocationPinpointed_LocationPinpointed()
	 * @model
	 * @generated
	 */
	String getLocationPinpointed();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.gis.GisLocationPinpointed#getLocationPinpointed <em>Location Pinpointed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location Pinpointed</em>' attribute.
	 * @see #getLocationPinpointed()
	 * @generated
	 */
	void setLocationPinpointed(String value);

} // GisLocationPinpointed
