/**
 */
package com.misc.common.moplaf.dataextractor.impl;

import com.misc.common.moplaf.dataextractor.DataSelectorBigDecimal;
import com.misc.common.moplaf.dataextractor.DataextractorPackage;

import java.math.BigDecimal;
import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Selector Big Decimal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.dataextractor.impl.DataSelectorBigDecimalImpl#getValues <em>Values</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataSelectorBigDecimalImpl extends DataSelectorFeatureImpl implements DataSelectorBigDecimal {
	/**
	 * The cached value of the '{@link #getValues() <em>Values</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValues()
	 * @generated
	 * @ordered
	 */
	protected EList<BigDecimal> values;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataSelectorBigDecimalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataextractorPackage.Literals.DATA_SELECTOR_BIG_DECIMAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BigDecimal> getValues() {
		if (values == null) {
			values = new EDataTypeUniqueEList<BigDecimal>(BigDecimal.class, this, DataextractorPackage.DATA_SELECTOR_BIG_DECIMAL__VALUES);
		}
		return values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataextractorPackage.DATA_SELECTOR_BIG_DECIMAL__VALUES:
				return getValues();
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
			case DataextractorPackage.DATA_SELECTOR_BIG_DECIMAL__VALUES:
				getValues().clear();
				getValues().addAll((Collection<? extends BigDecimal>)newValue);
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
			case DataextractorPackage.DATA_SELECTOR_BIG_DECIMAL__VALUES:
				getValues().clear();
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
			case DataextractorPackage.DATA_SELECTOR_BIG_DECIMAL__VALUES:
				return values != null && !values.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (Values: ");
		result.append(values);
		result.append(')');
		return result.toString();
	}

	/* (non-Javadoc)
	 * @see com.misc.common.moplaf.dataextractor.impl.DataSelectorFeatureImpl#getFeatureInstanceClass()
	 */
	@Override
	public EClassifier getFeatureClassifier() {
		return EcorePackage.Literals.EBIG_DECIMAL;
	}

	/* (non-Javadoc)
	 * @see com.misc.common.moplaf.dataextractor.impl.DataSelectorImpl#isSelected(org.eclipse.emf.ecore.EObject)
	 */
	@Override
	public boolean isSelected(EObject object) {
		if ( this.getValues()==null) { return true; }
		if ( this.getValues().size()==0 ) { return true; }
		BigDecimal value = (BigDecimal) object.eGet(this.getFeature());
		return this.getValues().contains(value);
	}

} //DataSelectorBigDecimalImpl
