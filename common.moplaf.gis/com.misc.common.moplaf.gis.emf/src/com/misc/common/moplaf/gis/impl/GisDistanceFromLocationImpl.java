/**
 */
package com.misc.common.moplaf.gis.impl;

import com.misc.common.moplaf.gis.GisDistanceFromLocation;
import com.misc.common.moplaf.gis.GisDistanceMatrixElement;
import com.misc.common.moplaf.gis.GisLocation;
import com.misc.common.moplaf.gis.GisPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Distance From Location</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.misc.common.moplaf.gis.impl.GisDistanceFromLocationImpl#getToLocations <em>To Locations</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.impl.GisDistanceFromLocationImpl#getLocation <em>Location</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GisDistanceFromLocationImpl extends MinimalEObjectImpl.Container implements GisDistanceFromLocation {
	/**
	 * The cached value of the '{@link #getToLocations() <em>To Locations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToLocations()
	 * @generated
	 * @ordered
	 */
	protected EList<GisDistanceMatrixElement> toLocations;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected GisLocation location;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GisDistanceFromLocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GisPackage.Literals.GIS_DISTANCE_FROM_LOCATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GisDistanceMatrixElement> getToLocations() {
		if (toLocations == null) {
			toLocations = new EObjectContainmentWithInverseEList<GisDistanceMatrixElement>(GisDistanceMatrixElement.class, this, GisPackage.GIS_DISTANCE_FROM_LOCATION__TO_LOCATIONS, GisPackage.GIS_DISTANCE_MATRIX_ELEMENT__FROM_LOCATION);
		}
		return toLocations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GisLocation getLocation() {
		if (location != null && location.eIsProxy()) {
			InternalEObject oldLocation = (InternalEObject)location;
			location = (GisLocation)eResolveProxy(oldLocation);
			if (location != oldLocation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GisPackage.GIS_DISTANCE_FROM_LOCATION__LOCATION, oldLocation, location));
			}
		}
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GisLocation basicGetLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(GisLocation newLocation) {
		GisLocation oldLocation = location;
		location = newLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GisPackage.GIS_DISTANCE_FROM_LOCATION__LOCATION, oldLocation, location));
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
			case GisPackage.GIS_DISTANCE_FROM_LOCATION__TO_LOCATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getToLocations()).basicAdd(otherEnd, msgs);
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
			case GisPackage.GIS_DISTANCE_FROM_LOCATION__TO_LOCATIONS:
				return ((InternalEList<?>)getToLocations()).basicRemove(otherEnd, msgs);
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
			case GisPackage.GIS_DISTANCE_FROM_LOCATION__TO_LOCATIONS:
				return getToLocations();
			case GisPackage.GIS_DISTANCE_FROM_LOCATION__LOCATION:
				if (resolve) return getLocation();
				return basicGetLocation();
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
			case GisPackage.GIS_DISTANCE_FROM_LOCATION__TO_LOCATIONS:
				getToLocations().clear();
				getToLocations().addAll((Collection<? extends GisDistanceMatrixElement>)newValue);
				return;
			case GisPackage.GIS_DISTANCE_FROM_LOCATION__LOCATION:
				setLocation((GisLocation)newValue);
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
			case GisPackage.GIS_DISTANCE_FROM_LOCATION__TO_LOCATIONS:
				getToLocations().clear();
				return;
			case GisPackage.GIS_DISTANCE_FROM_LOCATION__LOCATION:
				setLocation((GisLocation)null);
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
			case GisPackage.GIS_DISTANCE_FROM_LOCATION__TO_LOCATIONS:
				return toLocations != null && !toLocations.isEmpty();
			case GisPackage.GIS_DISTANCE_FROM_LOCATION__LOCATION:
				return location != null;
		}
		return super.eIsSet(featureID);
	}

} //GisDistanceFromLocationImpl
