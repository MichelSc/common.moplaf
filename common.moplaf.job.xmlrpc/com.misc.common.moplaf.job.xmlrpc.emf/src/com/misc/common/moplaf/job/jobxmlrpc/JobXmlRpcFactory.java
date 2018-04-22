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
package com.misc.common.moplaf.job.jobxmlrpc;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.misc.common.moplaf.job.jobxmlrpc.JobXmlRpcPackage
 * @generated
 */
public interface JobXmlRpcFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	JobXmlRpcFactory eINSTANCE = com.misc.common.moplaf.job.jobxmlrpc.impl.JobXmlRpcFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Job Engine Client</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Job Engine Client</em>'.
	 * @generated
	 */
	JobEngineClient createJobEngineClient();

	/**
	 * Returns a new object of class '<em>Job Engine Server</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Job Engine Server</em>'.
	 * @generated
	 */
	JobEngineServer createJobEngineServer();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	JobXmlRpcPackage getJobXmlRpcPackage();

} //JobXmlRpcFactory
