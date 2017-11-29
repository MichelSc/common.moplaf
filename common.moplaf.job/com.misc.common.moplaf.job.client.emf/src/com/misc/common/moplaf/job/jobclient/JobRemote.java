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

import com.misc.common.moplaf.common.ReturnFeedback;

import com.misc.common.moplaf.job.Job;
import com.misc.common.moplaf.job.ProgressFeedback;
import java.util.Date;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Job Remote</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.JobRemote#getSubmissionID <em>Submission ID</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.JobRemote#getResult <em>Result</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.JobRemote#getLastProgress <em>Last Progress</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.JobRemote#getLastProgressWork <em>Last Progress Work</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.JobRemote#getLastProgressTask <em>Last Progress Task</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.JobRemote#getJob <em>Job</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.JobRemote#getJobremote <em>Jobremote</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.JobRemote#getJobremoteeOpposite <em>Jobremotee Opposite</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.JobRemote#getName <em>Name</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.JobRemote#getProgress <em>Progress</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.JobRemote#getStartTime <em>Start Time</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.job.jobclient.JobClientPackage#getJobRemote()
 * @model
 * @generated
 */
public interface JobRemote extends EObject {
	/**
	 * Returns the value of the '<em><b>Submission ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Submission ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Submission ID</em>' attribute.
	 * @see #setSubmissionID(int)
	 * @see com.misc.common.moplaf.job.jobclient.JobClientPackage#getJobRemote_SubmissionID()
	 * @model
	 * @generated
	 */
	int getSubmissionID();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.job.jobclient.JobRemote#getSubmissionID <em>Submission ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Submission ID</em>' attribute.
	 * @see #getSubmissionID()
	 * @generated
	 */
	void setSubmissionID(int value);

	/**
	 * Returns the value of the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result</em>' containment reference.
	 * @see #setResult(JobRemoteResult)
	 * @see com.misc.common.moplaf.job.jobclient.JobClientPackage#getJobRemote_Result()
	 * @model containment="true"
	 * @generated
	 */
	JobRemoteResult getResult();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.job.jobclient.JobRemote#getResult <em>Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result</em>' containment reference.
	 * @see #getResult()
	 * @generated
	 */
	void setResult(JobRemoteResult value);

	/**
	 * Returns the value of the '<em><b>Last Progress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Progress</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Progress</em>' attribute.
	 * @see #setLastProgress(Date)
	 * @see com.misc.common.moplaf.job.jobclient.JobClientPackage#getJobRemote_LastProgress()
	 * @model
	 * @generated
	 */
	Date getLastProgress();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.job.jobclient.JobRemote#getLastProgress <em>Last Progress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Progress</em>' attribute.
	 * @see #getLastProgress()
	 * @generated
	 */
	void setLastProgress(Date value);

	/**
	 * Returns the value of the '<em><b>Last Progress Work</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Progress Work</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Progress Work</em>' attribute.
	 * @see #setLastProgressWork(float)
	 * @see com.misc.common.moplaf.job.jobclient.JobClientPackage#getJobRemote_LastProgressWork()
	 * @model
	 * @generated
	 */
	float getLastProgressWork();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.job.jobclient.JobRemote#getLastProgressWork <em>Last Progress Work</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Progress Work</em>' attribute.
	 * @see #getLastProgressWork()
	 * @generated
	 */
	void setLastProgressWork(float value);

	/**
	 * Returns the value of the '<em><b>Last Progress Task</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Progress Task</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Progress Task</em>' attribute.
	 * @see #setLastProgressTask(String)
	 * @see com.misc.common.moplaf.job.jobclient.JobClientPackage#getJobRemote_LastProgressTask()
	 * @model
	 * @generated
	 */
	String getLastProgressTask();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.job.jobclient.JobRemote#getLastProgressTask <em>Last Progress Task</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Progress Task</em>' attribute.
	 * @see #getLastProgressTask()
	 * @generated
	 */
	void setLastProgressTask(String value);

	/**
	 * Returns the value of the '<em><b>Job</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.job.Job}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Job</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Job</em>' containment reference list.
	 * @see com.misc.common.moplaf.job.jobclient.JobClientPackage#getJobRemote_Job()
	 * @model containment="true"
	 * @generated
	 */
	EList<Job> getJob();

	/**
	 * Returns the value of the '<em><b>Jobremote</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.job.jobclient.JobRemote#getJobremoteeOpposite <em>Jobremotee Opposite</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jobremote</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jobremote</em>' reference.
	 * @see #setJobremote(JobRemote)
	 * @see com.misc.common.moplaf.job.jobclient.JobClientPackage#getJobRemote_Jobremote()
	 * @see com.misc.common.moplaf.job.jobclient.JobRemote#getJobremoteeOpposite
	 * @model opposite="jobremoteeOpposite"
	 * @generated
	 */
	JobRemote getJobremote();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.job.jobclient.JobRemote#getJobremote <em>Jobremote</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jobremote</em>' reference.
	 * @see #getJobremote()
	 * @generated
	 */
	void setJobremote(JobRemote value);

	/**
	 * Returns the value of the '<em><b>Jobremotee Opposite</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.job.jobclient.JobRemote#getJobremote <em>Jobremote</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jobremotee Opposite</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jobremotee Opposite</em>' reference.
	 * @see #setJobremoteeOpposite(JobRemote)
	 * @see com.misc.common.moplaf.job.jobclient.JobClientPackage#getJobRemote_JobremoteeOpposite()
	 * @see com.misc.common.moplaf.job.jobclient.JobRemote#getJobremote
	 * @model opposite="jobremote"
	 * @generated
	 */
	JobRemote getJobremoteeOpposite();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.job.jobclient.JobRemote#getJobremoteeOpposite <em>Jobremotee Opposite</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jobremotee Opposite</em>' reference.
	 * @see #getJobremoteeOpposite()
	 * @generated
	 */
	void setJobremoteeOpposite(JobRemote value);

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
	 * @see com.misc.common.moplaf.job.jobclient.JobClientPackage#getJobRemote_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.job.jobclient.JobRemote#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Progress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Progress</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Progress</em>' attribute.
	 * @see #setProgress(ProgressFeedback)
	 * @see com.misc.common.moplaf.job.jobclient.JobClientPackage#getJobRemote_Progress()
	 * @model dataType="com.misc.common.moplaf.job.ProgressFeedback"
	 * @generated
	 */
	ProgressFeedback getProgress();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.job.jobclient.JobRemote#getProgress <em>Progress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Progress</em>' attribute.
	 * @see #getProgress()
	 * @generated
	 */
	void setProgress(ProgressFeedback value);

	/**
	 * Returns the value of the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Time</em>' attribute.
	 * @see #setStartTime(Date)
	 * @see com.misc.common.moplaf.job.jobclient.JobClientPackage#getJobRemote_StartTime()
	 * @model
	 * @generated
	 */
	Date getStartTime();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.job.jobclient.JobRemote#getStartTime <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Time</em>' attribute.
	 * @see #getStartTime()
	 * @generated
	 */
	void setStartTime(Date value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model feedbackDataType="com.misc.common.moplaf.job.ProgressFeedback"
	 * @generated
	 */
	void onProgress(ProgressFeedback feedback);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model feedbackDataType="com.misc.common.moplaf.job.ReturnFeedback"
	 * @generated
	 */
	void onReturn(ReturnFeedback feedback);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void refreshProgress();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="com.misc.common.moplaf.job.ReturnFeedback"
	 * @generated
	 */
	ReturnFeedback run(SubmittedJob job);

} // JobRemote
