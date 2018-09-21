/**
 */
package com.misc.common.moplaf.datatools.impl;

import com.misc.common.moplaf.datatools.Category;
import com.misc.common.moplaf.datatools.Columnizers;
import com.misc.common.moplaf.datatools.DatatoolsPackage;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Category</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.datatools.impl.CategoryImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link com.misc.common.moplaf.datatools.impl.CategoryImpl#getNbElements <em>Nb Elements</em>}</li>
 *   <li>{@link com.misc.common.moplaf.datatools.impl.CategoryImpl#getCategoryLabel <em>Category Label</em>}</li>
 *   <li>{@link com.misc.common.moplaf.datatools.impl.CategoryImpl#getColumnizers <em>Columnizers</em>}</li>
 *   <li>{@link com.misc.common.moplaf.datatools.impl.CategoryImpl#getCategoryValue <em>Category Value</em>}</li>
 *   <li>{@link com.misc.common.moplaf.datatools.impl.CategoryImpl#getSubCategories <em>Sub Categories</em>}</li>
 *   <li>{@link com.misc.common.moplaf.datatools.impl.CategoryImpl#getSuperCategory <em>Super Category</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CategoryImpl extends MinimalEObjectImpl.Container implements Category {
	/**
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected EList<EObject> elements;

	/**
	 * The default value of the '{@link #getNbElements() <em>Nb Elements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbElements()
	 * @generated
	 * @ordered
	 */
	protected static final int NB_ELEMENTS_EDEFAULT = 0;

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
	 * The cached value of the '{@link #getColumnizers() <em>Columnizers</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnizers()
	 * @generated
	 * @ordered
	 */
	protected Columnizers columnizers;

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
	 * The cached value of the '{@link #getSubCategories() <em>Sub Categories</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubCategories()
	 * @generated
	 * @ordered
	 */
	protected EList<Category> subCategories;

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
	public EList<EObject> getElements() {
		if (elements == null) {
			elements = new EObjectResolvingEList<EObject>(EObject.class, this, DatatoolsPackage.CATEGORY__ELEMENTS);
		}
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public int getNbElements() {
		return this.getElements().size();
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
	public Columnizers getColumnizers() {
		if (columnizers != null && columnizers.eIsProxy()) {
			InternalEObject oldColumnizers = (InternalEObject)columnizers;
			columnizers = (Columnizers)eResolveProxy(oldColumnizers);
			if (columnizers != oldColumnizers) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DatatoolsPackage.CATEGORY__COLUMNIZERS, oldColumnizers, columnizers));
			}
		}
		return columnizers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Columnizers basicGetColumnizers() {
		return columnizers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumnizers(Columnizers newColumnizers) {
		Columnizers oldColumnizers = columnizers;
		columnizers = newColumnizers;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatoolsPackage.CATEGORY__COLUMNIZERS, oldColumnizers, columnizers));
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
	public EList<Category> getSubCategories() {
		if (subCategories == null) {
			subCategories = new EObjectContainmentWithInverseEList<Category>(Category.class, this, DatatoolsPackage.CATEGORY__SUB_CATEGORIES, DatatoolsPackage.CATEGORY__SUPER_CATEGORY);
		}
		return subCategories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Category getSuperCategory() {
		if (eContainerFeatureID() != DatatoolsPackage.CATEGORY__SUPER_CATEGORY) return null;
		return (Category)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSuperCategory(Category newSuperCategory, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSuperCategory, DatatoolsPackage.CATEGORY__SUPER_CATEGORY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuperCategory(Category newSuperCategory) {
		if (newSuperCategory != eInternalContainer() || (eContainerFeatureID() != DatatoolsPackage.CATEGORY__SUPER_CATEGORY && newSuperCategory != null)) {
			if (EcoreUtil.isAncestor(this, newSuperCategory))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSuperCategory != null)
				msgs = ((InternalEObject)newSuperCategory).eInverseAdd(this, DatatoolsPackage.CATEGORY__SUB_CATEGORIES, Category.class, msgs);
			msgs = basicSetSuperCategory(newSuperCategory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatoolsPackage.CATEGORY__SUPER_CATEGORY, newSuperCategory, newSuperCategory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Category getSubcategory(EObject value) {
		return this.getSubCategories().stream().filter(c -> c.getCategoryValue().equals(value)).findAny().orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void setColumnizerAll(Columnizers columnizers) {
		this.setColumnizers(columnizers);
		for ( Category subcategory : this.getSubCategories()) {
			subcategory.setColumnizerAll(columnizers);
		}
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
			case DatatoolsPackage.CATEGORY__SUB_CATEGORIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubCategories()).basicAdd(otherEnd, msgs);
			case DatatoolsPackage.CATEGORY__SUPER_CATEGORY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSuperCategory((Category)otherEnd, msgs);
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
			case DatatoolsPackage.CATEGORY__SUB_CATEGORIES:
				return ((InternalEList<?>)getSubCategories()).basicRemove(otherEnd, msgs);
			case DatatoolsPackage.CATEGORY__SUPER_CATEGORY:
				return basicSetSuperCategory(null, msgs);
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
			case DatatoolsPackage.CATEGORY__SUPER_CATEGORY:
				return eInternalContainer().eInverseRemove(this, DatatoolsPackage.CATEGORY__SUB_CATEGORIES, Category.class, msgs);
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
			case DatatoolsPackage.CATEGORY__ELEMENTS:
				return getElements();
			case DatatoolsPackage.CATEGORY__NB_ELEMENTS:
				return getNbElements();
			case DatatoolsPackage.CATEGORY__CATEGORY_LABEL:
				return getCategoryLabel();
			case DatatoolsPackage.CATEGORY__COLUMNIZERS:
				if (resolve) return getColumnizers();
				return basicGetColumnizers();
			case DatatoolsPackage.CATEGORY__CATEGORY_VALUE:
				return getCategoryValue();
			case DatatoolsPackage.CATEGORY__SUB_CATEGORIES:
				return getSubCategories();
			case DatatoolsPackage.CATEGORY__SUPER_CATEGORY:
				return getSuperCategory();
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
			case DatatoolsPackage.CATEGORY__ELEMENTS:
				getElements().clear();
				getElements().addAll((Collection<? extends EObject>)newValue);
				return;
			case DatatoolsPackage.CATEGORY__CATEGORY_LABEL:
				setCategoryLabel((String)newValue);
				return;
			case DatatoolsPackage.CATEGORY__COLUMNIZERS:
				setColumnizers((Columnizers)newValue);
				return;
			case DatatoolsPackage.CATEGORY__CATEGORY_VALUE:
				setCategoryValue(newValue);
				return;
			case DatatoolsPackage.CATEGORY__SUB_CATEGORIES:
				getSubCategories().clear();
				getSubCategories().addAll((Collection<? extends Category>)newValue);
				return;
			case DatatoolsPackage.CATEGORY__SUPER_CATEGORY:
				setSuperCategory((Category)newValue);
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
			case DatatoolsPackage.CATEGORY__ELEMENTS:
				getElements().clear();
				return;
			case DatatoolsPackage.CATEGORY__CATEGORY_LABEL:
				setCategoryLabel(CATEGORY_LABEL_EDEFAULT);
				return;
			case DatatoolsPackage.CATEGORY__COLUMNIZERS:
				setColumnizers((Columnizers)null);
				return;
			case DatatoolsPackage.CATEGORY__CATEGORY_VALUE:
				setCategoryValue(CATEGORY_VALUE_EDEFAULT);
				return;
			case DatatoolsPackage.CATEGORY__SUB_CATEGORIES:
				getSubCategories().clear();
				return;
			case DatatoolsPackage.CATEGORY__SUPER_CATEGORY:
				setSuperCategory((Category)null);
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
			case DatatoolsPackage.CATEGORY__ELEMENTS:
				return elements != null && !elements.isEmpty();
			case DatatoolsPackage.CATEGORY__NB_ELEMENTS:
				return getNbElements() != NB_ELEMENTS_EDEFAULT;
			case DatatoolsPackage.CATEGORY__CATEGORY_LABEL:
				return CATEGORY_LABEL_EDEFAULT == null ? categoryLabel != null : !CATEGORY_LABEL_EDEFAULT.equals(categoryLabel);
			case DatatoolsPackage.CATEGORY__COLUMNIZERS:
				return columnizers != null;
			case DatatoolsPackage.CATEGORY__CATEGORY_VALUE:
				return CATEGORY_VALUE_EDEFAULT == null ? categoryValue != null : !CATEGORY_VALUE_EDEFAULT.equals(categoryValue);
			case DatatoolsPackage.CATEGORY__SUB_CATEGORIES:
				return subCategories != null && !subCategories.isEmpty();
			case DatatoolsPackage.CATEGORY__SUPER_CATEGORY:
				return getSuperCategory() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case DatatoolsPackage.CATEGORY___GET_SUBCATEGORY__EOBJECT:
				return getSubcategory((EObject)arguments.get(0));
			case DatatoolsPackage.CATEGORY___SET_COLUMNIZER_ALL__COLUMNIZERS:
				setColumnizerAll((Columnizers)arguments.get(0));
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
		result.append(" (CategoryLabel: ");
		result.append(categoryLabel);
		result.append(", CategoryValue: ");
		result.append(categoryValue);
		result.append(')');
		return result.toString();
	}

} //CategoryImpl
