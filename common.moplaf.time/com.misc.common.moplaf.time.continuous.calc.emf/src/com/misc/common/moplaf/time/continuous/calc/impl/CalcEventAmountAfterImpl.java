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
import com.misc.common.moplaf.time.continuous.DistributionEvent;
import com.misc.common.moplaf.time.continuous.TimeContinuousPackage;
import com.misc.common.moplaf.time.continuous.calc.CalcEventAmountAfter;
import com.misc.common.moplaf.time.continuous.calc.TimeContinuousCalcPackage;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Propagator Calc Event Amount After</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class CalcEventAmountAfterImpl extends CalcEventAmountImpl implements CalcEventAmountAfter {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CalcEventAmountAfterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TimeContinuousCalcPackage.Literals.CALC_EVENT_AMOUNT_AFTER;
	}

	protected static Bindings distributionEventBindings = Bindings.constructBindings()
			.addOutboundBinding(TimeContinuousPackage.Literals.DISTRIBUTION_EVENT__AMOUNT_AFTER)
			.addInboundBinding(TimeContinuousPackage.Literals.DISTRIBUTION_EVENT__DISTRIBUTION_AS_SEQUENCE)
			.addInboundBinding(TimeContinuousPackage.Literals.DISTRIBUTION_EVENT__AMOUNT_BEFORE);
	
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
		DistributionEvent event = this.getDistributionEvent();
		event.refreshAmountAfter();
	}

} //PropagatorCalcEventAmountAfterImpl
