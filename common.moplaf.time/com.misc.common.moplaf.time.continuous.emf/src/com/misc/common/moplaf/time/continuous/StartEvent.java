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
package com.misc.common.moplaf.time.continuous;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Start Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.time.continuous.StartEvent#getAmountAtStart <em>Amount At Start</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.continuous.StartEvent#getSlopeAtStart <em>Slope At Start</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.time.continuous.TimeContinuousPackage#getStartEvent()
 * @model
 * @generated
 */
public interface StartEvent extends OwnedEvent {
	/**
	 * Returns the value of the '<em><b>Amount At Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Amount At Start</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount At Start</em>' attribute.
	 * @see #setAmountAtStart(double)
	 * @see com.misc.common.moplaf.time.continuous.TimeContinuousPackage#getStartEvent_AmountAtStart()
	 * @model
	 * @generated
	 */
	double getAmountAtStart();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.time.continuous.StartEvent#getAmountAtStart <em>Amount At Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount At Start</em>' attribute.
	 * @see #getAmountAtStart()
	 * @generated
	 */
	void setAmountAtStart(double value);

	/**
	 * Returns the value of the '<em><b>Slope At Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Slope At Start</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Slope At Start</em>' attribute.
	 * @see #setSlopeAtStart(double)
	 * @see com.misc.common.moplaf.time.continuous.TimeContinuousPackage#getStartEvent_SlopeAtStart()
	 * @model
	 * @generated
	 */
	double getSlopeAtStart();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.time.continuous.StartEvent#getSlopeAtStart <em>Slope At Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Slope At Start</em>' attribute.
	 * @see #getSlopeAtStart()
	 * @generated
	 */
	void setSlopeAtStart(double value);

} // StartEvent
