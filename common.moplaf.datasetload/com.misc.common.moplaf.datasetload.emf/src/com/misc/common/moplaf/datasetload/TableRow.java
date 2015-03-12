/**
 */
package com.misc.common.moplaf.datasetload;

import com.misc.common.moplaf.datasetload.impl.TableRowKeyImpl;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table Row</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.misc.common.moplaf.datasetload.TableRow#getRowNumber <em>Row Number</em>}</li>
 *   <li>{@link com.misc.common.moplaf.datasetload.TableRow#getTable <em>Table</em>}</li>
 *   <li>{@link com.misc.common.moplaf.datasetload.TableRow#getKey <em>Key</em>}</li>
 *   <li>{@link com.misc.common.moplaf.datasetload.TableRow#isNewRow <em>New Row</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.misc.common.moplaf.datasetload.DatasetloadPackage#getTableRow()
 * @model abstract="true"
 * @generated
 */
public interface TableRow extends EObject {
	/**
	 * Returns the value of the '<em><b>Row Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Row Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Row Number</em>' attribute.
	 * @see #setRowNumber(int)
	 * @see com.misc.common.moplaf.datasetload.DatasetloadPackage#getTableRow_RowNumber()
	 * @model
	 * @generated
	 */
	int getRowNumber();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.datasetload.TableRow#getRowNumber <em>Row Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Row Number</em>' attribute.
	 * @see #getRowNumber()
	 * @generated
	 */
	void setRowNumber(int value);

	/**
	 * Returns the value of the '<em><b>Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table</em>' reference.
	 * @see com.misc.common.moplaf.datasetload.DatasetloadPackage#getTableRow_Table()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	Table getTable();

	/**
	 * Returns the value of the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' attribute.
	 * @see com.misc.common.moplaf.datasetload.DatasetloadPackage#getTableRow_Key()
	 * @model dataType="com.misc.common.moplaf.datasetload.TableRowKey" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	TableRowKeyImpl getKey();

	/**
	 * Returns the value of the '<em><b>New Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New Row</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Row</em>' attribute.
	 * @see #setNewRow(boolean)
	 * @see com.misc.common.moplaf.datasetload.DatasetloadPackage#getTableRow_NewRow()
	 * @model
	 * @generated
	 */
	boolean isNewRow();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.datasetload.TableRow#isNewRow <em>New Row</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Row</em>' attribute.
	 * @see #isNewRow()
	 * @generated
	 */
	void setNewRow(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void refresh();

} // TableRow
