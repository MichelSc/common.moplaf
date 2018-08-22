/**
 */
package com.misc.common.moplaf.analysis.impl;

import com.misc.common.moplaf.analysis.AnalysisDomain;
import com.misc.common.moplaf.analysis.AnalysisFactory;
import com.misc.common.moplaf.analysis.AnalysisPackage;
import com.misc.common.moplaf.analysis.DataTools;
import com.misc.common.moplaf.analysis.DocAnalysis;

import com.misc.common.moplaf.analysis.DocComparison;
import com.misc.common.moplaf.datatools.DatatoolsPackage;
import com.misc.common.moplaf.file.FilePackage;

import com.misc.common.moplaf.job.JobPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
	private EClass docAnalysisEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass docComparisonEClass = null;

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
	public EClass getDocAnalysis() {
		return docAnalysisEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocAnalysis_Extractor() {
		return (EReference)docAnalysisEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocAnalysis_Columnizer() {
		return (EReference)docAnalysisEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocAnalysis_Complete() {
		return (EAttribute)docAnalysisEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocAnalysis_MaxElements() {
		return (EAttribute)docAnalysisEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocAnalysis_Categorizers() {
		return (EReference)docAnalysisEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocAnalysis_Description() {
		return (EAttribute)docAnalysisEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocAnalysis_DataTools() {
		return (EReference)docAnalysisEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocAnalysis_Domain() {
		return (EReference)docAnalysisEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocAnalysis_RefreshFeedback() {
		return (EAttribute)docAnalysisEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDocAnalysis__Refresh() {
		return docAnalysisEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDocAnalysis__AddTool__DataTool() {
		return docAnalysisEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocComparison() {
		return docComparisonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocComparison_Extractor() {
		return (EReference)docComparisonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocComparison_ColumnizerCompare() {
		return (EReference)docComparisonEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocComparison_Doc1() {
		return (EReference)docComparisonEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocComparison_Doc2() {
		return (EReference)docComparisonEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocComparison_Matches() {
		return (EReference)docComparisonEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocComparison_Matcher() {
		return (EReference)docComparisonEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocComparison_ColumnizerKey() {
		return (EReference)docComparisonEClass.getEStructuralFeatures().get(6);
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
		docAnalysisEClass = createEClass(DOC_ANALYSIS);
		createEReference(docAnalysisEClass, DOC_ANALYSIS__EXTRACTOR);
		createEReference(docAnalysisEClass, DOC_ANALYSIS__COLUMNIZER);
		createEAttribute(docAnalysisEClass, DOC_ANALYSIS__COMPLETE);
		createEAttribute(docAnalysisEClass, DOC_ANALYSIS__MAX_ELEMENTS);
		createEReference(docAnalysisEClass, DOC_ANALYSIS__CATEGORIZERS);
		createEAttribute(docAnalysisEClass, DOC_ANALYSIS__DESCRIPTION);
		createEReference(docAnalysisEClass, DOC_ANALYSIS__DATA_TOOLS);
		createEReference(docAnalysisEClass, DOC_ANALYSIS__DOMAIN);
		createEAttribute(docAnalysisEClass, DOC_ANALYSIS__REFRESH_FEEDBACK);
		createEOperation(docAnalysisEClass, DOC_ANALYSIS___REFRESH);
		createEOperation(docAnalysisEClass, DOC_ANALYSIS___ADD_TOOL__DATATOOL);

		docComparisonEClass = createEClass(DOC_COMPARISON);
		createEReference(docComparisonEClass, DOC_COMPARISON__EXTRACTOR);
		createEReference(docComparisonEClass, DOC_COMPARISON__COLUMNIZER_COMPARE);
		createEReference(docComparisonEClass, DOC_COMPARISON__DOC1);
		createEReference(docComparisonEClass, DOC_COMPARISON__DOC2);
		createEReference(docComparisonEClass, DOC_COMPARISON__MATCHES);
		createEReference(docComparisonEClass, DOC_COMPARISON__MATCHER);
		createEReference(docComparisonEClass, DOC_COMPARISON__COLUMNIZER_KEY);

		analysisDomainEClass = createEClass(ANALYSIS_DOMAIN);
		createEReference(analysisDomainEClass, ANALYSIS_DOMAIN__SUPER_DOMAIN);
		createEReference(analysisDomainEClass, ANALYSIS_DOMAIN__SUB_DOMAINS);
		createEReference(analysisDomainEClass, ANALYSIS_DOMAIN__ANALYSES);
		createEReference(analysisDomainEClass, ANALYSIS_DOMAIN__DATA_TOOLS);
		createEOperation(analysisDomainEClass, ANALYSIS_DOMAIN___GET_NEW_DATA_TOOLS__DATATOOLTYPE);

		dataToolsEClass = createEClass(DATA_TOOLS);
		createEReference(dataToolsEClass, DATA_TOOLS__DOMAIN);
		createEReference(dataToolsEClass, DATA_TOOLS__DATA_TOOLS);
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
		docAnalysisEClass.getESuperTypes().add(theDatatoolsPackage.getSuperCategory());
		docAnalysisEClass.getESuperTypes().add(theJobPackage.getDocRef());
		docAnalysisEClass.getESuperTypes().add(theDatatoolsPackage.getDataToolContext());
		analysisDomainEClass.getESuperTypes().add(theJobPackage.getTaskDomain());
		analysisDomainEClass.getESuperTypes().add(theDatatoolsPackage.getDataToolContext());
		dataToolsEClass.getESuperTypes().add(theDatatoolsPackage.getDataToolContext());

		// Initialize classes, features, and operations; add parameters
		initEClass(docAnalysisEClass, DocAnalysis.class, "DocAnalysis", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDocAnalysis_Extractor(), theDatatoolsPackage.getExtractor(), null, "Extractor", null, 0, 1, DocAnalysis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocAnalysis_Columnizer(), theDatatoolsPackage.getColumnizerAbstract(), null, "Columnizer", null, 0, 1, DocAnalysis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocAnalysis_Complete(), ecorePackage.getEBoolean(), "Complete", null, 0, 1, DocAnalysis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocAnalysis_MaxElements(), ecorePackage.getEInt(), "MaxElements", "1000000", 0, 1, DocAnalysis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocAnalysis_Categorizers(), theDatatoolsPackage.getCategorizer(), null, "Categorizers", null, 0, -1, DocAnalysis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocAnalysis_Description(), ecorePackage.getEString(), "Description", null, 0, 1, DocAnalysis.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocAnalysis_DataTools(), theDatatoolsPackage.getDataTool(), null, "DataTools", null, 0, -1, DocAnalysis.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocAnalysis_Domain(), this.getAnalysisDomain(), this.getAnalysisDomain_Analyses(), "Domain", null, 1, 1, DocAnalysis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocAnalysis_RefreshFeedback(), theJobPackage.getEnabledFeedback(), "RefreshFeedback", null, 0, 1, DocAnalysis.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEOperation(getDocAnalysis__Refresh(), null, "refresh", 0, 1, IS_UNIQUE, IS_ORDERED);

		EOperation op = initEOperation(getDocAnalysis__AddTool__DataTool(), null, "addTool", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDatatoolsPackage.getDataTool(), "tool", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(docComparisonEClass, DocComparison.class, "DocComparison", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDocComparison_Extractor(), theDatatoolsPackage.getExtractor(), null, "Extractor", null, 0, 1, DocComparison.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocComparison_ColumnizerCompare(), theDatatoolsPackage.getColumnizerAbstract(), null, "ColumnizerCompare", null, 0, 1, DocComparison.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocComparison_Doc1(), theJobPackage.getDocRef(), null, "Doc1", null, 0, 1, DocComparison.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocComparison_Doc2(), theJobPackage.getDocRef(), null, "Doc2", null, 0, 1, DocComparison.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocComparison_Matches(), theDatatoolsPackage.getMatch(), null, "Matches", null, 0, -1, DocComparison.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocComparison_Matcher(), theDatatoolsPackage.getMatcher(), null, "Matcher", null, 0, 1, DocComparison.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocComparison_ColumnizerKey(), theDatatoolsPackage.getColumnizerAbstract(), null, "ColumnizerKey", null, 0, 1, DocComparison.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(analysisDomainEClass, AnalysisDomain.class, "AnalysisDomain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnalysisDomain_SuperDomain(), this.getAnalysisDomain(), this.getAnalysisDomain_SubDomains(), "SuperDomain", null, 0, 1, AnalysisDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnalysisDomain_SubDomains(), this.getAnalysisDomain(), this.getAnalysisDomain_SuperDomain(), "SubDomains", null, 0, -1, AnalysisDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnalysisDomain_Analyses(), this.getDocAnalysis(), this.getDocAnalysis_Domain(), "Analyses", null, 0, -1, AnalysisDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnalysisDomain_DataTools(), this.getDataTools(), this.getDataTools_Domain(), "DataTools", null, 0, -1, AnalysisDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getAnalysisDomain__GetNewDataTools__DataToolType(), theDatatoolsPackage.getDataTool(), "getNewDataTools", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDatatoolsPackage.getDataToolType(), "type", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(dataToolsEClass, DataTools.class, "DataTools", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataTools_Domain(), this.getAnalysisDomain(), this.getAnalysisDomain_DataTools(), "Domain", null, 1, 1, DataTools.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataTools_DataTools(), theDatatoolsPackage.getDataTool(), null, "DataTools", null, 0, -1, DataTools.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //AnalysisPackageImpl
