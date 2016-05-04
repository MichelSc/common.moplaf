/**
 */
package com.misc.common.moplaf.dbsynch;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.dbsynch.DbSynchUnit#getParentUnit <em>Parent Unit</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.dbsynch.DbSynchPackage#getDbSynchUnit()
 * @model abstract="true"
 * @generated
 */
public interface DbSynchUnit extends DbSynchUnitAbstract {
	/**
	 * Returns the value of the '<em><b>Parent Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Unit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Unit</em>' reference.
	 * @see com.misc.common.moplaf.dbsynch.DbSynchPackage#getDbSynchUnit_ParentUnit()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	DbSynchUnitAbstract getParentUnit();

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

} // DbSynchUnit
