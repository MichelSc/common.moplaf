/**
 */
package com.misc.common.moplaf.gis.osrm.impl;

import com.misc.common.moplaf.gis.GisPackage;

import com.misc.common.moplaf.gis.osrm.GisDistanceMatrixCalculatorOsrmOneToOne;
import com.misc.common.moplaf.gis.osrm.GisOsrmFactory;
import com.misc.common.moplaf.gis.osrm.GisOsrmPackage;

import com.misc.common.moplaf.job.JobPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GisOsrmPackageImpl extends EPackageImpl implements GisOsrmPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gisDistanceMatrixCalculatorOsrmOneToOneEClass = null;

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
	 * @see com.misc.common.moplaf.gis.osrm.GisOsrmPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GisOsrmPackageImpl() {
		super(eNS_URI, GisOsrmFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link GisOsrmPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GisOsrmPackage init() {
		if (isInited) return (GisOsrmPackage)EPackage.Registry.INSTANCE.getEPackage(GisOsrmPackage.eNS_URI);

		// Obtain or create and register package
		GisOsrmPackageImpl theGisOsrmPackage = (GisOsrmPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof GisOsrmPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new GisOsrmPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		GisPackage.eINSTANCE.eClass();
		JobPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theGisOsrmPackage.createPackageContents();

		// Initialize created meta-data
		theGisOsrmPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGisOsrmPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GisOsrmPackage.eNS_URI, theGisOsrmPackage);
		return theGisOsrmPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGisDistanceMatrixCalculatorOsrmOneToOne() {
		return gisDistanceMatrixCalculatorOsrmOneToOneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GisOsrmFactory getGisOsrmFactory() {
		return (GisOsrmFactory)getEFactoryInstance();
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
		gisDistanceMatrixCalculatorOsrmOneToOneEClass = createEClass(GIS_DISTANCE_MATRIX_CALCULATOR_OSRM_ONE_TO_ONE);
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
		GisPackage theGisPackage = (GisPackage)EPackage.Registry.INSTANCE.getEPackage(GisPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		gisDistanceMatrixCalculatorOsrmOneToOneEClass.getESuperTypes().add(theGisPackage.getGisRouteCalculatorOneToOne());

		// Initialize classes, features, and operations; add parameters
		initEClass(gisDistanceMatrixCalculatorOsrmOneToOneEClass, GisDistanceMatrixCalculatorOsrmOneToOne.class, "GisDistanceMatrixCalculatorOsrmOneToOne", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //GisOsrmPackageImpl
