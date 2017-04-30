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
import com.misc.common.moplaf.solver.GeneratorLpCons;
import com.misc.common.moplaf.solver.GeneratorLpVar;
import com.misc.common.moplaf.solver.SolverFactory;
import com.misc.common.moplaf.solver.util.Util;

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
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.impl.LPProductBucketImpl#getCalcStocked <em>Calc Stocked</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.impl.LPProductBucketImpl#getBalance <em>Balance</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.impl.LPProductBucketImpl#isConsumingSelectedSolution <em>Consuming Selected Solution</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.impl.LPProductBucketImpl#getConsumptionSelectedSolution <em>Consumption Selected Solution</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.impl.LPProductBucketImpl#isStockedSelectedSolution <em>Stocked Selected Solution</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.impl.LPProductBucketImpl#getStockSelectedSolution <em>Stock Selected Solution</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.impl.LPProductBucketImpl#isWithCapacity <em>With Capacity</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.impl.LPProductBucketImpl#getStockMaximum <em>Stock Maximum</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.impl.LPProductBucketImpl#isCapacityTightSelectedSolution <em>Capacity Tight Selected Solution</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.impl.LPProductBucketImpl#isCapacitySlackSelectedSolution <em>Capacity Slack Selected Solution</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.impl.LPProductBucketImpl#isSuppliedSelectedSolution <em>Supplied Selected Solution</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.impl.LPProductBucketImpl#getSupplySelectedSolution <em>Supply Selected Solution</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.impl.LPProductBucketImpl#isWithSupply <em>With Supply</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.impl.LPProductBucketImpl#getSupplyMaximum <em>Supply Maximum</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.impl.LPProductBucketImpl#isSupplyTightSelectedSolution <em>Supply Tight Selected Solution</em>}</li>
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
	 * The cached value of the '{@link #getCalcStocked() <em>Calc Stocked</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalcStocked()
	 * @generated
	 * @ordered
	 */
	protected GeneratorLpCons calcStocked;

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
	 * The default value of the '{@link #isConsumingSelectedSolution() <em>Consuming Selected Solution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConsumingSelectedSolution()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CONSUMING_SELECTED_SOLUTION_EDEFAULT = false;

	/**
	 * The default value of the '{@link #getConsumptionSelectedSolution() <em>Consumption Selected Solution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsumptionSelectedSolution()
	 * @generated
	 * @ordered
	 */
	protected static final double CONSUMPTION_SELECTED_SOLUTION_EDEFAULT = 0.0;

	/**
	 * The default value of the '{@link #isStockedSelectedSolution() <em>Stocked Selected Solution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStockedSelectedSolution()
	 * @generated
	 * @ordered
	 */
	protected static final boolean STOCKED_SELECTED_SOLUTION_EDEFAULT = false;

	/**
	 * The default value of the '{@link #getStockSelectedSolution() <em>Stock Selected Solution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStockSelectedSolution()
	 * @generated
	 * @ordered
	 */
	protected static final double STOCK_SELECTED_SOLUTION_EDEFAULT = 0.0;

	/**
	 * The default value of the '{@link #isWithCapacity() <em>With Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWithCapacity()
	 * @generated
	 * @ordered
	 */
	protected static final boolean WITH_CAPACITY_EDEFAULT = false;

	/**
	 * The default value of the '{@link #getStockMaximum() <em>Stock Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStockMaximum()
	 * @generated
	 * @ordered
	 */
	protected static final double STOCK_MAXIMUM_EDEFAULT = 0.0;

	/**
	 * The default value of the '{@link #isCapacityTightSelectedSolution() <em>Capacity Tight Selected Solution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCapacityTightSelectedSolution()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CAPACITY_TIGHT_SELECTED_SOLUTION_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isCapacitySlackSelectedSolution() <em>Capacity Slack Selected Solution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCapacitySlackSelectedSolution()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CAPACITY_SLACK_SELECTED_SOLUTION_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isSuppliedSelectedSolution() <em>Supplied Selected Solution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSuppliedSelectedSolution()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SUPPLIED_SELECTED_SOLUTION_EDEFAULT = false;

	/**
	 * The default value of the '{@link #getSupplySelectedSolution() <em>Supply Selected Solution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplySelectedSolution()
	 * @generated
	 * @ordered
	 */
	protected static final double SUPPLY_SELECTED_SOLUTION_EDEFAULT = 0.0;

	/**
	 * The default value of the '{@link #isWithSupply() <em>With Supply</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWithSupply()
	 * @generated
	 * @ordered
	 */
	protected static final boolean WITH_SUPPLY_EDEFAULT = false;

	/**
	 * The default value of the '{@link #getSupplyMaximum() <em>Supply Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplyMaximum()
	 * @generated
	 * @ordered
	 */
	protected static final double SUPPLY_MAXIMUM_EDEFAULT = 0.0;

	/**
	 * The default value of the '{@link #isSupplyTightSelectedSolution() <em>Supply Tight Selected Solution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSupplyTightSelectedSolution()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SUPPLY_TIGHT_SELECTED_SOLUTION_EDEFAULT = false;

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
	public GeneratorLpCons getCalcStocked() {
		return calcStocked;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCalcStocked(GeneratorLpCons newCalcStocked, NotificationChain msgs) {
		GeneratorLpCons oldCalcStocked = calcStocked;
		calcStocked = newCalcStocked;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MacroPlannerSolverPackage.LP_PRODUCT_BUCKET__CALC_STOCKED, oldCalcStocked, newCalcStocked);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCalcStocked(GeneratorLpCons newCalcStocked) {
		if (newCalcStocked != calcStocked) {
			NotificationChain msgs = null;
			if (calcStocked != null)
				msgs = ((InternalEObject)calcStocked).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MacroPlannerSolverPackage.LP_PRODUCT_BUCKET__CALC_STOCKED, null, msgs);
			if (newCalcStocked != null)
				msgs = ((InternalEObject)newCalcStocked).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MacroPlannerSolverPackage.LP_PRODUCT_BUCKET__CALC_STOCKED, null, msgs);
			msgs = basicSetCalcStocked(newCalcStocked, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MacroPlannerSolverPackage.LP_PRODUCT_BUCKET__CALC_STOCKED, newCalcStocked, newCalcStocked));
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
	 */
	public boolean isConsumingSelectedSolution() {
		double epsilon = this.getLPMacroPlanner().getEpsilon();
		double consumption = this.getConsumptionSelectedSolution();
		boolean isConsuming = Math.abs(consumption)>epsilon;
		return isConsuming;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public double getStockMaximum() {
		float amount = 0.0f;
		for ( LPCapacityBucket bucketCapacity: this.getCapacities()){
			amount += bucketCapacity.getCapacity().getCapacity().getQuantity();
		}
		return amount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public double getStockSelectedSolution() {
		return this.getStocked().getSelectedSolutionValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public boolean isWithCapacity() {
		boolean with = this.getCapacities().size()>0;
		return with;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public double getSupplyMaximum() {
		float amount = 0.0f;
		for ( LPSupplyBucket bucketSupply: this.getSupplies()){
			amount += bucketSupply.getSupply().getSupply().getQuantity()*bucketSupply.getFraction();
		}
		return amount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public double getSupplySelectedSolution() {
		return this.getSupplied().getSelectedSolutionValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public boolean isWithSupply() {
		boolean with = this.getSupplies().size()>0;
		return with;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public double getConsumptionSelectedSolution() {
		return (double) this.getConsumed().getSelectedSolutionValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public boolean isStockedSelectedSolution() {
		double epsilon = this.getLPMacroPlanner().getEpsilon();
		double stocked = this.getStockSelectedSolution();
		boolean isStocked = Math.abs(stocked)>epsilon;
		return isStocked;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public boolean isCapacityTightSelectedSolution() {
		for(LPCapacityBucket capacity: this.getCapacities()){
			if ( !capacity.isTightSelectedSolution() ){
				return false;
			}
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public boolean isCapacitySlackSelectedSolution() {
		for(LPCapacityBucket capacity: this.getCapacities()){
			if ( capacity.isSlackSelectedSolution() ){
				return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public boolean isSuppliedSelectedSolution() {
		double epsilon = this.getLPMacroPlanner().getEpsilon();
		double supplied = this.getSupplySelectedSolution();
		boolean isSupplied= Math.abs(supplied)>epsilon;
		return isSupplied;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public boolean isSupplyTightSelectedSolution() {
		for(LPSupplyBucket supply: this.getSupplies()){
			if ( !supply.isTightSelectedSolution() ){
				return false;
			}
		}
		return true;
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
			case MacroPlannerSolverPackage.LP_PRODUCT_BUCKET__CALC_STOCKED:
				return basicSetCalcStocked(null, msgs);
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
			case MacroPlannerSolverPackage.LP_PRODUCT_BUCKET__CALC_STOCKED:
				return getCalcStocked();
			case MacroPlannerSolverPackage.LP_PRODUCT_BUCKET__BALANCE:
				return getBalance();
			case MacroPlannerSolverPackage.LP_PRODUCT_BUCKET__CONSUMING_SELECTED_SOLUTION:
				return isConsumingSelectedSolution();
			case MacroPlannerSolverPackage.LP_PRODUCT_BUCKET__CONSUMPTION_SELECTED_SOLUTION:
				return getConsumptionSelectedSolution();
			case MacroPlannerSolverPackage.LP_PRODUCT_BUCKET__STOCKED_SELECTED_SOLUTION:
				return isStockedSelectedSolution();
			case MacroPlannerSolverPackage.LP_PRODUCT_BUCKET__STOCK_SELECTED_SOLUTION:
				return getStockSelectedSolution();
			case MacroPlannerSolverPackage.LP_PRODUCT_BUCKET__WITH_CAPACITY:
				return isWithCapacity();
			case MacroPlannerSolverPackage.LP_PRODUCT_BUCKET__STOCK_MAXIMUM:
				return getStockMaximum();
			case MacroPlannerSolverPackage.LP_PRODUCT_BUCKET__CAPACITY_TIGHT_SELECTED_SOLUTION:
				return isCapacityTightSelectedSolution();
			case MacroPlannerSolverPackage.LP_PRODUCT_BUCKET__CAPACITY_SLACK_SELECTED_SOLUTION:
				return isCapacitySlackSelectedSolution();
			case MacroPlannerSolverPackage.LP_PRODUCT_BUCKET__SUPPLIED_SELECTED_SOLUTION:
				return isSuppliedSelectedSolution();
			case MacroPlannerSolverPackage.LP_PRODUCT_BUCKET__SUPPLY_SELECTED_SOLUTION:
				return getSupplySelectedSolution();
			case MacroPlannerSolverPackage.LP_PRODUCT_BUCKET__WITH_SUPPLY:
				return isWithSupply();
			case MacroPlannerSolverPackage.LP_PRODUCT_BUCKET__SUPPLY_MAXIMUM:
				return getSupplyMaximum();
			case MacroPlannerSolverPackage.LP_PRODUCT_BUCKET__SUPPLY_TIGHT_SELECTED_SOLUTION:
				return isSupplyTightSelectedSolution();
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
			case MacroPlannerSolverPackage.LP_PRODUCT_BUCKET__CALC_STOCKED:
				setCalcStocked((GeneratorLpCons)newValue);
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
			case MacroPlannerSolverPackage.LP_PRODUCT_BUCKET__CALC_STOCKED:
				setCalcStocked((GeneratorLpCons)null);
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
			case MacroPlannerSolverPackage.LP_PRODUCT_BUCKET__CALC_STOCKED:
				return calcStocked != null;
			case MacroPlannerSolverPackage.LP_PRODUCT_BUCKET__BALANCE:
				return balance != null;
			case MacroPlannerSolverPackage.LP_PRODUCT_BUCKET__CONSUMING_SELECTED_SOLUTION:
				return isConsumingSelectedSolution() != CONSUMING_SELECTED_SOLUTION_EDEFAULT;
			case MacroPlannerSolverPackage.LP_PRODUCT_BUCKET__CONSUMPTION_SELECTED_SOLUTION:
				return getConsumptionSelectedSolution() != CONSUMPTION_SELECTED_SOLUTION_EDEFAULT;
			case MacroPlannerSolverPackage.LP_PRODUCT_BUCKET__STOCKED_SELECTED_SOLUTION:
				return isStockedSelectedSolution() != STOCKED_SELECTED_SOLUTION_EDEFAULT;
			case MacroPlannerSolverPackage.LP_PRODUCT_BUCKET__STOCK_SELECTED_SOLUTION:
				return getStockSelectedSolution() != STOCK_SELECTED_SOLUTION_EDEFAULT;
			case MacroPlannerSolverPackage.LP_PRODUCT_BUCKET__WITH_CAPACITY:
				return isWithCapacity() != WITH_CAPACITY_EDEFAULT;
			case MacroPlannerSolverPackage.LP_PRODUCT_BUCKET__STOCK_MAXIMUM:
				return getStockMaximum() != STOCK_MAXIMUM_EDEFAULT;
			case MacroPlannerSolverPackage.LP_PRODUCT_BUCKET__CAPACITY_TIGHT_SELECTED_SOLUTION:
				return isCapacityTightSelectedSolution() != CAPACITY_TIGHT_SELECTED_SOLUTION_EDEFAULT;
			case MacroPlannerSolverPackage.LP_PRODUCT_BUCKET__CAPACITY_SLACK_SELECTED_SOLUTION:
				return isCapacitySlackSelectedSolution() != CAPACITY_SLACK_SELECTED_SOLUTION_EDEFAULT;
			case MacroPlannerSolverPackage.LP_PRODUCT_BUCKET__SUPPLIED_SELECTED_SOLUTION:
				return isSuppliedSelectedSolution() != SUPPLIED_SELECTED_SOLUTION_EDEFAULT;
			case MacroPlannerSolverPackage.LP_PRODUCT_BUCKET__SUPPLY_SELECTED_SOLUTION:
				return getSupplySelectedSolution() != SUPPLY_SELECTED_SOLUTION_EDEFAULT;
			case MacroPlannerSolverPackage.LP_PRODUCT_BUCKET__WITH_SUPPLY:
				return isWithSupply() != WITH_SUPPLY_EDEFAULT;
			case MacroPlannerSolverPackage.LP_PRODUCT_BUCKET__SUPPLY_MAXIMUM:
				return getSupplyMaximum() != SUPPLY_MAXIMUM_EDEFAULT;
			case MacroPlannerSolverPackage.LP_PRODUCT_BUCKET__SUPPLY_TIGHT_SELECTED_SOLUTION:
				return isSupplyTightSelectedSolution() != SUPPLY_TIGHT_SELECTED_SOLUTION_EDEFAULT;
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
		GeneratorLpVar var = Util.createGeneratorLpVarRealPositiveUnbounded("consumed");
		this.setConsumed(var);  // owning
		}

		// var supplied
		{
		GeneratorLpVar var = Util.createGeneratorLpVarRealPositiveUnbounded("supplied");
		this.setSupplied(var);  // owning
		}
		
		// var stocked
		{
		GeneratorLpVar var = Util.createGeneratorLpVarRealPositiveUnbounded("stocked");
		this.setStocked(var);  // owning
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
		this.generateLpConsCalcStocked();
		this.generateLpConsBalance();
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
			cons.contributeTerm(var_routing_planned, (float)-routing_product.getConsumption()); // a routing may contribute several times to the same product bucket
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
			cons.constructTerm(var_supplied, -1.0f); 
		} // 
		cons.setRighHandSide(rhs);
		this.setCalcSupplied(cons); // owning
	}

	/**
	 * 
	 */
	private void generateLpConsCalcStocked(){
		GeneratorLpCons cons = SolverFactory.eINSTANCE.createGeneratorLpCons();
		cons.setType(EnumLpConsType.ENUM_LITERAL_LP_CONS_EQUAL);
		cons.setName("calc_stocked");
		GeneratorLpVar var_stocked_total = this.getStocked();
		cons.constructTerm(var_stocked_total, 1.0f);
		float rhs = 0.0f;
		for (  LPCapacityBucket lp_capacity_bucket : this.getCapacities()){
			GeneratorLpVar var_stocked = lp_capacity_bucket.getStocked();
			cons.constructTerm(var_stocked, -1.0f);
		} // 
		cons.setRighHandSide(rhs);
		this.setCalcStocked(cons); // owning
	}

	/**
	 * 
	 */
	private void generateLpConsBalance(){
		LPProductBucket previous_bucket = (LPProductBucket)this.getPrevious();

		GeneratorLpVar var_consumed= this.getConsumed();
		GeneratorLpVar var_stocked = this.getStocked();
		GeneratorLpVar var_supplied = this.getSupplied();

		GeneratorLpCons cons = SolverFactory.eINSTANCE.createGeneratorLpCons();
		cons.setType(EnumLpConsType.ENUM_LITERAL_LP_CONS_EQUAL);
		cons.setName("balance");
		if ( previous_bucket!=null){
			GeneratorLpVar var_previous_stocked = previous_bucket.getStocked();
			cons.constructTerm(var_previous_stocked, 1.0f);
		}
		cons.constructTerm(var_supplied, 1.0f);
		cons.constructTerm(var_consumed, -1.0f);
		cons.constructTerm(var_stocked, -1.0f);
		float rhs = 0.0f;
		cons.setRighHandSide(rhs);
		this.setBalance(cons); // owning
	}
} //LPProductBucketImpl
