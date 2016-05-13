/**
 */
package com.misc.common.moplaf.dbsynch;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table Column</b></em>'.
 * <p>
 * A TableColumn maps a column of the database table on an attribute of a concrete TableRow.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.dbsynch.TableColumn#isKey <em>Key</em>}</li>
 *   <li>{@link com.misc.common.moplaf.dbsynch.TableColumn#getColumnName <em>Column Name</em>}</li>
 *   <li>{@link com.misc.common.moplaf.dbsynch.TableColumn#getColumnType <em>Column Type</em>}</li>
 *   <li>{@link com.misc.common.moplaf.dbsynch.TableColumn#getRowAttribute <em>Row Attribute</em>}</li>
 *   <li>{@link com.misc.common.moplaf.dbsynch.TableColumn#getTable <em>Table</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.dbsynch.DbSynchPackage#getTableColumn()
 * @model
 * @generated
 */
public interface TableColumn extends EObject {
	/**
	 * Returns the value of the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' attribute.
	 * @see com.misc.common.moplaf.dbsynch.DbSynchPackage#getTableColumn_Key()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	boolean isKey();

	/**
	 * Returns the value of the '<em><b>Column Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Column Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column Name</em>' attribute.
	 * @see #setColumnName(String)
	 * @see com.misc.common.moplaf.dbsynch.DbSynchPackage#getTableColumn_ColumnName()
	 * @model default=""
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
	 * Returns the value of the '<em><b>Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table</em>' reference.
	 * @see com.misc.common.moplaf.dbsynch.DbSynchPackage#getTableColumn_Table()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	Table getTable();

	/**
	 * Returns the value of the '<em><b>Column Type</b></em>' attribute.
	 * The literals are from the enumeration {@link com.misc.common.moplaf.dbsynch.EnumColumnType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Column Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column Type</em>' attribute.
	 * @see com.misc.common.moplaf.dbsynch.EnumColumnType
	 * @see #isSetColumnType()
	 * @see #unsetColumnType()
	 * @see #setColumnType(EnumColumnType)
	 * @see com.misc.common.moplaf.dbsynch.DbSynchPackage#getTableColumn_ColumnType()
	 * @model unsettable="true"
	 * @generated
	 */
	EnumColumnType getColumnType();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.dbsynch.TableColumn#getColumnType <em>Column Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column Type</em>' attribute.
	 * @see com.misc.common.moplaf.dbsynch.EnumColumnType
	 * @see #isSetColumnType()
	 * @see #unsetColumnType()
	 * @see #getColumnType()
	 * @generated
	 */
	void setColumnType(EnumColumnType value);

	/**
	 * Unsets the value of the '{@link com.misc.common.moplaf.dbsynch.TableColumn#getColumnType <em>Column Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetColumnType()
	 * @see #getColumnType()
	 * @see #setColumnType(EnumColumnType)
	 * @generated
	 */
	void unsetColumnType();

	/**
	 * Returns whether the value of the '{@link com.misc.common.moplaf.dbsynch.TableColumn#getColumnType <em>Column Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Column Type</em>' attribute is set.
	 * @see #unsetColumnType()
	 * @see #getColumnType()
	 * @see #setColumnType(EnumColumnType)
	 * @generated
	 */
	boolean isSetColumnType();

} // TableColumn
