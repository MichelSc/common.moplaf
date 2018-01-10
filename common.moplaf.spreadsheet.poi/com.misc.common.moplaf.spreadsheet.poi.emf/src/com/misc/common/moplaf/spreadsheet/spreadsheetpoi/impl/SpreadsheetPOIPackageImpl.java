/**
 */
package com.misc.common.moplaf.spreadsheet.spreadsheetpoi.impl;

import com.misc.common.moplaf.file.FilePackage;
import com.misc.common.moplaf.spreadsheet.SpreadsheetPackage;

import com.misc.common.moplaf.spreadsheet.spreadsheetpoi.SpreadsheetPOI;
import com.misc.common.moplaf.spreadsheet.spreadsheetpoi.SpreadsheetPOIFactory;
import com.misc.common.moplaf.spreadsheet.spreadsheetpoi.SpreadsheetPOIPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SpreadsheetPOIPackageImpl extends EPackageImpl implements SpreadsheetPOIPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spreadsheetPOIEClass = null;

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
	 * @see com.misc.common.moplaf.spreadsheet.spreadsheetpoi.SpreadsheetPOIPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SpreadsheetPOIPackageImpl() {
		super(eNS_URI, SpreadsheetPOIFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SpreadsheetPOIPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SpreadsheetPOIPackage init() {
		if (isInited) return (SpreadsheetPOIPackage)EPackage.Registry.INSTANCE.getEPackage(SpreadsheetPOIPackage.eNS_URI);

		// Obtain or create and register package
		SpreadsheetPOIPackageImpl theSpreadsheetPOIPackage = (SpreadsheetPOIPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SpreadsheetPOIPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SpreadsheetPOIPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		SpreadsheetPackage.eINSTANCE.eClass();
		FilePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSpreadsheetPOIPackage.createPackageContents();

		// Initialize created meta-data
		theSpreadsheetPOIPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSpreadsheetPOIPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SpreadsheetPOIPackage.eNS_URI, theSpreadsheetPOIPackage);
		return theSpreadsheetPOIPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpreadsheetPOI() {
		return spreadsheetPOIEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpreadsheetPOIFactory getSpreadsheetPOIFactory() {
		return (SpreadsheetPOIFactory)getEFactoryInstance();
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
		spreadsheetPOIEClass = createEClass(SPREADSHEET_POI);
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
		SpreadsheetPackage theSpreadsheetPackage = (SpreadsheetPackage)EPackage.Registry.INSTANCE.getEPackage(SpreadsheetPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		spreadsheetPOIEClass.getESuperTypes().add(theSpreadsheetPackage.getSpreadsheet());

		// Initialize classes, features, and operations; add parameters
		initEClass(spreadsheetPOIEClass, SpreadsheetPOI.class, "SpreadsheetPOI", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //SpreadsheetPOIPackageImpl
