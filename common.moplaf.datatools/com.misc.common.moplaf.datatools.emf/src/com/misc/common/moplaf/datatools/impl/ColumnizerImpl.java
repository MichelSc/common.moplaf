/**
 */
package com.misc.common.moplaf.datatools.impl;

import com.misc.common.moplaf.common.IPropertiesProvider;
import com.misc.common.moplaf.datatools.AggregationType;
import com.misc.common.moplaf.datatools.Columnizer;
import com.misc.common.moplaf.datatools.ColumnizerColumn;
import com.misc.common.moplaf.datatools.DatatoolsPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Columnizer</b></em>'.
 * @implements IPropertiesProvider
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.datatools.impl.ColumnizerImpl#getColumns <em>Columns</em>}</li>
 *   <li>{@link com.misc.common.moplaf.datatools.impl.ColumnizerImpl#getColumnizedType <em>Columnized Type</em>}</li>
 *   <li>{@link com.misc.common.moplaf.datatools.impl.ColumnizerImpl#getSheetName <em>Sheet Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ColumnizerImpl extends ColumnizerAbstractImpl implements Columnizer, IPropertiesProvider {
	/**
	 * The cached value of the '{@link #getColumns() <em>Columns</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumns()
	 * @generated
	 * @ordered
	 */
	protected EList<ColumnizerColumn> columns;
	/**
	 * The cached value of the '{@link #getColumnizedType() <em>Columnized Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnizedType()
	 * @generated
	 * @ordered
	 */
	protected EClass columnizedType;
	/**
	 * The default value of the '{@link #getSheetName() <em>Sheet Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSheetName()
	 * @generated
	 * @ordered
	 */
	protected static final String SHEET_NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getSheetName() <em>Sheet Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSheetName()
	 * @generated
	 * @ordered
	 */
	protected String sheetName = SHEET_NAME_EDEFAULT;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ColumnizerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatatoolsPackage.Literals.COLUMNIZER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ColumnizerColumn> getColumns() {
		if (columns == null) {
			columns = new EObjectContainmentWithInverseEList<ColumnizerColumn>(ColumnizerColumn.class, this, DatatoolsPackage.COLUMNIZER__COLUMNS, DatatoolsPackage.COLUMNIZER_COLUMN__COLUMNIZER);
		}
		return columns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getColumnizedType() {
		if (columnizedType != null && columnizedType.eIsProxy()) {
			InternalEObject oldColumnizedType = (InternalEObject)columnizedType;
			columnizedType = (EClass)eResolveProxy(oldColumnizedType);
			if (columnizedType != oldColumnizedType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DatatoolsPackage.COLUMNIZER__COLUMNIZED_TYPE, oldColumnizedType, columnizedType));
			}
		}
		return columnizedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass basicGetColumnizedType() {
		return columnizedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumnizedType(EClass newColumnizedType) {
		EClass oldColumnizedType = columnizedType;
		columnizedType = newColumnizedType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatoolsPackage.COLUMNIZER__COLUMNIZED_TYPE, oldColumnizedType, columnizedType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSheetName() {
		return sheetName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSheetName(String newSheetName) {
		String oldSheetName = sheetName;
		sheetName = newSheetName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatoolsPackage.COLUMNIZER__SHEET_NAME, oldSheetName, sheetName));
	}
	
	

	@Override
	public String getSheetLabel() {
		return this.getSheetName();
	}

	@Override
	protected void collectParamsDescription(List<String> params) {
		for ( ColumnizerColumn column: this.getColumns()) {
			String name = column.getColumnName();
			params.add(name==null ? "null" : name);
		}
	}

	@Override
	protected String getTypeDescription() {
		return "Columnizer";
	}
	
	/** 
	 * Specified by ColumnizerAbstract
	 * 
	 */
	@Override
	protected boolean isValidElementTypeImpl(EClass type) {
		EClass columnized_type = this.getColumnizedType();
		if ( columnized_type==null ) {
			return false;
		}
		if ( !columnized_type.isSuperTypeOf(type)) {
			return false;
		}
		return true;
	}

	@Override
	public IPropertiesProvider getPropertiesProvider() {
		return this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DatatoolsPackage.COLUMNIZER__COLUMNS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getColumns()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DatatoolsPackage.COLUMNIZER__COLUMNS:
				return ((InternalEList<?>)getColumns()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DatatoolsPackage.COLUMNIZER__COLUMNS:
				return getColumns();
			case DatatoolsPackage.COLUMNIZER__COLUMNIZED_TYPE:
				if (resolve) return getColumnizedType();
				return basicGetColumnizedType();
			case DatatoolsPackage.COLUMNIZER__SHEET_NAME:
				return getSheetName();
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
			case DatatoolsPackage.COLUMNIZER__COLUMNS:
				getColumns().clear();
				getColumns().addAll((Collection<? extends ColumnizerColumn>)newValue);
				return;
			case DatatoolsPackage.COLUMNIZER__COLUMNIZED_TYPE:
				setColumnizedType((EClass)newValue);
				return;
			case DatatoolsPackage.COLUMNIZER__SHEET_NAME:
				setSheetName((String)newValue);
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
			case DatatoolsPackage.COLUMNIZER__COLUMNS:
				getColumns().clear();
				return;
			case DatatoolsPackage.COLUMNIZER__COLUMNIZED_TYPE:
				setColumnizedType((EClass)null);
				return;
			case DatatoolsPackage.COLUMNIZER__SHEET_NAME:
				setSheetName(SHEET_NAME_EDEFAULT);
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
			case DatatoolsPackage.COLUMNIZER__COLUMNS:
				return columns != null && !columns.isEmpty();
			case DatatoolsPackage.COLUMNIZER__COLUMNIZED_TYPE:
				return columnizedType != null;
			case DatatoolsPackage.COLUMNIZER__SHEET_NAME:
				return SHEET_NAME_EDEFAULT == null ? sheetName != null : !SHEET_NAME_EDEFAULT.equals(sheetName);
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
		result.append(" (SheetName: ");
		result.append(sheetName);
		result.append(')');
		return result.toString();
	}

	/**
	 * Specified by IPropertiesProvider
	 */
	@Override
	public Collection<?> getProperties() {
		return this.getColumns();
	}

	/**
	 * Specified by IPropertiesProvider
	 */
	@Override
	public String getPropertyText(Object property) {
		ColumnizerColumn column = (ColumnizerColumn)property;
		return column.getColumnName();
	}

	/**
	 * Specified by IPropertiesProvider
	 */
	@Override
	public Object getPropertyValue(Object element, Object property) {
		ColumnizerColumn column = (ColumnizerColumn)property;
		return column.getValue((EObject)element);
	}

	/**
	 * Specified by IPropertiesProvider
	 */
	@Override
	public int getPropertyType(Object property) {
		ColumnizerColumn column = (ColumnizerColumn)property;
		EDataType data_type = column.getDataType();
		return IPropertiesProvider.toPropertyType(data_type);
	}

	/**
	 * Specified by IPropertiesProvider
	 */
	@Override
	public int getPropertyAggregation(Object property) {
		ColumnizerColumn column = (ColumnizerColumn)property;
		AggregationType aggregation = column.getAggregationType();
		return aggregation.toIPropertiesProviderAggregation();
	}

	/**
	 * Specified by IPropertiesProvider
	 */
	@Override
	public int getPropertyDisplayWidth(Object property) {
		ColumnizerColumn column = (ColumnizerColumn)property;
		return column.getColumnWidth();
	}
	
	
	
	


} //ColumnizerImpl
