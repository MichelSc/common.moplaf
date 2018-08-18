/**
 */
package com.misc.common.moplaf.datatools.impl;

import com.misc.common.moplaf.datatools.Categorizer;
import com.misc.common.moplaf.datatools.DatatoolsPackage;
import com.misc.common.moplaf.datatools.SuperCategory;

import com.misc.common.moplaf.datatools.util.ObjectSet;
import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Super Category</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class SuperCategoryImpl extends CategoryAbstractImpl implements SuperCategory {
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
	 */
	public void refreshCats(ObjectSet ins, EList<Categorizer> categorizers) {
		this.refreshCats(ins, categorizers, 0);
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
			case DatatoolsPackage.SUPER_CATEGORY___REFRESH_CATS__OBJECTSET_ELIST:
				refreshCats((ObjectSet)arguments.get(0), (EList<Categorizer>)arguments.get(1));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //SuperCategoryImpl
