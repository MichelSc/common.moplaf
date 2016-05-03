/**
 */
package com.misc.common.moplaf.dbsynch;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table Column</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.dbsynch.TableColumn#getColumnName <em>Column Name</em>}</li>
 *   <li>{@link com.misc.common.moplaf.dbsynch.TableColumn#isVolatile <em>Volatile</em>}</li>
 *   <li>{@link com.misc.common.moplaf.dbsynch.TableColumn#getRowAttribute <em>Row Attribute</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.dbsynch.DbSynchPackage#getTableColumn()
 * @model
 * @generated
 */
public interface TableColumn extends EObject {
	/**
	 * Returns the value of the '<em><b>Column Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Column Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column Name</em>' attribute.
	 * @see #setColumnName(String)
	 * @see com.misc.common.moplaf.dbsynch.DbSynchPackage#getTableColumn_ColumnName()
	 * @model
	 * @generated
	 */
	String getColumnName();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.dbsynch.TableColumn#getColumnName <em>Column Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column Name</em>' attribute.
	 * @see #getColumnName()
	 * @generated
	 */
	void setColumnName(String value);

	/**
	 * Returns the value of the '<em><b>Row Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Row Attribute</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Row Attribute</em>' reference.
	 * @see #setRowAttribute(EAttribute)
	 * @see com.misc.common.moplaf.dbsynch.DbSynchPackage#getTableColumn_RowAttribute()
	 * @model
	 * @generated
	 */
	EAttribute getRowAttribute();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.dbsynch.TableColumn#getRowAttribute <em>Row Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Row Attribute</em>' reference.
	 * @see #getRowAttribute()
	 * @generated
	 */
	void setRowAttribute(EAttribute value);

	/**
	 * Returns the value of the '<em><b>Volatile</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Volatile</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Volatile</em>' attribute.
	 * @see #setVolatile(boolean)
	 * @see com.misc.common.moplaf.dbsynch.DbSynchPackage#getTableColumn_Volatile()
	 * @model default="false"
	 * @generated
	 */
	boolean isVolatile();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.dbsynch.TableColumn#isVolatile <em>Volatile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Volatile</em>' attribute.
	 * @see #isVolatile()
	 * @generated
	 */
	void setVolatile(boolean value);

} // TableColumn
