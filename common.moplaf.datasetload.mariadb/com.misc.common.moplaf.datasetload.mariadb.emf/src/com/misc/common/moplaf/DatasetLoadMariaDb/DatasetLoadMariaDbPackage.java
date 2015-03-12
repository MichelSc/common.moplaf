/**
 */
package com.misc.common.moplaf.DatasetLoadMariaDb;

import com.misc.common.moplaf.datasetload.DatasetloadPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.misc.common.moplaf.DatasetLoadMariaDb.DatasetLoadMariaDbFactory
 * @model kind="package"
 * @generated
 */
public interface DatasetLoadMariaDbPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "DatasetLoadMariaDb";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://com.misc.common.moplaf.datasetload/mariadb";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "loadmariadb";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DatasetLoadMariaDbPackage eINSTANCE = com.misc.common.moplaf.DatasetLoadMariaDb.impl.DatasetLoadMariaDbPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.DatasetLoadMariaDb.impl.DatasetLoadJdbcMariaDbImpl <em>Dataset Load Jdbc Maria Db</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.DatasetLoadMariaDb.impl.DatasetLoadJdbcMariaDbImpl
	 * @see com.misc.common.moplaf.DatasetLoadMariaDb.impl.DatasetLoadMariaDbPackageImpl#getDatasetLoadJdbcMariaDb()
	 * @generated
	 */
	int DATASET_LOAD_JDBC_MARIA_DB = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_LOAD_JDBC_MARIA_DB__NAME = DatasetloadPackage.DATA_SOURCE_JDBC__NAME;

	/**
	 * The feature id for the '<em><b>Connected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_LOAD_JDBC_MARIA_DB__CONNECTED = DatasetloadPackage.DATA_SOURCE_JDBC__CONNECTED;

	/**
	 * The feature id for the '<em><b>Data Base User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_LOAD_JDBC_MARIA_DB__DATA_BASE_USER = DatasetloadPackage.DATA_SOURCE_JDBC__DATA_BASE_USER;

	/**
	 * The feature id for the '<em><b>Data Base User Pwd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_LOAD_JDBC_MARIA_DB__DATA_BASE_USER_PWD = DatasetloadPackage.DATA_SOURCE_JDBC__DATA_BASE_USER_PWD;

	/**
	 * The feature id for the '<em><b>Default Schema</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_LOAD_JDBC_MARIA_DB__DEFAULT_SCHEMA = DatasetloadPackage.DATA_SOURCE_JDBC__DEFAULT_SCHEMA;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_LOAD_JDBC_MARIA_DB__HOST = DatasetloadPackage.DATA_SOURCE_JDBC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_LOAD_JDBC_MARIA_DB__PORT = DatasetloadPackage.DATA_SOURCE_JDBC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Data Base</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_LOAD_JDBC_MARIA_DB__DATA_BASE = DatasetloadPackage.DATA_SOURCE_JDBC_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Dataset Load Jdbc Maria Db</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_LOAD_JDBC_MARIA_DB_FEATURE_COUNT = DatasetloadPackage.DATA_SOURCE_JDBC_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Connect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_LOAD_JDBC_MARIA_DB___CONNECT = DatasetloadPackage.DATA_SOURCE_JDBC___CONNECT;

	/**
	 * The operation id for the '<em>Disconnect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_LOAD_JDBC_MARIA_DB___DISCONNECT = DatasetloadPackage.DATA_SOURCE_JDBC___DISCONNECT;

	/**
	 * The operation id for the '<em>Load Table Impl</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_LOAD_JDBC_MARIA_DB___LOAD_TABLE_IMPL__TABLE = DatasetloadPackage.DATA_SOURCE_JDBC___LOAD_TABLE_IMPL__TABLE;

	/**
	 * The number of operations of the '<em>Dataset Load Jdbc Maria Db</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_LOAD_JDBC_MARIA_DB_OPERATION_COUNT = DatasetloadPackage.DATA_SOURCE_JDBC_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.DatasetLoadMariaDb.DatasetLoadJdbcMariaDb <em>Dataset Load Jdbc Maria Db</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dataset Load Jdbc Maria Db</em>'.
	 * @see com.misc.common.moplaf.DatasetLoadMariaDb.DatasetLoadJdbcMariaDb
	 * @generated
	 */
	EClass getDatasetLoadJdbcMariaDb();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.DatasetLoadMariaDb.DatasetLoadJdbcMariaDb#getHost <em>Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host</em>'.
	 * @see com.misc.common.moplaf.DatasetLoadMariaDb.DatasetLoadJdbcMariaDb#getHost()
	 * @see #getDatasetLoadJdbcMariaDb()
	 * @generated
	 */
	EAttribute getDatasetLoadJdbcMariaDb_Host();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.DatasetLoadMariaDb.DatasetLoadJdbcMariaDb#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see com.misc.common.moplaf.DatasetLoadMariaDb.DatasetLoadJdbcMariaDb#getPort()
	 * @see #getDatasetLoadJdbcMariaDb()
	 * @generated
	 */
	EAttribute getDatasetLoadJdbcMariaDb_Port();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.DatasetLoadMariaDb.DatasetLoadJdbcMariaDb#getDataBase <em>Data Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Base</em>'.
	 * @see com.misc.common.moplaf.DatasetLoadMariaDb.DatasetLoadJdbcMariaDb#getDataBase()
	 * @see #getDatasetLoadJdbcMariaDb()
	 * @generated
	 */
	EAttribute getDatasetLoadJdbcMariaDb_DataBase();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DatasetLoadMariaDbFactory getDatasetLoadMariaDbFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.DatasetLoadMariaDb.impl.DatasetLoadJdbcMariaDbImpl <em>Dataset Load Jdbc Maria Db</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.DatasetLoadMariaDb.impl.DatasetLoadJdbcMariaDbImpl
		 * @see com.misc.common.moplaf.DatasetLoadMariaDb.impl.DatasetLoadMariaDbPackageImpl#getDatasetLoadJdbcMariaDb()
		 * @generated
		 */
		EClass DATASET_LOAD_JDBC_MARIA_DB = eINSTANCE.getDatasetLoadJdbcMariaDb();

		/**
		 * The meta object literal for the '<em><b>Host</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATASET_LOAD_JDBC_MARIA_DB__HOST = eINSTANCE.getDatasetLoadJdbcMariaDb_Host();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATASET_LOAD_JDBC_MARIA_DB__PORT = eINSTANCE.getDatasetLoadJdbcMariaDb_Port();

		/**
		 * The meta object literal for the '<em><b>Data Base</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATASET_LOAD_JDBC_MARIA_DB__DATA_BASE = eINSTANCE.getDatasetLoadJdbcMariaDb_DataBase();

	}

} //DatasetLoadMariaDbPackage
