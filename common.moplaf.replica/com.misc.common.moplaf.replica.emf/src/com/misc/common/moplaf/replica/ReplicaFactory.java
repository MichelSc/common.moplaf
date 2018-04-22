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
package com.misc.common.moplaf.replica;

import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.misc.common.moplaf.replica.ReplicaPackage
 * @generated
 */
public interface ReplicaFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ReplicaFactory eINSTANCE = com.misc.common.moplaf.replica.impl.ReplicaFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Replica</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Replica</em>'.
	 * @generated
	 */
	Replica createReplica();

	/**
	 * Returns a new object of class '<em>Replicator Replica</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Replicator Replica</em>'.
	 * @generated
	 */
	<T extends EObject> ReplicatorReplica<T> createReplicatorReplica();

	/**
	 * Returns a new object of class '<em>Replicator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Replicator</em>'.
	 * @generated
	 */
	<T extends EObject> Replicator<T> createReplicator();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ReplicaPackage getReplicaPackage();

} //ReplicaFactory
