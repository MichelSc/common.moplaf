/**
 */
package com.misc.common.moplaf.analysis.impl;

import com.misc.common.moplaf.analysis.AnalysisDomain;
import com.misc.common.moplaf.analysis.AnalysisElement;
import com.misc.common.moplaf.analysis.AnalysisElementKey;
import com.misc.common.moplaf.analysis.AnalysisFactory;
import com.misc.common.moplaf.analysis.AnalysisPackage;
import com.misc.common.moplaf.analysis.AnalysisSheet;
import com.misc.common.moplaf.analysis.DataTools;
import com.misc.common.moplaf.analysis.ElementKey;
import com.misc.common.moplaf.analysis.Analysis;
import com.misc.common.moplaf.analysis.AnalysisCategory;
import com.misc.common.moplaf.analysis.AnalysisDoc;
import com.misc.common.moplaf.datatools.DatatoolsPackage;
import com.misc.common.moplaf.file.FilePackage;

import com.misc.common.moplaf.job.JobPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AnalysisPackageImpl extends EPackageImpl implements AnalysisPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass analysisEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass analysisDomainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataToolsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass analysisDocEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass analysisElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass analysisElementKeyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass analysisSheetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass analysisCategoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType elementKeyEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see com.misc.common.moplaf.analysis.AnalysisPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AnalysisPackageImpl() {
		super(eNS_URI, AnalysisFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link AnalysisPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AnalysisPackage init() {
		if (isInited) return (AnalysisPackage)EPackage.Registry.INSTANCE.getEPackage(AnalysisPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredAnalysisPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		AnalysisPackageImpl theAnalysisPackage = registeredAnalysisPackage instanceof AnalysisPackageImpl ? (AnalysisPackageImpl)registeredAnalysisPackage : new AnalysisPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		DatatoolsPackage.eINSTANCE.eClass();
		FilePackage.eINSTANCE.eClass();
		JobPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theAnalysisPackage.createPackageContents();

		// Initialize created meta-data
		theAnalysisPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAnalysisPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AnalysisPackage.eNS_URI, theAnalysisPackage);
		return theAnalysisPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnalysis() {
		return analysisEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnalysis_Extractor() {
		return (EReference)analysisEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnalysis_Complete() {
		return (EAttribute)analysisEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnalysis_MaxElements() {
		return (EAttribute)analysisEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnalysis_Categorizers() {
		return (EReference)analysisEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnalysis_Description() {
		return (EAttribute)analysisEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnalysis_DataTools() {
		return (EReference)analysisEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnalysis_Domain() {
		return (EReference)analysisEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnalysis_RefreshFeedback() {
		return (EAttribute)analysisEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnalysis_Name() {
		return (EAttribute)analysisEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnalysis_Remarks() {
		return (EAttribute)analysisEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnalysis_Docs() {
		return (EReference)analysisEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnalysis_Sheets() {
		return (EReference)analysisEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnalysis__Refresh() {
		return analysisEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnalysis__AddTool__DataTool() {
		return analysisEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnalysis__AddDoc__Doc() {
		return analysisEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnalysis__Flush() {
		return analysisEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnalysis__AddElement__AnalysisElement() {
		return analysisEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnalysis__RemoveElement__AnalysisElement() {
		return analysisEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnalysis__GetPropertyAggregation__IPropertiesProvider_Object_CategoryAbstract_AnalysisDoc() {
		return analysisEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnalysisDomain() {
		return analysisDomainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnalysisDomain_SuperDomain() {
		return (EReference)analysisDomainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnalysisDomain_SubDomains() {
		return (EReference)analysisDomainEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnalysisDomain_Analyses() {
		return (EReference)analysisDomainEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnalysisDomain_DataTools() {
		return (EReference)analysisDomainEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnalysisDomain__GetNewDataTools__DataToolType() {
		return analysisDomainEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataTools() {
		return dataToolsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataTools_Domain() {
		return (EReference)dataToolsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataTools_DataTools() {
		return (EReference)dataToolsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnalysisDoc() {
		return analysisDocEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnalysisDoc_Analysis() {
		return (EReference)analysisDocEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnalysisDoc_Elements() {
		return (EReference)analysisDocEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnalysisDoc_Complete() {
		return (EAttribute)analysisDocEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnalysisDoc_NbElements() {
		return (EAttribute)analysisDocEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnalysisDoc_DocIndex() {
		return (EAttribute)analysisDocEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnalysisDoc__GetElements__Category() {
		return analysisDocEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnalysisDoc__Flush() {
		return analysisDocEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnalysisElement() {
		return analysisElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnalysisElement_Doc() {
		return (EReference)analysisElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnalysisElement_Key() {
		return (EReference)analysisElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnalysisElement_Element() {
		return (EReference)analysisElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnalysisElement_Category() {
		return (EReference)analysisElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnalysisElement__IsInCategory__CategoryAbstract() {
		return analysisElementEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnalysisElementKey() {
		return analysisElementKeyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnalysisElementKey_Sheet() {
		return (EReference)analysisElementKeyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnalysisElementKey_Docs() {
		return (EReference)analysisElementKeyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnalysisElementKey_IndexKey() {
		return (EAttribute)analysisElementKeyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnalysisElementKey__GetKeyValue() {
		return analysisElementKeyEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnalysisElementKey__GetElement__AnalysisDoc() {
		return analysisElementKeyEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnalysisSheet() {
		return analysisSheetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnalysisSheet_Keys() {
		return (EReference)analysisSheetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnalysisSheet_Analysis() {
		return (EReference)analysisSheetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnalysisSheet_Columnizer() {
		return (EReference)analysisSheetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnalysisSheet__AddElement__AnalysisElement() {
		return analysisSheetEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnalysisSheet__RemoveElement__AnalysisElement() {
		return analysisSheetEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnalysisSheet__GetKeyValue__EObject() {
		return analysisSheetEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnalysisSheet__Flush() {
		return analysisSheetEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnalysisCategory() {
		return analysisCategoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnalysisCategory_Analysis() {
		return (EReference)analysisCategoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getElementKey() {
		return elementKeyEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalysisFactory getAnalysisFactory() {
		return (AnalysisFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		analysisEClass = createEClass(ANALYSIS);
		createEReference(analysisEClass, ANALYSIS__CATEGORIZERS);
		createEReference(analysisEClass, ANALYSIS__EXTRACTOR);
		createEAttribute(analysisEClass, ANALYSIS__COMPLETE);
		createEAttribute(analysisEClass, ANALYSIS__MAX_ELEMENTS);
		createEAttribute(analysisEClass, ANALYSIS__DESCRIPTION);
		createEReference(analysisEClass, ANALYSIS__DATA_TOOLS);
		createEReference(analysisEClass, ANALYSIS__DOMAIN);
		createEAttribute(analysisEClass, ANALYSIS__REFRESH_FEEDBACK);
		createEAttribute(analysisEClass, ANALYSIS__NAME);
		createEAttribute(analysisEClass, ANALYSIS__REMARKS);
		createEReference(analysisEClass, ANALYSIS__DOCS);
		createEReference(analysisEClass, ANALYSIS__SHEETS);
		createEOperation(analysisEClass, ANALYSIS___ADD_TOOL__DATATOOL);
		createEOperation(analysisEClass, ANALYSIS___ADD_DOC__DOC);
		createEOperation(analysisEClass, ANALYSIS___REFRESH);
		createEOperation(analysisEClass, ANALYSIS___FLUSH);
		createEOperation(analysisEClass, ANALYSIS___ADD_ELEMENT__ANALYSISELEMENT);
		createEOperation(analysisEClass, ANALYSIS___REMOVE_ELEMENT__ANALYSISELEMENT);
		createEOperation(analysisEClass, ANALYSIS___GET_PROPERTY_AGGREGATION__IPROPERTIESPROVIDER_OBJECT_CATEGORYABSTRACT_ANALYSISDOC);

		analysisDomainEClass = createEClass(ANALYSIS_DOMAIN);
		createEReference(analysisDomainEClass, ANALYSIS_DOMAIN__SUPER_DOMAIN);
		createEReference(analysisDomainEClass, ANALYSIS_DOMAIN__SUB_DOMAINS);
		createEReference(analysisDomainEClass, ANALYSIS_DOMAIN__ANALYSES);
		createEReference(analysisDomainEClass, ANALYSIS_DOMAIN__DATA_TOOLS);
		createEOperation(analysisDomainEClass, ANALYSIS_DOMAIN___GET_NEW_DATA_TOOLS__DATATOOLTYPE);

		dataToolsEClass = createEClass(DATA_TOOLS);
		createEReference(dataToolsEClass, DATA_TOOLS__DOMAIN);
		createEReference(dataToolsEClass, DATA_TOOLS__DATA_TOOLS);

		analysisDocEClass = createEClass(ANALYSIS_DOC);
		createEReference(analysisDocEClass, ANALYSIS_DOC__ANALYSIS);
		createEReference(analysisDocEClass, ANALYSIS_DOC__ELEMENTS);
		createEAttribute(analysisDocEClass, ANALYSIS_DOC__COMPLETE);
		createEAttribute(analysisDocEClass, ANALYSIS_DOC__NB_ELEMENTS);
		createEAttribute(analysisDocEClass, ANALYSIS_DOC__DOC_INDEX);
		createEOperation(analysisDocEClass, ANALYSIS_DOC___GET_ELEMENTS__CATEGORY);
		createEOperation(analysisDocEClass, ANALYSIS_DOC___FLUSH);

		analysisElementEClass = createEClass(ANALYSIS_ELEMENT);
		createEReference(analysisElementEClass, ANALYSIS_ELEMENT__DOC);
		createEReference(analysisElementEClass, ANALYSIS_ELEMENT__KEY);
		createEReference(analysisElementEClass, ANALYSIS_ELEMENT__ELEMENT);
		createEReference(analysisElementEClass, ANALYSIS_ELEMENT__CATEGORY);
		createEOperation(analysisElementEClass, ANALYSIS_ELEMENT___IS_IN_CATEGORY__CATEGORYABSTRACT);

		analysisElementKeyEClass = createEClass(ANALYSIS_ELEMENT_KEY);
		createEReference(analysisElementKeyEClass, ANALYSIS_ELEMENT_KEY__SHEET);
		createEReference(analysisElementKeyEClass, ANALYSIS_ELEMENT_KEY__DOCS);
		createEAttribute(analysisElementKeyEClass, ANALYSIS_ELEMENT_KEY__INDEX_KEY);
		createEOperation(analysisElementKeyEClass, ANALYSIS_ELEMENT_KEY___GET_KEY_VALUE);
		createEOperation(analysisElementKeyEClass, ANALYSIS_ELEMENT_KEY___GET_ELEMENT__ANALYSISDOC);

		analysisSheetEClass = createEClass(ANALYSIS_SHEET);
		createEReference(analysisSheetEClass, ANALYSIS_SHEET__KEYS);
		createEReference(analysisSheetEClass, ANALYSIS_SHEET__ANALYSIS);
		createEReference(analysisSheetEClass, ANALYSIS_SHEET__COLUMNIZER);
		createEOperation(analysisSheetEClass, ANALYSIS_SHEET___ADD_ELEMENT__ANALYSISELEMENT);
		createEOperation(analysisSheetEClass, ANALYSIS_SHEET___REMOVE_ELEMENT__ANALYSISELEMENT);
		createEOperation(analysisSheetEClass, ANALYSIS_SHEET___GET_KEY_VALUE__EOBJECT);
		createEOperation(analysisSheetEClass, ANALYSIS_SHEET___FLUSH);

		analysisCategoryEClass = createEClass(ANALYSIS_CATEGORY);
		createEReference(analysisCategoryEClass, ANALYSIS_CATEGORY__ANALYSIS);

		// Create data types
		elementKeyEDataType = createEDataType(ELEMENT_KEY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		DatatoolsPackage theDatatoolsPackage = (DatatoolsPackage)EPackage.Registry.INSTANCE.getEPackage(DatatoolsPackage.eNS_URI);
		JobPackage theJobPackage = (JobPackage)EPackage.Registry.INSTANCE.getEPackage(JobPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		analysisEClass.getESuperTypes().add(theDatatoolsPackage.getCategoryAbstract());
		analysisEClass.getESuperTypes().add(theDatatoolsPackage.getDataToolContext());
		analysisEClass.getESuperTypes().add(theDatatoolsPackage.getColumnizers());
		analysisEClass.getESuperTypes().add(theDatatoolsPackage.getCategoryFactory());
		analysisDomainEClass.getESuperTypes().add(theJobPackage.getTaskDomain());
		analysisDomainEClass.getESuperTypes().add(theDatatoolsPackage.getDataToolContext());
		dataToolsEClass.getESuperTypes().add(theDatatoolsPackage.getDataToolContext());
		analysisDocEClass.getESuperTypes().add(theJobPackage.getDocRef());
		analysisElementEClass.getESuperTypes().add(theDatatoolsPackage.getCategorizerSubject());
		analysisCategoryEClass.getESuperTypes().add(theDatatoolsPackage.getCategory());

		// Initialize classes, features, and operations; add parameters
		initEClass(analysisEClass, Analysis.class, "Analysis", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnalysis_Categorizers(), theDatatoolsPackage.getCategorizer(), null, "Categorizers", null, 0, -1, Analysis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnalysis_Extractor(), theDatatoolsPackage.getExtractor(), null, "Extractor", null, 0, 1, Analysis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnalysis_Complete(), ecorePackage.getEBoolean(), "Complete", null, 0, 1, Analysis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnalysis_MaxElements(), ecorePackage.getEInt(), "MaxElements", "1000000", 0, 1, Analysis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnalysis_Description(), ecorePackage.getEString(), "Description", null, 0, 1, Analysis.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAnalysis_DataTools(), theDatatoolsPackage.getDataTool(), null, "DataTools", null, 0, -1, Analysis.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAnalysis_Domain(), this.getAnalysisDomain(), this.getAnalysisDomain_Analyses(), "Domain", null, 1, 1, Analysis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnalysis_RefreshFeedback(), theJobPackage.getEnabledFeedback(), "RefreshFeedback", null, 0, 1, Analysis.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnalysis_Name(), ecorePackage.getEString(), "Name", null, 0, 1, Analysis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnalysis_Remarks(), ecorePackage.getEString(), "Remarks", null, 0, 1, Analysis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnalysis_Docs(), this.getAnalysisDoc(), this.getAnalysisDoc_Analysis(), "Docs", null, 0, -1, Analysis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnalysis_Sheets(), this.getAnalysisSheet(), this.getAnalysisSheet_Analysis(), "Sheets", null, 0, -1, Analysis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getAnalysis__AddTool__DataTool(), null, "addTool", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDatatoolsPackage.getDataTool(), "tool", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAnalysis__AddDoc__Doc(), null, "addDoc", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theJobPackage.getDoc(), "doc", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getAnalysis__Refresh(), null, "refresh", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getAnalysis__Flush(), null, "flush", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAnalysis__AddElement__AnalysisElement(), null, "addElement", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAnalysisElement(), "element", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAnalysis__RemoveElement__AnalysisElement(), null, "removeElement", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAnalysisElement(), "element", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAnalysis__GetPropertyAggregation__IPropertiesProvider_Object_CategoryAbstract_AnalysisDoc(), ecorePackage.getEJavaObject(), "getPropertyAggregation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDatatoolsPackage.getIPropertiesProvider(), "provider", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "property", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDatatoolsPackage.getCategoryAbstract(), "category", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAnalysisDoc(), "doc", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(analysisDomainEClass, AnalysisDomain.class, "AnalysisDomain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnalysisDomain_SuperDomain(), this.getAnalysisDomain(), this.getAnalysisDomain_SubDomains(), "SuperDomain", null, 0, 1, AnalysisDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnalysisDomain_SubDomains(), this.getAnalysisDomain(), this.getAnalysisDomain_SuperDomain(), "SubDomains", null, 0, -1, AnalysisDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnalysisDomain_Analyses(), this.getAnalysis(), this.getAnalysis_Domain(), "Analyses", null, 0, -1, AnalysisDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnalysisDomain_DataTools(), this.getDataTools(), this.getDataTools_Domain(), "DataTools", null, 0, -1, AnalysisDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getAnalysisDomain__GetNewDataTools__DataToolType(), theDatatoolsPackage.getDataTool(), "getNewDataTools", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDatatoolsPackage.getDataToolType(), "type", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(dataToolsEClass, DataTools.class, "DataTools", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataTools_Domain(), this.getAnalysisDomain(), this.getAnalysisDomain_DataTools(), "Domain", null, 1, 1, DataTools.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataTools_DataTools(), theDatatoolsPackage.getDataTool(), null, "DataTools", null, 0, -1, DataTools.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(analysisDocEClass, AnalysisDoc.class, "AnalysisDoc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnalysisDoc_Analysis(), this.getAnalysis(), this.getAnalysis_Docs(), "Analysis", null, 1, 1, AnalysisDoc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnalysisDoc_Elements(), this.getAnalysisElement(), this.getAnalysisElement_Doc(), "Elements", null, 0, -1, AnalysisDoc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnalysisDoc_Complete(), ecorePackage.getEBoolean(), "Complete", null, 0, 1, AnalysisDoc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnalysisDoc_NbElements(), ecorePackage.getEInt(), "NbElements", null, 0, 1, AnalysisDoc.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnalysisDoc_DocIndex(), ecorePackage.getEInt(), "DocIndex", null, 0, 1, AnalysisDoc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getAnalysisDoc__GetElements__Category(), theDatatoolsPackage.getEObjectsSet(), "getElements", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDatatoolsPackage.getCategory(), "category", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getAnalysisDoc__Flush(), null, "flush", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(analysisElementEClass, AnalysisElement.class, "AnalysisElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnalysisElement_Doc(), this.getAnalysisDoc(), this.getAnalysisDoc_Elements(), "Doc", null, 1, 1, AnalysisElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnalysisElement_Key(), this.getAnalysisElementKey(), this.getAnalysisElementKey_Docs(), "Key", null, 1, 1, AnalysisElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnalysisElement_Element(), ecorePackage.getEObject(), null, "Element", null, 1, 1, AnalysisElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnalysisElement_Category(), theDatatoolsPackage.getCategoryAbstract(), null, "Category", null, 1, 1, AnalysisElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getAnalysisElement__IsInCategory__CategoryAbstract(), ecorePackage.getEBoolean(), "isInCategory", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDatatoolsPackage.getCategoryAbstract(), "category", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(analysisElementKeyEClass, AnalysisElementKey.class, "AnalysisElementKey", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnalysisElementKey_Sheet(), this.getAnalysisSheet(), this.getAnalysisSheet_Keys(), "Sheet", null, 1, 1, AnalysisElementKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnalysisElementKey_Docs(), this.getAnalysisElement(), this.getAnalysisElement_Key(), "Docs", null, 0, -1, AnalysisElementKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnalysisElementKey_IndexKey(), this.getElementKey(), "IndexKey", null, 0, 1, AnalysisElementKey.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getAnalysisElementKey__GetKeyValue(), this.getElementKey(), "getKeyValue", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAnalysisElementKey__GetElement__AnalysisDoc(), this.getAnalysisElement(), "getElement", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAnalysisDoc(), "doc", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(analysisSheetEClass, AnalysisSheet.class, "AnalysisSheet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnalysisSheet_Keys(), this.getAnalysisElementKey(), this.getAnalysisElementKey_Sheet(), "Keys", null, 0, -1, AnalysisSheet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnalysisSheet_Analysis(), this.getAnalysis(), this.getAnalysis_Sheets(), "Analysis", null, 1, 1, AnalysisSheet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnalysisSheet_Columnizer(), theDatatoolsPackage.getColumnizerAbstract(), null, "Columnizer", null, 0, 1, AnalysisSheet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getAnalysisSheet__AddElement__AnalysisElement(), null, "addElement", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAnalysisElement(), "element", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAnalysisSheet__RemoveElement__AnalysisElement(), null, "removeElement", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAnalysisElement(), "element", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAnalysisSheet__GetKeyValue__EObject(), this.getElementKey(), "getKeyValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "element", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getAnalysisSheet__Flush(), null, "flush", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(analysisCategoryEClass, AnalysisCategory.class, "AnalysisCategory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnalysisCategory_Analysis(), this.getAnalysis(), null, "Analysis", null, 1, 1, AnalysisCategory.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(elementKeyEDataType, ElementKey.class, "ElementKey", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //AnalysisPackageImpl
