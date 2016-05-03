/**
 */
package com.misc.common.moplaf.dbsynch;

import com.misc.common.moplaf.dbsynch.impl.TableRowKeyImpl;
import java.util.Date;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.dbsynch.Table#getTableGroup <em>Table Group</em>}</li>
 *   <li>{@link com.misc.common.moplaf.dbsynch.Table#getRows <em>Rows</em>}</li>
 *   <li>{@link com.misc.common.moplaf.dbsynch.Table#getTableName <em>Table Name</em>}</li>
 *   <li>{@link com.misc.common.moplaf.dbsynch.Table#getWhereClause <em>Where Clause</em>}</li>
 *   <li>{@link com.misc.common.moplaf.dbsynch.Table#getNumberOfRows <em>Number Of Rows</em>}</li>
 *   <li>{@link com.misc.common.moplaf.dbsynch.Table#getLastSynchDown <em>Last Synch Down</em>}</li>
 *   <li>{@link com.misc.common.moplaf.dbsynch.Table#getLastSynchUp <em>Last Synch Up</em>}</li>
 *   <li>{@link com.misc.common.moplaf.dbsynch.Table#getDataColumns <em>Data Columns</em>}</li>
 *   <li>{@link com.misc.common.moplaf.dbsynch.Table#getSelectSqlStatement <em>Select Sql Statement</em>}</li>
 *   <li>{@link com.misc.common.moplaf.dbsynch.Table#getInsertSqlStatement <em>Insert Sql Statement</em>}</li>
 *   <li>{@link com.misc.common.moplaf.dbsynch.Table#getUpdateSqlStatement <em>Update Sql Statement</em>}</li>
 *   <li>{@link com.misc.common.moplaf.dbsynch.Table#getDeleteSqlStatement <em>Delete Sql Statement</em>}</li>
 *   <li>{@link com.misc.common.moplaf.dbsynch.Table#getParamTableGroupAttributes <em>Param Table Group Attributes</em>}</li>
 *   <li>{@link com.misc.common.moplaf.dbsynch.Table#getKeyColumns <em>Key Columns</em>}</li>
 *   <li>{@link com.misc.common.moplaf.dbsynch.Table#getColumns <em>Columns</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.dbsynch.DbSynchPackage#getTable()
 * @model abstract="true"
 * @generated
 */
public interface Table extends EObject {
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
	 * Returns the value of the '<em><b>Table Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table Group</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Group</em>' reference.
	 * @see com.misc.common.moplaf.dbsynch.DbSynchPackage#getTable_TableGroup()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	TableGroup getTableGroup();

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
	 * Returns the value of the '<em><b>Param Table Group Attributes</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EAttribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Param Table Group Attributes</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Param Table Group Attributes</em>' attribute list.
	 * @see com.misc.common.moplaf.dbsynch.DbSynchPackage#getTable_ParamTableGroupAttributes()
	 * @model dataType="com.misc.common.moplaf.dbsynch.EAttribute"
	 * @generated
	 */
	EList<EAttribute> getParamTableGroupAttributes();

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addColumn(String column, int columnNumber, int keyNumber, EAttribute attribute);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void refreshMetaData();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void flushVolatileMetaData();

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
	 * @model
	 * @generated
	 */
	void synchDown();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Load the tables in the group, update the rows accordingly (synchronize the application data as a function of what is read)
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	void synchUp();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addRow(TableRow row);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model keyDataType="com.misc.common.moplaf.dbsynch.TableRowKey"
	 * @generated
	 */
	TableRow getRow(TableRowKeyImpl key);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	TableRow rowFactory();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void removeRow(TableRow row);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void refresh();

} // Table
