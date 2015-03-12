/**
 */
package com.misc.common.moplaf.flock.impl;

import com.misc.common.moplaf.flock.ChainWayPoint;
import com.misc.common.moplaf.flock.FlockPackage;
import com.misc.common.moplaf.flock.FlockWayPoint;
import com.misc.common.moplaf.flock.Location;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Way Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.misc.common.moplaf.flock.impl.FlockWayPointImpl#getWayPointLocation <em>Way Point Location</em>}</li>
 *   <li>{@link com.misc.common.moplaf.flock.impl.FlockWayPointImpl#getChainOwner <em>Chain Owner</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FlockWayPointImpl extends FlockImpl implements FlockWayPoint {
	/**
	 * The cached value of the '{@link #getWayPointLocation() <em>Way Point Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWayPointLocation()
	 * @generated
	 * @ordered
	 */
	protected Location wayPointLocation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlockWayPointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FlockPackage.Literals.FLOCK_WAY_POINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location getWayPointLocation() {
		if (wayPointLocation != null && wayPointLocation.eIsProxy()) {
			InternalEObject oldWayPointLocation = (InternalEObject)wayPointLocation;
			wayPointLocation = (Location)eResolveProxy(oldWayPointLocation);
			if (wayPointLocation != oldWayPointLocation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FlockPackage.FLOCK_WAY_POINT__WAY_POINT_LOCATION, oldWayPointLocation, wayPointLocation));
			}
		}
		return wayPointLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location basicGetWayPointLocation() {
		return wayPointLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWayPointLocation(Location newWayPointLocation) {
		Location oldWayPointLocation = wayPointLocation;
		wayPointLocation = newWayPointLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FlockPackage.FLOCK_WAY_POINT__WAY_POINT_LOCATION, oldWayPointLocation, wayPointLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChainWayPoint getChainOwner() {
		if (eContainerFeatureID() != FlockPackage.FLOCK_WAY_POINT__CHAIN_OWNER) return null;
		return (ChainWayPoint)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChainOwner(ChainWayPoint newChainOwner, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newChainOwner, FlockPackage.FLOCK_WAY_POINT__CHAIN_OWNER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChainOwner(ChainWayPoint newChainOwner) {
		if (newChainOwner != eInternalContainer() || (eContainerFeatureID() != FlockPackage.FLOCK_WAY_POINT__CHAIN_OWNER && newChainOwner != null)) {
			if (EcoreUtil.isAncestor(this, newChainOwner))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newChainOwner != null)
				msgs = ((InternalEObject)newChainOwner).eInverseAdd(this, FlockPackage.CHAIN_WAY_POINT__FLOCK_AS_OWNER, ChainWayPoint.class, msgs);
			msgs = basicSetChainOwner(newChainOwner, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FlockPackage.FLOCK_WAY_POINT__CHAIN_OWNER, newChainOwner, newChainOwner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FlockPackage.FLOCK_WAY_POINT__CHAIN_OWNER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetChainOwner((ChainWayPoint)otherEnd, msgs);
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
			case FlockPackage.FLOCK_WAY_POINT__CHAIN_OWNER:
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
			case FlockPackage.FLOCK_WAY_POINT__CHAIN_OWNER:
				return eInternalContainer().eInverseRemove(this, FlockPackage.CHAIN_WAY_POINT__FLOCK_AS_OWNER, ChainWayPoint.class, msgs);
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
			case FlockPackage.FLOCK_WAY_POINT__WAY_POINT_LOCATION:
				if (resolve) return getWayPointLocation();
				return basicGetWayPointLocation();
			case FlockPackage.FLOCK_WAY_POINT__CHAIN_OWNER:
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
			case FlockPackage.FLOCK_WAY_POINT__WAY_POINT_LOCATION:
				setWayPointLocation((Location)newValue);
				return;
			case FlockPackage.FLOCK_WAY_POINT__CHAIN_OWNER:
				setChainOwner((ChainWayPoint)newValue);
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
			case FlockPackage.FLOCK_WAY_POINT__WAY_POINT_LOCATION:
				setWayPointLocation((Location)null);
				return;
			case FlockPackage.FLOCK_WAY_POINT__CHAIN_OWNER:
				setChainOwner((ChainWayPoint)null);
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
			case FlockPackage.FLOCK_WAY_POINT__WAY_POINT_LOCATION:
				return wayPointLocation != null;
			case FlockPackage.FLOCK_WAY_POINT__CHAIN_OWNER:
				return getChainOwner() != null;
		}
		return super.eIsSet(featureID);
	}

} //FlockWayPointImpl
