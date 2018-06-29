/**
 */
package com.misc.common.moplaf.datatools;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
	int CATEGORY_ABSTRACT = 5;

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
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_ABSTRACT__DESCRIPTION = 3;

	/**
	 * The feature id for the '<em><b>Columnizer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_ABSTRACT__COLUMNIZER = 4;

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
	 * The number of operations of the '<em>Category Abstract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_ABSTRACT_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.datatools.impl.CategorizerImpl <em>Categorizer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.datatools.impl.CategorizerImpl
	 * @see com.misc.common.moplaf.datatools.impl.DatatoolsPackageImpl#getCategorizer()
	 * @generated
	 */
	int CATEGORIZER = 0;

	/**
	 * The feature id for the '<em><b>Sub Categories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIZER__SUB_CATEGORIES = CATEGORY_ABSTRACT__SUB_CATEGORIES;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIZER__ELEMENTS = CATEGORY_ABSTRACT__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Nb Elements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIZER__NB_ELEMENTS = CATEGORY_ABSTRACT__NB_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIZER__DESCRIPTION = CATEGORY_ABSTRACT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Columnizer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIZER__COLUMNIZER = CATEGORY_ABSTRACT__COLUMNIZER;

	/**
	 * The feature id for the '<em><b>Criteria</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIZER__CRITERIA = CATEGORY_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Categorizer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIZER_FEATURE_COUNT = CATEGORY_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Subcategory</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIZER___GET_SUBCATEGORY__EOBJECT = CATEGORY_ABSTRACT___GET_SUBCATEGORY__EOBJECT;

	/**
	 * The operation id for the '<em>Is Valid Root</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIZER___IS_VALID_ROOT__EOBJECT = CATEGORY_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Refresh Cats</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIZER___REFRESH_CATS__EOBJECT = CATEGORY_ABSTRACT_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Categorizer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIZER_OPERATION_COUNT = CATEGORY_ABSTRACT_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.datatools.impl.CategoryImpl <em>Category</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.datatools.impl.CategoryImpl
	 * @see com.misc.common.moplaf.datatools.impl.DatatoolsPackageImpl#getCategory()
	 * @generated
	 */
	int CATEGORY = 1;

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
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__DESCRIPTION = CATEGORY_ABSTRACT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Columnizer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__COLUMNIZER = CATEGORY_ABSTRACT__COLUMNIZER;

	/**
	 * The feature id for the '<em><b>Criteria</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__CRITERIA = CATEGORY_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__VALUE = CATEGORY_ABSTRACT_FEATURE_COUNT + 1;

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
	 * The number of operations of the '<em>Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_OPERATION_COUNT = CATEGORY_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.datatools.impl.CategoryCriteriaImpl <em>Category Criteria</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.datatools.impl.CategoryCriteriaImpl
	 * @see com.misc.common.moplaf.datatools.impl.DatatoolsPackageImpl#getCategoryCriteria()
	 * @generated
	 */
	int CATEGORY_CRITERIA = 2;

	/**
	 * The number of structural features of the '<em>Category Criteria</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_CRITERIA_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get Category Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_CRITERIA___GET_CATEGORY_VALUE__EOBJECT = 0;

	/**
	 * The operation id for the '<em>Construct Category</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_CRITERIA___CONSTRUCT_CATEGORY = 1;

	/**
	 * The number of operations of the '<em>Category Criteria</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_CRITERIA_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.datatools.impl.ExtractorImpl <em>Extractor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.datatools.impl.ExtractorImpl
	 * @see com.misc.common.moplaf.datatools.impl.DatatoolsPackageImpl#getExtractor()
	 * @generated
	 */
	int EXTRACTOR = 3;

	/**
	 * The number of structural features of the '<em>Extractor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Refresh Outs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR___REFRESH_OUTS__ELIST = 0;

	/**
	 * The operation id for the '<em>Is Valid Root</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR___IS_VALID_ROOT__EOBJECT = 1;

	/**
	 * The number of operations of the '<em>Extractor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.datatools.impl.ColumnizerImpl <em>Columnizer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.datatools.impl.ColumnizerImpl
	 * @see com.misc.common.moplaf.datatools.impl.DatatoolsPackageImpl#getColumnizer()
	 * @generated
	 */
	int COLUMNIZER = 4;

	/**
	 * The number of structural features of the '<em>Columnizer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMNIZER_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Columnizer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMNIZER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.datatools.impl.ExtractorTypeImpl <em>Extractor Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.datatools.impl.ExtractorTypeImpl
	 * @see com.misc.common.moplaf.datatools.impl.DatatoolsPackageImpl#getExtractorType()
	 * @generated
	 */
	int EXTRACTOR_TYPE = 6;

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
	 * The operation id for the '<em>Refresh Outs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_TYPE___REFRESH_OUTS__ELIST = EXTRACTOR___REFRESH_OUTS__ELIST;

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
	 * The meta object id for the '{@link com.misc.common.moplaf.datatools.impl.ExtractorCompoundImpl <em>Extractor Compound</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.datatools.impl.ExtractorCompoundImpl
	 * @see com.misc.common.moplaf.datatools.impl.DatatoolsPackageImpl#getExtractorCompound()
	 * @generated
	 */
	int EXTRACTOR_COMPOUND = 7;

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
	 * The operation id for the '<em>Refresh Outs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_COMPOUND___REFRESH_OUTS__ELIST = EXTRACTOR___REFRESH_OUTS__ELIST;

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
	 * The meta object id for the '{@link com.misc.common.moplaf.datatools.impl.ExtractatorPipeImpl <em>Extractator Pipe</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.datatools.impl.ExtractatorPipeImpl
	 * @see com.misc.common.moplaf.datatools.impl.DatatoolsPackageImpl#getExtractatorPipe()
	 * @generated
	 */
	int EXTRACTATOR_PIPE = 8;

	/**
	 * The feature id for the '<em><b>Extractors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTATOR_PIPE__EXTRACTORS = EXTRACTOR_COMPOUND__EXTRACTORS;

	/**
	 * The number of structural features of the '<em>Extractator Pipe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTATOR_PIPE_FEATURE_COUNT = EXTRACTOR_COMPOUND_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Refresh Outs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTATOR_PIPE___REFRESH_OUTS__ELIST = EXTRACTOR_COMPOUND___REFRESH_OUTS__ELIST;

	/**
	 * The operation id for the '<em>Is Valid Root</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTATOR_PIPE___IS_VALID_ROOT__EOBJECT = EXTRACTOR_COMPOUND___IS_VALID_ROOT__EOBJECT;

	/**
	 * The number of operations of the '<em>Extractator Pipe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTATOR_PIPE_OPERATION_COUNT = EXTRACTOR_COMPOUND_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.datatools.impl.ExtractorLogicImpl <em>Extractor Logic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.datatools.impl.ExtractorLogicImpl
	 * @see com.misc.common.moplaf.datatools.impl.DatatoolsPackageImpl#getExtractorLogic()
	 * @generated
	 */
	int EXTRACTOR_LOGIC = 9;

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
	 * The operation id for the '<em>Refresh Outs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_LOGIC___REFRESH_OUTS__ELIST = EXTRACTOR_COMPOUND___REFRESH_OUTS__ELIST;

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
	 * The meta object id for the '{@link com.misc.common.moplaf.datatools.impl.ExtractorUnionImpl <em>Extractor Union</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.datatools.impl.ExtractorUnionImpl
	 * @see com.misc.common.moplaf.datatools.impl.DatatoolsPackageImpl#getExtractorUnion()
	 * @generated
	 */
	int EXTRACTOR_UNION = 10;

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
	 * The operation id for the '<em>Refresh Outs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_UNION___REFRESH_OUTS__ELIST = EXTRACTOR_LOGIC___REFRESH_OUTS__ELIST;

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
	 * The meta object id for the '{@link com.misc.common.moplaf.datatools.impl.ExtractorIntersectionImpl <em>Extractor Intersection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.datatools.impl.ExtractorIntersectionImpl
	 * @see com.misc.common.moplaf.datatools.impl.DatatoolsPackageImpl#getExtractorIntersection()
	 * @generated
	 */
	int EXTRACTOR_INTERSECTION = 11;

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
	 * The operation id for the '<em>Refresh Outs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_INTERSECTION___REFRESH_OUTS__ELIST = EXTRACTOR_LOGIC___REFRESH_OUTS__ELIST;

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
	 * The meta object id for the '{@link com.misc.common.moplaf.datatools.impl.ExtractorPathImpl <em>Extractor Path</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.datatools.impl.ExtractorPathImpl
	 * @see com.misc.common.moplaf.datatools.impl.DatatoolsPackageImpl#getExtractorPath()
	 * @generated
	 */
	int EXTRACTOR_PATH = 12;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_PATH__ELEMENTS = EXTRACTOR_FEATURE_COUNT + 0;

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
	 * The number of structural features of the '<em>Extractor Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_PATH_FEATURE_COUNT = EXTRACTOR_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Refresh Outs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_PATH___REFRESH_OUTS__ELIST = EXTRACTOR___REFRESH_OUTS__ELIST;

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
	 * The meta object id for the '{@link com.misc.common.moplaf.datatools.impl.ExtractorOclImpl <em>Extractor Ocl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.datatools.impl.ExtractorOclImpl
	 * @see com.misc.common.moplaf.datatools.impl.DatatoolsPackageImpl#getExtractorOcl()
	 * @generated
	 */
	int EXTRACTOR_OCL = 13;

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
	 * The operation id for the '<em>Refresh Outs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_OCL___REFRESH_OUTS__ELIST = EXTRACTOR___REFRESH_OUTS__ELIST;

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
	 * The meta object id for the '{@link com.misc.common.moplaf.datatools.impl.ExtractorFilterImpl <em>Extractor Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.datatools.impl.ExtractorFilterImpl
	 * @see com.misc.common.moplaf.datatools.impl.DatatoolsPackageImpl#getExtractorFilter()
	 * @generated
	 */
	int EXTRACTOR_FILTER = 14;

	/**
	 * The number of structural features of the '<em>Extractor Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_FEATURE_COUNT = EXTRACTOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Refresh Outs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER___REFRESH_OUTS__ELIST = EXTRACTOR___REFRESH_OUTS__ELIST;

	/**
	 * The operation id for the '<em>Is Valid Root</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER___IS_VALID_ROOT__EOBJECT = EXTRACTOR___IS_VALID_ROOT__EOBJECT;

	/**
	 * The operation id for the '<em>Is Filtered</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER___IS_FILTERED__EOBJECT = EXTRACTOR_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Extractor Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_OPERATION_COUNT = EXTRACTOR_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.datatools.impl.ExtractorFilterAttributeImpl <em>Extractor Filter Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.datatools.impl.ExtractorFilterAttributeImpl
	 * @see com.misc.common.moplaf.datatools.impl.DatatoolsPackageImpl#getExtractorFilterAttribute()
	 * @generated
	 */
	int EXTRACTOR_FILTER_ATTRIBUTE = 15;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_ATTRIBUTE__ELEMENTS = EXTRACTOR_FILTER_FEATURE_COUNT + 0;

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
	 * The feature id for the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_ATTRIBUTE__ATTRIBUTE = EXTRACTOR_FILTER_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Extractor Filter Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_ATTRIBUTE_FEATURE_COUNT = EXTRACTOR_FILTER_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Refresh Outs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_ATTRIBUTE___REFRESH_OUTS__ELIST = EXTRACTOR_FILTER___REFRESH_OUTS__ELIST;

	/**
	 * The operation id for the '<em>Is Valid Root</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_ATTRIBUTE___IS_VALID_ROOT__EOBJECT = EXTRACTOR_FILTER___IS_VALID_ROOT__EOBJECT;

	/**
	 * The operation id for the '<em>Is Filtered</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_ATTRIBUTE___IS_FILTERED__EOBJECT = EXTRACTOR_FILTER___IS_FILTERED__EOBJECT;

	/**
	 * The operation id for the '<em>Get Attribute Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_ATTRIBUTE___GET_ATTRIBUTE_VALUE = EXTRACTOR_FILTER_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Extractor Filter Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_ATTRIBUTE_OPERATION_COUNT = EXTRACTOR_FILTER_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.datatools.impl.ExtractorFilterAttributeIntImpl <em>Extractor Filter Attribute Int</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.datatools.impl.ExtractorFilterAttributeIntImpl
	 * @see com.misc.common.moplaf.datatools.impl.DatatoolsPackageImpl#getExtractorFilterAttributeInt()
	 * @generated
	 */
	int EXTRACTOR_FILTER_ATTRIBUTE_INT = 16;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_ATTRIBUTE_INT__ELEMENTS = EXTRACTOR_FILTER_ATTRIBUTE__ELEMENTS;

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
	 * The feature id for the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_ATTRIBUTE_INT__ATTRIBUTE = EXTRACTOR_FILTER_ATTRIBUTE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Min Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_ATTRIBUTE_INT__MIN_VALUE = EXTRACTOR_FILTER_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_ATTRIBUTE_INT__MAX_VALUE = EXTRACTOR_FILTER_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Extractor Filter Attribute Int</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_ATTRIBUTE_INT_FEATURE_COUNT = EXTRACTOR_FILTER_ATTRIBUTE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Refresh Outs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_ATTRIBUTE_INT___REFRESH_OUTS__ELIST = EXTRACTOR_FILTER_ATTRIBUTE___REFRESH_OUTS__ELIST;

	/**
	 * The operation id for the '<em>Is Valid Root</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_ATTRIBUTE_INT___IS_VALID_ROOT__EOBJECT = EXTRACTOR_FILTER_ATTRIBUTE___IS_VALID_ROOT__EOBJECT;

	/**
	 * The operation id for the '<em>Is Filtered</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_ATTRIBUTE_INT___IS_FILTERED__EOBJECT = EXTRACTOR_FILTER_ATTRIBUTE___IS_FILTERED__EOBJECT;

	/**
	 * The operation id for the '<em>Get Attribute Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_ATTRIBUTE_INT___GET_ATTRIBUTE_VALUE = EXTRACTOR_FILTER_ATTRIBUTE___GET_ATTRIBUTE_VALUE;

	/**
	 * The number of operations of the '<em>Extractor Filter Attribute Int</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_ATTRIBUTE_INT_OPERATION_COUNT = EXTRACTOR_FILTER_ATTRIBUTE_OPERATION_COUNT + 0;

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
	 * The operation id for the '<em>Refresh Outs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_OCL___REFRESH_OUTS__ELIST = EXTRACTOR_FILTER___REFRESH_OUTS__ELIST;

	/**
	 * The operation id for the '<em>Is Valid Root</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_OCL___IS_VALID_ROOT__EOBJECT = EXTRACTOR_FILTER___IS_VALID_ROOT__EOBJECT;

	/**
	 * The operation id for the '<em>Is Filtered</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_OCL___IS_FILTERED__EOBJECT = EXTRACTOR_FILTER___IS_FILTERED__EOBJECT;

	/**
	 * The number of operations of the '<em>Extractor Filter Ocl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FILTER_OCL_OPERATION_COUNT = EXTRACTOR_FILTER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.datatools.impl.CategoryCriteriaAttributeImpl <em>Category Criteria Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.datatools.impl.CategoryCriteriaAttributeImpl
	 * @see com.misc.common.moplaf.datatools.impl.DatatoolsPackageImpl#getCategoryCriteriaAttribute()
	 * @generated
	 */
	int CATEGORY_CRITERIA_ATTRIBUTE = 18;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_CRITERIA_ATTRIBUTE__ELEMENTS = CATEGORY_CRITERIA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_CRITERIA_ATTRIBUTE__SOURCE_TYPE = CATEGORY_CRITERIA_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_CRITERIA_ATTRIBUTE__TARGET_TYPE = CATEGORY_CRITERIA_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_CRITERIA_ATTRIBUTE__ATTRIBUTE = CATEGORY_CRITERIA_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Category Criteria Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_CRITERIA_ATTRIBUTE_FEATURE_COUNT = CATEGORY_CRITERIA_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Category Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_CRITERIA_ATTRIBUTE___GET_CATEGORY_VALUE__EOBJECT = CATEGORY_CRITERIA___GET_CATEGORY_VALUE__EOBJECT;

	/**
	 * The operation id for the '<em>Construct Category</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_CRITERIA_ATTRIBUTE___CONSTRUCT_CATEGORY = CATEGORY_CRITERIA___CONSTRUCT_CATEGORY;

	/**
	 * The operation id for the '<em>Get Attribute Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_CRITERIA_ATTRIBUTE___GET_ATTRIBUTE_VALUE = CATEGORY_CRITERIA_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Category Criteria Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_CRITERIA_ATTRIBUTE_OPERATION_COUNT = CATEGORY_CRITERIA_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.datatools.impl.CategoryCriteriaOclImpl <em>Category Criteria Ocl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.datatools.impl.CategoryCriteriaOclImpl
	 * @see com.misc.common.moplaf.datatools.impl.DatatoolsPackageImpl#getCategoryCriteriaOcl()
	 * @generated
	 */
	int CATEGORY_CRITERIA_OCL = 19;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_CRITERIA_OCL__EXPRESSION = CATEGORY_CRITERIA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Category Criteria Ocl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_CRITERIA_OCL_FEATURE_COUNT = CATEGORY_CRITERIA_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Category Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_CRITERIA_OCL___GET_CATEGORY_VALUE__EOBJECT = CATEGORY_CRITERIA___GET_CATEGORY_VALUE__EOBJECT;

	/**
	 * The operation id for the '<em>Construct Category</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_CRITERIA_OCL___CONSTRUCT_CATEGORY = CATEGORY_CRITERIA___CONSTRUCT_CATEGORY;

	/**
	 * The number of operations of the '<em>Category Criteria Ocl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_CRITERIA_OCL_OPERATION_COUNT = CATEGORY_CRITERIA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.datatools.impl.ColumnizerExplicitImpl <em>Columnizer Explicit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.datatools.impl.ColumnizerExplicitImpl
	 * @see com.misc.common.moplaf.datatools.impl.DatatoolsPackageImpl#getColumnizerExplicit()
	 * @generated
	 */
	int COLUMNIZER_EXPLICIT = 20;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMNIZER_EXPLICIT__COLUMNS = COLUMNIZER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Columnizer Explicit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMNIZER_EXPLICIT_FEATURE_COUNT = COLUMNIZER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Columnizer Explicit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMNIZER_EXPLICIT_OPERATION_COUNT = COLUMNIZER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.datatools.impl.ColumnizerColumnImpl <em>Columnizer Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.datatools.impl.ColumnizerColumnImpl
	 * @see com.misc.common.moplaf.datatools.impl.DatatoolsPackageImpl#getColumnizerColumn()
	 * @generated
	 */
	int COLUMNIZER_COLUMN = 21;

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
	 * The number of structural features of the '<em>Columnizer Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMNIZER_COLUMN_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMNIZER_COLUMN___GET_VALUE__EOBJECT = 0;

	/**
	 * The number of operations of the '<em>Columnizer Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMNIZER_COLUMN_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.datatools.impl.ColumnizerColumnAttributeImpl <em>Columnizer Column Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.datatools.impl.ColumnizerColumnAttributeImpl
	 * @see com.misc.common.moplaf.datatools.impl.DatatoolsPackageImpl#getColumnizerColumnAttribute()
	 * @generated
	 */
	int COLUMNIZER_COLUMN_ATTRIBUTE = 22;

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
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMNIZER_COLUMN_ATTRIBUTE__ELEMENTS = COLUMNIZER_COLUMN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMNIZER_COLUMN_ATTRIBUTE__SOURCE_TYPE = COLUMNIZER_COLUMN_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMNIZER_COLUMN_ATTRIBUTE__TARGET_TYPE = COLUMNIZER_COLUMN_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMNIZER_COLUMN_ATTRIBUTE__ATTRIBUTE = COLUMNIZER_COLUMN_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Columnizer Column Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMNIZER_COLUMN_ATTRIBUTE_FEATURE_COUNT = COLUMNIZER_COLUMN_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMNIZER_COLUMN_ATTRIBUTE___GET_VALUE__EOBJECT = COLUMNIZER_COLUMN___GET_VALUE__EOBJECT;

	/**
	 * The number of operations of the '<em>Columnizer Column Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMNIZER_COLUMN_ATTRIBUTE_OPERATION_COUNT = COLUMNIZER_COLUMN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.datatools.impl.ColumnizerColumnOclImpl <em>Columnizer Column Ocl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.datatools.impl.ColumnizerColumnOclImpl
	 * @see com.misc.common.moplaf.datatools.impl.DatatoolsPackageImpl#getColumnizerColumnOcl()
	 * @generated
	 */
	int COLUMNIZER_COLUMN_OCL = 23;

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
	 * The number of operations of the '<em>Columnizer Column Ocl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMNIZER_COLUMN_OCL_OPERATION_COUNT = COLUMNIZER_COLUMN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.datatools.impl.NavigationPathImpl <em>Navigation Path</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.datatools.impl.NavigationPathImpl
	 * @see com.misc.common.moplaf.datatools.impl.DatatoolsPackageImpl#getNavigationPath()
	 * @generated
	 */
	int NAVIGATION_PATH = 24;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_PATH__ELEMENTS = 0;

	/**
	 * The feature id for the '<em><b>Source Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_PATH__SOURCE_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Target Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_PATH__TARGET_TYPE = 2;

	/**
	 * The number of structural features of the '<em>Navigation Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_PATH_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Navigation Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_PATH_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.datatools.impl.NavigationAxisImpl <em>Navigation Axis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.datatools.impl.NavigationAxisImpl
	 * @see com.misc.common.moplaf.datatools.impl.DatatoolsPackageImpl#getNavigationAxis()
	 * @generated
	 */
	int NAVIGATION_AXIS = 27;

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
	 * The number of structural features of the '<em>Navigation Axis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_AXIS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Navigation Axis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_AXIS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.datatools.impl.NavigationReferenceImpl <em>Navigation Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.datatools.impl.NavigationReferenceImpl
	 * @see com.misc.common.moplaf.datatools.impl.DatatoolsPackageImpl#getNavigationReference()
	 * @generated
	 */
	int NAVIGATION_REFERENCE = 25;

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
	 * The number of operations of the '<em>Navigation Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_REFERENCE_OPERATION_COUNT = NAVIGATION_AXIS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.datatools.impl.NavigationDowncastImpl <em>Navigation Downcast</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.datatools.impl.NavigationDowncastImpl
	 * @see com.misc.common.moplaf.datatools.impl.DatatoolsPackageImpl#getNavigationDowncast()
	 * @generated
	 */
	int NAVIGATION_DOWNCAST = 26;

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
	 * The number of operations of the '<em>Navigation Downcast</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_DOWNCAST_OPERATION_COUNT = NAVIGATION_AXIS_OPERATION_COUNT + 0;


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
	 * Returns the meta object for the containment reference list '{@link com.misc.common.moplaf.datatools.Categorizer#getCriteria <em>Criteria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Criteria</em>'.
	 * @see com.misc.common.moplaf.datatools.Categorizer#getCriteria()
	 * @see #getCategorizer()
	 * @generated
	 */
	EReference getCategorizer_Criteria();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.datatools.Categorizer#isValidRoot(org.eclipse.emf.ecore.EObject) <em>Is Valid Root</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Valid Root</em>' operation.
	 * @see com.misc.common.moplaf.datatools.Categorizer#isValidRoot(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getCategorizer__IsValidRoot__EObject();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.datatools.Categorizer#refreshCats(org.eclipse.emf.ecore.EObject) <em>Refresh Cats</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Refresh Cats</em>' operation.
	 * @see com.misc.common.moplaf.datatools.Categorizer#refreshCats(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getCategorizer__RefreshCats__EObject();

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
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.datatools.Category#getCriteria <em>Criteria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Criteria</em>'.
	 * @see com.misc.common.moplaf.datatools.Category#getCriteria()
	 * @see #getCategory()
	 * @generated
	 */
	EReference getCategory_Criteria();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.datatools.Category#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.misc.common.moplaf.datatools.Category#getValue()
	 * @see #getCategory()
	 * @generated
	 */
	EAttribute getCategory_Value();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.datatools.CategoryCriteria <em>Category Criteria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Category Criteria</em>'.
	 * @see com.misc.common.moplaf.datatools.CategoryCriteria
	 * @generated
	 */
	EClass getCategoryCriteria();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.datatools.CategoryCriteria#getCategoryValue(org.eclipse.emf.ecore.EObject) <em>Get Category Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Category Value</em>' operation.
	 * @see com.misc.common.moplaf.datatools.CategoryCriteria#getCategoryValue(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getCategoryCriteria__GetCategoryValue__EObject();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.datatools.CategoryCriteria#constructCategory() <em>Construct Category</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Construct Category</em>' operation.
	 * @see com.misc.common.moplaf.datatools.CategoryCriteria#constructCategory()
	 * @generated
	 */
	EOperation getCategoryCriteria__ConstructCategory();

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
	 * Returns the meta object for the '{@link com.misc.common.moplaf.datatools.Extractor#refreshOuts(org.eclipse.emf.common.util.EList) <em>Refresh Outs</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Refresh Outs</em>' operation.
	 * @see com.misc.common.moplaf.datatools.Extractor#refreshOuts(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getExtractor__RefreshOuts__EList();

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
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.datatools.CategoryAbstract#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see com.misc.common.moplaf.datatools.CategoryAbstract#getDescription()
	 * @see #getCategoryAbstract()
	 * @generated
	 */
	EAttribute getCategoryAbstract_Description();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.datatools.CategoryAbstract#getColumnizer <em>Columnizer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Columnizer</em>'.
	 * @see com.misc.common.moplaf.datatools.CategoryAbstract#getColumnizer()
	 * @see #getCategoryAbstract()
	 * @generated
	 */
	EReference getCategoryAbstract_Columnizer();

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
	 * Returns the meta object for class '{@link com.misc.common.moplaf.datatools.ExtractatorPipe <em>Extractator Pipe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extractator Pipe</em>'.
	 * @see com.misc.common.moplaf.datatools.ExtractatorPipe
	 * @generated
	 */
	EClass getExtractatorPipe();

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
	 * Returns the meta object for the '{@link com.misc.common.moplaf.datatools.ExtractorFilter#isFiltered(org.eclipse.emf.ecore.EObject) <em>Is Filtered</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Filtered</em>' operation.
	 * @see com.misc.common.moplaf.datatools.ExtractorFilter#isFiltered(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getExtractorFilter__IsFiltered__EObject();

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
	 * Returns the meta object for the '{@link com.misc.common.moplaf.datatools.ExtractorFilterAttribute#getAttributeValue() <em>Get Attribute Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Attribute Value</em>' operation.
	 * @see com.misc.common.moplaf.datatools.ExtractorFilterAttribute#getAttributeValue()
	 * @generated
	 */
	EOperation getExtractorFilterAttribute__GetAttributeValue();

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
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.datatools.ExtractorFilterAttributeInt#getMinValue <em>Min Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Value</em>'.
	 * @see com.misc.common.moplaf.datatools.ExtractorFilterAttributeInt#getMinValue()
	 * @see #getExtractorFilterAttributeInt()
	 * @generated
	 */
	EAttribute getExtractorFilterAttributeInt_MinValue();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.datatools.ExtractorFilterAttributeInt#getMaxValue <em>Max Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Value</em>'.
	 * @see com.misc.common.moplaf.datatools.ExtractorFilterAttributeInt#getMaxValue()
	 * @see #getExtractorFilterAttributeInt()
	 * @generated
	 */
	EAttribute getExtractorFilterAttributeInt_MaxValue();

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
	 * Returns the meta object for class '{@link com.misc.common.moplaf.datatools.CategoryCriteriaAttribute <em>Category Criteria Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Category Criteria Attribute</em>'.
	 * @see com.misc.common.moplaf.datatools.CategoryCriteriaAttribute
	 * @generated
	 */
	EClass getCategoryCriteriaAttribute();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.datatools.CategoryCriteriaAttribute#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute</em>'.
	 * @see com.misc.common.moplaf.datatools.CategoryCriteriaAttribute#getAttribute()
	 * @see #getCategoryCriteriaAttribute()
	 * @generated
	 */
	EReference getCategoryCriteriaAttribute_Attribute();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.datatools.CategoryCriteriaAttribute#getAttributeValue() <em>Get Attribute Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Attribute Value</em>' operation.
	 * @see com.misc.common.moplaf.datatools.CategoryCriteriaAttribute#getAttributeValue()
	 * @generated
	 */
	EOperation getCategoryCriteriaAttribute__GetAttributeValue();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.datatools.CategoryCriteriaOcl <em>Category Criteria Ocl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Category Criteria Ocl</em>'.
	 * @see com.misc.common.moplaf.datatools.CategoryCriteriaOcl
	 * @generated
	 */
	EClass getCategoryCriteriaOcl();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.datatools.CategoryCriteriaOcl#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see com.misc.common.moplaf.datatools.CategoryCriteriaOcl#getExpression()
	 * @see #getCategoryCriteriaOcl()
	 * @generated
	 */
	EAttribute getCategoryCriteriaOcl_Expression();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.datatools.ColumnizerExplicit <em>Columnizer Explicit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Columnizer Explicit</em>'.
	 * @see com.misc.common.moplaf.datatools.ColumnizerExplicit
	 * @generated
	 */
	EClass getColumnizerExplicit();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.common.moplaf.datatools.ColumnizerExplicit#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Columns</em>'.
	 * @see com.misc.common.moplaf.datatools.ColumnizerExplicit#getColumns()
	 * @see #getColumnizerExplicit()
	 * @generated
	 */
	EReference getColumnizerExplicit_Columns();

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
	 * Returns the meta object for the '{@link com.misc.common.moplaf.datatools.ColumnizerColumn#getValue(org.eclipse.emf.ecore.EObject) <em>Get Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Value</em>' operation.
	 * @see com.misc.common.moplaf.datatools.ColumnizerColumn#getValue(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getColumnizerColumn__GetValue__EObject();

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
	 * Returns the meta object for class '{@link com.misc.common.moplaf.datatools.NavigationPath <em>Navigation Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Navigation Path</em>'.
	 * @see com.misc.common.moplaf.datatools.NavigationPath
	 * @generated
	 */
	EClass getNavigationPath();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.common.moplaf.datatools.NavigationPath#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see com.misc.common.moplaf.datatools.NavigationPath#getElements()
	 * @see #getNavigationPath()
	 * @generated
	 */
	EReference getNavigationPath_Elements();

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
		 * The meta object literal for the '<em><b>Criteria</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORIZER__CRITERIA = eINSTANCE.getCategorizer_Criteria();

		/**
		 * The meta object literal for the '<em><b>Is Valid Root</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CATEGORIZER___IS_VALID_ROOT__EOBJECT = eINSTANCE.getCategorizer__IsValidRoot__EObject();

		/**
		 * The meta object literal for the '<em><b>Refresh Cats</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CATEGORIZER___REFRESH_CATS__EOBJECT = eINSTANCE.getCategorizer__RefreshCats__EObject();

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
		 * The meta object literal for the '<em><b>Criteria</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORY__CRITERIA = eINSTANCE.getCategory_Criteria();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATEGORY__VALUE = eINSTANCE.getCategory_Value();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.datatools.impl.CategoryCriteriaImpl <em>Category Criteria</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.datatools.impl.CategoryCriteriaImpl
		 * @see com.misc.common.moplaf.datatools.impl.DatatoolsPackageImpl#getCategoryCriteria()
		 * @generated
		 */
		EClass CATEGORY_CRITERIA = eINSTANCE.getCategoryCriteria();

		/**
		 * The meta object literal for the '<em><b>Get Category Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CATEGORY_CRITERIA___GET_CATEGORY_VALUE__EOBJECT = eINSTANCE.getCategoryCriteria__GetCategoryValue__EObject();

		/**
		 * The meta object literal for the '<em><b>Construct Category</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CATEGORY_CRITERIA___CONSTRUCT_CATEGORY = eINSTANCE.getCategoryCriteria__ConstructCategory();

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
		 * The meta object literal for the '<em><b>Refresh Outs</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXTRACTOR___REFRESH_OUTS__ELIST = eINSTANCE.getExtractor__RefreshOuts__EList();

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
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATEGORY_ABSTRACT__DESCRIPTION = eINSTANCE.getCategoryAbstract_Description();

		/**
		 * The meta object literal for the '<em><b>Columnizer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORY_ABSTRACT__COLUMNIZER = eINSTANCE.getCategoryAbstract_Columnizer();

		/**
		 * The meta object literal for the '<em><b>Get Subcategory</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CATEGORY_ABSTRACT___GET_SUBCATEGORY__EOBJECT = eINSTANCE.getCategoryAbstract__GetSubcategory__EObject();

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
		 * The meta object literal for the '{@link com.misc.common.moplaf.datatools.impl.ExtractatorPipeImpl <em>Extractator Pipe</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.datatools.impl.ExtractatorPipeImpl
		 * @see com.misc.common.moplaf.datatools.impl.DatatoolsPackageImpl#getExtractatorPipe()
		 * @generated
		 */
		EClass EXTRACTATOR_PIPE = eINSTANCE.getExtractatorPipe();

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
		 * The meta object literal for the '<em><b>Is Filtered</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXTRACTOR_FILTER___IS_FILTERED__EOBJECT = eINSTANCE.getExtractorFilter__IsFiltered__EObject();

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
		EOperation EXTRACTOR_FILTER_ATTRIBUTE___GET_ATTRIBUTE_VALUE = eINSTANCE.getExtractorFilterAttribute__GetAttributeValue();

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
		 * The meta object literal for the '<em><b>Min Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTRACTOR_FILTER_ATTRIBUTE_INT__MIN_VALUE = eINSTANCE.getExtractorFilterAttributeInt_MinValue();

		/**
		 * The meta object literal for the '<em><b>Max Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTRACTOR_FILTER_ATTRIBUTE_INT__MAX_VALUE = eINSTANCE.getExtractorFilterAttributeInt_MaxValue();

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
		 * The meta object literal for the '{@link com.misc.common.moplaf.datatools.impl.CategoryCriteriaAttributeImpl <em>Category Criteria Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.datatools.impl.CategoryCriteriaAttributeImpl
		 * @see com.misc.common.moplaf.datatools.impl.DatatoolsPackageImpl#getCategoryCriteriaAttribute()
		 * @generated
		 */
		EClass CATEGORY_CRITERIA_ATTRIBUTE = eINSTANCE.getCategoryCriteriaAttribute();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORY_CRITERIA_ATTRIBUTE__ATTRIBUTE = eINSTANCE.getCategoryCriteriaAttribute_Attribute();

		/**
		 * The meta object literal for the '<em><b>Get Attribute Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CATEGORY_CRITERIA_ATTRIBUTE___GET_ATTRIBUTE_VALUE = eINSTANCE.getCategoryCriteriaAttribute__GetAttributeValue();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.datatools.impl.CategoryCriteriaOclImpl <em>Category Criteria Ocl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.datatools.impl.CategoryCriteriaOclImpl
		 * @see com.misc.common.moplaf.datatools.impl.DatatoolsPackageImpl#getCategoryCriteriaOcl()
		 * @generated
		 */
		EClass CATEGORY_CRITERIA_OCL = eINSTANCE.getCategoryCriteriaOcl();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATEGORY_CRITERIA_OCL__EXPRESSION = eINSTANCE.getCategoryCriteriaOcl_Expression();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.datatools.impl.ColumnizerExplicitImpl <em>Columnizer Explicit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.datatools.impl.ColumnizerExplicitImpl
		 * @see com.misc.common.moplaf.datatools.impl.DatatoolsPackageImpl#getColumnizerExplicit()
		 * @generated
		 */
		EClass COLUMNIZER_EXPLICIT = eINSTANCE.getColumnizerExplicit();

		/**
		 * The meta object literal for the '<em><b>Columns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLUMNIZER_EXPLICIT__COLUMNS = eINSTANCE.getColumnizerExplicit_Columns();

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
		 * The meta object literal for the '<em><b>Get Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COLUMNIZER_COLUMN___GET_VALUE__EOBJECT = eINSTANCE.getColumnizerColumn__GetValue__EObject();

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
		 * The meta object literal for the '{@link com.misc.common.moplaf.datatools.impl.NavigationPathImpl <em>Navigation Path</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.datatools.impl.NavigationPathImpl
		 * @see com.misc.common.moplaf.datatools.impl.DatatoolsPackageImpl#getNavigationPath()
		 * @generated
		 */
		EClass NAVIGATION_PATH = eINSTANCE.getNavigationPath();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAVIGATION_PATH__ELEMENTS = eINSTANCE.getNavigationPath_Elements();

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

	}

} //DatatoolsPackage
