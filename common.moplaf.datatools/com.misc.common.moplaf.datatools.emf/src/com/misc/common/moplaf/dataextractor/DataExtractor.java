/**
 */
package com.misc.common.moplaf.dataextractor;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Extractor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.misc.common.moplaf.dataextractor.DataExtractor#getName <em>Name</em>}</li>
 *   <li>{@link com.misc.common.moplaf.dataextractor.DataExtractor#getSourceObject <em>Source Object</em>}</li>
 *   <li>{@link com.misc.common.moplaf.dataextractor.DataExtractor#getNumberOfSelected <em>Number Of Selected</em>}</li>
 *   <li>{@link com.misc.common.moplaf.dataextractor.DataExtractor#getTargetObjects <em>Target Objects</em>}</li>
 *   <li>{@link com.misc.common.moplaf.dataextractor.DataExtractor#getSorters <em>Sorters</em>}</li>
 *   <li>{@link com.misc.common.moplaf.dataextractor.DataExtractor#getSourceType <em>Source Type</em>}</li>
 *   <li>{@link com.misc.common.moplaf.dataextractor.DataExtractor#getTargetType <em>Target Type</em>}</li>
 *   <li>{@link com.misc.common.moplaf.dataextractor.DataExtractor#getExtractors <em>Extractors</em>}</li>
 *   <li>{@link com.misc.common.moplaf.dataextractor.DataExtractor#getLastExtractor <em>Last Extractor</em>}</li>
 *   <li>{@link com.misc.common.moplaf.dataextractor.DataExtractor#getMaxNumberOfSelected <em>Max Number Of Selected</em>}</li>
 *   <li>{@link com.misc.common.moplaf.dataextractor.DataExtractor#isMaxNumberOfSelectedReached <em>Max Number Of Selected Reached</em>}</li>
 *   <li>{@link com.misc.common.moplaf.dataextractor.DataExtractor#getNumberOfExtracted <em>Number Of Extracted</em>}</li>
 *   <li>{@link com.misc.common.moplaf.dataextractor.DataExtractor#getURISave <em>URI Save</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.misc.common.moplaf.dataextractor.DataextractorPackage#getDataExtractor()
 * @model
 * @generated
 */
public interface DataExtractor extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.misc.common.moplaf.dataextractor.DataextractorPackage#getDataExtractor_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.dataextractor.DataExtractor#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Source Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Object</em>' reference.
	 * @see #setSourceObject(EObject)
	 * @see com.misc.common.moplaf.dataextractor.DataextractorPackage#getDataExtractor_SourceObject()
	 * @model
	 * @generated
	 */
	EObject getSourceObject();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.dataextractor.DataExtractor#getSourceObject <em>Source Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Object</em>' reference.
	 * @see #getSourceObject()
	 * @generated
	 */
	void setSourceObject(EObject value);

	/**
	 * Returns the value of the '<em><b>Number Of Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Selected</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Selected</em>' attribute.
	 * @see #setNumberOfSelected(int)
	 * @see com.misc.common.moplaf.dataextractor.DataextractorPackage#getDataExtractor_NumberOfSelected()
	 * @model
	 * @generated
	 */
	int getNumberOfSelected();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.dataextractor.DataExtractor#getNumberOfSelected <em>Number Of Selected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Selected</em>' attribute.
	 * @see #getNumberOfSelected()
	 * @generated
	 */
	void setNumberOfSelected(int value);

	/**
	 * Returns the value of the '<em><b>Target Objects</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Objects</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Objects</em>' reference list.
	 * @see com.misc.common.moplaf.dataextractor.DataextractorPackage#getDataExtractor_TargetObjects()
	 * @model
	 * @generated
	 */
	EList<EObject> getTargetObjects();

	/**
	 * Returns the value of the '<em><b>Sorters</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.dataextractor.DataSorter}.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.dataextractor.DataSorter#getDataExtractor <em>Data Extractor</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sorters</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sorters</em>' containment reference list.
	 * @see com.misc.common.moplaf.dataextractor.DataextractorPackage#getDataExtractor_Sorters()
	 * @see com.misc.common.moplaf.dataextractor.DataSorter#getDataExtractor
	 * @model opposite="DataExtractor" containment="true"
	 * @generated
	 */
	EList<DataSorter> getSorters();

	/**
	 * Returns the value of the '<em><b>Source Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Type</em>' reference.
	 * @see com.misc.common.moplaf.dataextractor.DataextractorPackage#getDataExtractor_SourceType()
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
	 * @see com.misc.common.moplaf.dataextractor.DataextractorPackage#getDataExtractor_TargetType()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EClass getTargetType();

	/**
	 * Returns the value of the '<em><b>Extractors</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.dataextractor.DataExtractorElement}.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.dataextractor.DataExtractorElement#getDataExtractor <em>Data Extractor</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extractors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extractors</em>' containment reference list.
	 * @see com.misc.common.moplaf.dataextractor.DataextractorPackage#getDataExtractor_Extractors()
	 * @see com.misc.common.moplaf.dataextractor.DataExtractorElement#getDataExtractor
	 * @model opposite="DataExtractor" containment="true"
	 * @generated
	 */
	EList<DataExtractorElement> getExtractors();

	/**
	 * Returns the value of the '<em><b>Last Extractor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Extractor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Extractor</em>' reference.
	 * @see com.misc.common.moplaf.dataextractor.DataextractorPackage#getDataExtractor_LastExtractor()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	DataExtractorElement getLastExtractor();

	/**
	 * Returns the value of the '<em><b>Max Number Of Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Number Of Selected</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Number Of Selected</em>' attribute.
	 * @see #setMaxNumberOfSelected(int)
	 * @see com.misc.common.moplaf.dataextractor.DataextractorPackage#getDataExtractor_MaxNumberOfSelected()
	 * @model
	 * @generated
	 */
	int getMaxNumberOfSelected();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.dataextractor.DataExtractor#getMaxNumberOfSelected <em>Max Number Of Selected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Number Of Selected</em>' attribute.
	 * @see #getMaxNumberOfSelected()
	 * @generated
	 */
	void setMaxNumberOfSelected(int value);

	/**
	 * Returns the value of the '<em><b>Max Number Of Selected Reached</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Number Of Selected Reached</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Number Of Selected Reached</em>' attribute.
	 * @see #setMaxNumberOfSelectedReached(boolean)
	 * @see com.misc.common.moplaf.dataextractor.DataextractorPackage#getDataExtractor_MaxNumberOfSelectedReached()
	 * @model
	 * @generated
	 */
	boolean isMaxNumberOfSelectedReached();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.dataextractor.DataExtractor#isMaxNumberOfSelectedReached <em>Max Number Of Selected Reached</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Number Of Selected Reached</em>' attribute.
	 * @see #isMaxNumberOfSelectedReached()
	 * @generated
	 */
	void setMaxNumberOfSelectedReached(boolean value);

	/**
	 * Returns the value of the '<em><b>Number Of Extracted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Extracted</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Extracted</em>' attribute.
	 * @see #setNumberOfExtracted(int)
	 * @see com.misc.common.moplaf.dataextractor.DataextractorPackage#getDataExtractor_NumberOfExtracted()
	 * @model
	 * @generated
	 */
	int getNumberOfExtracted();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.dataextractor.DataExtractor#getNumberOfExtracted <em>Number Of Extracted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Extracted</em>' attribute.
	 * @see #getNumberOfExtracted()
	 * @generated
	 */
	void setNumberOfExtracted(int value);

	/**
	 * Returns the value of the '<em><b>URI Save</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>URI Save</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>URI Save</em>' attribute.
	 * @see #setURISave(String)
	 * @see com.misc.common.moplaf.dataextractor.DataextractorPackage#getDataExtractor_URISave()
	 * @model
	 * @generated
	 */
	String getURISave();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.dataextractor.DataExtractor#getURISave <em>URI Save</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>URI Save</em>' attribute.
	 * @see #getURISave()
	 * @generated
	 */
	void setURISave(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void refresh();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void save();

} // DataExtractor
