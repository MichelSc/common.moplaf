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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.macroplanner.MacroPlannerDataElement#getMacroPlannerData <em>Macro Planner Data</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.macroplanner.MacroPlannerPackage#getMacroPlannerDataElement()
 * @model abstract="true"
 * @generated
 */
public interface MacroPlannerDataElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Macro Planner Data</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.macroplanner.MacroPlannerData#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Macro Planner Data</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Macro Planner Data</em>' container reference.
	 * @see #setMacroPlannerData(MacroPlannerData)
	 * @see com.misc.common.moplaf.macroplanner.MacroPlannerPackage#getMacroPlannerDataElement_MacroPlannerData()
	 * @see com.misc.common.moplaf.macroplanner.MacroPlannerData#getElements
	 * @model opposite="Elements" required="true" transient="false"
	 * @generated
	 */
	MacroPlannerData getMacroPlannerData();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.macroplanner.MacroPlannerDataElement#getMacroPlannerData <em>Macro Planner Data</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Macro Planner Data</em>' container reference.
	 * @see #getMacroPlannerData()
	 * @generated
	 */
	void setMacroPlannerData(MacroPlannerData value);

} // MacroPlannerDataElement
