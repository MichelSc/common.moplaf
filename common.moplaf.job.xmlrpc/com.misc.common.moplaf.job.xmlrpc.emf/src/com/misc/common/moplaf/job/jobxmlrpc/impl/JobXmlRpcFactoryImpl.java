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

import com.misc.common.moplaf.job.jobxmlrpc.*;

import org.eclipse.emf.ecore.EClass;
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
public class JobXmlRpcFactoryImpl extends EFactoryImpl implements JobXmlRpcFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static JobXmlRpcFactory init() {
		try {
			JobXmlRpcFactory theJobXmlRpcFactory = (JobXmlRpcFactory)EPackage.Registry.INSTANCE.getEFactory(JobXmlRpcPackage.eNS_URI);
			if (theJobXmlRpcFactory != null) {
				return theJobXmlRpcFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new JobXmlRpcFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JobXmlRpcFactoryImpl() {
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
			case JobXmlRpcPackage.JOB_ENGINE_CLIENT: return createJobEngineClient();
			case JobXmlRpcPackage.JOB_ENGINE_SERVER: return createJobEngineServer();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JobEngineClient createJobEngineClient() {
		JobEngineClientImpl jobEngineClient = new JobEngineClientImpl();
		return jobEngineClient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JobEngineServer createJobEngineServer() {
		JobEngineServerImpl jobEngineServer = new JobEngineServerImpl();
		return jobEngineServer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JobXmlRpcPackage getJobXmlRpcPackage() {
		return (JobXmlRpcPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static JobXmlRpcPackage getPackage() {
		return JobXmlRpcPackage.eINSTANCE;
	}

} //JobXmlRpcFactoryImpl
