/**
 */
package com.misc.common.moplaf.datatools.impl;

import com.misc.common.moplaf.datatools.Categorizer;
import com.misc.common.moplaf.datatools.Category;
import com.misc.common.moplaf.datatools.CategoryAbstract;
import com.misc.common.moplaf.datatools.Columnizers;
import com.misc.common.moplaf.datatools.DatatoolsPackage;
import com.misc.common.moplaf.datatools.util.ObjectSet;
import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
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
 *   <li>{@link com.misc.common.moplaf.datatools.impl.CategoryAbstractImpl#getSubCategories <em>Sub Categories</em>}</li>
 *   <li>{@link com.misc.common.moplaf.datatools.impl.CategoryAbstractImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link com.misc.common.moplaf.datatools.impl.CategoryAbstractImpl#getNbElements <em>Nb Elements</em>}</li>
 *   <li>{@link com.misc.common.moplaf.datatools.impl.CategoryAbstractImpl#getCategoryLabel <em>Category Label</em>}</li>
 *   <li>{@link com.misc.common.moplaf.datatools.impl.CategoryAbstractImpl#getCategoryColumnizers <em>Category Columnizers</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CategoryAbstractImpl extends MinimalEObjectImpl.Container implements CategoryAbstract {
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
	 * The cached value of the '{@link #getCategoryColumnizers() <em>Category Columnizers</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategoryColumnizers()
	 * @generated
	 * @ordered
	 */
	protected Columnizers categoryColumnizers;

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
	public EList<EObject> getElements() {
		if (elements == null) {
			elements = new EObjectResolvingEList<EObject>(EObject.class, this, DatatoolsPackage.CATEGORY_ABSTRACT__ELEMENTS);
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
			eNotify(new ENotificationImpl(this, Notification.SET, DatatoolsPackage.CATEGORY_ABSTRACT__CATEGORY_LABEL, oldCategoryLabel, categoryLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Columnizers getCategoryColumnizers() {
		if (categoryColumnizers != null && categoryColumnizers.eIsProxy()) {
			InternalEObject oldCategoryColumnizers = (InternalEObject)categoryColumnizers;
			categoryColumnizers = (Columnizers)eResolveProxy(oldCategoryColumnizers);
			if (categoryColumnizers != oldCategoryColumnizers) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DatatoolsPackage.CATEGORY_ABSTRACT__CATEGORY_COLUMNIZERS, oldCategoryColumnizers, categoryColumnizers));
			}
		}
		return categoryColumnizers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Columnizers basicGetCategoryColumnizers() {
		return categoryColumnizers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategoryColumnizers(Columnizers newCategoryColumnizers) {
		Columnizers oldCategoryColumnizers = categoryColumnizers;
		categoryColumnizers = newCategoryColumnizers;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatoolsPackage.CATEGORY_ABSTRACT__CATEGORY_COLUMNIZERS, oldCategoryColumnizers, categoryColumnizers));
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
	public void refreshCats(ObjectSet tobes, EList<Categorizer> categorizers, int level) {
		// update the elements of this category
		Iterator<EObject> iterator_asis = this.getElements().iterator();
		while ( iterator_asis.hasNext()) {
			EObject asis = iterator_asis.next();
			if ( !tobes.remove(asis)) {
				// the asis is not tobe
				iterator_asis.remove();
			}
		}
		this.getElements().addAll(tobes);
		
		// update the subcategories
		if ( categorizers.size()<=level ) {
			// there are no deeper levels
			this.getSubCategories().clear();
		} else {
			// there are deeper levels than the current level
			Categorizer criteria = categorizers.get(level);
			HashMap<Object, ObjectSet> cats_tobe  = new HashMap<>();
			// collect the cats
			for ( EObject element : this.getElements()) {
				Object cat_value = criteria.getCategoryValue(element);
				if ( cat_value!=null ) {
					ObjectSet cat_set = cats_tobe.get(cat_value);
					if ( cat_set==null ) {
						cat_set = new ObjectSet();
						cats_tobe.put(cat_value, cat_set);
					}
					cat_set.add(element);
				}
			}
			// traverse the cats asis
			Iterator<Category> cat_iterator_asis = this.getSubCategories().iterator();
			while ( cat_iterator_asis.hasNext()){
				Category cat_asis = cat_iterator_asis.next();
				Object cat_value = cat_asis.getCategoryValue();
				ObjectSet cat_tobe = cats_tobe.remove(cat_value);
				if ( cat_tobe==null ) {
					// category no longer populated
					// delete
					cat_iterator_asis.remove();
				} else {
					// update
					cat_asis.refreshCats(cat_tobe, categorizers, level+1);
				}
			}
			for (  Entry<Object, ObjectSet> cat_tobe : cats_tobe.entrySet()) {
				// create the cat
				Category new_cat = criteria.constructCategory();
				new_cat.setCategoryValue(cat_tobe.getKey());
				new_cat.setCategoryLabel(criteria.getCategoryLabel(cat_tobe.getKey()));
				this.getSubCategories().add(new_cat); // owning
				// fill the cat
				new_cat.refreshCats(cat_tobe.getValue(), categorizers, level+1);
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void setColumnizerAll(Columnizers columnizers) {
		this.setCategoryColumnizers(columnizers);
		for ( Category subcategory : this.getSubCategories()) {
			subcategory.setColumnizerAll(columnizers);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void flush() {
		this.getElements().clear();
		this.getSubCategories().clear();
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
			case DatatoolsPackage.CATEGORY_ABSTRACT__SUB_CATEGORIES:
				return getSubCategories();
			case DatatoolsPackage.CATEGORY_ABSTRACT__ELEMENTS:
				return getElements();
			case DatatoolsPackage.CATEGORY_ABSTRACT__NB_ELEMENTS:
				return getNbElements();
			case DatatoolsPackage.CATEGORY_ABSTRACT__CATEGORY_LABEL:
				return getCategoryLabel();
			case DatatoolsPackage.CATEGORY_ABSTRACT__CATEGORY_COLUMNIZERS:
				if (resolve) return getCategoryColumnizers();
				return basicGetCategoryColumnizers();
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
			case DatatoolsPackage.CATEGORY_ABSTRACT__SUB_CATEGORIES:
				getSubCategories().clear();
				getSubCategories().addAll((Collection<? extends Category>)newValue);
				return;
			case DatatoolsPackage.CATEGORY_ABSTRACT__ELEMENTS:
				getElements().clear();
				getElements().addAll((Collection<? extends EObject>)newValue);
				return;
			case DatatoolsPackage.CATEGORY_ABSTRACT__CATEGORY_LABEL:
				setCategoryLabel((String)newValue);
				return;
			case DatatoolsPackage.CATEGORY_ABSTRACT__CATEGORY_COLUMNIZERS:
				setCategoryColumnizers((Columnizers)newValue);
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
			case DatatoolsPackage.CATEGORY_ABSTRACT__SUB_CATEGORIES:
				getSubCategories().clear();
				return;
			case DatatoolsPackage.CATEGORY_ABSTRACT__ELEMENTS:
				getElements().clear();
				return;
			case DatatoolsPackage.CATEGORY_ABSTRACT__CATEGORY_LABEL:
				setCategoryLabel(CATEGORY_LABEL_EDEFAULT);
				return;
			case DatatoolsPackage.CATEGORY_ABSTRACT__CATEGORY_COLUMNIZERS:
				setCategoryColumnizers((Columnizers)null);
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
			case DatatoolsPackage.CATEGORY_ABSTRACT__SUB_CATEGORIES:
				return subCategories != null && !subCategories.isEmpty();
			case DatatoolsPackage.CATEGORY_ABSTRACT__ELEMENTS:
				return elements != null && !elements.isEmpty();
			case DatatoolsPackage.CATEGORY_ABSTRACT__NB_ELEMENTS:
				return getNbElements() != NB_ELEMENTS_EDEFAULT;
			case DatatoolsPackage.CATEGORY_ABSTRACT__CATEGORY_LABEL:
				return CATEGORY_LABEL_EDEFAULT == null ? categoryLabel != null : !CATEGORY_LABEL_EDEFAULT.equals(categoryLabel);
			case DatatoolsPackage.CATEGORY_ABSTRACT__CATEGORY_COLUMNIZERS:
				return categoryColumnizers != null;
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
			case DatatoolsPackage.CATEGORY_ABSTRACT___GET_SUBCATEGORY__EOBJECT:
				return getSubcategory((EObject)arguments.get(0));
			case DatatoolsPackage.CATEGORY_ABSTRACT___REFRESH_CATS__OBJECTSET_ELIST_INT:
				refreshCats((ObjectSet)arguments.get(0), (EList<Categorizer>)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case DatatoolsPackage.CATEGORY_ABSTRACT___SET_COLUMNIZER_ALL__COLUMNIZERS:
				setColumnizerAll((Columnizers)arguments.get(0));
				return null;
			case DatatoolsPackage.CATEGORY_ABSTRACT___FLUSH:
				flush();
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
	
} //CategoryAbstractImpl
