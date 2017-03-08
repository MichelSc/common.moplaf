/**
 */
package com.misc.common.moplaf.macroplanner.solver.impl;

import com.misc.common.moplaf.macroplanner.Routing;

import com.misc.common.moplaf.macroplanner.solver.LPRouting;
import com.misc.common.moplaf.macroplanner.solver.LPRoutingBucket;
import com.misc.common.moplaf.macroplanner.solver.LPRoutingSet;
import com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>LP Routing</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.impl.LPRoutingImpl#getRoutingSet <em>Routing Set</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.impl.LPRoutingImpl#getRouting <em>Routing</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.impl.LPRoutingImpl#getLPBuckets <em>LP Buckets</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LPRoutingImpl extends LPTimeLineImpl implements LPRouting {
	/**
	 * The cached value of the '{@link #getRouting() <em>Routing</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRouting()
	 * @generated
	 * @ordered
	 */
	protected Routing routing;

	/**
	 * The cached value of the '{@link #getLPBuckets() <em>LP Buckets</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLPBuckets()
	 * @generated
	 * @ordered
	 */
	protected EList<LPRoutingBucket> lpBuckets;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LPRoutingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MacroPlannerSolverPackage.Literals.LP_ROUTING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LPRoutingSet getRoutingSet() {
		if (eContainerFeatureID() != MacroPlannerSolverPackage.LP_ROUTING__ROUTING_SET) return null;
		return (LPRoutingSet)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRoutingSet(LPRoutingSet newRoutingSet, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newRoutingSet, MacroPlannerSolverPackage.LP_ROUTING__ROUTING_SET, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoutingSet(LPRoutingSet newRoutingSet) {
		if (newRoutingSet != eInternalContainer() || (eContainerFeatureID() != MacroPlannerSolverPackage.LP_ROUTING__ROUTING_SET && newRoutingSet != null)) {
			if (EcoreUtil.isAncestor(this, newRoutingSet))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newRoutingSet != null)
				msgs = ((InternalEObject)newRoutingSet).eInverseAdd(this, MacroPlannerSolverPackage.LP_ROUTING_SET__ROUTINGS, LPRoutingSet.class, msgs);
			msgs = basicSetRoutingSet(newRoutingSet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MacroPlannerSolverPackage.LP_ROUTING__ROUTING_SET, newRoutingSet, newRoutingSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Routing getRouting() {
		if (routing != null && routing.eIsProxy()) {
			InternalEObject oldRouting = (InternalEObject)routing;
			routing = (Routing)eResolveProxy(oldRouting);
			if (routing != oldRouting) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MacroPlannerSolverPackage.LP_ROUTING__ROUTING, oldRouting, routing));
			}
		}
		return routing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Routing basicGetRouting() {
		return routing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRouting(Routing newRouting) {
		Routing oldRouting = routing;
		routing = newRouting;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MacroPlannerSolverPackage.LP_ROUTING__ROUTING, oldRouting, routing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LPRoutingBucket> getLPBuckets() {
		if (lpBuckets == null) {
			lpBuckets = new EObjectContainmentWithInverseEList<LPRoutingBucket>(LPRoutingBucket.class, this, MacroPlannerSolverPackage.LP_ROUTING__LP_BUCKETS, MacroPlannerSolverPackage.LP_ROUTING_BUCKET__ROUTING);
		}
		return lpBuckets;
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
			case MacroPlannerSolverPackage.LP_ROUTING__ROUTING_SET:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetRoutingSet((LPRoutingSet)otherEnd, msgs);
			case MacroPlannerSolverPackage.LP_ROUTING__LP_BUCKETS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLPBuckets()).basicAdd(otherEnd, msgs);
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
			case MacroPlannerSolverPackage.LP_ROUTING__ROUTING_SET:
				return basicSetRoutingSet(null, msgs);
			case MacroPlannerSolverPackage.LP_ROUTING__LP_BUCKETS:
				return ((InternalEList<?>)getLPBuckets()).basicRemove(otherEnd, msgs);
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
			case MacroPlannerSolverPackage.LP_ROUTING__ROUTING_SET:
				return eInternalContainer().eInverseRemove(this, MacroPlannerSolverPackage.LP_ROUTING_SET__ROUTINGS, LPRoutingSet.class, msgs);
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
			case MacroPlannerSolverPackage.LP_ROUTING__ROUTING_SET:
				return getRoutingSet();
			case MacroPlannerSolverPackage.LP_ROUTING__ROUTING:
				if (resolve) return getRouting();
				return basicGetRouting();
			case MacroPlannerSolverPackage.LP_ROUTING__LP_BUCKETS:
				return getLPBuckets();
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
			case MacroPlannerSolverPackage.LP_ROUTING__ROUTING_SET:
				setRoutingSet((LPRoutingSet)newValue);
				return;
			case MacroPlannerSolverPackage.LP_ROUTING__ROUTING:
				setRouting((Routing)newValue);
				return;
			case MacroPlannerSolverPackage.LP_ROUTING__LP_BUCKETS:
				getLPBuckets().clear();
				getLPBuckets().addAll((Collection<? extends LPRoutingBucket>)newValue);
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
			case MacroPlannerSolverPackage.LP_ROUTING__ROUTING_SET:
				setRoutingSet((LPRoutingSet)null);
				return;
			case MacroPlannerSolverPackage.LP_ROUTING__ROUTING:
				setRouting((Routing)null);
				return;
			case MacroPlannerSolverPackage.LP_ROUTING__LP_BUCKETS:
				getLPBuckets().clear();
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
			case MacroPlannerSolverPackage.LP_ROUTING__ROUTING_SET:
				return getRoutingSet() != null;
			case MacroPlannerSolverPackage.LP_ROUTING__ROUTING:
				return routing != null;
			case MacroPlannerSolverPackage.LP_ROUTING__LP_BUCKETS:
				return lpBuckets != null && !lpBuckets.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LPRoutingImpl
