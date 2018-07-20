/**
 */
package com.misc.common.moplaf.datatools;

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
 *   <li>{@link com.misc.common.moplaf.datatools.ColumnizerColumn#getName <em>Name</em>}</li>
 *   <li>{@link com.misc.common.moplaf.datatools.ColumnizerColumn#getWidth <em>Width</em>}</li>
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
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.misc.common.moplaf.datatools.DatatoolsPackage#getColumnizerColumn_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.datatools.ColumnizerColumn#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(int)
	 * @see com.misc.common.moplaf.datatools.DatatoolsPackage#getColumnizerColumn_Width()
	 * @model
	 * @generated
	 */
	int getWidth();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.datatools.ColumnizerColumn#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(int value);

	/**
	 * Returns the value of the '<em><b>Grids</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.datatools.ColumnizerGrid#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grids</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grids</em>' reference.
	 * @see #setGrids(ColumnizerGrid)
	 * @see com.misc.common.moplaf.datatools.DatatoolsPackage#getColumnizerColumn_Grids()
	 * @see com.misc.common.moplaf.datatools.ColumnizerGrid#getColumns
	 * @model opposite="Columns"
	 * @generated
	 */
	ColumnizerGrid getGrids();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.datatools.ColumnizerColumn#getGrids <em>Grids</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grids</em>' reference.
	 * @see #getGrids()
	 * @generated
	 */
	void setGrids(ColumnizerGrid value);

	/**
	 * Returns the value of the '<em><b>Columnizer</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.datatools.ColumnizerExplicit#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Columnizer</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columnizer</em>' container reference.
	 * @see #setColumnizer(ColumnizerExplicit)
	 * @see com.misc.common.moplaf.datatools.DatatoolsPackage#getColumnizerColumn_Columnizer()
	 * @see com.misc.common.moplaf.datatools.ColumnizerExplicit#getColumns
	 * @model opposite="Columns" required="true" transient="false"
	 * @generated
	 */
	ColumnizerExplicit getColumnizer();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.datatools.ColumnizerColumn#getColumnizer <em>Columnizer</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Columnizer</em>' container reference.
	 * @see #getColumnizer()
	 * @generated
	 */
	void setColumnizer(ColumnizerExplicit value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Object getValue(EObject object);

} // ColumnizerColumn
