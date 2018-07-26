/**
 */
package com.misc.common.moplaf.datatools;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extractor Filter Compound</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.datatools.ExtractorFilterCompound#getFilters <em>Filters</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.datatools.DatatoolsPackage#getExtractorFilterCompound()
 * @model abstract="true"
 * @generated
 */
public interface ExtractorFilterCompound extends ExtractorFilter {
	/**
	 * Returns the value of the '<em><b>Filters</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.datatools.ExtractorFilter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filters</em>' containment reference list.
	 * @see com.misc.common.moplaf.datatools.DatatoolsPackage#getExtractorFilterCompound_Filters()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExtractorFilter> getFilters();

} // ExtractorFilterCompound
