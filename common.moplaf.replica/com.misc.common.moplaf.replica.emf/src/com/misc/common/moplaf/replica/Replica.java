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
 * A representation of the model object '<em><b>Replica</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.replica.Replica#getExemplar <em>Exemplar</em>}</li>
 *   <li>{@link com.misc.common.moplaf.replica.Replica#getElements <em>Elements</em>}</li>
 *   <li>{@link com.misc.common.moplaf.replica.Replica#getContainer <em>Container</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.replica.ReplicaPackage#getReplica()
 * @model
 * @generated
 */
public interface Replica extends EObject {
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
	 * @see com.misc.common.moplaf.replica.ReplicaPackage#getReplica_Exemplar()
	 * @model
	 * @generated
	 */
	EObject getExemplar();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.replica.Replica#getExemplar <em>Exemplar</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exemplar</em>' reference.
	 * @see #getExemplar()
	 * @generated
	 */
	void setExemplar(EObject value);

	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.replica.Replica}.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.replica.Replica#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see com.misc.common.moplaf.replica.ReplicaPackage#getReplica_Elements()
	 * @see com.misc.common.moplaf.replica.Replica#getContainer
	 * @model opposite="Container" containment="true"
	 * @generated
	 */
	EList<Replica> getElements();

	/**
	 * Returns the value of the '<em><b>Container</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.replica.Replica#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container</em>' container reference.
	 * @see #setContainer(Replica)
	 * @see com.misc.common.moplaf.replica.ReplicaPackage#getReplica_Container()
	 * @see com.misc.common.moplaf.replica.Replica#getElements
	 * @model opposite="Elements" transient="false"
	 * @generated
	 */
	Replica getContainer();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.replica.Replica#getContainer <em>Container</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container</em>' container reference.
	 * @see #getContainer()
	 * @generated
	 */
	void setContainer(Replica value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Get the elements of the replica to be replicated.
	 * Default implementation returns exemplar's contained objects.
	 * 
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<EObject> getExemplarElements();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Construct a replica for the given exemplar.
	 * Default implemenation construct a Replica instance.
	 * 
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	Replica constructElement(EObject exemplar);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Refresh the elements of this replica: 
	 *   compare the present elements with the replica's elements
	 *   construct replicas for the exemplar's elements not present in the replica
	 *   remove replicas for the replica's elements in the exemplar
	 *   recursively, refresh the replica's elements
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	void refreshElements();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Recursively, refresh the cross references
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	void refreshXRefs();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * First refresh the elements of this replica, recursively.
	 * Second refresh the X references, recursively
	 * 
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	void refresh();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Remove all this replica's elements recursively, and this replica.
	 * Default implementation remove this replica from its container.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	void remove();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Dereference the given exemplar, returning the corresponding replica.
	 * Default implementation traverse the Container-Elements tree until a match is found.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	Replica getReplica(EObject exemplar);

} // Replica
