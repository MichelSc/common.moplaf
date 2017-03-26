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

import com.misc.common.moplaf.flock.ChainWayPoint;
import com.misc.common.moplaf.flock.FlockPackage;
import com.misc.common.moplaf.flock.FlockWayPoint;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Chain Way Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.misc.common.moplaf.flock.impl.ChainWayPointImpl#getFlockAsOwner <em>Flock As Owner</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ChainWayPointImpl extends ChainFlockImpl implements ChainWayPoint {
	/**
	 * The cached value of the '{@link #getFlockAsOwner() <em>Flock As Owner</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlockAsOwner()
	 * @generated
	 * @ordered
	 */
	protected FlockWayPoint flockAsOwner;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChainWayPointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FlockPackage.Literals.CHAIN_WAY_POINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlockWayPoint getFlockAsOwner() {
		return flockAsOwner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFlockAsOwner(FlockWayPoint newFlockAsOwner, NotificationChain msgs) {
		FlockWayPoint oldFlockAsOwner = flockAsOwner;
		flockAsOwner = newFlockAsOwner;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FlockPackage.CHAIN_WAY_POINT__FLOCK_AS_OWNER, oldFlockAsOwner, newFlockAsOwner);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlockAsOwner(FlockWayPoint newFlockAsOwner) {
		if (newFlockAsOwner != flockAsOwner) {
			NotificationChain msgs = null;
			if (flockAsOwner != null)
				msgs = ((InternalEObject)flockAsOwner).eInverseRemove(this, FlockPackage.FLOCK_WAY_POINT__CHAIN_OWNER, FlockWayPoint.class, msgs);
			if (newFlockAsOwner != null)
				msgs = ((InternalEObject)newFlockAsOwner).eInverseAdd(this, FlockPackage.FLOCK_WAY_POINT__CHAIN_OWNER, FlockWayPoint.class, msgs);
			msgs = basicSetFlockAsOwner(newFlockAsOwner, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FlockPackage.CHAIN_WAY_POINT__FLOCK_AS_OWNER, newFlockAsOwner, newFlockAsOwner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FlockPackage.CHAIN_WAY_POINT__FLOCK_AS_OWNER:
				if (flockAsOwner != null)
					msgs = ((InternalEObject)flockAsOwner).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FlockPackage.CHAIN_WAY_POINT__FLOCK_AS_OWNER, null, msgs);
				return basicSetFlockAsOwner((FlockWayPoint)otherEnd, msgs);
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
			case FlockPackage.CHAIN_WAY_POINT__FLOCK_AS_OWNER:
				return basicSetFlockAsOwner(null, msgs);
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
			case FlockPackage.CHAIN_WAY_POINT__FLOCK_AS_OWNER:
				return getFlockAsOwner();
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
			case FlockPackage.CHAIN_WAY_POINT__FLOCK_AS_OWNER:
				setFlockAsOwner((FlockWayPoint)newValue);
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
			case FlockPackage.CHAIN_WAY_POINT__FLOCK_AS_OWNER:
				setFlockAsOwner((FlockWayPoint)null);
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
			case FlockPackage.CHAIN_WAY_POINT__FLOCK_AS_OWNER:
				return flockAsOwner != null;
		}
		return super.eIsSet(featureID);
	}

} //ChainWayPointImpl
