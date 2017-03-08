/**
 */
package com.misc.common.moplaf.macroplanner.solver.impl;

import com.misc.common.moplaf.macroplanner.RoutingProduct;

import com.misc.common.moplaf.macroplanner.solver.LPProductBucket;
import com.misc.common.moplaf.macroplanner.solver.LPRoutingBucketProduct;
import com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

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
	protected RoutingProduct routingProduct;

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
	public void setProductBucket(LPProductBucket newProductBucket) {
		LPProductBucket oldProductBucket = productBucket;
		productBucket = newProductBucket;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MacroPlannerSolverPackage.LP_ROUTING_BUCKET_PRODUCT__PRODUCT_BUCKET, oldProductBucket, productBucket));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoutingProduct getRoutingProduct() {
		if (routingProduct != null && routingProduct.eIsProxy()) {
			InternalEObject oldRoutingProduct = (InternalEObject)routingProduct;
			routingProduct = (RoutingProduct)eResolveProxy(oldRoutingProduct);
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
	public RoutingProduct basicGetRoutingProduct() {
		return routingProduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoutingProduct(RoutingProduct newRoutingProduct) {
		RoutingProduct oldRoutingProduct = routingProduct;
		routingProduct = newRoutingProduct;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MacroPlannerSolverPackage.LP_ROUTING_BUCKET_PRODUCT__ROUTING_PRODUCT, oldRoutingProduct, routingProduct));
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
				setRoutingProduct((RoutingProduct)newValue);
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
				setRoutingProduct((RoutingProduct)null);
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
		}
		return super.eIsSet(featureID);
	}

} //LPRoutingBucketProductImpl
