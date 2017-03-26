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
package com.misc.common.moplaf.time.continuous.calc.impl;

import com.misc.common.moplaf.propagator2.util.Bindings;
import com.misc.common.moplaf.time.continuous.DistributionEvent;
import com.misc.common.moplaf.time.continuous.TimeContinuousPackage;
import com.misc.common.moplaf.time.continuous.calc.PropagatorCalcEventSlopeBefore;
import com.misc.common.moplaf.time.continuous.calc.TimeContinuousCalcPackage;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Propagator Calc Event Slope Before</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class PropagatorCalcEventSlopeBeforeImpl extends PropagatorCalcEventSlopeImpl implements PropagatorCalcEventSlopeBefore {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropagatorCalcEventSlopeBeforeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TimeContinuousCalcPackage.Literals.PROPAGATOR_CALC_EVENT_SLOPE_BEFORE;
	}

	private static Bindings eventBeforeBindings = Bindings.constructBindings()
			.addInboundBinding(TimeContinuousPackage.Literals.DISTRIBUTION_EVENT__SLOPE_AFTER);
	
	protected static Bindings distributionEventBindings = PropagatorCalcEventMomentImpl.distributionEventBindings.copy()
			.addInboundBinding(TimeContinuousPackage.Literals.DISTRIBUTION_EVENT__DISTRIBUTION_AS_SEQUENCE)
			.addInboundBinding(TimeContinuousPackage.Literals.DISTRIBUTION_EVENT__PREVIOUS, eventBeforeBindings)
			.addOutboundBinding(TimeContinuousPackage.Literals.DISTRIBUTION_EVENT__SLOPE_BEFORE);
	
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
		event.refreshSlopeBefore();
	}


} //PropagatorCalcEventSlopeBeforeImpl
