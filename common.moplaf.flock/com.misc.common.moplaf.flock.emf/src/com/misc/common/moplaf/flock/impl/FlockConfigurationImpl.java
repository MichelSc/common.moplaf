/**
 */
package com.misc.common.moplaf.flock.impl;

import com.misc.common.moplaf.flock.ChainConfiguration;
import com.misc.common.moplaf.flock.FlockConfiguration;
import com.misc.common.moplaf.flock.FlockPackage;
import com.misc.common.moplaf.flock.Location;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.misc.common.moplaf.flock.impl.FlockConfigurationImpl#getConfigurationLocation <em>Configuration Location</em>}</li>
 *   <li>{@link com.misc.common.moplaf.flock.impl.FlockConfigurationImpl#getChainOwner <em>Chain Owner</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FlockConfigurationImpl extends FlockImpl implements FlockConfiguration {
	/**
	 * The cached value of the '{@link #getConfigurationLocation() <em>Configuration Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigurationLocation()
	 * @generated
	 * @ordered
	 */
	protected Location configurationLocation;

	/**
	 * The cached value of the '{@link #getChainOwner() <em>Chain Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChainOwner()
	 * @generated
	 * @ordered
	 */
	protected ChainConfiguration chainOwner;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlockConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FlockPackage.Literals.FLOCK_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location getConfigurationLocation() {
		if (configurationLocation != null && configurationLocation.eIsProxy()) {
			InternalEObject oldConfigurationLocation = (InternalEObject)configurationLocation;
			configurationLocation = (Location)eResolveProxy(oldConfigurationLocation);
			if (configurationLocation != oldConfigurationLocation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FlockPackage.FLOCK_CONFIGURATION__CONFIGURATION_LOCATION, oldConfigurationLocation, configurationLocation));
			}
		}
		return configurationLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location basicGetConfigurationLocation() {
		return configurationLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfigurationLocation(Location newConfigurationLocation) {
		Location oldConfigurationLocation = configurationLocation;
		configurationLocation = newConfigurationLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FlockPackage.FLOCK_CONFIGURATION__CONFIGURATION_LOCATION, oldConfigurationLocation, configurationLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChainConfiguration getChainOwner() {
		if (chainOwner != null && chainOwner.eIsProxy()) {
			InternalEObject oldChainOwner = (InternalEObject)chainOwner;
			chainOwner = (ChainConfiguration)eResolveProxy(oldChainOwner);
			if (chainOwner != oldChainOwner) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FlockPackage.FLOCK_CONFIGURATION__CHAIN_OWNER, oldChainOwner, chainOwner));
			}
		}
		return chainOwner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChainConfiguration basicGetChainOwner() {
		return chainOwner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChainOwner(ChainConfiguration newChainOwner, NotificationChain msgs) {
		ChainConfiguration oldChainOwner = chainOwner;
		chainOwner = newChainOwner;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FlockPackage.FLOCK_CONFIGURATION__CHAIN_OWNER, oldChainOwner, newChainOwner);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChainOwner(ChainConfiguration newChainOwner) {
		if (newChainOwner != chainOwner) {
			NotificationChain msgs = null;
			if (chainOwner != null)
				msgs = ((InternalEObject)chainOwner).eInverseRemove(this, FlockPackage.CHAIN_CONFIGURATION__FLOCK_AS_OWNER, ChainConfiguration.class, msgs);
			if (newChainOwner != null)
				msgs = ((InternalEObject)newChainOwner).eInverseAdd(this, FlockPackage.CHAIN_CONFIGURATION__FLOCK_AS_OWNER, ChainConfiguration.class, msgs);
			msgs = basicSetChainOwner(newChainOwner, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FlockPackage.FLOCK_CONFIGURATION__CHAIN_OWNER, newChainOwner, newChainOwner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FlockPackage.FLOCK_CONFIGURATION__CHAIN_OWNER:
				if (chainOwner != null)
					msgs = ((InternalEObject)chainOwner).eInverseRemove(this, FlockPackage.CHAIN_CONFIGURATION__FLOCK_AS_OWNER, ChainConfiguration.class, msgs);
				return basicSetChainOwner((ChainConfiguration)otherEnd, msgs);
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
			case FlockPackage.FLOCK_CONFIGURATION__CHAIN_OWNER:
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FlockPackage.FLOCK_CONFIGURATION__CONFIGURATION_LOCATION:
				if (resolve) return getConfigurationLocation();
				return basicGetConfigurationLocation();
			case FlockPackage.FLOCK_CONFIGURATION__CHAIN_OWNER:
				if (resolve) return getChainOwner();
				return basicGetChainOwner();
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
			case FlockPackage.FLOCK_CONFIGURATION__CONFIGURATION_LOCATION:
				setConfigurationLocation((Location)newValue);
				return;
			case FlockPackage.FLOCK_CONFIGURATION__CHAIN_OWNER:
				setChainOwner((ChainConfiguration)newValue);
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
			case FlockPackage.FLOCK_CONFIGURATION__CONFIGURATION_LOCATION:
				setConfigurationLocation((Location)null);
				return;
			case FlockPackage.FLOCK_CONFIGURATION__CHAIN_OWNER:
				setChainOwner((ChainConfiguration)null);
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
			case FlockPackage.FLOCK_CONFIGURATION__CONFIGURATION_LOCATION:
				return configurationLocation != null;
			case FlockPackage.FLOCK_CONFIGURATION__CHAIN_OWNER:
				return chainOwner != null;
		}
		return super.eIsSet(featureID);
	}

} //FlockConfigurationImpl
