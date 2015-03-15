/**
 */
package com.misc.common.moplaf.gis.impl;

import com.misc.common.moplaf.gis.GisDistanceFromLocation;
import com.misc.common.moplaf.gis.GisDistanceMatrixElement;
import com.misc.common.moplaf.gis.GisDistanceToLocation;
import com.misc.common.moplaf.gis.GisPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Distance Matrix Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.misc.common.moplaf.gis.impl.GisDistanceMatrixElementImpl#getFromLocation <em>From Location</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.impl.GisDistanceMatrixElementImpl#getToLocation <em>To Location</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.impl.GisDistanceMatrixElementImpl#getDistance <em>Distance</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.impl.GisDistanceMatrixElementImpl#getDuration <em>Duration</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GisDistanceMatrixElementImpl extends MinimalEObjectImpl.Container implements GisDistanceMatrixElement {
	/**
	 * The cached value of the '{@link #getToLocation() <em>To Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToLocation()
	 * @generated
	 * @ordered
	 */
	protected GisDistanceToLocation toLocation;

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
	 * The default value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected static final float DURATION_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected float duration = DURATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GisDistanceMatrixElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GisPackage.Literals.GIS_DISTANCE_MATRIX_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GisDistanceFromLocation getFromLocation() {
		if (eContainerFeatureID() != GisPackage.GIS_DISTANCE_MATRIX_ELEMENT__FROM_LOCATION) return null;
		return (GisDistanceFromLocation)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFromLocation(GisDistanceFromLocation newFromLocation, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newFromLocation, GisPackage.GIS_DISTANCE_MATRIX_ELEMENT__FROM_LOCATION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromLocation(GisDistanceFromLocation newFromLocation) {
		if (newFromLocation != eInternalContainer() || (eContainerFeatureID() != GisPackage.GIS_DISTANCE_MATRIX_ELEMENT__FROM_LOCATION && newFromLocation != null)) {
			if (EcoreUtil.isAncestor(this, newFromLocation))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newFromLocation != null)
				msgs = ((InternalEObject)newFromLocation).eInverseAdd(this, GisPackage.GIS_DISTANCE_FROM_LOCATION__TO_LOCATIONS, GisDistanceFromLocation.class, msgs);
			msgs = basicSetFromLocation(newFromLocation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GisPackage.GIS_DISTANCE_MATRIX_ELEMENT__FROM_LOCATION, newFromLocation, newFromLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GisDistanceToLocation getToLocation() {
		if (toLocation != null && toLocation.eIsProxy()) {
			InternalEObject oldToLocation = (InternalEObject)toLocation;
			toLocation = (GisDistanceToLocation)eResolveProxy(oldToLocation);
			if (toLocation != oldToLocation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GisPackage.GIS_DISTANCE_MATRIX_ELEMENT__TO_LOCATION, oldToLocation, toLocation));
			}
		}
		return toLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GisDistanceToLocation basicGetToLocation() {
		return toLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetToLocation(GisDistanceToLocation newToLocation, NotificationChain msgs) {
		GisDistanceToLocation oldToLocation = toLocation;
		toLocation = newToLocation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GisPackage.GIS_DISTANCE_MATRIX_ELEMENT__TO_LOCATION, oldToLocation, newToLocation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToLocation(GisDistanceToLocation newToLocation) {
		if (newToLocation != toLocation) {
			NotificationChain msgs = null;
			if (toLocation != null)
				msgs = ((InternalEObject)toLocation).eInverseRemove(this, GisPackage.GIS_DISTANCE_TO_LOCATION__FROM_LOCATIONS, GisDistanceToLocation.class, msgs);
			if (newToLocation != null)
				msgs = ((InternalEObject)newToLocation).eInverseAdd(this, GisPackage.GIS_DISTANCE_TO_LOCATION__FROM_LOCATIONS, GisDistanceToLocation.class, msgs);
			msgs = basicSetToLocation(newToLocation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GisPackage.GIS_DISTANCE_MATRIX_ELEMENT__TO_LOCATION, newToLocation, newToLocation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GisPackage.GIS_DISTANCE_MATRIX_ELEMENT__DISTANCE, oldDistance, distance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getDuration() {
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDuration(float newDuration) {
		float oldDuration = duration;
		duration = newDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GisPackage.GIS_DISTANCE_MATRIX_ELEMENT__DURATION, oldDuration, duration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GisPackage.GIS_DISTANCE_MATRIX_ELEMENT__FROM_LOCATION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetFromLocation((GisDistanceFromLocation)otherEnd, msgs);
			case GisPackage.GIS_DISTANCE_MATRIX_ELEMENT__TO_LOCATION:
				if (toLocation != null)
					msgs = ((InternalEObject)toLocation).eInverseRemove(this, GisPackage.GIS_DISTANCE_TO_LOCATION__FROM_LOCATIONS, GisDistanceToLocation.class, msgs);
				return basicSetToLocation((GisDistanceToLocation)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GisPackage.GIS_DISTANCE_MATRIX_ELEMENT__FROM_LOCATION:
				return basicSetFromLocation(null, msgs);
			case GisPackage.GIS_DISTANCE_MATRIX_ELEMENT__TO_LOCATION:
				return basicSetToLocation(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case GisPackage.GIS_DISTANCE_MATRIX_ELEMENT__FROM_LOCATION:
				return eInternalContainer().eInverseRemove(this, GisPackage.GIS_DISTANCE_FROM_LOCATION__TO_LOCATIONS, GisDistanceFromLocation.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GisPackage.GIS_DISTANCE_MATRIX_ELEMENT__FROM_LOCATION:
				return getFromLocation();
			case GisPackage.GIS_DISTANCE_MATRIX_ELEMENT__TO_LOCATION:
				if (resolve) return getToLocation();
				return basicGetToLocation();
			case GisPackage.GIS_DISTANCE_MATRIX_ELEMENT__DISTANCE:
				return getDistance();
			case GisPackage.GIS_DISTANCE_MATRIX_ELEMENT__DURATION:
				return getDuration();
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
			case GisPackage.GIS_DISTANCE_MATRIX_ELEMENT__FROM_LOCATION:
				setFromLocation((GisDistanceFromLocation)newValue);
				return;
			case GisPackage.GIS_DISTANCE_MATRIX_ELEMENT__TO_LOCATION:
				setToLocation((GisDistanceToLocation)newValue);
				return;
			case GisPackage.GIS_DISTANCE_MATRIX_ELEMENT__DISTANCE:
				setDistance((Float)newValue);
				return;
			case GisPackage.GIS_DISTANCE_MATRIX_ELEMENT__DURATION:
				setDuration((Float)newValue);
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
			case GisPackage.GIS_DISTANCE_MATRIX_ELEMENT__FROM_LOCATION:
				setFromLocation((GisDistanceFromLocation)null);
				return;
			case GisPackage.GIS_DISTANCE_MATRIX_ELEMENT__TO_LOCATION:
				setToLocation((GisDistanceToLocation)null);
				return;
			case GisPackage.GIS_DISTANCE_MATRIX_ELEMENT__DISTANCE:
				setDistance(DISTANCE_EDEFAULT);
				return;
			case GisPackage.GIS_DISTANCE_MATRIX_ELEMENT__DURATION:
				setDuration(DURATION_EDEFAULT);
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
			case GisPackage.GIS_DISTANCE_MATRIX_ELEMENT__FROM_LOCATION:
				return getFromLocation() != null;
			case GisPackage.GIS_DISTANCE_MATRIX_ELEMENT__TO_LOCATION:
				return toLocation != null;
			case GisPackage.GIS_DISTANCE_MATRIX_ELEMENT__DISTANCE:
				return distance != DISTANCE_EDEFAULT;
			case GisPackage.GIS_DISTANCE_MATRIX_ELEMENT__DURATION:
				return duration != DURATION_EDEFAULT;
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

} //GisDistanceMatrixElementImpl
