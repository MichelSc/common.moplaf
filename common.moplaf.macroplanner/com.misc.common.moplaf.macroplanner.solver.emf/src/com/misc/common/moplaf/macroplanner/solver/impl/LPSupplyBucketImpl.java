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



import com.misc.common.moplaf.macroplanner.Supply;
import com.misc.common.moplaf.macroplanner.solver.LPProduct;
import com.misc.common.moplaf.macroplanner.solver.LPProductBucket;
import com.misc.common.moplaf.macroplanner.solver.LPSupply;
import com.misc.common.moplaf.macroplanner.solver.LPSupplyBucket;
import com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage;
import com.misc.common.moplaf.solver.GeneratorLpVar;
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
 * An implementation of the model object '<em><b>LP Supply Bucket</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.impl.LPSupplyBucketImpl#getSupply <em>Supply</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.impl.LPSupplyBucketImpl#getProductBucket <em>Product Bucket</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.impl.LPSupplyBucketImpl#getSupplied <em>Supplied</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.impl.LPSupplyBucketImpl#getFraction <em>Fraction</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.impl.LPSupplyBucketImpl#isTightSelectedSolution <em>Tight Selected Solution</em>}</li>
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
	 * The default value of the '{@link #getFraction() <em>Fraction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFraction()
	 * @generated
	 * @ordered
	 */
	protected static final float FRACTION_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getFraction() <em>Fraction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFraction()
	 * @generated
	 * @ordered
	 */
	protected float fraction = FRACTION_EDEFAULT;

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
	public float getFraction() {
		return fraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFraction(float newFraction) {
		float oldFraction = fraction;
		fraction = newFraction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MacroPlannerSolverPackage.LP_SUPPLY_BUCKET__FRACTION, oldFraction, fraction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public boolean isTightSelectedSolution() {
		double epsilon = this.getLPMacroPlanner().getEpsilon();
		float supplied = this.getSupplied().getSelectedSolutionValue();
		float quantity_supplied = this.getSupply().getSupply().getQuantity()*this.getFraction();
		boolean isTight = false;
		if ( Math.abs(quantity_supplied-supplied)<epsilon ){
			isTight = true;
		}
		return isTight;
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
			case MacroPlannerSolverPackage.LP_SUPPLY_BUCKET__FRACTION:
				return getFraction();
			case MacroPlannerSolverPackage.LP_SUPPLY_BUCKET__TIGHT_SELECTED_SOLUTION:
				return isTightSelectedSolution();
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
			case MacroPlannerSolverPackage.LP_SUPPLY_BUCKET__FRACTION:
				setFraction((Float)newValue);
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
			case MacroPlannerSolverPackage.LP_SUPPLY_BUCKET__FRACTION:
				setFraction(FRACTION_EDEFAULT);
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
			case MacroPlannerSolverPackage.LP_SUPPLY_BUCKET__FRACTION:
				return fraction != FRACTION_EDEFAULT;
			case MacroPlannerSolverPackage.LP_SUPPLY_BUCKET__TIGHT_SELECTED_SOLUTION:
				return isTightSelectedSolution() != TIGHT_SELECTED_SOLUTION_EDEFAULT;
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
		result.append(" (Fraction: ");
		result.append(fraction);
		result.append(')');
		return result.toString();
	}

	/**
	 * 
	 */
	@Override
	public void generateTuples() {
		super.generateTuples();
		
		LPSupply lp_supply = this.getSupply();
		Supply supply = lp_supply.getSupply();
		TimeBucket bucket = this.getBucket();

		// fraction
     	float fraction = bucket.getIntersection(supply.getFrom(), supply.getTo());
		this.setFraction(fraction);
		
		// logic name
		String name = String.format("%s,%s", lp_supply.getName(), this.getBucketShortName());
		this.setName(name);
		
	}

	/**
	 * 
	 */
	@Override
	public void generateXReferences() {
		
		super.generateXReferences();
		
		LPSupply supply = this.getSupply();
		LPProduct product = supply.getProduct();
		
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
		
		// var supplied
		{
		LPSupply lp_supply = this.getSupply();
		Supply supply = lp_supply.getSupply();
		float quantity_supplied = supply.getQuantity()*this.getFraction();
		float lb = quantity_supplied;
		float ub = quantity_supplied;
		if ( ! supply.isEnforce()){
			if ( quantity_supplied > 0.0f ){
				lb = 0.0f;
			} else {
				ub = 0.0f;
			}
		}
		
		GeneratorLpVar var = Util.createGeneratorLpVarReal("supplied", lb, ub);
		this.setSupplied(var);  // owning
		}
	}


} //LPSupplyBucketImpl
