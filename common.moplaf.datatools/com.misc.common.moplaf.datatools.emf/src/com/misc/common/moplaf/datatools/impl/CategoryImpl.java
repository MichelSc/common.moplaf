/**
 */
package com.misc.common.moplaf.datatools.impl;

import com.misc.common.moplaf.datatools.Category;
import com.misc.common.moplaf.datatools.DatatoolsPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Category</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.datatools.impl.CategoryImpl#getCategoryLabel <em>Category Label</em>}</li>
 *   <li>{@link com.misc.common.moplaf.datatools.impl.CategoryImpl#getCategoryValue <em>Category Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CategoryImpl extends CategoryAbstractImpl implements Category {
	/**
	 * The default value of the '{@link #getCategoryLabel() <em>Category Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategoryLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String CATEGORY_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCategoryLabel() <em>Category Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategoryLabel()
	 * @generated
	 * @ordered
	 */
	protected String categoryLabel = CATEGORY_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getCategoryValue() <em>Category Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategoryValue()
	 * @generated
	 * @ordered
	 */
	protected static final Object CATEGORY_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCategoryValue() <em>Category Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategoryValue()
	 * @generated
	 * @ordered
	 */
	protected Object categoryValue = CATEGORY_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CategoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatatoolsPackage.Literals.CATEGORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCategoryLabel() {
		return categoryLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategoryLabel(String newCategoryLabel) {
		String oldCategoryLabel = categoryLabel;
		categoryLabel = newCategoryLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatoolsPackage.CATEGORY__CATEGORY_LABEL, oldCategoryLabel, categoryLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getCategoryValue() {
		return categoryValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategoryValue(Object newCategoryValue) {
		Object oldCategoryValue = categoryValue;
		categoryValue = newCategoryValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatoolsPackage.CATEGORY__CATEGORY_VALUE, oldCategoryValue, categoryValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DatatoolsPackage.CATEGORY__CATEGORY_LABEL:
				return getCategoryLabel();
			case DatatoolsPackage.CATEGORY__CATEGORY_VALUE:
				return getCategoryValue();
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
			case DatatoolsPackage.CATEGORY__CATEGORY_LABEL:
				setCategoryLabel((String)newValue);
				return;
			case DatatoolsPackage.CATEGORY__CATEGORY_VALUE:
				setCategoryValue(newValue);
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
			case DatatoolsPackage.CATEGORY__CATEGORY_LABEL:
				setCategoryLabel(CATEGORY_LABEL_EDEFAULT);
				return;
			case DatatoolsPackage.CATEGORY__CATEGORY_VALUE:
				setCategoryValue(CATEGORY_VALUE_EDEFAULT);
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
			case DatatoolsPackage.CATEGORY__CATEGORY_LABEL:
				return CATEGORY_LABEL_EDEFAULT == null ? categoryLabel != null : !CATEGORY_LABEL_EDEFAULT.equals(categoryLabel);
			case DatatoolsPackage.CATEGORY__CATEGORY_VALUE:
				return CATEGORY_VALUE_EDEFAULT == null ? categoryValue != null : !CATEGORY_VALUE_EDEFAULT.equals(categoryValue);
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
		result.append(" (CategoryLabel: ");
		result.append(categoryLabel);
		result.append(", CategoryValue: ");
		result.append(categoryValue);
		result.append(')');
		return result.toString();
	}

} //CategoryImpl
