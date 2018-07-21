/**
 */
package com.misc.common.moplaf.datatools;

import org.eclipse.emf.common.util.EList;

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
 *   <li>{@link com.misc.common.moplaf.datatools.Columnizer#getGrids <em>Grids</em>}</li>
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
	 * Returns the value of the '<em><b>Grids</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.datatools.ColumnizerGrid}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grids</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grids</em>' containment reference list.
	 * @see com.misc.common.moplaf.datatools.DatatoolsPackage#getColumnizer_Grids()
	 * @model containment="true"
	 * @generated
	 */
	EList<ColumnizerGrid> getGrids();
} // Columnizer
