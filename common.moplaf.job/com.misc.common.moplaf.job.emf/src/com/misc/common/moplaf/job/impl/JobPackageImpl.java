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
package com.misc.common.moplaf.job.impl;

import com.misc.common.moplaf.common.EnabledFeedback;
import com.misc.common.moplaf.common.ReturnFeedback;

import com.misc.common.moplaf.file.FilePackage;
import com.misc.common.moplaf.job.CompoundDoc;
import com.misc.common.moplaf.job.Doc;
import com.misc.common.moplaf.job.DocInDocsHolder;
import com.misc.common.moplaf.job.DocRef;
import com.misc.common.moplaf.job.Docs;
import com.misc.common.moplaf.job.DocsHolder;
import com.misc.common.moplaf.job.DomainTask;
import com.misc.common.moplaf.job.Job;
import com.misc.common.moplaf.job.JobConsole;
import com.misc.common.moplaf.job.JobFactory;
import com.misc.common.moplaf.job.JobFileHandler;
import com.misc.common.moplaf.job.JobPackage;
import com.misc.common.moplaf.job.JobParameter;
import com.misc.common.moplaf.job.JobParameterType;
import com.misc.common.moplaf.job.KeyIndicator;
import com.misc.common.moplaf.job.KeyIndicatorDate;
import com.misc.common.moplaf.job.KeyIndicatorDouble;
import com.misc.common.moplaf.job.KeyIndicatorInt;
import com.misc.common.moplaf.job.KeyIndicatorString;
import com.misc.common.moplaf.job.KeyIndicators;
import com.misc.common.moplaf.job.ParamsHolder;
import com.misc.common.moplaf.job.ProgressFeedback;
import com.misc.common.moplaf.job.Run;
import com.misc.common.moplaf.job.RunContext;

