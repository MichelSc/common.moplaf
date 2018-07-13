/**
 */
package com.misc.common.moplaf.datatools;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Columnizer Grid</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.datatools.ColumnizerGrid#getColumns <em>Columns</em>}</li>
 *   <li>{@link com.misc.common.moplaf.datatools.ColumnizerGrid#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.datatools.DatatoolsPackage#getColumnizerGrid()
 * @model
 * @generated
 */
public interface ColumnizerGrid extends EObject {
	/**
	 * Returns the value of the '<em><b>Columns</b></em>' reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.datatools.ColumnizerColumn}.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.datatools.ColumnizerColumn#getGrids <em>Grids</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Columns</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columns</em>' reference list.
	 * @see com.misc.common.moplaf.datatools.DatatoolsPackage#getColumnizerGrid_Columns()
	 * @see com.misc.common.moplaf.datatools.ColumnizerColumn#getGrids
	 * @model opposite="Grids"
	 * @generated
	 */
	EList<ColumnizerColumn> getColumns();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.misc.common.moplaf.datatools.DatatoolsPackage#getColumnizerGrid_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.datatools.ColumnizerGrid#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // ColumnizerGrid
