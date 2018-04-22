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
package com.misc.common.moplaf.macroplanner;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.macroplanner.Resource#getChildren <em>Children</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.Resource#getParent <em>Parent</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.Resource#getName <em>Name</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.Resource#getCode <em>Code</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.macroplanner.MacroPlannerPackage#getResource()
 * @model
 * @generated
 */
public interface Resource extends EObject {
	/**
	 * Returns the value of the '<em><b>Children</b></em>' reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.macroplanner.Resource}.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.macroplanner.Resource#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' reference list.
	 * @see com.misc.common.moplaf.macroplanner.MacroPlannerPackage#getResource_Children()
	 * @see com.misc.common.moplaf.macroplanner.Resource#getParent
	 * @model opposite="Parent"
	 * @generated
	 */
	EList<Resource> getChildren();

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.macroplanner.Resource#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' reference.
	 * @see #setParent(Resource)
	 * @see com.misc.common.moplaf.macroplanner.MacroPlannerPackage#getResource_Parent()
	 * @see com.misc.common.moplaf.macroplanner.Resource#getChildren
	 * @model opposite="Children"
	 * @generated
	 */
	Resource getParent();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.macroplanner.Resource#getParent <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(Resource value);

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
	 * @see com.misc.common.moplaf.macroplanner.MacroPlannerPackage#getResource_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.macroplanner.Resource#getName <em>Name</em>}' attribute.
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
	 * @see com.misc.common.moplaf.macroplanner.MacroPlannerPackage#getResource_Code()
	 * @model
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.macroplanner.Resource#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

} // Resource
