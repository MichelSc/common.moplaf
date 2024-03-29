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

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import com.misc.common.moplaf.common.ReturnFeedback;
import com.misc.common.moplaf.common.util.EObjectListDerived;
import com.misc.common.moplaf.dbsynch.DataSource;
import com.misc.common.moplaf.dbsynch.DbSynchFactory;
import com.misc.common.moplaf.dbsynch.DbSynchPackage;
import com.misc.common.moplaf.dbsynch.DbSynchUnitAbstract;
import com.misc.common.moplaf.dbsynch.EnumColumnType;
import com.misc.common.moplaf.dbsynch.Plugin;
import com.misc.common.moplaf.dbsynch.Table;
import com.misc.common.moplaf.dbsynch.TableColumn;
import com.misc.common.moplaf.dbsynch.TableRow;
import com.misc.common.moplaf.dbsynch.TableRowKey;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.dbsynch.impl.TableImpl#getSynchUnit <em>Synch Unit</em>}</li>
 *   <li>{@link com.misc.common.moplaf.dbsynch.impl.TableImpl#getColumns <em>Columns</em>}</li>
 *   <li>{@link com.misc.common.moplaf.dbsynch.impl.TableImpl#getKeyColumns <em>Key Columns</em>}</li>
 *   <li>{@link com.misc.common.moplaf.dbsynch.impl.TableImpl#getDataColumns <em>Data Columns</em>}</li>
 *   <li>{@link com.misc.common.moplaf.dbsynch.impl.TableImpl#getTableName <em>Table Name</em>}</li>
 *   <li>{@link com.misc.common.moplaf.dbsynch.impl.TableImpl#getWhereClause <em>Where Clause</em>}</li>
 *   <li>{@link com.misc.common.moplaf.dbsynch.impl.TableImpl#getParamDbSynchUnitAttributes <em>Param Db Synch Unit Attributes</em>}</li>
 *   <li>{@link com.misc.common.moplaf.dbsynch.impl.TableImpl#getRows <em>Rows</em>}</li>
 *   <li>{@link com.misc.common.moplaf.dbsynch.impl.TableImpl#getSelectSqlStatement <em>Select Sql Statement</em>}</li>
 *   <li>{@link com.misc.common.moplaf.dbsynch.impl.TableImpl#getInsertSqlStatement <em>Insert Sql Statement</em>}</li>
 *   <li>{@link com.misc.common.moplaf.dbsynch.impl.TableImpl#getUpdateSqlStatement <em>Update Sql Statement</em>}</li>
 *   <li>{@link com.misc.common.moplaf.dbsynch.impl.TableImpl#getDeleteSqlStatement <em>Delete Sql Statement</em>}</li>
 *   <li>{@link com.misc.common.moplaf.dbsynch.impl.TableImpl#getNumberOfRows <em>Number Of Rows</em>}</li>
 *   <li>{@link com.misc.common.moplaf.dbsynch.impl.TableImpl#getLastSynchDown <em>Last Synch Down</em>}</li>
 *   <li>{@link com.misc.common.moplaf.dbsynch.impl.TableImpl#getLastSynchUp <em>Last Synch Up</em>}</li>
 *   <li>{@link com.misc.common.moplaf.dbsynch.impl.TableImpl#getParent <em>Parent</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TableImpl extends MinimalEObjectImpl.Container implements Table {

	/**
	 * The field rowIndex contains an entry for every row in the table, 
	 * corresponding to the index key value of the row.
	 * The deleted rows are present in the index as well. 
	 */
	private HashMap<TableRowKey, TableRow> rowIndex = null;
	
	/**
	 * The cached value of the '{@link #getKeyColumns() <em>Key Columns</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyColumns()
	 * @generated
	 * @ordered
	 */
	protected EList<TableColumn> keyColumns;

	/**
	 * The cached value of the '{@link #getDataColumns() <em>Data Columns</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataColumns()
	 * @generated
	 * @ordered
	 */
	protected EList<TableColumn> dataColumns;

	/**
	 * The default value of the '{@link #getTableName() <em>Table Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTableName()
	 * @generated
	 * @ordered
	 */
	protected static final String TABLE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTableName() <em>Table Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTableName()
	 * @generated
	 * @ordered
	 */
	protected String tableName = TABLE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getWhereClause() <em>Where Clause</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhereClause()
	 * @generated
	 * @ordered
	 */
	protected static final String WHERE_CLAUSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWhereClause() <em>Where Clause</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhereClause()
	 * @generated
	 * @ordered
	 */
	protected String whereClause = WHERE_CLAUSE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParamDbSynchUnitAttributes() <em>Param Db Synch Unit Attributes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParamDbSynchUnitAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<EAttribute> paramDbSynchUnitAttributes;

	/**
	 * The default value of the '{@link #getSelectSqlStatement() <em>Select Sql Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectSqlStatement()
	 * @generated
	 * @ordered
	 */
	protected static final String SELECT_SQL_STATEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSelectSqlStatement() <em>Select Sql Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectSqlStatement()
	 * @generated
	 * @ordered
	 */
	protected String selectSqlStatement = SELECT_SQL_STATEMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getInsertSqlStatement() <em>Insert Sql Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsertSqlStatement()
	 * @generated
	 * @ordered
	 */
	protected static final String INSERT_SQL_STATEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInsertSqlStatement() <em>Insert Sql Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsertSqlStatement()
	 * @generated
	 * @ordered
	 */
	protected String insertSqlStatement = INSERT_SQL_STATEMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getUpdateSqlStatement() <em>Update Sql Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdateSqlStatement()
	 * @generated
	 * @ordered
	 */
	protected static final String UPDATE_SQL_STATEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUpdateSqlStatement() <em>Update Sql Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdateSqlStatement()
	 * @generated
	 * @ordered
	 */
	protected String updateSqlStatement = UPDATE_SQL_STATEMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDeleteSqlStatement() <em>Delete Sql Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeleteSqlStatement()
	 * @generated
	 * @ordered
	 */
	protected static final String DELETE_SQL_STATEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeleteSqlStatement() <em>Delete Sql Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeleteSqlStatement()
	 * @generated
	 * @ordered
	 */
	protected String deleteSqlStatement = DELETE_SQL_STATEMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberOfRows() <em>Number Of Rows</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfRows()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_OF_ROWS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumberOfRows() <em>Number Of Rows</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfRows()
	 * @generated
	 * @ordered
	 */
	protected int numberOfRows = NUMBER_OF_ROWS_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastSynchDown() <em>Last Synch Down</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastSynchDown()
	 * @generated
	 * @ordered
	 */
	protected static final Date LAST_SYNCH_DOWN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastSynchDown() <em>Last Synch Down</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastSynchDown()
	 * @generated
	 * @ordered
	 */
	protected Date lastSynchDown = LAST_SYNCH_DOWN_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastSynchUp() <em>Last Synch Up</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastSynchUp()
	 * @generated
	 * @ordered
	 */
	protected static final Date LAST_SYNCH_UP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastSynchUp() <em>Last Synch Up</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastSynchUp()
	 * @generated
	 * @ordered
	 */
	protected Date lastSynchUp = LAST_SYNCH_UP_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParent() <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParent()
	 * @generated
	 * @ordered
	 */
	protected Table parent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	protected TableImpl() {
		super();

		this.eAdapters().add(new AdapterImpl(){
			@Override
			public void notifyChanged(Notification msg) {
				super.notifyChanged(msg);
				TableImpl.this.notifyChanged(msg);
			}
		});

	}
	
	/**
	 * When some contained row is removed, unindex it.
	 * 
	 * @param msg
	 */
	private void notifyChanged(Notification msg){
		if ( !(msg.getFeature() instanceof EReference) ) { return; }
		EReference reference = (EReference)msg.getFeature();
		if ( !reference.isContainment()) { return; }
		if ( ! DbSynchPackage.Literals.TABLE_ROW.isSuperTypeOf(reference.getEReferenceType())) { return; }
		if ( msg.getEventType()==Notification.REMOVE){
			TableRow rowRemoved = (TableRow)msg.getOldValue();
			this.unindexRow(rowRemoved);
		} else if ( msg.getEventType()==Notification.REMOVE_MANY){
			Collection<TableRow> rowsRemoved = (Collection<TableRow>)msg.getOldValue(); // not seen working
			for ( TableRow rowRemoved : rowsRemoved){
				this.unindexRow(rowRemoved);
			}
		}
	}

	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DbSynchPackage.Literals.TABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DbSynchUnitAbstract getSynchUnit() {
		DbSynchUnitAbstract synchUnit = basicGetSynchUnit();
		return synchUnit != null && synchUnit.eIsProxy() ? (DbSynchUnitAbstract)eResolveProxy((InternalEObject)synchUnit) : synchUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public DbSynchUnitAbstract basicGetSynchUnit() {
		if ( !(this.eContainer() instanceof DbSynchUnitAbstract) ){
			throw new RuntimeException("Table: the owner must be a DbSynchUnit");
		}
		return (DbSynchUnitAbstract)this.eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public String getName() {
		return "";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public EList<TableRow> getRows() {
		EList<TableRow> newList = new EObjectListDerived<TableRow>(TableRow.class, this, DbSynchPackage.TABLE__ROWS, true);
		for ( EObject element : this.eContents()){
			if ( element instanceof TableRow){
				newList.add((TableRow)element);
			}
		}
		return newList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTableName() {
		return tableName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTableName(String newTableName) {
		String oldTableName = tableName;
		tableName = newTableName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbSynchPackage.TABLE__TABLE_NAME, oldTableName, tableName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWhereClause() {
		return whereClause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhereClause(String newWhereClause) {
		String oldWhereClause = whereClause;
		whereClause = newWhereClause;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbSynchPackage.TABLE__WHERE_CLAUSE, oldWhereClause, whereClause));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSelectSqlStatement() {
		return selectSqlStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelectSqlStatement(String newSelectSqlStatement) {
		String oldSelectSqlStatement = selectSqlStatement;
		selectSqlStatement = newSelectSqlStatement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbSynchPackage.TABLE__SELECT_SQL_STATEMENT, oldSelectSqlStatement, selectSqlStatement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInsertSqlStatement() {
		return insertSqlStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInsertSqlStatement(String newInsertSqlStatement) {
		String oldInsertSqlStatement = insertSqlStatement;
		insertSqlStatement = newInsertSqlStatement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbSynchPackage.TABLE__INSERT_SQL_STATEMENT, oldInsertSqlStatement, insertSqlStatement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUpdateSqlStatement() {
		return updateSqlStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpdateSqlStatement(String newUpdateSqlStatement) {
		String oldUpdateSqlStatement = updateSqlStatement;
		updateSqlStatement = newUpdateSqlStatement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbSynchPackage.TABLE__UPDATE_SQL_STATEMENT, oldUpdateSqlStatement, updateSqlStatement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDeleteSqlStatement() {
		return deleteSqlStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeleteSqlStatement(String newDeleteSqlStatement) {
		String oldDeleteSqlStatement = deleteSqlStatement;
		deleteSqlStatement = newDeleteSqlStatement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbSynchPackage.TABLE__DELETE_SQL_STATEMENT, oldDeleteSqlStatement, deleteSqlStatement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void refreshMetaData() {
		this.refreshMetaDataImpl();
	}

	/**
	 * <!-- begin-user-doc -->
	 * Default implementation does nothing.
	 * <p>
	 * The specialization may overload it in order
	 * <ul>
	 *   <li> to set the name of the table: {@link #setTableName(String)} </li>
	 *   <li> to set the where clause: {@link #setWhereClause(String)} </li>
	 *   <li> to add parameters: {@link #addParam(EAttribute)} </li>
	 *   <li> to add columns: {@link #addColumn(boolean, String, EnumColumnType, EAttribute, String) }</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 */
	protected void refreshMetaDataImpl() {
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TableColumn> getKeyColumns() {
		if (keyColumns == null) {
			keyColumns = new EObjectContainmentEList<TableColumn>(TableColumn.class, this, DbSynchPackage.TABLE__KEY_COLUMNS);
		}
		return keyColumns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public EList<TableColumn> getColumns() {
		EObjectListDerived<TableColumn> newList = new EObjectListDerived<TableColumn>(TableColumn.class, this, DbSynchPackage.TABLE__COLUMNS, true);
		for ( TableColumn object : this.getKeyColumns()){
			newList.addUnique(object);
	}
		for ( TableColumn object : this.getDataColumns()){
			newList.addUnique(object);
	}
		return newList;
	}

	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EAttribute> getParamDbSynchUnitAttributes() {
		if (paramDbSynchUnitAttributes == null) {
			paramDbSynchUnitAttributes = new EObjectResolvingEList<EAttribute>(EAttribute.class, this, DbSynchPackage.TABLE__PARAM_DB_SYNCH_UNIT_ATTRIBUTES);
		}
		return paramDbSynchUnitAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public TableColumn addColumn(boolean isKey, String column, EnumColumnType type, EAttribute attribute) {
		TableColumn parentColumn = null; 
		return this.addColumn(isKey, column, type, attribute, parentColumn);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public TableColumn addColumn(boolean Key, String column, EnumColumnType type, EAttribute attribute, String parentColumnName) {
		TableColumn parentColumn = this.getColumn(parentColumnName); 
		return this.addColumn(Key, column, type, attribute, parentColumn);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public TableColumn addColumn(boolean Key, String column, EnumColumnType type, EAttribute attribute, TableColumn parentColumn) {
		// remove the key columns with the same name
		Iterator<TableColumn> iterator = this.getKeyColumns().iterator();
		while (iterator.hasNext()){
			if ( iterator.next().getColumnName().equals(column)){
				iterator.remove();
			}
		}
		// remove the data columns with the same name
		Iterator<TableColumn> iterator2 = this.getDataColumns().iterator();
		while (iterator2.hasNext()){
			if ( iterator2.next().getColumnName().equals(column)){
				iterator2.remove();
			}
		}
		// create the column
		TableColumn newColumn = DbSynchFactory.eINSTANCE.createTableColumn();
		if ( Key ){
			this.getKeyColumns().add(newColumn);
		} else {
			this.getDataColumns().add(newColumn);
		}
		newColumn.setColumnName(column);
		newColumn.setColumnType(type);
		newColumn.setRowAttribute(attribute);
		newColumn.setParentTableColumn(parentColumn);
		
		return newColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void addParam(EAttribute dbSynchAttribute) {
		if ( !this.getParamDbSynchUnitAttributes().contains(dbSynchAttribute)){
			this.getParamDbSynchUnitAttributes().add(dbSynchAttribute);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getLastSynchDown() {
		return lastSynchDown;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastSynchDown(Date newLastSynchDown) {
		Date oldLastSynchDown = lastSynchDown;
		lastSynchDown = newLastSynchDown;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbSynchPackage.TABLE__LAST_SYNCH_DOWN, oldLastSynchDown, lastSynchDown));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getLastSynchUp() {
		return lastSynchUp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastSynchUp(Date newLastSynchUp) {
		Date oldLastSynchUp = lastSynchUp;
		lastSynchUp = newLastSynchUp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbSynchPackage.TABLE__LAST_SYNCH_UP, oldLastSynchUp, lastSynchUp));
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table getParent() {
		if (parent != null && parent.eIsProxy()) {
			InternalEObject oldParent = (InternalEObject)parent;
			parent = (Table)eResolveProxy(oldParent);
			if (parent != oldParent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DbSynchPackage.TABLE__PARENT, oldParent, parent));
			}
		}
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table basicGetParent() {
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(Table newParent) {
		Table oldParent = parent;
		parent = newParent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbSynchPackage.TABLE__PARENT, oldParent, parent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public TableColumn getColumn(String name) {
		Iterator<TableColumn> iterator = this.getKeyColumns().iterator();
		while (iterator.hasNext()){
			TableColumn column = iterator.next();
			if ( column.getColumnName().equals(name)){
				return column;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TableColumn> getDataColumns() {
		if (dataColumns == null) {
			dataColumns = new EObjectContainmentEList<TableColumn>(TableColumn.class, this, DbSynchPackage.TABLE__DATA_COLUMNS);
		}
		return dataColumns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumberOfRows() {
		return numberOfRows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfRows(int newNumberOfRows) {
		int oldNumberOfRows = numberOfRows;
		numberOfRows = newNumberOfRows;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbSynchPackage.TABLE__NUMBER_OF_ROWS, oldNumberOfRows, numberOfRows));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void indexRow(TableRow row) {
		if ( TableImpl.this.rowIndex!=null){
			TableRowKey key = row.getCurrentKey();
			TableImpl.this.rowIndex.put(key, row);
			row.setIndexKey(key);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public TableRow getRow(TableRowKey key) {
		if ( this.rowIndex==null){
			this.refreshIndex();
		}
		TableRow row = this.rowIndex.get(key);
		return row;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public TableRow constructRow() {
		// Ensure that you remove @generated or mark it @generated NOT
		// to be implemented by the concrete class
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void unindexRow(TableRow row) {
		if ( TableImpl.this.rowIndex!=null){
			TableImpl.this.rowIndex.remove(row.getIndexKey());
			row.setIndexKey(null);;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void refreshIndex() {
		// brute force refresh
		// we will do beter when we will know how the refresh is needed
		this.rowIndex = new HashMap<TableRowKey, TableRow>();
		for ( TableRow row : this.getRows()){
			this.indexRow(row);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DbSynchPackage.TABLE__KEY_COLUMNS:
				return ((InternalEList<?>)getKeyColumns()).basicRemove(otherEnd, msgs);
			case DbSynchPackage.TABLE__DATA_COLUMNS:
				return ((InternalEList<?>)getDataColumns()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void refresh() {
		Plugin.INSTANCE.logInfo("Refresh table "+this.getName()+" started");
		for ( TableRow row : this.getRows()){
			row.refresh();
		}
		Plugin.INSTANCE.logInfo("Refresh table "+this.getName()+" complete");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public ReturnFeedback synchUp() {
		DbSynchUnitAbstract synchUnit = this.getSynchUnit();
		DataSource dataSource = synchUnit.getDataSource();
		return dataSource.synchUpTableImpl(this);
    }
	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public ReturnFeedback synchDown() {
		DbSynchUnitAbstract synchUnit = this.getSynchUnit();
		DataSource dataSource = synchUnit.getDataSource();
		return dataSource.synchDownTableImpl(this);
	}




	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DbSynchPackage.TABLE__SYNCH_UNIT:
				if (resolve) return getSynchUnit();
				return basicGetSynchUnit();
			case DbSynchPackage.TABLE__COLUMNS:
				return getColumns();
			case DbSynchPackage.TABLE__KEY_COLUMNS:
				return getKeyColumns();
			case DbSynchPackage.TABLE__DATA_COLUMNS:
				return getDataColumns();
			case DbSynchPackage.TABLE__TABLE_NAME:
				return getTableName();
			case DbSynchPackage.TABLE__WHERE_CLAUSE:
				return getWhereClause();
			case DbSynchPackage.TABLE__PARAM_DB_SYNCH_UNIT_ATTRIBUTES:
				return getParamDbSynchUnitAttributes();
			case DbSynchPackage.TABLE__ROWS:
				return getRows();
			case DbSynchPackage.TABLE__SELECT_SQL_STATEMENT:
				return getSelectSqlStatement();
			case DbSynchPackage.TABLE__INSERT_SQL_STATEMENT:
				return getInsertSqlStatement();
			case DbSynchPackage.TABLE__UPDATE_SQL_STATEMENT:
				return getUpdateSqlStatement();
			case DbSynchPackage.TABLE__DELETE_SQL_STATEMENT:
				return getDeleteSqlStatement();
			case DbSynchPackage.TABLE__NUMBER_OF_ROWS:
				return getNumberOfRows();
			case DbSynchPackage.TABLE__LAST_SYNCH_DOWN:
				return getLastSynchDown();
			case DbSynchPackage.TABLE__LAST_SYNCH_UP:
				return getLastSynchUp();
			case DbSynchPackage.TABLE__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DbSynchPackage.TABLE__KEY_COLUMNS:
				getKeyColumns().clear();
				getKeyColumns().addAll((Collection<? extends TableColumn>)newValue);
				return;
			case DbSynchPackage.TABLE__DATA_COLUMNS:
				getDataColumns().clear();
				getDataColumns().addAll((Collection<? extends TableColumn>)newValue);
				return;
			case DbSynchPackage.TABLE__TABLE_NAME:
				setTableName((String)newValue);
				return;
			case DbSynchPackage.TABLE__WHERE_CLAUSE:
				setWhereClause((String)newValue);
				return;
			case DbSynchPackage.TABLE__PARAM_DB_SYNCH_UNIT_ATTRIBUTES:
				getParamDbSynchUnitAttributes().clear();
				getParamDbSynchUnitAttributes().addAll((Collection<? extends EAttribute>)newValue);
				return;
			case DbSynchPackage.TABLE__SELECT_SQL_STATEMENT:
				setSelectSqlStatement((String)newValue);
				return;
			case DbSynchPackage.TABLE__INSERT_SQL_STATEMENT:
				setInsertSqlStatement((String)newValue);
				return;
			case DbSynchPackage.TABLE__UPDATE_SQL_STATEMENT:
				setUpdateSqlStatement((String)newValue);
				return;
			case DbSynchPackage.TABLE__DELETE_SQL_STATEMENT:
				setDeleteSqlStatement((String)newValue);
				return;
			case DbSynchPackage.TABLE__NUMBER_OF_ROWS:
				setNumberOfRows((Integer)newValue);
				return;
			case DbSynchPackage.TABLE__LAST_SYNCH_DOWN:
				setLastSynchDown((Date)newValue);
				return;
			case DbSynchPackage.TABLE__LAST_SYNCH_UP:
				setLastSynchUp((Date)newValue);
				return;
			case DbSynchPackage.TABLE__PARENT:
				setParent((Table)newValue);
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
			case DbSynchPackage.TABLE__KEY_COLUMNS:
				getKeyColumns().clear();
				return;
			case DbSynchPackage.TABLE__DATA_COLUMNS:
				getDataColumns().clear();
				return;
			case DbSynchPackage.TABLE__TABLE_NAME:
				setTableName(TABLE_NAME_EDEFAULT);
				return;
			case DbSynchPackage.TABLE__WHERE_CLAUSE:
				setWhereClause(WHERE_CLAUSE_EDEFAULT);
				return;
			case DbSynchPackage.TABLE__PARAM_DB_SYNCH_UNIT_ATTRIBUTES:
				getParamDbSynchUnitAttributes().clear();
				return;
			case DbSynchPackage.TABLE__SELECT_SQL_STATEMENT:
				setSelectSqlStatement(SELECT_SQL_STATEMENT_EDEFAULT);
				return;
			case DbSynchPackage.TABLE__INSERT_SQL_STATEMENT:
				setInsertSqlStatement(INSERT_SQL_STATEMENT_EDEFAULT);
				return;
			case DbSynchPackage.TABLE__UPDATE_SQL_STATEMENT:
				setUpdateSqlStatement(UPDATE_SQL_STATEMENT_EDEFAULT);
				return;
			case DbSynchPackage.TABLE__DELETE_SQL_STATEMENT:
				setDeleteSqlStatement(DELETE_SQL_STATEMENT_EDEFAULT);
				return;
			case DbSynchPackage.TABLE__NUMBER_OF_ROWS:
				setNumberOfRows(NUMBER_OF_ROWS_EDEFAULT);
				return;
			case DbSynchPackage.TABLE__LAST_SYNCH_DOWN:
				setLastSynchDown(LAST_SYNCH_DOWN_EDEFAULT);
				return;
			case DbSynchPackage.TABLE__LAST_SYNCH_UP:
				setLastSynchUp(LAST_SYNCH_UP_EDEFAULT);
				return;
			case DbSynchPackage.TABLE__PARENT:
				setParent((Table)null);
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
			case DbSynchPackage.TABLE__SYNCH_UNIT:
				return basicGetSynchUnit() != null;
			case DbSynchPackage.TABLE__COLUMNS:
				return !getColumns().isEmpty();
			case DbSynchPackage.TABLE__KEY_COLUMNS:
				return keyColumns != null && !keyColumns.isEmpty();
			case DbSynchPackage.TABLE__DATA_COLUMNS:
				return dataColumns != null && !dataColumns.isEmpty();
			case DbSynchPackage.TABLE__TABLE_NAME:
				return TABLE_NAME_EDEFAULT == null ? tableName != null : !TABLE_NAME_EDEFAULT.equals(tableName);
			case DbSynchPackage.TABLE__WHERE_CLAUSE:
				return WHERE_CLAUSE_EDEFAULT == null ? whereClause != null : !WHERE_CLAUSE_EDEFAULT.equals(whereClause);
			case DbSynchPackage.TABLE__PARAM_DB_SYNCH_UNIT_ATTRIBUTES:
				return paramDbSynchUnitAttributes != null && !paramDbSynchUnitAttributes.isEmpty();
			case DbSynchPackage.TABLE__ROWS:
				return !getRows().isEmpty();
			case DbSynchPackage.TABLE__SELECT_SQL_STATEMENT:
				return SELECT_SQL_STATEMENT_EDEFAULT == null ? selectSqlStatement != null : !SELECT_SQL_STATEMENT_EDEFAULT.equals(selectSqlStatement);
			case DbSynchPackage.TABLE__INSERT_SQL_STATEMENT:
				return INSERT_SQL_STATEMENT_EDEFAULT == null ? insertSqlStatement != null : !INSERT_SQL_STATEMENT_EDEFAULT.equals(insertSqlStatement);
			case DbSynchPackage.TABLE__UPDATE_SQL_STATEMENT:
				return UPDATE_SQL_STATEMENT_EDEFAULT == null ? updateSqlStatement != null : !UPDATE_SQL_STATEMENT_EDEFAULT.equals(updateSqlStatement);
			case DbSynchPackage.TABLE__DELETE_SQL_STATEMENT:
				return DELETE_SQL_STATEMENT_EDEFAULT == null ? deleteSqlStatement != null : !DELETE_SQL_STATEMENT_EDEFAULT.equals(deleteSqlStatement);
			case DbSynchPackage.TABLE__NUMBER_OF_ROWS:
				return numberOfRows != NUMBER_OF_ROWS_EDEFAULT;
			case DbSynchPackage.TABLE__LAST_SYNCH_DOWN:
				return LAST_SYNCH_DOWN_EDEFAULT == null ? lastSynchDown != null : !LAST_SYNCH_DOWN_EDEFAULT.equals(lastSynchDown);
			case DbSynchPackage.TABLE__LAST_SYNCH_UP:
				return LAST_SYNCH_UP_EDEFAULT == null ? lastSynchUp != null : !LAST_SYNCH_UP_EDEFAULT.equals(lastSynchUp);
			case DbSynchPackage.TABLE__PARENT:
				return parent != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case DbSynchPackage.TABLE___GET_COLUMN__STRING:
				return getColumn((String)arguments.get(0));
			case DbSynchPackage.TABLE___ADD_COLUMN__BOOLEAN_STRING_ENUMCOLUMNTYPE_EATTRIBUTE:
				return addColumn((Boolean)arguments.get(0), (String)arguments.get(1), (EnumColumnType)arguments.get(2), (EAttribute)arguments.get(3));
			case DbSynchPackage.TABLE___ADD_COLUMN__BOOLEAN_STRING_ENUMCOLUMNTYPE_EATTRIBUTE_TABLECOLUMN:
				return addColumn((Boolean)arguments.get(0), (String)arguments.get(1), (EnumColumnType)arguments.get(2), (EAttribute)arguments.get(3), (TableColumn)arguments.get(4));
			case DbSynchPackage.TABLE___ADD_COLUMN__BOOLEAN_STRING_ENUMCOLUMNTYPE_EATTRIBUTE_STRING:
				return addColumn((Boolean)arguments.get(0), (String)arguments.get(1), (EnumColumnType)arguments.get(2), (EAttribute)arguments.get(3), (String)arguments.get(4));
			case DbSynchPackage.TABLE___ADD_PARAM__EATTRIBUTE:
				addParam((EAttribute)arguments.get(0));
				return null;
			case DbSynchPackage.TABLE___REFRESH_META_DATA:
				refreshMetaData();
				return null;
			case DbSynchPackage.TABLE___SYNCH_DOWN:
				return synchDown();
			case DbSynchPackage.TABLE___SYNCH_UP:
				return synchUp();
			case DbSynchPackage.TABLE___REFRESH:
				refresh();
				return null;
			case DbSynchPackage.TABLE___GET_ROW__TABLEROWKEY:
				return getRow((TableRowKey)arguments.get(0));
			case DbSynchPackage.TABLE___CONSTRUCT_ROW:
				return constructRow();
			case DbSynchPackage.TABLE___INDEX_ROW__TABLEROW:
				indexRow((TableRow)arguments.get(0));
				return null;
			case DbSynchPackage.TABLE___UNINDEX_ROW__TABLEROW:
				unindexRow((TableRow)arguments.get(0));
				return null;
			case DbSynchPackage.TABLE___REFRESH_INDEX:
				refreshIndex();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (TableName: ");
		result.append(tableName);
		result.append(", WhereClause: ");
		result.append(whereClause);
		result.append(", SelectSqlStatement: ");
		result.append(selectSqlStatement);
		result.append(", InsertSqlStatement: ");
		result.append(insertSqlStatement);
		result.append(", UpdateSqlStatement: ");
		result.append(updateSqlStatement);
		result.append(", DeleteSqlStatement: ");
		result.append(deleteSqlStatement);
		result.append(", NumberOfRows: ");
		result.append(numberOfRows);
		result.append(", LastSynchDown: ");
		result.append(lastSynchDown);
		result.append(", LastSynchUp: ");
		result.append(lastSynchUp);
		result.append(')');
		return result.toString();
	}

} //TableImpl
