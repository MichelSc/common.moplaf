/**
 */
package com.misc.common.moplaf.gis;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Router Geodesic</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.gis.GisRouterGeodesic#getSpeed <em>Speed</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.GisRouterGeodesic#getCorrection <em>Correction</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.gis.GisPackage#getGisRouterGeodesic()
 * @model
 * @generated
 */
public interface GisRouterGeodesic extends GisRouteCalculatorOneToOne {
	/**
	 * Returns the value of the '<em><b>Speed</b></em>' attribute.
	 * The default value is <code>"50.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Speed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Speed</em>' attribute.
	 * @see #setSpeed(double)
	 * @see com.misc.common.moplaf.gis.GisPackage#getGisRouterGeodesic_Speed()
	 * @model default="50.0"
	 * @generated
	 */
	double getSpeed();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.gis.GisRouterGeodesic#getSpeed <em>Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Speed</em>' attribute.
	 * @see #getSpeed()
	 * @generated
	 */
	void setSpeed(double value);

	/**
	 * Returns the value of the '<em><b>Correction</b></em>' attribute.
	 * The default value is <code>"1.3"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Correction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Correction</em>' attribute.
	 * @see #setCorrection(double)
	 * @see com.misc.common.moplaf.gis.GisPackage#getGisRouterGeodesic_Correction()
	 * @model default="1.3"
	 * @generated
	 */
	double getCorrection();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.gis.GisRouterGeodesic#getCorrection <em>Correction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Correction</em>' attribute.
	 * @see #getCorrection()
	 * @generated
	 */
	void setCorrection(double value);

} // GisRouterGeodesic
