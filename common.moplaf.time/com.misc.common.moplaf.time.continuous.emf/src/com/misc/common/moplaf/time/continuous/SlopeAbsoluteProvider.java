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
 * A representation of the model object '<em><b>Slope Absolute Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.time.continuous.SlopeAbsoluteProvider#getEvent <em>Event</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.continuous.SlopeAbsoluteProvider#getSlopeAbsolute <em>Slope Absolute</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.time.continuous.TimeContinuousPackage#getSlopeAbsoluteProvider()
 * @model
 * @generated
 */
public interface SlopeAbsoluteProvider extends EventProvider {
	/**
	 * Returns the value of the '<em><b>Event</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.time.continuous.SlopeAbsoluteAtomic#getProvider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event</em>' containment reference.
	 * @see #setEvent(SlopeAbsoluteAtomic)
	 * @see com.misc.common.moplaf.time.continuous.TimeContinuousPackage#getSlopeAbsoluteProvider_Event()
	 * @see com.misc.common.moplaf.time.continuous.SlopeAbsoluteAtomic#getProvider
	 * @model opposite="Provider" containment="true"
	 * @generated
	 */
	SlopeAbsoluteAtomic getEvent();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.time.continuous.SlopeAbsoluteProvider#getEvent <em>Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event</em>' containment reference.
	 * @see #getEvent()
	 * @generated
	 */
	void setEvent(SlopeAbsoluteAtomic value);

	/**
	 * Returns the value of the '<em><b>Slope Absolute</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Slope Absolute</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Slope Absolute</em>' attribute.
	 * @see #setSlopeAbsolute(double)
	 * @see com.misc.common.moplaf.time.continuous.TimeContinuousPackage#getSlopeAbsoluteProvider_SlopeAbsolute()
	 * @model default="0.0"
	 * @generated
	 */
	double getSlopeAbsolute();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.time.continuous.SlopeAbsoluteProvider#getSlopeAbsolute <em>Slope Absolute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Slope Absolute</em>' attribute.
	 * @see #getSlopeAbsolute()
	 * @generated
	 */
	void setSlopeAbsolute(double value);

} // SlopeAbsoluteProvider
