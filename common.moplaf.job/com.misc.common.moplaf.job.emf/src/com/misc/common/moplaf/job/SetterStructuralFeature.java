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
package com.misc.common.moplaf.job;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Setter Structural Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.job.SetterStructuralFeature#getSetter <em>Setter</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.SetterStructuralFeature#getFeatureToSet <em>Feature To Set</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.SetterStructuralFeature#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.job.JobPackage#getSetterStructuralFeature()
 * @model abstract="true"
 * @generated
 */
public interface SetterStructuralFeature extends EObject {
	/**
	 * Returns the value of the '<em><b>Setter</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.job.Setter#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Setter</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Setter</em>' container reference.
	 * @see #setSetter(Setter)
	 * @see com.misc.common.moplaf.job.JobPackage#getSetterStructuralFeature_Setter()
	 * @see com.misc.common.moplaf.job.Setter#getFeatures
	 * @model opposite="Features" required="true" transient="false"
	 * @generated
	 */
	Setter getSetter();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.job.SetterStructuralFeature#getSetter <em>Setter</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Setter</em>' container reference.
	 * @see #getSetter()
	 * @generated
	 */
	void setSetter(Setter value);

	/**
	 * Returns the value of the '<em><b>Feature To Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature To Set</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature To Set</em>' reference.
	 * @see com.misc.common.moplaf.job.JobPackage#getSetterStructuralFeature_FeatureToSet()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EStructuralFeature getFeatureToSet();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see com.misc.common.moplaf.job.JobPackage#getSetterStructuralFeature_Description()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getDescription();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void accept(EObject objectToSetFeatures);

} // SetterStructuralFeature
