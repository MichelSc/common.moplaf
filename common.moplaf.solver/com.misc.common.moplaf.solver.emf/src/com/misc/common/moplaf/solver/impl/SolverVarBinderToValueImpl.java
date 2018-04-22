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
package com.misc.common.moplaf.solver.impl;

import com.misc.common.moplaf.solver.SolverPackage;
import com.misc.common.moplaf.solver.SolverVarBinderToValue;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Var Binder To Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.solver.impl.SolverVarBinderToValueImpl#getBoundValue <em>Bound Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SolverVarBinderToValueImpl extends SolverVarBinderImpl implements SolverVarBinderToValue {
	/**
	 * The default value of the '{@link #getBoundValue() <em>Bound Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoundValue()
	 * @generated
	 * @ordered
	 */
	protected static final double BOUND_VALUE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getBoundValue() <em>Bound Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoundValue()
	 * @generated
	 * @ordered
	 */
	protected double boundValue = BOUND_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SolverVarBinderToValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SolverPackage.Literals.SOLVER_VAR_BINDER_TO_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getBoundValue() {
		return boundValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoundValue(double newBoundValue) {
		double oldBoundValue = boundValue;
		boundValue = newBoundValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverPackage.SOLVER_VAR_BINDER_TO_VALUE__BOUND_VALUE, oldBoundValue, boundValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SolverPackage.SOLVER_VAR_BINDER_TO_VALUE__BOUND_VALUE:
				return getBoundValue();
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
			case SolverPackage.SOLVER_VAR_BINDER_TO_VALUE__BOUND_VALUE:
				setBoundValue((Double)newValue);
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
			case SolverPackage.SOLVER_VAR_BINDER_TO_VALUE__BOUND_VALUE:
				setBoundValue(BOUND_VALUE_EDEFAULT);
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
			case SolverPackage.SOLVER_VAR_BINDER_TO_VALUE__BOUND_VALUE:
				return boundValue != BOUND_VALUE_EDEFAULT;
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
		result.append(" (BoundValue: ");
		result.append(boundValue);
		result.append(')');
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public String getLabel() {
		String label = String.format("%s to value %f", super.getLabel(), this.getBoundValue());
		return label;
	}} //SolverVarBinderToValueImpl
