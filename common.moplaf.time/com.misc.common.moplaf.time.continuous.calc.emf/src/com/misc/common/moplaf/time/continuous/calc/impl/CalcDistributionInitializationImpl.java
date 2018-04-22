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
package com.misc.common.moplaf.time.continuous.calc.impl;

import com.misc.common.moplaf.propagator2.PropagatorFunction;
import com.misc.common.moplaf.time.continuous.Distribution;
import com.misc.common.moplaf.time.continuous.calc.CalcDistributionInitialization;
import com.misc.common.moplaf.time.continuous.calc.ScopeDistribution;
import com.misc.common.moplaf.time.continuous.calc.TimeContinuousCalcPackage;
import com.misc.common.moplaf.time.continuous.impl.PropagatorFunctionDistributionImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Propagator Calc Distribution Initialization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.time.continuous.calc.impl.CalcDistributionInitializationImpl#getConcreteParent <em>Concrete Parent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CalcDistributionInitializationImpl extends PropagatorFunctionDistributionImpl implements CalcDistributionInitialization {
	/**
	 * The cached value of the '{@link #getConcreteParent() <em>Concrete Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcreteParent()
	 * @generated
	 * @ordered
	 */
	protected ScopeDistribution concreteParent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CalcDistributionInitializationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TimeContinuousCalcPackage.Literals.CALC_DISTRIBUTION_INITIALIZATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScopeDistribution getConcreteParent() {
		if (concreteParent != null && concreteParent.eIsProxy()) {
			InternalEObject oldConcreteParent = (InternalEObject)concreteParent;
			concreteParent = (ScopeDistribution)eResolveProxy(oldConcreteParent);
			if (concreteParent != oldConcreteParent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TimeContinuousCalcPackage.CALC_DISTRIBUTION_INITIALIZATION__CONCRETE_PARENT, oldConcreteParent, concreteParent));
			}
		}
		return concreteParent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScopeDistribution basicGetConcreteParent() {
		return concreteParent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConcreteParent(ScopeDistribution newConcreteParent) {
		ScopeDistribution oldConcreteParent = concreteParent;
		concreteParent = newConcreteParent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimeContinuousCalcPackage.CALC_DISTRIBUTION_INITIALIZATION__CONCRETE_PARENT, oldConcreteParent, concreteParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TimeContinuousCalcPackage.CALC_DISTRIBUTION_INITIALIZATION__CONCRETE_PARENT:
				if (resolve) return getConcreteParent();
				return basicGetConcreteParent();
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
			case TimeContinuousCalcPackage.CALC_DISTRIBUTION_INITIALIZATION__CONCRETE_PARENT:
				setConcreteParent((ScopeDistribution)newValue);
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
			case TimeContinuousCalcPackage.CALC_DISTRIBUTION_INITIALIZATION__CONCRETE_PARENT:
				setConcreteParent((ScopeDistribution)null);
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
			case TimeContinuousCalcPackage.CALC_DISTRIBUTION_INITIALIZATION__CONCRETE_PARENT:
				return concreteParent != null;
		}
		return super.eIsSet(featureID);
	}

	@Override
	public void init() {
		super.init();
		Distribution distribution = this.getDistribution();
		this.setConcreteParent(distribution.getPropagatorFunction(ScopeDistribution.class));
	}

	/*
	 * (non-Javadoc)
	 * @see com.misc.common.moplaf.propagator2.impl.PropagatorFunctionImpl#doGetParent()
	 */
	@Override
	public PropagatorFunction doGetParent() {
		return this.getConcreteParent();
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.misc.common.moplaf.propagator2.impl.PropagatorFunctionImpl#doRefresh()
	 */
	@Override
	public void doRefresh() {
		Distribution distribution = this.getDistribution();
		distribution.refreshInit();
	}

} //PropagatorCalcDistributionInitializationImpl
