/*******************************************************************************
 * Copyright (c) 2017 Michel Schaffers and others.
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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table Row</b></em>'.
 * <p>
 * A concrete {@link TableRow} is an object instance mapped on a database table row.
 * <p>
 * The object may be logically deleted ({@link #isDeleted()}), meaning that it is
 * physically deleted (as is or to be) in the database, but not in the application:
 * <ul>
 * <li> UpSynching a table with a row removed, will not remove the corresponding object
 *  in the application but will set it as IsDeleted. 
 * <li> DownSynching an object set as IsDeleted will delete it from the database table.
 * </ul>
 * <p>
 * A TableRow instance is not physically deleted by dbSynch. Instead, its field isDeleted 
 * is raised. A newly created TableRow instance is set by default as isDeleted. The applicative
 * logic must reset the field as soon as the instance is sufficiently ready to be written
 * in the database. 
 * <p>
 * 
 * Following information about the execution of the synchronization is returned
 *   <ul>
 *   <li> {@link #getModificationLastSynchUp()} : modification on the object done by the last up synch
 *   <li> {@link #getModificationNextSynchDown()} : modification on the table to be done by the next down synch
 *   </ul>
<!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.dbsynch.TableRow#getTable <em>Table</em>}</li>
 *   <li>{@link com.misc.common.moplaf.dbsynch.TableRow#getCurrentKey <em>Current Key</em>}</li>
 *   <li>{@link com.misc.common.moplaf.dbsynch.TableRow#isDeleted <em>Deleted</em>}</li>
 *   <li>{@link com.misc.common.moplaf.dbsynch.TableRow#getIndexKey <em>Index Key</em>}</li>
 *   <li>{@link com.misc.common.moplaf.dbsynch.TableRow#getLastSynchDownKey <em>Last Synch Down Key</em>}</li>
 *   <li>{@link com.misc.common.moplaf.dbsynch.TableRow#isLastSynchDownDeleted <em>Last Synch Down Deleted</em>}</li>
 *   <li>{@link com.misc.common.moplaf.dbsynch.TableRow#getModificationLastSynchUp <em>Modification Last Synch Up</em>}</li>
 *   <li>{@link com.misc.common.moplaf.dbsynch.TableRow#getModificationNextSynchDown <em>Modification Next Synch Down</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.dbsynch.DbSynchPackage#getTableRow()
 * @model abstract="true"
 * @generated
 */
public interface TableRow extends EObject {
	/**
	 * Returns the value of the '<em><b>Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table</em>' reference.
	 * @see com.misc.common.moplaf.dbsynch.DbSynchPackage#getTableRow_Table()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	Table getTable();

	/**
	 * Returns the value of the '<em><b>Current Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Key</em>' attribute.
	 * @see com.misc.common.moplaf.dbsynch.DbSynchPackage#getTableRow_CurrentKey()
	 * @model dataType="com.misc.common.moplaf.dbsynch.TableRowKey" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	TableRowKey getCurrentKey();

	/**
	 * Returns the value of the '<em><b>Index Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Index Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index Key</em>' attribute.
	 * @see #setIndexKey(TableRowKey)
	 * @see com.misc.common.moplaf.dbsynch.DbSynchPackage#getTableRow_IndexKey()
	 * @model dataType="com.misc.common.moplaf.dbsynch.TableRowKey" transient="true"
	 * @generated
	 */
	TableRowKey getIndexKey();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.dbsynch.TableRow#getIndexKey <em>Index Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index Key</em>' attribute.
	 * @see #getIndexKey()
	 * @generated
	 */
	void setIndexKey(TableRowKey value);

	/**
	 * Returns the value of the '<em><b>Last Synch Down Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Synch Down Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Synch Down Key</em>' attribute.
	 * @see #setLastSynchDownKey(TableRowKey)
	 * @see com.misc.common.moplaf.dbsynch.DbSynchPackage#getTableRow_LastSynchDownKey()
	 * @model dataType="com.misc.common.moplaf.dbsynch.TableRowKey" transient="true"
	 * @generated
	 */
	TableRowKey getLastSynchDownKey();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.dbsynch.TableRow#getLastSynchDownKey <em>Last Synch Down Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Synch Down Key</em>' attribute.
	 * @see #getLastSynchDownKey()
	 * @generated
	 */
	void setLastSynchDownKey(TableRowKey value);

	/**
	 * Returns the value of the '<em><b>Last Synch Down Deleted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Synch Down Deleted</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Synch Down Deleted</em>' attribute.
	 * @see #setLastSynchDownDeleted(boolean)
	 * @see com.misc.common.moplaf.dbsynch.DbSynchPackage#getTableRow_LastSynchDownDeleted()
	 * @model transient="true"
	 * @generated
	 */
	boolean isLastSynchDownDeleted();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.dbsynch.TableRow#isLastSynchDownDeleted <em>Last Synch Down Deleted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Synch Down Deleted</em>' attribute.
	 * @see #isLastSynchDownDeleted()
	 * @generated
	 */
	void setLastSynchDownDeleted(boolean value);

	/**
	 * Returns the value of the '<em><b>Modification Last Synch Up</b></em>' attribute.
	 * The literals are from the enumeration {@link com.misc.common.moplaf.dbsynch.EnumModification}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modification Last Synch Up</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modification Last Synch Up</em>' attribute.
	 * @see com.misc.common.moplaf.dbsynch.EnumModification
	 * @see #setModificationLastSynchUp(EnumModification)
	 * @see com.misc.common.moplaf.dbsynch.DbSynchPackage#getTableRow_ModificationLastSynchUp()
	 * @model
	 * @generated
	 */
	EnumModification getModificationLastSynchUp();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.dbsynch.TableRow#getModificationLastSynchUp <em>Modification Last Synch Up</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modification Last Synch Up</em>' attribute.
	 * @see com.misc.common.moplaf.dbsynch.EnumModification
	 * @see #getModificationLastSynchUp()
	 * @generated
	 */
	void setModificationLastSynchUp(EnumModification value);

	/**
	 * Returns the value of the '<em><b>Modification Next Synch Down</b></em>' attribute.
	 * The literals are from the enumeration {@link com.misc.common.moplaf.dbsynch.EnumModification}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modification Next Synch Down</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modification Next Synch Down</em>' attribute.
	 * @see com.misc.common.moplaf.dbsynch.EnumModification
	 * @see #setModificationNextSynchDown(EnumModification)
	 * @see com.misc.common.moplaf.dbsynch.DbSynchPackage#getTableRow_ModificationNextSynchDown()
	 * @model
	 * @generated
	 */
	EnumModification getModificationNextSynchDown();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.dbsynch.TableRow#getModificationNextSynchDown <em>Modification Next Synch Down</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modification Next Synch Down</em>' attribute.
	 * @see com.misc.common.moplaf.dbsynch.EnumModification
	 * @see #getModificationNextSynchDown()
	 * @generated
	 */
	void setModificationNextSynchDown(EnumModification value);

	/**
	 * Returns the value of the '<em><b>Deleted</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deleted</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deleted</em>' attribute.
	 * @see #setDeleted(boolean)
	 * @see com.misc.common.moplaf.dbsynch.DbSynchPackage#getTableRow_Deleted()
	 * @model default="true"
	 * @generated
	 */
	boolean isDeleted();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.dbsynch.TableRow#isDeleted <em>Deleted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deleted</em>' attribute.
	 * @see #isDeleted()
	 * @generated
	 */
	void setDeleted(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void refresh();

} // TableRow
