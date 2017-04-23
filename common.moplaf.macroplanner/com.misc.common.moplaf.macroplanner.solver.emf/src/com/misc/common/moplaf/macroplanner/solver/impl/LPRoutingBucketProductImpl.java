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

import com.misc.common.moplaf.macroplanner.solver.LPProductBucket;
import com.misc.common.moplaf.macroplanner.solver.LPRoutingBucket;
import com.misc.common.moplaf.macroplanner.solver.LPRoutingBucketProduct;
import com.misc.common.moplaf.macroplanner.solver.LPRoutingProduct;
import com.misc.common.moplaf.macroplanner.solver.LPRoutingResource;
import com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>LP Routing Bucket Product</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.impl.LPRoutingBucketProductImpl#getProductBucket <em>Product Bucket</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.impl.LPRoutingBucketProductImpl#getRoutingProduct <em>Routing Product</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.impl.LPRoutingBucketProductImpl#getRouting <em>Routing</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LPRoutingBucketProductImpl extends LPTupleImpl implements LPRoutingBucketProduct {
	/**
	 * The cached value of the '{@link #getProductBucket() <em>Product Bucket</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductBucket()
	 * @generated
	 * @ordered
	 */
	protected LPProductBucket productBucket;

	/**
	 * The cached value of the '{@link #getRoutingProduct() <em>Routing Product</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoutingProduct()
	 * @generated
	 * @ordered
	 */
	protected LPRoutingProduct routingProduct;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LPRoutingBucketProductImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MacroPlannerSolverPackage.Literals.LP_ROUTING_BUCKET_PRODUCT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LPProductBucket getProductBucket() {
		if (productBucket != null && productBucket.eIsProxy()) {
			InternalEObject oldProductBucket = (InternalEObject)productBucket;
			productBucket = (LPProductBucket)eResolveProxy(oldProductBucket);
			if (productBucket != oldProductBucket) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MacroPlannerSolverPackage.LP_ROUTING_BUCKET_PRODUCT__PRODUCT_BUCKET, oldProductBucket, productBucket));
			}
		}
		return productBucket;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LPProductBucket basicGetProductBucket() {
		return productBucket;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProductBucket(LPProductBucket newProductBucket, NotificationChain msgs) {
		LPProductBucket oldProductBucket = productBucket;
		productBucket = newProductBucket;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MacroPlannerSolverPackage.LP_ROUTING_BUCKET_PRODUCT__PRODUCT_BUCKET, oldProductBucket, newProductBucket);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProductBucket(LPProductBucket newProductBucket) {
		if (newProductBucket != productBucket) {
			NotificationChain msgs = null;
			if (productBucket != null)
				msgs = ((InternalEObject)productBucket).eInverseRemove(this, MacroPlannerSolverPackage.LP_PRODUCT_BUCKET__CONSUMPTIONS, LPProductBucket.class, msgs);
			if (newProductBucket != null)
				msgs = ((InternalEObject)newProductBucket).eInverseAdd(this, MacroPlannerSolverPackage.LP_PRODUCT_BUCKET__CONSUMPTIONS, LPProductBucket.class, msgs);
			msgs = basicSetProductBucket(newProductBucket, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MacroPlannerSolverPackage.LP_ROUTING_BUCKET_PRODUCT__PRODUCT_BUCKET, newProductBucket, newProductBucket));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LPRoutingProduct getRoutingProduct() {
		if (routingProduct != null && routingProduct.eIsProxy()) {
			InternalEObject oldRoutingProduct = (InternalEObject)routingProduct;
			routingProduct = (LPRoutingProduct)eResolveProxy(oldRoutingProduct);
			if (routingProduct != oldRoutingProduct) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MacroPlannerSolverPackage.LP_ROUTING_BUCKET_PRODUCT__ROUTING_PRODUCT, oldRoutingProduct, routingProduct));
			}
		}
		return routingProduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LPRoutingProduct basicGetRoutingProduct() {
		return routingProduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRoutingProduct(LPRoutingProduct newRoutingProduct, NotificationChain msgs) {
		LPRoutingProduct oldRoutingProduct = routingProduct;
		routingProduct = newRoutingProduct;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MacroPlannerSolverPackage.LP_ROUTING_BUCKET_PRODUCT__ROUTING_PRODUCT, oldRoutingProduct, newRoutingProduct);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoutingProduct(LPRoutingProduct newRoutingProduct) {
		if (newRoutingProduct != routingProduct) {
			NotificationChain msgs = null;
			if (routingProduct != null)
				msgs = ((InternalEObject)routingProduct).eInverseRemove(this, MacroPlannerSolverPackage.LP_ROUTING_PRODUCT__LP_BUCKETS, LPRoutingProduct.class, msgs);
			if (newRoutingProduct != null)
				msgs = ((InternalEObject)newRoutingProduct).eInverseAdd(this, MacroPlannerSolverPackage.LP_ROUTING_PRODUCT__LP_BUCKETS, LPRoutingProduct.class, msgs);
			msgs = basicSetRoutingProduct(newRoutingProduct, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MacroPlannerSolverPackage.LP_ROUTING_BUCKET_PRODUCT__ROUTING_PRODUCT, newRoutingProduct, newRoutingProduct));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LPRoutingBucket getRouting() {
		if (eContainerFeatureID() != MacroPlannerSolverPackage.LP_ROUTING_BUCKET_PRODUCT__ROUTING) return null;
		return (LPRoutingBucket)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRouting(LPRoutingBucket newRouting, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newRouting, MacroPlannerSolverPackage.LP_ROUTING_BUCKET_PRODUCT__ROUTING, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRouting(LPRoutingBucket newRouting) {
		if (newRouting != eInternalContainer() || (eContainerFeatureID() != MacroPlannerSolverPackage.LP_ROUTING_BUCKET_PRODUCT__ROUTING && newRouting != null)) {
			if (EcoreUtil.isAncestor(this, newRouting))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newRouting != null)
				msgs = ((InternalEObject)newRouting).eInverseAdd(this, MacroPlannerSolverPackage.LP_ROUTING_BUCKET__PRODUCTS, LPRoutingBucket.class, msgs);
			msgs = basicSetRouting(newRouting, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MacroPlannerSolverPackage.LP_ROUTING_BUCKET_PRODUCT__ROUTING, newRouting, newRouting));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MacroPlannerSolverPackage.LP_ROUTING_BUCKET_PRODUCT__PRODUCT_BUCKET:
				if (productBucket != null)
					msgs = ((InternalEObject)productBucket).eInverseRemove(this, MacroPlannerSolverPackage.LP_PRODUCT_BUCKET__CONSUMPTIONS, LPProductBucket.class, msgs);
				return basicSetProductBucket((LPProductBucket)otherEnd, msgs);
			case MacroPlannerSolverPackage.LP_ROUTING_BUCKET_PRODUCT__ROUTING_PRODUCT:
				if (routingProduct != null)
					msgs = ((InternalEObject)routingProduct).eInverseRemove(this, MacroPlannerSolverPackage.LP_ROUTING_PRODUCT__LP_BUCKETS, LPRoutingProduct.class, msgs);
				return basicSetRoutingProduct((LPRoutingProduct)otherEnd, msgs);
			case MacroPlannerSolverPackage.LP_ROUTING_BUCKET_PRODUCT__ROUTING:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetRouting((LPRoutingBucket)otherEnd, msgs);
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
			case MacroPlannerSolverPackage.LP_ROUTING_BUCKET_PRODUCT__PRODUCT_BUCKET:
				return basicSetProductBucket(null, msgs);
			case MacroPlannerSolverPackage.LP_ROUTING_BUCKET_PRODUCT__ROUTING_PRODUCT:
				return basicSetRoutingProduct(null, msgs);
			case MacroPlannerSolverPackage.LP_ROUTING_BUCKET_PRODUCT__ROUTING:
				return basicSetRouting(null, msgs);
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
			case MacroPlannerSolverPackage.LP_ROUTING_BUCKET_PRODUCT__ROUTING:
				return eInternalContainer().eInverseRemove(this, MacroPlannerSolverPackage.LP_ROUTING_BUCKET__PRODUCTS, LPRoutingBucket.class, msgs);
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
			case MacroPlannerSolverPackage.LP_ROUTING_BUCKET_PRODUCT__PRODUCT_BUCKET:
				if (resolve) return getProductBucket();
				return basicGetProductBucket();
			case MacroPlannerSolverPackage.LP_ROUTING_BUCKET_PRODUCT__ROUTING_PRODUCT:
				if (resolve) return getRoutingProduct();
				return basicGetRoutingProduct();
			case MacroPlannerSolverPackage.LP_ROUTING_BUCKET_PRODUCT__ROUTING:
				return getRouting();
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
			case MacroPlannerSolverPackage.LP_ROUTING_BUCKET_PRODUCT__PRODUCT_BUCKET:
				setProductBucket((LPProductBucket)newValue);
				return;
			case MacroPlannerSolverPackage.LP_ROUTING_BUCKET_PRODUCT__ROUTING_PRODUCT:
				setRoutingProduct((LPRoutingProduct)newValue);
				return;
			case MacroPlannerSolverPackage.LP_ROUTING_BUCKET_PRODUCT__ROUTING:
				setRouting((LPRoutingBucket)newValue);
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
			case MacroPlannerSolverPackage.LP_ROUTING_BUCKET_PRODUCT__PRODUCT_BUCKET:
				setProductBucket((LPProductBucket)null);
				return;
			case MacroPlannerSolverPackage.LP_ROUTING_BUCKET_PRODUCT__ROUTING_PRODUCT:
				setRoutingProduct((LPRoutingProduct)null);
				return;
			case MacroPlannerSolverPackage.LP_ROUTING_BUCKET_PRODUCT__ROUTING:
				setRouting((LPRoutingBucket)null);
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
			case MacroPlannerSolverPackage.LP_ROUTING_BUCKET_PRODUCT__PRODUCT_BUCKET:
				return productBucket != null;
			case MacroPlannerSolverPackage.LP_ROUTING_BUCKET_PRODUCT__ROUTING_PRODUCT:
				return routingProduct != null;
			case MacroPlannerSolverPackage.LP_ROUTING_BUCKET_PRODUCT__ROUTING:
				return getRouting() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * 
	 */
	@Override
	public void generateTuples() {
		super.generateTuples();
		
		LPRoutingProduct product = this.getRoutingProduct();
		String  bucket = this.getRouting().getBucketShortName();
		
		// logic name
		String name = String.format("%s,%s", product.getName(), bucket);
		this.setName(name);
	}
} //LPRoutingBucketProductImpl
