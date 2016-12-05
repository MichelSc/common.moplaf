/**
 */
package com.misc.common.moplaf.job.jobclient.impl;

import com.misc.common.moplaf.common.ReturnFeedback;
import com.misc.common.moplaf.job.jobclient.JobEngineProxy;
import com.misc.common.moplaf.job.jobclient.JobRemote;
import com.misc.common.moplaf.job.jobclient.JobclientPackage;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Job Engine Proxy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.impl.JobEngineProxyImpl#getSubmittedJobs <em>Submitted Jobs</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.impl.JobEngineProxyImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class JobEngineProxyImpl extends MinimalEObjectImpl.Container implements JobEngineProxy {
	/**
	 * The cached value of the '{@link #getSubmittedJobs() <em>Submitted Jobs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubmittedJobs()
	 * @generated
	 * @ordered
	 */
	protected EList<JobRemote> submittedJobs;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JobEngineProxyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JobclientPackage.Literals.JOB_ENGINE_PROXY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JobRemote> getSubmittedJobs() {
		if (submittedJobs == null) {
			submittedJobs = new EObjectWithInverseResolvingEList<JobRemote>(JobRemote.class, this, JobclientPackage.JOB_ENGINE_PROXY__SUBMITTED_JOBS, JobclientPackage.JOB_REMOTE__HANDLING_ENGINE);
		}
		return submittedJobs;
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
			eNotify(new ENotificationImpl(this, Notification.SET, JobclientPackage.JOB_ENGINE_PROXY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public int submitJob(JobRemote job) {
		// create a new submission id
		int newId = 0;
		for ( JobRemote aJob : this.getSubmittedJobs()){
			if ( aJob.getSubmissionID()>newId){
				newId = aJob.getSubmissionID();
			}
		}
		newId++;
		// add the job
		this.getSubmittedJobs().add(job);

		// run the job
		ReturnFeedback runfeedback = this.runJobImpl(job);
		job.setReturn(runfeedback);

		// job is run
		job.onReturn(runfeedback);
		return newId;
	}


	/**
	 * Implement the call
	 * Return a ReturnFeedback
	 * Instantiate and attach a JobRemoteResult in case of success
	 * @param job
	 * @return
	 */
	protected ReturnFeedback runJobImpl(JobRemote job){
		return ReturnFeedback.FAILURE; // to be implemented by the concrete class
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JobRemote getJob(int submissionID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
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
			case JobclientPackage.JOB_ENGINE_PROXY__SUBMITTED_JOBS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubmittedJobs()).basicAdd(otherEnd, msgs);
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
			case JobclientPackage.JOB_ENGINE_PROXY__SUBMITTED_JOBS:
				return ((InternalEList<?>)getSubmittedJobs()).basicRemove(otherEnd, msgs);
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
			case JobclientPackage.JOB_ENGINE_PROXY__SUBMITTED_JOBS:
				return getSubmittedJobs();
			case JobclientPackage.JOB_ENGINE_PROXY__NAME:
				return getName();
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
			case JobclientPackage.JOB_ENGINE_PROXY__SUBMITTED_JOBS:
				getSubmittedJobs().clear();
				getSubmittedJobs().addAll((Collection<? extends JobRemote>)newValue);
				return;
			case JobclientPackage.JOB_ENGINE_PROXY__NAME:
				setName((String)newValue);
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
			case JobclientPackage.JOB_ENGINE_PROXY__SUBMITTED_JOBS:
				getSubmittedJobs().clear();
				return;
			case JobclientPackage.JOB_ENGINE_PROXY__NAME:
				setName(NAME_EDEFAULT);
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
			case JobclientPackage.JOB_ENGINE_PROXY__SUBMITTED_JOBS:
				return submittedJobs != null && !submittedJobs.isEmpty();
			case JobclientPackage.JOB_ENGINE_PROXY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
			case JobclientPackage.JOB_ENGINE_PROXY___SUBMIT_JOB__JOBREMOTE:
				return submitJob((JobRemote)arguments.get(0));
			case JobclientPackage.JOB_ENGINE_PROXY___GET_JOB__INT:
				return getJob((Integer)arguments.get(0));
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
		result.append(" (Name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //JobEngineProxyImpl
