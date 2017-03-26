/*******************************************************************************
 * Copyright (c) 2017 Michel Schaffers and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Michel Schaffers - initial API and implementation
 *******************************************************************************/
/**
 */
package com.misc.common.moplaf.dbsynch.dbsynchjtds.impl;

import com.misc.common.moplaf.dbsynch.Plugin;
import com.misc.common.moplaf.dbsynch.dbsynchjtds.DataSourceJdbcJtds;
import com.misc.common.moplaf.dbsynch.dbsynchjtds.DbsynchjtdsPackage;
import com.misc.common.moplaf.dbsynch.dbsynchjtds.EnumServerType;

import com.misc.common.moplaf.dbsynch.impl.DataSourceJdbcImpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Source Jdbc Jtds</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.dbsynch.dbsynchjtds.impl.DataSourceJdbcJtdsImpl#getHost <em>Host</em>}</li>
 *   <li>{@link com.misc.common.moplaf.dbsynch.dbsynchjtds.impl.DataSourceJdbcJtdsImpl#getPort <em>Port</em>}</li>
 *   <li>{@link com.misc.common.moplaf.dbsynch.dbsynchjtds.impl.DataSourceJdbcJtdsImpl#getDataBase <em>Data Base</em>}</li>
 *   <li>{@link com.misc.common.moplaf.dbsynch.dbsynchjtds.impl.DataSourceJdbcJtdsImpl#getServerType <em>Server Type</em>}</li>
 *   <li>{@link com.misc.common.moplaf.dbsynch.dbsynchjtds.impl.DataSourceJdbcJtdsImpl#getUserDomain <em>User Domain</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataSourceJdbcJtdsImpl extends DataSourceJdbcImpl implements DataSourceJdbcJtds {
	/**
	 * The default value of the '{@link #getHost() <em>Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHost()
	 * @generated
	 * @ordered
	 */
	protected static final String HOST_EDEFAULT = "localshost";

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
	protected static final int PORT_EDEFAULT = 1433;

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
	 * The default value of the '{@link #getServerType() <em>Server Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerType()
	 * @generated
	 * @ordered
	 */
	protected static final EnumServerType SERVER_TYPE_EDEFAULT = EnumServerType.ENUM_MODIFICATION_SQLSERVER;

	/**
	 * The cached value of the '{@link #getServerType() <em>Server Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerType()
	 * @generated
	 * @ordered
	 */
	protected EnumServerType serverType = SERVER_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUserDomain() <em>User Domain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserDomain()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_DOMAIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUserDomain() <em>User Domain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserDomain()
	 * @generated
	 * @ordered
	 */
	protected String userDomain = USER_DOMAIN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataSourceJdbcJtdsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DbsynchjtdsPackage.Literals.DATA_SOURCE_JDBC_JTDS;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DbsynchjtdsPackage.DATA_SOURCE_JDBC_JTDS__HOST, oldHost, host));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DbsynchjtdsPackage.DATA_SOURCE_JDBC_JTDS__PORT, oldPort, port));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DbsynchjtdsPackage.DATA_SOURCE_JDBC_JTDS__DATA_BASE, oldDataBase, dataBase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumServerType getServerType() {
		return serverType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServerType(EnumServerType newServerType) {
		EnumServerType oldServerType = serverType;
		serverType = newServerType == null ? SERVER_TYPE_EDEFAULT : newServerType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbsynchjtdsPackage.DATA_SOURCE_JDBC_JTDS__SERVER_TYPE, oldServerType, serverType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUserDomain() {
		return userDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserDomain(String newUserDomain) {
		String oldUserDomain = userDomain;
		userDomain = newUserDomain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbsynchjtdsPackage.DATA_SOURCE_JDBC_JTDS__USER_DOMAIN, oldUserDomain, userDomain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DbsynchjtdsPackage.DATA_SOURCE_JDBC_JTDS__HOST:
				return getHost();
			case DbsynchjtdsPackage.DATA_SOURCE_JDBC_JTDS__PORT:
				return getPort();
			case DbsynchjtdsPackage.DATA_SOURCE_JDBC_JTDS__DATA_BASE:
				return getDataBase();
			case DbsynchjtdsPackage.DATA_SOURCE_JDBC_JTDS__SERVER_TYPE:
				return getServerType();
			case DbsynchjtdsPackage.DATA_SOURCE_JDBC_JTDS__USER_DOMAIN:
				return getUserDomain();
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
			case DbsynchjtdsPackage.DATA_SOURCE_JDBC_JTDS__HOST:
				setHost((String)newValue);
				return;
			case DbsynchjtdsPackage.DATA_SOURCE_JDBC_JTDS__PORT:
				setPort((Integer)newValue);
				return;
			case DbsynchjtdsPackage.DATA_SOURCE_JDBC_JTDS__DATA_BASE:
				setDataBase((String)newValue);
				return;
			case DbsynchjtdsPackage.DATA_SOURCE_JDBC_JTDS__SERVER_TYPE:
				setServerType((EnumServerType)newValue);
				return;
			case DbsynchjtdsPackage.DATA_SOURCE_JDBC_JTDS__USER_DOMAIN:
				setUserDomain((String)newValue);
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
			case DbsynchjtdsPackage.DATA_SOURCE_JDBC_JTDS__HOST:
				setHost(HOST_EDEFAULT);
				return;
			case DbsynchjtdsPackage.DATA_SOURCE_JDBC_JTDS__PORT:
				setPort(PORT_EDEFAULT);
				return;
			case DbsynchjtdsPackage.DATA_SOURCE_JDBC_JTDS__DATA_BASE:
				setDataBase(DATA_BASE_EDEFAULT);
				return;
			case DbsynchjtdsPackage.DATA_SOURCE_JDBC_JTDS__SERVER_TYPE:
				setServerType(SERVER_TYPE_EDEFAULT);
				return;
			case DbsynchjtdsPackage.DATA_SOURCE_JDBC_JTDS__USER_DOMAIN:
				setUserDomain(USER_DOMAIN_EDEFAULT);
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
			case DbsynchjtdsPackage.DATA_SOURCE_JDBC_JTDS__HOST:
				return HOST_EDEFAULT == null ? host != null : !HOST_EDEFAULT.equals(host);
			case DbsynchjtdsPackage.DATA_SOURCE_JDBC_JTDS__PORT:
				return port != PORT_EDEFAULT;
			case DbsynchjtdsPackage.DATA_SOURCE_JDBC_JTDS__DATA_BASE:
				return DATA_BASE_EDEFAULT == null ? dataBase != null : !DATA_BASE_EDEFAULT.equals(dataBase);
			case DbsynchjtdsPackage.DATA_SOURCE_JDBC_JTDS__SERVER_TYPE:
				return serverType != SERVER_TYPE_EDEFAULT;
			case DbsynchjtdsPackage.DATA_SOURCE_JDBC_JTDS__USER_DOMAIN:
				return USER_DOMAIN_EDEFAULT == null ? userDomain != null : !USER_DOMAIN_EDEFAULT.equals(userDomain);
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
		result.append(", ServerType: ");
		result.append(serverType);
		result.append(", UserDomain: ");
		result.append(userDomain);
		result.append(')');
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	protected Connection getConnectionImpl() throws ClassNotFoundException, SQLException{

		String driver = "net.sourceforge.jtds.jdbc.Driver";
		Class.forName(driver);
		
		// see http://jtds.sourceforge.net/index.html
		// jdbc:jtds:<server_type>://<server>[:<port>][/<database>][;<property>=<value>[;...]]
		String serverType = "";
		if ( this.getServerType()==EnumServerType.ENUM_MODIFICATION_SQLSERVER) {
			serverType = "sqlserver";
		} else if ( this.getServerType()==EnumServerType.ENUM_MODIFICATION_SYBASE) {
			serverType = "sybase";
		}

		String databaseurl = String.format("jdbc:jtds:%s://%s:%d/%s",
				                           serverType,
				                           this.getHost(),
				                           this.getPort(),
				                           this.getDataBase());
		String domain = this.getUserDomain();
		if ( domain != null && domain.length()>0){
			databaseurl += ";domain="+domain;
		}
//		databaseurl += ";user="+this.getDataBaseUser();
//		databaseurl += ";password="+this.getDataBaseUserPwd();
//		databaseurl += ";instance=SQLEXPRESS";
		;
		Plugin.INSTANCE.logInfo("Connection to be opened: " + databaseurl);
		Connection connection = DriverManager.getConnection (databaseurl,
       										                 this.getDataBaseUser(), 
											                 this.getDataBaseUserPwd());
		return connection;
	}	
} //DataSourceJdbcJtdsImpl
