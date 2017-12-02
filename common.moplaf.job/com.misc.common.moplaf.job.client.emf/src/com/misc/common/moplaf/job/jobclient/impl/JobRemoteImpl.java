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
package com.misc.common.moplaf.job.jobclient.impl;

import com.misc.common.moplaf.common.ReturnFeedback;
import com.misc.common.moplaf.job.Job;
import com.misc.common.moplaf.job.Plugin;
import com.misc.common.moplaf.job.ProgressFeedback;
import com.misc.common.moplaf.job.jobclient.JobClientPackage;
import com.misc.common.moplaf.job.jobclient.JobRemote;
import com.misc.common.moplaf.job.jobclient.JobRemoteResult;
import com.misc.common.moplaf.job.jobclient.SubmittedJob;
import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Date;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Job Remote</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.impl.JobRemoteImpl#getSubmissionID <em>Submission ID</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.impl.JobRemoteImpl#getResult <em>Result</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.impl.JobRemoteImpl#getLastProgress <em>Last Progress</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.impl.JobRemoteImpl#getLastProgressWork <em>Last Progress Work</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.impl.JobRemoteImpl#getLastProgressTask <em>Last Progress Task</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.impl.JobRemoteImpl#getJob <em>Job</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.impl.JobRemoteImpl#getJobremote <em>Jobremote</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.impl.JobRemoteImpl#getJobremoteeOpposite <em>Jobremotee Opposite</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.impl.JobRemoteImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.impl.JobRemoteImpl#getProgress <em>Progress</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.impl.JobRemoteImpl#getStartTime <em>Start Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JobRemoteImpl extends MinimalEObjectImpl.Container implements JobRemote {
	/**
	 * The default value of the '{@link #getSubmissionID() <em>Submission ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubmissionID()
	 * @generated
	 * @ordered
	 */
	protected static final int SUBMISSION_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSubmissionID() <em>Submission ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubmissionID()
	 * @generated
	 * @ordered
	 */
	protected int submissionID = SUBMISSION_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getResult() <em>Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResult()
	 * @generated
	 * @ordered
	 */
	protected JobRemoteResult result;

	/**
	 * The default value of the '{@link #getLastProgress() <em>Last Progress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastProgress()
	 * @generated
	 * @ordered
	 */
	protected static final Date LAST_PROGRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastProgress() <em>Last Progress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastProgress()
	 * @generated
	 * @ordered
	 */
	protected Date lastProgress = LAST_PROGRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastProgressWork() <em>Last Progress Work</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastProgressWork()
	 * @generated
	 * @ordered
	 */
	protected static final float LAST_PROGRESS_WORK_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getLastProgressWork() <em>Last Progress Work</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastProgressWork()
	 * @generated
	 * @ordered
	 */
	protected float lastProgressWork = LAST_PROGRESS_WORK_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastProgressTask() <em>Last Progress Task</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastProgressTask()
	 * @generated
	 * @ordered
	 */
	protected static final String LAST_PROGRESS_TASK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastProgressTask() <em>Last Progress Task</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastProgressTask()
	 * @generated
	 * @ordered
	 */
	protected String lastProgressTask = LAST_PROGRESS_TASK_EDEFAULT;

	/**
	 * The cached value of the '{@link #getJob() <em>Job</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJob()
	 * @generated
	 * @ordered
	 */
	protected EList<Job> job;

	/**
	 * The cached value of the '{@link #getJobremote() <em>Jobremote</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobremote()
	 * @generated
	 * @ordered
	 */
	protected JobRemote jobremote;

	/**
	 * The cached value of the '{@link #getJobremoteeOpposite() <em>Jobremotee Opposite</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobremoteeOpposite()
	 * @generated
	 * @ordered
	 */
	protected JobRemote jobremoteeOpposite;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getProgress() <em>Progress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgress()
	 * @generated
	 * @ordered
	 */
	protected static final ProgressFeedback PROGRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProgress() <em>Progress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgress()
	 * @generated
	 * @ordered
	 */
	protected ProgressFeedback progress = PROGRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartTime() <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date START_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartTime() <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartTime()
	 * @generated
	 * @ordered
	 */
	protected Date startTime = START_TIME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JobRemoteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JobClientPackage.Literals.JOB_REMOTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSubmissionID() {
		return submissionID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubmissionID(int newSubmissionID) {
		int oldSubmissionID = submissionID;
		submissionID = newSubmissionID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JobClientPackage.JOB_REMOTE__SUBMISSION_ID, oldSubmissionID, submissionID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JobRemoteResult getResult() {
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResult(JobRemoteResult newResult, NotificationChain msgs) {
		JobRemoteResult oldResult = result;
		result = newResult;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JobClientPackage.JOB_REMOTE__RESULT, oldResult, newResult);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResult(JobRemoteResult newResult) {
		if (newResult != result) {
			NotificationChain msgs = null;
			if (result != null)
				msgs = ((InternalEObject)result).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JobClientPackage.JOB_REMOTE__RESULT, null, msgs);
			if (newResult != null)
				msgs = ((InternalEObject)newResult).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JobClientPackage.JOB_REMOTE__RESULT, null, msgs);
			msgs = basicSetResult(newResult, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JobClientPackage.JOB_REMOTE__RESULT, newResult, newResult));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getLastProgress() {
		return lastProgress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastProgress(Date newLastProgress) {
		Date oldLastProgress = lastProgress;
		lastProgress = newLastProgress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JobClientPackage.JOB_REMOTE__LAST_PROGRESS, oldLastProgress, lastProgress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getLastProgressWork() {
		return lastProgressWork;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastProgressWork(float newLastProgressWork) {
		float oldLastProgressWork = lastProgressWork;
		lastProgressWork = newLastProgressWork;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JobClientPackage.JOB_REMOTE__LAST_PROGRESS_WORK, oldLastProgressWork, lastProgressWork));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLastProgressTask() {
		return lastProgressTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastProgressTask(String newLastProgressTask) {
		String oldLastProgressTask = lastProgressTask;
		lastProgressTask = newLastProgressTask;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JobClientPackage.JOB_REMOTE__LAST_PROGRESS_TASK, oldLastProgressTask, lastProgressTask));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Job> getJob() {
		if (job == null) {
			job = new EObjectContainmentEList<Job>(Job.class, this, JobClientPackage.JOB_REMOTE__JOB);
		}
		return job;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JobRemote getJobremote() {
		if (jobremote != null && jobremote.eIsProxy()) {
			InternalEObject oldJobremote = (InternalEObject)jobremote;
			jobremote = (JobRemote)eResolveProxy(oldJobremote);
			if (jobremote != oldJobremote) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JobClientPackage.JOB_REMOTE__JOBREMOTE, oldJobremote, jobremote));
			}
		}
		return jobremote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JobRemote basicGetJobremote() {
		return jobremote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJobremote(JobRemote newJobremote, NotificationChain msgs) {
		JobRemote oldJobremote = jobremote;
		jobremote = newJobremote;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JobClientPackage.JOB_REMOTE__JOBREMOTE, oldJobremote, newJobremote);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJobremote(JobRemote newJobremote) {
		if (newJobremote != jobremote) {
			NotificationChain msgs = null;
			if (jobremote != null)
				msgs = ((InternalEObject)jobremote).eInverseRemove(this, JobClientPackage.JOB_REMOTE__JOBREMOTEE_OPPOSITE, JobRemote.class, msgs);
			if (newJobremote != null)
				msgs = ((InternalEObject)newJobremote).eInverseAdd(this, JobClientPackage.JOB_REMOTE__JOBREMOTEE_OPPOSITE, JobRemote.class, msgs);
			msgs = basicSetJobremote(newJobremote, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JobClientPackage.JOB_REMOTE__JOBREMOTE, newJobremote, newJobremote));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JobRemote getJobremoteeOpposite() {
		if (jobremoteeOpposite != null && jobremoteeOpposite.eIsProxy()) {
			InternalEObject oldJobremoteeOpposite = (InternalEObject)jobremoteeOpposite;
			jobremoteeOpposite = (JobRemote)eResolveProxy(oldJobremoteeOpposite);
			if (jobremoteeOpposite != oldJobremoteeOpposite) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JobClientPackage.JOB_REMOTE__JOBREMOTEE_OPPOSITE, oldJobremoteeOpposite, jobremoteeOpposite));
			}
		}
		return jobremoteeOpposite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JobRemote basicGetJobremoteeOpposite() {
		return jobremoteeOpposite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJobremoteeOpposite(JobRemote newJobremoteeOpposite, NotificationChain msgs) {
		JobRemote oldJobremoteeOpposite = jobremoteeOpposite;
		jobremoteeOpposite = newJobremoteeOpposite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JobClientPackage.JOB_REMOTE__JOBREMOTEE_OPPOSITE, oldJobremoteeOpposite, newJobremoteeOpposite);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJobremoteeOpposite(JobRemote newJobremoteeOpposite) {
		if (newJobremoteeOpposite != jobremoteeOpposite) {
			NotificationChain msgs = null;
			if (jobremoteeOpposite != null)
				msgs = ((InternalEObject)jobremoteeOpposite).eInverseRemove(this, JobClientPackage.JOB_REMOTE__JOBREMOTE, JobRemote.class, msgs);
			if (newJobremoteeOpposite != null)
				msgs = ((InternalEObject)newJobremoteeOpposite).eInverseAdd(this, JobClientPackage.JOB_REMOTE__JOBREMOTE, JobRemote.class, msgs);
			msgs = basicSetJobremoteeOpposite(newJobremoteeOpposite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JobClientPackage.JOB_REMOTE__JOBREMOTEE_OPPOSITE, newJobremoteeOpposite, newJobremoteeOpposite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JobClientPackage.JOB_REMOTE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgressFeedback getProgress() {
		return progress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProgress(ProgressFeedback newProgress) {
		ProgressFeedback oldProgress = progress;
		progress = newProgress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JobClientPackage.JOB_REMOTE__PROGRESS, oldProgress, progress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getStartTime() {
		return startTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartTime(Date newStartTime) {
		Date oldStartTime = startTime;
		startTime = newStartTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JobClientPackage.JOB_REMOTE__START_TIME, oldStartTime, startTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void onProgress(ProgressFeedback feedback) {
		Plugin.INSTANCE.logInfo("JobRemoteImpl.onProgress");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void onReturn(ReturnFeedback feedback) {
		Plugin.INSTANCE.logInfo("JobRemoteImpl.onReturn");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void refreshProgress() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReturnFeedback run(SubmittedJob job) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JobClientPackage.JOB_REMOTE__JOBREMOTE:
				if (jobremote != null)
					msgs = ((InternalEObject)jobremote).eInverseRemove(this, JobClientPackage.JOB_REMOTE__JOBREMOTEE_OPPOSITE, JobRemote.class, msgs);
				return basicSetJobremote((JobRemote)otherEnd, msgs);
			case JobClientPackage.JOB_REMOTE__JOBREMOTEE_OPPOSITE:
				if (jobremoteeOpposite != null)
					msgs = ((InternalEObject)jobremoteeOpposite).eInverseRemove(this, JobClientPackage.JOB_REMOTE__JOBREMOTE, JobRemote.class, msgs);
				return basicSetJobremoteeOpposite((JobRemote)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JobClientPackage.JOB_REMOTE__RESULT:
				return basicSetResult(null, msgs);
			case JobClientPackage.JOB_REMOTE__JOB:
				return ((InternalEList<?>)getJob()).basicRemove(otherEnd, msgs);
			case JobClientPackage.JOB_REMOTE__JOBREMOTE:
				return basicSetJobremote(null, msgs);
			case JobClientPackage.JOB_REMOTE__JOBREMOTEE_OPPOSITE:
				return basicSetJobremoteeOpposite(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JobClientPackage.JOB_REMOTE__SUBMISSION_ID:
				return getSubmissionID();
			case JobClientPackage.JOB_REMOTE__RESULT:
				return getResult();
			case JobClientPackage.JOB_REMOTE__LAST_PROGRESS:
				return getLastProgress();
			case JobClientPackage.JOB_REMOTE__LAST_PROGRESS_WORK:
				return getLastProgressWork();
			case JobClientPackage.JOB_REMOTE__LAST_PROGRESS_TASK:
				return getLastProgressTask();
			case JobClientPackage.JOB_REMOTE__JOB:
				return getJob();
			case JobClientPackage.JOB_REMOTE__JOBREMOTE:
				if (resolve) return getJobremote();
				return basicGetJobremote();
			case JobClientPackage.JOB_REMOTE__JOBREMOTEE_OPPOSITE:
				if (resolve) return getJobremoteeOpposite();
				return basicGetJobremoteeOpposite();
			case JobClientPackage.JOB_REMOTE__NAME:
				return getName();
			case JobClientPackage.JOB_REMOTE__PROGRESS:
				return getProgress();
			case JobClientPackage.JOB_REMOTE__START_TIME:
				return getStartTime();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case JobClientPackage.JOB_REMOTE__SUBMISSION_ID:
				setSubmissionID((Integer)newValue);
				return;
			case JobClientPackage.JOB_REMOTE__RESULT:
				setResult((JobRemoteResult)newValue);
				return;
			case JobClientPackage.JOB_REMOTE__LAST_PROGRESS:
				setLastProgress((Date)newValue);
				return;
			case JobClientPackage.JOB_REMOTE__LAST_PROGRESS_WORK:
				setLastProgressWork((Float)newValue);
				return;
			case JobClientPackage.JOB_REMOTE__LAST_PROGRESS_TASK:
				setLastProgressTask((String)newValue);
				return;
			case JobClientPackage.JOB_REMOTE__JOB:
				getJob().clear();
				getJob().addAll((Collection<? extends Job>)newValue);
				return;
			case JobClientPackage.JOB_REMOTE__JOBREMOTE:
				setJobremote((JobRemote)newValue);
				return;
			case JobClientPackage.JOB_REMOTE__JOBREMOTEE_OPPOSITE:
				setJobremoteeOpposite((JobRemote)newValue);
				return;
			case JobClientPackage.JOB_REMOTE__NAME:
				setName((String)newValue);
				return;
			case JobClientPackage.JOB_REMOTE__PROGRESS:
				setProgress((ProgressFeedback)newValue);
				return;
			case JobClientPackage.JOB_REMOTE__START_TIME:
				setStartTime((Date)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case JobClientPackage.JOB_REMOTE__SUBMISSION_ID:
				setSubmissionID(SUBMISSION_ID_EDEFAULT);
				return;
			case JobClientPackage.JOB_REMOTE__RESULT:
				setResult((JobRemoteResult)null);
				return;
			case JobClientPackage.JOB_REMOTE__LAST_PROGRESS:
				setLastProgress(LAST_PROGRESS_EDEFAULT);
				return;
			case JobClientPackage.JOB_REMOTE__LAST_PROGRESS_WORK:
				setLastProgressWork(LAST_PROGRESS_WORK_EDEFAULT);
				return;
			case JobClientPackage.JOB_REMOTE__LAST_PROGRESS_TASK:
				setLastProgressTask(LAST_PROGRESS_TASK_EDEFAULT);
				return;
			case JobClientPackage.JOB_REMOTE__JOB:
				getJob().clear();
				return;
			case JobClientPackage.JOB_REMOTE__JOBREMOTE:
				setJobremote((JobRemote)null);
				return;
			case JobClientPackage.JOB_REMOTE__JOBREMOTEE_OPPOSITE:
				setJobremoteeOpposite((JobRemote)null);
				return;
			case JobClientPackage.JOB_REMOTE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case JobClientPackage.JOB_REMOTE__PROGRESS:
				setProgress(PROGRESS_EDEFAULT);
				return;
			case JobClientPackage.JOB_REMOTE__START_TIME:
				setStartTime(START_TIME_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case JobClientPackage.JOB_REMOTE__SUBMISSION_ID:
				return submissionID != SUBMISSION_ID_EDEFAULT;
			case JobClientPackage.JOB_REMOTE__RESULT:
				return result != null;
			case JobClientPackage.JOB_REMOTE__LAST_PROGRESS:
				return LAST_PROGRESS_EDEFAULT == null ? lastProgress != null : !LAST_PROGRESS_EDEFAULT.equals(lastProgress);
			case JobClientPackage.JOB_REMOTE__LAST_PROGRESS_WORK:
				return lastProgressWork != LAST_PROGRESS_WORK_EDEFAULT;
			case JobClientPackage.JOB_REMOTE__LAST_PROGRESS_TASK:
				return LAST_PROGRESS_TASK_EDEFAULT == null ? lastProgressTask != null : !LAST_PROGRESS_TASK_EDEFAULT.equals(lastProgressTask);
			case JobClientPackage.JOB_REMOTE__JOB:
				return job != null && !job.isEmpty();
			case JobClientPackage.JOB_REMOTE__JOBREMOTE:
				return jobremote != null;
			case JobClientPackage.JOB_REMOTE__JOBREMOTEE_OPPOSITE:
				return jobremoteeOpposite != null;
			case JobClientPackage.JOB_REMOTE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case JobClientPackage.JOB_REMOTE__PROGRESS:
				return PROGRESS_EDEFAULT == null ? progress != null : !PROGRESS_EDEFAULT.equals(progress);
			case JobClientPackage.JOB_REMOTE__START_TIME:
				return START_TIME_EDEFAULT == null ? startTime != null : !START_TIME_EDEFAULT.equals(startTime);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case JobClientPackage.JOB_REMOTE___ON_PROGRESS__PROGRESSFEEDBACK:
				onProgress((ProgressFeedback)arguments.get(0));
				return null;
			case JobClientPackage.JOB_REMOTE___ON_RETURN__RETURNFEEDBACK:
				onReturn((ReturnFeedback)arguments.get(0));
				return null;
			case JobClientPackage.JOB_REMOTE___REFRESH_PROGRESS:
				refreshProgress();
				return null;
			case JobClientPackage.JOB_REMOTE___RUN__SUBMITTEDJOB:
				return run((SubmittedJob)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (SubmissionID: ");
		result.append(submissionID);
		result.append(", LastProgress: ");
		result.append(lastProgress);
		result.append(", LastProgressWork: ");
		result.append(lastProgressWork);
		result.append(", LastProgressTask: ");
		result.append(lastProgressTask);
		result.append(", Name: ");
		result.append(name);
		result.append(", Progress: ");
		result.append(progress);
		result.append(", StartTime: ");
		result.append(startTime);
		result.append(')');
		return result.toString();
	}

} //JobRemoteImpl
