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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Chain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.misc.common.moplaf.flock.Chain#getFlocks <em>Flocks</em>}</li>
 *   <li>{@link com.misc.common.moplaf.flock.Chain#getFlockScope <em>Flock Scope</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.misc.common.moplaf.flock.FlockPackage#getChain()
 * @model
 * @generated
 */
public interface Chain extends EObject {
	/**
	 * Returns the value of the '<em><b>Flocks</b></em>' reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.flock.ChainFlock}.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.flock.ChainFlock#getChain <em>Chain</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flocks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flocks</em>' reference list.
	 * @see com.misc.common.moplaf.flock.FlockPackage#getChain_Flocks()
	 * @see com.misc.common.moplaf.flock.ChainFlock#getChain
	 * @model opposite="Chain"
	 * @generated
	 */
	EList<ChainFlock> getFlocks();

	/**
	 * Returns the value of the '<em><b>Flock Scope</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.flock.FlockScope#getChains <em>Chains</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flock Scope</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flock Scope</em>' reference.
	 * @see #setFlockScope(FlockScope)
	 * @see com.misc.common.moplaf.flock.FlockPackage#getChain_FlockScope()
	 * @see com.misc.common.moplaf.flock.FlockScope#getChains
	 * @model opposite="Chains" required="true"
	 * @generated
	 */
	FlockScope getFlockScope();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.flock.Chain#getFlockScope <em>Flock Scope</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flock Scope</em>' reference.
	 * @see #getFlockScope()
	 * @generated
	 */
	void setFlockScope(FlockScope value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void constructMove(Location from, Location to);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void refreshChainFlockNextPrevious();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void refreshInit();

} // Chain
