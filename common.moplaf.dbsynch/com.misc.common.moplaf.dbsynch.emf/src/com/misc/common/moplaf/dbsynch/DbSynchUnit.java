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
package com.misc.common.moplaf.dbsynch;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DbSynchUnit</b></em>'.
 * <p>
 * A DbSynchUnit is a non-root unit in the hiearchy of the synch units. Typically it
 * represents 
 * <ul>
 * <li>a group of tables that must be queried together, with the same parameter values.</li>
 * <li>a group of tables that must be written together, in the same transaction.</li>
 * </ul>
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.dbsynch.DbSynchUnit#getParentUnit <em>Parent Unit</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.dbsynch.DbSynchPackage#getDbSynchUnit()
 * @model abstract="true"
 * @generated
 */
public interface DbSynchUnit extends DbSynchUnitAbstract {
	/**
	 * Returns the value of the '<em><b>Parent Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Unit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Unit</em>' reference.
	 * @see com.misc.common.moplaf.dbsynch.DbSynchPackage#getDbSynchUnit_ParentUnit()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	DbSynchUnitAbstract getParentUnit();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Make sure the derived elements are up to date
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	void refresh();

} // DbSynchUnit
