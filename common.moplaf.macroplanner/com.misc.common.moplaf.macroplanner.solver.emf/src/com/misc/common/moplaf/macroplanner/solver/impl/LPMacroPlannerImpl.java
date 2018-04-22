/*******************************************************************************
 * Copyright (c) 2017, 2018 Michel Schaffers and others.
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

import com.misc.common.moplaf.common.ReturnFeedback;
import com.misc.common.moplaf.macroplanner.Availability;
import com.misc.common.moplaf.macroplanner.Capacity;
import com.misc.common.moplaf.macroplanner.solver.LPAvailability;
import com.misc.common.moplaf.macroplanner.solver.LPAvailabilityBucket;
import com.misc.common.moplaf.macroplanner.solver.LPCapacity;
import com.misc.common.moplaf.macroplanner.solver.LPCapacityBucket;
import com.misc.common.moplaf.macroplanner.solver.LPMacroPlanner;
import com.misc.common.moplaf.macroplanner.solver.LPProduct;
import com.misc.common.moplaf.macroplanner.solver.LPProductSet;
import com.misc.common.moplaf.macroplanner.solver.LPResource;
import com.misc.common.moplaf.macroplanner.solver.LPResourceSet;
import com.misc.common.moplaf.macroplanner.solver.LPRouting;
import com.misc.common.moplaf.macroplanner.solver.LPRoutingBucket;
import com.misc.common.moplaf.macroplanner.solver.LPRoutingSet;
import com.misc.common.moplaf.macroplanner.solver.LPSupply;
import com.misc.common.moplaf.macroplanner.solver.LPSupplyBucket;
import com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverFactory;
import com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage;
import com.misc.common.moplaf.macroplanner.solver.Scenario;
import com.misc.common.moplaf.solver.EnumObjectiveType;
import com.misc.common.moplaf.solver.GeneratorLpGoal;
import com.misc.common.moplaf.solver.GeneratorLpVar;
import com.misc.common.moplaf.solver.Solver;
import com.misc.common.moplaf.solver.SolverFactory;
import com.misc.common.moplaf.solver.impl.GeneratorImpl;

import com.misc.common.moplaf.time.discrete.BucketType;
import com.misc.common.moplaf.time.discrete.TimeDiscreteFactory;
import com.misc.common.moplaf.time.discrete.TimeLine;
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
 * An implementation of the model object '<em><b>LP Macro Planner</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.impl.LPMacroPlannerImpl#getBucketSize <em>Bucket Size</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.impl.LPMacroPlannerImpl#getEpsilon <em>Epsilon</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.impl.LPMacroPlannerImpl#getProductSet <em>Product Set</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.impl.LPMacroPlannerImpl#getResourceSet <em>Resource Set</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.impl.LPMacroPlannerImpl#getRoutingSet <em>Routing Set</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.impl.LPMacroPlannerImpl#getScenario <em>Scenario</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.impl.LPMacroPlannerImpl#getTimeLine <em>Time Line</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.impl.LPMacroPlannerImpl#getCostRoutings <em>Cost Routings</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.impl.LPMacroPlannerImpl#getCostSupplies <em>Cost Supplies</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.impl.LPMacroPlannerImpl#getCostCapacities <em>Cost Capacities</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.impl.LPMacroPlannerImpl#getCostAvailabilities <em>Cost Availabilities</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.impl.LPMacroPlannerImpl#getPenaltyCapacities <em>Penalty Capacities</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.impl.LPMacroPlannerImpl#getPenaltyAvailabilities <em>Penalty Availabilities</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.impl.LPMacroPlannerImpl#getSolvers <em>Solvers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LPMacroPlannerImpl extends GeneratorImpl implements LPMacroPlanner {
	/**
	 * The default value of the '{@link #getBucketSize() <em>Bucket Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBucketSize()
	 * @generated
	 * @ordered
	 */
	protected static final BucketType BUCKET_SIZE_EDEFAULT = BucketType.TL_DAY;

	/**
	 * The cached value of the '{@link #getBucketSize() <em>Bucket Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBucketSize()
	 * @generated
	 * @ordered
	 */
	protected BucketType bucketSize = BUCKET_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEpsilon() <em>Epsilon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEpsilon()
	 * @generated
	 * @ordered
	 */
	protected static final double EPSILON_EDEFAULT = 1.0E-5;

	/**
	 * The cached value of the '{@link #getEpsilon() <em>Epsilon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEpsilon()
	 * @generated
	 * @ordered
	 */
	protected double epsilon = EPSILON_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProductSet() <em>Product Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductSet()
	 * @generated
	 * @ordered
	 */
	protected LPProductSet productSet;

	/**
	 * The cached value of the '{@link #getResourceSet() <em>Resource Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceSet()
	 * @generated
	 * @ordered
	 */
	protected LPResourceSet resourceSet;

	/**
	 * The cached value of the '{@link #getRoutingSet() <em>Routing Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoutingSet()
	 * @generated
	 * @ordered
	 */
	protected LPRoutingSet routingSet;

	/**
	 * The cached value of the '{@link #getTimeLine() <em>Time Line</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeLine()
	 * @generated
	 * @ordered
	 */
	protected TimeLine timeLine;

	/**
	 * The cached value of the '{@link #getCostRoutings() <em>Cost Routings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCostRoutings()
	 * @generated
	 * @ordered
	 */
	protected GeneratorLpGoal costRoutings;

	/**
	 * The cached value of the '{@link #getCostSupplies() <em>Cost Supplies</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCostSupplies()
	 * @generated
	 * @ordered
	 */
	protected GeneratorLpGoal costSupplies;

	/**
	 * The cached value of the '{@link #getCostCapacities() <em>Cost Capacities</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCostCapacities()
	 * @generated
	 * @ordered
	 */
	protected GeneratorLpGoal costCapacities;

	/**
	 * The cached value of the '{@link #getCostAvailabilities() <em>Cost Availabilities</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCostAvailabilities()
	 * @generated
	 * @ordered
	 */
	protected GeneratorLpGoal costAvailabilities;

	/**
	 * The cached value of the '{@link #getPenaltyCapacities() <em>Penalty Capacities</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPenaltyCapacities()
	 * @generated
	 * @ordered
	 */
	protected GeneratorLpGoal penaltyCapacities;

	/**
	 * The cached value of the '{@link #getPenaltyAvailabilities() <em>Penalty Availabilities</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPenaltyAvailabilities()
	 * @generated
	 * @ordered
	 */
	protected GeneratorLpGoal penaltyAvailabilities;

	/**
	 * The cached value of the '{@link #getSolvers() <em>Solvers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolvers()
	 * @generated
	 * @ordered
	 */
	protected EList<Solver> solvers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LPMacroPlannerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MacroPlannerSolverPackage.Literals.LP_MACRO_PLANNER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BucketType getBucketSize() {
		return bucketSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBucketSize(BucketType newBucketSize) {
		BucketType oldBucketSize = bucketSize;
		bucketSize = newBucketSize == null ? BUCKET_SIZE_EDEFAULT : newBucketSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MacroPlannerSolverPackage.LP_MACRO_PLANNER__BUCKET_SIZE, oldBucketSize, bucketSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getEpsilon() {
		return epsilon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEpsilon(double newEpsilon) {
		double oldEpsilon = epsilon;
		epsilon = newEpsilon;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MacroPlannerSolverPackage.LP_MACRO_PLANNER__EPSILON, oldEpsilon, epsilon));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LPProductSet getProductSet() {
		return productSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProductSet(LPProductSet newProductSet, NotificationChain msgs) {
		LPProductSet oldProductSet = productSet;
		productSet = newProductSet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MacroPlannerSolverPackage.LP_MACRO_PLANNER__PRODUCT_SET, oldProductSet, newProductSet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProductSet(LPProductSet newProductSet) {
		if (newProductSet != productSet) {
			NotificationChain msgs = null;
			if (productSet != null)
				msgs = ((InternalEObject)productSet).eInverseRemove(this, MacroPlannerSolverPackage.LP_PRODUCT_SET__MACRO_PLANNER, LPProductSet.class, msgs);
			if (newProductSet != null)
				msgs = ((InternalEObject)newProductSet).eInverseAdd(this, MacroPlannerSolverPackage.LP_PRODUCT_SET__MACRO_PLANNER, LPProductSet.class, msgs);
			msgs = basicSetProductSet(newProductSet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MacroPlannerSolverPackage.LP_MACRO_PLANNER__PRODUCT_SET, newProductSet, newProductSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LPResourceSet getResourceSet() {
		return resourceSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResourceSet(LPResourceSet newResourceSet, NotificationChain msgs) {
		LPResourceSet oldResourceSet = resourceSet;
		resourceSet = newResourceSet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MacroPlannerSolverPackage.LP_MACRO_PLANNER__RESOURCE_SET, oldResourceSet, newResourceSet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResourceSet(LPResourceSet newResourceSet) {
		if (newResourceSet != resourceSet) {
			NotificationChain msgs = null;
			if (resourceSet != null)
				msgs = ((InternalEObject)resourceSet).eInverseRemove(this, MacroPlannerSolverPackage.LP_RESOURCE_SET__MACRO_PLANNER, LPResourceSet.class, msgs);
			if (newResourceSet != null)
				msgs = ((InternalEObject)newResourceSet).eInverseAdd(this, MacroPlannerSolverPackage.LP_RESOURCE_SET__MACRO_PLANNER, LPResourceSet.class, msgs);
			msgs = basicSetResourceSet(newResourceSet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MacroPlannerSolverPackage.LP_MACRO_PLANNER__RESOURCE_SET, newResourceSet, newResourceSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LPRoutingSet getRoutingSet() {
		return routingSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRoutingSet(LPRoutingSet newRoutingSet, NotificationChain msgs) {
		LPRoutingSet oldRoutingSet = routingSet;
		routingSet = newRoutingSet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MacroPlannerSolverPackage.LP_MACRO_PLANNER__ROUTING_SET, oldRoutingSet, newRoutingSet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoutingSet(LPRoutingSet newRoutingSet) {
		if (newRoutingSet != routingSet) {
			NotificationChain msgs = null;
			if (routingSet != null)
				msgs = ((InternalEObject)routingSet).eInverseRemove(this, MacroPlannerSolverPackage.LP_ROUTING_SET__MACRO_PLANNER, LPRoutingSet.class, msgs);
			if (newRoutingSet != null)
				msgs = ((InternalEObject)newRoutingSet).eInverseAdd(this, MacroPlannerSolverPackage.LP_ROUTING_SET__MACRO_PLANNER, LPRoutingSet.class, msgs);
			msgs = basicSetRoutingSet(newRoutingSet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MacroPlannerSolverPackage.LP_MACRO_PLANNER__ROUTING_SET, newRoutingSet, newRoutingSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scenario getScenario() {
		if (eContainerFeatureID() != MacroPlannerSolverPackage.LP_MACRO_PLANNER__SCENARIO) return null;
		return (Scenario)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScenario(Scenario newScenario, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newScenario, MacroPlannerSolverPackage.LP_MACRO_PLANNER__SCENARIO, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScenario(Scenario newScenario) {
		if (newScenario != eInternalContainer() || (eContainerFeatureID() != MacroPlannerSolverPackage.LP_MACRO_PLANNER__SCENARIO && newScenario != null)) {
			if (EcoreUtil.isAncestor(this, newScenario))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newScenario != null)
				msgs = ((InternalEObject)newScenario).eInverseAdd(this, MacroPlannerSolverPackage.SCENARIO__LPS, Scenario.class, msgs);
			msgs = basicSetScenario(newScenario, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MacroPlannerSolverPackage.LP_MACRO_PLANNER__SCENARIO, newScenario, newScenario));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeLine getTimeLine() {
		return timeLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimeLine(TimeLine newTimeLine, NotificationChain msgs) {
		TimeLine oldTimeLine = timeLine;
		timeLine = newTimeLine;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MacroPlannerSolverPackage.LP_MACRO_PLANNER__TIME_LINE, oldTimeLine, newTimeLine);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeLine(TimeLine newTimeLine) {
		if (newTimeLine != timeLine) {
			NotificationChain msgs = null;
			if (timeLine != null)
				msgs = ((InternalEObject)timeLine).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MacroPlannerSolverPackage.LP_MACRO_PLANNER__TIME_LINE, null, msgs);
			if (newTimeLine != null)
				msgs = ((InternalEObject)newTimeLine).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MacroPlannerSolverPackage.LP_MACRO_PLANNER__TIME_LINE, null, msgs);
			msgs = basicSetTimeLine(newTimeLine, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MacroPlannerSolverPackage.LP_MACRO_PLANNER__TIME_LINE, newTimeLine, newTimeLine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratorLpGoal getCostRoutings() {
		return costRoutings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCostRoutings(GeneratorLpGoal newCostRoutings, NotificationChain msgs) {
		GeneratorLpGoal oldCostRoutings = costRoutings;
		costRoutings = newCostRoutings;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MacroPlannerSolverPackage.LP_MACRO_PLANNER__COST_ROUTINGS, oldCostRoutings, newCostRoutings);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCostRoutings(GeneratorLpGoal newCostRoutings) {
		if (newCostRoutings != costRoutings) {
			NotificationChain msgs = null;
			if (costRoutings != null)
				msgs = ((InternalEObject)costRoutings).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MacroPlannerSolverPackage.LP_MACRO_PLANNER__COST_ROUTINGS, null, msgs);
			if (newCostRoutings != null)
				msgs = ((InternalEObject)newCostRoutings).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MacroPlannerSolverPackage.LP_MACRO_PLANNER__COST_ROUTINGS, null, msgs);
			msgs = basicSetCostRoutings(newCostRoutings, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MacroPlannerSolverPackage.LP_MACRO_PLANNER__COST_ROUTINGS, newCostRoutings, newCostRoutings));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratorLpGoal getCostSupplies() {
		return costSupplies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCostSupplies(GeneratorLpGoal newCostSupplies, NotificationChain msgs) {
		GeneratorLpGoal oldCostSupplies = costSupplies;
		costSupplies = newCostSupplies;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MacroPlannerSolverPackage.LP_MACRO_PLANNER__COST_SUPPLIES, oldCostSupplies, newCostSupplies);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCostSupplies(GeneratorLpGoal newCostSupplies) {
		if (newCostSupplies != costSupplies) {
			NotificationChain msgs = null;
			if (costSupplies != null)
				msgs = ((InternalEObject)costSupplies).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MacroPlannerSolverPackage.LP_MACRO_PLANNER__COST_SUPPLIES, null, msgs);
			if (newCostSupplies != null)
				msgs = ((InternalEObject)newCostSupplies).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MacroPlannerSolverPackage.LP_MACRO_PLANNER__COST_SUPPLIES, null, msgs);
			msgs = basicSetCostSupplies(newCostSupplies, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MacroPlannerSolverPackage.LP_MACRO_PLANNER__COST_SUPPLIES, newCostSupplies, newCostSupplies));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratorLpGoal getCostCapacities() {
		return costCapacities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCostCapacities(GeneratorLpGoal newCostCapacities, NotificationChain msgs) {
		GeneratorLpGoal oldCostCapacities = costCapacities;
		costCapacities = newCostCapacities;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MacroPlannerSolverPackage.LP_MACRO_PLANNER__COST_CAPACITIES, oldCostCapacities, newCostCapacities);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCostCapacities(GeneratorLpGoal newCostCapacities) {
		if (newCostCapacities != costCapacities) {
			NotificationChain msgs = null;
			if (costCapacities != null)
				msgs = ((InternalEObject)costCapacities).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MacroPlannerSolverPackage.LP_MACRO_PLANNER__COST_CAPACITIES, null, msgs);
			if (newCostCapacities != null)
				msgs = ((InternalEObject)newCostCapacities).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MacroPlannerSolverPackage.LP_MACRO_PLANNER__COST_CAPACITIES, null, msgs);
			msgs = basicSetCostCapacities(newCostCapacities, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MacroPlannerSolverPackage.LP_MACRO_PLANNER__COST_CAPACITIES, newCostCapacities, newCostCapacities));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratorLpGoal getCostAvailabilities() {
		return costAvailabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCostAvailabilities(GeneratorLpGoal newCostAvailabilities, NotificationChain msgs) {
		GeneratorLpGoal oldCostAvailabilities = costAvailabilities;
		costAvailabilities = newCostAvailabilities;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MacroPlannerSolverPackage.LP_MACRO_PLANNER__COST_AVAILABILITIES, oldCostAvailabilities, newCostAvailabilities);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCostAvailabilities(GeneratorLpGoal newCostAvailabilities) {
		if (newCostAvailabilities != costAvailabilities) {
			NotificationChain msgs = null;
			if (costAvailabilities != null)
				msgs = ((InternalEObject)costAvailabilities).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MacroPlannerSolverPackage.LP_MACRO_PLANNER__COST_AVAILABILITIES, null, msgs);
			if (newCostAvailabilities != null)
				msgs = ((InternalEObject)newCostAvailabilities).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MacroPlannerSolverPackage.LP_MACRO_PLANNER__COST_AVAILABILITIES, null, msgs);
			msgs = basicSetCostAvailabilities(newCostAvailabilities, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MacroPlannerSolverPackage.LP_MACRO_PLANNER__COST_AVAILABILITIES, newCostAvailabilities, newCostAvailabilities));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratorLpGoal getPenaltyCapacities() {
		return penaltyCapacities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPenaltyCapacities(GeneratorLpGoal newPenaltyCapacities, NotificationChain msgs) {
		GeneratorLpGoal oldPenaltyCapacities = penaltyCapacities;
		penaltyCapacities = newPenaltyCapacities;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MacroPlannerSolverPackage.LP_MACRO_PLANNER__PENALTY_CAPACITIES, oldPenaltyCapacities, newPenaltyCapacities);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPenaltyCapacities(GeneratorLpGoal newPenaltyCapacities) {
		if (newPenaltyCapacities != penaltyCapacities) {
			NotificationChain msgs = null;
			if (penaltyCapacities != null)
				msgs = ((InternalEObject)penaltyCapacities).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MacroPlannerSolverPackage.LP_MACRO_PLANNER__PENALTY_CAPACITIES, null, msgs);
			if (newPenaltyCapacities != null)
				msgs = ((InternalEObject)newPenaltyCapacities).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MacroPlannerSolverPackage.LP_MACRO_PLANNER__PENALTY_CAPACITIES, null, msgs);
			msgs = basicSetPenaltyCapacities(newPenaltyCapacities, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MacroPlannerSolverPackage.LP_MACRO_PLANNER__PENALTY_CAPACITIES, newPenaltyCapacities, newPenaltyCapacities));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratorLpGoal getPenaltyAvailabilities() {
		return penaltyAvailabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPenaltyAvailabilities(GeneratorLpGoal newPenaltyAvailabilities, NotificationChain msgs) {
		GeneratorLpGoal oldPenaltyAvailabilities = penaltyAvailabilities;
		penaltyAvailabilities = newPenaltyAvailabilities;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MacroPlannerSolverPackage.LP_MACRO_PLANNER__PENALTY_AVAILABILITIES, oldPenaltyAvailabilities, newPenaltyAvailabilities);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPenaltyAvailabilities(GeneratorLpGoal newPenaltyAvailabilities) {
		if (newPenaltyAvailabilities != penaltyAvailabilities) {
			NotificationChain msgs = null;
			if (penaltyAvailabilities != null)
				msgs = ((InternalEObject)penaltyAvailabilities).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MacroPlannerSolverPackage.LP_MACRO_PLANNER__PENALTY_AVAILABILITIES, null, msgs);
			if (newPenaltyAvailabilities != null)
				msgs = ((InternalEObject)newPenaltyAvailabilities).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MacroPlannerSolverPackage.LP_MACRO_PLANNER__PENALTY_AVAILABILITIES, null, msgs);
			msgs = basicSetPenaltyAvailabilities(newPenaltyAvailabilities, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MacroPlannerSolverPackage.LP_MACRO_PLANNER__PENALTY_AVAILABILITIES, newPenaltyAvailabilities, newPenaltyAvailabilities));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Solver> getSolvers() {
		if (solvers == null) {
			solvers = new EObjectContainmentEList<Solver>(Solver.class, this, MacroPlannerSolverPackage.LP_MACRO_PLANNER__SOLVERS);
		}
		return solvers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MacroPlannerSolverPackage.LP_MACRO_PLANNER__PRODUCT_SET:
				if (productSet != null)
					msgs = ((InternalEObject)productSet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MacroPlannerSolverPackage.LP_MACRO_PLANNER__PRODUCT_SET, null, msgs);
				return basicSetProductSet((LPProductSet)otherEnd, msgs);
			case MacroPlannerSolverPackage.LP_MACRO_PLANNER__RESOURCE_SET:
				if (resourceSet != null)
					msgs = ((InternalEObject)resourceSet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MacroPlannerSolverPackage.LP_MACRO_PLANNER__RESOURCE_SET, null, msgs);
				return basicSetResourceSet((LPResourceSet)otherEnd, msgs);
			case MacroPlannerSolverPackage.LP_MACRO_PLANNER__ROUTING_SET:
				if (routingSet != null)
					msgs = ((InternalEObject)routingSet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MacroPlannerSolverPackage.LP_MACRO_PLANNER__ROUTING_SET, null, msgs);
				return basicSetRoutingSet((LPRoutingSet)otherEnd, msgs);
			case MacroPlannerSolverPackage.LP_MACRO_PLANNER__SCENARIO:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetScenario((Scenario)otherEnd, msgs);
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
			case MacroPlannerSolverPackage.LP_MACRO_PLANNER__PRODUCT_SET:
				return basicSetProductSet(null, msgs);
			case MacroPlannerSolverPackage.LP_MACRO_PLANNER__RESOURCE_SET:
				return basicSetResourceSet(null, msgs);
			case MacroPlannerSolverPackage.LP_MACRO_PLANNER__ROUTING_SET:
				return basicSetRoutingSet(null, msgs);
			case MacroPlannerSolverPackage.LP_MACRO_PLANNER__SCENARIO:
				return basicSetScenario(null, msgs);
			case MacroPlannerSolverPackage.LP_MACRO_PLANNER__TIME_LINE:
				return basicSetTimeLine(null, msgs);
			case MacroPlannerSolverPackage.LP_MACRO_PLANNER__COST_ROUTINGS:
				return basicSetCostRoutings(null, msgs);
			case MacroPlannerSolverPackage.LP_MACRO_PLANNER__COST_SUPPLIES:
				return basicSetCostSupplies(null, msgs);
			case MacroPlannerSolverPackage.LP_MACRO_PLANNER__COST_CAPACITIES:
				return basicSetCostCapacities(null, msgs);
			case MacroPlannerSolverPackage.LP_MACRO_PLANNER__COST_AVAILABILITIES:
				return basicSetCostAvailabilities(null, msgs);
			case MacroPlannerSolverPackage.LP_MACRO_PLANNER__PENALTY_CAPACITIES:
				return basicSetPenaltyCapacities(null, msgs);
			case MacroPlannerSolverPackage.LP_MACRO_PLANNER__PENALTY_AVAILABILITIES:
				return basicSetPenaltyAvailabilities(null, msgs);
			case MacroPlannerSolverPackage.LP_MACRO_PLANNER__SOLVERS:
				return ((InternalEList<?>)getSolvers()).basicRemove(otherEnd, msgs);
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
			case MacroPlannerSolverPackage.LP_MACRO_PLANNER__SCENARIO:
				return eInternalContainer().eInverseRemove(this, MacroPlannerSolverPackage.SCENARIO__LPS, Scenario.class, msgs);
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
			case MacroPlannerSolverPackage.LP_MACRO_PLANNER__BUCKET_SIZE:
				return getBucketSize();
			case MacroPlannerSolverPackage.LP_MACRO_PLANNER__EPSILON:
				return getEpsilon();
			case MacroPlannerSolverPackage.LP_MACRO_PLANNER__PRODUCT_SET:
				return getProductSet();
			case MacroPlannerSolverPackage.LP_MACRO_PLANNER__RESOURCE_SET:
				return getResourceSet();
			case MacroPlannerSolverPackage.LP_MACRO_PLANNER__ROUTING_SET:
				return getRoutingSet();
			case MacroPlannerSolverPackage.LP_MACRO_PLANNER__SCENARIO:
				return getScenario();
			case MacroPlannerSolverPackage.LP_MACRO_PLANNER__TIME_LINE:
				return getTimeLine();
			case MacroPlannerSolverPackage.LP_MACRO_PLANNER__COST_ROUTINGS:
				return getCostRoutings();
			case MacroPlannerSolverPackage.LP_MACRO_PLANNER__COST_SUPPLIES:
				return getCostSupplies();
			case MacroPlannerSolverPackage.LP_MACRO_PLANNER__COST_CAPACITIES:
				return getCostCapacities();
			case MacroPlannerSolverPackage.LP_MACRO_PLANNER__COST_AVAILABILITIES:
				return getCostAvailabilities();
			case MacroPlannerSolverPackage.LP_MACRO_PLANNER__PENALTY_CAPACITIES:
				return getPenaltyCapacities();
			case MacroPlannerSolverPackage.LP_MACRO_PLANNER__PENALTY_AVAILABILITIES:
				return getPenaltyAvailabilities();
			case MacroPlannerSolverPackage.LP_MACRO_PLANNER__SOLVERS:
				return getSolvers();
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
			case MacroPlannerSolverPackage.LP_MACRO_PLANNER__BUCKET_SIZE:
				setBucketSize((BucketType)newValue);
				return;
			case MacroPlannerSolverPackage.LP_MACRO_PLANNER__EPSILON:
				setEpsilon((Double)newValue);
				return;
			case MacroPlannerSolverPackage.LP_MACRO_PLANNER__PRODUCT_SET:
				setProductSet((LPProductSet)newValue);
				return;
			case MacroPlannerSolverPackage.LP_MACRO_PLANNER__RESOURCE_SET:
				setResourceSet((LPResourceSet)newValue);
				return;
			case MacroPlannerSolverPackage.LP_MACRO_PLANNER__ROUTING_SET:
				setRoutingSet((LPRoutingSet)newValue);
				return;
			case MacroPlannerSolverPackage.LP_MACRO_PLANNER__SCENARIO:
				setScenario((Scenario)newValue);
				return;
			case MacroPlannerSolverPackage.LP_MACRO_PLANNER__TIME_LINE:
				setTimeLine((TimeLine)newValue);
				return;
			case MacroPlannerSolverPackage.LP_MACRO_PLANNER__COST_ROUTINGS:
				setCostRoutings((GeneratorLpGoal)newValue);
				return;
			case MacroPlannerSolverPackage.LP_MACRO_PLANNER__COST_SUPPLIES:
				setCostSupplies((GeneratorLpGoal)newValue);
				return;
			case MacroPlannerSolverPackage.LP_MACRO_PLANNER__COST_CAPACITIES:
				setCostCapacities((GeneratorLpGoal)newValue);
				return;
			case MacroPlannerSolverPackage.LP_MACRO_PLANNER__COST_AVAILABILITIES:
				setCostAvailabilities((GeneratorLpGoal)newValue);
				return;
			case MacroPlannerSolverPackage.LP_MACRO_PLANNER__PENALTY_CAPACITIES:
				setPenaltyCapacities((GeneratorLpGoal)newValue);
				return;
			case MacroPlannerSolverPackage.LP_MACRO_PLANNER__PENALTY_AVAILABILITIES:
				setPenaltyAvailabilities((GeneratorLpGoal)newValue);
				return;
			case MacroPlannerSolverPackage.LP_MACRO_PLANNER__SOLVERS:
				getSolvers().clear();
				getSolvers().addAll((Collection<? extends Solver>)newValue);
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
			case MacroPlannerSolverPackage.LP_MACRO_PLANNER__BUCKET_SIZE:
				setBucketSize(BUCKET_SIZE_EDEFAULT);
				return;
			case MacroPlannerSolverPackage.LP_MACRO_PLANNER__EPSILON:
				setEpsilon(EPSILON_EDEFAULT);
				return;
			case MacroPlannerSolverPackage.LP_MACRO_PLANNER__PRODUCT_SET:
				setProductSet((LPProductSet)null);
				return;
			case MacroPlannerSolverPackage.LP_MACRO_PLANNER__RESOURCE_SET:
				setResourceSet((LPResourceSet)null);
				return;
			case MacroPlannerSolverPackage.LP_MACRO_PLANNER__ROUTING_SET:
				setRoutingSet((LPRoutingSet)null);
				return;
			case MacroPlannerSolverPackage.LP_MACRO_PLANNER__SCENARIO:
				setScenario((Scenario)null);
				return;
			case MacroPlannerSolverPackage.LP_MACRO_PLANNER__TIME_LINE:
				setTimeLine((TimeLine)null);
				return;
			case MacroPlannerSolverPackage.LP_MACRO_PLANNER__COST_ROUTINGS:
				setCostRoutings((GeneratorLpGoal)null);
				return;
			case MacroPlannerSolverPackage.LP_MACRO_PLANNER__COST_SUPPLIES:
				setCostSupplies((GeneratorLpGoal)null);
				return;
			case MacroPlannerSolverPackage.LP_MACRO_PLANNER__COST_CAPACITIES:
				setCostCapacities((GeneratorLpGoal)null);
				return;
			case MacroPlannerSolverPackage.LP_MACRO_PLANNER__COST_AVAILABILITIES:
				setCostAvailabilities((GeneratorLpGoal)null);
				return;
			case MacroPlannerSolverPackage.LP_MACRO_PLANNER__PENALTY_CAPACITIES:
				setPenaltyCapacities((GeneratorLpGoal)null);
				return;
			case MacroPlannerSolverPackage.LP_MACRO_PLANNER__PENALTY_AVAILABILITIES:
				setPenaltyAvailabilities((GeneratorLpGoal)null);
				return;
			case MacroPlannerSolverPackage.LP_MACRO_PLANNER__SOLVERS:
				getSolvers().clear();
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
			case MacroPlannerSolverPackage.LP_MACRO_PLANNER__BUCKET_SIZE:
				return bucketSize != BUCKET_SIZE_EDEFAULT;
			case MacroPlannerSolverPackage.LP_MACRO_PLANNER__EPSILON:
				return epsilon != EPSILON_EDEFAULT;
			case MacroPlannerSolverPackage.LP_MACRO_PLANNER__PRODUCT_SET:
				return productSet != null;
			case MacroPlannerSolverPackage.LP_MACRO_PLANNER__RESOURCE_SET:
				return resourceSet != null;
			case MacroPlannerSolverPackage.LP_MACRO_PLANNER__ROUTING_SET:
				return routingSet != null;
			case MacroPlannerSolverPackage.LP_MACRO_PLANNER__SCENARIO:
				return getScenario() != null;
			case MacroPlannerSolverPackage.LP_MACRO_PLANNER__TIME_LINE:
				return timeLine != null;
			case MacroPlannerSolverPackage.LP_MACRO_PLANNER__COST_ROUTINGS:
				return costRoutings != null;
			case MacroPlannerSolverPackage.LP_MACRO_PLANNER__COST_SUPPLIES:
				return costSupplies != null;
			case MacroPlannerSolverPackage.LP_MACRO_PLANNER__COST_CAPACITIES:
				return costCapacities != null;
			case MacroPlannerSolverPackage.LP_MACRO_PLANNER__COST_AVAILABILITIES:
				return costAvailabilities != null;
			case MacroPlannerSolverPackage.LP_MACRO_PLANNER__PENALTY_CAPACITIES:
				return penaltyCapacities != null;
			case MacroPlannerSolverPackage.LP_MACRO_PLANNER__PENALTY_AVAILABILITIES:
				return penaltyAvailabilities != null;
			case MacroPlannerSolverPackage.LP_MACRO_PLANNER__SOLVERS:
				return solvers != null && !solvers.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (BucketSize: ");
		result.append(bucketSize);
		result.append(", Epsilon: ");
		result.append(epsilon);
		result.append(')');
		return result.toString();
	}


	/**
	 * @return 
	 * 
	 */
	@Override
	public ReturnFeedback generate() {
		Scenario scenario = this.getScenario();
		
		if ( scenario == null ) { 
			return new ReturnFeedback(false, "LPMacroPlanner.generate: no Scenario"); 
		}
		
		if ( scenario.getSelectedDataElements()==null ){ 
			return new ReturnFeedback(false, "LPMacroPlanner.generate: no Master Data"); 
		}
		// refresh the time line
		TimeLine timeLine = this.getTimeLine();
		if ( timeLine==null){
			timeLine = TimeDiscreteFactory.eINSTANCE.createTimeLine();
			this.setTimeLine(timeLine);
		}
		timeLine.setHorizonStart(scenario.getScenarioStart());
		timeLine.setHorizonEnd  (scenario.getScenarioEnd());
		timeLine.setBucketType  (this.getBucketSize());
		timeLine.refreshHorizon();
		
		// generate
		return super.generate();
	}

	/**
	 * 
	 */
	@Override
	public void generateRootTuples() {
		super.generateRootTuples();
		
		LPProductSet products = MacroPlannerSolverFactory.eINSTANCE.createLPProductSet();
		products.setName("products");
		this.setProductSet(products);  // owning
		
		LPResourceSet resources = MacroPlannerSolverFactory.eINSTANCE.createLPResourceSet();
		resources.setName("resources");
		this.setResourceSet(resources);  // owning
		
		LPRoutingSet routings = MacroPlannerSolverFactory.eINSTANCE.createLPRoutingSet();
		routings.setName("routings");
		this.setRoutingSet(routings);  // owning
		
	}


	/**
	 * 
	 */
	@Override
	public void generateGoals() {
		super.generateGoals();
		
		this.generateGoalCostRoutings();
		this.generateGoalCostSupplies();
		this.generateGoalCostCapacities();
		this.generateGoalCostAvailabilities();

		this.generateGoalPenaltyCapacities();
		this.generateGoalPenaltyAvailabilities();
	}

	/**
	 * 
	 */
	private void generateGoalCostRoutings(){
		LPRoutingSet routings = this.getRoutingSet();
		
		GeneratorLpGoal goal = SolverFactory.eINSTANCE.createGeneratorLpGoal();
		goal.setName("min_cost_routings");
		goal.setObjectiveType(EnumObjectiveType.MINIMUM);
		goal.setMinValueIndicative(0);
		goal.setMaxValueIndicative(100.0f);
		for ( LPRouting routing : routings.getRoutings()){
			float routingCost = routing.getRouting().getCost();
			for ( LPRoutingBucket routing_bucket : routing.getLPBuckets()){
				GeneratorLpVar quantity_planned  = routing_bucket.getPlanned();
				goal.constructTerm(quantity_planned, routingCost);
			}
		}
		this.setCostRoutings(goal); // owning
	}

	/**
	 * 
	 */
	private void generateGoalCostSupplies(){
		LPProductSet products = this.getProductSet();
		
		GeneratorLpGoal goal = SolverFactory.eINSTANCE.createGeneratorLpGoal();
		goal.setName("min_cost_supplies");
		goal.setObjectiveType(EnumObjectiveType.MINIMUM);
		goal.setMinValueIndicative(0);
		goal.setMaxValueIndicative(100.0f);
		for ( LPProduct product : products.getProducts()){
			for ( LPSupply supply : product.getSupplies()){
				float supplyCost = supply.getSupply().getCost();
				for (LPSupplyBucket supply_bucket : supply.getLPBuckets()){
					GeneratorLpVar quantity_supplied  = supply_bucket.getSupplied();
					goal.constructTerm(quantity_supplied, supplyCost);
				}
			}
		}
		this.setCostSupplies(goal); // owning
	}

	/**
	 * 
	 */
	private void generateGoalCostAvailabilities(){
		LPResourceSet resources = this.getResourceSet();
		
		GeneratorLpGoal goal = SolverFactory.eINSTANCE.createGeneratorLpGoal();
		goal.setName("min_cost_availabilities");
		goal.setObjectiveType(EnumObjectiveType.MINIMUM);
		goal.setMinValueIndicative(0);
		goal.setMaxValueIndicative(100.0f);
		for ( LPResource resource: resources.getResources()){
			for ( LPAvailability lp_availability: resource.getAvailabilities()){
				Availability availability = lp_availability.getAvailability();
				float availabilityCost = availability.getCost(); // per time unit and per unit usage
				for (LPAvailabilityBucket availability_bucket : lp_availability.getLPBuckets()){
					GeneratorLpVar quantity_reserved = availability_bucket.getReserved(); // on the whole bucket
					float durationReserved = availability_bucket.getBucket().getHours()/availability.getMacroPlannerData().getTimeUnit().toHours();
					float costPerBucket = availabilityCost*durationReserved; // per unit of usage
					goal.constructTerm(quantity_reserved, costPerBucket);
				}
			}
		}
		this.setCostAvailabilities(goal); // owning
	}


	/**
	 * 
	 */
	private void generateGoalPenaltyAvailabilities(){
		LPResourceSet resources = this.getResourceSet();
		
		GeneratorLpGoal goal = SolverFactory.eINSTANCE.createGeneratorLpGoal();
		goal.setName("min_penalty_availabilities");
		goal.setObjectiveType(EnumObjectiveType.MINIMUM);
		goal.setMinValueIndicative(0);
		goal.setMaxValueIndicative(100.0f);
		for ( LPResource resource: resources.getResources()){
			for ( LPAvailability lp_availability: resource.getAvailabilities()){
			Availability availability = lp_availability.getAvailability();
			float availabilityPenalty = availability.getPenalty();
			for (LPAvailabilityBucket availability_bucket : lp_availability.getLPBuckets()){
				float durationReserved = availability_bucket.getBucket().getHours()/availability.getMacroPlannerData().getTimeUnit().toHours();
				float penaltyPerBucket = availabilityPenalty*durationReserved;
				GeneratorLpVar slack = availability_bucket.getSlack();
				goal.constructTerm(slack, penaltyPerBucket);
				}
			}
		}
		this.setPenaltyAvailabilities(goal); // owning
	}


	/**
	 * 
	 */
	private void generateGoalCostCapacities(){
		LPProductSet products = this.getProductSet();
		
		GeneratorLpGoal goal = SolverFactory.eINSTANCE.createGeneratorLpGoal();
		goal.setName("min_cost_capacities");
		goal.setObjectiveType(EnumObjectiveType.MINIMUM);
		goal.setMinValueIndicative(0);
		goal.setMaxValueIndicative(100.0f);
		for ( LPProduct product : products.getProducts()){
			for ( LPCapacity lp_capacity : product.getCapacities()){
				Capacity capacity= lp_capacity.getCapacity();
				float capacityCost = capacity.getCost(); // cost per unit of time
				for (LPCapacityBucket capacity_bucket : lp_capacity.getLPBuckets()){
					float durationStocked = capacity_bucket.getBucket().getHours()/capacity.getMacroPlannerData().getTimeUnit().toHours();
					float costPerBucket = durationStocked*capacityCost;
					GeneratorLpVar quantity_stocked = capacity_bucket.getStocked();
					goal.constructTerm(quantity_stocked, costPerBucket);
				}
			}
		}
		this.setCostCapacities(goal); // owning
	}

	/**
	 * 
	 */
	private void generateGoalPenaltyCapacities(){
		LPProductSet products = this.getProductSet();
		
		GeneratorLpGoal goal = SolverFactory.eINSTANCE.createGeneratorLpGoal();
		goal.setName("min_penalty_capacities");
		goal.setObjectiveType(EnumObjectiveType.MINIMUM);
		goal.setMinValueIndicative(0);
		goal.setMaxValueIndicative(100.0f);
		for ( LPProduct product : products.getProducts()){
			for ( LPCapacity lp_capacity : product.getCapacities()){
				Capacity capacity= lp_capacity.getCapacity();
				float capacityPenalty= capacity.getPenalty();
				for (LPCapacityBucket capacity_bucket : lp_capacity.getLPBuckets()){
					float durationStocked = capacity_bucket.getBucket().getHours()/capacity.getMacroPlannerData().getTimeUnit().toHours();
					float penaltyPerBucket = durationStocked*capacityPenalty;
					GeneratorLpVar slack = capacity_bucket.getSlack();
					goal.constructTerm(slack, penaltyPerBucket);
				}
			}
		}
		this.setPenaltyCapacities(goal); // owning
	}


} //LPMacroPlannerImpl
