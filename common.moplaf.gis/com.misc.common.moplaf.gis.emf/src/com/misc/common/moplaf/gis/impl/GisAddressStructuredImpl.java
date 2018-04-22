/*******************************************************************************
 * Copyright (c) 2017, 2018 Michel Schaffers and others.
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

import com.misc.common.moplaf.gis.GisAddressStructured;
import com.misc.common.moplaf.gis.GisPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Address Structured</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.gis.impl.GisAddressStructuredImpl#getCountry <em>Country</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.impl.GisAddressStructuredImpl#getAdministrativeArea <em>Administrative Area</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.impl.GisAddressStructuredImpl#getLocality <em>Locality</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.impl.GisAddressStructuredImpl#getPostalCode <em>Postal Code</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.impl.GisAddressStructuredImpl#getStreet <em>Street</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.impl.GisAddressStructuredImpl#getBuildingNumber <em>Building Number</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GisAddressStructuredImpl extends GisAddressImpl implements GisAddressStructured {
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
	 * The default value of the '{@link #getAdministrativeArea() <em>Administrative Area</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdministrativeArea()
	 * @generated
	 * @ordered
	 */
	protected static final String ADMINISTRATIVE_AREA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAdministrativeArea() <em>Administrative Area</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdministrativeArea()
	 * @generated
	 * @ordered
	 */
	protected String administrativeArea = ADMINISTRATIVE_AREA_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocality() <em>Locality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocality()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCALITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocality() <em>Locality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocality()
	 * @generated
	 * @ordered
	 */
	protected String locality = LOCALITY_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GisAddressStructuredImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GisPackage.Literals.GIS_ADDRESS_STRUCTURED;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GisPackage.GIS_ADDRESS_STRUCTURED__COUNTRY, oldCountry, country));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAdministrativeArea() {
		return administrativeArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdministrativeArea(String newAdministrativeArea) {
		String oldAdministrativeArea = administrativeArea;
		administrativeArea = newAdministrativeArea;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GisPackage.GIS_ADDRESS_STRUCTURED__ADMINISTRATIVE_AREA, oldAdministrativeArea, administrativeArea));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GisPackage.GIS_ADDRESS_STRUCTURED__POSTAL_CODE, oldPostalCode, postalCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLocality() {
		return locality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocality(String newLocality) {
		String oldLocality = locality;
		locality = newLocality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GisPackage.GIS_ADDRESS_STRUCTURED__LOCALITY, oldLocality, locality));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GisPackage.GIS_ADDRESS_STRUCTURED__STREET, oldStreet, street));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GisPackage.GIS_ADDRESS_STRUCTURED__BUILDING_NUMBER, oldBuildingNumber, buildingNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GisPackage.GIS_ADDRESS_STRUCTURED__COUNTRY:
				return getCountry();
			case GisPackage.GIS_ADDRESS_STRUCTURED__ADMINISTRATIVE_AREA:
				return getAdministrativeArea();
			case GisPackage.GIS_ADDRESS_STRUCTURED__LOCALITY:
				return getLocality();
			case GisPackage.GIS_ADDRESS_STRUCTURED__POSTAL_CODE:
				return getPostalCode();
			case GisPackage.GIS_ADDRESS_STRUCTURED__STREET:
				return getStreet();
			case GisPackage.GIS_ADDRESS_STRUCTURED__BUILDING_NUMBER:
				return getBuildingNumber();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GisPackage.GIS_ADDRESS_STRUCTURED__COUNTRY:
				setCountry((String)newValue);
				return;
			case GisPackage.GIS_ADDRESS_STRUCTURED__ADMINISTRATIVE_AREA:
				setAdministrativeArea((String)newValue);
				return;
			case GisPackage.GIS_ADDRESS_STRUCTURED__LOCALITY:
				setLocality((String)newValue);
				return;
			case GisPackage.GIS_ADDRESS_STRUCTURED__POSTAL_CODE:
				setPostalCode((String)newValue);
				return;
			case GisPackage.GIS_ADDRESS_STRUCTURED__STREET:
				setStreet((String)newValue);
				return;
			case GisPackage.GIS_ADDRESS_STRUCTURED__BUILDING_NUMBER:
				setBuildingNumber((String)newValue);
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
			case GisPackage.GIS_ADDRESS_STRUCTURED__COUNTRY:
				setCountry(COUNTRY_EDEFAULT);
				return;
			case GisPackage.GIS_ADDRESS_STRUCTURED__ADMINISTRATIVE_AREA:
				setAdministrativeArea(ADMINISTRATIVE_AREA_EDEFAULT);
				return;
			case GisPackage.GIS_ADDRESS_STRUCTURED__LOCALITY:
				setLocality(LOCALITY_EDEFAULT);
				return;
			case GisPackage.GIS_ADDRESS_STRUCTURED__POSTAL_CODE:
				setPostalCode(POSTAL_CODE_EDEFAULT);
				return;
			case GisPackage.GIS_ADDRESS_STRUCTURED__STREET:
				setStreet(STREET_EDEFAULT);
				return;
			case GisPackage.GIS_ADDRESS_STRUCTURED__BUILDING_NUMBER:
				setBuildingNumber(BUILDING_NUMBER_EDEFAULT);
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
			case GisPackage.GIS_ADDRESS_STRUCTURED__COUNTRY:
				return COUNTRY_EDEFAULT == null ? country != null : !COUNTRY_EDEFAULT.equals(country);
			case GisPackage.GIS_ADDRESS_STRUCTURED__ADMINISTRATIVE_AREA:
				return ADMINISTRATIVE_AREA_EDEFAULT == null ? administrativeArea != null : !ADMINISTRATIVE_AREA_EDEFAULT.equals(administrativeArea);
			case GisPackage.GIS_ADDRESS_STRUCTURED__LOCALITY:
				return LOCALITY_EDEFAULT == null ? locality != null : !LOCALITY_EDEFAULT.equals(locality);
			case GisPackage.GIS_ADDRESS_STRUCTURED__POSTAL_CODE:
				return POSTAL_CODE_EDEFAULT == null ? postalCode != null : !POSTAL_CODE_EDEFAULT.equals(postalCode);
			case GisPackage.GIS_ADDRESS_STRUCTURED__STREET:
				return STREET_EDEFAULT == null ? street != null : !STREET_EDEFAULT.equals(street);
			case GisPackage.GIS_ADDRESS_STRUCTURED__BUILDING_NUMBER:
				return BUILDING_NUMBER_EDEFAULT == null ? buildingNumber != null : !BUILDING_NUMBER_EDEFAULT.equals(buildingNumber);
		}
		return super.eIsSet(featureID);
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
		result.append(", AdministrativeArea: ");
		result.append(administrativeArea);
		result.append(", Locality: ");
		result.append(locality);
		result.append(", PostalCode: ");
		result.append(postalCode);
		result.append(", Street: ");
		result.append(street);
		result.append(", BuildingNumber: ");
		result.append(buildingNumber);
		result.append(')');
		return result.toString();
	}

} //GisAddressStructuredImpl
