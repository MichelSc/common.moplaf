/**
 */
package com.misc.common.moplaf.gis;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coordinates</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.misc.common.moplaf.gis.GisCoordinates#getLongitude <em>Longitude</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.GisCoordinates#getLatitude <em>Latitude</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.misc.common.moplaf.gis.GisPackage#getGisCoordinates()
 * @model
 * @generated
 */
public interface GisCoordinates extends GisLocation {
	/**
	 * Returns the value of the '<em><b>Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Longitude</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Longitude</em>' attribute.
	 * @see #setLongitude(float)
	 * @see com.misc.common.moplaf.gis.GisPackage#getGisCoordinates_Longitude()
	 * @model
	 * @generated
	 */
	float getLongitude();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.gis.GisCoordinates#getLongitude <em>Longitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Longitude</em>' attribute.
	 * @see #getLongitude()
	 * @generated
	 */
	void setLongitude(float value);

	/**
	 * Returns the value of the '<em><b>Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Latitude</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Latitude</em>' attribute.
	 * @see #setLatitude(float)
	 * @see com.misc.common.moplaf.gis.GisPackage#getGisCoordinates_Latitude()
	 * @model
	 * @generated
	 */
	float getLatitude();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.gis.GisCoordinates#getLatitude <em>Latitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Latitude</em>' attribute.
	 * @see #getLatitude()
	 * @generated
	 */
	void setLatitude(float value);

} // GisCoordinates
