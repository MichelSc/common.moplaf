/**
 */
package com.misc.common.moplaf.analysis.impl;

import com.misc.common.moplaf.analysis.AnalysisDoc;
import com.misc.common.moplaf.analysis.AnalysisElement;
import com.misc.common.moplaf.analysis.AnalysisElementKey;
import com.misc.common.moplaf.analysis.AnalysisPackage;

import com.misc.common.moplaf.datatools.CategoryAbstract;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.analysis.impl.AnalysisElementImpl#getDoc <em>Doc</em>}</li>
 *   <li>{@link com.misc.common.moplaf.analysis.impl.AnalysisElementImpl#getKey <em>Key</em>}</li>
 *   <li>{@link com.misc.common.moplaf.analysis.impl.AnalysisElementImpl#getElement <em>Element</em>}</li>
 *   <li>{@link com.misc.common.moplaf.analysis.impl.AnalysisElementImpl#getCategory <em>Category</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnalysisElementImpl extends MinimalEObjectImpl.Container implements AnalysisElement {
	/**
	 * The cached value of the '{@link #getKey() <em>Key</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey()
	 * @generated
	 * @ordered
	 */
	protected AnalysisElementKey key;

	/**
	 * The cached value of the '{@link #getElement() <em>Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElement()
	 * @generated
	 * @ordered
	 */
	protected EObject element;

	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected CategoryAbstract category;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnalysisElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AnalysisPackage.Literals.ANALYSIS_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalysisDoc getDoc() {
		if (eContainerFeatureID() != AnalysisPackage.ANALYSIS_ELEMENT__DOC) return null;
		return (AnalysisDoc)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDoc(AnalysisDoc newDoc, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newDoc, AnalysisPackage.ANALYSIS_ELEMENT__DOC, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDoc(AnalysisDoc newDoc) {
		if (newDoc != eInternalContainer() || (eContainerFeatureID() != AnalysisPackage.ANALYSIS_ELEMENT__DOC && newDoc != null)) {
			if (EcoreUtil.isAncestor(this, newDoc))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDoc != null)
				msgs = ((InternalEObject)newDoc).eInverseAdd(this, AnalysisPackage.ANALYSIS_DOC__ELEMENTS, AnalysisDoc.class, msgs);
			msgs = basicSetDoc(newDoc, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysisPackage.ANALYSIS_ELEMENT__DOC, newDoc, newDoc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalysisElementKey getKey() {
		if (key != null && key.eIsProxy()) {
			InternalEObject oldKey = (InternalEObject)key;
			key = (AnalysisElementKey)eResolveProxy(oldKey);
			if (key != oldKey) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AnalysisPackage.ANALYSIS_ELEMENT__KEY, oldKey, key));
			}
		}
		return key;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalysisElementKey basicGetKey() {
		return key;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKey(AnalysisElementKey newKey, NotificationChain msgs) {
		AnalysisElementKey oldKey = key;
		key = newKey;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnalysisPackage.ANALYSIS_ELEMENT__KEY, oldKey, newKey);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKey(AnalysisElementKey newKey) {
		if (newKey != key) {
			NotificationChain msgs = null;
			if (key != null)
				msgs = ((InternalEObject)key).eInverseRemove(this, AnalysisPackage.ANALYSIS_ELEMENT_KEY__DOCS, AnalysisElementKey.class, msgs);
			if (newKey != null)
				msgs = ((InternalEObject)newKey).eInverseAdd(this, AnalysisPackage.ANALYSIS_ELEMENT_KEY__DOCS, AnalysisElementKey.class, msgs);
			msgs = basicSetKey(newKey, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysisPackage.ANALYSIS_ELEMENT__KEY, newKey, newKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getElement() {
		if (element != null && element.eIsProxy()) {
			InternalEObject oldElement = (InternalEObject)element;
			element = eResolveProxy(oldElement);
			if (element != oldElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AnalysisPackage.ANALYSIS_ELEMENT__ELEMENT, oldElement, element));
			}
		}
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetElement() {
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElement(EObject newElement) {
		EObject oldElement = element;
		element = newElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysisPackage.ANALYSIS_ELEMENT__ELEMENT, oldElement, element));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CategoryAbstract getCategory() {
		if (category != null && category.eIsProxy()) {
			InternalEObject oldCategory = (InternalEObject)category;
			category = (CategoryAbstract)eResolveProxy(oldCategory);
			if (category != oldCategory) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AnalysisPackage.ANALYSIS_ELEMENT__CATEGORY, oldCategory, category));
			}
		}
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CategoryAbstract basicGetCategory() {
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategory(CategoryAbstract newCategory) {
		CategoryAbstract oldCategory = category;
		category = newCategory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysisPackage.ANALYSIS_ELEMENT__CATEGORY, oldCategory, category));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public boolean isInCategory(CategoryAbstract category) {
		CategoryAbstract leaf_cat = this.getCategory();
		if ( leaf_cat==null) {
			return false;
		}
		return leaf_cat.isIn(category);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public EObject getSubject() {
		return this.getElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AnalysisPackage.ANALYSIS_ELEMENT__DOC:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDoc((AnalysisDoc)otherEnd, msgs);
			case AnalysisPackage.ANALYSIS_ELEMENT__KEY:
				if (key != null)
					msgs = ((InternalEObject)key).eInverseRemove(this, AnalysisPackage.ANALYSIS_ELEMENT_KEY__DOCS, AnalysisElementKey.class, msgs);
				return basicSetKey((AnalysisElementKey)otherEnd, msgs);
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
			case AnalysisPackage.ANALYSIS_ELEMENT__DOC:
				return basicSetDoc(null, msgs);
			case AnalysisPackage.ANALYSIS_ELEMENT__KEY:
				return basicSetKey(null, msgs);
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
			case AnalysisPackage.ANALYSIS_ELEMENT__DOC:
				return eInternalContainer().eInverseRemove(this, AnalysisPackage.ANALYSIS_DOC__ELEMENTS, AnalysisDoc.class, msgs);
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
			case AnalysisPackage.ANALYSIS_ELEMENT__DOC:
				return getDoc();
			case AnalysisPackage.ANALYSIS_ELEMENT__KEY:
				if (resolve) return getKey();
				return basicGetKey();
			case AnalysisPackage.ANALYSIS_ELEMENT__ELEMENT:
				if (resolve) return getElement();
				return basicGetElement();
			case AnalysisPackage.ANALYSIS_ELEMENT__CATEGORY:
				if (resolve) return getCategory();
				return basicGetCategory();
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
			case AnalysisPackage.ANALYSIS_ELEMENT__DOC:
				setDoc((AnalysisDoc)newValue);
				return;
			case AnalysisPackage.ANALYSIS_ELEMENT__KEY:
				setKey((AnalysisElementKey)newValue);
				return;
			case AnalysisPackage.ANALYSIS_ELEMENT__ELEMENT:
				setElement((EObject)newValue);
				return;
			case AnalysisPackage.ANALYSIS_ELEMENT__CATEGORY:
				setCategory((CategoryAbstract)newValue);
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
			case AnalysisPackage.ANALYSIS_ELEMENT__DOC:
				setDoc((AnalysisDoc)null);
				return;
			case AnalysisPackage.ANALYSIS_ELEMENT__KEY:
				setKey((AnalysisElementKey)null);
				return;
			case AnalysisPackage.ANALYSIS_ELEMENT__ELEMENT:
				setElement((EObject)null);
				return;
			case AnalysisPackage.ANALYSIS_ELEMENT__CATEGORY:
				setCategory((CategoryAbstract)null);
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
			case AnalysisPackage.ANALYSIS_ELEMENT__DOC:
				return getDoc() != null;
			case AnalysisPackage.ANALYSIS_ELEMENT__KEY:
				return key != null;
			case AnalysisPackage.ANALYSIS_ELEMENT__ELEMENT:
				return element != null;
			case AnalysisPackage.ANALYSIS_ELEMENT__CATEGORY:
				return category != null;
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
			case AnalysisPackage.ANALYSIS_ELEMENT___IS_IN_CATEGORY__CATEGORYABSTRACT:
				return isInCategory((CategoryAbstract)arguments.get(0));
			case AnalysisPackage.ANALYSIS_ELEMENT___GET_SUBJECT:
				return getSubject();
		}
		return super.eInvoke(operationID, arguments);
	}

} //AnalysisElementImpl
