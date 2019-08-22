/**
 */
package com.misc.common.moplaf.datatools;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Columnizer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.datatools.Columnizer#getColumns <em>Columns</em>}</li>
 *   <li>{@link com.misc.common.moplaf.datatools.Columnizer#getColumnizedType <em>Columnized Type</em>}</li>
 *   <li>{@link com.misc.common.moplaf.datatools.Columnizer#getSheetName <em>Sheet Name</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.datatools.DatatoolsPackage#getColumnizer()
 * @model
 * @generated
 */
public interface Columnizer extends ColumnizerAbstract {

	/**
	 * Returns the value of the '<em><b>Columns</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.datatools.ColumnizerColumn}.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.datatools.ColumnizerColumn#getColumnizer <em>Columnizer</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Columns</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columns</em>' containment reference list.
	 * @see com.misc.common.moplaf.datatools.DatatoolsPackage#getColumnizer_Columns()
	 * @see com.misc.common.moplaf.datatools.ColumnizerColumn#getColumnizer
	 * @model opposite="Columnizer" containment="true"
	 * @generated
	 */
	EList<ColumnizerColumn> getColumns();

	/**
	 * Returns the value of the '<em><b>Columnized Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Columnized Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columnized Type</em>' reference.
	 * @see #setColumnizedType(EClass)
	 * @see com.misc.common.moplaf.datatools.DatatoolsPackage#getColumnizer_ColumnizedType()
	 * @model
	 * @generated
	 */
	EClass getColumnizedType();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.datatools.Columnizer#getColumnizedType <em>Columnized Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Columnized Type</em>' reference.
	 * @see #getColumnizedType()
	 * @generated
	 */
	void setColumnizedType(EClass value);

	/**
	 * Returns the value of the '<em><b>Sheet Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sheet Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sheet Name</em>' attribute.
	 * @see #setSheetName(String)
	 * @see com.misc.common.moplaf.datatools.DatatoolsPackage#getColumnizer_SheetName()
	 * @model
	 * @generated
	 */
	String getSheetName();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.datatools.Columnizer#getSheetName <em>Sheet Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sheet Name</em>' attribute.
	 * @see #getSheetName()
	 * @generated
	 */
	void setSheetName(String value);
} // Columnizer
