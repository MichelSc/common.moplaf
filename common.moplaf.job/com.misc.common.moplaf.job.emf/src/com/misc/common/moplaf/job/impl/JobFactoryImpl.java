/*******************************************************************************
 * Copyright (c) 2017 Michel Schaffers and others.
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
package com.misc.common.moplaf.job.impl;

import com.misc.common.moplaf.common.EnabledFeedback;
import com.misc.common.moplaf.common.ReturnFeedback;

import com.misc.common.moplaf.job.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JobFactoryImpl extends EFactoryImpl implements JobFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static JobFactory init() {
		try {
			JobFactory theJobFactory = (JobFactory)EPackage.Registry.INSTANCE.getEFactory(JobPackage.eNS_URI);
			if (theJobFactory != null) {
				return theJobFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new JobFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JobFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case JobPackage.JOB_PARAMETER: return createJobParameter();
			case JobPackage.RUN_PARAMS: return createRunParams();
			case JobPackage.RUN: return createRun();
			case JobPackage.JOB: return createJob();
			case JobPackage.JOB_CONSOLE: return createJobConsole();
			case JobPackage.SETTER: return createSetter();
			case JobPackage.SETTER_ATTRIBUTE_INT: return createSetterAttributeInt();
			case JobPackage.SETTER_ATTRIBUTE_FLOAT: return createSetterAttributeFloat();
			case JobPackage.PARAMS_HOLDER: return createParamsHolder();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case JobPackage.JOB_PARAMETER_TYPE:
				return createJobParameterTypeFromString(eDataType, initialValue);
			case JobPackage.PROGRESS_FEEDBACK:
				return createProgressFeedbackFromString(eDataType, initialValue);
			case JobPackage.RUN_CONTEXT:
				return createRunContextFromString(eDataType, initialValue);
			case JobPackage.EXCEPTION:
				return createExceptionFromString(eDataType, initialValue);
			case JobPackage.RETURN_FEEDBACK:
				return createReturnFeedbackFromString(eDataType, initialValue);
			case JobPackage.ENABLED_FEEDBACK:
				return createEnabledFeedbackFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case JobPackage.JOB_PARAMETER_TYPE:
				return convertJobParameterTypeToString(eDataType, instanceValue);
			case JobPackage.PROGRESS_FEEDBACK:
				return convertProgressFeedbackToString(eDataType, instanceValue);
			case JobPackage.RUN_CONTEXT:
				return convertRunContextToString(eDataType, instanceValue);
			case JobPackage.EXCEPTION:
				return convertExceptionToString(eDataType, instanceValue);
			case JobPackage.RETURN_FEEDBACK:
				return convertReturnFeedbackToString(eDataType, instanceValue);
			case JobPackage.ENABLED_FEEDBACK:
				return convertEnabledFeedbackToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JobParameter createJobParameter() {
		JobParameterImpl jobParameter = new JobParameterImpl();
		return jobParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RunParams createRunParams() {
		RunParamsImpl runParams = new RunParamsImpl();
		return runParams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Run createRun() {
		RunImpl run = new RunImpl();
		return run;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Job createJob() {
		JobImpl job = new JobImpl();
		return job;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JobConsole createJobConsole() {
		JobConsoleImpl jobConsole = new JobConsoleImpl();
		return jobConsole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Setter createSetter() {
		SetterImpl setter = new SetterImpl();
		return setter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetterAttributeInt createSetterAttributeInt() {
		SetterAttributeIntImpl setterAttributeInt = new SetterAttributeIntImpl();
		return setterAttributeInt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetterAttributeFloat createSetterAttributeFloat() {
		SetterAttributeFloatImpl setterAttributeFloat = new SetterAttributeFloatImpl();
		return setterAttributeFloat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParamsHolder createParamsHolder() {
		ParamsHolderImpl paramsHolder = new ParamsHolderImpl();
		return paramsHolder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JobParameterType createJobParameterTypeFromString(EDataType eDataType, String initialValue) {
		JobParameterType result = JobParameterType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJobParameterTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgressFeedback createProgressFeedbackFromString(EDataType eDataType, String initialValue) {
		return (ProgressFeedback)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProgressFeedbackToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RunContext createRunContextFromString(EDataType eDataType, String initialValue) {
		return (RunContext)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRunContextToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Exception createExceptionFromString(EDataType eDataType, String initialValue) {
		return (Exception)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExceptionToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReturnFeedback createReturnFeedbackFromString(EDataType eDataType, String initialValue) {
		return (ReturnFeedback)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReturnFeedbackToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnabledFeedback createEnabledFeedbackFromString(EDataType eDataType, String initialValue) {
		return (EnabledFeedback)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnabledFeedbackToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JobPackage getJobPackage() {
		return (JobPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static JobPackage getPackage() {
		return JobPackage.eINSTANCE;
	}

} //JobFactoryImpl
