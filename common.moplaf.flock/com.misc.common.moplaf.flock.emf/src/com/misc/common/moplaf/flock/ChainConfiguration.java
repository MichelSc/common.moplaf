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
package com.misc.common.moplaf.flock;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Chain Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.misc.common.moplaf.flock.ChainConfiguration#getFlockAsOwner <em>Flock As Owner</em>}</li>
 *   <li>{@link com.misc.common.moplaf.flock.ChainConfiguration#getAttachPoint <em>Attach Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.misc.common.moplaf.flock.FlockPackage#getChainConfiguration()
 * @model
 * @generated
 */
public interface ChainConfiguration extends ChainFlockConfiguration {
	/**
	 * Returns the value of the '<em><b>Flock As Owner</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.flock.FlockConfiguration#getChainOwner <em>Chain Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flock As Owner</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flock As Owner</em>' reference.
	 * @see #setFlockAsOwner(FlockConfiguration)
	 * @see com.misc.common.moplaf.flock.FlockPackage#getChainConfiguration_FlockAsOwner()
	 * @see com.misc.common.moplaf.flock.FlockConfiguration#getChainOwner
	 * @model opposite="ChainOwner" required="true"
	 * @generated
	 */
	FlockConfiguration getFlockAsOwner();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.flock.ChainConfiguration#getFlockAsOwner <em>Flock As Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flock As Owner</em>' reference.
	 * @see #getFlockAsOwner()
	 * @generated
	 */
	void setFlockAsOwner(FlockConfiguration value);

	/**
	 * Returns the value of the '<em><b>Attach Point</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attach Point</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attach Point</em>' reference.
	 * @see #setAttachPoint(ChainConfiguration)
	 * @see com.misc.common.moplaf.flock.FlockPackage#getChainConfiguration_AttachPoint()
	 * @model
	 * @generated
	 */
	ChainConfiguration getAttachPoint();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.flock.ChainConfiguration#getAttachPoint <em>Attach Point</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attach Point</em>' reference.
	 * @see #getAttachPoint()
	 * @generated
	 */
	void setAttachPoint(ChainConfiguration value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void refreshFlockConfiguration();

} // ChainConfiguration
