/**
 */
package com.misc.common.moplaf.macroplanner.solver.impl;

import com.misc.common.moplaf.macroplanner.solver.LPRouting;
import com.misc.common.moplaf.macroplanner.solver.LPRoutingBucket;
import com.misc.common.moplaf.macroplanner.solver.LPRoutingBucketProduct;
import com.misc.common.moplaf.macroplanner.solver.LPRoutingBucketResource;
import com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage;

import com.misc.common.moplaf.solver.GeneratorLpVar;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>LP Routing Bucket</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.impl.LPRoutingBucketImpl#getRouting <em>Routing</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.impl.LPRoutingBucketImpl#getProducts <em>Products</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.impl.LPRoutingBucketImpl#getResources <em>Resources</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.impl.LPRoutingBucketImpl#getPlanned <em>Planned</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LPRoutingBucketImpl extends LPTimeBucketImpl implements LPRoutingBucket {
	/**
	 * The cached value of the '{@link #getProducts() <em>Products</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProducts()
	 * @generated
	 * @ordered
	 */
	protected EList<LPRoutingBucketProduct> products;

	/**
	 * The cached value of the '{@link #getResources() <em>Resources</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResources()
	 * @generated
	 * @ordered
	 */
	protected EList<LPRoutingBucketResource> resources;

	/**
	 * The cached value of the '{@link #getPlanned() <em>Planned</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanned()
	 * @generated
	 * @ordered
	 */
	protected GeneratorLpVar planned;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LPRoutingBucketImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MacroPlannerSolverPackage.Literals.LP_ROUTING_BUCKET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LPRouting getRouting() {
		if (eContainerFeatureID() != MacroPlannerSolverPackage.LP_ROUTING_BUCKET__ROUTING) return null;
		return (LPRouting)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRouting(LPRouting newRouting, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newRouting, MacroPlannerSolverPackage.LP_ROUTING_BUCKET__ROUTING, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRouting(LPRouting newRouting) {
		if (newRouting != eInternalContainer() || (eContainerFeatureID() != MacroPlannerSolverPackage.LP_ROUTING_BUCKET__ROUTING && newRouting != null)) {
			if (EcoreUtil.isAncestor(this, newRouting))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newRouting != null)
				msgs = ((InternalEObject)newRouting).eInverseAdd(this, MacroPlannerSolverPackage.LP_ROUTING__LP_BUCKETS, LPRouting.class, msgs);
			msgs = basicSetRouting(newRouting, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MacroPlannerSolverPackage.LP_ROUTING_BUCKET__ROUTING, newRouting, newRouting));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LPRoutingBucketProduct> getProducts() {
		if (products == null) {
			products = new EObjectContainmentEList<LPRoutingBucketProduct>(LPRoutingBucketProduct.class, this, MacroPlannerSolverPackage.LP_ROUTING_BUCKET__PRODUCTS);
		}
		return products;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LPRoutingBucketResource> getResources() {
		if (resources == null) {
			resources = new EObjectContainmentEList<LPRoutingBucketResource>(LPRoutingBucketResource.class, this, MacroPlannerSolverPackage.LP_ROUTING_BUCKET__RESOURCES);
		}
		return resources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratorLpVar getPlanned() {
		return planned;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlanned(GeneratorLpVar newPlanned, NotificationChain msgs) {
		GeneratorLpVar oldPlanned = planned;
		planned = newPlanned;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MacroPlannerSolverPackage.LP_ROUTING_BUCKET__PLANNED, oldPlanned, newPlanned);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlanned(GeneratorLpVar newPlanned) {
		if (newPlanned != planned) {
			NotificationChain msgs = null;
			if (planned != null)
				msgs = ((InternalEObject)planned).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MacroPlannerSolverPackage.LP_ROUTING_BUCKET__PLANNED, null, msgs);
			if (newPlanned != null)
				msgs = ((InternalEObject)newPlanned).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MacroPlannerSolverPackage.LP_ROUTING_BUCKET__PLANNED, null, msgs);
			msgs = basicSetPlanned(newPlanned, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MacroPlannerSolverPackage.LP_ROUTING_BUCKET__PLANNED, newPlanned, newPlanned));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MacroPlannerSolverPackage.LP_ROUTING_BUCKET__ROUTING:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetRouting((LPRouting)otherEnd, msgs);
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
			case MacroPlannerSolverPackage.LP_ROUTING_BUCKET__ROUTING:
				return basicSetRouting(null, msgs);
			case MacroPlannerSolverPackage.LP_ROUTING_BUCKET__PRODUCTS:
				return ((InternalEList<?>)getProducts()).basicRemove(otherEnd, msgs);
			case MacroPlannerSolverPackage.LP_ROUTING_BUCKET__RESOURCES:
				return ((InternalEList<?>)getResources()).basicRemove(otherEnd, msgs);
			case MacroPlannerSolverPackage.LP_ROUTING_BUCKET__PLANNED:
				return basicSetPlanned(null, msgs);
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
			case MacroPlannerSolverPackage.LP_ROUTING_BUCKET__ROUTING:
				return eInternalContainer().eInverseRemove(this, MacroPlannerSolverPackage.LP_ROUTING__LP_BUCKETS, LPRouting.class, msgs);
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
			case MacroPlannerSolverPackage.LP_ROUTING_BUCKET__ROUTING:
				return getRouting();
			case MacroPlannerSolverPackage.LP_ROUTING_BUCKET__PRODUCTS:
				return getProducts();
			case MacroPlannerSolverPackage.LP_ROUTING_BUCKET__RESOURCES:
				return getResources();
			case MacroPlannerSolverPackage.LP_ROUTING_BUCKET__PLANNED:
				return getPlanned();
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
			case MacroPlannerSolverPackage.LP_ROUTING_BUCKET__ROUTING:
				setRouting((LPRouting)newValue);
				return;
			case MacroPlannerSolverPackage.LP_ROUTING_BUCKET__PRODUCTS:
				getProducts().clear();
				getProducts().addAll((Collection<? extends LPRoutingBucketProduct>)newValue);
				return;
			case MacroPlannerSolverPackage.LP_ROUTING_BUCKET__RESOURCES:
				getResources().clear();
				getResources().addAll((Collection<? extends LPRoutingBucketResource>)newValue);
				return;
			case MacroPlannerSolverPackage.LP_ROUTING_BUCKET__PLANNED:
				setPlanned((GeneratorLpVar)newValue);
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
			case MacroPlannerSolverPackage.LP_ROUTING_BUCKET__ROUTING:
				setRouting((LPRouting)null);
				return;
			case MacroPlannerSolverPackage.LP_ROUTING_BUCKET__PRODUCTS:
				getProducts().clear();
				return;
			case MacroPlannerSolverPackage.LP_ROUTING_BUCKET__RESOURCES:
				getResources().clear();
				return;
			case MacroPlannerSolverPackage.LP_ROUTING_BUCKET__PLANNED:
				setPlanned((GeneratorLpVar)null);
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
			case MacroPlannerSolverPackage.LP_ROUTING_BUCKET__ROUTING:
				return getRouting() != null;
			case MacroPlannerSolverPackage.LP_ROUTING_BUCKET__PRODUCTS:
				return products != null && !products.isEmpty();
			case MacroPlannerSolverPackage.LP_ROUTING_BUCKET__RESOURCES:
				return resources != null && !resources.isEmpty();
			case MacroPlannerSolverPackage.LP_ROUTING_BUCKET__PLANNED:
				return planned != null;
		}
		return super.eIsSet(featureID);
	}

} //LPRoutingBucketImpl
