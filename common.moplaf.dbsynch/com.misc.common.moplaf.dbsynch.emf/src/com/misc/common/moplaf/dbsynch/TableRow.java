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
 *   <li>{@link com.misc.common.moplaf.dbsynch.TableRow#getCurrentKey <em>Current Key</em>}</li>
 *   <li>{@link com.misc.common.moplaf.dbsynch.TableRow#isDeleted <em>Deleted</em>}</li>
 *   <li>{@link com.misc.common.moplaf.dbsynch.TableRow#getIndexKey <em>Index Key</em>}</li>
 *   <li>{@link com.misc.common.moplaf.dbsynch.TableRow#getLastSynchDownKey <em>Last Synch Down Key</em>}</li>
 *   <li>{@link com.misc.common.moplaf.dbsynch.TableRow#isLastSynchDownDeleted <em>Last Synch Down Deleted</em>}</li>
 *   <li>{@link com.misc.common.moplaf.dbsynch.TableRow#getModificationLastSynchUp <em>Modification Last Synch Up</em>}</li>
 *   <li>{@link com.misc.common.moplaf.dbsynch.TableRow#getModificationNextSynchDown <em>Modification Next Synch Down</em>}</li>
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
	 * Returns the value of the '<em><b>Current Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Key</em>' attribute.
	 * @see com.misc.common.moplaf.dbsynch.DbSynchPackage#getTableRow_CurrentKey()
	 * @model dataType="com.misc.common.moplaf.dbsynch.TableRowKey" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	TableRowKeyImpl getCurrentKey();

	/**
	 * Returns the value of the '<em><b>Index Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Index Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index Key</em>' attribute.
	 * @see #setIndexKey(TableRowKeyImpl)
	 * @see com.misc.common.moplaf.dbsynch.DbSynchPackage#getTableRow_IndexKey()
	 * @model dataType="com.misc.common.moplaf.dbsynch.TableRowKey" transient="true"
	 * @generated
	 */
	TableRowKeyImpl getIndexKey();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.dbsynch.TableRow#getIndexKey <em>Index Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index Key</em>' attribute.
	 * @see #getIndexKey()
	 * @generated
	 */
	void setIndexKey(TableRowKeyImpl value);

	/**
	 * Returns the value of the '<em><b>Last Synch Down Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Synch Down Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Synch Down Key</em>' attribute.
	 * @see #setLastSynchDownKey(TableRowKeyImpl)
	 * @see com.misc.common.moplaf.dbsynch.DbSynchPackage#getTableRow_LastSynchDownKey()
	 * @model dataType="com.misc.common.moplaf.dbsynch.TableRowKey" transient="true"
	 * @generated
	 */
	TableRowKeyImpl getLastSynchDownKey();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.dbsynch.TableRow#getLastSynchDownKey <em>Last Synch Down Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Synch Down Key</em>' attribute.
	 * @see #getLastSynchDownKey()
	 * @generated
	 */
	void setLastSynchDownKey(TableRowKeyImpl value);

	/**
	 * Returns the value of the '<em><b>Last Synch Down Deleted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Synch Down Deleted</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Synch Down Deleted</em>' attribute.
	 * @see #setLastSynchDownDeleted(boolean)
	 * @see com.misc.common.moplaf.dbsynch.DbSynchPackage#getTableRow_LastSynchDownDeleted()
	 * @model transient="true"
	 * @generated
	 */
	boolean isLastSynchDownDeleted();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.dbsynch.TableRow#isLastSynchDownDeleted <em>Last Synch Down Deleted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Synch Down Deleted</em>' attribute.
	 * @see #isLastSynchDownDeleted()
	 * @generated
	 */
	void setLastSynchDownDeleted(boolean value);

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
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deleted</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deleted</em>' attribute.
	 * @see #setDeleted(boolean)
	 * @see com.misc.common.moplaf.dbsynch.DbSynchPackage#getTableRow_Deleted()
	 * @model default="true"
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
