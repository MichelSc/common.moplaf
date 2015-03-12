/**
 */
package com.misc.common.moplaf.dataextractor;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Selector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.misc.common.moplaf.dataextractor.DataSelector#getExtractorElement <em>Extractor Element</em>}</li>
 *   <li>{@link com.misc.common.moplaf.dataextractor.DataSelector#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.misc.common.moplaf.dataextractor.DataextractorPackage#getDataSelector()
 * @model abstract="true"
 * @generated
 */
public interface DataSelector extends EObject {
	/**
	 * Returns the value of the '<em><b>Extractor Element</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.dataextractor.DataExtractorElement#getSelectors <em>Selectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extractor Element</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extractor Element</em>' container reference.
	 * @see #setExtractorElement(DataExtractorElement)
	 * @see com.misc.common.moplaf.dataextractor.DataextractorPackage#getDataSelector_ExtractorElement()
	 * @see com.misc.common.moplaf.dataextractor.DataExtractorElement#getSelectors
	 * @model opposite="Selectors" required="true" transient="false"
	 * @generated
	 */
	DataExtractorElement getExtractorElement();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.dataextractor.DataSelector#getExtractorElement <em>Extractor Element</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extractor Element</em>' container reference.
	 * @see #getExtractorElement()
	 * @generated
	 */
	void setExtractorElement(DataExtractorElement value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see com.misc.common.moplaf.dataextractor.DataextractorPackage#getDataSelector_Description()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getDescription();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean isSelected(EObject object);

} // DataSelector
