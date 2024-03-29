/*******************************************************************************
 * Copyright (c) 2017, 2018 Michel Schaffers and others.
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

import com.misc.common.moplaf.common.EnabledFeedback;
import com.misc.common.moplaf.common.util.EObjectListDerived;
import com.misc.common.moplaf.job.Plugin;
import com.misc.common.moplaf.job.Run;
import com.misc.common.moplaf.job.jobclient.JobClientFactory;
import com.misc.common.moplaf.job.jobclient.JobClientPackage;
import com.misc.common.moplaf.job.jobclient.JobEngine;
import com.misc.common.moplaf.job.jobclient.JobScheduled;
import com.misc.common.moplaf.job.jobclient.JobScheduler;
import com.misc.common.moplaf.job.jobclient.JobSchedulerService;
import com.misc.common.moplaf.job.jobclient.JobSource;
import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
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
 *   <li>{@link com.misc.common.moplaf.job.jobclient.impl.JobSchedulerImpl#getRefreshFeedback <em>Refresh Feedback</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.impl.JobSchedulerImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.impl.JobSchedulerImpl#getRefreshRate <em>Refresh Rate</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.impl.JobSchedulerImpl#getNrJobsWaiting <em>Nr Jobs Waiting</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.impl.JobSchedulerImpl#getNrJobsRunning <em>Nr Jobs Running</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.impl.JobSchedulerImpl#getNrJobsFailed <em>Nr Jobs Failed</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.impl.JobSchedulerImpl#getNrJobsCancelled <em>Nr Jobs Cancelled</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.impl.JobSchedulerImpl#getLastRefresh <em>Last Refresh</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.impl.JobSchedulerImpl#getLastFeedback <em>Last Feedback</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.impl.JobSchedulerImpl#getCurrentScheduleNr <em>Current Schedule Nr</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.impl.JobSchedulerImpl#getServices <em>Services</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.impl.JobSchedulerImpl#getSources <em>Sources</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JobSchedulerImpl extends ServiceImpl implements JobScheduler {
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
	 * The default value of the '{@link #getRefreshFeedback() <em>Refresh Feedback</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefreshFeedback()
	 * @generated
	 * @ordered
	 */
	protected static final EnabledFeedback REFRESH_FEEDBACK_EDEFAULT = null;

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
	 * The default value of the '{@link #getNrJobsWaiting() <em>Nr Jobs Waiting</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNrJobsWaiting()
	 * @generated
	 * @ordered
	 */
	protected static final int NR_JOBS_WAITING_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getNrJobsRunning() <em>Nr Jobs Running</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNrJobsRunning()
	 * @generated
	 * @ordered
	 */
	protected static final int NR_JOBS_RUNNING_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getNrJobsFailed() <em>Nr Jobs Failed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNrJobsFailed()
	 * @generated
	 * @ordered
	 */
	protected static final int NR_JOBS_FAILED_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getNrJobsCancelled() <em>Nr Jobs Cancelled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNrJobsCancelled()
	 * @generated
	 * @ordered
	 */
	protected static final int NR_JOBS_CANCELLED_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getLastRefresh() <em>Last Refresh</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastRefresh()
	 * @generated
	 * @ordered
	 */
	protected static final Date LAST_REFRESH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastRefresh() <em>Last Refresh</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastRefresh()
	 * @generated
	 * @ordered
	 */
	protected Date lastRefresh = LAST_REFRESH_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastFeedback() <em>Last Feedback</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastFeedback()
	 * @generated
	 * @ordered
	 */
	protected static final Date LAST_FEEDBACK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastFeedback() <em>Last Feedback</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastFeedback()
	 * @generated
	 * @ordered
	 */
	protected Date lastFeedback = LAST_FEEDBACK_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrentScheduleNr() <em>Current Schedule Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentScheduleNr()
	 * @generated
	 * @ordered
	 */
	protected static final int CURRENT_SCHEDULE_NR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCurrentScheduleNr() <em>Current Schedule Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentScheduleNr()
	 * @generated
	 * @ordered
	 */
	protected int currentScheduleNr = CURRENT_SCHEDULE_NR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSources() <em>Sources</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSources()
	 * @generated
	 * @ordered
	 */
	protected EList<JobSource> sources;

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
			jobs = new EObjectContainmentWithInverseEList<JobScheduled>(JobScheduled.class, this, JobClientPackage.JOB_SCHEDULER__JOBS, JobClientPackage.JOB_SCHEDULED__SCHEDULER);
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
			engines = new EObjectContainmentEList.Unsettable<JobEngine>(JobEngine.class, this, JobClientPackage.JOB_SCHEDULER__ENGINES);
		}
		return engines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEngines() {
		return engines != null && ((InternalEList.Unsettable<?>)engines).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public String getDescription() {
		String description = String.format("Job %s (%s", this.getName(), this.getStatus());

		int waiting = this.getNrJobsWaiting();
		if ( waiting>0 )   { description += String.format(", waiting=%d", waiting); }

		int running = this.getNrJobsRunning();
		if ( running>0 )   { description += String.format(", running=%d", running); }

		int failed = this.getNrJobsFailed();
		if ( failed>0 )    { description += String.format(", failed=%d", failed); }
		
		int cancelled = this.getNrJobsCancelled();
		if ( cancelled>0 ) { description += String.format(", cancelled=%d", cancelled); }

		description += ")";
return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public int getNrJobsWaiting() {
		long nr = this.getJobs().stream().filter(j->j.isReadyToRun()).count();
		return (int) nr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public int getNrJobsRunning() {
		long nr = this.getJobs().stream().filter(j->j.isRunning()).count();
		return (int) nr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public int getNrJobsFailed() {
		long nr = this.getJobs().stream().filter(j->j.isFailed()).count();
		return (int) nr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public int getNrJobsCancelled() {
		long nr = this.getJobs().stream().filter(j->j.isCancelled()).count();
		return (int) nr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getLastRefresh() {
		return lastRefresh;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastRefresh(Date newLastRefresh) {
		Date oldLastRefresh = lastRefresh;
		lastRefresh = newLastRefresh;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JobClientPackage.JOB_SCHEDULER__LAST_REFRESH, oldLastRefresh, lastRefresh));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getLastFeedback() {
		return lastFeedback;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastFeedback(Date newLastFeedback) {
		Date oldLastFeedback = lastFeedback;
		lastFeedback = newLastFeedback;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JobClientPackage.JOB_SCHEDULER__LAST_FEEDBACK, oldLastFeedback, lastFeedback));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCurrentScheduleNr() {
		return currentScheduleNr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentScheduleNr(int newCurrentScheduleNr) {
		int oldCurrentScheduleNr = currentScheduleNr;
		currentScheduleNr = newCurrentScheduleNr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JobClientPackage.JOB_SCHEDULER__CURRENT_SCHEDULE_NR, oldCurrentScheduleNr, currentScheduleNr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public EList<JobSchedulerService> getServices() {
		EList<JobSchedulerService> list = new EObjectListDerived<JobSchedulerService>
		(	JobSchedulerService.class, 
			this, 
			JobClientPackage.JOB_SCHEDULER__SERVICES, 
			true);
		for ( JobSource source : this.getSources()) {
			list.add(source);
		}
		for ( JobEngine engine : this.getEngines()) {
			list.add(engine);
		}
	return list;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JobSource> getSources() {
		if (sources == null) {
			sources = new EObjectContainmentEList<JobSource>(JobSource.class, this, JobClientPackage.JOB_SCHEDULER__SOURCES);
		}
		return sources;
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

	private class BackgroundRefreshJob extends Job {
		
		public BackgroundRefreshJob() {
			super(String.format("Background refresh job for scheudler %s", JobSchedulerImpl.this.getName()));
		    this.setPriority(Job.SHORT);
		    this.setUser(false); // no progress dialog
		    this.setSystem(true);  // no contribution to progress view
		}
		
		/**
		 * 
		 */
		@Override
		public boolean belongsTo(Object family) {
			return family == com.misc.common.moplaf.job.jobclient.Plugin.JOB_FAMILY_JOBSCHEDULER_REFRESH;
		}

		/**
		 * Call back from the applicative logic
		 * 
		 * @return true if the run may continue, false if the run must attempt to abort
		 */
		@Override
		protected IStatus run(IProgressMonitor monitor) {
//    	    monitor.beginTask("Initialization", 100);
			JobSchedulerImpl scheduler = JobSchedulerImpl.this;
			while ( scheduler.isRunning()) {
				if( monitor.isCanceled()) {
					String message = String.format("JobScheduler background job %s cancelled by system", this.getName());
					Plugin.INSTANCE.logError(message);
					scheduler.stop(); // will exit the while
				} else {
					scheduler.refresh();
					// sleep refresh rate
					float seconds_to_sleep = scheduler.getRefreshRate();
					try {
						TimeUnit.SECONDS.sleep((long) seconds_to_sleep);
					} catch (InterruptedException e) {
						String message = String.format("JobScheduler background job %s crashed, reason %s", this.getName(), e.getMessage());
						Plugin.INSTANCE.logError(message);
						scheduler.stop(); // will exit the while
					}
				}
			}
            return Status.OK_STATUS;
		}
	};


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void start() {
		super.start();
		Job job = new BackgroundRefreshJob();
	    job.schedule(); // start as soon as possible
	    for ( JobSchedulerService service: this.getServices()) {
	    	if ( service.isAutoStartStop()) {
	    		service.start();
	    	}
	    }
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void stop() {
	    for ( JobSchedulerService service: this.getServices()) {
	    	if ( service.isAutoStartStop()) {
	    		service.stop();
	    	}
	    }
	    super.stop();
	}


	/**
	 * 
	 * @return
	 */
	private JobScheduled[] getJobsToProcess() {
		JobScheduled[] jobs = this.getJobs()
				.stream()
				.filter(j->j.isReadyToRun())
				.toArray(JobScheduled[]::new);
		return jobs;
	}
	
	/**
	 * 
	 * @return
	 */
	private JobEngine getJobEngineToProcess() {
		JobEngine engine = this.getEngines()
				.stream()
				.filter(e->e.getExecuteEnabledFeedback().isEnabled())
				.findAny()
				.orElse(null);
		return engine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void refresh() {
		this.refreshExecuteJobs();
		
		this.refreshScheduledJobStatus();
		
		this.setLastRefresh(new Date());
	    for ( JobSource source : this.getSources()) {
	    	if ( source.isRunning()) {
	    		source.refresh();
	    	}
	    }
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public JobScheduled submitRun(JobSource source, Run run, boolean takes_ownership) {
		JobScheduled job = JobClientFactory.eINSTANCE.createJobScheduled();
		this.getJobs().add(job);
		job.setRun(run);
		job.setSubmissionTime(new Date());
		job.setScheduleNr(this.makeNewScheduleNr());
		job.setSource(source);
		if ( takes_ownership) {
			job.setOwnedRun(run);
		}
		return job;
	}

	private void refreshScheduledJobStatus() {
		for ( JobScheduled job : this.getJobs()) {
			if ( !job.isReturned()) {
				JobEngine engine = job.getScheduledOn();
				if ( engine!=null) {
					engine.refreshJobStatus(job);;
				}
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	private void refreshExecuteJobs() {
		JobScheduled[] jobs = this.getJobsToProcess();
		for ( JobScheduled job : jobs) {
			JobEngine engine = this.getJobEngineToProcess();
			if ( engine != null) {
				engine.executeJob(job);
			}
		} 
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void setLastFeedback() {
		this.setLastFeedback(new Date());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public int makeNewScheduleNr() {
		int new_nr = this.getCurrentScheduleNr()+1;
		this.setCurrentScheduleNr(new_nr);
		return new_nr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void flush() {
		for ( JobScheduled scheduled : this.getJobs()) {
			scheduled.setSource(null);
			scheduled.setScheduledOn(null);
		}
		this.getJobs().clear();
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
			case JobClientPackage.JOB_SCHEDULER__JOBS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getJobs()).basicAdd(otherEnd, msgs);
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
			case JobClientPackage.JOB_SCHEDULER__SOURCES:
				return ((InternalEList<?>)getSources()).basicRemove(otherEnd, msgs);
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
			case JobClientPackage.JOB_SCHEDULER__REFRESH_FEEDBACK:
				return getRefreshFeedback();
			case JobClientPackage.JOB_SCHEDULER__DESCRIPTION:
				return getDescription();
			case JobClientPackage.JOB_SCHEDULER__REFRESH_RATE:
				return getRefreshRate();
			case JobClientPackage.JOB_SCHEDULER__NR_JOBS_WAITING:
				return getNrJobsWaiting();
			case JobClientPackage.JOB_SCHEDULER__NR_JOBS_RUNNING:
				return getNrJobsRunning();
			case JobClientPackage.JOB_SCHEDULER__NR_JOBS_FAILED:
				return getNrJobsFailed();
			case JobClientPackage.JOB_SCHEDULER__NR_JOBS_CANCELLED:
				return getNrJobsCancelled();
			case JobClientPackage.JOB_SCHEDULER__LAST_REFRESH:
				return getLastRefresh();
			case JobClientPackage.JOB_SCHEDULER__LAST_FEEDBACK:
				return getLastFeedback();
			case JobClientPackage.JOB_SCHEDULER__CURRENT_SCHEDULE_NR:
				return getCurrentScheduleNr();
			case JobClientPackage.JOB_SCHEDULER__SERVICES:
				return getServices();
			case JobClientPackage.JOB_SCHEDULER__SOURCES:
				return getSources();
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
			case JobClientPackage.JOB_SCHEDULER__REFRESH_RATE:
				setRefreshRate((Float)newValue);
				return;
			case JobClientPackage.JOB_SCHEDULER__LAST_REFRESH:
				setLastRefresh((Date)newValue);
				return;
			case JobClientPackage.JOB_SCHEDULER__LAST_FEEDBACK:
				setLastFeedback((Date)newValue);
				return;
			case JobClientPackage.JOB_SCHEDULER__CURRENT_SCHEDULE_NR:
				setCurrentScheduleNr((Integer)newValue);
				return;
			case JobClientPackage.JOB_SCHEDULER__SOURCES:
				getSources().clear();
				getSources().addAll((Collection<? extends JobSource>)newValue);
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
			case JobClientPackage.JOB_SCHEDULER__REFRESH_RATE:
				setRefreshRate(REFRESH_RATE_EDEFAULT);
				return;
			case JobClientPackage.JOB_SCHEDULER__LAST_REFRESH:
				setLastRefresh(LAST_REFRESH_EDEFAULT);
				return;
			case JobClientPackage.JOB_SCHEDULER__LAST_FEEDBACK:
				setLastFeedback(LAST_FEEDBACK_EDEFAULT);
				return;
			case JobClientPackage.JOB_SCHEDULER__CURRENT_SCHEDULE_NR:
				setCurrentScheduleNr(CURRENT_SCHEDULE_NR_EDEFAULT);
				return;
			case JobClientPackage.JOB_SCHEDULER__SOURCES:
				getSources().clear();
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
				return isSetEngines();
			case JobClientPackage.JOB_SCHEDULER__REFRESH_FEEDBACK:
				return REFRESH_FEEDBACK_EDEFAULT == null ? getRefreshFeedback() != null : !REFRESH_FEEDBACK_EDEFAULT.equals(getRefreshFeedback());
			case JobClientPackage.JOB_SCHEDULER__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? getDescription() != null : !DESCRIPTION_EDEFAULT.equals(getDescription());
			case JobClientPackage.JOB_SCHEDULER__REFRESH_RATE:
				return refreshRate != REFRESH_RATE_EDEFAULT;
			case JobClientPackage.JOB_SCHEDULER__NR_JOBS_WAITING:
				return getNrJobsWaiting() != NR_JOBS_WAITING_EDEFAULT;
			case JobClientPackage.JOB_SCHEDULER__NR_JOBS_RUNNING:
				return getNrJobsRunning() != NR_JOBS_RUNNING_EDEFAULT;
			case JobClientPackage.JOB_SCHEDULER__NR_JOBS_FAILED:
				return getNrJobsFailed() != NR_JOBS_FAILED_EDEFAULT;
			case JobClientPackage.JOB_SCHEDULER__NR_JOBS_CANCELLED:
				return getNrJobsCancelled() != NR_JOBS_CANCELLED_EDEFAULT;
			case JobClientPackage.JOB_SCHEDULER__LAST_REFRESH:
				return LAST_REFRESH_EDEFAULT == null ? lastRefresh != null : !LAST_REFRESH_EDEFAULT.equals(lastRefresh);
			case JobClientPackage.JOB_SCHEDULER__LAST_FEEDBACK:
				return LAST_FEEDBACK_EDEFAULT == null ? lastFeedback != null : !LAST_FEEDBACK_EDEFAULT.equals(lastFeedback);
			case JobClientPackage.JOB_SCHEDULER__CURRENT_SCHEDULE_NR:
				return currentScheduleNr != CURRENT_SCHEDULE_NR_EDEFAULT;
			case JobClientPackage.JOB_SCHEDULER__SERVICES:
				return !getServices().isEmpty();
			case JobClientPackage.JOB_SCHEDULER__SOURCES:
				return sources != null && !sources.isEmpty();
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
			case JobClientPackage.JOB_SCHEDULER___REFRESH:
				refresh();
				return null;
			case JobClientPackage.JOB_SCHEDULER___SUBMIT_RUN__JOBSOURCE_RUN_BOOLEAN:
				return submitRun((JobSource)arguments.get(0), (Run)arguments.get(1), (Boolean)arguments.get(2));
			case JobClientPackage.JOB_SCHEDULER___SET_LAST_FEEDBACK:
				setLastFeedback();
				return null;
			case JobClientPackage.JOB_SCHEDULER___MAKE_NEW_SCHEDULE_NR:
				return makeNewScheduleNr();
			case JobClientPackage.JOB_SCHEDULER___FLUSH:
				flush();
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
		result.append(" (RefreshRate: ");
		result.append(refreshRate);
		result.append(", LastRefresh: ");
		result.append(lastRefresh);
		result.append(", LastFeedback: ");
		result.append(lastFeedback);
		result.append(", CurrentScheduleNr: ");
		result.append(currentScheduleNr);
		result.append(')');
		return result.toString();
	}

} //JobSchedulerImpl
