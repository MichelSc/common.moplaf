/**
 */
package com.misc.common.moplaf.gis.impl;

import com.misc.common.moplaf.gis.GisLocationPinpointed;
import com.misc.common.moplaf.gis.GisPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Location Pinpointed</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.gis.impl.GisLocationPinpointedImpl#getDistance <em>Distance</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.impl.GisLocationPinpointedImpl#getLocationPinpointed <em>Location Pinpointed</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GisLocationPinpointedImpl extends GisCoordinatesAbstractImpl implements GisLocationPinpointed {
	/**
	 * The default value of the '{@link #getDistance() <em>Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistance()
	 * @generated
	 * @ordered
	 */
	protected static final float DISTANCE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getDistance() <em>Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistance()
	 * @generated
	 * @ordered
	 */
	protected float distance = DISTANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocationPinpointed() <em>Location Pinpointed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationPinpointed()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCATION_PINPOINTED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocationPinpointed() <em>Location Pinpointed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationPinpointed()
	 * @generated
	 * @ordered
	 */
	protected String locationPinpointed = LOCATION_PINPOINTED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GisLocationPinpointedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GisPackage.Literals.GIS_LOCATION_PINPOINTED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getDistance() {
		return distance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDistance(float newDistance) {
		float oldDistance = distance;
		distance = newDistance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GisPackage.GIS_LOCATION_PINPOINTED__DISTANCE, oldDistance, distance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLocationPinpointed() {
		return locationPinpointed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocationPinpointed(String newLocationPinpointed) {
		String oldLocationPinpointed = locationPinpointed;
		locationPinpointed = newLocationPinpointed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GisPackage.GIS_LOCATION_PINPOINTED__LOCATION_PINPOINTED, oldLocationPinpointed, locationPinpointed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GisPackage.GIS_LOCATION_PINPOINTED__DISTANCE:
				return getDistance();
			case GisPackage.GIS_LOCATION_PINPOINTED__LOCATION_PINPOINTED:
				return getLocationPinpointed();
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
			case GisPackage.GIS_LOCATION_PINPOINTED__DISTANCE:
				setDistance((Float)newValue);
				return;
			case GisPackage.GIS_LOCATION_PINPOINTED__LOCATION_PINPOINTED:
				setLocationPinpointed((String)newValue);
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
			case GisPackage.GIS_LOCATION_PINPOINTED__DISTANCE:
				setDistance(DISTANCE_EDEFAULT);
				return;
			case GisPackage.GIS_LOCATION_PINPOINTED__LOCATION_PINPOINTED:
				setLocationPinpointed(LOCATION_PINPOINTED_EDEFAULT);
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
			case GisPackage.GIS_LOCATION_PINPOINTED__DISTANCE:
				return distance != DISTANCE_EDEFAULT;
			case GisPackage.GIS_LOCATION_PINPOINTED__LOCATION_PINPOINTED:
				return LOCATION_PINPOINTED_EDEFAULT == null ? locationPinpointed != null : !LOCATION_PINPOINTED_EDEFAULT.equals(locationPinpointed);
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
		result.append(" (Distance: ");
		result.append(distance);
		result.append(", LocationPinpointed: ");
		result.append(locationPinpointed);
		result.append(')');
		return result.toString();
	}

} //GisLocationPinpointedImpl
