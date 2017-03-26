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
package com.misc.common.moplaf.macroplanner;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Supply Chain Routings</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.macroplanner.SupplyChainRoutings#getRoutings <em>Routings</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.SupplyChainRoutings#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.macroplanner.MacroPlannerPackage#getSupplyChainRoutings()
 * @model
 * @generated
 */
public interface SupplyChainRoutings extends EObject {
	/**
	 * Returns the value of the '<em><b>Routings</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.macroplanner.Routing}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Routings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Routings</em>' containment reference list.
	 * @see com.misc.common.moplaf.macroplanner.MacroPlannerPackage#getSupplyChainRoutings_Routings()
	 * @model containment="true"
	 * @generated
	 */
	EList<Routing> getRoutings();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.misc.common.moplaf.macroplanner.MacroPlannerPackage#getSupplyChainRoutings_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.macroplanner.SupplyChainRoutings#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // SupplyChainRoutings
