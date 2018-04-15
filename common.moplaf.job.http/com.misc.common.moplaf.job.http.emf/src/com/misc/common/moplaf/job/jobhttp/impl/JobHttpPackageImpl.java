/**
 */
package com.misc.common.moplaf.job.jobhttp.impl;

import com.misc.common.moplaf.file.FilePackage;
import com.misc.common.moplaf.job.JobPackage;

import com.misc.common.moplaf.job.jobclient.JobClientPackage;

import com.misc.common.moplaf.job.jobhttp.JobEngineClient;
import com.misc.common.moplaf.job.jobhttp.JobEngineServer;
import com.misc.common.moplaf.job.jobhttp.JobHttpFactory;
import com.misc.common.moplaf.job.jobhttp.JobHttpPackage;
import com.misc.common.moplaf.job.jobhttp.JobServer;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JobHttpPackageImpl extends EPackageImpl implements JobHttpPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jobEngineClientEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jobEngineServerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jobServerEClass = null;

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
	 * @see com.misc.common.moplaf.job.jobhttp.JobHttpPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private JobHttpPackageImpl() {
		super(eNS_URI, JobHttpFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link JobHttpPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static JobHttpPackage init() {
		if (isInited) return (JobHttpPackage)EPackage.Registry.INSTANCE.getEPackage(JobHttpPackage.eNS_URI);

		// Obtain or create and register package
		JobHttpPackageImpl theJobHttpPackage = (JobHttpPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof JobHttpPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new JobHttpPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		JobPackage.eINSTANCE.eClass();
		JobClientPackage.eINSTANCE.eClass();
		FilePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theJobHttpPackage.createPackageContents();

		// Initialize created meta-data
		theJobHttpPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theJobHttpPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(JobHttpPackage.eNS_URI, theJobHttpPackage);
		return theJobHttpPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJobEngineClient() {
		return jobEngineClientEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJobEngineClient_Host() {
		return (EAttribute)jobEngineClientEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJobEngineClient_Port() {
		return (EAttribute)jobEngineClientEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJobEngineClient_Path() {
		return (EAttribute)jobEngineClientEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJobEngineClient_Scheme() {
		return (EAttribute)jobEngineClientEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJobEngineServer() {
		return jobEngineServerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJobEngineServer_Path() {
		return (EAttribute)jobEngineServerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJobEngineServer_SelectedServer() {
		return (EReference)jobEngineServerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJobEngineServer_OwnerServer() {
		return (EReference)jobEngineServerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJobEngineServer_Server() {
		return (EReference)jobEngineServerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJobEngineServer_TmpFolder() {
		return (EAttribute)jobEngineServerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJobServer() {
		return jobServerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJobServer_Port() {
		return (EAttribute)jobServerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJobServer_HandlersAsSelected() {
		return (EReference)jobServerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJobServer_Handlers() {
		return (EReference)jobServerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJobServer_HandlerAsOwned() {
		return (EReference)jobServerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JobHttpFactory getJobHttpFactory() {
		return (JobHttpFactory)getEFactoryInstance();
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
		jobEngineClientEClass = createEClass(JOB_ENGINE_CLIENT);
		createEAttribute(jobEngineClientEClass, JOB_ENGINE_CLIENT__HOST);
		createEAttribute(jobEngineClientEClass, JOB_ENGINE_CLIENT__PORT);
		createEAttribute(jobEngineClientEClass, JOB_ENGINE_CLIENT__PATH);
		createEAttribute(jobEngineClientEClass, JOB_ENGINE_CLIENT__SCHEME);

		jobEngineServerEClass = createEClass(JOB_ENGINE_SERVER);
		createEAttribute(jobEngineServerEClass, JOB_ENGINE_SERVER__PATH);
		createEReference(jobEngineServerEClass, JOB_ENGINE_SERVER__SELECTED_SERVER);
		createEReference(jobEngineServerEClass, JOB_ENGINE_SERVER__OWNER_SERVER);
		createEReference(jobEngineServerEClass, JOB_ENGINE_SERVER__SERVER);
		createEAttribute(jobEngineServerEClass, JOB_ENGINE_SERVER__TMP_FOLDER);

		jobServerEClass = createEClass(JOB_SERVER);
		createEAttribute(jobServerEClass, JOB_SERVER__PORT);
		createEReference(jobServerEClass, JOB_SERVER__HANDLERS_AS_SELECTED);
		createEReference(jobServerEClass, JOB_SERVER__HANDLERS);
		createEReference(jobServerEClass, JOB_SERVER__HANDLER_AS_OWNED);
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
		JobClientPackage theJobClientPackage = (JobClientPackage)EPackage.Registry.INSTANCE.getEPackage(JobClientPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		jobEngineClientEClass.getESuperTypes().add(theJobClientPackage.getJobEngine());
		jobEngineServerEClass.getESuperTypes().add(theJobClientPackage.getJobSource());
		jobServerEClass.getESuperTypes().add(theJobClientPackage.getService());

		// Initialize classes, features, and operations; add parameters
		initEClass(jobEngineClientEClass, JobEngineClient.class, "JobEngineClient", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJobEngineClient_Host(), ecorePackage.getEString(), "Host", "localhost", 0, 1, JobEngineClient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJobEngineClient_Port(), ecorePackage.getEInt(), "Port", "8080", 0, 1, JobEngineClient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJobEngineClient_Path(), ecorePackage.getEString(), "Path", "/default_path", 0, 1, JobEngineClient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJobEngineClient_Scheme(), ecorePackage.getEString(), "Scheme", null, 0, 1, JobEngineClient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jobEngineServerEClass, JobEngineServer.class, "JobEngineServer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJobEngineServer_Path(), ecorePackage.getEString(), "Path", "/default_path", 0, 1, JobEngineServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJobEngineServer_SelectedServer(), this.getJobServer(), this.getJobServer_HandlersAsSelected(), "SelectedServer", null, 0, 1, JobEngineServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJobEngineServer_OwnerServer(), this.getJobServer(), this.getJobServer_HandlerAsOwned(), "OwnerServer", null, 0, 1, JobEngineServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJobEngineServer_Server(), this.getJobServer(), null, "Server", null, 1, 1, JobEngineServer.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getJobEngineServer_TmpFolder(), ecorePackage.getEString(), "TmpFolder", "C:\\tmp", 0, 1, JobEngineServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jobServerEClass, JobServer.class, "JobServer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJobServer_Port(), ecorePackage.getEInt(), "Port", "8080", 0, 1, JobServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJobServer_HandlersAsSelected(), this.getJobEngineServer(), this.getJobEngineServer_SelectedServer(), "HandlersAsSelected", null, 0, -1, JobServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJobServer_Handlers(), this.getJobEngineServer(), null, "Handlers", null, 0, -1, JobServer.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getJobServer_HandlerAsOwned(), this.getJobEngineServer(), this.getJobEngineServer_OwnerServer(), "HandlerAsOwned", null, 0, 1, JobServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //JobHttpPackageImpl
