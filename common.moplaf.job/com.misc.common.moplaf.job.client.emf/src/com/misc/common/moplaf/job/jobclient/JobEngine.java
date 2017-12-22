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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Job Engine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.JobEngine#getJobsScheduled <em>Jobs Scheduled</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.JobEngine#getExecuteEnabledFeedback <em>Execute Enabled Feedback</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.job.jobclient.JobClientPackage#getJobEngine()
 * @model abstract="true"
 * @generated
 */
public interface JobEngine extends JobSchedulerService {
	/**
	 * Returns the value of the '<em><b>Jobs Scheduled</b></em>' reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.job.jobclient.JobScheduled}.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.job.jobclient.JobScheduled#getScheduledOn <em>Scheduled On</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jobs Scheduled</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jobs Scheduled</em>' reference list.
	 * @see com.misc.common.moplaf.job.jobclient.JobClientPackage#getJobEngine_JobsScheduled()
	 * @see com.misc.common.moplaf.job.jobclient.JobScheduled#getScheduledOn
	 * @model opposite="ScheduledOn"
	 * @generated
	 */
	EList<JobScheduled> getJobsScheduled();

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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void refreshJobStatus(JobScheduled job);

} // JobEngine
