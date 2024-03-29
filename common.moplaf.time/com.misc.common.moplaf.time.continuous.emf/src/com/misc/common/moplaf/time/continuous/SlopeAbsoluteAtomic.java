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
 * A representation of the model object '<em><b>Slope Absolute Atomic</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.time.continuous.SlopeAbsoluteAtomic#getProvider <em>Provider</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.time.continuous.TimeContinuousPackage#getSlopeAbsoluteAtomic()
 * @model
 * @generated
 */
public interface SlopeAbsoluteAtomic extends SlopeAbsolute {
	/**
	 * Returns the value of the '<em><b>Provider</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.time.continuous.SlopeAbsoluteProvider#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provider</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provider</em>' container reference.
	 * @see #setProvider(SlopeAbsoluteProvider)
	 * @see com.misc.common.moplaf.time.continuous.TimeContinuousPackage#getSlopeAbsoluteAtomic_Provider()
	 * @see com.misc.common.moplaf.time.continuous.SlopeAbsoluteProvider#getEvent
	 * @model opposite="Event" required="true" transient="false"
	 * @generated
	 */
	SlopeAbsoluteProvider getProvider();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.time.continuous.SlopeAbsoluteAtomic#getProvider <em>Provider</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provider</em>' container reference.
	 * @see #getProvider()
	 * @generated
	 */
	void setProvider(SlopeAbsoluteProvider value);

} // SlopeAbsoluteAtomic
