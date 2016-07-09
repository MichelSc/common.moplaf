/**
 */
package com.misc.common.moplaf.common.impl;

import com.misc.common.moplaf.common.CommonPackage;
import com.misc.common.moplaf.common.Job;

import java.lang.reflect.InvocationTargetException;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Job</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.common.impl.JobImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.misc.common.moplaf.common.impl.JobImpl#isBackground <em>Background</em>}</li>
 *   <li>{@link com.misc.common.moplaf.common.impl.JobImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link com.misc.common.moplaf.common.impl.JobImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link com.misc.common.moplaf.common.impl.JobImpl#getStartTime <em>Start Time</em>}</li>
 *   <li>{@link com.misc.common.moplaf.common.impl.JobImpl#getEndTime <em>End Time</em>}</li>
 *   <li>{@link com.misc.common.moplaf.common.impl.JobImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link com.misc.common.moplaf.common.impl.JobImpl#isCreated <em>Created</em>}</li>
 *   <li>{@link com.misc.common.moplaf.common.impl.JobImpl#isRunning <em>Running</em>}</li>
 *   <li>{@link com.misc.common.moplaf.common.impl.JobImpl#isStopped <em>Stopped</em>}</li>
 *   <li>{@link com.misc.common.moplaf.common.impl.JobImpl#isFinished <em>Finished</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JobImpl extends MinimalEObjectImpl.Container implements Job {
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
	 * The default value of the '{@link #isBackground() <em>Background</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBackground()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BACKGROUND_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBackground() <em>Background</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBackground()
	 * @generated
	 * @ordered
	 */
	protected boolean background = BACKGROUND_EDEFAULT;

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
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

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
	 * The default value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected static final float DURATION_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected float duration = DURATION_EDEFAULT;

	/**
	 * The default value of the '{@link #isCreated() <em>Created</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCreated()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CREATED_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isCreated() <em>Created</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCreated()
	 * @generated
	 * @ordered
	 */
	protected boolean created = CREATED_EDEFAULT;

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
	 * The default value of the '{@link #isStopped() <em>Stopped</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStopped()
	 * @generated
	 * @ordered
	 */
	protected static final boolean STOPPED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isStopped() <em>Stopped</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStopped()
	 * @generated
	 * @ordered
	 */
	protected boolean stopped = STOPPED_EDEFAULT;

	/**
	 * The default value of the '{@link #isFinished() <em>Finished</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFinished()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FINISHED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFinished() <em>Finished</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFinished()
	 * @generated
	 * @ordered
	 */
	protected boolean finished = FINISHED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JobImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommonPackage.Literals.JOB;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.JOB__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBackground() {
		return background;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBackground(boolean newBackground) {
		boolean oldBackground = background;
		background = newBackground;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.JOB__BACKGROUND, oldBackground, background));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public String getStatus() {
		String status = "Unknown";
		if      ( this.isCreated())   { status = "Created"; }
		else if ( this.isRunning())   { status = "Running"; }
		else if ( this.isStopped())   { status = "Stopped"; }
		else if ( this.isFinished())  { status = "Finished"; }
		
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public String getDescription() {
		String description = String.format("Job %s (%s)", this.getName(), this.getStatus());
		return description;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.JOB__START_TIME, oldStartTime, startTime));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.JOB__END_TIME, oldEndTime, endTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getDuration() {
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDuration(float newDuration) {
		float oldDuration = duration;
		duration = newDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.JOB__DURATION, oldDuration, duration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCreated() {
		return created;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreated(boolean newCreated) {
		boolean oldCreated = created;
		created = newCreated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.JOB__CREATED, oldCreated, created));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.JOB__RUNNING, oldRunning, running));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isStopped() {
		return stopped;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStopped(boolean newStopped) {
		boolean oldStopped = stopped;
		stopped = newStopped;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.JOB__STOPPED, oldStopped, stopped));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFinished() {
		return finished;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFinished(boolean newFinished) {
		boolean oldFinished = finished;
		finished = newFinished;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.JOB__FINISHED, oldFinished, finished));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void runImpl() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void start() {
		this.setCreated(false);
		this.setStopped(false);
		this.setRunning(true);
		this.setStartTime(new Date());

		this.runImpl();
		
		this.setFinished(true);
		this.setRunning(false);
		this.setEndTime(new Date());
		long ticks = this.getEndTime().getTime()-this.getStartTime().getTime();
		float hours = (float)ticks/1000.0f/60.0f/60.0f;
		this.setDuration(hours);
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
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CommonPackage.JOB__NAME:
				return getName();
			case CommonPackage.JOB__BACKGROUND:
				return isBackground();
			case CommonPackage.JOB__STATUS:
				return getStatus();
			case CommonPackage.JOB__DESCRIPTION:
				return getDescription();
			case CommonPackage.JOB__START_TIME:
				return getStartTime();
			case CommonPackage.JOB__END_TIME:
				return getEndTime();
			case CommonPackage.JOB__DURATION:
				return getDuration();
			case CommonPackage.JOB__CREATED:
				return isCreated();
			case CommonPackage.JOB__RUNNING:
				return isRunning();
			case CommonPackage.JOB__STOPPED:
				return isStopped();
			case CommonPackage.JOB__FINISHED:
				return isFinished();
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
			case CommonPackage.JOB__NAME:
				setName((String)newValue);
				return;
			case CommonPackage.JOB__BACKGROUND:
				setBackground((Boolean)newValue);
				return;
			case CommonPackage.JOB__START_TIME:
				setStartTime((Date)newValue);
				return;
			case CommonPackage.JOB__END_TIME:
				setEndTime((Date)newValue);
				return;
			case CommonPackage.JOB__DURATION:
				setDuration((Float)newValue);
				return;
			case CommonPackage.JOB__CREATED:
				setCreated((Boolean)newValue);
				return;
			case CommonPackage.JOB__RUNNING:
				setRunning((Boolean)newValue);
				return;
			case CommonPackage.JOB__STOPPED:
				setStopped((Boolean)newValue);
				return;
			case CommonPackage.JOB__FINISHED:
				setFinished((Boolean)newValue);
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
			case CommonPackage.JOB__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CommonPackage.JOB__BACKGROUND:
				setBackground(BACKGROUND_EDEFAULT);
				return;
			case CommonPackage.JOB__START_TIME:
				setStartTime(START_TIME_EDEFAULT);
				return;
			case CommonPackage.JOB__END_TIME:
				setEndTime(END_TIME_EDEFAULT);
				return;
			case CommonPackage.JOB__DURATION:
				setDuration(DURATION_EDEFAULT);
				return;
			case CommonPackage.JOB__CREATED:
				setCreated(CREATED_EDEFAULT);
				return;
			case CommonPackage.JOB__RUNNING:
				setRunning(RUNNING_EDEFAULT);
				return;
			case CommonPackage.JOB__STOPPED:
				setStopped(STOPPED_EDEFAULT);
				return;
			case CommonPackage.JOB__FINISHED:
				setFinished(FINISHED_EDEFAULT);
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
			case CommonPackage.JOB__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CommonPackage.JOB__BACKGROUND:
				return background != BACKGROUND_EDEFAULT;
			case CommonPackage.JOB__STATUS:
				return STATUS_EDEFAULT == null ? getStatus() != null : !STATUS_EDEFAULT.equals(getStatus());
			case CommonPackage.JOB__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? getDescription() != null : !DESCRIPTION_EDEFAULT.equals(getDescription());
			case CommonPackage.JOB__START_TIME:
				return START_TIME_EDEFAULT == null ? startTime != null : !START_TIME_EDEFAULT.equals(startTime);
			case CommonPackage.JOB__END_TIME:
				return END_TIME_EDEFAULT == null ? endTime != null : !END_TIME_EDEFAULT.equals(endTime);
			case CommonPackage.JOB__DURATION:
				return duration != DURATION_EDEFAULT;
			case CommonPackage.JOB__CREATED:
				return created != CREATED_EDEFAULT;
			case CommonPackage.JOB__RUNNING:
				return running != RUNNING_EDEFAULT;
			case CommonPackage.JOB__STOPPED:
				return stopped != STOPPED_EDEFAULT;
			case CommonPackage.JOB__FINISHED:
				return finished != FINISHED_EDEFAULT;
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
			case CommonPackage.JOB___RUN_IMPL:
				runImpl();
				return null;
			case CommonPackage.JOB___START:
				start();
				return null;
			case CommonPackage.JOB___STOP:
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
		result.append(" (Name: ");
		result.append(name);
		result.append(", Background: ");
		result.append(background);
		result.append(", StartTime: ");
		result.append(startTime);
		result.append(", EndTime: ");
		result.append(endTime);
		result.append(", Duration: ");
		result.append(duration);
		result.append(", Created: ");
		result.append(created);
		result.append(", Running: ");
		result.append(running);
		result.append(", Stopped: ");
		result.append(stopped);
		result.append(", Finished: ");
		result.append(finished);
		result.append(')');
		return result.toString();
	}

} //JobImpl
