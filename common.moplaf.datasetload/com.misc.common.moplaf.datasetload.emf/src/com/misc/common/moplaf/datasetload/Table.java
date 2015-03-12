/**
 */
package com.misc.common.moplaf.datasetload;

import com.misc.common.moplaf.datasetload.impl.TableRowKeyImpl;
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
 * <ul>
 *   <li>{@link com.misc.common.moplaf.datasetload.Table#getName <em>Name</em>}</li>
 *   <li>{@link com.misc.common.moplaf.datasetload.Table#getTableGroup <em>Table Group</em>}</li>
 *   <li>{@link com.misc.common.moplaf.datasetload.Table#getRows <em>Rows</em>}</li>
 *   <li>{@link com.misc.common.moplaf.datasetload.Table#getParamTableGroupAttributes <em>Param Table Group Attributes</em>}</li>
 *   <li>{@link com.misc.common.moplaf.datasetload.Table#getSQLStatement <em>SQL Statement</em>}</li>
 *   <li>{@link com.misc.common.moplaf.datasetload.Table#getColumnTableRowAttributes <em>Column Table Row Attributes</em>}</li>
 *   <li>{@link com.misc.common.moplaf.datasetload.Table#getKeyColumns <em>Key Columns</em>}</li>
 *   <li>{@link com.misc.common.moplaf.datasetload.Table#getLastLoad <em>Last Load</em>}</li>
 *   <li>{@link com.misc.common.moplaf.datasetload.Table#getNumberOfRows <em>Number Of Rows</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.misc.common.moplaf.datasetload.DatasetloadPackage#getTable()
 * @model abstract="true"
 * @generated
 */
public interface Table extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see com.misc.common.moplaf.datasetload.DatasetloadPackage#getTable_Name()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getName();

	/**
	 * Returns the value of the '<em><b>Rows</b></em>' reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.datasetload.TableRow}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rows</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rows</em>' reference list.
	 * @see com.misc.common.moplaf.datasetload.DatasetloadPackage#getTable_Rows()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<TableRow> getRows();

	/**
	 * Returns the value of the '<em><b>Column Table Row Attributes</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EAttribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Column Table Row Attributes</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column Table Row Attributes</em>' attribute list.
	 * @see com.misc.common.moplaf.datasetload.DatasetloadPackage#getTable_ColumnTableRowAttributes()
	 * @model dataType="com.misc.common.moplaf.datasetload.EAttribute" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<EAttribute> getColumnTableRowAttributes();

	/**
	 * Returns the value of the '<em><b>Table Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table Group</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Group</em>' reference.
	 * @see com.misc.common.moplaf.datasetload.DatasetloadPackage#getTable_TableGroup()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	TableGroup getTableGroup();

	/**
	 * Returns the value of the '<em><b>SQL Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SQL Statement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SQL Statement</em>' attribute.
	 * @see com.misc.common.moplaf.datasetload.DatasetloadPackage#getTable_SQLStatement()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getSQLStatement();

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
	 * @see com.misc.common.moplaf.datasetload.DatasetloadPackage#getTable_ParamTableGroupAttributes()
	 * @model dataType="com.misc.common.moplaf.datasetload.EAttribute" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<EAttribute> getParamTableGroupAttributes();

	/**
	 * Returns the value of the '<em><b>Key Columns</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key Columns</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key Columns</em>' attribute list.
	 * @see com.misc.common.moplaf.datasetload.DatasetloadPackage#getTable_KeyColumns()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<Integer> getKeyColumns();

	/**
	 * Returns the value of the '<em><b>Last Load</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Load</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Load</em>' attribute.
	 * @see #setLastLoad(Date)
	 * @see com.misc.common.moplaf.datasetload.DatasetloadPackage#getTable_LastLoad()
	 * @model
	 * @generated
	 */
	Date getLastLoad();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.datasetload.Table#getLastLoad <em>Last Load</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Load</em>' attribute.
	 * @see #getLastLoad()
	 * @generated
	 */
	void setLastLoad(Date value);

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
	 * @see com.misc.common.moplaf.datasetload.DatasetloadPackage#getTable_NumberOfRows()
	 * @model
	 * @generated
	 */
	int getNumberOfRows();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.datasetload.Table#getNumberOfRows <em>Number Of Rows</em>}' attribute.
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
	 * @model
	 * @generated
	 */
	void load();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	TableRow newRow();

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
	 * @model keyDataType="com.misc.common.moplaf.datasetload.TableRowKey"
	 * @generated
	 */
	TableRow getRow(TableRowKeyImpl key);

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
