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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.misc.common.moplaf.job.JobPackage
 * @generated
 */
public interface JobFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	JobFactory eINSTANCE = com.misc.common.moplaf.job.impl.JobFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter</em>'.
	 * @generated
	 */
	JobParameter createJobParameter();

	/**
	 * Returns a new object of class '<em>Run Params</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Run Params</em>'.
	 * @generated
	 */
	RunParams createRunParams();

	/**
	 * Returns a new object of class '<em>Run</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Run</em>'.
	 * @generated
	 */
	Run createRun();

	/**
	 * Returns a new object of class '<em>Setter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Setter</em>'.
	 * @generated
	 */
	Setter createSetter();

	/**
	 * Returns a new object of class '<em>Setter Attribute Int</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Setter Attribute Int</em>'.
	 * @generated
	 */
	SetterAttributeInt createSetterAttributeInt();

	/**
	 * Returns a new object of class '<em>Setter Attribute Float</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Setter Attribute Float</em>'.
	 * @generated
	 */
	SetterAttributeFloat createSetterAttributeFloat();

	/**
	 * Returns a new object of class '<em>Params Holder</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Params Holder</em>'.
	 * @generated
	 */
	ParamsHolder createParamsHolder();

	/**
	 * Returns a new object of class '<em>Runs</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Runs</em>'.
	 * @generated
	 */
	Runs createRuns();

	/**
	 * Returns a new object of class '<em>Tasks</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tasks</em>'.
	 * @generated
	 */
	Tasks createTasks();

	/**
	 * Returns a new object of class '<em>Docs</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Docs</em>'.
	 * @generated
	 */
	Docs createDocs();

	/**
	 * Returns a new object of class '<em>Task Domain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task Domain</em>'.
	 * @generated
	 */
	TaskDomain createTaskDomain();

	/**
	 * Returns a new object of class '<em>Key Indicators</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Key Indicators</em>'.
	 * @generated
	 */
	KeyIndicators createKeyIndicators();

	/**
	 * Returns a new object of class '<em>Key Indicator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Key Indicator</em>'.
	 * @generated
	 */
	KeyIndicator createKeyIndicator();

	/**
	 * Returns a new object of class '<em>Docs Holder</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Docs Holder</em>'.
	 * @generated
	 */
	DocsHolder createDocsHolder();

	/**
	 * Returns a new object of class '<em>Compound Doc</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Compound Doc</em>'.
	 * @generated
	 */
	CompoundDoc createCompoundDoc();

	/**
	 * Returns a new object of class '<em>Doc In Docs Holder</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Doc In Docs Holder</em>'.
	 * @generated
	 */
	DocInDocsHolder createDocInDocsHolder();

	/**
	 * Returns a new object of class '<em>Task Input</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task Input</em>'.
	 * @generated
	 */
	TaskInput createTaskInput();

	/**
	 * Returns a new object of class '<em>Task Output</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task Output</em>'.
	 * @generated
	 */
	TaskOutput createTaskOutput();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	JobPackage getJobPackage();

} //JobFactory
