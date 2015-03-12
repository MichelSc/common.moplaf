/**
 */
package com.misc.common.moplaf.flock.impl;

import com.misc.common.moplaf.flock.ChainConfiguration;
import com.misc.common.moplaf.flock.ChainMount;
import com.misc.common.moplaf.flock.FlockPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Chain Mount</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.misc.common.moplaf.flock.impl.ChainMountImpl#getMountPoint <em>Mount Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ChainMountImpl extends ChainFlockConfigurationImpl implements ChainMount {
	/**
	 * The cached value of the '{@link #getMountPoint() <em>Mount Point</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMountPoint()
	 * @generated
	 * @ordered
	 */
	protected ChainConfiguration mountPoint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChainMountImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FlockPackage.Literals.CHAIN_MOUNT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChainConfiguration getMountPoint() {
		if (mountPoint != null && mountPoint.eIsProxy()) {
			InternalEObject oldMountPoint = (InternalEObject)mountPoint;
			mountPoint = (ChainConfiguration)eResolveProxy(oldMountPoint);
			if (mountPoint != oldMountPoint) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FlockPackage.CHAIN_MOUNT__MOUNT_POINT, oldMountPoint, mountPoint));
			}
		}
		return mountPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChainConfiguration basicGetMountPoint() {
		return mountPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMountPoint(ChainConfiguration newMountPoint) {
		ChainConfiguration oldMountPoint = mountPoint;
		mountPoint = newMountPoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FlockPackage.CHAIN_MOUNT__MOUNT_POINT, oldMountPoint, mountPoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FlockPackage.CHAIN_MOUNT__MOUNT_POINT:
				if (resolve) return getMountPoint();
				return basicGetMountPoint();
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
			case FlockPackage.CHAIN_MOUNT__MOUNT_POINT:
				setMountPoint((ChainConfiguration)newValue);
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
			case FlockPackage.CHAIN_MOUNT__MOUNT_POINT:
				setMountPoint((ChainConfiguration)null);
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
			case FlockPackage.CHAIN_MOUNT__MOUNT_POINT:
				return mountPoint != null;
		}
		return super.eIsSet(featureID);
	}

} //ChainMountImpl
