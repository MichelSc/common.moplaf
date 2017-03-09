/**
 */
package com.misc.common.moplaf.macroplanner.solver.impl;

import com.misc.common.moplaf.macroplanner.RoutingProduct;
import com.misc.common.moplaf.macroplanner.solver.LPProduct;
import com.misc.common.moplaf.macroplanner.solver.LPRouting;
import com.misc.common.moplaf.macroplanner.solver.LPRoutingBucketProduct;
import com.misc.common.moplaf.macroplanner.solver.LPRoutingProduct;
import com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage;

import com.misc.common.moplaf.solver.impl.GeneratorTupleImpl;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>LP Routing Product</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.impl.LPRoutingProductImpl#getRouting <em>Routing</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.impl.LPRoutingProductImpl#getProduct <em>Product</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.impl.LPRoutingProductImpl#getRoutingProduct <em>Routing Product</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.impl.LPRoutingProductImpl#getLPBucket <em>LP Bucket</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LPRoutingProductImpl extends GeneratorTupleImpl implements LPRoutingProduct {
	/**
	 * The cached value of the '{@link #getProduct() <em>Product</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProduct()
	 * @generated
	 * @ordered
	 */
	protected LPProduct product;

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
	 * The cached value of the '{@link #getLPBucket() <em>LP Bucket</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLPBucket()
	 * @generated
	 * @ordered
	 */
	protected LPRoutingBucketProduct lpBucket;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LPRoutingProductImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MacroPlannerSolverPackage.Literals.LP_ROUTING_PRODUCT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LPRouting getRouting() {
		if (eContainerFeatureID() != MacroPlannerSolverPackage.LP_ROUTING_PRODUCT__ROUTING) return null;
		return (LPRouting)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRouting(LPRouting newRouting, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newRouting, MacroPlannerSolverPackage.LP_ROUTING_PRODUCT__ROUTING, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRouting(LPRouting newRouting) {
		if (newRouting != eInternalContainer() || (eContainerFeatureID() != MacroPlannerSolverPackage.LP_ROUTING_PRODUCT__ROUTING && newRouting != null)) {
			if (EcoreUtil.isAncestor(this, newRouting))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newRouting != null)
				msgs = ((InternalEObject)newRouting).eInverseAdd(this, MacroPlannerSolverPackage.LP_ROUTING__PRODUCTS, LPRouting.class, msgs);
			msgs = basicSetRouting(newRouting, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MacroPlannerSolverPackage.LP_ROUTING_PRODUCT__ROUTING, newRouting, newRouting));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LPProduct getProduct() {
		if (product != null && product.eIsProxy()) {
			InternalEObject oldProduct = (InternalEObject)product;
			product = (LPProduct)eResolveProxy(oldProduct);
			if (product != oldProduct) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MacroPlannerSolverPackage.LP_ROUTING_PRODUCT__PRODUCT, oldProduct, product));
			}
		}
		return product;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LPProduct basicGetProduct() {
		return product;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProduct(LPProduct newProduct) {
		LPProduct oldProduct = product;
		product = newProduct;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MacroPlannerSolverPackage.LP_ROUTING_PRODUCT__PRODUCT, oldProduct, product));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MacroPlannerSolverPackage.LP_ROUTING_PRODUCT__ROUTING_PRODUCT, oldRoutingProduct, routingProduct));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MacroPlannerSolverPackage.LP_ROUTING_PRODUCT__ROUTING_PRODUCT, oldRoutingProduct, routingProduct));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LPRoutingBucketProduct getLPBucket() {
		if (lpBucket != null && lpBucket.eIsProxy()) {
			InternalEObject oldLPBucket = (InternalEObject)lpBucket;
			lpBucket = (LPRoutingBucketProduct)eResolveProxy(oldLPBucket);
			if (lpBucket != oldLPBucket) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MacroPlannerSolverPackage.LP_ROUTING_PRODUCT__LP_BUCKET, oldLPBucket, lpBucket));
			}
		}
		return lpBucket;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LPRoutingBucketProduct basicGetLPBucket() {
		return lpBucket;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLPBucket(LPRoutingBucketProduct newLPBucket, NotificationChain msgs) {
		LPRoutingBucketProduct oldLPBucket = lpBucket;
		lpBucket = newLPBucket;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MacroPlannerSolverPackage.LP_ROUTING_PRODUCT__LP_BUCKET, oldLPBucket, newLPBucket);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLPBucket(LPRoutingBucketProduct newLPBucket) {
		if (newLPBucket != lpBucket) {
			NotificationChain msgs = null;
			if (lpBucket != null)
				msgs = ((InternalEObject)lpBucket).eInverseRemove(this, MacroPlannerSolverPackage.LP_ROUTING_BUCKET_PRODUCT__ROUTING_PRODUCT, LPRoutingBucketProduct.class, msgs);
			if (newLPBucket != null)
				msgs = ((InternalEObject)newLPBucket).eInverseAdd(this, MacroPlannerSolverPackage.LP_ROUTING_BUCKET_PRODUCT__ROUTING_PRODUCT, LPRoutingBucketProduct.class, msgs);
			msgs = basicSetLPBucket(newLPBucket, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MacroPlannerSolverPackage.LP_ROUTING_PRODUCT__LP_BUCKET, newLPBucket, newLPBucket));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MacroPlannerSolverPackage.LP_ROUTING_PRODUCT__ROUTING:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetRouting((LPRouting)otherEnd, msgs);
			case MacroPlannerSolverPackage.LP_ROUTING_PRODUCT__LP_BUCKET:
				if (lpBucket != null)
					msgs = ((InternalEObject)lpBucket).eInverseRemove(this, MacroPlannerSolverPackage.LP_ROUTING_BUCKET_PRODUCT__ROUTING_PRODUCT, LPRoutingBucketProduct.class, msgs);
				return basicSetLPBucket((LPRoutingBucketProduct)otherEnd, msgs);
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
			case MacroPlannerSolverPackage.LP_ROUTING_PRODUCT__ROUTING:
				return basicSetRouting(null, msgs);
			case MacroPlannerSolverPackage.LP_ROUTING_PRODUCT__LP_BUCKET:
				return basicSetLPBucket(null, msgs);
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
			case MacroPlannerSolverPackage.LP_ROUTING_PRODUCT__ROUTING:
				return eInternalContainer().eInverseRemove(this, MacroPlannerSolverPackage.LP_ROUTING__PRODUCTS, LPRouting.class, msgs);
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
			case MacroPlannerSolverPackage.LP_ROUTING_PRODUCT__ROUTING:
				return getRouting();
			case MacroPlannerSolverPackage.LP_ROUTING_PRODUCT__PRODUCT:
				if (resolve) return getProduct();
				return basicGetProduct();
			case MacroPlannerSolverPackage.LP_ROUTING_PRODUCT__ROUTING_PRODUCT:
				if (resolve) return getRoutingProduct();
				return basicGetRoutingProduct();
			case MacroPlannerSolverPackage.LP_ROUTING_PRODUCT__LP_BUCKET:
				if (resolve) return getLPBucket();
				return basicGetLPBucket();
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
			case MacroPlannerSolverPackage.LP_ROUTING_PRODUCT__ROUTING:
				setRouting((LPRouting)newValue);
				return;
			case MacroPlannerSolverPackage.LP_ROUTING_PRODUCT__PRODUCT:
				setProduct((LPProduct)newValue);
				return;
			case MacroPlannerSolverPackage.LP_ROUTING_PRODUCT__ROUTING_PRODUCT:
				setRoutingProduct((RoutingProduct)newValue);
				return;
			case MacroPlannerSolverPackage.LP_ROUTING_PRODUCT__LP_BUCKET:
				setLPBucket((LPRoutingBucketProduct)newValue);
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
			case MacroPlannerSolverPackage.LP_ROUTING_PRODUCT__ROUTING:
				setRouting((LPRouting)null);
				return;
			case MacroPlannerSolverPackage.LP_ROUTING_PRODUCT__PRODUCT:
				setProduct((LPProduct)null);
				return;
			case MacroPlannerSolverPackage.LP_ROUTING_PRODUCT__ROUTING_PRODUCT:
				setRoutingProduct((RoutingProduct)null);
				return;
			case MacroPlannerSolverPackage.LP_ROUTING_PRODUCT__LP_BUCKET:
				setLPBucket((LPRoutingBucketProduct)null);
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
			case MacroPlannerSolverPackage.LP_ROUTING_PRODUCT__ROUTING:
				return getRouting() != null;
			case MacroPlannerSolverPackage.LP_ROUTING_PRODUCT__PRODUCT:
				return product != null;
			case MacroPlannerSolverPackage.LP_ROUTING_PRODUCT__ROUTING_PRODUCT:
				return routingProduct != null;
			case MacroPlannerSolverPackage.LP_ROUTING_PRODUCT__LP_BUCKET:
				return lpBucket != null;
		}
		return super.eIsSet(featureID);
	}

} //LPRoutingProductImpl
