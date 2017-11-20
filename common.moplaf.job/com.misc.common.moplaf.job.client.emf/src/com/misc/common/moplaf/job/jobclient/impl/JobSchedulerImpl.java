/**
 */
package com.misc.common.moplaf.job.jobclient.impl;

import com.misc.common.moplaf.common.EnabledFeedback;
import com.misc.common.moplaf.job.Job;
import com.misc.common.moplaf.job.jobclient.Engine;
import com.misc.common.moplaf.job.jobclient.JobScheduled;
import com.misc.common.moplaf.job.jobclient.JobScheduler;
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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Job Scheduler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.impl.JobSchedulerImpl#getJobschedueled <em>Jobschedueled</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.impl.JobSchedulerImpl#getEngine <em>Engine</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.impl.JobSchedulerImpl#getStartFeedback <em>Start Feedback</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.impl.JobSchedulerImpl#getStopFeedback <em>Stop Feedback</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.impl.JobSchedulerImpl#isStarted <em>Started</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.impl.JobSchedulerImpl#getNbOfEngines <em>Nb Of Engines</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.impl.JobSchedulerImpl#getNbOfJobs <em>Nb Of Jobs</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.impl.JobSchedulerImpl#getRefreshFeedback <em>Refresh Feedback</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.impl.JobSchedulerImpl#getRefreshRate <em>Refresh Rate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JobSchedulerImpl extends MinimalEObjectImpl.Container implements JobScheduler {
	/**
	 * The cached value of the '{@link #getJobschedueled() <em>Jobschedueled</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobschedueled()
	 * @generated
	 * @ordered
	 */
	protected EList<JobScheduled> jobschedueled;

	/**
	 * The cached value of the '{@link #getEngine() <em>Engine</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEngine()
	 * @generated
	 * @ordered
	 */
	protected EList<Engine> engine;

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
	 * The default value of the '{@link #isStarted() <em>Started</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStarted()
	 * @generated
	 * @ordered
	 */
	protected static final boolean STARTED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isStarted() <em>Started</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStarted()
	 * @generated
	 * @ordered
	 */
	protected boolean started = STARTED_EDEFAULT;

	/**
	 * The default value of the '{@link #getNbOfEngines() <em>Nb Of Engines</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbOfEngines()
	 * @generated
	 * @ordered
	 */
	protected static final int NB_OF_ENGINES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNbOfEngines() <em>Nb Of Engines</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbOfEngines()
	 * @generated
	 * @ordered
	 */
	protected int nbOfEngines = NB_OF_ENGINES_EDEFAULT;

	/**
	 * The default value of the '{@link #getNbOfJobs() <em>Nb Of Jobs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbOfJobs()
	 * @generated
	 * @ordered
	 */
	protected static final int NB_OF_JOBS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNbOfJobs() <em>Nb Of Jobs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbOfJobs()
	 * @generated
	 * @ordered
	 */
	protected int nbOfJobs = NB_OF_JOBS_EDEFAULT;

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
		return JobclientPackage.Literals.JOB_SCHEDULER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JobScheduled> getJobschedueled() {
		if (jobschedueled == null) {
			jobschedueled = new EObjectContainmentEList<JobScheduled>(JobScheduled.class, this, JobclientPackage.JOB_SCHEDULER__JOBSCHEDUELED);
		}
		return jobschedueled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Engine> getEngine() {
		if (engine == null) {
			engine = new EObjectContainmentEList<Engine>(Engine.class, this, JobclientPackage.JOB_SCHEDULER__ENGINE);
		}
		return engine;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public JobScheduled getJobToProcess() {
		EList<JobScheduled> jobs = this.getJobschedueled();
		boolean original = false;
		
		if ( original ) {
			JobScheduled job = null;
			for( int j = 0; j<jobs.size(); j++)
			{
				if( jobs.get(j).getJob() != null
					&& !jobs.get(j).getJob().isFinished() 
					&& jobs.get(j).getScheduledOn() == null )
				{		
					job = jobs.get(j);
					j = jobs.size();
				}
			}
			return job;
		}
		else {
			for ( JobScheduled job_scheduled : jobs) {
				if ( !job_scheduled.getJob().isFinished() 
				&& job_scheduled.getScheduledOn()==null) {
					return job_scheduled;
				}
			}
			return null;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public EnabledFeedback getStartFeedback() {
		if ( this.isStarted()){
			return new EnabledFeedback(false, "JobScheduler started");
		}
		return EnabledFeedback.NOFEEDBACK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public EnabledFeedback getStopFeedback() {
		if ( !this.isStarted()){
			return new EnabledFeedback(false, "JobScheduler not yet started");
		}
		return EnabledFeedback.NOFEEDBACK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isStarted() {
		return started;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStarted(boolean newStarted) {
		boolean oldStarted = started;
		started = newStarted;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JobclientPackage.JOB_SCHEDULER__STARTED, oldStarted, started));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNbOfEngines() {
		return nbOfEngines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNbOfEngines(int newNbOfEngines) {
		int oldNbOfEngines = nbOfEngines;
		nbOfEngines = newNbOfEngines;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JobclientPackage.JOB_SCHEDULER__NB_OF_ENGINES, oldNbOfEngines, nbOfEngines));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNbOfJobs() {
		return nbOfJobs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNbOfJobs(int newNbOfJobs) {
		int oldNbOfJobs = nbOfJobs;
		nbOfJobs = newNbOfJobs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JobclientPackage.JOB_SCHEDULER__NB_OF_JOBS, oldNbOfJobs, nbOfJobs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public EnabledFeedback getRefreshFeedback() {
		if ( !this.isStarted()){
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
			eNotify(new ENotificationImpl(this, Notification.SET, JobclientPackage.JOB_SCHEDULER__REFRESH_RATE, oldRefreshRate, refreshRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void start() {
		this.setStarted(true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void stop() {
		this.setStarted(false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void refresh() {
		EList<Engine> engines = this.getEngine();
		JobScheduled exists = this.getJobToProcess();
		if( engines.size() > 0 
			&& exists != null)
		{
			for( int e = 0; e < engines.size(); e++)
			{
				Engine engine = engines.get(e);
				if( engine.getJobschedueled() == null )
				{
					JobScheduled toprocess = this.getJobToProcess();
					if( toprocess != null )
					{
						engine.setJobschedueled(toprocess);
					}
				}
			}
			for( int e = 0; e < engines.size(); e++)
			{
				Engine engine = engines.get(e);
				JobScheduled toprocess = engine.getJobschedueled();
				if( toprocess != null
					&& toprocess.getJob() != null
					&& toprocess.getJob().getStatus() == "Created")
				{
					toprocess.getJob().run();
					engine.setJobschedueled(null);
				}
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JobclientPackage.JOB_SCHEDULER__JOBSCHEDUELED:
				return ((InternalEList<?>)getJobschedueled()).basicRemove(otherEnd, msgs);
			case JobclientPackage.JOB_SCHEDULER__ENGINE:
				return ((InternalEList<?>)getEngine()).basicRemove(otherEnd, msgs);
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
			case JobclientPackage.JOB_SCHEDULER__JOBSCHEDUELED:
				return getJobschedueled();
			case JobclientPackage.JOB_SCHEDULER__ENGINE:
				return getEngine();
			case JobclientPackage.JOB_SCHEDULER__START_FEEDBACK:
				return getStartFeedback();
			case JobclientPackage.JOB_SCHEDULER__STOP_FEEDBACK:
				return getStopFeedback();
			case JobclientPackage.JOB_SCHEDULER__STARTED:
				return isStarted();
			case JobclientPackage.JOB_SCHEDULER__NB_OF_ENGINES:
				return getNbOfEngines();
			case JobclientPackage.JOB_SCHEDULER__NB_OF_JOBS:
				return getNbOfJobs();
			case JobclientPackage.JOB_SCHEDULER__REFRESH_FEEDBACK:
				return getRefreshFeedback();
			case JobclientPackage.JOB_SCHEDULER__REFRESH_RATE:
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
			case JobclientPackage.JOB_SCHEDULER__JOBSCHEDUELED:
				getJobschedueled().clear();
				getJobschedueled().addAll((Collection<? extends JobScheduled>)newValue);
				return;
			case JobclientPackage.JOB_SCHEDULER__ENGINE:
				getEngine().clear();
				getEngine().addAll((Collection<? extends Engine>)newValue);
				return;
			case JobclientPackage.JOB_SCHEDULER__STARTED:
				setStarted((Boolean)newValue);
				return;
			case JobclientPackage.JOB_SCHEDULER__NB_OF_ENGINES:
				setNbOfEngines((Integer)newValue);
				return;
			case JobclientPackage.JOB_SCHEDULER__NB_OF_JOBS:
				setNbOfJobs((Integer)newValue);
				return;
			case JobclientPackage.JOB_SCHEDULER__REFRESH_RATE:
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
			case JobclientPackage.JOB_SCHEDULER__JOBSCHEDUELED:
				getJobschedueled().clear();
				return;
			case JobclientPackage.JOB_SCHEDULER__ENGINE:
				getEngine().clear();
				return;
			case JobclientPackage.JOB_SCHEDULER__STARTED:
				setStarted(STARTED_EDEFAULT);
				return;
			case JobclientPackage.JOB_SCHEDULER__NB_OF_ENGINES:
				setNbOfEngines(NB_OF_ENGINES_EDEFAULT);
				return;
			case JobclientPackage.JOB_SCHEDULER__NB_OF_JOBS:
				setNbOfJobs(NB_OF_JOBS_EDEFAULT);
				return;
			case JobclientPackage.JOB_SCHEDULER__REFRESH_RATE:
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
			case JobclientPackage.JOB_SCHEDULER__JOBSCHEDUELED:
				return jobschedueled != null && !jobschedueled.isEmpty();
			case JobclientPackage.JOB_SCHEDULER__ENGINE:
				return engine != null && !engine.isEmpty();
			case JobclientPackage.JOB_SCHEDULER__START_FEEDBACK:
				return START_FEEDBACK_EDEFAULT == null ? getStartFeedback() != null : !START_FEEDBACK_EDEFAULT.equals(getStartFeedback());
			case JobclientPackage.JOB_SCHEDULER__STOP_FEEDBACK:
				return STOP_FEEDBACK_EDEFAULT == null ? getStopFeedback() != null : !STOP_FEEDBACK_EDEFAULT.equals(getStopFeedback());
			case JobclientPackage.JOB_SCHEDULER__STARTED:
				return started != STARTED_EDEFAULT;
			case JobclientPackage.JOB_SCHEDULER__NB_OF_ENGINES:
				return nbOfEngines != NB_OF_ENGINES_EDEFAULT;
			case JobclientPackage.JOB_SCHEDULER__NB_OF_JOBS:
				return nbOfJobs != NB_OF_JOBS_EDEFAULT;
			case JobclientPackage.JOB_SCHEDULER__REFRESH_FEEDBACK:
				return REFRESH_FEEDBACK_EDEFAULT == null ? getRefreshFeedback() != null : !REFRESH_FEEDBACK_EDEFAULT.equals(getRefreshFeedback());
			case JobclientPackage.JOB_SCHEDULER__REFRESH_RATE:
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
			case JobclientPackage.JOB_SCHEDULER___START:
				start();
				return null;
			case JobclientPackage.JOB_SCHEDULER___STOP:
				stop();
				return null;
			case JobclientPackage.JOB_SCHEDULER___REFRESH:
				refresh();
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
		result.append(" (Started: ");
		result.append(started);
		result.append(", nbOfEngines: ");
		result.append(nbOfEngines);
		result.append(", nbOfJobs: ");
		result.append(nbOfJobs);
		result.append(", RefreshRate: ");
		result.append(refreshRate);
		result.append(')');
		return result.toString();
	}

} //JobSchedulerImpl
