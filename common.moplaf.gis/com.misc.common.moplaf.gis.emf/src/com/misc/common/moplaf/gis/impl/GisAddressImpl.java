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
package com.misc.common.moplaf.gis.impl;

import com.misc.common.moplaf.common.EnabledFeedback;
import com.misc.common.moplaf.gis.GisAddress;
import com.misc.common.moplaf.gis.GisAddressGeocoded;
import com.misc.common.moplaf.gis.GisAddressGeocoder;
import com.misc.common.moplaf.gis.GisCoordinatesAbstract;
import com.misc.common.moplaf.gis.GisPackage;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Address</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.gis.impl.GisAddressImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.impl.GisAddressImpl#getCountryCode <em>Country Code</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.impl.GisAddressImpl#getGeocodedAddresses <em>Geocoded Addresses</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.impl.GisAddressImpl#getSelectedGeocodedLocation <em>Selected Geocoded Location</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.impl.GisAddressImpl#getGeocoder <em>Geocoder</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.impl.GisAddressImpl#getGeocodingFeedback <em>Geocoding Feedback</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.impl.GisAddressImpl#getRefreshFeedback <em>Refresh Feedback</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class GisAddressImpl extends GisLocationImpl implements GisAddress {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCountryCode() <em>Country Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountryCode()
	 * @generated
	 * @ordered
	 */
	protected static final String COUNTRY_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCountryCode() <em>Country Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountryCode()
	 * @generated
	 * @ordered
	 */
	protected String countryCode = COUNTRY_CODE_EDEFAULT;

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
	 * The default value of the '{@link #getGeocodingFeedback() <em>Geocoding Feedback</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeocodingFeedback()
	 * @generated
	 * @ordered
	 */
	protected static final String GEOCODING_FEEDBACK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGeocodingFeedback() <em>Geocoding Feedback</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeocodingFeedback()
	 * @generated
	 * @ordered
	 */
	protected String geocodingFeedback = GEOCODING_FEEDBACK_EDEFAULT;

	/**
	 * The default value of the '{@link #getRefreshFeedback() <em>Refresh Feedback</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefreshFeedback()
	 * @generated
	 * @ordered
	 */
	protected static final EnabledFeedback REFRESH_FEEDBACK_EDEFAULT = null;

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
	public String getCountryCode() {
		return countryCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCountryCode(String newCountryCode) {
		String oldCountryCode = countryCode;
		countryCode = newCountryCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GisPackage.GIS_ADDRESS__COUNTRY_CODE, oldCountryCode, countryCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GisAddressGeocoded> getGeocodedAddresses() {
		if (geocodedAddresses == null) {
			geocodedAddresses = new EObjectContainmentWithInverseEList<GisAddressGeocoded>(GisAddressGeocoded.class, this, GisPackage.GIS_ADDRESS__GEOCODED_ADDRESSES, GisPackage.GIS_ADDRESS_GEOCODED__ADDRESS);
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
	public String getGeocodingFeedback() {
		return geocodingFeedback;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeocodingFeedback(String newGeocodingFeedback) {
		String oldGeocodingFeedback = geocodingFeedback;
		geocodingFeedback = newGeocodingFeedback;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GisPackage.GIS_ADDRESS__GEOCODING_FEEDBACK, oldGeocodingFeedback, geocodingFeedback));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnabledFeedback getRefreshFeedback() {
		// TODO: implement this method to return the 'Refresh Feedback' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GisPackage.GIS_ADDRESS__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void refreshGeocoded() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void geocode() {
		if ( this.getGeocoder()==null){
			return;
		}
		this.getGeocoder().geocode(this);
		if ( this.getGeocodedAddresses().size()>0 ){
			GisAddressGeocoded selected = this.getGeocodedAddresses().get(0);
			this.setSelectedGeocodedLocation(selected);
		}
	}

	public String getDescription() {
		String description = String.format("Address %s", this.getName());
		return description;
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
			case GisPackage.GIS_ADDRESS__NAME:
				return getName();
			case GisPackage.GIS_ADDRESS__COUNTRY_CODE:
				return getCountryCode();
			case GisPackage.GIS_ADDRESS__GEOCODED_ADDRESSES:
				return getGeocodedAddresses();
			case GisPackage.GIS_ADDRESS__SELECTED_GEOCODED_LOCATION:
				if (resolve) return getSelectedGeocodedLocation();
				return basicGetSelectedGeocodedLocation();
			case GisPackage.GIS_ADDRESS__GEOCODER:
				if (resolve) return getGeocoder();
				return basicGetGeocoder();
			case GisPackage.GIS_ADDRESS__GEOCODING_FEEDBACK:
				return getGeocodingFeedback();
			case GisPackage.GIS_ADDRESS__REFRESH_FEEDBACK:
				return getRefreshFeedback();
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
			case GisPackage.GIS_ADDRESS__NAME:
				setName((String)newValue);
				return;
			case GisPackage.GIS_ADDRESS__COUNTRY_CODE:
				setCountryCode((String)newValue);
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
			case GisPackage.GIS_ADDRESS__GEOCODING_FEEDBACK:
				setGeocodingFeedback((String)newValue);
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
			case GisPackage.GIS_ADDRESS__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GisPackage.GIS_ADDRESS__COUNTRY_CODE:
				setCountryCode(COUNTRY_CODE_EDEFAULT);
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
			case GisPackage.GIS_ADDRESS__GEOCODING_FEEDBACK:
				setGeocodingFeedback(GEOCODING_FEEDBACK_EDEFAULT);
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
			case GisPackage.GIS_ADDRESS__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GisPackage.GIS_ADDRESS__COUNTRY_CODE:
				return COUNTRY_CODE_EDEFAULT == null ? countryCode != null : !COUNTRY_CODE_EDEFAULT.equals(countryCode);
			case GisPackage.GIS_ADDRESS__GEOCODED_ADDRESSES:
				return geocodedAddresses != null && !geocodedAddresses.isEmpty();
			case GisPackage.GIS_ADDRESS__SELECTED_GEOCODED_LOCATION:
				return selectedGeocodedLocation != null;
			case GisPackage.GIS_ADDRESS__GEOCODER:
				return geocoder != null;
			case GisPackage.GIS_ADDRESS__GEOCODING_FEEDBACK:
				return GEOCODING_FEEDBACK_EDEFAULT == null ? geocodingFeedback != null : !GEOCODING_FEEDBACK_EDEFAULT.equals(geocodingFeedback);
			case GisPackage.GIS_ADDRESS__REFRESH_FEEDBACK:
				return REFRESH_FEEDBACK_EDEFAULT == null ? getRefreshFeedback() != null : !REFRESH_FEEDBACK_EDEFAULT.equals(getRefreshFeedback());
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
			case GisPackage.GIS_ADDRESS___REFRESH_GEOCODED:
				refreshGeocoded();
				return null;
			case GisPackage.GIS_ADDRESS___FLUSH_GEOCODED:
				flushGeocoded();
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
		result.append(" (Name: ");
		result.append(name);
		result.append(", CountryCode: ");
		result.append(countryCode);
		result.append(", GeocodingFeedback: ");
		result.append(geocodingFeedback);
		result.append(')');
		return result.toString();
	}

	@Override
	public GisCoordinatesAbstract getCoordinates() {
		return this.getSelectedGeocodedLocation();
	}
	
	public void flushGeocoded(){
		while (!this.getGeocodedAddresses().isEmpty() ){
			EcoreUtil.delete(this.getGeocodedAddresses().get(0));
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GisPackage.GIS_ADDRESS__GEOCODED_ADDRESSES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGeocodedAddresses()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}
	
	

} //GisAddressImpl
