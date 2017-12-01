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

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EAttribute;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Console</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.job.JobConsole#getParameters <em>Parameters</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.JobConsole#getHelpText <em>Help Text</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.JobConsole#getArgs <em>Args</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.job.JobPackage#getJobConsole()
 * @model abstract="true"
 * @generated
 */
public interface JobConsole extends Job {
	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.job.JobParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see com.misc.common.moplaf.job.JobPackage#getJobConsole_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<JobParameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Help Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Help Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Help Text</em>' attribute.
	 * @see com.misc.common.moplaf.job.JobPackage#getJobConsole_HelpText()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getHelpText();

	/**
	 * Returns the value of the '<em><b>Args</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Args</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Args</em>' attribute list.
	 * @see com.misc.common.moplaf.job.JobPackage#getJobConsole_Args()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getArgs();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addParameter(String name, JobParameterType type, EAttribute attribute, String description);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void refreshParameters();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="com.misc.common.moplaf.job.Exception"
	 * @generated
	 */
	String getArgAsString(int index) throws Exception;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="com.misc.common.moplaf.job.Exception"
	 * @generated
	 */
	int getArgAsInt(int index) throws Exception;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="com.misc.common.moplaf.job.Exception"
	 * @generated
	 */
	float getArgAsFloat(int index) throws Exception;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="com.misc.common.moplaf.job.Exception"
	 * @generated
	 */
	Date getArgAsDate(int index) throws Exception;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="com.misc.common.moplaf.job.Exception"
	 * @generated
	 */
	Date getArgAsDate(int index, String simpleDateFormat) throws Exception;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="com.misc.common.moplaf.job.Exception"
	 * @generated
	 */
	void setArgs() throws Exception;

} // JobConsole
