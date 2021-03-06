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
import com.misc.common.moplaf.propagator2.util.Bindings;
import com.misc.common.moplaf.time.continuous.Distribution;
import com.misc.common.moplaf.time.continuous.EventsProviderAbstract;
import com.misc.common.moplaf.time.continuous.TimeContinuousPackage;
import com.misc.common.moplaf.time.continuous.calc.CalcEventsProviderRefreshEvents;
import com.misc.common.moplaf.time.continuous.calc.LayerCompositeEventRefresh;
import com.misc.common.moplaf.time.continuous.calc.TimeContinuousCalcPackage;
import com.misc.common.moplaf.time.continuous.impl.PropagatorFunctionEventsProviderImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Propagator Calc Events Provider Refresh Events</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.time.continuous.calc.impl.CalcEventsProviderRefreshEventsImpl#getConcreteParent <em>Concrete Parent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CalcEventsProviderRefreshEventsImpl extends PropagatorFunctionEventsProviderImpl implements CalcEventsProviderRefreshEvents {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CalcEventsProviderRefreshEventsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TimeContinuousCalcPackage.Literals.CALC_EVENTS_PROVIDER_REFRESH_EVENTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LayerCompositeEventRefresh getConcreteParent() {
		LayerCompositeEventRefresh concreteParent = basicGetConcreteParent();
		return concreteParent != null && concreteParent.eIsProxy() ? (LayerCompositeEventRefresh)eResolveProxy((InternalEObject)concreteParent) : concreteParent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public LayerCompositeEventRefresh basicGetConcreteParent() {
		EventsProviderAbstract provider = this.getEventsProvider();
		Distribution distribution = provider.getDistribution();
		if ( distribution == null ) { return null; }
		LayerCompositeEventRefresh parent = distribution.getPropagatorFunction(LayerCompositeEventRefresh.class);
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TimeContinuousCalcPackage.CALC_EVENTS_PROVIDER_REFRESH_EVENTS__CONCRETE_PARENT:
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
			case TimeContinuousCalcPackage.CALC_EVENTS_PROVIDER_REFRESH_EVENTS__CONCRETE_PARENT:
				return basicGetConcreteParent() != null;
		}
		return super.eIsSet(featureID);
	}

	protected static Bindings providerBindings = Bindings.constructBindings()
			.addInboundBinding(TimeContinuousPackage.Literals.EVENTS_PROVIDER_ABSTRACT__DISTRIBUTION);
	
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
	 * @see com.misc.common.moplaf.propagator2.impl.PropagatorFunctionBindingsImpl#doGetBindings()
	 */
	@Override
	public Bindings doGetBindings() {
		return providerBindings;
	}

	@Override
	public void doRefresh() {
		EventsProviderAbstract provider = this.getEventsProvider();
		provider.refreshEvents();
	}

} //PropagatorCalcEventsProviderRefreshEventsImpl
