/**
 */
package com.misc.common.moplaf.dataextractor;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.misc.common.moplaf.dataextractor.DataextractorFactory
 * @model kind="package"
 * @generated
 */
public interface DataextractorPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "dataextractor";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://com.misc.common.moplaf.dataextractor";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "dtxt";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DataextractorPackage eINSTANCE = com.misc.common.moplaf.dataextractor.impl.DataextractorPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.dataextractor.impl.DataExtractorImpl <em>Data Extractor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.dataextractor.impl.DataExtractorImpl
	 * @see com.misc.common.moplaf.dataextractor.impl.DataextractorPackageImpl#getDataExtractor()
	 * @generated
	 */
	int DATA_EXTRACTOR = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_EXTRACTOR__NAME = 0;

	/**
	 * The feature id for the '<em><b>Source Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_EXTRACTOR__SOURCE_OBJECT = 1;

	/**
	 * The feature id for the '<em><b>Number Of Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_EXTRACTOR__NUMBER_OF_SELECTED = 2;

	/**
	 * The feature id for the '<em><b>Target Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_EXTRACTOR__TARGET_OBJECTS = 3;

	/**
	 * The feature id for the '<em><b>Sorters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_EXTRACTOR__SORTERS = 4;

	/**
	 * The feature id for the '<em><b>Source Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_EXTRACTOR__SOURCE_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Target Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_EXTRACTOR__TARGET_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Extractors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_EXTRACTOR__EXTRACTORS = 7;

	/**
	 * The feature id for the '<em><b>Last Extractor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_EXTRACTOR__LAST_EXTRACTOR = 8;

	/**
	 * The feature id for the '<em><b>Max Number Of Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_EXTRACTOR__MAX_NUMBER_OF_SELECTED = 9;

	/**
	 * The feature id for the '<em><b>Max Number Of Selected Reached</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_EXTRACTOR__MAX_NUMBER_OF_SELECTED_REACHED = 10;

	/**
	 * The feature id for the '<em><b>Number Of Extracted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_EXTRACTOR__NUMBER_OF_EXTRACTED = 11;

	/**
	 * The feature id for the '<em><b>URI Save</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_EXTRACTOR__URI_SAVE = 12;

	/**
	 * The number of structural features of the '<em>Data Extractor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_EXTRACTOR_FEATURE_COUNT = 13;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_EXTRACTOR___REFRESH = 0;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_EXTRACTOR___SAVE = 1;

	/**
	 * The number of operations of the '<em>Data Extractor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_EXTRACTOR_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.dataextractor.impl.DataSorterImpl <em>Data Sorter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.dataextractor.impl.DataSorterImpl
	 * @see com.misc.common.moplaf.dataextractor.impl.DataextractorPackageImpl#getDataSorter()
	 * @generated
	 */
	int DATA_SORTER = 1;

	/**
	 * The feature id for the '<em><b>Sequence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SORTER__SEQUENCE = 0;

	/**
	 * The feature id for the '<em><b>Sense</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SORTER__SENSE = 1;

	/**
	 * The feature id for the '<em><b>Data Extractor</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SORTER__DATA_EXTRACTOR = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SORTER__DESCRIPTION = 3;

	/**
	 * The number of structural features of the '<em>Data Sorter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SORTER_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Compare</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SORTER___COMPARE__EOBJECT_EOBJECT = 0;

	/**
	 * The number of operations of the '<em>Data Sorter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SORTER_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.dataextractor.impl.DataSorterFeatureImpl <em>Data Sorter Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.dataextractor.impl.DataSorterFeatureImpl
	 * @see com.misc.common.moplaf.dataextractor.impl.DataextractorPackageImpl#getDataSorterFeature()
	 * @generated
	 */
	int DATA_SORTER_FEATURE = 2;

	/**
	 * The feature id for the '<em><b>Sequence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SORTER_FEATURE__SEQUENCE = DATA_SORTER__SEQUENCE;

	/**
	 * The feature id for the '<em><b>Sense</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SORTER_FEATURE__SENSE = DATA_SORTER__SENSE;

	/**
	 * The feature id for the '<em><b>Data Extractor</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SORTER_FEATURE__DATA_EXTRACTOR = DATA_SORTER__DATA_EXTRACTOR;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SORTER_FEATURE__DESCRIPTION = DATA_SORTER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Sorted Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SORTER_FEATURE__SORTED_FEATURE = DATA_SORTER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data Sorter Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SORTER_FEATURE_FEATURE_COUNT = DATA_SORTER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Compare</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SORTER_FEATURE___COMPARE__EOBJECT_EOBJECT = DATA_SORTER___COMPARE__EOBJECT_EOBJECT;

	/**
	 * The number of operations of the '<em>Data Sorter Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SORTER_FEATURE_OPERATION_COUNT = DATA_SORTER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.dataextractor.impl.DataExtractorElementImpl <em>Data Extractor Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.dataextractor.impl.DataExtractorElementImpl
	 * @see com.misc.common.moplaf.dataextractor.impl.DataextractorPackageImpl#getDataExtractorElement()
	 * @generated
	 */
	int DATA_EXTRACTOR_ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Data Extractor</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_EXTRACTOR_ELEMENT__DATA_EXTRACTOR = 0;

	/**
	 * The feature id for the '<em><b>Sequence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_EXTRACTOR_ELEMENT__SEQUENCE = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_EXTRACTOR_ELEMENT__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Source Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_EXTRACTOR_ELEMENT__SOURCE_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Target Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_EXTRACTOR_ELEMENT__TARGET_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_EXTRACTOR_ELEMENT__PREVIOUS = 5;

	/**
	 * The feature id for the '<em><b>Selectors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_EXTRACTOR_ELEMENT__SELECTORS = 6;

	/**
	 * The number of structural features of the '<em>Data Extractor Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_EXTRACTOR_ELEMENT_FEATURE_COUNT = 7;

	/**
	 * The operation id for the '<em>Is Selected</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_EXTRACTOR_ELEMENT___IS_SELECTED__EOBJECT = 0;

	/**
	 * The operation id for the '<em>Get Result Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_EXTRACTOR_ELEMENT___GET_RESULT_SET = 1;

	/**
	 * The operation id for the '<em>Get Extract Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_EXTRACTOR_ELEMENT___GET_EXTRACT_SET = 2;

	/**
	 * The number of operations of the '<em>Data Extractor Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_EXTRACTOR_ELEMENT_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.dataextractor.impl.DataExtractorReferenceImpl <em>Data Extractor Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.dataextractor.impl.DataExtractorReferenceImpl
	 * @see com.misc.common.moplaf.dataextractor.impl.DataextractorPackageImpl#getDataExtractorReference()
	 * @generated
	 */
	int DATA_EXTRACTOR_REFERENCE = 4;

	/**
	 * The feature id for the '<em><b>Data Extractor</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_EXTRACTOR_REFERENCE__DATA_EXTRACTOR = DATA_EXTRACTOR_ELEMENT__DATA_EXTRACTOR;

	/**
	 * The feature id for the '<em><b>Sequence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_EXTRACTOR_REFERENCE__SEQUENCE = DATA_EXTRACTOR_ELEMENT__SEQUENCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_EXTRACTOR_REFERENCE__DESCRIPTION = DATA_EXTRACTOR_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Source Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_EXTRACTOR_REFERENCE__SOURCE_TYPE = DATA_EXTRACTOR_ELEMENT__SOURCE_TYPE;

	/**
	 * The feature id for the '<em><b>Target Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_EXTRACTOR_REFERENCE__TARGET_TYPE = DATA_EXTRACTOR_ELEMENT__TARGET_TYPE;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_EXTRACTOR_REFERENCE__PREVIOUS = DATA_EXTRACTOR_ELEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Selectors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_EXTRACTOR_REFERENCE__SELECTORS = DATA_EXTRACTOR_ELEMENT__SELECTORS;

	/**
	 * The feature id for the '<em><b>Extractor Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_EXTRACTOR_REFERENCE__EXTRACTOR_REFERENCE = DATA_EXTRACTOR_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data Extractor Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_EXTRACTOR_REFERENCE_FEATURE_COUNT = DATA_EXTRACTOR_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Selected</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_EXTRACTOR_REFERENCE___IS_SELECTED__EOBJECT = DATA_EXTRACTOR_ELEMENT___IS_SELECTED__EOBJECT;

	/**
	 * The operation id for the '<em>Get Result Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_EXTRACTOR_REFERENCE___GET_RESULT_SET = DATA_EXTRACTOR_ELEMENT___GET_RESULT_SET;

	/**
	 * The operation id for the '<em>Get Extract Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_EXTRACTOR_REFERENCE___GET_EXTRACT_SET = DATA_EXTRACTOR_ELEMENT___GET_EXTRACT_SET;

	/**
	 * The number of operations of the '<em>Data Extractor Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_EXTRACTOR_REFERENCE_OPERATION_COUNT = DATA_EXTRACTOR_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.dataextractor.impl.DataSelectorImpl <em>Data Selector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.dataextractor.impl.DataSelectorImpl
	 * @see com.misc.common.moplaf.dataextractor.impl.DataextractorPackageImpl#getDataSelector()
	 * @generated
	 */
	int DATA_SELECTOR = 5;

	/**
	 * The feature id for the '<em><b>Extractor Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SELECTOR__EXTRACTOR_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SELECTOR__DESCRIPTION = 1;

	/**
	 * The number of structural features of the '<em>Data Selector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SELECTOR_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Is Selected</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SELECTOR___IS_SELECTED__EOBJECT = 0;

	/**
	 * The number of operations of the '<em>Data Selector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SELECTOR_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.dataextractor.impl.DataSelectorFeatureImpl <em>Data Selector Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.dataextractor.impl.DataSelectorFeatureImpl
	 * @see com.misc.common.moplaf.dataextractor.impl.DataextractorPackageImpl#getDataSelectorFeature()
	 * @generated
	 */
	int DATA_SELECTOR_FEATURE = 6;

	/**
	 * The feature id for the '<em><b>Extractor Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SELECTOR_FEATURE__EXTRACTOR_ELEMENT = DATA_SELECTOR__EXTRACTOR_ELEMENT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SELECTOR_FEATURE__DESCRIPTION = DATA_SELECTOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SELECTOR_FEATURE__FEATURE = DATA_SELECTOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data Selector Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SELECTOR_FEATURE_FEATURE_COUNT = DATA_SELECTOR_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Selected</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SELECTOR_FEATURE___IS_SELECTED__EOBJECT = DATA_SELECTOR___IS_SELECTED__EOBJECT;

	/**
	 * The operation id for the '<em>Get Feature Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SELECTOR_FEATURE___GET_FEATURE_CLASSIFIER = DATA_SELECTOR_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Data Selector Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SELECTOR_FEATURE_OPERATION_COUNT = DATA_SELECTOR_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.dataextractor.impl.DataSelectorBigDecimalImpl <em>Data Selector Big Decimal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.dataextractor.impl.DataSelectorBigDecimalImpl
	 * @see com.misc.common.moplaf.dataextractor.impl.DataextractorPackageImpl#getDataSelectorBigDecimal()
	 * @generated
	 */
	int DATA_SELECTOR_BIG_DECIMAL = 7;

	/**
	 * The feature id for the '<em><b>Extractor Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SELECTOR_BIG_DECIMAL__EXTRACTOR_ELEMENT = DATA_SELECTOR_FEATURE__EXTRACTOR_ELEMENT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SELECTOR_BIG_DECIMAL__DESCRIPTION = DATA_SELECTOR_FEATURE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SELECTOR_BIG_DECIMAL__FEATURE = DATA_SELECTOR_FEATURE__FEATURE;

	/**
	 * The feature id for the '<em><b>Values</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SELECTOR_BIG_DECIMAL__VALUES = DATA_SELECTOR_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data Selector Big Decimal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SELECTOR_BIG_DECIMAL_FEATURE_COUNT = DATA_SELECTOR_FEATURE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Selected</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SELECTOR_BIG_DECIMAL___IS_SELECTED__EOBJECT = DATA_SELECTOR_FEATURE___IS_SELECTED__EOBJECT;

	/**
	 * The operation id for the '<em>Get Feature Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SELECTOR_BIG_DECIMAL___GET_FEATURE_CLASSIFIER = DATA_SELECTOR_FEATURE___GET_FEATURE_CLASSIFIER;

	/**
	 * The number of operations of the '<em>Data Selector Big Decimal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SELECTOR_BIG_DECIMAL_OPERATION_COUNT = DATA_SELECTOR_FEATURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.dataextractor.impl.DataSelectorDateImpl <em>Data Selector Date</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.dataextractor.impl.DataSelectorDateImpl
	 * @see com.misc.common.moplaf.dataextractor.impl.DataextractorPackageImpl#getDataSelectorDate()
	 * @generated
	 */
	int DATA_SELECTOR_DATE = 8;

	/**
	 * The feature id for the '<em><b>Extractor Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SELECTOR_DATE__EXTRACTOR_ELEMENT = DATA_SELECTOR_FEATURE__EXTRACTOR_ELEMENT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SELECTOR_DATE__DESCRIPTION = DATA_SELECTOR_FEATURE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SELECTOR_DATE__FEATURE = DATA_SELECTOR_FEATURE__FEATURE;

	/**
	 * The feature id for the '<em><b>Values</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SELECTOR_DATE__VALUES = DATA_SELECTOR_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data Selector Date</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SELECTOR_DATE_FEATURE_COUNT = DATA_SELECTOR_FEATURE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Selected</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SELECTOR_DATE___IS_SELECTED__EOBJECT = DATA_SELECTOR_FEATURE___IS_SELECTED__EOBJECT;

	/**
	 * The operation id for the '<em>Get Feature Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SELECTOR_DATE___GET_FEATURE_CLASSIFIER = DATA_SELECTOR_FEATURE___GET_FEATURE_CLASSIFIER;

	/**
	 * The number of operations of the '<em>Data Selector Date</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SELECTOR_DATE_OPERATION_COUNT = DATA_SELECTOR_FEATURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.dataextractor.impl.DataSelectorStringImpl <em>Data Selector String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.dataextractor.impl.DataSelectorStringImpl
	 * @see com.misc.common.moplaf.dataextractor.impl.DataextractorPackageImpl#getDataSelectorString()
	 * @generated
	 */
	int DATA_SELECTOR_STRING = 9;

	/**
	 * The feature id for the '<em><b>Extractor Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SELECTOR_STRING__EXTRACTOR_ELEMENT = DATA_SELECTOR_FEATURE__EXTRACTOR_ELEMENT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SELECTOR_STRING__DESCRIPTION = DATA_SELECTOR_FEATURE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SELECTOR_STRING__FEATURE = DATA_SELECTOR_FEATURE__FEATURE;

	/**
	 * The feature id for the '<em><b>Values</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SELECTOR_STRING__VALUES = DATA_SELECTOR_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data Selector String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SELECTOR_STRING_FEATURE_COUNT = DATA_SELECTOR_FEATURE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Selected</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SELECTOR_STRING___IS_SELECTED__EOBJECT = DATA_SELECTOR_FEATURE___IS_SELECTED__EOBJECT;

	/**
	 * The operation id for the '<em>Get Feature Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SELECTOR_STRING___GET_FEATURE_CLASSIFIER = DATA_SELECTOR_FEATURE___GET_FEATURE_CLASSIFIER;

	/**
	 * The number of operations of the '<em>Data Selector String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SELECTOR_STRING_OPERATION_COUNT = DATA_SELECTOR_FEATURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.dataextractor.DataSorterSense <em>Data Sorter Sense</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.dataextractor.DataSorterSense
	 * @see com.misc.common.moplaf.dataextractor.impl.DataextractorPackageImpl#getDataSorterSense()
	 * @generated
	 */
	int DATA_SORTER_SENSE = 10;


	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.dataextractor.DataExtractor <em>Data Extractor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Extractor</em>'.
	 * @see com.misc.common.moplaf.dataextractor.DataExtractor
	 * @generated
	 */
	EClass getDataExtractor();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.dataextractor.DataExtractor#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.misc.common.moplaf.dataextractor.DataExtractor#getName()
	 * @see #getDataExtractor()
	 * @generated
	 */
	EAttribute getDataExtractor_Name();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.dataextractor.DataExtractor#getSourceObject <em>Source Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Object</em>'.
	 * @see com.misc.common.moplaf.dataextractor.DataExtractor#getSourceObject()
	 * @see #getDataExtractor()
	 * @generated
	 */
	EReference getDataExtractor_SourceObject();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.dataextractor.DataExtractor#getNumberOfSelected <em>Number Of Selected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Selected</em>'.
	 * @see com.misc.common.moplaf.dataextractor.DataExtractor#getNumberOfSelected()
	 * @see #getDataExtractor()
	 * @generated
	 */
	EAttribute getDataExtractor_NumberOfSelected();

	/**
	 * Returns the meta object for the reference list '{@link com.misc.common.moplaf.dataextractor.DataExtractor#getTargetObjects <em>Target Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Target Objects</em>'.
	 * @see com.misc.common.moplaf.dataextractor.DataExtractor#getTargetObjects()
	 * @see #getDataExtractor()
	 * @generated
	 */
	EReference getDataExtractor_TargetObjects();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.common.moplaf.dataextractor.DataExtractor#getSorters <em>Sorters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sorters</em>'.
	 * @see com.misc.common.moplaf.dataextractor.DataExtractor#getSorters()
	 * @see #getDataExtractor()
	 * @generated
	 */
	EReference getDataExtractor_Sorters();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.dataextractor.DataExtractor#getSourceType <em>Source Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Type</em>'.
	 * @see com.misc.common.moplaf.dataextractor.DataExtractor#getSourceType()
	 * @see #getDataExtractor()
	 * @generated
	 */
	EReference getDataExtractor_SourceType();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.dataextractor.DataExtractor#getTargetType <em>Target Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Type</em>'.
	 * @see com.misc.common.moplaf.dataextractor.DataExtractor#getTargetType()
	 * @see #getDataExtractor()
	 * @generated
	 */
	EReference getDataExtractor_TargetType();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.common.moplaf.dataextractor.DataExtractor#getExtractors <em>Extractors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Extractors</em>'.
	 * @see com.misc.common.moplaf.dataextractor.DataExtractor#getExtractors()
	 * @see #getDataExtractor()
	 * @generated
	 */
	EReference getDataExtractor_Extractors();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.dataextractor.DataExtractor#getLastExtractor <em>Last Extractor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Last Extractor</em>'.
	 * @see com.misc.common.moplaf.dataextractor.DataExtractor#getLastExtractor()
	 * @see #getDataExtractor()
	 * @generated
	 */
	EReference getDataExtractor_LastExtractor();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.dataextractor.DataExtractor#getMaxNumberOfSelected <em>Max Number Of Selected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Number Of Selected</em>'.
	 * @see com.misc.common.moplaf.dataextractor.DataExtractor#getMaxNumberOfSelected()
	 * @see #getDataExtractor()
	 * @generated
	 */
	EAttribute getDataExtractor_MaxNumberOfSelected();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.dataextractor.DataExtractor#isMaxNumberOfSelectedReached <em>Max Number Of Selected Reached</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Number Of Selected Reached</em>'.
	 * @see com.misc.common.moplaf.dataextractor.DataExtractor#isMaxNumberOfSelectedReached()
	 * @see #getDataExtractor()
	 * @generated
	 */
	EAttribute getDataExtractor_MaxNumberOfSelectedReached();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.dataextractor.DataExtractor#getNumberOfExtracted <em>Number Of Extracted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Extracted</em>'.
	 * @see com.misc.common.moplaf.dataextractor.DataExtractor#getNumberOfExtracted()
	 * @see #getDataExtractor()
	 * @generated
	 */
	EAttribute getDataExtractor_NumberOfExtracted();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.dataextractor.DataExtractor#getURISave <em>URI Save</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>URI Save</em>'.
	 * @see com.misc.common.moplaf.dataextractor.DataExtractor#getURISave()
	 * @see #getDataExtractor()
	 * @generated
	 */
	EAttribute getDataExtractor_URISave();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.dataextractor.DataExtractor#refresh() <em>Refresh</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Refresh</em>' operation.
	 * @see com.misc.common.moplaf.dataextractor.DataExtractor#refresh()
	 * @generated
	 */
	EOperation getDataExtractor__Refresh();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.dataextractor.DataExtractor#save() <em>Save</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Save</em>' operation.
	 * @see com.misc.common.moplaf.dataextractor.DataExtractor#save()
	 * @generated
	 */
	EOperation getDataExtractor__Save();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.dataextractor.DataSorter <em>Data Sorter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Sorter</em>'.
	 * @see com.misc.common.moplaf.dataextractor.DataSorter
	 * @generated
	 */
	EClass getDataSorter();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.dataextractor.DataSorter#getSequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence</em>'.
	 * @see com.misc.common.moplaf.dataextractor.DataSorter#getSequence()
	 * @see #getDataSorter()
	 * @generated
	 */
	EAttribute getDataSorter_Sequence();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.dataextractor.DataSorter#getSense <em>Sense</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sense</em>'.
	 * @see com.misc.common.moplaf.dataextractor.DataSorter#getSense()
	 * @see #getDataSorter()
	 * @generated
	 */
	EAttribute getDataSorter_Sense();

	/**
	 * Returns the meta object for the container reference '{@link com.misc.common.moplaf.dataextractor.DataSorter#getDataExtractor <em>Data Extractor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Data Extractor</em>'.
	 * @see com.misc.common.moplaf.dataextractor.DataSorter#getDataExtractor()
	 * @see #getDataSorter()
	 * @generated
	 */
	EReference getDataSorter_DataExtractor();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.dataextractor.DataSorter#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see com.misc.common.moplaf.dataextractor.DataSorter#getDescription()
	 * @see #getDataSorter()
	 * @generated
	 */
	EAttribute getDataSorter_Description();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.dataextractor.DataSorter#compare(org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Compare</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Compare</em>' operation.
	 * @see com.misc.common.moplaf.dataextractor.DataSorter#compare(org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getDataSorter__Compare__EObject_EObject();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.dataextractor.DataSorterFeature <em>Data Sorter Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Sorter Feature</em>'.
	 * @see com.misc.common.moplaf.dataextractor.DataSorterFeature
	 * @generated
	 */
	EClass getDataSorterFeature();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.dataextractor.DataSorterFeature#getSortedFeature <em>Sorted Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sorted Feature</em>'.
	 * @see com.misc.common.moplaf.dataextractor.DataSorterFeature#getSortedFeature()
	 * @see #getDataSorterFeature()
	 * @generated
	 */
	EReference getDataSorterFeature_SortedFeature();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.dataextractor.DataExtractorElement <em>Data Extractor Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Extractor Element</em>'.
	 * @see com.misc.common.moplaf.dataextractor.DataExtractorElement
	 * @generated
	 */
	EClass getDataExtractorElement();

	/**
	 * Returns the meta object for the container reference '{@link com.misc.common.moplaf.dataextractor.DataExtractorElement#getDataExtractor <em>Data Extractor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Data Extractor</em>'.
	 * @see com.misc.common.moplaf.dataextractor.DataExtractorElement#getDataExtractor()
	 * @see #getDataExtractorElement()
	 * @generated
	 */
	EReference getDataExtractorElement_DataExtractor();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.dataextractor.DataExtractorElement#getSequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence</em>'.
	 * @see com.misc.common.moplaf.dataextractor.DataExtractorElement#getSequence()
	 * @see #getDataExtractorElement()
	 * @generated
	 */
	EAttribute getDataExtractorElement_Sequence();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.dataextractor.DataExtractorElement#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see com.misc.common.moplaf.dataextractor.DataExtractorElement#getDescription()
	 * @see #getDataExtractorElement()
	 * @generated
	 */
	EAttribute getDataExtractorElement_Description();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.dataextractor.DataExtractorElement#getSourceType <em>Source Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Type</em>'.
	 * @see com.misc.common.moplaf.dataextractor.DataExtractorElement#getSourceType()
	 * @see #getDataExtractorElement()
	 * @generated
	 */
	EReference getDataExtractorElement_SourceType();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.dataextractor.DataExtractorElement#getTargetType <em>Target Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Type</em>'.
	 * @see com.misc.common.moplaf.dataextractor.DataExtractorElement#getTargetType()
	 * @see #getDataExtractorElement()
	 * @generated
	 */
	EReference getDataExtractorElement_TargetType();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.dataextractor.DataExtractorElement#getPrevious <em>Previous</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Previous</em>'.
	 * @see com.misc.common.moplaf.dataextractor.DataExtractorElement#getPrevious()
	 * @see #getDataExtractorElement()
	 * @generated
	 */
	EReference getDataExtractorElement_Previous();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.common.moplaf.dataextractor.DataExtractorElement#getSelectors <em>Selectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Selectors</em>'.
	 * @see com.misc.common.moplaf.dataextractor.DataExtractorElement#getSelectors()
	 * @see #getDataExtractorElement()
	 * @generated
	 */
	EReference getDataExtractorElement_Selectors();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.dataextractor.DataExtractorElement#isSelected(org.eclipse.emf.ecore.EObject) <em>Is Selected</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Selected</em>' operation.
	 * @see com.misc.common.moplaf.dataextractor.DataExtractorElement#isSelected(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getDataExtractorElement__IsSelected__EObject();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.dataextractor.DataExtractorElement#getResultSet() <em>Get Result Set</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Result Set</em>' operation.
	 * @see com.misc.common.moplaf.dataextractor.DataExtractorElement#getResultSet()
	 * @generated
	 */
	EOperation getDataExtractorElement__GetResultSet();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.dataextractor.DataExtractorElement#getExtractSet() <em>Get Extract Set</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Extract Set</em>' operation.
	 * @see com.misc.common.moplaf.dataextractor.DataExtractorElement#getExtractSet()
	 * @generated
	 */
	EOperation getDataExtractorElement__GetExtractSet();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.dataextractor.DataExtractorReference <em>Data Extractor Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Extractor Reference</em>'.
	 * @see com.misc.common.moplaf.dataextractor.DataExtractorReference
	 * @generated
	 */
	EClass getDataExtractorReference();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.dataextractor.DataExtractorReference#getExtractorReference <em>Extractor Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Extractor Reference</em>'.
	 * @see com.misc.common.moplaf.dataextractor.DataExtractorReference#getExtractorReference()
	 * @see #getDataExtractorReference()
	 * @generated
	 */
	EReference getDataExtractorReference_ExtractorReference();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.dataextractor.DataSelector <em>Data Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Selector</em>'.
	 * @see com.misc.common.moplaf.dataextractor.DataSelector
	 * @generated
	 */
	EClass getDataSelector();

	/**
	 * Returns the meta object for the container reference '{@link com.misc.common.moplaf.dataextractor.DataSelector#getExtractorElement <em>Extractor Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Extractor Element</em>'.
	 * @see com.misc.common.moplaf.dataextractor.DataSelector#getExtractorElement()
	 * @see #getDataSelector()
	 * @generated
	 */
	EReference getDataSelector_ExtractorElement();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.dataextractor.DataSelector#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see com.misc.common.moplaf.dataextractor.DataSelector#getDescription()
	 * @see #getDataSelector()
	 * @generated
	 */
	EAttribute getDataSelector_Description();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.dataextractor.DataSelector#isSelected(org.eclipse.emf.ecore.EObject) <em>Is Selected</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Selected</em>' operation.
	 * @see com.misc.common.moplaf.dataextractor.DataSelector#isSelected(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getDataSelector__IsSelected__EObject();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.dataextractor.DataSelectorFeature <em>Data Selector Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Selector Feature</em>'.
	 * @see com.misc.common.moplaf.dataextractor.DataSelectorFeature
	 * @generated
	 */
	EClass getDataSelectorFeature();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.dataextractor.DataSelectorFeature#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Feature</em>'.
	 * @see com.misc.common.moplaf.dataextractor.DataSelectorFeature#getFeature()
	 * @see #getDataSelectorFeature()
	 * @generated
	 */
	EReference getDataSelectorFeature_Feature();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.dataextractor.DataSelectorFeature#getFeatureClassifier() <em>Get Feature Classifier</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Feature Classifier</em>' operation.
	 * @see com.misc.common.moplaf.dataextractor.DataSelectorFeature#getFeatureClassifier()
	 * @generated
	 */
	EOperation getDataSelectorFeature__GetFeatureClassifier();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.dataextractor.DataSelectorBigDecimal <em>Data Selector Big Decimal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Selector Big Decimal</em>'.
	 * @see com.misc.common.moplaf.dataextractor.DataSelectorBigDecimal
	 * @generated
	 */
	EClass getDataSelectorBigDecimal();

	/**
	 * Returns the meta object for the attribute list '{@link com.misc.common.moplaf.dataextractor.DataSelectorBigDecimal#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Values</em>'.
	 * @see com.misc.common.moplaf.dataextractor.DataSelectorBigDecimal#getValues()
	 * @see #getDataSelectorBigDecimal()
	 * @generated
	 */
	EAttribute getDataSelectorBigDecimal_Values();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.dataextractor.DataSelectorDate <em>Data Selector Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Selector Date</em>'.
	 * @see com.misc.common.moplaf.dataextractor.DataSelectorDate
	 * @generated
	 */
	EClass getDataSelectorDate();

	/**
	 * Returns the meta object for the attribute list '{@link com.misc.common.moplaf.dataextractor.DataSelectorDate#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Values</em>'.
	 * @see com.misc.common.moplaf.dataextractor.DataSelectorDate#getValues()
	 * @see #getDataSelectorDate()
	 * @generated
	 */
	EAttribute getDataSelectorDate_Values();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.dataextractor.DataSelectorString <em>Data Selector String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Selector String</em>'.
	 * @see com.misc.common.moplaf.dataextractor.DataSelectorString
	 * @generated
	 */
	EClass getDataSelectorString();

	/**
	 * Returns the meta object for the attribute list '{@link com.misc.common.moplaf.dataextractor.DataSelectorString#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Values</em>'.
	 * @see com.misc.common.moplaf.dataextractor.DataSelectorString#getValues()
	 * @see #getDataSelectorString()
	 * @generated
	 */
	EAttribute getDataSelectorString_Values();

	/**
	 * Returns the meta object for enum '{@link com.misc.common.moplaf.dataextractor.DataSorterSense <em>Data Sorter Sense</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Data Sorter Sense</em>'.
	 * @see com.misc.common.moplaf.dataextractor.DataSorterSense
	 * @generated
	 */
	EEnum getDataSorterSense();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DataextractorFactory getDataextractorFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.dataextractor.impl.DataExtractorImpl <em>Data Extractor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.dataextractor.impl.DataExtractorImpl
		 * @see com.misc.common.moplaf.dataextractor.impl.DataextractorPackageImpl#getDataExtractor()
		 * @generated
		 */
		EClass DATA_EXTRACTOR = eINSTANCE.getDataExtractor();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_EXTRACTOR__NAME = eINSTANCE.getDataExtractor_Name();

		/**
		 * The meta object literal for the '<em><b>Source Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_EXTRACTOR__SOURCE_OBJECT = eINSTANCE.getDataExtractor_SourceObject();


		/**
		 * The meta object literal for the '<em><b>Number Of Selected</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_EXTRACTOR__NUMBER_OF_SELECTED = eINSTANCE.getDataExtractor_NumberOfSelected();

		/**
		 * The meta object literal for the '<em><b>Target Objects</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_EXTRACTOR__TARGET_OBJECTS = eINSTANCE.getDataExtractor_TargetObjects();

		/**
		 * The meta object literal for the '<em><b>Sorters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_EXTRACTOR__SORTERS = eINSTANCE.getDataExtractor_Sorters();

		/**
		 * The meta object literal for the '<em><b>Source Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_EXTRACTOR__SOURCE_TYPE = eINSTANCE.getDataExtractor_SourceType();

		/**
		 * The meta object literal for the '<em><b>Target Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_EXTRACTOR__TARGET_TYPE = eINSTANCE.getDataExtractor_TargetType();

		/**
		 * The meta object literal for the '<em><b>Extractors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_EXTRACTOR__EXTRACTORS = eINSTANCE.getDataExtractor_Extractors();

		/**
		 * The meta object literal for the '<em><b>Last Extractor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_EXTRACTOR__LAST_EXTRACTOR = eINSTANCE.getDataExtractor_LastExtractor();

		/**
		 * The meta object literal for the '<em><b>Max Number Of Selected</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_EXTRACTOR__MAX_NUMBER_OF_SELECTED = eINSTANCE.getDataExtractor_MaxNumberOfSelected();

		/**
		 * The meta object literal for the '<em><b>Max Number Of Selected Reached</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_EXTRACTOR__MAX_NUMBER_OF_SELECTED_REACHED = eINSTANCE.getDataExtractor_MaxNumberOfSelectedReached();

		/**
		 * The meta object literal for the '<em><b>Number Of Extracted</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_EXTRACTOR__NUMBER_OF_EXTRACTED = eINSTANCE.getDataExtractor_NumberOfExtracted();

		/**
		 * The meta object literal for the '<em><b>URI Save</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_EXTRACTOR__URI_SAVE = eINSTANCE.getDataExtractor_URISave();

		/**
		 * The meta object literal for the '<em><b>Refresh</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_EXTRACTOR___REFRESH = eINSTANCE.getDataExtractor__Refresh();

		/**
		 * The meta object literal for the '<em><b>Save</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_EXTRACTOR___SAVE = eINSTANCE.getDataExtractor__Save();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.dataextractor.impl.DataSorterImpl <em>Data Sorter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.dataextractor.impl.DataSorterImpl
		 * @see com.misc.common.moplaf.dataextractor.impl.DataextractorPackageImpl#getDataSorter()
		 * @generated
		 */
		EClass DATA_SORTER = eINSTANCE.getDataSorter();

		/**
		 * The meta object literal for the '<em><b>Sequence</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SORTER__SEQUENCE = eINSTANCE.getDataSorter_Sequence();

		/**
		 * The meta object literal for the '<em><b>Sense</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SORTER__SENSE = eINSTANCE.getDataSorter_Sense();

		/**
		 * The meta object literal for the '<em><b>Data Extractor</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_SORTER__DATA_EXTRACTOR = eINSTANCE.getDataSorter_DataExtractor();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SORTER__DESCRIPTION = eINSTANCE.getDataSorter_Description();

		/**
		 * The meta object literal for the '<em><b>Compare</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SORTER___COMPARE__EOBJECT_EOBJECT = eINSTANCE.getDataSorter__Compare__EObject_EObject();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.dataextractor.impl.DataSorterFeatureImpl <em>Data Sorter Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.dataextractor.impl.DataSorterFeatureImpl
		 * @see com.misc.common.moplaf.dataextractor.impl.DataextractorPackageImpl#getDataSorterFeature()
		 * @generated
		 */
		EClass DATA_SORTER_FEATURE = eINSTANCE.getDataSorterFeature();

		/**
		 * The meta object literal for the '<em><b>Sorted Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_SORTER_FEATURE__SORTED_FEATURE = eINSTANCE.getDataSorterFeature_SortedFeature();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.dataextractor.impl.DataExtractorElementImpl <em>Data Extractor Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.dataextractor.impl.DataExtractorElementImpl
		 * @see com.misc.common.moplaf.dataextractor.impl.DataextractorPackageImpl#getDataExtractorElement()
		 * @generated
		 */
		EClass DATA_EXTRACTOR_ELEMENT = eINSTANCE.getDataExtractorElement();

		/**
		 * The meta object literal for the '<em><b>Data Extractor</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_EXTRACTOR_ELEMENT__DATA_EXTRACTOR = eINSTANCE.getDataExtractorElement_DataExtractor();

		/**
		 * The meta object literal for the '<em><b>Sequence</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_EXTRACTOR_ELEMENT__SEQUENCE = eINSTANCE.getDataExtractorElement_Sequence();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_EXTRACTOR_ELEMENT__DESCRIPTION = eINSTANCE.getDataExtractorElement_Description();

		/**
		 * The meta object literal for the '<em><b>Source Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_EXTRACTOR_ELEMENT__SOURCE_TYPE = eINSTANCE.getDataExtractorElement_SourceType();

		/**
		 * The meta object literal for the '<em><b>Target Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_EXTRACTOR_ELEMENT__TARGET_TYPE = eINSTANCE.getDataExtractorElement_TargetType();

		/**
		 * The meta object literal for the '<em><b>Previous</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_EXTRACTOR_ELEMENT__PREVIOUS = eINSTANCE.getDataExtractorElement_Previous();

		/**
		 * The meta object literal for the '<em><b>Selectors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_EXTRACTOR_ELEMENT__SELECTORS = eINSTANCE.getDataExtractorElement_Selectors();

		/**
		 * The meta object literal for the '<em><b>Is Selected</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_EXTRACTOR_ELEMENT___IS_SELECTED__EOBJECT = eINSTANCE.getDataExtractorElement__IsSelected__EObject();

		/**
		 * The meta object literal for the '<em><b>Get Result Set</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_EXTRACTOR_ELEMENT___GET_RESULT_SET = eINSTANCE.getDataExtractorElement__GetResultSet();

		/**
		 * The meta object literal for the '<em><b>Get Extract Set</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_EXTRACTOR_ELEMENT___GET_EXTRACT_SET = eINSTANCE.getDataExtractorElement__GetExtractSet();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.dataextractor.impl.DataExtractorReferenceImpl <em>Data Extractor Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.dataextractor.impl.DataExtractorReferenceImpl
		 * @see com.misc.common.moplaf.dataextractor.impl.DataextractorPackageImpl#getDataExtractorReference()
		 * @generated
		 */
		EClass DATA_EXTRACTOR_REFERENCE = eINSTANCE.getDataExtractorReference();

		/**
		 * The meta object literal for the '<em><b>Extractor Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_EXTRACTOR_REFERENCE__EXTRACTOR_REFERENCE = eINSTANCE.getDataExtractorReference_ExtractorReference();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.dataextractor.impl.DataSelectorImpl <em>Data Selector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.dataextractor.impl.DataSelectorImpl
		 * @see com.misc.common.moplaf.dataextractor.impl.DataextractorPackageImpl#getDataSelector()
		 * @generated
		 */
		EClass DATA_SELECTOR = eINSTANCE.getDataSelector();

		/**
		 * The meta object literal for the '<em><b>Extractor Element</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_SELECTOR__EXTRACTOR_ELEMENT = eINSTANCE.getDataSelector_ExtractorElement();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SELECTOR__DESCRIPTION = eINSTANCE.getDataSelector_Description();

		/**
		 * The meta object literal for the '<em><b>Is Selected</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SELECTOR___IS_SELECTED__EOBJECT = eINSTANCE.getDataSelector__IsSelected__EObject();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.dataextractor.impl.DataSelectorFeatureImpl <em>Data Selector Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.dataextractor.impl.DataSelectorFeatureImpl
		 * @see com.misc.common.moplaf.dataextractor.impl.DataextractorPackageImpl#getDataSelectorFeature()
		 * @generated
		 */
		EClass DATA_SELECTOR_FEATURE = eINSTANCE.getDataSelectorFeature();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_SELECTOR_FEATURE__FEATURE = eINSTANCE.getDataSelectorFeature_Feature();

		/**
		 * The meta object literal for the '<em><b>Get Feature Classifier</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SELECTOR_FEATURE___GET_FEATURE_CLASSIFIER = eINSTANCE.getDataSelectorFeature__GetFeatureClassifier();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.dataextractor.impl.DataSelectorBigDecimalImpl <em>Data Selector Big Decimal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.dataextractor.impl.DataSelectorBigDecimalImpl
		 * @see com.misc.common.moplaf.dataextractor.impl.DataextractorPackageImpl#getDataSelectorBigDecimal()
		 * @generated
		 */
		EClass DATA_SELECTOR_BIG_DECIMAL = eINSTANCE.getDataSelectorBigDecimal();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SELECTOR_BIG_DECIMAL__VALUES = eINSTANCE.getDataSelectorBigDecimal_Values();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.dataextractor.impl.DataSelectorDateImpl <em>Data Selector Date</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.dataextractor.impl.DataSelectorDateImpl
		 * @see com.misc.common.moplaf.dataextractor.impl.DataextractorPackageImpl#getDataSelectorDate()
		 * @generated
		 */
		EClass DATA_SELECTOR_DATE = eINSTANCE.getDataSelectorDate();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SELECTOR_DATE__VALUES = eINSTANCE.getDataSelectorDate_Values();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.dataextractor.impl.DataSelectorStringImpl <em>Data Selector String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.dataextractor.impl.DataSelectorStringImpl
		 * @see com.misc.common.moplaf.dataextractor.impl.DataextractorPackageImpl#getDataSelectorString()
		 * @generated
		 */
		EClass DATA_SELECTOR_STRING = eINSTANCE.getDataSelectorString();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SELECTOR_STRING__VALUES = eINSTANCE.getDataSelectorString_Values();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.dataextractor.DataSorterSense <em>Data Sorter Sense</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.dataextractor.DataSorterSense
		 * @see com.misc.common.moplaf.dataextractor.impl.DataextractorPackageImpl#getDataSorterSense()
		 * @generated
		 */
		EEnum DATA_SORTER_SENSE = eINSTANCE.getDataSorterSense();

	}

} //DataextractorPackage
