/**
 */
package com.misc.common.moplaf.DatasetLoadOra;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import com.misc.common.moplaf.dbsynch.DatasetloadPackage;

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
 * @see com.misc.common.moplaf.DatasetLoadOra.DatasetLoadOraFactory
 * @model kind="package"
 * @generated
 */
public interface DatasetLoadOraPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "DatasetLoadOra";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://com.misc.common.moplaf.datasetload/ora";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "loadora";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DatasetLoadOraPackage eINSTANCE = com.misc.common.moplaf.DatasetLoadOra.impl.DatasetLoadOraPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.DatasetLoadOra.impl.DatasetLoadJdbcOraThinImpl <em>Dataset Load Jdbc Ora Thin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.DatasetLoadOra.impl.DatasetLoadJdbcOraThinImpl
	 * @see com.misc.common.moplaf.DatasetLoadOra.impl.DatasetLoadOraPackageImpl#getDatasetLoadJdbcOraThin()
	 * @generated
	 */
	int DATASET_LOAD_JDBC_ORA_THIN = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_LOAD_JDBC_ORA_THIN__NAME = DatasetloadPackage.DATA_SOURCE_JDBC__NAME;

	/**
	 * The feature id for the '<em><b>Connected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_LOAD_JDBC_ORA_THIN__CONNECTED = DatasetloadPackage.DATA_SOURCE_JDBC__CONNECTED;

	/**
	 * The feature id for the '<em><b>Data Base User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_LOAD_JDBC_ORA_THIN__DATA_BASE_USER = DatasetloadPackage.DATA_SOURCE_JDBC__DATA_BASE_USER;

	/**
	 * The feature id for the '<em><b>Data Base User Pwd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_LOAD_JDBC_ORA_THIN__DATA_BASE_USER_PWD = DatasetloadPackage.DATA_SOURCE_JDBC__DATA_BASE_USER_PWD;

	/**
	 * The feature id for the '<em><b>Default Schema</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_LOAD_JDBC_ORA_THIN__DEFAULT_SCHEMA = DatasetloadPackage.DATA_SOURCE_JDBC__DEFAULT_SCHEMA;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_LOAD_JDBC_ORA_THIN__HOST = DatasetloadPackage.DATA_SOURCE_JDBC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_LOAD_JDBC_ORA_THIN__PORT = DatasetloadPackage.DATA_SOURCE_JDBC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Data Base</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_LOAD_JDBC_ORA_THIN__DATA_BASE = DatasetloadPackage.DATA_SOURCE_JDBC_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Dataset Load Jdbc Ora Thin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_LOAD_JDBC_ORA_THIN_FEATURE_COUNT = DatasetloadPackage.DATA_SOURCE_JDBC_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Connect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_LOAD_JDBC_ORA_THIN___CONNECT = DatasetloadPackage.DATA_SOURCE_JDBC___CONNECT;

	/**
	 * The operation id for the '<em>Disconnect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_LOAD_JDBC_ORA_THIN___DISCONNECT = DatasetloadPackage.DATA_SOURCE_JDBC___DISCONNECT;

	/**
	 * The operation id for the '<em>Load Table Impl</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_LOAD_JDBC_ORA_THIN___LOAD_TABLE_IMPL__TABLE = DatasetloadPackage.DATA_SOURCE_JDBC___LOAD_TABLE_IMPL__TABLE;

	/**
	 * The number of operations of the '<em>Dataset Load Jdbc Ora Thin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_LOAD_JDBC_ORA_THIN_OPERATION_COUNT = DatasetloadPackage.DATA_SOURCE_JDBC_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.DatasetLoadOra.DatasetLoadJdbcOraThin <em>Dataset Load Jdbc Ora Thin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dataset Load Jdbc Ora Thin</em>'.
	 * @see com.misc.common.moplaf.DatasetLoadOra.DatasetLoadJdbcOraThin
	 * @generated
	 */
	EClass getDatasetLoadJdbcOraThin();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.DatasetLoadOra.DatasetLoadJdbcOraThin#getHost <em>Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host</em>'.
	 * @see com.misc.common.moplaf.DatasetLoadOra.DatasetLoadJdbcOraThin#getHost()
	 * @see #getDatasetLoadJdbcOraThin()
	 * @generated
	 */
	EAttribute getDatasetLoadJdbcOraThin_Host();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.DatasetLoadOra.DatasetLoadJdbcOraThin#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see com.misc.common.moplaf.DatasetLoadOra.DatasetLoadJdbcOraThin#getPort()
	 * @see #getDatasetLoadJdbcOraThin()
	 * @generated
	 */
	EAttribute getDatasetLoadJdbcOraThin_Port();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.DatasetLoadOra.DatasetLoadJdbcOraThin#getDataBase <em>Data Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Base</em>'.
	 * @see com.misc.common.moplaf.DatasetLoadOra.DatasetLoadJdbcOraThin#getDataBase()
	 * @see #getDatasetLoadJdbcOraThin()
	 * @generated
	 */
	EAttribute getDatasetLoadJdbcOraThin_DataBase();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DatasetLoadOraFactory getDatasetLoadOraFactory();

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
		 * The meta object literal for the '{@link com.misc.common.moplaf.DatasetLoadOra.impl.DatasetLoadJdbcOraThinImpl <em>Dataset Load Jdbc Ora Thin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.DatasetLoadOra.impl.DatasetLoadJdbcOraThinImpl
		 * @see com.misc.common.moplaf.DatasetLoadOra.impl.DatasetLoadOraPackageImpl#getDatasetLoadJdbcOraThin()
		 * @generated
		 */
		EClass DATASET_LOAD_JDBC_ORA_THIN = eINSTANCE.getDatasetLoadJdbcOraThin();
		/**
		 * The meta object literal for the '<em><b>Host</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATASET_LOAD_JDBC_ORA_THIN__HOST = eINSTANCE.getDatasetLoadJdbcOraThin_Host();
		/**
		 * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATASET_LOAD_JDBC_ORA_THIN__PORT = eINSTANCE.getDatasetLoadJdbcOraThin_Port();
		/**
		 * The meta object literal for the '<em><b>Data Base</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATASET_LOAD_JDBC_ORA_THIN__DATA_BASE = eINSTANCE.getDatasetLoadJdbcOraThin_DataBase();

	}

} //DatasetLoadOraPackage
