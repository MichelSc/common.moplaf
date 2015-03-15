/**
 */
package com.misc.common.moplaf.gis.impl;

import com.misc.common.moplaf.gis.GisAddress;
import com.misc.common.moplaf.gis.GisAddressGeocoded;
import com.misc.common.moplaf.gis.GisAddressGeocoder;
import com.misc.common.moplaf.gis.GisCoordinates;
import com.misc.common.moplaf.gis.GisPackage;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Address</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.misc.common.moplaf.gis.impl.GisAddressImpl#getCountry <em>Country</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.impl.GisAddressImpl#getStreet <em>Street</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.impl.GisAddressImpl#getCity <em>City</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.impl.GisAddressImpl#getBuildingNumber <em>Building Number</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.impl.GisAddressImpl#getPostalCode <em>Postal Code</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.impl.GisAddressImpl#getGeocodedAddresses <em>Geocoded Addresses</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.impl.GisAddressImpl#getSelectedGeocodedLocation <em>Selected Geocoded Location</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.impl.GisAddressImpl#getGeocoder <em>Geocoder</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GisAddressImpl extends GisLocationImpl implements GisAddress {
	/**
	 * The default value of the '{@link #getCountry() <em>Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountry()
	 * @generated
	 * @ordered
	 */
	protected static final String COUNTRY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCountry() <em>Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountry()
	 * @generated
	 * @ordered
	 */
	protected String country = COUNTRY_EDEFAULT;

	/**
	 * The default value of the '{@link #getStreet() <em>Street</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStreet()
	 * @generated
	 * @ordered
	 */
	protected static final String STREET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStreet() <em>Street</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStreet()
	 * @generated
	 * @ordered
	 */
	protected String street = STREET_EDEFAULT;

	/**
	 * The default value of the '{@link #getCity() <em>City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCity()
	 * @generated
	 * @ordered
	 */
	protected static final String CITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCity() <em>City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCity()
	 * @generated
	 * @ordered
	 */
	protected String city = CITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getBuildingNumber() <em>Building Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuildingNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String BUILDING_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBuildingNumber() <em>Building Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuildingNumber()
	 * @generated
	 * @ordered
	 */
	protected String buildingNumber = BUILDING_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getPostalCode() <em>Postal Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostalCode()
	 * @generated
	 * @ordered
	 */
	protected static final String POSTAL_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPostalCode() <em>Postal Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostalCode()
	 * @generated
	 * @ordered
	 */
	protected String postalCode = POSTAL_CODE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGeocodedAddresses() <em>Geocoded Addresses</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeocodedAddresses()
	 * @generated
	 * @ordered
	 */
	protected EList<GisAddressGeocoded> geocodedAddresses;

	/**
	 * The cached value of the '{@link #getSelectedGeocodedLocation() <em>Selected Geocoded Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectedGeocodedLocation()
	 * @generated
	 * @ordered
	 */
	protected GisAddressGeocoded selectedGeocodedLocation;

	/**
	 * The cached value of the '{@link #getGeocoder() <em>Geocoder</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeocoder()
	 * @generated
	 * @ordered
	 */
	protected GisAddressGeocoder geocoder;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GisAddressImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GisPackage.Literals.GIS_ADDRESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCountry(String newCountry) {
		String oldCountry = country;
		country = newCountry;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GisPackage.GIS_ADDRESS__COUNTRY, oldCountry, country));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStreet() {
		return street;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStreet(String newStreet) {
		String oldStreet = street;
		street = newStreet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GisPackage.GIS_ADDRESS__STREET, oldStreet, street));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCity() {
		return city;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCity(String newCity) {
		String oldCity = city;
		city = newCity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GisPackage.GIS_ADDRESS__CITY, oldCity, city));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBuildingNumber() {
		return buildingNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBuildingNumber(String newBuildingNumber) {
		String oldBuildingNumber = buildingNumber;
		buildingNumber = newBuildingNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GisPackage.GIS_ADDRESS__BUILDING_NUMBER, oldBuildingNumber, buildingNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPostalCode() {
		return postalCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPostalCode(String newPostalCode) {
		String oldPostalCode = postalCode;
		postalCode = newPostalCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GisPackage.GIS_ADDRESS__POSTAL_CODE, oldPostalCode, postalCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GisAddressGeocoded> getGeocodedAddresses() {
		if (geocodedAddresses == null) {
			geocodedAddresses = new EObjectContainmentEList<GisAddressGeocoded>(GisAddressGeocoded.class, this, GisPackage.GIS_ADDRESS__GEOCODED_ADDRESSES);
		}
		return geocodedAddresses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GisAddressGeocoded getSelectedGeocodedLocation() {
		if (selectedGeocodedLocation != null && selectedGeocodedLocation.eIsProxy()) {
			InternalEObject oldSelectedGeocodedLocation = (InternalEObject)selectedGeocodedLocation;
			selectedGeocodedLocation = (GisAddressGeocoded)eResolveProxy(oldSelectedGeocodedLocation);
			if (selectedGeocodedLocation != oldSelectedGeocodedLocation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GisPackage.GIS_ADDRESS__SELECTED_GEOCODED_LOCATION, oldSelectedGeocodedLocation, selectedGeocodedLocation));
			}
		}
		return selectedGeocodedLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GisAddressGeocoded basicGetSelectedGeocodedLocation() {
		return selectedGeocodedLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelectedGeocodedLocation(GisAddressGeocoded newSelectedGeocodedLocation) {
		GisAddressGeocoded oldSelectedGeocodedLocation = selectedGeocodedLocation;
		selectedGeocodedLocation = newSelectedGeocodedLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GisPackage.GIS_ADDRESS__SELECTED_GEOCODED_LOCATION, oldSelectedGeocodedLocation, selectedGeocodedLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GisAddressGeocoder getGeocoder() {
		if (geocoder != null && geocoder.eIsProxy()) {
			InternalEObject oldGeocoder = (InternalEObject)geocoder;
			geocoder = (GisAddressGeocoder)eResolveProxy(oldGeocoder);
			if (geocoder != oldGeocoder) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GisPackage.GIS_ADDRESS__GEOCODER, oldGeocoder, geocoder));
			}
		}
		return geocoder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GisAddressGeocoder basicGetGeocoder() {
		return geocoder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeocoder(GisAddressGeocoder newGeocoder) {
		GisAddressGeocoder oldGeocoder = geocoder;
		geocoder = newGeocoder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GisPackage.GIS_ADDRESS__GEOCODER, oldGeocoder, geocoder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void geocode() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GisPackage.GIS_ADDRESS__GEOCODED_ADDRESSES:
				return ((InternalEList<?>)getGeocodedAddresses()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GisPackage.GIS_ADDRESS__COUNTRY:
				return getCountry();
			case GisPackage.GIS_ADDRESS__STREET:
				return getStreet();
			case GisPackage.GIS_ADDRESS__CITY:
				return getCity();
			case GisPackage.GIS_ADDRESS__BUILDING_NUMBER:
				return getBuildingNumber();
			case GisPackage.GIS_ADDRESS__POSTAL_CODE:
				return getPostalCode();
			case GisPackage.GIS_ADDRESS__GEOCODED_ADDRESSES:
				return getGeocodedAddresses();
			case GisPackage.GIS_ADDRESS__SELECTED_GEOCODED_LOCATION:
				if (resolve) return getSelectedGeocodedLocation();
				return basicGetSelectedGeocodedLocation();
			case GisPackage.GIS_ADDRESS__GEOCODER:
				if (resolve) return getGeocoder();
				return basicGetGeocoder();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GisPackage.GIS_ADDRESS__COUNTRY:
				setCountry((String)newValue);
				return;
			case GisPackage.GIS_ADDRESS__STREET:
				setStreet((String)newValue);
				return;
			case GisPackage.GIS_ADDRESS__CITY:
				setCity((String)newValue);
				return;
			case GisPackage.GIS_ADDRESS__BUILDING_NUMBER:
				setBuildingNumber((String)newValue);
				return;
			case GisPackage.GIS_ADDRESS__POSTAL_CODE:
				setPostalCode((String)newValue);
				return;
			case GisPackage.GIS_ADDRESS__GEOCODED_ADDRESSES:
				getGeocodedAddresses().clear();
				getGeocodedAddresses().addAll((Collection<? extends GisAddressGeocoded>)newValue);
				return;
			case GisPackage.GIS_ADDRESS__SELECTED_GEOCODED_LOCATION:
				setSelectedGeocodedLocation((GisAddressGeocoded)newValue);
				return;
			case GisPackage.GIS_ADDRESS__GEOCODER:
				setGeocoder((GisAddressGeocoder)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case GisPackage.GIS_ADDRESS__COUNTRY:
				setCountry(COUNTRY_EDEFAULT);
				return;
			case GisPackage.GIS_ADDRESS__STREET:
				setStreet(STREET_EDEFAULT);
				return;
			case GisPackage.GIS_ADDRESS__CITY:
				setCity(CITY_EDEFAULT);
				return;
			case GisPackage.GIS_ADDRESS__BUILDING_NUMBER:
				setBuildingNumber(BUILDING_NUMBER_EDEFAULT);
				return;
			case GisPackage.GIS_ADDRESS__POSTAL_CODE:
				setPostalCode(POSTAL_CODE_EDEFAULT);
				return;
			case GisPackage.GIS_ADDRESS__GEOCODED_ADDRESSES:
				getGeocodedAddresses().clear();
				return;
			case GisPackage.GIS_ADDRESS__SELECTED_GEOCODED_LOCATION:
				setSelectedGeocodedLocation((GisAddressGeocoded)null);
				return;
			case GisPackage.GIS_ADDRESS__GEOCODER:
				setGeocoder((GisAddressGeocoder)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GisPackage.GIS_ADDRESS__COUNTRY:
				return COUNTRY_EDEFAULT == null ? country != null : !COUNTRY_EDEFAULT.equals(country);
			case GisPackage.GIS_ADDRESS__STREET:
				return STREET_EDEFAULT == null ? street != null : !STREET_EDEFAULT.equals(street);
			case GisPackage.GIS_ADDRESS__CITY:
				return CITY_EDEFAULT == null ? city != null : !CITY_EDEFAULT.equals(city);
			case GisPackage.GIS_ADDRESS__BUILDING_NUMBER:
				return BUILDING_NUMBER_EDEFAULT == null ? buildingNumber != null : !BUILDING_NUMBER_EDEFAULT.equals(buildingNumber);
			case GisPackage.GIS_ADDRESS__POSTAL_CODE:
				return POSTAL_CODE_EDEFAULT == null ? postalCode != null : !POSTAL_CODE_EDEFAULT.equals(postalCode);
			case GisPackage.GIS_ADDRESS__GEOCODED_ADDRESSES:
				return geocodedAddresses != null && !geocodedAddresses.isEmpty();
			case GisPackage.GIS_ADDRESS__SELECTED_GEOCODED_LOCATION:
				return selectedGeocodedLocation != null;
			case GisPackage.GIS_ADDRESS__GEOCODER:
				return geocoder != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case GisPackage.GIS_ADDRESS___GEOCODE:
				geocode();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (Country: ");
		result.append(country);
		result.append(", Street: ");
		result.append(street);
		result.append(", City: ");
		result.append(city);
		result.append(", BuildingNumber: ");
		result.append(buildingNumber);
		result.append(", PostalCode: ");
		result.append(postalCode);
		result.append(')');
		return result.toString();
	}

	@Override
	public GisCoordinates getCoordinates() {
		return this.getSelectedGeocodedLocation();
	}
	
	

} //GisAddressImpl
