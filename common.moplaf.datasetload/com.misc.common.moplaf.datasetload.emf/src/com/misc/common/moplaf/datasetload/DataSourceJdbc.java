/**
 */
package com.misc.common.moplaf.datasetload;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Source Jdbc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.misc.common.moplaf.datasetload.DataSourceJdbc#getDataBaseUser <em>Data Base User</em>}</li>
 *   <li>{@link com.misc.common.moplaf.datasetload.DataSourceJdbc#getDataBaseUserPwd <em>Data Base User Pwd</em>}</li>
 *   <li>{@link com.misc.common.moplaf.datasetload.DataSourceJdbc#getDefaultSchema <em>Default Schema</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.misc.common.moplaf.datasetload.DatasetloadPackage#getDataSourceJdbc()
 * @model
 * @generated
 */
public interface DataSourceJdbc extends DataSource {
	/**
	 * Returns the value of the '<em><b>Data Base User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Base User</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Base User</em>' attribute.
	 * @see #setDataBaseUser(String)
	 * @see com.misc.common.moplaf.datasetload.DatasetloadPackage#getDataSourceJdbc_DataBaseUser()
	 * @model
	 * @generated
	 */
	String getDataBaseUser();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.datasetload.DataSourceJdbc#getDataBaseUser <em>Data Base User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Base User</em>' attribute.
	 * @see #getDataBaseUser()
	 * @generated
	 */
	void setDataBaseUser(String value);

	/**
	 * Returns the value of the '<em><b>Data Base User Pwd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Base User Pwd</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Base User Pwd</em>' attribute.
	 * @see #setDataBaseUserPwd(String)
	 * @see com.misc.common.moplaf.datasetload.DatasetloadPackage#getDataSourceJdbc_DataBaseUserPwd()
	 * @model
	 * @generated
	 */
	String getDataBaseUserPwd();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.datasetload.DataSourceJdbc#getDataBaseUserPwd <em>Data Base User Pwd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Base User Pwd</em>' attribute.
	 * @see #getDataBaseUserPwd()
	 * @generated
	 */
	void setDataBaseUserPwd(String value);

	/**
	 * Returns the value of the '<em><b>Default Schema</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Schema</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Schema</em>' attribute.
	 * @see #setDefaultSchema(String)
	 * @see com.misc.common.moplaf.datasetload.DatasetloadPackage#getDataSourceJdbc_DefaultSchema()
	 * @model
	 * @generated
	 */
	String getDefaultSchema();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.datasetload.DataSourceJdbc#getDefaultSchema <em>Default Schema</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Schema</em>' attribute.
	 * @see #getDefaultSchema()
	 * @generated
	 */
	void setDefaultSchema(String value);

} // DataSourceJdbc
