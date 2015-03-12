/**
 */
package com.misc.common.moplaf.DatasetLoadDerby;

import com.misc.common.moplaf.datasetload.DataSourceJdbc;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Source Jdb Derby Embedded</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.misc.common.moplaf.DatasetLoadDerby.DataSourceJdbDerbyEmbedded#getDatabasePath <em>Database Path</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.misc.common.moplaf.DatasetLoadDerby.DatasetLoadDerbyPackage#getDataSourceJdbDerbyEmbedded()
 * @model
 * @generated
 */
public interface DataSourceJdbDerbyEmbedded extends DataSourceJdbc {
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
	 * @see com.misc.common.moplaf.DatasetLoadDerby.DatasetLoadDerbyPackage#getDataSourceJdbDerbyEmbedded_DatabasePath()
	 * @model
	 * @generated
	 */
	String getDatabasePath();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.DatasetLoadDerby.DataSourceJdbDerbyEmbedded#getDatabasePath <em>Database Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Database Path</em>' attribute.
	 * @see #getDatabasePath()
	 * @generated
	 */
	void setDatabasePath(String value);

} // DataSourceJdbDerbyEmbedded
