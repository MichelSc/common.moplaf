/**
 */
package com.misc.common.moplaf.datatools.impl;

import com.misc.common.moplaf.common.IPropertiesProvider;
import com.misc.common.moplaf.datatools.ColumnizerAbstract;
import com.misc.common.moplaf.datatools.DataToolType;
import com.misc.common.moplaf.datatools.DatatoolsPackage;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Columnizer Abstract</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.datatools.impl.ColumnizerAbstractImpl#getSheetLabel <em>Sheet Label</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ColumnizerAbstractImpl extends DataToolImpl implements ColumnizerAbstract {
	/**
	 * The default value of the '{@link #getSheetLabel() <em>Sheet Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSheetLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String SHEET_LABEL_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ColumnizerAbstractImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatatoolsPackage.Literals.COLUMNIZER_ABSTRACT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSheetLabel() {
		// TODO: implement this method to return the 'Sheet Label' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public boolean isValidElementType(EClass type) {
		if( type == null ) {
			return false;
		}
		return this.isValidElementTypeImpl(type);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPropertiesProvider getPropertiesProvider() {
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DatatoolsPackage.COLUMNIZER_ABSTRACT__SHEET_LABEL:
				return getSheetLabel();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DatatoolsPackage.COLUMNIZER_ABSTRACT__SHEET_LABEL:
				return SHEET_LABEL_EDEFAULT == null ? getSheetLabel() != null : !SHEET_LABEL_EDEFAULT.equals(getSheetLabel());
		}
		return super.eIsSet(featureID);
	}

	protected boolean isValidElementTypeImpl(EClass type) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case DatatoolsPackage.COLUMNIZER_ABSTRACT___IS_VALID_ELEMENT_TYPE__ECLASS:
				return isValidElementType((EClass)arguments.get(0));
			case DatatoolsPackage.COLUMNIZER_ABSTRACT___GET_PROPERTIES_PROVIDER:
				return getPropertiesProvider();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * 
	 */
	@Override
	public DataToolType getType() {
		return DataToolType.COLUMNIZER;
	}
} //ColumnizerAbstractImpl
