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
package com.misc.common.moplaf.time.continuous.impl;

import com.misc.common.moplaf.propagator2.impl.PropagatorFunctionBindingsImpl;
import com.misc.common.moplaf.time.continuous.Distribution;
import com.misc.common.moplaf.time.continuous.PropagatorFunctionDistribution;

import com.misc.common.moplaf.time.continuous.TimeContinuousPackage;
import org.eclipse.emf.common.CommonPlugin;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Propagator Function Distribution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.time.continuous.impl.PropagatorFunctionDistributionImpl#getDistribution <em>Distribution</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PropagatorFunctionDistributionImpl extends PropagatorFunctionBindingsImpl implements PropagatorFunctionDistribution {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropagatorFunctionDistributionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TimeContinuousPackage.Literals.PROPAGATOR_FUNCTION_DISTRIBUTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Distribution getDistribution() {
		Distribution distribution = basicGetDistribution();
		return distribution != null && distribution.eIsProxy() ? (Distribution)eResolveProxy((InternalEObject)distribution) : distribution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Distribution basicGetDistribution() {
		EObject container = this.eContainer;
		if ( container instanceof Distribution){
			return (Distribution) container;
		}
		String logMessage = String.format("The owner of the PropagatorFunctionDistribution %s must be a Distribution and not %s",
                this.getClass().getName(),
                container == null ? "null" : container.getClass().getName());
		CommonPlugin.INSTANCE.log(logMessage);
		return null;	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__DISTRIBUTION:
				if (resolve) return getDistribution();
				return basicGetDistribution();
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
			case TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION__DISTRIBUTION:
				return basicGetDistribution() != null;
		}
		return super.eIsSet(featureID);
	}

	@Override
	public String getFactoryID() {
		return PropagatorFunctionDistribution.PropagatorFunctionFactoryID;
	}
} //PropagatorFunctionDistributionImpl
