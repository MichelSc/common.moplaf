/**
 */
package com.misc.common.moplaf.datatools;

import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Columnizer Column</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.datatools.ColumnizerColumn#getColumnName <em>Column Name</em>}</li>
 *   <li>{@link com.misc.common.moplaf.datatools.ColumnizerColumn#getColumnWidth <em>Column Width</em>}</li>
 *   <li>{@link com.misc.common.moplaf.datatools.ColumnizerColumn#getColumnizer <em>Columnizer</em>}</li>
 *   <li>{@link com.misc.common.moplaf.datatools.ColumnizerColumn#getAggregationType <em>Aggregation Type</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.datatools.DatatoolsPackage#getColumnizerColumn()
 * @model abstract="true"
 * @generated
 */
public interface ColumnizerColumn extends EObject {
	/**
	 * Returns the value of the '<em><b>Column Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Column Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column Name</em>' attribute.
	 * @see #setColumnName(String)
	 * @see com.misc.common.moplaf.datatools.DatatoolsPackage#getColumnizerColumn_ColumnName()
	 * @model
	 * @generated
	 */
	String getColumnName();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.datatools.ColumnizerColumn#getColumnName <em>Column Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column Name</em>' attribute.
	 * @see #getColumnName()
	 * @generated
	 */
	void setColumnName(String value);

	/**
	 * Returns the value of the '<em><b>Column Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Column Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column Width</em>' attribute.
	 * @see #setColumnWidth(int)
	 * @see com.misc.common.moplaf.datatools.DatatoolsPackage#getColumnizerColumn_ColumnWidth()
	 * @model
	 * @generated
	 */
	int getColumnWidth();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.datatools.ColumnizerColumn#getColumnWidth <em>Column Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column Width</em>' attribute.
	 * @see #getColumnWidth()
	 * @generated
	 */
	void setColumnWidth(int value);

	/**
	 * Returns the value of the '<em><b>Columnizer</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.datatools.Columnizer#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Columnizer</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columnizer</em>' container reference.
	 * @see #setColumnizer(Columnizer)
	 * @see com.misc.common.moplaf.datatools.DatatoolsPackage#getColumnizerColumn_Columnizer()
	 * @see com.misc.common.moplaf.datatools.Columnizer#getColumns
	 * @model opposite="Columns" required="true" transient="false"
	 * @generated
	 */
	Columnizer getColumnizer();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.datatools.ColumnizerColumn#getColumnizer <em>Columnizer</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Columnizer</em>' container reference.
	 * @see #getColumnizer()
	 * @generated
	 */
	void setColumnizer(Columnizer value);

	/**
	 * Returns the value of the '<em><b>Aggregation Type</b></em>' attribute.
	 * The literals are from the enumeration {@link com.misc.common.moplaf.datatools.AggregationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aggregation Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aggregation Type</em>' attribute.
	 * @see com.misc.common.moplaf.datatools.AggregationType
	 * @see #setAggregationType(AggregationType)
	 * @see com.misc.common.moplaf.datatools.DatatoolsPackage#getColumnizerColumn_AggregationType()
	 * @model
	 * @generated
	 */
	AggregationType getAggregationType();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.datatools.ColumnizerColumn#getAggregationType <em>Aggregation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aggregation Type</em>' attribute.
	 * @see com.misc.common.moplaf.datatools.AggregationType
	 * @see #getAggregationType()
	 * @generated
	 */
	void setAggregationType(AggregationType value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Object getValue(EObject object);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EDataType getDataType();

} // ColumnizerColumn
