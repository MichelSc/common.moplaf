/**
 */
package com.misc.common.moplaf.DatasetLoadOra.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.misc.common.moplaf.DatasetLoadOra.DatasetLoadJdbcOraThin;
import com.misc.common.moplaf.DatasetLoadOra.DatasetLoadOraPackage;
import com.misc.common.moplaf.datasetload.impl.DataSourceJdbcImpl;

import org.eclipse.emf.common.CommonPlugin;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dataset Load Jdbc Ora Thin</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.misc.common.moplaf.DatasetLoadOra.impl.DatasetLoadJdbcOraThinImpl#getHost <em>Host</em>}</li>
 *   <li>{@link com.misc.common.moplaf.DatasetLoadOra.impl.DatasetLoadJdbcOraThinImpl#getPort <em>Port</em>}</li>
 *   <li>{@link com.misc.common.moplaf.DatasetLoadOra.impl.DatasetLoadJdbcOraThinImpl#getDataBase <em>Data Base</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DatasetLoadJdbcOraThinImpl extends DataSourceJdbcImpl implements DatasetLoadJdbcOraThin {
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
	protected DatasetLoadJdbcOraThinImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatasetLoadOraPackage.Literals.DATASET_LOAD_JDBC_ORA_THIN;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DatasetLoadOraPackage.DATASET_LOAD_JDBC_ORA_THIN__HOST, oldHost, host));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DatasetLoadOraPackage.DATASET_LOAD_JDBC_ORA_THIN__PORT, oldPort, port));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DatasetLoadOraPackage.DATASET_LOAD_JDBC_ORA_THIN__DATA_BASE, oldDataBase, dataBase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DatasetLoadOraPackage.DATASET_LOAD_JDBC_ORA_THIN__HOST:
				return getHost();
			case DatasetLoadOraPackage.DATASET_LOAD_JDBC_ORA_THIN__PORT:
				return getPort();
			case DatasetLoadOraPackage.DATASET_LOAD_JDBC_ORA_THIN__DATA_BASE:
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
			case DatasetLoadOraPackage.DATASET_LOAD_JDBC_ORA_THIN__HOST:
				setHost((String)newValue);
				return;
			case DatasetLoadOraPackage.DATASET_LOAD_JDBC_ORA_THIN__PORT:
				setPort((Integer)newValue);
				return;
			case DatasetLoadOraPackage.DATASET_LOAD_JDBC_ORA_THIN__DATA_BASE:
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
			case DatasetLoadOraPackage.DATASET_LOAD_JDBC_ORA_THIN__HOST:
				setHost(HOST_EDEFAULT);
				return;
			case DatasetLoadOraPackage.DATASET_LOAD_JDBC_ORA_THIN__PORT:
				setPort(PORT_EDEFAULT);
				return;
			case DatasetLoadOraPackage.DATASET_LOAD_JDBC_ORA_THIN__DATA_BASE:
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
			case DatasetLoadOraPackage.DATASET_LOAD_JDBC_ORA_THIN__HOST:
				return HOST_EDEFAULT == null ? host != null : !HOST_EDEFAULT.equals(host);
			case DatasetLoadOraPackage.DATASET_LOAD_JDBC_ORA_THIN__PORT:
				return port != PORT_EDEFAULT;
			case DatasetLoadOraPackage.DATASET_LOAD_JDBC_ORA_THIN__DATA_BASE:
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
		// see: http://docs.oracle.com/cd/E11882_01/appdev.112/e13995/oracle/jdbc/OracleDriver.html
		// class.forName should not work with Microsoft virtual machine
		// lets try it nevertheless
		// alternatively, try DriverManager.registerDriver (new oracle.jdbc.OracleDriver());
		String driver = "oracle.jdbc.OracleDriver";
		Class.forName(driver);
		
		// set the connection
		String databaseurl = String.format("jdbc:oracle:thin:@%s:%d:%s",
				                           this.getHost(),
				                           this.getPort(),
				                           this.getDataBase());
		CommonPlugin.INSTANCE.log("Connection to be opened: " + databaseurl);
		Connection connection = DriverManager.getConnection (databaseurl, 
       										                 this.getDataBaseUser(), 
											                 this.getDataBaseUserPwd());
		return connection;
	}

	/*
	@Override
	protected void onDisconnectImpl() {
		String databaseurl = "jdbc:derby:"
		           //+ this.getDatabasePath()
		           + ";shutdown=true";
		try {
			DriverManager.getConnection(databaseurl);
		} 
		catch (SQLException e) {
			// exception ignored
			CommonPlugin.INSTANCE.log("Connection closed: " + e.getCause());
		}
	}*/


} //DatasetLoadJdbcOraThinImpl
