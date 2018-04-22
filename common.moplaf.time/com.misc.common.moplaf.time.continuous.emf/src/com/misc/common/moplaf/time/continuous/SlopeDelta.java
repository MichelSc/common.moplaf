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
 * A representation of the model object '<em><b>Slope Delta</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.time.continuous.SlopeDelta#getSlopeDelta <em>Slope Delta</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.time.continuous.TimeContinuousPackage#getSlopeDelta()
 * @model abstract="true"
 * @generated
 */
public interface SlopeDelta extends ProvidedEvent {
	/**
	 * Returns the value of the '<em><b>Slope Delta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Slope Delta</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Slope Delta</em>' attribute.
	 * @see #setSlopeDelta(double)
	 * @see com.misc.common.moplaf.time.continuous.TimeContinuousPackage#getSlopeDelta_SlopeDelta()
	 * @model
	 * @generated
	 */
	double getSlopeDelta();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.time.continuous.SlopeDelta#getSlopeDelta <em>Slope Delta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Slope Delta</em>' attribute.
	 * @see #getSlopeDelta()
	 * @generated
	 */
	void setSlopeDelta(double value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void refreshSlopeDelta();

} // SlopeDelta
