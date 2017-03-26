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
 * A representation of the model object '<em><b>Distance Matrix Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.misc.common.moplaf.gis.GisDistanceMatrixElement#getFromLocation <em>From Location</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.GisDistanceMatrixElement#getToLocation <em>To Location</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.GisDistanceMatrixElement#getDistance <em>Distance</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.GisDistanceMatrixElement#getDuration <em>Duration</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.GisDistanceMatrixElement#isCalculated <em>Calculated</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.misc.common.moplaf.gis.GisPackage#getGisDistanceMatrixElement()
 * @model
 * @generated
 */
public interface GisDistanceMatrixElement extends EObject {
	/**
	 * Returns the value of the '<em><b>From Location</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.gis.GisDistanceMatrixFromLocation#getToLocations <em>To Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Location</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Location</em>' container reference.
	 * @see #setFromLocation(GisDistanceMatrixFromLocation)
	 * @see com.misc.common.moplaf.gis.GisPackage#getGisDistanceMatrixElement_FromLocation()
	 * @see com.misc.common.moplaf.gis.GisDistanceMatrixFromLocation#getToLocations
	 * @model opposite="toLocations" required="true" transient="false"
	 * @generated
	 */
	GisDistanceMatrixFromLocation getFromLocation();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.gis.GisDistanceMatrixElement#getFromLocation <em>From Location</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Location</em>' container reference.
	 * @see #getFromLocation()
	 * @generated
	 */
	void setFromLocation(GisDistanceMatrixFromLocation value);

	/**
	 * Returns the value of the '<em><b>To Location</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.gis.GisDistanceMatrixToLocation#getFromLocations <em>From Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Location</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Location</em>' reference.
	 * @see #setToLocation(GisDistanceMatrixToLocation)
	 * @see com.misc.common.moplaf.gis.GisPackage#getGisDistanceMatrixElement_ToLocation()
	 * @see com.misc.common.moplaf.gis.GisDistanceMatrixToLocation#getFromLocations
	 * @model opposite="fromLocations" required="true"
	 * @generated
	 */
	GisDistanceMatrixToLocation getToLocation();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.gis.GisDistanceMatrixElement#getToLocation <em>To Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Location</em>' reference.
	 * @see #getToLocation()
	 * @generated
	 */
	void setToLocation(GisDistanceMatrixToLocation value);

	/**
	 * Returns the value of the '<em><b>Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Distance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distance</em>' attribute.
	 * @see #setDistance(float)
	 * @see com.misc.common.moplaf.gis.GisPackage#getGisDistanceMatrixElement_Distance()
	 * @model
	 * @generated
	 */
	float getDistance();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.gis.GisDistanceMatrixElement#getDistance <em>Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distance</em>' attribute.
	 * @see #getDistance()
	 * @generated
	 */
	void setDistance(float value);

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see #setDuration(float)
	 * @see com.misc.common.moplaf.gis.GisPackage#getGisDistanceMatrixElement_Duration()
	 * @model
	 * @generated
	 */
	float getDuration();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.gis.GisDistanceMatrixElement#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(float value);

	/**
	 * Returns the value of the '<em><b>Calculated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Calculated</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calculated</em>' attribute.
	 * @see #setCalculated(boolean)
	 * @see com.misc.common.moplaf.gis.GisPackage#getGisDistanceMatrixElement_Calculated()
	 * @model
	 * @generated
	 */
	boolean isCalculated();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.gis.GisDistanceMatrixElement#isCalculated <em>Calculated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Calculated</em>' attribute.
	 * @see #isCalculated()
	 * @generated
	 */
	void setCalculated(boolean value);

} // GisDistanceMatrixElement
