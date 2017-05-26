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
