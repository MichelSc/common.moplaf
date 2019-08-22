/**
 */
package com.misc.common.moplaf.datatools.impl;

import com.misc.common.moplaf.datatools.Categorizer;
import com.misc.common.moplaf.datatools.CategorizerSubject;
import com.misc.common.moplaf.datatools.DataToolType;
import com.misc.common.moplaf.datatools.DatatoolsPackage;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Categorizer</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class CategorizerImpl extends DataToolImpl implements Categorizer {
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
	 */
	public Object getCategoryValue(EObject object) {
		if ( object instanceof CategorizerSubject ) {
			CategorizerSubject subject = (CategorizerSubject)object;
			return this.getCategoryValueImpl(subject.getSubject());
		} else {
			return this.getCategoryValueImpl(object);
		}
		
	}

	protected Object getCategoryValueImpl(EObject object) {
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
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
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
