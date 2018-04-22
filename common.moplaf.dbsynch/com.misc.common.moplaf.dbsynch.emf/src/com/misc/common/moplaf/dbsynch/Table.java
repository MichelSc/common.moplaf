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
import java.util.Date;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table</b></em>'.
 * <p>
 * A concrete {@link Table} is a class mapped on a possibly filtered database table.
 * <p>
 * A Table supports metadata, that will allow the framework to synchronize (up or down)
 * the object data with the db data:
 *   <ul>
 *   <li> {@link #getTableName()}: the name of the table
 *   <li> {@link #getKeyColumns()}: the columns of the table that are part of the key
 *   <li> {@link #getDataColumns()}: the  columns of the table that are NOT part of the key
 *   <li> {@link #getWhereClause()}: the condition that will be used to filter the rows up synched
 *   <li> {@link #getParamDbSynchUnitAttributes()} : the attributes in the synch unit to be used as values in the where clause
 *   </ul>
 *   The metadata is part of the state of the Table. It must be provided
 *   <ul>
 *   <li> either at run time by the user,
 *   <li> or at design time, by implementing method {@link #refreshMetaData()}.
 *   </ul>
 * <p>
 * Following information about the execution of the synchronization is returned
 *   <ul>
 *   <li> {@link #getLastSynchDown()} : timestamp of the last synchronization down
 *   <li> {@link #getLastSynchUp()} : timestamp of the last synchronization up
 *   <li> {@link #getNumberOfRows()}: number of rows present.
 *   </ul>

 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.dbsynch.Table#getSynchUnit <em>Synch Unit</em>}</li>
 *   <li>{@link com.misc.common.moplaf.dbsynch.Table#getColumns <em>Columns</em>}</li>
 *   <li>{@link com.misc.common.moplaf.dbsynch.Table#getKeyColumns <em>Key Columns</em>}</li>
 *   <li>{@link com.misc.common.moplaf.dbsynch.Table#getDataColumns <em>Data Columns</em>}</li>
 *   <li>{@link com.misc.common.moplaf.dbsynch.Table#getTableName <em>Table Name</em>}</li>
 *   <li>{@link com.misc.common.moplaf.dbsynch.Table#getWhereClause <em>Where Clause</em>}</li>
 *   <li>{@link com.misc.common.moplaf.dbsynch.Table#getParamDbSynchUnitAttributes <em>Param Db Synch Unit Attributes</em>}</li>
 *   <li>{@link com.misc.common.moplaf.dbsynch.Table#getRows <em>Rows</em>}</li>
 *   <li>{@link com.misc.common.moplaf.dbsynch.Table#getSelectSqlStatement <em>Select Sql Statement</em>}</li>
 *   <li>{@link com.misc.common.moplaf.dbsynch.Table#getInsertSqlStatement <em>Insert Sql Statement</em>}</li>
 *   <li>{@link com.misc.common.moplaf.dbsynch.Table#getUpdateSqlStatement <em>Update Sql Statement</em>}</li>
 *   <li>{@link com.misc.common.moplaf.dbsynch.Table#getDeleteSqlStatement <em>Delete Sql Statement</em>}</li>
 *   <li>{@link com.misc.common.moplaf.dbsynch.Table#getNumberOfRows <em>Number Of Rows</em>}</li>
 *   <li>{@link com.misc.common.moplaf.dbsynch.Table#getLastSynchDown <em>Last Synch Down</em>}</li>
 *   <li>{@link com.misc.common.moplaf.dbsynch.Table#getLastSynchUp <em>Last Synch Up</em>}</li>
 *   <li>{@link com.misc.common.moplaf.dbsynch.Table#getParent <em>Parent</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.dbsynch.DbSynchPackage#getTable()
 * @model abstract="true"
 * @generated
 */
public interface Table extends EObject {
	/**
	 * Returns the value of the '<em><b>Synch Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Synch Unit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Synch Unit</em>' reference.
	 * @see com.misc.common.moplaf.dbsynch.DbSynchPackage#getTable_SynchUnit()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	DbSynchUnitAbstract getSynchUnit();

	/**
	 * Returns the value of the '<em><b>Rows</b></em>' reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.dbsynch.TableRow}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rows</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rows</em>' reference list.
	 * @see com.misc.common.moplaf.dbsynch.DbSynchPackage#getTable_Rows()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<TableRow> getRows();

	/**
	 * Returns the value of the '<em><b>Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Name</em>' attribute.
	 * @see #setTableName(String)
	 * @see com.misc.common.moplaf.dbsynch.DbSynchPackage#getTable_TableName()
	 * @model
	 * @generated
	 */
	String getTableName();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.dbsynch.Table#getTableName <em>Table Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table Name</em>' attribute.
	 * @see #getTableName()
	 * @generated
	 */
	void setTableName(String value);

	/**
	 * Returns the value of the '<em><b>Where Clause</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Where Clause</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Where Clause</em>' attribute.
	 * @see #setWhereClause(String)
	 * @see com.misc.common.moplaf.dbsynch.DbSynchPackage#getTable_WhereClause()
	 * @model
	 * @generated
	 */
	String getWhereClause();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.dbsynch.Table#getWhereClause <em>Where Clause</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Where Clause</em>' attribute.
	 * @see #getWhereClause()
	 * @generated
	 */
	void setWhereClause(String value);

	/**
	 * Returns the value of the '<em><b>Select Sql Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Select Sql Statement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Select Sql Statement</em>' attribute.
	 * @see #setSelectSqlStatement(String)
	 * @see com.misc.common.moplaf.dbsynch.DbSynchPackage#getTable_SelectSqlStatement()
	 * @model
	 * @generated
	 */
	String getSelectSqlStatement();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.dbsynch.Table#getSelectSqlStatement <em>Select Sql Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Select Sql Statement</em>' attribute.
	 * @see #getSelectSqlStatement()
	 * @generated
	 */
	void setSelectSqlStatement(String value);

	/**
	 * Returns the value of the '<em><b>Insert Sql Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Insert Sql Statement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Insert Sql Statement</em>' attribute.
	 * @see #setInsertSqlStatement(String)
	 * @see com.misc.common.moplaf.dbsynch.DbSynchPackage#getTable_InsertSqlStatement()
	 * @model
	 * @generated
	 */
	String getInsertSqlStatement();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.dbsynch.Table#getInsertSqlStatement <em>Insert Sql Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Insert Sql Statement</em>' attribute.
	 * @see #getInsertSqlStatement()
	 * @generated
	 */
	void setInsertSqlStatement(String value);

	/**
	 * Returns the value of the '<em><b>Update Sql Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Update Sql Statement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Update Sql Statement</em>' attribute.
	 * @see #setUpdateSqlStatement(String)
	 * @see com.misc.common.moplaf.dbsynch.DbSynchPackage#getTable_UpdateSqlStatement()
	 * @model
	 * @generated
	 */
	String getUpdateSqlStatement();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.dbsynch.Table#getUpdateSqlStatement <em>Update Sql Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Update Sql Statement</em>' attribute.
	 * @see #getUpdateSqlStatement()
	 * @generated
	 */
	void setUpdateSqlStatement(String value);

	/**
	 * Returns the value of the '<em><b>Delete Sql Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delete Sql Statement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delete Sql Statement</em>' attribute.
	 * @see #setDeleteSqlStatement(String)
	 * @see com.misc.common.moplaf.dbsynch.DbSynchPackage#getTable_DeleteSqlStatement()
	 * @model
	 * @generated
	 */
	String getDeleteSqlStatement();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.dbsynch.Table#getDeleteSqlStatement <em>Delete Sql Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delete Sql Statement</em>' attribute.
	 * @see #getDeleteSqlStatement()
	 * @generated
	 */
	void setDeleteSqlStatement(String value);

	/**
	 * Returns the value of the '<em><b>Key Columns</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.dbsynch.TableColumn}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key Columns</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key Columns</em>' containment reference list.
	 * @see com.misc.common.moplaf.dbsynch.DbSynchPackage#getTable_KeyColumns()
	 * @model containment="true"
	 * @generated
	 */
	EList<TableColumn> getKeyColumns();

	/**
	 * Returns the value of the '<em><b>Columns</b></em>' reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.dbsynch.TableColumn}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Columns</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columns</em>' reference list.
	 * @see com.misc.common.moplaf.dbsynch.DbSynchPackage#getTable_Columns()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<TableColumn> getColumns();

	/**
	 * Returns the value of the '<em><b>Param Db Synch Unit Attributes</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EAttribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Param Db Synch Unit Attributes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Param Db Synch Unit Attributes</em>' reference list.
	 * @see com.misc.common.moplaf.dbsynch.DbSynchPackage#getTable_ParamDbSynchUnitAttributes()
	 * @model
	 * @generated
	 */
	EList<EAttribute> getParamDbSynchUnitAttributes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addParam(EAttribute dbSynchAttribute);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void refreshMetaData();

	/**
	 * Returns the value of the '<em><b>Last Synch Down</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Synch Down</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Synch Down</em>' attribute.
	 * @see #setLastSynchDown(Date)
	 * @see com.misc.common.moplaf.dbsynch.DbSynchPackage#getTable_LastSynchDown()
	 * @model
	 * @generated
	 */
	Date getLastSynchDown();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.dbsynch.Table#getLastSynchDown <em>Last Synch Down</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Synch Down</em>' attribute.
	 * @see #getLastSynchDown()
	 * @generated
	 */
	void setLastSynchDown(Date value);

	/**
	 * Returns the value of the '<em><b>Last Synch Up</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Synch Up</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Synch Up</em>' attribute.
	 * @see #setLastSynchUp(Date)
	 * @see com.misc.common.moplaf.dbsynch.DbSynchPackage#getTable_LastSynchUp()
	 * @model
	 * @generated
	 */
	Date getLastSynchUp();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.dbsynch.Table#getLastSynchUp <em>Last Synch Up</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Synch Up</em>' attribute.
	 * @see #getLastSynchUp()
	 * @generated
	 */
	void setLastSynchUp(Date value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' reference.
	 * @see #setParent(Table)
	 * @see com.misc.common.moplaf.dbsynch.DbSynchPackage#getTable_Parent()
	 * @model
	 * @generated
	 */
	Table getParent();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.dbsynch.Table#getParent <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(Table value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	TableColumn getColumn(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	TableColumn addColumn(boolean Key, String column, EnumColumnType type, EAttribute attribute);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	TableColumn addColumn(boolean Key, String column, EnumColumnType type, EAttribute attribute, TableColumn parentColumn);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	TableColumn addColumn(boolean Key, String column, EnumColumnType type, EAttribute attribute, String parentColumn);

	/**
	 * Returns the value of the '<em><b>Data Columns</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.dbsynch.TableColumn}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Columns</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Columns</em>' containment reference list.
	 * @see com.misc.common.moplaf.dbsynch.DbSynchPackage#getTable_DataColumns()
	 * @model containment="true"
	 * @generated
	 */
	EList<TableColumn> getDataColumns();

	/**
	 * Returns the value of the '<em><b>Number Of Rows</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Rows</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Rows</em>' attribute.
	 * @see #setNumberOfRows(int)
	 * @see com.misc.common.moplaf.dbsynch.DbSynchPackage#getTable_NumberOfRows()
	 * @model
	 * @generated
	 */
	int getNumberOfRows();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.dbsynch.Table#getNumberOfRows <em>Number Of Rows</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Rows</em>' attribute.
	 * @see #getNumberOfRows()
	 * @generated
	 */
	void setNumberOfRows(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Write in the tables as a function of the changes in the applicative data since the last synchDown
	 * <!-- end-model-doc -->
	 * @model dataType="com.misc.common.moplaf.dbsynch.ReturnFeedback"
	 * @generated
	 */
	ReturnFeedback synchDown();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Load the tables in the group, update the rows accordingly (synchronize the application data as a function of what is read)
	 * <!-- end-model-doc -->
	 * @model dataType="com.misc.common.moplaf.dbsynch.ReturnFeedback"
	 * @generated
	 */
	ReturnFeedback synchUp();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model keyDataType="com.misc.common.moplaf.dbsynch.TableRowKey"
	 * @generated
	 */
	TableRow getRow(TableRowKey key);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	TableRow constructRow();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void indexRow(TableRow row);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void unindexRow(TableRow row);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void refreshIndex();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void refresh();

} // Table
