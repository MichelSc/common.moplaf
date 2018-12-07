/**
 */
package com.misc.common.moplaf.analysis;

import com.misc.common.moplaf.datatools.DatatoolsPackage;
import com.misc.common.moplaf.job.JobPackage;
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
 * @see com.misc.common.moplaf.analysis.AnalysisFactory
 * @model kind="package"
 * @generated
 */
public interface AnalysisPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "analysis";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.misc.com/common/moplaf/analysis/model/0.1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "analysis";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AnalysisPackage eINSTANCE = com.misc.common.moplaf.analysis.impl.AnalysisPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.analysis.impl.AnalysisImpl <em>Analysis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.analysis.impl.AnalysisImpl
	 * @see com.misc.common.moplaf.analysis.impl.AnalysisPackageImpl#getAnalysis()
	 * @generated
	 */
	int ANALYSIS = 0;

	/**
	 * The feature id for the '<em><b>Nb Elements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS__NB_ELEMENTS = DatatoolsPackage.CATEGORY_ABSTRACT__NB_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Sub Categories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS__SUB_CATEGORIES = DatatoolsPackage.CATEGORY_ABSTRACT__SUB_CATEGORIES;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS__ELEMENTS = DatatoolsPackage.CATEGORY_ABSTRACT__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Super Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS__SUPER_CATEGORY = DatatoolsPackage.CATEGORY_ABSTRACT__SUPER_CATEGORY;

	/**
	 * The feature id for the '<em><b>Root Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS__ROOT_CATEGORY = DatatoolsPackage.CATEGORY_ABSTRACT__ROOT_CATEGORY;

	/**
	 * The feature id for the '<em><b>Columnizers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS__COLUMNIZERS = DatatoolsPackage.CATEGORY_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Extractor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS__EXTRACTOR = DatatoolsPackage.CATEGORY_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Complete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS__COMPLETE = DatatoolsPackage.CATEGORY_ABSTRACT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Max Elements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS__MAX_ELEMENTS = DatatoolsPackage.CATEGORY_ABSTRACT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Categorizers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS__CATEGORIZERS = DatatoolsPackage.CATEGORY_ABSTRACT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS__DESCRIPTION = DatatoolsPackage.CATEGORY_ABSTRACT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Data Tools</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS__DATA_TOOLS = DatatoolsPackage.CATEGORY_ABSTRACT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS__DOMAIN = DatatoolsPackage.CATEGORY_ABSTRACT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Refresh Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS__REFRESH_FEEDBACK = DatatoolsPackage.CATEGORY_ABSTRACT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS__NAME = DatatoolsPackage.CATEGORY_ABSTRACT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Remarks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS__REMARKS = DatatoolsPackage.CATEGORY_ABSTRACT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Docs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS__DOCS = DatatoolsPackage.CATEGORY_ABSTRACT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Sheets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS__SHEETS = DatatoolsPackage.CATEGORY_ABSTRACT_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Analysis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_FEATURE_COUNT = DatatoolsPackage.CATEGORY_ABSTRACT_FEATURE_COUNT + 13;

	/**
	 * The operation id for the '<em>Get Subcategory</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS___GET_SUBCATEGORY__EOBJECT_2 = DatatoolsPackage.CATEGORY_ABSTRACT___GET_SUBCATEGORY__EOBJECT;

	/**
	 * The operation id for the '<em>Get Property Aggregation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS___GET_PROPERTY_AGGREGATION__IPROPERTIESPROVIDER_OBJECT_2 = DatatoolsPackage.CATEGORY_ABSTRACT___GET_PROPERTY_AGGREGATION__IPROPERTIESPROVIDER_OBJECT;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS___REFRESH__CATEGORYFACTORY_OBJECTSET_ELIST_INT_2 = DatatoolsPackage.CATEGORY_ABSTRACT___REFRESH__CATEGORYFACTORY_OBJECTSET_ELIST_INT;

	/**
	 * The operation id for the '<em>Is In</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS___IS_IN__CATEGORYABSTRACT_2 = DatatoolsPackage.CATEGORY_ABSTRACT___IS_IN__CATEGORYABSTRACT;

	/**
	 * The operation id for the '<em>Get Domain Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS___GET_DOMAIN_TYPES = DatatoolsPackage.CATEGORY_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Construct Category</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS___CONSTRUCT_CATEGORY = DatatoolsPackage.CATEGORY_ABSTRACT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Set Leaf Category</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS___SET_LEAF_CATEGORY__EOBJECT_CATEGORYABSTRACT = DatatoolsPackage.CATEGORY_ABSTRACT_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS___REFRESH = DatatoolsPackage.CATEGORY_ABSTRACT_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Add Tool</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS___ADD_TOOL__DATATOOL = DatatoolsPackage.CATEGORY_ABSTRACT_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Flush</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS___FLUSH = DatatoolsPackage.CATEGORY_ABSTRACT_OPERATION_COUNT + 5;

	/**
	 * The number of operations of the '<em>Analysis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_OPERATION_COUNT = DatatoolsPackage.CATEGORY_ABSTRACT_OPERATION_COUNT + 6;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.analysis.impl.AnalysisDomainImpl <em>Domain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.analysis.impl.AnalysisDomainImpl
	 * @see com.misc.common.moplaf.analysis.impl.AnalysisPackageImpl#getAnalysisDomain()
	 * @generated
	 */
	int ANALYSIS_DOMAIN = 1;

	/**
	 * The feature id for the '<em><b>Docs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_DOMAIN__DOCS = JobPackage.TASK_DOMAIN__DOCS;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_DOMAIN__TASKS = JobPackage.TASK_DOMAIN__TASKS;

	/**
	 * The feature id for the '<em><b>Super Domain</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_DOMAIN__SUPER_DOMAIN = JobPackage.TASK_DOMAIN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sub Domains</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_DOMAIN__SUB_DOMAINS = JobPackage.TASK_DOMAIN_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Analyses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_DOMAIN__ANALYSES = JobPackage.TASK_DOMAIN_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Data Tools</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_DOMAIN__DATA_TOOLS = JobPackage.TASK_DOMAIN_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_DOMAIN_FEATURE_COUNT = JobPackage.TASK_DOMAIN_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Garbage Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_DOMAIN___GARBAGE_COLLECT = JobPackage.TASK_DOMAIN___GARBAGE_COLLECT;

	/**
	 * The operation id for the '<em>Get New Tasks</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_DOMAIN___GET_NEW_TASKS = JobPackage.TASK_DOMAIN___GET_NEW_TASKS;

	/**
	 * The operation id for the '<em>Get Domain Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_DOMAIN___GET_DOMAIN_TYPES = JobPackage.TASK_DOMAIN_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get New Data Tools</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_DOMAIN___GET_NEW_DATA_TOOLS__DATATOOLTYPE = JobPackage.TASK_DOMAIN_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_DOMAIN_OPERATION_COUNT = JobPackage.TASK_DOMAIN_OPERATION_COUNT + 2;


	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.analysis.impl.DataToolsImpl <em>Data Tools</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.analysis.impl.DataToolsImpl
	 * @see com.misc.common.moplaf.analysis.impl.AnalysisPackageImpl#getDataTools()
	 * @generated
	 */
	int DATA_TOOLS = 2;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TOOLS__DOMAIN = DatatoolsPackage.DATA_TOOL_CONTEXT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data Tools</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TOOLS__DATA_TOOLS = DatatoolsPackage.DATA_TOOL_CONTEXT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Data Tools</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TOOLS_FEATURE_COUNT = DatatoolsPackage.DATA_TOOL_CONTEXT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Domain Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TOOLS___GET_DOMAIN_TYPES = DatatoolsPackage.DATA_TOOL_CONTEXT___GET_DOMAIN_TYPES;

	/**
	 * The number of operations of the '<em>Data Tools</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TOOLS_OPERATION_COUNT = DatatoolsPackage.DATA_TOOL_CONTEXT_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.analysis.impl.AnalysisDocImpl <em>Doc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.analysis.impl.AnalysisDocImpl
	 * @see com.misc.common.moplaf.analysis.impl.AnalysisPackageImpl#getAnalysisDoc()
	 * @generated
	 */
	int ANALYSIS_DOC = 3;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_DOC__DOC = JobPackage.DOC_REF__DOC;

	/**
	 * The feature id for the '<em><b>Analysis</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_DOC__ANALYSIS = JobPackage.DOC_REF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_DOC__ELEMENTS = JobPackage.DOC_REF_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Complete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_DOC__COMPLETE = JobPackage.DOC_REF_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Doc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_DOC_FEATURE_COUNT = JobPackage.DOC_REF_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_DOC___GET_ELEMENTS__CATEGORY = JobPackage.DOC_REF_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Doc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_DOC_OPERATION_COUNT = JobPackage.DOC_REF_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.analysis.impl.AnalysisElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.analysis.impl.AnalysisElementImpl
	 * @see com.misc.common.moplaf.analysis.impl.AnalysisPackageImpl#getAnalysisElement()
	 * @generated
	 */
	int ANALYSIS_ELEMENT = 4;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_ELEMENT__DOC = DatatoolsPackage.CATEGORIZER_SUBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Key</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_ELEMENT__KEY = DatatoolsPackage.CATEGORIZER_SUBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_ELEMENT__ELEMENT = DatatoolsPackage.CATEGORIZER_SUBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_ELEMENT__CATEGORY = DatatoolsPackage.CATEGORIZER_SUBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_ELEMENT_FEATURE_COUNT = DatatoolsPackage.CATEGORIZER_SUBJECT_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Subject</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_ELEMENT___GET_SUBJECT = DatatoolsPackage.CATEGORIZER_SUBJECT___GET_SUBJECT;

	/**
	 * The operation id for the '<em>Is In Category</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_ELEMENT___IS_IN_CATEGORY__CATEGORYABSTRACT = DatatoolsPackage.CATEGORIZER_SUBJECT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_ELEMENT_OPERATION_COUNT = DatatoolsPackage.CATEGORIZER_SUBJECT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.analysis.impl.AnalysisElementKeyImpl <em>Element Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.analysis.impl.AnalysisElementKeyImpl
	 * @see com.misc.common.moplaf.analysis.impl.AnalysisPackageImpl#getAnalysisElementKey()
	 * @generated
	 */
	int ANALYSIS_ELEMENT_KEY = 5;

	/**
	 * The feature id for the '<em><b>Sheet</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_ELEMENT_KEY__SHEET = 0;

	/**
	 * The feature id for the '<em><b>Docs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_ELEMENT_KEY__DOCS = 1;

	/**
	 * The number of structural features of the '<em>Element Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_ELEMENT_KEY_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Get Key Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_ELEMENT_KEY___GET_KEY_VALUE = 0;

	/**
	 * The number of operations of the '<em>Element Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_ELEMENT_KEY_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.analysis.impl.AnalysisColumnizerImpl <em>Columnizer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.analysis.impl.AnalysisColumnizerImpl
	 * @see com.misc.common.moplaf.analysis.impl.AnalysisPackageImpl#getAnalysisColumnizer()
	 * @generated
	 */
	int ANALYSIS_COLUMNIZER = 6;

	/**
	 * The feature id for the '<em><b>Keys</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_COLUMNIZER__KEYS = 0;

	/**
	 * The feature id for the '<em><b>Analysis</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_COLUMNIZER__ANALYSIS = 1;

	/**
	 * The feature id for the '<em><b>Columnizer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_COLUMNIZER__COLUMNIZER = 2;

	/**
	 * The number of structural features of the '<em>Columnizer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_COLUMNIZER_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Add Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_COLUMNIZER___ADD_ELEMENT__ANALYSISELEMENT = 0;

	/**
	 * The operation id for the '<em>Remove Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_COLUMNIZER___REMOVE_ELEMENT__ANALYSISELEMENT = 1;

	/**
	 * The operation id for the '<em>Get Key Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_COLUMNIZER___GET_KEY_VALUE__EOBJECT = 2;

	/**
	 * The number of operations of the '<em>Columnizer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_COLUMNIZER_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.analysis.impl.AnalysisCategoryImpl <em>Category</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.analysis.impl.AnalysisCategoryImpl
	 * @see com.misc.common.moplaf.analysis.impl.AnalysisPackageImpl#getAnalysisCategory()
	 * @generated
	 */
	int ANALYSIS_CATEGORY = 7;

	/**
	 * The feature id for the '<em><b>Nb Elements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_CATEGORY__NB_ELEMENTS = DatatoolsPackage.CATEGORY__NB_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Sub Categories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_CATEGORY__SUB_CATEGORIES = DatatoolsPackage.CATEGORY__SUB_CATEGORIES;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_CATEGORY__ELEMENTS = DatatoolsPackage.CATEGORY__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Super Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_CATEGORY__SUPER_CATEGORY = DatatoolsPackage.CATEGORY__SUPER_CATEGORY;

	/**
	 * The feature id for the '<em><b>Root Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_CATEGORY__ROOT_CATEGORY = DatatoolsPackage.CATEGORY__ROOT_CATEGORY;

	/**
	 * The feature id for the '<em><b>Category Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_CATEGORY__CATEGORY_LABEL = DatatoolsPackage.CATEGORY__CATEGORY_LABEL;

	/**
	 * The feature id for the '<em><b>Category Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_CATEGORY__CATEGORY_VALUE = DatatoolsPackage.CATEGORY__CATEGORY_VALUE;

	/**
	 * The feature id for the '<em><b>Analysis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_CATEGORY__ANALYSIS = DatatoolsPackage.CATEGORY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_CATEGORY_FEATURE_COUNT = DatatoolsPackage.CATEGORY_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Subcategory</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_CATEGORY___GET_SUBCATEGORY__EOBJECT_2 = DatatoolsPackage.CATEGORY___GET_SUBCATEGORY__EOBJECT;

	/**
	 * The operation id for the '<em>Get Property Aggregation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_CATEGORY___GET_PROPERTY_AGGREGATION__IPROPERTIESPROVIDER_OBJECT_2 = DatatoolsPackage.CATEGORY___GET_PROPERTY_AGGREGATION__IPROPERTIESPROVIDER_OBJECT;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_CATEGORY___REFRESH__CATEGORYFACTORY_OBJECTSET_ELIST_INT_2 = DatatoolsPackage.CATEGORY___REFRESH__CATEGORYFACTORY_OBJECTSET_ELIST_INT;

	/**
	 * The operation id for the '<em>Is In</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_CATEGORY___IS_IN__CATEGORYABSTRACT_2 = DatatoolsPackage.CATEGORY___IS_IN__CATEGORYABSTRACT;

	/**
	 * The number of operations of the '<em>Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_CATEGORY_OPERATION_COUNT = DatatoolsPackage.CATEGORY_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.analysis.Analysis <em>Analysis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Analysis</em>'.
	 * @see com.misc.common.moplaf.analysis.Analysis
	 * @generated
	 */
	EClass getAnalysis();

	/**
	 * Returns the meta object for the containment reference '{@link com.misc.common.moplaf.analysis.Analysis#getExtractor <em>Extractor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Extractor</em>'.
	 * @see com.misc.common.moplaf.analysis.Analysis#getExtractor()
	 * @see #getAnalysis()
	 * @generated
	 */
	EReference getAnalysis_Extractor();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.analysis.Analysis#isComplete <em>Complete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Complete</em>'.
	 * @see com.misc.common.moplaf.analysis.Analysis#isComplete()
	 * @see #getAnalysis()
	 * @generated
	 */
	EAttribute getAnalysis_Complete();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.analysis.Analysis#getMaxElements <em>Max Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Elements</em>'.
	 * @see com.misc.common.moplaf.analysis.Analysis#getMaxElements()
	 * @see #getAnalysis()
	 * @generated
	 */
	EAttribute getAnalysis_MaxElements();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.common.moplaf.analysis.Analysis#getCategorizers <em>Categorizers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Categorizers</em>'.
	 * @see com.misc.common.moplaf.analysis.Analysis#getCategorizers()
	 * @see #getAnalysis()
	 * @generated
	 */
	EReference getAnalysis_Categorizers();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.analysis.Analysis#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see com.misc.common.moplaf.analysis.Analysis#getDescription()
	 * @see #getAnalysis()
	 * @generated
	 */
	EAttribute getAnalysis_Description();

	/**
	 * Returns the meta object for the reference list '{@link com.misc.common.moplaf.analysis.Analysis#getDataTools <em>Data Tools</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Data Tools</em>'.
	 * @see com.misc.common.moplaf.analysis.Analysis#getDataTools()
	 * @see #getAnalysis()
	 * @generated
	 */
	EReference getAnalysis_DataTools();

	/**
	 * Returns the meta object for the container reference '{@link com.misc.common.moplaf.analysis.Analysis#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Domain</em>'.
	 * @see com.misc.common.moplaf.analysis.Analysis#getDomain()
	 * @see #getAnalysis()
	 * @generated
	 */
	EReference getAnalysis_Domain();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.analysis.Analysis#getRefreshFeedback <em>Refresh Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Refresh Feedback</em>'.
	 * @see com.misc.common.moplaf.analysis.Analysis#getRefreshFeedback()
	 * @see #getAnalysis()
	 * @generated
	 */
	EAttribute getAnalysis_RefreshFeedback();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.analysis.Analysis#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.misc.common.moplaf.analysis.Analysis#getName()
	 * @see #getAnalysis()
	 * @generated
	 */
	EAttribute getAnalysis_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.analysis.Analysis#getRemarks <em>Remarks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remarks</em>'.
	 * @see com.misc.common.moplaf.analysis.Analysis#getRemarks()
	 * @see #getAnalysis()
	 * @generated
	 */
	EAttribute getAnalysis_Remarks();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.common.moplaf.analysis.Analysis#getDocs <em>Docs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Docs</em>'.
	 * @see com.misc.common.moplaf.analysis.Analysis#getDocs()
	 * @see #getAnalysis()
	 * @generated
	 */
	EReference getAnalysis_Docs();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.common.moplaf.analysis.Analysis#getSheets <em>Sheets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sheets</em>'.
	 * @see com.misc.common.moplaf.analysis.Analysis#getSheets()
	 * @see #getAnalysis()
	 * @generated
	 */
	EReference getAnalysis_Sheets();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.analysis.Analysis#refresh() <em>Refresh</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Refresh</em>' operation.
	 * @see com.misc.common.moplaf.analysis.Analysis#refresh()
	 * @generated
	 */
	EOperation getAnalysis__Refresh();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.analysis.Analysis#addTool(com.misc.common.moplaf.datatools.DataTool) <em>Add Tool</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Tool</em>' operation.
	 * @see com.misc.common.moplaf.analysis.Analysis#addTool(com.misc.common.moplaf.datatools.DataTool)
	 * @generated
	 */
	EOperation getAnalysis__AddTool__DataTool();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.analysis.Analysis#flush() <em>Flush</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Flush</em>' operation.
	 * @see com.misc.common.moplaf.analysis.Analysis#flush()
	 * @generated
	 */
	EOperation getAnalysis__Flush();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.analysis.AnalysisDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain</em>'.
	 * @see com.misc.common.moplaf.analysis.AnalysisDomain
	 * @generated
	 */
	EClass getAnalysisDomain();

	/**
	 * Returns the meta object for the container reference '{@link com.misc.common.moplaf.analysis.AnalysisDomain#getSuperDomain <em>Super Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Super Domain</em>'.
	 * @see com.misc.common.moplaf.analysis.AnalysisDomain#getSuperDomain()
	 * @see #getAnalysisDomain()
	 * @generated
	 */
	EReference getAnalysisDomain_SuperDomain();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.common.moplaf.analysis.AnalysisDomain#getSubDomains <em>Sub Domains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Domains</em>'.
	 * @see com.misc.common.moplaf.analysis.AnalysisDomain#getSubDomains()
	 * @see #getAnalysisDomain()
	 * @generated
	 */
	EReference getAnalysisDomain_SubDomains();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.common.moplaf.analysis.AnalysisDomain#getAnalyses <em>Analyses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Analyses</em>'.
	 * @see com.misc.common.moplaf.analysis.AnalysisDomain#getAnalyses()
	 * @see #getAnalysisDomain()
	 * @generated
	 */
	EReference getAnalysisDomain_Analyses();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.common.moplaf.analysis.AnalysisDomain#getDataTools <em>Data Tools</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Tools</em>'.
	 * @see com.misc.common.moplaf.analysis.AnalysisDomain#getDataTools()
	 * @see #getAnalysisDomain()
	 * @generated
	 */
	EReference getAnalysisDomain_DataTools();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.analysis.AnalysisDomain#getNewDataTools(com.misc.common.moplaf.datatools.DataToolType) <em>Get New Data Tools</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get New Data Tools</em>' operation.
	 * @see com.misc.common.moplaf.analysis.AnalysisDomain#getNewDataTools(com.misc.common.moplaf.datatools.DataToolType)
	 * @generated
	 */
	EOperation getAnalysisDomain__GetNewDataTools__DataToolType();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.analysis.DataTools <em>Data Tools</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Tools</em>'.
	 * @see com.misc.common.moplaf.analysis.DataTools
	 * @generated
	 */
	EClass getDataTools();

	/**
	 * Returns the meta object for the container reference '{@link com.misc.common.moplaf.analysis.DataTools#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Domain</em>'.
	 * @see com.misc.common.moplaf.analysis.DataTools#getDomain()
	 * @see #getDataTools()
	 * @generated
	 */
	EReference getDataTools_Domain();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.common.moplaf.analysis.DataTools#getDataTools <em>Data Tools</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Tools</em>'.
	 * @see com.misc.common.moplaf.analysis.DataTools#getDataTools()
	 * @see #getDataTools()
	 * @generated
	 */
	EReference getDataTools_DataTools();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.analysis.AnalysisDoc <em>Doc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Doc</em>'.
	 * @see com.misc.common.moplaf.analysis.AnalysisDoc
	 * @generated
	 */
	EClass getAnalysisDoc();

	/**
	 * Returns the meta object for the container reference '{@link com.misc.common.moplaf.analysis.AnalysisDoc#getAnalysis <em>Analysis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Analysis</em>'.
	 * @see com.misc.common.moplaf.analysis.AnalysisDoc#getAnalysis()
	 * @see #getAnalysisDoc()
	 * @generated
	 */
	EReference getAnalysisDoc_Analysis();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.common.moplaf.analysis.AnalysisDoc#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see com.misc.common.moplaf.analysis.AnalysisDoc#getElements()
	 * @see #getAnalysisDoc()
	 * @generated
	 */
	EReference getAnalysisDoc_Elements();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.analysis.AnalysisDoc#isComplete <em>Complete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Complete</em>'.
	 * @see com.misc.common.moplaf.analysis.AnalysisDoc#isComplete()
	 * @see #getAnalysisDoc()
	 * @generated
	 */
	EAttribute getAnalysisDoc_Complete();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.analysis.AnalysisDoc#getElements(com.misc.common.moplaf.datatools.Category) <em>Get Elements</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Elements</em>' operation.
	 * @see com.misc.common.moplaf.analysis.AnalysisDoc#getElements(com.misc.common.moplaf.datatools.Category)
	 * @generated
	 */
	EOperation getAnalysisDoc__GetElements__Category();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.analysis.AnalysisElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see com.misc.common.moplaf.analysis.AnalysisElement
	 * @generated
	 */
	EClass getAnalysisElement();

	/**
	 * Returns the meta object for the container reference '{@link com.misc.common.moplaf.analysis.AnalysisElement#getDoc <em>Doc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Doc</em>'.
	 * @see com.misc.common.moplaf.analysis.AnalysisElement#getDoc()
	 * @see #getAnalysisElement()
	 * @generated
	 */
	EReference getAnalysisElement_Doc();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.analysis.AnalysisElement#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Key</em>'.
	 * @see com.misc.common.moplaf.analysis.AnalysisElement#getKey()
	 * @see #getAnalysisElement()
	 * @generated
	 */
	EReference getAnalysisElement_Key();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.analysis.AnalysisElement#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Element</em>'.
	 * @see com.misc.common.moplaf.analysis.AnalysisElement#getElement()
	 * @see #getAnalysisElement()
	 * @generated
	 */
	EReference getAnalysisElement_Element();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.analysis.AnalysisElement#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Category</em>'.
	 * @see com.misc.common.moplaf.analysis.AnalysisElement#getCategory()
	 * @see #getAnalysisElement()
	 * @generated
	 */
	EReference getAnalysisElement_Category();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.analysis.AnalysisElement#isInCategory(com.misc.common.moplaf.datatools.CategoryAbstract) <em>Is In Category</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is In Category</em>' operation.
	 * @see com.misc.common.moplaf.analysis.AnalysisElement#isInCategory(com.misc.common.moplaf.datatools.CategoryAbstract)
	 * @generated
	 */
	EOperation getAnalysisElement__IsInCategory__CategoryAbstract();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.analysis.AnalysisElementKey <em>Element Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Key</em>'.
	 * @see com.misc.common.moplaf.analysis.AnalysisElementKey
	 * @generated
	 */
	EClass getAnalysisElementKey();

	/**
	 * Returns the meta object for the container reference '{@link com.misc.common.moplaf.analysis.AnalysisElementKey#getSheet <em>Sheet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Sheet</em>'.
	 * @see com.misc.common.moplaf.analysis.AnalysisElementKey#getSheet()
	 * @see #getAnalysisElementKey()
	 * @generated
	 */
	EReference getAnalysisElementKey_Sheet();

	/**
	 * Returns the meta object for the reference list '{@link com.misc.common.moplaf.analysis.AnalysisElementKey#getDocs <em>Docs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Docs</em>'.
	 * @see com.misc.common.moplaf.analysis.AnalysisElementKey#getDocs()
	 * @see #getAnalysisElementKey()
	 * @generated
	 */
	EReference getAnalysisElementKey_Docs();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.analysis.AnalysisElementKey#getKeyValue() <em>Get Key Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Key Value</em>' operation.
	 * @see com.misc.common.moplaf.analysis.AnalysisElementKey#getKeyValue()
	 * @generated
	 */
	EOperation getAnalysisElementKey__GetKeyValue();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.analysis.AnalysisColumnizer <em>Columnizer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Columnizer</em>'.
	 * @see com.misc.common.moplaf.analysis.AnalysisColumnizer
	 * @generated
	 */
	EClass getAnalysisColumnizer();

	/**
	 * Returns the meta object for the containment reference '{@link com.misc.common.moplaf.analysis.AnalysisColumnizer#getKeys <em>Keys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Keys</em>'.
	 * @see com.misc.common.moplaf.analysis.AnalysisColumnizer#getKeys()
	 * @see #getAnalysisColumnizer()
	 * @generated
	 */
	EReference getAnalysisColumnizer_Keys();

	/**
	 * Returns the meta object for the container reference '{@link com.misc.common.moplaf.analysis.AnalysisColumnizer#getAnalysis <em>Analysis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Analysis</em>'.
	 * @see com.misc.common.moplaf.analysis.AnalysisColumnizer#getAnalysis()
	 * @see #getAnalysisColumnizer()
	 * @generated
	 */
	EReference getAnalysisColumnizer_Analysis();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.analysis.AnalysisColumnizer#getColumnizer <em>Columnizer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Columnizer</em>'.
	 * @see com.misc.common.moplaf.analysis.AnalysisColumnizer#getColumnizer()
	 * @see #getAnalysisColumnizer()
	 * @generated
	 */
	EReference getAnalysisColumnizer_Columnizer();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.analysis.AnalysisColumnizer#addElement(com.misc.common.moplaf.analysis.AnalysisElement) <em>Add Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Element</em>' operation.
	 * @see com.misc.common.moplaf.analysis.AnalysisColumnizer#addElement(com.misc.common.moplaf.analysis.AnalysisElement)
	 * @generated
	 */
	EOperation getAnalysisColumnizer__AddElement__AnalysisElement();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.analysis.AnalysisColumnizer#removeElement(com.misc.common.moplaf.analysis.AnalysisElement) <em>Remove Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Element</em>' operation.
	 * @see com.misc.common.moplaf.analysis.AnalysisColumnizer#removeElement(com.misc.common.moplaf.analysis.AnalysisElement)
	 * @generated
	 */
	EOperation getAnalysisColumnizer__RemoveElement__AnalysisElement();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.analysis.AnalysisColumnizer#getKeyValue(org.eclipse.emf.ecore.EObject) <em>Get Key Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Key Value</em>' operation.
	 * @see com.misc.common.moplaf.analysis.AnalysisColumnizer#getKeyValue(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getAnalysisColumnizer__GetKeyValue__EObject();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.analysis.AnalysisCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Category</em>'.
	 * @see com.misc.common.moplaf.analysis.AnalysisCategory
	 * @generated
	 */
	EClass getAnalysisCategory();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.analysis.AnalysisCategory#getAnalysis <em>Analysis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Analysis</em>'.
	 * @see com.misc.common.moplaf.analysis.AnalysisCategory#getAnalysis()
	 * @see #getAnalysisCategory()
	 * @generated
	 */
	EReference getAnalysisCategory_Analysis();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AnalysisFactory getAnalysisFactory();

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
		 * The meta object literal for the '{@link com.misc.common.moplaf.analysis.impl.AnalysisImpl <em>Analysis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.analysis.impl.AnalysisImpl
		 * @see com.misc.common.moplaf.analysis.impl.AnalysisPackageImpl#getAnalysis()
		 * @generated
		 */
		EClass ANALYSIS = eINSTANCE.getAnalysis();

		/**
		 * The meta object literal for the '<em><b>Extractor</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANALYSIS__EXTRACTOR = eINSTANCE.getAnalysis_Extractor();

		/**
		 * The meta object literal for the '<em><b>Complete</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANALYSIS__COMPLETE = eINSTANCE.getAnalysis_Complete();

		/**
		 * The meta object literal for the '<em><b>Max Elements</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANALYSIS__MAX_ELEMENTS = eINSTANCE.getAnalysis_MaxElements();

		/**
		 * The meta object literal for the '<em><b>Categorizers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANALYSIS__CATEGORIZERS = eINSTANCE.getAnalysis_Categorizers();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANALYSIS__DESCRIPTION = eINSTANCE.getAnalysis_Description();

		/**
		 * The meta object literal for the '<em><b>Data Tools</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANALYSIS__DATA_TOOLS = eINSTANCE.getAnalysis_DataTools();

		/**
		 * The meta object literal for the '<em><b>Domain</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANALYSIS__DOMAIN = eINSTANCE.getAnalysis_Domain();

		/**
		 * The meta object literal for the '<em><b>Refresh Feedback</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANALYSIS__REFRESH_FEEDBACK = eINSTANCE.getAnalysis_RefreshFeedback();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANALYSIS__NAME = eINSTANCE.getAnalysis_Name();

		/**
		 * The meta object literal for the '<em><b>Remarks</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANALYSIS__REMARKS = eINSTANCE.getAnalysis_Remarks();

		/**
		 * The meta object literal for the '<em><b>Docs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANALYSIS__DOCS = eINSTANCE.getAnalysis_Docs();

		/**
		 * The meta object literal for the '<em><b>Sheets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANALYSIS__SHEETS = eINSTANCE.getAnalysis_Sheets();

		/**
		 * The meta object literal for the '<em><b>Refresh</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ANALYSIS___REFRESH = eINSTANCE.getAnalysis__Refresh();

		/**
		 * The meta object literal for the '<em><b>Add Tool</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ANALYSIS___ADD_TOOL__DATATOOL = eINSTANCE.getAnalysis__AddTool__DataTool();

		/**
		 * The meta object literal for the '<em><b>Flush</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ANALYSIS___FLUSH = eINSTANCE.getAnalysis__Flush();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.analysis.impl.AnalysisDomainImpl <em>Domain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.analysis.impl.AnalysisDomainImpl
		 * @see com.misc.common.moplaf.analysis.impl.AnalysisPackageImpl#getAnalysisDomain()
		 * @generated
		 */
		EClass ANALYSIS_DOMAIN = eINSTANCE.getAnalysisDomain();

		/**
		 * The meta object literal for the '<em><b>Super Domain</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANALYSIS_DOMAIN__SUPER_DOMAIN = eINSTANCE.getAnalysisDomain_SuperDomain();

		/**
		 * The meta object literal for the '<em><b>Sub Domains</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANALYSIS_DOMAIN__SUB_DOMAINS = eINSTANCE.getAnalysisDomain_SubDomains();

		/**
		 * The meta object literal for the '<em><b>Analyses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANALYSIS_DOMAIN__ANALYSES = eINSTANCE.getAnalysisDomain_Analyses();

		/**
		 * The meta object literal for the '<em><b>Data Tools</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANALYSIS_DOMAIN__DATA_TOOLS = eINSTANCE.getAnalysisDomain_DataTools();

		/**
		 * The meta object literal for the '<em><b>Get New Data Tools</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ANALYSIS_DOMAIN___GET_NEW_DATA_TOOLS__DATATOOLTYPE = eINSTANCE.getAnalysisDomain__GetNewDataTools__DataToolType();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.analysis.impl.DataToolsImpl <em>Data Tools</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.analysis.impl.DataToolsImpl
		 * @see com.misc.common.moplaf.analysis.impl.AnalysisPackageImpl#getDataTools()
		 * @generated
		 */
		EClass DATA_TOOLS = eINSTANCE.getDataTools();

		/**
		 * The meta object literal for the '<em><b>Domain</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_TOOLS__DOMAIN = eINSTANCE.getDataTools_Domain();

		/**
		 * The meta object literal for the '<em><b>Data Tools</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_TOOLS__DATA_TOOLS = eINSTANCE.getDataTools_DataTools();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.analysis.impl.AnalysisDocImpl <em>Doc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.analysis.impl.AnalysisDocImpl
		 * @see com.misc.common.moplaf.analysis.impl.AnalysisPackageImpl#getAnalysisDoc()
		 * @generated
		 */
		EClass ANALYSIS_DOC = eINSTANCE.getAnalysisDoc();

		/**
		 * The meta object literal for the '<em><b>Analysis</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANALYSIS_DOC__ANALYSIS = eINSTANCE.getAnalysisDoc_Analysis();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANALYSIS_DOC__ELEMENTS = eINSTANCE.getAnalysisDoc_Elements();

		/**
		 * The meta object literal for the '<em><b>Complete</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANALYSIS_DOC__COMPLETE = eINSTANCE.getAnalysisDoc_Complete();

		/**
		 * The meta object literal for the '<em><b>Get Elements</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ANALYSIS_DOC___GET_ELEMENTS__CATEGORY = eINSTANCE.getAnalysisDoc__GetElements__Category();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.analysis.impl.AnalysisElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.analysis.impl.AnalysisElementImpl
		 * @see com.misc.common.moplaf.analysis.impl.AnalysisPackageImpl#getAnalysisElement()
		 * @generated
		 */
		EClass ANALYSIS_ELEMENT = eINSTANCE.getAnalysisElement();

		/**
		 * The meta object literal for the '<em><b>Doc</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANALYSIS_ELEMENT__DOC = eINSTANCE.getAnalysisElement_Doc();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANALYSIS_ELEMENT__KEY = eINSTANCE.getAnalysisElement_Key();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANALYSIS_ELEMENT__ELEMENT = eINSTANCE.getAnalysisElement_Element();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANALYSIS_ELEMENT__CATEGORY = eINSTANCE.getAnalysisElement_Category();

		/**
		 * The meta object literal for the '<em><b>Is In Category</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ANALYSIS_ELEMENT___IS_IN_CATEGORY__CATEGORYABSTRACT = eINSTANCE.getAnalysisElement__IsInCategory__CategoryAbstract();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.analysis.impl.AnalysisElementKeyImpl <em>Element Key</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.analysis.impl.AnalysisElementKeyImpl
		 * @see com.misc.common.moplaf.analysis.impl.AnalysisPackageImpl#getAnalysisElementKey()
		 * @generated
		 */
		EClass ANALYSIS_ELEMENT_KEY = eINSTANCE.getAnalysisElementKey();

		/**
		 * The meta object literal for the '<em><b>Sheet</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANALYSIS_ELEMENT_KEY__SHEET = eINSTANCE.getAnalysisElementKey_Sheet();

		/**
		 * The meta object literal for the '<em><b>Docs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANALYSIS_ELEMENT_KEY__DOCS = eINSTANCE.getAnalysisElementKey_Docs();

		/**
		 * The meta object literal for the '<em><b>Get Key Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ANALYSIS_ELEMENT_KEY___GET_KEY_VALUE = eINSTANCE.getAnalysisElementKey__GetKeyValue();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.analysis.impl.AnalysisColumnizerImpl <em>Columnizer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.analysis.impl.AnalysisColumnizerImpl
		 * @see com.misc.common.moplaf.analysis.impl.AnalysisPackageImpl#getAnalysisColumnizer()
		 * @generated
		 */
		EClass ANALYSIS_COLUMNIZER = eINSTANCE.getAnalysisColumnizer();

		/**
		 * The meta object literal for the '<em><b>Keys</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANALYSIS_COLUMNIZER__KEYS = eINSTANCE.getAnalysisColumnizer_Keys();

		/**
		 * The meta object literal for the '<em><b>Analysis</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANALYSIS_COLUMNIZER__ANALYSIS = eINSTANCE.getAnalysisColumnizer_Analysis();

		/**
		 * The meta object literal for the '<em><b>Columnizer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANALYSIS_COLUMNIZER__COLUMNIZER = eINSTANCE.getAnalysisColumnizer_Columnizer();

		/**
		 * The meta object literal for the '<em><b>Add Element</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ANALYSIS_COLUMNIZER___ADD_ELEMENT__ANALYSISELEMENT = eINSTANCE.getAnalysisColumnizer__AddElement__AnalysisElement();

		/**
		 * The meta object literal for the '<em><b>Remove Element</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ANALYSIS_COLUMNIZER___REMOVE_ELEMENT__ANALYSISELEMENT = eINSTANCE.getAnalysisColumnizer__RemoveElement__AnalysisElement();

		/**
		 * The meta object literal for the '<em><b>Get Key Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ANALYSIS_COLUMNIZER___GET_KEY_VALUE__EOBJECT = eINSTANCE.getAnalysisColumnizer__GetKeyValue__EObject();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.analysis.impl.AnalysisCategoryImpl <em>Category</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.analysis.impl.AnalysisCategoryImpl
		 * @see com.misc.common.moplaf.analysis.impl.AnalysisPackageImpl#getAnalysisCategory()
		 * @generated
		 */
		EClass ANALYSIS_CATEGORY = eINSTANCE.getAnalysisCategory();

		/**
		 * The meta object literal for the '<em><b>Analysis</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANALYSIS_CATEGORY__ANALYSIS = eINSTANCE.getAnalysisCategory_Analysis();

	}

} //AnalysisPackage
