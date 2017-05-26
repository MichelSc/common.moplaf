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
 *   <li>{@link com.misc.common.moplaf.job.SetterStructuralFeature#getFeatureToSet <em>Feature To Set</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.job.JobPackage#getSetterStructuralFeature()
 * @model abstract="true"
 * @generated
 */
public interface SetterStructuralFeature extends EObject {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void accept(EObject objectToSetFeatures);

} // SetterStructuralFeature
