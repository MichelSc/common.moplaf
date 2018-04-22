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
package com.misc.common.moplaf.gis;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Router Defaulted</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.gis.GisRouterDefaulted#getPrimaryRouter <em>Primary Router</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.GisRouterDefaulted#getSecondaryRouter <em>Secondary Router</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.gis.GisPackage#getGisRouterDefaulted()
 * @model
 * @generated
 */
public interface GisRouterDefaulted extends GisRouter {
	/**
	 * Returns the value of the '<em><b>Primary Router</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primary Router</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primary Router</em>' reference.
	 * @see #setPrimaryRouter(GisRouter)
	 * @see com.misc.common.moplaf.gis.GisPackage#getGisRouterDefaulted_PrimaryRouter()
	 * @model required="true"
	 * @generated
	 */
	GisRouter getPrimaryRouter();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.gis.GisRouterDefaulted#getPrimaryRouter <em>Primary Router</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primary Router</em>' reference.
	 * @see #getPrimaryRouter()
	 * @generated
	 */
	void setPrimaryRouter(GisRouter value);

	/**
	 * Returns the value of the '<em><b>Secondary Router</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Secondary Router</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Secondary Router</em>' reference.
	 * @see #setSecondaryRouter(GisRouter)
	 * @see com.misc.common.moplaf.gis.GisPackage#getGisRouterDefaulted_SecondaryRouter()
	 * @model required="true"
	 * @generated
	 */
	GisRouter getSecondaryRouter();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.gis.GisRouterDefaulted#getSecondaryRouter <em>Secondary Router</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Secondary Router</em>' reference.
	 * @see #getSecondaryRouter()
	 * @generated
	 */
	void setSecondaryRouter(GisRouter value);

} // GisRouterDefaulted
