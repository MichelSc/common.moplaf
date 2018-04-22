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
package com.misc.common.moplaf.job.jobclient;

import com.misc.common.moplaf.common.ReturnFeedback;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Job Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.JobSource#getJobsScheduled <em>Jobs Scheduled</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.job.jobclient.JobClientPackage#getJobSource()
 * @model abstract="true"
 * @generated
 */
public interface JobSource extends JobSchedulerService {
	/**
	 * Returns the value of the '<em><b>Jobs Scheduled</b></em>' reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.job.jobclient.JobScheduled}.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.job.jobclient.JobScheduled#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jobs Scheduled</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jobs Scheduled</em>' reference list.
	 * @see com.misc.common.moplaf.job.jobclient.JobClientPackage#getJobSource_JobsScheduled()
	 * @see com.misc.common.moplaf.job.jobclient.JobScheduled#getSource
	 * @model opposite="Source"
	 * @generated
	 */
	EList<JobScheduled> getJobsScheduled();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void onJobRunning(JobScheduled job);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model feedbackDataType="com.misc.common.moplaf.job.ReturnFeedback"
	 * @generated
	 */
	void onJobReturned(JobScheduled job, ReturnFeedback feedback);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void refresh();

} // JobSource
