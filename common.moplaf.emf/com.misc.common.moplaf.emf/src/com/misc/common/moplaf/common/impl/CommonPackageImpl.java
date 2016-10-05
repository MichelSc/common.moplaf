/**
 */
package com.misc.common.moplaf.common.impl;

import com.misc.common.moplaf.common.CommandFeedback;
import com.misc.common.moplaf.common.CommonFactory;
import com.misc.common.moplaf.common.CommonPackage;
import com.misc.common.moplaf.common.Job;

import com.misc.common.moplaf.common.ReturnFeedback;
import com.misc.common.moplaf.common.Run;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
	private EDataType commandFeedbackEDataType = null;

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
	public EAttribute getJob_StartTime() {
		return (EAttribute)jobEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJob_EndTime() {
		return (EAttribute)jobEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJob_Duration() {
		return (EAttribute)jobEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJob_Created() {
		return (EAttribute)jobEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJob_Running() {
		return (EAttribute)jobEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJob_Stopped() {
		return (EAttribute)jobEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJob_Finished() {
		return (EAttribute)jobEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJob_Args() {
		return (EAttribute)jobEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getJob__GetArgAsString__int() {
		return jobEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getJob__GetArgAsInt__int() {
		return jobEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getJob__GetArgAsFloat__int() {
		return jobEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getJob__GetArgAsDate__int() {
		return jobEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getJob__GetArgAsDate__int_String() {
		return jobEClass.getEOperations().get(4);
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
	public EReference getRun_ParentRun() {
		return (EReference)runEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRun_RunFeedback() {
		return (EAttribute)runEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRun_CancelFeedback() {
		return (EAttribute)runEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRun_ReturnSuccess() {
		return (EAttribute)runEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRun_ReturnFeedback() {
		return (EAttribute)runEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRun_ReturnInformation() {
		return (EAttribute)runEClass.getEStructuralFeatures().get(6);
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
	public EOperation getRun__Run__Run() {
		return runEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRun__RunBackground() {
		return runEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRun__Cancel() {
		return runEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRun__OnProgress__String_float() {
		return runEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCommandFeedback() {
		return commandFeedbackEDataType;
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
		createEAttribute(jobEClass, JOB__START_TIME);
		createEAttribute(jobEClass, JOB__END_TIME);
		createEAttribute(jobEClass, JOB__DURATION);
		createEAttribute(jobEClass, JOB__CREATED);
		createEAttribute(jobEClass, JOB__RUNNING);
		createEAttribute(jobEClass, JOB__STOPPED);
		createEAttribute(jobEClass, JOB__FINISHED);
		createEAttribute(jobEClass, JOB__ARGS);
		createEOperation(jobEClass, JOB___GET_ARG_AS_STRING__INT);
		createEOperation(jobEClass, JOB___GET_ARG_AS_INT__INT);
		createEOperation(jobEClass, JOB___GET_ARG_AS_FLOAT__INT);
		createEOperation(jobEClass, JOB___GET_ARG_AS_DATE__INT);
		createEOperation(jobEClass, JOB___GET_ARG_AS_DATE__INT_STRING);

		runEClass = createEClass(RUN);
		createEAttribute(runEClass, RUN__CANCELED);
		createEReference(runEClass, RUN__PARENT_RUN);
		createEAttribute(runEClass, RUN__RUN_FEEDBACK);
		createEAttribute(runEClass, RUN__CANCEL_FEEDBACK);
		createEAttribute(runEClass, RUN__RETURN_SUCCESS);
		createEAttribute(runEClass, RUN__RETURN_FEEDBACK);
		createEAttribute(runEClass, RUN__RETURN_INFORMATION);
		createEOperation(runEClass, RUN___RUN);
		createEOperation(runEClass, RUN___RUN__RUN);
		createEOperation(runEClass, RUN___RUN_BACKGROUND);
		createEOperation(runEClass, RUN___CANCEL);
		createEOperation(runEClass, RUN___ON_PROGRESS__STRING_FLOAT);

		// Create data types
		commandFeedbackEDataType = createEDataType(COMMAND_FEEDBACK);
		returnFeedbackEDataType = createEDataType(RETURN_FEEDBACK);
		exceptionEDataType = createEDataType(EXCEPTION);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		jobEClass.getESuperTypes().add(this.getRun());

		// Initialize classes, features, and operations; add parameters
		initEClass(jobEClass, Job.class, "Job", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJob_Name(), ecorePackage.getEString(), "Name", null, 0, 1, Job.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJob_Status(), ecorePackage.getEString(), "Status", null, 0, 1, Job.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getJob_Description(), ecorePackage.getEString(), "Description", null, 0, 1, Job.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getJob_StartTime(), ecorePackage.getEDate(), "StartTime", null, 0, 1, Job.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJob_EndTime(), ecorePackage.getEDate(), "EndTime", null, 0, 1, Job.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJob_Duration(), ecorePackage.getEFloat(), "Duration", null, 0, 1, Job.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJob_Created(), ecorePackage.getEBoolean(), "Created", "true", 0, 1, Job.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJob_Running(), ecorePackage.getEBoolean(), "Running", null, 0, 1, Job.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJob_Stopped(), ecorePackage.getEBoolean(), "Stopped", null, 0, 1, Job.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJob_Finished(), ecorePackage.getEBoolean(), "Finished", null, 0, 1, Job.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJob_Args(), ecorePackage.getEString(), "Args", null, 0, -1, Job.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getJob__GetArgAsString__int(), ecorePackage.getEString(), "getArgAsString", 0, 1, IS_UNIQUE, IS_ORDERED);
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

		initEClass(runEClass, Run.class, "Run", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRun_Canceled(), ecorePackage.getEBoolean(), "Canceled", null, 0, 1, Run.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRun_ParentRun(), this.getRun(), null, "ParentRun", null, 0, 1, Run.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRun_RunFeedback(), this.getCommandFeedback(), "RunFeedback", null, 0, 1, Run.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getRun_CancelFeedback(), this.getCommandFeedback(), "CancelFeedback", null, 0, 1, Run.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getRun_ReturnSuccess(), ecorePackage.getEBoolean(), "ReturnSuccess", null, 0, 1, Run.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRun_ReturnFeedback(), ecorePackage.getEString(), "ReturnFeedback", null, 0, 1, Run.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRun_ReturnInformation(), ecorePackage.getEString(), "ReturnInformation", null, 0, 1, Run.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getRun__Run(), this.getReturnFeedback(), "run", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRun__Run__Run(), this.getReturnFeedback(), "run", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRun(), "parentRun", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getRun__RunBackground(), null, "runBackground", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getRun__Cancel(), null, "cancel", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRun__OnProgress__String_float(), ecorePackage.getEBoolean(), "onProgress", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "task", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEFloat(), "work", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Initialize data types
		initEDataType(commandFeedbackEDataType, CommandFeedback.class, "CommandFeedback", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(returnFeedbackEDataType, ReturnFeedback.class, "ReturnFeedback", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(exceptionEDataType, Exception.class, "Exception", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //CommonPackageImpl
