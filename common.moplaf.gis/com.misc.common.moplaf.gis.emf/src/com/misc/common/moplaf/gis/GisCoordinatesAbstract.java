/**
 */
package com.misc.common.moplaf.gis;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coordinates Abstract</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.gis.GisCoordinatesAbstract#getLongitude <em>Longitude</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.GisCoordinatesAbstract#getLatitude <em>Latitude</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.gis.GisPackage#getGisCoordinatesAbstract()
 * @model abstract="true"
 * @generated
 */
public interface GisCoordinatesAbstract extends GisLocation {
	/**
	 * Returns the value of the '<em><b>Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Longitude</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Longitude</em>' attribute.
	 * @see #setLongitude(double)
	 * @see com.misc.common.moplaf.gis.GisPackage#getGisCoordinatesAbstract_Longitude()
	 * @model
	 * @generated
	 */
	double getLongitude();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.gis.GisCoordinatesAbstract#getLongitude <em>Longitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Longitude</em>' attribute.
	 * @see #getLongitude()
	 * @generated
	 */
	void setLongitude(double value);

	/**
	 * Returns the value of the '<em><b>Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Latitude</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Latitude</em>' attribute.
	 * @see #setLatitude(double)
	 * @see com.misc.common.moplaf.gis.GisPackage#getGisCoordinatesAbstract_Latitude()
	 * @model
	 * @generated
	 */
	double getLatitude();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.gis.GisCoordinatesAbstract#getLatitude <em>Latitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Latitude</em>' attribute.
	 * @see #getLatitude()
	 * @generated
	 */
	void setLatitude(double value);

} // GisCoordinatesAbstract
