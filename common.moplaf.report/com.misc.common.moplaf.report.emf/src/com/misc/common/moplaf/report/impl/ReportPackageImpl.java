/**
 */
package com.misc.common.moplaf.report.impl;

import java.io.InputStream;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import com.misc.common.moplaf.report.ReportAbstract;
import com.misc.common.moplaf.report.ReportEngine;
import com.misc.common.moplaf.report.ReportFactory;
import com.misc.common.moplaf.report.ReportPackage;
import com.misc.common.moplaf.report.ReportRenderFormat;
import com.misc.common.moplaf.report.ReportRunMode;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ReportPackageImpl extends EPackageImpl implements ReportPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reportAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum reportEngineEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum reportRenderFormatEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum reportRunModeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType inputStreamEDataType = null;

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
	 * @see com.misc.common.moplaf.report.ReportPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ReportPackageImpl() {
		super(eNS_URI, ReportFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ReportPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ReportPackage init() {
		if (isInited) return (ReportPackage)EPackage.Registry.INSTANCE.getEPackage(ReportPackage.eNS_URI);

		// Obtain or create and register package
		ReportPackageImpl theReportPackage = (ReportPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ReportPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ReportPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theReportPackage.createPackageContents();

		// Initialize created meta-data
		theReportPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theReportPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ReportPackage.eNS_URI, theReportPackage);
		return theReportPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReportAbstract() {
		return reportAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReportAbstract_Engine() {
		return (EAttribute)reportAbstractEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReportAbstract_Format() {
		return (EAttribute)reportAbstractEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReportAbstract_Generated() {
		return (EAttribute)reportAbstractEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReportAbstract_OutputFilePath() {
		return (EAttribute)reportAbstractEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReportAbstract_LastGenerated() {
		return (EAttribute)reportAbstractEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReportAbstract_RunMode() {
		return (EAttribute)reportAbstractEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReportAbstract_MayBeRun() {
		return (EAttribute)reportAbstractEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReportAbstract_MayBeRunFeedback() {
		return (EAttribute)reportAbstractEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReportAbstract__Generate() {
		return reportAbstractEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReportAbstract__Render() {
		return reportAbstractEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReportAbstract__Write() {
		return reportAbstractEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReportAbstract__GetContext() {
		return reportAbstractEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReportAbstract__Run() {
		return reportAbstractEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReportAbstract__GetReportDesignFileURL() {
		return reportAbstractEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getReportEngine() {
		return reportEngineEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getReportRenderFormat() {
		return reportRenderFormatEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getReportRunMode() {
		return reportRunModeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getInputStream() {
		return inputStreamEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReportFactory getReportFactory() {
		return (ReportFactory)getEFactoryInstance();
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
		reportAbstractEClass = createEClass(REPORT_ABSTRACT);
		createEAttribute(reportAbstractEClass, REPORT_ABSTRACT__ENGINE);
		createEAttribute(reportAbstractEClass, REPORT_ABSTRACT__FORMAT);
		createEAttribute(reportAbstractEClass, REPORT_ABSTRACT__GENERATED);
		createEAttribute(reportAbstractEClass, REPORT_ABSTRACT__OUTPUT_FILE_PATH);
		createEAttribute(reportAbstractEClass, REPORT_ABSTRACT__LAST_GENERATED);
		createEAttribute(reportAbstractEClass, REPORT_ABSTRACT__RUN_MODE);
		createEAttribute(reportAbstractEClass, REPORT_ABSTRACT__MAY_BE_RUN);
		createEAttribute(reportAbstractEClass, REPORT_ABSTRACT__MAY_BE_RUN_FEEDBACK);
		createEOperation(reportAbstractEClass, REPORT_ABSTRACT___GENERATE);
		createEOperation(reportAbstractEClass, REPORT_ABSTRACT___RENDER);
		createEOperation(reportAbstractEClass, REPORT_ABSTRACT___WRITE);
		createEOperation(reportAbstractEClass, REPORT_ABSTRACT___GET_CONTEXT);
		createEOperation(reportAbstractEClass, REPORT_ABSTRACT___RUN);
		createEOperation(reportAbstractEClass, REPORT_ABSTRACT___GET_REPORT_DESIGN_FILE_URL);

		// Create enums
		reportEngineEEnum = createEEnum(REPORT_ENGINE);
		reportRenderFormatEEnum = createEEnum(REPORT_RENDER_FORMAT);
		reportRunModeEEnum = createEEnum(REPORT_RUN_MODE);

		// Create data types
		inputStreamEDataType = createEDataType(INPUT_STREAM);
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
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(reportAbstractEClass, ReportAbstract.class, "ReportAbstract", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReportAbstract_Engine(), this.getReportEngine(), "Engine", "Birt", 0, 1, ReportAbstract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReportAbstract_Format(), this.getReportRenderFormat(), "Format", "pdf", 0, 1, ReportAbstract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReportAbstract_Generated(), ecorePackage.getEBoolean(), "Generated", null, 0, 1, ReportAbstract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReportAbstract_OutputFilePath(), theEcorePackage.getEString(), "OutputFilePath", "/home/michel/tmp/output", 0, 1, ReportAbstract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReportAbstract_LastGenerated(), theEcorePackage.getEDate(), "LastGenerated", null, 0, 1, ReportAbstract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReportAbstract_RunMode(), this.getReportRunMode(), "RunMode", "GenerateAndRender", 0, 1, ReportAbstract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReportAbstract_MayBeRun(), theEcorePackage.getEBoolean(), "mayBeRun", "false", 0, 1, ReportAbstract.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getReportAbstract_MayBeRunFeedback(), theEcorePackage.getEString(), "mayBeRunFeedback", null, 0, 1, ReportAbstract.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEOperation(getReportAbstract__Generate(), ecorePackage.getEBoolean(), "generate", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getReportAbstract__Render(), null, "render", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getReportAbstract__Write(), null, "write", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getReportAbstract__GetContext(), ecorePackage.getEObject(), "getContext", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getReportAbstract__Run(), null, "run", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getReportAbstract__GetReportDesignFileURL(), theEcorePackage.getEString(), "getReportDesignFileURL", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(reportEngineEEnum, ReportEngine.class, "ReportEngine");
		addEEnumLiteral(reportEngineEEnum, ReportEngine.ENUM_REPORT_ENGINE_BIRT);

		initEEnum(reportRenderFormatEEnum, ReportRenderFormat.class, "ReportRenderFormat");
		addEEnumLiteral(reportRenderFormatEEnum, ReportRenderFormat.ENUM_RENDER_FORMAT_PDF);
		addEEnumLiteral(reportRenderFormatEEnum, ReportRenderFormat.ENUM_REDER_FORMAT_HTML);
		addEEnumLiteral(reportRenderFormatEEnum, ReportRenderFormat.ENUM_RENDER_FORMAT_XLS);
		addEEnumLiteral(reportRenderFormatEEnum, ReportRenderFormat.ENUM_RENDER_FORMAT_XLSX);
		addEEnumLiteral(reportRenderFormatEEnum, ReportRenderFormat.ENUM_RENDER_FORMAT_DOC);
		addEEnumLiteral(reportRenderFormatEEnum, ReportRenderFormat.ENUM_RENDER_FORMAT_DOCX);

		initEEnum(reportRunModeEEnum, ReportRunMode.class, "ReportRunMode");
		addEEnumLiteral(reportRunModeEEnum, ReportRunMode.ENUM_GENERATE_ONLY);
		addEEnumLiteral(reportRunModeEEnum, ReportRunMode.ENUM_RENDER_ONLY);
		addEEnumLiteral(reportRunModeEEnum, ReportRunMode.ENUM_WRITE_ONLY);
		addEEnumLiteral(reportRunModeEEnum, ReportRunMode.ENUM_GENERATE_AND_RENDER);
		addEEnumLiteral(reportRunModeEEnum, ReportRunMode.ENUM_GENERATE_AND_WRITE);

		// Initialize data types
		initEDataType(inputStreamEDataType, InputStream.class, "InputStream", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //ReportPackageImpl
