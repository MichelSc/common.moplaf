/**
 */
package com.misc.common.moplaf.gis;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Address</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.misc.common.moplaf.gis.GisAddress#getCountry <em>Country</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.GisAddress#getStreet <em>Street</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.GisAddress#getCity <em>City</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.GisAddress#getBuildingNumber <em>Building Number</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.GisAddress#getPostalCode <em>Postal Code</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.GisAddress#getGeocodedAddresses <em>Geocoded Addresses</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.GisAddress#getSelectedGeocodedLocation <em>Selected Geocoded Location</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.GisAddress#getGeocoder <em>Geocoder</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.misc.common.moplaf.gis.GisPackage#getGisAddress()
 * @model
 * @generated
 */
public interface GisAddress extends GisLocation {
	/**
	 * Returns the value of the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Country</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Country</em>' attribute.
	 * @see #setCountry(String)
	 * @see com.misc.common.moplaf.gis.GisPackage#getGisAddress_Country()
	 * @model
	 * @generated
	 */
	String getCountry();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.gis.GisAddress#getCountry <em>Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Country</em>' attribute.
	 * @see #getCountry()
	 * @generated
	 */
	void setCountry(String value);

	/**
	 * Returns the value of the '<em><b>Street</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Street</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Street</em>' attribute.
	 * @see #setStreet(String)
	 * @see com.misc.common.moplaf.gis.GisPackage#getGisAddress_Street()
	 * @model
	 * @generated
	 */
	String getStreet();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.gis.GisAddress#getStreet <em>Street</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Street</em>' attribute.
	 * @see #getStreet()
	 * @generated
	 */
	void setStreet(String value);

	/**
	 * Returns the value of the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>City</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>City</em>' attribute.
	 * @see #setCity(String)
	 * @see com.misc.common.moplaf.gis.GisPackage#getGisAddress_City()
	 * @model
	 * @generated
	 */
	String getCity();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.gis.GisAddress#getCity <em>City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>City</em>' attribute.
	 * @see #getCity()
	 * @generated
	 */
	void setCity(String value);

	/**
	 * Returns the value of the '<em><b>Building Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Building Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Building Number</em>' attribute.
	 * @see #setBuildingNumber(String)
	 * @see com.misc.common.moplaf.gis.GisPackage#getGisAddress_BuildingNumber()
	 * @model
	 * @generated
	 */
	String getBuildingNumber();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.gis.GisAddress#getBuildingNumber <em>Building Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Building Number</em>' attribute.
	 * @see #getBuildingNumber()
	 * @generated
	 */
	void setBuildingNumber(String value);

	/**
	 * Returns the value of the '<em><b>Postal Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Postal Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Postal Code</em>' attribute.
	 * @see #setPostalCode(String)
	 * @see com.misc.common.moplaf.gis.GisPackage#getGisAddress_PostalCode()
	 * @model
	 * @generated
	 */
	String getPostalCode();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.gis.GisAddress#getPostalCode <em>Postal Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Postal Code</em>' attribute.
	 * @see #getPostalCode()
	 * @generated
	 */
	void setPostalCode(String value);

	/**
	 * Returns the value of the '<em><b>Geocoded Addresses</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.gis.GisAddressGeocoded}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Geocoded Addresses</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geocoded Addresses</em>' containment reference list.
	 * @see com.misc.common.moplaf.gis.GisPackage#getGisAddress_GeocodedAddresses()
	 * @model containment="true"
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void geocode();

} // GisAddress
