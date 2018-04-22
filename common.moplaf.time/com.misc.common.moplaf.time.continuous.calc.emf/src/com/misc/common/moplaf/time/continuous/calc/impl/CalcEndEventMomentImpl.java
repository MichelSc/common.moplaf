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
import com.misc.common.moplaf.time.continuous.calc.CalcEndEventMoment;
import com.misc.common.moplaf.time.continuous.calc.TimeContinuousCalcPackage;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Propagator Calc End Event Moment</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class CalcEndEventMomentImpl extends CalcEventMomentImpl implements CalcEndEventMoment {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CalcEndEventMomentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TimeContinuousCalcPackage.Literals.CALC_END_EVENT_MOMENT;
	}

	private static Bindings distributionBindings = Bindings.constructBindings()
			.addInboundBinding(TimeContinuousPackage.Literals.DISTRIBUTION__HORIZON_END);
	
	protected static Bindings distributionEventBindings = CalcEventMomentImpl.distributionEventBindings.copy()
			.addInboundBinding(TimeContinuousPackage.Literals.DISTRIBUTION_EVENT__DISTRIBUTION, distributionBindings);
	

} //PropagatorCalcEndEventMomentImpl
