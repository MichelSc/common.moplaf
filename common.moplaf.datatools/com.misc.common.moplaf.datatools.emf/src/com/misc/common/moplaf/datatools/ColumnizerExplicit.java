/**
 */
package com.misc.common.moplaf.datatools;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Columnizer Explicit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.datatools.ColumnizerExplicit#getColumns <em>Columns</em>}</li>
 *   <li>{@link com.misc.common.moplaf.datatools.ColumnizerExplicit#getGrids <em>Grids</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.datatools.DatatoolsPackage#getColumnizerExplicit()
 * @model
 * @generated
 */
public interface ColumnizerExplicit extends Columnizer {
	/**
	 * Returns the value of the '<em><b>Columns</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.datatools.ColumnizerColumn}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Columns</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columns</em>' containment reference list.
	 * @see com.misc.common.moplaf.datatools.DatatoolsPackage#getColumnizerExplicit_Columns()
	 * @model containment="true"
	 * @generated
	 */
	EList<ColumnizerColumn> getColumns();

	/**
	 * Returns the value of the '<em><b>Grids</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.datatools.ColumnizerGrid}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grids</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grids</em>' containment reference list.
	 * @see com.misc.common.moplaf.datatools.DatatoolsPackage#getColumnizerExplicit_Grids()
	 * @model containment="true"
	 * @generated
	 */
	EList<ColumnizerGrid> getGrids();

} // ColumnizerExplicit
