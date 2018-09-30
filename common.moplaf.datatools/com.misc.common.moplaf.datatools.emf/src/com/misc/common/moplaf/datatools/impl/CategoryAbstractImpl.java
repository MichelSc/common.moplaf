/**
 */
package com.misc.common.moplaf.datatools.impl;

import com.misc.common.moplaf.common.IPropertiesProvider;
import com.misc.common.moplaf.datatools.Category;
import com.misc.common.moplaf.datatools.CategoryAbstract;
import com.misc.common.moplaf.datatools.Columnizers;
import com.misc.common.moplaf.datatools.DatatoolsPackage;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Category Abstract</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.datatools.impl.CategoryAbstractImpl#getNbElements <em>Nb Elements</em>}</li>
 *   <li>{@link com.misc.common.moplaf.datatools.impl.CategoryAbstractImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link com.misc.common.moplaf.datatools.impl.CategoryAbstractImpl#getSubCategories <em>Sub Categories</em>}</li>
 *   <li>{@link com.misc.common.moplaf.datatools.impl.CategoryAbstractImpl#getColumnizerSet <em>Columnizer Set</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CategoryAbstractImpl extends MinimalEObjectImpl.Container implements CategoryAbstract {
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
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected EList<EObject> elements;

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
	protected CategoryAbstractImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatatoolsPackage.Literals.CATEGORY_ABSTRACT;
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
	public EList<EObject> getElements() {
		if (elements == null) {
			elements = new EObjectResolvingEList<EObject>(EObject.class, this, DatatoolsPackage.CATEGORY_ABSTRACT__ELEMENTS);
		}
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Category> getSubCategories() {
		if (subCategories == null) {
			subCategories = new EObjectContainmentEList<Category>(Category.class, this, DatatoolsPackage.CATEGORY_ABSTRACT__SUB_CATEGORIES);
		}
		return subCategories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Columnizers getColumnizerSet() {
		Columnizers columnizerSet = basicGetColumnizerSet();
		return columnizerSet != null && columnizerSet.eIsProxy() ? (Columnizers)eResolveProxy((InternalEObject)columnizerSet) : columnizerSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Columnizers basicGetColumnizerSet() {
		EObject container = this.eContainer();
		if ( container instanceof CategoryAbstract ) {
			CategoryAbstract parentCategory = (CategoryAbstract)container;
			return parentCategory.getColumnizerSet();
		}
		throw new UnsupportedOperationException();
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
	public Object getPropertyAggregation(IPropertiesProvider provider, Object property) {
		return provider.getAggregationValue(this.getElements(), property);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DatatoolsPackage.CATEGORY_ABSTRACT__SUB_CATEGORIES:
				return ((InternalEList<?>)getSubCategories()).basicRemove(otherEnd, msgs);
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
			case DatatoolsPackage.CATEGORY_ABSTRACT__NB_ELEMENTS:
				return getNbElements();
			case DatatoolsPackage.CATEGORY_ABSTRACT__ELEMENTS:
				return getElements();
			case DatatoolsPackage.CATEGORY_ABSTRACT__SUB_CATEGORIES:
				return getSubCategories();
			case DatatoolsPackage.CATEGORY_ABSTRACT__COLUMNIZER_SET:
				if (resolve) return getColumnizerSet();
				return basicGetColumnizerSet();
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
			case DatatoolsPackage.CATEGORY_ABSTRACT__ELEMENTS:
				getElements().clear();
				getElements().addAll((Collection<? extends EObject>)newValue);
				return;
			case DatatoolsPackage.CATEGORY_ABSTRACT__SUB_CATEGORIES:
				getSubCategories().clear();
				getSubCategories().addAll((Collection<? extends Category>)newValue);
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
			case DatatoolsPackage.CATEGORY_ABSTRACT__ELEMENTS:
				getElements().clear();
				return;
			case DatatoolsPackage.CATEGORY_ABSTRACT__SUB_CATEGORIES:
				getSubCategories().clear();
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
			case DatatoolsPackage.CATEGORY_ABSTRACT__NB_ELEMENTS:
				return getNbElements() != NB_ELEMENTS_EDEFAULT;
			case DatatoolsPackage.CATEGORY_ABSTRACT__ELEMENTS:
				return elements != null && !elements.isEmpty();
			case DatatoolsPackage.CATEGORY_ABSTRACT__SUB_CATEGORIES:
				return subCategories != null && !subCategories.isEmpty();
			case DatatoolsPackage.CATEGORY_ABSTRACT__COLUMNIZER_SET:
				return basicGetColumnizerSet() != null;
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
			case DatatoolsPackage.CATEGORY_ABSTRACT___GET_SUBCATEGORY__EOBJECT:
				return getSubcategory((EObject)arguments.get(0));
			case DatatoolsPackage.CATEGORY_ABSTRACT___GET_PROPERTY_AGGREGATION__IPROPERTIESPROVIDER_OBJECT:
				return getPropertyAggregation((IPropertiesProvider)arguments.get(0), arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //CategoryAbstractImpl
