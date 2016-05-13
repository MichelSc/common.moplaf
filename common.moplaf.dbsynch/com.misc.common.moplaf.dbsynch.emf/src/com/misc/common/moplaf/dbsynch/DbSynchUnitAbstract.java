/**
 */
package com.misc.common.moplaf.dbsynch;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DbSynchUnit Abstract</b></em>'.
 * <p>
 * A DbSynch unit is the unit of synchronization. It supports
 * <ul> 
 * <li><i>down synchronization</i>: database date  synchronized from the object data,
 * <li><i>up synchronization</i>: object data synchronized from database data.
 * </ul>
 * <p>
 * A DbSynch contains {@link Table}'s and child units.
 * <p>
 * Specializations of DbSynch provide parameter values, that are gotten via {@link #getParamValue(EAttribute)}.
 * 
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.dbsynch.DbSynchUnitAbstract#getTables <em>Tables</em>}</li>
 *   <li>{@link com.misc.common.moplaf.dbsynch.DbSynchUnitAbstract#getDataSource <em>Data Source</em>}</li>
 *   <li>{@link com.misc.common.moplaf.dbsynch.DbSynchUnitAbstract#getName <em>Name</em>}</li>
 *   <li>{@link com.misc.common.moplaf.dbsynch.DbSynchUnitAbstract#getChildUnits <em>Child Units</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.dbsynch.DbSynchPackage#getDbSynchUnitAbstract()
 * @model abstract="true"
 * @generated
 */
public interface DbSynchUnitAbstract extends EObject {
	/**
	 * Returns the value of the '<em><b>Tables</b></em>' reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.dbsynch.Table}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tables</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tables</em>' reference list.
	 * @see com.misc.common.moplaf.dbsynch.DbSynchPackage#getDbSynchUnitAbstract_Tables()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<Table> getTables();

	/**
	 * Returns the value of the '<em><b>Data Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Source</em>' reference.
	 * @see com.misc.common.moplaf.dbsynch.DbSynchPackage#getDbSynchUnitAbstract_DataSource()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	DataSource getDataSource();

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
	 * @see com.misc.common.moplaf.dbsynch.DbSynchPackage#getDbSynchUnitAbstract_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.dbsynch.DbSynchUnitAbstract#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Child Units</b></em>' reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.dbsynch.DbSynchUnitAbstract}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child Units</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child Units</em>' reference list.
	 * @see com.misc.common.moplaf.dbsynch.DbSynchPackage#getDbSynchUnitAbstract_ChildUnits()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<DbSynchUnitAbstract> getChildUnits();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void refreshMetaData();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Load the tables in the group, update the rows accordingly (synchronize the application data as a function of what is read)
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	void synchUp();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Load the tables in the group, update the rows accordingly (synchronize the application data as a function of what is read)
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	void synchDown();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="com.misc.common.moplaf.dbsynch.Object" attributeDataType="com.misc.common.moplaf.dbsynch.EAttribute"
	 * @generated
	 */
	Object getParamValue(EAttribute attribute);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="com.misc.common.moplaf.dbsynch.Object"
	 * @generated
	 */
	EList<Object> getParamAttributes();

} // DbSynchUnitAbstract
