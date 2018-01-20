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

import com.misc.common.moplaf.common.EnabledFeedback;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Address</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.gis.GisAddress#getCountryCode <em>Country Code</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.GisAddress#getGeocodedAddresses <em>Geocoded Addresses</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.GisAddress#getSelectedGeocodedLocation <em>Selected Geocoded Location</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.GisAddress#getGeocoder <em>Geocoder</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.GisAddress#getGeocodingFeedback <em>Geocoding Feedback</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.GisAddress#getRefreshFeedback <em>Refresh Feedback</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.gis.GisPackage#getGisAddress()
 * @model abstract="true"
 * @generated
 */
public interface GisAddress extends GisLocation {
	/**
	 * Returns the value of the '<em><b>Country Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Country Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Country Code</em>' attribute.
	 * @see #setCountryCode(String)
	 * @see com.misc.common.moplaf.gis.GisPackage#getGisAddress_CountryCode()
	 * @model
	 * @generated
	 */
	String getCountryCode();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.gis.GisAddress#getCountryCode <em>Country Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Country Code</em>' attribute.
	 * @see #getCountryCode()
	 * @generated
	 */
	void setCountryCode(String value);

	/**
	 * Returns the value of the '<em><b>Geocoded Addresses</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.gis.GisAddressGeocoded}.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.gis.GisAddressGeocoded#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Geocoded Addresses</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geocoded Addresses</em>' containment reference list.
	 * @see com.misc.common.moplaf.gis.GisPackage#getGisAddress_GeocodedAddresses()
	 * @see com.misc.common.moplaf.gis.GisAddressGeocoded#getAddress
	 * @model opposite="Address" containment="true"
	 * @generated
	 */
	EList<GisAddressGeocoded> getGeocodedAddresses();

	/**
	 * Returns the value of the '<em><b>Selected Geocoded Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selected Geocoded Location</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selected Geocoded Location</em>' reference.
	 * @see #setSelectedGeocodedLocation(GisAddressGeocoded)
	 * @see com.misc.common.moplaf.gis.GisPackage#getGisAddress_SelectedGeocodedLocation()
	 * @model
	 * @generated
	 */
	GisAddressGeocoded getSelectedGeocodedLocation();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.gis.GisAddress#getSelectedGeocodedLocation <em>Selected Geocoded Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selected Geocoded Location</em>' reference.
	 * @see #getSelectedGeocodedLocation()
	 * @generated
	 */
	void setSelectedGeocodedLocation(GisAddressGeocoded value);

	/**
	 * Returns the value of the '<em><b>Geocoder</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Geocoder</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geocoder</em>' reference.
	 * @see #setGeocoder(GisAddressGeocoder)
	 * @see com.misc.common.moplaf.gis.GisPackage#getGisAddress_Geocoder()
	 * @model
	 * @generated
	 */
	GisAddressGeocoder getGeocoder();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.gis.GisAddress#getGeocoder <em>Geocoder</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geocoder</em>' reference.
	 * @see #getGeocoder()
	 * @generated
	 */
	void setGeocoder(GisAddressGeocoder value);

	/**
	 * Returns the value of the '<em><b>Geocoding Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Geocoding Feedback</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geocoding Feedback</em>' attribute.
	 * @see #setGeocodingFeedback(String)
	 * @see com.misc.common.moplaf.gis.GisPackage#getGisAddress_GeocodingFeedback()
	 * @model
	 * @generated
	 */
	String getGeocodingFeedback();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.gis.GisAddress#getGeocodingFeedback <em>Geocoding Feedback</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geocoding Feedback</em>' attribute.
	 * @see #getGeocodingFeedback()
	 * @generated
	 */
	void setGeocodingFeedback(String value);

	/**
	 * Returns the value of the '<em><b>Refresh Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refresh Feedback</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refresh Feedback</em>' attribute.
	 * @see com.misc.common.moplaf.gis.GisPackage#getGisAddress_RefreshFeedback()
	 * @model dataType="com.misc.common.moplaf.job.EnabledFeedback" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EnabledFeedback getRefreshFeedback();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void refreshGeocoded();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void flushGeocoded();

} // GisAddress
