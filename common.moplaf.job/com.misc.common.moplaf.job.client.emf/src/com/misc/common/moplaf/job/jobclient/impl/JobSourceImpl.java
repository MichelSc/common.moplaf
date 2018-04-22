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
package com.misc.common.moplaf.job.jobclient.impl;

import com.misc.common.moplaf.common.ReturnFeedback;
import com.misc.common.moplaf.job.jobclient.JobClientPackage;
import com.misc.common.moplaf.job.jobclient.JobScheduled;
import com.misc.common.moplaf.job.jobclient.JobSource;

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
 * An implementation of the model object '<em><b>Job Source</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.impl.JobSourceImpl#getJobsScheduled <em>Jobs Scheduled</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class JobSourceImpl extends JobSchedulerServiceImpl implements JobSource {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JobSourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JobClientPackage.Literals.JOB_SOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JobScheduled> getJobsScheduled() {
		if (jobsScheduled == null) {
			jobsScheduled = new EObjectWithInverseResolvingEList<JobScheduled>(JobScheduled.class, this, JobClientPackage.JOB_SOURCE__JOBS_SCHEDULED, JobClientPackage.JOB_SCHEDULED__SOURCE);
		}
		return jobsScheduled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public String getDescription() {
		String description = String.format("Source %s (%s)", this.getName(), this.getStatus());

		int submitted = this.getJobsScheduled().size();
		if ( submitted>0 )   { description += String.format(", submitted=%d", submitted); }

		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void refresh() {
		// default does nothing
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void onJobRunning(JobScheduled job) {
		// default does nothing
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void onJobReturned(JobScheduled job, ReturnFeedback feedback) {
		// default does nothing
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
			case JobClientPackage.JOB_SOURCE__JOBS_SCHEDULED:
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
			case JobClientPackage.JOB_SOURCE__JOBS_SCHEDULED:
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
			case JobClientPackage.JOB_SOURCE__JOBS_SCHEDULED:
				return getJobsScheduled();
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
			case JobClientPackage.JOB_SOURCE__JOBS_SCHEDULED:
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
			case JobClientPackage.JOB_SOURCE__JOBS_SCHEDULED:
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
			case JobClientPackage.JOB_SOURCE__JOBS_SCHEDULED:
				return jobsScheduled != null && !jobsScheduled.isEmpty();
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
			case JobClientPackage.JOB_SOURCE___ON_JOB_RUNNING__JOBSCHEDULED:
				onJobRunning((JobScheduled)arguments.get(0));
				return null;
			case JobClientPackage.JOB_SOURCE___ON_JOB_RETURNED__JOBSCHEDULED_RETURNFEEDBACK:
				onJobReturned((JobScheduled)arguments.get(0), (ReturnFeedback)arguments.get(1));
				return null;
			case JobClientPackage.JOB_SOURCE___REFRESH:
				refresh();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //JobSourceImpl
