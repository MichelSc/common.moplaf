/**
 */
package com.misc.common.moplaf.dataextractor;

import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Extractor Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.misc.common.moplaf.dataextractor.DataExtractorReference#getExtractorReference <em>Extractor Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.misc.common.moplaf.dataextractor.DataextractorPackage#getDataExtractorReference()
 * @model
 * @generated
 */
public interface DataExtractorReference extends DataExtractorElement {
	/**
	 * Returns the value of the '<em><b>Extractor Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extractor Reference</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extractor Reference</em>' reference.
	 * @see #setExtractorReference(EReference)
	 * @see com.misc.common.moplaf.dataextractor.DataextractorPackage#getDataExtractorReference_ExtractorReference()
	 * @model
	 * @generated
	 */
	EReference getExtractorReference();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.dataextractor.DataExtractorReference#getExtractorReference <em>Extractor Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extractor Reference</em>' reference.
	 * @see #getExtractorReference()
	 * @generated
	 */
	void setExtractorReference(EReference value);

} // DataExtractorReference
