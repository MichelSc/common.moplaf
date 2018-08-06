/**
 */
package com.misc.common.moplaf.datatools;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Tools</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.datatools.DataTools#getDataTools <em>Data Tools</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.datatools.DatatoolsPackage#getDataTools()
 * @model
 * @generated
 */
public interface DataTools extends DataToolContext {
	/**
	 * Returns the value of the '<em><b>Data Tools</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.datatools.DataTool}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Tools</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Tools</em>' containment reference list.
	 * @see com.misc.common.moplaf.datatools.DatatoolsPackage#getDataTools_DataTools()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataTool> getDataTools();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Return an exemplar of every task type supported by this TaskDomain.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	EList<DataTool> getNewDataTools(DataToolType type);

} // DataTools
