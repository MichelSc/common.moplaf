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



import com.misc.common.moplaf.macroplanner.Capacity;
import com.misc.common.moplaf.macroplanner.solver.LPCapacity;
import com.misc.common.moplaf.macroplanner.solver.LPCapacityBucket;
import com.misc.common.moplaf.macroplanner.solver.LPProduct;
import com.misc.common.moplaf.macroplanner.solver.LPProductBucket;
import com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage;
import com.misc.common.moplaf.solver.EnumLpConsType;
import com.misc.common.moplaf.solver.GeneratorLpCons;
import com.misc.common.moplaf.solver.GeneratorLpVar;
import com.misc.common.moplaf.solver.SolverFactory;
import com.misc.common.moplaf.solver.util.Util;
import com.misc.common.moplaf.time.discrete.ObjectTimeBucket;
import com.misc.common.moplaf.time.discrete.TimeBucket;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>LP Capacity Bucket</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.impl.LPCapacityBucketImpl#getCapacity <em>Capacity</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.impl.LPCapacityBucketImpl#getProductBucket <em>Product Bucket</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.impl.LPCapacityBucketImpl#getStocked <em>Stocked</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.impl.LPCapacityBucketImpl#getSlack <em>Slack</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.impl.LPCapacityBucketImpl#getBalance <em>Balance</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.impl.LPCapacityBucketImpl#isTightSelectedSolution <em>Tight Selected Solution</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.impl.LPCapacityBucketImpl#isSlackSelectedSolution <em>Slack Selected Solution</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LPCapacityBucketImpl extends LPTimeBucketImpl implements LPCapacityBucket {
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
	 * The cached value of the '{@link #getStocked() <em>Stocked</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStocked()
	 * @generated
	 * @ordered
	 */
	protected GeneratorLpVar stocked;

	/**
	 * The cached value of the '{@link #getSlack() <em>Slack</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlack()
	 * @generated
	 * @ordered
	 */
	protected GeneratorLpVar slack;

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
	 * The default value of the '{@link #isTightSelectedSolution() <em>Tight Selected Solution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTightSelectedSolution()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TIGHT_SELECTED_SOLUTION_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isSlackSelectedSolution() <em>Slack Selected Solution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSlackSelectedSolution()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SLACK_SELECTED_SOLUTION_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LPCapacityBucketImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MacroPlannerSolverPackage.Literals.LP_CAPACITY_BUCKET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LPCapacity getCapacity() {
		if (eContainerFeatureID() != MacroPlannerSolverPackage.LP_CAPACITY_BUCKET__CAPACITY) return null;
		return (LPCapacity)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCapacity(LPCapacity newCapacity, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newCapacity, MacroPlannerSolverPackage.LP_CAPACITY_BUCKET__CAPACITY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCapacity(LPCapacity newCapacity) {
		if (newCapacity != eInternalContainer() || (eContainerFeatureID() != MacroPlannerSolverPackage.LP_CAPACITY_BUCKET__CAPACITY && newCapacity != null)) {
			if (EcoreUtil.isAncestor(this, newCapacity))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newCapacity != null)
				msgs = ((InternalEObject)newCapacity).eInverseAdd(this, MacroPlannerSolverPackage.LP_CAPACITY__LP_BUCKETS, LPCapacity.class, msgs);
			msgs = basicSetCapacity(newCapacity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MacroPlannerSolverPackage.LP_CAPACITY_BUCKET__CAPACITY, newCapacity, newCapacity));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MacroPlannerSolverPackage.LP_CAPACITY_BUCKET__PRODUCT_BUCKET, oldProductBucket, productBucket));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MacroPlannerSolverPackage.LP_CAPACITY_BUCKET__PRODUCT_BUCKET, oldProductBucket, newProductBucket);
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
				msgs = ((InternalEObject)productBucket).eInverseRemove(this, MacroPlannerSolverPackage.LP_PRODUCT_BUCKET__CAPACITIES, LPProductBucket.class, msgs);
			if (newProductBucket != null)
				msgs = ((InternalEObject)newProductBucket).eInverseAdd(this, MacroPlannerSolverPackage.LP_PRODUCT_BUCKET__CAPACITIES, LPProductBucket.class, msgs);
			msgs = basicSetProductBucket(newProductBucket, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MacroPlannerSolverPackage.LP_CAPACITY_BUCKET__PRODUCT_BUCKET, newProductBucket, newProductBucket));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MacroPlannerSolverPackage.LP_CAPACITY_BUCKET__STOCKED, oldStocked, newStocked);
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
				msgs = ((InternalEObject)stocked).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MacroPlannerSolverPackage.LP_CAPACITY_BUCKET__STOCKED, null, msgs);
			if (newStocked != null)
				msgs = ((InternalEObject)newStocked).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MacroPlannerSolverPackage.LP_CAPACITY_BUCKET__STOCKED, null, msgs);
			msgs = basicSetStocked(newStocked, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MacroPlannerSolverPackage.LP_CAPACITY_BUCKET__STOCKED, newStocked, newStocked));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratorLpVar getSlack() {
		return slack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSlack(GeneratorLpVar newSlack, NotificationChain msgs) {
		GeneratorLpVar oldSlack = slack;
		slack = newSlack;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MacroPlannerSolverPackage.LP_CAPACITY_BUCKET__SLACK, oldSlack, newSlack);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSlack(GeneratorLpVar newSlack) {
		if (newSlack != slack) {
			NotificationChain msgs = null;
			if (slack != null)
				msgs = ((InternalEObject)slack).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MacroPlannerSolverPackage.LP_CAPACITY_BUCKET__SLACK, null, msgs);
			if (newSlack != null)
				msgs = ((InternalEObject)newSlack).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MacroPlannerSolverPackage.LP_CAPACITY_BUCKET__SLACK, null, msgs);
			msgs = basicSetSlack(newSlack, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MacroPlannerSolverPackage.LP_CAPACITY_BUCKET__SLACK, newSlack, newSlack));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MacroPlannerSolverPackage.LP_CAPACITY_BUCKET__BALANCE, oldBalance, newBalance);
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
				msgs = ((InternalEObject)balance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MacroPlannerSolverPackage.LP_CAPACITY_BUCKET__BALANCE, null, msgs);
			if (newBalance != null)
				msgs = ((InternalEObject)newBalance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MacroPlannerSolverPackage.LP_CAPACITY_BUCKET__BALANCE, null, msgs);
			msgs = basicSetBalance(newBalance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MacroPlannerSolverPackage.LP_CAPACITY_BUCKET__BALANCE, newBalance, newBalance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public boolean isTightSelectedSolution() {
		double epsilon = this.getLPMacroPlanner().getEpsilon();
		double stocked = this.getStocked().getSelectedSolutionValue();
		float max = this.getCapacity().getCapacity().getQuantity();
		boolean isTight = false;
		if ( Math.abs(stocked-max)<epsilon ){
			isTight = true;
		}
		return isTight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public boolean isSlackSelectedSolution() {
		double epsilon = this.getLPMacroPlanner().getEpsilon();
		double slack = this.getSlack().getSelectedSolutionValue();
		boolean isSlack= slack>epsilon;
		return isSlack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MacroPlannerSolverPackage.LP_CAPACITY_BUCKET__CAPACITY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetCapacity((LPCapacity)otherEnd, msgs);
			case MacroPlannerSolverPackage.LP_CAPACITY_BUCKET__PRODUCT_BUCKET:
				if (productBucket != null)
					msgs = ((InternalEObject)productBucket).eInverseRemove(this, MacroPlannerSolverPackage.LP_PRODUCT_BUCKET__CAPACITIES, LPProductBucket.class, msgs);
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
			case MacroPlannerSolverPackage.LP_CAPACITY_BUCKET__CAPACITY:
				return basicSetCapacity(null, msgs);
			case MacroPlannerSolverPackage.LP_CAPACITY_BUCKET__PRODUCT_BUCKET:
				return basicSetProductBucket(null, msgs);
			case MacroPlannerSolverPackage.LP_CAPACITY_BUCKET__STOCKED:
				return basicSetStocked(null, msgs);
			case MacroPlannerSolverPackage.LP_CAPACITY_BUCKET__SLACK:
				return basicSetSlack(null, msgs);
			case MacroPlannerSolverPackage.LP_CAPACITY_BUCKET__BALANCE:
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
			case MacroPlannerSolverPackage.LP_CAPACITY_BUCKET__CAPACITY:
				return eInternalContainer().eInverseRemove(this, MacroPlannerSolverPackage.LP_CAPACITY__LP_BUCKETS, LPCapacity.class, msgs);
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
			case MacroPlannerSolverPackage.LP_CAPACITY_BUCKET__CAPACITY:
				return getCapacity();
			case MacroPlannerSolverPackage.LP_CAPACITY_BUCKET__PRODUCT_BUCKET:
				if (resolve) return getProductBucket();
				return basicGetProductBucket();
			case MacroPlannerSolverPackage.LP_CAPACITY_BUCKET__STOCKED:
				return getStocked();
			case MacroPlannerSolverPackage.LP_CAPACITY_BUCKET__SLACK:
				return getSlack();
			case MacroPlannerSolverPackage.LP_CAPACITY_BUCKET__BALANCE:
				return getBalance();
			case MacroPlannerSolverPackage.LP_CAPACITY_BUCKET__TIGHT_SELECTED_SOLUTION:
				return isTightSelectedSolution();
			case MacroPlannerSolverPackage.LP_CAPACITY_BUCKET__SLACK_SELECTED_SOLUTION:
				return isSlackSelectedSolution();
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
			case MacroPlannerSolverPackage.LP_CAPACITY_BUCKET__CAPACITY:
				setCapacity((LPCapacity)newValue);
				return;
			case MacroPlannerSolverPackage.LP_CAPACITY_BUCKET__PRODUCT_BUCKET:
				setProductBucket((LPProductBucket)newValue);
				return;
			case MacroPlannerSolverPackage.LP_CAPACITY_BUCKET__STOCKED:
				setStocked((GeneratorLpVar)newValue);
				return;
			case MacroPlannerSolverPackage.LP_CAPACITY_BUCKET__SLACK:
				setSlack((GeneratorLpVar)newValue);
				return;
			case MacroPlannerSolverPackage.LP_CAPACITY_BUCKET__BALANCE:
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
			case MacroPlannerSolverPackage.LP_CAPACITY_BUCKET__CAPACITY:
				setCapacity((LPCapacity)null);
				return;
			case MacroPlannerSolverPackage.LP_CAPACITY_BUCKET__PRODUCT_BUCKET:
				setProductBucket((LPProductBucket)null);
				return;
			case MacroPlannerSolverPackage.LP_CAPACITY_BUCKET__STOCKED:
				setStocked((GeneratorLpVar)null);
				return;
			case MacroPlannerSolverPackage.LP_CAPACITY_BUCKET__SLACK:
				setSlack((GeneratorLpVar)null);
				return;
			case MacroPlannerSolverPackage.LP_CAPACITY_BUCKET__BALANCE:
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
			case MacroPlannerSolverPackage.LP_CAPACITY_BUCKET__CAPACITY:
				return getCapacity() != null;
			case MacroPlannerSolverPackage.LP_CAPACITY_BUCKET__PRODUCT_BUCKET:
				return productBucket != null;
			case MacroPlannerSolverPackage.LP_CAPACITY_BUCKET__STOCKED:
				return stocked != null;
			case MacroPlannerSolverPackage.LP_CAPACITY_BUCKET__SLACK:
				return slack != null;
			case MacroPlannerSolverPackage.LP_CAPACITY_BUCKET__BALANCE:
				return balance != null;
			case MacroPlannerSolverPackage.LP_CAPACITY_BUCKET__TIGHT_SELECTED_SOLUTION:
				return isTightSelectedSolution() != TIGHT_SELECTED_SOLUTION_EDEFAULT;
			case MacroPlannerSolverPackage.LP_CAPACITY_BUCKET__SLACK_SELECTED_SOLUTION:
				return isSlackSelectedSolution() != SLACK_SELECTED_SOLUTION_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * 
	 */
	@Override
	public void generateTuples() {
		super.generateTuples();
		
		LPCapacity capacity = this.getCapacity();
		//TimeBucket bucket = this.getBucket();
		
		// logic name
		String name = String.format("%s,%s", capacity.getName(), this.getBucketShortName());
		this.setName(name);
	}

	/**
	 * 
	 */
	@Override
	public void generateXReferences() {
		
		super.generateXReferences();
		
		LPCapacity capacity = this.getCapacity();
		LPProduct product = capacity.getProduct();
		
		TimeBucket bucket = this.getBucket();
		ObjectTimeBucket product_bucket = product.getBucket(bucket);
		this.setProductBucket((LPProductBucket) product_bucket);
	}

	/**
	 * 
	 */
	@Override
	public void generateVars() {
		super.generateVars();
		
		// var stocked
		{
		GeneratorLpVar var = Util.createGeneratorLpVarRealPositiveUnbounded("stocked");
		this.setStocked(var);  // owning
		}
		// var slack
		{
		LPCapacity lp_capacity = this.getCapacity();
		Capacity capacity = lp_capacity.getCapacity();
		float ub = capacity.isEnforce() ? 0.0f : Float.MAX_VALUE;

		GeneratorLpVar var = Util.createGeneratorLpVarRealPositiveBounded("slack", ub);
		this.setSlack(var);  // owning
		}
	}

	/**
	 * 
	 */
	@Override
	public void generateCons() {
		super.generateCons();
		
		this.generateLpConsBalance();
	}

	/**
	 * 
	 */
	private void generateLpConsBalance(){
		LPCapacity lp_capacity = this.getCapacity();
		Capacity capacity = lp_capacity.getCapacity();

		GeneratorLpCons cons = SolverFactory.eINSTANCE.createGeneratorLpCons();
		cons.setType(EnumLpConsType.ENUM_LITERAL_LP_CONS_SMALLER_OR_EQUAL);
		cons.setName("balance");
		GeneratorLpVar var_stocked = this.getStocked();
		GeneratorLpVar var_slack   = this.getSlack();
		cons.constructTerm(var_stocked, 1.0f);
		cons.constructTerm(var_slack, -1.0f);
		float rhs = capacity.getQuantity();
		cons.setRighHandSide(rhs);
		this.setBalance(cons); // owning
	}

} //LPCapacityBucketImpl
