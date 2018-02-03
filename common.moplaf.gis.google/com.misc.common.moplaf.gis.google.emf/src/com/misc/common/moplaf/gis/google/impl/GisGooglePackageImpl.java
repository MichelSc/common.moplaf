/**
 */
package com.misc.common.moplaf.gis.google.impl;

import com.misc.common.moplaf.gis.GisPackage;

import com.misc.common.moplaf.gis.google.GisAddressGeocoderGoogleWS;
import com.misc.common.moplaf.gis.google.GisDistanceMatrixCalculatorGoogleWS;
import com.misc.common.moplaf.gis.google.GisGoogleFactory;
import com.misc.common.moplaf.gis.google.GisGooglePackage;
import com.misc.common.moplaf.gis.google.Protocol;
import com.misc.common.moplaf.gis.google.TravelMode;

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
public class GisGooglePackageImpl extends EPackageImpl implements GisGooglePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gisDistanceMatrixCalculatorGoogleWSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gisAddressGeocoderGoogleWSEClass = null;

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
	private EEnum travelModeEEnum = null;

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
	 * @see com.misc.common.moplaf.gis.google.GisGooglePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GisGooglePackageImpl() {
		super(eNS_URI, GisGoogleFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link GisGooglePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GisGooglePackage init() {
		if (isInited) return (GisGooglePackage)EPackage.Registry.INSTANCE.getEPackage(GisGooglePackage.eNS_URI);

		// Obtain or create and register package
		GisGooglePackageImpl theGisGooglePackage = (GisGooglePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof GisGooglePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new GisGooglePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		GisPackage.eINSTANCE.eClass();
		JobPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theGisGooglePackage.createPackageContents();

		// Initialize created meta-data
		theGisGooglePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGisGooglePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GisGooglePackage.eNS_URI, theGisGooglePackage);
		return theGisGooglePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGisDistanceMatrixCalculatorGoogleWS() {
		return gisDistanceMatrixCalculatorGoogleWSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGisDistanceMatrixCalculatorGoogleWS_Protocol() {
		return (EAttribute)gisDistanceMatrixCalculatorGoogleWSEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGisDistanceMatrixCalculatorGoogleWS_Port() {
		return (EAttribute)gisDistanceMatrixCalculatorGoogleWSEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGisDistanceMatrixCalculatorGoogleWS_Host() {
		return (EAttribute)gisDistanceMatrixCalculatorGoogleWSEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGisDistanceMatrixCalculatorGoogleWS_Path() {
		return (EAttribute)gisDistanceMatrixCalculatorGoogleWSEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGisDistanceMatrixCalculatorGoogleWS_Key() {
		return (EAttribute)gisDistanceMatrixCalculatorGoogleWSEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGisDistanceMatrixCalculatorGoogleWS_AvoidTolls() {
		return (EAttribute)gisDistanceMatrixCalculatorGoogleWSEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGisDistanceMatrixCalculatorGoogleWS_AvoidFerries() {
		return (EAttribute)gisDistanceMatrixCalculatorGoogleWSEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGisDistanceMatrixCalculatorGoogleWS_AvoidHighways() {
		return (EAttribute)gisDistanceMatrixCalculatorGoogleWSEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGisDistanceMatrixCalculatorGoogleWS_TravelModel() {
		return (EAttribute)gisDistanceMatrixCalculatorGoogleWSEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGisAddressGeocoderGoogleWS() {
		return gisAddressGeocoderGoogleWSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGisAddressGeocoderGoogleWS_Protocol() {
		return (EAttribute)gisAddressGeocoderGoogleWSEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGisAddressGeocoderGoogleWS_Port() {
		return (EAttribute)gisAddressGeocoderGoogleWSEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGisAddressGeocoderGoogleWS_Host() {
		return (EAttribute)gisAddressGeocoderGoogleWSEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGisAddressGeocoderGoogleWS_Path() {
		return (EAttribute)gisAddressGeocoderGoogleWSEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGisAddressGeocoderGoogleWS_Key() {
		return (EAttribute)gisAddressGeocoderGoogleWSEClass.getEStructuralFeatures().get(4);
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
	public EEnum getTravelMode() {
		return travelModeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GisGoogleFactory getGisGoogleFactory() {
		return (GisGoogleFactory)getEFactoryInstance();
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
		gisDistanceMatrixCalculatorGoogleWSEClass = createEClass(GIS_DISTANCE_MATRIX_CALCULATOR_GOOGLE_WS);
		createEAttribute(gisDistanceMatrixCalculatorGoogleWSEClass, GIS_DISTANCE_MATRIX_CALCULATOR_GOOGLE_WS__PROTOCOL);
		createEAttribute(gisDistanceMatrixCalculatorGoogleWSEClass, GIS_DISTANCE_MATRIX_CALCULATOR_GOOGLE_WS__PORT);
		createEAttribute(gisDistanceMatrixCalculatorGoogleWSEClass, GIS_DISTANCE_MATRIX_CALCULATOR_GOOGLE_WS__HOST);
		createEAttribute(gisDistanceMatrixCalculatorGoogleWSEClass, GIS_DISTANCE_MATRIX_CALCULATOR_GOOGLE_WS__PATH);
		createEAttribute(gisDistanceMatrixCalculatorGoogleWSEClass, GIS_DISTANCE_MATRIX_CALCULATOR_GOOGLE_WS__KEY);
		createEAttribute(gisDistanceMatrixCalculatorGoogleWSEClass, GIS_DISTANCE_MATRIX_CALCULATOR_GOOGLE_WS__AVOID_TOLLS);
		createEAttribute(gisDistanceMatrixCalculatorGoogleWSEClass, GIS_DISTANCE_MATRIX_CALCULATOR_GOOGLE_WS__AVOID_FERRIES);
		createEAttribute(gisDistanceMatrixCalculatorGoogleWSEClass, GIS_DISTANCE_MATRIX_CALCULATOR_GOOGLE_WS__AVOID_HIGHWAYS);
		createEAttribute(gisDistanceMatrixCalculatorGoogleWSEClass, GIS_DISTANCE_MATRIX_CALCULATOR_GOOGLE_WS__TRAVEL_MODEL);

		gisAddressGeocoderGoogleWSEClass = createEClass(GIS_ADDRESS_GEOCODER_GOOGLE_WS);
		createEAttribute(gisAddressGeocoderGoogleWSEClass, GIS_ADDRESS_GEOCODER_GOOGLE_WS__PROTOCOL);
		createEAttribute(gisAddressGeocoderGoogleWSEClass, GIS_ADDRESS_GEOCODER_GOOGLE_WS__PORT);
		createEAttribute(gisAddressGeocoderGoogleWSEClass, GIS_ADDRESS_GEOCODER_GOOGLE_WS__HOST);
		createEAttribute(gisAddressGeocoderGoogleWSEClass, GIS_ADDRESS_GEOCODER_GOOGLE_WS__PATH);
		createEAttribute(gisAddressGeocoderGoogleWSEClass, GIS_ADDRESS_GEOCODER_GOOGLE_WS__KEY);

		// Create enums
		protocolEEnum = createEEnum(PROTOCOL);
		travelModeEEnum = createEEnum(TRAVEL_MODE);
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
		gisDistanceMatrixCalculatorGoogleWSEClass.getESuperTypes().add(theGisPackage.getGisRouteCalculatorManyToMany());
		gisAddressGeocoderGoogleWSEClass.getESuperTypes().add(theGisPackage.getGisAddressGeocoder());

		// Initialize classes, features, and operations; add parameters
		initEClass(gisDistanceMatrixCalculatorGoogleWSEClass, GisDistanceMatrixCalculatorGoogleWS.class, "GisDistanceMatrixCalculatorGoogleWS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGisDistanceMatrixCalculatorGoogleWS_Protocol(), this.getProtocol(), "Protocol", null, 0, 1, GisDistanceMatrixCalculatorGoogleWS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGisDistanceMatrixCalculatorGoogleWS_Port(), ecorePackage.getEInt(), "Port", "80", 0, 1, GisDistanceMatrixCalculatorGoogleWS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGisDistanceMatrixCalculatorGoogleWS_Host(), ecorePackage.getEString(), "Host", "maps.googleapis.com", 0, 1, GisDistanceMatrixCalculatorGoogleWS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGisDistanceMatrixCalculatorGoogleWS_Path(), ecorePackage.getEString(), "Path", "/maps/api/distancematrix/json", 0, 1, GisDistanceMatrixCalculatorGoogleWS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGisDistanceMatrixCalculatorGoogleWS_Key(), ecorePackage.getEString(), "Key", null, 0, 1, GisDistanceMatrixCalculatorGoogleWS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGisDistanceMatrixCalculatorGoogleWS_AvoidTolls(), ecorePackage.getEBoolean(), "AvoidTolls", null, 0, 1, GisDistanceMatrixCalculatorGoogleWS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGisDistanceMatrixCalculatorGoogleWS_AvoidFerries(), ecorePackage.getEBoolean(), "AvoidFerries", null, 0, 1, GisDistanceMatrixCalculatorGoogleWS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGisDistanceMatrixCalculatorGoogleWS_AvoidHighways(), ecorePackage.getEBoolean(), "AvoidHighways", null, 0, 1, GisDistanceMatrixCalculatorGoogleWS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGisDistanceMatrixCalculatorGoogleWS_TravelModel(), this.getTravelMode(), "TravelModel", null, 0, 1, GisDistanceMatrixCalculatorGoogleWS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gisAddressGeocoderGoogleWSEClass, GisAddressGeocoderGoogleWS.class, "GisAddressGeocoderGoogleWS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGisAddressGeocoderGoogleWS_Protocol(), this.getProtocol(), "Protocol", "https", 0, 1, GisAddressGeocoderGoogleWS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGisAddressGeocoderGoogleWS_Port(), ecorePackage.getEInt(), "Port", "443", 0, 1, GisAddressGeocoderGoogleWS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGisAddressGeocoderGoogleWS_Host(), ecorePackage.getEString(), "Host", "maps.googleapis.com", 0, 1, GisAddressGeocoderGoogleWS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGisAddressGeocoderGoogleWS_Path(), ecorePackage.getEString(), "Path", "/maps/api/geocode/json", 0, 1, GisAddressGeocoderGoogleWS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGisAddressGeocoderGoogleWS_Key(), ecorePackage.getEString(), "Key", null, 0, 1, GisAddressGeocoderGoogleWS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(protocolEEnum, Protocol.class, "Protocol");
		addEEnumLiteral(protocolEEnum, Protocol.HTTP);
		addEEnumLiteral(protocolEEnum, Protocol.HTTPS);

		initEEnum(travelModeEEnum, TravelMode.class, "TravelMode");
		addEEnumLiteral(travelModeEEnum, TravelMode.DRIVING);
		addEEnumLiteral(travelModeEEnum, TravelMode.WALKING);
		addEEnumLiteral(travelModeEEnum, TravelMode.BICYCLING);

		// Create resource
		createResource(eNS_URI);
	}

} //GisGooglePackageImpl
