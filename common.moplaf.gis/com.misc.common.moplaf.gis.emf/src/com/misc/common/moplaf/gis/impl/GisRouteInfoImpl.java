/**
 */
package com.misc.common.moplaf.gis.impl;

import com.misc.common.moplaf.gis.GisLocation;
import com.misc.common.moplaf.gis.GisPackage;
import com.misc.common.moplaf.gis.GisRouteInfo;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Route Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.gis.impl.GisRouteInfoImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.impl.GisRouteInfoImpl#getFromLocation <em>From Location</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.impl.GisRouteInfoImpl#getDistance <em>Distance</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.impl.GisRouteInfoImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.impl.GisRouteInfoImpl#getToLocation <em>To Location</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.impl.GisRouteInfoImpl#getGeometry <em>Geometry</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GisRouteInfoImpl extends MinimalEObjectImpl.Container implements GisRouteInfo {
	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFromLocation() <em>From Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromLocation()
	 * @generated
	 * @ordered
	 */
	protected GisLocation fromLocation;

	/**
	 * The default value of the '{@link #getDistance() <em>Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistance()
	 * @generated
	 * @ordered
	 */
	protected static final double DISTANCE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDistance() <em>Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistance()
	 * @generated
	 * @ordered
	 */
	protected double distance = DISTANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected static final double DURATION_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected double duration = DURATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getToLocation() <em>To Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToLocation()
	 * @generated
	 * @ordered
	 */
	protected GisLocation toLocation;

	/**
	 * The cached value of the '{@link #getGeometry() <em>Geometry</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeometry()
	 * @generated
	 * @ordered
	 */
	protected EList<GisLocation> geometry;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GisRouteInfoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GisPackage.Literals.GIS_ROUTE_INFO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public String getDescription() {
        String description = String.format("(distance= %f, duration= %f)", this.getDistance(), this.getDuration());
        return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GisLocation getFromLocation() {
		if (fromLocation != null && fromLocation.eIsProxy()) {
			InternalEObject oldFromLocation = (InternalEObject)fromLocation;
			fromLocation = (GisLocation)eResolveProxy(oldFromLocation);
			if (fromLocation != oldFromLocation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GisPackage.GIS_ROUTE_INFO__FROM_LOCATION, oldFromLocation, fromLocation));
			}
		}
		return fromLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GisLocation basicGetFromLocation() {
		return fromLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromLocation(GisLocation newFromLocation) {
		GisLocation oldFromLocation = fromLocation;
		fromLocation = newFromLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GisPackage.GIS_ROUTE_INFO__FROM_LOCATION, oldFromLocation, fromLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getDistance() {
		return distance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDistance(double newDistance) {
		double oldDistance = distance;
		distance = newDistance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GisPackage.GIS_ROUTE_INFO__DISTANCE, oldDistance, distance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getDuration() {
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDuration(double newDuration) {
		double oldDuration = duration;
		duration = newDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GisPackage.GIS_ROUTE_INFO__DURATION, oldDuration, duration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GisLocation getToLocation() {
		if (toLocation != null && toLocation.eIsProxy()) {
			InternalEObject oldToLocation = (InternalEObject)toLocation;
			toLocation = (GisLocation)eResolveProxy(oldToLocation);
			if (toLocation != oldToLocation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GisPackage.GIS_ROUTE_INFO__TO_LOCATION, oldToLocation, toLocation));
			}
		}
		return toLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GisLocation basicGetToLocation() {
		return toLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToLocation(GisLocation newToLocation) {
		GisLocation oldToLocation = toLocation;
		toLocation = newToLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GisPackage.GIS_ROUTE_INFO__TO_LOCATION, oldToLocation, toLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GisLocation> getGeometry() {
		if (geometry == null) {
			geometry = new EObjectResolvingEList<GisLocation>(GisLocation.class, this, GisPackage.GIS_ROUTE_INFO__GEOMETRY);
		}
		return geometry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GisPackage.GIS_ROUTE_INFO__DESCRIPTION:
				return getDescription();
			case GisPackage.GIS_ROUTE_INFO__FROM_LOCATION:
				if (resolve) return getFromLocation();
				return basicGetFromLocation();
			case GisPackage.GIS_ROUTE_INFO__DISTANCE:
				return getDistance();
			case GisPackage.GIS_ROUTE_INFO__DURATION:
				return getDuration();
			case GisPackage.GIS_ROUTE_INFO__TO_LOCATION:
				if (resolve) return getToLocation();
				return basicGetToLocation();
			case GisPackage.GIS_ROUTE_INFO__GEOMETRY:
				return getGeometry();
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
			case GisPackage.GIS_ROUTE_INFO__FROM_LOCATION:
				setFromLocation((GisLocation)newValue);
				return;
			case GisPackage.GIS_ROUTE_INFO__DISTANCE:
				setDistance((Double)newValue);
				return;
			case GisPackage.GIS_ROUTE_INFO__DURATION:
				setDuration((Double)newValue);
				return;
			case GisPackage.GIS_ROUTE_INFO__TO_LOCATION:
				setToLocation((GisLocation)newValue);
				return;
			case GisPackage.GIS_ROUTE_INFO__GEOMETRY:
				getGeometry().clear();
				getGeometry().addAll((Collection<? extends GisLocation>)newValue);
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
			case GisPackage.GIS_ROUTE_INFO__FROM_LOCATION:
				setFromLocation((GisLocation)null);
				return;
			case GisPackage.GIS_ROUTE_INFO__DISTANCE:
				setDistance(DISTANCE_EDEFAULT);
				return;
			case GisPackage.GIS_ROUTE_INFO__DURATION:
				setDuration(DURATION_EDEFAULT);
				return;
			case GisPackage.GIS_ROUTE_INFO__TO_LOCATION:
				setToLocation((GisLocation)null);
				return;
			case GisPackage.GIS_ROUTE_INFO__GEOMETRY:
				getGeometry().clear();
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
			case GisPackage.GIS_ROUTE_INFO__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? getDescription() != null : !DESCRIPTION_EDEFAULT.equals(getDescription());
			case GisPackage.GIS_ROUTE_INFO__FROM_LOCATION:
				return fromLocation != null;
			case GisPackage.GIS_ROUTE_INFO__DISTANCE:
				return distance != DISTANCE_EDEFAULT;
			case GisPackage.GIS_ROUTE_INFO__DURATION:
				return duration != DURATION_EDEFAULT;
			case GisPackage.GIS_ROUTE_INFO__TO_LOCATION:
				return toLocation != null;
			case GisPackage.GIS_ROUTE_INFO__GEOMETRY:
				return geometry != null && !geometry.isEmpty();
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
		result.append(", Duration: ");
		result.append(duration);
		result.append(')');
		return result.toString();
	}

} //GisRouteInfoImpl
