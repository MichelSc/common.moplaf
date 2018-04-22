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
import com.misc.common.moplaf.time.continuous.calc.CalcCapacityChangeStartMoment;
import com.misc.common.moplaf.time.continuous.calc.TimeContinuousCalcPackage;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Propagator Calc Capacity Change Start Moment</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class CalcCapacityChangeStartMomentImpl extends CalcEventMomentImpl implements CalcCapacityChangeStartMoment {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CalcCapacityChangeStartMomentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TimeContinuousCalcPackage.Literals.CALC_CAPACITY_CHANGE_START_MOMENT;
	}

	private static Bindings providerBindings = Bindings.constructBindings()
			.addInboundBinding(TimeContinuousPackage.Literals.CAPACITY_CHANGE__START);
	
	protected static Bindings distributionEventBindings = CalcEventMomentImpl.distributionEventBindings.copy()
			.addInboundBinding(TimeContinuousPackage.Literals.CAPACITY_CHANGE_START__PROVIDER, providerBindings);

	/*
	 * (non-Javadoc)
	 * @see com.misc.common.moplaf.propagator2.impl.PropagatorFunctionBindingsImpl#doGetBindings()
	 */
	@Override
	public Bindings doGetBindings() {
		return distributionEventBindings;
	}


} //PropagatorCalcCapacityChangeStartMomentImpl
