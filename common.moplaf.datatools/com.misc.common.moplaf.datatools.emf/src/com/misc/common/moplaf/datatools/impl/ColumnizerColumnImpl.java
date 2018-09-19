/**
 */
package com.misc.common.moplaf.datatools.impl;

import com.misc.common.moplaf.datatools.Columnizer;
import com.misc.common.moplaf.datatools.ColumnizerColumn;
import com.misc.common.moplaf.datatools.DatatoolsPackage;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Columnizer Column</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.datatools.impl.ColumnizerColumnImpl#getColumnName <em>Column Name</em>}</li>
 *   <li>{@link com.misc.common.moplaf.datatools.impl.ColumnizerColumnImpl#getColumnWidth <em>Column Width</em>}</li>
 *   <li>{@link com.misc.common.moplaf.datatools.impl.ColumnizerColumnImpl#getColumnizer <em>Columnizer</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ColumnizerColumnImpl extends MinimalEObjectImpl.Container implements ColumnizerColumn {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ColumnizerColumnImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatatoolsPackage.Literals.COLUMNIZER_COLUMN;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DatatoolsPackage.COLUMNIZER_COLUMN__COLUMN_NAME, oldColumnName, columnName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DatatoolsPackage.COLUMNIZER_COLUMN__COLUMN_WIDTH, oldColumnWidth, columnWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Columnizer getColumnizer() {
		if (eContainerFeatureID() != DatatoolsPackage.COLUMNIZER_COLUMN__COLUMNIZER) return null;
		return (Columnizer)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetColumnizer(Columnizer newColumnizer, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newColumnizer, DatatoolsPackage.COLUMNIZER_COLUMN__COLUMNIZER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumnizer(Columnizer newColumnizer) {
		if (newColumnizer != eInternalContainer() || (eContainerFeatureID() != DatatoolsPackage.COLUMNIZER_COLUMN__COLUMNIZER && newColumnizer != null)) {
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
			eNotify(new ENotificationImpl(this, Notification.SET, DatatoolsPackage.COLUMNIZER_COLUMN__COLUMNIZER, newColumnizer, newColumnizer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getValue(EObject object) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDataType() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
			case DatatoolsPackage.COLUMNIZER_COLUMN__COLUMNIZER:
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
			case DatatoolsPackage.COLUMNIZER_COLUMN__COLUMNIZER:
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
			case DatatoolsPackage.COLUMNIZER_COLUMN__COLUMNIZER:
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
			case DatatoolsPackage.COLUMNIZER_COLUMN__COLUMN_NAME:
				return getColumnName();
			case DatatoolsPackage.COLUMNIZER_COLUMN__COLUMN_WIDTH:
				return getColumnWidth();
			case DatatoolsPackage.COLUMNIZER_COLUMN__COLUMNIZER:
				return getColumnizer();
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
			case DatatoolsPackage.COLUMNIZER_COLUMN__COLUMN_NAME:
				setColumnName((String)newValue);
				return;
			case DatatoolsPackage.COLUMNIZER_COLUMN__COLUMN_WIDTH:
				setColumnWidth((Integer)newValue);
				return;
			case DatatoolsPackage.COLUMNIZER_COLUMN__COLUMNIZER:
				setColumnizer((Columnizer)newValue);
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
			case DatatoolsPackage.COLUMNIZER_COLUMN__COLUMN_NAME:
				setColumnName(COLUMN_NAME_EDEFAULT);
				return;
			case DatatoolsPackage.COLUMNIZER_COLUMN__COLUMN_WIDTH:
				setColumnWidth(COLUMN_WIDTH_EDEFAULT);
				return;
			case DatatoolsPackage.COLUMNIZER_COLUMN__COLUMNIZER:
				setColumnizer((Columnizer)null);
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
			case DatatoolsPackage.COLUMNIZER_COLUMN__COLUMN_NAME:
				return COLUMN_NAME_EDEFAULT == null ? columnName != null : !COLUMN_NAME_EDEFAULT.equals(columnName);
			case DatatoolsPackage.COLUMNIZER_COLUMN__COLUMN_WIDTH:
				return columnWidth != COLUMN_WIDTH_EDEFAULT;
			case DatatoolsPackage.COLUMNIZER_COLUMN__COLUMNIZER:
				return getColumnizer() != null;
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
			case DatatoolsPackage.COLUMNIZER_COLUMN___GET_VALUE__EOBJECT:
				return getValue((EObject)arguments.get(0));
			case DatatoolsPackage.COLUMNIZER_COLUMN___GET_DATA_TYPE:
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

} //ColumnizerColumnImpl
