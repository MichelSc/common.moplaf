/**
 */
package com.misc.common.moplaf.job.jobclient.impl;

import com.misc.common.moplaf.common.EnabledFeedback;
import com.misc.common.moplaf.job.Plugin;
import com.misc.common.moplaf.job.jobclient.JobClientPackage;
import com.misc.common.moplaf.job.jobclient.JobScheduler;
import com.misc.common.moplaf.job.jobclient.JobSchedulerService;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Job Scheduler Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.impl.JobSchedulerServiceImpl#getStartFeedback <em>Start Feedback</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.impl.JobSchedulerServiceImpl#getStopFeedback <em>Stop Feedback</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.impl.JobSchedulerServiceImpl#isAutoStartStop <em>Auto Start Stop</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.impl.JobSchedulerServiceImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.impl.JobSchedulerServiceImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.impl.JobSchedulerServiceImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.impl.JobSchedulerServiceImpl#isRunning <em>Running</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.impl.JobSchedulerServiceImpl#getScheduler <em>Scheduler</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JobSchedulerServiceImpl extends MinimalEObjectImpl.Container implements JobSchedulerService {
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
	protected JobSchedulerServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JobClientPackage.Literals.JOB_SCHEDULER_SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public EnabledFeedback getStartFeedback() {
		if ( this.isRunning()){
			return new EnabledFeedback(false, "JobSource started");
		}
		return EnabledFeedback.NOFEEDBACK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public EnabledFeedback getStopFeedback() {
		if ( !this.isRunning()){
			return new EnabledFeedback(false, "JobSource not yet started");
		}
		return EnabledFeedback.NOFEEDBACK;
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
			eNotify(new ENotificationImpl(this, Notification.SET, JobClientPackage.JOB_SCHEDULER_SERVICE__AUTO_START_STOP, oldAutoStartStop, autoStartStop));
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
			eNotify(new ENotificationImpl(this, Notification.SET, JobClientPackage.JOB_SCHEDULER_SERVICE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, JobClientPackage.JOB_SCHEDULER_SERVICE__RUNNING, oldRunning, running));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JobScheduler getScheduler() {
		JobScheduler scheduler = basicGetScheduler();
		return scheduler != null && scheduler.eIsProxy() ? (JobScheduler)eResolveProxy((InternalEObject)scheduler) : scheduler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public JobScheduler basicGetScheduler() {
		EObject container = this.eContainer();
		if ( container instanceof JobScheduler ) {
			return (JobScheduler)container;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void start() {
		Plugin.INSTANCE.logInfo(String.format("JobSchedulerService %s about to start", this.getName()));
		this.startImpl();
		this.setRunning(true);
		Plugin.INSTANCE.logInfo(String.format("JobSchedulerService %s started", this.getName()));
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
		Plugin.INSTANCE.logInfo(String.format("JobSchedulerService %s about to stop", this.getName()));
		this.stopImpl();
		this.setRunning(false);
		Plugin.INSTANCE.logInfo(String.format("JobSchedulerService %s stopped", this.getName()));
	}

	/**
	 * 
	 */
	protected void stopImpl() {
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JobClientPackage.JOB_SCHEDULER_SERVICE__START_FEEDBACK:
				return getStartFeedback();
			case JobClientPackage.JOB_SCHEDULER_SERVICE__STOP_FEEDBACK:
				return getStopFeedback();
			case JobClientPackage.JOB_SCHEDULER_SERVICE__AUTO_START_STOP:
				return isAutoStartStop();
			case JobClientPackage.JOB_SCHEDULER_SERVICE__NAME:
				return getName();
			case JobClientPackage.JOB_SCHEDULER_SERVICE__DESCRIPTION:
				return getDescription();
			case JobClientPackage.JOB_SCHEDULER_SERVICE__STATUS:
				return getStatus();
			case JobClientPackage.JOB_SCHEDULER_SERVICE__RUNNING:
				return isRunning();
			case JobClientPackage.JOB_SCHEDULER_SERVICE__SCHEDULER:
				if (resolve) return getScheduler();
				return basicGetScheduler();
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
			case JobClientPackage.JOB_SCHEDULER_SERVICE__AUTO_START_STOP:
				setAutoStartStop((Boolean)newValue);
				return;
			case JobClientPackage.JOB_SCHEDULER_SERVICE__NAME:
				setName((String)newValue);
				return;
			case JobClientPackage.JOB_SCHEDULER_SERVICE__RUNNING:
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
			case JobClientPackage.JOB_SCHEDULER_SERVICE__AUTO_START_STOP:
				setAutoStartStop(AUTO_START_STOP_EDEFAULT);
				return;
			case JobClientPackage.JOB_SCHEDULER_SERVICE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case JobClientPackage.JOB_SCHEDULER_SERVICE__RUNNING:
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
			case JobClientPackage.JOB_SCHEDULER_SERVICE__START_FEEDBACK:
				return START_FEEDBACK_EDEFAULT == null ? getStartFeedback() != null : !START_FEEDBACK_EDEFAULT.equals(getStartFeedback());
			case JobClientPackage.JOB_SCHEDULER_SERVICE__STOP_FEEDBACK:
				return STOP_FEEDBACK_EDEFAULT == null ? getStopFeedback() != null : !STOP_FEEDBACK_EDEFAULT.equals(getStopFeedback());
			case JobClientPackage.JOB_SCHEDULER_SERVICE__AUTO_START_STOP:
				return autoStartStop != AUTO_START_STOP_EDEFAULT;
			case JobClientPackage.JOB_SCHEDULER_SERVICE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case JobClientPackage.JOB_SCHEDULER_SERVICE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? getDescription() != null : !DESCRIPTION_EDEFAULT.equals(getDescription());
			case JobClientPackage.JOB_SCHEDULER_SERVICE__STATUS:
				return STATUS_EDEFAULT == null ? getStatus() != null : !STATUS_EDEFAULT.equals(getStatus());
			case JobClientPackage.JOB_SCHEDULER_SERVICE__RUNNING:
				return running != RUNNING_EDEFAULT;
			case JobClientPackage.JOB_SCHEDULER_SERVICE__SCHEDULER:
				return basicGetScheduler() != null;
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
			case JobClientPackage.JOB_SCHEDULER_SERVICE___START:
				start();
				return null;
			case JobClientPackage.JOB_SCHEDULER_SERVICE___STOP:
				stop();
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
		result.append(" (AutoStartStop: ");
		result.append(autoStartStop);
		result.append(", Name: ");
		result.append(name);
		result.append(", Running: ");
		result.append(running);
		result.append(')');
		return result.toString();
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return null;
	}

} //JobSchedulerServiceImpl
