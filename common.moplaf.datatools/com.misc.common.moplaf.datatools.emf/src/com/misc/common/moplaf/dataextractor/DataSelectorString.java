/**
 */
package com.misc.common.moplaf.dataextractor;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Selector String</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.misc.common.moplaf.dataextractor.DataSelectorString#getValues <em>Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.misc.common.moplaf.dataextractor.DataextractorPackage#getDataSelectorString()
 * @model
 * @generated
 */
public interface DataSelectorString extends DataSelectorFeature {
	/**
	 * Returns the value of the '<em><b>Values</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Values</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' attribute list.
	 * @see com.misc.common.moplaf.dataextractor.DataextractorPackage#getDataSelectorString_Values()
	 * @model
	 * @generated
	 */
	EList<String> getValues();

} // DataSelectorString
