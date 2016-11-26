/**
 */
package com.misc.common.moplaf.job.impl;

import com.misc.common.moplaf.job.JobConsole;
import com.misc.common.moplaf.job.JobFactory;
import com.misc.common.moplaf.job.JobPackage;
import com.misc.common.moplaf.job.JobParameter;
import com.misc.common.moplaf.job.JobParameterType;

import java.lang.reflect.InvocationTargetException;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Console</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.job.impl.JobConsoleImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.impl.JobConsoleImpl#getHelpText <em>Help Text</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.impl.JobConsoleImpl#getArgs <em>Args</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JobConsoleImpl extends JobImpl implements JobConsole {
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
	 * The default value of the '{@link #getHelpText() <em>Help Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHelpText()
	 * @generated
	 * @ordered
	 */
	protected static final String HELP_TEXT_EDEFAULT = null;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JobConsoleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JobPackage.Literals.JOB_CONSOLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JobParameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<JobParameter>(JobParameter.class, this, JobPackage.JOB_CONSOLE__PARAMETERS);
		}
		return parameters;
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
	public EList<String> getArgs() {
		if (args == null) {
			args = new EDataTypeUniqueEList<String>(String.class, this, JobPackage.JOB_CONSOLE__ARGS);
		}
		return args;
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
			case JobPackage.JOB_CONSOLE__PARAMETERS:
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
			case JobPackage.JOB_CONSOLE__PARAMETERS:
				return getParameters();
			case JobPackage.JOB_CONSOLE__HELP_TEXT:
				return getHelpText();
			case JobPackage.JOB_CONSOLE__ARGS:
				return getArgs();
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
			case JobPackage.JOB_CONSOLE__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends JobParameter>)newValue);
				return;
			case JobPackage.JOB_CONSOLE__ARGS:
				getArgs().clear();
				getArgs().addAll((Collection<? extends String>)newValue);
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
			case JobPackage.JOB_CONSOLE__PARAMETERS:
				getParameters().clear();
				return;
			case JobPackage.JOB_CONSOLE__ARGS:
				getArgs().clear();
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
			case JobPackage.JOB_CONSOLE__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case JobPackage.JOB_CONSOLE__HELP_TEXT:
				return HELP_TEXT_EDEFAULT == null ? getHelpText() != null : !HELP_TEXT_EDEFAULT.equals(getHelpText());
			case JobPackage.JOB_CONSOLE__ARGS:
				return args != null && !args.isEmpty();
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
			case JobPackage.JOB_CONSOLE___ADD_PARAMETER__STRING_JOBPARAMETERTYPE_EATTRIBUTE_STRING:
				addParameter((String)arguments.get(0), (JobParameterType)arguments.get(1), (EAttribute)arguments.get(2), (String)arguments.get(3));
				return null;
			case JobPackage.JOB_CONSOLE___REFRESH_PARAMETERS:
				refreshParameters();
				return null;
			case JobPackage.JOB_CONSOLE___GET_ARG_AS_STRING__INT:
				try {
					return getArgAsString((Integer)arguments.get(0));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case JobPackage.JOB_CONSOLE___GET_ARG_AS_INT__INT:
				try {
					return getArgAsInt((Integer)arguments.get(0));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case JobPackage.JOB_CONSOLE___GET_ARG_AS_FLOAT__INT:
				try {
					return getArgAsFloat((Integer)arguments.get(0));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case JobPackage.JOB_CONSOLE___GET_ARG_AS_DATE__INT:
				try {
					return getArgAsDate((Integer)arguments.get(0));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case JobPackage.JOB_CONSOLE___GET_ARG_AS_DATE__INT_STRING:
				try {
					return getArgAsDate((Integer)arguments.get(0), (String)arguments.get(1));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case JobPackage.JOB_CONSOLE___SET_ARGS:
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
		result.append(" (Args: ");
		result.append(args);
		result.append(')');
		return result.toString();
	}

} //JobConsoleImpl
