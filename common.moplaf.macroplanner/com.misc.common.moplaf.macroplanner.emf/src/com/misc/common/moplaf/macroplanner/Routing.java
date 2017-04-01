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
 * A representation of the model object '<em><b>Routing</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.macroplanner.Routing#getResources <em>Resources</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.Routing#getProducts <em>Products</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.Routing#getName <em>Name</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.Routing#getCode <em>Code</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.Routing#getCost <em>Cost</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.Routing#getSupplyChainRoutings <em>Supply Chain Routings</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.macroplanner.MacroPlannerPackage#getRouting()
 * @model
 * @generated
 */
public interface Routing extends EObject {
	/**
	 * Returns the value of the '<em><b>Resources</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.macroplanner.RoutingResource}.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.macroplanner.RoutingResource#getRouting <em>Routing</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resources</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resources</em>' containment reference list.
	 * @see com.misc.common.moplaf.macroplanner.MacroPlannerPackage#getRouting_Resources()
	 * @see com.misc.common.moplaf.macroplanner.RoutingResource#getRouting
	 * @model opposite="Routing" containment="true"
	 * @generated
	 */
	EList<RoutingResource> getResources();

	/**
	 * Returns the value of the '<em><b>Products</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.macroplanner.RoutingProduct}.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.macroplanner.RoutingProduct#getRouting <em>Routing</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Products</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Products</em>' containment reference list.
	 * @see com.misc.common.moplaf.macroplanner.MacroPlannerPackage#getRouting_Products()
	 * @see com.misc.common.moplaf.macroplanner.RoutingProduct#getRouting
	 * @model opposite="Routing" containment="true"
	 * @generated
	 */
	EList<RoutingProduct> getProducts();

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
	 * @see com.misc.common.moplaf.macroplanner.MacroPlannerPackage#getRouting_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.macroplanner.Routing#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see com.misc.common.moplaf.macroplanner.MacroPlannerPackage#getRouting_Code()
	 * @model
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.macroplanner.Routing#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

	/**
	 * Returns the value of the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cost</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Cost for one unit of Routing
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cost</em>' attribute.
	 * @see #setCost(float)
	 * @see com.misc.common.moplaf.macroplanner.MacroPlannerPackage#getRouting_Cost()
	 * @model
	 * @generated
	 */
	float getCost();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.macroplanner.Routing#getCost <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost</em>' attribute.
	 * @see #getCost()
	 * @generated
	 */
	void setCost(float value);

	/**
	 * Returns the value of the '<em><b>Supply Chain Routings</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.macroplanner.SupplyChainRoutings#getRoutings <em>Routings</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supply Chain Routings</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supply Chain Routings</em>' container reference.
	 * @see #setSupplyChainRoutings(SupplyChainRoutings)
	 * @see com.misc.common.moplaf.macroplanner.MacroPlannerPackage#getRouting_SupplyChainRoutings()
	 * @see com.misc.common.moplaf.macroplanner.SupplyChainRoutings#getRoutings
	 * @model opposite="Routings" required="true" transient="false"
	 * @generated
	 */
	SupplyChainRoutings getSupplyChainRoutings();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.macroplanner.Routing#getSupplyChainRoutings <em>Supply Chain Routings</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supply Chain Routings</em>' container reference.
	 * @see #getSupplyChainRoutings()
	 * @generated
	 */
	void setSupplyChainRoutings(SupplyChainRoutings value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	RoutingProduct constructRoutingProduct(LocationProduct product);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	RoutingResource constructRoutingResource(LocationResource resource);

} // Routing
