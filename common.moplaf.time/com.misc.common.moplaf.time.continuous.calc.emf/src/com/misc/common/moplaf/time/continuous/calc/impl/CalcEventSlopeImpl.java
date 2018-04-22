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
import com.misc.common.moplaf.time.continuous.calc.CalcEventSlope;
import com.misc.common.moplaf.time.continuous.calc.LayerDistributionSlopes;
import com.misc.common.moplaf.time.continuous.calc.TimeContinuousCalcPackage;

import com.misc.common.moplaf.time.continuous.impl.PropagatorFunctionDistributionEventImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Propagator Calc Event Slope</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.time.continuous.calc.impl.CalcEventSlopeImpl#getConcreteParent <em>Concrete Parent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CalcEventSlopeImpl extends PropagatorFunctionDistributionEventImpl implements CalcEventSlope {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CalcEventSlopeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TimeContinuousCalcPackage.Literals.CALC_EVENT_SLOPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LayerDistributionSlopes getConcreteParent() {
		LayerDistributionSlopes concreteParent = basicGetConcreteParent();
		return concreteParent != null && concreteParent.eIsProxy() ? (LayerDistributionSlopes)eResolveProxy((InternalEObject)concreteParent) : concreteParent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public LayerDistributionSlopes basicGetConcreteParent() {
			Distribution distribution = this.getDistributionEvent().getDistribution();
			if ( distribution == null ) { return null; }
			LayerDistributionSlopes layerDistributionSlopes= distribution.getPropagatorFunction(LayerDistributionSlopes.class);
			return layerDistributionSlopes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TimeContinuousCalcPackage.CALC_EVENT_SLOPE__CONCRETE_PARENT:
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TimeContinuousCalcPackage.CALC_EVENT_SLOPE__CONCRETE_PARENT:
				return basicGetConcreteParent() != null;
		}
		return super.eIsSet(featureID);
	}

	@Override
	public PropagatorFunction doGetParent() {
		return this.getConcreteParent();
	}
	
	

} //PropagatorCalcEventSlopeImpl
