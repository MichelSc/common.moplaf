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

import com.misc.common.moplaf.gis.GisDistanceMatrixElement;
import com.misc.common.moplaf.gis.GisDistanceMatrixFromLocation;
import com.misc.common.moplaf.gis.GisDistanceMatrixToLocation;
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
 *   <li>{@link com.misc.common.moplaf.gis.impl.GisDistanceMatrixElementImpl#isCalculated <em>Calculated</em>}</li>
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
	protected GisDistanceMatrixToLocation toLocation;

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
	 * The default value of the '{@link #isCalculated() <em>Calculated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCalculated()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CALCULATED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCalculated() <em>Calculated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCalculated()
	 * @generated
	 * @ordered
	 */
	protected boolean calculated = CALCULATED_EDEFAULT;

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
	public GisDistanceMatrixFromLocation getFromLocation() {
		if (eContainerFeatureID() != GisPackage.GIS_DISTANCE_MATRIX_ELEMENT__FROM_LOCATION) return null;
		return (GisDistanceMatrixFromLocation)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFromLocation(GisDistanceMatrixFromLocation newFromLocation, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newFromLocation, GisPackage.GIS_DISTANCE_MATRIX_ELEMENT__FROM_LOCATION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromLocation(GisDistanceMatrixFromLocation newFromLocation) {
		if (newFromLocation != eInternalContainer() || (eContainerFeatureID() != GisPackage.GIS_DISTANCE_MATRIX_ELEMENT__FROM_LOCATION && newFromLocation != null)) {
			if (EcoreUtil.isAncestor(this, newFromLocation))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newFromLocation != null)
				msgs = ((InternalEObject)newFromLocation).eInverseAdd(this, GisPackage.GIS_DISTANCE_MATRIX_FROM_LOCATION__TO_LOCATIONS, GisDistanceMatrixFromLocation.class, msgs);
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
	public GisDistanceMatrixToLocation getToLocation() {
		if (toLocation != null && toLocation.eIsProxy()) {
			InternalEObject oldToLocation = (InternalEObject)toLocation;
			toLocation = (GisDistanceMatrixToLocation)eResolveProxy(oldToLocation);
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
	public GisDistanceMatrixToLocation basicGetToLocation() {
		return toLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetToLocation(GisDistanceMatrixToLocation newToLocation, NotificationChain msgs) {
		GisDistanceMatrixToLocation oldToLocation = toLocation;
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
	public void setToLocation(GisDistanceMatrixToLocation newToLocation) {
		if (newToLocation != toLocation) {
			NotificationChain msgs = null;
			if (toLocation != null)
				msgs = ((InternalEObject)toLocation).eInverseRemove(this, GisPackage.GIS_DISTANCE_MATRIX_TO_LOCATION__FROM_LOCATIONS, GisDistanceMatrixToLocation.class, msgs);
			if (newToLocation != null)
				msgs = ((InternalEObject)newToLocation).eInverseAdd(this, GisPackage.GIS_DISTANCE_MATRIX_TO_LOCATION__FROM_LOCATIONS, GisDistanceMatrixToLocation.class, msgs);
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
	public boolean isCalculated() {
		return calculated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCalculated(boolean newCalculated) {
		boolean oldCalculated = calculated;
		calculated = newCalculated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GisPackage.GIS_DISTANCE_MATRIX_ELEMENT__CALCULATED, oldCalculated, calculated));
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
				return basicSetFromLocation((GisDistanceMatrixFromLocation)otherEnd, msgs);
			case GisPackage.GIS_DISTANCE_MATRIX_ELEMENT__TO_LOCATION:
				if (toLocation != null)
					msgs = ((InternalEObject)toLocation).eInverseRemove(this, GisPackage.GIS_DISTANCE_MATRIX_TO_LOCATION__FROM_LOCATIONS, GisDistanceMatrixToLocation.class, msgs);
				return basicSetToLocation((GisDistanceMatrixToLocation)otherEnd, msgs);
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
				return eInternalContainer().eInverseRemove(this, GisPackage.GIS_DISTANCE_MATRIX_FROM_LOCATION__TO_LOCATIONS, GisDistanceMatrixFromLocation.class, msgs);
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
			case GisPackage.GIS_DISTANCE_MATRIX_ELEMENT__CALCULATED:
				return isCalculated();
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
				setFromLocation((GisDistanceMatrixFromLocation)newValue);
				return;
			case GisPackage.GIS_DISTANCE_MATRIX_ELEMENT__TO_LOCATION:
				setToLocation((GisDistanceMatrixToLocation)newValue);
				return;
			case GisPackage.GIS_DISTANCE_MATRIX_ELEMENT__DISTANCE:
				setDistance((Float)newValue);
				return;
			case GisPackage.GIS_DISTANCE_MATRIX_ELEMENT__DURATION:
				setDuration((Float)newValue);
				return;
			case GisPackage.GIS_DISTANCE_MATRIX_ELEMENT__CALCULATED:
				setCalculated((Boolean)newValue);
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
				setFromLocation((GisDistanceMatrixFromLocation)null);
				return;
			case GisPackage.GIS_DISTANCE_MATRIX_ELEMENT__TO_LOCATION:
				setToLocation((GisDistanceMatrixToLocation)null);
				return;
			case GisPackage.GIS_DISTANCE_MATRIX_ELEMENT__DISTANCE:
				setDistance(DISTANCE_EDEFAULT);
				return;
			case GisPackage.GIS_DISTANCE_MATRIX_ELEMENT__DURATION:
				setDuration(DURATION_EDEFAULT);
				return;
			case GisPackage.GIS_DISTANCE_MATRIX_ELEMENT__CALCULATED:
				setCalculated(CALCULATED_EDEFAULT);
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
			case GisPackage.GIS_DISTANCE_MATRIX_ELEMENT__CALCULATED:
				return calculated != CALCULATED_EDEFAULT;
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
		result.append(", Calculated: ");
		result.append(calculated);
		result.append(')');
		return result.toString();
	}

} //GisDistanceMatrixElementImpl
