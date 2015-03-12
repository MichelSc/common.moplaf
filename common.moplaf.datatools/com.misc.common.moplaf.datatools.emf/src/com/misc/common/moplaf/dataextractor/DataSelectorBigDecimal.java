/**
 */
package com.misc.common.moplaf.dataextractor;

import java.math.BigDecimal;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Selector Big Decimal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.misc.common.moplaf.dataextractor.DataSelectorBigDecimal#getValues <em>Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.misc.common.moplaf.dataextractor.DataextractorPackage#getDataSelectorBigDecimal()
 * @model
 * @generated
 */
public interface DataSelectorBigDecimal extends DataSelectorFeature {
	/**
	 * Returns the value of the '<em><b>Values</b></em>' attribute list.
	 * The list contents are of type {@link java.math.BigDecimal}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Values</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' attribute list.
	 * @see com.misc.common.moplaf.dataextractor.DataextractorPackage#getDataSelectorBigDecimal_Values()
	 * @model
	 * @generated
	 */
	EList<BigDecimal> getValues();

} // DataSelectorBigDecimal
