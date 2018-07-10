/**
 */
package com.misc.common.moplaf.analysis.impl;

import com.misc.common.moplaf.analysis.AnalysisPackage;
import com.misc.common.moplaf.analysis.DocAnalysis;

import com.misc.common.moplaf.datatools.Categorizer;
import com.misc.common.moplaf.datatools.Category;
import com.misc.common.moplaf.datatools.CategoryAbstract;
import com.misc.common.moplaf.datatools.CategoryCriteria;
import com.misc.common.moplaf.datatools.Columnizer;
import com.misc.common.moplaf.datatools.DatatoolsPackage;
import com.misc.common.moplaf.datatools.Extractor;

import com.misc.common.moplaf.job.impl.DocRefImpl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Doc Analysis</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.analysis.impl.DocAnalysisImpl#getSubCategories <em>Sub Categories</em>}</li>
 *   <li>{@link com.misc.common.moplaf.analysis.impl.DocAnalysisImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link com.misc.common.moplaf.analysis.impl.DocAnalysisImpl#getNbElements <em>Nb Elements</em>}</li>
 *   <li>{@link com.misc.common.moplaf.analysis.impl.DocAnalysisImpl#getCategoryLabel <em>Category Label</em>}</li>
 *   <li>{@link com.misc.common.moplaf.analysis.impl.DocAnalysisImpl#getCategoryColumnizer <em>Category Columnizer</em>}</li>
 *   <li>{@link com.misc.common.moplaf.analysis.impl.DocAnalysisImpl#getCriteria <em>Criteria</em>}</li>
 *   <li>{@link com.misc.common.moplaf.analysis.impl.DocAnalysisImpl#getExtractor <em>Extractor</em>}</li>
 *   <li>{@link com.misc.common.moplaf.analysis.impl.DocAnalysisImpl#getColumnizer <em>Columnizer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DocAnalysisImpl extends DocRefImpl implements DocAnalysis {
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
	 * The cached value of the '{@link #getCategoryColumnizer() <em>Category Columnizer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategoryColumnizer()
	 * @generated
	 * @ordered
	 */
	protected Columnizer categoryColumnizer;

	/**
	 * The cached value of the '{@link #getCriteria() <em>Criteria</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCriteria()
	 * @generated
	 * @ordered
	 */
	protected EList<CategoryCriteria> criteria;

	/**
	 * The cached value of the '{@link #getExtractor() <em>Extractor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtractor()
	 * @generated
	 * @ordered
	 */
	protected Extractor extractor;

	/**
	 * The cached value of the '{@link #getColumnizer() <em>Columnizer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnizer()
	 * @generated
	 * @ordered
	 */
	protected Columnizer columnizer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocAnalysisImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AnalysisPackage.Literals.DOC_ANALYSIS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Category> getSubCategories() {
		if (subCategories == null) {
			subCategories = new EObjectContainmentEList<Category>(Category.class, this, AnalysisPackage.DOC_ANALYSIS__SUB_CATEGORIES);
		}
		return subCategories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getElements() {
		if (elements == null) {
			elements = new EObjectResolvingEList<EObject>(EObject.class, this, AnalysisPackage.DOC_ANALYSIS__ELEMENTS);
		}
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNbElements() {
		// TODO: implement this method to return the 'Nb Elements' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
	public Columnizer getCategoryColumnizer() {
		if (categoryColumnizer != null && categoryColumnizer.eIsProxy()) {
			InternalEObject oldCategoryColumnizer = (InternalEObject)categoryColumnizer;
			categoryColumnizer = (Columnizer)eResolveProxy(oldCategoryColumnizer);
			if (categoryColumnizer != oldCategoryColumnizer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AnalysisPackage.DOC_ANALYSIS__CATEGORY_COLUMNIZER, oldCategoryColumnizer, categoryColumnizer));
			}
		}
		return categoryColumnizer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Columnizer basicGetCategoryColumnizer() {
		return categoryColumnizer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategoryColumnizer(Columnizer newCategoryColumnizer) {
		Columnizer oldCategoryColumnizer = categoryColumnizer;
		categoryColumnizer = newCategoryColumnizer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysisPackage.DOC_ANALYSIS__CATEGORY_COLUMNIZER, oldCategoryColumnizer, categoryColumnizer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CategoryCriteria> getCriteria() {
		if (criteria == null) {
			criteria = new EObjectResolvingEList<CategoryCriteria>(CategoryCriteria.class, this, AnalysisPackage.DOC_ANALYSIS__CRITERIA);
		}
		return criteria;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Extractor getExtractor() {
		if (extractor != null && extractor.eIsProxy()) {
			InternalEObject oldExtractor = (InternalEObject)extractor;
			extractor = (Extractor)eResolveProxy(oldExtractor);
			if (extractor != oldExtractor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AnalysisPackage.DOC_ANALYSIS__EXTRACTOR, oldExtractor, extractor));
			}
		}
		return extractor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Extractor basicGetExtractor() {
		return extractor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtractor(Extractor newExtractor) {
		Extractor oldExtractor = extractor;
		extractor = newExtractor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysisPackage.DOC_ANALYSIS__EXTRACTOR, oldExtractor, extractor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Columnizer getColumnizer() {
		if (columnizer != null && columnizer.eIsProxy()) {
			InternalEObject oldColumnizer = (InternalEObject)columnizer;
			columnizer = (Columnizer)eResolveProxy(oldColumnizer);
			if (columnizer != oldColumnizer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AnalysisPackage.DOC_ANALYSIS__COLUMNIZER, oldColumnizer, columnizer));
			}
		}
		return columnizer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Columnizer basicGetColumnizer() {
		return columnizer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumnizer(Columnizer newColumnizer) {
		Columnizer oldColumnizer = columnizer;
		columnizer = newColumnizer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysisPackage.DOC_ANALYSIS__COLUMNIZER, oldColumnizer, columnizer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void refresh() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isValidRoot(EObject doc) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> refreshCats(EList<EObject> ins) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void getSubcategory(EObject value) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AnalysisPackage.DOC_ANALYSIS__SUB_CATEGORIES:
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
			case AnalysisPackage.DOC_ANALYSIS__SUB_CATEGORIES:
				return getSubCategories();
			case AnalysisPackage.DOC_ANALYSIS__ELEMENTS:
				return getElements();
			case AnalysisPackage.DOC_ANALYSIS__NB_ELEMENTS:
				return getNbElements();
			case AnalysisPackage.DOC_ANALYSIS__CATEGORY_LABEL:
				return getCategoryLabel();
			case AnalysisPackage.DOC_ANALYSIS__CATEGORY_COLUMNIZER:
				if (resolve) return getCategoryColumnizer();
				return basicGetCategoryColumnizer();
			case AnalysisPackage.DOC_ANALYSIS__CRITERIA:
				return getCriteria();
			case AnalysisPackage.DOC_ANALYSIS__EXTRACTOR:
				if (resolve) return getExtractor();
				return basicGetExtractor();
			case AnalysisPackage.DOC_ANALYSIS__COLUMNIZER:
				if (resolve) return getColumnizer();
				return basicGetColumnizer();
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
			case AnalysisPackage.DOC_ANALYSIS__SUB_CATEGORIES:
				getSubCategories().clear();
				getSubCategories().addAll((Collection<? extends Category>)newValue);
				return;
			case AnalysisPackage.DOC_ANALYSIS__ELEMENTS:
				getElements().clear();
				getElements().addAll((Collection<? extends EObject>)newValue);
				return;
			case AnalysisPackage.DOC_ANALYSIS__CATEGORY_COLUMNIZER:
				setCategoryColumnizer((Columnizer)newValue);
				return;
			case AnalysisPackage.DOC_ANALYSIS__CRITERIA:
				getCriteria().clear();
				getCriteria().addAll((Collection<? extends CategoryCriteria>)newValue);
				return;
			case AnalysisPackage.DOC_ANALYSIS__EXTRACTOR:
				setExtractor((Extractor)newValue);
				return;
			case AnalysisPackage.DOC_ANALYSIS__COLUMNIZER:
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
			case AnalysisPackage.DOC_ANALYSIS__SUB_CATEGORIES:
				getSubCategories().clear();
				return;
			case AnalysisPackage.DOC_ANALYSIS__ELEMENTS:
				getElements().clear();
				return;
			case AnalysisPackage.DOC_ANALYSIS__CATEGORY_COLUMNIZER:
				setCategoryColumnizer((Columnizer)null);
				return;
			case AnalysisPackage.DOC_ANALYSIS__CRITERIA:
				getCriteria().clear();
				return;
			case AnalysisPackage.DOC_ANALYSIS__EXTRACTOR:
				setExtractor((Extractor)null);
				return;
			case AnalysisPackage.DOC_ANALYSIS__COLUMNIZER:
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
			case AnalysisPackage.DOC_ANALYSIS__SUB_CATEGORIES:
				return subCategories != null && !subCategories.isEmpty();
			case AnalysisPackage.DOC_ANALYSIS__ELEMENTS:
				return elements != null && !elements.isEmpty();
			case AnalysisPackage.DOC_ANALYSIS__NB_ELEMENTS:
				return getNbElements() != NB_ELEMENTS_EDEFAULT;
			case AnalysisPackage.DOC_ANALYSIS__CATEGORY_LABEL:
				return CATEGORY_LABEL_EDEFAULT == null ? categoryLabel != null : !CATEGORY_LABEL_EDEFAULT.equals(categoryLabel);
			case AnalysisPackage.DOC_ANALYSIS__CATEGORY_COLUMNIZER:
				return categoryColumnizer != null;
			case AnalysisPackage.DOC_ANALYSIS__CRITERIA:
				return criteria != null && !criteria.isEmpty();
			case AnalysisPackage.DOC_ANALYSIS__EXTRACTOR:
				return extractor != null;
			case AnalysisPackage.DOC_ANALYSIS__COLUMNIZER:
				return columnizer != null;
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
		if (baseClass == CategoryAbstract.class) {
			switch (derivedFeatureID) {
				case AnalysisPackage.DOC_ANALYSIS__SUB_CATEGORIES: return DatatoolsPackage.CATEGORY_ABSTRACT__SUB_CATEGORIES;
				case AnalysisPackage.DOC_ANALYSIS__ELEMENTS: return DatatoolsPackage.CATEGORY_ABSTRACT__ELEMENTS;
				case AnalysisPackage.DOC_ANALYSIS__NB_ELEMENTS: return DatatoolsPackage.CATEGORY_ABSTRACT__NB_ELEMENTS;
				case AnalysisPackage.DOC_ANALYSIS__CATEGORY_LABEL: return DatatoolsPackage.CATEGORY_ABSTRACT__CATEGORY_LABEL;
				case AnalysisPackage.DOC_ANALYSIS__CATEGORY_COLUMNIZER: return DatatoolsPackage.CATEGORY_ABSTRACT__CATEGORY_COLUMNIZER;
				default: return -1;
			}
		}
		if (baseClass == Categorizer.class) {
			switch (derivedFeatureID) {
				case AnalysisPackage.DOC_ANALYSIS__CRITERIA: return DatatoolsPackage.CATEGORIZER__CRITERIA;
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
		if (baseClass == CategoryAbstract.class) {
			switch (baseFeatureID) {
				case DatatoolsPackage.CATEGORY_ABSTRACT__SUB_CATEGORIES: return AnalysisPackage.DOC_ANALYSIS__SUB_CATEGORIES;
				case DatatoolsPackage.CATEGORY_ABSTRACT__ELEMENTS: return AnalysisPackage.DOC_ANALYSIS__ELEMENTS;
				case DatatoolsPackage.CATEGORY_ABSTRACT__NB_ELEMENTS: return AnalysisPackage.DOC_ANALYSIS__NB_ELEMENTS;
				case DatatoolsPackage.CATEGORY_ABSTRACT__CATEGORY_LABEL: return AnalysisPackage.DOC_ANALYSIS__CATEGORY_LABEL;
				case DatatoolsPackage.CATEGORY_ABSTRACT__CATEGORY_COLUMNIZER: return AnalysisPackage.DOC_ANALYSIS__CATEGORY_COLUMNIZER;
				default: return -1;
			}
		}
		if (baseClass == Categorizer.class) {
			switch (baseFeatureID) {
				case DatatoolsPackage.CATEGORIZER__CRITERIA: return AnalysisPackage.DOC_ANALYSIS__CRITERIA;
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
		if (baseClass == CategoryAbstract.class) {
			switch (baseOperationID) {
				case DatatoolsPackage.CATEGORY_ABSTRACT___GET_SUBCATEGORY__EOBJECT: return AnalysisPackage.DOC_ANALYSIS___GET_SUBCATEGORY__EOBJECT;
				default: return -1;
			}
		}
		if (baseClass == Categorizer.class) {
			switch (baseOperationID) {
				case DatatoolsPackage.CATEGORIZER___IS_VALID_ROOT__EOBJECT: return AnalysisPackage.DOC_ANALYSIS___IS_VALID_ROOT__EOBJECT;
				case DatatoolsPackage.CATEGORIZER___REFRESH_CATS__ELIST: return AnalysisPackage.DOC_ANALYSIS___REFRESH_CATS__ELIST;
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
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case AnalysisPackage.DOC_ANALYSIS___REFRESH:
				refresh();
				return null;
			case AnalysisPackage.DOC_ANALYSIS___IS_VALID_ROOT__EOBJECT:
				return isValidRoot((EObject)arguments.get(0));
			case AnalysisPackage.DOC_ANALYSIS___REFRESH_CATS__ELIST:
				return refreshCats((EList<EObject>)arguments.get(0));
			case AnalysisPackage.DOC_ANALYSIS___GET_SUBCATEGORY__EOBJECT:
				getSubcategory((EObject)arguments.get(0));
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
		result.append(')');
		return result.toString();
	}

} //DocAnalysisImpl
