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

import com.misc.common.moplaf.flock.ChainFlockConfiguration;
import com.misc.common.moplaf.flock.ChainMounted;
import com.misc.common.moplaf.flock.FlockConfiguration;
import com.misc.common.moplaf.flock.FlockPackage;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Chain Flock Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.misc.common.moplaf.flock.impl.ChainFlockConfigurationImpl#getFlockConfiguration <em>Flock Configuration</em>}</li>
 *   <li>{@link com.misc.common.moplaf.flock.impl.ChainFlockConfigurationImpl#getMountedChainAsOwner <em>Mounted Chain As Owner</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ChainFlockConfigurationImpl extends ChainFlockImpl implements ChainFlockConfiguration {
	/**
	 * The cached value of the '{@link #getFlockConfiguration() <em>Flock Configuration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlockConfiguration()
	 * @generated
	 * @ordered
	 */
	protected FlockConfiguration flockConfiguration;

	/**
	 * The cached value of the '{@link #getMountedChainAsOwner() <em>Mounted Chain As Owner</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMountedChainAsOwner()
	 * @generated
	 * @ordered
	 */
	protected EList<ChainMounted> mountedChainAsOwner;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChainFlockConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FlockPackage.Literals.CHAIN_FLOCK_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlockConfiguration getFlockConfiguration() {
		if (flockConfiguration != null && flockConfiguration.eIsProxy()) {
			InternalEObject oldFlockConfiguration = (InternalEObject)flockConfiguration;
			flockConfiguration = (FlockConfiguration)eResolveProxy(oldFlockConfiguration);
			if (flockConfiguration != oldFlockConfiguration) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FlockPackage.CHAIN_FLOCK_CONFIGURATION__FLOCK_CONFIGURATION, oldFlockConfiguration, flockConfiguration));
			}
		}
		return flockConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlockConfiguration basicGetFlockConfiguration() {
		return flockConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlockConfiguration(FlockConfiguration newFlockConfiguration) {
		FlockConfiguration oldFlockConfiguration = flockConfiguration;
		flockConfiguration = newFlockConfiguration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FlockPackage.CHAIN_FLOCK_CONFIGURATION__FLOCK_CONFIGURATION, oldFlockConfiguration, flockConfiguration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ChainMounted> getMountedChainAsOwner() {
		if (mountedChainAsOwner == null) {
			mountedChainAsOwner = new EObjectContainmentEList<ChainMounted>(ChainMounted.class, this, FlockPackage.CHAIN_FLOCK_CONFIGURATION__MOUNTED_CHAIN_AS_OWNER);
		}
		return mountedChainAsOwner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void refreshChainMounted() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FlockPackage.CHAIN_FLOCK_CONFIGURATION__MOUNTED_CHAIN_AS_OWNER:
				return ((InternalEList<?>)getMountedChainAsOwner()).basicRemove(otherEnd, msgs);
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
			case FlockPackage.CHAIN_FLOCK_CONFIGURATION__FLOCK_CONFIGURATION:
				if (resolve) return getFlockConfiguration();
				return basicGetFlockConfiguration();
			case FlockPackage.CHAIN_FLOCK_CONFIGURATION__MOUNTED_CHAIN_AS_OWNER:
				return getMountedChainAsOwner();
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
			case FlockPackage.CHAIN_FLOCK_CONFIGURATION__FLOCK_CONFIGURATION:
				setFlockConfiguration((FlockConfiguration)newValue);
				return;
			case FlockPackage.CHAIN_FLOCK_CONFIGURATION__MOUNTED_CHAIN_AS_OWNER:
				getMountedChainAsOwner().clear();
				getMountedChainAsOwner().addAll((Collection<? extends ChainMounted>)newValue);
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
			case FlockPackage.CHAIN_FLOCK_CONFIGURATION__FLOCK_CONFIGURATION:
				setFlockConfiguration((FlockConfiguration)null);
				return;
			case FlockPackage.CHAIN_FLOCK_CONFIGURATION__MOUNTED_CHAIN_AS_OWNER:
				getMountedChainAsOwner().clear();
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
			case FlockPackage.CHAIN_FLOCK_CONFIGURATION__FLOCK_CONFIGURATION:
				return flockConfiguration != null;
			case FlockPackage.CHAIN_FLOCK_CONFIGURATION__MOUNTED_CHAIN_AS_OWNER:
				return mountedChainAsOwner != null && !mountedChainAsOwner.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case FlockPackage.CHAIN_FLOCK_CONFIGURATION___REFRESH_CHAIN_MOUNTED:
				refreshChainMounted();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //ChainFlockConfigurationImpl
