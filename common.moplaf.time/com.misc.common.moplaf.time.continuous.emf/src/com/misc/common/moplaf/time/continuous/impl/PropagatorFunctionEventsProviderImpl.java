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
package com.misc.common.moplaf.time.continuous.impl;

import com.misc.common.moplaf.time.continuous.EventsProviderAbstract;
import com.misc.common.moplaf.time.continuous.PropagatorFunctionEventsProvider;

import com.misc.common.moplaf.time.continuous.TimeContinuousPackage;
import org.eclipse.emf.common.CommonPlugin;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Propagator Function Events Provider</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.time.continuous.impl.PropagatorFunctionEventsProviderImpl#getEventsProvider <em>Events Provider</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PropagatorFunctionEventsProviderImpl extends PropagatorFunctionDistributionAbstractImpl implements PropagatorFunctionEventsProvider {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropagatorFunctionEventsProviderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TimeContinuousPackage.Literals.PROPAGATOR_FUNCTION_EVENTS_PROVIDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventsProviderAbstract getEventsProvider() {
		EventsProviderAbstract eventsProvider = basicGetEventsProvider();
		return eventsProvider != null && eventsProvider.eIsProxy() ? (EventsProviderAbstract)eResolveProxy((InternalEObject)eventsProvider) : eventsProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public EventsProviderAbstract basicGetEventsProvider() {
		EObject container = this.eContainer;
		if ( container instanceof EventsProviderAbstract){
			return (EventsProviderAbstract) container;
		}
		String logMessage = String.format("The owner of the PropagatorFunctionEventsProvider %s must be a EventsProviderAbstract and not %s",
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
			case TimeContinuousPackage.PROPAGATOR_FUNCTION_EVENTS_PROVIDER__EVENTS_PROVIDER:
				if (resolve) return getEventsProvider();
				return basicGetEventsProvider();
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
			case TimeContinuousPackage.PROPAGATOR_FUNCTION_EVENTS_PROVIDER__EVENTS_PROVIDER:
				return basicGetEventsProvider() != null;
		}
		return super.eIsSet(featureID);
	}

} //PropagatorFunctionEventsProviderImpl
