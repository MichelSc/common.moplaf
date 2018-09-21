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
	 * The meta object id for the '{@link com.misc.common.moplaf.analysis.impl.DocAnalysisImpl <em>Doc Analysis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.analysis.impl.DocAnalysisImpl
	 * @see com.misc.common.moplaf.analysis.impl.AnalysisPackageImpl#getDocAnalysis()
	 * @generated
	 */
	int DOC_ANALYSIS = 0;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_ANALYSIS__DOC = JobPackage.DOC_REF__DOC;

	/**
	 * The feature id for the '<em><b>Columnizers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_ANALYSIS__COLUMNIZERS = JobPackage.DOC_REF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Extractor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_ANALYSIS__EXTRACTOR = JobPackage.DOC_REF_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Complete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_ANALYSIS__COMPLETE = JobPackage.DOC_REF_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Max Elements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_ANALYSIS__MAX_ELEMENTS = JobPackage.DOC_REF_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Categorizers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_ANALYSIS__CATEGORIZERS = JobPackage.DOC_REF_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_ANALYSIS__DESCRIPTION = JobPackage.DOC_REF_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Data Tools</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_ANALYSIS__DATA_TOOLS = JobPackage.DOC_REF_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_ANALYSIS__DOMAIN = JobPackage.DOC_REF_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Refresh Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_ANALYSIS__REFRESH_FEEDBACK = JobPackage.DOC_REF_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_ANALYSIS__NAME = JobPackage.DOC_REF_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Remarks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_ANALYSIS__REMARKS = JobPackage.DOC_REF_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Categories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_ANALYSIS__CATEGORIES = JobPackage.DOC_REF_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_ANALYSIS__ELEMENTS = JobPackage.DOC_REF_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Nb Elements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_ANALYSIS__NB_ELEMENTS = JobPackage.DOC_REF_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Doc Analysis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_ANALYSIS_FEATURE_COUNT = JobPackage.DOC_REF_FEATURE_COUNT + 14;

	/**
	 * The operation id for the '<em>Get Domain Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_ANALYSIS___GET_DOMAIN_TYPES = JobPackage.DOC_REF_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_ANALYSIS___REFRESH = JobPackage.DOC_REF_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Add Tool</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_ANALYSIS___ADD_TOOL__DATATOOL = JobPackage.DOC_REF_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Flush</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_ANALYSIS___FLUSH = JobPackage.DOC_REF_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>Doc Analysis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_ANALYSIS_OPERATION_COUNT = JobPackage.DOC_REF_OPERATION_COUNT + 4;


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
	 * The feature id for the '<em><b>Extractor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_COMPARISON__EXTRACTOR = 0;

	/**
	 * The feature id for the '<em><b>Columnizer Compare</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_COMPARISON__COLUMNIZER_COMPARE = 1;

	/**
	 * The feature id for the '<em><b>Doc1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_COMPARISON__DOC1 = 2;

	/**
	 * The feature id for the '<em><b>Doc2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_COMPARISON__DOC2 = 3;

	/**
	 * The feature id for the '<em><b>Matches</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_COMPARISON__MATCHES = 4;

	/**
	 * The feature id for the '<em><b>Matcher</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_COMPARISON__MATCHER = 5;

	/**
	 * The feature id for the '<em><b>Columnizer Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_COMPARISON__COLUMNIZER_KEY = 6;

	/**
	 * The number of structural features of the '<em>Doc Comparison</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_COMPARISON_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Doc Comparison</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_COMPARISON_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.analysis.impl.AnalysisDomainImpl <em>Domain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.analysis.impl.AnalysisDomainImpl
	 * @see com.misc.common.moplaf.analysis.impl.AnalysisPackageImpl#getAnalysisDomain()
	 * @generated
	 */
	int ANALYSIS_DOMAIN = 2;

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
	int DATA_TOOLS = 3;

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
	 * Returns the meta object for the container reference '{@link com.misc.common.moplaf.analysis.DocAnalysis#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Domain</em>'.
	 * @see com.misc.common.moplaf.analysis.DocAnalysis#getDomain()
	 * @see #getDocAnalysis()
	 * @generated
	 */
	EReference getDocAnalysis_Domain();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.analysis.DocAnalysis#getRefreshFeedback <em>Refresh Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Refresh Feedback</em>'.
	 * @see com.misc.common.moplaf.analysis.DocAnalysis#getRefreshFeedback()
	 * @see #getDocAnalysis()
	 * @generated
	 */
	EAttribute getDocAnalysis_RefreshFeedback();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.analysis.DocAnalysis#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.misc.common.moplaf.analysis.DocAnalysis#getName()
	 * @see #getDocAnalysis()
	 * @generated
	 */
	EAttribute getDocAnalysis_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.analysis.DocAnalysis#getRemarks <em>Remarks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remarks</em>'.
	 * @see com.misc.common.moplaf.analysis.DocAnalysis#getRemarks()
	 * @see #getDocAnalysis()
	 * @generated
	 */
	EAttribute getDocAnalysis_Remarks();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.common.moplaf.analysis.DocAnalysis#getCategories <em>Categories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Categories</em>'.
	 * @see com.misc.common.moplaf.analysis.DocAnalysis#getCategories()
	 * @see #getDocAnalysis()
	 * @generated
	 */
	EReference getDocAnalysis_Categories();

	/**
	 * Returns the meta object for the reference list '{@link com.misc.common.moplaf.analysis.DocAnalysis#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Elements</em>'.
	 * @see com.misc.common.moplaf.analysis.DocAnalysis#getElements()
	 * @see #getDocAnalysis()
	 * @generated
	 */
	EReference getDocAnalysis_Elements();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.analysis.DocAnalysis#getNbElements <em>Nb Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nb Elements</em>'.
	 * @see com.misc.common.moplaf.analysis.DocAnalysis#getNbElements()
	 * @see #getDocAnalysis()
	 * @generated
	 */
	EAttribute getDocAnalysis_NbElements();

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
	 * Returns the meta object for the '{@link com.misc.common.moplaf.analysis.DocAnalysis#flush() <em>Flush</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Flush</em>' operation.
	 * @see com.misc.common.moplaf.analysis.DocAnalysis#flush()
	 * @generated
	 */
	EOperation getDocAnalysis__Flush();

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
	 * Returns the meta object for the containment reference '{@link com.misc.common.moplaf.analysis.DocComparison#getExtractor <em>Extractor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Extractor</em>'.
	 * @see com.misc.common.moplaf.analysis.DocComparison#getExtractor()
	 * @see #getDocComparison()
	 * @generated
	 */
	EReference getDocComparison_Extractor();

	/**
	 * Returns the meta object for the containment reference '{@link com.misc.common.moplaf.analysis.DocComparison#getColumnizerCompare <em>Columnizer Compare</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Columnizer Compare</em>'.
	 * @see com.misc.common.moplaf.analysis.DocComparison#getColumnizerCompare()
	 * @see #getDocComparison()
	 * @generated
	 */
	EReference getDocComparison_ColumnizerCompare();

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
	 * Returns the meta object for the containment reference list '{@link com.misc.common.moplaf.analysis.DocComparison#getMatches <em>Matches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Matches</em>'.
	 * @see com.misc.common.moplaf.analysis.DocComparison#getMatches()
	 * @see #getDocComparison()
	 * @generated
	 */
	EReference getDocComparison_Matches();

	/**
	 * Returns the meta object for the containment reference '{@link com.misc.common.moplaf.analysis.DocComparison#getMatcher <em>Matcher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Matcher</em>'.
	 * @see com.misc.common.moplaf.analysis.DocComparison#getMatcher()
	 * @see #getDocComparison()
	 * @generated
	 */
	EReference getDocComparison_Matcher();

	/**
	 * Returns the meta object for the containment reference '{@link com.misc.common.moplaf.analysis.DocComparison#getColumnizerKey <em>Columnizer Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Columnizer Key</em>'.
	 * @see com.misc.common.moplaf.analysis.DocComparison#getColumnizerKey()
	 * @see #getDocComparison()
	 * @generated
	 */
	EReference getDocComparison_ColumnizerKey();

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
		 * The meta object literal for the '<em><b>Domain</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOC_ANALYSIS__DOMAIN = eINSTANCE.getDocAnalysis_Domain();

		/**
		 * The meta object literal for the '<em><b>Refresh Feedback</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOC_ANALYSIS__REFRESH_FEEDBACK = eINSTANCE.getDocAnalysis_RefreshFeedback();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOC_ANALYSIS__NAME = eINSTANCE.getDocAnalysis_Name();

		/**
		 * The meta object literal for the '<em><b>Remarks</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOC_ANALYSIS__REMARKS = eINSTANCE.getDocAnalysis_Remarks();

		/**
		 * The meta object literal for the '<em><b>Categories</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOC_ANALYSIS__CATEGORIES = eINSTANCE.getDocAnalysis_Categories();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOC_ANALYSIS__ELEMENTS = eINSTANCE.getDocAnalysis_Elements();

		/**
		 * The meta object literal for the '<em><b>Nb Elements</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOC_ANALYSIS__NB_ELEMENTS = eINSTANCE.getDocAnalysis_NbElements();

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
		 * The meta object literal for the '<em><b>Flush</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DOC_ANALYSIS___FLUSH = eINSTANCE.getDocAnalysis__Flush();

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
		 * The meta object literal for the '<em><b>Extractor</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOC_COMPARISON__EXTRACTOR = eINSTANCE.getDocComparison_Extractor();

		/**
		 * The meta object literal for the '<em><b>Columnizer Compare</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOC_COMPARISON__COLUMNIZER_COMPARE = eINSTANCE.getDocComparison_ColumnizerCompare();

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
		 * The meta object literal for the '<em><b>Matches</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOC_COMPARISON__MATCHES = eINSTANCE.getDocComparison_Matches();

		/**
		 * The meta object literal for the '<em><b>Matcher</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOC_COMPARISON__MATCHER = eINSTANCE.getDocComparison_Matcher();

		/**
		 * The meta object literal for the '<em><b>Columnizer Key</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOC_COMPARISON__COLUMNIZER_KEY = eINSTANCE.getDocComparison_ColumnizerKey();

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

	}

} //AnalysisPackage
