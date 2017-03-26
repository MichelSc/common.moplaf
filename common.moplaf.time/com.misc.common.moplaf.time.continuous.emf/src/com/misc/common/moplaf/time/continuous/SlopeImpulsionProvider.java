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
 * A representation of the model object '<em><b>Slope Impulsion Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.time.continuous.SlopeImpulsionProvider#getEvent <em>Event</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.continuous.SlopeImpulsionProvider#getSlopeImpulsion <em>Slope Impulsion</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.time.continuous.TimeContinuousPackage#getSlopeImpulsionProvider()
 * @model
 * @generated
 */
public interface SlopeImpulsionProvider extends EventProvider {
	/**
	 * Returns the value of the '<em><b>Event</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.time.continuous.SlopeImpulsionAtomic#getProvider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event</em>' containment reference.
	 * @see #setEvent(SlopeImpulsionAtomic)
	 * @see com.misc.common.moplaf.time.continuous.TimeContinuousPackage#getSlopeImpulsionProvider_Event()
	 * @see com.misc.common.moplaf.time.continuous.SlopeImpulsionAtomic#getProvider
	 * @model opposite="Provider" containment="true"
	 * @generated
	 */
	SlopeImpulsionAtomic getEvent();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.time.continuous.SlopeImpulsionProvider#getEvent <em>Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event</em>' containment reference.
	 * @see #getEvent()
	 * @generated
	 */
	void setEvent(SlopeImpulsionAtomic value);

	/**
	 * Returns the value of the '<em><b>Slope Impulsion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Slope Impulsion</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Slope Impulsion</em>' attribute.
	 * @see #setSlopeImpulsion(float)
	 * @see com.misc.common.moplaf.time.continuous.TimeContinuousPackage#getSlopeImpulsionProvider_SlopeImpulsion()
	 * @model
	 * @generated
	 */
	float getSlopeImpulsion();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.time.continuous.SlopeImpulsionProvider#getSlopeImpulsion <em>Slope Impulsion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Slope Impulsion</em>' attribute.
	 * @see #getSlopeImpulsion()
	 * @generated
	 */
	void setSlopeImpulsion(float value);

} // SlopeImpulsionProvider
