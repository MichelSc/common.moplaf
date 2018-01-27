/**
 */
package com.misc.common.moplaf.gis.impl;

import com.misc.common.moplaf.common.util.GisUtil;
import com.misc.common.moplaf.gis.GisCoordinatesAbstract;
import com.misc.common.moplaf.gis.GisFactory;
import com.misc.common.moplaf.gis.GisLocation;
import com.misc.common.moplaf.gis.GisPackage;
import com.misc.common.moplaf.gis.GisRouteInfo;
import com.misc.common.moplaf.gis.GisRouterGeodesic;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Router Geodesic</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.gis.impl.GisRouterGeodesicImpl#getSpeed <em>Speed</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.impl.GisRouterGeodesicImpl#getCorrection <em>Correction</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GisRouterGeodesicImpl extends GisRouteCalculatorOneToOneImpl implements GisRouterGeodesic {
	/**
	 * The default value of the '{@link #getSpeed() <em>Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeed()
	 * @generated
	 * @ordered
	 */
	protected static final double SPEED_EDEFAULT = 50.0;

	/**
	 * The cached value of the '{@link #getSpeed() <em>Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeed()
	 * @generated
	 * @ordered
	 */
	protected double speed = SPEED_EDEFAULT;

	/**
	 * The default value of the '{@link #getCorrection() <em>Correction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorrection()
	 * @generated
	 * @ordered
	 */
	protected static final double CORRECTION_EDEFAULT = 1.3;

	/**
	 * The cached value of the '{@link #getCorrection() <em>Correction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorrection()
	 * @generated
	 * @ordered
	 */
	protected double correction = CORRECTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GisRouterGeodesicImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GisPackage.Literals.GIS_ROUTER_GEODESIC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getSpeed() {
		return speed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpeed(double newSpeed) {
		double oldSpeed = speed;
		speed = newSpeed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GisPackage.GIS_ROUTER_GEODESIC__SPEED, oldSpeed, speed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCorrection() {
		return correction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCorrection(double newCorrection) {
		double oldCorrection = correction;
		correction = newCorrection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GisPackage.GIS_ROUTER_GEODESIC__CORRECTION, oldCorrection, correction));
	}
	
	/**
	 * 
	 */
	@Override
	protected GisRouteInfo getRouteImpl(GisLocation from, GisLocation to) {
		GisCoordinatesAbstract from_coordinates = from.getCoordinates();
		GisCoordinatesAbstract to_coordinates = to.getCoordinates();
		double distance = GisUtil.getDistance(
				from_coordinates.getLongitude(),
				from_coordinates.getLatitude(),
				to_coordinates.getLongitude(),
				to_coordinates.getLatitude());
		double distance_corrected = distance*this.getCorrection();
		double duration = distance_corrected/this.getSpeed();
		GisRouteInfo route_info = GisFactory.eINSTANCE.createGisRouteInfo();
		route_info.setFromLocation(from);
		route_info.setToLocation(to);
		route_info.setDistance(distance_corrected);
		route_info.setDuration(duration);
		return route_info;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GisPackage.GIS_ROUTER_GEODESIC__SPEED:
				return getSpeed();
			case GisPackage.GIS_ROUTER_GEODESIC__CORRECTION:
				return getCorrection();
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
			case GisPackage.GIS_ROUTER_GEODESIC__SPEED:
				setSpeed((Double)newValue);
				return;
			case GisPackage.GIS_ROUTER_GEODESIC__CORRECTION:
				setCorrection((Double)newValue);
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
			case GisPackage.GIS_ROUTER_GEODESIC__SPEED:
				setSpeed(SPEED_EDEFAULT);
				return;
			case GisPackage.GIS_ROUTER_GEODESIC__CORRECTION:
				setCorrection(CORRECTION_EDEFAULT);
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
			case GisPackage.GIS_ROUTER_GEODESIC__SPEED:
				return speed != SPEED_EDEFAULT;
			case GisPackage.GIS_ROUTER_GEODESIC__CORRECTION:
				return correction != CORRECTION_EDEFAULT;
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
		result.append(" (Speed: ");
		result.append(speed);
		result.append(", Correction: ");
		result.append(correction);
		result.append(')');
		return result.toString();
	}

} //GisRouterGeodesicImpl
