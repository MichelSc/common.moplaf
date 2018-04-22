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
package com.misc.common.moplaf.gis.kml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Polygon</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.gis.kml.Polygon#getOuterBoundary <em>Outer Boundary</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.kml.Polygon#getInnerBoundaries <em>Inner Boundaries</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.gis.kml.KmlPackage#getPolygon()
 * @model
 * @generated
 */
public interface Polygon extends Geometry {
	/**
	 * Returns the value of the '<em><b>Outer Boundary</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outer Boundary</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outer Boundary</em>' containment reference.
	 * @see #setOuterBoundary(LinearRing)
	 * @see com.misc.common.moplaf.gis.kml.KmlPackage#getPolygon_OuterBoundary()
	 * @model containment="true" required="true"
	 * @generated
	 */
	LinearRing getOuterBoundary();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.gis.kml.Polygon#getOuterBoundary <em>Outer Boundary</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outer Boundary</em>' containment reference.
	 * @see #getOuterBoundary()
	 * @generated
	 */
	void setOuterBoundary(LinearRing value);

	/**
	 * Returns the value of the '<em><b>Inner Boundaries</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.gis.kml.LinearRing}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inner Boundaries</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inner Boundaries</em>' containment reference list.
	 * @see com.misc.common.moplaf.gis.kml.KmlPackage#getPolygon_InnerBoundaries()
	 * @model containment="true"
	 * @generated
	 */
	EList<LinearRing> getInnerBoundaries();

} // Polygon
