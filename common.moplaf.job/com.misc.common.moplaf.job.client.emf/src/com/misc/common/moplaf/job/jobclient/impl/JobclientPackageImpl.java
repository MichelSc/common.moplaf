/**
 */
package com.misc.common.moplaf.job.jobclient.impl;

import com.misc.common.moplaf.job.JobPackage;

import com.misc.common.moplaf.job.jobclient.JobEngine;
import com.misc.common.moplaf.job.jobclient.JobEngineInProcess;
import com.misc.common.moplaf.job.jobclient.JobEngineProxy;
import com.misc.common.moplaf.job.jobclient.JobRemote;
import com.misc.common.moplaf.job.jobclient.JobRemoteResult;
import com.misc.common.moplaf.job.jobclient.JobclientFactory;
import com.misc.common.moplaf.job.jobclient.JobclientPackage;

import com.misc.common.moplaf.job.jobclient.SubmittedJob;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
public class JobclientPackageImpl extends EPackageImpl implements JobclientPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jobRemoteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jobEngineProxyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jobEngineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass submittedJobEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jobEngineInProcessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jobRemoteResultEClass = null;

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
	 * @see com.misc.common.moplaf.job.jobclient.JobclientPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private JobclientPackageImpl() {
		super(eNS_URI, JobclientFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link JobclientPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static JobclientPackage init() {
		if (isInited) return (JobclientPackage)EPackage.Registry.INSTANCE.getEPackage(JobclientPackage.eNS_URI);

		// Obtain or create and register package
		JobclientPackageImpl theJobclientPackage = (JobclientPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof JobclientPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new JobclientPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		JobPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theJobclientPackage.createPackageContents();

		// Initialize created meta-data
		theJobclientPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theJobclientPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(JobclientPackage.eNS_URI, theJobclientPackage);
		return theJobclientPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJobRemote() {
		return jobRemoteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJobRemote_SubmissionID() {
		return (EAttribute)jobRemoteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJobRemote_HandlingEngine() {
		return (EReference)jobRemoteEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJobRemote_Result() {
		return (EReference)jobRemoteEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getJobRemote__OnProgress__ProgressFeedback() {
		return jobRemoteEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getJobRemote__OnReturn__ReturnFeedback() {
		return jobRemoteEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJobEngineProxy() {
		return jobEngineProxyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJobEngineProxy_SubmittedJobs() {
		return (EReference)jobEngineProxyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJobEngineProxy_Name() {
		return (EAttribute)jobEngineProxyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getJobEngineProxy__SubmitJob__JobRemote() {
		return jobEngineProxyEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getJobEngineProxy__GetJob__int() {
		return jobEngineProxyEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJobEngine() {
		return jobEngineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJobEngine_SubmittedJobs() {
		return (EReference)jobEngineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJobEngine_Running() {
		return (EAttribute)jobEngineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJobEngine_StartFeedback() {
		return (EAttribute)jobEngineEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJobEngine_StopFeedback() {
		return (EAttribute)jobEngineEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getJobEngine__Start() {
		return jobEngineEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getJobEngine__Stop() {
		return jobEngineEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubmittedJob() {
		return submittedJobEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubmittedJob_Job() {
		return (EReference)submittedJobEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJobEngineInProcess() {
		return jobEngineInProcessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJobEngineInProcess_Asynchronous() {
		return (EAttribute)jobEngineInProcessEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJobRemoteResult() {
		return jobRemoteResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JobclientFactory getJobclientFactory() {
		return (JobclientFactory)getEFactoryInstance();
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
		jobRemoteEClass = createEClass(JOB_REMOTE);
		createEAttribute(jobRemoteEClass, JOB_REMOTE__SUBMISSION_ID);
		createEReference(jobRemoteEClass, JOB_REMOTE__HANDLING_ENGINE);
		createEReference(jobRemoteEClass, JOB_REMOTE__RESULT);
		createEOperation(jobRemoteEClass, JOB_REMOTE___ON_PROGRESS__PROGRESSFEEDBACK);
		createEOperation(jobRemoteEClass, JOB_REMOTE___ON_RETURN__RETURNFEEDBACK);

		jobEngineProxyEClass = createEClass(JOB_ENGINE_PROXY);
		createEReference(jobEngineProxyEClass, JOB_ENGINE_PROXY__SUBMITTED_JOBS);
		createEAttribute(jobEngineProxyEClass, JOB_ENGINE_PROXY__NAME);
		createEOperation(jobEngineProxyEClass, JOB_ENGINE_PROXY___SUBMIT_JOB__JOBREMOTE);
		createEOperation(jobEngineProxyEClass, JOB_ENGINE_PROXY___GET_JOB__INT);

		jobRemoteResultEClass = createEClass(JOB_REMOTE_RESULT);

		jobEngineEClass = createEClass(JOB_ENGINE);
		createEReference(jobEngineEClass, JOB_ENGINE__SUBMITTED_JOBS);
		createEAttribute(jobEngineEClass, JOB_ENGINE__RUNNING);
		createEAttribute(jobEngineEClass, JOB_ENGINE__START_FEEDBACK);
		createEAttribute(jobEngineEClass, JOB_ENGINE__STOP_FEEDBACK);
		createEOperation(jobEngineEClass, JOB_ENGINE___START);
		createEOperation(jobEngineEClass, JOB_ENGINE___STOP);

		submittedJobEClass = createEClass(SUBMITTED_JOB);
		createEReference(submittedJobEClass, SUBMITTED_JOB__JOB);

		jobEngineInProcessEClass = createEClass(JOB_ENGINE_IN_PROCESS);
		createEAttribute(jobEngineInProcessEClass, JOB_ENGINE_IN_PROCESS__ASYNCHRONOUS);
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
		JobPackage theJobPackage = (JobPackage)EPackage.Registry.INSTANCE.getEPackage(JobPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		jobRemoteEClass.getESuperTypes().add(theJobPackage.getJob());
		jobEngineInProcessEClass.getESuperTypes().add(this.getJobEngineProxy());

		// Initialize classes, features, and operations; add parameters
		initEClass(jobRemoteEClass, JobRemote.class, "JobRemote", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJobRemote_SubmissionID(), ecorePackage.getEInt(), "SubmissionID", null, 0, 1, JobRemote.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJobRemote_HandlingEngine(), this.getJobEngineProxy(), this.getJobEngineProxy_SubmittedJobs(), "HandlingEngine", null, 0, 1, JobRemote.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJobRemote_Result(), this.getJobRemoteResult(), null, "Result", null, 0, 1, JobRemote.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getJobRemote__OnProgress__ProgressFeedback(), null, "onProgress", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theJobPackage.getProgressFeedback(), "feedback", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getJobRemote__OnReturn__ReturnFeedback(), null, "onReturn", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theJobPackage.getReturnFeedback(), "feedback", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(jobEngineProxyEClass, JobEngineProxy.class, "JobEngineProxy", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJobEngineProxy_SubmittedJobs(), this.getJobRemote(), this.getJobRemote_HandlingEngine(), "SubmittedJobs", null, 0, -1, JobEngineProxy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJobEngineProxy_Name(), ecorePackage.getEString(), "Name", null, 0, 1, JobEngineProxy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getJobEngineProxy__SubmitJob__JobRemote(), ecorePackage.getEInt(), "submitJob", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getJobRemote(), "job", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getJobEngineProxy__GetJob__int(), this.getJobRemote(), "getJob", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "submissionID", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(jobRemoteResultEClass, JobRemoteResult.class, "JobRemoteResult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(jobEngineEClass, JobEngine.class, "JobEngine", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJobEngine_SubmittedJobs(), this.getSubmittedJob(), null, "SubmittedJobs", null, 0, -1, JobEngine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJobEngine_Running(), ecorePackage.getEBoolean(), "Running", null, 0, 1, JobEngine.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJobEngine_StartFeedback(), theJobPackage.getEnabledFeedback(), "StartFeedback", null, 0, 1, JobEngine.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getJobEngine_StopFeedback(), theJobPackage.getEnabledFeedback(), "StopFeedback", null, 0, 1, JobEngine.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEOperation(getJobEngine__Start(), null, "start", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getJobEngine__Stop(), null, "stop", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(submittedJobEClass, SubmittedJob.class, "SubmittedJob", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubmittedJob_Job(), this.getJobRemote(), null, "Job", null, 0, 1, SubmittedJob.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jobEngineInProcessEClass, JobEngineInProcess.class, "JobEngineInProcess", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJobEngineInProcess_Asynchronous(), ecorePackage.getEBoolean(), "Asynchronous", null, 0, 1, JobEngineInProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //JobclientPackageImpl
