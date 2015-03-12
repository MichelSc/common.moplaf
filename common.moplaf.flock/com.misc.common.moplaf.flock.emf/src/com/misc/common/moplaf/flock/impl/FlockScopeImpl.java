/**
 */
package com.misc.common.moplaf.flock.impl;

import com.misc.common.moplaf.flock.Chain;
import com.misc.common.moplaf.flock.Flock;
import com.misc.common.moplaf.flock.FlockPackage;
import com.misc.common.moplaf.flock.FlockScope;
import com.misc.common.moplaf.flock.calc.PropagatorLayerChainFlockNextPrevious;
import com.misc.common.moplaf.flock.calc.PropagatorLayerFlockScopeInitializer;
import com.misc.common.moplaf.flock.calc.PropagatorScopeFlockScope;
import com.misc.common.moplaf.propagator.Util;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scope</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.misc.common.moplaf.flock.impl.FlockScopeImpl#getChains <em>Chains</em>}</li>
 *   <li>{@link com.misc.common.moplaf.flock.impl.FlockScopeImpl#getFlocks <em>Flocks</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FlockScopeImpl extends MinimalEObjectImpl.Container implements FlockScope {
	/**
	 * The cached value of the '{@link #getChains() <em>Chains</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChains()
	 * @generated
	 * @ordered
	 */
	protected EList<Chain> chains;

	/**
	 * The cached value of the '{@link #getFlocks() <em>Flocks</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlocks()
	 * @generated
	 * @ordered
	 */
	protected EList<Flock> flocks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	protected FlockScopeImpl() {
		super();
		Util.adapt(this, PropagatorLayerFlockScopeInitializer.class);
		Util.adapt(this, PropagatorLayerChainFlockNextPrevious.class);
		Util.adapt(this, PropagatorScopeFlockScope.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FlockPackage.Literals.FLOCK_SCOPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Chain> getChains() {
		if (chains == null) {
			chains = new EObjectWithInverseResolvingEList<Chain>(Chain.class, this, FlockPackage.FLOCK_SCOPE__CHAINS, FlockPackage.CHAIN__FLOCK_SCOPE);
		}
		return chains;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Flock> getFlocks() {
		if (flocks == null) {
			flocks = new EObjectWithInverseResolvingEList<Flock>(Flock.class, this, FlockPackage.FLOCK_SCOPE__FLOCKS, FlockPackage.FLOCK__FLOCK_SCOPE);
		}
		return flocks;
	}
	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void refreshFlockConfiguration() {
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void refreshChainMounted() {
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void refreshConfiguration() {
		this.refreshFlockConfiguration();
		this.refreshChainMounted();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void refreshMoves() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void refreshIdles() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
			case FlockPackage.FLOCK_SCOPE__CHAINS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getChains()).basicAdd(otherEnd, msgs);
			case FlockPackage.FLOCK_SCOPE__FLOCKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFlocks()).basicAdd(otherEnd, msgs);
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
			case FlockPackage.FLOCK_SCOPE__CHAINS:
				return ((InternalEList<?>)getChains()).basicRemove(otherEnd, msgs);
			case FlockPackage.FLOCK_SCOPE__FLOCKS:
				return ((InternalEList<?>)getFlocks()).basicRemove(otherEnd, msgs);
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
			case FlockPackage.FLOCK_SCOPE__CHAINS:
				return getChains();
			case FlockPackage.FLOCK_SCOPE__FLOCKS:
				return getFlocks();
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
			case FlockPackage.FLOCK_SCOPE__CHAINS:
				getChains().clear();
				getChains().addAll((Collection<? extends Chain>)newValue);
				return;
			case FlockPackage.FLOCK_SCOPE__FLOCKS:
				getFlocks().clear();
				getFlocks().addAll((Collection<? extends Flock>)newValue);
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
			case FlockPackage.FLOCK_SCOPE__CHAINS:
				getChains().clear();
				return;
			case FlockPackage.FLOCK_SCOPE__FLOCKS:
				getFlocks().clear();
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
			case FlockPackage.FLOCK_SCOPE__CHAINS:
				return chains != null && !chains.isEmpty();
			case FlockPackage.FLOCK_SCOPE__FLOCKS:
				return flocks != null && !flocks.isEmpty();
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
			case FlockPackage.FLOCK_SCOPE___REFRESH_CONFIGURATION:
				refreshConfiguration();
				return null;
			case FlockPackage.FLOCK_SCOPE___REFRESH_MOVES:
				refreshMoves();
				return null;
			case FlockPackage.FLOCK_SCOPE___REFRESH_IDLES:
				refreshIdles();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //FlockScopeImpl
