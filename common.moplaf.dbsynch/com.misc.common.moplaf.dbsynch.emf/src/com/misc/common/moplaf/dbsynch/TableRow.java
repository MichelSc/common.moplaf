/**
 */
package com.misc.common.moplaf.dbsynch;

import com.misc.common.moplaf.dbsynch.impl.TableRowKeyImpl;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table Row</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.dbsynch.TableRow#getTable <em>Table</em>}</li>
 *   <li>{@link com.misc.common.moplaf.dbsynch.TableRow#getKey <em>Key</em>}</li>
 *   <li>{@link com.misc.common.moplaf.dbsynch.TableRow#getModificationLastSynchUp <em>Modification Last Synch Up</em>}</li>
 *   <li>{@link com.misc.common.moplaf.dbsynch.TableRow#getModificationNextSynchDown <em>Modification Next Synch Down</em>}</li>
 *   <li>{@link com.misc.common.moplaf.dbsynch.TableRow#isDeleted <em>Deleted</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.dbsynch.DbSynchPackage#getTableRow()
 * @model abstract="true"
 * @generated
 */
public interface TableRow extends EObject {
	/**
	 * Returns the value of the '<em><b>Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table</em>' reference.
	 * @see com.misc.common.moplaf.dbsynch.DbSynchPackage#getTableRow_Table()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	Table getTable();

	/**
	 * Returns the value of the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' attribute.
	 * @see com.misc.common.moplaf.dbsynch.DbSynchPackage#getTableRow_Key()
	 * @model dataType="com.misc.common.moplaf.dbsynch.TableRowKey" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	TableRowKeyImpl getKey();

	/**
	 * Returns the value of the '<em><b>Modification Last Synch Up</b></em>' attribute.
	 * The literals are from the enumeration {@link com.misc.common.moplaf.dbsynch.EnumModification}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modification Last Synch Up</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modification Last Synch Up</em>' attribute.
	 * @see com.misc.common.moplaf.dbsynch.EnumModification
	 * @see #setModificationLastSynchUp(EnumModification)
	 * @see com.misc.common.moplaf.dbsynch.DbSynchPackage#getTableRow_ModificationLastSynchUp()
	 * @model
	 * @generated
	 */
	EnumModification getModificationLastSynchUp();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.dbsynch.TableRow#getModificationLastSynchUp <em>Modification Last Synch Up</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modification Last Synch Up</em>' attribute.
	 * @see com.misc.common.moplaf.dbsynch.EnumModification
	 * @see #getModificationLastSynchUp()
	 * @generated
	 */
	void setModificationLastSynchUp(EnumModification value);

	/**
	 * Returns the value of the '<em><b>Modification Next Synch Down</b></em>' attribute.
	 * The literals are from the enumeration {@link com.misc.common.moplaf.dbsynch.EnumModification}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modification Next Synch Down</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modification Next Synch Down</em>' attribute.
	 * @see com.misc.common.moplaf.dbsynch.EnumModification
	 * @see #setModificationNextSynchDown(EnumModification)
	 * @see com.misc.common.moplaf.dbsynch.DbSynchPackage#getTableRow_ModificationNextSynchDown()
	 * @model
	 * @generated
	 */
	EnumModification getModificationNextSynchDown();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.dbsynch.TableRow#getModificationNextSynchDown <em>Modification Next Synch Down</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modification Next Synch Down</em>' attribute.
	 * @see com.misc.common.moplaf.dbsynch.EnumModification
	 * @see #getModificationNextSynchDown()
	 * @generated
	 */
	void setModificationNextSynchDown(EnumModification value);

	/**
	 * Returns the value of the '<em><b>Deleted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deleted</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deleted</em>' attribute.
	 * @see #setDeleted(boolean)
	 * @see com.misc.common.moplaf.dbsynch.DbSynchPackage#getTableRow_Deleted()
	 * @model
	 * @generated
	 */
	boolean isDeleted();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.dbsynch.TableRow#isDeleted <em>Deleted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deleted</em>' attribute.
	 * @see #isDeleted()
	 * @generated
	 */
	void setDeleted(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void refresh();

} // TableRow
