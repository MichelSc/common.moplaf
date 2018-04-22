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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Replicator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.replica.Replicator#getRootReplicas <em>Root Replicas</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.replica.ReplicaPackage#getReplicator()
 * @model
 * @generated
 */
public interface Replicator<T extends EObject> extends EObject {
	/**
	 * Returns the value of the '<em><b>Root Replicas</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.replica.ReplicatorReplica}<code>&lt;T&gt;</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root Replicas</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Replicas</em>' containment reference list.
	 * @see com.misc.common.moplaf.replica.ReplicaPackage#getReplicator_RootReplicas()
	 * @model containment="true"
	 * @generated
	 */
	EList<ReplicatorReplica<T>> getRootReplicas();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	ReplicatorReplica<T> getReplica(T exemplar);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EList<T> getExemplarElements(ReplicatorReplica<T> replica);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<T> getRootExemplarElements();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	ReplicatorReplica<T> constructReplica(T exemplar);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exemplarElementsMany="true" replicaElementsMany="true"
	 * @generated
	 */
	void refreshElements(EList<T> exemplarElements, EList<ReplicatorReplica<T>> replicaElements);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void refresh();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void refresh(ReplicatorReplica<T> replica);

} // Replicator
