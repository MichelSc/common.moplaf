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

import com.misc.common.moplaf.file.FileReaderWriter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Kml</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.gis.kml.Kml#getFeature <em>Feature</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.gis.kml.KmlPackage#getKml()
 * @model
 * @generated
 */
public interface Kml extends FileReaderWriter {
	/**
	 * Returns the value of the '<em><b>Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature</em>' containment reference.
	 * @see #setFeature(Feature)
	 * @see com.misc.common.moplaf.gis.kml.KmlPackage#getKml_Feature()
	 * @model containment="true"
	 * @generated
	 */
	Feature getFeature();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.gis.kml.Kml#getFeature <em>Feature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature</em>' containment reference.
	 * @see #getFeature()
	 * @generated
	 */
	void setFeature(Feature value);

} // Kml
