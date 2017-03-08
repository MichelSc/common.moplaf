/**
 */
package com.misc.common.moplaf.macroplanner.solver.impl;

import com.misc.common.moplaf.macroplanner.solver.LPProductBucket;
import com.misc.common.moplaf.macroplanner.solver.LPSupply;
import com.misc.common.moplaf.macroplanner.solver.LPSupplyBucket;
import com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage;

import com.misc.common.moplaf.solver.GeneratorLpVar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>LP Supply Bucket</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.impl.LPSupplyBucketImpl#getSupply <em>Supply</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.impl.LPSupplyBucketImpl#getProductBucket <em>Product Bucket</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.impl.LPSupplyBucketImpl#getSupplied <em>Supplied</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LPSupplyBucketImpl extends LPTimeBucketImpl implements LPSupplyBucket {
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
	 * The cached value of the '{@link #getSupplied() <em>Supplied</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplied()
	 * @generated
	 * @ordered
	 */
	protected GeneratorLpVar supplied;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LPSupplyBucketImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MacroPlannerSolverPackage.Literals.LP_SUPPLY_BUCKET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LPSupply getSupply() {
		if (eContainerFeatureID() != MacroPlannerSolverPackage.LP_SUPPLY_BUCKET__SUPPLY) return null;
		return (LPSupply)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSupply(LPSupply newSupply, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSupply, MacroPlannerSolverPackage.LP_SUPPLY_BUCKET__SUPPLY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSupply(LPSupply newSupply) {
		if (newSupply != eInternalContainer() || (eContainerFeatureID() != MacroPlannerSolverPackage.LP_SUPPLY_BUCKET__SUPPLY && newSupply != null)) {
			if (EcoreUtil.isAncestor(this, newSupply))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSupply != null)
				msgs = ((InternalEObject)newSupply).eInverseAdd(this, MacroPlannerSolverPackage.LP_SUPPLY__LP_BUCKETS, LPSupply.class, msgs);
			msgs = basicSetSupply(newSupply, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MacroPlannerSolverPackage.LP_SUPPLY_BUCKET__SUPPLY, newSupply, newSupply));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MacroPlannerSolverPackage.LP_SUPPLY_BUCKET__PRODUCT_BUCKET, oldProductBucket, productBucket));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MacroPlannerSolverPackage.LP_SUPPLY_BUCKET__PRODUCT_BUCKET, oldProductBucket, newProductBucket);
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
				msgs = ((InternalEObject)productBucket).eInverseRemove(this, MacroPlannerSolverPackage.LP_PRODUCT_BUCKET__SUPPLIES, LPProductBucket.class, msgs);
			if (newProductBucket != null)
				msgs = ((InternalEObject)newProductBucket).eInverseAdd(this, MacroPlannerSolverPackage.LP_PRODUCT_BUCKET__SUPPLIES, LPProductBucket.class, msgs);
			msgs = basicSetProductBucket(newProductBucket, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MacroPlannerSolverPackage.LP_SUPPLY_BUCKET__PRODUCT_BUCKET, newProductBucket, newProductBucket));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratorLpVar getSupplied() {
		return supplied;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSupplied(GeneratorLpVar newSupplied, NotificationChain msgs) {
		GeneratorLpVar oldSupplied = supplied;
		supplied = newSupplied;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MacroPlannerSolverPackage.LP_SUPPLY_BUCKET__SUPPLIED, oldSupplied, newSupplied);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSupplied(GeneratorLpVar newSupplied) {
		if (newSupplied != supplied) {
			NotificationChain msgs = null;
			if (supplied != null)
				msgs = ((InternalEObject)supplied).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MacroPlannerSolverPackage.LP_SUPPLY_BUCKET__SUPPLIED, null, msgs);
			if (newSupplied != null)
				msgs = ((InternalEObject)newSupplied).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MacroPlannerSolverPackage.LP_SUPPLY_BUCKET__SUPPLIED, null, msgs);
			msgs = basicSetSupplied(newSupplied, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MacroPlannerSolverPackage.LP_SUPPLY_BUCKET__SUPPLIED, newSupplied, newSupplied));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MacroPlannerSolverPackage.LP_SUPPLY_BUCKET__SUPPLY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSupply((LPSupply)otherEnd, msgs);
			case MacroPlannerSolverPackage.LP_SUPPLY_BUCKET__PRODUCT_BUCKET:
				if (productBucket != null)
					msgs = ((InternalEObject)productBucket).eInverseRemove(this, MacroPlannerSolverPackage.LP_PRODUCT_BUCKET__SUPPLIES, LPProductBucket.class, msgs);
				return basicSetProductBucket((LPProductBucket)otherEnd, msgs);
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
			case MacroPlannerSolverPackage.LP_SUPPLY_BUCKET__SUPPLY:
				return basicSetSupply(null, msgs);
			case MacroPlannerSolverPackage.LP_SUPPLY_BUCKET__PRODUCT_BUCKET:
				return basicSetProductBucket(null, msgs);
			case MacroPlannerSolverPackage.LP_SUPPLY_BUCKET__SUPPLIED:
				return basicSetSupplied(null, msgs);
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
			case MacroPlannerSolverPackage.LP_SUPPLY_BUCKET__SUPPLY:
				return eInternalContainer().eInverseRemove(this, MacroPlannerSolverPackage.LP_SUPPLY__LP_BUCKETS, LPSupply.class, msgs);
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
			case MacroPlannerSolverPackage.LP_SUPPLY_BUCKET__SUPPLY:
				return getSupply();
			case MacroPlannerSolverPackage.LP_SUPPLY_BUCKET__PRODUCT_BUCKET:
				if (resolve) return getProductBucket();
				return basicGetProductBucket();
			case MacroPlannerSolverPackage.LP_SUPPLY_BUCKET__SUPPLIED:
				return getSupplied();
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
			case MacroPlannerSolverPackage.LP_SUPPLY_BUCKET__SUPPLY:
				setSupply((LPSupply)newValue);
				return;
			case MacroPlannerSolverPackage.LP_SUPPLY_BUCKET__PRODUCT_BUCKET:
				setProductBucket((LPProductBucket)newValue);
				return;
			case MacroPlannerSolverPackage.LP_SUPPLY_BUCKET__SUPPLIED:
				setSupplied((GeneratorLpVar)newValue);
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
			case MacroPlannerSolverPackage.LP_SUPPLY_BUCKET__SUPPLY:
				setSupply((LPSupply)null);
				return;
			case MacroPlannerSolverPackage.LP_SUPPLY_BUCKET__PRODUCT_BUCKET:
				setProductBucket((LPProductBucket)null);
				return;
			case MacroPlannerSolverPackage.LP_SUPPLY_BUCKET__SUPPLIED:
				setSupplied((GeneratorLpVar)null);
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
			case MacroPlannerSolverPackage.LP_SUPPLY_BUCKET__SUPPLY:
				return getSupply() != null;
			case MacroPlannerSolverPackage.LP_SUPPLY_BUCKET__PRODUCT_BUCKET:
				return productBucket != null;
			case MacroPlannerSolverPackage.LP_SUPPLY_BUCKET__SUPPLIED:
				return supplied != null;
		}
		return super.eIsSet(featureID);
	}

} //LPSupplyBucketImpl
