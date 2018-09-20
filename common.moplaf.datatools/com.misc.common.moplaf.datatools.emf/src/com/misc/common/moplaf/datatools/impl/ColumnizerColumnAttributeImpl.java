/**
 */
package com.misc.common.moplaf.datatools.impl;

import com.misc.common.moplaf.datatools.Columnizer;
import com.misc.common.moplaf.datatools.ColumnizerColumn;
import com.misc.common.moplaf.datatools.ColumnizerColumnAttribute;
import com.misc.common.moplaf.datatools.DataToolContext;
import com.misc.common.moplaf.datatools.DatatoolsPackage;
import com.misc.common.moplaf.datatools.util.Util;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Columnizer Column Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.datatools.impl.ColumnizerColumnAttributeImpl#getColumnName <em>Column Name</em>}</li>
 *   <li>{@link com.misc.common.moplaf.datatools.impl.ColumnizerColumnAttributeImpl#getColumnWidth <em>Column Width</em>}</li>
 *   <li>{@link com.misc.common.moplaf.datatools.impl.ColumnizerColumnAttributeImpl#getColumnizer <em>Columnizer</em>}</li>
 *   <li>{@link com.misc.common.moplaf.datatools.impl.ColumnizerColumnAttributeImpl#getAttribute <em>Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ColumnizerColumnAttributeImpl extends NavigationPathImpl implements ColumnizerColumnAttribute {
	/**
	 * The default value of the '{@link #getColumnName() <em>Column Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnName()
	 * @generated
	 * @ordered
	 */
	protected static final String COLUMN_NAME_EDEFAULT = null;

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
	 * The default value of the '{@link #getColumnWidth() <em>Column Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnWidth()
	 * @generated
	 * @ordered
	 */
	protected static final int COLUMN_WIDTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getColumnWidth() <em>Column Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnWidth()
	 * @generated
	 * @ordered
	 */
	protected int columnWidth = COLUMN_WIDTH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAttribute() <em>Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttribute()
	 * @generated
	 * @ordered
	 */
	protected EAttribute attribute;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ColumnizerColumnAttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatatoolsPackage.Literals.COLUMNIZER_COLUMN_ATTRIBUTE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DatatoolsPackage.COLUMNIZER_COLUMN_ATTRIBUTE__COLUMN_NAME, oldColumnName, columnName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getColumnWidth() {
		return columnWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumnWidth(int newColumnWidth) {
		int oldColumnWidth = columnWidth;
		columnWidth = newColumnWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatoolsPackage.COLUMNIZER_COLUMN_ATTRIBUTE__COLUMN_WIDTH, oldColumnWidth, columnWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Columnizer getColumnizer() {
		if (eContainerFeatureID() != DatatoolsPackage.COLUMNIZER_COLUMN_ATTRIBUTE__COLUMNIZER) return null;
		return (Columnizer)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetColumnizer(Columnizer newColumnizer, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newColumnizer, DatatoolsPackage.COLUMNIZER_COLUMN_ATTRIBUTE__COLUMNIZER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumnizer(Columnizer newColumnizer) {
		if (newColumnizer != eInternalContainer() || (eContainerFeatureID() != DatatoolsPackage.COLUMNIZER_COLUMN_ATTRIBUTE__COLUMNIZER && newColumnizer != null)) {
			if (EcoreUtil.isAncestor(this, newColumnizer))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newColumnizer != null)
				msgs = ((InternalEObject)newColumnizer).eInverseAdd(this, DatatoolsPackage.COLUMNIZER__COLUMNS, Columnizer.class, msgs);
			msgs = basicSetColumnizer(newColumnizer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatoolsPackage.COLUMNIZER_COLUMN_ATTRIBUTE__COLUMNIZER, newColumnizer, newColumnizer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public DataToolContext basicGetContext() {
		return this.getColumnizer().getContext();
	}

	@Override
	protected void collectParamsDescription(List<String> params) {
		params.add(String.format("path: %s", this.getPath()));
	}

	@Override
	protected String getTypeDescription() {
		EAttribute attribute = this.getAttribute();
		return String.format("Attribute %s", attribute==null ? "null" : attribute.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public EClass basicGetSourceType() {
		return this.getColumnizer().getColumnizedType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public EClass basicGetTargetType() {
		return Util.NavigationPathGetTargetType(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public boolean isMany() {
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public String getPath() {
		return Util.getNavigationPath(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute() {
		if (attribute != null && attribute.eIsProxy()) {
			InternalEObject oldAttribute = (InternalEObject)attribute;
			attribute = (EAttribute)eResolveProxy(oldAttribute);
			if (attribute != oldAttribute) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DatatoolsPackage.COLUMNIZER_COLUMN_ATTRIBUTE__ATTRIBUTE, oldAttribute, attribute));
			}
		}
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute basicGetAttribute() {
		return attribute;
	}
	
	
	/**
	 * Specified by ColumnizerColumn
	 */
	@Override
	public Object getValue(EObject object) {
		EObject target_object = Util.navigate(this, object);
		if ( target_object==null ) {
			return null;
		}
		EAttribute attribute = this.getAttribute();
		if ( attribute == null ) {
			return null;
		}
		return target_object.eGet(attribute);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public EDataType getDataType() {
		EAttribute attribute = this.getAttribute();
		if ( attribute==null ) {
			return null;
		}
		return attribute.getEAttributeType();
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttribute(EAttribute newAttribute) {
		EAttribute oldAttribute = attribute;
		attribute = newAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatoolsPackage.COLUMNIZER_COLUMN_ATTRIBUTE__ATTRIBUTE, oldAttribute, attribute));
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
			case DatatoolsPackage.COLUMNIZER_COLUMN_ATTRIBUTE__COLUMNIZER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetColumnizer((Columnizer)otherEnd, msgs);
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
			case DatatoolsPackage.COLUMNIZER_COLUMN_ATTRIBUTE__COLUMNIZER:
				return basicSetColumnizer(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case DatatoolsPackage.COLUMNIZER_COLUMN_ATTRIBUTE__COLUMNIZER:
				return eInternalContainer().eInverseRemove(this, DatatoolsPackage.COLUMNIZER__COLUMNS, Columnizer.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DatatoolsPackage.COLUMNIZER_COLUMN_ATTRIBUTE__COLUMN_NAME:
				return getColumnName();
			case DatatoolsPackage.COLUMNIZER_COLUMN_ATTRIBUTE__COLUMN_WIDTH:
				return getColumnWidth();
			case DatatoolsPackage.COLUMNIZER_COLUMN_ATTRIBUTE__COLUMNIZER:
				return getColumnizer();
			case DatatoolsPackage.COLUMNIZER_COLUMN_ATTRIBUTE__ATTRIBUTE:
				if (resolve) return getAttribute();
				return basicGetAttribute();
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
			case DatatoolsPackage.COLUMNIZER_COLUMN_ATTRIBUTE__COLUMN_NAME:
				setColumnName((String)newValue);
				return;
			case DatatoolsPackage.COLUMNIZER_COLUMN_ATTRIBUTE__COLUMN_WIDTH:
				setColumnWidth((Integer)newValue);
				return;
			case DatatoolsPackage.COLUMNIZER_COLUMN_ATTRIBUTE__COLUMNIZER:
				setColumnizer((Columnizer)newValue);
				return;
			case DatatoolsPackage.COLUMNIZER_COLUMN_ATTRIBUTE__ATTRIBUTE:
				setAttribute((EAttribute)newValue);
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
			case DatatoolsPackage.COLUMNIZER_COLUMN_ATTRIBUTE__COLUMN_NAME:
				setColumnName(COLUMN_NAME_EDEFAULT);
				return;
			case DatatoolsPackage.COLUMNIZER_COLUMN_ATTRIBUTE__COLUMN_WIDTH:
				setColumnWidth(COLUMN_WIDTH_EDEFAULT);
				return;
			case DatatoolsPackage.COLUMNIZER_COLUMN_ATTRIBUTE__COLUMNIZER:
				setColumnizer((Columnizer)null);
				return;
			case DatatoolsPackage.COLUMNIZER_COLUMN_ATTRIBUTE__ATTRIBUTE:
				setAttribute((EAttribute)null);
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
			case DatatoolsPackage.COLUMNIZER_COLUMN_ATTRIBUTE__COLUMN_NAME:
				return COLUMN_NAME_EDEFAULT == null ? columnName != null : !COLUMN_NAME_EDEFAULT.equals(columnName);
			case DatatoolsPackage.COLUMNIZER_COLUMN_ATTRIBUTE__COLUMN_WIDTH:
				return columnWidth != COLUMN_WIDTH_EDEFAULT;
			case DatatoolsPackage.COLUMNIZER_COLUMN_ATTRIBUTE__COLUMNIZER:
				return getColumnizer() != null;
			case DatatoolsPackage.COLUMNIZER_COLUMN_ATTRIBUTE__ATTRIBUTE:
				return attribute != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == ColumnizerColumn.class) {
			switch (derivedFeatureID) {
				case DatatoolsPackage.COLUMNIZER_COLUMN_ATTRIBUTE__COLUMN_NAME: return DatatoolsPackage.COLUMNIZER_COLUMN__COLUMN_NAME;
				case DatatoolsPackage.COLUMNIZER_COLUMN_ATTRIBUTE__COLUMN_WIDTH: return DatatoolsPackage.COLUMNIZER_COLUMN__COLUMN_WIDTH;
				case DatatoolsPackage.COLUMNIZER_COLUMN_ATTRIBUTE__COLUMNIZER: return DatatoolsPackage.COLUMNIZER_COLUMN__COLUMNIZER;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == ColumnizerColumn.class) {
			switch (baseFeatureID) {
				case DatatoolsPackage.COLUMNIZER_COLUMN__COLUMN_NAME: return DatatoolsPackage.COLUMNIZER_COLUMN_ATTRIBUTE__COLUMN_NAME;
				case DatatoolsPackage.COLUMNIZER_COLUMN__COLUMN_WIDTH: return DatatoolsPackage.COLUMNIZER_COLUMN_ATTRIBUTE__COLUMN_WIDTH;
				case DatatoolsPackage.COLUMNIZER_COLUMN__COLUMNIZER: return DatatoolsPackage.COLUMNIZER_COLUMN_ATTRIBUTE__COLUMNIZER;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == ColumnizerColumn.class) {
			switch (baseOperationID) {
				case DatatoolsPackage.COLUMNIZER_COLUMN___GET_VALUE__EOBJECT: return DatatoolsPackage.COLUMNIZER_COLUMN_ATTRIBUTE___GET_VALUE__EOBJECT;
				case DatatoolsPackage.COLUMNIZER_COLUMN___GET_DATA_TYPE: return DatatoolsPackage.COLUMNIZER_COLUMN_ATTRIBUTE___GET_DATA_TYPE;
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case DatatoolsPackage.COLUMNIZER_COLUMN_ATTRIBUTE___GET_VALUE__EOBJECT:
				return getValue((EObject)arguments.get(0));
			case DatatoolsPackage.COLUMNIZER_COLUMN_ATTRIBUTE___GET_DATA_TYPE:
				return getDataType();
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
		result.append(" (ColumnName: ");
		result.append(columnName);
		result.append(", ColumnWidth: ");
		result.append(columnWidth);
		result.append(')');
		return result.toString();
	}

} //ColumnizerColumnAttributeImpl
