/**
 */
package com.misc.common.moplaf.datatools.impl;

import com.misc.common.moplaf.datatools.Categorizer;
import com.misc.common.moplaf.datatools.DatatoolsPackage;
import com.misc.common.moplaf.datatools.SuperCategory;

import com.misc.common.moplaf.datatools.util.ObjectSet;
import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Set;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Super Category</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.datatools.impl.SuperCategoryImpl#getCategorizers <em>Categorizers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SuperCategoryImpl extends CategoryAbstractImpl implements SuperCategory {
	/**
	 * The cached value of the '{@link #getCategorizers() <em>Categorizers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorizers()
	 * @generated
	 * @ordered
	 */
	protected EList<Categorizer> categorizers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SuperCategoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatatoolsPackage.Literals.SUPER_CATEGORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Categorizer> getCategorizers() {
		if (categorizers == null) {
			categorizers = new EObjectResolvingEList<Categorizer>(Categorizer.class, this, DatatoolsPackage.SUPER_CATEGORY__CATEGORIZERS);
		}
		return categorizers;
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
	 */
	public void refreshCats(ObjectSet ins) {
		this.refreshCats(ins, this, 0);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DatatoolsPackage.SUPER_CATEGORY__CATEGORIZERS:
				return getCategorizers();
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
			case DatatoolsPackage.SUPER_CATEGORY__CATEGORIZERS:
				getCategorizers().clear();
				getCategorizers().addAll((Collection<? extends Categorizer>)newValue);
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
			case DatatoolsPackage.SUPER_CATEGORY__CATEGORIZERS:
				getCategorizers().clear();
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
			case DatatoolsPackage.SUPER_CATEGORY__CATEGORIZERS:
				return categorizers != null && !categorizers.isEmpty();
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
			case DatatoolsPackage.SUPER_CATEGORY___IS_VALID_ROOT__EOBJECT:
				return isValidRoot((EObject)arguments.get(0));
			case DatatoolsPackage.SUPER_CATEGORY___REFRESH_CATS__OBJECTSET:
				refreshCats((ObjectSet)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //SuperCategoryImpl
