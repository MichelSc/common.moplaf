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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Distance Matrix To Location</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.misc.common.moplaf.gis.GisDistanceMatrixToLocation#getFromLocations <em>From Locations</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.GisDistanceMatrixToLocation#getLocation <em>Location</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.misc.common.moplaf.gis.GisPackage#getGisDistanceMatrixToLocation()
 * @model
 * @generated
 */
public interface GisDistanceMatrixToLocation extends EObject {
	/**
	 * Returns the value of the '<em><b>From Locations</b></em>' reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.gis.GisDistanceMatrixElement}.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.gis.GisDistanceMatrixElement#getToLocation <em>To Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Locations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Locations</em>' reference list.
	 * @see com.misc.common.moplaf.gis.GisPackage#getGisDistanceMatrixToLocation_FromLocations()
	 * @see com.misc.common.moplaf.gis.GisDistanceMatrixElement#getToLocation
	 * @model opposite="toLocation"
	 * @generated
	 */
	EList<GisDistanceMatrixElement> getFromLocations();

	/**
	 * Returns the value of the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' reference.
	 * @see #setLocation(GisLocation)
	 * @see com.misc.common.moplaf.gis.GisPackage#getGisDistanceMatrixToLocation_Location()
	 * @model required="true"
	 * @generated
	 */
	GisLocation getLocation();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.gis.GisDistanceMatrixToLocation#getLocation <em>Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(GisLocation value);

} // GisDistanceMatrixToLocation
