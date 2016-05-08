/**
 */
package com.misc.common.moplaf.dbsynch.dbsynchmysql;

import com.misc.common.moplaf.dbsynch.DataSourceJdbc;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Source Jdbc My Sql</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.dbsynch.dbsynchmysql.DataSourceJdbcMySql#getHost <em>Host</em>}</li>
 *   <li>{@link com.misc.common.moplaf.dbsynch.dbsynchmysql.DataSourceJdbcMySql#getPort <em>Port</em>}</li>
 *   <li>{@link com.misc.common.moplaf.dbsynch.dbsynchmysql.DataSourceJdbcMySql#getDataBase <em>Data Base</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.dbsynch.dbsynchmysql.DbsynchmysqlPackage#getDataSourceJdbcMySql()
 * @model
 * @generated
 */
public interface DataSourceJdbcMySql extends DataSourceJdbc {

	/**
	 * Returns the value of the '<em><b>Host</b></em>' attribute.
	 * The default value is <code>"localshost"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Host</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host</em>' attribute.
	 * @see #setHost(String)
	 * @see com.misc.common.moplaf.dbsynch.dbsynchmysql.DbsynchmysqlPackage#getDataSourceJdbcMySql_Host()
	 * @model default="localshost"
	 * @generated
	 */
	String getHost();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.dbsynch.dbsynchmysql.DataSourceJdbcMySql#getHost <em>Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host</em>' attribute.
	 * @see #getHost()
	 * @generated
	 */
	void setHost(String value);

	/**
	 * Returns the value of the '<em><b>Port</b></em>' attribute.
	 * The default value is <code>"3306"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' attribute.
	 * @see #setPort(int)
	 * @see com.misc.common.moplaf.dbsynch.dbsynchmysql.DbsynchmysqlPackage#getDataSourceJdbcMySql_Port()
	 * @model default="3306"
	 * @generated
	 */
	int getPort();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.dbsynch.dbsynchmysql.DataSourceJdbcMySql#getPort <em>Port</em>}' attribute.
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
	 * @see com.misc.common.moplaf.dbsynch.dbsynchmysql.DbsynchmysqlPackage#getDataSourceJdbcMySql_DataBase()
	 * @model
	 * @generated
	 */
	String getDataBase();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.dbsynch.dbsynchmysql.DataSourceJdbcMySql#getDataBase <em>Data Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Base</em>' attribute.
	 * @see #getDataBase()
	 * @generated
	 */
	void setDataBase(String value);
} // DataSourceJdbcMySql
