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
public interface Replicator extends EObject {
	/**
	 * Returns the value of the '<em><b>Root Replicas</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.replica.ReplicatorReplica}.
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
	EList<ReplicatorReplica> getRootReplicas();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	ReplicatorReplica getReplica(EObject exemplar);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EList<EObject> getExemplarElements(ReplicatorReplica replica);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<EObject> getRootExemplarElements();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	ReplicatorReplica constructReplica(EObject exemplar);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exemplarElementsMany="true" replicaElementsMany="true"
	 * @generated
	 */
	void refreshElements(EList<EObject> exemplarElements, EList<ReplicatorReplica> replicaElements);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void refresh();

} // Replicator
