/**
 */
package com.misc.common.moplaf.dbsynch.dbsynchderby;

import com.misc.common.moplaf.dbsynch.DbSynchPackage;

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
 * @see com.misc.common.moplaf.dbsynch.dbsynchderby.DbsynchderbyFactory
 * @model kind="package"
 * @generated
 */
public interface DbsynchderbyPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "dbsynchderby";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.misc.com/common/moplaf/dbsynch/derby/model/0.1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "dbsd";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DbsynchderbyPackage eINSTANCE = com.misc.common.moplaf.dbsynch.dbsynchderby.impl.DbsynchderbyPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.dbsynch.dbsynchderby.impl.DataSourceJdbcDerbyEmbeddedImpl <em>Data Source Jdbc Derby Embedded</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.dbsynch.dbsynchderby.impl.DataSourceJdbcDerbyEmbeddedImpl
	 * @see com.misc.common.moplaf.dbsynch.dbsynchderby.impl.DbsynchderbyPackageImpl#getDataSourceJdbcDerbyEmbedded()
	 * @generated
	 */
	int DATA_SOURCE_JDBC_DERBY_EMBEDDED = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_JDBC_DERBY_EMBEDDED__NAME = DbSynchPackage.DATA_SOURCE_JDBC__NAME;

	/**
	 * The feature id for the '<em><b>Connected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_JDBC_DERBY_EMBEDDED__CONNECTED = DbSynchPackage.DATA_SOURCE_JDBC__CONNECTED;

	/**
	 * The feature id for the '<em><b>Data Base User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_JDBC_DERBY_EMBEDDED__DATA_BASE_USER = DbSynchPackage.DATA_SOURCE_JDBC__DATA_BASE_USER;

	/**
	 * The feature id for the '<em><b>Data Base User Pwd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_JDBC_DERBY_EMBEDDED__DATA_BASE_USER_PWD = DbSynchPackage.DATA_SOURCE_JDBC__DATA_BASE_USER_PWD;

	/**
	 * The feature id for the '<em><b>Default Schema</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_JDBC_DERBY_EMBEDDED__DEFAULT_SCHEMA = DbSynchPackage.DATA_SOURCE_JDBC__DEFAULT_SCHEMA;

	/**
	 * The feature id for the '<em><b>Database Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_JDBC_DERBY_EMBEDDED__DATABASE_PATH = DbSynchPackage.DATA_SOURCE_JDBC_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data Source Jdbc Derby Embedded</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_JDBC_DERBY_EMBEDDED_FEATURE_COUNT = DbSynchPackage.DATA_SOURCE_JDBC_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Connect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_JDBC_DERBY_EMBEDDED___CONNECT = DbSynchPackage.DATA_SOURCE_JDBC___CONNECT;

	/**
	 * The operation id for the '<em>Disconnect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_JDBC_DERBY_EMBEDDED___DISCONNECT = DbSynchPackage.DATA_SOURCE_JDBC___DISCONNECT;

	/**
	 * The operation id for the '<em>Synch Down Table Impl</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_JDBC_DERBY_EMBEDDED___SYNCH_DOWN_TABLE_IMPL__TABLE = DbSynchPackage.DATA_SOURCE_JDBC___SYNCH_DOWN_TABLE_IMPL__TABLE;

	/**
	 * The operation id for the '<em>Synch Up Table Impl</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_JDBC_DERBY_EMBEDDED___SYNCH_UP_TABLE_IMPL__TABLE = DbSynchPackage.DATA_SOURCE_JDBC___SYNCH_UP_TABLE_IMPL__TABLE;

	/**
	 * The number of operations of the '<em>Data Source Jdbc Derby Embedded</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_JDBC_DERBY_EMBEDDED_OPERATION_COUNT = DbSynchPackage.DATA_SOURCE_JDBC_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.dbsynch.dbsynchderby.DataSourceJdbcDerbyEmbedded <em>Data Source Jdbc Derby Embedded</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Source Jdbc Derby Embedded</em>'.
	 * @see com.misc.common.moplaf.dbsynch.dbsynchderby.DataSourceJdbcDerbyEmbedded
	 * @generated
	 */
	EClass getDataSourceJdbcDerbyEmbedded();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.dbsynch.dbsynchderby.DataSourceJdbcDerbyEmbedded#getDatabasePath <em>Database Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Database Path</em>'.
	 * @see com.misc.common.moplaf.dbsynch.dbsynchderby.DataSourceJdbcDerbyEmbedded#getDatabasePath()
	 * @see #getDataSourceJdbcDerbyEmbedded()
	 * @generated
	 */
	EAttribute getDataSourceJdbcDerbyEmbedded_DatabasePath();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DbsynchderbyFactory getDbsynchderbyFactory();

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
		 * The meta object literal for the '{@link com.misc.common.moplaf.dbsynch.dbsynchderby.impl.DataSourceJdbcDerbyEmbeddedImpl <em>Data Source Jdbc Derby Embedded</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.dbsynch.dbsynchderby.impl.DataSourceJdbcDerbyEmbeddedImpl
		 * @see com.misc.common.moplaf.dbsynch.dbsynchderby.impl.DbsynchderbyPackageImpl#getDataSourceJdbcDerbyEmbedded()
		 * @generated
		 */
		EClass DATA_SOURCE_JDBC_DERBY_EMBEDDED = eINSTANCE.getDataSourceJdbcDerbyEmbedded();

		/**
		 * The meta object literal for the '<em><b>Database Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SOURCE_JDBC_DERBY_EMBEDDED__DATABASE_PATH = eINSTANCE.getDataSourceJdbcDerbyEmbedded_DatabasePath();

	}

} //DbsynchderbyPackage