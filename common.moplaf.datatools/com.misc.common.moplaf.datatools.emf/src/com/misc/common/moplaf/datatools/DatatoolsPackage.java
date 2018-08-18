/**
 */
package com.misc.common.moplaf.datatools;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
 * @see com.misc.common.moplaf.datatools.DatatoolsFactory
 * @model kind="package"
 * @generated
 */
public interface DatatoolsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "datatools";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.misc.com/common/moplaf/datatools/model/0.1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "datatools";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DatatoolsPackage eINSTANCE = com.misc.common.moplaf.datatools.impl.DatatoolsPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.datatools.impl.CategoryAbstractImpl <em>Category Abstract</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.datatools.impl.CategoryAbstractImpl
	 * @see com.misc.common.moplaf.datatools.impl.DatatoolsPackageImpl#getCategoryAbstract()
	 * @generated
	 */
	int CATEGORY_ABSTRACT = 32;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.datatools.impl.CategorizerImpl <em>Categorizer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.datatools.impl.CategorizerImpl
	 * @see com.misc.common.moplaf.datatools.impl.DatatoolsPackageImpl#getCategorizer()
	 * @generated
	 */
	int CATEGORIZER = 35;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.datatools.impl.CategoryImpl <em>Category</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.datatools.impl.CategoryImpl
	 * @see com.misc.common.moplaf.datatools.impl.DatatoolsPackageImpl#getCategory()
	 * @generated
	 */
	int CATEGORY = 34;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.datatools.impl.DataToolImpl <em>Data Tool</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.datatools.impl.DataToolImpl
	 * @see com.misc.common.moplaf.datatools.impl.DatatoolsPackageImpl#getDataTool()
	 * @generated
	 */
	int DATA_TOOL = 5;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.datatools.impl.ExtractorImpl <em>Extractor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.datatools.impl.ExtractorImpl
	 * @see com.misc.common.moplaf.datatools.impl.DatatoolsPackageImpl#getExtractor()
	 * @generated
	 */
	int EXTRACTOR = 7;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.datatools.impl.ColumnizerImpl <em>Columnizer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.datatools.impl.ColumnizerImpl
	 * @see com.misc.common.moplaf.datatools.impl.DatatoolsPackageImpl#getColumnizer()
	 * @generated
	 */
	int COLUMNIZER = 27;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.datatools.impl.ExtractorTypeImpl <em>Extractor Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.datatools.impl.ExtractorTypeImpl
	 * @see com.misc.common.moplaf.datatools.impl.DatatoolsPackageImpl#getExtractorType()
	 * @generated
	 */
	int EXTRACTOR_TYPE = 8;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.datatools.impl.ExtractorCompoundImpl <em>Extractor Compound</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.datatools.impl.ExtractorCompoundImpl
	 * @see com.misc.common.moplaf.datatools.impl.DatatoolsPackageImpl#getExtractorCompound()
	 * @generated
	 */
	int EXTRACTOR_COMPOUND = 21;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.datatools.impl.ExtractorPipeImpl <em>Extractor Pipe</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.datatools.impl.ExtractorPipeImpl
	 * @see com.misc.common.moplaf.datatools.impl.DatatoolsPackageImpl#getExtractorPipe()
	 * @generated
	 */
	int EXTRACTOR_PIPE = 23;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.datatools.impl.ExtractorLogicImpl <em>Extractor Logic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.datatools.impl.ExtractorLogicImpl
	 * @see com.misc.common.moplaf.datatools.impl.DatatoolsPackageImpl#getExtractorLogic()
	 * @generated
	 */
	int EXTRACTOR_LOGIC = 22;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.datatools.impl.ExtractorUnionImpl <em>Extractor Union</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.datatools.impl.ExtractorUnionImpl
	 * @see com.misc.common.moplaf.datatools.impl.DatatoolsPackageImpl#getExtractorUnion()
	 * @generated
	 */
	int EXTRACTOR_UNION = 24;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.datatools.impl.ExtractorIntersectionImpl <em>Extractor Intersection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.datatools.impl.ExtractorIntersectionImpl
	 * @see com.misc.common.moplaf.datatools.impl.DatatoolsPackageImpl#getExtractorIntersection()
	 * @generated
	 */
	int EXTRACTOR_INTERSECTION = 25;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.datatools.impl.ExtractorPathImpl <em>Extractor Path</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.datatools.impl.ExtractorPathImpl
	 * @see com.misc.common.moplaf.datatools.impl.DatatoolsPackageImpl#getExtractorPath()
	 * @generated
	 */
	int EXTRACTOR_PATH = 9;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.datatools.impl.ExtractorOclImpl <em>Extractor Ocl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.datatools.impl.ExtractorOclImpl
	 * @see com.misc.common.moplaf.datatools.impl.DatatoolsPackageImpl#getExtractorOcl()
	 * @generated
	 */
	int EXTRACTOR_OCL = 10;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.datatools.impl.ExtractorFilterImpl <em>Extractor Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.datatools.impl.ExtractorFilterImpl
	 * @see com.misc.common.moplaf.datatools.impl.DatatoolsPackageImpl#getExtractorFilter()
	 * @generated
	 */
	int EXTRACTOR_FILTER = 11;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.datatools.impl.ExtractorFilterAttributeImpl <em>Extractor Filter Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.datatools.impl.ExtractorFilterAttributeImpl
	 * @see com.misc.common.moplaf.datatools.impl.DatatoolsPackageImpl#getExtractorFilterAttribute()
	 * @generated
	 */
	int EXTRACTOR_FILTER_ATTRIBUTE = 12;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.datatools.impl.ExtractorFilterAttributeIntImpl <em>Extractor Filter Attribute Int</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.datatools.impl.ExtractorFilterAttributeIntImpl
	 * @see com.misc.common.moplaf.datatools.impl.DatatoolsPackageImpl#getExtractorFilterAttributeInt()
	 * @generated
	 */
	int EXTRACTOR_FILTER_ATTRIBUTE_INT = 15;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.datatools.impl.ExtractorFilterOclImpl <em>Extractor Filter Ocl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.datatools.impl.ExtractorFilterOclImpl
	 * @see com.misc.common.moplaf.datatools.impl.DatatoolsPackageImpl#getExtractorFilterOcl()
	 * @generated
	 */
	int EXTRACTOR_FILTER_OCL = 17;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.datatools.impl.ColumnizerColumnImpl <em>Columnizer Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.datatools.impl.ColumnizerColumnImpl
	 * @see com.misc.common.moplaf.datatools.impl.DatatoolsPackageImpl#getColumnizerColumn()
	 * @generated
	 */
	int COLUMNIZER_COLUMN = 29;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.datatools.impl.ColumnizerColumnAttributeImpl <em>Columnizer Column Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.datatools.impl.ColumnizerColumnAttributeImpl
	 * @see com.misc.common.moplaf.datatools.impl.DatatoolsPackageImpl#getColumnizerColumnAttribute()
	 * @generated
	 */
	int COLUMNIZER_COLUMN_ATTRIBUTE = 30;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.datatools.impl.ColumnizerColumnOclImpl <em>Columnizer Column Ocl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.datatools.impl.ColumnizerColumnOclImpl
	 * @see com.misc.common.moplaf.datatools.impl.DatatoolsPackageImpl#getColumnizerColumnOcl()
	 * @generated
	 */
	int COLUMNIZER_COLUMN_OCL = 31;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.datatools.impl.NavigationPathImpl <em>Navigation Path</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.datatools.impl.NavigationPathImpl
	 * @see com.misc.common.moplaf.datatools.impl.DatatoolsPackageImpl#getNavigationPath()
	 * @generated
	 */
	int NAVIGATION_PATH = 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.datatools.impl.NavigationAxisImpl <em>Navigation Axis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.datatools.impl.NavigationAxisImpl
	 * @see com.misc.common.moplaf.datatools.impl.DatatoolsPackageImpl#getNavigationAxis()
	 * @generated
	 */
	int NAVIGATION_AXIS = 1;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.datatools.impl.NavigationReferenceImpl <em>Navigation Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.datatools.impl.NavigationReferenceImpl
	 * @see com.misc.common.moplaf.datatools.impl.DatatoolsPackageImpl#getNavigationReference()
	 * @generated
	 */
	int NAVIGATION_REFERENCE = 2;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.datatools.impl.NavigationDowncastImpl <em>Navigation Downcast</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.datatools.impl.NavigationDowncastImpl
	 * @see com.misc.common.moplaf.datatools.impl.DatatoolsPackageImpl#getNavigationDowncast()
	 * @generated
	 */
	int NAVIGATION_DOWNCAST = 3;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.datatools.impl.MatcherImpl <em>Matcher</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.datatools.impl.MatcherImpl
	 * @see com.misc.common.moplaf.datatools.impl.DatatoolsPackageImpl#getMatcher()
	 * @generated
	 */
	int MATCHER = 38;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.datatools.impl.MatchImpl <em>Match</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.datatools.impl.MatchImpl
	 * @see com.misc.common.moplaf.datatools.impl.DatatoolsPackageImpl#getMatch()
	 * @generated
	 */
	int MATCH = 39;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.datatools.impl.DataToolAbstractImpl <em>Data Tool Abstract</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.datatools.impl.DataToolAbstractImpl
	 * @see com.misc.common.moplaf.datatools.impl.DatatoolsPackageImpl#getDataToolAbstract()
	 * @generated
	 */
	int DATA_TOOL_ABSTRACT = 6;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TOOL_ABSTRACT__CONTEXT = 0;

	/**
	 * The number of structural features of the '<em>Data Tool Abstract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TOOL_ABSTRACT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Data Tool Abstract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TOOL_ABSTRACT_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_PATH__CONTEXT = DATA_TOOL_ABSTRACT__CONTEXT;

	/**
	 * The feature id for the '<em><b>Path Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_PATH__PATH_ELEMENTS = DATA_TOOL_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_PATH__SOURCE_TYPE = DATA_TOOL_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_PATH__TARGET_TYPE = DATA_TOOL_ABSTRACT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_PATH__MANY = DATA_TOOL_ABSTRACT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_PATH__PATH = DATA_TOOL_ABSTRACT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Navigation Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_PATH_FEATURE_COUNT = DATA_TOOL_ABSTRACT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Navigation Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_PATH_OPERATION_COUNT = DATA_TOOL_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_AXIS__SOURCE_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Target Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_AXIS__TARGET_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Path</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_AXIS__PATH = 2;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_AXIS__PREVIOUS = 3;

	/**
	 * The feature id for the '<em><b>Path Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_AXIS__PATH_ELEMENT = 4;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_AXIS__NEXT = 5;

	/**
	 * The number of structural features of the '<em>Navigation Axis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_AXIS_FEATURE_COUNT = 6;

	/**
	 * The operation id for the '<em>Navigate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_AXIS___NAVIGATE__EOBJECT = 0;

	/**
	 * The operation id for the '<em>Navigate Many</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_AXIS___NAVIGATE_MANY__EOBJECT = 1;

	/**
	 * The number of operations of the '<em>Navigation Axis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_AXIS_OPERATION_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Source Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_REFERENCE__SOURCE_TYPE = NAVIGATION_AXIS__SOURCE_TYPE;

	/**
	 * The feature id for the '<em><b>Target Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_REFERENCE__TARGET_TYPE = NAVIGATION_AXIS__TARGET_TYPE;

	/**
	 * The feature id for the '<em><b>Path</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_REFERENCE__PATH = NAVIGATION_AXIS__PATH;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_REFERENCE__PREVIOUS = NAVIGATION_AXIS__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Path Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_REFERENCE__PATH_ELEMENT = NAVIGATION_AXIS__PATH_ELEMENT;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_REFERENCE__NEXT = NAVIGATION_AXIS__NEXT;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_REFERENCE__REFERENCE = NAVIGATION_AXIS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Navigation Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_REFERENCE_FEATURE_COUNT = NAVIGATION_AXIS_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Navigate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_REFERENCE___NAVIGATE__EOBJECT = NAVIGATION_AXIS___NAVIGATE__EOBJECT;

	/**
	 * The operation id for the '<em>Navigate Many</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_REFERENCE___NAVIGATE_MANY__EOBJECT = NAVIGATION_AXIS___NAVIGATE_MANY__EOBJECT;

	/**
	 * The number of operations of the '<em>Navigation Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_REFERENCE_OPERATION_COUNT = NAVIGATION_AXIS_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_DOWNCAST__SOURCE_TYPE = NAVIGATION_AXIS__SOURCE_TYPE;

	/**
	 * The feature id for the '<em><b>Target Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_DOWNCAST__TARGET_TYPE = NAVIGATION_AXIS__TARGET_TYPE;

	/**
	 * The feature id for the '<em><b>Path</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_DOWNCAST__PATH = NAVIGATION_AXIS__PATH;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_DOWNCAST__PREVIOUS = NAVIGATION_AXIS__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Path Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_DOWNCAST__PATH_ELEMENT = NAVIGATION_AXIS__PATH_ELEMENT;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_DOWNCAST__NEXT = NAVIGATION_AXIS__NEXT;

	/**
	 * The feature id for the '<em><b>Downcast Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_DOWNCAST__DOWNCAST_TYPE = NAVIGATION_AXIS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Navigation Downcast</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_DOWNCAST_FEATURE_COUNT = NAVIGATION_AXIS_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Navigate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_DOWNCAST___NAVIGATE__EOBJECT = NAVIGATION_AXIS___NAVIGATE__EOBJECT;

	/**
	 * The operation id for the '<em>Navigate Many</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_DOWNCAST___NAVIGATE_MANY__EOBJECT = NAVIGATION_AXIS___NAVIGATE_MANY__EOBJECT;

	/**
	 * The number of operations of the '<em>Navigation Downcast</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_DOWNCAST_OPERATION_COUNT = NAVIGATION_AXIS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.datatools.impl.DataToolContextImpl <em>Data Tool Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.datatools.impl.DataToolContextImpl
	 * @see com.misc.common.moplaf.datatools.impl.DatatoolsPackageImpl#getDataToolContext()
	 * @generated
	 */
	int DATA_TOOL_CONTEXT = 4;

	/**
	 * The number of structural features of the '<em>Data Tool Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TOOL_CONTEXT_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get Domain Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TOOL_CONTEXT___GET_DOMAIN_TYPES = 0;

	/**
	 * The number of operations of the '<em>Data Tool Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TOOL_CONTEXT_OPERATION_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TOOL__CONTEXT = DATA_TOOL_ABSTRACT__CONTEXT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TOOL__DESCRIPTION = DATA_TOOL_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TOOL__NAME = DATA_TOOL_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Data Tool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TOOL_FEATURE_COUNT = DATA_TOOL_ABSTRACT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Clone</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TOOL___CLONE = DATA_TOOL_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TOOL___GET_TYPE = DATA_TOOL_ABSTRACT_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Data Tool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TOOL_OPERATION_COUNT = DATA_TOOL_ABSTRACT_OPERATION_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR__CONTEXT = DATA_TOOL__CONTEXT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR__DESCRIPTION = DATA_TOOL__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR__NAME = DATA_TOOL__NAME;

	/**
	 * The feature id for the '<em><b>Extracted Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR__EXTRACTED_TYPE = DATA_TOOL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Extractor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FEATURE_COUNT = DATA_TOOL_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Clone</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR___CLONE = DATA_TOOL___CLONE;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR___GET_TYPE = DATA_TOOL___GET_TYPE;

	/**
	 * The operation id for the '<em>Extract</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR___EXTRACT__OBJECTSET_INT = DATA_TOOL_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Valid Root</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR___IS_VALID_ROOT__EOBJECT = DATA_TOOL_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Extractor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_OPERATION_COUNT = DATA_TOOL_OPERATION_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_TYPE__CONTEXT = EXTRACTOR__CONTEXT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_TYPE__DESCRIPTION = EXTRACTOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_TYPE__NAME = EXTRACTOR__NAME;

	/**
	 * The feature id for the '<em><b>Extracted Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_TYPE__EXTRACTED_TYPE = EXTRACTOR__EXTRACTED_TYPE;

	/**
	 * The feature id for the '<em><b>Target Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_TYPE__TARGET_TYPE = EXTRACTOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Extractor Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_TYPE_FEATURE_COUNT = EXTRACTOR_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Clone</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_TYPE___CLONE = EXTRACTOR___CLONE;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_TYPE___GET_TYPE = EXTRACTOR___GET_TYPE;

	/**
	 * The operation id for the '<em>Extract</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_TYPE___EXTRACT__OBJECTSET_INT = EXTRACTOR___EXTRACT__OBJECTSET_INT;

	/**
	 * The operation id for the '<em>Is Valid Root</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_TYPE___IS_VALID_ROOT__EOBJECT = EXTRACTOR___IS_VALID_ROOT__EOBJECT;

	/**
	 * The number of operations of the '<em>Extractor Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_TYPE_OPERATION_COUNT = EXTRACTOR_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_PATH__CONTEXT = EXTRACTOR__CONTEXT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_PATH__DESCRIPTION = EXTRACTOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_PATH__NAME = EXTRACTOR__NAME;

	/**
	 * The feature id for the '<em><b>Extracted Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_PATH__EXTRACTED_TYPE = EXTRACTOR__EXTRACTED_TYPE;

	/**
	 * The feature id for the '<em><b>Path Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_PATH__PATH_ELEMENTS = EXTRACTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_PATH__SOURCE_TYPE = EXTRACTOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_PATH__TARGET_TYPE = EXTRACTOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_PATH__MANY = EXTRACTOR_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_PATH__PATH = EXTRACTOR_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Extractor Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_PATH_FEATURE_COUNT = EXTRACTOR_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Clone</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_PATH___CLONE = EXTRACTOR___CLONE;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_PATH___GET_TYPE = EXTRACTOR___GET_TYPE;

	/**
	 * The operation id for the '<em>Extract</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_PATH___EXTRACT__OBJECTSET_INT = EXTRACTOR___EXTRACT__OBJECTSET_INT;

	/**
	 * The operation id for the '<em>Is Valid Root</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_PATH___IS_VALID_ROOT__EOBJECT = EXTRACTOR___IS_VALID_ROOT__EOBJECT;

	/**
	 * The number of operations of the '<em>Extractor Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_PATH_OPERATION_COUNT = EXTRACTOR_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_OCL__CONTEXT = EXTRACTOR__CONTEXT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_OCL__DESCRIPTION = EXTRACTOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_OCL__NAME = EXTRACTOR__NAME;

	/**
	 * The feature id for the '<em><b>Extracted Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_OCL__EXTRACTED_TYPE = EXTRACTOR__EXTRACTED_TYPE;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_OCL__EXPRESSION = EXTRACTOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Extractor Ocl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_OCL_FEATURE_COUNT = EXTRACTOR_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Clone</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_OCL___CLONE = EXTRACTOR___CLONE;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_OCL___GET_TYPE = EXTRACTOR___GET_TYPE;

	/**
	 * The operation id for the '<em>Extract</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_OCL___EXTRACT__OBJECTSET_INT = EXTRACTOR___EXTRACT__OBJECTSET_INT;

	/**
	 * The operation id for the '<em>Is Valid Root</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_OCL___IS_VALID_ROOT__EOBJECT = EXTRACTOR___IS_VALID_ROOT__EOBJECT;

	/**
	 * The number of operations of the '<em>Extractor Ocl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_OCL_OPERATION_COUNT = EXTRACTOR_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER__CONTEXT = EXTRACTOR__CONTEXT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER__DESCRIPTION = EXTRACTOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER__NAME = EXTRACTOR__NAME;

	/**
	 * The feature id for the '<em><b>Extracted Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER__EXTRACTED_TYPE = EXTRACTOR__EXTRACTED_TYPE;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER__ENABLED = EXTRACTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER__NEGATED = EXTRACTOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Extractor Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_FEATURE_COUNT = EXTRACTOR_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Clone</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER___CLONE = EXTRACTOR___CLONE;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER___GET_TYPE = EXTRACTOR___GET_TYPE;

	/**
	 * The operation id for the '<em>Extract</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER___EXTRACT__OBJECTSET_INT = EXTRACTOR___EXTRACT__OBJECTSET_INT;

	/**
	 * The operation id for the '<em>Is Valid Root</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER___IS_VALID_ROOT__EOBJECT = EXTRACTOR___IS_VALID_ROOT__EOBJECT;

	/**
	 * The operation id for the '<em>Satisfies Filter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER___SATISFIES_FILTER__EOBJECT = EXTRACTOR_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Extractor Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_OPERATION_COUNT = EXTRACTOR_OPERATION_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_ATTRIBUTE__CONTEXT = EXTRACTOR_FILTER__CONTEXT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_ATTRIBUTE__DESCRIPTION = EXTRACTOR_FILTER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_ATTRIBUTE__NAME = EXTRACTOR_FILTER__NAME;

	/**
	 * The feature id for the '<em><b>Extracted Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_ATTRIBUTE__EXTRACTED_TYPE = EXTRACTOR_FILTER__EXTRACTED_TYPE;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_ATTRIBUTE__ENABLED = EXTRACTOR_FILTER__ENABLED;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_ATTRIBUTE__NEGATED = EXTRACTOR_FILTER__NEGATED;

	/**
	 * The feature id for the '<em><b>Path Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_ATTRIBUTE__PATH_ELEMENTS = EXTRACTOR_FILTER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_ATTRIBUTE__SOURCE_TYPE = EXTRACTOR_FILTER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_ATTRIBUTE__TARGET_TYPE = EXTRACTOR_FILTER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_ATTRIBUTE__MANY = EXTRACTOR_FILTER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_ATTRIBUTE__PATH = EXTRACTOR_FILTER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_ATTRIBUTE__ATTRIBUTE = EXTRACTOR_FILTER_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Extractor Filter Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_ATTRIBUTE_FEATURE_COUNT = EXTRACTOR_FILTER_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Clone</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_ATTRIBUTE___CLONE = EXTRACTOR_FILTER___CLONE;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_ATTRIBUTE___GET_TYPE = EXTRACTOR_FILTER___GET_TYPE;

	/**
	 * The operation id for the '<em>Extract</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_ATTRIBUTE___EXTRACT__OBJECTSET_INT = EXTRACTOR_FILTER___EXTRACT__OBJECTSET_INT;

	/**
	 * The operation id for the '<em>Is Valid Root</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_ATTRIBUTE___IS_VALID_ROOT__EOBJECT = EXTRACTOR_FILTER___IS_VALID_ROOT__EOBJECT;

	/**
	 * The operation id for the '<em>Satisfies Filter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_ATTRIBUTE___SATISFIES_FILTER__EOBJECT = EXTRACTOR_FILTER___SATISFIES_FILTER__EOBJECT;

	/**
	 * The operation id for the '<em>Get Attribute Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_ATTRIBUTE___GET_ATTRIBUTE_VALUE__EOBJECT = EXTRACTOR_FILTER_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Extractor Filter Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_ATTRIBUTE_OPERATION_COUNT = EXTRACTOR_FILTER_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.datatools.impl.ColumnizerAbstractImpl <em>Columnizer Abstract</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.datatools.impl.ColumnizerAbstractImpl
	 * @see com.misc.common.moplaf.datatools.impl.DatatoolsPackageImpl#getColumnizerAbstract()
	 * @generated
	 */
	int COLUMNIZER_ABSTRACT = 26;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.datatools.impl.SuperCategoryImpl <em>Super Category</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.datatools.impl.SuperCategoryImpl
	 * @see com.misc.common.moplaf.datatools.impl.DatatoolsPackageImpl#getSuperCategory()
	 * @generated
	 */
	int SUPER_CATEGORY = 33;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.datatools.impl.CategorizerStructuralFeatureImpl <em>Categorizer Structural Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.datatools.impl.CategorizerStructuralFeatureImpl
	 * @see com.misc.common.moplaf.datatools.impl.DatatoolsPackageImpl#getCategorizerStructuralFeature()
	 * @generated
	 */
	int CATEGORIZER_STRUCTURAL_FEATURE = 36;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.datatools.impl.CategorizerOclImpl <em>Categorizer Ocl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.datatools.impl.CategorizerOclImpl
	 * @see com.misc.common.moplaf.datatools.impl.DatatoolsPackageImpl#getCategorizerOcl()
	 * @generated
	 */
	int CATEGORIZER_OCL = 37;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.datatools.impl.ColumnizerGridImpl <em>Columnizer Grid</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.datatools.impl.ColumnizerGridImpl
	 * @see com.misc.common.moplaf.datatools.impl.DatatoolsPackageImpl#getColumnizerGrid()
	 * @generated
	 */
	int COLUMNIZER_GRID = 28;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.datatools.impl.ExtractorFilterAttributeStringImpl <em>Extractor Filter Attribute String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.datatools.impl.ExtractorFilterAttributeStringImpl
	 * @see com.misc.common.moplaf.datatools.impl.DatatoolsPackageImpl#getExtractorFilterAttributeString()
	 * @generated
	 */
	int EXTRACTOR_FILTER_ATTRIBUTE_STRING = 13;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_ATTRIBUTE_STRING__CONTEXT = EXTRACTOR_FILTER_ATTRIBUTE__CONTEXT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_ATTRIBUTE_STRING__DESCRIPTION = EXTRACTOR_FILTER_ATTRIBUTE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_ATTRIBUTE_STRING__NAME = EXTRACTOR_FILTER_ATTRIBUTE__NAME;

	/**
	 * The feature id for the '<em><b>Extracted Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_ATTRIBUTE_STRING__EXTRACTED_TYPE = EXTRACTOR_FILTER_ATTRIBUTE__EXTRACTED_TYPE;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_ATTRIBUTE_STRING__ENABLED = EXTRACTOR_FILTER_ATTRIBUTE__ENABLED;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_ATTRIBUTE_STRING__NEGATED = EXTRACTOR_FILTER_ATTRIBUTE__NEGATED;

	/**
	 * The feature id for the '<em><b>Path Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_ATTRIBUTE_STRING__PATH_ELEMENTS = EXTRACTOR_FILTER_ATTRIBUTE__PATH_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Source Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_ATTRIBUTE_STRING__SOURCE_TYPE = EXTRACTOR_FILTER_ATTRIBUTE__SOURCE_TYPE;

	/**
	 * The feature id for the '<em><b>Target Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_ATTRIBUTE_STRING__TARGET_TYPE = EXTRACTOR_FILTER_ATTRIBUTE__TARGET_TYPE;

	/**
	 * The feature id for the '<em><b>Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_ATTRIBUTE_STRING__MANY = EXTRACTOR_FILTER_ATTRIBUTE__MANY;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_ATTRIBUTE_STRING__PATH = EXTRACTOR_FILTER_ATTRIBUTE__PATH;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_ATTRIBUTE_STRING__ATTRIBUTE = EXTRACTOR_FILTER_ATTRIBUTE__ATTRIBUTE;

	/**
	 * The number of structural features of the '<em>Extractor Filter Attribute String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_ATTRIBUTE_STRING_FEATURE_COUNT = EXTRACTOR_FILTER_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Clone</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_ATTRIBUTE_STRING___CLONE = EXTRACTOR_FILTER_ATTRIBUTE___CLONE;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_ATTRIBUTE_STRING___GET_TYPE = EXTRACTOR_FILTER_ATTRIBUTE___GET_TYPE;

	/**
	 * The operation id for the '<em>Extract</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_ATTRIBUTE_STRING___EXTRACT__OBJECTSET_INT = EXTRACTOR_FILTER_ATTRIBUTE___EXTRACT__OBJECTSET_INT;

	/**
	 * The operation id for the '<em>Is Valid Root</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_ATTRIBUTE_STRING___IS_VALID_ROOT__EOBJECT = EXTRACTOR_FILTER_ATTRIBUTE___IS_VALID_ROOT__EOBJECT;

	/**
	 * The operation id for the '<em>Satisfies Filter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_ATTRIBUTE_STRING___SATISFIES_FILTER__EOBJECT = EXTRACTOR_FILTER_ATTRIBUTE___SATISFIES_FILTER__EOBJECT;

	/**
	 * The operation id for the '<em>Get Attribute Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_ATTRIBUTE_STRING___GET_ATTRIBUTE_VALUE__EOBJECT = EXTRACTOR_FILTER_ATTRIBUTE___GET_ATTRIBUTE_VALUE__EOBJECT;

	/**
	 * The number of operations of the '<em>Extractor Filter Attribute String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_ATTRIBUTE_STRING_OPERATION_COUNT = EXTRACTOR_FILTER_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.datatools.impl.ExtractorFilterRegexImpl <em>Extractor Filter Regex</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.datatools.impl.ExtractorFilterRegexImpl
	 * @see com.misc.common.moplaf.datatools.impl.DatatoolsPackageImpl#getExtractorFilterRegex()
	 * @generated
	 */
	int EXTRACTOR_FILTER_REGEX = 14;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_REGEX__CONTEXT = EXTRACTOR_FILTER_ATTRIBUTE_STRING__CONTEXT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_REGEX__DESCRIPTION = EXTRACTOR_FILTER_ATTRIBUTE_STRING__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_REGEX__NAME = EXTRACTOR_FILTER_ATTRIBUTE_STRING__NAME;

	/**
	 * The feature id for the '<em><b>Extracted Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_REGEX__EXTRACTED_TYPE = EXTRACTOR_FILTER_ATTRIBUTE_STRING__EXTRACTED_TYPE;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_REGEX__ENABLED = EXTRACTOR_FILTER_ATTRIBUTE_STRING__ENABLED;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_REGEX__NEGATED = EXTRACTOR_FILTER_ATTRIBUTE_STRING__NEGATED;

	/**
	 * The feature id for the '<em><b>Path Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_REGEX__PATH_ELEMENTS = EXTRACTOR_FILTER_ATTRIBUTE_STRING__PATH_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Source Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_REGEX__SOURCE_TYPE = EXTRACTOR_FILTER_ATTRIBUTE_STRING__SOURCE_TYPE;

	/**
	 * The feature id for the '<em><b>Target Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_REGEX__TARGET_TYPE = EXTRACTOR_FILTER_ATTRIBUTE_STRING__TARGET_TYPE;

	/**
	 * The feature id for the '<em><b>Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_REGEX__MANY = EXTRACTOR_FILTER_ATTRIBUTE_STRING__MANY;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_REGEX__PATH = EXTRACTOR_FILTER_ATTRIBUTE_STRING__PATH;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_REGEX__ATTRIBUTE = EXTRACTOR_FILTER_ATTRIBUTE_STRING__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_REGEX__PATTERN = EXTRACTOR_FILTER_ATTRIBUTE_STRING_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Extractor Filter Regex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_REGEX_FEATURE_COUNT = EXTRACTOR_FILTER_ATTRIBUTE_STRING_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Clone</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_REGEX___CLONE = EXTRACTOR_FILTER_ATTRIBUTE_STRING___CLONE;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_REGEX___GET_TYPE = EXTRACTOR_FILTER_ATTRIBUTE_STRING___GET_TYPE;

	/**
	 * The operation id for the '<em>Extract</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_REGEX___EXTRACT__OBJECTSET_INT = EXTRACTOR_FILTER_ATTRIBUTE_STRING___EXTRACT__OBJECTSET_INT;

	/**
	 * The operation id for the '<em>Is Valid Root</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_REGEX___IS_VALID_ROOT__EOBJECT = EXTRACTOR_FILTER_ATTRIBUTE_STRING___IS_VALID_ROOT__EOBJECT;

	/**
	 * The operation id for the '<em>Satisfies Filter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_REGEX___SATISFIES_FILTER__EOBJECT = EXTRACTOR_FILTER_ATTRIBUTE_STRING___SATISFIES_FILTER__EOBJECT;

	/**
	 * The operation id for the '<em>Get Attribute Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_REGEX___GET_ATTRIBUTE_VALUE__EOBJECT = EXTRACTOR_FILTER_ATTRIBUTE_STRING___GET_ATTRIBUTE_VALUE__EOBJECT;

	/**
	 * The number of operations of the '<em>Extractor Filter Regex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_REGEX_OPERATION_COUNT = EXTRACTOR_FILTER_ATTRIBUTE_STRING_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_ATTRIBUTE_INT__CONTEXT = EXTRACTOR_FILTER_ATTRIBUTE__CONTEXT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_ATTRIBUTE_INT__DESCRIPTION = EXTRACTOR_FILTER_ATTRIBUTE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_ATTRIBUTE_INT__NAME = EXTRACTOR_FILTER_ATTRIBUTE__NAME;

	/**
	 * The feature id for the '<em><b>Extracted Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_ATTRIBUTE_INT__EXTRACTED_TYPE = EXTRACTOR_FILTER_ATTRIBUTE__EXTRACTED_TYPE;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_ATTRIBUTE_INT__ENABLED = EXTRACTOR_FILTER_ATTRIBUTE__ENABLED;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_ATTRIBUTE_INT__NEGATED = EXTRACTOR_FILTER_ATTRIBUTE__NEGATED;

	/**
	 * The feature id for the '<em><b>Path Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_ATTRIBUTE_INT__PATH_ELEMENTS = EXTRACTOR_FILTER_ATTRIBUTE__PATH_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Source Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_ATTRIBUTE_INT__SOURCE_TYPE = EXTRACTOR_FILTER_ATTRIBUTE__SOURCE_TYPE;

	/**
	 * The feature id for the '<em><b>Target Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_ATTRIBUTE_INT__TARGET_TYPE = EXTRACTOR_FILTER_ATTRIBUTE__TARGET_TYPE;

	/**
	 * The feature id for the '<em><b>Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_ATTRIBUTE_INT__MANY = EXTRACTOR_FILTER_ATTRIBUTE__MANY;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_ATTRIBUTE_INT__PATH = EXTRACTOR_FILTER_ATTRIBUTE__PATH;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_ATTRIBUTE_INT__ATTRIBUTE = EXTRACTOR_FILTER_ATTRIBUTE__ATTRIBUTE;

	/**
	 * The number of structural features of the '<em>Extractor Filter Attribute Int</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_ATTRIBUTE_INT_FEATURE_COUNT = EXTRACTOR_FILTER_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Clone</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_ATTRIBUTE_INT___CLONE = EXTRACTOR_FILTER_ATTRIBUTE___CLONE;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_ATTRIBUTE_INT___GET_TYPE = EXTRACTOR_FILTER_ATTRIBUTE___GET_TYPE;

	/**
	 * The operation id for the '<em>Extract</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_ATTRIBUTE_INT___EXTRACT__OBJECTSET_INT = EXTRACTOR_FILTER_ATTRIBUTE___EXTRACT__OBJECTSET_INT;

	/**
	 * The operation id for the '<em>Is Valid Root</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_ATTRIBUTE_INT___IS_VALID_ROOT__EOBJECT = EXTRACTOR_FILTER_ATTRIBUTE___IS_VALID_ROOT__EOBJECT;

	/**
	 * The operation id for the '<em>Satisfies Filter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_ATTRIBUTE_INT___SATISFIES_FILTER__EOBJECT = EXTRACTOR_FILTER_ATTRIBUTE___SATISFIES_FILTER__EOBJECT;

	/**
	 * The operation id for the '<em>Get Attribute Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_ATTRIBUTE_INT___GET_ATTRIBUTE_VALUE__EOBJECT = EXTRACTOR_FILTER_ATTRIBUTE___GET_ATTRIBUTE_VALUE__EOBJECT;

	/**
	 * The number of operations of the '<em>Extractor Filter Attribute Int</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_ATTRIBUTE_INT_OPERATION_COUNT = EXTRACTOR_FILTER_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.datatools.impl.ExtractorFilterAttributeIntRangeImpl <em>Extractor Filter Attribute Int Range</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.datatools.impl.ExtractorFilterAttributeIntRangeImpl
	 * @see com.misc.common.moplaf.datatools.impl.DatatoolsPackageImpl#getExtractorFilterAttributeIntRange()
	 * @generated
	 */
	int EXTRACTOR_FILTER_ATTRIBUTE_INT_RANGE = 16;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_ATTRIBUTE_INT_RANGE__CONTEXT = EXTRACTOR_FILTER_ATTRIBUTE_INT__CONTEXT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_ATTRIBUTE_INT_RANGE__DESCRIPTION = EXTRACTOR_FILTER_ATTRIBUTE_INT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_ATTRIBUTE_INT_RANGE__NAME = EXTRACTOR_FILTER_ATTRIBUTE_INT__NAME;

	/**
	 * The feature id for the '<em><b>Extracted Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_ATTRIBUTE_INT_RANGE__EXTRACTED_TYPE = EXTRACTOR_FILTER_ATTRIBUTE_INT__EXTRACTED_TYPE;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_ATTRIBUTE_INT_RANGE__ENABLED = EXTRACTOR_FILTER_ATTRIBUTE_INT__ENABLED;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_ATTRIBUTE_INT_RANGE__NEGATED = EXTRACTOR_FILTER_ATTRIBUTE_INT__NEGATED;

	/**
	 * The feature id for the '<em><b>Path Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_ATTRIBUTE_INT_RANGE__PATH_ELEMENTS = EXTRACTOR_FILTER_ATTRIBUTE_INT__PATH_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Source Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_ATTRIBUTE_INT_RANGE__SOURCE_TYPE = EXTRACTOR_FILTER_ATTRIBUTE_INT__SOURCE_TYPE;

	/**
	 * The feature id for the '<em><b>Target Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_ATTRIBUTE_INT_RANGE__TARGET_TYPE = EXTRACTOR_FILTER_ATTRIBUTE_INT__TARGET_TYPE;

	/**
	 * The feature id for the '<em><b>Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_ATTRIBUTE_INT_RANGE__MANY = EXTRACTOR_FILTER_ATTRIBUTE_INT__MANY;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_ATTRIBUTE_INT_RANGE__PATH = EXTRACTOR_FILTER_ATTRIBUTE_INT__PATH;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_ATTRIBUTE_INT_RANGE__ATTRIBUTE = EXTRACTOR_FILTER_ATTRIBUTE_INT__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Min Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_ATTRIBUTE_INT_RANGE__MIN_VALUE = EXTRACTOR_FILTER_ATTRIBUTE_INT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_ATTRIBUTE_INT_RANGE__MAX_VALUE = EXTRACTOR_FILTER_ATTRIBUTE_INT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Extractor Filter Attribute Int Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_ATTRIBUTE_INT_RANGE_FEATURE_COUNT = EXTRACTOR_FILTER_ATTRIBUTE_INT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Clone</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_ATTRIBUTE_INT_RANGE___CLONE = EXTRACTOR_FILTER_ATTRIBUTE_INT___CLONE;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_ATTRIBUTE_INT_RANGE___GET_TYPE = EXTRACTOR_FILTER_ATTRIBUTE_INT___GET_TYPE;

	/**
	 * The operation id for the '<em>Extract</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_ATTRIBUTE_INT_RANGE___EXTRACT__OBJECTSET_INT = EXTRACTOR_FILTER_ATTRIBUTE_INT___EXTRACT__OBJECTSET_INT;

	/**
	 * The operation id for the '<em>Is Valid Root</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_ATTRIBUTE_INT_RANGE___IS_VALID_ROOT__EOBJECT = EXTRACTOR_FILTER_ATTRIBUTE_INT___IS_VALID_ROOT__EOBJECT;

	/**
	 * The operation id for the '<em>Satisfies Filter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_ATTRIBUTE_INT_RANGE___SATISFIES_FILTER__EOBJECT = EXTRACTOR_FILTER_ATTRIBUTE_INT___SATISFIES_FILTER__EOBJECT;

	/**
	 * The operation id for the '<em>Get Attribute Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_ATTRIBUTE_INT_RANGE___GET_ATTRIBUTE_VALUE__EOBJECT = EXTRACTOR_FILTER_ATTRIBUTE_INT___GET_ATTRIBUTE_VALUE__EOBJECT;

	/**
	 * The number of operations of the '<em>Extractor Filter Attribute Int Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_ATTRIBUTE_INT_RANGE_OPERATION_COUNT = EXTRACTOR_FILTER_ATTRIBUTE_INT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_OCL__CONTEXT = EXTRACTOR_FILTER__CONTEXT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_OCL__DESCRIPTION = EXTRACTOR_FILTER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_OCL__NAME = EXTRACTOR_FILTER__NAME;

	/**
	 * The feature id for the '<em><b>Extracted Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_OCL__EXTRACTED_TYPE = EXTRACTOR_FILTER__EXTRACTED_TYPE;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_OCL__ENABLED = EXTRACTOR_FILTER__ENABLED;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_OCL__NEGATED = EXTRACTOR_FILTER__NEGATED;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_OCL__EXPRESSION = EXTRACTOR_FILTER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Extractor Filter Ocl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_OCL_FEATURE_COUNT = EXTRACTOR_FILTER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Clone</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_OCL___CLONE = EXTRACTOR_FILTER___CLONE;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_OCL___GET_TYPE = EXTRACTOR_FILTER___GET_TYPE;

	/**
	 * The operation id for the '<em>Extract</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_OCL___EXTRACT__OBJECTSET_INT = EXTRACTOR_FILTER___EXTRACT__OBJECTSET_INT;

	/**
	 * The operation id for the '<em>Is Valid Root</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_OCL___IS_VALID_ROOT__EOBJECT = EXTRACTOR_FILTER___IS_VALID_ROOT__EOBJECT;

	/**
	 * The operation id for the '<em>Satisfies Filter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_OCL___SATISFIES_FILTER__EOBJECT = EXTRACTOR_FILTER___SATISFIES_FILTER__EOBJECT;

	/**
	 * The number of operations of the '<em>Extractor Filter Ocl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_OCL_OPERATION_COUNT = EXTRACTOR_FILTER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.datatools.impl.ExtractorFilterCompoundImpl <em>Extractor Filter Compound</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.datatools.impl.ExtractorFilterCompoundImpl
	 * @see com.misc.common.moplaf.datatools.impl.DatatoolsPackageImpl#getExtractorFilterCompound()
	 * @generated
	 */
	int EXTRACTOR_FILTER_COMPOUND = 18;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_COMPOUND__CONTEXT = EXTRACTOR_FILTER__CONTEXT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_COMPOUND__DESCRIPTION = EXTRACTOR_FILTER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_COMPOUND__NAME = EXTRACTOR_FILTER__NAME;

	/**
	 * The feature id for the '<em><b>Extracted Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_COMPOUND__EXTRACTED_TYPE = EXTRACTOR_FILTER__EXTRACTED_TYPE;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_COMPOUND__ENABLED = EXTRACTOR_FILTER__ENABLED;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_COMPOUND__NEGATED = EXTRACTOR_FILTER__NEGATED;

	/**
	 * The feature id for the '<em><b>Filters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_COMPOUND__FILTERS = EXTRACTOR_FILTER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Extractor Filter Compound</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_COMPOUND_FEATURE_COUNT = EXTRACTOR_FILTER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Clone</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_COMPOUND___CLONE = EXTRACTOR_FILTER___CLONE;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_COMPOUND___GET_TYPE = EXTRACTOR_FILTER___GET_TYPE;

	/**
	 * The operation id for the '<em>Extract</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_COMPOUND___EXTRACT__OBJECTSET_INT = EXTRACTOR_FILTER___EXTRACT__OBJECTSET_INT;

	/**
	 * The operation id for the '<em>Is Valid Root</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_COMPOUND___IS_VALID_ROOT__EOBJECT = EXTRACTOR_FILTER___IS_VALID_ROOT__EOBJECT;

	/**
	 * The operation id for the '<em>Satisfies Filter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_COMPOUND___SATISFIES_FILTER__EOBJECT = EXTRACTOR_FILTER___SATISFIES_FILTER__EOBJECT;

	/**
	 * The number of operations of the '<em>Extractor Filter Compound</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_COMPOUND_OPERATION_COUNT = EXTRACTOR_FILTER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.datatools.impl.ExtractorFilterANDImpl <em>Extractor Filter AND</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.datatools.impl.ExtractorFilterANDImpl
	 * @see com.misc.common.moplaf.datatools.impl.DatatoolsPackageImpl#getExtractorFilterAND()
	 * @generated
	 */
	int EXTRACTOR_FILTER_AND = 19;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_AND__CONTEXT = EXTRACTOR_FILTER_COMPOUND__CONTEXT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_AND__DESCRIPTION = EXTRACTOR_FILTER_COMPOUND__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_AND__NAME = EXTRACTOR_FILTER_COMPOUND__NAME;

	/**
	 * The feature id for the '<em><b>Extracted Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_AND__EXTRACTED_TYPE = EXTRACTOR_FILTER_COMPOUND__EXTRACTED_TYPE;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_AND__ENABLED = EXTRACTOR_FILTER_COMPOUND__ENABLED;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_AND__NEGATED = EXTRACTOR_FILTER_COMPOUND__NEGATED;

	/**
	 * The feature id for the '<em><b>Filters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_AND__FILTERS = EXTRACTOR_FILTER_COMPOUND__FILTERS;

	/**
	 * The number of structural features of the '<em>Extractor Filter AND</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_AND_FEATURE_COUNT = EXTRACTOR_FILTER_COMPOUND_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Clone</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_AND___CLONE = EXTRACTOR_FILTER_COMPOUND___CLONE;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_AND___GET_TYPE = EXTRACTOR_FILTER_COMPOUND___GET_TYPE;

	/**
	 * The operation id for the '<em>Extract</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_AND___EXTRACT__OBJECTSET_INT = EXTRACTOR_FILTER_COMPOUND___EXTRACT__OBJECTSET_INT;

	/**
	 * The operation id for the '<em>Is Valid Root</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_AND___IS_VALID_ROOT__EOBJECT = EXTRACTOR_FILTER_COMPOUND___IS_VALID_ROOT__EOBJECT;

	/**
	 * The operation id for the '<em>Satisfies Filter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_AND___SATISFIES_FILTER__EOBJECT = EXTRACTOR_FILTER_COMPOUND___SATISFIES_FILTER__EOBJECT;

	/**
	 * The number of operations of the '<em>Extractor Filter AND</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_AND_OPERATION_COUNT = EXTRACTOR_FILTER_COMPOUND_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.datatools.impl.ExtractorFilterORImpl <em>Extractor Filter OR</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.datatools.impl.ExtractorFilterORImpl
	 * @see com.misc.common.moplaf.datatools.impl.DatatoolsPackageImpl#getExtractorFilterOR()
	 * @generated
	 */
	int EXTRACTOR_FILTER_OR = 20;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_OR__CONTEXT = EXTRACTOR_FILTER_COMPOUND__CONTEXT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_OR__DESCRIPTION = EXTRACTOR_FILTER_COMPOUND__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_OR__NAME = EXTRACTOR_FILTER_COMPOUND__NAME;

	/**
	 * The feature id for the '<em><b>Extracted Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_OR__EXTRACTED_TYPE = EXTRACTOR_FILTER_COMPOUND__EXTRACTED_TYPE;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_OR__ENABLED = EXTRACTOR_FILTER_COMPOUND__ENABLED;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_OR__NEGATED = EXTRACTOR_FILTER_COMPOUND__NEGATED;

	/**
	 * The feature id for the '<em><b>Filters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_OR__FILTERS = EXTRACTOR_FILTER_COMPOUND__FILTERS;

	/**
	 * The number of structural features of the '<em>Extractor Filter OR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_OR_FEATURE_COUNT = EXTRACTOR_FILTER_COMPOUND_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Clone</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_OR___CLONE = EXTRACTOR_FILTER_COMPOUND___CLONE;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_OR___GET_TYPE = EXTRACTOR_FILTER_COMPOUND___GET_TYPE;

	/**
	 * The operation id for the '<em>Extract</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_OR___EXTRACT__OBJECTSET_INT = EXTRACTOR_FILTER_COMPOUND___EXTRACT__OBJECTSET_INT;

	/**
	 * The operation id for the '<em>Is Valid Root</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_OR___IS_VALID_ROOT__EOBJECT = EXTRACTOR_FILTER_COMPOUND___IS_VALID_ROOT__EOBJECT;

	/**
	 * The operation id for the '<em>Satisfies Filter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_OR___SATISFIES_FILTER__EOBJECT = EXTRACTOR_FILTER_COMPOUND___SATISFIES_FILTER__EOBJECT;

	/**
	 * The number of operations of the '<em>Extractor Filter OR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_OR_OPERATION_COUNT = EXTRACTOR_FILTER_COMPOUND_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_COMPOUND__CONTEXT = EXTRACTOR__CONTEXT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_COMPOUND__DESCRIPTION = EXTRACTOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_COMPOUND__NAME = EXTRACTOR__NAME;

	/**
	 * The feature id for the '<em><b>Extracted Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_COMPOUND__EXTRACTED_TYPE = EXTRACTOR__EXTRACTED_TYPE;

	/**
	 * The feature id for the '<em><b>Extractors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_COMPOUND__EXTRACTORS = EXTRACTOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Extractor Compound</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_COMPOUND_FEATURE_COUNT = EXTRACTOR_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Clone</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_COMPOUND___CLONE = EXTRACTOR___CLONE;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_COMPOUND___GET_TYPE = EXTRACTOR___GET_TYPE;

	/**
	 * The operation id for the '<em>Extract</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_COMPOUND___EXTRACT__OBJECTSET_INT = EXTRACTOR___EXTRACT__OBJECTSET_INT;

	/**
	 * The operation id for the '<em>Is Valid Root</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_COMPOUND___IS_VALID_ROOT__EOBJECT = EXTRACTOR___IS_VALID_ROOT__EOBJECT;

	/**
	 * The number of operations of the '<em>Extractor Compound</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_COMPOUND_OPERATION_COUNT = EXTRACTOR_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_LOGIC__CONTEXT = EXTRACTOR_COMPOUND__CONTEXT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_LOGIC__DESCRIPTION = EXTRACTOR_COMPOUND__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_LOGIC__NAME = EXTRACTOR_COMPOUND__NAME;

	/**
	 * The feature id for the '<em><b>Extracted Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_LOGIC__EXTRACTED_TYPE = EXTRACTOR_COMPOUND__EXTRACTED_TYPE;

	/**
	 * The feature id for the '<em><b>Extractors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_LOGIC__EXTRACTORS = EXTRACTOR_COMPOUND__EXTRACTORS;

	/**
	 * The number of structural features of the '<em>Extractor Logic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_LOGIC_FEATURE_COUNT = EXTRACTOR_COMPOUND_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Clone</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_LOGIC___CLONE = EXTRACTOR_COMPOUND___CLONE;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_LOGIC___GET_TYPE = EXTRACTOR_COMPOUND___GET_TYPE;

	/**
	 * The operation id for the '<em>Extract</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_LOGIC___EXTRACT__OBJECTSET_INT = EXTRACTOR_COMPOUND___EXTRACT__OBJECTSET_INT;

	/**
	 * The operation id for the '<em>Is Valid Root</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_LOGIC___IS_VALID_ROOT__EOBJECT = EXTRACTOR_COMPOUND___IS_VALID_ROOT__EOBJECT;

	/**
	 * The number of operations of the '<em>Extractor Logic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_LOGIC_OPERATION_COUNT = EXTRACTOR_COMPOUND_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_PIPE__CONTEXT = EXTRACTOR_COMPOUND__CONTEXT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_PIPE__DESCRIPTION = EXTRACTOR_COMPOUND__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_PIPE__NAME = EXTRACTOR_COMPOUND__NAME;

	/**
	 * The feature id for the '<em><b>Extracted Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_PIPE__EXTRACTED_TYPE = EXTRACTOR_COMPOUND__EXTRACTED_TYPE;

	/**
	 * The feature id for the '<em><b>Extractors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_PIPE__EXTRACTORS = EXTRACTOR_COMPOUND__EXTRACTORS;

	/**
	 * The number of structural features of the '<em>Extractor Pipe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_PIPE_FEATURE_COUNT = EXTRACTOR_COMPOUND_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Clone</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_PIPE___CLONE = EXTRACTOR_COMPOUND___CLONE;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_PIPE___GET_TYPE = EXTRACTOR_COMPOUND___GET_TYPE;

	/**
	 * The operation id for the '<em>Extract</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_PIPE___EXTRACT__OBJECTSET_INT = EXTRACTOR_COMPOUND___EXTRACT__OBJECTSET_INT;

	/**
	 * The operation id for the '<em>Is Valid Root</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_PIPE___IS_VALID_ROOT__EOBJECT = EXTRACTOR_COMPOUND___IS_VALID_ROOT__EOBJECT;

	/**
	 * The number of operations of the '<em>Extractor Pipe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_PIPE_OPERATION_COUNT = EXTRACTOR_COMPOUND_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_UNION__CONTEXT = EXTRACTOR_LOGIC__CONTEXT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_UNION__DESCRIPTION = EXTRACTOR_LOGIC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_UNION__NAME = EXTRACTOR_LOGIC__NAME;

	/**
	 * The feature id for the '<em><b>Extracted Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_UNION__EXTRACTED_TYPE = EXTRACTOR_LOGIC__EXTRACTED_TYPE;

	/**
	 * The feature id for the '<em><b>Extractors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_UNION__EXTRACTORS = EXTRACTOR_LOGIC__EXTRACTORS;

	/**
	 * The number of structural features of the '<em>Extractor Union</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_UNION_FEATURE_COUNT = EXTRACTOR_LOGIC_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Clone</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_UNION___CLONE = EXTRACTOR_LOGIC___CLONE;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_UNION___GET_TYPE = EXTRACTOR_LOGIC___GET_TYPE;

	/**
	 * The operation id for the '<em>Extract</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_UNION___EXTRACT__OBJECTSET_INT = EXTRACTOR_LOGIC___EXTRACT__OBJECTSET_INT;

	/**
	 * The operation id for the '<em>Is Valid Root</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_UNION___IS_VALID_ROOT__EOBJECT = EXTRACTOR_LOGIC___IS_VALID_ROOT__EOBJECT;

	/**
	 * The number of operations of the '<em>Extractor Union</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_UNION_OPERATION_COUNT = EXTRACTOR_LOGIC_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_INTERSECTION__CONTEXT = EXTRACTOR_LOGIC__CONTEXT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_INTERSECTION__DESCRIPTION = EXTRACTOR_LOGIC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_INTERSECTION__NAME = EXTRACTOR_LOGIC__NAME;

	/**
	 * The feature id for the '<em><b>Extracted Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_INTERSECTION__EXTRACTED_TYPE = EXTRACTOR_LOGIC__EXTRACTED_TYPE;

	/**
	 * The feature id for the '<em><b>Extractors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_INTERSECTION__EXTRACTORS = EXTRACTOR_LOGIC__EXTRACTORS;

	/**
	 * The number of structural features of the '<em>Extractor Intersection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_INTERSECTION_FEATURE_COUNT = EXTRACTOR_LOGIC_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Clone</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_INTERSECTION___CLONE = EXTRACTOR_LOGIC___CLONE;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_INTERSECTION___GET_TYPE = EXTRACTOR_LOGIC___GET_TYPE;

	/**
	 * The operation id for the '<em>Extract</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_INTERSECTION___EXTRACT__OBJECTSET_INT = EXTRACTOR_LOGIC___EXTRACT__OBJECTSET_INT;

	/**
	 * The operation id for the '<em>Is Valid Root</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_INTERSECTION___IS_VALID_ROOT__EOBJECT = EXTRACTOR_LOGIC___IS_VALID_ROOT__EOBJECT;

	/**
	 * The number of operations of the '<em>Extractor Intersection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_INTERSECTION_OPERATION_COUNT = EXTRACTOR_LOGIC_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMNIZER_ABSTRACT__CONTEXT = DATA_TOOL__CONTEXT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMNIZER_ABSTRACT__DESCRIPTION = DATA_TOOL__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMNIZER_ABSTRACT__NAME = DATA_TOOL__NAME;

	/**
	 * The number of structural features of the '<em>Columnizer Abstract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMNIZER_ABSTRACT_FEATURE_COUNT = DATA_TOOL_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Clone</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMNIZER_ABSTRACT___CLONE = DATA_TOOL___CLONE;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMNIZER_ABSTRACT___GET_TYPE = DATA_TOOL___GET_TYPE;

	/**
	 * The operation id for the '<em>Is Valid Element Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMNIZER_ABSTRACT___IS_VALID_ELEMENT_TYPE__ECLASS = DATA_TOOL_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Columnizer Abstract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMNIZER_ABSTRACT_OPERATION_COUNT = DATA_TOOL_OPERATION_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMNIZER__CONTEXT = COLUMNIZER_ABSTRACT__CONTEXT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMNIZER__DESCRIPTION = COLUMNIZER_ABSTRACT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMNIZER__NAME = COLUMNIZER_ABSTRACT__NAME;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMNIZER__COLUMNS = COLUMNIZER_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Grids</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMNIZER__GRIDS = COLUMNIZER_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Columnizer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMNIZER_FEATURE_COUNT = COLUMNIZER_ABSTRACT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Clone</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMNIZER___CLONE = COLUMNIZER_ABSTRACT___CLONE;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMNIZER___GET_TYPE = COLUMNIZER_ABSTRACT___GET_TYPE;

	/**
	 * The operation id for the '<em>Is Valid Element Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMNIZER___IS_VALID_ELEMENT_TYPE__ECLASS = COLUMNIZER_ABSTRACT___IS_VALID_ELEMENT_TYPE__ECLASS;

	/**
	 * The number of operations of the '<em>Columnizer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMNIZER_OPERATION_COUNT = COLUMNIZER_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMNIZER_GRID__COLUMNS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMNIZER_GRID__NAME = 1;

	/**
	 * The number of structural features of the '<em>Columnizer Grid</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMNIZER_GRID_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Columnizer Grid</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMNIZER_GRID_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMNIZER_COLUMN__NAME = 0;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMNIZER_COLUMN__WIDTH = 1;

	/**
	 * The feature id for the '<em><b>Grids</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMNIZER_COLUMN__GRIDS = 2;

	/**
	 * The feature id for the '<em><b>Columnizer</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMNIZER_COLUMN__COLUMNIZER = 3;

	/**
	 * The number of structural features of the '<em>Columnizer Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMNIZER_COLUMN_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMNIZER_COLUMN___GET_VALUE__EOBJECT = 0;

	/**
	 * The operation id for the '<em>Is Valid Element Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMNIZER_COLUMN___IS_VALID_ELEMENT_TYPE__ECLASS = 1;

	/**
	 * The number of operations of the '<em>Columnizer Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMNIZER_COLUMN_OPERATION_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMNIZER_COLUMN_ATTRIBUTE__NAME = COLUMNIZER_COLUMN__NAME;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMNIZER_COLUMN_ATTRIBUTE__WIDTH = COLUMNIZER_COLUMN__WIDTH;

	/**
	 * The feature id for the '<em><b>Grids</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMNIZER_COLUMN_ATTRIBUTE__GRIDS = COLUMNIZER_COLUMN__GRIDS;

	/**
	 * The feature id for the '<em><b>Columnizer</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMNIZER_COLUMN_ATTRIBUTE__COLUMNIZER = COLUMNIZER_COLUMN__COLUMNIZER;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMNIZER_COLUMN_ATTRIBUTE__CONTEXT = COLUMNIZER_COLUMN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Path Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMNIZER_COLUMN_ATTRIBUTE__PATH_ELEMENTS = COLUMNIZER_COLUMN_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Source Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMNIZER_COLUMN_ATTRIBUTE__SOURCE_TYPE = COLUMNIZER_COLUMN_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Target Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMNIZER_COLUMN_ATTRIBUTE__TARGET_TYPE = COLUMNIZER_COLUMN_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMNIZER_COLUMN_ATTRIBUTE__MANY = COLUMNIZER_COLUMN_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMNIZER_COLUMN_ATTRIBUTE__PATH = COLUMNIZER_COLUMN_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMNIZER_COLUMN_ATTRIBUTE__ATTRIBUTE = COLUMNIZER_COLUMN_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Columnizer Column Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMNIZER_COLUMN_ATTRIBUTE_FEATURE_COUNT = COLUMNIZER_COLUMN_FEATURE_COUNT + 7;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMNIZER_COLUMN_ATTRIBUTE___GET_VALUE__EOBJECT = COLUMNIZER_COLUMN___GET_VALUE__EOBJECT;

	/**
	 * The operation id for the '<em>Is Valid Element Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMNIZER_COLUMN_ATTRIBUTE___IS_VALID_ELEMENT_TYPE__ECLASS = COLUMNIZER_COLUMN___IS_VALID_ELEMENT_TYPE__ECLASS;

	/**
	 * The number of operations of the '<em>Columnizer Column Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMNIZER_COLUMN_ATTRIBUTE_OPERATION_COUNT = COLUMNIZER_COLUMN_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMNIZER_COLUMN_OCL__NAME = COLUMNIZER_COLUMN__NAME;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMNIZER_COLUMN_OCL__WIDTH = COLUMNIZER_COLUMN__WIDTH;

	/**
	 * The feature id for the '<em><b>Grids</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMNIZER_COLUMN_OCL__GRIDS = COLUMNIZER_COLUMN__GRIDS;

	/**
	 * The feature id for the '<em><b>Columnizer</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMNIZER_COLUMN_OCL__COLUMNIZER = COLUMNIZER_COLUMN__COLUMNIZER;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMNIZER_COLUMN_OCL__EXPRESSION = COLUMNIZER_COLUMN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Columnizer Column Ocl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMNIZER_COLUMN_OCL_FEATURE_COUNT = COLUMNIZER_COLUMN_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMNIZER_COLUMN_OCL___GET_VALUE__EOBJECT = COLUMNIZER_COLUMN___GET_VALUE__EOBJECT;

	/**
	 * The operation id for the '<em>Is Valid Element Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMNIZER_COLUMN_OCL___IS_VALID_ELEMENT_TYPE__ECLASS = COLUMNIZER_COLUMN___IS_VALID_ELEMENT_TYPE__ECLASS;

	/**
	 * The number of operations of the '<em>Columnizer Column Ocl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMNIZER_COLUMN_OCL_OPERATION_COUNT = COLUMNIZER_COLUMN_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sub Categories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_ABSTRACT__SUB_CATEGORIES = 0;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_ABSTRACT__ELEMENTS = 1;

	/**
	 * The feature id for the '<em><b>Nb Elements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_ABSTRACT__NB_ELEMENTS = 2;

	/**
	 * The feature id for the '<em><b>Category Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_ABSTRACT__CATEGORY_LABEL = 3;

	/**
	 * The feature id for the '<em><b>Category Columnizer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_ABSTRACT__CATEGORY_COLUMNIZER = 4;

	/**
	 * The number of structural features of the '<em>Category Abstract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_ABSTRACT_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Get Subcategory</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_ABSTRACT___GET_SUBCATEGORY__EOBJECT = 0;

	/**
	 * The operation id for the '<em>Refresh Cats</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_ABSTRACT___REFRESH_CATS__OBJECTSET_ELIST_INT = 1;

	/**
	 * The operation id for the '<em>Set Columnizer All</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_ABSTRACT___SET_COLUMNIZER_ALL__COLUMNIZERABSTRACT = 2;

	/**
	 * The operation id for the '<em>Flush</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_ABSTRACT___FLUSH = 3;

	/**
	 * The number of operations of the '<em>Category Abstract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_ABSTRACT_OPERATION_COUNT = 4;

	/**
	 * The feature id for the '<em><b>Sub Categories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_CATEGORY__SUB_CATEGORIES = CATEGORY_ABSTRACT__SUB_CATEGORIES;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_CATEGORY__ELEMENTS = CATEGORY_ABSTRACT__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Nb Elements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_CATEGORY__NB_ELEMENTS = CATEGORY_ABSTRACT__NB_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Category Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_CATEGORY__CATEGORY_LABEL = CATEGORY_ABSTRACT__CATEGORY_LABEL;

	/**
	 * The feature id for the '<em><b>Category Columnizer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_CATEGORY__CATEGORY_COLUMNIZER = CATEGORY_ABSTRACT__CATEGORY_COLUMNIZER;

	/**
	 * The number of structural features of the '<em>Super Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_CATEGORY_FEATURE_COUNT = CATEGORY_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Subcategory</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_CATEGORY___GET_SUBCATEGORY__EOBJECT = CATEGORY_ABSTRACT___GET_SUBCATEGORY__EOBJECT;

	/**
	 * The operation id for the '<em>Refresh Cats</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_CATEGORY___REFRESH_CATS__OBJECTSET_ELIST_INT = CATEGORY_ABSTRACT___REFRESH_CATS__OBJECTSET_ELIST_INT;

	/**
	 * The operation id for the '<em>Set Columnizer All</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_CATEGORY___SET_COLUMNIZER_ALL__COLUMNIZERABSTRACT = CATEGORY_ABSTRACT___SET_COLUMNIZER_ALL__COLUMNIZERABSTRACT;

	/**
	 * The operation id for the '<em>Flush</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_CATEGORY___FLUSH = CATEGORY_ABSTRACT___FLUSH;

	/**
	 * The operation id for the '<em>Refresh Cats</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_CATEGORY___REFRESH_CATS__OBJECTSET_ELIST = CATEGORY_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Super Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_CATEGORY_OPERATION_COUNT = CATEGORY_ABSTRACT_OPERATION_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sub Categories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__SUB_CATEGORIES = CATEGORY_ABSTRACT__SUB_CATEGORIES;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__ELEMENTS = CATEGORY_ABSTRACT__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Nb Elements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__NB_ELEMENTS = CATEGORY_ABSTRACT__NB_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Category Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__CATEGORY_LABEL = CATEGORY_ABSTRACT__CATEGORY_LABEL;

	/**
	 * The feature id for the '<em><b>Category Columnizer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__CATEGORY_COLUMNIZER = CATEGORY_ABSTRACT__CATEGORY_COLUMNIZER;

	/**
	 * The feature id for the '<em><b>Categorizer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__CATEGORIZER = CATEGORY_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Category Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__CATEGORY_VALUE = CATEGORY_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_FEATURE_COUNT = CATEGORY_ABSTRACT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Subcategory</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY___GET_SUBCATEGORY__EOBJECT = CATEGORY_ABSTRACT___GET_SUBCATEGORY__EOBJECT;

	/**
	 * The operation id for the '<em>Refresh Cats</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY___REFRESH_CATS__OBJECTSET_ELIST_INT = CATEGORY_ABSTRACT___REFRESH_CATS__OBJECTSET_ELIST_INT;

	/**
	 * The operation id for the '<em>Set Columnizer All</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY___SET_COLUMNIZER_ALL__COLUMNIZERABSTRACT = CATEGORY_ABSTRACT___SET_COLUMNIZER_ALL__COLUMNIZERABSTRACT;

	/**
	 * The operation id for the '<em>Flush</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY___FLUSH = CATEGORY_ABSTRACT___FLUSH;

	/**
	 * The number of operations of the '<em>Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_OPERATION_COUNT = CATEGORY_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIZER__CONTEXT = DATA_TOOL__CONTEXT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIZER__DESCRIPTION = DATA_TOOL__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIZER__NAME = DATA_TOOL__NAME;

	/**
	 * The number of structural features of the '<em>Categorizer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIZER_FEATURE_COUNT = DATA_TOOL_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Clone</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIZER___CLONE = DATA_TOOL___CLONE;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIZER___GET_TYPE = DATA_TOOL___GET_TYPE;

	/**
	 * The operation id for the '<em>Construct Category</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIZER___CONSTRUCT_CATEGORY = DATA_TOOL_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Category Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIZER___GET_CATEGORY_VALUE__EOBJECT = DATA_TOOL_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Category Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIZER___GET_CATEGORY_LABEL__OBJECT = DATA_TOOL_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Is Valid Element Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIZER___IS_VALID_ELEMENT_TYPE__ECLASS = DATA_TOOL_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>Categorizer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIZER_OPERATION_COUNT = DATA_TOOL_OPERATION_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIZER_STRUCTURAL_FEATURE__CONTEXT = CATEGORIZER__CONTEXT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIZER_STRUCTURAL_FEATURE__DESCRIPTION = CATEGORIZER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIZER_STRUCTURAL_FEATURE__NAME = CATEGORIZER__NAME;

	/**
	 * The feature id for the '<em><b>Path Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIZER_STRUCTURAL_FEATURE__PATH_ELEMENTS = CATEGORIZER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIZER_STRUCTURAL_FEATURE__SOURCE_TYPE = CATEGORIZER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIZER_STRUCTURAL_FEATURE__TARGET_TYPE = CATEGORIZER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIZER_STRUCTURAL_FEATURE__MANY = CATEGORIZER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIZER_STRUCTURAL_FEATURE__PATH = CATEGORIZER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIZER_STRUCTURAL_FEATURE__FEATURE = CATEGORIZER_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Categorizer Structural Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIZER_STRUCTURAL_FEATURE_FEATURE_COUNT = CATEGORIZER_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Clone</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIZER_STRUCTURAL_FEATURE___CLONE = CATEGORIZER___CLONE;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIZER_STRUCTURAL_FEATURE___GET_TYPE = CATEGORIZER___GET_TYPE;

	/**
	 * The operation id for the '<em>Construct Category</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIZER_STRUCTURAL_FEATURE___CONSTRUCT_CATEGORY = CATEGORIZER___CONSTRUCT_CATEGORY;

	/**
	 * The operation id for the '<em>Get Category Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIZER_STRUCTURAL_FEATURE___GET_CATEGORY_VALUE__EOBJECT = CATEGORIZER___GET_CATEGORY_VALUE__EOBJECT;

	/**
	 * The operation id for the '<em>Get Category Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIZER_STRUCTURAL_FEATURE___GET_CATEGORY_LABEL__OBJECT = CATEGORIZER___GET_CATEGORY_LABEL__OBJECT;

	/**
	 * The operation id for the '<em>Is Valid Element Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIZER_STRUCTURAL_FEATURE___IS_VALID_ELEMENT_TYPE__ECLASS = CATEGORIZER___IS_VALID_ELEMENT_TYPE__ECLASS;

	/**
	 * The number of operations of the '<em>Categorizer Structural Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIZER_STRUCTURAL_FEATURE_OPERATION_COUNT = CATEGORIZER_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIZER_OCL__CONTEXT = CATEGORIZER__CONTEXT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIZER_OCL__DESCRIPTION = CATEGORIZER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIZER_OCL__NAME = CATEGORIZER__NAME;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIZER_OCL__EXPRESSION = CATEGORIZER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Categorizer Ocl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIZER_OCL_FEATURE_COUNT = CATEGORIZER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Clone</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIZER_OCL___CLONE = CATEGORIZER___CLONE;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIZER_OCL___GET_TYPE = CATEGORIZER___GET_TYPE;

	/**
	 * The operation id for the '<em>Construct Category</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIZER_OCL___CONSTRUCT_CATEGORY = CATEGORIZER___CONSTRUCT_CATEGORY;

	/**
	 * The operation id for the '<em>Get Category Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIZER_OCL___GET_CATEGORY_VALUE__EOBJECT = CATEGORIZER___GET_CATEGORY_VALUE__EOBJECT;

	/**
	 * The operation id for the '<em>Get Category Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIZER_OCL___GET_CATEGORY_LABEL__OBJECT = CATEGORIZER___GET_CATEGORY_LABEL__OBJECT;

	/**
	 * The operation id for the '<em>Is Valid Element Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIZER_OCL___IS_VALID_ELEMENT_TYPE__ECLASS = CATEGORIZER___IS_VALID_ELEMENT_TYPE__ECLASS;

	/**
	 * The number of operations of the '<em>Categorizer Ocl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIZER_OCL_OPERATION_COUNT = CATEGORIZER_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Matches</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHER__MATCHES = 0;

	/**
	 * The number of structural features of the '<em>Matcher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHER_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Refresh Matches</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHER___REFRESH_MATCHES__EOBJECT_EOBJECT = 0;

	/**
	 * The number of operations of the '<em>Matcher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHER_OPERATION_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Object1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__OBJECT1 = 0;

	/**
	 * The feature id for the '<em><b>Object2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__OBJECT2 = 1;

	/**
	 * The number of structural features of the '<em>Match</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Match</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.datatools.DataToolType <em>Data Tool Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.datatools.DataToolType
	 * @see com.misc.common.moplaf.datatools.impl.DatatoolsPackageImpl#getDataToolType()
	 * @generated
	 */
	int DATA_TOOL_TYPE = 40;

	/**
	 * The meta object id for the '<em>EObjects Set</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.datatools.util.ObjectSet
	 * @see com.misc.common.moplaf.datatools.impl.DatatoolsPackageImpl#getEObjectsSet()
	 * @generated
	 */
	int EOBJECTS_SET = 41;

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.datatools.Categorizer <em>Categorizer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Categorizer</em>'.
	 * @see com.misc.common.moplaf.datatools.Categorizer
	 * @generated
	 */
	EClass getCategorizer();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.datatools.Categorizer#getCategoryValue(org.eclipse.emf.ecore.EObject) <em>Get Category Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Category Value</em>' operation.
	 * @see com.misc.common.moplaf.datatools.Categorizer#getCategoryValue(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getCategorizer__GetCategoryValue__EObject();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.datatools.Categorizer#getCategoryLabel(java.lang.Object) <em>Get Category Label</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Category Label</em>' operation.
	 * @see com.misc.common.moplaf.datatools.Categorizer#getCategoryLabel(java.lang.Object)
	 * @generated
	 */
	EOperation getCategorizer__GetCategoryLabel__Object();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.datatools.Categorizer#isValidElementType(org.eclipse.emf.ecore.EClass) <em>Is Valid Element Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Valid Element Type</em>' operation.
	 * @see com.misc.common.moplaf.datatools.Categorizer#isValidElementType(org.eclipse.emf.ecore.EClass)
	 * @generated
	 */
	EOperation getCategorizer__IsValidElementType__EClass();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.datatools.Categorizer#constructCategory() <em>Construct Category</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Construct Category</em>' operation.
	 * @see com.misc.common.moplaf.datatools.Categorizer#constructCategory()
	 * @generated
	 */
	EOperation getCategorizer__ConstructCategory();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.datatools.Category <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Category</em>'.
	 * @see com.misc.common.moplaf.datatools.Category
	 * @generated
	 */
	EClass getCategory();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.datatools.Category#getCategorizer <em>Categorizer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Categorizer</em>'.
	 * @see com.misc.common.moplaf.datatools.Category#getCategorizer()
	 * @see #getCategory()
	 * @generated
	 */
	EReference getCategory_Categorizer();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.datatools.Category#getCategoryValue <em>Category Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Category Value</em>'.
	 * @see com.misc.common.moplaf.datatools.Category#getCategoryValue()
	 * @see #getCategory()
	 * @generated
	 */
	EAttribute getCategory_CategoryValue();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.datatools.Extractor <em>Extractor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extractor</em>'.
	 * @see com.misc.common.moplaf.datatools.Extractor
	 * @generated
	 */
	EClass getExtractor();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.datatools.Extractor#getExtractedType <em>Extracted Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Extracted Type</em>'.
	 * @see com.misc.common.moplaf.datatools.Extractor#getExtractedType()
	 * @see #getExtractor()
	 * @generated
	 */
	EReference getExtractor_ExtractedType();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.datatools.Extractor#extract(com.misc.common.moplaf.datatools.util.ObjectSet, int) <em>Extract</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Extract</em>' operation.
	 * @see com.misc.common.moplaf.datatools.Extractor#extract(com.misc.common.moplaf.datatools.util.ObjectSet, int)
	 * @generated
	 */
	EOperation getExtractor__Extract__ObjectSet_int();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.datatools.Extractor#isValidRoot(org.eclipse.emf.ecore.EObject) <em>Is Valid Root</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Valid Root</em>' operation.
	 * @see com.misc.common.moplaf.datatools.Extractor#isValidRoot(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getExtractor__IsValidRoot__EObject();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.datatools.Columnizer <em>Columnizer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Columnizer</em>'.
	 * @see com.misc.common.moplaf.datatools.Columnizer
	 * @generated
	 */
	EClass getColumnizer();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.common.moplaf.datatools.Columnizer#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Columns</em>'.
	 * @see com.misc.common.moplaf.datatools.Columnizer#getColumns()
	 * @see #getColumnizer()
	 * @generated
	 */
	EReference getColumnizer_Columns();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.common.moplaf.datatools.Columnizer#getGrids <em>Grids</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Grids</em>'.
	 * @see com.misc.common.moplaf.datatools.Columnizer#getGrids()
	 * @see #getColumnizer()
	 * @generated
	 */
	EReference getColumnizer_Grids();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.datatools.CategoryAbstract <em>Category Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Category Abstract</em>'.
	 * @see com.misc.common.moplaf.datatools.CategoryAbstract
	 * @generated
	 */
	EClass getCategoryAbstract();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.common.moplaf.datatools.CategoryAbstract#getSubCategories <em>Sub Categories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Categories</em>'.
	 * @see com.misc.common.moplaf.datatools.CategoryAbstract#getSubCategories()
	 * @see #getCategoryAbstract()
	 * @generated
	 */
	EReference getCategoryAbstract_SubCategories();

	/**
	 * Returns the meta object for the reference list '{@link com.misc.common.moplaf.datatools.CategoryAbstract#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Elements</em>'.
	 * @see com.misc.common.moplaf.datatools.CategoryAbstract#getElements()
	 * @see #getCategoryAbstract()
	 * @generated
	 */
	EReference getCategoryAbstract_Elements();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.datatools.CategoryAbstract#getNbElements <em>Nb Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nb Elements</em>'.
	 * @see com.misc.common.moplaf.datatools.CategoryAbstract#getNbElements()
	 * @see #getCategoryAbstract()
	 * @generated
	 */
	EAttribute getCategoryAbstract_NbElements();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.datatools.CategoryAbstract#getCategoryLabel <em>Category Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Category Label</em>'.
	 * @see com.misc.common.moplaf.datatools.CategoryAbstract#getCategoryLabel()
	 * @see #getCategoryAbstract()
	 * @generated
	 */
	EAttribute getCategoryAbstract_CategoryLabel();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.datatools.CategoryAbstract#getCategoryColumnizer <em>Category Columnizer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Category Columnizer</em>'.
	 * @see com.misc.common.moplaf.datatools.CategoryAbstract#getCategoryColumnizer()
	 * @see #getCategoryAbstract()
	 * @generated
	 */
	EReference getCategoryAbstract_CategoryColumnizer();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.datatools.CategoryAbstract#getSubcategory(org.eclipse.emf.ecore.EObject) <em>Get Subcategory</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Subcategory</em>' operation.
	 * @see com.misc.common.moplaf.datatools.CategoryAbstract#getSubcategory(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getCategoryAbstract__GetSubcategory__EObject();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.datatools.CategoryAbstract#refreshCats(com.misc.common.moplaf.datatools.util.ObjectSet, org.eclipse.emf.common.util.EList, int) <em>Refresh Cats</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Refresh Cats</em>' operation.
	 * @see com.misc.common.moplaf.datatools.CategoryAbstract#refreshCats(com.misc.common.moplaf.datatools.util.ObjectSet, org.eclipse.emf.common.util.EList, int)
	 * @generated
	 */
	EOperation getCategoryAbstract__RefreshCats__ObjectSet_EList_int();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.datatools.CategoryAbstract#setColumnizerAll(com.misc.common.moplaf.datatools.ColumnizerAbstract) <em>Set Columnizer All</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Columnizer All</em>' operation.
	 * @see com.misc.common.moplaf.datatools.CategoryAbstract#setColumnizerAll(com.misc.common.moplaf.datatools.ColumnizerAbstract)
	 * @generated
	 */
	EOperation getCategoryAbstract__SetColumnizerAll__ColumnizerAbstract();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.datatools.CategoryAbstract#flush() <em>Flush</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Flush</em>' operation.
	 * @see com.misc.common.moplaf.datatools.CategoryAbstract#flush()
	 * @generated
	 */
	EOperation getCategoryAbstract__Flush();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.datatools.CategorizerStructuralFeature <em>Categorizer Structural Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Categorizer Structural Feature</em>'.
	 * @see com.misc.common.moplaf.datatools.CategorizerStructuralFeature
	 * @generated
	 */
	EClass getCategorizerStructuralFeature();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.datatools.CategorizerStructuralFeature#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Feature</em>'.
	 * @see com.misc.common.moplaf.datatools.CategorizerStructuralFeature#getFeature()
	 * @see #getCategorizerStructuralFeature()
	 * @generated
	 */
	EReference getCategorizerStructuralFeature_Feature();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.datatools.CategorizerOcl <em>Categorizer Ocl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Categorizer Ocl</em>'.
	 * @see com.misc.common.moplaf.datatools.CategorizerOcl
	 * @generated
	 */
	EClass getCategorizerOcl();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.datatools.CategorizerOcl#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see com.misc.common.moplaf.datatools.CategorizerOcl#getExpression()
	 * @see #getCategorizerOcl()
	 * @generated
	 */
	EAttribute getCategorizerOcl_Expression();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.datatools.ExtractorType <em>Extractor Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extractor Type</em>'.
	 * @see com.misc.common.moplaf.datatools.ExtractorType
	 * @generated
	 */
	EClass getExtractorType();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.datatools.ExtractorType#getTargetType <em>Target Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Type</em>'.
	 * @see com.misc.common.moplaf.datatools.ExtractorType#getTargetType()
	 * @see #getExtractorType()
	 * @generated
	 */
	EReference getExtractorType_TargetType();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.datatools.ExtractorCompound <em>Extractor Compound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extractor Compound</em>'.
	 * @see com.misc.common.moplaf.datatools.ExtractorCompound
	 * @generated
	 */
	EClass getExtractorCompound();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.common.moplaf.datatools.ExtractorCompound#getExtractors <em>Extractors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Extractors</em>'.
	 * @see com.misc.common.moplaf.datatools.ExtractorCompound#getExtractors()
	 * @see #getExtractorCompound()
	 * @generated
	 */
	EReference getExtractorCompound_Extractors();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.datatools.ExtractorPipe <em>Extractor Pipe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extractor Pipe</em>'.
	 * @see com.misc.common.moplaf.datatools.ExtractorPipe
	 * @generated
	 */
	EClass getExtractorPipe();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.datatools.ExtractorLogic <em>Extractor Logic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extractor Logic</em>'.
	 * @see com.misc.common.moplaf.datatools.ExtractorLogic
	 * @generated
	 */
	EClass getExtractorLogic();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.datatools.ExtractorUnion <em>Extractor Union</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extractor Union</em>'.
	 * @see com.misc.common.moplaf.datatools.ExtractorUnion
	 * @generated
	 */
	EClass getExtractorUnion();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.datatools.ExtractorIntersection <em>Extractor Intersection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extractor Intersection</em>'.
	 * @see com.misc.common.moplaf.datatools.ExtractorIntersection
	 * @generated
	 */
	EClass getExtractorIntersection();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.datatools.ColumnizerAbstract <em>Columnizer Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Columnizer Abstract</em>'.
	 * @see com.misc.common.moplaf.datatools.ColumnizerAbstract
	 * @generated
	 */
	EClass getColumnizerAbstract();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.datatools.ColumnizerAbstract#isValidElementType(org.eclipse.emf.ecore.EClass) <em>Is Valid Element Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Valid Element Type</em>' operation.
	 * @see com.misc.common.moplaf.datatools.ColumnizerAbstract#isValidElementType(org.eclipse.emf.ecore.EClass)
	 * @generated
	 */
	EOperation getColumnizerAbstract__IsValidElementType__EClass();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.datatools.ExtractorPath <em>Extractor Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extractor Path</em>'.
	 * @see com.misc.common.moplaf.datatools.ExtractorPath
	 * @generated
	 */
	EClass getExtractorPath();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.datatools.ExtractorOcl <em>Extractor Ocl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extractor Ocl</em>'.
	 * @see com.misc.common.moplaf.datatools.ExtractorOcl
	 * @generated
	 */
	EClass getExtractorOcl();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.datatools.ExtractorOcl#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see com.misc.common.moplaf.datatools.ExtractorOcl#getExpression()
	 * @see #getExtractorOcl()
	 * @generated
	 */
	EAttribute getExtractorOcl_Expression();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.datatools.ExtractorFilter <em>Extractor Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extractor Filter</em>'.
	 * @see com.misc.common.moplaf.datatools.ExtractorFilter
	 * @generated
	 */
	EClass getExtractorFilter();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.datatools.ExtractorFilter#isEnabled <em>Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enabled</em>'.
	 * @see com.misc.common.moplaf.datatools.ExtractorFilter#isEnabled()
	 * @see #getExtractorFilter()
	 * @generated
	 */
	EAttribute getExtractorFilter_Enabled();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.datatools.ExtractorFilter#isNegated <em>Negated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Negated</em>'.
	 * @see com.misc.common.moplaf.datatools.ExtractorFilter#isNegated()
	 * @see #getExtractorFilter()
	 * @generated
	 */
	EAttribute getExtractorFilter_Negated();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.datatools.ExtractorFilter#satisfiesFilter(org.eclipse.emf.ecore.EObject) <em>Satisfies Filter</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Satisfies Filter</em>' operation.
	 * @see com.misc.common.moplaf.datatools.ExtractorFilter#satisfiesFilter(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getExtractorFilter__SatisfiesFilter__EObject();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.datatools.ExtractorFilterAttribute <em>Extractor Filter Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extractor Filter Attribute</em>'.
	 * @see com.misc.common.moplaf.datatools.ExtractorFilterAttribute
	 * @generated
	 */
	EClass getExtractorFilterAttribute();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.datatools.ExtractorFilterAttribute#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute</em>'.
	 * @see com.misc.common.moplaf.datatools.ExtractorFilterAttribute#getAttribute()
	 * @see #getExtractorFilterAttribute()
	 * @generated
	 */
	EReference getExtractorFilterAttribute_Attribute();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.datatools.ExtractorFilterAttribute#getAttributeValue(org.eclipse.emf.ecore.EObject) <em>Get Attribute Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Attribute Value</em>' operation.
	 * @see com.misc.common.moplaf.datatools.ExtractorFilterAttribute#getAttributeValue(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getExtractorFilterAttribute__GetAttributeValue__EObject();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.datatools.ExtractorFilterAttributeInt <em>Extractor Filter Attribute Int</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extractor Filter Attribute Int</em>'.
	 * @see com.misc.common.moplaf.datatools.ExtractorFilterAttributeInt
	 * @generated
	 */
	EClass getExtractorFilterAttributeInt();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.datatools.ExtractorFilterOcl <em>Extractor Filter Ocl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extractor Filter Ocl</em>'.
	 * @see com.misc.common.moplaf.datatools.ExtractorFilterOcl
	 * @generated
	 */
	EClass getExtractorFilterOcl();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.datatools.ExtractorFilterOcl#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see com.misc.common.moplaf.datatools.ExtractorFilterOcl#getExpression()
	 * @see #getExtractorFilterOcl()
	 * @generated
	 */
	EAttribute getExtractorFilterOcl_Expression();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.datatools.ColumnizerColumn <em>Columnizer Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Columnizer Column</em>'.
	 * @see com.misc.common.moplaf.datatools.ColumnizerColumn
	 * @generated
	 */
	EClass getColumnizerColumn();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.datatools.ColumnizerColumn#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.misc.common.moplaf.datatools.ColumnizerColumn#getName()
	 * @see #getColumnizerColumn()
	 * @generated
	 */
	EAttribute getColumnizerColumn_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.datatools.ColumnizerColumn#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see com.misc.common.moplaf.datatools.ColumnizerColumn#getWidth()
	 * @see #getColumnizerColumn()
	 * @generated
	 */
	EAttribute getColumnizerColumn_Width();

	/**
	 * Returns the meta object for the reference list '{@link com.misc.common.moplaf.datatools.ColumnizerColumn#getGrids <em>Grids</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Grids</em>'.
	 * @see com.misc.common.moplaf.datatools.ColumnizerColumn#getGrids()
	 * @see #getColumnizerColumn()
	 * @generated
	 */
	EReference getColumnizerColumn_Grids();

	/**
	 * Returns the meta object for the container reference '{@link com.misc.common.moplaf.datatools.ColumnizerColumn#getColumnizer <em>Columnizer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Columnizer</em>'.
	 * @see com.misc.common.moplaf.datatools.ColumnizerColumn#getColumnizer()
	 * @see #getColumnizerColumn()
	 * @generated
	 */
	EReference getColumnizerColumn_Columnizer();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.datatools.ColumnizerColumn#getValue(org.eclipse.emf.ecore.EObject) <em>Get Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Value</em>' operation.
	 * @see com.misc.common.moplaf.datatools.ColumnizerColumn#getValue(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getColumnizerColumn__GetValue__EObject();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.datatools.ColumnizerColumn#isValidElementType(org.eclipse.emf.ecore.EClass) <em>Is Valid Element Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Valid Element Type</em>' operation.
	 * @see com.misc.common.moplaf.datatools.ColumnizerColumn#isValidElementType(org.eclipse.emf.ecore.EClass)
	 * @generated
	 */
	EOperation getColumnizerColumn__IsValidElementType__EClass();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.datatools.ColumnizerColumnAttribute <em>Columnizer Column Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Columnizer Column Attribute</em>'.
	 * @see com.misc.common.moplaf.datatools.ColumnizerColumnAttribute
	 * @generated
	 */
	EClass getColumnizerColumnAttribute();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.datatools.ColumnizerColumnAttribute#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute</em>'.
	 * @see com.misc.common.moplaf.datatools.ColumnizerColumnAttribute#getAttribute()
	 * @see #getColumnizerColumnAttribute()
	 * @generated
	 */
	EReference getColumnizerColumnAttribute_Attribute();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.datatools.ColumnizerColumnOcl <em>Columnizer Column Ocl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Columnizer Column Ocl</em>'.
	 * @see com.misc.common.moplaf.datatools.ColumnizerColumnOcl
	 * @generated
	 */
	EClass getColumnizerColumnOcl();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.datatools.ColumnizerColumnOcl#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see com.misc.common.moplaf.datatools.ColumnizerColumnOcl#getExpression()
	 * @see #getColumnizerColumnOcl()
	 * @generated
	 */
	EAttribute getColumnizerColumnOcl_Expression();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.datatools.SuperCategory <em>Super Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Super Category</em>'.
	 * @see com.misc.common.moplaf.datatools.SuperCategory
	 * @generated
	 */
	EClass getSuperCategory();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.datatools.SuperCategory#refreshCats(com.misc.common.moplaf.datatools.util.ObjectSet, org.eclipse.emf.common.util.EList) <em>Refresh Cats</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Refresh Cats</em>' operation.
	 * @see com.misc.common.moplaf.datatools.SuperCategory#refreshCats(com.misc.common.moplaf.datatools.util.ObjectSet, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getSuperCategory__RefreshCats__ObjectSet_EList();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.datatools.NavigationPath <em>Navigation Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Navigation Path</em>'.
	 * @see com.misc.common.moplaf.datatools.NavigationPath
	 * @generated
	 */
	EClass getNavigationPath();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.common.moplaf.datatools.NavigationPath#getPathElements <em>Path Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Path Elements</em>'.
	 * @see com.misc.common.moplaf.datatools.NavigationPath#getPathElements()
	 * @see #getNavigationPath()
	 * @generated
	 */
	EReference getNavigationPath_PathElements();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.datatools.NavigationPath#getSourceType <em>Source Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Type</em>'.
	 * @see com.misc.common.moplaf.datatools.NavigationPath#getSourceType()
	 * @see #getNavigationPath()
	 * @generated
	 */
	EReference getNavigationPath_SourceType();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.datatools.NavigationPath#getTargetType <em>Target Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Type</em>'.
	 * @see com.misc.common.moplaf.datatools.NavigationPath#getTargetType()
	 * @see #getNavigationPath()
	 * @generated
	 */
	EReference getNavigationPath_TargetType();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.datatools.NavigationPath#isMany <em>Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Many</em>'.
	 * @see com.misc.common.moplaf.datatools.NavigationPath#isMany()
	 * @see #getNavigationPath()
	 * @generated
	 */
	EAttribute getNavigationPath_Many();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.datatools.NavigationPath#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see com.misc.common.moplaf.datatools.NavigationPath#getPath()
	 * @see #getNavigationPath()
	 * @generated
	 */
	EAttribute getNavigationPath_Path();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.datatools.NavigationReference <em>Navigation Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Navigation Reference</em>'.
	 * @see com.misc.common.moplaf.datatools.NavigationReference
	 * @generated
	 */
	EClass getNavigationReference();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.datatools.NavigationReference#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reference</em>'.
	 * @see com.misc.common.moplaf.datatools.NavigationReference#getReference()
	 * @see #getNavigationReference()
	 * @generated
	 */
	EReference getNavigationReference_Reference();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.datatools.NavigationDowncast <em>Navigation Downcast</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Navigation Downcast</em>'.
	 * @see com.misc.common.moplaf.datatools.NavigationDowncast
	 * @generated
	 */
	EClass getNavigationDowncast();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.datatools.NavigationDowncast#getDowncastType <em>Downcast Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Downcast Type</em>'.
	 * @see com.misc.common.moplaf.datatools.NavigationDowncast#getDowncastType()
	 * @see #getNavigationDowncast()
	 * @generated
	 */
	EReference getNavigationDowncast_DowncastType();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.datatools.DataToolContext <em>Data Tool Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Tool Context</em>'.
	 * @see com.misc.common.moplaf.datatools.DataToolContext
	 * @generated
	 */
	EClass getDataToolContext();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.datatools.DataToolContext#getDomainTypes() <em>Get Domain Types</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Domain Types</em>' operation.
	 * @see com.misc.common.moplaf.datatools.DataToolContext#getDomainTypes()
	 * @generated
	 */
	EOperation getDataToolContext__GetDomainTypes();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.datatools.NavigationAxis <em>Navigation Axis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Navigation Axis</em>'.
	 * @see com.misc.common.moplaf.datatools.NavigationAxis
	 * @generated
	 */
	EClass getNavigationAxis();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.datatools.NavigationAxis#getSourceType <em>Source Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Type</em>'.
	 * @see com.misc.common.moplaf.datatools.NavigationAxis#getSourceType()
	 * @see #getNavigationAxis()
	 * @generated
	 */
	EReference getNavigationAxis_SourceType();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.datatools.NavigationAxis#getTargetType <em>Target Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Type</em>'.
	 * @see com.misc.common.moplaf.datatools.NavigationAxis#getTargetType()
	 * @see #getNavigationAxis()
	 * @generated
	 */
	EReference getNavigationAxis_TargetType();

	/**
	 * Returns the meta object for the container reference '{@link com.misc.common.moplaf.datatools.NavigationAxis#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Path</em>'.
	 * @see com.misc.common.moplaf.datatools.NavigationAxis#getPath()
	 * @see #getNavigationAxis()
	 * @generated
	 */
	EReference getNavigationAxis_Path();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.datatools.NavigationAxis#getPrevious <em>Previous</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Previous</em>'.
	 * @see com.misc.common.moplaf.datatools.NavigationAxis#getPrevious()
	 * @see #getNavigationAxis()
	 * @generated
	 */
	EReference getNavigationAxis_Previous();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.datatools.NavigationAxis#getPathElement <em>Path Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path Element</em>'.
	 * @see com.misc.common.moplaf.datatools.NavigationAxis#getPathElement()
	 * @see #getNavigationAxis()
	 * @generated
	 */
	EAttribute getNavigationAxis_PathElement();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.datatools.NavigationAxis#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Next</em>'.
	 * @see com.misc.common.moplaf.datatools.NavigationAxis#getNext()
	 * @see #getNavigationAxis()
	 * @generated
	 */
	EReference getNavigationAxis_Next();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.datatools.NavigationAxis#navigate(org.eclipse.emf.ecore.EObject) <em>Navigate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Navigate</em>' operation.
	 * @see com.misc.common.moplaf.datatools.NavigationAxis#navigate(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getNavigationAxis__Navigate__EObject();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.datatools.NavigationAxis#navigateMany(org.eclipse.emf.ecore.EObject) <em>Navigate Many</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Navigate Many</em>' operation.
	 * @see com.misc.common.moplaf.datatools.NavigationAxis#navigateMany(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getNavigationAxis__NavigateMany__EObject();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.datatools.Matcher <em>Matcher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Matcher</em>'.
	 * @see com.misc.common.moplaf.datatools.Matcher
	 * @generated
	 */
	EClass getMatcher();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.common.moplaf.datatools.Matcher#getMatches <em>Matches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Matches</em>'.
	 * @see com.misc.common.moplaf.datatools.Matcher#getMatches()
	 * @see #getMatcher()
	 * @generated
	 */
	EReference getMatcher_Matches();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.datatools.Matcher#refreshMatches(org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Refresh Matches</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Refresh Matches</em>' operation.
	 * @see com.misc.common.moplaf.datatools.Matcher#refreshMatches(org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getMatcher__RefreshMatches__EObject_EObject();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.datatools.Match <em>Match</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Match</em>'.
	 * @see com.misc.common.moplaf.datatools.Match
	 * @generated
	 */
	EClass getMatch();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.datatools.Match#getObject1 <em>Object1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Object1</em>'.
	 * @see com.misc.common.moplaf.datatools.Match#getObject1()
	 * @see #getMatch()
	 * @generated
	 */
	EReference getMatch_Object1();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.datatools.Match#getObject2 <em>Object2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Object2</em>'.
	 * @see com.misc.common.moplaf.datatools.Match#getObject2()
	 * @see #getMatch()
	 * @generated
	 */
	EReference getMatch_Object2();

	/**
	 * Returns the meta object for enum '{@link com.misc.common.moplaf.datatools.DataToolType <em>Data Tool Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Data Tool Type</em>'.
	 * @see com.misc.common.moplaf.datatools.DataToolType
	 * @generated
	 */
	EEnum getDataToolType();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.datatools.ExtractorFilterCompound <em>Extractor Filter Compound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extractor Filter Compound</em>'.
	 * @see com.misc.common.moplaf.datatools.ExtractorFilterCompound
	 * @generated
	 */
	EClass getExtractorFilterCompound();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.common.moplaf.datatools.ExtractorFilterCompound#getFilters <em>Filters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Filters</em>'.
	 * @see com.misc.common.moplaf.datatools.ExtractorFilterCompound#getFilters()
	 * @see #getExtractorFilterCompound()
	 * @generated
	 */
	EReference getExtractorFilterCompound_Filters();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.datatools.ExtractorFilterAND <em>Extractor Filter AND</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extractor Filter AND</em>'.
	 * @see com.misc.common.moplaf.datatools.ExtractorFilterAND
	 * @generated
	 */
	EClass getExtractorFilterAND();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.datatools.ExtractorFilterOR <em>Extractor Filter OR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extractor Filter OR</em>'.
	 * @see com.misc.common.moplaf.datatools.ExtractorFilterOR
	 * @generated
	 */
	EClass getExtractorFilterOR();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.datatools.ExtractorFilterRegex <em>Extractor Filter Regex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extractor Filter Regex</em>'.
	 * @see com.misc.common.moplaf.datatools.ExtractorFilterRegex
	 * @generated
	 */
	EClass getExtractorFilterRegex();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.datatools.ExtractorFilterRegex#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pattern</em>'.
	 * @see com.misc.common.moplaf.datatools.ExtractorFilterRegex#getPattern()
	 * @see #getExtractorFilterRegex()
	 * @generated
	 */
	EAttribute getExtractorFilterRegex_Pattern();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.datatools.ExtractorFilterAttributeString <em>Extractor Filter Attribute String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extractor Filter Attribute String</em>'.
	 * @see com.misc.common.moplaf.datatools.ExtractorFilterAttributeString
	 * @generated
	 */
	EClass getExtractorFilterAttributeString();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.datatools.ExtractorFilterAttributeIntRange <em>Extractor Filter Attribute Int Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extractor Filter Attribute Int Range</em>'.
	 * @see com.misc.common.moplaf.datatools.ExtractorFilterAttributeIntRange
	 * @generated
	 */
	EClass getExtractorFilterAttributeIntRange();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.datatools.ExtractorFilterAttributeIntRange#getMinValue <em>Min Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Value</em>'.
	 * @see com.misc.common.moplaf.datatools.ExtractorFilterAttributeIntRange#getMinValue()
	 * @see #getExtractorFilterAttributeIntRange()
	 * @generated
	 */
	EAttribute getExtractorFilterAttributeIntRange_MinValue();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.datatools.ExtractorFilterAttributeIntRange#getMaxValue <em>Max Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Value</em>'.
	 * @see com.misc.common.moplaf.datatools.ExtractorFilterAttributeIntRange#getMaxValue()
	 * @see #getExtractorFilterAttributeIntRange()
	 * @generated
	 */
	EAttribute getExtractorFilterAttributeIntRange_MaxValue();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.datatools.ColumnizerGrid <em>Columnizer Grid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Columnizer Grid</em>'.
	 * @see com.misc.common.moplaf.datatools.ColumnizerGrid
	 * @generated
	 */
	EClass getColumnizerGrid();

	/**
	 * Returns the meta object for the reference list '{@link com.misc.common.moplaf.datatools.ColumnizerGrid#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Columns</em>'.
	 * @see com.misc.common.moplaf.datatools.ColumnizerGrid#getColumns()
	 * @see #getColumnizerGrid()
	 * @generated
	 */
	EReference getColumnizerGrid_Columns();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.datatools.ColumnizerGrid#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.misc.common.moplaf.datatools.ColumnizerGrid#getName()
	 * @see #getColumnizerGrid()
	 * @generated
	 */
	EAttribute getColumnizerGrid_Name();

	/**
	 * Returns the meta object for data type '{@link com.misc.common.moplaf.datatools.util.ObjectSet <em>EObjects Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EObjects Set</em>'.
	 * @see com.misc.common.moplaf.datatools.util.ObjectSet
	 * @model instanceClass="com.misc.common.moplaf.datatools.util.ObjectSet" serializeable="false"
	 * @generated
	 */
	EDataType getEObjectsSet();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.datatools.DataTool <em>Data Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Tool</em>'.
	 * @see com.misc.common.moplaf.datatools.DataTool
	 * @generated
	 */
	EClass getDataTool();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.datatools.DataTool#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see com.misc.common.moplaf.datatools.DataTool#getDescription()
	 * @see #getDataTool()
	 * @generated
	 */
	EAttribute getDataTool_Description();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.datatools.DataTool#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.misc.common.moplaf.datatools.DataTool#getName()
	 * @see #getDataTool()
	 * @generated
	 */
	EAttribute getDataTool_Name();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.datatools.DataTool#clone() <em>Clone</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Clone</em>' operation.
	 * @see com.misc.common.moplaf.datatools.DataTool#clone()
	 * @generated
	 */
	EOperation getDataTool__Clone();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.datatools.DataTool#getType() <em>Get Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Type</em>' operation.
	 * @see com.misc.common.moplaf.datatools.DataTool#getType()
	 * @generated
	 */
	EOperation getDataTool__GetType();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.datatools.DataToolAbstract <em>Data Tool Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Tool Abstract</em>'.
	 * @see com.misc.common.moplaf.datatools.DataToolAbstract
	 * @generated
	 */
	EClass getDataToolAbstract();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.datatools.DataToolAbstract#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Context</em>'.
	 * @see com.misc.common.moplaf.datatools.DataToolAbstract#getContext()
	 * @see #getDataToolAbstract()
	 * @generated
	 */
	EReference getDataToolAbstract_Context();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DatatoolsFactory getDatatoolsFactory();

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
		 * The meta object literal for the '{@link com.misc.common.moplaf.datatools.impl.CategorizerImpl <em>Categorizer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.datatools.impl.CategorizerImpl
		 * @see com.misc.common.moplaf.datatools.impl.DatatoolsPackageImpl#getCategorizer()
		 * @generated
		 */
		EClass CATEGORIZER = eINSTANCE.getCategorizer();

		/**
		 * The meta object literal for the '<em><b>Get Category Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CATEGORIZER___GET_CATEGORY_VALUE__EOBJECT = eINSTANCE.getCategorizer__GetCategoryValue__EObject();

		/**
		 * The meta object literal for the '<em><b>Get Category Label</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CATEGORIZER___GET_CATEGORY_LABEL__OBJECT = eINSTANCE.getCategorizer__GetCategoryLabel__Object();

		/**
		 * The meta object literal for the '<em><b>Is Valid Element Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CATEGORIZER___IS_VALID_ELEMENT_TYPE__ECLASS = eINSTANCE.getCategorizer__IsValidElementType__EClass();

		/**
		 * The meta object literal for the '<em><b>Construct Category</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CATEGORIZER___CONSTRUCT_CATEGORY = eINSTANCE.getCategorizer__ConstructCategory();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.datatools.impl.CategoryImpl <em>Category</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.datatools.impl.CategoryImpl
		 * @see com.misc.common.moplaf.datatools.impl.DatatoolsPackageImpl#getCategory()
		 * @generated
		 */
		EClass CATEGORY = eINSTANCE.getCategory();

		/**
		 * The meta object literal for the '<em><b>Categorizer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORY__CATEGORIZER = eINSTANCE.getCategory_Categorizer();

		/**
		 * The meta object literal for the '<em><b>Category Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATEGORY__CATEGORY_VALUE = eINSTANCE.getCategory_CategoryValue();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.datatools.impl.ExtractorImpl <em>Extractor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.datatools.impl.ExtractorImpl
		 * @see com.misc.common.moplaf.datatools.impl.DatatoolsPackageImpl#getExtractor()
		 * @generated
		 */
		EClass EXTRACTOR = eINSTANCE.getExtractor();

		/**
		 * The meta object literal for the '<em><b>Extracted Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTRACTOR__EXTRACTED_TYPE = eINSTANCE.getExtractor_ExtractedType();

		/**
		 * The meta object literal for the '<em><b>Extract</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXTRACTOR___EXTRACT__OBJECTSET_INT = eINSTANCE.getExtractor__Extract__ObjectSet_int();

		/**
		 * The meta object literal for the '<em><b>Is Valid Root</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXTRACTOR___IS_VALID_ROOT__EOBJECT = eINSTANCE.getExtractor__IsValidRoot__EObject();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.datatools.impl.ColumnizerImpl <em>Columnizer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.datatools.impl.ColumnizerImpl
		 * @see com.misc.common.moplaf.datatools.impl.DatatoolsPackageImpl#getColumnizer()
		 * @generated
		 */
		EClass COLUMNIZER = eINSTANCE.getColumnizer();

		/**
		 * The meta object literal for the '<em><b>Columns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLUMNIZER__COLUMNS = eINSTANCE.getColumnizer_Columns();

		/**
		 * The meta object literal for the '<em><b>Grids</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLUMNIZER__GRIDS = eINSTANCE.getColumnizer_Grids();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.datatools.impl.CategoryAbstractImpl <em>Category Abstract</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.datatools.impl.CategoryAbstractImpl
		 * @see com.misc.common.moplaf.datatools.impl.DatatoolsPackageImpl#getCategoryAbstract()
		 * @generated
		 */
		EClass CATEGORY_ABSTRACT = eINSTANCE.getCategoryAbstract();

		/**
		 * The meta object literal for the '<em><b>Sub Categories</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORY_ABSTRACT__SUB_CATEGORIES = eINSTANCE.getCategoryAbstract_SubCategories();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORY_ABSTRACT__ELEMENTS = eINSTANCE.getCategoryAbstract_Elements();

		/**
		 * The meta object literal for the '<em><b>Nb Elements</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATEGORY_ABSTRACT__NB_ELEMENTS = eINSTANCE.getCategoryAbstract_NbElements();

		/**
		 * The meta object literal for the '<em><b>Category Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATEGORY_ABSTRACT__CATEGORY_LABEL = eINSTANCE.getCategoryAbstract_CategoryLabel();

		/**
		 * The meta object literal for the '<em><b>Category Columnizer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORY_ABSTRACT__CATEGORY_COLUMNIZER = eINSTANCE.getCategoryAbstract_CategoryColumnizer();

		/**
		 * The meta object literal for the '<em><b>Get Subcategory</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CATEGORY_ABSTRACT___GET_SUBCATEGORY__EOBJECT = eINSTANCE.getCategoryAbstract__GetSubcategory__EObject();

		/**
		 * The meta object literal for the '<em><b>Refresh Cats</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CATEGORY_ABSTRACT___REFRESH_CATS__OBJECTSET_ELIST_INT = eINSTANCE.getCategoryAbstract__RefreshCats__ObjectSet_EList_int();

		/**
		 * The meta object literal for the '<em><b>Set Columnizer All</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CATEGORY_ABSTRACT___SET_COLUMNIZER_ALL__COLUMNIZERABSTRACT = eINSTANCE.getCategoryAbstract__SetColumnizerAll__ColumnizerAbstract();

		/**
		 * The meta object literal for the '<em><b>Flush</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CATEGORY_ABSTRACT___FLUSH = eINSTANCE.getCategoryAbstract__Flush();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.datatools.impl.CategorizerStructuralFeatureImpl <em>Categorizer Structural Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.datatools.impl.CategorizerStructuralFeatureImpl
		 * @see com.misc.common.moplaf.datatools.impl.DatatoolsPackageImpl#getCategorizerStructuralFeature()
		 * @generated
		 */
		EClass CATEGORIZER_STRUCTURAL_FEATURE = eINSTANCE.getCategorizerStructuralFeature();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORIZER_STRUCTURAL_FEATURE__FEATURE = eINSTANCE.getCategorizerStructuralFeature_Feature();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.datatools.impl.CategorizerOclImpl <em>Categorizer Ocl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.datatools.impl.CategorizerOclImpl
		 * @see com.misc.common.moplaf.datatools.impl.DatatoolsPackageImpl#getCategorizerOcl()
		 * @generated
		 */
		EClass CATEGORIZER_OCL = eINSTANCE.getCategorizerOcl();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATEGORIZER_OCL__EXPRESSION = eINSTANCE.getCategorizerOcl_Expression();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.datatools.impl.ExtractorTypeImpl <em>Extractor Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.datatools.impl.ExtractorTypeImpl
		 * @see com.misc.common.moplaf.datatools.impl.DatatoolsPackageImpl#getExtractorType()
		 * @generated
		 */
		EClass EXTRACTOR_TYPE = eINSTANCE.getExtractorType();

		/**
		 * The meta object literal for the '<em><b>Target Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTRACTOR_TYPE__TARGET_TYPE = eINSTANCE.getExtractorType_TargetType();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.datatools.impl.ExtractorCompoundImpl <em>Extractor Compound</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.datatools.impl.ExtractorCompoundImpl
		 * @see com.misc.common.moplaf.datatools.impl.DatatoolsPackageImpl#getExtractorCompound()
		 * @generated
		 */
		EClass EXTRACTOR_COMPOUND = eINSTANCE.getExtractorCompound();

		/**
		 * The meta object literal for the '<em><b>Extractors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTRACTOR_COMPOUND__EXTRACTORS = eINSTANCE.getExtractorCompound_Extractors();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.datatools.impl.ExtractorPipeImpl <em>Extractor Pipe</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.datatools.impl.ExtractorPipeImpl
		 * @see com.misc.common.moplaf.datatools.impl.DatatoolsPackageImpl#getExtractorPipe()
		 * @generated
		 */
		EClass EXTRACTOR_PIPE = eINSTANCE.getExtractorPipe();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.datatools.impl.ExtractorLogicImpl <em>Extractor Logic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.datatools.impl.ExtractorLogicImpl
		 * @see com.misc.common.moplaf.datatools.impl.DatatoolsPackageImpl#getExtractorLogic()
		 * @generated
		 */
		EClass EXTRACTOR_LOGIC = eINSTANCE.getExtractorLogic();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.datatools.impl.ExtractorUnionImpl <em>Extractor Union</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.datatools.impl.ExtractorUnionImpl
		 * @see com.misc.common.moplaf.datatools.impl.DatatoolsPackageImpl#getExtractorUnion()
		 * @generated
		 */
		EClass EXTRACTOR_UNION = eINSTANCE.getExtractorUnion();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.datatools.impl.ExtractorIntersectionImpl <em>Extractor Intersection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.datatools.impl.ExtractorIntersectionImpl
		 * @see com.misc.common.moplaf.datatools.impl.DatatoolsPackageImpl#getExtractorIntersection()
		 * @generated
		 */
		EClass EXTRACTOR_INTERSECTION = eINSTANCE.getExtractorIntersection();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.datatools.impl.ColumnizerAbstractImpl <em>Columnizer Abstract</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.datatools.impl.ColumnizerAbstractImpl
		 * @see com.misc.common.moplaf.datatools.impl.DatatoolsPackageImpl#getColumnizerAbstract()
		 * @generated
		 */
		EClass COLUMNIZER_ABSTRACT = eINSTANCE.getColumnizerAbstract();

		/**
		 * The meta object literal for the '<em><b>Is Valid Element Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COLUMNIZER_ABSTRACT___IS_VALID_ELEMENT_TYPE__ECLASS = eINSTANCE.getColumnizerAbstract__IsValidElementType__EClass();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.datatools.impl.ExtractorPathImpl <em>Extractor Path</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.datatools.impl.ExtractorPathImpl
		 * @see com.misc.common.moplaf.datatools.impl.DatatoolsPackageImpl#getExtractorPath()
		 * @generated
		 */
		EClass EXTRACTOR_PATH = eINSTANCE.getExtractorPath();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.datatools.impl.ExtractorOclImpl <em>Extractor Ocl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.datatools.impl.ExtractorOclImpl
		 * @see com.misc.common.moplaf.datatools.impl.DatatoolsPackageImpl#getExtractorOcl()
		 * @generated
		 */
		EClass EXTRACTOR_OCL = eINSTANCE.getExtractorOcl();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTRACTOR_OCL__EXPRESSION = eINSTANCE.getExtractorOcl_Expression();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.datatools.impl.ExtractorFilterImpl <em>Extractor Filter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.datatools.impl.ExtractorFilterImpl
		 * @see com.misc.common.moplaf.datatools.impl.DatatoolsPackageImpl#getExtractorFilter()
		 * @generated
		 */
		EClass EXTRACTOR_FILTER = eINSTANCE.getExtractorFilter();

		/**
		 * The meta object literal for the '<em><b>Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTRACTOR_FILTER__ENABLED = eINSTANCE.getExtractorFilter_Enabled();

		/**
		 * The meta object literal for the '<em><b>Negated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTRACTOR_FILTER__NEGATED = eINSTANCE.getExtractorFilter_Negated();

		/**
		 * The meta object literal for the '<em><b>Satisfies Filter</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXTRACTOR_FILTER___SATISFIES_FILTER__EOBJECT = eINSTANCE.getExtractorFilter__SatisfiesFilter__EObject();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.datatools.impl.ExtractorFilterAttributeImpl <em>Extractor Filter Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.datatools.impl.ExtractorFilterAttributeImpl
		 * @see com.misc.common.moplaf.datatools.impl.DatatoolsPackageImpl#getExtractorFilterAttribute()
		 * @generated
		 */
		EClass EXTRACTOR_FILTER_ATTRIBUTE = eINSTANCE.getExtractorFilterAttribute();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTRACTOR_FILTER_ATTRIBUTE__ATTRIBUTE = eINSTANCE.getExtractorFilterAttribute_Attribute();

		/**
		 * The meta object literal for the '<em><b>Get Attribute Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXTRACTOR_FILTER_ATTRIBUTE___GET_ATTRIBUTE_VALUE__EOBJECT = eINSTANCE.getExtractorFilterAttribute__GetAttributeValue__EObject();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.datatools.impl.ExtractorFilterAttributeIntImpl <em>Extractor Filter Attribute Int</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.datatools.impl.ExtractorFilterAttributeIntImpl
		 * @see com.misc.common.moplaf.datatools.impl.DatatoolsPackageImpl#getExtractorFilterAttributeInt()
		 * @generated
		 */
		EClass EXTRACTOR_FILTER_ATTRIBUTE_INT = eINSTANCE.getExtractorFilterAttributeInt();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.datatools.impl.ExtractorFilterOclImpl <em>Extractor Filter Ocl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.datatools.impl.ExtractorFilterOclImpl
		 * @see com.misc.common.moplaf.datatools.impl.DatatoolsPackageImpl#getExtractorFilterOcl()
		 * @generated
		 */
		EClass EXTRACTOR_FILTER_OCL = eINSTANCE.getExtractorFilterOcl();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTRACTOR_FILTER_OCL__EXPRESSION = eINSTANCE.getExtractorFilterOcl_Expression();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.datatools.impl.ColumnizerColumnImpl <em>Columnizer Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.datatools.impl.ColumnizerColumnImpl
		 * @see com.misc.common.moplaf.datatools.impl.DatatoolsPackageImpl#getColumnizerColumn()
		 * @generated
		 */
		EClass COLUMNIZER_COLUMN = eINSTANCE.getColumnizerColumn();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMNIZER_COLUMN__NAME = eINSTANCE.getColumnizerColumn_Name();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMNIZER_COLUMN__WIDTH = eINSTANCE.getColumnizerColumn_Width();

		/**
		 * The meta object literal for the '<em><b>Grids</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLUMNIZER_COLUMN__GRIDS = eINSTANCE.getColumnizerColumn_Grids();

		/**
		 * The meta object literal for the '<em><b>Columnizer</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLUMNIZER_COLUMN__COLUMNIZER = eINSTANCE.getColumnizerColumn_Columnizer();

		/**
		 * The meta object literal for the '<em><b>Get Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COLUMNIZER_COLUMN___GET_VALUE__EOBJECT = eINSTANCE.getColumnizerColumn__GetValue__EObject();

		/**
		 * The meta object literal for the '<em><b>Is Valid Element Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COLUMNIZER_COLUMN___IS_VALID_ELEMENT_TYPE__ECLASS = eINSTANCE.getColumnizerColumn__IsValidElementType__EClass();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.datatools.impl.ColumnizerColumnAttributeImpl <em>Columnizer Column Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.datatools.impl.ColumnizerColumnAttributeImpl
		 * @see com.misc.common.moplaf.datatools.impl.DatatoolsPackageImpl#getColumnizerColumnAttribute()
		 * @generated
		 */
		EClass COLUMNIZER_COLUMN_ATTRIBUTE = eINSTANCE.getColumnizerColumnAttribute();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLUMNIZER_COLUMN_ATTRIBUTE__ATTRIBUTE = eINSTANCE.getColumnizerColumnAttribute_Attribute();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.datatools.impl.ColumnizerColumnOclImpl <em>Columnizer Column Ocl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.datatools.impl.ColumnizerColumnOclImpl
		 * @see com.misc.common.moplaf.datatools.impl.DatatoolsPackageImpl#getColumnizerColumnOcl()
		 * @generated
		 */
		EClass COLUMNIZER_COLUMN_OCL = eINSTANCE.getColumnizerColumnOcl();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMNIZER_COLUMN_OCL__EXPRESSION = eINSTANCE.getColumnizerColumnOcl_Expression();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.datatools.impl.SuperCategoryImpl <em>Super Category</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.datatools.impl.SuperCategoryImpl
		 * @see com.misc.common.moplaf.datatools.impl.DatatoolsPackageImpl#getSuperCategory()
		 * @generated
		 */
		EClass SUPER_CATEGORY = eINSTANCE.getSuperCategory();

		/**
		 * The meta object literal for the '<em><b>Refresh Cats</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SUPER_CATEGORY___REFRESH_CATS__OBJECTSET_ELIST = eINSTANCE.getSuperCategory__RefreshCats__ObjectSet_EList();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.datatools.impl.NavigationPathImpl <em>Navigation Path</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.datatools.impl.NavigationPathImpl
		 * @see com.misc.common.moplaf.datatools.impl.DatatoolsPackageImpl#getNavigationPath()
		 * @generated
		 */
		EClass NAVIGATION_PATH = eINSTANCE.getNavigationPath();

		/**
		 * The meta object literal for the '<em><b>Path Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAVIGATION_PATH__PATH_ELEMENTS = eINSTANCE.getNavigationPath_PathElements();

		/**
		 * The meta object literal for the '<em><b>Source Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAVIGATION_PATH__SOURCE_TYPE = eINSTANCE.getNavigationPath_SourceType();

		/**
		 * The meta object literal for the '<em><b>Target Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAVIGATION_PATH__TARGET_TYPE = eINSTANCE.getNavigationPath_TargetType();

		/**
		 * The meta object literal for the '<em><b>Many</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAVIGATION_PATH__MANY = eINSTANCE.getNavigationPath_Many();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAVIGATION_PATH__PATH = eINSTANCE.getNavigationPath_Path();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.datatools.impl.NavigationReferenceImpl <em>Navigation Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.datatools.impl.NavigationReferenceImpl
		 * @see com.misc.common.moplaf.datatools.impl.DatatoolsPackageImpl#getNavigationReference()
		 * @generated
		 */
		EClass NAVIGATION_REFERENCE = eINSTANCE.getNavigationReference();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAVIGATION_REFERENCE__REFERENCE = eINSTANCE.getNavigationReference_Reference();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.datatools.impl.NavigationDowncastImpl <em>Navigation Downcast</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.datatools.impl.NavigationDowncastImpl
		 * @see com.misc.common.moplaf.datatools.impl.DatatoolsPackageImpl#getNavigationDowncast()
		 * @generated
		 */
		EClass NAVIGATION_DOWNCAST = eINSTANCE.getNavigationDowncast();

		/**
		 * The meta object literal for the '<em><b>Downcast Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAVIGATION_DOWNCAST__DOWNCAST_TYPE = eINSTANCE.getNavigationDowncast_DowncastType();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.datatools.impl.DataToolContextImpl <em>Data Tool Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.datatools.impl.DataToolContextImpl
		 * @see com.misc.common.moplaf.datatools.impl.DatatoolsPackageImpl#getDataToolContext()
		 * @generated
		 */
		EClass DATA_TOOL_CONTEXT = eINSTANCE.getDataToolContext();

		/**
		 * The meta object literal for the '<em><b>Get Domain Types</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_TOOL_CONTEXT___GET_DOMAIN_TYPES = eINSTANCE.getDataToolContext__GetDomainTypes();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.datatools.impl.NavigationAxisImpl <em>Navigation Axis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.datatools.impl.NavigationAxisImpl
		 * @see com.misc.common.moplaf.datatools.impl.DatatoolsPackageImpl#getNavigationAxis()
		 * @generated
		 */
		EClass NAVIGATION_AXIS = eINSTANCE.getNavigationAxis();

		/**
		 * The meta object literal for the '<em><b>Source Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAVIGATION_AXIS__SOURCE_TYPE = eINSTANCE.getNavigationAxis_SourceType();

		/**
		 * The meta object literal for the '<em><b>Target Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAVIGATION_AXIS__TARGET_TYPE = eINSTANCE.getNavigationAxis_TargetType();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAVIGATION_AXIS__PATH = eINSTANCE.getNavigationAxis_Path();

		/**
		 * The meta object literal for the '<em><b>Previous</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAVIGATION_AXIS__PREVIOUS = eINSTANCE.getNavigationAxis_Previous();

		/**
		 * The meta object literal for the '<em><b>Path Element</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAVIGATION_AXIS__PATH_ELEMENT = eINSTANCE.getNavigationAxis_PathElement();

		/**
		 * The meta object literal for the '<em><b>Next</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAVIGATION_AXIS__NEXT = eINSTANCE.getNavigationAxis_Next();

		/**
		 * The meta object literal for the '<em><b>Navigate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NAVIGATION_AXIS___NAVIGATE__EOBJECT = eINSTANCE.getNavigationAxis__Navigate__EObject();

		/**
		 * The meta object literal for the '<em><b>Navigate Many</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NAVIGATION_AXIS___NAVIGATE_MANY__EOBJECT = eINSTANCE.getNavigationAxis__NavigateMany__EObject();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.datatools.impl.MatcherImpl <em>Matcher</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.datatools.impl.MatcherImpl
		 * @see com.misc.common.moplaf.datatools.impl.DatatoolsPackageImpl#getMatcher()
		 * @generated
		 */
		EClass MATCHER = eINSTANCE.getMatcher();

		/**
		 * The meta object literal for the '<em><b>Matches</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATCHER__MATCHES = eINSTANCE.getMatcher_Matches();

		/**
		 * The meta object literal for the '<em><b>Refresh Matches</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MATCHER___REFRESH_MATCHES__EOBJECT_EOBJECT = eINSTANCE.getMatcher__RefreshMatches__EObject_EObject();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.datatools.impl.MatchImpl <em>Match</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.datatools.impl.MatchImpl
		 * @see com.misc.common.moplaf.datatools.impl.DatatoolsPackageImpl#getMatch()
		 * @generated
		 */
		EClass MATCH = eINSTANCE.getMatch();

		/**
		 * The meta object literal for the '<em><b>Object1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATCH__OBJECT1 = eINSTANCE.getMatch_Object1();

		/**
		 * The meta object literal for the '<em><b>Object2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATCH__OBJECT2 = eINSTANCE.getMatch_Object2();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.datatools.DataToolType <em>Data Tool Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.datatools.DataToolType
		 * @see com.misc.common.moplaf.datatools.impl.DatatoolsPackageImpl#getDataToolType()
		 * @generated
		 */
		EEnum DATA_TOOL_TYPE = eINSTANCE.getDataToolType();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.datatools.impl.ExtractorFilterCompoundImpl <em>Extractor Filter Compound</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.datatools.impl.ExtractorFilterCompoundImpl
		 * @see com.misc.common.moplaf.datatools.impl.DatatoolsPackageImpl#getExtractorFilterCompound()
		 * @generated
		 */
		EClass EXTRACTOR_FILTER_COMPOUND = eINSTANCE.getExtractorFilterCompound();

		/**
		 * The meta object literal for the '<em><b>Filters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTRACTOR_FILTER_COMPOUND__FILTERS = eINSTANCE.getExtractorFilterCompound_Filters();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.datatools.impl.ExtractorFilterANDImpl <em>Extractor Filter AND</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.datatools.impl.ExtractorFilterANDImpl
		 * @see com.misc.common.moplaf.datatools.impl.DatatoolsPackageImpl#getExtractorFilterAND()
		 * @generated
		 */
		EClass EXTRACTOR_FILTER_AND = eINSTANCE.getExtractorFilterAND();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.datatools.impl.ExtractorFilterORImpl <em>Extractor Filter OR</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.datatools.impl.ExtractorFilterORImpl
		 * @see com.misc.common.moplaf.datatools.impl.DatatoolsPackageImpl#getExtractorFilterOR()
		 * @generated
		 */
		EClass EXTRACTOR_FILTER_OR = eINSTANCE.getExtractorFilterOR();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.datatools.impl.ExtractorFilterRegexImpl <em>Extractor Filter Regex</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.datatools.impl.ExtractorFilterRegexImpl
		 * @see com.misc.common.moplaf.datatools.impl.DatatoolsPackageImpl#getExtractorFilterRegex()
		 * @generated
		 */
		EClass EXTRACTOR_FILTER_REGEX = eINSTANCE.getExtractorFilterRegex();

		/**
		 * The meta object literal for the '<em><b>Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTRACTOR_FILTER_REGEX__PATTERN = eINSTANCE.getExtractorFilterRegex_Pattern();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.datatools.impl.ExtractorFilterAttributeStringImpl <em>Extractor Filter Attribute String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.datatools.impl.ExtractorFilterAttributeStringImpl
		 * @see com.misc.common.moplaf.datatools.impl.DatatoolsPackageImpl#getExtractorFilterAttributeString()
		 * @generated
		 */
		EClass EXTRACTOR_FILTER_ATTRIBUTE_STRING = eINSTANCE.getExtractorFilterAttributeString();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.datatools.impl.ExtractorFilterAttributeIntRangeImpl <em>Extractor Filter Attribute Int Range</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.datatools.impl.ExtractorFilterAttributeIntRangeImpl
		 * @see com.misc.common.moplaf.datatools.impl.DatatoolsPackageImpl#getExtractorFilterAttributeIntRange()
		 * @generated
		 */
		EClass EXTRACTOR_FILTER_ATTRIBUTE_INT_RANGE = eINSTANCE.getExtractorFilterAttributeIntRange();

		/**
		 * The meta object literal for the '<em><b>Min Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTRACTOR_FILTER_ATTRIBUTE_INT_RANGE__MIN_VALUE = eINSTANCE.getExtractorFilterAttributeIntRange_MinValue();

		/**
		 * The meta object literal for the '<em><b>Max Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTRACTOR_FILTER_ATTRIBUTE_INT_RANGE__MAX_VALUE = eINSTANCE.getExtractorFilterAttributeIntRange_MaxValue();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.datatools.impl.ColumnizerGridImpl <em>Columnizer Grid</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.datatools.impl.ColumnizerGridImpl
		 * @see com.misc.common.moplaf.datatools.impl.DatatoolsPackageImpl#getColumnizerGrid()
		 * @generated
		 */
		EClass COLUMNIZER_GRID = eINSTANCE.getColumnizerGrid();

		/**
		 * The meta object literal for the '<em><b>Columns</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLUMNIZER_GRID__COLUMNS = eINSTANCE.getColumnizerGrid_Columns();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMNIZER_GRID__NAME = eINSTANCE.getColumnizerGrid_Name();

		/**
		 * The meta object literal for the '<em>EObjects Set</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.datatools.util.ObjectSet
		 * @see com.misc.common.moplaf.datatools.impl.DatatoolsPackageImpl#getEObjectsSet()
		 * @generated
		 */
		EDataType EOBJECTS_SET = eINSTANCE.getEObjectsSet();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.datatools.impl.DataToolImpl <em>Data Tool</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.datatools.impl.DataToolImpl
		 * @see com.misc.common.moplaf.datatools.impl.DatatoolsPackageImpl#getDataTool()
		 * @generated
		 */
		EClass DATA_TOOL = eINSTANCE.getDataTool();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TOOL__DESCRIPTION = eINSTANCE.getDataTool_Description();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TOOL__NAME = eINSTANCE.getDataTool_Name();

		/**
		 * The meta object literal for the '<em><b>Clone</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_TOOL___CLONE = eINSTANCE.getDataTool__Clone();

		/**
		 * The meta object literal for the '<em><b>Get Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_TOOL___GET_TYPE = eINSTANCE.getDataTool__GetType();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.datatools.impl.DataToolAbstractImpl <em>Data Tool Abstract</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.datatools.impl.DataToolAbstractImpl
		 * @see com.misc.common.moplaf.datatools.impl.DatatoolsPackageImpl#getDataToolAbstract()
		 * @generated
		 */
		EClass DATA_TOOL_ABSTRACT = eINSTANCE.getDataToolAbstract();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_TOOL_ABSTRACT__CONTEXT = eINSTANCE.getDataToolAbstract_Context();

	}

} //DatatoolsPackage
