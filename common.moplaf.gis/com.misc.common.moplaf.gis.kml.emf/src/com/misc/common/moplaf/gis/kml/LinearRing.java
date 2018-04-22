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

import com.misc.common.moplaf.common.Coordinates;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Linear Ring</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.gis.kml.LinearRing#getCoordinates <em>Coordinates</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.gis.kml.KmlPackage#getLinearRing()
 * @model
 * @generated
 */
public interface LinearRing extends Geometry {
	/**
	 * Returns the value of the '<em><b>Coordinates</b></em>' attribute list.
	 * The list contents are of type {@link com.misc.common.moplaf.common.Coordinates}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coordinates</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coordinates</em>' attribute list.
	 * @see com.misc.common.moplaf.gis.kml.KmlPackage#getLinearRing_Coordinates()
	 * @model dataType="com.misc.common.moplaf.gis.kml.Coordinates"
	 * @generated
	 */
	EList<Coordinates> getCoordinates();

} // LinearRing
