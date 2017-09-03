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

import com.misc.common.moplaf.time.continuous.DistributionEvent;
import com.misc.common.moplaf.time.continuous.PropagatorFunctionDistribution;
import com.misc.common.moplaf.time.continuous.PropagatorFunctionDistributionEvent;

import com.misc.common.moplaf.time.continuous.TimeContinuousPackage;
import org.eclipse.emf.common.CommonPlugin;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Propagator Function Distribution Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.time.continuous.impl.PropagatorFunctionDistributionEventImpl#getDistributionEvent <em>Distribution Event</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PropagatorFunctionDistributionEventImpl extends PropagatorFunctionDistributionAbstractImpl implements PropagatorFunctionDistributionEvent {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropagatorFunctionDistributionEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TimeContinuousPackage.Literals.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DistributionEvent getDistributionEvent() {
		DistributionEvent distributionEvent = basicGetDistributionEvent();
		return distributionEvent != null && distributionEvent.eIsProxy() ? (DistributionEvent)eResolveProxy((InternalEObject)distributionEvent) : distributionEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public DistributionEvent basicGetDistributionEvent() {
		EObject container = this.eContainer;
		if ( container instanceof DistributionEvent){
			return (DistributionEvent) container;
		}
		String logMessage = String.format("The owner of the PropagatorFunctionDistributionEvent %s must be a DistributionEvent and not %s",
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
			case TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT__DISTRIBUTION_EVENT:
				if (resolve) return getDistributionEvent();
				return basicGetDistributionEvent();
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
			case TimeContinuousPackage.PROPAGATOR_FUNCTION_DISTRIBUTION_EVENT__DISTRIBUTION_EVENT:
				return basicGetDistributionEvent() != null;
		}
		return super.eIsSet(featureID);
	}

	
	

} //PropagatorFunctionDistributionEventImpl
