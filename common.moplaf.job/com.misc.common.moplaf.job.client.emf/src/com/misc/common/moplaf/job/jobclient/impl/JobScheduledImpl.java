/**
 */
package com.misc.common.moplaf.job.jobclient.impl;

import com.misc.common.moplaf.job.Job;

import com.misc.common.moplaf.job.jobclient.Engine;
import com.misc.common.moplaf.job.jobclient.JobScheduled;
import com.misc.common.moplaf.job.jobclient.JobclientPackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Job Scheduled</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.impl.JobScheduledImpl#getJob <em>Job</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.impl.JobScheduledImpl#getScheduledOn <em>Scheduled On</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JobScheduledImpl extends MinimalEObjectImpl.Container implements JobScheduled {
	/**
	 * The cached value of the '{@link #getJob() <em>Job</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJob()
	 * @generated
	 * @ordered
	 */
	protected Job job;

	/**
	 * The cached value of the '{@link #getScheduledOn() <em>Scheduled On</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduledOn()
	 * @generated
	 * @ordered
	 */
	protected Engine scheduledOn;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JobScheduledImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JobclientPackage.Literals.JOB_SCHEDULED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Job getJob() {
		return job;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJob(Job newJob, NotificationChain msgs) {
		Job oldJob = job;
		job = newJob;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JobclientPackage.JOB_SCHEDULED__JOB, oldJob, newJob);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJob(Job newJob) {
		if (newJob != job) {
			NotificationChain msgs = null;
			if (job != null)
				msgs = ((InternalEObject)job).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JobclientPackage.JOB_SCHEDULED__JOB, null, msgs);
			if (newJob != null)
				msgs = ((InternalEObject)newJob).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JobclientPackage.JOB_SCHEDULED__JOB, null, msgs);
			msgs = basicSetJob(newJob, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JobclientPackage.JOB_SCHEDULED__JOB, newJob, newJob));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Engine getScheduledOn() {
		if (scheduledOn != null && scheduledOn.eIsProxy()) {
			InternalEObject oldScheduledOn = (InternalEObject)scheduledOn;
			scheduledOn = (Engine)eResolveProxy(oldScheduledOn);
			if (scheduledOn != oldScheduledOn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JobclientPackage.JOB_SCHEDULED__SCHEDULED_ON, oldScheduledOn, scheduledOn));
			}
		}
		return scheduledOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Engine basicGetScheduledOn() {
		return scheduledOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScheduledOn(Engine newScheduledOn, NotificationChain msgs) {
		Engine oldScheduledOn = scheduledOn;
		scheduledOn = newScheduledOn;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JobclientPackage.JOB_SCHEDULED__SCHEDULED_ON, oldScheduledOn, newScheduledOn);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScheduledOn(Engine newScheduledOn) {
		if (newScheduledOn != scheduledOn) {
			NotificationChain msgs = null;
			if (scheduledOn != null)
				msgs = ((InternalEObject)scheduledOn).eInverseRemove(this, JobclientPackage.ENGINE__JOBSCHEDUELED, Engine.class, msgs);
			if (newScheduledOn != null)
				msgs = ((InternalEObject)newScheduledOn).eInverseAdd(this, JobclientPackage.ENGINE__JOBSCHEDUELED, Engine.class, msgs);
			msgs = basicSetScheduledOn(newScheduledOn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JobclientPackage.JOB_SCHEDULED__SCHEDULED_ON, newScheduledOn, newScheduledOn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void kill() {
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
			case JobclientPackage.JOB_SCHEDULED__SCHEDULED_ON:
				if (scheduledOn != null)
					msgs = ((InternalEObject)scheduledOn).eInverseRemove(this, JobclientPackage.ENGINE__JOBSCHEDUELED, Engine.class, msgs);
				return basicSetScheduledOn((Engine)otherEnd, msgs);
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
			case JobclientPackage.JOB_SCHEDULED__JOB:
				return basicSetJob(null, msgs);
			case JobclientPackage.JOB_SCHEDULED__SCHEDULED_ON:
				return basicSetScheduledOn(null, msgs);
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
			case JobclientPackage.JOB_SCHEDULED__JOB:
				return getJob();
			case JobclientPackage.JOB_SCHEDULED__SCHEDULED_ON:
				if (resolve) return getScheduledOn();
				return basicGetScheduledOn();
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
			case JobclientPackage.JOB_SCHEDULED__JOB:
				setJob((Job)newValue);
				return;
			case JobclientPackage.JOB_SCHEDULED__SCHEDULED_ON:
				setScheduledOn((Engine)newValue);
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
			case JobclientPackage.JOB_SCHEDULED__JOB:
				setJob((Job)null);
				return;
			case JobclientPackage.JOB_SCHEDULED__SCHEDULED_ON:
				setScheduledOn((Engine)null);
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
			case JobclientPackage.JOB_SCHEDULED__JOB:
				return job != null;
			case JobclientPackage.JOB_SCHEDULED__SCHEDULED_ON:
				return scheduledOn != null;
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
			case JobclientPackage.JOB_SCHEDULED___KILL:
				kill();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //JobScheduledImpl
