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

import com.misc.common.moplaf.dbsynch.DbSynchPackage;
import com.misc.common.moplaf.dbsynch.EnumColumnType;
import com.misc.common.moplaf.dbsynch.Table;
import com.misc.common.moplaf.dbsynch.TableColumn;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Table Column</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.dbsynch.impl.TableColumnImpl#isKey <em>Key</em>}</li>
 *   <li>{@link com.misc.common.moplaf.dbsynch.impl.TableColumnImpl#getColumnName <em>Column Name</em>}</li>
 *   <li>{@link com.misc.common.moplaf.dbsynch.impl.TableColumnImpl#getColumnType <em>Column Type</em>}</li>
 *   <li>{@link com.misc.common.moplaf.dbsynch.impl.TableColumnImpl#getRowAttribute <em>Row Attribute</em>}</li>
 *   <li>{@link com.misc.common.moplaf.dbsynch.impl.TableColumnImpl#getTable <em>Table</em>}</li>
 *   <li>{@link com.misc.common.moplaf.dbsynch.impl.TableColumnImpl#getParentTableColumn <em>Parent Table Column</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TableColumnImpl extends MinimalEObjectImpl.Container implements TableColumn {
	/**
	 * The default value of the '{@link #isKey() <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isKey()
	 * @generated
	 * @ordered
	 */
	protected static final boolean KEY_EDEFAULT = false;

	/**
	 * The default value of the '{@link #getColumnName() <em>Column Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnName()
	 * @generated
	 * @ordered
	 */
	protected static final String COLUMN_NAME_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getColumnName() <em>Column Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnName()
	 * @generated
	 * @ordered
	 */
	protected String columnName = COLUMN_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getColumnType() <em>Column Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnType()
	 * @ordered
	 */
//	protected static final EnumColumnType COLUMN_TYPE_EDEFAULT = EnumColumnType.ENUM_COLUMN_TYPE_INT;
	protected static final EnumColumnType COLUMN_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColumnType() <em>Column Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnType()
	 * @generated
	 * @ordered
	 */
	protected EnumColumnType columnType = COLUMN_TYPE_EDEFAULT;

	/**
	 * This is true if the Column Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean columnTypeESet;

	/**
	 * The cached value of the '{@link #getRowAttribute() <em>Row Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRowAttribute()
	 * @generated
	 * @ordered
	 */
	protected EAttribute rowAttribute;

	/**
	 * The cached value of the '{@link #getParentTableColumn() <em>Parent Table Column</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentTableColumn()
	 * @generated
	 * @ordered
	 */
	protected TableColumn parentTableColumn;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TableColumnImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DbSynchPackage.Literals.TABLE_COLUMN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public boolean isKey() {
		return this.eContainingFeature() == DbSynchPackage.Literals.TABLE__KEY_COLUMNS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getColumnName() {
		return columnName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumnName(String newColumnName) {
		String oldColumnName = columnName;
		columnName = newColumnName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbSynchPackage.TABLE_COLUMN__COLUMN_NAME, oldColumnName, columnName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRowAttribute() {
		if (rowAttribute != null && rowAttribute.eIsProxy()) {
			InternalEObject oldRowAttribute = (InternalEObject)rowAttribute;
			rowAttribute = (EAttribute)eResolveProxy(oldRowAttribute);
			if (rowAttribute != oldRowAttribute) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DbSynchPackage.TABLE_COLUMN__ROW_ATTRIBUTE, oldRowAttribute, rowAttribute));
			}
		}
		return rowAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute basicGetRowAttribute() {
		return rowAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRowAttribute(EAttribute newRowAttribute) {
		EAttribute oldRowAttribute = rowAttribute;
		rowAttribute = newRowAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbSynchPackage.TABLE_COLUMN__ROW_ATTRIBUTE, oldRowAttribute, rowAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table getTable() {
		Table table = basicGetTable();
		return table != null && table.eIsProxy() ? (Table)eResolveProxy((InternalEObject)table) : table;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Table basicGetTable() {
		if ( this.eContainer() instanceof Table ){
			return (Table)this.eContainer();
		}
		throw new RuntimeException("TableColumn: the owner must be a Table");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableColumn getParentTableColumn() {
		if (parentTableColumn != null && parentTableColumn.eIsProxy()) {
			InternalEObject oldParentTableColumn = (InternalEObject)parentTableColumn;
			parentTableColumn = (TableColumn)eResolveProxy(oldParentTableColumn);
			if (parentTableColumn != oldParentTableColumn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DbSynchPackage.TABLE_COLUMN__PARENT_TABLE_COLUMN, oldParentTableColumn, parentTableColumn));
			}
		}
		return parentTableColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableColumn basicGetParentTableColumn() {
		return parentTableColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentTableColumn(TableColumn newParentTableColumn) {
		TableColumn oldParentTableColumn = parentTableColumn;
		parentTableColumn = newParentTableColumn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbSynchPackage.TABLE_COLUMN__PARENT_TABLE_COLUMN, oldParentTableColumn, parentTableColumn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumColumnType getColumnType() {
		return columnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumnType(EnumColumnType newColumnType) {
		EnumColumnType oldColumnType = columnType;
		columnType = newColumnType == null ? COLUMN_TYPE_EDEFAULT : newColumnType;
		boolean oldColumnTypeESet = columnTypeESet;
		columnTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbSynchPackage.TABLE_COLUMN__COLUMN_TYPE, oldColumnType, columnType, !oldColumnTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetColumnType() {
		EnumColumnType oldColumnType = columnType;
		boolean oldColumnTypeESet = columnTypeESet;
		columnType = COLUMN_TYPE_EDEFAULT;
		columnTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DbSynchPackage.TABLE_COLUMN__COLUMN_TYPE, oldColumnType, COLUMN_TYPE_EDEFAULT, oldColumnTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetColumnType() {
		return columnTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DbSynchPackage.TABLE_COLUMN__KEY:
				return isKey();
			case DbSynchPackage.TABLE_COLUMN__COLUMN_NAME:
				return getColumnName();
			case DbSynchPackage.TABLE_COLUMN__COLUMN_TYPE:
				return getColumnType();
			case DbSynchPackage.TABLE_COLUMN__ROW_ATTRIBUTE:
				if (resolve) return getRowAttribute();
				return basicGetRowAttribute();
			case DbSynchPackage.TABLE_COLUMN__TABLE:
				if (resolve) return getTable();
				return basicGetTable();
			case DbSynchPackage.TABLE_COLUMN__PARENT_TABLE_COLUMN:
				if (resolve) return getParentTableColumn();
				return basicGetParentTableColumn();
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
			case DbSynchPackage.TABLE_COLUMN__COLUMN_NAME:
				setColumnName((String)newValue);
				return;
			case DbSynchPackage.TABLE_COLUMN__COLUMN_TYPE:
				setColumnType((EnumColumnType)newValue);
				return;
			case DbSynchPackage.TABLE_COLUMN__ROW_ATTRIBUTE:
				setRowAttribute((EAttribute)newValue);
				return;
			case DbSynchPackage.TABLE_COLUMN__PARENT_TABLE_COLUMN:
				setParentTableColumn((TableColumn)newValue);
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
			case DbSynchPackage.TABLE_COLUMN__COLUMN_NAME:
				setColumnName(COLUMN_NAME_EDEFAULT);
				return;
			case DbSynchPackage.TABLE_COLUMN__COLUMN_TYPE:
				unsetColumnType();
				return;
			case DbSynchPackage.TABLE_COLUMN__ROW_ATTRIBUTE:
				setRowAttribute((EAttribute)null);
				return;
			case DbSynchPackage.TABLE_COLUMN__PARENT_TABLE_COLUMN:
				setParentTableColumn((TableColumn)null);
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
			case DbSynchPackage.TABLE_COLUMN__KEY:
				return isKey() != KEY_EDEFAULT;
			case DbSynchPackage.TABLE_COLUMN__COLUMN_NAME:
				return COLUMN_NAME_EDEFAULT == null ? columnName != null : !COLUMN_NAME_EDEFAULT.equals(columnName);
			case DbSynchPackage.TABLE_COLUMN__COLUMN_TYPE:
				return isSetColumnType();
			case DbSynchPackage.TABLE_COLUMN__ROW_ATTRIBUTE:
				return rowAttribute != null;
			case DbSynchPackage.TABLE_COLUMN__TABLE:
				return basicGetTable() != null;
			case DbSynchPackage.TABLE_COLUMN__PARENT_TABLE_COLUMN:
				return parentTableColumn != null;
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (ColumnName: ");
		result.append(columnName);
		result.append(", ColumnType: ");
		if (columnTypeESet) result.append(columnType); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TableColumnImpl
