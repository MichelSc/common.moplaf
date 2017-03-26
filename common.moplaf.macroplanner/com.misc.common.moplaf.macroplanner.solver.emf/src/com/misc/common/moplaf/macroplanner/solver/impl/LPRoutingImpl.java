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
package com.misc.common.moplaf.macroplanner.solver.impl;

import com.misc.common.moplaf.macroplanner.Routing;
import com.misc.common.moplaf.macroplanner.RoutingProduct;
import com.misc.common.moplaf.macroplanner.RoutingResource;
import com.misc.common.moplaf.macroplanner.solver.LPMacroPlanner;
import com.misc.common.moplaf.macroplanner.solver.LPProduct;
import com.misc.common.moplaf.macroplanner.solver.LPProductSet;
import com.misc.common.moplaf.macroplanner.solver.LPResource;
import com.misc.common.moplaf.macroplanner.solver.LPResourceSet;
import com.misc.common.moplaf.macroplanner.solver.LPRouting;
import com.misc.common.moplaf.macroplanner.solver.LPRoutingBucket;
import com.misc.common.moplaf.macroplanner.solver.LPRoutingProduct;
import com.misc.common.moplaf.macroplanner.solver.LPRoutingResource;
import com.misc.common.moplaf.macroplanner.solver.LPRoutingSet;
import com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverFactory;
import com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage;
import com.misc.common.moplaf.time.discrete.ObjectTimeBucket;
import com.misc.common.moplaf.time.discrete.TimeBucket;
import com.misc.common.moplaf.time.discrete.TimeLine;

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
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.impl.LPRoutingImpl#getProducts <em>Products</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.impl.LPRoutingImpl#getResources <em>Resources</em>}</li>
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
	 * The cached value of the '{@link #getProducts() <em>Products</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProducts()
	 * @generated
	 * @ordered
	 */
	protected EList<LPRoutingProduct> products;

	/**
	 * The cached value of the '{@link #getResources() <em>Resources</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResources()
	 * @generated
	 * @ordered
	 */
	protected EList<LPRoutingResource> resources;

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
	public EList<LPRoutingProduct> getProducts() {
		if (products == null) {
			products = new EObjectContainmentWithInverseEList<LPRoutingProduct>(LPRoutingProduct.class, this, MacroPlannerSolverPackage.LP_ROUTING__PRODUCTS, MacroPlannerSolverPackage.LP_ROUTING_PRODUCT__ROUTING);
		}
		return products;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LPRoutingResource> getResources() {
		if (resources == null) {
			resources = new EObjectContainmentWithInverseEList<LPRoutingResource>(LPRoutingResource.class, this, MacroPlannerSolverPackage.LP_ROUTING__RESOURCES, MacroPlannerSolverPackage.LP_ROUTING_RESOURCE__ROUTING);
		}
		return resources;
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
			case MacroPlannerSolverPackage.LP_ROUTING__PRODUCTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProducts()).basicAdd(otherEnd, msgs);
			case MacroPlannerSolverPackage.LP_ROUTING__RESOURCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getResources()).basicAdd(otherEnd, msgs);
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
			case MacroPlannerSolverPackage.LP_ROUTING__PRODUCTS:
				return ((InternalEList<?>)getProducts()).basicRemove(otherEnd, msgs);
			case MacroPlannerSolverPackage.LP_ROUTING__RESOURCES:
				return ((InternalEList<?>)getResources()).basicRemove(otherEnd, msgs);
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
			case MacroPlannerSolverPackage.LP_ROUTING__PRODUCTS:
				return getProducts();
			case MacroPlannerSolverPackage.LP_ROUTING__RESOURCES:
				return getResources();
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
			case MacroPlannerSolverPackage.LP_ROUTING__PRODUCTS:
				getProducts().clear();
				getProducts().addAll((Collection<? extends LPRoutingProduct>)newValue);
				return;
			case MacroPlannerSolverPackage.LP_ROUTING__RESOURCES:
				getResources().clear();
				getResources().addAll((Collection<? extends LPRoutingResource>)newValue);
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
			case MacroPlannerSolverPackage.LP_ROUTING__PRODUCTS:
				getProducts().clear();
				return;
			case MacroPlannerSolverPackage.LP_ROUTING__RESOURCES:
				getResources().clear();
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
			case MacroPlannerSolverPackage.LP_ROUTING__PRODUCTS:
				return products != null && !products.isEmpty();
			case MacroPlannerSolverPackage.LP_ROUTING__RESOURCES:
				return resources != null && !resources.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public ObjectTimeBucket constructObjectTimeBucket() {
		LPRoutingBucket newbucket = MacroPlannerSolverFactory.eINSTANCE.createLPRoutingBucket();
		this.getLPBuckets().add(newbucket);
		return newbucket;
	}


	/**
	 * 
	 */
	@Override
	public void generateTuples() {
		super.generateTuples();

		LPRoutingSet routings = this.getRoutingSet();
		LPMacroPlanner lp = routings.getMacroPlanner();
		LPProductSet products = lp.getProductSet();
		LPResourceSet resources = lp.getResourceSet();
		TimeLine timeline = lp.getTimeLine();
		
		// products
		for ( RoutingProduct product : this.getRouting().getProducts()){
			LPProduct lpproduct = products.getProduct(product.getLocationProduct());
			LPRoutingProduct lproutingproduct = MacroPlannerSolverFactory.eINSTANCE.createLPRoutingProduct();
			lproutingproduct.setProduct(lpproduct);
			lproutingproduct.setRoutingProduct(product);
			this.getProducts().add(lproutingproduct); // owning
		}
		
		// resources
		for ( RoutingResource resource: this.getRouting().getResources()){
			LPResource lpresource = resources.getResource(resource.getLocationResource());
			LPRoutingResource lproutingresource = MacroPlannerSolverFactory.eINSTANCE.createLPRoutingResource();
			lproutingresource.setResource(lpresource);
			lproutingresource.setRoutingResource(resource);
			this.getResources().add(lproutingresource); // owning
		}
		
		// time line
		TimeBucket startOfHorizon = timeline.getFirstBucket();
		TimeBucket endOfHorizon   = timeline.getLastBucket();
		this.setStartBucket(startOfHorizon);
		this.setEndBucket  (endOfHorizon);
		this.refresh();
	}
} //LPRoutingImpl
