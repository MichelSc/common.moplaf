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

import com.misc.common.moplaf.common.ReturnFeedback;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Source</b></em>'.
 * <p>
 * A DataSource is the top level DbSynchUnit in the hierarchy of the synch units.
 * <p>
 * Next to its functionality as synch unit, the DataSource supports the connection
 * with the database.
 * <p>
 * Specialization of this class implements the up and down synchronization of a given Table: 
 * <ul>
 * <li>{@link #synchUpTableImpl(Table)} 
 * <li>{@link #synchDownTableImpl(Table)}
 * </ul>
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.dbsynch.DataSource#isConnected <em>Connected</em>}</li>
 *   <li>{@link com.misc.common.moplaf.dbsynch.DataSource#isAutoCommit <em>Auto Commit</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.dbsynch.DbSynchPackage#getDataSource()
 * @model abstract="true"
 * @generated
 */
public interface DataSource extends DbSynchUnitAbstract {
	/**
	 * Returns the value of the '<em><b>Connected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connected</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connected</em>' attribute.
	 * @see #setConnected(boolean)
	 * @see com.misc.common.moplaf.dbsynch.DbSynchPackage#getDataSource_Connected()
	 * @model transient="true"
	 * @generated
	 */
	boolean isConnected();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.dbsynch.DataSource#isConnected <em>Connected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connected</em>' attribute.
	 * @see #isConnected()
	 * @generated
	 */
	void setConnected(boolean value);

	/**
	 * Returns the value of the '<em><b>Auto Commit</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auto Commit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auto Commit</em>' attribute.
	 * @see #setAutoCommit(boolean)
	 * @see com.misc.common.moplaf.dbsynch.DbSynchPackage#getDataSource_AutoCommit()
	 * @model default="true" transient="true"
	 * @generated
	 */
	boolean isAutoCommit();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.dbsynch.DataSource#isAutoCommit <em>Auto Commit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auto Commit</em>' attribute.
	 * @see #isAutoCommit()
	 * @generated
	 */
	void setAutoCommit(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="com.misc.common.moplaf.dbsynch.ReturnFeedback"
	 * @generated
	 */
	ReturnFeedback connect();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="com.misc.common.moplaf.dbsynch.ReturnFeedback"
	 * @generated
	 */
	ReturnFeedback disconnect();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="com.misc.common.moplaf.dbsynch.ReturnFeedback"
	 * @generated
	 */
	ReturnFeedback commit();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="com.misc.common.moplaf.dbsynch.ReturnFeedback"
	 * @generated
	 */
	ReturnFeedback rollback();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="com.misc.common.moplaf.dbsynch.ReturnFeedback"
	 * @generated
	 */
	ReturnFeedback synchDownTableImpl(Table table);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="com.misc.common.moplaf.dbsynch.ReturnFeedback"
	 * @generated
	 */
	ReturnFeedback synchUpTableImpl(Table table);

} // DataSource
