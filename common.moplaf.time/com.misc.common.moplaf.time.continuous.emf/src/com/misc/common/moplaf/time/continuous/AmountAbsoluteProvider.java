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
package com.misc.common.moplaf.time.continuous;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Amount Absolute Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.time.continuous.AmountAbsoluteProvider#getEvent <em>Event</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.continuous.AmountAbsoluteProvider#getAmountAbsolute <em>Amount Absolute</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.time.continuous.TimeContinuousPackage#getAmountAbsoluteProvider()
 * @model
 * @generated
 */
public interface AmountAbsoluteProvider extends EventProvider {
	/**
	 * Returns the value of the '<em><b>Event</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.time.continuous.AmountAbsoluteAtomic#getProvider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event</em>' containment reference.
	 * @see #setEvent(AmountAbsoluteAtomic)
	 * @see com.misc.common.moplaf.time.continuous.TimeContinuousPackage#getAmountAbsoluteProvider_Event()
	 * @see com.misc.common.moplaf.time.continuous.AmountAbsoluteAtomic#getProvider
	 * @model opposite="Provider" containment="true"
	 * @generated
	 */
	AmountAbsoluteAtomic getEvent();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.time.continuous.AmountAbsoluteProvider#getEvent <em>Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event</em>' containment reference.
	 * @see #getEvent()
	 * @generated
	 */
	void setEvent(AmountAbsoluteAtomic value);

	/**
	 * Returns the value of the '<em><b>Amount Absolute</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Amount Absolute</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount Absolute</em>' attribute.
	 * @see #setAmountAbsolute(float)
	 * @see com.misc.common.moplaf.time.continuous.TimeContinuousPackage#getAmountAbsoluteProvider_AmountAbsolute()
	 * @model default="0.0"
	 * @generated
	 */
	float getAmountAbsolute();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.time.continuous.AmountAbsoluteProvider#getAmountAbsolute <em>Amount Absolute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount Absolute</em>' attribute.
	 * @see #getAmountAbsolute()
	 * @generated
	 */
	void setAmountAbsolute(float value);

} // AmountAbsoluteProvider
