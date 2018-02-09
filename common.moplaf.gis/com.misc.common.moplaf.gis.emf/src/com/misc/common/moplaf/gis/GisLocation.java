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
package com.misc.common.moplaf.gis;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Location</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.gis.GisLocation#getDescription <em>Description</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.GisLocation#isGeocoded <em>Geocoded</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.gis.GisPackage#getGisLocation()
 * @model abstract="true"
 * @generated
 */
public interface GisLocation extends EObject {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see com.misc.common.moplaf.gis.GisPackage#getGisLocation_Description()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getDescription();

	/**
	 * Returns the value of the '<em><b>Geocoded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Geocoded</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geocoded</em>' attribute.
	 * @see com.misc.common.moplaf.gis.GisPackage#getGisLocation_Geocoded()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	boolean isGeocoded();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	GisCoordinatesAbstract getCoordinates();

} // GisLocation
