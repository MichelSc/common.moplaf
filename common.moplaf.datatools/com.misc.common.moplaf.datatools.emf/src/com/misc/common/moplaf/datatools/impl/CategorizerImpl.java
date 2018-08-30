/**
 */
package com.misc.common.moplaf.datatools.impl;

import com.misc.common.moplaf.datatools.Categorizer;
import com.misc.common.moplaf.datatools.Category;
import com.misc.common.moplaf.datatools.DataToolType;
import com.misc.common.moplaf.datatools.DatatoolsFactory;
import com.misc.common.moplaf.datatools.DatatoolsPackage;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Categorizer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.datatools.impl.CategorizerImpl#getCategorizedType <em>Categorized Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CategorizerImpl extends DataToolImpl implements Categorizer {
	/**
	 * The cached value of the '{@link #getCategorizedType() <em>Categorized Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorizedType()
	 * @generated
	 * @ordered
	 */
	protected EClass categorizedType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CategorizerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatatoolsPackage.Literals.CATEGORIZER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCategorizedType() {
		if (categorizedType != null && categorizedType.eIsProxy()) {
			InternalEObject oldCategorizedType = (InternalEObject)categorizedType;
			categorizedType = (EClass)eResolveProxy(oldCategorizedType);
			if (categorizedType != oldCategorizedType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DatatoolsPackage.CATEGORIZER__CATEGORIZED_TYPE, oldCategorizedType, categorizedType));
			}
		}
		return categorizedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass basicGetCategorizedType() {
		return categorizedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorizedType(EClass newCategorizedType) {
		EClass oldCategorizedType = categorizedType;
		categorizedType = newCategorizedType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatoolsPackage.CATEGORIZER__CATEGORIZED_TYPE, oldCategorizedType, categorizedType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getCategoryValue(EObject object) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public String getCategoryLabel(Object value) {
		return value.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public boolean isValidElementType(EClass type) {
		if ( type == null ) {
			return false;
		}
		return this.isValidElementTypeImpl(type);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DatatoolsPackage.CATEGORIZER__CATEGORIZED_TYPE:
				if (resolve) return getCategorizedType();
				return basicGetCategorizedType();
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
			case DatatoolsPackage.CATEGORIZER__CATEGORIZED_TYPE:
				setCategorizedType((EClass)newValue);
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
			case DatatoolsPackage.CATEGORIZER__CATEGORIZED_TYPE:
				setCategorizedType((EClass)null);
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
			case DatatoolsPackage.CATEGORIZER__CATEGORIZED_TYPE:
				return categorizedType != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * To be overloaded by the concrete class
	 * Guaranteed that parameter type is non null
	 * @param type
	 * @return
	 */
	protected boolean isValidElementTypeImpl(EClass type) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Category constructCategory() {
		return DatatoolsFactory.eINSTANCE.createCategory();
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
			case DatatoolsPackage.CATEGORIZER___CONSTRUCT_CATEGORY:
				return constructCategory();
			case DatatoolsPackage.CATEGORIZER___GET_CATEGORY_VALUE__EOBJECT:
				return getCategoryValue((EObject)arguments.get(0));
			case DatatoolsPackage.CATEGORIZER___GET_CATEGORY_LABEL__OBJECT:
				return getCategoryLabel(arguments.get(0));
			case DatatoolsPackage.CATEGORIZER___IS_VALID_ELEMENT_TYPE__ECLASS:
				return isValidElementType((EClass)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * 
	 */
	@Override
	public DataToolType getType() {
		return DataToolType.CATEGORIZER;
	}
} //CategorizerImpl
