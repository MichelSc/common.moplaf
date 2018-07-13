/**
 */
package com.misc.common.moplaf.datatools.impl;

import com.misc.common.moplaf.datatools.Category;
import com.misc.common.moplaf.datatools.CategoryCriteria;
import com.misc.common.moplaf.datatools.DatatoolsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Category</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.datatools.impl.CategoryImpl#getCriteria <em>Criteria</em>}</li>
 *   <li>{@link com.misc.common.moplaf.datatools.impl.CategoryImpl#getCategoryValue <em>Category Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CategoryImpl extends CategoryAbstractImpl implements Category {
	/**
	 * The cached value of the '{@link #getCriteria() <em>Criteria</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCriteria()
	 * @generated
	 * @ordered
	 */
	protected CategoryCriteria criteria;

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
	public CategoryCriteria getCriteria() {
		if (criteria != null && criteria.eIsProxy()) {
			InternalEObject oldCriteria = (InternalEObject)criteria;
			criteria = (CategoryCriteria)eResolveProxy(oldCriteria);
			if (criteria != oldCriteria) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DatatoolsPackage.CATEGORY__CRITERIA, oldCriteria, criteria));
			}
		}
		return criteria;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CategoryCriteria basicGetCriteria() {
		return criteria;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCriteria(CategoryCriteria newCriteria) {
		CategoryCriteria oldCriteria = criteria;
		criteria = newCriteria;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatoolsPackage.CATEGORY__CRITERIA, oldCriteria, criteria));
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
			case DatatoolsPackage.CATEGORY__CRITERIA:
				if (resolve) return getCriteria();
				return basicGetCriteria();
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
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DatatoolsPackage.CATEGORY__CRITERIA:
				setCriteria((CategoryCriteria)newValue);
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
			case DatatoolsPackage.CATEGORY__CRITERIA:
				setCriteria((CategoryCriteria)null);
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
			case DatatoolsPackage.CATEGORY__CRITERIA:
				return criteria != null;
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
		result.append(" (CategoryValue: ");
		result.append(categoryValue);
		result.append(')');
		return result.toString();
	}

} //CategoryImpl
