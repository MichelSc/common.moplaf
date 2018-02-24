/**
 */
package com.misc.common.moplaf.gis.kml;

import com.misc.common.moplaf.common.Coordinates;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.gis.kml.Point#getCoordinates <em>Coordinates</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.gis.kml.KmlPackage#getPoint()
 * @model
 * @generated
 */
public interface Point extends Geometry {

	/**
	 * Returns the value of the '<em><b>Coordinates</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coordinates</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coordinates</em>' attribute.
	 * @see #setCoordinates(Coordinates)
	 * @see com.misc.common.moplaf.gis.kml.KmlPackage#getPoint_Coordinates()
	 * @model dataType="com.misc.common.moplaf.gis.kml.Coordinates"
	 * @generated
	 */
	Coordinates getCoordinates();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.gis.kml.Point#getCoordinates <em>Coordinates</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coordinates</em>' attribute.
	 * @see #getCoordinates()
	 * @generated
	 */
	void setCoordinates(Coordinates value);
} // Point
