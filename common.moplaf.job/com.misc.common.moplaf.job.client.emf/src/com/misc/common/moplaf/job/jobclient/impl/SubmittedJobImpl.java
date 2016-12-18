/**
 */
package com.misc.common.moplaf.job.jobclient.impl;

import com.misc.common.moplaf.job.jobclient.JobRemote;
import com.misc.common.moplaf.job.jobclient.JobclientPackage;
import com.misc.common.moplaf.job.jobclient.SubmittedJob;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Submitted Job</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.impl.SubmittedJobImpl#getJob <em>Job</em>}</li>
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
		return JobclientPackage.Literals.SUBMITTED_JOB;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JobclientPackage.SUBMITTED_JOB__JOB, oldJob, newJob);
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
				msgs = ((InternalEObject)job).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JobclientPackage.SUBMITTED_JOB__JOB, null, msgs);
			if (newJob != null)
				msgs = ((InternalEObject)newJob).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JobclientPackage.SUBMITTED_JOB__JOB, null, msgs);
			msgs = basicSetJob(newJob, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JobclientPackage.SUBMITTED_JOB__JOB, newJob, newJob));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JobclientPackage.SUBMITTED_JOB__JOB:
				return basicSetJob(null, msgs);
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
			case JobclientPackage.SUBMITTED_JOB__JOB:
				return getJob();
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
			case JobclientPackage.SUBMITTED_JOB__JOB:
				setJob((JobRemote)newValue);
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
			case JobclientPackage.SUBMITTED_JOB__JOB:
				setJob((JobRemote)null);
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
			case JobclientPackage.SUBMITTED_JOB__JOB:
				return job != null;
		}
		return super.eIsSet(featureID);
	}

} //SubmittedJobImpl
