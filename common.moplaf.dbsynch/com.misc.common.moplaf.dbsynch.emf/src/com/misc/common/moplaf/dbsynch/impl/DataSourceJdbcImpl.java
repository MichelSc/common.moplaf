/*******************************************************************************
 * Copyright (c) 2017, 2018 Michel Schaffers and others.
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
package com.misc.common.moplaf.dbsynch.impl;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.sql.Types;
import java.util.Date;
import java.util.HashSet;

import org.apache.commons.lang.exception.ExceptionUtils;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import com.misc.common.moplaf.common.ReturnFeedback;
import com.misc.common.moplaf.dbsynch.DataSourceJdbc;
import com.misc.common.moplaf.dbsynch.DbSynchPackage;
import com.misc.common.moplaf.dbsynch.DbSynchUnitAbstract;
import com.misc.common.moplaf.dbsynch.EnumColumnType;
import com.misc.common.moplaf.dbsynch.EnumModification;
import com.misc.common.moplaf.dbsynch.Plugin;
import com.misc.common.moplaf.dbsynch.Table;
import com.misc.common.moplaf.dbsynch.TableColumn;
import com.misc.common.moplaf.dbsynch.TableRow;
import com.misc.common.moplaf.dbsynch.TableRowKey;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Source Jdbc</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.dbsynch.impl.DataSourceJdbcImpl#getDataBaseUser <em>Data Base User</em>}</li>
 *   <li>{@link com.misc.common.moplaf.dbsynch.impl.DataSourceJdbcImpl#getDataBaseUserPwd <em>Data Base User Pwd</em>}</li>
 *   <li>{@link com.misc.common.moplaf.dbsynch.impl.DataSourceJdbcImpl#getDefaultSchema <em>Default Schema</em>}</li>
 * </ul>
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
		return DbSynchPackage.Literals.DATA_SOURCE_JDBC;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DbSynchPackage.DATA_SOURCE_JDBC__DATA_BASE_USER, oldDataBaseUser, dataBaseUser));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DbSynchPackage.DATA_SOURCE_JDBC__DATA_BASE_USER_PWD, oldDataBaseUserPwd, dataBaseUserPwd));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DbSynchPackage.DATA_SOURCE_JDBC__DEFAULT_SCHEMA, oldDefaultSchema, defaultSchema));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DbSynchPackage.DATA_SOURCE_JDBC__DATA_BASE_USER:
				return getDataBaseUser();
			case DbSynchPackage.DATA_SOURCE_JDBC__DATA_BASE_USER_PWD:
				return getDataBaseUserPwd();
			case DbSynchPackage.DATA_SOURCE_JDBC__DEFAULT_SCHEMA:
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
			case DbSynchPackage.DATA_SOURCE_JDBC__DATA_BASE_USER:
				setDataBaseUser((String)newValue);
				return;
			case DbSynchPackage.DATA_SOURCE_JDBC__DATA_BASE_USER_PWD:
				setDataBaseUserPwd((String)newValue);
				return;
			case DbSynchPackage.DATA_SOURCE_JDBC__DEFAULT_SCHEMA:
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
			case DbSynchPackage.DATA_SOURCE_JDBC__DATA_BASE_USER:
				setDataBaseUser(DATA_BASE_USER_EDEFAULT);
				return;
			case DbSynchPackage.DATA_SOURCE_JDBC__DATA_BASE_USER_PWD:
				setDataBaseUserPwd(DATA_BASE_USER_PWD_EDEFAULT);
				return;
			case DbSynchPackage.DATA_SOURCE_JDBC__DEFAULT_SCHEMA:
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
			case DbSynchPackage.DATA_SOURCE_JDBC__DATA_BASE_USER:
				return DATA_BASE_USER_EDEFAULT == null ? dataBaseUser != null : !DATA_BASE_USER_EDEFAULT.equals(dataBaseUser);
			case DbSynchPackage.DATA_SOURCE_JDBC__DATA_BASE_USER_PWD:
				return DATA_BASE_USER_PWD_EDEFAULT == null ? dataBaseUserPwd != null : !DATA_BASE_USER_PWD_EDEFAULT.equals(dataBaseUserPwd);
			case DbSynchPackage.DATA_SOURCE_JDBC__DEFAULT_SCHEMA:
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
	
	/**
	 * 
	 * @return
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	protected Connection getConnectionImpl() throws ClassNotFoundException, SQLException{
		return null; // to  be implemented by the specialization
	}
	
	/**
	 * Called by this class upon disconnect()
	 */
	protected void onDisconnectImpl() {
		
	}
	

	/* (non-Javadoc)
	 * @see com.misc.common.moplaf.datasetload.impl.DataSourceImpl#Connect()
	 */
	@Override
	public ReturnFeedback connect() {
		Plugin.INSTANCE.logInfo("DataSource.Connect");

		// disconnect
		if ( this.db_connection!=null ){
			this.disconnect();
		}
		
		// connect
		try {
			this.db_connection = this.getConnectionImpl();
		}
		catch (ClassNotFoundException cnfe) {
			Plugin.INSTANCE.logInfo("..Class not found");
			return new ReturnFeedback("DataSourceJdbc.connect", cnfe);
		} 
		catch (SQLException e) {
			Plugin.INSTANCE.logError("..SqlException, cause     " + e.getMessage());
			SQLException e1 = e.getNextException();
			if ( e1 !=null){
				Plugin.INSTANCE.logError("..Next SqlException, cause "    + e1.getMessage());
				return new ReturnFeedback("DataSourceJdbc.connect", e1);
			}
			return new ReturnFeedback("DataSourceJdbc.connect", e);
		}
		
		if ( this.db_connection==null){
			return new ReturnFeedback(false, "DatasourceJdbc.connect: No connection");
		} else {
			Plugin.INSTANCE.logInfo("..Connection ok");
			// get/set the schema
			String schema = this.getDefaultSchema();
			if ( schema!=null && schema.length()>0 ){
				try {
					// I have never seen this working
					// most of the time, it throws an exception, or worst, a throwable
					this.db_connection.setSchema(schema);
				} 
				catch (SQLException e) {
					Plugin.INSTANCE.logError("..Set Schema failed, Sql exception"    + e.getMessage());
					return new ReturnFeedback("DataSourceJdbc.connect(setSchema)", e);
				}
				catch (Exception e) {
					Plugin.INSTANCE.logError("..Set Schema failed, Other exception "    + e.getMessage());
					return new ReturnFeedback("DataSourceJdbc.connect(setSchema)", e);
				}
				catch (Throwable e) {
					Plugin.INSTANCE.logError("..Set Schema failed, Other error"    + e.getMessage());
					return new ReturnFeedback("DataSourceJdbc.connect(setSchema)", e);
				}
			}
			
			this.setConnected(true);
			
			// set auto commit mode
			this.onAutoCommitChange();

			return ReturnFeedback.SUCCESS;
		}
	}
	
	

	/* (non-Javadoc)
	 * @see com.misc.common.moplaf.datasetload.impl.DataSourceImpl#Disconnect()
	 */
	@Override
	public ReturnFeedback disconnect() {
		try {
			if ( this.db_connection==null){
				Plugin.INSTANCE.logInfo("DataSource.Disconnect");
				this.db_connection.close();
				this.db_connection = null;
				this.onDisconnectImpl();
			}
			this.setConnected(false);
			return ReturnFeedback.SUCCESS;
		}
		catch (SQLException e) {
			Plugin.INSTANCE.logError("..disconnect failed, message "+ e.getMessage());
			return new ReturnFeedback("DataSourceJdbc.disconnect", e);
		}
	}
	
	/**
	 * Helper that retrieves the value of a column in a ResultSet
	 * @param resultSet
	 * @param columnIndex
	 * @param columnTupe
	 * @param attribute
	 * @return
	 * @throws SQLException 
	 */
	private Object getResultSetColumn(ResultSet resultSet, int columnIndex, EnumColumnType columnType, EAttribute attribute) throws SQLException{
		int typeToUse = columnType==null 
				      ? Types.OTHER
				      : columnType.getJdbcType();
		switch ( typeToUse){
		case Types.BOOLEAN:
			return resultSet.getBoolean(columnIndex);
		case Types.INTEGER:
			return resultSet.getInt(columnIndex);
		case Types.BIGINT:
			return resultSet.getLong(columnIndex);
		case Types.FLOAT:
			return resultSet.getFloat(columnIndex);
		case Types.DOUBLE:
			return resultSet.getDouble(columnIndex);
		case Types.NUMERIC:
			return resultSet.getBigDecimal(columnIndex);
		case Types.CHAR:
			return resultSet.getString(columnIndex);
		case Types.DATE:
			return resultSet.getDate(columnIndex);
		case Types.TIME:
			Time timeValue = resultSet.getTime(columnIndex);
			return timeValue == null 
			     ? null
			     : (timeValue.getTime()/60.0f/60.0f/1000.0f);
		case Types.TIMESTAMP:
			return resultSet.getTimestamp(columnIndex);
		case Types.OTHER:
		default:
	        return resultSet.getObject(columnIndex); 		         
		}
	}
	
	/**
	 * Helper that set the parameter of a prepared Statement
	 * @param statement
	 * @param paramIndex
	 * @param paramType
	 * @param attribute
	 * @param paramValue
	 * @throws Exception
	 */
	private void setSqlStatementParam(PreparedStatement statement, int paramIndex, EnumColumnType paramType, EAttribute attribute, Object paramValue) throws Exception{
		int typeToUse = Types.OTHER;
		if ( paramType!=null ) { 
			typeToUse = paramType.getJdbcType(); 
		} else if ( attribute!=null ) {
	    	if      ( attribute.getEType()==EcorePackage.Literals.EBOOLEAN)      { typeToUse = Types.BOOLEAN; }
	    	else if ( attribute.getEType()==EcorePackage.Literals.EINT )         { typeToUse = Types.INTEGER; }
	    	else if ( attribute.getEType()==EcorePackage.Literals.ELONG )        { typeToUse = Types.BIGINT; }
	    	else if ( attribute.getEType()==EcorePackage.Literals.EFLOAT )       { typeToUse = Types.FLOAT; }
	    	else if ( attribute.getEType()==EcorePackage.Literals.EDOUBLE)       { typeToUse = Types.DOUBLE; }
	    	else if ( attribute.getEType()==EcorePackage.Literals.EBIG_DECIMAL ) { typeToUse = Types.NUMERIC; }
	    	else if ( attribute.getEType()==EcorePackage.Literals.EDATE )        { typeToUse = Types.DATE; }
	    	else if ( attribute.getEType()==EcorePackage.Literals.ESTRING )      { typeToUse = Types.CHAR; }
    	}
		
		if ( paramValue==null ){
			statement.setNull(paramIndex, typeToUse);
		} else {
			switch ( typeToUse ){
			case Types.BOOLEAN:
		    	statement.setBoolean(paramIndex, (Boolean) paramValue);
		    	break;
			case Types.INTEGER:
		    	statement.setInt(paramIndex, (Integer) paramValue);
		    	break;
			case Types.BIGINT:
		    	statement.setLong(paramIndex, (Long) paramValue);
		    	break;
			case Types.FLOAT:
		    	statement.setFloat(paramIndex, (Float) paramValue);
		    	break;
			case Types.DOUBLE:
		    	statement.setDouble(paramIndex, (Double) paramValue);
		    	break;
			case Types.NUMERIC:
		    	statement.setBigDecimal(paramIndex, (BigDecimal) paramValue);
		    	break;
			case Types.CHAR:
		    	statement.setString(paramIndex, (String)paramValue);
		    	break;
			case Types.DATE:
		    	statement.setDate(paramIndex, new java.sql.Date(((Date)paramValue).getTime()));
		    	break;
			case Types.TIME:
				Float floatValue = (Float)paramValue*60.0f*60.0f*1000.0f; // in millis
				long longValue = floatValue.longValue();
		    	statement.setTime(paramIndex, new java.sql.Time(longValue));
		    	break;
			case Types.TIMESTAMP:
		    	statement.setTimestamp(paramIndex, new java.sql.Timestamp(((Date)paramValue).getTime()));
		    	break;
			case Types.OTHER:
		    	statement.setObject(paramIndex, paramValue);
		    	break;
			default:
				Plugin.INSTANCE.logError("SetSqlStatementParam: unknown parameter type");
			}
		}
	}
	
	/**
	 * 
	 * @param table
	 * @return
	 */
	private String makeSynchUpSql(Table table){
    	String tableName = table.getTableName();
    	if ( tableName==null || table.getTableName().length()==0 ){
    		Plugin.INSTANCE.logError("No table name");
    		return "";
    	}

    	String sql = "";
    	
    	// select clause
    	boolean firstColumn = true;
    	int table_nr = 1;
    	for ( TableColumn column : table.getColumns()){
    		sql += String.format("%s T%d.%s \n", 
    				             firstColumn ? "select " : "     , ",
    				             table_nr,
    				             column.getColumnName());
    		firstColumn = false;
    	}
    	
    	// from clause
    	boolean firstTable = true;
    	Table currentTable = table;
    	while ( currentTable!=null){
	    	sql += String.format("%s %s T%d \n", 
	    			             firstTable ? "from " : "    ,",
	    			             currentTable.getTableName(),
             					 table_nr);
	    	currentTable = currentTable.getParent();
    		table_nr++;
    		firstTable = false;
    	}
    	
    	// where clause
    	boolean firstCondition = true;
    	currentTable = table;
    	table_nr = 1;
    	while ( currentTable!=null){
        	Table parentTable = currentTable.getParent();
        	// some condition
        	String whereClause = currentTable.getWhereClause();
        	if ( whereClause!=null && whereClause.length()>0 ){
        		sql += String.format("%s %s \n", firstCondition ? "where" : "  and", whereClause);
        		firstCondition = false;
        	}
        	if ( parentTable != null ){
        		// join conditions
        		for ( TableColumn currentColumn : currentTable.getColumns()){
        			TableColumn parentColumn = currentColumn.getParentTableColumn();
        			if ( parentColumn!=null){
        	    		sql += String.format("%s T%d.%s=T%d.%s \n", 
        	    						firstCondition ? "where" : "  and", 
        	    						table_nr, 
        	    						currentColumn.getColumnName(), 
        	    						table_nr+1, 
        	    						parentColumn.getColumnName());
        	    		firstCondition = false;
        			}
        		}  // traverse the parent columns
        	}
    		table_nr++;
    		currentTable = parentTable;
    	} // traverse the parent tables
    	
    	return sql;
		
	}

	/**
	 * Specified by DataSource
	 */
	@Override
	public ReturnFeedback synchUpTableImpl(Table table) {
		Plugin.INSTANCE.logInfo("DataSourceJdbc.SynchUp, table "+table.getTableName());
		
		// prepare the statement
		PreparedStatement statement = null;
	    ResultSet resultSet = null;
	    DbSynchUnitAbstract unit = table.getSynchUnit();
		
		try {
	    	if ( this.db_connection == null ){
	    		throw new Exception("DataSourceJdbc.SynchUp table failed, no connection");
	    	}
	    	
	    	String sql = this.makeSynchUpSql(table);
	    	if ( sql == null ){
	    		throw new Exception("DataSourceJdbc.SynchUp table failed, no sql made");
	    	}	    	
	    	
	    	// create the statement
			table.setSelectSqlStatement(sql);
			statement = this.db_connection.prepareStatement(sql);
			
			// set the parameters
	    	Table currentTable = table;
	    	while ( currentTable!=null){
			    EList<EAttribute> params = currentTable.getParamDbSynchUnitAttributes();
			    int paramIndex = 0;
			    for ( EAttribute paramAttribute : params){
			    	paramIndex++;
			    	Object paramValue = unit.getParamValue(paramAttribute);
			    	this.setSqlStatementParam(statement, paramIndex, null, paramAttribute, paramValue);
			    } // traverse the parameters
	    		currentTable = currentTable.getParent();
	    	} 
		
			// execute the query
			resultSet = statement.executeQuery();
			Plugin.INSTANCE.logInfo("DataSourceJdbc.SynchUpTable: Query executed, rows fetched"+resultSet.getFetchSize());
			
			// objects asis
			HashSet<TableRow> rowsasis = new HashSet<TableRow>(table.getRows());
			
			// synchronize the objects with the result set
			int nofcreates = 0;
			int nofdeletes = 0;
			int nofupdates = 0;
			table.refreshIndex();
			// objects tobe
			int nofKeys = table.getKeyColumns().size();
			int rowIndex = 0;
		    while (resultSet.next()) {
		    	// make the row key
		    	Object[] keyObjects = new Object[nofKeys];
		    	int columnIndex = 1; // resultSet.getObject is 1-based
		    	int keyIndex = 0;
		    	for ( TableColumn keyColumn : table.getKeyColumns()){
		    		keyObjects[keyIndex] = this.getResultSetColumn(resultSet, 
		    				                                       columnIndex, 
		    				                                       keyColumn.getColumnType(), 
		    				                                       keyColumn.getRowAttribute());
		    		columnIndex++; 
		    		keyIndex++;
		    	}
		    	TableRowKey key = new TableRowKey(keyObjects);

		    	// get the row, if any
		    	TableRow row = table.getRow(key);
		    	boolean create = false;
		    	if ( row == null ){
		    		// create, the row is now owned
			    	row = table.constructRow();
			    	row.setDeleted(false);
			    	keyIndex = 0;
			    	for ( TableColumn keyColumn : table.getKeyColumns()){
		    			Object keyValue = key.getKey(keyIndex);
		    			row.eSet(keyColumn.getRowAttribute(), keyValue);
			    		keyIndex++;
			    	} // traverse the columns
			    	table.indexRow(row);
			    	create = true;
		    	}
		    	else {
		    		// update
		    		rowsasis.remove(row);
		    		if ( row.isDeleted() ){
		    			create = true;
		    			row.setDeleted(false);
		    		}
		    	}
		    	
		    	// set the data
		    	boolean update = false;
		    	for ( TableColumn tableColumn : table.getDataColumns()){
		    		EAttribute rowAttribute = tableColumn.getRowAttribute();
		    		Object valueToBe = this.getResultSetColumn(resultSet, 
		    				                                   columnIndex, 
		    				                                   tableColumn.getColumnType(), 
		    				                                   rowAttribute);
		    		if ( valueToBe == null ){
		    			if ( row.eIsSet(rowAttribute)){
		    				update = true;
		    				row.eUnset(rowAttribute);
		    			}
		    		} else {
		    			// value tobe is set
		    			if ( rowAttribute.isUnsettable() && !row.eIsSet(rowAttribute)
		    			  || row.eGet(rowAttribute)==null
		    			  || !row.eGet(rowAttribute).equals(valueToBe)) {
		    				// value tobe is either not set or is set to some other value 
		    				update = true;
		    				row.eSet(rowAttribute, valueToBe);
		    			}
		    		}
		    		columnIndex++;
		    	} // traverse the columns
		    	if ( create ){
			    	row.setModificationLastSynchUp(EnumModification.ENUM_MODIFICATION_CREATE);
			    	nofcreates++;
		    	}
		    	else if ( update){
			    	row.setModificationLastSynchUp(EnumModification.ENUM_MODIFICATION_UPDATE);
			    	nofupdates++;
		    	} else {
			    	row.setModificationLastSynchUp(EnumModification.ENUM_MODIFICATION_NONE);
		    	}
		    	// the row is now up to date and owned
		    	row.setModificationNextSynchDown(EnumModification.ENUM_MODIFICATION_NONE);
		    	row.refresh();
		    	rowIndex++;
		     } // traverse the rows of the result set
			Plugin.INSTANCE.logInfo("DataSourceJdbc.SynchUpTable: Result set traversed, rows "+String.format("%d", rowIndex));
			table.setNumberOfRows(rowIndex);

			// remove the rows too many
			for ( TableRow rowToRemove : rowsasis){
				if ( !rowToRemove.isDeleted() ){
					rowToRemove.setDeleted(true);
			    	rowToRemove.setModificationLastSynchUp(EnumModification.ENUM_MODIFICATION_DELETE);
					//table.removeRow(rowToRemove); // add to index
					//EcoreUtil.remove(rowToRemove);// disowns it
					nofdeletes++;
				} else {
			    	rowToRemove.setModificationLastSynchUp(EnumModification.ENUM_MODIFICATION_NONE);
				}
			}
			Plugin.INSTANCE.logInfo(String.format("DataSourceJdbc.SynchUpTable: complete, %d creates, %d updates, %d deletes", nofcreates, nofupdates, nofdeletes));
		}
		catch (SQLException e) {
			Plugin.INSTANCE.logError("DataSourceJdbc.SynchUpTable: Retrieve result set failed, cause " + e.getMessage());
			return new ReturnFeedback("DataSourceJdbc.synchUpTable", e);
		}
		catch (Exception e){
			e.printStackTrace();
			Plugin.INSTANCE.logError("DataSourceJdbc.SynchUpTable: General exception, no data retrieved, cause " + ExceptionUtils.getRootCauseMessage(e));
			return new ReturnFeedback("DataSourceJdbc.synchUpTable", e);
		}
		
		if ( resultSet!=null) {
			try {
				resultSet.close();
				resultSet = null;
			} catch (SQLException e) {
				Plugin.INSTANCE.logError("DataSourceJdbc.SynchUpTable: Failure to close the resultSet" + e.getMessage());
				return new ReturnFeedback("DataSourceJdbc.synchUpTable", e);
			}
		}
		if ( statement!=null){
			try {
				statement.close();
				statement = null;
			} catch (SQLException e) {
				Plugin.INSTANCE.logError("Failure to close the statement" + e.getCause());
				return new ReturnFeedback("DataSourceJdbc.synchUpTable", e);
			}
		}
		
		table.setLastSynchUp(new Date());
		return ReturnFeedback.SUCCESS;
		
	} // method SynchUpTableImpl

	/**
	 * Specified by DataSource
	 */
	@Override
	public ReturnFeedback synchDownTableImpl(Table table) {
		Plugin.INSTANCE.logInfo("DataSourceJdbc.SynchDown, table "+table.getTableName());
		
		try {
	    	if ( this.db_connection == null ){
	    		throw new Exception("DataSourceJdbc.SynchDown table failed, no connection");
	    	}
	    	
//	    	this.db_connection.setAutoCommit(false);
	    	
	    	String tableName = table.getTableName();
	    	if ( tableName==null || table.getTableName().length()==0 ){
	    		throw new Exception("DataSourceJdbc.SynchDown table failed, no table name");
	    	}

	    	// prepare the insert sql
	    	String inserSql = "";
	    	for ( TableColumn column : table.getColumns()){
	    		inserSql += inserSql=="" ? "insert into "+tableName + " ( " : ", ";
	    		inserSql += column.getColumnName() + "\n";
	    	}
	    	inserSql += ") \n";
	    	inserSql += "values (  \n";
	    	for ( int i=1; i<table.getColumns().size(); i++){
	    		inserSql += " ? ,   \n";
	    	}
    		inserSql += " ? )";
    		PreparedStatement insertStatement = this.db_connection.prepareStatement(inserSql);
			table.setInsertSqlStatement(inserSql);
    		
    		// where clause
    		String where = "";
    		for ( TableColumn keyColumn : table.getKeyColumns()){
    			where += where.length()==0 ? "where " : "and ";
    			where += keyColumn.getColumnName() + " = ? \n";
    		}
    			
	    	// update
    		String updateSql ="";
    		for ( TableColumn dataColumn : table.getDataColumns()){
    			updateSql += updateSql.length()==0 ? "update "+tableName + "\nset " : ", ";
    			updateSql += dataColumn.getColumnName() + " = ? \n";
	    	}
    		updateSql += where;
    		PreparedStatement updateStatement = this.db_connection.prepareStatement(updateSql);
			table.setUpdateSqlStatement(updateSql);
    		
    		// delete 
    		String deleteSql = "delete from "+ tableName + " \n "+ where;
    		PreparedStatement deleteStatement = this.db_connection.prepareStatement(deleteSql);
			table.setDeleteSqlStatement(deleteSql);
			
			int nof_crts_todo = 0;
			int nof_crts_done = 0;
			int nof_updts_todo = 0;
			int nof_updts_done = 0;
			int nof_dlts_todo = 0;
			int nof_dlts_done = 0;
			for ( TableRow rowAsIs : table.getRows()){
				if (  rowAsIs.getModificationNextSynchDown() == EnumModification.ENUM_MODIFICATION_CREATE
				   || rowAsIs.getModificationNextSynchDown() == EnumModification.ENUM_MODIFICATION_MUTATEKEY){
					// insert
					nof_crts_todo++;
					// set the params
					int paramIndex = 0;
					for ( TableColumn column : table.getColumns()){
						Object columnValue = rowAsIs.eGet(column.getRowAttribute());
						paramIndex ++;
						this.setSqlStatementParam(insertStatement, 
								                  paramIndex, 
								                  column.getColumnType(), 
								                  column.getRowAttribute(), columnValue);
					}
					// execute
					int rc = insertStatement.executeUpdate();
					nof_crts_done += rc;
					//Plugin.INSTANCE.logInfo(String.format("..SynchDown : %d rows inserted", rc));
				}
				if ( rowAsIs.getModificationNextSynchDown() == EnumModification.ENUM_MODIFICATION_UPDATE){
					// update
					nof_updts_todo++;
					// set the params
					int paramIndex = 0;
					for ( TableColumn column : table.getDataColumns()){
						Object columnValue = rowAsIs.eGet(column.getRowAttribute());
						paramIndex ++;
						this.setSqlStatementParam(updateStatement, 
								                  paramIndex, 
								                  column.getColumnType(), 
								                  column.getRowAttribute(), columnValue);
					}
					for ( TableColumn column : table.getKeyColumns()){
						Object columnValue = rowAsIs.eGet(column.getRowAttribute());
						paramIndex ++;
						this.setSqlStatementParam(updateStatement, 
								                  paramIndex,
								                  column.getColumnType(),
								                  column.getRowAttribute(), 
								                  columnValue);
					}
					// execute
					int rc = updateStatement.executeUpdate();
					//Plugin.INSTANCE.logInfo(String.format("..SynchDown : %d rows updated", rc));
					nof_updts_done += rc;
				} 
				if ( rowAsIs.getModificationNextSynchDown() == EnumModification.ENUM_MODIFICATION_DELETE
				  || rowAsIs.getModificationNextSynchDown() == EnumModification.ENUM_MODIFICATION_MUTATEKEY){
					// delete
					nof_dlts_todo++;
					// set the params
					int paramIndex = 0;
					for ( TableColumn column : table.getKeyColumns()){
						Object columnValue = rowAsIs.getLastSynchDownKey().getKey(paramIndex);
						paramIndex ++;
						this.setSqlStatementParam(deleteStatement, 
								                  paramIndex, 
								                  column.getColumnType(),
								                  column.getRowAttribute(), 
								                  columnValue);
					}
					// execute
					int rc = deleteStatement.executeUpdate();
					//Plugin.INSTANCE.logInfo(String.format("..SynchDown : %d rows deleted", rc));
					nof_dlts_done += rc;
				}  // switch on the update statement
				rowAsIs.setModificationNextSynchDown(EnumModification.ENUM_MODIFICATION_NONE);
			} // traverse the rows
    		
			Plugin.INSTANCE.logInfo(String.format("DataSourceJdbc.SynchDown about to commit done/todo: %d/%d creates, %d/%d updates, %d/%d deletes", 
					nof_crts_done, nof_crts_todo,
					nof_updts_done, nof_updts_todo,
					nof_dlts_done, nof_dlts_todo));
//			this.db_connection.commit(); // is this neccessary
//			Plugin.INSTANCE.logInfo(String.format("DataSourceJdbc.SynchDown commited"));
		}
		catch (SQLException e) {
			Plugin.INSTANCE.logError("DataSourceJdbc.SynchDown failed, sql exception, cause " + e.getMessage());
			return new ReturnFeedback("DataSourceJdbc.synchDownTable", e);
		}
		catch (Exception e){
			Plugin.INSTANCE.logError("DataSourceJdbc.SynchDown failed, general exception, cause " + ExceptionUtils.getRootCauseMessage(e));
			return new ReturnFeedback("DataSourceJdbc.synchDownTable", e);
		}

		table.setLastSynchDown(new Date());
		return ReturnFeedback.SUCCESS;
	}

	@Override
	protected void onAutoCommitChange() {
		if ( this.connected){
			try {
				this.db_connection.setAutoCommit(this.isAutoCommit());
				Plugin.INSTANCE.logInfo("DataSourceJdbc.onAutocommitChange: autoCommit="+this.isAutoCommit());
			} catch (SQLException e) {
				Plugin.INSTANCE.logError("setAutoCommit failed, sql exception, cause " + ExceptionUtils.getRootCauseMessage(e));
			}
		}
	}

	@Override
	public ReturnFeedback commit() {
		if ( this.connected){
			try {
				this.db_connection.commit();
				Plugin.INSTANCE.logInfo("DataSourceJdbc.commit: done");
				return ReturnFeedback.SUCCESS;
			} catch (SQLException e) {
				return new ReturnFeedback("DataSourceJdbc.commit", e);
			}
		} else {
			return new ReturnFeedback(false, "DataSourceJdbc.commit", "Datasource not connected");
		}
	}

	@Override
	public ReturnFeedback rollback() {
		if ( this.connected){
			try {
				this.db_connection.rollback();
				Plugin.INSTANCE.logInfo("DataSourceJdbc.rollback: done");
				return ReturnFeedback.SUCCESS;
			} catch (SQLException e) {
				return new ReturnFeedback("DataSourceJdbc.rollback", e);
			}
		} else {
			return new ReturnFeedback(false, "DataSourceJdbc.rollback", "Datasource not connected");
		}
	}
	
	

} //DataSourceJdbcImpl

