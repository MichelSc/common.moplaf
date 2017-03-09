/**
 */
package com.misc.common.moplaf.macroplanner.solver.impl;


import com.misc.common.moplaf.macroplanner.RoutingProduct;
import com.misc.common.moplaf.macroplanner.solver.LPCapacityBucket;
import com.misc.common.moplaf.macroplanner.solver.LPProduct;
import com.misc.common.moplaf.macroplanner.solver.LPProductBucket;
import com.misc.common.moplaf.macroplanner.solver.LPRoutingBucket;
import com.misc.common.moplaf.macroplanner.solver.LPRoutingBucketProduct;
import com.misc.common.moplaf.macroplanner.solver.LPRoutingProduct;
import com.misc.common.moplaf.macroplanner.solver.LPSupplyBucket;
import com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage;
import com.misc.common.moplaf.solver.EnumLpConsType;
import com.misc.common.moplaf.solver.EnumLpVarType;
import com.misc.common.moplaf.solver.GeneratorLpCons;
import com.misc.common.moplaf.solver.GeneratorLpVar;
import com.misc.common.moplaf.solver.SolverFactory;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>LP Product Bucket</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.impl.LPProductBucketImpl#getProduct <em>Product</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.impl.LPProductBucketImpl#getCapacities <em>Capacities</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.impl.LPProductBucketImpl#getSupplies <em>Supplies</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.impl.LPProductBucketImpl#getConsumptions <em>Consumptions</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.impl.LPProductBucketImpl#getConsumed <em>Consumed</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.impl.LPProductBucketImpl#getSupplied <em>Supplied</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.impl.LPProductBucketImpl#getStocked <em>Stocked</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.impl.LPProductBucketImpl#getCalcConsumed <em>Calc Consumed</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.impl.LPProductBucketImpl#getCalcSupplied <em>Calc Supplied</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.impl.LPProductBucketImpl#getBalance <em>Balance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LPProductBucketImpl extends LPTimeBucketImpl implements LPProductBucket {
	/**
	 * The cached value of the '{@link #getCapacities() <em>Capacities</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacities()
	 * @generated
	 * @ordered
	 */
	protected EList<LPCapacityBucket> capacities;

	/**
	 * The cached value of the '{@link #getSupplies() <em>Supplies</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplies()
	 * @generated
	 * @ordered
	 */
	protected EList<LPSupplyBucket> supplies;

	/**
	 * The cached value of the '{@link #getConsumptions() <em>Consumptions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsumptions()
	 * @generated
	 * @ordered
	 */
	protected EList<LPRoutingBucketProduct> consumptions;

	/**
	 * The cached value of the '{@link #getConsumed() <em>Consumed</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsumed()
	 * @generated
	 * @ordered
	 */
	protected GeneratorLpVar consumed;

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
	 * The cached value of the '{@link #getStocked() <em>Stocked</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStocked()
	 * @generated
	 * @ordered
	 */
	protected GeneratorLpVar stocked;

	/**
	 * The cached value of the '{@link #getCalcConsumed() <em>Calc Consumed</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalcConsumed()
	 * @generated
	 * @ordered
	 */
	protected GeneratorLpCons calcConsumed;

	/**
	 * The cached value of the '{@link #getCalcSupplied() <em>Calc Supplied</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalcSupplied()
	 * @generated
	 * @ordered
	 */
	protected GeneratorLpCons calcSupplied;

	/**
	 * The cached value of the '{@link #getBalance() <em>Balance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBalance()
	 * @generated
	 * @ordered
	 */
	protected GeneratorLpCons balance;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LPProductBucketImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MacroPlannerSolverPackage.Literals.LP_PRODUCT_BUCKET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LPProduct getProduct() {
		if (eContainerFeatureID() != MacroPlannerSolverPackage.LP_PRODUCT_BUCKET__PRODUCT) return null;
		return (LPProduct)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProduct(LPProduct newProduct, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newProduct, MacroPlannerSolverPackage.LP_PRODUCT_BUCKET__PRODUCT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProduct(LPProduct newProduct) {
		if (newProduct != eInternalContainer() || (eContainerFeatureID() != MacroPlannerSolverPackage.LP_PRODUCT_BUCKET__PRODUCT && newProduct != null)) {
			if (EcoreUtil.isAncestor(this, newProduct))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newProduct != null)
				msgs = ((InternalEObject)newProduct).eInverseAdd(this, MacroPlannerSolverPackage.LP_PRODUCT__LP_BUCKETS, LPProduct.class, msgs);
			msgs = basicSetProduct(newProduct, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MacroPlannerSolverPackage.LP_PRODUCT_BUCKET__PRODUCT, newProduct, newProduct));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LPCapacityBucket> getCapacities() {
		if (capacities == null) {
			capacities = new EObjectWithInverseResolvingEList<LPCapacityBucket>(LPCapacityBucket.class, this, MacroPlannerSolverPackage.LP_PRODUCT_BUCKET__CAPACITIES, MacroPlannerSolverPackage.LP_CAPACITY_BUCKET__PRODUCT_BUCKET);
		}
		return capacities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LPSupplyBucket> getSupplies() {
		if (supplies == null) {
			supplies = new EObjectWithInverseResolvingEList<LPSupplyBucket>(LPSupplyBucket.class, this, MacroPlannerSolverPackage.LP_PRODUCT_BUCKET__SUPPLIES, MacroPlannerSolverPackage.LP_SUPPLY_BUCKET__PRODUCT_BUCKET);
		}
		return supplies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LPRoutingBucketProduct> getConsumptions() {
		if (consumptions == null) {
			consumptions = new EObjectWithInverseResolvingEList<LPRoutingBucketProduct>(LPRoutingBucketProduct.class, this, MacroPlannerSolverPackage.LP_PRODUCT_BUCKET__CONSUMPTIONS, MacroPlannerSolverPackage.LP_ROUTING_BUCKET_PRODUCT__PRODUCT_BUCKET);
		}
		return consumptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratorLpVar getConsumed() {
		return consumed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConsumed(GeneratorLpVar newConsumed, NotificationChain msgs) {
		GeneratorLpVar oldConsumed = consumed;
		consumed = newConsumed;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MacroPlannerSolverPackage.LP_PRODUCT_BUCKET__CONSUMED, oldConsumed, newConsumed);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConsumed(GeneratorLpVar newConsumed) {
		if (newConsumed != consumed) {
			NotificationChain msgs = null;
			if (consumed != null)
				msgs = ((InternalEObject)consumed).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MacroPlannerSolverPackage.LP_PRODUCT_BUCKET__CONSUMED, null, msgs);
			if (newConsumed != null)
				msgs = ((InternalEObject)newConsumed).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MacroPlannerSolverPackage.LP_PRODUCT_BUCKET__CONSUMED, null, msgs);
			msgs = basicSetConsumed(newConsumed, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MacroPlannerSolverPackage.LP_PRODUCT_BUCKET__CONSUMED, newConsumed, newConsumed));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MacroPlannerSolverPackage.LP_PRODUCT_BUCKET__SUPPLIED, oldSupplied, newSupplied);
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
				msgs = ((InternalEObject)supplied).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MacroPlannerSolverPackage.LP_PRODUCT_BUCKET__SUPPLIED, null, msgs);
			if (newSupplied != null)
				msgs = ((InternalEObject)newSupplied).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MacroPlannerSolverPackage.LP_PRODUCT_BUCKET__SUPPLIED, null, msgs);
			msgs = basicSetSupplied(newSupplied, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MacroPlannerSolverPackage.LP_PRODUCT_BUCKET__SUPPLIED, newSupplied, newSupplied));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratorLpVar getStocked() {
		return stocked;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStocked(GeneratorLpVar newStocked, NotificationChain msgs) {
		GeneratorLpVar oldStocked = stocked;
		stocked = newStocked;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MacroPlannerSolverPackage.LP_PRODUCT_BUCKET__STOCKED, oldStocked, newStocked);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStocked(GeneratorLpVar newStocked) {
		if (newStocked != stocked) {
			NotificationChain msgs = null;
			if (stocked != null)
				msgs = ((InternalEObject)stocked).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MacroPlannerSolverPackage.LP_PRODUCT_BUCKET__STOCKED, null, msgs);
			if (newStocked != null)
				msgs = ((InternalEObject)newStocked).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MacroPlannerSolverPackage.LP_PRODUCT_BUCKET__STOCKED, null, msgs);
			msgs = basicSetStocked(newStocked, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MacroPlannerSolverPackage.LP_PRODUCT_BUCKET__STOCKED, newStocked, newStocked));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratorLpCons getCalcConsumed() {
		return calcConsumed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCalcConsumed(GeneratorLpCons newCalcConsumed, NotificationChain msgs) {
		GeneratorLpCons oldCalcConsumed = calcConsumed;
		calcConsumed = newCalcConsumed;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MacroPlannerSolverPackage.LP_PRODUCT_BUCKET__CALC_CONSUMED, oldCalcConsumed, newCalcConsumed);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCalcConsumed(GeneratorLpCons newCalcConsumed) {
		if (newCalcConsumed != calcConsumed) {
			NotificationChain msgs = null;
			if (calcConsumed != null)
				msgs = ((InternalEObject)calcConsumed).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MacroPlannerSolverPackage.LP_PRODUCT_BUCKET__CALC_CONSUMED, null, msgs);
			if (newCalcConsumed != null)
				msgs = ((InternalEObject)newCalcConsumed).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MacroPlannerSolverPackage.LP_PRODUCT_BUCKET__CALC_CONSUMED, null, msgs);
			msgs = basicSetCalcConsumed(newCalcConsumed, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MacroPlannerSolverPackage.LP_PRODUCT_BUCKET__CALC_CONSUMED, newCalcConsumed, newCalcConsumed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratorLpCons getCalcSupplied() {
		return calcSupplied;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCalcSupplied(GeneratorLpCons newCalcSupplied, NotificationChain msgs) {
		GeneratorLpCons oldCalcSupplied = calcSupplied;
		calcSupplied = newCalcSupplied;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MacroPlannerSolverPackage.LP_PRODUCT_BUCKET__CALC_SUPPLIED, oldCalcSupplied, newCalcSupplied);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCalcSupplied(GeneratorLpCons newCalcSupplied) {
		if (newCalcSupplied != calcSupplied) {
			NotificationChain msgs = null;
			if (calcSupplied != null)
				msgs = ((InternalEObject)calcSupplied).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MacroPlannerSolverPackage.LP_PRODUCT_BUCKET__CALC_SUPPLIED, null, msgs);
			if (newCalcSupplied != null)
				msgs = ((InternalEObject)newCalcSupplied).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MacroPlannerSolverPackage.LP_PRODUCT_BUCKET__CALC_SUPPLIED, null, msgs);
			msgs = basicSetCalcSupplied(newCalcSupplied, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MacroPlannerSolverPackage.LP_PRODUCT_BUCKET__CALC_SUPPLIED, newCalcSupplied, newCalcSupplied));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratorLpCons getBalance() {
		return balance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBalance(GeneratorLpCons newBalance, NotificationChain msgs) {
		GeneratorLpCons oldBalance = balance;
		balance = newBalance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MacroPlannerSolverPackage.LP_PRODUCT_BUCKET__BALANCE, oldBalance, newBalance);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBalance(GeneratorLpCons newBalance) {
		if (newBalance != balance) {
			NotificationChain msgs = null;
			if (balance != null)
				msgs = ((InternalEObject)balance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MacroPlannerSolverPackage.LP_PRODUCT_BUCKET__BALANCE, null, msgs);
			if (newBalance != null)
				msgs = ((InternalEObject)newBalance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MacroPlannerSolverPackage.LP_PRODUCT_BUCKET__BALANCE, null, msgs);
			msgs = basicSetBalance(newBalance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MacroPlannerSolverPackage.LP_PRODUCT_BUCKET__BALANCE, newBalance, newBalance));
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
			case MacroPlannerSolverPackage.LP_PRODUCT_BUCKET__PRODUCT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetProduct((LPProduct)otherEnd, msgs);
			case MacroPlannerSolverPackage.LP_PRODUCT_BUCKET__CAPACITIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCapacities()).basicAdd(otherEnd, msgs);
			case MacroPlannerSolverPackage.LP_PRODUCT_BUCKET__SUPPLIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSupplies()).basicAdd(otherEnd, msgs);
			case MacroPlannerSolverPackage.LP_PRODUCT_BUCKET__CONSUMPTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConsumptions()).basicAdd(otherEnd, msgs);
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
			case MacroPlannerSolverPackage.LP_PRODUCT_BUCKET__PRODUCT:
				return basicSetProduct(null, msgs);
			case MacroPlannerSolverPackage.LP_PRODUCT_BUCKET__CAPACITIES:
				return ((InternalEList<?>)getCapacities()).basicRemove(otherEnd, msgs);
			case MacroPlannerSolverPackage.LP_PRODUCT_BUCKET__SUPPLIES:
				return ((InternalEList<?>)getSupplies()).basicRemove(otherEnd, msgs);
			case MacroPlannerSolverPackage.LP_PRODUCT_BUCKET__CONSUMPTIONS:
				return ((InternalEList<?>)getConsumptions()).basicRemove(otherEnd, msgs);
			case MacroPlannerSolverPackage.LP_PRODUCT_BUCKET__CONSUMED:
				return basicSetConsumed(null, msgs);
			case MacroPlannerSolverPackage.LP_PRODUCT_BUCKET__SUPPLIED:
				return basicSetSupplied(null, msgs);
			case MacroPlannerSolverPackage.LP_PRODUCT_BUCKET__STOCKED:
				return basicSetStocked(null, msgs);
			case MacroPlannerSolverPackage.LP_PRODUCT_BUCKET__CALC_CONSUMED:
				return basicSetCalcConsumed(null, msgs);
			case MacroPlannerSolverPackage.LP_PRODUCT_BUCKET__CALC_SUPPLIED:
				return basicSetCalcSupplied(null, msgs);
			case MacroPlannerSolverPackage.LP_PRODUCT_BUCKET__BALANCE:
				return basicSetBalance(null, msgs);
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
			case MacroPlannerSolverPackage.LP_PRODUCT_BUCKET__PRODUCT:
				return eInternalContainer().eInverseRemove(this, MacroPlannerSolverPackage.LP_PRODUCT__LP_BUCKETS, LPProduct.class, msgs);
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
			case MacroPlannerSolverPackage.LP_PRODUCT_BUCKET__PRODUCT:
				return getProduct();
			case MacroPlannerSolverPackage.LP_PRODUCT_BUCKET__CAPACITIES:
				return getCapacities();
			case MacroPlannerSolverPackage.LP_PRODUCT_BUCKET__SUPPLIES:
				return getSupplies();
			case MacroPlannerSolverPackage.LP_PRODUCT_BUCKET__CONSUMPTIONS:
				return getConsumptions();
			case MacroPlannerSolverPackage.LP_PRODUCT_BUCKET__CONSUMED:
				return getConsumed();
			case MacroPlannerSolverPackage.LP_PRODUCT_BUCKET__SUPPLIED:
				return getSupplied();
			case MacroPlannerSolverPackage.LP_PRODUCT_BUCKET__STOCKED:
				return getStocked();
			case MacroPlannerSolverPackage.LP_PRODUCT_BUCKET__CALC_CONSUMED:
				return getCalcConsumed();
			case MacroPlannerSolverPackage.LP_PRODUCT_BUCKET__CALC_SUPPLIED:
				return getCalcSupplied();
			case MacroPlannerSolverPackage.LP_PRODUCT_BUCKET__BALANCE:
				return getBalance();
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
			case MacroPlannerSolverPackage.LP_PRODUCT_BUCKET__PRODUCT:
				setProduct((LPProduct)newValue);
				return;
			case MacroPlannerSolverPackage.LP_PRODUCT_BUCKET__CAPACITIES:
				getCapacities().clear();
				getCapacities().addAll((Collection<? extends LPCapacityBucket>)newValue);
				return;
			case MacroPlannerSolverPackage.LP_PRODUCT_BUCKET__SUPPLIES:
				getSupplies().clear();
				getSupplies().addAll((Collection<? extends LPSupplyBucket>)newValue);
				return;
			case MacroPlannerSolverPackage.LP_PRODUCT_BUCKET__CONSUMPTIONS:
				getConsumptions().clear();
				getConsumptions().addAll((Collection<? extends LPRoutingBucketProduct>)newValue);
				return;
			case MacroPlannerSolverPackage.LP_PRODUCT_BUCKET__CONSUMED:
				setConsumed((GeneratorLpVar)newValue);
				return;
			case MacroPlannerSolverPackage.LP_PRODUCT_BUCKET__SUPPLIED:
				setSupplied((GeneratorLpVar)newValue);
				return;
			case MacroPlannerSolverPackage.LP_PRODUCT_BUCKET__STOCKED:
				setStocked((GeneratorLpVar)newValue);
				return;
			case MacroPlannerSolverPackage.LP_PRODUCT_BUCKET__CALC_CONSUMED:
				setCalcConsumed((GeneratorLpCons)newValue);
				return;
			case MacroPlannerSolverPackage.LP_PRODUCT_BUCKET__CALC_SUPPLIED:
				setCalcSupplied((GeneratorLpCons)newValue);
				return;
			case MacroPlannerSolverPackage.LP_PRODUCT_BUCKET__BALANCE:
				setBalance((GeneratorLpCons)newValue);
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
			case MacroPlannerSolverPackage.LP_PRODUCT_BUCKET__PRODUCT:
				setProduct((LPProduct)null);
				return;
			case MacroPlannerSolverPackage.LP_PRODUCT_BUCKET__CAPACITIES:
				getCapacities().clear();
				return;
			case MacroPlannerSolverPackage.LP_PRODUCT_BUCKET__SUPPLIES:
				getSupplies().clear();
				return;
			case MacroPlannerSolverPackage.LP_PRODUCT_BUCKET__CONSUMPTIONS:
				getConsumptions().clear();
				return;
			case MacroPlannerSolverPackage.LP_PRODUCT_BUCKET__CONSUMED:
				setConsumed((GeneratorLpVar)null);
				return;
			case MacroPlannerSolverPackage.LP_PRODUCT_BUCKET__SUPPLIED:
				setSupplied((GeneratorLpVar)null);
				return;
			case MacroPlannerSolverPackage.LP_PRODUCT_BUCKET__STOCKED:
				setStocked((GeneratorLpVar)null);
				return;
			case MacroPlannerSolverPackage.LP_PRODUCT_BUCKET__CALC_CONSUMED:
				setCalcConsumed((GeneratorLpCons)null);
				return;
			case MacroPlannerSolverPackage.LP_PRODUCT_BUCKET__CALC_SUPPLIED:
				setCalcSupplied((GeneratorLpCons)null);
				return;
			case MacroPlannerSolverPackage.LP_PRODUCT_BUCKET__BALANCE:
				setBalance((GeneratorLpCons)null);
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
			case MacroPlannerSolverPackage.LP_PRODUCT_BUCKET__PRODUCT:
				return getProduct() != null;
			case MacroPlannerSolverPackage.LP_PRODUCT_BUCKET__CAPACITIES:
				return capacities != null && !capacities.isEmpty();
			case MacroPlannerSolverPackage.LP_PRODUCT_BUCKET__SUPPLIES:
				return supplies != null && !supplies.isEmpty();
			case MacroPlannerSolverPackage.LP_PRODUCT_BUCKET__CONSUMPTIONS:
				return consumptions != null && !consumptions.isEmpty();
			case MacroPlannerSolverPackage.LP_PRODUCT_BUCKET__CONSUMED:
				return consumed != null;
			case MacroPlannerSolverPackage.LP_PRODUCT_BUCKET__SUPPLIED:
				return supplied != null;
			case MacroPlannerSolverPackage.LP_PRODUCT_BUCKET__STOCKED:
				return stocked != null;
			case MacroPlannerSolverPackage.LP_PRODUCT_BUCKET__CALC_CONSUMED:
				return calcConsumed != null;
			case MacroPlannerSolverPackage.LP_PRODUCT_BUCKET__CALC_SUPPLIED:
				return calcSupplied != null;
			case MacroPlannerSolverPackage.LP_PRODUCT_BUCKET__BALANCE:
				return balance != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * 
	 */
	@Override
	public void generateTuples() {
		super.generateTuples();
		
		LPProduct product = this.getProduct();
		//TimeBucket bucket = this.getBucket();
		
		// logic name
		String name = String.format("%s,%s", product.getName(), this.getBucketShortName());
		this.setName(name);
	}

	/**
	 * 
	 */
	@Override
	public void generateXReferences() {
		
		super.generateXReferences();
	}

	/**
	 * 
	 */
	@Override
	public void generateVars() {
		super.generateVars();
		
		// var consumed
		{
		GeneratorLpVar var = SolverFactory.eINSTANCE.createGeneratorLpVar();
		var.setType(EnumLpVarType.ENUM_LITERAL_LP_VAR_REAL);
		var.setLowerBound(0.0f);
		var.setName("consumed");
		this.setConsumed(var);  // owning
		}

		// var supplied
		{
		GeneratorLpVar var = SolverFactory.eINSTANCE.createGeneratorLpVar();
		var.setType(EnumLpVarType.ENUM_LITERAL_LP_VAR_REAL);
		var.setLowerBound(0.0f);
		var.setName("supplied");
		this.setSupplied(var);  // owning
		}
	}
	
	/**
	 * 
	 */
	@Override
	public void generateCons() {
		super.generateCons();
		
		this.generateLpConsCalcConsumed();
		this.generateLpConsCalcSupplied();
	}

	/**
	 * 
	 */
	private void generateLpConsCalcConsumed(){

		GeneratorLpCons cons = SolverFactory.eINSTANCE.createGeneratorLpCons();
		cons.setType(EnumLpConsType.ENUM_LITERAL_LP_CONS_EQUAL);
		cons.setName("calc_consumed");
		GeneratorLpVar var_consumed = this.getConsumed();
		cons.constructTerm(var_consumed, 1.0f);
		float rhs = 0.0f;
		for (  LPRoutingBucketProduct lp_product_bucket_consumed : this.getConsumptions()){
			LPRoutingBucket lp_routing_bucket = lp_product_bucket_consumed.getRouting();
			LPRoutingProduct lp_routing_product = lp_product_bucket_consumed.getRoutingProduct();
			RoutingProduct routing_product = lp_routing_product.getRoutingProduct();
			GeneratorLpVar var_routing_planned = lp_routing_bucket.getPlanned();
			cons.contributeTerm(var_routing_planned, routing_product.getConsumption());
		} // 
		cons.setRighHandSide(rhs);
		this.setCalcConsumed(cons); // owning
	}

	/**
	 * 
	 */
	private void generateLpConsCalcSupplied(){
		GeneratorLpCons cons = SolverFactory.eINSTANCE.createGeneratorLpCons();
		cons.setType(EnumLpConsType.ENUM_LITERAL_LP_CONS_EQUAL);
		cons.setName("calc_supplied");
		GeneratorLpVar var_supplied_total = this.getSupplied();
		cons.constructTerm(var_supplied_total, 1.0f);
		float rhs = 0.0f;
		for (  LPSupplyBucket lp_supply_bucket : this.getSupplies()){
			GeneratorLpVar var_supplied = lp_supply_bucket.getSupplied();
			cons.contributeTerm(var_supplied, 1.0f);
		} // 
		cons.setRighHandSide(rhs);
		this.setCalcConsumed(cons); // owning
	}

} //LPProductBucketImpl
