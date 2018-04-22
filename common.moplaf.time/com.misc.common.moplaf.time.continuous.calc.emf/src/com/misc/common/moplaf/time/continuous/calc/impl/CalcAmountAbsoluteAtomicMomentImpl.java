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

import com.misc.common.moplaf.propagator2.util.Bindings;
import com.misc.common.moplaf.time.continuous.TimeContinuousPackage;
import com.misc.common.moplaf.time.continuous.calc.CalcAmountAbsoluteAtomicMoment;
import com.misc.common.moplaf.time.continuous.calc.TimeContinuousCalcPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Propagator Calc Amount Absolute Atomic Moment</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class CalcAmountAbsoluteAtomicMomentImpl extends CalcEventMomentImpl implements CalcAmountAbsoluteAtomicMoment {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CalcAmountAbsoluteAtomicMomentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TimeContinuousCalcPackage.Literals.CALC_AMOUNT_ABSOLUTE_ATOMIC_MOMENT;
	}
	
	private static Bindings providerBindings = Bindings.constructBindings()
			.addInboundBinding(TimeContinuousPackage.Literals.EVENT_PROVIDER__MOMENT);
	
	protected static Bindings distributionEventBindings = CalcEventMomentImpl.distributionEventBindings.copy()
			.addInboundBinding(TimeContinuousPackage.Literals.AMOUNT_ABSOLUTE_ATOMIC__PROVIDER, providerBindings);

	/*
	 * (non-Javadoc)
	 * @see com.misc.common.moplaf.propagator2.impl.PropagatorFunctionBindingsImpl#doGetBindings()
	 */
	@Override
	public Bindings doGetBindings() {
		return distributionEventBindings;
	}


} //PropagatorCalcAmountAbsoluteAtomicMomentImpl
