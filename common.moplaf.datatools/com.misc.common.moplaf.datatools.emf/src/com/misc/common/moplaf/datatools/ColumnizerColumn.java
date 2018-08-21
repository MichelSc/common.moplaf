/**
 */
package com.misc.common.moplaf.datatools;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
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
 *   <li>{@link com.misc.common.moplaf.datatools.ColumnizerColumn#getGrids <em>Grids</em>}</li>
 *   <li>{@link com.misc.common.moplaf.datatools.ColumnizerColumn#getColumnizer <em>Columnizer</em>}</li>
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
	 * Returns the value of the '<em><b>Grids</b></em>' reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.datatools.ColumnizerGrid}.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.datatools.ColumnizerGrid#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grids</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grids</em>' reference list.
	 * @see com.misc.common.moplaf.datatools.DatatoolsPackage#getColumnizerColumn_Grids()
	 * @see com.misc.common.moplaf.datatools.ColumnizerGrid#getColumns
	 * @model opposite="Columns"
	 * @generated
	 */
	EList<ColumnizerGrid> getGrids();

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Object getValue(EObject object);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model typeRequired="true"
	 * @generated
	 */
	boolean isValidElementType(EClass type);

} // ColumnizerColumn
