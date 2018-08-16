/**
 */
package com.misc.common.moplaf.analysis;

import com.misc.common.moplaf.datatools.DatatoolsPackage;
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
	 * The meta object id for the '{@link com.misc.common.moplaf.analysis.impl.DocAnalysisImpl <em>Doc Analysis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.analysis.impl.DocAnalysisImpl
	 * @see com.misc.common.moplaf.analysis.impl.AnalysisPackageImpl#getDocAnalysis()
	 * @generated
	 */
	int DOC_ANALYSIS = 0;

	/**
	 * The feature id for the '<em><b>Sub Categories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_ANALYSIS__SUB_CATEGORIES = DatatoolsPackage.SUPER_CATEGORY__SUB_CATEGORIES;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_ANALYSIS__ELEMENTS = DatatoolsPackage.SUPER_CATEGORY__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Nb Elements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_ANALYSIS__NB_ELEMENTS = DatatoolsPackage.SUPER_CATEGORY__NB_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Category Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_ANALYSIS__CATEGORY_LABEL = DatatoolsPackage.SUPER_CATEGORY__CATEGORY_LABEL;

	/**
	 * The feature id for the '<em><b>Category Columnizer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_ANALYSIS__CATEGORY_COLUMNIZER = DatatoolsPackage.SUPER_CATEGORY__CATEGORY_COLUMNIZER;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_ANALYSIS__DOC = DatatoolsPackage.SUPER_CATEGORY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Extractor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_ANALYSIS__EXTRACTOR = DatatoolsPackage.SUPER_CATEGORY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Columnizer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_ANALYSIS__COLUMNIZER = DatatoolsPackage.SUPER_CATEGORY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Complete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_ANALYSIS__COMPLETE = DatatoolsPackage.SUPER_CATEGORY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Max Elements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_ANALYSIS__MAX_ELEMENTS = DatatoolsPackage.SUPER_CATEGORY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Categorizers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_ANALYSIS__CATEGORIZERS = DatatoolsPackage.SUPER_CATEGORY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_ANALYSIS__DESCRIPTION = DatatoolsPackage.SUPER_CATEGORY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Data Tools</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_ANALYSIS__DATA_TOOLS = DatatoolsPackage.SUPER_CATEGORY_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Doc Analysis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_ANALYSIS_FEATURE_COUNT = DatatoolsPackage.SUPER_CATEGORY_FEATURE_COUNT + 8;

	/**
	 * The operation id for the '<em>Get Subcategory</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_ANALYSIS___GET_SUBCATEGORY__EOBJECT = DatatoolsPackage.SUPER_CATEGORY___GET_SUBCATEGORY__EOBJECT;

	/**
	 * The operation id for the '<em>Refresh Cats</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_ANALYSIS___REFRESH_CATS__OBJECTSET_ELIST_INT = DatatoolsPackage.SUPER_CATEGORY___REFRESH_CATS__OBJECTSET_ELIST_INT;

	/**
	 * The operation id for the '<em>Set Columnizer All</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_ANALYSIS___SET_COLUMNIZER_ALL__COLUMNIZERABSTRACT = DatatoolsPackage.SUPER_CATEGORY___SET_COLUMNIZER_ALL__COLUMNIZERABSTRACT;

	/**
	 * The operation id for the '<em>Flush</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_ANALYSIS___FLUSH = DatatoolsPackage.SUPER_CATEGORY___FLUSH;

	/**
	 * The operation id for the '<em>Is Valid Root</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_ANALYSIS___IS_VALID_ROOT__EOBJECT = DatatoolsPackage.SUPER_CATEGORY___IS_VALID_ROOT__EOBJECT;

	/**
	 * The operation id for the '<em>Refresh Cats</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_ANALYSIS___REFRESH_CATS__OBJECTSET_ELIST = DatatoolsPackage.SUPER_CATEGORY___REFRESH_CATS__OBJECTSET_ELIST;

	/**
	 * The operation id for the '<em>Get Domain Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_ANALYSIS___GET_DOMAIN_TYPES = DatatoolsPackage.SUPER_CATEGORY_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_ANALYSIS___REFRESH = DatatoolsPackage.SUPER_CATEGORY_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Add Tool</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_ANALYSIS___ADD_TOOL__DATATOOL = DatatoolsPackage.SUPER_CATEGORY_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Is Valid Tool</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_ANALYSIS___IS_VALID_TOOL__DATATOOL = DatatoolsPackage.SUPER_CATEGORY_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Valid Extractor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_ANALYSIS___IS_VALID_EXTRACTOR__EXTRACTOR = DatatoolsPackage.SUPER_CATEGORY_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Is Valid Columnizer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_ANALYSIS___IS_VALID_COLUMNIZER__COLUMNIZERABSTRACT = DatatoolsPackage.SUPER_CATEGORY_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Valid Categorizer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_ANALYSIS___IS_VALID_CATEGORIZER__CATEGORIZER = DatatoolsPackage.SUPER_CATEGORY_OPERATION_COUNT + 6;

	/**
	 * The number of operations of the '<em>Doc Analysis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_ANALYSIS_OPERATION_COUNT = DatatoolsPackage.SUPER_CATEGORY_OPERATION_COUNT + 7;


	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.analysis.impl.DocComparisonImpl <em>Doc Comparison</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.analysis.impl.DocComparisonImpl
	 * @see com.misc.common.moplaf.analysis.impl.AnalysisPackageImpl#getDocComparison()
	 * @generated
	 */
	int DOC_COMPARISON = 1;

	/**
	 * The feature id for the '<em><b>Matches</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_COMPARISON__MATCHES = DatatoolsPackage.MATCHER__MATCHES;

	/**
	 * The feature id for the '<em><b>Extractor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_COMPARISON__EXTRACTOR = DatatoolsPackage.MATCHER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Columnizer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_COMPARISON__COLUMNIZER = DatatoolsPackage.MATCHER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Doc1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_COMPARISON__DOC1 = DatatoolsPackage.MATCHER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Doc2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_COMPARISON__DOC2 = DatatoolsPackage.MATCHER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Categorizer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_COMPARISON__CATEGORIZER = DatatoolsPackage.MATCHER_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Doc Comparison</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_COMPARISON_FEATURE_COUNT = DatatoolsPackage.MATCHER_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Refresh Matches</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_COMPARISON___REFRESH_MATCHES__EOBJECT_EOBJECT = DatatoolsPackage.MATCHER___REFRESH_MATCHES__EOBJECT_EOBJECT;

	/**
	 * The number of operations of the '<em>Doc Comparison</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_COMPARISON_OPERATION_COUNT = DatatoolsPackage.MATCHER_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.analysis.impl.AnalysisHolderImpl <em>Holder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.analysis.impl.AnalysisHolderImpl
	 * @see com.misc.common.moplaf.analysis.impl.AnalysisPackageImpl#getAnalysisHolder()
	 * @generated
	 */
	int ANALYSIS_HOLDER = 2;

	/**
	 * The feature id for the '<em><b>Analyses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_HOLDER__ANALYSES = 0;

	/**
	 * The number of structural features of the '<em>Holder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_HOLDER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Holder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_HOLDER_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.analysis.impl.AnalysisDomainImpl <em>Domain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.analysis.impl.AnalysisDomainImpl
	 * @see com.misc.common.moplaf.analysis.impl.AnalysisPackageImpl#getAnalysisDomain()
	 * @generated
	 */
	int ANALYSIS_DOMAIN = 3;

	/**
	 * The feature id for the '<em><b>Data Tools</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_DOMAIN__DATA_TOOLS = DatatoolsPackage.DATA_TOOLS__DATA_TOOLS;

	/**
	 * The feature id for the '<em><b>Docs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_DOMAIN__DOCS = DatatoolsPackage.DATA_TOOLS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_DOMAIN__TASKS = DatatoolsPackage.DATA_TOOLS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Analyses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_DOMAIN__ANALYSES = DatatoolsPackage.DATA_TOOLS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Super Domain</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_DOMAIN__SUPER_DOMAIN = DatatoolsPackage.DATA_TOOLS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Sub Domains</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_DOMAIN__SUB_DOMAINS = DatatoolsPackage.DATA_TOOLS_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_DOMAIN_FEATURE_COUNT = DatatoolsPackage.DATA_TOOLS_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Domain Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_DOMAIN___GET_DOMAIN_TYPES = DatatoolsPackage.DATA_TOOLS___GET_DOMAIN_TYPES;

	/**
	 * The operation id for the '<em>Get New Data Tools</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_DOMAIN___GET_NEW_DATA_TOOLS__DATATOOLTYPE = DatatoolsPackage.DATA_TOOLS___GET_NEW_DATA_TOOLS__DATATOOLTYPE;

	/**
	 * The operation id for the '<em>Garbage Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_DOMAIN___GARBAGE_COLLECT = DatatoolsPackage.DATA_TOOLS_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get New Tasks</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_DOMAIN___GET_NEW_TASKS = DatatoolsPackage.DATA_TOOLS_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_DOMAIN_OPERATION_COUNT = DatatoolsPackage.DATA_TOOLS_OPERATION_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.analysis.DocAnalysis <em>Doc Analysis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Doc Analysis</em>'.
	 * @see com.misc.common.moplaf.analysis.DocAnalysis
	 * @generated
	 */
	EClass getDocAnalysis();

	/**
	 * Returns the meta object for the containment reference '{@link com.misc.common.moplaf.analysis.DocAnalysis#getExtractor <em>Extractor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Extractor</em>'.
	 * @see com.misc.common.moplaf.analysis.DocAnalysis#getExtractor()
	 * @see #getDocAnalysis()
	 * @generated
	 */
	EReference getDocAnalysis_Extractor();

	/**
	 * Returns the meta object for the containment reference '{@link com.misc.common.moplaf.analysis.DocAnalysis#getColumnizer <em>Columnizer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Columnizer</em>'.
	 * @see com.misc.common.moplaf.analysis.DocAnalysis#getColumnizer()
	 * @see #getDocAnalysis()
	 * @generated
	 */
	EReference getDocAnalysis_Columnizer();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.analysis.DocAnalysis#isComplete <em>Complete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Complete</em>'.
	 * @see com.misc.common.moplaf.analysis.DocAnalysis#isComplete()
	 * @see #getDocAnalysis()
	 * @generated
	 */
	EAttribute getDocAnalysis_Complete();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.analysis.DocAnalysis#getMaxElements <em>Max Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Elements</em>'.
	 * @see com.misc.common.moplaf.analysis.DocAnalysis#getMaxElements()
	 * @see #getDocAnalysis()
	 * @generated
	 */
	EAttribute getDocAnalysis_MaxElements();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.common.moplaf.analysis.DocAnalysis#getCategorizers <em>Categorizers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Categorizers</em>'.
	 * @see com.misc.common.moplaf.analysis.DocAnalysis#getCategorizers()
	 * @see #getDocAnalysis()
	 * @generated
	 */
	EReference getDocAnalysis_Categorizers();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.analysis.DocAnalysis#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see com.misc.common.moplaf.analysis.DocAnalysis#getDescription()
	 * @see #getDocAnalysis()
	 * @generated
	 */
	EAttribute getDocAnalysis_Description();

	/**
	 * Returns the meta object for the reference list '{@link com.misc.common.moplaf.analysis.DocAnalysis#getDataTools <em>Data Tools</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Data Tools</em>'.
	 * @see com.misc.common.moplaf.analysis.DocAnalysis#getDataTools()
	 * @see #getDocAnalysis()
	 * @generated
	 */
	EReference getDocAnalysis_DataTools();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.analysis.DocAnalysis#refresh() <em>Refresh</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Refresh</em>' operation.
	 * @see com.misc.common.moplaf.analysis.DocAnalysis#refresh()
	 * @generated
	 */
	EOperation getDocAnalysis__Refresh();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.analysis.DocAnalysis#addTool(com.misc.common.moplaf.datatools.DataTool) <em>Add Tool</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Tool</em>' operation.
	 * @see com.misc.common.moplaf.analysis.DocAnalysis#addTool(com.misc.common.moplaf.datatools.DataTool)
	 * @generated
	 */
	EOperation getDocAnalysis__AddTool__DataTool();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.analysis.DocAnalysis#isValidTool(com.misc.common.moplaf.datatools.DataTool) <em>Is Valid Tool</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Valid Tool</em>' operation.
	 * @see com.misc.common.moplaf.analysis.DocAnalysis#isValidTool(com.misc.common.moplaf.datatools.DataTool)
	 * @generated
	 */
	EOperation getDocAnalysis__IsValidTool__DataTool();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.analysis.DocAnalysis#isValidExtractor(com.misc.common.moplaf.datatools.Extractor) <em>Is Valid Extractor</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Valid Extractor</em>' operation.
	 * @see com.misc.common.moplaf.analysis.DocAnalysis#isValidExtractor(com.misc.common.moplaf.datatools.Extractor)
	 * @generated
	 */
	EOperation getDocAnalysis__IsValidExtractor__Extractor();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.analysis.DocAnalysis#isValidColumnizer(com.misc.common.moplaf.datatools.ColumnizerAbstract) <em>Is Valid Columnizer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Valid Columnizer</em>' operation.
	 * @see com.misc.common.moplaf.analysis.DocAnalysis#isValidColumnizer(com.misc.common.moplaf.datatools.ColumnizerAbstract)
	 * @generated
	 */
	EOperation getDocAnalysis__IsValidColumnizer__ColumnizerAbstract();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.analysis.DocAnalysis#isValidCategorizer(com.misc.common.moplaf.datatools.Categorizer) <em>Is Valid Categorizer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Valid Categorizer</em>' operation.
	 * @see com.misc.common.moplaf.analysis.DocAnalysis#isValidCategorizer(com.misc.common.moplaf.datatools.Categorizer)
	 * @generated
	 */
	EOperation getDocAnalysis__IsValidCategorizer__Categorizer();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.analysis.DocComparison <em>Doc Comparison</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Doc Comparison</em>'.
	 * @see com.misc.common.moplaf.analysis.DocComparison
	 * @generated
	 */
	EClass getDocComparison();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.analysis.DocComparison#getExtractor <em>Extractor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Extractor</em>'.
	 * @see com.misc.common.moplaf.analysis.DocComparison#getExtractor()
	 * @see #getDocComparison()
	 * @generated
	 */
	EReference getDocComparison_Extractor();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.analysis.DocComparison#getColumnizer <em>Columnizer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Columnizer</em>'.
	 * @see com.misc.common.moplaf.analysis.DocComparison#getColumnizer()
	 * @see #getDocComparison()
	 * @generated
	 */
	EReference getDocComparison_Columnizer();

	/**
	 * Returns the meta object for the containment reference '{@link com.misc.common.moplaf.analysis.DocComparison#getDoc1 <em>Doc1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Doc1</em>'.
	 * @see com.misc.common.moplaf.analysis.DocComparison#getDoc1()
	 * @see #getDocComparison()
	 * @generated
	 */
	EReference getDocComparison_Doc1();

	/**
	 * Returns the meta object for the containment reference '{@link com.misc.common.moplaf.analysis.DocComparison#getDoc2 <em>Doc2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Doc2</em>'.
	 * @see com.misc.common.moplaf.analysis.DocComparison#getDoc2()
	 * @see #getDocComparison()
	 * @generated
	 */
	EReference getDocComparison_Doc2();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.analysis.DocComparison#getCategorizer <em>Categorizer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Categorizer</em>'.
	 * @see com.misc.common.moplaf.analysis.DocComparison#getCategorizer()
	 * @see #getDocComparison()
	 * @generated
	 */
	EReference getDocComparison_Categorizer();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.analysis.AnalysisHolder <em>Holder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Holder</em>'.
	 * @see com.misc.common.moplaf.analysis.AnalysisHolder
	 * @generated
	 */
	EClass getAnalysisHolder();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.common.moplaf.analysis.AnalysisHolder#getAnalyses <em>Analyses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Analyses</em>'.
	 * @see com.misc.common.moplaf.analysis.AnalysisHolder#getAnalyses()
	 * @see #getAnalysisHolder()
	 * @generated
	 */
	EReference getAnalysisHolder_Analyses();

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
		 * The meta object literal for the '{@link com.misc.common.moplaf.analysis.impl.DocAnalysisImpl <em>Doc Analysis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.analysis.impl.DocAnalysisImpl
		 * @see com.misc.common.moplaf.analysis.impl.AnalysisPackageImpl#getDocAnalysis()
		 * @generated
		 */
		EClass DOC_ANALYSIS = eINSTANCE.getDocAnalysis();

		/**
		 * The meta object literal for the '<em><b>Extractor</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOC_ANALYSIS__EXTRACTOR = eINSTANCE.getDocAnalysis_Extractor();

		/**
		 * The meta object literal for the '<em><b>Columnizer</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOC_ANALYSIS__COLUMNIZER = eINSTANCE.getDocAnalysis_Columnizer();

		/**
		 * The meta object literal for the '<em><b>Complete</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOC_ANALYSIS__COMPLETE = eINSTANCE.getDocAnalysis_Complete();

		/**
		 * The meta object literal for the '<em><b>Max Elements</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOC_ANALYSIS__MAX_ELEMENTS = eINSTANCE.getDocAnalysis_MaxElements();

		/**
		 * The meta object literal for the '<em><b>Categorizers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOC_ANALYSIS__CATEGORIZERS = eINSTANCE.getDocAnalysis_Categorizers();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOC_ANALYSIS__DESCRIPTION = eINSTANCE.getDocAnalysis_Description();

		/**
		 * The meta object literal for the '<em><b>Data Tools</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOC_ANALYSIS__DATA_TOOLS = eINSTANCE.getDocAnalysis_DataTools();

		/**
		 * The meta object literal for the '<em><b>Refresh</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DOC_ANALYSIS___REFRESH = eINSTANCE.getDocAnalysis__Refresh();

		/**
		 * The meta object literal for the '<em><b>Add Tool</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DOC_ANALYSIS___ADD_TOOL__DATATOOL = eINSTANCE.getDocAnalysis__AddTool__DataTool();

		/**
		 * The meta object literal for the '<em><b>Is Valid Tool</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DOC_ANALYSIS___IS_VALID_TOOL__DATATOOL = eINSTANCE.getDocAnalysis__IsValidTool__DataTool();

		/**
		 * The meta object literal for the '<em><b>Is Valid Extractor</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DOC_ANALYSIS___IS_VALID_EXTRACTOR__EXTRACTOR = eINSTANCE.getDocAnalysis__IsValidExtractor__Extractor();

		/**
		 * The meta object literal for the '<em><b>Is Valid Columnizer</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DOC_ANALYSIS___IS_VALID_COLUMNIZER__COLUMNIZERABSTRACT = eINSTANCE.getDocAnalysis__IsValidColumnizer__ColumnizerAbstract();

		/**
		 * The meta object literal for the '<em><b>Is Valid Categorizer</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DOC_ANALYSIS___IS_VALID_CATEGORIZER__CATEGORIZER = eINSTANCE.getDocAnalysis__IsValidCategorizer__Categorizer();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.analysis.impl.DocComparisonImpl <em>Doc Comparison</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.analysis.impl.DocComparisonImpl
		 * @see com.misc.common.moplaf.analysis.impl.AnalysisPackageImpl#getDocComparison()
		 * @generated
		 */
		EClass DOC_COMPARISON = eINSTANCE.getDocComparison();

		/**
		 * The meta object literal for the '<em><b>Extractor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOC_COMPARISON__EXTRACTOR = eINSTANCE.getDocComparison_Extractor();

		/**
		 * The meta object literal for the '<em><b>Columnizer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOC_COMPARISON__COLUMNIZER = eINSTANCE.getDocComparison_Columnizer();

		/**
		 * The meta object literal for the '<em><b>Doc1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOC_COMPARISON__DOC1 = eINSTANCE.getDocComparison_Doc1();

		/**
		 * The meta object literal for the '<em><b>Doc2</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOC_COMPARISON__DOC2 = eINSTANCE.getDocComparison_Doc2();

		/**
		 * The meta object literal for the '<em><b>Categorizer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOC_COMPARISON__CATEGORIZER = eINSTANCE.getDocComparison_Categorizer();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.analysis.impl.AnalysisHolderImpl <em>Holder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.analysis.impl.AnalysisHolderImpl
		 * @see com.misc.common.moplaf.analysis.impl.AnalysisPackageImpl#getAnalysisHolder()
		 * @generated
		 */
		EClass ANALYSIS_HOLDER = eINSTANCE.getAnalysisHolder();

		/**
		 * The meta object literal for the '<em><b>Analyses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANALYSIS_HOLDER__ANALYSES = eINSTANCE.getAnalysisHolder_Analyses();

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

	}

} //AnalysisPackage
