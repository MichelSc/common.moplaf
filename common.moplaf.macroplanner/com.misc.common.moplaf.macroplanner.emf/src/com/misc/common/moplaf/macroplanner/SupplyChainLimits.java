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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Supply Chain Limits</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.macroplanner.SupplyChainLimits#getCapacities <em>Capacities</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.SupplyChainLimits#getAvailabilities <em>Availabilities</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.SupplyChainLimits#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.macroplanner.MacroPlannerPackage#getSupplyChainLimits()
 * @model
 * @generated
 */
public interface SupplyChainLimits extends MacroPlannerData {
	/**
	 * Returns the value of the '<em><b>Capacities</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.macroplanner.Capacity}.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.macroplanner.Capacity#getSupplyChainLimits <em>Supply Chain Limits</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capacities</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capacities</em>' containment reference list.
	 * @see com.misc.common.moplaf.macroplanner.MacroPlannerPackage#getSupplyChainLimits_Capacities()
	 * @see com.misc.common.moplaf.macroplanner.Capacity#getSupplyChainLimits
	 * @model opposite="SupplyChainLimits" containment="true"
	 * @generated
	 */
	EList<Capacity> getCapacities();

	/**
	 * Returns the value of the '<em><b>Availabilities</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.macroplanner.Availability}.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.macroplanner.Availability#getSupplyChainLimits <em>Supply Chain Limits</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Availabilities</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Availabilities</em>' containment reference list.
	 * @see com.misc.common.moplaf.macroplanner.MacroPlannerPackage#getSupplyChainLimits_Availabilities()
	 * @see com.misc.common.moplaf.macroplanner.Availability#getSupplyChainLimits
	 * @model opposite="SupplyChainLimits" containment="true"
	 * @generated
	 */
	EList<Availability> getAvailabilities();

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
	 * @see com.misc.common.moplaf.macroplanner.MacroPlannerPackage#getSupplyChainLimits_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.macroplanner.SupplyChainLimits#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Capacity constructCapacity(LocationProduct product);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Availability constructAvailability(LocationResource resource);

} // SupplyChainLimits
