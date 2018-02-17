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
import com.misc.common.moplaf.gis.GisToolLocation;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

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
 *   <li>{@link com.misc.common.moplaf.gis.impl.GisAddressImpl#getGeocodedSelected <em>Geocoded Selected</em>}</li>
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
	 * The cached value of the '{@link #getGeocodedSelected() <em>Geocoded Selected</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeocodedSelected()
	 * @generated
	 * @ordered
	 */
	protected GisAddressGeocoded geocodedSelected;

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
	public GisAddressGeocoded getGeocodedSelected() {
		if (geocodedSelected != null && geocodedSelected.eIsProxy()) {
			InternalEObject oldGeocodedSelected = (InternalEObject)geocodedSelected;
			geocodedSelected = (GisAddressGeocoded)eResolveProxy(oldGeocodedSelected);
			if (geocodedSelected != oldGeocodedSelected) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GisPackage.GIS_ADDRESS__GEOCODED_SELECTED, oldGeocodedSelected, geocodedSelected));
			}
		}
		return geocodedSelected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GisAddressGeocoded basicGetGeocodedSelected() {
		return geocodedSelected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeocodedSelected(GisAddressGeocoded newGeocodedSelected) {
		GisAddressGeocoded oldGeocodedSelected = geocodedSelected;
		geocodedSelected = newGeocodedSelected;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GisPackage.GIS_ADDRESS__GEOCODED_SELECTED, oldGeocodedSelected, geocodedSelected));
	}

	@Override
	public EnabledFeedback addToolEnabled(GisToolLocation tool) {
		if ( tool instanceof GisAddressGeocoder ) {
			return EnabledFeedback.NOFEEDBACK;
		}
		EnabledFeedback enabled = super.addToolEnabled(tool);
		return enabled;
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GisPackage.GIS_ADDRESS__NAME:
				return getName();
			case GisPackage.GIS_ADDRESS__COUNTRY_CODE:
				return getCountryCode();
			case GisPackage.GIS_ADDRESS__GEOCODED_SELECTED:
				if (resolve) return getGeocodedSelected();
				return basicGetGeocodedSelected();
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
			case GisPackage.GIS_ADDRESS__GEOCODED_SELECTED:
				setGeocodedSelected((GisAddressGeocoded)newValue);
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
			case GisPackage.GIS_ADDRESS__GEOCODED_SELECTED:
				setGeocodedSelected((GisAddressGeocoded)null);
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
			case GisPackage.GIS_ADDRESS__GEOCODED_SELECTED:
				return geocodedSelected != null;
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
		result.append(" (Name: ");
		result.append(name);
		result.append(", CountryCode: ");
		result.append(countryCode);
		result.append(')');
		return result.toString();
	}

	@Override
	public GisCoordinatesAbstract getCoordinates() {
		return this.getGeocodedSelected();
	}
	

} //GisAddressImpl
