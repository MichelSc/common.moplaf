/**
 */
package com.misc.common.moplaf.DatasetLoadMariaDb;

import com.misc.common.moplaf.dbsynch.DataSourceJdbc;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dataset Load Jdbc Maria Db</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.misc.common.moplaf.DatasetLoadMariaDb.DatasetLoadJdbcMariaDb#getHost <em>Host</em>}</li>
 *   <li>{@link com.misc.common.moplaf.DatasetLoadMariaDb.DatasetLoadJdbcMariaDb#getPort <em>Port</em>}</li>
 *   <li>{@link com.misc.common.moplaf.DatasetLoadMariaDb.DatasetLoadJdbcMariaDb#getDataBase <em>Data Base</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.misc.common.moplaf.DatasetLoadMariaDb.DatasetLoadMariaDbPackage#getDatasetLoadJdbcMariaDb()
 * @model
 * @generated
 */
public interface DatasetLoadJdbcMariaDb extends DataSourceJdbc {
	/**
	 * Returns the value of the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Host</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host</em>' attribute.
	 * @see #setHost(String)
	 * @see com.misc.common.moplaf.DatasetLoadMariaDb.DatasetLoadMariaDbPackage#getDatasetLoadJdbcMariaDb_Host()
	 * @model
	 * @generated
	 */
	String getHost();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.DatasetLoadMariaDb.DatasetLoadJdbcMariaDb#getHost <em>Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host</em>' attribute.
	 * @see #getHost()
	 * @generated
	 */
	void setHost(String value);

	/**
	 * Returns the value of the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' attribute.
	 * @see #setPort(int)
	 * @see com.misc.common.moplaf.DatasetLoadMariaDb.DatasetLoadMariaDbPackage#getDatasetLoadJdbcMariaDb_Port()
	 * @model
	 * @generated
	 */
	int getPort();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.DatasetLoadMariaDb.DatasetLoadJdbcMariaDb#getPort <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' attribute.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(int value);

	/**
	 * Returns the value of the '<em><b>Data Base</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Base</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Base</em>' attribute.
	 * @see #setDataBase(String)
	 * @see com.misc.common.moplaf.DatasetLoadMariaDb.DatasetLoadMariaDbPackage#getDatasetLoadJdbcMariaDb_DataBase()
	 * @model
	 * @generated
	 */
	String getDataBase();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.DatasetLoadMariaDb.DatasetLoadJdbcMariaDb#getDataBase <em>Data Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Base</em>' attribute.
	 * @see #getDataBase()
	 * @generated
	 */
	void setDataBase(String value);

} // DatasetLoadJdbcMariaDb
