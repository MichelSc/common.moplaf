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
import com.misc.common.moplaf.time.continuous.DistributionEvent;
import com.misc.common.moplaf.time.continuous.TimeContinuousPackage;
import com.misc.common.moplaf.time.continuous.calc.CalcDistributionSequence;
import com.misc.common.moplaf.time.continuous.calc.CalcEventMoment;
import com.misc.common.moplaf.time.continuous.calc.TimeContinuousCalcPackage;
import com.misc.common.moplaf.time.continuous.impl.PropagatorFunctionDistributionEventImpl;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Propagator Calc Event Moment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.time.continuous.calc.impl.CalcEventMomentImpl#getConcreteParent <em>Concrete Parent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CalcEventMomentImpl extends PropagatorFunctionDistributionEventImpl implements CalcEventMoment {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CalcEventMomentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TimeContinuousCalcPackage.Literals.CALC_EVENT_MOMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalcDistributionSequence getConcreteParent() {
		CalcDistributionSequence concreteParent = basicGetConcreteParent();
		return concreteParent != null && concreteParent.eIsProxy() ? (CalcDistributionSequence)eResolveProxy((InternalEObject)concreteParent) : concreteParent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public CalcDistributionSequence basicGetConcreteParent() {
		Distribution distribution = this.getDistributionEvent().getDistribution();
		CalcDistributionSequence caclDistributionSequence = distribution.getPropagatorFunction(CalcDistributionSequence.class);
		return caclDistributionSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TimeContinuousCalcPackage.CALC_EVENT_MOMENT__CONCRETE_PARENT:
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
			case TimeContinuousCalcPackage.CALC_EVENT_MOMENT__CONCRETE_PARENT:
				return basicGetConcreteParent() != null;
		}
		return super.eIsSet(featureID);
	}

	/*
	 * (non-Javadoc)
	 * @see com.misc.common.moplaf.propagator2.impl.PropagatorFunctionImpl#doGetParent()
	 */
	@Override
	public PropagatorFunction doGetParent() {
		return this.getConcreteParent();
	}
	
	protected static Bindings distributionEventBindings = Bindings.constructBindings()
			.addInboundBinding(TimeContinuousPackage.Literals.DISTRIBUTION_EVENT__DISTRIBUTION_AS_PROVIDED_EVENT);
	
	/*
	 * (non-Javadoc)
	 * @see com.misc.common.moplaf.propagator2.impl.PropagatorFunctionBindingsImpl#doGetBindings()
	 */
	@Override
	public Bindings doGetBindings() {
		return distributionEventBindings;
	}

	/*
	 * (non-Javadoc)
	 * @see com.misc.common.moplaf.propagator2.impl.PropagatorFunctionImpl#doRefresh()
	 */
	@Override
	public void doRefresh() {
		DistributionEvent event = this.basicGetDistributionEvent();
		event.refreshMoment();
	}
} //PropagatorCalcEventMomentImpl
