/**
 */
package com.misc.common.moplaf.job.jobclient.impl;

import com.misc.common.moplaf.common.EnabledFeedback;
import com.misc.common.moplaf.common.ReturnFeedback;
import com.misc.common.moplaf.job.Plugin;
import com.misc.common.moplaf.job.jobclient.JobClientPackage;
import com.misc.common.moplaf.job.jobclient.JobScheduled;
import com.misc.common.moplaf.job.jobclient.JobScheduler;
import com.misc.common.moplaf.job.jobclient.JobSource;

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
import org.eclipse.emf.ecore.util.EcoreUtil;
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
 *   <li>{@link com.misc.common.moplaf.job.jobclient.impl.JobSourceImpl#getScheduler <em>Scheduler</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.impl.JobSourceImpl#getStartFeedback <em>Start Feedback</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.impl.JobSourceImpl#getStopFeedback <em>Stop Feedback</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.impl.JobSourceImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.impl.JobSourceImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.impl.JobSourceImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.impl.JobSourceImpl#isAutoStartStop <em>Auto Start Stop</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.impl.JobSourceImpl#isRunning <em>Running</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class JobSourceImpl extends MinimalEObjectImpl.Container implements JobSource {
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
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final String STATUS_EDEFAULT = null;

	/**
	 * The default value of the '{@link #isAutoStartStop() <em>Auto Start Stop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAutoStartStop()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AUTO_START_STOP_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isAutoStartStop() <em>Auto Start Stop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAutoStartStop()
	 * @generated
	 * @ordered
	 */
	protected boolean autoStartStop = AUTO_START_STOP_EDEFAULT;
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
	 * @generated
	 */
	public JobScheduler getScheduler() {
		if (eContainerFeatureID() != JobClientPackage.JOB_SOURCE__SCHEDULER) return null;
		return (JobScheduler)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScheduler(JobScheduler newScheduler, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newScheduler, JobClientPackage.JOB_SOURCE__SCHEDULER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScheduler(JobScheduler newScheduler) {
		if (newScheduler != eInternalContainer() || (eContainerFeatureID() != JobClientPackage.JOB_SOURCE__SCHEDULER && newScheduler != null)) {
			if (EcoreUtil.isAncestor(this, newScheduler))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newScheduler != null)
				msgs = ((InternalEObject)newScheduler).eInverseAdd(this, JobClientPackage.JOB_SCHEDULER__SOURCES, JobScheduler.class, msgs);
			msgs = basicSetScheduler(newScheduler, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JobClientPackage.JOB_SOURCE__SCHEDULER, newScheduler, newScheduler));
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
			eNotify(new ENotificationImpl(this, Notification.SET, JobClientPackage.JOB_SOURCE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public String getDescription() {
		String description = String.format("Source %s %s", this.getName(), this.getStatus());

		int submitted = this.getJobsScheduled().size();
		if ( submitted>0 )   { description += String.format(", submitted=%d", submitted); }

		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public String getStatus() {
		String status = this.isRunning() ? "Running" : "Stopped";
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAutoStartStop() {
		return autoStartStop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutoStartStop(boolean newAutoStartStop) {
		boolean oldAutoStartStop = autoStartStop;
		autoStartStop = newAutoStartStop;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JobClientPackage.JOB_SOURCE__AUTO_START_STOP, oldAutoStartStop, autoStartStop));
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
			eNotify(new ENotificationImpl(this, Notification.SET, JobClientPackage.JOB_SOURCE__RUNNING, oldRunning, running));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void start() {
		Plugin.INSTANCE.logInfo(String.format("JobSource %s about to start", this.getName()));
		this.startImpl();
		Plugin.INSTANCE.logInfo(String.format("JobSource %s about started", this.getName()));
	}
	
	/**
	 * 
	 */
	protected void startImpl() {
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void stop() {
		Plugin.INSTANCE.logInfo(String.format("JobSource %s about to stop", this.getName()));
		this.stopImpl();
		Plugin.INSTANCE.logInfo(String.format("JobSource %s about stopped", this.getName()));
	}

	/**
	 * 
	 */
	protected void stopImpl() {
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
			case JobClientPackage.JOB_SOURCE__SCHEDULER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetScheduler((JobScheduler)otherEnd, msgs);
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
			case JobClientPackage.JOB_SOURCE__SCHEDULER:
				return basicSetScheduler(null, msgs);
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
			case JobClientPackage.JOB_SOURCE__SCHEDULER:
				return eInternalContainer().eInverseRemove(this, JobClientPackage.JOB_SCHEDULER__SOURCES, JobScheduler.class, msgs);
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
			case JobClientPackage.JOB_SOURCE__JOBS_SCHEDULED:
				return getJobsScheduled();
			case JobClientPackage.JOB_SOURCE__SCHEDULER:
				return getScheduler();
			case JobClientPackage.JOB_SOURCE__START_FEEDBACK:
				return getStartFeedback();
			case JobClientPackage.JOB_SOURCE__STOP_FEEDBACK:
				return getStopFeedback();
			case JobClientPackage.JOB_SOURCE__NAME:
				return getName();
			case JobClientPackage.JOB_SOURCE__DESCRIPTION:
				return getDescription();
			case JobClientPackage.JOB_SOURCE__STATUS:
				return getStatus();
			case JobClientPackage.JOB_SOURCE__AUTO_START_STOP:
				return isAutoStartStop();
			case JobClientPackage.JOB_SOURCE__RUNNING:
				return isRunning();
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
			case JobClientPackage.JOB_SOURCE__SCHEDULER:
				setScheduler((JobScheduler)newValue);
				return;
			case JobClientPackage.JOB_SOURCE__NAME:
				setName((String)newValue);
				return;
			case JobClientPackage.JOB_SOURCE__AUTO_START_STOP:
				setAutoStartStop((Boolean)newValue);
				return;
			case JobClientPackage.JOB_SOURCE__RUNNING:
				setRunning((Boolean)newValue);
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
			case JobClientPackage.JOB_SOURCE__SCHEDULER:
				setScheduler((JobScheduler)null);
				return;
			case JobClientPackage.JOB_SOURCE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case JobClientPackage.JOB_SOURCE__AUTO_START_STOP:
				setAutoStartStop(AUTO_START_STOP_EDEFAULT);
				return;
			case JobClientPackage.JOB_SOURCE__RUNNING:
				setRunning(RUNNING_EDEFAULT);
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
			case JobClientPackage.JOB_SOURCE__SCHEDULER:
				return getScheduler() != null;
			case JobClientPackage.JOB_SOURCE__START_FEEDBACK:
				return START_FEEDBACK_EDEFAULT == null ? getStartFeedback() != null : !START_FEEDBACK_EDEFAULT.equals(getStartFeedback());
			case JobClientPackage.JOB_SOURCE__STOP_FEEDBACK:
				return STOP_FEEDBACK_EDEFAULT == null ? getStopFeedback() != null : !STOP_FEEDBACK_EDEFAULT.equals(getStopFeedback());
			case JobClientPackage.JOB_SOURCE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case JobClientPackage.JOB_SOURCE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? getDescription() != null : !DESCRIPTION_EDEFAULT.equals(getDescription());
			case JobClientPackage.JOB_SOURCE__STATUS:
				return STATUS_EDEFAULT == null ? getStatus() != null : !STATUS_EDEFAULT.equals(getStatus());
			case JobClientPackage.JOB_SOURCE__AUTO_START_STOP:
				return autoStartStop != AUTO_START_STOP_EDEFAULT;
			case JobClientPackage.JOB_SOURCE__RUNNING:
				return running != RUNNING_EDEFAULT;
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
			case JobClientPackage.JOB_SOURCE___START:
				start();
				return null;
			case JobClientPackage.JOB_SOURCE___STOP:
				stop();
				return null;
			case JobClientPackage.JOB_SOURCE___REFRESH:
				refresh();
				return null;
			case JobClientPackage.JOB_SOURCE___ON_JOB_RUNNING__JOBSCHEDULED:
				onJobRunning((JobScheduled)arguments.get(0));
				return null;
			case JobClientPackage.JOB_SOURCE___ON_JOB_RETURNED__JOBSCHEDULED_RETURNFEEDBACK:
				onJobReturned((JobScheduled)arguments.get(0), (ReturnFeedback)arguments.get(1));
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
		result.append(" (Name: ");
		result.append(name);
		result.append(", AutoStartStop: ");
		result.append(autoStartStop);
		result.append(", Running: ");
		result.append(running);
		result.append(')');
		return result.toString();
	}

} //JobSourceImpl
