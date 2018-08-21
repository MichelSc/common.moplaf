/**
 */
package com.misc.common.moplaf.datatools;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extractor Compound</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.datatools.ExtractorCompound#getExtractors <em>Extractors</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.datatools.DatatoolsPackage#getExtractorCompound()
 * @model
 * @generated
 */
public interface ExtractorCompound extends Extractor, DataToolContext {
	/**
	 * Returns the value of the '<em><b>Extractors</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.datatools.Extractor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extractors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extractors</em>' containment reference list.
	 * @see com.misc.common.moplaf.datatools.DatatoolsPackage#getExtractorCompound_Extractors()
	 * @model containment="true"
	 * @generated
	 */
	EList<Extractor> getExtractors();

} // ExtractorCompound
