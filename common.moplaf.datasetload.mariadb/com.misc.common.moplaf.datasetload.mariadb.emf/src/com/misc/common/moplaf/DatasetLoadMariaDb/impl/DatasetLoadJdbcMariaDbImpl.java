/**
 */
package com.misc.common.moplaf.DatasetLoadMariaDb.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.misc.common.moplaf.DatasetLoadMariaDb.DatasetLoadJdbcMariaDb;
import com.misc.common.moplaf.DatasetLoadMariaDb.DatasetLoadMariaDbPackage;
import com.misc.common.moplaf.dbsynch.impl.DataSourceJdbcImpl;

import org.eclipse.emf.common.CommonPlugin;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dataset Load Jdbc Maria Db</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.misc.common.moplaf.DatasetLoadMariaDb.impl.DatasetLoadJdbcMariaDbImpl#getHost <em>Host</em>}</li>
 *   <li>{@link com.misc.common.moplaf.DatasetLoadMariaDb.impl.DatasetLoadJdbcMariaDbImpl#getPort <em>Port</em>}</li>
 *   <li>{@link com.misc.common.moplaf.DatasetLoadMariaDb.impl.DatasetLoadJdbcMariaDbImpl#getDataBase <em>Data Base</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DatasetLoadJdbcMariaDbImpl extends DataSourceJdbcImpl implements DatasetLoadJdbcMariaDb {
	/**
	 * The default value of the '{@link #getHost() <em>Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHost()
	 * @generated
	 * @ordered
	 */
	protected static final String HOST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHost() <em>Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHost()
	 * @generated
	 * @ordered
	 */
	protected String host = HOST_EDEFAULT;

	/**
	 * The default value of the '{@link #getPort() <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected static final int PORT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPort() <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected int port = PORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDataBase() <em>Data Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataBase()
	 * @generated
	 * @ordered
	 */
	protected static final String DATA_BASE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataBase() <em>Data Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataBase()
	 * @generated
	 * @ordered
	 */
	protected String dataBase = DATA_BASE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DatasetLoadJdbcMariaDbImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatasetLoadMariaDbPackage.Literals.DATASET_LOAD_JDBC_MARIA_DB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHost() {
		return host;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHost(String newHost) {
		String oldHost = host;
		host = newHost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatasetLoadMariaDbPackage.DATASET_LOAD_JDBC_MARIA_DB__HOST, oldHost, host));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPort() {
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPort(int newPort) {
		int oldPort = port;
		port = newPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatasetLoadMariaDbPackage.DATASET_LOAD_JDBC_MARIA_DB__PORT, oldPort, port));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDataBase() {
		return dataBase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataBase(String newDataBase) {
		String oldDataBase = dataBase;
		dataBase = newDataBase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatasetLoadMariaDbPackage.DATASET_LOAD_JDBC_MARIA_DB__DATA_BASE, oldDataBase, dataBase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DatasetLoadMariaDbPackage.DATASET_LOAD_JDBC_MARIA_DB__HOST:
				return getHost();
			case DatasetLoadMariaDbPackage.DATASET_LOAD_JDBC_MARIA_DB__PORT:
				return getPort();
			case DatasetLoadMariaDbPackage.DATASET_LOAD_JDBC_MARIA_DB__DATA_BASE:
				return getDataBase();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DatasetLoadMariaDbPackage.DATASET_LOAD_JDBC_MARIA_DB__HOST:
				setHost((String)newValue);
				return;
			case DatasetLoadMariaDbPackage.DATASET_LOAD_JDBC_MARIA_DB__PORT:
				setPort((Integer)newValue);
				return;
			case DatasetLoadMariaDbPackage.DATASET_LOAD_JDBC_MARIA_DB__DATA_BASE:
				setDataBase((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DatasetLoadMariaDbPackage.DATASET_LOAD_JDBC_MARIA_DB__HOST:
				setHost(HOST_EDEFAULT);
				return;
			case DatasetLoadMariaDbPackage.DATASET_LOAD_JDBC_MARIA_DB__PORT:
				setPort(PORT_EDEFAULT);
				return;
			case DatasetLoadMariaDbPackage.DATASET_LOAD_JDBC_MARIA_DB__DATA_BASE:
				setDataBase(DATA_BASE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DatasetLoadMariaDbPackage.DATASET_LOAD_JDBC_MARIA_DB__HOST:
				return HOST_EDEFAULT == null ? host != null : !HOST_EDEFAULT.equals(host);
			case DatasetLoadMariaDbPackage.DATASET_LOAD_JDBC_MARIA_DB__PORT:
				return port != PORT_EDEFAULT;
			case DatasetLoadMariaDbPackage.DATASET_LOAD_JDBC_MARIA_DB__DATA_BASE:
				return DATA_BASE_EDEFAULT == null ? dataBase != null : !DATA_BASE_EDEFAULT.equals(dataBase);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (Host: ");
		result.append(host);
		result.append(", Port: ");
		result.append(port);
		result.append(", DataBase: ");
		result.append(dataBase);
		result.append(')');
		return result.toString();
	}

	@Override
	protected Connection getConnectionImpl() throws ClassNotFoundException, SQLException{
		// load the driver
		// see: https://downloads.mariadb.org/client-java/1.1.8/
		String driver = "org.mariadb.jdbc.Driver";
		Class.forName(driver);
		
		// example of url "jdbc:mariadb://localhost:3306/project", "root", "")
		String databaseurl = String.format("jdbc:mariadb://%s:%d/%s",
				                           this.getHost(),
				                           this.getPort(),
				                           this.getDataBase());
		CommonPlugin.INSTANCE.log("Connection to be opened: " + databaseurl);
		Connection connection = DriverManager.getConnection (databaseurl, 
       										                 this.getDataBaseUser(), 
											                 this.getDataBaseUserPwd());
		return connection;
	}

} //DatasetLoadJdbcMariaDbImpl
