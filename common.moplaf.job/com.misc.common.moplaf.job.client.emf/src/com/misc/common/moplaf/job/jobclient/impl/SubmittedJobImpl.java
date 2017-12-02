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

import com.misc.common.moplaf.job.ProgressFeedback;
import com.misc.common.moplaf.job.Run;
import com.misc.common.moplaf.job.jobclient.JobClientPackage;
import com.misc.common.moplaf.job.jobclient.JobEngineOld;
import com.misc.common.moplaf.job.jobclient.JobRemote;
import com.misc.common.moplaf.job.jobclient.SubmittedJob;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Submitted Job</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.impl.SubmittedJobImpl#getJob <em>Job</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.impl.SubmittedJobImpl#getJobEngine <em>Job Engine</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubmittedJobImpl extends MinimalEObjectImpl.Container implements SubmittedJob {
	/**
	 * The cached value of the '{@link #getJob() <em>Job</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJob()
	 * @generated
	 * @ordered
	 */
	protected JobRemote job;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubmittedJobImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JobClientPackage.Literals.SUBMITTED_JOB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JobRemote getJob() {
		return job;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJob(JobRemote newJob, NotificationChain msgs) {
		JobRemote oldJob = job;
		job = newJob;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JobClientPackage.SUBMITTED_JOB__JOB, oldJob, newJob);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJob(JobRemote newJob) {
		if (newJob != job) {
			NotificationChain msgs = null;
			if (job != null)
				msgs = ((InternalEObject)job).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JobClientPackage.SUBMITTED_JOB__JOB, null, msgs);
			if (newJob != null)
				msgs = ((InternalEObject)newJob).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JobClientPackage.SUBMITTED_JOB__JOB, null, msgs);
			msgs = basicSetJob(newJob, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JobClientPackage.SUBMITTED_JOB__JOB, newJob, newJob));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JobEngineOld getJobEngine() {
		if (eContainerFeatureID() != JobClientPackage.SUBMITTED_JOB__JOB_ENGINE) return null;
		return (JobEngineOld)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJobEngine(JobEngineOld newJobEngine, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newJobEngine, JobClientPackage.SUBMITTED_JOB__JOB_ENGINE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJobEngine(JobEngineOld newJobEngine) {
		if (newJobEngine != eInternalContainer() || (eContainerFeatureID() != JobClientPackage.SUBMITTED_JOB__JOB_ENGINE && newJobEngine != null)) {
			if (EcoreUtil.isAncestor(this, newJobEngine))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newJobEngine != null)
				msgs = ((InternalEObject)newJobEngine).eInverseAdd(this, JobClientPackage.JOB_ENGINE_OLD__SUBMITTED_JOBS, JobEngineOld.class, msgs);
			msgs = basicSetJobEngine(newJobEngine, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JobClientPackage.SUBMITTED_JOB__JOB_ENGINE, newJobEngine, newJobEngine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JobClientPackage.SUBMITTED_JOB__JOB_ENGINE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetJobEngine((JobEngineOld)otherEnd, msgs);
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
			case JobClientPackage.SUBMITTED_JOB__JOB:
				return basicSetJob(null, msgs);
			case JobClientPackage.SUBMITTED_JOB__JOB_ENGINE:
				return basicSetJobEngine(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case JobClientPackage.SUBMITTED_JOB__JOB_ENGINE:
				return eInternalContainer().eInverseRemove(this, JobClientPackage.JOB_ENGINE_OLD__SUBMITTED_JOBS, JobEngineOld.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JobClientPackage.SUBMITTED_JOB__JOB:
				return getJob();
			case JobClientPackage.SUBMITTED_JOB__JOB_ENGINE:
				return getJobEngine();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case JobClientPackage.SUBMITTED_JOB__JOB:
				setJob((JobRemote)newValue);
				return;
			case JobClientPackage.SUBMITTED_JOB__JOB_ENGINE:
				setJobEngine((JobEngineOld)newValue);
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
			case JobClientPackage.SUBMITTED_JOB__JOB:
				setJob((JobRemote)null);
				return;
			case JobClientPackage.SUBMITTED_JOB__JOB_ENGINE:
				setJobEngine((JobEngineOld)null);
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
			case JobClientPackage.SUBMITTED_JOB__JOB:
				return job != null;
			case JobClientPackage.SUBMITTED_JOB__JOB_ENGINE:
				return getJobEngine() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * Specified by the {@link RunContext}
	 */
	@Override
	public boolean onProgress(Run run, ProgressFeedback progress) {
		boolean goOn = this.getJobEngine().onJobProgress(this, progress);
		return goOn;
	}

} //SubmittedJobImpl
