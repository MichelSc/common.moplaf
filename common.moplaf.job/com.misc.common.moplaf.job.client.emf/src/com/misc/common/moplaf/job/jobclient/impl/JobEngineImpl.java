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

import com.misc.common.moplaf.common.EnabledFeedback;
import com.misc.common.moplaf.job.Plugin;
import com.misc.common.moplaf.job.jobclient.JobClientPackage;
import com.misc.common.moplaf.job.jobclient.JobEngine;
import com.misc.common.moplaf.job.jobclient.JobScheduled;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Job Engine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.impl.JobEngineImpl#getJobsScheduled <em>Jobs Scheduled</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.impl.JobEngineImpl#getExecuteEnabledFeedback <em>Execute Enabled Feedback</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class JobEngineImpl extends JobSchedulerServiceImpl implements JobEngine {
	/**
	 * The cached value of the '{@link #getJobsScheduled() <em>Jobs Scheduled</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobsScheduled()
	 * @generated
	 * @ordered
	 */
	protected EList<JobScheduled> jobsScheduled;

	/**
	 * The default value of the '{@link #getExecuteEnabledFeedback() <em>Execute Enabled Feedback</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecuteEnabledFeedback()
	 * @generated
	 * @ordered
	 */
	protected static final EnabledFeedback EXECUTE_ENABLED_FEEDBACK_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JobEngineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JobClientPackage.Literals.JOB_ENGINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JobScheduled> getJobsScheduled() {
		if (jobsScheduled == null) {
			jobsScheduled = new EObjectWithInverseResolvingEList<JobScheduled>(JobScheduled.class, this, JobClientPackage.JOB_ENGINE__JOBS_SCHEDULED, JobClientPackage.JOB_SCHEDULED__SCHEDULED_ON);
		}
		return jobsScheduled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public EnabledFeedback getExecuteEnabledFeedback() {
		if ( !this.isRunning()) {
			return new EnabledFeedback(false, "Engine not running");
		}
		return EnabledFeedback.NOFEEDBACK;
	}
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void executeJob(JobScheduled job) {
		Plugin.INSTANCE.logInfo("JobEngine.executeJob");
		boolean executed = this.executeJobImpl(job);
		if ( executed ) {
			this.getJobsScheduled().add(job);
		} else {
			Plugin.INSTANCE.logError("JobEngine.executeJob failed: stop the engine");
			this.stop();
		}
	}
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public String getDescription() {
		String description = String.format("Engine %s (%s)", this.getName(), this.getStatus());

		int submitted = this.getJobsScheduled().size();
		if ( submitted>0 )   { description += String.format(", scheduled=%d", submitted); }

		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void refreshJobStatus(JobScheduled job) {
		// default does nothing
	}

	/**
	 * Execute the job.
	 * Called when the engine is ready to process and the job is ready to be processed.
	 * So this is expected to succeed.
	 * Take in charge the execution of the job.
	 * Set the SchedulerNr, in case of success.
	 * Return whether succeeded or not. 
	 * @param job
	 * @return
	 */
	protected boolean executeJobImpl(JobScheduled job) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JobClientPackage.JOB_ENGINE__JOBS_SCHEDULED:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getJobsScheduled()).basicAdd(otherEnd, msgs);
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
			case JobClientPackage.JOB_ENGINE__JOBS_SCHEDULED:
				return ((InternalEList<?>)getJobsScheduled()).basicRemove(otherEnd, msgs);
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
			case JobClientPackage.JOB_ENGINE__JOBS_SCHEDULED:
				return getJobsScheduled();
			case JobClientPackage.JOB_ENGINE__EXECUTE_ENABLED_FEEDBACK:
				return getExecuteEnabledFeedback();
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
			case JobClientPackage.JOB_ENGINE__JOBS_SCHEDULED:
				getJobsScheduled().clear();
				getJobsScheduled().addAll((Collection<? extends JobScheduled>)newValue);
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
			case JobClientPackage.JOB_ENGINE__JOBS_SCHEDULED:
				getJobsScheduled().clear();
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
			case JobClientPackage.JOB_ENGINE__JOBS_SCHEDULED:
				return jobsScheduled != null && !jobsScheduled.isEmpty();
			case JobClientPackage.JOB_ENGINE__EXECUTE_ENABLED_FEEDBACK:
				return EXECUTE_ENABLED_FEEDBACK_EDEFAULT == null ? getExecuteEnabledFeedback() != null : !EXECUTE_ENABLED_FEEDBACK_EDEFAULT.equals(getExecuteEnabledFeedback());
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
			case JobClientPackage.JOB_ENGINE___EXECUTE_JOB__JOBSCHEDULED:
				executeJob((JobScheduled)arguments.get(0));
				return null;
			case JobClientPackage.JOB_ENGINE___REFRESH_JOB_STATUS__JOBSCHEDULED:
				refreshJobStatus((JobScheduled)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //JobEngineImpl
