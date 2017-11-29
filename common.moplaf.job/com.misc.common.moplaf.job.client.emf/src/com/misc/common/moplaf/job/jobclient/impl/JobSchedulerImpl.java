/**
 */
package com.misc.common.moplaf.job.jobclient.impl;

import com.misc.common.moplaf.common.EnabledFeedback;
import com.misc.common.moplaf.job.Plugin;
import com.misc.common.moplaf.job.Run;
import com.misc.common.moplaf.job.jobclient.JobClientFactory;
import com.misc.common.moplaf.job.jobclient.JobClientPackage;
import com.misc.common.moplaf.job.jobclient.JobEngine;
import com.misc.common.moplaf.job.jobclient.JobScheduled;
import com.misc.common.moplaf.job.jobclient.JobScheduler;
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
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Job Scheduler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.impl.JobSchedulerImpl#getJobs <em>Jobs</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.impl.JobSchedulerImpl#getEngines <em>Engines</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.impl.JobSchedulerImpl#getStartFeedback <em>Start Feedback</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.impl.JobSchedulerImpl#getStopFeedback <em>Stop Feedback</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.impl.JobSchedulerImpl#isRunning <em>Running</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.impl.JobSchedulerImpl#getRefreshFeedback <em>Refresh Feedback</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.impl.JobSchedulerImpl#getRefreshRate <em>Refresh Rate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JobSchedulerImpl extends MinimalEObjectImpl.Container implements JobScheduler {
	/**
	 * The cached value of the '{@link #getJobs() <em>Jobs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobs()
	 * @generated
	 * @ordered
	 */
	protected EList<JobScheduled> jobs;

	/**
	 * The cached value of the '{@link #getEngines() <em>Engines</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEngines()
	 * @generated
	 * @ordered
	 */
	protected EList<JobEngine> engines;

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
	 * The default value of the '{@link #getRefreshFeedback() <em>Refresh Feedback</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefreshFeedback()
	 * @generated
	 * @ordered
	 */
	protected static final EnabledFeedback REFRESH_FEEDBACK_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getRefreshRate() <em>Refresh Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefreshRate()
	 * @ordered
	 */
	protected static final float REFRESH_RATE_EDEFAULT = 1.0F;

	/**
	 * The cached value of the '{@link #getRefreshRate() <em>Refresh Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefreshRate()
	 * @generated
	 * @ordered
	 */
	protected float refreshRate = REFRESH_RATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JobSchedulerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JobClientPackage.Literals.JOB_SCHEDULER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JobScheduled> getJobs() {
		if (jobs == null) {
			jobs = new EObjectContainmentEList<JobScheduled>(JobScheduled.class, this, JobClientPackage.JOB_SCHEDULER__JOBS);
		}
		return jobs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JobEngine> getEngines() {
		if (engines == null) {
			engines = new EObjectContainmentWithInverseEList<JobEngine>(JobEngine.class, this, JobClientPackage.JOB_SCHEDULER__ENGINES, JobClientPackage.JOB_ENGINE__SCHEDULER);
		}
		return engines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public JobScheduled getJobToProcess() {
		JobScheduled job = this.getJobs().stream().filter(j->j.isReadyToRun()).findAny().orElse(null);
		return job;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public EnabledFeedback getStartFeedback() {
		if ( this.isRunning()){
			return new EnabledFeedback(false, "JobScheduler started");
		}
		return EnabledFeedback.NOFEEDBACK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public EnabledFeedback getStopFeedback() {
		if ( !this.isRunning()){
			return new EnabledFeedback(false, "JobScheduler not yet started");
		}
		return EnabledFeedback.NOFEEDBACK;
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
			eNotify(new ENotificationImpl(this, Notification.SET, JobClientPackage.JOB_SCHEDULER__RUNNING, oldRunning, running));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public EnabledFeedback getRefreshFeedback() {
		if ( !this.isRunning()){
			return new EnabledFeedback(false, "JobScheduler must be started");
		}
		return EnabledFeedback.NOFEEDBACK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getRefreshRate() {
		return refreshRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefreshRate(float newRefreshRate) {
		float oldRefreshRate = refreshRate;
		refreshRate = newRefreshRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JobClientPackage.JOB_SCHEDULER__REFRESH_RATE, oldRefreshRate, refreshRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void start() {
		this.setRunning(true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void stop() {
		this.setRunning(false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void refresh() {
		Plugin.INSTANCE.logInfo("JobScheduler.refresh");
		boolean finished = false;
		while ( !finished) {
			JobScheduled job = this.getJobToProcess();
			if ( job == null ) {
				finished = true;
				Plugin.INSTANCE.logInfo("JobScheduler.refresh: no job to schedule");
			} else {
				JobEngine engine = this.getEngines()
						.stream()
						.filter(e->e.getExecuteEnabledFeedback().isEnabled())
						.findAny()
						.orElse(null);
				if ( engine == null) {
					finished = true;
					Plugin.INSTANCE.logInfo("JobScheduler.refresh: no engine to schedule on");
				} else {
					Plugin.INSTANCE.logInfo("JobScheduler.refresh: execute Job");
					engine.executeJob(job);
				}
			}
		} 
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void submitRun(Run run) {
		JobScheduled job = JobClientFactory.eINSTANCE.createJobScheduled();
		this.getJobs().add(job);
		job.setRun(run);
		job.setSubmissionTime(new Date());
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
			case JobClientPackage.JOB_SCHEDULER__ENGINES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEngines()).basicAdd(otherEnd, msgs);
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
			case JobClientPackage.JOB_SCHEDULER__JOBS:
				return ((InternalEList<?>)getJobs()).basicRemove(otherEnd, msgs);
			case JobClientPackage.JOB_SCHEDULER__ENGINES:
				return ((InternalEList<?>)getEngines()).basicRemove(otherEnd, msgs);
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
			case JobClientPackage.JOB_SCHEDULER__JOBS:
				return getJobs();
			case JobClientPackage.JOB_SCHEDULER__ENGINES:
				return getEngines();
			case JobClientPackage.JOB_SCHEDULER__START_FEEDBACK:
				return getStartFeedback();
			case JobClientPackage.JOB_SCHEDULER__STOP_FEEDBACK:
				return getStopFeedback();
			case JobClientPackage.JOB_SCHEDULER__RUNNING:
				return isRunning();
			case JobClientPackage.JOB_SCHEDULER__REFRESH_FEEDBACK:
				return getRefreshFeedback();
			case JobClientPackage.JOB_SCHEDULER__REFRESH_RATE:
				return getRefreshRate();
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
			case JobClientPackage.JOB_SCHEDULER__JOBS:
				getJobs().clear();
				getJobs().addAll((Collection<? extends JobScheduled>)newValue);
				return;
			case JobClientPackage.JOB_SCHEDULER__ENGINES:
				getEngines().clear();
				getEngines().addAll((Collection<? extends JobEngine>)newValue);
				return;
			case JobClientPackage.JOB_SCHEDULER__RUNNING:
				setRunning((Boolean)newValue);
				return;
			case JobClientPackage.JOB_SCHEDULER__REFRESH_RATE:
				setRefreshRate((Float)newValue);
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
			case JobClientPackage.JOB_SCHEDULER__JOBS:
				getJobs().clear();
				return;
			case JobClientPackage.JOB_SCHEDULER__ENGINES:
				getEngines().clear();
				return;
			case JobClientPackage.JOB_SCHEDULER__RUNNING:
				setRunning(RUNNING_EDEFAULT);
				return;
			case JobClientPackage.JOB_SCHEDULER__REFRESH_RATE:
				setRefreshRate(REFRESH_RATE_EDEFAULT);
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
			case JobClientPackage.JOB_SCHEDULER__JOBS:
				return jobs != null && !jobs.isEmpty();
			case JobClientPackage.JOB_SCHEDULER__ENGINES:
				return engines != null && !engines.isEmpty();
			case JobClientPackage.JOB_SCHEDULER__START_FEEDBACK:
				return START_FEEDBACK_EDEFAULT == null ? getStartFeedback() != null : !START_FEEDBACK_EDEFAULT.equals(getStartFeedback());
			case JobClientPackage.JOB_SCHEDULER__STOP_FEEDBACK:
				return STOP_FEEDBACK_EDEFAULT == null ? getStopFeedback() != null : !STOP_FEEDBACK_EDEFAULT.equals(getStopFeedback());
			case JobClientPackage.JOB_SCHEDULER__RUNNING:
				return running != RUNNING_EDEFAULT;
			case JobClientPackage.JOB_SCHEDULER__REFRESH_FEEDBACK:
				return REFRESH_FEEDBACK_EDEFAULT == null ? getRefreshFeedback() != null : !REFRESH_FEEDBACK_EDEFAULT.equals(getRefreshFeedback());
			case JobClientPackage.JOB_SCHEDULER__REFRESH_RATE:
				return refreshRate != REFRESH_RATE_EDEFAULT;
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
			case JobClientPackage.JOB_SCHEDULER___START:
				start();
				return null;
			case JobClientPackage.JOB_SCHEDULER___STOP:
				stop();
				return null;
			case JobClientPackage.JOB_SCHEDULER___REFRESH:
				refresh();
				return null;
			case JobClientPackage.JOB_SCHEDULER___SUBMIT_RUN__RUN:
				submitRun((Run)arguments.get(0));
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
		result.append(" (Running: ");
		result.append(running);
		result.append(", RefreshRate: ");
		result.append(refreshRate);
		result.append(')');
		return result.toString();
	}

} //JobSchedulerImpl
