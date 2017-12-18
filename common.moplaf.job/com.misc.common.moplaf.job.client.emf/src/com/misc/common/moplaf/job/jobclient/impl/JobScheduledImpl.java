/**
 */
package com.misc.common.moplaf.job.jobclient.impl;

import com.misc.common.moplaf.common.EnabledFeedback;
import com.misc.common.moplaf.common.ReturnFeedback;
import com.misc.common.moplaf.job.Plugin;
import com.misc.common.moplaf.job.Run;
import com.misc.common.moplaf.job.jobclient.JobClientPackage;
import com.misc.common.moplaf.job.jobclient.JobEngine;
import com.misc.common.moplaf.job.jobclient.JobScheduled;
import com.misc.common.moplaf.job.jobclient.JobScheduler;
import com.misc.common.moplaf.job.jobclient.JobSource;
import com.misc.common.moplaf.job.jobclient.JobStatus;
import java.lang.reflect.InvocationTargetException;

import java.util.Date;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Job Scheduled</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.impl.JobScheduledImpl#getRun <em>Run</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.impl.JobScheduledImpl#getScheduledOn <em>Scheduled On</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.impl.JobScheduledImpl#isNotReadyToRun <em>Not Ready To Run</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.impl.JobScheduledImpl#isReadyToRun <em>Ready To Run</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.impl.JobScheduledImpl#isRunning <em>Running</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.impl.JobScheduledImpl#isReturned <em>Returned</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.impl.JobScheduledImpl#isCancelled <em>Cancelled</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.impl.JobScheduledImpl#isFailed <em>Failed</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.impl.JobScheduledImpl#getFeedback <em>Feedback</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.impl.JobScheduledImpl#getSubmissionTime <em>Submission Time</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.impl.JobScheduledImpl#getStartTime <em>Start Time</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.impl.JobScheduledImpl#getEndTime <em>End Time</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.impl.JobScheduledImpl#getCancelTime <em>Cancel Time</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.impl.JobScheduledImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.impl.JobScheduledImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.impl.JobScheduledImpl#getCancelEnabledFeedback <em>Cancel Enabled Feedback</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.impl.JobScheduledImpl#getScheduler <em>Scheduler</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.impl.JobScheduledImpl#getJobNr <em>Job Nr</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.impl.JobScheduledImpl#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JobScheduledImpl extends MinimalEObjectImpl.Container implements JobScheduled {
	/**
	 * The cached value of the '{@link #getRun() <em>Run</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRun()
	 * @generated
	 * @ordered
	 */
	protected Run run;

	/**
	 * The cached value of the '{@link #getScheduledOn() <em>Scheduled On</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduledOn()
	 * @generated
	 * @ordered
	 */
	protected JobEngine scheduledOn;

	/**
	 * The default value of the '{@link #isNotReadyToRun() <em>Not Ready To Run</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNotReadyToRun()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NOT_READY_TO_RUN_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isReadyToRun() <em>Ready To Run</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReadyToRun()
	 * @generated
	 * @ordered
	 */
	protected static final boolean READY_TO_RUN_EDEFAULT = false;

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
	 * The default value of the '{@link #isReturned() <em>Returned</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReturned()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RETURNED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isReturned() <em>Returned</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReturned()
	 * @generated
	 * @ordered
	 */
	protected boolean returned = RETURNED_EDEFAULT;

	/**
	 * The default value of the '{@link #isCancelled() <em>Cancelled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCancelled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CANCELLED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCancelled() <em>Cancelled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCancelled()
	 * @generated
	 * @ordered
	 */
	protected boolean cancelled = CANCELLED_EDEFAULT;

	/**
	 * The default value of the '{@link #isFailed() <em>Failed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFailed()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FAILED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFailed() <em>Failed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFailed()
	 * @generated
	 * @ordered
	 */
	protected boolean failed = FAILED_EDEFAULT;

	/**
	 * The default value of the '{@link #getFeedback() <em>Feedback</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeedback()
	 * @generated
	 * @ordered
	 */
	protected static final String FEEDBACK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFeedback() <em>Feedback</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeedback()
	 * @generated
	 * @ordered
	 */
	protected String feedback = FEEDBACK_EDEFAULT;

	/**
	 * The default value of the '{@link #getSubmissionTime() <em>Submission Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubmissionTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date SUBMISSION_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubmissionTime() <em>Submission Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubmissionTime()
	 * @generated
	 * @ordered
	 */
	protected Date submissionTime = SUBMISSION_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartTime() <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date START_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartTime() <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartTime()
	 * @generated
	 * @ordered
	 */
	protected Date startTime = START_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndTime() <em>End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date END_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndTime() <em>End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndTime()
	 * @generated
	 * @ordered
	 */
	protected Date endTime = END_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCancelTime() <em>Cancel Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCancelTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date CANCEL_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCancelTime() <em>Cancel Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCancelTime()
	 * @generated
	 * @ordered
	 */
	protected Date cancelTime = CANCEL_TIME_EDEFAULT;

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
	protected static final JobStatus STATUS_EDEFAULT = JobStatus.UNKNOWN;

	/**
	 * The default value of the '{@link #getCancelEnabledFeedback() <em>Cancel Enabled Feedback</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCancelEnabledFeedback()
	 * @generated
	 * @ordered
	 */
	protected static final EnabledFeedback CANCEL_ENABLED_FEEDBACK_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getJobNr() <em>Job Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobNr()
	 * @generated
	 * @ordered
	 */
	protected static final int JOB_NR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getJobNr() <em>Job Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobNr()
	 * @generated
	 * @ordered
	 */
	protected int jobNr = JOB_NR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected JobSource source;

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
		return JobClientPackage.Literals.JOB_SCHEDULED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Run getRun() {
		if (run != null && run.eIsProxy()) {
			InternalEObject oldRun = (InternalEObject)run;
			run = (Run)eResolveProxy(oldRun);
			if (run != oldRun) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JobClientPackage.JOB_SCHEDULED__RUN, oldRun, run));
			}
		}
		return run;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Run basicGetRun() {
		return run;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRun(Run newRun) {
		Run oldRun = run;
		run = newRun;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JobClientPackage.JOB_SCHEDULED__RUN, oldRun, run));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JobEngine getScheduledOn() {
		if (scheduledOn != null && scheduledOn.eIsProxy()) {
			InternalEObject oldScheduledOn = (InternalEObject)scheduledOn;
			scheduledOn = (JobEngine)eResolveProxy(oldScheduledOn);
			if (scheduledOn != oldScheduledOn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JobClientPackage.JOB_SCHEDULED__SCHEDULED_ON, oldScheduledOn, scheduledOn));
			}
		}
		return scheduledOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JobEngine basicGetScheduledOn() {
		return scheduledOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScheduledOn(JobEngine newScheduledOn, NotificationChain msgs) {
		JobEngine oldScheduledOn = scheduledOn;
		scheduledOn = newScheduledOn;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JobClientPackage.JOB_SCHEDULED__SCHEDULED_ON, oldScheduledOn, newScheduledOn);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScheduledOn(JobEngine newScheduledOn) {
		if (newScheduledOn != scheduledOn) {
			NotificationChain msgs = null;
			if (scheduledOn != null)
				msgs = ((InternalEObject)scheduledOn).eInverseRemove(this, JobClientPackage.JOB_ENGINE__JOB_SCHEDULED, JobEngine.class, msgs);
			if (newScheduledOn != null)
				msgs = ((InternalEObject)newScheduledOn).eInverseAdd(this, JobClientPackage.JOB_ENGINE__JOB_SCHEDULED, JobEngine.class, msgs);
			msgs = basicSetScheduledOn(newScheduledOn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JobClientPackage.JOB_SCHEDULED__SCHEDULED_ON, newScheduledOn, newScheduledOn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public boolean isNotReadyToRun() {
		Run run = this.getRun();
		if ( run==null) {
			return true;
		}
		if ( !run.getRunFeedback().isEnabled() ) {
			return true;
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public boolean isReadyToRun() {
		if ( this.isNotReadyToRun()) {
			// not ready
			return false;
		} else if ( this.basicGetScheduledOn()!=null) {
			// scheduled
			return false;
		} else if ( this.isRunning() ) {
			// running
			return false;
		} else if ( this.isReturned()) {
			return false;
		} 
		return true;
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
			eNotify(new ENotificationImpl(this, Notification.SET, JobClientPackage.JOB_SCHEDULED__RUNNING, oldRunning, running));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isReturned() {
		return returned;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturned(boolean newReturned) {
		boolean oldReturned = returned;
		returned = newReturned;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JobClientPackage.JOB_SCHEDULED__RETURNED, oldReturned, returned));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCancelled() {
		return cancelled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCancelled(boolean newCancelled) {
		boolean oldCancelled = cancelled;
		cancelled = newCancelled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JobClientPackage.JOB_SCHEDULED__CANCELLED, oldCancelled, cancelled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFailed() {
		return failed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFailed(boolean newFailed) {
		boolean oldFailed = failed;
		failed = newFailed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JobClientPackage.JOB_SCHEDULED__FAILED, oldFailed, failed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFeedback() {
		return feedback;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeedback(String newFeedback) {
		String oldFeedback = feedback;
		feedback = newFeedback;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JobClientPackage.JOB_SCHEDULED__FEEDBACK, oldFeedback, feedback));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getSubmissionTime() {
		return submissionTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubmissionTime(Date newSubmissionTime) {
		Date oldSubmissionTime = submissionTime;
		submissionTime = newSubmissionTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JobClientPackage.JOB_SCHEDULED__SUBMISSION_TIME, oldSubmissionTime, submissionTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getStartTime() {
		return startTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartTime(Date newStartTime) {
		Date oldStartTime = startTime;
		startTime = newStartTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JobClientPackage.JOB_SCHEDULED__START_TIME, oldStartTime, startTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getEndTime() {
		return endTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndTime(Date newEndTime) {
		Date oldEndTime = endTime;
		endTime = newEndTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JobClientPackage.JOB_SCHEDULED__END_TIME, oldEndTime, endTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public String getDescription() {
		String description = String.format("%s (%s)", this.getRun().getLabel(), this.getStatus());
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public JobStatus getStatus() {
		if ( this.isFailed()) {
			return JobStatus.FAILLED;
		} else  if ( this.isReturned() ) {
			return JobStatus.COMPLETE;
		} else if ( this.isRunning() ) {
			return JobStatus.RUNNING;
		} else if ( this.isReadyToRun()) {
			return JobStatus.WAITING;
		} else if ( this.isNotReadyToRun() ) {
			return JobStatus.NOT_READY;
		} else {
			return JobStatus.UNKNOWN;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getCancelTime() {
		return cancelTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCancelTime(Date newCancelTime) {
		Date oldCancelTime = cancelTime;
		cancelTime = newCancelTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JobClientPackage.JOB_SCHEDULED__CANCEL_TIME, oldCancelTime, cancelTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public EnabledFeedback getCancelEnabledFeedback() {
		if ( !this.isRunning() ) {
			return new EnabledFeedback(false, "Job is not running");
		}
		return EnabledFeedback.NOFEEDBACK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JobScheduler getScheduler() {
		if (eContainerFeatureID() != JobClientPackage.JOB_SCHEDULED__SCHEDULER) return null;
		return (JobScheduler)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScheduler(JobScheduler newScheduler, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newScheduler, JobClientPackage.JOB_SCHEDULED__SCHEDULER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScheduler(JobScheduler newScheduler) {
		if (newScheduler != eInternalContainer() || (eContainerFeatureID() != JobClientPackage.JOB_SCHEDULED__SCHEDULER && newScheduler != null)) {
			if (EcoreUtil.isAncestor(this, newScheduler))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newScheduler != null)
				msgs = ((InternalEObject)newScheduler).eInverseAdd(this, JobClientPackage.JOB_SCHEDULER__JOBS, JobScheduler.class, msgs);
			msgs = basicSetScheduler(newScheduler, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JobClientPackage.JOB_SCHEDULED__SCHEDULER, newScheduler, newScheduler));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getJobNr() {
		return jobNr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJobNr(int newJobNr) {
		int oldJobNr = jobNr;
		jobNr = newJobNr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JobClientPackage.JOB_SCHEDULED__JOB_NR, oldJobNr, jobNr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JobSource getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (JobSource)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JobClientPackage.JOB_SCHEDULED__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JobSource basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(JobSource newSource, NotificationChain msgs) {
		JobSource oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JobClientPackage.JOB_SCHEDULED__SOURCE, oldSource, newSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(JobSource newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject)source).eInverseRemove(this, JobClientPackage.JOB_SOURCE__JOB_SCHEDULED, JobSource.class, msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, JobClientPackage.JOB_SOURCE__JOB_SCHEDULED, JobSource.class, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JobClientPackage.JOB_SCHEDULED__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void cancel() {
		Plugin.INSTANCE.logInfo("JobScheduled cancelled");
		this.setCancelled(true);
		this.getRun().cancel();
		this.setCancelTime(new Date());
		this.getScheduler().setLastFeedback();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void setRunning() {
		this.setRunning(true);
		this.setStartTime(new Date());
		this.getScheduler().setLastFeedback();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void setReturn(ReturnFeedback feedback) {
		this.setRunning(false);
		this.setReturned(true);
		this.setFailed(feedback.isFailure());
		this.setEndTime(new Date());
		this.getScheduler().setLastFeedback();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JobClientPackage.JOB_SCHEDULED__SCHEDULED_ON:
				if (scheduledOn != null)
					msgs = ((InternalEObject)scheduledOn).eInverseRemove(this, JobClientPackage.JOB_ENGINE__JOB_SCHEDULED, JobEngine.class, msgs);
				return basicSetScheduledOn((JobEngine)otherEnd, msgs);
			case JobClientPackage.JOB_SCHEDULED__SCHEDULER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetScheduler((JobScheduler)otherEnd, msgs);
			case JobClientPackage.JOB_SCHEDULED__SOURCE:
				if (source != null)
					msgs = ((InternalEObject)source).eInverseRemove(this, JobClientPackage.JOB_SOURCE__JOB_SCHEDULED, JobSource.class, msgs);
				return basicSetSource((JobSource)otherEnd, msgs);
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
			case JobClientPackage.JOB_SCHEDULED__SCHEDULED_ON:
				return basicSetScheduledOn(null, msgs);
			case JobClientPackage.JOB_SCHEDULED__SCHEDULER:
				return basicSetScheduler(null, msgs);
			case JobClientPackage.JOB_SCHEDULED__SOURCE:
				return basicSetSource(null, msgs);
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
			case JobClientPackage.JOB_SCHEDULED__SCHEDULER:
				return eInternalContainer().eInverseRemove(this, JobClientPackage.JOB_SCHEDULER__JOBS, JobScheduler.class, msgs);
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
			case JobClientPackage.JOB_SCHEDULED__RUN:
				if (resolve) return getRun();
				return basicGetRun();
			case JobClientPackage.JOB_SCHEDULED__SCHEDULED_ON:
				if (resolve) return getScheduledOn();
				return basicGetScheduledOn();
			case JobClientPackage.JOB_SCHEDULED__NOT_READY_TO_RUN:
				return isNotReadyToRun();
			case JobClientPackage.JOB_SCHEDULED__READY_TO_RUN:
				return isReadyToRun();
			case JobClientPackage.JOB_SCHEDULED__RUNNING:
				return isRunning();
			case JobClientPackage.JOB_SCHEDULED__RETURNED:
				return isReturned();
			case JobClientPackage.JOB_SCHEDULED__CANCELLED:
				return isCancelled();
			case JobClientPackage.JOB_SCHEDULED__FAILED:
				return isFailed();
			case JobClientPackage.JOB_SCHEDULED__FEEDBACK:
				return getFeedback();
			case JobClientPackage.JOB_SCHEDULED__SUBMISSION_TIME:
				return getSubmissionTime();
			case JobClientPackage.JOB_SCHEDULED__START_TIME:
				return getStartTime();
			case JobClientPackage.JOB_SCHEDULED__END_TIME:
				return getEndTime();
			case JobClientPackage.JOB_SCHEDULED__CANCEL_TIME:
				return getCancelTime();
			case JobClientPackage.JOB_SCHEDULED__DESCRIPTION:
				return getDescription();
			case JobClientPackage.JOB_SCHEDULED__STATUS:
				return getStatus();
			case JobClientPackage.JOB_SCHEDULED__CANCEL_ENABLED_FEEDBACK:
				return getCancelEnabledFeedback();
			case JobClientPackage.JOB_SCHEDULED__SCHEDULER:
				return getScheduler();
			case JobClientPackage.JOB_SCHEDULED__JOB_NR:
				return getJobNr();
			case JobClientPackage.JOB_SCHEDULED__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
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
			case JobClientPackage.JOB_SCHEDULED__RUN:
				setRun((Run)newValue);
				return;
			case JobClientPackage.JOB_SCHEDULED__SCHEDULED_ON:
				setScheduledOn((JobEngine)newValue);
				return;
			case JobClientPackage.JOB_SCHEDULED__RUNNING:
				setRunning((Boolean)newValue);
				return;
			case JobClientPackage.JOB_SCHEDULED__RETURNED:
				setReturned((Boolean)newValue);
				return;
			case JobClientPackage.JOB_SCHEDULED__CANCELLED:
				setCancelled((Boolean)newValue);
				return;
			case JobClientPackage.JOB_SCHEDULED__FAILED:
				setFailed((Boolean)newValue);
				return;
			case JobClientPackage.JOB_SCHEDULED__FEEDBACK:
				setFeedback((String)newValue);
				return;
			case JobClientPackage.JOB_SCHEDULED__SUBMISSION_TIME:
				setSubmissionTime((Date)newValue);
				return;
			case JobClientPackage.JOB_SCHEDULED__START_TIME:
				setStartTime((Date)newValue);
				return;
			case JobClientPackage.JOB_SCHEDULED__END_TIME:
				setEndTime((Date)newValue);
				return;
			case JobClientPackage.JOB_SCHEDULED__CANCEL_TIME:
				setCancelTime((Date)newValue);
				return;
			case JobClientPackage.JOB_SCHEDULED__SCHEDULER:
				setScheduler((JobScheduler)newValue);
				return;
			case JobClientPackage.JOB_SCHEDULED__JOB_NR:
				setJobNr((Integer)newValue);
				return;
			case JobClientPackage.JOB_SCHEDULED__SOURCE:
				setSource((JobSource)newValue);
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
			case JobClientPackage.JOB_SCHEDULED__RUN:
				setRun((Run)null);
				return;
			case JobClientPackage.JOB_SCHEDULED__SCHEDULED_ON:
				setScheduledOn((JobEngine)null);
				return;
			case JobClientPackage.JOB_SCHEDULED__RUNNING:
				setRunning(RUNNING_EDEFAULT);
				return;
			case JobClientPackage.JOB_SCHEDULED__RETURNED:
				setReturned(RETURNED_EDEFAULT);
				return;
			case JobClientPackage.JOB_SCHEDULED__CANCELLED:
				setCancelled(CANCELLED_EDEFAULT);
				return;
			case JobClientPackage.JOB_SCHEDULED__FAILED:
				setFailed(FAILED_EDEFAULT);
				return;
			case JobClientPackage.JOB_SCHEDULED__FEEDBACK:
				setFeedback(FEEDBACK_EDEFAULT);
				return;
			case JobClientPackage.JOB_SCHEDULED__SUBMISSION_TIME:
				setSubmissionTime(SUBMISSION_TIME_EDEFAULT);
				return;
			case JobClientPackage.JOB_SCHEDULED__START_TIME:
				setStartTime(START_TIME_EDEFAULT);
				return;
			case JobClientPackage.JOB_SCHEDULED__END_TIME:
				setEndTime(END_TIME_EDEFAULT);
				return;
			case JobClientPackage.JOB_SCHEDULED__CANCEL_TIME:
				setCancelTime(CANCEL_TIME_EDEFAULT);
				return;
			case JobClientPackage.JOB_SCHEDULED__SCHEDULER:
				setScheduler((JobScheduler)null);
				return;
			case JobClientPackage.JOB_SCHEDULED__JOB_NR:
				setJobNr(JOB_NR_EDEFAULT);
				return;
			case JobClientPackage.JOB_SCHEDULED__SOURCE:
				setSource((JobSource)null);
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
			case JobClientPackage.JOB_SCHEDULED__RUN:
				return run != null;
			case JobClientPackage.JOB_SCHEDULED__SCHEDULED_ON:
				return scheduledOn != null;
			case JobClientPackage.JOB_SCHEDULED__NOT_READY_TO_RUN:
				return isNotReadyToRun() != NOT_READY_TO_RUN_EDEFAULT;
			case JobClientPackage.JOB_SCHEDULED__READY_TO_RUN:
				return isReadyToRun() != READY_TO_RUN_EDEFAULT;
			case JobClientPackage.JOB_SCHEDULED__RUNNING:
				return running != RUNNING_EDEFAULT;
			case JobClientPackage.JOB_SCHEDULED__RETURNED:
				return returned != RETURNED_EDEFAULT;
			case JobClientPackage.JOB_SCHEDULED__CANCELLED:
				return cancelled != CANCELLED_EDEFAULT;
			case JobClientPackage.JOB_SCHEDULED__FAILED:
				return failed != FAILED_EDEFAULT;
			case JobClientPackage.JOB_SCHEDULED__FEEDBACK:
				return FEEDBACK_EDEFAULT == null ? feedback != null : !FEEDBACK_EDEFAULT.equals(feedback);
			case JobClientPackage.JOB_SCHEDULED__SUBMISSION_TIME:
				return SUBMISSION_TIME_EDEFAULT == null ? submissionTime != null : !SUBMISSION_TIME_EDEFAULT.equals(submissionTime);
			case JobClientPackage.JOB_SCHEDULED__START_TIME:
				return START_TIME_EDEFAULT == null ? startTime != null : !START_TIME_EDEFAULT.equals(startTime);
			case JobClientPackage.JOB_SCHEDULED__END_TIME:
				return END_TIME_EDEFAULT == null ? endTime != null : !END_TIME_EDEFAULT.equals(endTime);
			case JobClientPackage.JOB_SCHEDULED__CANCEL_TIME:
				return CANCEL_TIME_EDEFAULT == null ? cancelTime != null : !CANCEL_TIME_EDEFAULT.equals(cancelTime);
			case JobClientPackage.JOB_SCHEDULED__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? getDescription() != null : !DESCRIPTION_EDEFAULT.equals(getDescription());
			case JobClientPackage.JOB_SCHEDULED__STATUS:
				return getStatus() != STATUS_EDEFAULT;
			case JobClientPackage.JOB_SCHEDULED__CANCEL_ENABLED_FEEDBACK:
				return CANCEL_ENABLED_FEEDBACK_EDEFAULT == null ? getCancelEnabledFeedback() != null : !CANCEL_ENABLED_FEEDBACK_EDEFAULT.equals(getCancelEnabledFeedback());
			case JobClientPackage.JOB_SCHEDULED__SCHEDULER:
				return getScheduler() != null;
			case JobClientPackage.JOB_SCHEDULED__JOB_NR:
				return jobNr != JOB_NR_EDEFAULT;
			case JobClientPackage.JOB_SCHEDULED__SOURCE:
				return source != null;
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
			case JobClientPackage.JOB_SCHEDULED___CANCEL:
				cancel();
				return null;
			case JobClientPackage.JOB_SCHEDULED___SET_RUNNING:
				setRunning();
				return null;
			case JobClientPackage.JOB_SCHEDULED___SET_RETURN__RETURNFEEDBACK:
				setReturn((ReturnFeedback)arguments.get(0));
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
		result.append(", Returned: ");
		result.append(returned);
		result.append(", Cancelled: ");
		result.append(cancelled);
		result.append(", Failed: ");
		result.append(failed);
		result.append(", Feedback: ");
		result.append(feedback);
		result.append(", SubmissionTime: ");
		result.append(submissionTime);
		result.append(", StartTime: ");
		result.append(startTime);
		result.append(", EndTime: ");
		result.append(endTime);
		result.append(", CancelTime: ");
		result.append(cancelTime);
		result.append(", JobNr: ");
		result.append(jobNr);
		result.append(')');
		return result.toString();
	}

} //JobScheduledImpl
