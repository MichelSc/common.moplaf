/**
 */
package com.misc.common.moplaf.dataextractor;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Extractor Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.dataextractor.DataExtractorElement#getDataExtractor <em>Data Extractor</em>}</li>
 *   <li>{@link com.misc.common.moplaf.dataextractor.DataExtractorElement#getSequence <em>Sequence</em>}</li>
 *   <li>{@link com.misc.common.moplaf.dataextractor.DataExtractorElement#getDescription <em>Description</em>}</li>
 *   <li>{@link com.misc.common.moplaf.dataextractor.DataExtractorElement#getSourceType <em>Source Type</em>}</li>
 *   <li>{@link com.misc.common.moplaf.dataextractor.DataExtractorElement#getTargetType <em>Target Type</em>}</li>
 *   <li>{@link com.misc.common.moplaf.dataextractor.DataExtractorElement#getPrevious <em>Previous</em>}</li>
 *   <li>{@link com.misc.common.moplaf.dataextractor.DataExtractorElement#getSelectors <em>Selectors</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.dataextractor.DataextractorPackage#getDataExtractorElement()
 * @model abstract="true"
 * @generated
 */
public interface DataExtractorElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Data Extractor</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.dataextractor.DataExtractor#getExtractors <em>Extractors</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Extractor</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Extractor</em>' container reference.
	 * @see #setDataExtractor(DataExtractor)
	 * @see com.misc.common.moplaf.dataextractor.DataextractorPackage#getDataExtractorElement_DataExtractor()
	 * @see com.misc.common.moplaf.dataextractor.DataExtractor#getExtractors
	 * @model opposite="Extractors" required="true" transient="false"
	 * @generated
	 */
	DataExtractor getDataExtractor();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.dataextractor.DataExtractorElement#getDataExtractor <em>Data Extractor</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Extractor</em>' container reference.
	 * @see #getDataExtractor()
	 * @generated
	 */
	void setDataExtractor(DataExtractor value);

	/**
	 * Returns the value of the '<em><b>Sequence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequence</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence</em>' attribute.
	 * @see com.misc.common.moplaf.dataextractor.DataextractorPackage#getDataExtractorElement_Sequence()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	int getSequence();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see com.misc.common.moplaf.dataextractor.DataextractorPackage#getDataExtractorElement_Description()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getDescription();

	/**
	 * Returns the value of the '<em><b>Source Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Type</em>' reference.
	 * @see com.misc.common.moplaf.dataextractor.DataextractorPackage#getDataExtractorElement_SourceType()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EClass getSourceType();

	/**
	 * Returns the value of the '<em><b>Target Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Type</em>' reference.
	 * @see com.misc.common.moplaf.dataextractor.DataextractorPackage#getDataExtractorElement_TargetType()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EClass getTargetType();

	/**
	 * Returns the value of the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Previous</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Previous</em>' reference.
	 * @see com.misc.common.moplaf.dataextractor.DataextractorPackage#getDataExtractorElement_Previous()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	DataExtractorElement getPrevious();

	/**
	 * Returns the value of the '<em><b>Selectors</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.dataextractor.DataSelector}.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.dataextractor.DataSelector#getExtractorElement <em>Extractor Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selectors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selectors</em>' containment reference list.
	 * @see com.misc.common.moplaf.dataextractor.DataextractorPackage#getDataExtractorElement_Selectors()
	 * @see com.misc.common.moplaf.dataextractor.DataSelector#getExtractorElement
	 * @model opposite="ExtractorElement" containment="true"
	 * @generated
	 */
	EList<DataSelector> getSelectors();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean isSelected(EObject object);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" many="false"
	 * @generated
	 */
	EList<?> getResultSet();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" many="false"
	 * @generated
	 */
	EList<?> getExtractSet();

} // DataExtractorElement
