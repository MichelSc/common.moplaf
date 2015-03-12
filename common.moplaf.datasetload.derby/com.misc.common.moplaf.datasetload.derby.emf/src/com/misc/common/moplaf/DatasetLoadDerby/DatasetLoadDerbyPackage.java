/**
 */
package com.misc.common.moplaf.DatasetLoadDerby;

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
 * @see com.misc.common.moplaf.DatasetLoadDerby.DatasetLoadDerbyFactory
 * @model kind="package"
 * @generated
 */
public interface DatasetLoadDerbyPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "DatasetLoadDerby";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://com.misc.common.moplaf.datasetload/derby";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "loadderby";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DatasetLoadDerbyPackage eINSTANCE = com.misc.common.moplaf.DatasetLoadDerby.impl.DatasetLoadDerbyPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.DatasetLoadDerby.impl.DataSourceJdbDerbyEmbeddedImpl <em>Data Source Jdb Derby Embedded</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.DatasetLoadDerby.impl.DataSourceJdbDerbyEmbeddedImpl
	 * @see com.misc.common.moplaf.DatasetLoadDerby.impl.DatasetLoadDerbyPackageImpl#getDataSourceJdbDerbyEmbedded()
	 * @generated
	 */
	int DATA_SOURCE_JDB_DERBY_EMBEDDED = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_JDB_DERBY_EMBEDDED__NAME = DatasetloadPackage.DATA_SOURCE_JDBC__NAME;

	/**
	 * The feature id for the '<em><b>Connected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_JDB_DERBY_EMBEDDED__CONNECTED = DatasetloadPackage.DATA_SOURCE_JDBC__CONNECTED;

	/**
	 * The feature id for the '<em><b>Data Base User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_JDB_DERBY_EMBEDDED__DATA_BASE_USER = DatasetloadPackage.DATA_SOURCE_JDBC__DATA_BASE_USER;

	/**
	 * The feature id for the '<em><b>Data Base User Pwd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_JDB_DERBY_EMBEDDED__DATA_BASE_USER_PWD = DatasetloadPackage.DATA_SOURCE_JDBC__DATA_BASE_USER_PWD;

	/**
	 * The feature id for the '<em><b>Default Schema</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_JDB_DERBY_EMBEDDED__DEFAULT_SCHEMA = DatasetloadPackage.DATA_SOURCE_JDBC__DEFAULT_SCHEMA;

	/**
	 * The feature id for the '<em><b>Database Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_JDB_DERBY_EMBEDDED__DATABASE_PATH = DatasetloadPackage.DATA_SOURCE_JDBC_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data Source Jdb Derby Embedded</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_JDB_DERBY_EMBEDDED_FEATURE_COUNT = DatasetloadPackage.DATA_SOURCE_JDBC_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Connect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_JDB_DERBY_EMBEDDED___CONNECT = DatasetloadPackage.DATA_SOURCE_JDBC___CONNECT;

	/**
	 * The operation id for the '<em>Disconnect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_JDB_DERBY_EMBEDDED___DISCONNECT = DatasetloadPackage.DATA_SOURCE_JDBC___DISCONNECT;

	/**
	 * The operation id for the '<em>Load Table Impl</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_JDB_DERBY_EMBEDDED___LOAD_TABLE_IMPL__TABLE = DatasetloadPackage.DATA_SOURCE_JDBC___LOAD_TABLE_IMPL__TABLE;

	/**
	 * The number of operations of the '<em>Data Source Jdb Derby Embedded</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_JDB_DERBY_EMBEDDED_OPERATION_COUNT = DatasetloadPackage.DATA_SOURCE_JDBC_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.DatasetLoadDerby.DataSourceJdbDerbyEmbedded <em>Data Source Jdb Derby Embedded</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Source Jdb Derby Embedded</em>'.
	 * @see com.misc.common.moplaf.DatasetLoadDerby.DataSourceJdbDerbyEmbedded
	 * @generated
	 */
	EClass getDataSourceJdbDerbyEmbedded();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.DatasetLoadDerby.DataSourceJdbDerbyEmbedded#getDatabasePath <em>Database Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Database Path</em>'.
	 * @see com.misc.common.moplaf.DatasetLoadDerby.DataSourceJdbDerbyEmbedded#getDatabasePath()
	 * @see #getDataSourceJdbDerbyEmbedded()
	 * @generated
	 */
	EAttribute getDataSourceJdbDerbyEmbedded_DatabasePath();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DatasetLoadDerbyFactory getDatasetLoadDerbyFactory();

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
		 * The meta object literal for the '{@link com.misc.common.moplaf.DatasetLoadDerby.impl.DataSourceJdbDerbyEmbeddedImpl <em>Data Source Jdb Derby Embedded</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.DatasetLoadDerby.impl.DataSourceJdbDerbyEmbeddedImpl
		 * @see com.misc.common.moplaf.DatasetLoadDerby.impl.DatasetLoadDerbyPackageImpl#getDataSourceJdbDerbyEmbedded()
		 * @generated
		 */
		EClass DATA_SOURCE_JDB_DERBY_EMBEDDED = eINSTANCE.getDataSourceJdbDerbyEmbedded();

		/**
		 * The meta object literal for the '<em><b>Database Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SOURCE_JDB_DERBY_EMBEDDED__DATABASE_PATH = eINSTANCE.getDataSourceJdbDerbyEmbedded_DatabasePath();

	}

} //DatasetLoadDerbyPackage
