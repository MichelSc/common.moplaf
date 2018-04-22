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
package com.misc.common.moplaf.job.jobxmlrpc.impl;

import com.misc.common.moplaf.job.JobPackage;

import com.misc.common.moplaf.job.jobclient.JobClientPackage;

import com.misc.common.moplaf.job.jobxmlrpc.JobEngineClient;
import com.misc.common.moplaf.job.jobxmlrpc.JobEngineServer;
import com.misc.common.moplaf.job.jobxmlrpc.JobXmlRpcFactory;
import com.misc.common.moplaf.job.jobxmlrpc.JobXmlRpcPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JobXmlRpcPackageImpl extends EPackageImpl implements JobXmlRpcPackage {
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
	 * @see com.misc.common.moplaf.job.jobxmlrpc.JobXmlRpcPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private JobXmlRpcPackageImpl() {
		super(eNS_URI, JobXmlRpcFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link JobXmlRpcPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static JobXmlRpcPackage init() {
		if (isInited) return (JobXmlRpcPackage)EPackage.Registry.INSTANCE.getEPackage(JobXmlRpcPackage.eNS_URI);

		// Obtain or create and register package
		JobXmlRpcPackageImpl theJobXmlRpcPackage = (JobXmlRpcPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof JobXmlRpcPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new JobXmlRpcPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		JobPackage.eINSTANCE.eClass();
		JobClientPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theJobXmlRpcPackage.createPackageContents();

		// Initialize created meta-data
		theJobXmlRpcPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theJobXmlRpcPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(JobXmlRpcPackage.eNS_URI, theJobXmlRpcPackage);
		return theJobXmlRpcPackage;
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
	public EClass getJobEngineServer() {
		return jobEngineServerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJobEngineServer_Port() {
		return (EAttribute)jobEngineServerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJobEngineServer_Path() {
		return (EAttribute)jobEngineServerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JobXmlRpcFactory getJobXmlRpcFactory() {
		return (JobXmlRpcFactory)getEFactoryInstance();
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

		jobEngineServerEClass = createEClass(JOB_ENGINE_SERVER);
		createEAttribute(jobEngineServerEClass, JOB_ENGINE_SERVER__PORT);
		createEAttribute(jobEngineServerEClass, JOB_ENGINE_SERVER__PATH);
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

		// Initialize classes, features, and operations; add parameters
		initEClass(jobEngineClientEClass, JobEngineClient.class, "JobEngineClient", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJobEngineClient_Host(), ecorePackage.getEString(), "Host", "localhost", 0, 1, JobEngineClient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJobEngineClient_Port(), ecorePackage.getEInt(), "Port", "8080", 0, 1, JobEngineClient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJobEngineClient_Path(), ecorePackage.getEString(), "Path", "xmlrpc", 0, 1, JobEngineClient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jobEngineServerEClass, JobEngineServer.class, "JobEngineServer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJobEngineServer_Port(), ecorePackage.getEInt(), "Port", "8080", 0, 1, JobEngineServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJobEngineServer_Path(), ecorePackage.getEString(), "Path", "xmlrpc", 0, 1, JobEngineServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //JobXmlRpcPackageImpl
