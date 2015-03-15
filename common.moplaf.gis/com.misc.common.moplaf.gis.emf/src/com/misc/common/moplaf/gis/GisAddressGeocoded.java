/**
 */
package com.misc.common.moplaf.gis;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Address Geocoded</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.misc.common.moplaf.gis.GisAddressGeocoded#getScore <em>Score</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.GisAddressGeocoded#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.misc.common.moplaf.gis.GisPackage#getGisAddressGeocoded()
 * @model
 * @generated
 */
public interface GisAddressGeocoded extends GisCoordinates {
	/**
	 * Returns the value of the '<em><b>Score</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Score</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Score</em>' attribute.
	 * @see #setScore(float)
	 * @see com.misc.common.moplaf.gis.GisPackage#getGisAddressGeocoded_Score()
	 * @model
	 * @generated
	 */
	float getScore();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.gis.GisAddressGeocoded#getScore <em>Score</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Score</em>' attribute.
	 * @see #getScore()
	 * @generated
	 */
	void setScore(float value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see com.misc.common.moplaf.gis.GisPackage#getGisAddressGeocoded_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.gis.GisAddressGeocoded#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // GisAddressGeocoded
