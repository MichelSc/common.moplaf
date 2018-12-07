/**
 */
package com.misc.common.moplaf.datatools.impl;

import com.misc.common.moplaf.common.IPropertiesProvider;
import com.misc.common.moplaf.datatools.Categorizer;
import com.misc.common.moplaf.datatools.Category;
import com.misc.common.moplaf.datatools.CategoryAbstract;
import com.misc.common.moplaf.datatools.CategoryFactory;
import com.misc.common.moplaf.datatools.DatatoolsPackage;

import com.misc.common.moplaf.datatools.util.ObjectSet;
import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

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
 *   <li>{@link com.misc.common.moplaf.datatools.impl.CategoryAbstractImpl#getSubCategories <em>Sub Categories</em>}</li>
 *   <li>{@link com.misc.common.moplaf.datatools.impl.CategoryAbstractImpl#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CategoryAbstractImpl extends MinimalEObjectImpl.Container implements CategoryAbstract {
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
	public Category getSubcategory(EObject value) {
		return this.getSubCategories().stream().filter(c -> c.getCategoryValue().equals(value)).findAny().orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Object getPropertyAggregation(IPropertiesProvider provider, Object property) {
//		return provider.getAggregationValue(this.getElements(), property);
		return null;
	}
	
	private void updateElements(ObjectSet els_tobe) {
		Iterator<EObject> iterator_asis = this.getElements().iterator();
		while ( iterator_asis.hasNext()) {
			EObject asis = iterator_asis.next();
			if ( !els_tobe.remove(asis)) {
				// the asis is not tobe
				iterator_asis.remove();
			}
		}
		this.getElements().addAll(els_tobe);
	}


	/**
	 * <!-- begin-user-doc -->
	 * 
	 * @param factory: Category factory
	 * @param els_tobe: new set elements, input of the update
	 * @param categorizers: sequence of Categorizers to be used
	 * @param level: level of Categorizer used in this call
	 * <!-- end-user-doc -->
	 */
	public void refresh(CategoryFactory factory, ObjectSet els_tobe, EList<Categorizer>  categorizers, int level) {
		// update the elements of this category
		this.updateElements(els_tobe);
		
		// update the subcategories
		if ( categorizers.size()<=level ) {
			// there are no deeper levels
			this.getSubCategories().clear();
			// the elements are leaves
			for ( EObject el_asis : els_tobe) {
				factory.setLeafCategory(el_asis, this);
			}
		} else {
			// there are deeper levels than the current level
			Categorizer criteria = categorizers.get(level);
			HashMap<Object, ObjectSet> cats_tobe  = new HashMap<>();
			// collect the cats
			for ( EObject element : els_tobe) {
				Object cat_value = criteria.getCategoryValue(element);
				if ( cat_value!=null ) {
					ObjectSet cat_set = cats_tobe.get(cat_value);
					if ( cat_set==null ) {
						cat_set = new ObjectSet();
						cats_tobe.put(cat_value, cat_set);
					}
					cat_set.add(element);
				} else {
					// no category for this element
					factory.setLeafCategory(element, this);
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
					// update one level further (recursive)
					cat_asis.refresh(factory, els_tobe, categorizers, level);
				}
			}
			for (  Entry<Object, ObjectSet> cat_tobe : cats_tobe.entrySet()) {
				// create the cat
				Category new_cat = factory.constructCategory();
				new_cat.setCategoryValue(cat_tobe.getKey());
				new_cat.setCategoryLabel(criteria.getCategoryLabel(cat_tobe.getKey()));
				this.getSubCategories().add(new_cat); // owning
				// fill the cat, recursive
				new_cat.refresh(factory, cat_tobe.getValue(), categorizers, level);
			}
		}
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
			case DatatoolsPackage.CATEGORY_ABSTRACT__SUB_CATEGORIES:
				return getSubCategories();
			case DatatoolsPackage.CATEGORY_ABSTRACT__ELEMENTS:
				return getElements();
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
			case DatatoolsPackage.CATEGORY_ABSTRACT__SUB_CATEGORIES:
				return subCategories != null && !subCategories.isEmpty();
			case DatatoolsPackage.CATEGORY_ABSTRACT__ELEMENTS:
				return elements != null && !elements.isEmpty();
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
			case DatatoolsPackage.CATEGORY_ABSTRACT___GET_PROPERTY_AGGREGATION__IPROPERTIESPROVIDER_OBJECT:
				return getPropertyAggregation((IPropertiesProvider)arguments.get(0), arguments.get(1));
			case DatatoolsPackage.CATEGORY_ABSTRACT___REFRESH__CATEGORYFACTORY_OBJECTSET_ELIST_INT:
				refresh((CategoryFactory)arguments.get(0), (ObjectSet)arguments.get(1), (EList<Categorizer>)arguments.get(2), (Integer)arguments.get(3));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //CategoryAbstractImpl
