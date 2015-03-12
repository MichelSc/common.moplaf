/**
 */
package com.misc.common.moplaf.datasetload;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.misc.common.moplaf.datasetload.TableGroup#getName <em>Name</em>}</li>
 *   <li>{@link com.misc.common.moplaf.datasetload.TableGroup#getTables <em>Tables</em>}</li>
 *   <li>{@link com.misc.common.moplaf.datasetload.TableGroup#getDataSource <em>Data Source</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.misc.common.moplaf.datasetload.DatasetloadPackage#getTableGroup()
 * @model abstract="true"
 * @generated
 */
public interface TableGroup extends EObject {
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
	 * @see com.misc.common.moplaf.datasetload.DatasetloadPackage#getTableGroup_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.datasetload.TableGroup#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Tables</b></em>' reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.datasetload.Table}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tables</em>' reference list.
	 * @see com.misc.common.moplaf.datasetload.DatasetloadPackage#getTableGroup_Tables()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<Table> getTables();

	/**
	 * Returns the value of the '<em><b>Data Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Source</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Source</em>' reference.
	 * @see com.misc.common.moplaf.datasetload.DatasetloadPackage#getTableGroup_DataSource()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	DataSource getDataSource();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Load the tables in the group, update the rows accordingly
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	void load();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Make sure the derived elements are up to date
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	void refresh();

} // TableGroup
