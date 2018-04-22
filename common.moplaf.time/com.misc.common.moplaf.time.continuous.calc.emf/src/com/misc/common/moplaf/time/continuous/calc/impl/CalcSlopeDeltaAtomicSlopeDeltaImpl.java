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
import com.misc.common.moplaf.time.continuous.calc.CalcSlopeDeltaAtomicSlopeDelta;
import com.misc.common.moplaf.time.continuous.calc.TimeContinuousCalcPackage;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Propagator Calc Slope Impulsion Atomic Slope Impulsion</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class CalcSlopeDeltaAtomicSlopeDeltaImpl extends CalcSlopeDeltaSlopeDeltaImpl implements CalcSlopeDeltaAtomicSlopeDelta {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CalcSlopeDeltaAtomicSlopeDeltaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TimeContinuousCalcPackage.Literals.CALC_SLOPE_DELTA_ATOMIC_SLOPE_DELTA;
	}
	
	private static Bindings providerBindings = Bindings.constructBindings()
			.addInboundBinding(TimeContinuousPackage.Literals.SLOPE_DELTA_PROVIDER__SLOPE_DELTA);
	
	protected static Bindings distributionEventBindings = CalcEventMomentImpl.distributionEventBindings.copy()
			.addInboundBinding(TimeContinuousPackage.Literals.SLOPE_DELTA_ATOMIC__PROVIDER, providerBindings);

	/*
	 * (non-Javadoc)
	 * @see com.misc.common.moplaf.propagator2.impl.PropagatorFunctionBindingsImpl#doGetBindings()
	 */
	@Override
	public Bindings doGetBindings() {
		return distributionEventBindings;
	}


} //PropagatorCalcSlopeImpulsionAtomicSlopeImpulsionImpl
