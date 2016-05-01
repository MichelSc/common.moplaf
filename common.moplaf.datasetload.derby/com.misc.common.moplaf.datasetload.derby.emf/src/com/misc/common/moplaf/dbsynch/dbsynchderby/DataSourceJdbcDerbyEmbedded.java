/**
 */
package com.misc.common.moplaf.dbsynch.dbsynchderby;

import com.misc.common.moplaf.dbsynch.DataSourceJdbc;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Source Jdbc Derby Embedded</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.dbsynch.dbsynchderby.DataSourceJdbcDerbyEmbedded#getDatabasePath <em>Database Path</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.dbsynch.dbsynchderby.DbsynchderbyPackage#getDataSourceJdbcDerbyEmbedded()
 * @model
 * @generated
 */
public interface DataSourceJdbcDerbyEmbedded extends DataSourceJdbc {
	/**
	 * Returns the value of the '<em><b>Database Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Database Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Database Path</em>' attribute.
	 * @see #setDatabasePath(String)
	 * @see com.misc.common.moplaf.dbsynch.dbsynchderby.DbsynchderbyPackage#getDataSourceJdbcDerbyEmbedded_DatabasePath()
	 * @model
	 * @generated
	 */
	String getDatabasePath();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.dbsynch.dbsynchderby.DataSourceJdbcDerbyEmbedded#getDatabasePath <em>Database Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Database Path</em>' attribute.
	 * @see #getDatabasePath()
	 * @generated
	 */
	void setDatabasePath(String value);

} // DataSourceJdbcDerbyEmbedded
