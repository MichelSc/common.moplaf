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
package com.misc.common.moplaf.job;

import org.eclipse.emf.ecore.EAttribute;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Setter Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.job.SetterAttribute#getAttributeToSet <em>Attribute To Set</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.job.JobPackage#getSetterAttribute()
 * @model abstract="true"
 * @generated
 */
public interface SetterAttribute extends SetterStructuralFeature {
	/**
	 * Returns the value of the '<em><b>Attribute To Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute To Set</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute To Set</em>' reference.
	 * @see #setAttributeToSet(EAttribute)
	 * @see com.misc.common.moplaf.job.JobPackage#getSetterAttribute_AttributeToSet()
	 * @model required="true"
	 * @generated
	 */
	EAttribute getAttributeToSet();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.job.SetterAttribute#getAttributeToSet <em>Attribute To Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute To Set</em>' reference.
	 * @see #getAttributeToSet()
	 * @generated
	 */
	void setAttributeToSet(EAttribute value);

} // SetterAttribute
