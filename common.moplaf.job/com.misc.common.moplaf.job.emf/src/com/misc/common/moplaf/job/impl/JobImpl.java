/**
 */
package com.misc.common.moplaf.job.impl;


import java.lang.reflect.InvocationTargetException;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import com.misc.common.moplaf.common.ReturnFeedback;
import com.misc.common.moplaf.job.Job;
import com.misc.common.moplaf.job.JobFactory;
import com.misc.common.moplaf.job.JobPackage;
import com.misc.common.moplaf.job.JobParameter;
import com.misc.common.moplaf.job.JobParameterType;
import com.misc.common.moplaf.job.RunContext;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Job</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.job.impl.JobImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.impl.JobImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.impl.JobImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.impl.JobImpl#getHelpText <em>Help Text</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.impl.JobImpl#getStartTime <em>Start Time</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.impl.JobImpl#getEndTime <em>End Time</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.impl.JobImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.impl.JobImpl#isRunning <em>Running</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.impl.JobImpl#isStopped <em>Stopped</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.impl.JobImpl#isFinished <em>Finished</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.impl.JobImpl#getArgs <em>Args</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.impl.JobImpl#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JobImpl extends RunImpl implements Job {
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
	 * The default value of the '{@link #getHelpText() <em>Help Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHelpText()
	 * @generated
	 * @ordered
	 */
	protected static final String HELP_TEXT_EDEFAULT = null;

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
	 * The cached value of the '{@link #getArgs() <em>Args</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgs()
	 * @generated
	 * @ordered
	 */
	protected EList<String> args;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<JobParameter> parameters;

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
		return JobPackage.Literals.JOB;
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
			eNotify(new ENotificationImpl(this, Notification.SET, JobPackage.JOB__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public String getStatus() {
		String status = "Unknown";
		if      ( this.isFinished())  { status = "Finished"; }
		else if ( this.isStopped())   { status = "Stopped"; }
		else if ( this.isRunning())   { status = "Running"; }
		else                          { status = "Created"; }
		
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public String getDescription() {
		String description = String.format("%s (%s)", this.getName(), this.getStatus());
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public String getHelpText() {
		String text = "Job "+this.getDescription()+"\n";
		text += "\n";
		text += "  Parameters \n";
		int paramNr = 0;
		for ( JobParameter param : this.getParameters()){
			paramNr++;
			text += String.format("  %d- %s:%s : %s \n", 
					              paramNr,
					              param.getName(),
					              param.getType().getLiteral(),
					              param.getDescription());
		}
		return text;
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
			eNotify(new ENotificationImpl(this, Notification.SET, JobPackage.JOB__START_TIME, oldStartTime, startTime));
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
			eNotify(new ENotificationImpl(this, Notification.SET, JobPackage.JOB__END_TIME, oldEndTime, endTime));
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
			eNotify(new ENotificationImpl(this, Notification.SET, JobPackage.JOB__DURATION, oldDuration, duration));
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
			eNotify(new ENotificationImpl(this, Notification.SET, JobPackage.JOB__RUNNING, oldRunning, running));
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
			eNotify(new ENotificationImpl(this, Notification.SET, JobPackage.JOB__STOPPED, oldStopped, stopped));
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
			eNotify(new ENotificationImpl(this, Notification.SET, JobPackage.JOB__FINISHED, oldFinished, finished));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getArgs() {
		if (args == null) {
			args = new EDataTypeUniqueEList<String>(String.class, this, JobPackage.JOB__ARGS);
		}
		return args;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JobParameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<JobParameter>(JobParameter.class, this, JobPackage.JOB__PARAMETERS);
		}
		return parameters;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void addParameter(String name, JobParameterType type, EAttribute attribute, String description) {
		JobParameter newParam = JobFactory.eINSTANCE.createJobParameter();
		newParam.setName(name);
		newParam.setType(type);
		newParam.setJobAttribute(attribute);
		newParam.setDescription(description);
		this.getParameters().add(newParam); // owning
				
	}

	/**
	 * <!-- begin-user-doc -->
	 * To be overloaded by the implementation, default does nothing
	 * <!-- end-user-doc -->
	 */
	protected void refreshParametersImpl() {
		
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void refreshParameters() {
		this.getParameters().clear();
		this.refreshParametersImpl();
	}
	
	/*
	 * 
	 */
	protected void jobResetImpl() {
		// default implementation does nothing
	}



	@Override
	protected void resetImpl() {
		this.setStopped(false);
		this.setFinished(false);
		this.setRunning(false);

		this.setStartTime(null);
		this.setEndTime(null);
		this.setDuration(0.0f);
		
		this.jobResetImpl();
	}

	/*
	 * Return true if finisehd, false if stopped or canceled
	 * 
	 */
	protected ReturnFeedback jobRunImpl(RunContext runContext){
		// to be implemented by the job implementation
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	protected ReturnFeedback runImpl(RunContext runContext) {
		this.reset(); // or let the user reset himself??
		
		this.setRunning(true);
		this.setStartTime(new Date());

		ReturnFeedback feedback = this.jobRunImpl(runContext);
		
		this.setFinished(feedback.isSuccess());
		this.setStopped(feedback.isFailure());
		this.setEndTime(new Date());
		long ticks = this.getEndTime().getTime()-this.getStartTime().getTime();
		float hours = (float)ticks/1000.0f/60.0f/60.0f;
		this.setDuration(hours);
		
		return feedback;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public String getArgAsString(int index)  throws Exception{
		String arg = this.getArgs().get(index);
		return arg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public int getArgAsInt(int index)  throws Exception{
		String arg = this.getArgAsString(index);
		int value = Integer.valueOf(arg);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public float getArgAsFloat(int index)  throws Exception{
		String arg = this.getArgAsString(index);
		float value = Float.valueOf(arg);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Date getArgAsDate(int index)  throws Exception{
		return this.getArgAsDate(index, "yyyy-MM-dd");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Date getArgAsDate(int index, String simpleDateFormat)  throws Exception{
		SimpleDateFormat formatter = new SimpleDateFormat(simpleDateFormat);
		String argAsString = this.getArgAsString(index);
		Date date = formatter.parse(argAsString);
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void setArgs()  throws Exception{
		int paramIndex = 0;
		for ( JobParameter param : this.getParameters()){
			switch ( param.getType()){
			case JOB_PARAMETER_TYPE_INT:
				int paramValueAsInt = this.getArgAsInt(paramIndex);
				this.eSet(param.getJobAttribute(), paramValueAsInt);
				break;
			case JOB_PARAMETER_TYPE_FLOAT:
				float paramValueAsFloat = this.getArgAsFloat(paramIndex);
				this.eSet(param.getJobAttribute(), paramValueAsFloat);
				break;
			case JOB_PARAMETER_TYPE_STRING:
				String paramValueAsString = this.getArgAsString(paramIndex);
				this.eSet(param.getJobAttribute(), paramValueAsString);
				break;
			case JOB_PARAMETER_TYPE_ENUM:
				String paramValueAsLiteral = this.getArgAsString(paramIndex);
				EEnum enumType = (EEnum) param.getJobAttribute().getEAttributeType();
				EEnumLiteral literal = enumType.getEEnumLiteralByLiteral(paramValueAsLiteral);
				this.eSet(param.getJobAttribute(), literal.getInstance());
				break;
			case JOB_PARAMETER_TYPE_DATE:
				Date paramValueAsDate= this.getArgAsDate(paramIndex);
				this.eSet(param.getJobAttribute(), paramValueAsDate);
				break;
			}
			paramIndex++;
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
			case JobPackage.JOB__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
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
			case JobPackage.JOB__NAME:
				return getName();
			case JobPackage.JOB__STATUS:
				return getStatus();
			case JobPackage.JOB__DESCRIPTION:
				return getDescription();
			case JobPackage.JOB__HELP_TEXT:
				return getHelpText();
			case JobPackage.JOB__START_TIME:
				return getStartTime();
			case JobPackage.JOB__END_TIME:
				return getEndTime();
			case JobPackage.JOB__DURATION:
				return getDuration();
			case JobPackage.JOB__RUNNING:
				return isRunning();
			case JobPackage.JOB__STOPPED:
				return isStopped();
			case JobPackage.JOB__FINISHED:
				return isFinished();
			case JobPackage.JOB__ARGS:
				return getArgs();
			case JobPackage.JOB__PARAMETERS:
				return getParameters();
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
			case JobPackage.JOB__NAME:
				setName((String)newValue);
				return;
			case JobPackage.JOB__START_TIME:
				setStartTime((Date)newValue);
				return;
			case JobPackage.JOB__END_TIME:
				setEndTime((Date)newValue);
				return;
			case JobPackage.JOB__DURATION:
				setDuration((Float)newValue);
				return;
			case JobPackage.JOB__RUNNING:
				setRunning((Boolean)newValue);
				return;
			case JobPackage.JOB__STOPPED:
				setStopped((Boolean)newValue);
				return;
			case JobPackage.JOB__FINISHED:
				setFinished((Boolean)newValue);
				return;
			case JobPackage.JOB__ARGS:
				getArgs().clear();
				getArgs().addAll((Collection<? extends String>)newValue);
				return;
			case JobPackage.JOB__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends JobParameter>)newValue);
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
			case JobPackage.JOB__NAME:
				setName(NAME_EDEFAULT);
				return;
			case JobPackage.JOB__START_TIME:
				setStartTime(START_TIME_EDEFAULT);
				return;
			case JobPackage.JOB__END_TIME:
				setEndTime(END_TIME_EDEFAULT);
				return;
			case JobPackage.JOB__DURATION:
				setDuration(DURATION_EDEFAULT);
				return;
			case JobPackage.JOB__RUNNING:
				setRunning(RUNNING_EDEFAULT);
				return;
			case JobPackage.JOB__STOPPED:
				setStopped(STOPPED_EDEFAULT);
				return;
			case JobPackage.JOB__FINISHED:
				setFinished(FINISHED_EDEFAULT);
				return;
			case JobPackage.JOB__ARGS:
				getArgs().clear();
				return;
			case JobPackage.JOB__PARAMETERS:
				getParameters().clear();
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
			case JobPackage.JOB__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case JobPackage.JOB__STATUS:
				return STATUS_EDEFAULT == null ? getStatus() != null : !STATUS_EDEFAULT.equals(getStatus());
			case JobPackage.JOB__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? getDescription() != null : !DESCRIPTION_EDEFAULT.equals(getDescription());
			case JobPackage.JOB__HELP_TEXT:
				return HELP_TEXT_EDEFAULT == null ? getHelpText() != null : !HELP_TEXT_EDEFAULT.equals(getHelpText());
			case JobPackage.JOB__START_TIME:
				return START_TIME_EDEFAULT == null ? startTime != null : !START_TIME_EDEFAULT.equals(startTime);
			case JobPackage.JOB__END_TIME:
				return END_TIME_EDEFAULT == null ? endTime != null : !END_TIME_EDEFAULT.equals(endTime);
			case JobPackage.JOB__DURATION:
				return duration != DURATION_EDEFAULT;
			case JobPackage.JOB__RUNNING:
				return running != RUNNING_EDEFAULT;
			case JobPackage.JOB__STOPPED:
				return stopped != STOPPED_EDEFAULT;
			case JobPackage.JOB__FINISHED:
				return finished != FINISHED_EDEFAULT;
			case JobPackage.JOB__ARGS:
				return args != null && !args.isEmpty();
			case JobPackage.JOB__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
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
			case JobPackage.JOB___ADD_PARAMETER__STRING_JOBPARAMETERTYPE_EATTRIBUTE_STRING:
				addParameter((String)arguments.get(0), (JobParameterType)arguments.get(1), (EAttribute)arguments.get(2), (String)arguments.get(3));
				return null;
			case JobPackage.JOB___REFRESH_PARAMETERS:
				refreshParameters();
				return null;
			case JobPackage.JOB___GET_ARG_AS_STRING__INT:
				try {
					return getArgAsString((Integer)arguments.get(0));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case JobPackage.JOB___GET_ARG_AS_INT__INT:
				try {
					return getArgAsInt((Integer)arguments.get(0));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case JobPackage.JOB___GET_ARG_AS_FLOAT__INT:
				try {
					return getArgAsFloat((Integer)arguments.get(0));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case JobPackage.JOB___GET_ARG_AS_DATE__INT:
				try {
					return getArgAsDate((Integer)arguments.get(0));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case JobPackage.JOB___GET_ARG_AS_DATE__INT_STRING:
				try {
					return getArgAsDate((Integer)arguments.get(0), (String)arguments.get(1));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case JobPackage.JOB___SET_ARGS:
				try {
					setArgs();
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
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
		result.append(", StartTime: ");
		result.append(startTime);
		result.append(", EndTime: ");
		result.append(endTime);
		result.append(", Duration: ");
		result.append(duration);
		result.append(", Running: ");
		result.append(running);
		result.append(", Stopped: ");
		result.append(stopped);
		result.append(", Finished: ");
		result.append(finished);
		result.append(", Args: ");
		result.append(args);
		result.append(')');
		return result.toString();
	}

} //JobImpl
