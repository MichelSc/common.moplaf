/**
 */
package com.misc.common.moplaf.gis.osrm.impl;

import com.misc.common.moplaf.gis.GisPackage;

import com.misc.common.moplaf.gis.osrm.GisDistanceMatrixCalculatorOsrmManyToMany;
import com.misc.common.moplaf.gis.osrm.GisDistanceMatrixCalculatorOsrmOneToOne;
import com.misc.common.moplaf.gis.osrm.GisOsrmFactory;
import com.misc.common.moplaf.gis.osrm.GisOsrmPackage;

import com.misc.common.moplaf.gis.osrm.Overview;
import com.misc.common.moplaf.gis.osrm.Protocol;
import com.misc.common.moplaf.job.JobPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gisDistanceMatrixCalculatorOsrmManyToManyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum protocolEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum overviewEEnum = null;

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
	public EAttribute getGisDistanceMatrixCalculatorOsrmOneToOne_Protocol() {
		return (EAttribute)gisDistanceMatrixCalculatorOsrmOneToOneEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGisDistanceMatrixCalculatorOsrmOneToOne_Host() {
		return (EAttribute)gisDistanceMatrixCalculatorOsrmOneToOneEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGisDistanceMatrixCalculatorOsrmOneToOne_Port() {
		return (EAttribute)gisDistanceMatrixCalculatorOsrmOneToOneEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGisDistanceMatrixCalculatorOsrmOneToOne_Path() {
		return (EAttribute)gisDistanceMatrixCalculatorOsrmOneToOneEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGisDistanceMatrixCalculatorOsrmOneToOne_Profile() {
		return (EAttribute)gisDistanceMatrixCalculatorOsrmOneToOneEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGisDistanceMatrixCalculatorOsrmOneToOne_Overview() {
		return (EAttribute)gisDistanceMatrixCalculatorOsrmOneToOneEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGisDistanceMatrixCalculatorOsrmManyToMany() {
		return gisDistanceMatrixCalculatorOsrmManyToManyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGisDistanceMatrixCalculatorOsrmManyToMany_Protocol() {
		return (EAttribute)gisDistanceMatrixCalculatorOsrmManyToManyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGisDistanceMatrixCalculatorOsrmManyToMany_Host() {
		return (EAttribute)gisDistanceMatrixCalculatorOsrmManyToManyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGisDistanceMatrixCalculatorOsrmManyToMany_Port() {
		return (EAttribute)gisDistanceMatrixCalculatorOsrmManyToManyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGisDistanceMatrixCalculatorOsrmManyToMany_Path() {
		return (EAttribute)gisDistanceMatrixCalculatorOsrmManyToManyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGisDistanceMatrixCalculatorOsrmManyToMany_Profile() {
		return (EAttribute)gisDistanceMatrixCalculatorOsrmManyToManyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getProtocol() {
		return protocolEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOverview() {
		return overviewEEnum;
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
		createEAttribute(gisDistanceMatrixCalculatorOsrmOneToOneEClass, GIS_DISTANCE_MATRIX_CALCULATOR_OSRM_ONE_TO_ONE__PROTOCOL);
		createEAttribute(gisDistanceMatrixCalculatorOsrmOneToOneEClass, GIS_DISTANCE_MATRIX_CALCULATOR_OSRM_ONE_TO_ONE__HOST);
		createEAttribute(gisDistanceMatrixCalculatorOsrmOneToOneEClass, GIS_DISTANCE_MATRIX_CALCULATOR_OSRM_ONE_TO_ONE__PORT);
		createEAttribute(gisDistanceMatrixCalculatorOsrmOneToOneEClass, GIS_DISTANCE_MATRIX_CALCULATOR_OSRM_ONE_TO_ONE__PATH);
		createEAttribute(gisDistanceMatrixCalculatorOsrmOneToOneEClass, GIS_DISTANCE_MATRIX_CALCULATOR_OSRM_ONE_TO_ONE__PROFILE);
		createEAttribute(gisDistanceMatrixCalculatorOsrmOneToOneEClass, GIS_DISTANCE_MATRIX_CALCULATOR_OSRM_ONE_TO_ONE__OVERVIEW);

		gisDistanceMatrixCalculatorOsrmManyToManyEClass = createEClass(GIS_DISTANCE_MATRIX_CALCULATOR_OSRM_MANY_TO_MANY);
		createEAttribute(gisDistanceMatrixCalculatorOsrmManyToManyEClass, GIS_DISTANCE_MATRIX_CALCULATOR_OSRM_MANY_TO_MANY__PROTOCOL);
		createEAttribute(gisDistanceMatrixCalculatorOsrmManyToManyEClass, GIS_DISTANCE_MATRIX_CALCULATOR_OSRM_MANY_TO_MANY__HOST);
		createEAttribute(gisDistanceMatrixCalculatorOsrmManyToManyEClass, GIS_DISTANCE_MATRIX_CALCULATOR_OSRM_MANY_TO_MANY__PORT);
		createEAttribute(gisDistanceMatrixCalculatorOsrmManyToManyEClass, GIS_DISTANCE_MATRIX_CALCULATOR_OSRM_MANY_TO_MANY__PATH);
		createEAttribute(gisDistanceMatrixCalculatorOsrmManyToManyEClass, GIS_DISTANCE_MATRIX_CALCULATOR_OSRM_MANY_TO_MANY__PROFILE);

		// Create enums
		protocolEEnum = createEEnum(PROTOCOL);
		overviewEEnum = createEEnum(OVERVIEW);
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
		gisDistanceMatrixCalculatorOsrmManyToManyEClass.getESuperTypes().add(theGisPackage.getGisRouteCalculatorManyToMany());

		// Initialize classes, features, and operations; add parameters
		initEClass(gisDistanceMatrixCalculatorOsrmOneToOneEClass, GisDistanceMatrixCalculatorOsrmOneToOne.class, "GisDistanceMatrixCalculatorOsrmOneToOne", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGisDistanceMatrixCalculatorOsrmOneToOne_Protocol(), this.getProtocol(), "Protocol", "https", 0, 1, GisDistanceMatrixCalculatorOsrmOneToOne.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGisDistanceMatrixCalculatorOsrmOneToOne_Host(), ecorePackage.getEString(), "Host", "router.project-osrm.org", 0, 1, GisDistanceMatrixCalculatorOsrmOneToOne.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGisDistanceMatrixCalculatorOsrmOneToOne_Port(), ecorePackage.getEInt(), "Port", "443", 0, 1, GisDistanceMatrixCalculatorOsrmOneToOne.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGisDistanceMatrixCalculatorOsrmOneToOne_Path(), ecorePackage.getEString(), "Path", "/route/v1", 0, 1, GisDistanceMatrixCalculatorOsrmOneToOne.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGisDistanceMatrixCalculatorOsrmOneToOne_Profile(), ecorePackage.getEString(), "Profile", "driving", 0, 1, GisDistanceMatrixCalculatorOsrmOneToOne.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGisDistanceMatrixCalculatorOsrmOneToOne_Overview(), this.getOverview(), "Overview", "false", 0, 1, GisDistanceMatrixCalculatorOsrmOneToOne.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gisDistanceMatrixCalculatorOsrmManyToManyEClass, GisDistanceMatrixCalculatorOsrmManyToMany.class, "GisDistanceMatrixCalculatorOsrmManyToMany", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGisDistanceMatrixCalculatorOsrmManyToMany_Protocol(), this.getProtocol(), "Protocol", "https", 0, 1, GisDistanceMatrixCalculatorOsrmManyToMany.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGisDistanceMatrixCalculatorOsrmManyToMany_Host(), ecorePackage.getEString(), "Host", "router.project-osrm.org", 0, 1, GisDistanceMatrixCalculatorOsrmManyToMany.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGisDistanceMatrixCalculatorOsrmManyToMany_Port(), ecorePackage.getEInt(), "Port", "443", 0, 1, GisDistanceMatrixCalculatorOsrmManyToMany.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGisDistanceMatrixCalculatorOsrmManyToMany_Path(), ecorePackage.getEString(), "Path", "/route/v1", 0, 1, GisDistanceMatrixCalculatorOsrmManyToMany.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGisDistanceMatrixCalculatorOsrmManyToMany_Profile(), ecorePackage.getEString(), "Profile", "driving", 0, 1, GisDistanceMatrixCalculatorOsrmManyToMany.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(protocolEEnum, Protocol.class, "Protocol");
		addEEnumLiteral(protocolEEnum, Protocol.HTTP);
		addEEnumLiteral(protocolEEnum, Protocol.HTTPS);

		initEEnum(overviewEEnum, Overview.class, "Overview");
		addEEnumLiteral(overviewEEnum, Overview.SIMPLIFIED);
		addEEnumLiteral(overviewEEnum, Overview.FULL);
		addEEnumLiteral(overviewEEnum, Overview.NONE);

		// Create resource
		createResource(eNS_URI);
	}

} //GisOsrmPackageImpl
