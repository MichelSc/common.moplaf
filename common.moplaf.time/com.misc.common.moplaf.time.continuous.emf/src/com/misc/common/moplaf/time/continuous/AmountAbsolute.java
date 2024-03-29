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
 * A representation of the model object '<em><b>Amount Absolute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.time.continuous.AmountAbsolute#getAmountAbsolute <em>Amount Absolute</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.time.continuous.TimeContinuousPackage#getAmountAbsolute()
 * @model abstract="true"
 * @generated
 */
public interface AmountAbsolute extends ProvidedEvent {
	/**
	 * Returns the value of the '<em><b>Amount Absolute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Amount Absolute</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount Absolute</em>' attribute.
	 * @see #setAmountAbsolute(double)
	 * @see com.misc.common.moplaf.time.continuous.TimeContinuousPackage#getAmountAbsolute_AmountAbsolute()
	 * @model
	 * @generated
	 */
	double getAmountAbsolute();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.time.continuous.AmountAbsolute#getAmountAbsolute <em>Amount Absolute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount Absolute</em>' attribute.
	 * @see #getAmountAbsolute()
	 * @generated
	 */
	void setAmountAbsolute(double value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void refreshAmountAbsolute();

} // AmountAbsolute
