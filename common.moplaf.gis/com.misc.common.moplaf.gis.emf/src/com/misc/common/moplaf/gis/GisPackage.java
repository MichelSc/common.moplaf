/**
 */
package com.misc.common.moplaf.gis;

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
 * @see com.misc.common.moplaf.gis.GisFactory
 * @model kind="package"
 * @generated
 */
public interface GisPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "gis";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.misc.com/common.moplaf.gis.emf";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "gis";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GisPackage eINSTANCE = com.misc.common.moplaf.gis.impl.GisPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.gis.impl.GisLocationImpl <em>Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.gis.impl.GisLocationImpl
	 * @see com.misc.common.moplaf.gis.impl.GisPackageImpl#getGisLocation()
	 * @generated
	 */
	int GIS_LOCATION = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_LOCATION__NAME = 0;

	/**
	 * The number of structural features of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_LOCATION_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Get Coordinates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_LOCATION___GET_COORDINATES = 0;

	/**
	 * The number of operations of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_LOCATION_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.gis.impl.GisCoordinatesImpl <em>Coordinates</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.gis.impl.GisCoordinatesImpl
	 * @see com.misc.common.moplaf.gis.impl.GisPackageImpl#getGisCoordinates()
	 * @generated
	 */
	int GIS_COORDINATES = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_COORDINATES__NAME = GIS_LOCATION__NAME;

	/**
	 * The feature id for the '<em><b>Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_COORDINATES__LONGITUDE = GIS_LOCATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_COORDINATES__LATITUDE = GIS_LOCATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Coordinates</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_COORDINATES_FEATURE_COUNT = GIS_LOCATION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Coordinates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_COORDINATES___GET_COORDINATES = GIS_LOCATION___GET_COORDINATES;

	/**
	 * The number of operations of the '<em>Coordinates</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_COORDINATES_OPERATION_COUNT = GIS_LOCATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.gis.impl.GisAddressImpl <em>Address</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.gis.impl.GisAddressImpl
	 * @see com.misc.common.moplaf.gis.impl.GisPackageImpl#getGisAddress()
	 * @generated
	 */
	int GIS_ADDRESS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ADDRESS__NAME = GIS_LOCATION__NAME;

	/**
	 * The feature id for the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ADDRESS__COUNTRY = GIS_LOCATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Street</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ADDRESS__STREET = GIS_LOCATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ADDRESS__CITY = GIS_LOCATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Building Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ADDRESS__BUILDING_NUMBER = GIS_LOCATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Postal Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ADDRESS__POSTAL_CODE = GIS_LOCATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Geocoded Addresses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ADDRESS__GEOCODED_ADDRESSES = GIS_LOCATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Selected Geocoded Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ADDRESS__SELECTED_GEOCODED_LOCATION = GIS_LOCATION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Geocoder</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ADDRESS__GEOCODER = GIS_LOCATION_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Address</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ADDRESS_FEATURE_COUNT = GIS_LOCATION_FEATURE_COUNT + 8;

	/**
	 * The operation id for the '<em>Get Coordinates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ADDRESS___GET_COORDINATES = GIS_LOCATION___GET_COORDINATES;

	/**
	 * The operation id for the '<em>Geocode</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ADDRESS___GEOCODE = GIS_LOCATION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Address</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ADDRESS_OPERATION_COUNT = GIS_LOCATION_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.gis.impl.GisDistanceMatrixImpl <em>Distance Matrix</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.gis.impl.GisDistanceMatrixImpl
	 * @see com.misc.common.moplaf.gis.impl.GisPackageImpl#getGisDistanceMatrix()
	 * @generated
	 */
	int GIS_DISTANCE_MATRIX = 2;

	/**
	 * The feature id for the '<em><b>From Locations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_DISTANCE_MATRIX__FROM_LOCATIONS = 0;

	/**
	 * The feature id for the '<em><b>To Locations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_DISTANCE_MATRIX__TO_LOCATIONS = 1;

	/**
	 * The feature id for the '<em><b>Calculator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_DISTANCE_MATRIX__CALCULATOR = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_DISTANCE_MATRIX__NAME = 3;

	/**
	 * The number of structural features of the '<em>Distance Matrix</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_DISTANCE_MATRIX_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Calculate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_DISTANCE_MATRIX___CALCULATE = 0;

	/**
	 * The operation id for the '<em>Add From Location</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_DISTANCE_MATRIX___ADD_FROM_LOCATION__GISCOORDINATES = 1;

	/**
	 * The operation id for the '<em>Add To Location</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_DISTANCE_MATRIX___ADD_TO_LOCATION__GISCOORDINATES = 2;

	/**
	 * The number of operations of the '<em>Distance Matrix</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_DISTANCE_MATRIX_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.gis.impl.GisDistanceMatrixElementImpl <em>Distance Matrix Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.gis.impl.GisDistanceMatrixElementImpl
	 * @see com.misc.common.moplaf.gis.impl.GisPackageImpl#getGisDistanceMatrixElement()
	 * @generated
	 */
	int GIS_DISTANCE_MATRIX_ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>From Location</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_DISTANCE_MATRIX_ELEMENT__FROM_LOCATION = 0;

	/**
	 * The feature id for the '<em><b>To Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_DISTANCE_MATRIX_ELEMENT__TO_LOCATION = 1;

	/**
	 * The feature id for the '<em><b>Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_DISTANCE_MATRIX_ELEMENT__DISTANCE = 2;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_DISTANCE_MATRIX_ELEMENT__DURATION = 3;

	/**
	 * The number of structural features of the '<em>Distance Matrix Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_DISTANCE_MATRIX_ELEMENT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Distance Matrix Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_DISTANCE_MATRIX_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.gis.impl.GisDistanceFromLocationImpl <em>Distance From Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.gis.impl.GisDistanceFromLocationImpl
	 * @see com.misc.common.moplaf.gis.impl.GisPackageImpl#getGisDistanceFromLocation()
	 * @generated
	 */
	int GIS_DISTANCE_FROM_LOCATION = 4;

	/**
	 * The feature id for the '<em><b>To Locations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_DISTANCE_FROM_LOCATION__TO_LOCATIONS = 0;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_DISTANCE_FROM_LOCATION__LOCATION = 1;

	/**
	 * The number of structural features of the '<em>Distance From Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_DISTANCE_FROM_LOCATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Distance From Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_DISTANCE_FROM_LOCATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.gis.impl.GisDistanceToLocationImpl <em>Distance To Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.gis.impl.GisDistanceToLocationImpl
	 * @see com.misc.common.moplaf.gis.impl.GisPackageImpl#getGisDistanceToLocation()
	 * @generated
	 */
	int GIS_DISTANCE_TO_LOCATION = 5;

	/**
	 * The feature id for the '<em><b>From Locations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_DISTANCE_TO_LOCATION__FROM_LOCATIONS = 0;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_DISTANCE_TO_LOCATION__LOCATION = 1;

	/**
	 * The number of structural features of the '<em>Distance To Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_DISTANCE_TO_LOCATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Distance To Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_DISTANCE_TO_LOCATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.gis.impl.GisAddressGeocodedImpl <em>Address Geocoded</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.gis.impl.GisAddressGeocodedImpl
	 * @see com.misc.common.moplaf.gis.impl.GisPackageImpl#getGisAddressGeocoded()
	 * @generated
	 */
	int GIS_ADDRESS_GEOCODED = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ADDRESS_GEOCODED__NAME = GIS_COORDINATES__NAME;

	/**
	 * The feature id for the '<em><b>Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ADDRESS_GEOCODED__LONGITUDE = GIS_COORDINATES__LONGITUDE;

	/**
	 * The feature id for the '<em><b>Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ADDRESS_GEOCODED__LATITUDE = GIS_COORDINATES__LATITUDE;

	/**
	 * The feature id for the '<em><b>Score</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ADDRESS_GEOCODED__SCORE = GIS_COORDINATES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ADDRESS_GEOCODED__DESCRIPTION = GIS_COORDINATES_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Address Geocoded</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ADDRESS_GEOCODED_FEATURE_COUNT = GIS_COORDINATES_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Coordinates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ADDRESS_GEOCODED___GET_COORDINATES = GIS_COORDINATES___GET_COORDINATES;

	/**
	 * The number of operations of the '<em>Address Geocoded</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ADDRESS_GEOCODED_OPERATION_COUNT = GIS_COORDINATES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.gis.impl.GisAddressGeocoderImpl <em>Address Geocoder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.gis.impl.GisAddressGeocoderImpl
	 * @see com.misc.common.moplaf.gis.impl.GisPackageImpl#getGisAddressGeocoder()
	 * @generated
	 */
	int GIS_ADDRESS_GEOCODER = 8;

	/**
	 * The number of structural features of the '<em>Address Geocoder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ADDRESS_GEOCODER_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Geocode</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ADDRESS_GEOCODER___GEOCODE__GISADDRESS = 0;

	/**
	 * The number of operations of the '<em>Address Geocoder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ADDRESS_GEOCODER_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.gis.impl.GisDistanceMatrixCalculatorImpl <em>Distance Matrix Calculator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.gis.impl.GisDistanceMatrixCalculatorImpl
	 * @see com.misc.common.moplaf.gis.impl.GisPackageImpl#getGisDistanceMatrixCalculator()
	 * @generated
	 */
	int GIS_DISTANCE_MATRIX_CALCULATOR = 9;

	/**
	 * The number of structural features of the '<em>Distance Matrix Calculator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_DISTANCE_MATRIX_CALCULATOR_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Calculate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_DISTANCE_MATRIX_CALCULATOR___CALCULATE__GISDISTANCEMATRIX = 0;

	/**
	 * The number of operations of the '<em>Distance Matrix Calculator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_DISTANCE_MATRIX_CALCULATOR_OPERATION_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.gis.GisCoordinates <em>Coordinates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coordinates</em>'.
	 * @see com.misc.common.moplaf.gis.GisCoordinates
	 * @generated
	 */
	EClass getGisCoordinates();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.gis.GisCoordinates#getLongitude <em>Longitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Longitude</em>'.
	 * @see com.misc.common.moplaf.gis.GisCoordinates#getLongitude()
	 * @see #getGisCoordinates()
	 * @generated
	 */
	EAttribute getGisCoordinates_Longitude();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.gis.GisCoordinates#getLatitude <em>Latitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Latitude</em>'.
	 * @see com.misc.common.moplaf.gis.GisCoordinates#getLatitude()
	 * @see #getGisCoordinates()
	 * @generated
	 */
	EAttribute getGisCoordinates_Latitude();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.gis.GisAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Address</em>'.
	 * @see com.misc.common.moplaf.gis.GisAddress
	 * @generated
	 */
	EClass getGisAddress();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.gis.GisAddress#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Country</em>'.
	 * @see com.misc.common.moplaf.gis.GisAddress#getCountry()
	 * @see #getGisAddress()
	 * @generated
	 */
	EAttribute getGisAddress_Country();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.gis.GisAddress#getStreet <em>Street</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Street</em>'.
	 * @see com.misc.common.moplaf.gis.GisAddress#getStreet()
	 * @see #getGisAddress()
	 * @generated
	 */
	EAttribute getGisAddress_Street();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.gis.GisAddress#getCity <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>City</em>'.
	 * @see com.misc.common.moplaf.gis.GisAddress#getCity()
	 * @see #getGisAddress()
	 * @generated
	 */
	EAttribute getGisAddress_City();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.gis.GisAddress#getBuildingNumber <em>Building Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Building Number</em>'.
	 * @see com.misc.common.moplaf.gis.GisAddress#getBuildingNumber()
	 * @see #getGisAddress()
	 * @generated
	 */
	EAttribute getGisAddress_BuildingNumber();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.gis.GisAddress#getPostalCode <em>Postal Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Postal Code</em>'.
	 * @see com.misc.common.moplaf.gis.GisAddress#getPostalCode()
	 * @see #getGisAddress()
	 * @generated
	 */
	EAttribute getGisAddress_PostalCode();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.common.moplaf.gis.GisAddress#getGeocodedAddresses <em>Geocoded Addresses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Geocoded Addresses</em>'.
	 * @see com.misc.common.moplaf.gis.GisAddress#getGeocodedAddresses()
	 * @see #getGisAddress()
	 * @generated
	 */
	EReference getGisAddress_GeocodedAddresses();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.gis.GisAddress#getSelectedGeocodedLocation <em>Selected Geocoded Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Selected Geocoded Location</em>'.
	 * @see com.misc.common.moplaf.gis.GisAddress#getSelectedGeocodedLocation()
	 * @see #getGisAddress()
	 * @generated
	 */
	EReference getGisAddress_SelectedGeocodedLocation();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.gis.GisAddress#getGeocoder <em>Geocoder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Geocoder</em>'.
	 * @see com.misc.common.moplaf.gis.GisAddress#getGeocoder()
	 * @see #getGisAddress()
	 * @generated
	 */
	EReference getGisAddress_Geocoder();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.gis.GisAddress#geocode() <em>Geocode</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Geocode</em>' operation.
	 * @see com.misc.common.moplaf.gis.GisAddress#geocode()
	 * @generated
	 */
	EOperation getGisAddress__Geocode();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.gis.GisDistanceMatrix <em>Distance Matrix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Distance Matrix</em>'.
	 * @see com.misc.common.moplaf.gis.GisDistanceMatrix
	 * @generated
	 */
	EClass getGisDistanceMatrix();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.common.moplaf.gis.GisDistanceMatrix#getFromLocations <em>From Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>From Locations</em>'.
	 * @see com.misc.common.moplaf.gis.GisDistanceMatrix#getFromLocations()
	 * @see #getGisDistanceMatrix()
	 * @generated
	 */
	EReference getGisDistanceMatrix_FromLocations();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.common.moplaf.gis.GisDistanceMatrix#getToLocations <em>To Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>To Locations</em>'.
	 * @see com.misc.common.moplaf.gis.GisDistanceMatrix#getToLocations()
	 * @see #getGisDistanceMatrix()
	 * @generated
	 */
	EReference getGisDistanceMatrix_ToLocations();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.gis.GisDistanceMatrix#getCalculator <em>Calculator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Calculator</em>'.
	 * @see com.misc.common.moplaf.gis.GisDistanceMatrix#getCalculator()
	 * @see #getGisDistanceMatrix()
	 * @generated
	 */
	EReference getGisDistanceMatrix_Calculator();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.gis.GisDistanceMatrix#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.misc.common.moplaf.gis.GisDistanceMatrix#getName()
	 * @see #getGisDistanceMatrix()
	 * @generated
	 */
	EAttribute getGisDistanceMatrix_Name();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.gis.GisDistanceMatrix#calculate() <em>Calculate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate</em>' operation.
	 * @see com.misc.common.moplaf.gis.GisDistanceMatrix#calculate()
	 * @generated
	 */
	EOperation getGisDistanceMatrix__Calculate();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.gis.GisDistanceMatrix#addFromLocation(com.misc.common.moplaf.gis.GisCoordinates) <em>Add From Location</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add From Location</em>' operation.
	 * @see com.misc.common.moplaf.gis.GisDistanceMatrix#addFromLocation(com.misc.common.moplaf.gis.GisCoordinates)
	 * @generated
	 */
	EOperation getGisDistanceMatrix__AddFromLocation__GisCoordinates();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.gis.GisDistanceMatrix#addToLocation(com.misc.common.moplaf.gis.GisCoordinates) <em>Add To Location</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add To Location</em>' operation.
	 * @see com.misc.common.moplaf.gis.GisDistanceMatrix#addToLocation(com.misc.common.moplaf.gis.GisCoordinates)
	 * @generated
	 */
	EOperation getGisDistanceMatrix__AddToLocation__GisCoordinates();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.gis.GisDistanceMatrixElement <em>Distance Matrix Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Distance Matrix Element</em>'.
	 * @see com.misc.common.moplaf.gis.GisDistanceMatrixElement
	 * @generated
	 */
	EClass getGisDistanceMatrixElement();

	/**
	 * Returns the meta object for the container reference '{@link com.misc.common.moplaf.gis.GisDistanceMatrixElement#getFromLocation <em>From Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>From Location</em>'.
	 * @see com.misc.common.moplaf.gis.GisDistanceMatrixElement#getFromLocation()
	 * @see #getGisDistanceMatrixElement()
	 * @generated
	 */
	EReference getGisDistanceMatrixElement_FromLocation();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.gis.GisDistanceMatrixElement#getToLocation <em>To Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To Location</em>'.
	 * @see com.misc.common.moplaf.gis.GisDistanceMatrixElement#getToLocation()
	 * @see #getGisDistanceMatrixElement()
	 * @generated
	 */
	EReference getGisDistanceMatrixElement_ToLocation();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.gis.GisDistanceMatrixElement#getDistance <em>Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Distance</em>'.
	 * @see com.misc.common.moplaf.gis.GisDistanceMatrixElement#getDistance()
	 * @see #getGisDistanceMatrixElement()
	 * @generated
	 */
	EAttribute getGisDistanceMatrixElement_Distance();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.gis.GisDistanceMatrixElement#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see com.misc.common.moplaf.gis.GisDistanceMatrixElement#getDuration()
	 * @see #getGisDistanceMatrixElement()
	 * @generated
	 */
	EAttribute getGisDistanceMatrixElement_Duration();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.gis.GisDistanceFromLocation <em>Distance From Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Distance From Location</em>'.
	 * @see com.misc.common.moplaf.gis.GisDistanceFromLocation
	 * @generated
	 */
	EClass getGisDistanceFromLocation();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.common.moplaf.gis.GisDistanceFromLocation#getToLocations <em>To Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>To Locations</em>'.
	 * @see com.misc.common.moplaf.gis.GisDistanceFromLocation#getToLocations()
	 * @see #getGisDistanceFromLocation()
	 * @generated
	 */
	EReference getGisDistanceFromLocation_ToLocations();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.gis.GisDistanceFromLocation#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Location</em>'.
	 * @see com.misc.common.moplaf.gis.GisDistanceFromLocation#getLocation()
	 * @see #getGisDistanceFromLocation()
	 * @generated
	 */
	EReference getGisDistanceFromLocation_Location();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.gis.GisDistanceToLocation <em>Distance To Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Distance To Location</em>'.
	 * @see com.misc.common.moplaf.gis.GisDistanceToLocation
	 * @generated
	 */
	EClass getGisDistanceToLocation();

	/**
	 * Returns the meta object for the reference list '{@link com.misc.common.moplaf.gis.GisDistanceToLocation#getFromLocations <em>From Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>From Locations</em>'.
	 * @see com.misc.common.moplaf.gis.GisDistanceToLocation#getFromLocations()
	 * @see #getGisDistanceToLocation()
	 * @generated
	 */
	EReference getGisDistanceToLocation_FromLocations();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.gis.GisDistanceToLocation#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Location</em>'.
	 * @see com.misc.common.moplaf.gis.GisDistanceToLocation#getLocation()
	 * @see #getGisDistanceToLocation()
	 * @generated
	 */
	EReference getGisDistanceToLocation_Location();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.gis.GisAddressGeocoded <em>Address Geocoded</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Address Geocoded</em>'.
	 * @see com.misc.common.moplaf.gis.GisAddressGeocoded
	 * @generated
	 */
	EClass getGisAddressGeocoded();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.gis.GisAddressGeocoded#getScore <em>Score</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Score</em>'.
	 * @see com.misc.common.moplaf.gis.GisAddressGeocoded#getScore()
	 * @see #getGisAddressGeocoded()
	 * @generated
	 */
	EAttribute getGisAddressGeocoded_Score();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.gis.GisAddressGeocoded#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see com.misc.common.moplaf.gis.GisAddressGeocoded#getDescription()
	 * @see #getGisAddressGeocoded()
	 * @generated
	 */
	EAttribute getGisAddressGeocoded_Description();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.gis.GisLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location</em>'.
	 * @see com.misc.common.moplaf.gis.GisLocation
	 * @generated
	 */
	EClass getGisLocation();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.gis.GisLocation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.misc.common.moplaf.gis.GisLocation#getName()
	 * @see #getGisLocation()
	 * @generated
	 */
	EAttribute getGisLocation_Name();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.gis.GisLocation#getCoordinates() <em>Get Coordinates</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Coordinates</em>' operation.
	 * @see com.misc.common.moplaf.gis.GisLocation#getCoordinates()
	 * @generated
	 */
	EOperation getGisLocation__GetCoordinates();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.gis.GisAddressGeocoder <em>Address Geocoder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Address Geocoder</em>'.
	 * @see com.misc.common.moplaf.gis.GisAddressGeocoder
	 * @generated
	 */
	EClass getGisAddressGeocoder();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.gis.GisAddressGeocoder#geocode(com.misc.common.moplaf.gis.GisAddress) <em>Geocode</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Geocode</em>' operation.
	 * @see com.misc.common.moplaf.gis.GisAddressGeocoder#geocode(com.misc.common.moplaf.gis.GisAddress)
	 * @generated
	 */
	EOperation getGisAddressGeocoder__Geocode__GisAddress();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.gis.GisDistanceMatrixCalculator <em>Distance Matrix Calculator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Distance Matrix Calculator</em>'.
	 * @see com.misc.common.moplaf.gis.GisDistanceMatrixCalculator
	 * @generated
	 */
	EClass getGisDistanceMatrixCalculator();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.gis.GisDistanceMatrixCalculator#calculate(com.misc.common.moplaf.gis.GisDistanceMatrix) <em>Calculate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate</em>' operation.
	 * @see com.misc.common.moplaf.gis.GisDistanceMatrixCalculator#calculate(com.misc.common.moplaf.gis.GisDistanceMatrix)
	 * @generated
	 */
	EOperation getGisDistanceMatrixCalculator__Calculate__GisDistanceMatrix();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GisFactory getGisFactory();

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
		 * The meta object literal for the '{@link com.misc.common.moplaf.gis.impl.GisCoordinatesImpl <em>Coordinates</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.gis.impl.GisCoordinatesImpl
		 * @see com.misc.common.moplaf.gis.impl.GisPackageImpl#getGisCoordinates()
		 * @generated
		 */
		EClass GIS_COORDINATES = eINSTANCE.getGisCoordinates();

		/**
		 * The meta object literal for the '<em><b>Longitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GIS_COORDINATES__LONGITUDE = eINSTANCE.getGisCoordinates_Longitude();

		/**
		 * The meta object literal for the '<em><b>Latitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GIS_COORDINATES__LATITUDE = eINSTANCE.getGisCoordinates_Latitude();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.gis.impl.GisAddressImpl <em>Address</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.gis.impl.GisAddressImpl
		 * @see com.misc.common.moplaf.gis.impl.GisPackageImpl#getGisAddress()
		 * @generated
		 */
		EClass GIS_ADDRESS = eINSTANCE.getGisAddress();

		/**
		 * The meta object literal for the '<em><b>Country</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GIS_ADDRESS__COUNTRY = eINSTANCE.getGisAddress_Country();

		/**
		 * The meta object literal for the '<em><b>Street</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GIS_ADDRESS__STREET = eINSTANCE.getGisAddress_Street();

		/**
		 * The meta object literal for the '<em><b>City</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GIS_ADDRESS__CITY = eINSTANCE.getGisAddress_City();

		/**
		 * The meta object literal for the '<em><b>Building Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GIS_ADDRESS__BUILDING_NUMBER = eINSTANCE.getGisAddress_BuildingNumber();

		/**
		 * The meta object literal for the '<em><b>Postal Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GIS_ADDRESS__POSTAL_CODE = eINSTANCE.getGisAddress_PostalCode();

		/**
		 * The meta object literal for the '<em><b>Geocoded Addresses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GIS_ADDRESS__GEOCODED_ADDRESSES = eINSTANCE.getGisAddress_GeocodedAddresses();

		/**
		 * The meta object literal for the '<em><b>Selected Geocoded Location</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GIS_ADDRESS__SELECTED_GEOCODED_LOCATION = eINSTANCE.getGisAddress_SelectedGeocodedLocation();

		/**
		 * The meta object literal for the '<em><b>Geocoder</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GIS_ADDRESS__GEOCODER = eINSTANCE.getGisAddress_Geocoder();

		/**
		 * The meta object literal for the '<em><b>Geocode</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GIS_ADDRESS___GEOCODE = eINSTANCE.getGisAddress__Geocode();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.gis.impl.GisDistanceMatrixImpl <em>Distance Matrix</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.gis.impl.GisDistanceMatrixImpl
		 * @see com.misc.common.moplaf.gis.impl.GisPackageImpl#getGisDistanceMatrix()
		 * @generated
		 */
		EClass GIS_DISTANCE_MATRIX = eINSTANCE.getGisDistanceMatrix();

		/**
		 * The meta object literal for the '<em><b>From Locations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GIS_DISTANCE_MATRIX__FROM_LOCATIONS = eINSTANCE.getGisDistanceMatrix_FromLocations();

		/**
		 * The meta object literal for the '<em><b>To Locations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GIS_DISTANCE_MATRIX__TO_LOCATIONS = eINSTANCE.getGisDistanceMatrix_ToLocations();

		/**
		 * The meta object literal for the '<em><b>Calculator</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GIS_DISTANCE_MATRIX__CALCULATOR = eINSTANCE.getGisDistanceMatrix_Calculator();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GIS_DISTANCE_MATRIX__NAME = eINSTANCE.getGisDistanceMatrix_Name();

		/**
		 * The meta object literal for the '<em><b>Calculate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GIS_DISTANCE_MATRIX___CALCULATE = eINSTANCE.getGisDistanceMatrix__Calculate();

		/**
		 * The meta object literal for the '<em><b>Add From Location</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GIS_DISTANCE_MATRIX___ADD_FROM_LOCATION__GISCOORDINATES = eINSTANCE.getGisDistanceMatrix__AddFromLocation__GisCoordinates();

		/**
		 * The meta object literal for the '<em><b>Add To Location</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GIS_DISTANCE_MATRIX___ADD_TO_LOCATION__GISCOORDINATES = eINSTANCE.getGisDistanceMatrix__AddToLocation__GisCoordinates();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.gis.impl.GisDistanceMatrixElementImpl <em>Distance Matrix Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.gis.impl.GisDistanceMatrixElementImpl
		 * @see com.misc.common.moplaf.gis.impl.GisPackageImpl#getGisDistanceMatrixElement()
		 * @generated
		 */
		EClass GIS_DISTANCE_MATRIX_ELEMENT = eINSTANCE.getGisDistanceMatrixElement();

		/**
		 * The meta object literal for the '<em><b>From Location</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GIS_DISTANCE_MATRIX_ELEMENT__FROM_LOCATION = eINSTANCE.getGisDistanceMatrixElement_FromLocation();

		/**
		 * The meta object literal for the '<em><b>To Location</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GIS_DISTANCE_MATRIX_ELEMENT__TO_LOCATION = eINSTANCE.getGisDistanceMatrixElement_ToLocation();

		/**
		 * The meta object literal for the '<em><b>Distance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GIS_DISTANCE_MATRIX_ELEMENT__DISTANCE = eINSTANCE.getGisDistanceMatrixElement_Distance();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GIS_DISTANCE_MATRIX_ELEMENT__DURATION = eINSTANCE.getGisDistanceMatrixElement_Duration();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.gis.impl.GisDistanceFromLocationImpl <em>Distance From Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.gis.impl.GisDistanceFromLocationImpl
		 * @see com.misc.common.moplaf.gis.impl.GisPackageImpl#getGisDistanceFromLocation()
		 * @generated
		 */
		EClass GIS_DISTANCE_FROM_LOCATION = eINSTANCE.getGisDistanceFromLocation();

		/**
		 * The meta object literal for the '<em><b>To Locations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GIS_DISTANCE_FROM_LOCATION__TO_LOCATIONS = eINSTANCE.getGisDistanceFromLocation_ToLocations();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GIS_DISTANCE_FROM_LOCATION__LOCATION = eINSTANCE.getGisDistanceFromLocation_Location();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.gis.impl.GisDistanceToLocationImpl <em>Distance To Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.gis.impl.GisDistanceToLocationImpl
		 * @see com.misc.common.moplaf.gis.impl.GisPackageImpl#getGisDistanceToLocation()
		 * @generated
		 */
		EClass GIS_DISTANCE_TO_LOCATION = eINSTANCE.getGisDistanceToLocation();

		/**
		 * The meta object literal for the '<em><b>From Locations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GIS_DISTANCE_TO_LOCATION__FROM_LOCATIONS = eINSTANCE.getGisDistanceToLocation_FromLocations();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GIS_DISTANCE_TO_LOCATION__LOCATION = eINSTANCE.getGisDistanceToLocation_Location();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.gis.impl.GisAddressGeocodedImpl <em>Address Geocoded</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.gis.impl.GisAddressGeocodedImpl
		 * @see com.misc.common.moplaf.gis.impl.GisPackageImpl#getGisAddressGeocoded()
		 * @generated
		 */
		EClass GIS_ADDRESS_GEOCODED = eINSTANCE.getGisAddressGeocoded();

		/**
		 * The meta object literal for the '<em><b>Score</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GIS_ADDRESS_GEOCODED__SCORE = eINSTANCE.getGisAddressGeocoded_Score();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GIS_ADDRESS_GEOCODED__DESCRIPTION = eINSTANCE.getGisAddressGeocoded_Description();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.gis.impl.GisLocationImpl <em>Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.gis.impl.GisLocationImpl
		 * @see com.misc.common.moplaf.gis.impl.GisPackageImpl#getGisLocation()
		 * @generated
		 */
		EClass GIS_LOCATION = eINSTANCE.getGisLocation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GIS_LOCATION__NAME = eINSTANCE.getGisLocation_Name();

		/**
		 * The meta object literal for the '<em><b>Get Coordinates</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GIS_LOCATION___GET_COORDINATES = eINSTANCE.getGisLocation__GetCoordinates();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.gis.impl.GisAddressGeocoderImpl <em>Address Geocoder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.gis.impl.GisAddressGeocoderImpl
		 * @see com.misc.common.moplaf.gis.impl.GisPackageImpl#getGisAddressGeocoder()
		 * @generated
		 */
		EClass GIS_ADDRESS_GEOCODER = eINSTANCE.getGisAddressGeocoder();

		/**
		 * The meta object literal for the '<em><b>Geocode</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GIS_ADDRESS_GEOCODER___GEOCODE__GISADDRESS = eINSTANCE.getGisAddressGeocoder__Geocode__GisAddress();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.gis.impl.GisDistanceMatrixCalculatorImpl <em>Distance Matrix Calculator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.gis.impl.GisDistanceMatrixCalculatorImpl
		 * @see com.misc.common.moplaf.gis.impl.GisPackageImpl#getGisDistanceMatrixCalculator()
		 * @generated
		 */
		EClass GIS_DISTANCE_MATRIX_CALCULATOR = eINSTANCE.getGisDistanceMatrixCalculator();

		/**
		 * The meta object literal for the '<em><b>Calculate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GIS_DISTANCE_MATRIX_CALCULATOR___CALCULATE__GISDISTANCEMATRIX = eINSTANCE.getGisDistanceMatrixCalculator__Calculate__GisDistanceMatrix();

	}

} //GisPackage
