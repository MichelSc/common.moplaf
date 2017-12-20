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
package com.misc.common.moplaf.job.jobclient;

import com.misc.common.moplaf.common.EnabledFeedback;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Job Engine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.JobEngine#getJobScheduled <em>Job Scheduled</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.JobEngine#getName <em>Name</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.JobEngine#getScheduler <em>Scheduler</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.JobEngine#getExecuteEnabledFeedback <em>Execute Enabled Feedback</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.job.jobclient.JobClientPackage#getJobEngine()
 * @model abstract="true"
 * @generated
 */
public interface JobEngine extends EObject {
	/**
	 * Returns the value of the '<em><b>Job Scheduled</b></em>' reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.job.jobclient.JobScheduled}.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.job.jobclient.JobScheduled#getScheduledOn <em>Scheduled On</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Job Scheduled</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Job Scheduled</em>' reference list.
	 * @see com.misc.common.moplaf.job.jobclient.JobClientPackage#getJobEngine_JobScheduled()
	 * @see com.misc.common.moplaf.job.jobclient.JobScheduled#getScheduledOn
	 * @model opposite="ScheduledOn"
	 * @generated
	 */
	EList<JobScheduled> getJobScheduled();

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
	 * @see com.misc.common.moplaf.job.jobclient.JobClientPackage#getJobEngine_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.job.jobclient.JobEngine#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Scheduler</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.job.jobclient.JobScheduler#getEngines <em>Engines</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scheduler</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scheduler</em>' container reference.
	 * @see #setScheduler(JobScheduler)
	 * @see com.misc.common.moplaf.job.jobclient.JobClientPackage#getJobEngine_Scheduler()
	 * @see com.misc.common.moplaf.job.jobclient.JobScheduler#getEngines
	 * @model opposite="Engines" required="true" transient="false"
	 * @generated
	 */
	JobScheduler getScheduler();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.job.jobclient.JobEngine#getScheduler <em>Scheduler</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scheduler</em>' container reference.
	 * @see #getScheduler()
	 * @generated
	 */
	void setScheduler(JobScheduler value);

	/**
	 * Returns the value of the '<em><b>Execute Enabled Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Execute Enabled Feedback</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Execute Enabled Feedback</em>' attribute.
	 * @see com.misc.common.moplaf.job.jobclient.JobClientPackage#getJobEngine_ExecuteEnabledFeedback()
	 * @model dataType="com.misc.common.moplaf.job.EnabledFeedback" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EnabledFeedback getExecuteEnabledFeedback();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void executeJob(JobScheduled job);

} // JobEngine
