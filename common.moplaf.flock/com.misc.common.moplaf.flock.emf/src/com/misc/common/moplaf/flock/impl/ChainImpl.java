/**
 */
package com.misc.common.moplaf.flock.impl;

import com.misc.common.moplaf.flock.Chain;
import com.misc.common.moplaf.flock.ChainFlock;
import com.misc.common.moplaf.flock.FlockPackage;
import com.misc.common.moplaf.flock.FlockScope;
import com.misc.common.moplaf.flock.Location;
import com.misc.common.moplaf.flock.calc.PropagatorCalcChainFlockNextPrevious;
import com.misc.common.moplaf.propagator.Util;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
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
 * An implementation of the model object '<em><b>Chain</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.misc.common.moplaf.flock.impl.ChainImpl#getFlocks <em>Flocks</em>}</li>
 *   <li>{@link com.misc.common.moplaf.flock.impl.ChainImpl#getFlockScope <em>Flock Scope</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ChainImpl extends MinimalEObjectImpl.Container implements Chain {
	/**
	 * The cached value of the '{@link #getFlocks() <em>Flocks</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlocks()
	 * @generated
	 * @ordered
	 */
	protected EList<ChainFlock> flocks;

	/**
	 * The cached value of the '{@link #getFlockScope() <em>Flock Scope</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlockScope()
	 * @generated
	 * @ordered
	 */
	protected FlockScope flockScope;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	protected ChainImpl() {
		super();
		Util.adapt(this, PropagatorCalcChainFlockNextPrevious.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FlockPackage.Literals.CHAIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ChainFlock> getFlocks() {
		if (flocks == null) {
			flocks = new EObjectWithInverseResolvingEList<ChainFlock>(ChainFlock.class, this, FlockPackage.CHAIN__FLOCKS, FlockPackage.CHAIN_FLOCK__CHAIN);
		}
		return flocks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlockScope getFlockScope() {
		if (flockScope != null && flockScope.eIsProxy()) {
			InternalEObject oldFlockScope = (InternalEObject)flockScope;
			flockScope = (FlockScope)eResolveProxy(oldFlockScope);
			if (flockScope != oldFlockScope) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FlockPackage.CHAIN__FLOCK_SCOPE, oldFlockScope, flockScope));
			}
		}
		return flockScope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlockScope basicGetFlockScope() {
		return flockScope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFlockScope(FlockScope newFlockScope, NotificationChain msgs) {
		FlockScope oldFlockScope = flockScope;
		flockScope = newFlockScope;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FlockPackage.CHAIN__FLOCK_SCOPE, oldFlockScope, newFlockScope);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlockScope(FlockScope newFlockScope) {
		if (newFlockScope != flockScope) {
			NotificationChain msgs = null;
			if (flockScope != null)
				msgs = ((InternalEObject)flockScope).eInverseRemove(this, FlockPackage.FLOCK_SCOPE__CHAINS, FlockScope.class, msgs);
			if (newFlockScope != null)
				msgs = ((InternalEObject)newFlockScope).eInverseAdd(this, FlockPackage.FLOCK_SCOPE__CHAINS, FlockScope.class, msgs);
			msgs = basicSetFlockScope(newFlockScope, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FlockPackage.CHAIN__FLOCK_SCOPE, newFlockScope, newFlockScope));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void constructMove(Location from, Location to) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void refreshChainFlockNextPrevious() {
		ChainFlock currentPrevious = null;
		int currentSequenceNr = 0;
		for (ChainFlock current : this.getFlocks()){
			current.setSequenceNr(currentSequenceNr);
			current.setPreviousFlock(currentPrevious);
			// loop control
			currentSequenceNr++;
			currentPrevious = current;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void refreshInit() {
		// default does nothing
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
			case FlockPackage.CHAIN__FLOCKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFlocks()).basicAdd(otherEnd, msgs);
			case FlockPackage.CHAIN__FLOCK_SCOPE:
				if (flockScope != null)
					msgs = ((InternalEObject)flockScope).eInverseRemove(this, FlockPackage.FLOCK_SCOPE__CHAINS, FlockScope.class, msgs);
				return basicSetFlockScope((FlockScope)otherEnd, msgs);
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
			case FlockPackage.CHAIN__FLOCKS:
				return ((InternalEList<?>)getFlocks()).basicRemove(otherEnd, msgs);
			case FlockPackage.CHAIN__FLOCK_SCOPE:
				return basicSetFlockScope(null, msgs);
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
			case FlockPackage.CHAIN__FLOCKS:
				return getFlocks();
			case FlockPackage.CHAIN__FLOCK_SCOPE:
				if (resolve) return getFlockScope();
				return basicGetFlockScope();
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
			case FlockPackage.CHAIN__FLOCKS:
				getFlocks().clear();
				getFlocks().addAll((Collection<? extends ChainFlock>)newValue);
				return;
			case FlockPackage.CHAIN__FLOCK_SCOPE:
				setFlockScope((FlockScope)newValue);
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
			case FlockPackage.CHAIN__FLOCKS:
				getFlocks().clear();
				return;
			case FlockPackage.CHAIN__FLOCK_SCOPE:
				setFlockScope((FlockScope)null);
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
			case FlockPackage.CHAIN__FLOCKS:
				return flocks != null && !flocks.isEmpty();
			case FlockPackage.CHAIN__FLOCK_SCOPE:
				return flockScope != null;
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
			case FlockPackage.CHAIN___CONSTRUCT_MOVE__LOCATION_LOCATION:
				constructMove((Location)arguments.get(0), (Location)arguments.get(1));
				return null;
			case FlockPackage.CHAIN___REFRESH_CHAIN_FLOCK_NEXT_PREVIOUS:
				refreshChainFlockNextPrevious();
				return null;
			case FlockPackage.CHAIN___REFRESH_INIT:
				refreshInit();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //ChainImpl
