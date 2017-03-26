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
 * A representation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.misc.common.moplaf.flock.FlockConfiguration#getConfigurationLocation <em>Configuration Location</em>}</li>
 *   <li>{@link com.misc.common.moplaf.flock.FlockConfiguration#getChainOwner <em>Chain Owner</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.misc.common.moplaf.flock.FlockPackage#getFlockConfiguration()
 * @model
 * @generated
 */
public interface FlockConfiguration extends Flock {
	/**
	 * Returns the value of the '<em><b>Configuration Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configuration Location</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration Location</em>' reference.
	 * @see #setConfigurationLocation(Location)
	 * @see com.misc.common.moplaf.flock.FlockPackage#getFlockConfiguration_ConfigurationLocation()
	 * @model
	 * @generated
	 */
	Location getConfigurationLocation();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.flock.FlockConfiguration#getConfigurationLocation <em>Configuration Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration Location</em>' reference.
	 * @see #getConfigurationLocation()
	 * @generated
	 */
	void setConfigurationLocation(Location value);

	/**
	 * Returns the value of the '<em><b>Chain Owner</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.flock.ChainConfiguration#getFlockAsOwner <em>Flock As Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Chain Owner</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Chain Owner</em>' reference.
	 * @see #setChainOwner(ChainConfiguration)
	 * @see com.misc.common.moplaf.flock.FlockPackage#getFlockConfiguration_ChainOwner()
	 * @see com.misc.common.moplaf.flock.ChainConfiguration#getFlockAsOwner
	 * @model opposite="FlockAsOwner"
	 * @generated
	 */
	ChainConfiguration getChainOwner();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.flock.FlockConfiguration#getChainOwner <em>Chain Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Chain Owner</em>' reference.
	 * @see #getChainOwner()
	 * @generated
	 */
	void setChainOwner(ChainConfiguration value);

} // FlockConfiguration
