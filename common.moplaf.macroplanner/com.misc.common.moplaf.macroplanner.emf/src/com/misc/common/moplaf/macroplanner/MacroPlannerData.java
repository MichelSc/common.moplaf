/*******************************************************************************
 * Copyright (c) 2017 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
/**
 */
package com.misc.common.moplaf.macroplanner;

import com.misc.common.moplaf.time.TimeUnit;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.macroplanner.MacroPlannerData#getTimeUnit <em>Time Unit</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.macroplanner.MacroPlannerPackage#getMacroPlannerData()
 * @model abstract="true"
 * @generated
 */
public interface MacroPlannerData extends EObject {
	/**
	 * Returns the value of the '<em><b>Time Unit</b></em>' attribute.
	 * The literals are from the enumeration {@link com.misc.common.moplaf.time.TimeUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Unit</em>' attribute.
	 * @see com.misc.common.moplaf.time.TimeUnit
	 * @see #setTimeUnit(TimeUnit)
	 * @see com.misc.common.moplaf.macroplanner.MacroPlannerPackage#getMacroPlannerData_TimeUnit()
	 * @model
	 * @generated
	 */
	TimeUnit getTimeUnit();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.macroplanner.MacroPlannerData#getTimeUnit <em>Time Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Unit</em>' attribute.
	 * @see com.misc.common.moplaf.time.TimeUnit
	 * @see #getTimeUnit()
	 * @generated
	 */
	void setTimeUnit(TimeUnit value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	float getDurationTimeUnit(TimeUnit timeUnit);

} // MacroPlannerData
