/**
 */
package com.misc.common.moplaf.gis.impl;

import com.misc.common.moplaf.gis.GisAddress;
import com.misc.common.moplaf.gis.GisAddressGeocoded;
import com.misc.common.moplaf.gis.GisAddressGeocoder;
import com.misc.common.moplaf.gis.GisCoordinates;
import com.misc.common.moplaf.gis.GisDistanceFromLocation;
import com.misc.common.moplaf.gis.GisDistanceMatrix;
import com.misc.common.moplaf.gis.GisDistanceMatrixCalculator;
import com.misc.common.moplaf.gis.GisDistanceMatrixElement;
import com.misc.common.moplaf.gis.GisDistanceToLocation;
import com.misc.common.moplaf.gis.GisFactory;
import com.misc.common.moplaf.gis.GisLocation;
import com.misc.common.moplaf.gis.GisPackage;
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
public class GisPackageImpl extends EPackageImpl implements GisPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gisCoordinatesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gisAddressEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gisDistanceMatrixEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gisDistanceMatrixElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gisDistanceFromLocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gisDistanceToLocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gisAddressGeocodedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gisLocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gisAddressGeocoderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gisDistanceMatrixCalculatorEClass = null;

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
	 * @see com.misc.common.moplaf.gis.GisPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GisPackageImpl() {
		super(eNS_URI, GisFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link GisPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GisPackage init() {
		if (isInited) return (GisPackage)EPackage.Registry.INSTANCE.getEPackage(GisPackage.eNS_URI);

		// Obtain or create and register package
		GisPackageImpl theGisPackage = (GisPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof GisPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new GisPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theGisPackage.createPackageContents();

		// Initialize created meta-data
		theGisPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGisPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GisPackage.eNS_URI, theGisPackage);
		return theGisPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGisCoordinates() {
		return gisCoordinatesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGisCoordinates_Longitude() {
		return (EAttribute)gisCoordinatesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGisCoordinates_Latitude() {
		return (EAttribute)gisCoordinatesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGisAddress() {
		return gisAddressEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGisAddress_Country() {
		return (EAttribute)gisAddressEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGisAddress_Street() {
		return (EAttribute)gisAddressEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGisAddress_City() {
		return (EAttribute)gisAddressEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGisAddress_BuildingNumber() {
		return (EAttribute)gisAddressEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGisAddress_PostalCode() {
		return (EAttribute)gisAddressEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGisAddress_GeocodedAddresses() {
		return (EReference)gisAddressEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGisAddress_SelectedGeocodedLocation() {
		return (EReference)gisAddressEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGisAddress_Geocoder() {
		return (EReference)gisAddressEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGisAddress__Geocode() {
		return gisAddressEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGisDistanceMatrix() {
		return gisDistanceMatrixEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGisDistanceMatrix_FromLocations() {
		return (EReference)gisDistanceMatrixEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGisDistanceMatrix_ToLocations() {
		return (EReference)gisDistanceMatrixEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGisDistanceMatrix_Calculator() {
		return (EReference)gisDistanceMatrixEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGisDistanceMatrix__Calculate() {
		return gisDistanceMatrixEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGisDistanceMatrix__AddFromLocation__GisCoordinates() {
		return gisDistanceMatrixEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGisDistanceMatrix__AddToLocation__GisCoordinates() {
		return gisDistanceMatrixEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGisDistanceMatrixElement() {
		return gisDistanceMatrixElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGisDistanceMatrixElement_FromLocation() {
		return (EReference)gisDistanceMatrixElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGisDistanceMatrixElement_ToLocation() {
		return (EReference)gisDistanceMatrixElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGisDistanceMatrixElement_Distance() {
		return (EAttribute)gisDistanceMatrixElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGisDistanceMatrixElement_Duration() {
		return (EAttribute)gisDistanceMatrixElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGisDistanceFromLocation() {
		return gisDistanceFromLocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGisDistanceFromLocation_ToLocations() {
		return (EReference)gisDistanceFromLocationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGisDistanceFromLocation_Location() {
		return (EReference)gisDistanceFromLocationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGisDistanceToLocation() {
		return gisDistanceToLocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGisDistanceToLocation_FromLocations() {
		return (EReference)gisDistanceToLocationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGisDistanceToLocation_Location() {
		return (EReference)gisDistanceToLocationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGisAddressGeocoded() {
		return gisAddressGeocodedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGisAddressGeocoded_Score() {
		return (EAttribute)gisAddressGeocodedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGisAddressGeocoded_Description() {
		return (EAttribute)gisAddressGeocodedEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGisLocation() {
		return gisLocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGisLocation__GetCoordinates() {
		return gisLocationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGisAddressGeocoder() {
		return gisAddressGeocoderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGisAddressGeocoder__Geocode__GisAddress() {
		return gisAddressGeocoderEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGisDistanceMatrixCalculator() {
		return gisDistanceMatrixCalculatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGisDistanceMatrixCalculator__Calculate__GisDistanceMatrix() {
		return gisDistanceMatrixCalculatorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GisFactory getGisFactory() {
		return (GisFactory)getEFactoryInstance();
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
		gisCoordinatesEClass = createEClass(GIS_COORDINATES);
		createEAttribute(gisCoordinatesEClass, GIS_COORDINATES__LONGITUDE);
		createEAttribute(gisCoordinatesEClass, GIS_COORDINATES__LATITUDE);

		gisAddressEClass = createEClass(GIS_ADDRESS);
		createEAttribute(gisAddressEClass, GIS_ADDRESS__COUNTRY);
		createEAttribute(gisAddressEClass, GIS_ADDRESS__STREET);
		createEAttribute(gisAddressEClass, GIS_ADDRESS__CITY);
		createEAttribute(gisAddressEClass, GIS_ADDRESS__BUILDING_NUMBER);
		createEAttribute(gisAddressEClass, GIS_ADDRESS__POSTAL_CODE);
		createEReference(gisAddressEClass, GIS_ADDRESS__GEOCODED_ADDRESSES);
		createEReference(gisAddressEClass, GIS_ADDRESS__SELECTED_GEOCODED_LOCATION);
		createEReference(gisAddressEClass, GIS_ADDRESS__GEOCODER);
		createEOperation(gisAddressEClass, GIS_ADDRESS___GEOCODE);

		gisDistanceMatrixEClass = createEClass(GIS_DISTANCE_MATRIX);
		createEReference(gisDistanceMatrixEClass, GIS_DISTANCE_MATRIX__FROM_LOCATIONS);
		createEReference(gisDistanceMatrixEClass, GIS_DISTANCE_MATRIX__TO_LOCATIONS);
		createEReference(gisDistanceMatrixEClass, GIS_DISTANCE_MATRIX__CALCULATOR);
		createEOperation(gisDistanceMatrixEClass, GIS_DISTANCE_MATRIX___CALCULATE);
		createEOperation(gisDistanceMatrixEClass, GIS_DISTANCE_MATRIX___ADD_FROM_LOCATION__GISCOORDINATES);
		createEOperation(gisDistanceMatrixEClass, GIS_DISTANCE_MATRIX___ADD_TO_LOCATION__GISCOORDINATES);

		gisDistanceMatrixElementEClass = createEClass(GIS_DISTANCE_MATRIX_ELEMENT);
		createEReference(gisDistanceMatrixElementEClass, GIS_DISTANCE_MATRIX_ELEMENT__FROM_LOCATION);
		createEReference(gisDistanceMatrixElementEClass, GIS_DISTANCE_MATRIX_ELEMENT__TO_LOCATION);
		createEAttribute(gisDistanceMatrixElementEClass, GIS_DISTANCE_MATRIX_ELEMENT__DISTANCE);
		createEAttribute(gisDistanceMatrixElementEClass, GIS_DISTANCE_MATRIX_ELEMENT__DURATION);

		gisDistanceFromLocationEClass = createEClass(GIS_DISTANCE_FROM_LOCATION);
		createEReference(gisDistanceFromLocationEClass, GIS_DISTANCE_FROM_LOCATION__TO_LOCATIONS);
		createEReference(gisDistanceFromLocationEClass, GIS_DISTANCE_FROM_LOCATION__LOCATION);

		gisDistanceToLocationEClass = createEClass(GIS_DISTANCE_TO_LOCATION);
		createEReference(gisDistanceToLocationEClass, GIS_DISTANCE_TO_LOCATION__FROM_LOCATIONS);
		createEReference(gisDistanceToLocationEClass, GIS_DISTANCE_TO_LOCATION__LOCATION);

		gisAddressGeocodedEClass = createEClass(GIS_ADDRESS_GEOCODED);
		createEAttribute(gisAddressGeocodedEClass, GIS_ADDRESS_GEOCODED__SCORE);
		createEAttribute(gisAddressGeocodedEClass, GIS_ADDRESS_GEOCODED__DESCRIPTION);

		gisLocationEClass = createEClass(GIS_LOCATION);
		createEOperation(gisLocationEClass, GIS_LOCATION___GET_COORDINATES);

		gisAddressGeocoderEClass = createEClass(GIS_ADDRESS_GEOCODER);
		createEOperation(gisAddressGeocoderEClass, GIS_ADDRESS_GEOCODER___GEOCODE__GISADDRESS);

		gisDistanceMatrixCalculatorEClass = createEClass(GIS_DISTANCE_MATRIX_CALCULATOR);
		createEOperation(gisDistanceMatrixCalculatorEClass, GIS_DISTANCE_MATRIX_CALCULATOR___CALCULATE__GISDISTANCEMATRIX);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		gisCoordinatesEClass.getESuperTypes().add(this.getGisLocation());
		gisAddressEClass.getESuperTypes().add(this.getGisLocation());
		gisAddressGeocodedEClass.getESuperTypes().add(this.getGisCoordinates());

		// Initialize classes, features, and operations; add parameters
		initEClass(gisCoordinatesEClass, GisCoordinates.class, "GisCoordinates", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGisCoordinates_Longitude(), ecorePackage.getEFloat(), "Longitude", null, 0, 1, GisCoordinates.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGisCoordinates_Latitude(), ecorePackage.getEFloat(), "Latitude", null, 0, 1, GisCoordinates.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gisAddressEClass, GisAddress.class, "GisAddress", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGisAddress_Country(), ecorePackage.getEString(), "Country", null, 0, 1, GisAddress.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGisAddress_Street(), ecorePackage.getEString(), "Street", null, 0, 1, GisAddress.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGisAddress_City(), ecorePackage.getEString(), "City", null, 0, 1, GisAddress.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGisAddress_BuildingNumber(), ecorePackage.getEString(), "BuildingNumber", null, 0, 1, GisAddress.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGisAddress_PostalCode(), ecorePackage.getEString(), "PostalCode", null, 0, 1, GisAddress.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGisAddress_GeocodedAddresses(), this.getGisAddressGeocoded(), null, "geocodedAddresses", null, 0, -1, GisAddress.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGisAddress_SelectedGeocodedLocation(), this.getGisAddressGeocoded(), null, "selectedGeocodedLocation", null, 0, 1, GisAddress.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGisAddress_Geocoder(), this.getGisAddressGeocoder(), null, "geocoder", null, 0, 1, GisAddress.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getGisAddress__Geocode(), null, "geocode", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(gisDistanceMatrixEClass, GisDistanceMatrix.class, "GisDistanceMatrix", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGisDistanceMatrix_FromLocations(), this.getGisDistanceFromLocation(), null, "fromLocations", null, 0, -1, GisDistanceMatrix.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGisDistanceMatrix_ToLocations(), this.getGisDistanceToLocation(), null, "toLocations", null, 0, -1, GisDistanceMatrix.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGisDistanceMatrix_Calculator(), this.getGisDistanceMatrixCalculator(), null, "calculator", null, 0, 1, GisDistanceMatrix.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getGisDistanceMatrix__Calculate(), null, "calculate", 0, 1, IS_UNIQUE, IS_ORDERED);

		EOperation op = initEOperation(getGisDistanceMatrix__AddFromLocation__GisCoordinates(), null, "addFromLocation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getGisCoordinates(), "location", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getGisDistanceMatrix__AddToLocation__GisCoordinates(), null, "addToLocation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getGisCoordinates(), "location", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(gisDistanceMatrixElementEClass, GisDistanceMatrixElement.class, "GisDistanceMatrixElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGisDistanceMatrixElement_FromLocation(), this.getGisDistanceFromLocation(), this.getGisDistanceFromLocation_ToLocations(), "fromLocation", null, 1, 1, GisDistanceMatrixElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGisDistanceMatrixElement_ToLocation(), this.getGisDistanceToLocation(), this.getGisDistanceToLocation_FromLocations(), "toLocation", null, 1, 1, GisDistanceMatrixElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGisDistanceMatrixElement_Distance(), ecorePackage.getEFloat(), "Distance", null, 0, 1, GisDistanceMatrixElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGisDistanceMatrixElement_Duration(), ecorePackage.getEFloat(), "Duration", null, 0, 1, GisDistanceMatrixElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gisDistanceFromLocationEClass, GisDistanceFromLocation.class, "GisDistanceFromLocation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGisDistanceFromLocation_ToLocations(), this.getGisDistanceMatrixElement(), this.getGisDistanceMatrixElement_FromLocation(), "toLocations", null, 0, -1, GisDistanceFromLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGisDistanceFromLocation_Location(), this.getGisLocation(), null, "location", null, 1, 1, GisDistanceFromLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gisDistanceToLocationEClass, GisDistanceToLocation.class, "GisDistanceToLocation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGisDistanceToLocation_FromLocations(), this.getGisDistanceMatrixElement(), this.getGisDistanceMatrixElement_ToLocation(), "fromLocations", null, 0, -1, GisDistanceToLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGisDistanceToLocation_Location(), this.getGisLocation(), null, "location", null, 1, 1, GisDistanceToLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gisAddressGeocodedEClass, GisAddressGeocoded.class, "GisAddressGeocoded", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGisAddressGeocoded_Score(), ecorePackage.getEFloat(), "Score", null, 0, 1, GisAddressGeocoded.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGisAddressGeocoded_Description(), ecorePackage.getEString(), "Description", null, 0, 1, GisAddressGeocoded.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gisLocationEClass, GisLocation.class, "GisLocation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getGisLocation__GetCoordinates(), this.getGisCoordinates(), "getCoordinates", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(gisAddressGeocoderEClass, GisAddressGeocoder.class, "GisAddressGeocoder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getGisAddressGeocoder__Geocode__GisAddress(), null, "geocode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getGisAddress(), "address", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(gisDistanceMatrixCalculatorEClass, GisDistanceMatrixCalculator.class, "GisDistanceMatrixCalculator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getGisDistanceMatrixCalculator__Calculate__GisDistanceMatrix(), null, "calculate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getGisDistanceMatrix(), "matrix", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //GisPackageImpl
