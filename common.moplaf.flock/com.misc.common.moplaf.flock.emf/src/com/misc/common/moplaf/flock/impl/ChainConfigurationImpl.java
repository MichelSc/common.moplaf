/**
 */
package com.misc.common.moplaf.flock.impl;

import com.misc.common.moplaf.flock.ChainConfiguration;
import com.misc.common.moplaf.flock.FlockConfiguration;
import com.misc.common.moplaf.flock.FlockPackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Chain Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.misc.common.moplaf.flock.impl.ChainConfigurationImpl#getFlockAsOwner <em>Flock As Owner</em>}</li>
 *   <li>{@link com.misc.common.moplaf.flock.impl.ChainConfigurationImpl#getAttachPoint <em>Attach Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ChainConfigurationImpl extends ChainFlockConfigurationImpl implements ChainConfiguration {
	/**
	 * The cached value of the '{@link #getFlockAsOwner() <em>Flock As Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlockAsOwner()
	 * @generated
	 * @ordered
	 */
	protected FlockConfiguration flockAsOwner;

	/**
	 * The cached value of the '{@link #getAttachPoint() <em>Attach Point</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttachPoint()
	 * @generated
	 * @ordered
	 */
	protected ChainConfiguration attachPoint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChainConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FlockPackage.Literals.CHAIN_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlockConfiguration getFlockAsOwner() {
		if (flockAsOwner != null && flockAsOwner.eIsProxy()) {
			InternalEObject oldFlockAsOwner = (InternalEObject)flockAsOwner;
			flockAsOwner = (FlockConfiguration)eResolveProxy(oldFlockAsOwner);
			if (flockAsOwner != oldFlockAsOwner) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FlockPackage.CHAIN_CONFIGURATION__FLOCK_AS_OWNER, oldFlockAsOwner, flockAsOwner));
			}
		}
		return flockAsOwner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlockConfiguration basicGetFlockAsOwner() {
		return flockAsOwner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFlockAsOwner(FlockConfiguration newFlockAsOwner, NotificationChain msgs) {
		FlockConfiguration oldFlockAsOwner = flockAsOwner;
		flockAsOwner = newFlockAsOwner;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FlockPackage.CHAIN_CONFIGURATION__FLOCK_AS_OWNER, oldFlockAsOwner, newFlockAsOwner);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlockAsOwner(FlockConfiguration newFlockAsOwner) {
		if (newFlockAsOwner != flockAsOwner) {
			NotificationChain msgs = null;
			if (flockAsOwner != null)
				msgs = ((InternalEObject)flockAsOwner).eInverseRemove(this, FlockPackage.FLOCK_CONFIGURATION__CHAIN_OWNER, FlockConfiguration.class, msgs);
			if (newFlockAsOwner != null)
				msgs = ((InternalEObject)newFlockAsOwner).eInverseAdd(this, FlockPackage.FLOCK_CONFIGURATION__CHAIN_OWNER, FlockConfiguration.class, msgs);
			msgs = basicSetFlockAsOwner(newFlockAsOwner, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FlockPackage.CHAIN_CONFIGURATION__FLOCK_AS_OWNER, newFlockAsOwner, newFlockAsOwner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChainConfiguration getAttachPoint() {
		if (attachPoint != null && attachPoint.eIsProxy()) {
			InternalEObject oldAttachPoint = (InternalEObject)attachPoint;
			attachPoint = (ChainConfiguration)eResolveProxy(oldAttachPoint);
			if (attachPoint != oldAttachPoint) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FlockPackage.CHAIN_CONFIGURATION__ATTACH_POINT, oldAttachPoint, attachPoint));
			}
		}
		return attachPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChainConfiguration basicGetAttachPoint() {
		return attachPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttachPoint(ChainConfiguration newAttachPoint) {
		ChainConfiguration oldAttachPoint = attachPoint;
		attachPoint = newAttachPoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FlockPackage.CHAIN_CONFIGURATION__ATTACH_POINT, oldAttachPoint, attachPoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void refreshFlockConfiguration() {
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
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FlockPackage.CHAIN_CONFIGURATION__FLOCK_AS_OWNER:
				if (flockAsOwner != null)
					msgs = ((InternalEObject)flockAsOwner).eInverseRemove(this, FlockPackage.FLOCK_CONFIGURATION__CHAIN_OWNER, FlockConfiguration.class, msgs);
				return basicSetFlockAsOwner((FlockConfiguration)otherEnd, msgs);
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
			case FlockPackage.CHAIN_CONFIGURATION__FLOCK_AS_OWNER:
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
			case FlockPackage.CHAIN_CONFIGURATION__FLOCK_AS_OWNER:
				if (resolve) return getFlockAsOwner();
				return basicGetFlockAsOwner();
			case FlockPackage.CHAIN_CONFIGURATION__ATTACH_POINT:
				if (resolve) return getAttachPoint();
				return basicGetAttachPoint();
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
			case FlockPackage.CHAIN_CONFIGURATION__FLOCK_AS_OWNER:
				setFlockAsOwner((FlockConfiguration)newValue);
				return;
			case FlockPackage.CHAIN_CONFIGURATION__ATTACH_POINT:
				setAttachPoint((ChainConfiguration)newValue);
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
			case FlockPackage.CHAIN_CONFIGURATION__FLOCK_AS_OWNER:
				setFlockAsOwner((FlockConfiguration)null);
				return;
			case FlockPackage.CHAIN_CONFIGURATION__ATTACH_POINT:
				setAttachPoint((ChainConfiguration)null);
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
			case FlockPackage.CHAIN_CONFIGURATION__FLOCK_AS_OWNER:
				return flockAsOwner != null;
			case FlockPackage.CHAIN_CONFIGURATION__ATTACH_POINT:
				return attachPoint != null;
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
			case FlockPackage.CHAIN_CONFIGURATION___REFRESH_FLOCK_CONFIGURATION:
				refreshFlockConfiguration();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //ChainConfigurationImpl