import com.misc.common.moplaf.job.RunParams;
import com.misc.common.moplaf.job.Runs;
import com.misc.common.moplaf.job.Setter;
import com.misc.common.moplaf.job.SetterAttribute;
import com.misc.common.moplaf.job.SetterAttributeFloat;
import com.misc.common.moplaf.job.SetterAttributeInt;
import com.misc.common.moplaf.job.SetterStructuralFeature;
import com.misc.common.moplaf.job.Task;
import com.misc.common.moplaf.job.TaskDoc;
import com.misc.common.moplaf.job.TaskDomain;
import com.misc.common.moplaf.job.TaskInput;
import com.misc.common.moplaf.job.TaskOutput;
import com.misc.common.moplaf.job.Tasks;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JobPackageImpl extends EPackageImpl implements JobPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jobParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass runParamsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass runEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jobEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jobConsoleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jobFileHandlerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass runsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskDocEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskInputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskOutputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass docEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass docRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tasksEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass docsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskDomainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass keyIndicatorsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass keyIndicatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass keyIndicatorDoubleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass keyIndicatorIntEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass keyIndicatorDateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass keyIndicatorStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass docsHolderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compoundDocEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass docInDocsHolderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setterStructuralFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setterAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setterAttributeIntEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setterAttributeFloatEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paramsHolderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum jobParameterTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType progressFeedbackEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType runContextEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType exceptionEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType returnFeedbackEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enabledFeedbackEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see com.misc.common.moplaf.job.JobPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private JobPackageImpl() {
		super(eNS_URI, JobFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link JobPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static JobPackage init() {
		if (isInited) return (JobPackage)EPackage.Registry.INSTANCE.getEPackage(JobPackage.eNS_URI);

		// Obtain or create and register package
		JobPackageImpl theJobPackage = (JobPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof JobPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new JobPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		FilePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theJobPackage.createPackageContents();

		// Initialize created meta-data
		theJobPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theJobPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(JobPackage.eNS_URI, theJobPackage);
		return theJobPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJobParameter() {
		return jobParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJobParameter_Name() {
		return (EAttribute)jobParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJobParameter_Type() {
		return (EAttribute)jobParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJobParameter_JobAttribute() {
		return (EReference)jobParameterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJobParameter_Description() {
		return (EAttribute)jobParameterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRunParams() {
		return runParamsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRunParams__CopyParams__RunParams() {
		return runParamsEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRun() {
		return runEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRun_RunFeedback() {
		return (EAttribute)runEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRun_CancelFeedback() {
		return (EAttribute)runEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRun_ResetFeedback() {
		return (EAttribute)runEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRun_Label() {
		return (EAttribute)runEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRun_Cancelled() {
		return (EAttribute)runEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRun_Returned() {
		return (EAttribute)runEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRun_ReturnSuccess() {
		return (EAttribute)runEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRun_ReturnFeedback() {
		return (EAttribute)runEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRun_ReturnInformation() {
		return (EAttribute)runEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRun__Reset() {
		return runEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRun__Run() {
		return runEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRun__Run__RunContext() {
		return runEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRun__RunAsynch__RunContext() {
		return runEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRun__RunAsynch__RunContext_boolean() {
		return runEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRun__Cancel() {
		return runEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRun__SetProgress__String_float() {
		return runEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRun__SetProgress__ProgressFeedback() {
		return runEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRun__GetReturn() {
		return runEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRun__SetReturn__ReturnFeedback() {
		return runEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRun__ConstructParams() {
		return runEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJob() {
		return jobEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJob_Status() {
		return (EAttribute)jobEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJob_Description() {
		return (EAttribute)jobEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJob_StartTime() {
		return (EAttribute)jobEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJob_EndTime() {
		return (EAttribute)jobEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJob_Duration() {
		return (EAttribute)jobEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJob_Started() {
		return (EAttribute)jobEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJob_Finished() {
		return (EAttribute)jobEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJob_Name() {
		return (EAttribute)jobEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJobConsole() {
		return jobConsoleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJobConsole_Parameters() {
		return (EReference)jobConsoleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJobConsole_HelpText() {
		return (EAttribute)jobConsoleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJobConsole_Args() {
		return (EAttribute)jobConsoleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getJobConsole__AddParameter__String_JobParameterType_EAttribute_String() {
		return jobConsoleEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getJobConsole__RefreshParameters() {
		return jobConsoleEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getJobConsole__GetArgAsString__int() {
		return jobConsoleEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getJobConsole__GetArgAsInt__int() {
		return jobConsoleEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getJobConsole__GetArgAsFloat__int() {
		return jobConsoleEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getJobConsole__GetArgAsDate__int() {
		return jobConsoleEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getJobConsole__GetArgAsDate__int_String() {
		return jobConsoleEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getJobConsole__SetArgs() {
		return jobConsoleEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJobFileHandler() {
		return jobFileHandlerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRuns() {
		return runsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRuns_Name() {
		return (EAttribute)runsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRuns_Runs() {
		return (EReference)runsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTask() {
		return taskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_CloneFeedback() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_Outputs() {
		return (EReference)taskEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask__IsValidInput__Doc() {
		return taskEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask__IsValidOutput__Doc() {
		return taskEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_Inputs() {
		return (EReference)taskEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask__AddInputDoc__Doc() {
		return taskEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask__AddInputDocs__EList() {
		return taskEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask__InitOutputs() {
		return taskEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask__Clone() {
		return taskEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask__AddOutputDoc__Doc() {
		return taskEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask__AddOutputDocs__EList() {
		return taskEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomainTask() {
		return domainTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainTask_Domain() {
		return (EReference)domainTaskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTaskDoc() {
		return taskDocEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskDoc_Role() {
		return (EAttribute)taskDocEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTaskInput() {
		return taskInputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskInput_Consumer() {
		return (EReference)taskInputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTaskOutput() {
		return taskOutputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskOutput_Producer() {
		return (EReference)taskOutputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDoc() {
		return docEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDoc_CloneFeedback() {
		return (EAttribute)docEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDoc_FlushFeedback() {
		return (EAttribute)docEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDoc_Refs() {
		return (EReference)docEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDoc__Clone() {
		return docEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDoc_Loaded() {
		return (EAttribute)docEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDoc_Description() {
		return (EAttribute)docEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDoc__Save() {
		return docEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDoc__Load() {
		return docEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDoc__Flush() {
		return docEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocRef() {
		return docRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocRef_Doc() {
		return (EReference)docRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTasks() {
		return tasksEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTasks_Tasks() {
		return (EReference)tasksEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocs() {
		return docsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocs_Docs() {
		return (EReference)docsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDocs__GarbageCollect() {
		return docsEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTaskDomain() {
		return taskDomainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTaskDomain__GetNewTasks() {
		return taskDomainEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKeyIndicators() {
		return keyIndicatorsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKeyIndicators_Indicators() {
		return (EReference)keyIndicatorsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getKeyIndicators__RefreshKeyIndicators() {
		return keyIndicatorsEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKeyIndicator() {
		return keyIndicatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeyIndicator_Description() {
		return (EAttribute)keyIndicatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeyIndicator_FormattedValue() {
		return (EAttribute)keyIndicatorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeyIndicator_Name() {
		return (EAttribute)keyIndicatorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKeyIndicatorDouble() {
		return keyIndicatorDoubleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeyIndicatorDouble_Value() {
		return (EAttribute)keyIndicatorDoubleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKeyIndicatorInt() {
		return keyIndicatorIntEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeyIndicatorInt_Value() {
		return (EAttribute)keyIndicatorIntEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKeyIndicatorDate() {
		return keyIndicatorDateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeyIndicatorDate_Date() {
		return (EAttribute)keyIndicatorDateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeyIndicatorDate_Format() {
		return (EAttribute)keyIndicatorDateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKeyIndicatorString() {
		return keyIndicatorStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeyIndicatorString_Value() {
		return (EAttribute)keyIndicatorStringEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocsHolder() {
		return docsHolderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocsHolder_Docs() {
		return (EReference)docsHolderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocsHolder_Name() {
		return (EAttribute)docsHolderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDocsHolder__AddDoc__Doc() {
		return docsHolderEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDocsHolder__AddDocs__EList() {
		return docsHolderEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompoundDoc() {
		return compoundDocEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocInDocsHolder() {
		return docInDocsHolderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocInDocsHolder_DocsHolder() {
		return (EReference)docInDocsHolderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSetter() {
		return setterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetter_Features() {
		return (EReference)setterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetter_Name() {
		return (EAttribute)setterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetter_Remarks() {
		return (EAttribute)setterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetter_TargetClass() {
		return (EReference)setterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSetter__Accept__EObject() {
		return setterEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSetter__Init__EObject() {
		return setterEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSetterStructuralFeature() {
		return setterStructuralFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetterStructuralFeature_Setter() {
		return (EReference)setterStructuralFeatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetterStructuralFeature_FeatureToSet() {
		return (EReference)setterStructuralFeatureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetterStructuralFeature_Description() {
		return (EAttribute)setterStructuralFeatureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSetterStructuralFeature__Accept__EObject() {
		return setterStructuralFeatureEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSetterAttribute() {
		return setterAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetterAttribute_AttributeToSet() {
		return (EReference)setterAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSetterAttributeInt() {
		return setterAttributeIntEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetterAttributeInt_Value() {
		return (EAttribute)setterAttributeIntEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSetterAttributeFloat() {
		return setterAttributeFloatEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetterAttributeFloat_Value() {
		return (EAttribute)setterAttributeFloatEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParamsHolder() {
		return paramsHolderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParamsHolder_RunsParams() {
		return (EReference)paramsHolderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParamsHolder__ConstructParams__Run() {
		return paramsHolderEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getJobParameterType() {
		return jobParameterTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getProgressFeedback() {
		return progressFeedbackEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getRunContext() {
		return runContextEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getException() {
		return exceptionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getReturnFeedback() {
		return returnFeedbackEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEnabledFeedback() {
		return enabledFeedbackEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JobFactory getJobFactory() {
		return (JobFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		jobParameterEClass = createEClass(JOB_PARAMETER);
		createEAttribute(jobParameterEClass, JOB_PARAMETER__NAME);
		createEAttribute(jobParameterEClass, JOB_PARAMETER__TYPE);
		createEReference(jobParameterEClass, JOB_PARAMETER__JOB_ATTRIBUTE);
		createEAttribute(jobParameterEClass, JOB_PARAMETER__DESCRIPTION);

		runParamsEClass = createEClass(RUN_PARAMS);
		createEOperation(runParamsEClass, RUN_PARAMS___COPY_PARAMS__RUNPARAMS);

		runEClass = createEClass(RUN);
		createEAttribute(runEClass, RUN__RUN_FEEDBACK);
		createEAttribute(runEClass, RUN__CANCEL_FEEDBACK);
		createEAttribute(runEClass, RUN__RESET_FEEDBACK);
		createEAttribute(runEClass, RUN__LABEL);
		createEAttribute(runEClass, RUN__CANCELLED);
		createEAttribute(runEClass, RUN__RETURNED);
		createEAttribute(runEClass, RUN__RETURN_SUCCESS);
		createEAttribute(runEClass, RUN__RETURN_FEEDBACK);
		createEAttribute(runEClass, RUN__RETURN_INFORMATION);
		createEOperation(runEClass, RUN___RESET);
		createEOperation(runEClass, RUN___RUN);
		createEOperation(runEClass, RUN___RUN__RUNCONTEXT);
		createEOperation(runEClass, RUN___RUN_ASYNCH__RUNCONTEXT);
		createEOperation(runEClass, RUN___RUN_ASYNCH__RUNCONTEXT_BOOLEAN);
		createEOperation(runEClass, RUN___CANCEL);
		createEOperation(runEClass, RUN___SET_PROGRESS__STRING_FLOAT);
		createEOperation(runEClass, RUN___SET_PROGRESS__PROGRESSFEEDBACK);
		createEOperation(runEClass, RUN___SET_RETURN__RETURNFEEDBACK);
		createEOperation(runEClass, RUN___GET_RETURN);
		createEOperation(runEClass, RUN___CONSTRUCT_PARAMS);

		jobEClass = createEClass(JOB);
		createEAttribute(jobEClass, JOB__DESCRIPTION);
		createEAttribute(jobEClass, JOB__STATUS);
		createEAttribute(jobEClass, JOB__NAME);
		createEAttribute(jobEClass, JOB__STARTED);
		createEAttribute(jobEClass, JOB__FINISHED);
		createEAttribute(jobEClass, JOB__START_TIME);
		createEAttribute(jobEClass, JOB__END_TIME);
		createEAttribute(jobEClass, JOB__DURATION);

		jobConsoleEClass = createEClass(JOB_CONSOLE);
		createEReference(jobConsoleEClass, JOB_CONSOLE__PARAMETERS);
		createEAttribute(jobConsoleEClass, JOB_CONSOLE__HELP_TEXT);
		createEAttribute(jobConsoleEClass, JOB_CONSOLE__ARGS);
		createEOperation(jobConsoleEClass, JOB_CONSOLE___ADD_PARAMETER__STRING_JOBPARAMETERTYPE_EATTRIBUTE_STRING);
		createEOperation(jobConsoleEClass, JOB_CONSOLE___REFRESH_PARAMETERS);
		createEOperation(jobConsoleEClass, JOB_CONSOLE___GET_ARG_AS_STRING__INT);
		createEOperation(jobConsoleEClass, JOB_CONSOLE___GET_ARG_AS_INT__INT);
		createEOperation(jobConsoleEClass, JOB_CONSOLE___GET_ARG_AS_FLOAT__INT);
		createEOperation(jobConsoleEClass, JOB_CONSOLE___GET_ARG_AS_DATE__INT);
		createEOperation(jobConsoleEClass, JOB_CONSOLE___GET_ARG_AS_DATE__INT_STRING);
		createEOperation(jobConsoleEClass, JOB_CONSOLE___SET_ARGS);

		setterEClass = createEClass(SETTER);
		createEReference(setterEClass, SETTER__FEATURES);
		createEAttribute(setterEClass, SETTER__NAME);
		createEAttribute(setterEClass, SETTER__REMARKS);
		createEReference(setterEClass, SETTER__TARGET_CLASS);
		createEOperation(setterEClass, SETTER___ACCEPT__EOBJECT);
		createEOperation(setterEClass, SETTER___INIT__EOBJECT);

		setterStructuralFeatureEClass = createEClass(SETTER_STRUCTURAL_FEATURE);
		createEReference(setterStructuralFeatureEClass, SETTER_STRUCTURAL_FEATURE__SETTER);
		createEReference(setterStructuralFeatureEClass, SETTER_STRUCTURAL_FEATURE__FEATURE_TO_SET);
		createEAttribute(setterStructuralFeatureEClass, SETTER_STRUCTURAL_FEATURE__DESCRIPTION);
		createEOperation(setterStructuralFeatureEClass, SETTER_STRUCTURAL_FEATURE___ACCEPT__EOBJECT);

		setterAttributeEClass = createEClass(SETTER_ATTRIBUTE);
		createEReference(setterAttributeEClass, SETTER_ATTRIBUTE__ATTRIBUTE_TO_SET);

		setterAttributeIntEClass = createEClass(SETTER_ATTRIBUTE_INT);
		createEAttribute(setterAttributeIntEClass, SETTER_ATTRIBUTE_INT__VALUE);

		setterAttributeFloatEClass = createEClass(SETTER_ATTRIBUTE_FLOAT);
		createEAttribute(setterAttributeFloatEClass, SETTER_ATTRIBUTE_FLOAT__VALUE);

		paramsHolderEClass = createEClass(PARAMS_HOLDER);
		createEReference(paramsHolderEClass, PARAMS_HOLDER__RUNS_PARAMS);
		createEOperation(paramsHolderEClass, PARAMS_HOLDER___CONSTRUCT_PARAMS__RUN);

		jobFileHandlerEClass = createEClass(JOB_FILE_HANDLER);

		runsEClass = createEClass(RUNS);
		createEAttribute(runsEClass, RUNS__NAME);
		createEReference(runsEClass, RUNS__RUNS);

		docEClass = createEClass(DOC);
		createEAttribute(docEClass, DOC__CLONE_FEEDBACK);
		createEAttribute(docEClass, DOC__FLUSH_FEEDBACK);
		createEAttribute(docEClass, DOC__DESCRIPTION);
		createEAttribute(docEClass, DOC__LOADED);
		createEReference(docEClass, DOC__REFS);
		createEOperation(docEClass, DOC___CLONE);
		createEOperation(docEClass, DOC___FLUSH);
		createEOperation(docEClass, DOC___SAVE);
		createEOperation(docEClass, DOC___LOAD);

		docRefEClass = createEClass(DOC_REF);
		createEReference(docRefEClass, DOC_REF__DOC);

		docsHolderEClass = createEClass(DOCS_HOLDER);
		createEReference(docsHolderEClass, DOCS_HOLDER__DOCS);
		createEAttribute(docsHolderEClass, DOCS_HOLDER__NAME);
		createEOperation(docsHolderEClass, DOCS_HOLDER___ADD_DOC__DOC);
		createEOperation(docsHolderEClass, DOCS_HOLDER___ADD_DOCS__ELIST);

		compoundDocEClass = createEClass(COMPOUND_DOC);

		docInDocsHolderEClass = createEClass(DOC_IN_DOCS_HOLDER);
		createEReference(docInDocsHolderEClass, DOC_IN_DOCS_HOLDER__DOCS_HOLDER);

		taskEClass = createEClass(TASK);
		createEAttribute(taskEClass, TASK__CLONE_FEEDBACK);
		createEReference(taskEClass, TASK__INPUTS);
		createEReference(taskEClass, TASK__OUTPUTS);
		createEOperation(taskEClass, TASK___IS_VALID_INPUT__DOC);
		createEOperation(taskEClass, TASK___IS_VALID_OUTPUT__DOC);
		createEOperation(taskEClass, TASK___ADD_INPUT_DOC__DOC);
		createEOperation(taskEClass, TASK___ADD_INPUT_DOCS__ELIST);
		createEOperation(taskEClass, TASK___INIT_OUTPUTS);
		createEOperation(taskEClass, TASK___CLONE);
		createEOperation(taskEClass, TASK___ADD_OUTPUT_DOC__DOC);
		createEOperation(taskEClass, TASK___ADD_OUTPUT_DOCS__ELIST);

		domainTaskEClass = createEClass(DOMAIN_TASK);
		createEReference(domainTaskEClass, DOMAIN_TASK__DOMAIN);

		taskDocEClass = createEClass(TASK_DOC);
		createEAttribute(taskDocEClass, TASK_DOC__ROLE);

		taskInputEClass = createEClass(TASK_INPUT);
		createEReference(taskInputEClass, TASK_INPUT__CONSUMER);

		taskOutputEClass = createEClass(TASK_OUTPUT);
		createEReference(taskOutputEClass, TASK_OUTPUT__PRODUCER);

		tasksEClass = createEClass(TASKS);
		createEReference(tasksEClass, TASKS__TASKS);

		docsEClass = createEClass(DOCS);
		createEReference(docsEClass, DOCS__DOCS);
		createEOperation(docsEClass, DOCS___GARBAGE_COLLECT);

		taskDomainEClass = createEClass(TASK_DOMAIN);
		createEOperation(taskDomainEClass, TASK_DOMAIN___GET_NEW_TASKS);

		keyIndicatorsEClass = createEClass(KEY_INDICATORS);
		createEReference(keyIndicatorsEClass, KEY_INDICATORS__INDICATORS);
		createEOperation(keyIndicatorsEClass, KEY_INDICATORS___REFRESH_KEY_INDICATORS);

		keyIndicatorEClass = createEClass(KEY_INDICATOR);
		createEAttribute(keyIndicatorEClass, KEY_INDICATOR__DESCRIPTION);
		createEAttribute(keyIndicatorEClass, KEY_INDICATOR__FORMATTED_VALUE);
		createEAttribute(keyIndicatorEClass, KEY_INDICATOR__NAME);

		keyIndicatorDoubleEClass = createEClass(KEY_INDICATOR_DOUBLE);
		createEAttribute(keyIndicatorDoubleEClass, KEY_INDICATOR_DOUBLE__VALUE);

		keyIndicatorIntEClass = createEClass(KEY_INDICATOR_INT);
		createEAttribute(keyIndicatorIntEClass, KEY_INDICATOR_INT__VALUE);

		keyIndicatorDateEClass = createEClass(KEY_INDICATOR_DATE);
		createEAttribute(keyIndicatorDateEClass, KEY_INDICATOR_DATE__DATE);
		createEAttribute(keyIndicatorDateEClass, KEY_INDICATOR_DATE__FORMAT);

		keyIndicatorStringEClass = createEClass(KEY_INDICATOR_STRING);
		createEAttribute(keyIndicatorStringEClass, KEY_INDICATOR_STRING__VALUE);

		// Create enums
		jobParameterTypeEEnum = createEEnum(JOB_PARAMETER_TYPE);

		// Create data types
		progressFeedbackEDataType = createEDataType(PROGRESS_FEEDBACK);
		runContextEDataType = createEDataType(RUN_CONTEXT);
		exceptionEDataType = createEDataType(EXCEPTION);
		returnFeedbackEDataType = createEDataType(RETURN_FEEDBACK);
		enabledFeedbackEDataType = createEDataType(ENABLED_FEEDBACK);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		FilePackage theFilePackage = (FilePackage)EPackage.Registry.INSTANCE.getEPackage(FilePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		runEClass.getESuperTypes().add(this.getRunParams());
		jobEClass.getESuperTypes().add(this.getRun());
		jobConsoleEClass.getESuperTypes().add(this.getJob());
		setterAttributeEClass.getESuperTypes().add(this.getSetterStructuralFeature());
		setterAttributeIntEClass.getESuperTypes().add(this.getSetterAttribute());
		setterAttributeFloatEClass.getESuperTypes().add(this.getSetterAttribute());
		jobFileHandlerEClass.getESuperTypes().add(this.getJob());
		jobFileHandlerEClass.getESuperTypes().add(theFilePackage.getFileHandler());
		docEClass.getESuperTypes().add(this.getKeyIndicators());
		compoundDocEClass.getESuperTypes().add(this.getDoc());
		compoundDocEClass.getESuperTypes().add(this.getDocsHolder());
		docInDocsHolderEClass.getESuperTypes().add(this.getDocRef());
		taskEClass.getESuperTypes().add(this.getJob());
		taskEClass.getESuperTypes().add(this.getKeyIndicators());
		domainTaskEClass.getESuperTypes().add(this.getTask());
		taskDocEClass.getESuperTypes().add(this.getDocRef());
		taskInputEClass.getESuperTypes().add(this.getTaskDoc());
		taskOutputEClass.getESuperTypes().add(this.getTaskDoc());
		taskDomainEClass.getESuperTypes().add(this.getDocs());
		taskDomainEClass.getESuperTypes().add(this.getTasks());
		keyIndicatorDoubleEClass.getESuperTypes().add(this.getKeyIndicator());
		keyIndicatorIntEClass.getESuperTypes().add(this.getKeyIndicator());
		keyIndicatorDateEClass.getESuperTypes().add(this.getKeyIndicator());
		keyIndicatorStringEClass.getESuperTypes().add(this.getKeyIndicator());

		// Initialize classes, features, and operations; add parameters
		initEClass(jobParameterEClass, JobParameter.class, "JobParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJobParameter_Name(), ecorePackage.getEString(), "Name", null, 0, 1, JobParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJobParameter_Type(), this.getJobParameterType(), "Type", null, 0, 1, JobParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJobParameter_JobAttribute(), ecorePackage.getEAttribute(), null, "JobAttribute", null, 0, 1, JobParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJobParameter_Description(), ecorePackage.getEString(), "Description", null, 0, 1, JobParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(runParamsEClass, RunParams.class, "RunParams", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getRunParams__CopyParams__RunParams(), null, "copyParams", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRunParams(), "other", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(runEClass, Run.class, "Run", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRun_RunFeedback(), this.getEnabledFeedback(), "RunFeedback", null, 0, 1, Run.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getRun_CancelFeedback(), this.getEnabledFeedback(), "CancelFeedback", null, 0, 1, Run.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getRun_ResetFeedback(), this.getEnabledFeedback(), "ResetFeedback", null, 0, 1, Run.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getRun_Label(), ecorePackage.getEString(), "Label", null, 0, 1, Run.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getRun_Cancelled(), ecorePackage.getEBoolean(), "Cancelled", null, 0, 1, Run.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRun_Returned(), ecorePackage.getEBoolean(), "Returned", null, 0, 1, Run.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRun_ReturnSuccess(), ecorePackage.getEBoolean(), "ReturnSuccess", null, 0, 1, Run.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRun_ReturnFeedback(), ecorePackage.getEString(), "ReturnFeedback", null, 0, 1, Run.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRun_ReturnInformation(), ecorePackage.getEString(), "ReturnInformation", null, 0, 1, Run.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getRun__Reset(), null, "reset", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getRun__Run(), this.getReturnFeedback(), "run", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRun__Run__RunContext(), this.getReturnFeedback(), "run", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRunContext(), "runContext", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRun__RunAsynch__RunContext(), null, "runAsynch", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRunContext(), "runContext", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRun__RunAsynch__RunContext_boolean(), null, "runAsynch", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRunContext(), "runContext", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "background", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getRun__Cancel(), null, "cancel", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRun__SetProgress__String_float(), ecorePackage.getEBoolean(), "setProgress", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "task", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEFloat(), "work", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRun__SetProgress__ProgressFeedback(), ecorePackage.getEBoolean(), "setProgress", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getProgressFeedback(), "progress", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRun__SetReturn__ReturnFeedback(), null, "setReturn", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getReturnFeedback(), "feedback", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getRun__GetReturn(), this.getReturnFeedback(), "getReturn", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getRun__ConstructParams(), this.getRunParams(), "constructParams", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(jobEClass, Job.class, "Job", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJob_Description(), ecorePackage.getEString(), "Description", null, 0, 1, Job.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getJob_Status(), ecorePackage.getEString(), "Status", null, 0, 1, Job.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getJob_Name(), ecorePackage.getEString(), "Name", "<new Job>", 0, 1, Job.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJob_Started(), ecorePackage.getEBoolean(), "Started", null, 0, 1, Job.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJob_Finished(), ecorePackage.getEBoolean(), "Finished", null, 0, 1, Job.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJob_StartTime(), ecorePackage.getEDate(), "StartTime", null, 0, 1, Job.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJob_EndTime(), ecorePackage.getEDate(), "EndTime", null, 0, 1, Job.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJob_Duration(), ecorePackage.getEFloat(), "Duration", null, 0, 1, Job.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jobConsoleEClass, JobConsole.class, "JobConsole", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJobConsole_Parameters(), this.getJobParameter(), null, "Parameters", null, 0, -1, JobConsole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJobConsole_HelpText(), ecorePackage.getEString(), "HelpText", null, 0, 1, JobConsole.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getJobConsole_Args(), ecorePackage.getEString(), "Args", null, 0, -1, JobConsole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getJobConsole__AddParameter__String_JobParameterType_EAttribute_String(), null, "addParameter", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getJobParameterType(), "type", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEAttribute(), "attribute", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "description", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getJobConsole__RefreshParameters(), null, "refreshParameters", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getJobConsole__GetArgAsString__int(), ecorePackage.getEString(), "getArgAsString", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "index", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getException());

		op = initEOperation(getJobConsole__GetArgAsInt__int(), ecorePackage.getEInt(), "getArgAsInt", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "index", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getException());

		op = initEOperation(getJobConsole__GetArgAsFloat__int(), ecorePackage.getEFloat(), "getArgAsFloat", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "index", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getException());

		op = initEOperation(getJobConsole__GetArgAsDate__int(), ecorePackage.getEDate(), "getArgAsDate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "index", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getException());

		op = initEOperation(getJobConsole__GetArgAsDate__int_String(), ecorePackage.getEDate(), "getArgAsDate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "index", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "simpleDateFormat", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getException());

		op = initEOperation(getJobConsole__SetArgs(), null, "setArgs", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getException());

		initEClass(setterEClass, Setter.class, "Setter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSetter_Features(), this.getSetterStructuralFeature(), this.getSetterStructuralFeature_Setter(), "Features", null, 0, -1, Setter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSetter_Name(), ecorePackage.getEString(), "Name", null, 0, 1, Setter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSetter_Remarks(), ecorePackage.getEString(), "Remarks", null, 0, 1, Setter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSetter_TargetClass(), ecorePackage.getEClass(), null, "TargetClass", null, 0, 1, Setter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getSetter__Accept__EObject(), null, "accept", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "objectToSetFeatures", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSetter__Init__EObject(), null, "init", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "objectToGetFeatures", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(setterStructuralFeatureEClass, SetterStructuralFeature.class, "SetterStructuralFeature", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSetterStructuralFeature_Setter(), this.getSetter(), this.getSetter_Features(), "Setter", null, 1, 1, SetterStructuralFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSetterStructuralFeature_FeatureToSet(), ecorePackage.getEStructuralFeature(), null, "FeatureToSet", null, 1, 1, SetterStructuralFeature.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getSetterStructuralFeature_Description(), ecorePackage.getEString(), "Description", null, 0, 1, SetterStructuralFeature.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		op = initEOperation(getSetterStructuralFeature__Accept__EObject(), null, "accept", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "objectToSetFeatures", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(setterAttributeEClass, SetterAttribute.class, "SetterAttribute", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSetterAttribute_AttributeToSet(), ecorePackage.getEAttribute(), null, "AttributeToSet", null, 1, 1, SetterAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(setterAttributeIntEClass, SetterAttributeInt.class, "SetterAttributeInt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSetterAttributeInt_Value(), ecorePackage.getEInt(), "Value", null, 0, 1, SetterAttributeInt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(setterAttributeFloatEClass, SetterAttributeFloat.class, "SetterAttributeFloat", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSetterAttributeFloat_Value(), ecorePackage.getEFloat(), "Value", null, 0, 1, SetterAttributeFloat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(paramsHolderEClass, ParamsHolder.class, "ParamsHolder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParamsHolder_RunsParams(), this.getRunParams(), null, "RunsParams", null, 0, -1, ParamsHolder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getParamsHolder__ConstructParams__Run(), this.getRunParams(), "constructParams", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRun(), "run", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(jobFileHandlerEClass, JobFileHandler.class, "JobFileHandler", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(runsEClass, Runs.class, "Runs", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRuns_Name(), ecorePackage.getEString(), "Name", null, 0, 1, Runs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRuns_Runs(), this.getRun(), null, "Runs", null, 0, -1, Runs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(docEClass, Doc.class, "Doc", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDoc_CloneFeedback(), this.getEnabledFeedback(), "CloneFeedback", null, 0, 1, Doc.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDoc_FlushFeedback(), this.getEnabledFeedback(), "FlushFeedback", null, 0, 1, Doc.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDoc_Description(), ecorePackage.getEString(), "Description", null, 0, 1, Doc.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDoc_Loaded(), ecorePackage.getEBoolean(), "Loaded", null, 0, 1, Doc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDoc_Refs(), this.getDocRef(), this.getDocRef_Doc(), "Refs", null, 0, -1, Doc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getDoc__Clone(), this.getDoc(), "clone", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDoc__Flush(), null, "flush", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDoc__Save(), null, "save", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDoc__Load(), null, "load", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(docRefEClass, DocRef.class, "DocRef", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDocRef_Doc(), this.getDoc(), this.getDoc_Refs(), "Doc", null, 1, 1, DocRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(docsHolderEClass, DocsHolder.class, "DocsHolder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDocsHolder_Docs(), this.getDocInDocsHolder(), this.getDocInDocsHolder_DocsHolder(), "Docs", null, 0, -1, DocsHolder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocsHolder_Name(), ecorePackage.getEString(), "Name", null, 0, 1, DocsHolder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getDocsHolder__AddDoc__Doc(), null, "addDoc", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDoc(), "doc", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDocsHolder__AddDocs__EList(), null, "addDocs", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDoc(), "docs", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(compoundDocEClass, CompoundDoc.class, "CompoundDoc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(docInDocsHolderEClass, DocInDocsHolder.class, "DocInDocsHolder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDocInDocsHolder_DocsHolder(), this.getDocsHolder(), this.getDocsHolder_Docs(), "DocsHolder", null, 1, 1, DocInDocsHolder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taskEClass, Task.class, "Task", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTask_CloneFeedback(), this.getEnabledFeedback(), "CloneFeedback", null, 0, 1, Task.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTask_Inputs(), this.getTaskInput(), this.getTaskInput_Consumer(), "Inputs", null, 0, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_Outputs(), this.getTaskOutput(), this.getTaskOutput_Producer(), "Outputs", null, 0, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getTask__IsValidInput__Doc(), this.getEnabledFeedback(), "isValidInput", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDoc(), "doc", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTask__IsValidOutput__Doc(), this.getEnabledFeedback(), "isValidOutput", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDoc(), "doc", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTask__AddInputDoc__Doc(), null, "addInputDoc", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDoc(), "doc", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTask__AddInputDocs__EList(), null, "addInputDocs", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDoc(), "docs", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getTask__InitOutputs(), null, "initOutputs", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getTask__Clone(), this.getTask(), "clone", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTask__AddOutputDoc__Doc(), null, "addOutputDoc", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDoc(), "doc", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTask__AddOutputDocs__EList(), null, "addOutputDocs", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDoc(), "docs", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(domainTaskEClass, DomainTask.class, "DomainTask", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDomainTask_Domain(), this.getTaskDomain(), null, "Domain", null, 1, 1, DomainTask.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(taskDocEClass, TaskDoc.class, "TaskDoc", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTaskDoc_Role(), ecorePackage.getEString(), "Role", null, 0, 1, TaskDoc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taskInputEClass, TaskInput.class, "TaskInput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTaskInput_Consumer(), this.getTask(), this.getTask_Inputs(), "Consumer", null, 1, 1, TaskInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taskOutputEClass, TaskOutput.class, "TaskOutput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTaskOutput_Producer(), this.getTask(), this.getTask_Outputs(), "Producer", null, 1, 1, TaskOutput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tasksEClass, Tasks.class, "Tasks", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTasks_Tasks(), this.getTask(), null, "Tasks", null, 0, -1, Tasks.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(docsEClass, Docs.class, "Docs", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDocs_Docs(), this.getDoc(), null, "Docs", null, 0, -1, Docs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getDocs__GarbageCollect(), null, "garbageCollect", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(taskDomainEClass, TaskDomain.class, "TaskDomain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getTaskDomain__GetNewTasks(), this.getTask(), "getNewTasks", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(keyIndicatorsEClass, KeyIndicators.class, "KeyIndicators", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getKeyIndicators_Indicators(), this.getKeyIndicator(), null, "Indicators", null, 0, -1, KeyIndicators.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getKeyIndicators__RefreshKeyIndicators(), null, "refreshKeyIndicators", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(keyIndicatorEClass, KeyIndicator.class, "KeyIndicator", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKeyIndicator_Description(), ecorePackage.getEString(), "Description", null, 0, 1, KeyIndicator.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getKeyIndicator_FormattedValue(), ecorePackage.getEString(), "FormattedValue", null, 0, 1, KeyIndicator.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getKeyIndicator_Name(), ecorePackage.getEString(), "Name", null, 0, 1, KeyIndicator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(keyIndicatorDoubleEClass, KeyIndicatorDouble.class, "KeyIndicatorDouble", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKeyIndicatorDouble_Value(), ecorePackage.getEDouble(), "Value", null, 0, 1, KeyIndicatorDouble.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(keyIndicatorIntEClass, KeyIndicatorInt.class, "KeyIndicatorInt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKeyIndicatorInt_Value(), ecorePackage.getEInt(), "Value", null, 0, 1, KeyIndicatorInt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(keyIndicatorDateEClass, KeyIndicatorDate.class, "KeyIndicatorDate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKeyIndicatorDate_Date(), ecorePackage.getEDate(), "Date", null, 0, 1, KeyIndicatorDate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKeyIndicatorDate_Format(), ecorePackage.getEString(), "Format", null, 0, 1, KeyIndicatorDate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(keyIndicatorStringEClass, KeyIndicatorString.class, "KeyIndicatorString", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKeyIndicatorString_Value(), ecorePackage.getEString(), "Value", null, 0, 1, KeyIndicatorString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(jobParameterTypeEEnum, JobParameterType.class, "JobParameterType");
		addEEnumLiteral(jobParameterTypeEEnum, JobParameterType.JOB_PARAMETER_TYPE_INT);
		addEEnumLiteral(jobParameterTypeEEnum, JobParameterType.JOB_PARAMETER_TYPE_STRING);
		addEEnumLiteral(jobParameterTypeEEnum, JobParameterType.JOB_PARAMETER_TYPE_FLOAT);
		addEEnumLiteral(jobParameterTypeEEnum, JobParameterType.JOB_PARAMETER_TYPE_DATE);
		addEEnumLiteral(jobParameterTypeEEnum, JobParameterType.JOB_PARAMETER_TYPE_ENUM);

		// Initialize data types
		initEDataType(progressFeedbackEDataType, ProgressFeedback.class, "ProgressFeedback", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(runContextEDataType, RunContext.class, "RunContext", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(exceptionEDataType, Exception.class, "Exception", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(returnFeedbackEDataType, ReturnFeedback.class, "ReturnFeedback", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(enabledFeedbackEDataType, EnabledFeedback.class, "EnabledFeedback", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //JobPackageImpl
