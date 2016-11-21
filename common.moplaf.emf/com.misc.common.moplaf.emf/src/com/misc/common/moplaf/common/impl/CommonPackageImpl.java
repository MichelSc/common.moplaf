/**
 */
package com.misc.common.moplaf.common.impl;

import com.misc.common.moplaf.common.EnabledFeedback;
import com.misc.common.moplaf.common.CommonFactory;
import com.misc.common.moplaf.common.CommonPackage;
import com.misc.common.moplaf.common.Job;

import com.misc.common.moplaf.common.JobParameter;
import com.misc.common.moplaf.common.JobParameterType;
import com.misc.common.moplaf.common.ProgressFeedback;
import com.misc.common.moplaf.common.ReturnFeedback;
import com.misc.common.moplaf.common.Run;
import com.misc.common.moplaf.common.RunContext;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CommonPackageImpl extends EPackageImpl implements CommonPackage {
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
	private EClass runEClass = null;

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
	private EEnum jobParameterTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enabledFeedbackEDataType = null;

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
	private EDataType exceptionEDataType = null;

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
	 * @see com.misc.common.moplaf.common.CommonPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CommonPackageImpl() {
		super(eNS_URI, CommonFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CommonPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CommonPackage init() {
		if (isInited) return (CommonPackage)EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI);

		// Obtain or create and register package
		CommonPackageImpl theCommonPackage = (CommonPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CommonPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CommonPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theCommonPackage.createPackageContents();

		// Initialize created meta-data
		theCommonPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCommonPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CommonPackage.eNS_URI, theCommonPackage);
		return theCommonPackage;
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
	public EAttribute getJob_Name() {
		return (EAttribute)jobEClass.getEStructuralFeatures().get(0);
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
		return (EAttribute)jobEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJob_HelpText() {
		return (EAttribute)jobEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJob_StartTime() {
		return (EAttribute)jobEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJob_EndTime() {
		return (EAttribute)jobEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJob_Duration() {
		return (EAttribute)jobEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJob_Created() {
		return (EAttribute)jobEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJob_Running() {
		return (EAttribute)jobEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJob_Stopped() {
		return (EAttribute)jobEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJob_Finished() {
		return (EAttribute)jobEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJob_Args() {
		return (EAttribute)jobEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJob_Parameters() {
		return (EReference)jobEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getJob__AddParameter__String_JobParameterType_EAttribute_String() {
		return jobEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getJob__RefreshParameters() {
		return jobEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getJob__GetArgAsString__int() {
		return jobEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getJob__GetArgAsInt__int() {
		return jobEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getJob__GetArgAsFloat__int() {
		return jobEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getJob__GetArgAsDate__int() {
		return jobEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getJob__GetArgAsDate__int_String() {
		return jobEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getJob__SetArgs() {
		return jobEClass.getEOperations().get(7);
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
	public EAttribute getRun_Canceled() {
		return (EAttribute)runEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRun_RunFeedback() {
		return (EAttribute)runEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRun_CancelFeedback() {
		return (EAttribute)runEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRun_ReturnSuccess() {
		return (EAttribute)runEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRun_ReturnFeedback() {
		return (EAttribute)runEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRun_ReturnInformation() {
		return (EAttribute)runEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRun__Run() {
		return runEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRun__Run__RunContext() {
		return runEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRun__Cancel() {
		return runEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRun__SetProgress__String_float() {
		return runEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRun__SetProgress__ProgressFeedback() {
		return runEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRun__GetReturn() {
		return runEClass.getEOperations().get(5);
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
	public EDataType getRunContext() {
		return runContextEDataType;
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
	public EDataType getEnabledFeedback() {
		return enabledFeedbackEDataType;
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
	public EDataType getException() {
		return exceptionEDataType;
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
	public CommonFactory getCommonFactory() {
		return (CommonFactory)getEFactoryInstance();
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
		jobEClass = createEClass(JOB);
		createEAttribute(jobEClass, JOB__NAME);
		createEAttribute(jobEClass, JOB__STATUS);
		createEAttribute(jobEClass, JOB__DESCRIPTION);
		createEAttribute(jobEClass, JOB__HELP_TEXT);
		createEAttribute(jobEClass, JOB__START_TIME);
		createEAttribute(jobEClass, JOB__END_TIME);
		createEAttribute(jobEClass, JOB__DURATION);
		createEAttribute(jobEClass, JOB__CREATED);
		createEAttribute(jobEClass, JOB__RUNNING);
		createEAttribute(jobEClass, JOB__STOPPED);
		createEAttribute(jobEClass, JOB__FINISHED);
		createEAttribute(jobEClass, JOB__ARGS);
		createEReference(jobEClass, JOB__PARAMETERS);
		createEOperation(jobEClass, JOB___ADD_PARAMETER__STRING_JOBPARAMETERTYPE_EATTRIBUTE_STRING);
		createEOperation(jobEClass, JOB___REFRESH_PARAMETERS);
		createEOperation(jobEClass, JOB___GET_ARG_AS_STRING__INT);
		createEOperation(jobEClass, JOB___GET_ARG_AS_INT__INT);
		createEOperation(jobEClass, JOB___GET_ARG_AS_FLOAT__INT);
		createEOperation(jobEClass, JOB___GET_ARG_AS_DATE__INT);
		createEOperation(jobEClass, JOB___GET_ARG_AS_DATE__INT_STRING);
		createEOperation(jobEClass, JOB___SET_ARGS);

		runEClass = createEClass(RUN);
		createEAttribute(runEClass, RUN__CANCELED);
		createEAttribute(runEClass, RUN__RUN_FEEDBACK);
		createEAttribute(runEClass, RUN__CANCEL_FEEDBACK);
		createEAttribute(runEClass, RUN__RETURN_SUCCESS);
		createEAttribute(runEClass, RUN__RETURN_FEEDBACK);
		createEAttribute(runEClass, RUN__RETURN_INFORMATION);
		createEOperation(runEClass, RUN___RUN);
		createEOperation(runEClass, RUN___RUN__RUNCONTEXT);
		createEOperation(runEClass, RUN___CANCEL);
		createEOperation(runEClass, RUN___SET_PROGRESS__STRING_FLOAT);
		createEOperation(runEClass, RUN___SET_PROGRESS__PROGRESSFEEDBACK);
		createEOperation(runEClass, RUN___GET_RETURN);

		jobParameterEClass = createEClass(JOB_PARAMETER);
		createEAttribute(jobParameterEClass, JOB_PARAMETER__NAME);
		createEAttribute(jobParameterEClass, JOB_PARAMETER__TYPE);
		createEReference(jobParameterEClass, JOB_PARAMETER__JOB_ATTRIBUTE);
		createEAttribute(jobParameterEClass, JOB_PARAMETER__DESCRIPTION);

		// Create enums
		jobParameterTypeEEnum = createEEnum(JOB_PARAMETER_TYPE);

		// Create data types
		enabledFeedbackEDataType = createEDataType(ENABLED_FEEDBACK);
		returnFeedbackEDataType = createEDataType(RETURN_FEEDBACK);
		exceptionEDataType = createEDataType(EXCEPTION);
		progressFeedbackEDataType = createEDataType(PROGRESS_FEEDBACK);
		runContextEDataType = createEDataType(RUN_CONTEXT);
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
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		jobEClass.getESuperTypes().add(this.getRun());

		// Initialize classes, features, and operations; add parameters
		initEClass(jobEClass, Job.class, "Job", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJob_Name(), ecorePackage.getEString(), "Name", null, 0, 1, Job.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJob_Status(), ecorePackage.getEString(), "Status", null, 0, 1, Job.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getJob_Description(), ecorePackage.getEString(), "Description", null, 0, 1, Job.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getJob_HelpText(), ecorePackage.getEString(), "HelpText", null, 0, 1, Job.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getJob_StartTime(), ecorePackage.getEDate(), "StartTime", null, 0, 1, Job.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJob_EndTime(), ecorePackage.getEDate(), "EndTime", null, 0, 1, Job.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJob_Duration(), ecorePackage.getEFloat(), "Duration", null, 0, 1, Job.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJob_Created(), ecorePackage.getEBoolean(), "Created", "true", 0, 1, Job.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJob_Running(), ecorePackage.getEBoolean(), "Running", null, 0, 1, Job.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJob_Stopped(), ecorePackage.getEBoolean(), "Stopped", null, 0, 1, Job.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJob_Finished(), ecorePackage.getEBoolean(), "Finished", null, 0, 1, Job.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJob_Args(), ecorePackage.getEString(), "Args", null, 0, -1, Job.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJob_Parameters(), this.getJobParameter(), null, "Parameters", null, 0, -1, Job.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getJob__AddParameter__String_JobParameterType_EAttribute_String(), null, "addParameter", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getJobParameterType(), "type", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEAttribute(), "attribute", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "description", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getJob__RefreshParameters(), null, "refreshParameters", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getJob__GetArgAsString__int(), ecorePackage.getEString(), "getArgAsString", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "index", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getException());

		op = initEOperation(getJob__GetArgAsInt__int(), ecorePackage.getEInt(), "getArgAsInt", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "index", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getException());

		op = initEOperation(getJob__GetArgAsFloat__int(), ecorePackage.getEFloat(), "getArgAsFloat", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "index", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getException());

		op = initEOperation(getJob__GetArgAsDate__int(), ecorePackage.getEDate(), "getArgAsDate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "index", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getException());

		op = initEOperation(getJob__GetArgAsDate__int_String(), ecorePackage.getEDate(), "getArgAsDate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "index", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "simpleDateFormat", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getException());

		op = initEOperation(getJob__SetArgs(), null, "setArgs", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getException());

		initEClass(runEClass, Run.class, "Run", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRun_Canceled(), ecorePackage.getEBoolean(), "Canceled", null, 0, 1, Run.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRun_RunFeedback(), this.getEnabledFeedback(), "RunFeedback", null, 0, 1, Run.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getRun_CancelFeedback(), this.getEnabledFeedback(), "CancelFeedback", null, 0, 1, Run.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getRun_ReturnSuccess(), ecorePackage.getEBoolean(), "ReturnSuccess", null, 0, 1, Run.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRun_ReturnFeedback(), ecorePackage.getEString(), "ReturnFeedback", null, 0, 1, Run.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRun_ReturnInformation(), ecorePackage.getEString(), "ReturnInformation", null, 0, 1, Run.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getRun__Run(), this.getReturnFeedback(), "run", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRun__Run__RunContext(), this.getReturnFeedback(), "run", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRunContext(), "runContext", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getRun__Cancel(), null, "cancel", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRun__SetProgress__String_float(), ecorePackage.getEBoolean(), "setProgress", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "task", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEFloat(), "work", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRun__SetProgress__ProgressFeedback(), ecorePackage.getEBoolean(), "setProgress", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getProgressFeedback(), "progress", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getRun__GetReturn(), this.getReturnFeedback(), "getReturn", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(jobParameterEClass, JobParameter.class, "JobParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJobParameter_Name(), ecorePackage.getEString(), "Name", null, 0, 1, JobParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJobParameter_Type(), this.getJobParameterType(), "Type", null, 0, 1, JobParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJobParameter_JobAttribute(), theEcorePackage.getEAttribute(), null, "JobAttribute", null, 0, 1, JobParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJobParameter_Description(), ecorePackage.getEString(), "Description", null, 0, 1, JobParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(jobParameterTypeEEnum, JobParameterType.class, "JobParameterType");
		addEEnumLiteral(jobParameterTypeEEnum, JobParameterType.JOB_PARAMETER_TYPE_INT);
		addEEnumLiteral(jobParameterTypeEEnum, JobParameterType.JOB_PARAMETER_TYPE_STRING);
		addEEnumLiteral(jobParameterTypeEEnum, JobParameterType.JOB_PARAMETER_TYPE_FLOAT);
		addEEnumLiteral(jobParameterTypeEEnum, JobParameterType.JOB_PARAMETER_TYPE_DATE);
		addEEnumLiteral(jobParameterTypeEEnum, JobParameterType.JOB_PARAMETER_TYPE_ENUM);

		// Initialize data types
		initEDataType(enabledFeedbackEDataType, EnabledFeedback.class, "EnabledFeedback", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(returnFeedbackEDataType, ReturnFeedback.class, "ReturnFeedback", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(exceptionEDataType, Exception.class, "Exception", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(progressFeedbackEDataType, ProgressFeedback.class, "ProgressFeedback", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(runContextEDataType, RunContext.class, "RunContext", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //CommonPackageImpl
