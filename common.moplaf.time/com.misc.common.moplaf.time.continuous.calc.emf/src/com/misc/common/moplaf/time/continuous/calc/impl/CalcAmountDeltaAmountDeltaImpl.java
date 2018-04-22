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
import com.misc.common.moplaf.time.continuous.AmountDelta;
import com.misc.common.moplaf.time.continuous.TimeContinuousPackage;
import com.misc.common.moplaf.time.continuous.calc.CalcAmountDeltaAmountDelta;
import com.misc.common.moplaf.time.continuous.calc.TimeContinuousCalcPackage;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Propagator Calc Amount Impulsion Amount Impulsion</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class CalcAmountDeltaAmountDeltaImpl extends CalcEventAmountImpl implements CalcAmountDeltaAmountDelta {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CalcAmountDeltaAmountDeltaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TimeContinuousCalcPackage.Literals.CALC_AMOUNT_DELTA_AMOUNT_DELTA;
	}
	
	protected static Bindings distributionEventBindings = Bindings.constructBindings()
			.addOutboundBinding(TimeContinuousPackage.Literals.AMOUNT_DELTA__AMOUNT_DELTA);
	
	/*
	 * (non-Javadoc)
	 * @see com.misc.common.moplaf.propagator2.impl.PropagatorFunctionBindingsImpl#doGetBindings()
	 */
	@Override
	public Bindings doGetBindings() {
		return distributionEventBindings;
	}
	
	/**
	 * 
	 * (non-Javadoc)
	 * @see com.misc.common.moplaf.propagator2.impl.PropagatorFunctionImpl#doRefresh()
	 */
	@Override
	public void doRefresh() {
		AmountDelta event = (AmountDelta) this.getDistributionEvent();
		event.refreshAmountDelta();
	}
	

} //PropagatorCalcAmountImpulsionAmountImpulsionImpl
