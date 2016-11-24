/**
 */
package com.misc.common.moplaf.job;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.job.JobParameter#getName <em>Name</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.JobParameter#getType <em>Type</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.JobParameter#getJobAttribute <em>Job Attribute</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.JobParameter#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.job.JobPackage#getJobParameter()
 * @model
 * @generated
 */
public interface JobParameter extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.misc.common.moplaf.job.JobPackage#getJobParameter_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.job.JobParameter#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link com.misc.common.moplaf.job.JobParameterType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see com.misc.common.moplaf.job.JobParameterType
	 * @see #setType(JobParameterType)
	 * @see com.misc.common.moplaf.job.JobPackage#getJobParameter_Type()
	 * @model
	 * @generated
	 */
	JobParameterType getType();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.job.JobParameter#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see com.misc.common.moplaf.job.JobParameterType
	 * @see #getType()
	 * @generated
	 */
	void setType(JobParameterType value);

	/**
	 * Returns the value of the '<em><b>Job Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Job Attribute</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Job Attribute</em>' reference.
	 * @see #setJobAttribute(EAttribute)
	 * @see com.misc.common.moplaf.job.JobPackage#getJobParameter_JobAttribute()
	 * @model
	 * @generated
	 */
	EAttribute getJobAttribute();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.job.JobParameter#getJobAttribute <em>Job Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Job Attribute</em>' reference.
	 * @see #getJobAttribute()
	 * @generated
	 */
	void setJobAttribute(EAttribute value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see com.misc.common.moplaf.job.JobPackage#getJobParameter_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.job.JobParameter#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // JobParameter
