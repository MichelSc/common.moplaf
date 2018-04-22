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

import com.misc.common.moplaf.gis.GisAddressGeocoded;
import com.misc.common.moplaf.gis.GisPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Address Geocoded</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.gis.impl.GisAddressGeocodedImpl#getScore <em>Score</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.impl.GisAddressGeocodedImpl#getAddressGeocoded <em>Address Geocoded</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GisAddressGeocodedImpl extends GisCoordinatesAbstractImpl implements GisAddressGeocoded {
	/**
	 * The default value of the '{@link #getScore() <em>Score</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScore()
	 * @generated
	 * @ordered
	 */
	protected static final float SCORE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getScore() <em>Score</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScore()
	 * @generated
	 * @ordered
	 */
	protected float score = SCORE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAddressGeocoded() <em>Address Geocoded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddressGeocoded()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDRESS_GEOCODED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAddressGeocoded() <em>Address Geocoded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddressGeocoded()
	 * @generated
	 * @ordered
	 */
	protected String addressGeocoded = ADDRESS_GEOCODED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GisAddressGeocodedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GisPackage.Literals.GIS_ADDRESS_GEOCODED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getScore() {
		return score;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScore(float newScore) {
		float oldScore = score;
		score = newScore;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GisPackage.GIS_ADDRESS_GEOCODED__SCORE, oldScore, score));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAddressGeocoded() {
		return addressGeocoded;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddressGeocoded(String newAddressGeocoded) {
		String oldAddressGeocoded = addressGeocoded;
		addressGeocoded = newAddressGeocoded;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GisPackage.GIS_ADDRESS_GEOCODED__ADDRESS_GEOCODED, oldAddressGeocoded, addressGeocoded));
	}

	public String getDescription() {
		String description = String.format("Geocoded %s", this.getAddressGeocoded());
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
			case GisPackage.GIS_ADDRESS_GEOCODED__SCORE:
				return getScore();
			case GisPackage.GIS_ADDRESS_GEOCODED__ADDRESS_GEOCODED:
				return getAddressGeocoded();
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
			case GisPackage.GIS_ADDRESS_GEOCODED__SCORE:
				setScore((Float)newValue);
				return;
			case GisPackage.GIS_ADDRESS_GEOCODED__ADDRESS_GEOCODED:
				setAddressGeocoded((String)newValue);
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
			case GisPackage.GIS_ADDRESS_GEOCODED__SCORE:
				setScore(SCORE_EDEFAULT);
				return;
			case GisPackage.GIS_ADDRESS_GEOCODED__ADDRESS_GEOCODED:
				setAddressGeocoded(ADDRESS_GEOCODED_EDEFAULT);
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
			case GisPackage.GIS_ADDRESS_GEOCODED__SCORE:
				return score != SCORE_EDEFAULT;
			case GisPackage.GIS_ADDRESS_GEOCODED__ADDRESS_GEOCODED:
				return ADDRESS_GEOCODED_EDEFAULT == null ? addressGeocoded != null : !ADDRESS_GEOCODED_EDEFAULT.equals(addressGeocoded);
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
		result.append(" (Score: ");
		result.append(score);
		result.append(", AddressGeocoded: ");
		result.append(addressGeocoded);
		result.append(')');
		return result.toString();
	}

} //GisAddressGeocodedImpl
