/**
 */
package com.misc.common.moplaf.datasetload.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.HashSet;

import com.misc.common.moplaf.datasetload.DataSourceJdbc;
import com.misc.common.moplaf.datasetload.DatasetloadPackage;
import com.misc.common.moplaf.datasetload.Table;
import com.misc.common.moplaf.datasetload.TableGroup;
import com.misc.common.moplaf.datasetload.TableRow;

import org.apache.commons.lang.exception.ExceptionUtils;
import org.eclipse.emf.common.CommonPlugin;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Source Jdbc</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.misc.common.moplaf.datasetload.impl.DataSourceJdbcImpl#getDataBaseUser <em>Data Base User</em>}</li>
 *   <li>{@link com.misc.common.moplaf.datasetload.impl.DataSourceJdbcImpl#getDataBaseUserPwd <em>Data Base User Pwd</em>}</li>
 *   <li>{@link com.misc.common.moplaf.datasetload.impl.DataSourceJdbcImpl#getDefaultSchema <em>Default Schema</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataSourceJdbcImpl extends DataSourceImpl implements DataSourceJdbc {
	
	/**
	 * The default value of the '{@link #getDataBaseUser() <em>Data Base User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataBaseUser()
	 * @generated
	 * @ordered
	 */
	protected static final String DATA_BASE_USER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataBaseUser() <em>Data Base User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataBaseUser()
	 * @generated
	 * @ordered
	 */
	protected String dataBaseUser = DATA_BASE_USER_EDEFAULT;

	/**
	 * The default value of the '{@link #getDataBaseUserPwd() <em>Data Base User Pwd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataBaseUserPwd()
	 * @generated
	 * @ordered
	 */
	protected static final String DATA_BASE_USER_PWD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataBaseUserPwd() <em>Data Base User Pwd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataBaseUserPwd()
	 * @generated
	 * @ordered
	 */
	protected String dataBaseUserPwd = DATA_BASE_USER_PWD_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultSchema() <em>Default Schema</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultSchema()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_SCHEMA_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getDefaultSchema() <em>Default Schema</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultSchema()
	 * @generated
	 * @ordered
	 */
	protected String defaultSchema = DEFAULT_SCHEMA_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataSourceJdbcImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatasetloadPackage.Literals.DATA_SOURCE_JDBC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDataBaseUser() {
		return dataBaseUser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataBaseUser(String newDataBaseUser) {
		String oldDataBaseUser = dataBaseUser;
		dataBaseUser = newDataBaseUser;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatasetloadPackage.DATA_SOURCE_JDBC__DATA_BASE_USER, oldDataBaseUser, dataBaseUser));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDataBaseUserPwd() {
		return dataBaseUserPwd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataBaseUserPwd(String newDataBaseUserPwd) {
		String oldDataBaseUserPwd = dataBaseUserPwd;
		dataBaseUserPwd = newDataBaseUserPwd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatasetloadPackage.DATA_SOURCE_JDBC__DATA_BASE_USER_PWD, oldDataBaseUserPwd, dataBaseUserPwd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefaultSchema() {
		return defaultSchema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultSchema(String newDefaultSchema) {
		String oldDefaultSchema = defaultSchema;
		defaultSchema = newDefaultSchema;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatasetloadPackage.DATA_SOURCE_JDBC__DEFAULT_SCHEMA, oldDefaultSchema, defaultSchema));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DatasetloadPackage.DATA_SOURCE_JDBC__DATA_BASE_USER:
				return getDataBaseUser();
			case DatasetloadPackage.DATA_SOURCE_JDBC__DATA_BASE_USER_PWD:
				return getDataBaseUserPwd();
			case DatasetloadPackage.DATA_SOURCE_JDBC__DEFAULT_SCHEMA:
				return getDefaultSchema();
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
			case DatasetloadPackage.DATA_SOURCE_JDBC__DATA_BASE_USER:
				setDataBaseUser((String)newValue);
				return;
			case DatasetloadPackage.DATA_SOURCE_JDBC__DATA_BASE_USER_PWD:
				setDataBaseUserPwd((String)newValue);
				return;
			case DatasetloadPackage.DATA_SOURCE_JDBC__DEFAULT_SCHEMA:
				setDefaultSchema((String)newValue);
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
			case DatasetloadPackage.DATA_SOURCE_JDBC__DATA_BASE_USER:
				setDataBaseUser(DATA_BASE_USER_EDEFAULT);
				return;
			case DatasetloadPackage.DATA_SOURCE_JDBC__DATA_BASE_USER_PWD:
				setDataBaseUserPwd(DATA_BASE_USER_PWD_EDEFAULT);
				return;
			case DatasetloadPackage.DATA_SOURCE_JDBC__DEFAULT_SCHEMA:
				setDefaultSchema(DEFAULT_SCHEMA_EDEFAULT);
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
			case DatasetloadPackage.DATA_SOURCE_JDBC__DATA_BASE_USER:
				return DATA_BASE_USER_EDEFAULT == null ? dataBaseUser != null : !DATA_BASE_USER_EDEFAULT.equals(dataBaseUser);
			case DatasetloadPackage.DATA_SOURCE_JDBC__DATA_BASE_USER_PWD:
				return DATA_BASE_USER_PWD_EDEFAULT == null ? dataBaseUserPwd != null : !DATA_BASE_USER_PWD_EDEFAULT.equals(dataBaseUserPwd);
			case DatasetloadPackage.DATA_SOURCE_JDBC__DEFAULT_SCHEMA:
				return DEFAULT_SCHEMA_EDEFAULT == null ? defaultSchema != null : !DEFAULT_SCHEMA_EDEFAULT.equals(defaultSchema);
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
		result.append(" (DataBaseUser: ");
		result.append(dataBaseUser);
		result.append(", DataBaseUserPwd: ");
		result.append(dataBaseUserPwd);
		result.append(", DefaultSchema: ");
		result.append(defaultSchema);
		result.append(')');
		return result.toString();
	}

	protected Connection db_connection;
	
	protected Connection getConnectionImpl() throws ClassNotFoundException, SQLException{
		return null;
		
	}
	
	protected void onDisconnectImpl() {
		
	}
	

	/* (non-Javadoc)
	 * @see com.misc.common.moplaf.datasetload.impl.DataSourceImpl#Connect()
	 */
	@Override
	public void connect() {
		CommonPlugin.INSTANCE.log("DataSource.Connect");

		// disconnect
		if ( this.db_connection!=null ){
			this.disconnect();
		}
		
		// connect
		try {
			this.db_connection = this.getConnectionImpl();
		}
		catch (ClassNotFoundException cnfe) {
			CommonPlugin.INSTANCE.log("..Class not found");
			return;
			
		} 
		catch (SQLException e) {
			CommonPlugin.INSTANCE.log("..SqlException, cause     " + e.getMessage());
			SQLException e1 = e.getNextException();
			if ( e1 !=null){
				CommonPlugin.INSTANCE.log("..Next SqlException, cause "    + e1.getMessage());
			}
			return;
		}
		
		if ( this.db_connection!=null){
			CommonPlugin.INSTANCE.log("..Connection ok");
			// get/set the schema
			String schema = this.getDefaultSchema();
			if ( schema!=null && schema.length()>0 ){
				try {
					this.db_connection.setSchema(schema);
				} 
				catch (SQLException e) {
					CommonPlugin.INSTANCE.log("..Set Schema failed, Sql exception"    + e.getMessage());
				}
				catch (Exception e) {
					CommonPlugin.INSTANCE.log("..Set Schema failed, Other exception "    + e.getMessage());
				}
				catch (Throwable e) {
					CommonPlugin.INSTANCE.log("..Set Schema failed, Other error"    + e.getMessage());
				}
			}
			this.setConnected(true);
		}
	}
	
	

	/* (non-Javadoc)
	 * @see com.misc.common.moplaf.datasetload.impl.DataSourceImpl#Disconnect()
	 */
	@Override
	public void disconnect() {
		try {
			if ( this.db_connection!=null){
				CommonPlugin.INSTANCE.log("DataSource.Disconnect");
				this.db_connection.close();
				this.db_connection = null;
				this.onDisconnectImpl();
			}
		}
		catch (SQLException e) {
			CommonPlugin.INSTANCE.log("..disconnect failed, message "+ e.getMessage());
			return;
		}
		this.setConnected(false);
	}

	/* (non-Javadoc)
	 * @see com.misc.common.moplaf.datasetload.impl.DataSourceImpl#LoadTableImpl(com.misc.common.moplaf.datasetload.Table)
	 */
	@Override
	public void loadTableImpl(Table table) {
		CommonPlugin.INSTANCE.log("Load table "+table.getName());
		TableGroup tableGroup = table.getTableGroup();

		// prepare the statement
		PreparedStatement statement = null;
	    ResultSet resultSet = null;
		
		try {
	    	if ( this.db_connection == null ){
	    		throw new Exception("Load table faile, no connection");
	    	}
			statement = this.db_connection.prepareStatement(table.getSQLStatement());
		    EList<EAttribute> params = table.getParamTableGroupAttributes();
		    int paramIndex = 0;
		    for ( EAttribute paramAttribute : params){
		    	paramIndex++;
		    	Object paramValue = tableGroup.eGet(paramAttribute);
		    	// is there a value
		    	if ( paramValue == null ){
		    		throw new Exception("Prepare Statement failed, no value for param "+ paramAttribute);
		    	}
		    	
		    	// set the parameter
		    	if ( paramAttribute.getEType()==EcorePackage.Literals.EINT ){
			    	statement.setInt(paramIndex, (Integer) paramValue);
		    	}
		    	else if (paramAttribute.getEType()==EcorePackage.Literals.EFLOAT ){
			    	statement.setFloat(paramIndex, (Float) paramValue);
		    	}
		    	else if ( paramAttribute.getEType()==EcorePackage.Literals.EDATE ){
			    	statement.setDate(paramIndex, new java.sql.Date(((Date)paramValue).getTime()));
		    	}
		    	else if ( paramAttribute.getEType()==EcorePackage.Literals.ESTRING ){
			    	statement.setString(paramIndex, (String)paramValue);
		    	}
		    	else {
		    		throw new Exception("Parameter type not implemented " + paramValue.getClass().toString());
		    	}
		    } // traverse the parameters
		
			// read the result set
			resultSet = statement.executeQuery();
			CommonPlugin.INSTANCE.log("..Query executed");
			
			// objects asis
			HashSet<TableRow> rowsasis = new HashSet<TableRow>(table.getRows());
			
			// synchronize the objects with the result set
			int nofcreates = 0;
			int nofdeletes = 0;
			int nofupdates = 0;
			// objects tobe
		    EList<EAttribute> columnAttributes = table.getColumnTableRowAttributes();
			EList<Integer> keyColumns = table.getKeyColumns();
			int nofKeys = keyColumns.size();
			int nofColumns = columnAttributes.size();
			int rowIndex = 0;
		    while (resultSet.next()) {
		    	// rowIndex
		    	rowIndex++;
		    	
		    	// column values
		    	Object[] columnValues = new Object[nofColumns];
		    	for ( int columnIndex = 0; columnIndex<nofColumns; columnIndex++){
		    		columnValues[columnIndex] = resultSet.getObject(columnIndex+1);
		    	}

		    	// rowKey
		    	Object[] keyObjects = new Object[nofKeys];
		    	int keyIndex = 0;
		    	for ( Integer keyColumn : keyColumns){
		    		keyObjects[keyIndex] = columnValues[keyColumn];
		    		keyIndex++;
		    	}
		    	TableRowKeyImpl key = new TableRowKeyImpl(keyObjects);

		    	// get the row, if any
		    	//TableRow row = rowsasis.get(key);
		    	TableRow row = table.getRow(key);
		    	boolean update = false;
		    	boolean create = false;
		    	if ( row == null ){
		    		// create, the row is now owned
			    	row = table.newRow();
			    	create = true;
			    	nofcreates++;
		    	}
		    	else {
		    		// update
		    		rowsasis.remove(row);
			    	update = true;
			    	nofupdates++;
		    	}
		    	
		    	// synchronize the row
		    	row.setRowNumber(rowIndex);
		    	int columnIndex = 0;
		    	for ( EAttribute columnAttribute : columnAttributes){
		    		if ( keyColumns.contains(columnIndex) && update){
		    			// do nothing
		    		} else {
		    			Object columnValue = columnValues[columnIndex];
		    			row.eSet(columnAttribute, columnValue);
		    		}
		    		columnIndex++;
		    	} // traverse the columns
		    	if ( create ) {
		    		table.addRow(row); // add the row to the index
		    		row.setNewRow(true);
		    	}
		    	else {
		    		row.setNewRow(false);
		    	}
		    	// the row is now up to date and owned
		    	row.refresh();
		     } // traverse the rows of the result set
			CommonPlugin.INSTANCE.log("..Result set traversed, rows "+String.format("%d", rowIndex));
			table.setNumberOfRows(rowIndex);
			table.setLastLoad(new Date());

			// remove the columns too much
			for ( TableRow rowToRemove : rowsasis){
				table.removeRow(rowToRemove); // add to index
				EcoreUtil.remove(rowToRemove);// disowns it
				nofdeletes++;
			}
			CommonPlugin.INSTANCE.log(String.format("..Load complete: %d creates, %d updates, %d deletes", nofcreates, nofupdates, nofdeletes));
		}
		catch (SQLException e) {
			CommonPlugin.INSTANCE.log("..Retrieve result set failed, cause " + e.getMessage());
		}
		catch (Exception e){
			CommonPlugin.INSTANCE.log("..No data retrieved, reason " + ExceptionUtils.getRootCauseMessage(e));
		}
		
		if ( resultSet!=null) {
			try {
				resultSet.close();
				resultSet = null;
			} catch (SQLException e) {
				CommonPlugin.INSTANCE.log("Failure to close the resultSet" + e.getMessage());
			}
		}
		if ( statement!=null){
			try {
				statement.close();
				statement = null;
			} catch (SQLException e) {
				CommonPlugin.INSTANCE.log("Failure to close the statement" + e.getCause());
			}
		}
		
	} // method LoadTableImpl

} //DataSourceJdbcImpl

