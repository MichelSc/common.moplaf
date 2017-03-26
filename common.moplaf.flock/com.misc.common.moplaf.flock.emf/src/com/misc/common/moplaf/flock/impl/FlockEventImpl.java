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
package com.misc.common.moplaf.flock.impl;

import com.misc.common.moplaf.flock.Flock;
import com.misc.common.moplaf.flock.FlockEvent;
import com.misc.common.moplaf.flock.FlockPackage;
import com.misc.common.moplaf.flock.Location;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.misc.common.moplaf.flock.impl.FlockEventImpl#getTime <em>Time</em>}</li>
 *   <li>{@link com.misc.common.moplaf.flock.impl.FlockEventImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link com.misc.common.moplaf.flock.impl.FlockEventImpl#getFlockAsStart <em>Flock As Start</em>}</li>
 *   <li>{@link com.misc.common.moplaf.flock.impl.FlockEventImpl#getFlockAsEnd <em>Flock As End</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FlockEventImpl extends MinimalEObjectImpl.Container implements FlockEvent {
	/**
	 * The default value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected Date time = TIME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected Location location;

	/**
	 * The cached value of the '{@link #getFlockAsStart() <em>Flock As Start</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlockAsStart()
	 * @generated
	 * @ordered
	 */
	protected EList<Flock> flockAsStart;

	/**
	 * The cached value of the '{@link #getFlockAsEnd() <em>Flock As End</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlockAsEnd()
	 * @generated
	 * @ordered
	 */
	protected EList<Flock> flockAsEnd;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlockEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FlockPackage.Literals.FLOCK_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getTime() {
		return time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTime(Date newTime) {
		Date oldTime = time;
		time = newTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FlockPackage.FLOCK_EVENT__TIME, oldTime, time));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location getLocation() {
		if (location != null && location.eIsProxy()) {
			InternalEObject oldLocation = (InternalEObject)location;
			location = (Location)eResolveProxy(oldLocation);
			if (location != oldLocation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FlockPackage.FLOCK_EVENT__LOCATION, oldLocation, location));
			}
		}
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location basicGetLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(Location newLocation) {
		Location oldLocation = location;
		location = newLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FlockPackage.FLOCK_EVENT__LOCATION, oldLocation, location));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Flock> getFlockAsStart() {
		if (flockAsStart == null) {
			flockAsStart = new EObjectWithInverseResolvingEList<Flock>(Flock.class, this, FlockPackage.FLOCK_EVENT__FLOCK_AS_START, FlockPackage.FLOCK__START_EVENT);
		}
		return flockAsStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Flock> getFlockAsEnd() {
		if (flockAsEnd == null) {
			flockAsEnd = new EObjectWithInverseResolvingEList<Flock>(Flock.class, this, FlockPackage.FLOCK_EVENT__FLOCK_AS_END, FlockPackage.FLOCK__END_EVENT);
		}
		return flockAsEnd;
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
			case FlockPackage.FLOCK_EVENT__FLOCK_AS_START:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFlockAsStart()).basicAdd(otherEnd, msgs);
			case FlockPackage.FLOCK_EVENT__FLOCK_AS_END:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFlockAsEnd()).basicAdd(otherEnd, msgs);
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
			case FlockPackage.FLOCK_EVENT__FLOCK_AS_START:
				return ((InternalEList<?>)getFlockAsStart()).basicRemove(otherEnd, msgs);
			case FlockPackage.FLOCK_EVENT__FLOCK_AS_END:
				return ((InternalEList<?>)getFlockAsEnd()).basicRemove(otherEnd, msgs);
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
			case FlockPackage.FLOCK_EVENT__TIME:
				return getTime();
			case FlockPackage.FLOCK_EVENT__LOCATION:
				if (resolve) return getLocation();
				return basicGetLocation();
			case FlockPackage.FLOCK_EVENT__FLOCK_AS_START:
				return getFlockAsStart();
			case FlockPackage.FLOCK_EVENT__FLOCK_AS_END:
				return getFlockAsEnd();
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
			case FlockPackage.FLOCK_EVENT__TIME:
				setTime((Date)newValue);
				return;
			case FlockPackage.FLOCK_EVENT__LOCATION:
				setLocation((Location)newValue);
				return;
			case FlockPackage.FLOCK_EVENT__FLOCK_AS_START:
				getFlockAsStart().clear();
				getFlockAsStart().addAll((Collection<? extends Flock>)newValue);
				return;
			case FlockPackage.FLOCK_EVENT__FLOCK_AS_END:
				getFlockAsEnd().clear();
				getFlockAsEnd().addAll((Collection<? extends Flock>)newValue);
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
			case FlockPackage.FLOCK_EVENT__TIME:
				setTime(TIME_EDEFAULT);
				return;
			case FlockPackage.FLOCK_EVENT__LOCATION:
				setLocation((Location)null);
				return;
			case FlockPackage.FLOCK_EVENT__FLOCK_AS_START:
				getFlockAsStart().clear();
				return;
			case FlockPackage.FLOCK_EVENT__FLOCK_AS_END:
				getFlockAsEnd().clear();
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
			case FlockPackage.FLOCK_EVENT__TIME:
				return TIME_EDEFAULT == null ? time != null : !TIME_EDEFAULT.equals(time);
			case FlockPackage.FLOCK_EVENT__LOCATION:
				return location != null;
			case FlockPackage.FLOCK_EVENT__FLOCK_AS_START:
				return flockAsStart != null && !flockAsStart.isEmpty();
			case FlockPackage.FLOCK_EVENT__FLOCK_AS_END:
				return flockAsEnd != null && !flockAsEnd.isEmpty();
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
		result.append(" (Time: ");
		result.append(time);
		result.append(')');
		return result.toString();
	}

} //FlockEventImpl
