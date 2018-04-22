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


import java.util.Date;

import com.misc.common.moplaf.time.continuous.EndEvent;
import com.misc.common.moplaf.time.continuous.TimeContinuousPackage;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>End Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class EndEventImpl extends OwnedEventImpl implements EndEvent {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EndEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TimeContinuousPackage.Literals.END_EVENT;
	}

	
	/* (non-Javadoc)
	 * @see com.misc.common.moplaf.time.continuous.impl.DistributionEventImpl#refreshAmountAfter()
	 */
	@Override
	public void refreshAmountAfter() {
		float amountAfter = 0.0f;
		this.setAmountAfter(amountAfter);
	}

	/* (non-Javadoc)
	 * @see com.misc.common.moplaf.time.continuous.impl.DistributionEventImpl#refreshSlopeAfter()
	 */
	@Override
	public void refreshSlopeAfter() {
		float slopeAfter = 0.0f;
		this.setSlopeAfter(slopeAfter);
	}

	/* (non-Javadoc)
	 * @see com.misc.common.moplaf.time.continuous.impl.DistributionEventImpl#refreshMoment()
	 */
	@Override
	public void refreshMoment() {
		Date moment = this.getDistribution().getHorizonEnd();
		this.setMoment(moment);;
	}
} //EndEventImpl
