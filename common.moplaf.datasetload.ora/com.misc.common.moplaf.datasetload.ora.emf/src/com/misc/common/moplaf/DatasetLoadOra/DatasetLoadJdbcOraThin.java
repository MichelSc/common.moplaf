/**
 */
package com.misc.common.moplaf.DatasetLoadOra;

import com.misc.common.moplaf.dbsynch.DataSourceJdbc;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dataset Load Jdbc Ora Thin</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.misc.common.moplaf.DatasetLoadOra.DatasetLoadJdbcOraThin#getHost <em>Host</em>}</li>
 *   <li>{@link com.misc.common.moplaf.DatasetLoadOra.DatasetLoadJdbcOraThin#getPort <em>Port</em>}</li>
 *   <li>{@link com.misc.common.moplaf.DatasetLoadOra.DatasetLoadJdbcOraThin#getDataBase <em>Data Base</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.misc.common.moplaf.DatasetLoadOra.DatasetLoadOraPackage#getDatasetLoadJdbcOraThin()
 * @model
 * @generated
 */
public interface DatasetLoadJdbcOraThin extends DataSourceJdbc {

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
	 * @see com.misc.common.moplaf.DatasetLoadOra.DatasetLoadOraPackage#getDatasetLoadJdbcOraThin_Host()
	 * @model
	 * @generated
	 */
	String getHost();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.DatasetLoadOra.DatasetLoadJdbcOraThin#getHost <em>Host</em>}' attribute.
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
	 * @see com.misc.common.moplaf.DatasetLoadOra.DatasetLoadOraPackage#getDatasetLoadJdbcOraThin_Port()
	 * @model
	 * @generated
	 */
	int getPort();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.DatasetLoadOra.DatasetLoadJdbcOraThin#getPort <em>Port</em>}' attribute.
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
	 * @see com.misc.common.moplaf.DatasetLoadOra.DatasetLoadOraPackage#getDatasetLoadJdbcOraThin_DataBase()
	 * @model
	 * @generated
	 */
	String getDataBase();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.DatasetLoadOra.DatasetLoadJdbcOraThin#getDataBase <em>Data Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Base</em>' attribute.
	 * @see #getDataBase()
	 * @generated
	 */
	void setDataBase(String value);
} // DatasetLoadJdbcOraThin
