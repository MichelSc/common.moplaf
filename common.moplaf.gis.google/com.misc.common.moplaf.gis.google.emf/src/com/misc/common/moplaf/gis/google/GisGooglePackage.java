/**
 */
package com.misc.common.moplaf.gis.google;

import com.misc.common.moplaf.gis.GisPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

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
 * @see com.misc.common.moplaf.gis.google.GisGoogleFactory
 * @model kind="package"
 * @generated
 */
public interface GisGooglePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "google";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.misc.com/common.moplaf.gisgoogle.emf";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "gisg";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GisGooglePackage eINSTANCE = com.misc.common.moplaf.gis.google.impl.GisGooglePackageImpl.init();

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.gis.google.impl.GisDistanceMatrixCalculatorGoogleWSImpl <em>Gis Distance Matrix Calculator Google WS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.gis.google.impl.GisDistanceMatrixCalculatorGoogleWSImpl
	 * @see com.misc.common.moplaf.gis.google.impl.GisGooglePackageImpl#getGisDistanceMatrixCalculatorGoogleWS()
	 * @generated
	 */
	int GIS_DISTANCE_MATRIX_CALCULATOR_GOOGLE_WS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_DISTANCE_MATRIX_CALCULATOR_GOOGLE_WS__NAME = GisPackage.GIS_ROUTE_CALCULATOR_MANY_TO_MANY__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_DISTANCE_MATRIX_CALCULATOR_GOOGLE_WS__DESCRIPTION = GisPackage.GIS_ROUTE_CALCULATOR_MANY_TO_MANY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_DISTANCE_MATRIX_CALCULATOR_GOOGLE_WS__PROTOCOL = GisPackage.GIS_ROUTE_CALCULATOR_MANY_TO_MANY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_DISTANCE_MATRIX_CALCULATOR_GOOGLE_WS__PORT = GisPackage.GIS_ROUTE_CALCULATOR_MANY_TO_MANY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_DISTANCE_MATRIX_CALCULATOR_GOOGLE_WS__HOST = GisPackage.GIS_ROUTE_CALCULATOR_MANY_TO_MANY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_DISTANCE_MATRIX_CALCULATOR_GOOGLE_WS__PATH = GisPackage.GIS_ROUTE_CALCULATOR_MANY_TO_MANY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_DISTANCE_MATRIX_CALCULATOR_GOOGLE_WS__KEY = GisPackage.GIS_ROUTE_CALCULATOR_MANY_TO_MANY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Avoid Tolls</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_DISTANCE_MATRIX_CALCULATOR_GOOGLE_WS__AVOID_TOLLS = GisPackage.GIS_ROUTE_CALCULATOR_MANY_TO_MANY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Avoid Ferries</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_DISTANCE_MATRIX_CALCULATOR_GOOGLE_WS__AVOID_FERRIES = GisPackage.GIS_ROUTE_CALCULATOR_MANY_TO_MANY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Avoid Highways</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_DISTANCE_MATRIX_CALCULATOR_GOOGLE_WS__AVOID_HIGHWAYS = GisPackage.GIS_ROUTE_CALCULATOR_MANY_TO_MANY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Travel Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_DISTANCE_MATRIX_CALCULATOR_GOOGLE_WS__TRAVEL_MODEL = GisPackage.GIS_ROUTE_CALCULATOR_MANY_TO_MANY_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Gis Distance Matrix Calculator Google WS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_DISTANCE_MATRIX_CALCULATOR_GOOGLE_WS_FEATURE_COUNT = GisPackage.GIS_ROUTE_CALCULATOR_MANY_TO_MANY_FEATURE_COUNT + 9;

	/**
	 * The operation id for the '<em>Get Route</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_DISTANCE_MATRIX_CALCULATOR_GOOGLE_WS___GET_ROUTE__GISLOCATION_GISLOCATION = GisPackage.GIS_ROUTE_CALCULATOR_MANY_TO_MANY___GET_ROUTE__GISLOCATION_GISLOCATION;

	/**
	 * The operation id for the '<em>Get Routes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_DISTANCE_MATRIX_CALCULATOR_GOOGLE_WS___GET_ROUTES__ELIST_ELIST = GisPackage.GIS_ROUTE_CALCULATOR_MANY_TO_MANY___GET_ROUTES__ELIST_ELIST;

	/**
	 * The number of operations of the '<em>Gis Distance Matrix Calculator Google WS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_DISTANCE_MATRIX_CALCULATOR_GOOGLE_WS_OPERATION_COUNT = GisPackage.GIS_ROUTE_CALCULATOR_MANY_TO_MANY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.gis.google.impl.GisAddressGeocoderGoogleWSImpl <em>Gis Address Geocoder Google WS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.gis.google.impl.GisAddressGeocoderGoogleWSImpl
	 * @see com.misc.common.moplaf.gis.google.impl.GisGooglePackageImpl#getGisAddressGeocoderGoogleWS()
	 * @generated
	 */
	int GIS_ADDRESS_GEOCODER_GOOGLE_WS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ADDRESS_GEOCODER_GOOGLE_WS__NAME = GisPackage.GIS_ADDRESS_GEOCODER__NAME;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ADDRESS_GEOCODER_GOOGLE_WS__PROTOCOL = GisPackage.GIS_ADDRESS_GEOCODER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ADDRESS_GEOCODER_GOOGLE_WS__PORT = GisPackage.GIS_ADDRESS_GEOCODER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ADDRESS_GEOCODER_GOOGLE_WS__HOST = GisPackage.GIS_ADDRESS_GEOCODER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ADDRESS_GEOCODER_GOOGLE_WS__PATH = GisPackage.GIS_ADDRESS_GEOCODER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ADDRESS_GEOCODER_GOOGLE_WS__KEY = GisPackage.GIS_ADDRESS_GEOCODER_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Gis Address Geocoder Google WS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ADDRESS_GEOCODER_GOOGLE_WS_FEATURE_COUNT = GisPackage.GIS_ADDRESS_GEOCODER_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Geocode</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ADDRESS_GEOCODER_GOOGLE_WS___GEOCODE__GISADDRESS = GisPackage.GIS_ADDRESS_GEOCODER___GEOCODE__GISADDRESS;

	/**
	 * The number of operations of the '<em>Gis Address Geocoder Google WS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ADDRESS_GEOCODER_GOOGLE_WS_OPERATION_COUNT = GisPackage.GIS_ADDRESS_GEOCODER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.gis.google.Protocol <em>Protocol</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.gis.google.Protocol
	 * @see com.misc.common.moplaf.gis.google.impl.GisGooglePackageImpl#getProtocol()
	 * @generated
	 */
	int PROTOCOL = 2;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.gis.google.TravelMode <em>Travel Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.gis.google.TravelMode
	 * @see com.misc.common.moplaf.gis.google.impl.GisGooglePackageImpl#getTravelMode()
	 * @generated
	 */
	int TRAVEL_MODE = 3;


	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.gis.google.GisDistanceMatrixCalculatorGoogleWS <em>Gis Distance Matrix Calculator Google WS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gis Distance Matrix Calculator Google WS</em>'.
	 * @see com.misc.common.moplaf.gis.google.GisDistanceMatrixCalculatorGoogleWS
	 * @generated
	 */
	EClass getGisDistanceMatrixCalculatorGoogleWS();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.gis.google.GisDistanceMatrixCalculatorGoogleWS#getProtocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Protocol</em>'.
	 * @see com.misc.common.moplaf.gis.google.GisDistanceMatrixCalculatorGoogleWS#getProtocol()
	 * @see #getGisDistanceMatrixCalculatorGoogleWS()
	 * @generated
	 */
	EAttribute getGisDistanceMatrixCalculatorGoogleWS_Protocol();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.gis.google.GisDistanceMatrixCalculatorGoogleWS#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see com.misc.common.moplaf.gis.google.GisDistanceMatrixCalculatorGoogleWS#getPort()
	 * @see #getGisDistanceMatrixCalculatorGoogleWS()
	 * @generated
	 */
	EAttribute getGisDistanceMatrixCalculatorGoogleWS_Port();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.gis.google.GisDistanceMatrixCalculatorGoogleWS#getHost <em>Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host</em>'.
	 * @see com.misc.common.moplaf.gis.google.GisDistanceMatrixCalculatorGoogleWS#getHost()
	 * @see #getGisDistanceMatrixCalculatorGoogleWS()
	 * @generated
	 */
	EAttribute getGisDistanceMatrixCalculatorGoogleWS_Host();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.gis.google.GisDistanceMatrixCalculatorGoogleWS#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see com.misc.common.moplaf.gis.google.GisDistanceMatrixCalculatorGoogleWS#getPath()
	 * @see #getGisDistanceMatrixCalculatorGoogleWS()
	 * @generated
	 */
	EAttribute getGisDistanceMatrixCalculatorGoogleWS_Path();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.gis.google.GisDistanceMatrixCalculatorGoogleWS#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see com.misc.common.moplaf.gis.google.GisDistanceMatrixCalculatorGoogleWS#getKey()
	 * @see #getGisDistanceMatrixCalculatorGoogleWS()
	 * @generated
	 */
	EAttribute getGisDistanceMatrixCalculatorGoogleWS_Key();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.gis.google.GisDistanceMatrixCalculatorGoogleWS#isAvoidTolls <em>Avoid Tolls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Avoid Tolls</em>'.
	 * @see com.misc.common.moplaf.gis.google.GisDistanceMatrixCalculatorGoogleWS#isAvoidTolls()
	 * @see #getGisDistanceMatrixCalculatorGoogleWS()
	 * @generated
	 */
	EAttribute getGisDistanceMatrixCalculatorGoogleWS_AvoidTolls();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.gis.google.GisDistanceMatrixCalculatorGoogleWS#isAvoidFerries <em>Avoid Ferries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Avoid Ferries</em>'.
	 * @see com.misc.common.moplaf.gis.google.GisDistanceMatrixCalculatorGoogleWS#isAvoidFerries()
	 * @see #getGisDistanceMatrixCalculatorGoogleWS()
	 * @generated
	 */
	EAttribute getGisDistanceMatrixCalculatorGoogleWS_AvoidFerries();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.gis.google.GisDistanceMatrixCalculatorGoogleWS#isAvoidHighways <em>Avoid Highways</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Avoid Highways</em>'.
	 * @see com.misc.common.moplaf.gis.google.GisDistanceMatrixCalculatorGoogleWS#isAvoidHighways()
	 * @see #getGisDistanceMatrixCalculatorGoogleWS()
	 * @generated
	 */
	EAttribute getGisDistanceMatrixCalculatorGoogleWS_AvoidHighways();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.gis.google.GisDistanceMatrixCalculatorGoogleWS#getTravelModel <em>Travel Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Travel Model</em>'.
	 * @see com.misc.common.moplaf.gis.google.GisDistanceMatrixCalculatorGoogleWS#getTravelModel()
	 * @see #getGisDistanceMatrixCalculatorGoogleWS()
	 * @generated
	 */
	EAttribute getGisDistanceMatrixCalculatorGoogleWS_TravelModel();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.gis.google.GisAddressGeocoderGoogleWS <em>Gis Address Geocoder Google WS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gis Address Geocoder Google WS</em>'.
	 * @see com.misc.common.moplaf.gis.google.GisAddressGeocoderGoogleWS
	 * @generated
	 */
	EClass getGisAddressGeocoderGoogleWS();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.gis.google.GisAddressGeocoderGoogleWS#getProtocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Protocol</em>'.
	 * @see com.misc.common.moplaf.gis.google.GisAddressGeocoderGoogleWS#getProtocol()
	 * @see #getGisAddressGeocoderGoogleWS()
	 * @generated
	 */
	EAttribute getGisAddressGeocoderGoogleWS_Protocol();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.gis.google.GisAddressGeocoderGoogleWS#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see com.misc.common.moplaf.gis.google.GisAddressGeocoderGoogleWS#getPort()
	 * @see #getGisAddressGeocoderGoogleWS()
	 * @generated
	 */
	EAttribute getGisAddressGeocoderGoogleWS_Port();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.gis.google.GisAddressGeocoderGoogleWS#getHost <em>Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host</em>'.
	 * @see com.misc.common.moplaf.gis.google.GisAddressGeocoderGoogleWS#getHost()
	 * @see #getGisAddressGeocoderGoogleWS()
	 * @generated
	 */
	EAttribute getGisAddressGeocoderGoogleWS_Host();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.gis.google.GisAddressGeocoderGoogleWS#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see com.misc.common.moplaf.gis.google.GisAddressGeocoderGoogleWS#getPath()
	 * @see #getGisAddressGeocoderGoogleWS()
	 * @generated
	 */
	EAttribute getGisAddressGeocoderGoogleWS_Path();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.gis.google.GisAddressGeocoderGoogleWS#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see com.misc.common.moplaf.gis.google.GisAddressGeocoderGoogleWS#getKey()
	 * @see #getGisAddressGeocoderGoogleWS()
	 * @generated
	 */
	EAttribute getGisAddressGeocoderGoogleWS_Key();

	/**
	 * Returns the meta object for enum '{@link com.misc.common.moplaf.gis.google.Protocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Protocol</em>'.
	 * @see com.misc.common.moplaf.gis.google.Protocol
	 * @generated
	 */
	EEnum getProtocol();

	/**
	 * Returns the meta object for enum '{@link com.misc.common.moplaf.gis.google.TravelMode <em>Travel Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Travel Mode</em>'.
	 * @see com.misc.common.moplaf.gis.google.TravelMode
	 * @generated
	 */
	EEnum getTravelMode();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GisGoogleFactory getGisGoogleFactory();

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
		 * The meta object literal for the '{@link com.misc.common.moplaf.gis.google.impl.GisDistanceMatrixCalculatorGoogleWSImpl <em>Gis Distance Matrix Calculator Google WS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.gis.google.impl.GisDistanceMatrixCalculatorGoogleWSImpl
		 * @see com.misc.common.moplaf.gis.google.impl.GisGooglePackageImpl#getGisDistanceMatrixCalculatorGoogleWS()
		 * @generated
		 */
		EClass GIS_DISTANCE_MATRIX_CALCULATOR_GOOGLE_WS = eINSTANCE.getGisDistanceMatrixCalculatorGoogleWS();

		/**
		 * The meta object literal for the '<em><b>Protocol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GIS_DISTANCE_MATRIX_CALCULATOR_GOOGLE_WS__PROTOCOL = eINSTANCE.getGisDistanceMatrixCalculatorGoogleWS_Protocol();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GIS_DISTANCE_MATRIX_CALCULATOR_GOOGLE_WS__PORT = eINSTANCE.getGisDistanceMatrixCalculatorGoogleWS_Port();

		/**
		 * The meta object literal for the '<em><b>Host</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GIS_DISTANCE_MATRIX_CALCULATOR_GOOGLE_WS__HOST = eINSTANCE.getGisDistanceMatrixCalculatorGoogleWS_Host();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GIS_DISTANCE_MATRIX_CALCULATOR_GOOGLE_WS__PATH = eINSTANCE.getGisDistanceMatrixCalculatorGoogleWS_Path();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GIS_DISTANCE_MATRIX_CALCULATOR_GOOGLE_WS__KEY = eINSTANCE.getGisDistanceMatrixCalculatorGoogleWS_Key();

		/**
		 * The meta object literal for the '<em><b>Avoid Tolls</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GIS_DISTANCE_MATRIX_CALCULATOR_GOOGLE_WS__AVOID_TOLLS = eINSTANCE.getGisDistanceMatrixCalculatorGoogleWS_AvoidTolls();

		/**
		 * The meta object literal for the '<em><b>Avoid Ferries</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GIS_DISTANCE_MATRIX_CALCULATOR_GOOGLE_WS__AVOID_FERRIES = eINSTANCE.getGisDistanceMatrixCalculatorGoogleWS_AvoidFerries();

		/**
		 * The meta object literal for the '<em><b>Avoid Highways</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GIS_DISTANCE_MATRIX_CALCULATOR_GOOGLE_WS__AVOID_HIGHWAYS = eINSTANCE.getGisDistanceMatrixCalculatorGoogleWS_AvoidHighways();

		/**
		 * The meta object literal for the '<em><b>Travel Model</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GIS_DISTANCE_MATRIX_CALCULATOR_GOOGLE_WS__TRAVEL_MODEL = eINSTANCE.getGisDistanceMatrixCalculatorGoogleWS_TravelModel();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.gis.google.impl.GisAddressGeocoderGoogleWSImpl <em>Gis Address Geocoder Google WS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.gis.google.impl.GisAddressGeocoderGoogleWSImpl
		 * @see com.misc.common.moplaf.gis.google.impl.GisGooglePackageImpl#getGisAddressGeocoderGoogleWS()
		 * @generated
		 */
		EClass GIS_ADDRESS_GEOCODER_GOOGLE_WS = eINSTANCE.getGisAddressGeocoderGoogleWS();

		/**
		 * The meta object literal for the '<em><b>Protocol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GIS_ADDRESS_GEOCODER_GOOGLE_WS__PROTOCOL = eINSTANCE.getGisAddressGeocoderGoogleWS_Protocol();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GIS_ADDRESS_GEOCODER_GOOGLE_WS__PORT = eINSTANCE.getGisAddressGeocoderGoogleWS_Port();

		/**
		 * The meta object literal for the '<em><b>Host</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GIS_ADDRESS_GEOCODER_GOOGLE_WS__HOST = eINSTANCE.getGisAddressGeocoderGoogleWS_Host();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GIS_ADDRESS_GEOCODER_GOOGLE_WS__PATH = eINSTANCE.getGisAddressGeocoderGoogleWS_Path();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GIS_ADDRESS_GEOCODER_GOOGLE_WS__KEY = eINSTANCE.getGisAddressGeocoderGoogleWS_Key();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.gis.google.Protocol <em>Protocol</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.gis.google.Protocol
		 * @see com.misc.common.moplaf.gis.google.impl.GisGooglePackageImpl#getProtocol()
		 * @generated
		 */
		EEnum PROTOCOL = eINSTANCE.getProtocol();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.gis.google.TravelMode <em>Travel Mode</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.gis.google.TravelMode
		 * @see com.misc.common.moplaf.gis.google.impl.GisGooglePackageImpl#getTravelMode()
		 * @generated
		 */
		EEnum TRAVEL_MODE = eINSTANCE.getTravelMode();

	}

} //GisGooglePackage
