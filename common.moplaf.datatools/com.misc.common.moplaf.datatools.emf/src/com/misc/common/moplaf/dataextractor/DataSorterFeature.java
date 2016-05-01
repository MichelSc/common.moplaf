/**
 */
package com.misc.common.moplaf.dataextractor;

import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Sorter Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.dataextractor.DataSorterFeature#getSortedFeature <em>Sorted Feature</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.dataextractor.DataextractorPackage#getDataSorterFeature()
 * @model
 * @generated
 */
public interface DataSorterFeature extends DataSorter {
	/**
	 * Returns the value of the '<em><b>Sorted Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sorted Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sorted Feature</em>' reference.
	 * @see #setSortedFeature(EStructuralFeature)
	 * @see com.misc.common.moplaf.dataextractor.DataextractorPackage#getDataSorterFeature_SortedFeature()
	 * @model required="true"
	 * @generated
	 */
	EStructuralFeature getSortedFeature();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.dataextractor.DataSorterFeature#getSortedFeature <em>Sorted Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sorted Feature</em>' reference.
	 * @see #getSortedFeature()
	 * @generated
	 */
	void setSortedFeature(EStructuralFeature value);

} // DataSorterFeature
