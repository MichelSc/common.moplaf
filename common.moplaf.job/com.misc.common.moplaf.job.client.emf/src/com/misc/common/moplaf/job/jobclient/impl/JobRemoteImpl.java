/**
 */
package com.misc.common.moplaf.job.jobclient.impl;

import com.misc.common.moplaf.common.ReturnFeedback;
import com.misc.common.moplaf.job.Plugin;
import com.misc.common.moplaf.job.ProgressFeedback;

import com.misc.common.moplaf.job.impl.JobImpl;
import com.misc.common.moplaf.job.jobclient.JobEngineProxy;
import com.misc.common.moplaf.job.jobclient.JobRemote;
import com.misc.common.moplaf.job.jobclient.JobRemoteResult;
import com.misc.common.moplaf.job.jobclient.JobclientPackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Job Remote</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.impl.JobRemoteImpl#getSubmissionID <em>Submission ID</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.impl.JobRemoteImpl#getHandlingEngine <em>Handling Engine</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.impl.JobRemoteImpl#getResult <em>Result</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JobRemoteImpl extends JobImpl implements JobRemote {
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
	 * The cached value of the '{@link #getHandlingEngine() <em>Handling Engine</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandlingEngine()
	 * @generated
	 * @ordered
	 */
	protected JobEngineProxy handlingEngine;

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
		return JobclientPackage.Literals.JOB_REMOTE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, JobclientPackage.JOB_REMOTE__SUBMISSION_ID, oldSubmissionID, submissionID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JobEngineProxy getHandlingEngine() {
		if (handlingEngine != null && handlingEngine.eIsProxy()) {
			InternalEObject oldHandlingEngine = (InternalEObject)handlingEngine;
			handlingEngine = (JobEngineProxy)eResolveProxy(oldHandlingEngine);
			if (handlingEngine != oldHandlingEngine) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JobclientPackage.JOB_REMOTE__HANDLING_ENGINE, oldHandlingEngine, handlingEngine));
			}
		}
		return handlingEngine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JobEngineProxy basicGetHandlingEngine() {
		return handlingEngine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHandlingEngine(JobEngineProxy newHandlingEngine, NotificationChain msgs) {
		JobEngineProxy oldHandlingEngine = handlingEngine;
		handlingEngine = newHandlingEngine;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JobclientPackage.JOB_REMOTE__HANDLING_ENGINE, oldHandlingEngine, newHandlingEngine);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHandlingEngine(JobEngineProxy newHandlingEngine) {
		if (newHandlingEngine != handlingEngine) {
			NotificationChain msgs = null;
			if (handlingEngine != null)
				msgs = ((InternalEObject)handlingEngine).eInverseRemove(this, JobclientPackage.JOB_ENGINE_PROXY__SUBMITTED_JOBS, JobEngineProxy.class, msgs);
			if (newHandlingEngine != null)
				msgs = ((InternalEObject)newHandlingEngine).eInverseAdd(this, JobclientPackage.JOB_ENGINE_PROXY__SUBMITTED_JOBS, JobEngineProxy.class, msgs);
			msgs = basicSetHandlingEngine(newHandlingEngine, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JobclientPackage.JOB_REMOTE__HANDLING_ENGINE, newHandlingEngine, newHandlingEngine));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JobclientPackage.JOB_REMOTE__RESULT, oldResult, newResult);
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
				msgs = ((InternalEObject)result).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JobclientPackage.JOB_REMOTE__RESULT, null, msgs);
			if (newResult != null)
				msgs = ((InternalEObject)newResult).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JobclientPackage.JOB_REMOTE__RESULT, null, msgs);
			msgs = basicSetResult(newResult, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JobclientPackage.JOB_REMOTE__RESULT, newResult, newResult));
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
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JobclientPackage.JOB_REMOTE__HANDLING_ENGINE:
				if (handlingEngine != null)
					msgs = ((InternalEObject)handlingEngine).eInverseRemove(this, JobclientPackage.JOB_ENGINE_PROXY__SUBMITTED_JOBS, JobEngineProxy.class, msgs);
				return basicSetHandlingEngine((JobEngineProxy)otherEnd, msgs);
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
			case JobclientPackage.JOB_REMOTE__HANDLING_ENGINE:
				return basicSetHandlingEngine(null, msgs);
			case JobclientPackage.JOB_REMOTE__RESULT:
				return basicSetResult(null, msgs);
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
			case JobclientPackage.JOB_REMOTE__SUBMISSION_ID:
				return getSubmissionID();
			case JobclientPackage.JOB_REMOTE__HANDLING_ENGINE:
				if (resolve) return getHandlingEngine();
				return basicGetHandlingEngine();
			case JobclientPackage.JOB_REMOTE__RESULT:
				return getResult();
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
			case JobclientPackage.JOB_REMOTE__SUBMISSION_ID:
				setSubmissionID((Integer)newValue);
				return;
			case JobclientPackage.JOB_REMOTE__HANDLING_ENGINE:
				setHandlingEngine((JobEngineProxy)newValue);
				return;
			case JobclientPackage.JOB_REMOTE__RESULT:
				setResult((JobRemoteResult)newValue);
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
			case JobclientPackage.JOB_REMOTE__SUBMISSION_ID:
				setSubmissionID(SUBMISSION_ID_EDEFAULT);
				return;
			case JobclientPackage.JOB_REMOTE__HANDLING_ENGINE:
				setHandlingEngine((JobEngineProxy)null);
				return;
			case JobclientPackage.JOB_REMOTE__RESULT:
				setResult((JobRemoteResult)null);
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
			case JobclientPackage.JOB_REMOTE__SUBMISSION_ID:
				return submissionID != SUBMISSION_ID_EDEFAULT;
			case JobclientPackage.JOB_REMOTE__HANDLING_ENGINE:
				return handlingEngine != null;
			case JobclientPackage.JOB_REMOTE__RESULT:
				return result != null;
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
			case JobclientPackage.JOB_REMOTE___ON_PROGRESS__PROGRESSFEEDBACK:
				onProgress((ProgressFeedback)arguments.get(0));
				return null;
			case JobclientPackage.JOB_REMOTE___ON_RETURN__RETURNFEEDBACK:
				onReturn((ReturnFeedback)arguments.get(0));
				return null;
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
		result.append(')');
		return result.toString();
	}

} //JobRemoteImpl
