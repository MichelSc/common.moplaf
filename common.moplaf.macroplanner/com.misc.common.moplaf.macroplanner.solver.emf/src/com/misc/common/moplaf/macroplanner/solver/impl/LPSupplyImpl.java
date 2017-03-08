/**
 */
package com.misc.common.moplaf.macroplanner.solver.impl;

import com.misc.common.moplaf.macroplanner.Supply;
import com.misc.common.moplaf.macroplanner.solver.LPMacroPlanner;
import com.misc.common.moplaf.macroplanner.solver.LPProduct;
import com.misc.common.moplaf.macroplanner.solver.LPProductSet;
import com.misc.common.moplaf.macroplanner.solver.LPSupply;
import com.misc.common.moplaf.macroplanner.solver.LPSupplyBucket;
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
 * An implementation of the model object '<em><b>LP Supply</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.impl.LPSupplyImpl#getSupply <em>Supply</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.impl.LPSupplyImpl#getLPBuckets <em>LP Buckets</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.impl.LPSupplyImpl#getProduct <em>Product</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LPSupplyImpl extends LPTimeLineImpl implements LPSupply {
	/**
	 * The cached value of the '{@link #getSupply() <em>Supply</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupply()
	 * @generated
	 * @ordered
	 */
	protected Supply supply;

	/**
	 * The cached value of the '{@link #getLPBuckets() <em>LP Buckets</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLPBuckets()
	 * @generated
	 * @ordered
	 */
	protected EList<LPSupplyBucket> lpBuckets;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LPSupplyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MacroPlannerSolverPackage.Literals.LP_SUPPLY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Supply getSupply() {
		if (supply != null && supply.eIsProxy()) {
			InternalEObject oldSupply = (InternalEObject)supply;
			supply = (Supply)eResolveProxy(oldSupply);
			if (supply != oldSupply) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MacroPlannerSolverPackage.LP_SUPPLY__SUPPLY, oldSupply, supply));
			}
		}
		return supply;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Supply basicGetSupply() {
		return supply;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSupply(Supply newSupply) {
		Supply oldSupply = supply;
		supply = newSupply;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MacroPlannerSolverPackage.LP_SUPPLY__SUPPLY, oldSupply, supply));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LPSupplyBucket> getLPBuckets() {
		if (lpBuckets == null) {
			lpBuckets = new EObjectContainmentWithInverseEList<LPSupplyBucket>(LPSupplyBucket.class, this, MacroPlannerSolverPackage.LP_SUPPLY__LP_BUCKETS, MacroPlannerSolverPackage.LP_SUPPLY_BUCKET__SUPPLY);
		}
		return lpBuckets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LPProduct getProduct() {
		if (eContainerFeatureID() != MacroPlannerSolverPackage.LP_SUPPLY__PRODUCT) return null;
		return (LPProduct)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProduct(LPProduct newProduct, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newProduct, MacroPlannerSolverPackage.LP_SUPPLY__PRODUCT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProduct(LPProduct newProduct) {
		if (newProduct != eInternalContainer() || (eContainerFeatureID() != MacroPlannerSolverPackage.LP_SUPPLY__PRODUCT && newProduct != null)) {
			if (EcoreUtil.isAncestor(this, newProduct))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newProduct != null)
				msgs = ((InternalEObject)newProduct).eInverseAdd(this, MacroPlannerSolverPackage.LP_PRODUCT__SUPPLIES, LPProduct.class, msgs);
			msgs = basicSetProduct(newProduct, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MacroPlannerSolverPackage.LP_SUPPLY__PRODUCT, newProduct, newProduct));
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
			case MacroPlannerSolverPackage.LP_SUPPLY__LP_BUCKETS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLPBuckets()).basicAdd(otherEnd, msgs);
			case MacroPlannerSolverPackage.LP_SUPPLY__PRODUCT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetProduct((LPProduct)otherEnd, msgs);
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
			case MacroPlannerSolverPackage.LP_SUPPLY__LP_BUCKETS:
				return ((InternalEList<?>)getLPBuckets()).basicRemove(otherEnd, msgs);
			case MacroPlannerSolverPackage.LP_SUPPLY__PRODUCT:
				return basicSetProduct(null, msgs);
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
			case MacroPlannerSolverPackage.LP_SUPPLY__PRODUCT:
				return eInternalContainer().eInverseRemove(this, MacroPlannerSolverPackage.LP_PRODUCT__SUPPLIES, LPProduct.class, msgs);
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
			case MacroPlannerSolverPackage.LP_SUPPLY__SUPPLY:
				if (resolve) return getSupply();
				return basicGetSupply();
			case MacroPlannerSolverPackage.LP_SUPPLY__LP_BUCKETS:
				return getLPBuckets();
			case MacroPlannerSolverPackage.LP_SUPPLY__PRODUCT:
				return getProduct();
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
			case MacroPlannerSolverPackage.LP_SUPPLY__SUPPLY:
				setSupply((Supply)newValue);
				return;
			case MacroPlannerSolverPackage.LP_SUPPLY__LP_BUCKETS:
				getLPBuckets().clear();
				getLPBuckets().addAll((Collection<? extends LPSupplyBucket>)newValue);
				return;
			case MacroPlannerSolverPackage.LP_SUPPLY__PRODUCT:
				setProduct((LPProduct)newValue);
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
			case MacroPlannerSolverPackage.LP_SUPPLY__SUPPLY:
				setSupply((Supply)null);
				return;
			case MacroPlannerSolverPackage.LP_SUPPLY__LP_BUCKETS:
				getLPBuckets().clear();
				return;
			case MacroPlannerSolverPackage.LP_SUPPLY__PRODUCT:
				setProduct((LPProduct)null);
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
			case MacroPlannerSolverPackage.LP_SUPPLY__SUPPLY:
				return supply != null;
			case MacroPlannerSolverPackage.LP_SUPPLY__LP_BUCKETS:
				return lpBuckets != null && !lpBuckets.isEmpty();
			case MacroPlannerSolverPackage.LP_SUPPLY__PRODUCT:
				return getProduct() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public ObjectTimeBucket constructObjectTimeBucket() {
		LPSupplyBucket newbucket = MacroPlannerSolverFactory.eINSTANCE.createLPSupplyBucket();
		this.getLPBuckets().add(newbucket);
		return newbucket;
	}


	/**
	 * 
	 */
	@Override
	public void generateTuples() {
		super.generateTuples();

		LPProduct product = this.getProduct();
		LPProductSet products = product.getProductSet();
		LPMacroPlanner lp = products.getMacroPlanner();
		TimeLine timeline = lp.getTimeLine();
		Supply supply = this.getSupply();

		// time line
		TimeBucket startOfHorizon = timeline.getBucketFloor(supply.getFrom());
		TimeBucket endOfHorizon   = timeline.getBucketCeil(supply.getTo());
		this.setStartBucket(startOfHorizon);
		this.setEndBucket  (endOfHorizon);
		this.refresh();
}
} //LPSupplyImpl
