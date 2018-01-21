/*******************************************************************************
 * Copyright (c) 2017 Michel Schaffers and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Michel Schaffers - initial API and implementation
 *******************************************************************************/
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
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.gis.GisAddressGeocoded#getScore <em>Score</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.GisAddressGeocoded#getAddressGeocoded <em>Address Geocoded</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.GisAddressGeocoded#getAddress <em>Address</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.gis.GisPackage#getGisAddressGeocoded()
 * @model
 * @generated
 */
public interface GisAddressGeocoded extends GisCoordinatesAbstract {
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
	 * Returns the value of the '<em><b>Address Geocoded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Address Geocoded</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address Geocoded</em>' attribute.
	 * @see #setAddressGeocoded(String)
	 * @see com.misc.common.moplaf.gis.GisPackage#getGisAddressGeocoded_AddressGeocoded()
	 * @model
	 * @generated
	 */
	String getAddressGeocoded();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.gis.GisAddressGeocoded#getAddressGeocoded <em>Address Geocoded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address Geocoded</em>' attribute.
	 * @see #getAddressGeocoded()
	 * @generated
	 */
	void setAddressGeocoded(String value);

	/**
	 * Returns the value of the '<em><b>Address</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.gis.GisAddress#getGeocodedAddresses <em>Geocoded Addresses</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Address</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' container reference.
	 * @see #setAddress(GisAddress)
	 * @see com.misc.common.moplaf.gis.GisPackage#getGisAddressGeocoded_Address()
	 * @see com.misc.common.moplaf.gis.GisAddress#getGeocodedAddresses
	 * @model opposite="GeocodedAddresses" required="true" transient="false"
	 * @generated
	 */
	GisAddress getAddress();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.gis.GisAddressGeocoded#getAddress <em>Address</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' container reference.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(GisAddress value);

} // GisAddressGeocoded
