/**
 */
package com.misc.common.moplaf.replica;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Replicator Replica</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.replica.ReplicatorReplica#getExemplar <em>Exemplar</em>}</li>
 *   <li>{@link com.misc.common.moplaf.replica.ReplicatorReplica#getElements <em>Elements</em>}</li>
 *   <li>{@link com.misc.common.moplaf.replica.ReplicatorReplica#getContainer <em>Container</em>}</li>
 *   <li>{@link com.misc.common.moplaf.replica.ReplicatorReplica#getReplicator <em>Replicator</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.replica.ReplicaPackage#getReplicatorReplica()
 * @model
 * @generated
 */
public interface ReplicatorReplica extends EObject {
	/**
	 * Returns the value of the '<em><b>Exemplar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exemplar</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exemplar</em>' reference.
	 * @see #setExemplar(EObject)
	 * @see com.misc.common.moplaf.replica.ReplicaPackage#getReplicatorReplica_Exemplar()
	 * @model
	 * @generated
	 */
	EObject getExemplar();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.replica.ReplicatorReplica#getExemplar <em>Exemplar</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exemplar</em>' reference.
	 * @see #getExemplar()
	 * @generated
	 */
	void setExemplar(EObject value);

	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.replica.ReplicatorReplica}.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.replica.ReplicatorReplica#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see com.misc.common.moplaf.replica.ReplicaPackage#getReplicatorReplica_Elements()
	 * @see com.misc.common.moplaf.replica.ReplicatorReplica#getContainer
	 * @model opposite="Container" containment="true"
	 * @generated
	 */
	EList<ReplicatorReplica> getElements();

	/**
	 * Returns the value of the '<em><b>Container</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.replica.ReplicatorReplica#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container</em>' container reference.
	 * @see #setContainer(ReplicatorReplica)
	 * @see com.misc.common.moplaf.replica.ReplicaPackage#getReplicatorReplica_Container()
	 * @see com.misc.common.moplaf.replica.ReplicatorReplica#getElements
	 * @model opposite="Elements" transient="false"
	 * @generated
	 */
	ReplicatorReplica getContainer();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.replica.ReplicatorReplica#getContainer <em>Container</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container</em>' container reference.
	 * @see #getContainer()
	 * @generated
	 */
	void setContainer(ReplicatorReplica value);

	/**
	 * Returns the value of the '<em><b>Replicator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Replicator</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Replicator</em>' reference.
	 * @see #setReplicator(Replicator)
	 * @see com.misc.common.moplaf.replica.ReplicaPackage#getReplicatorReplica_Replicator()
	 * @model required="true"
	 * @generated
	 */
	Replicator getReplicator();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.replica.ReplicatorReplica#getReplicator <em>Replicator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Replicator</em>' reference.
	 * @see #getReplicator()
	 * @generated
	 */
	void setReplicator(Replicator value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void onConstruct();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void onRemove();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void onRefresh();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void refresh();

} // ReplicatorReplica
