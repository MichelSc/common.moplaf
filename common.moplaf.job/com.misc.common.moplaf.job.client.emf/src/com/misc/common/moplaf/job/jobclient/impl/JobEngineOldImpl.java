/**
 */
package com.misc.common.moplaf.job.jobclient.impl;

import com.misc.common.moplaf.common.EnabledFeedback;

import com.misc.common.moplaf.job.ProgressFeedback;

import com.misc.common.moplaf.job.jobclient.JobClientPackage;
import com.misc.common.moplaf.job.jobclient.JobEngineOld;
import com.misc.common.moplaf.job.jobclient.SubmittedJob;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Job Engine Old</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.impl.JobEngineOldImpl#getSubmittedJobs <em>Submitted Jobs</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.impl.JobEngineOldImpl#isRunning <em>Running</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.impl.JobEngineOldImpl#getStartFeedback <em>Start Feedback</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.impl.JobEngineOldImpl#getStopFeedback <em>Stop Feedback</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.impl.JobEngineOldImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.impl.JobEngineOldImpl#getLabel <em>Label</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class JobEngineOldImpl extends MinimalEObjectImpl.Container implements JobEngineOld {
	/**
	 * The cached value of the '{@link #getSubmittedJobs() <em>Submitted Jobs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubmittedJobs()
	 * @generated
	 * @ordered
	 */
	protected EList<SubmittedJob> submittedJobs;

	/**
	 * The default value of the '{@link #isRunning() <em>Running</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRunning()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RUNNING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRunning() <em>Running</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRunning()
	 * @generated
	 * @ordered
	 */
	protected boolean running = RUNNING_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartFeedback() <em>Start Feedback</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartFeedback()
	 * @generated
	 * @ordered
	 */
	protected static final EnabledFeedback START_FEEDBACK_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getStopFeedback() <em>Stop Feedback</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStopFeedback()
	 * @generated
	 * @ordered
	 */
	protected static final EnabledFeedback STOP_FEEDBACK_EDEFAULT = null;

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
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JobEngineOldImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JobClientPackage.Literals.JOB_ENGINE_OLD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SubmittedJob> getSubmittedJobs() {
		if (submittedJobs == null) {
			submittedJobs = new EObjectContainmentWithInverseEList<SubmittedJob>(SubmittedJob.class, this, JobClientPackage.JOB_ENGINE_OLD__SUBMITTED_JOBS, JobClientPackage.SUBMITTED_JOB__JOB_ENGINE);
		}
		return submittedJobs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRunning() {
		return running;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRunning(boolean newRunning) {
		boolean oldRunning = running;
		running = newRunning;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JobClientPackage.JOB_ENGINE_OLD__RUNNING, oldRunning, running));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnabledFeedback getStartFeedback() {
		// TODO: implement this method to return the 'Start Feedback' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnabledFeedback getStopFeedback() {
		// TODO: implement this method to return the 'Stop Feedback' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
			eNotify(new ENotificationImpl(this, Notification.SET, JobClientPackage.JOB_ENGINE_OLD__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel() {
		// TODO: implement this method to return the 'Label' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void start() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void stop() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean onJobProgress(SubmittedJob job, ProgressFeedback progress) {
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
			case JobClientPackage.JOB_ENGINE_OLD__SUBMITTED_JOBS:
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
			case JobClientPackage.JOB_ENGINE_OLD__SUBMITTED_JOBS:
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
			case JobClientPackage.JOB_ENGINE_OLD__SUBMITTED_JOBS:
				return getSubmittedJobs();
			case JobClientPackage.JOB_ENGINE_OLD__RUNNING:
				return isRunning();
			case JobClientPackage.JOB_ENGINE_OLD__START_FEEDBACK:
				return getStartFeedback();
			case JobClientPackage.JOB_ENGINE_OLD__STOP_FEEDBACK:
				return getStopFeedback();
			case JobClientPackage.JOB_ENGINE_OLD__NAME:
				return getName();
			case JobClientPackage.JOB_ENGINE_OLD__LABEL:
				return getLabel();
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
			case JobClientPackage.JOB_ENGINE_OLD__SUBMITTED_JOBS:
				getSubmittedJobs().clear();
				getSubmittedJobs().addAll((Collection<? extends SubmittedJob>)newValue);
				return;
			case JobClientPackage.JOB_ENGINE_OLD__RUNNING:
				setRunning((Boolean)newValue);
				return;
			case JobClientPackage.JOB_ENGINE_OLD__NAME:
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
			case JobClientPackage.JOB_ENGINE_OLD__SUBMITTED_JOBS:
				getSubmittedJobs().clear();
				return;
			case JobClientPackage.JOB_ENGINE_OLD__RUNNING:
				setRunning(RUNNING_EDEFAULT);
				return;
			case JobClientPackage.JOB_ENGINE_OLD__NAME:
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
			case JobClientPackage.JOB_ENGINE_OLD__SUBMITTED_JOBS:
				return submittedJobs != null && !submittedJobs.isEmpty();
			case JobClientPackage.JOB_ENGINE_OLD__RUNNING:
				return running != RUNNING_EDEFAULT;
			case JobClientPackage.JOB_ENGINE_OLD__START_FEEDBACK:
				return START_FEEDBACK_EDEFAULT == null ? getStartFeedback() != null : !START_FEEDBACK_EDEFAULT.equals(getStartFeedback());
			case JobClientPackage.JOB_ENGINE_OLD__STOP_FEEDBACK:
				return STOP_FEEDBACK_EDEFAULT == null ? getStopFeedback() != null : !STOP_FEEDBACK_EDEFAULT.equals(getStopFeedback());
			case JobClientPackage.JOB_ENGINE_OLD__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case JobClientPackage.JOB_ENGINE_OLD__LABEL:
				return LABEL_EDEFAULT == null ? getLabel() != null : !LABEL_EDEFAULT.equals(getLabel());
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
			case JobClientPackage.JOB_ENGINE_OLD___START:
				start();
				return null;
			case JobClientPackage.JOB_ENGINE_OLD___STOP:
				stop();
				return null;
			case JobClientPackage.JOB_ENGINE_OLD___ON_JOB_PROGRESS__SUBMITTEDJOB_PROGRESSFEEDBACK:
				return onJobProgress((SubmittedJob)arguments.get(0), (ProgressFeedback)arguments.get(1));
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
		result.append(" (Running: ");
		result.append(running);
		result.append(", Name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //JobEngineOldImpl
