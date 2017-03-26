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

import com.misc.common.moplaf.flock.ChainRide;
import com.misc.common.moplaf.flock.FlockPackage;
import com.misc.common.moplaf.flock.FlockRide;
import com.misc.common.moplaf.flock.Location;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ride</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.misc.common.moplaf.flock.impl.FlockRideImpl#getStartRide <em>Start Ride</em>}</li>
 *   <li>{@link com.misc.common.moplaf.flock.impl.FlockRideImpl#getToRide <em>To Ride</em>}</li>
 *   <li>{@link com.misc.common.moplaf.flock.impl.FlockRideImpl#getChainOwner <em>Chain Owner</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FlockRideImpl extends FlockImpl implements FlockRide {
	/**
	 * The cached value of the '{@link #getStartRide() <em>Start Ride</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartRide()
	 * @generated
	 * @ordered
	 */
	protected Location startRide;

	/**
	 * The cached value of the '{@link #getToRide() <em>To Ride</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToRide()
	 * @generated
	 * @ordered
	 */
	protected Location toRide;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlockRideImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FlockPackage.Literals.FLOCK_RIDE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location getStartRide() {
		if (startRide != null && startRide.eIsProxy()) {
			InternalEObject oldStartRide = (InternalEObject)startRide;
			startRide = (Location)eResolveProxy(oldStartRide);
			if (startRide != oldStartRide) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FlockPackage.FLOCK_RIDE__START_RIDE, oldStartRide, startRide));
			}
		}
		return startRide;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location basicGetStartRide() {
		return startRide;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartRide(Location newStartRide) {
		Location oldStartRide = startRide;
		startRide = newStartRide;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FlockPackage.FLOCK_RIDE__START_RIDE, oldStartRide, startRide));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location getToRide() {
		if (toRide != null && toRide.eIsProxy()) {
			InternalEObject oldToRide = (InternalEObject)toRide;
			toRide = (Location)eResolveProxy(oldToRide);
			if (toRide != oldToRide) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FlockPackage.FLOCK_RIDE__TO_RIDE, oldToRide, toRide));
			}
		}
		return toRide;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location basicGetToRide() {
		return toRide;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToRide(Location newToRide) {
		Location oldToRide = toRide;
		toRide = newToRide;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FlockPackage.FLOCK_RIDE__TO_RIDE, oldToRide, toRide));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChainRide getChainOwner() {
		if (eContainerFeatureID() != FlockPackage.FLOCK_RIDE__CHAIN_OWNER) return null;
		return (ChainRide)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChainOwner(ChainRide newChainOwner, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newChainOwner, FlockPackage.FLOCK_RIDE__CHAIN_OWNER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChainOwner(ChainRide newChainOwner) {
		if (newChainOwner != eInternalContainer() || (eContainerFeatureID() != FlockPackage.FLOCK_RIDE__CHAIN_OWNER && newChainOwner != null)) {
			if (EcoreUtil.isAncestor(this, newChainOwner))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newChainOwner != null)
				msgs = ((InternalEObject)newChainOwner).eInverseAdd(this, FlockPackage.CHAIN_RIDE__FLOCK_AS_OWNER, ChainRide.class, msgs);
			msgs = basicSetChainOwner(newChainOwner, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FlockPackage.FLOCK_RIDE__CHAIN_OWNER, newChainOwner, newChainOwner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FlockPackage.FLOCK_RIDE__CHAIN_OWNER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetChainOwner((ChainRide)otherEnd, msgs);
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
			case FlockPackage.FLOCK_RIDE__CHAIN_OWNER:
				return basicSetChainOwner(null, msgs);
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
			case FlockPackage.FLOCK_RIDE__CHAIN_OWNER:
				return eInternalContainer().eInverseRemove(this, FlockPackage.CHAIN_RIDE__FLOCK_AS_OWNER, ChainRide.class, msgs);
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
			case FlockPackage.FLOCK_RIDE__START_RIDE:
				if (resolve) return getStartRide();
				return basicGetStartRide();
			case FlockPackage.FLOCK_RIDE__TO_RIDE:
				if (resolve) return getToRide();
				return basicGetToRide();
			case FlockPackage.FLOCK_RIDE__CHAIN_OWNER:
				return getChainOwner();
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
			case FlockPackage.FLOCK_RIDE__START_RIDE:
				setStartRide((Location)newValue);
				return;
			case FlockPackage.FLOCK_RIDE__TO_RIDE:
				setToRide((Location)newValue);
				return;
			case FlockPackage.FLOCK_RIDE__CHAIN_OWNER:
				setChainOwner((ChainRide)newValue);
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
			case FlockPackage.FLOCK_RIDE__START_RIDE:
				setStartRide((Location)null);
				return;
			case FlockPackage.FLOCK_RIDE__TO_RIDE:
				setToRide((Location)null);
				return;
			case FlockPackage.FLOCK_RIDE__CHAIN_OWNER:
				setChainOwner((ChainRide)null);
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
			case FlockPackage.FLOCK_RIDE__START_RIDE:
				return startRide != null;
			case FlockPackage.FLOCK_RIDE__TO_RIDE:
				return toRide != null;
			case FlockPackage.FLOCK_RIDE__CHAIN_OWNER:
				return getChainOwner() != null;
		}
		return super.eIsSet(featureID);
	}

} //FlockRideImpl
