/*******************************************************************************
 * Copyright (c) 2017, 2018 Michel Schaffers and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Michel Schaffers - initial API and implementation
 *******************************************************************************/
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
	String eNS_URI = "http://www.misc.com/common/moplaf/gis/model/0.1";

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
	int GIS_LOCATION = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_LOCATION__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Geocoded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_LOCATION__GEOCODED = 1;

	/**
	 * The feature id for the '<em><b>Tools</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_LOCATION__TOOLS = 2;

	/**
	 * The number of structural features of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_LOCATION_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Get Coordinates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_LOCATION___GET_COORDINATES = 0;

	/**
	 * The operation id for the '<em>Add Tool</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_LOCATION___ADD_TOOL__GISTOOLLOCATION = 1;

	/**
	 * The operation id for the '<em>Get Add Tool Feedback</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_LOCATION___GET_ADD_TOOL_FEEDBACK__GISTOOLLOCATION = 2;

	/**
	 * The number of operations of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_LOCATION_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.gis.impl.GisCoordinatesAbstractImpl <em>Coordinates Abstract</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.gis.impl.GisCoordinatesAbstractImpl
	 * @see com.misc.common.moplaf.gis.impl.GisPackageImpl#getGisCoordinatesAbstract()
	 * @generated
	 */
	int GIS_COORDINATES_ABSTRACT = 3;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.gis.impl.GisCoordinatesImpl <em>Coordinates</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.gis.impl.GisCoordinatesImpl
	 * @see com.misc.common.moplaf.gis.impl.GisPackageImpl#getGisCoordinates()
	 * @generated
	 */
	int GIS_COORDINATES = 4;

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.gis.GisCoordinatesAbstract <em>Coordinates Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coordinates Abstract</em>'.
	 * @see com.misc.common.moplaf.gis.GisCoordinatesAbstract
	 * @generated
	 */
	EClass getGisCoordinatesAbstract();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.gis.GisCoordinatesAbstract#getLongitude <em>Longitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Longitude</em>'.
	 * @see com.misc.common.moplaf.gis.GisCoordinatesAbstract#getLongitude()
	 * @see #getGisCoordinatesAbstract()
	 * @generated
	 */
	EAttribute getGisCoordinatesAbstract_Longitude();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.gis.GisCoordinatesAbstract#getLatitude <em>Latitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Latitude</em>'.
	 * @see com.misc.common.moplaf.gis.GisCoordinatesAbstract#getLatitude()
	 * @see #getGisCoordinatesAbstract()
	 * @generated
	 */
	EAttribute getGisCoordinatesAbstract_Latitude();

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.gis.impl.GisAddressImpl <em>Address</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.gis.impl.GisAddressImpl
	 * @see com.misc.common.moplaf.gis.impl.GisPackageImpl#getGisAddress()
	 * @generated
	 */
	int GIS_ADDRESS = 5;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.gis.impl.GisRouterImpl <em>Router</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.gis.impl.GisRouterImpl
	 * @see com.misc.common.moplaf.gis.impl.GisPackageImpl#getGisRouter()
	 * @generated
	 */
	int GIS_ROUTER = 17;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.gis.impl.GisRoutesHolderImpl <em>Routes Holder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.gis.impl.GisRoutesHolderImpl
	 * @see com.misc.common.moplaf.gis.impl.GisPackageImpl#getGisRoutesHolder()
	 * @generated
	 */
	int GIS_ROUTES_HOLDER = 11;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.gis.impl.GisRoutesHolderWaypointImpl <em>Routes Holder Waypoint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.gis.impl.GisRoutesHolderWaypointImpl
	 * @see com.misc.common.moplaf.gis.impl.GisPackageImpl#getGisRoutesHolderWaypoint()
	 * @generated
	 */
	int GIS_ROUTES_HOLDER_WAYPOINT = 10;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.gis.impl.GisRoutesHolderFromLocationImpl <em>Routes Holder From Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.gis.impl.GisRoutesHolderFromLocationImpl
	 * @see com.misc.common.moplaf.gis.impl.GisPackageImpl#getGisRoutesHolderFromLocation()
	 * @generated
	 */
	int GIS_ROUTES_HOLDER_FROM_LOCATION = 12;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.gis.impl.GisRoutesHolderToLocationImpl <em>Routes Holder To Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.gis.impl.GisRoutesHolderToLocationImpl
	 * @see com.misc.common.moplaf.gis.impl.GisPackageImpl#getGisRoutesHolderToLocation()
	 * @generated
	 */
	int GIS_ROUTES_HOLDER_TO_LOCATION = 13;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.gis.impl.GisRoutesHolderElementImpl <em>Routes Holder Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.gis.impl.GisRoutesHolderElementImpl
	 * @see com.misc.common.moplaf.gis.impl.GisPackageImpl#getGisRoutesHolderElement()
	 * @generated
	 */
	int GIS_ROUTES_HOLDER_ELEMENT = 14;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.gis.impl.GisRouteInfoImpl <em>Route Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.gis.impl.GisRouteInfoImpl
	 * @see com.misc.common.moplaf.gis.impl.GisPackageImpl#getGisRouteInfo()
	 * @generated
	 */
	int GIS_ROUTE_INFO = 15;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.gis.impl.GisAddressGeocodedImpl <em>Address Geocoded</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.gis.impl.GisAddressGeocodedImpl
	 * @see com.misc.common.moplaf.gis.impl.GisPackageImpl#getGisAddressGeocoded()
	 * @generated
	 */
	int GIS_ADDRESS_GEOCODED = 8;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.gis.impl.GisAddressGeocoderImpl <em>Address Geocoder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.gis.impl.GisAddressGeocoderImpl
	 * @see com.misc.common.moplaf.gis.impl.GisPackageImpl#getGisAddressGeocoder()
	 * @generated
	 */
	int GIS_ADDRESS_GEOCODER = 9;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.gis.impl.GisRouteCalculatorImpl <em>Route Calculator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.gis.impl.GisRouteCalculatorImpl
	 * @see com.misc.common.moplaf.gis.impl.GisPackageImpl#getGisRouteCalculator()
	 * @generated
	 */
	int GIS_ROUTE_CALCULATOR = 16;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.gis.impl.GisAddressStructuredImpl <em>Address Structured</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.gis.impl.GisAddressStructuredImpl
	 * @see com.misc.common.moplaf.gis.impl.GisPackageImpl#getGisAddressStructured()
	 * @generated
	 */
	int GIS_ADDRESS_STRUCTURED = 6;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.gis.impl.GisAddressUnstructuredImpl <em>Address Unstructured</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.gis.impl.GisAddressUnstructuredImpl
	 * @see com.misc.common.moplaf.gis.impl.GisPackageImpl#getGisAddressUnstructured()
	 * @generated
	 */
	int GIS_ADDRESS_UNSTRUCTURED = 7;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.gis.impl.GisRouteCalculatorOneToOneImpl <em>Route Calculator One To One</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.gis.impl.GisRouteCalculatorOneToOneImpl
	 * @see com.misc.common.moplaf.gis.impl.GisPackageImpl#getGisRouteCalculatorOneToOne()
	 * @generated
	 */
	int GIS_ROUTE_CALCULATOR_ONE_TO_ONE = 18;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.gis.impl.GisRouteCalculatorManyToManyImpl <em>Route Calculator Many To Many</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.gis.impl.GisRouteCalculatorManyToManyImpl
	 * @see com.misc.common.moplaf.gis.impl.GisPackageImpl#getGisRouteCalculatorManyToMany()
	 * @generated
	 */
	int GIS_ROUTE_CALCULATOR_MANY_TO_MANY = 19;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.gis.impl.GisRouteCalculatorOneToManyImpl <em>Route Calculator One To Many</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.gis.impl.GisRouteCalculatorOneToManyImpl
	 * @see com.misc.common.moplaf.gis.impl.GisPackageImpl#getGisRouteCalculatorOneToMany()
	 * @generated
	 */
	int GIS_ROUTE_CALCULATOR_ONE_TO_MANY = 20;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.gis.impl.GisRouterGeodesicImpl <em>Router Geodesic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.gis.impl.GisRouterGeodesicImpl
	 * @see com.misc.common.moplaf.gis.impl.GisPackageImpl#getGisRouterGeodesic()
	 * @generated
	 */
	int GIS_ROUTER_GEODESIC = 21;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.gis.impl.GisRouterDefaultedImpl <em>Router Defaulted</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.gis.impl.GisRouterDefaultedImpl
	 * @see com.misc.common.moplaf.gis.impl.GisPackageImpl#getGisRouterDefaulted()
	 * @generated
	 */
	int GIS_ROUTER_DEFAULTED = 22;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.gis.impl.GisGeometryImpl <em>Geometry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.gis.impl.GisGeometryImpl
	 * @see com.misc.common.moplaf.gis.impl.GisPackageImpl#getGisGeometry()
	 * @generated
	 */
	int GIS_GEOMETRY = 23;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.gis.impl.GisLocationPinpointedImpl <em>Location Pinpointed</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.gis.impl.GisLocationPinpointedImpl
	 * @see com.misc.common.moplaf.gis.impl.GisPackageImpl#getGisLocationPinpointed()
	 * @generated
	 */
	int GIS_LOCATION_PINPOINTED = 25;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.gis.impl.GisLocationPinpointerImpl <em>Location Pinpointer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.gis.impl.GisLocationPinpointerImpl
	 * @see com.misc.common.moplaf.gis.impl.GisPackageImpl#getGisLocationPinpointer()
	 * @generated
	 */
	int GIS_LOCATION_PINPOINTER = 24;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.gis.impl.GisToolLocationImpl <em>Tool Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.gis.impl.GisToolLocationImpl
	 * @see com.misc.common.moplaf.gis.impl.GisPackageImpl#getGisToolLocation()
	 * @generated
	 */
	int GIS_TOOL_LOCATION = 2;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.gis.impl.GisLocationToolImpl <em>Location Tool</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.gis.impl.GisLocationToolImpl
	 * @see com.misc.common.moplaf.gis.impl.GisPackageImpl#getGisLocationTool()
	 * @generated
	 */
	int GIS_LOCATION_TOOL = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_LOCATION_TOOL__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Do Tool Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_LOCATION_TOOL__DO_TOOL_FEEDBACK = 1;

	/**
	 * The feature id for the '<em><b>Last Handling Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_LOCATION_TOOL__LAST_HANDLING_FEEDBACK = 2;

	/**
	 * The feature id for the '<em><b>Tool</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_LOCATION_TOOL__TOOL = 3;

	/**
	 * The feature id for the '<em><b>Location</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_LOCATION_TOOL__LOCATION = 4;

	/**
	 * The feature id for the '<em><b>Results</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_LOCATION_TOOL__RESULTS = 5;

	/**
	 * The number of structural features of the '<em>Location Tool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_LOCATION_TOOL_FEATURE_COUNT = 6;

	/**
	 * The operation id for the '<em>Do Tool</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_LOCATION_TOOL___DO_TOOL = 0;

	/**
	 * The operation id for the '<em>Flush Results</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_LOCATION_TOOL___FLUSH_RESULTS = 1;

	/**
	 * The number of operations of the '<em>Location Tool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_LOCATION_TOOL_OPERATION_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_TOOL_LOCATION__NAME = 0;

	/**
	 * The number of structural features of the '<em>Tool Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_TOOL_LOCATION_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Handle</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_TOOL_LOCATION___HANDLE__GISLOCATIONTOOL = 0;

	/**
	 * The operation id for the '<em>Construct Location Tool</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_TOOL_LOCATION___CONSTRUCT_LOCATION_TOOL = 1;

	/**
	 * The number of operations of the '<em>Tool Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_TOOL_LOCATION_OPERATION_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_COORDINATES_ABSTRACT__DESCRIPTION = GIS_LOCATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Geocoded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_COORDINATES_ABSTRACT__GEOCODED = GIS_LOCATION__GEOCODED;

	/**
	 * The feature id for the '<em><b>Tools</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_COORDINATES_ABSTRACT__TOOLS = GIS_LOCATION__TOOLS;

	/**
	 * The feature id for the '<em><b>Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_COORDINATES_ABSTRACT__LONGITUDE = GIS_LOCATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_COORDINATES_ABSTRACT__LATITUDE = GIS_LOCATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Coordinates Abstract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_COORDINATES_ABSTRACT_FEATURE_COUNT = GIS_LOCATION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Coordinates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_COORDINATES_ABSTRACT___GET_COORDINATES = GIS_LOCATION___GET_COORDINATES;

	/**
	 * The operation id for the '<em>Add Tool</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_COORDINATES_ABSTRACT___ADD_TOOL__GISTOOLLOCATION = GIS_LOCATION___ADD_TOOL__GISTOOLLOCATION;

	/**
	 * The operation id for the '<em>Get Add Tool Feedback</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_COORDINATES_ABSTRACT___GET_ADD_TOOL_FEEDBACK__GISTOOLLOCATION = GIS_LOCATION___GET_ADD_TOOL_FEEDBACK__GISTOOLLOCATION;

	/**
	 * The number of operations of the '<em>Coordinates Abstract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_COORDINATES_ABSTRACT_OPERATION_COUNT = GIS_LOCATION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_COORDINATES__DESCRIPTION = GIS_COORDINATES_ABSTRACT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Geocoded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_COORDINATES__GEOCODED = GIS_COORDINATES_ABSTRACT__GEOCODED;

	/**
	 * The feature id for the '<em><b>Tools</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_COORDINATES__TOOLS = GIS_COORDINATES_ABSTRACT__TOOLS;

	/**
	 * The feature id for the '<em><b>Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_COORDINATES__LONGITUDE = GIS_COORDINATES_ABSTRACT__LONGITUDE;

	/**
	 * The feature id for the '<em><b>Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_COORDINATES__LATITUDE = GIS_COORDINATES_ABSTRACT__LATITUDE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_COORDINATES__NAME = GIS_COORDINATES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Coordinates</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_COORDINATES_FEATURE_COUNT = GIS_COORDINATES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Coordinates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_COORDINATES___GET_COORDINATES = GIS_COORDINATES_ABSTRACT___GET_COORDINATES;

	/**
	 * The operation id for the '<em>Add Tool</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_COORDINATES___ADD_TOOL__GISTOOLLOCATION = GIS_COORDINATES_ABSTRACT___ADD_TOOL__GISTOOLLOCATION;

	/**
	 * The operation id for the '<em>Get Add Tool Feedback</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_COORDINATES___GET_ADD_TOOL_FEEDBACK__GISTOOLLOCATION = GIS_COORDINATES_ABSTRACT___GET_ADD_TOOL_FEEDBACK__GISTOOLLOCATION;

	/**
	 * The number of operations of the '<em>Coordinates</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_COORDINATES_OPERATION_COUNT = GIS_COORDINATES_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ADDRESS__DESCRIPTION = GIS_LOCATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Geocoded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ADDRESS__GEOCODED = GIS_LOCATION__GEOCODED;

	/**
	 * The feature id for the '<em><b>Tools</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ADDRESS__TOOLS = GIS_LOCATION__TOOLS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ADDRESS__NAME = GIS_LOCATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Country Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ADDRESS__COUNTRY_CODE = GIS_LOCATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Geocoded Selected</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ADDRESS__GEOCODED_SELECTED = GIS_LOCATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Address</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ADDRESS_FEATURE_COUNT = GIS_LOCATION_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Coordinates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ADDRESS___GET_COORDINATES = GIS_LOCATION___GET_COORDINATES;

	/**
	 * The operation id for the '<em>Add Tool</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ADDRESS___ADD_TOOL__GISTOOLLOCATION = GIS_LOCATION___ADD_TOOL__GISTOOLLOCATION;

	/**
	 * The operation id for the '<em>Get Add Tool Feedback</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ADDRESS___GET_ADD_TOOL_FEEDBACK__GISTOOLLOCATION = GIS_LOCATION___GET_ADD_TOOL_FEEDBACK__GISTOOLLOCATION;

	/**
	 * The number of operations of the '<em>Address</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ADDRESS_OPERATION_COUNT = GIS_LOCATION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ADDRESS_STRUCTURED__DESCRIPTION = GIS_ADDRESS__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Geocoded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ADDRESS_STRUCTURED__GEOCODED = GIS_ADDRESS__GEOCODED;

	/**
	 * The feature id for the '<em><b>Tools</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ADDRESS_STRUCTURED__TOOLS = GIS_ADDRESS__TOOLS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ADDRESS_STRUCTURED__NAME = GIS_ADDRESS__NAME;

	/**
	 * The feature id for the '<em><b>Country Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ADDRESS_STRUCTURED__COUNTRY_CODE = GIS_ADDRESS__COUNTRY_CODE;

	/**
	 * The feature id for the '<em><b>Geocoded Selected</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ADDRESS_STRUCTURED__GEOCODED_SELECTED = GIS_ADDRESS__GEOCODED_SELECTED;

	/**
	 * The feature id for the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ADDRESS_STRUCTURED__COUNTRY = GIS_ADDRESS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Administrative Area</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ADDRESS_STRUCTURED__ADMINISTRATIVE_AREA = GIS_ADDRESS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Locality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ADDRESS_STRUCTURED__LOCALITY = GIS_ADDRESS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Postal Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ADDRESS_STRUCTURED__POSTAL_CODE = GIS_ADDRESS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Street</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ADDRESS_STRUCTURED__STREET = GIS_ADDRESS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Building Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ADDRESS_STRUCTURED__BUILDING_NUMBER = GIS_ADDRESS_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Address Structured</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ADDRESS_STRUCTURED_FEATURE_COUNT = GIS_ADDRESS_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Get Coordinates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ADDRESS_STRUCTURED___GET_COORDINATES = GIS_ADDRESS___GET_COORDINATES;

	/**
	 * The operation id for the '<em>Add Tool</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ADDRESS_STRUCTURED___ADD_TOOL__GISTOOLLOCATION = GIS_ADDRESS___ADD_TOOL__GISTOOLLOCATION;

	/**
	 * The operation id for the '<em>Get Add Tool Feedback</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ADDRESS_STRUCTURED___GET_ADD_TOOL_FEEDBACK__GISTOOLLOCATION = GIS_ADDRESS___GET_ADD_TOOL_FEEDBACK__GISTOOLLOCATION;

	/**
	 * The number of operations of the '<em>Address Structured</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ADDRESS_STRUCTURED_OPERATION_COUNT = GIS_ADDRESS_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ADDRESS_UNSTRUCTURED__DESCRIPTION = GIS_ADDRESS__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Geocoded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ADDRESS_UNSTRUCTURED__GEOCODED = GIS_ADDRESS__GEOCODED;

	/**
	 * The feature id for the '<em><b>Tools</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ADDRESS_UNSTRUCTURED__TOOLS = GIS_ADDRESS__TOOLS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ADDRESS_UNSTRUCTURED__NAME = GIS_ADDRESS__NAME;

	/**
	 * The feature id for the '<em><b>Country Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ADDRESS_UNSTRUCTURED__COUNTRY_CODE = GIS_ADDRESS__COUNTRY_CODE;

	/**
	 * The feature id for the '<em><b>Geocoded Selected</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ADDRESS_UNSTRUCTURED__GEOCODED_SELECTED = GIS_ADDRESS__GEOCODED_SELECTED;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ADDRESS_UNSTRUCTURED__ADDRESS = GIS_ADDRESS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Address Unstructured</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ADDRESS_UNSTRUCTURED_FEATURE_COUNT = GIS_ADDRESS_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Coordinates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ADDRESS_UNSTRUCTURED___GET_COORDINATES = GIS_ADDRESS___GET_COORDINATES;

	/**
	 * The operation id for the '<em>Add Tool</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ADDRESS_UNSTRUCTURED___ADD_TOOL__GISTOOLLOCATION = GIS_ADDRESS___ADD_TOOL__GISTOOLLOCATION;

	/**
	 * The operation id for the '<em>Get Add Tool Feedback</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ADDRESS_UNSTRUCTURED___GET_ADD_TOOL_FEEDBACK__GISTOOLLOCATION = GIS_ADDRESS___GET_ADD_TOOL_FEEDBACK__GISTOOLLOCATION;

	/**
	 * The number of operations of the '<em>Address Unstructured</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ADDRESS_UNSTRUCTURED_OPERATION_COUNT = GIS_ADDRESS_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ADDRESS_GEOCODED__DESCRIPTION = GIS_COORDINATES_ABSTRACT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Geocoded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ADDRESS_GEOCODED__GEOCODED = GIS_COORDINATES_ABSTRACT__GEOCODED;

	/**
	 * The feature id for the '<em><b>Tools</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ADDRESS_GEOCODED__TOOLS = GIS_COORDINATES_ABSTRACT__TOOLS;

	/**
	 * The feature id for the '<em><b>Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ADDRESS_GEOCODED__LONGITUDE = GIS_COORDINATES_ABSTRACT__LONGITUDE;

	/**
	 * The feature id for the '<em><b>Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ADDRESS_GEOCODED__LATITUDE = GIS_COORDINATES_ABSTRACT__LATITUDE;

	/**
	 * The feature id for the '<em><b>Score</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ADDRESS_GEOCODED__SCORE = GIS_COORDINATES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Address Geocoded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ADDRESS_GEOCODED__ADDRESS_GEOCODED = GIS_COORDINATES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Address Geocoded</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ADDRESS_GEOCODED_FEATURE_COUNT = GIS_COORDINATES_ABSTRACT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Coordinates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ADDRESS_GEOCODED___GET_COORDINATES = GIS_COORDINATES_ABSTRACT___GET_COORDINATES;

	/**
	 * The operation id for the '<em>Add Tool</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ADDRESS_GEOCODED___ADD_TOOL__GISTOOLLOCATION = GIS_COORDINATES_ABSTRACT___ADD_TOOL__GISTOOLLOCATION;

	/**
	 * The operation id for the '<em>Get Add Tool Feedback</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ADDRESS_GEOCODED___GET_ADD_TOOL_FEEDBACK__GISTOOLLOCATION = GIS_COORDINATES_ABSTRACT___GET_ADD_TOOL_FEEDBACK__GISTOOLLOCATION;

	/**
	 * The number of operations of the '<em>Address Geocoded</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ADDRESS_GEOCODED_OPERATION_COUNT = GIS_COORDINATES_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ADDRESS_GEOCODER__NAME = GIS_TOOL_LOCATION__NAME;

	/**
	 * The number of structural features of the '<em>Address Geocoder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ADDRESS_GEOCODER_FEATURE_COUNT = GIS_TOOL_LOCATION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Handle</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ADDRESS_GEOCODER___HANDLE__GISLOCATIONTOOL = GIS_TOOL_LOCATION___HANDLE__GISLOCATIONTOOL;

	/**
	 * The operation id for the '<em>Construct Location Tool</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ADDRESS_GEOCODER___CONSTRUCT_LOCATION_TOOL = GIS_TOOL_LOCATION___CONSTRUCT_LOCATION_TOOL;

	/**
	 * The number of operations of the '<em>Address Geocoder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ADDRESS_GEOCODER_OPERATION_COUNT = GIS_TOOL_LOCATION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ROUTES_HOLDER_WAYPOINT__LOCATION = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ROUTES_HOLDER_WAYPOINT__DESCRIPTION = 1;

	/**
	 * The number of structural features of the '<em>Routes Holder Waypoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ROUTES_HOLDER_WAYPOINT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Routes Holder Waypoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ROUTES_HOLDER_WAYPOINT_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ROUTER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ROUTER__DESCRIPTION = 1;

	/**
	 * The number of structural features of the '<em>Router</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ROUTER_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Get Route</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ROUTER___GET_ROUTE__GISLOCATION_GISLOCATION = 0;

	/**
	 * The operation id for the '<em>Get Routes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ROUTER___GET_ROUTES__ELIST_ELIST = 1;

	/**
	 * The number of operations of the '<em>Router</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ROUTER_OPERATION_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ROUTES_HOLDER__NAME = GIS_ROUTER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ROUTES_HOLDER__DESCRIPTION = GIS_ROUTER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>From Locations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ROUTES_HOLDER__FROM_LOCATIONS = GIS_ROUTER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To Locations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ROUTES_HOLDER__TO_LOCATIONS = GIS_ROUTER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Symmetrical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ROUTES_HOLDER__SYMMETRICAL = GIS_ROUTER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Calculator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ROUTES_HOLDER__CALCULATOR = GIS_ROUTER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Refresh Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ROUTES_HOLDER__REFRESH_FEEDBACK = GIS_ROUTER_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Routes Holder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ROUTES_HOLDER_FEATURE_COUNT = GIS_ROUTER_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Route</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ROUTES_HOLDER___GET_ROUTE__GISLOCATION_GISLOCATION = GIS_ROUTER___GET_ROUTE__GISLOCATION_GISLOCATION;

	/**
	 * The operation id for the '<em>Get Routes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ROUTES_HOLDER___GET_ROUTES__ELIST_ELIST = GIS_ROUTER___GET_ROUTES__ELIST_ELIST;

	/**
	 * The operation id for the '<em>Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ROUTES_HOLDER___UPDATE__GISROUTECALCULATOR = GIS_ROUTER_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ROUTES_HOLDER___UPDATE__GISROUTECALCULATOR_ELIST_ELIST = GIS_ROUTER_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Add From Location</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ROUTES_HOLDER___ADD_FROM_LOCATION__GISLOCATION = GIS_ROUTER_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Add To Location</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ROUTES_HOLDER___ADD_TO_LOCATION__GISLOCATION = GIS_ROUTER_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get From Location</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ROUTES_HOLDER___GET_FROM_LOCATION__GISLOCATION = GIS_ROUTER_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Get To Location</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ROUTES_HOLDER___GET_TO_LOCATION__GISLOCATION = GIS_ROUTER_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ROUTES_HOLDER___REFRESH = GIS_ROUTER_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Flush</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ROUTES_HOLDER___FLUSH = GIS_ROUTER_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Clear</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ROUTES_HOLDER___CLEAR = GIS_ROUTER_OPERATION_COUNT + 8;

	/**
	 * The number of operations of the '<em>Routes Holder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ROUTES_HOLDER_OPERATION_COUNT = GIS_ROUTER_OPERATION_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ROUTES_HOLDER_FROM_LOCATION__LOCATION = GIS_ROUTES_HOLDER_WAYPOINT__LOCATION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ROUTES_HOLDER_FROM_LOCATION__DESCRIPTION = GIS_ROUTES_HOLDER_WAYPOINT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>To Locations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ROUTES_HOLDER_FROM_LOCATION__TO_LOCATIONS = GIS_ROUTES_HOLDER_WAYPOINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Routes Holder</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ROUTES_HOLDER_FROM_LOCATION__ROUTES_HOLDER = GIS_ROUTES_HOLDER_WAYPOINT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Routes Holder From Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ROUTES_HOLDER_FROM_LOCATION_FEATURE_COUNT = GIS_ROUTES_HOLDER_WAYPOINT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ROUTES_HOLDER_FROM_LOCATION___GET_ELEMENT__GISLOCATION = GIS_ROUTES_HOLDER_WAYPOINT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Add Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ROUTES_HOLDER_FROM_LOCATION___ADD_ELEMENT__GISROUTESHOLDERTOLOCATION = GIS_ROUTES_HOLDER_WAYPOINT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ROUTES_HOLDER_FROM_LOCATION___UPDATE__GISROUTECALCULATOR = GIS_ROUTES_HOLDER_WAYPOINT_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ROUTES_HOLDER_FROM_LOCATION___REFRESH = GIS_ROUTES_HOLDER_WAYPOINT_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Remove</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ROUTES_HOLDER_FROM_LOCATION___REMOVE = GIS_ROUTES_HOLDER_WAYPOINT_OPERATION_COUNT + 4;

	/**
	 * The number of operations of the '<em>Routes Holder From Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ROUTES_HOLDER_FROM_LOCATION_OPERATION_COUNT = GIS_ROUTES_HOLDER_WAYPOINT_OPERATION_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ROUTES_HOLDER_TO_LOCATION__LOCATION = GIS_ROUTES_HOLDER_WAYPOINT__LOCATION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ROUTES_HOLDER_TO_LOCATION__DESCRIPTION = GIS_ROUTES_HOLDER_WAYPOINT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>From Locations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ROUTES_HOLDER_TO_LOCATION__FROM_LOCATIONS = GIS_ROUTES_HOLDER_WAYPOINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Routes Holder</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ROUTES_HOLDER_TO_LOCATION__ROUTES_HOLDER = GIS_ROUTES_HOLDER_WAYPOINT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Routes Holder To Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ROUTES_HOLDER_TO_LOCATION_FEATURE_COUNT = GIS_ROUTES_HOLDER_WAYPOINT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ROUTES_HOLDER_TO_LOCATION___GET_ELEMENT__GISLOCATION = GIS_ROUTES_HOLDER_WAYPOINT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Add Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ROUTES_HOLDER_TO_LOCATION___ADD_ELEMENT__GISROUTESHOLDERFROMLOCATION = GIS_ROUTES_HOLDER_WAYPOINT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ROUTES_HOLDER_TO_LOCATION___UPDATE__GISROUTECALCULATOR = GIS_ROUTES_HOLDER_WAYPOINT_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ROUTES_HOLDER_TO_LOCATION___REFRESH = GIS_ROUTES_HOLDER_WAYPOINT_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Remove</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ROUTES_HOLDER_TO_LOCATION___REMOVE = GIS_ROUTES_HOLDER_WAYPOINT_OPERATION_COUNT + 4;

	/**
	 * The number of operations of the '<em>Routes Holder To Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ROUTES_HOLDER_TO_LOCATION_OPERATION_COUNT = GIS_ROUTES_HOLDER_WAYPOINT_OPERATION_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ROUTES_HOLDER_ELEMENT__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>To Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ROUTES_HOLDER_ELEMENT__TO_LOCATION = 1;

	/**
	 * The feature id for the '<em><b>From Location</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ROUTES_HOLDER_ELEMENT__FROM_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Routes Info</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ROUTES_HOLDER_ELEMENT__ROUTES_INFO = 3;

	/**
	 * The feature id for the '<em><b>Calculated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ROUTES_HOLDER_ELEMENT__CALCULATED = 4;

	/**
	 * The number of structural features of the '<em>Routes Holder Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ROUTES_HOLDER_ELEMENT_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ROUTES_HOLDER_ELEMENT___UPDATE__GISROUTECALCULATOR = 0;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ROUTES_HOLDER_ELEMENT___REFRESH = 1;

	/**
	 * The operation id for the '<em>Remove</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ROUTES_HOLDER_ELEMENT___REMOVE = 2;

	/**
	 * The number of operations of the '<em>Routes Holder Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ROUTES_HOLDER_ELEMENT_OPERATION_COUNT = 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ROUTE_INFO__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>From Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ROUTE_INFO__FROM_LOCATION = 1;

	/**
	 * The feature id for the '<em><b>Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ROUTE_INFO__DISTANCE = 2;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ROUTE_INFO__DURATION = 3;

	/**
	 * The feature id for the '<em><b>To Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ROUTE_INFO__TO_LOCATION = 4;

	/**
	 * The feature id for the '<em><b>With Geometry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ROUTE_INFO__WITH_GEOMETRY = 5;

	/**
	 * The feature id for the '<em><b>Geometry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ROUTE_INFO__GEOMETRY = 6;

	/**
	 * The number of structural features of the '<em>Route Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ROUTE_INFO_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Route Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ROUTE_INFO_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ROUTE_CALCULATOR__NAME = GIS_ROUTER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ROUTE_CALCULATOR__DESCRIPTION = GIS_ROUTER__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Route Calculator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ROUTE_CALCULATOR_FEATURE_COUNT = GIS_ROUTER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Route</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ROUTE_CALCULATOR___GET_ROUTE__GISLOCATION_GISLOCATION = GIS_ROUTER___GET_ROUTE__GISLOCATION_GISLOCATION;

	/**
	 * The operation id for the '<em>Get Routes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ROUTE_CALCULATOR___GET_ROUTES__ELIST_ELIST = GIS_ROUTER___GET_ROUTES__ELIST_ELIST;

	/**
	 * The number of operations of the '<em>Route Calculator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ROUTE_CALCULATOR_OPERATION_COUNT = GIS_ROUTER_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ROUTE_CALCULATOR_ONE_TO_ONE__NAME = GIS_ROUTE_CALCULATOR__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ROUTE_CALCULATOR_ONE_TO_ONE__DESCRIPTION = GIS_ROUTE_CALCULATOR__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Route Calculator One To One</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ROUTE_CALCULATOR_ONE_TO_ONE_FEATURE_COUNT = GIS_ROUTE_CALCULATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Route</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ROUTE_CALCULATOR_ONE_TO_ONE___GET_ROUTE__GISLOCATION_GISLOCATION = GIS_ROUTE_CALCULATOR___GET_ROUTE__GISLOCATION_GISLOCATION;

	/**
	 * The operation id for the '<em>Get Routes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ROUTE_CALCULATOR_ONE_TO_ONE___GET_ROUTES__ELIST_ELIST = GIS_ROUTE_CALCULATOR___GET_ROUTES__ELIST_ELIST;

	/**
	 * The number of operations of the '<em>Route Calculator One To One</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ROUTE_CALCULATOR_ONE_TO_ONE_OPERATION_COUNT = GIS_ROUTE_CALCULATOR_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ROUTE_CALCULATOR_MANY_TO_MANY__NAME = GIS_ROUTE_CALCULATOR__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ROUTE_CALCULATOR_MANY_TO_MANY__DESCRIPTION = GIS_ROUTE_CALCULATOR__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Route Calculator Many To Many</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ROUTE_CALCULATOR_MANY_TO_MANY_FEATURE_COUNT = GIS_ROUTE_CALCULATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Route</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ROUTE_CALCULATOR_MANY_TO_MANY___GET_ROUTE__GISLOCATION_GISLOCATION = GIS_ROUTE_CALCULATOR___GET_ROUTE__GISLOCATION_GISLOCATION;

	/**
	 * The operation id for the '<em>Get Routes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ROUTE_CALCULATOR_MANY_TO_MANY___GET_ROUTES__ELIST_ELIST = GIS_ROUTE_CALCULATOR___GET_ROUTES__ELIST_ELIST;

	/**
	 * The number of operations of the '<em>Route Calculator Many To Many</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ROUTE_CALCULATOR_MANY_TO_MANY_OPERATION_COUNT = GIS_ROUTE_CALCULATOR_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ROUTE_CALCULATOR_ONE_TO_MANY__NAME = GIS_ROUTE_CALCULATOR__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ROUTE_CALCULATOR_ONE_TO_MANY__DESCRIPTION = GIS_ROUTE_CALCULATOR__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Route Calculator One To Many</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ROUTE_CALCULATOR_ONE_TO_MANY_FEATURE_COUNT = GIS_ROUTE_CALCULATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Route</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ROUTE_CALCULATOR_ONE_TO_MANY___GET_ROUTE__GISLOCATION_GISLOCATION = GIS_ROUTE_CALCULATOR___GET_ROUTE__GISLOCATION_GISLOCATION;

	/**
	 * The operation id for the '<em>Get Routes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ROUTE_CALCULATOR_ONE_TO_MANY___GET_ROUTES__ELIST_ELIST = GIS_ROUTE_CALCULATOR___GET_ROUTES__ELIST_ELIST;

	/**
	 * The number of operations of the '<em>Route Calculator One To Many</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ROUTE_CALCULATOR_ONE_TO_MANY_OPERATION_COUNT = GIS_ROUTE_CALCULATOR_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ROUTER_GEODESIC__NAME = GIS_ROUTE_CALCULATOR_ONE_TO_ONE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ROUTER_GEODESIC__DESCRIPTION = GIS_ROUTE_CALCULATOR_ONE_TO_ONE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ROUTER_GEODESIC__SPEED = GIS_ROUTE_CALCULATOR_ONE_TO_ONE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Correction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ROUTER_GEODESIC__CORRECTION = GIS_ROUTE_CALCULATOR_ONE_TO_ONE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Router Geodesic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ROUTER_GEODESIC_FEATURE_COUNT = GIS_ROUTE_CALCULATOR_ONE_TO_ONE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Route</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ROUTER_GEODESIC___GET_ROUTE__GISLOCATION_GISLOCATION = GIS_ROUTE_CALCULATOR_ONE_TO_ONE___GET_ROUTE__GISLOCATION_GISLOCATION;

	/**
	 * The operation id for the '<em>Get Routes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ROUTER_GEODESIC___GET_ROUTES__ELIST_ELIST = GIS_ROUTE_CALCULATOR_ONE_TO_ONE___GET_ROUTES__ELIST_ELIST;

	/**
	 * The number of operations of the '<em>Router Geodesic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ROUTER_GEODESIC_OPERATION_COUNT = GIS_ROUTE_CALCULATOR_ONE_TO_ONE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ROUTER_DEFAULTED__NAME = GIS_ROUTER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ROUTER_DEFAULTED__DESCRIPTION = GIS_ROUTER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Primary Router</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ROUTER_DEFAULTED__PRIMARY_ROUTER = GIS_ROUTER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Secondary Router</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ROUTER_DEFAULTED__SECONDARY_ROUTER = GIS_ROUTER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Router Defaulted</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ROUTER_DEFAULTED_FEATURE_COUNT = GIS_ROUTER_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Route</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ROUTER_DEFAULTED___GET_ROUTE__GISLOCATION_GISLOCATION = GIS_ROUTER___GET_ROUTE__GISLOCATION_GISLOCATION;

	/**
	 * The operation id for the '<em>Get Routes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ROUTER_DEFAULTED___GET_ROUTES__ELIST_ELIST = GIS_ROUTER___GET_ROUTES__ELIST_ELIST;

	/**
	 * The number of operations of the '<em>Router Defaulted</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ROUTER_DEFAULTED_OPERATION_COUNT = GIS_ROUTER_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_GEOMETRY__DESCRIPTION = GIS_COORDINATES_ABSTRACT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Geocoded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_GEOMETRY__GEOCODED = GIS_COORDINATES_ABSTRACT__GEOCODED;

	/**
	 * The feature id for the '<em><b>Tools</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_GEOMETRY__TOOLS = GIS_COORDINATES_ABSTRACT__TOOLS;

	/**
	 * The feature id for the '<em><b>Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_GEOMETRY__LONGITUDE = GIS_COORDINATES_ABSTRACT__LONGITUDE;

	/**
	 * The feature id for the '<em><b>Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_GEOMETRY__LATITUDE = GIS_COORDINATES_ABSTRACT__LATITUDE;

	/**
	 * The number of structural features of the '<em>Geometry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_GEOMETRY_FEATURE_COUNT = GIS_COORDINATES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Coordinates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_GEOMETRY___GET_COORDINATES = GIS_COORDINATES_ABSTRACT___GET_COORDINATES;

	/**
	 * The operation id for the '<em>Add Tool</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_GEOMETRY___ADD_TOOL__GISTOOLLOCATION = GIS_COORDINATES_ABSTRACT___ADD_TOOL__GISTOOLLOCATION;

	/**
	 * The operation id for the '<em>Get Add Tool Feedback</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_GEOMETRY___GET_ADD_TOOL_FEEDBACK__GISTOOLLOCATION = GIS_COORDINATES_ABSTRACT___GET_ADD_TOOL_FEEDBACK__GISTOOLLOCATION;

	/**
	 * The number of operations of the '<em>Geometry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_GEOMETRY_OPERATION_COUNT = GIS_COORDINATES_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_LOCATION_PINPOINTER__NAME = GIS_TOOL_LOCATION__NAME;

	/**
	 * The number of structural features of the '<em>Location Pinpointer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_LOCATION_PINPOINTER_FEATURE_COUNT = GIS_TOOL_LOCATION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Handle</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_LOCATION_PINPOINTER___HANDLE__GISLOCATIONTOOL = GIS_TOOL_LOCATION___HANDLE__GISLOCATIONTOOL;

	/**
	 * The operation id for the '<em>Construct Location Tool</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_LOCATION_PINPOINTER___CONSTRUCT_LOCATION_TOOL = GIS_TOOL_LOCATION___CONSTRUCT_LOCATION_TOOL;

	/**
	 * The number of operations of the '<em>Location Pinpointer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_LOCATION_PINPOINTER_OPERATION_COUNT = GIS_TOOL_LOCATION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_LOCATION_PINPOINTED__DESCRIPTION = GIS_COORDINATES_ABSTRACT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Geocoded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_LOCATION_PINPOINTED__GEOCODED = GIS_COORDINATES_ABSTRACT__GEOCODED;

	/**
	 * The feature id for the '<em><b>Tools</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_LOCATION_PINPOINTED__TOOLS = GIS_COORDINATES_ABSTRACT__TOOLS;

	/**
	 * The feature id for the '<em><b>Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_LOCATION_PINPOINTED__LONGITUDE = GIS_COORDINATES_ABSTRACT__LONGITUDE;

	/**
	 * The feature id for the '<em><b>Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_LOCATION_PINPOINTED__LATITUDE = GIS_COORDINATES_ABSTRACT__LATITUDE;

	/**
	 * The feature id for the '<em><b>Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_LOCATION_PINPOINTED__DISTANCE = GIS_COORDINATES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location Pinpointed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_LOCATION_PINPOINTED__LOCATION_PINPOINTED = GIS_COORDINATES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Location Pinpointed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_LOCATION_PINPOINTED_FEATURE_COUNT = GIS_COORDINATES_ABSTRACT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Coordinates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_LOCATION_PINPOINTED___GET_COORDINATES = GIS_COORDINATES_ABSTRACT___GET_COORDINATES;

	/**
	 * The operation id for the '<em>Add Tool</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_LOCATION_PINPOINTED___ADD_TOOL__GISTOOLLOCATION = GIS_COORDINATES_ABSTRACT___ADD_TOOL__GISTOOLLOCATION;

	/**
	 * The operation id for the '<em>Get Add Tool Feedback</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_LOCATION_PINPOINTED___GET_ADD_TOOL_FEEDBACK__GISTOOLLOCATION = GIS_COORDINATES_ABSTRACT___GET_ADD_TOOL_FEEDBACK__GISTOOLLOCATION;

	/**
	 * The number of operations of the '<em>Location Pinpointed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_LOCATION_PINPOINTED_OPERATION_COUNT = GIS_COORDINATES_ABSTRACT_OPERATION_COUNT + 0;

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
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.gis.GisCoordinates#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.misc.common.moplaf.gis.GisCoordinates#getName()
	 * @see #getGisCoordinates()
	 * @generated
	 */
	EAttribute getGisCoordinates_Name();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.gis.GisGeometry <em>Geometry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Geometry</em>'.
	 * @see com.misc.common.moplaf.gis.GisGeometry
	 * @generated
	 */
	EClass getGisGeometry();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.gis.GisLocationPinpointed <em>Location Pinpointed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location Pinpointed</em>'.
	 * @see com.misc.common.moplaf.gis.GisLocationPinpointed
	 * @generated
	 */
	EClass getGisLocationPinpointed();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.gis.GisLocationPinpointed#getDistance <em>Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Distance</em>'.
	 * @see com.misc.common.moplaf.gis.GisLocationPinpointed#getDistance()
	 * @see #getGisLocationPinpointed()
	 * @generated
	 */
	EAttribute getGisLocationPinpointed_Distance();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.gis.GisLocationPinpointed#getLocationPinpointed <em>Location Pinpointed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location Pinpointed</em>'.
	 * @see com.misc.common.moplaf.gis.GisLocationPinpointed#getLocationPinpointed()
	 * @see #getGisLocationPinpointed()
	 * @generated
	 */
	EAttribute getGisLocationPinpointed_LocationPinpointed();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.gis.GisLocationPinpointer <em>Location Pinpointer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location Pinpointer</em>'.
	 * @see com.misc.common.moplaf.gis.GisLocationPinpointer
	 * @generated
	 */
	EClass getGisLocationPinpointer();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.gis.GisToolLocation <em>Tool Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tool Location</em>'.
	 * @see com.misc.common.moplaf.gis.GisToolLocation
	 * @generated
	 */
	EClass getGisToolLocation();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.gis.GisToolLocation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.misc.common.moplaf.gis.GisToolLocation#getName()
	 * @see #getGisToolLocation()
	 * @generated
	 */
	EAttribute getGisToolLocation_Name();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.gis.GisToolLocation#handle(com.misc.common.moplaf.gis.GisLocationTool) <em>Handle</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Handle</em>' operation.
	 * @see com.misc.common.moplaf.gis.GisToolLocation#handle(com.misc.common.moplaf.gis.GisLocationTool)
	 * @generated
	 */
	EOperation getGisToolLocation__Handle__GisLocationTool();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.gis.GisToolLocation#constructLocationTool() <em>Construct Location Tool</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Construct Location Tool</em>' operation.
	 * @see com.misc.common.moplaf.gis.GisToolLocation#constructLocationTool()
	 * @generated
	 */
	EOperation getGisToolLocation__ConstructLocationTool();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.gis.GisLocationTool <em>Location Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location Tool</em>'.
	 * @see com.misc.common.moplaf.gis.GisLocationTool
	 * @generated
	 */
	EClass getGisLocationTool();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.gis.GisLocationTool#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see com.misc.common.moplaf.gis.GisLocationTool#getDescription()
	 * @see #getGisLocationTool()
	 * @generated
	 */
	EAttribute getGisLocationTool_Description();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.gis.GisLocationTool#getTool <em>Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tool</em>'.
	 * @see com.misc.common.moplaf.gis.GisLocationTool#getTool()
	 * @see #getGisLocationTool()
	 * @generated
	 */
	EReference getGisLocationTool_Tool();

	/**
	 * Returns the meta object for the container reference '{@link com.misc.common.moplaf.gis.GisLocationTool#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Location</em>'.
	 * @see com.misc.common.moplaf.gis.GisLocationTool#getLocation()
	 * @see #getGisLocationTool()
	 * @generated
	 */
	EReference getGisLocationTool_Location();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.common.moplaf.gis.GisLocationTool#getResults <em>Results</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Results</em>'.
	 * @see com.misc.common.moplaf.gis.GisLocationTool#getResults()
	 * @see #getGisLocationTool()
	 * @generated
	 */
	EReference getGisLocationTool_Results();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.gis.GisLocationTool#getLastHandlingFeedback <em>Last Handling Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Handling Feedback</em>'.
	 * @see com.misc.common.moplaf.gis.GisLocationTool#getLastHandlingFeedback()
	 * @see #getGisLocationTool()
	 * @generated
	 */
	EAttribute getGisLocationTool_LastHandlingFeedback();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.gis.GisLocationTool#getDoToolFeedback <em>Do Tool Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Do Tool Feedback</em>'.
	 * @see com.misc.common.moplaf.gis.GisLocationTool#getDoToolFeedback()
	 * @see #getGisLocationTool()
	 * @generated
	 */
	EAttribute getGisLocationTool_DoToolFeedback();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.gis.GisLocationTool#doTool() <em>Do Tool</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Do Tool</em>' operation.
	 * @see com.misc.common.moplaf.gis.GisLocationTool#doTool()
	 * @generated
	 */
	EOperation getGisLocationTool__DoTool();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.gis.GisLocationTool#flushResults() <em>Flush Results</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Flush Results</em>' operation.
	 * @see com.misc.common.moplaf.gis.GisLocationTool#flushResults()
	 * @generated
	 */
	EOperation getGisLocationTool__FlushResults();

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
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.gis.GisAddress#getCountryCode <em>Country Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Country Code</em>'.
	 * @see com.misc.common.moplaf.gis.GisAddress#getCountryCode()
	 * @see #getGisAddress()
	 * @generated
	 */
	EAttribute getGisAddress_CountryCode();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.gis.GisAddress#getGeocodedSelected <em>Geocoded Selected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Geocoded Selected</em>'.
	 * @see com.misc.common.moplaf.gis.GisAddress#getGeocodedSelected()
	 * @see #getGisAddress()
	 * @generated
	 */
	EReference getGisAddress_GeocodedSelected();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.gis.GisAddress#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.misc.common.moplaf.gis.GisAddress#getName()
	 * @see #getGisAddress()
	 * @generated
	 */
	EAttribute getGisAddress_Name();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.gis.GisRoutesHolder <em>Routes Holder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Routes Holder</em>'.
	 * @see com.misc.common.moplaf.gis.GisRoutesHolder
	 * @generated
	 */
	EClass getGisRoutesHolder();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.common.moplaf.gis.GisRoutesHolder#getFromLocations <em>From Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>From Locations</em>'.
	 * @see com.misc.common.moplaf.gis.GisRoutesHolder#getFromLocations()
	 * @see #getGisRoutesHolder()
	 * @generated
	 */
	EReference getGisRoutesHolder_FromLocations();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.common.moplaf.gis.GisRoutesHolder#getToLocations <em>To Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>To Locations</em>'.
	 * @see com.misc.common.moplaf.gis.GisRoutesHolder#getToLocations()
	 * @see #getGisRoutesHolder()
	 * @generated
	 */
	EReference getGisRoutesHolder_ToLocations();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.gis.GisRoutesHolder#getSymmetrical <em>Symmetrical</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Symmetrical</em>'.
	 * @see com.misc.common.moplaf.gis.GisRoutesHolder#getSymmetrical()
	 * @see #getGisRoutesHolder()
	 * @generated
	 */
	EAttribute getGisRoutesHolder_Symmetrical();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.gis.GisRoutesHolder#getCalculator <em>Calculator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Calculator</em>'.
	 * @see com.misc.common.moplaf.gis.GisRoutesHolder#getCalculator()
	 * @see #getGisRoutesHolder()
	 * @generated
	 */
	EReference getGisRoutesHolder_Calculator();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.gis.GisRoutesHolder#getRefreshFeedback <em>Refresh Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Refresh Feedback</em>'.
	 * @see com.misc.common.moplaf.gis.GisRoutesHolder#getRefreshFeedback()
	 * @see #getGisRoutesHolder()
	 * @generated
	 */
	EAttribute getGisRoutesHolder_RefreshFeedback();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.gis.GisRoutesHolder#update(com.misc.common.moplaf.gis.GisRouteCalculator) <em>Update</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update</em>' operation.
	 * @see com.misc.common.moplaf.gis.GisRoutesHolder#update(com.misc.common.moplaf.gis.GisRouteCalculator)
	 * @generated
	 */
	EOperation getGisRoutesHolder__Update__GisRouteCalculator();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.gis.GisRoutesHolder#update(com.misc.common.moplaf.gis.GisRouteCalculator, org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList) <em>Update</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update</em>' operation.
	 * @see com.misc.common.moplaf.gis.GisRoutesHolder#update(com.misc.common.moplaf.gis.GisRouteCalculator, org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getGisRoutesHolder__Update__GisRouteCalculator_EList_EList();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.gis.GisRoutesHolder#addFromLocation(com.misc.common.moplaf.gis.GisLocation) <em>Add From Location</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add From Location</em>' operation.
	 * @see com.misc.common.moplaf.gis.GisRoutesHolder#addFromLocation(com.misc.common.moplaf.gis.GisLocation)
	 * @generated
	 */
	EOperation getGisRoutesHolder__AddFromLocation__GisLocation();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.gis.GisRoutesHolder#addToLocation(com.misc.common.moplaf.gis.GisLocation) <em>Add To Location</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add To Location</em>' operation.
	 * @see com.misc.common.moplaf.gis.GisRoutesHolder#addToLocation(com.misc.common.moplaf.gis.GisLocation)
	 * @generated
	 */
	EOperation getGisRoutesHolder__AddToLocation__GisLocation();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.gis.GisRoutesHolder#getFromLocation(com.misc.common.moplaf.gis.GisLocation) <em>Get From Location</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get From Location</em>' operation.
	 * @see com.misc.common.moplaf.gis.GisRoutesHolder#getFromLocation(com.misc.common.moplaf.gis.GisLocation)
	 * @generated
	 */
	EOperation getGisRoutesHolder__GetFromLocation__GisLocation();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.gis.GisRoutesHolder#getToLocation(com.misc.common.moplaf.gis.GisLocation) <em>Get To Location</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get To Location</em>' operation.
	 * @see com.misc.common.moplaf.gis.GisRoutesHolder#getToLocation(com.misc.common.moplaf.gis.GisLocation)
	 * @generated
	 */
	EOperation getGisRoutesHolder__GetToLocation__GisLocation();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.gis.GisRoutesHolder#refresh() <em>Refresh</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Refresh</em>' operation.
	 * @see com.misc.common.moplaf.gis.GisRoutesHolder#refresh()
	 * @generated
	 */
	EOperation getGisRoutesHolder__Refresh();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.gis.GisRoutesHolder#flush() <em>Flush</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Flush</em>' operation.
	 * @see com.misc.common.moplaf.gis.GisRoutesHolder#flush()
	 * @generated
	 */
	EOperation getGisRoutesHolder__Flush();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.gis.GisRoutesHolder#clear() <em>Clear</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Clear</em>' operation.
	 * @see com.misc.common.moplaf.gis.GisRoutesHolder#clear()
	 * @generated
	 */
	EOperation getGisRoutesHolder__Clear();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.gis.GisRoutesHolderWaypoint <em>Routes Holder Waypoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Routes Holder Waypoint</em>'.
	 * @see com.misc.common.moplaf.gis.GisRoutesHolderWaypoint
	 * @generated
	 */
	EClass getGisRoutesHolderWaypoint();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.gis.GisRoutesHolderWaypoint#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Location</em>'.
	 * @see com.misc.common.moplaf.gis.GisRoutesHolderWaypoint#getLocation()
	 * @see #getGisRoutesHolderWaypoint()
	 * @generated
	 */
	EReference getGisRoutesHolderWaypoint_Location();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.gis.GisRoutesHolderWaypoint#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see com.misc.common.moplaf.gis.GisRoutesHolderWaypoint#getDescription()
	 * @see #getGisRoutesHolderWaypoint()
	 * @generated
	 */
	EAttribute getGisRoutesHolderWaypoint_Description();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.gis.GisRoutesHolderFromLocation <em>Routes Holder From Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Routes Holder From Location</em>'.
	 * @see com.misc.common.moplaf.gis.GisRoutesHolderFromLocation
	 * @generated
	 */
	EClass getGisRoutesHolderFromLocation();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.common.moplaf.gis.GisRoutesHolderFromLocation#getToLocations <em>To Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>To Locations</em>'.
	 * @see com.misc.common.moplaf.gis.GisRoutesHolderFromLocation#getToLocations()
	 * @see #getGisRoutesHolderFromLocation()
	 * @generated
	 */
	EReference getGisRoutesHolderFromLocation_ToLocations();

	/**
	 * Returns the meta object for the container reference '{@link com.misc.common.moplaf.gis.GisRoutesHolderFromLocation#getRoutesHolder <em>Routes Holder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Routes Holder</em>'.
	 * @see com.misc.common.moplaf.gis.GisRoutesHolderFromLocation#getRoutesHolder()
	 * @see #getGisRoutesHolderFromLocation()
	 * @generated
	 */
	EReference getGisRoutesHolderFromLocation_RoutesHolder();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.gis.GisRoutesHolderFromLocation#getElement(com.misc.common.moplaf.gis.GisLocation) <em>Get Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Element</em>' operation.
	 * @see com.misc.common.moplaf.gis.GisRoutesHolderFromLocation#getElement(com.misc.common.moplaf.gis.GisLocation)
	 * @generated
	 */
	EOperation getGisRoutesHolderFromLocation__GetElement__GisLocation();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.gis.GisRoutesHolderFromLocation#addElement(com.misc.common.moplaf.gis.GisRoutesHolderToLocation) <em>Add Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Element</em>' operation.
	 * @see com.misc.common.moplaf.gis.GisRoutesHolderFromLocation#addElement(com.misc.common.moplaf.gis.GisRoutesHolderToLocation)
	 * @generated
	 */
	EOperation getGisRoutesHolderFromLocation__AddElement__GisRoutesHolderToLocation();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.gis.GisRoutesHolderFromLocation#update(com.misc.common.moplaf.gis.GisRouteCalculator) <em>Update</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update</em>' operation.
	 * @see com.misc.common.moplaf.gis.GisRoutesHolderFromLocation#update(com.misc.common.moplaf.gis.GisRouteCalculator)
	 * @generated
	 */
	EOperation getGisRoutesHolderFromLocation__Update__GisRouteCalculator();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.gis.GisRoutesHolderFromLocation#refresh() <em>Refresh</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Refresh</em>' operation.
	 * @see com.misc.common.moplaf.gis.GisRoutesHolderFromLocation#refresh()
	 * @generated
	 */
	EOperation getGisRoutesHolderFromLocation__Refresh();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.gis.GisRoutesHolderFromLocation#remove() <em>Remove</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove</em>' operation.
	 * @see com.misc.common.moplaf.gis.GisRoutesHolderFromLocation#remove()
	 * @generated
	 */
	EOperation getGisRoutesHolderFromLocation__Remove();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.gis.GisRoutesHolderToLocation <em>Routes Holder To Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Routes Holder To Location</em>'.
	 * @see com.misc.common.moplaf.gis.GisRoutesHolderToLocation
	 * @generated
	 */
	EClass getGisRoutesHolderToLocation();

	/**
	 * Returns the meta object for the reference list '{@link com.misc.common.moplaf.gis.GisRoutesHolderToLocation#getFromLocations <em>From Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>From Locations</em>'.
	 * @see com.misc.common.moplaf.gis.GisRoutesHolderToLocation#getFromLocations()
	 * @see #getGisRoutesHolderToLocation()
	 * @generated
	 */
	EReference getGisRoutesHolderToLocation_FromLocations();

	/**
	 * Returns the meta object for the container reference '{@link com.misc.common.moplaf.gis.GisRoutesHolderToLocation#getRoutesHolder <em>Routes Holder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Routes Holder</em>'.
	 * @see com.misc.common.moplaf.gis.GisRoutesHolderToLocation#getRoutesHolder()
	 * @see #getGisRoutesHolderToLocation()
	 * @generated
	 */
	EReference getGisRoutesHolderToLocation_RoutesHolder();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.gis.GisRoutesHolderToLocation#getElement(com.misc.common.moplaf.gis.GisLocation) <em>Get Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Element</em>' operation.
	 * @see com.misc.common.moplaf.gis.GisRoutesHolderToLocation#getElement(com.misc.common.moplaf.gis.GisLocation)
	 * @generated
	 */
	EOperation getGisRoutesHolderToLocation__GetElement__GisLocation();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.gis.GisRoutesHolderToLocation#addElement(com.misc.common.moplaf.gis.GisRoutesHolderFromLocation) <em>Add Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Element</em>' operation.
	 * @see com.misc.common.moplaf.gis.GisRoutesHolderToLocation#addElement(com.misc.common.moplaf.gis.GisRoutesHolderFromLocation)
	 * @generated
	 */
	EOperation getGisRoutesHolderToLocation__AddElement__GisRoutesHolderFromLocation();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.gis.GisRoutesHolderToLocation#update(com.misc.common.moplaf.gis.GisRouteCalculator) <em>Update</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update</em>' operation.
	 * @see com.misc.common.moplaf.gis.GisRoutesHolderToLocation#update(com.misc.common.moplaf.gis.GisRouteCalculator)
	 * @generated
	 */
	EOperation getGisRoutesHolderToLocation__Update__GisRouteCalculator();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.gis.GisRoutesHolderToLocation#refresh() <em>Refresh</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Refresh</em>' operation.
	 * @see com.misc.common.moplaf.gis.GisRoutesHolderToLocation#refresh()
	 * @generated
	 */
	EOperation getGisRoutesHolderToLocation__Refresh();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.gis.GisRoutesHolderToLocation#remove() <em>Remove</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove</em>' operation.
	 * @see com.misc.common.moplaf.gis.GisRoutesHolderToLocation#remove()
	 * @generated
	 */
	EOperation getGisRoutesHolderToLocation__Remove();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.gis.GisRoutesHolderElement <em>Routes Holder Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Routes Holder Element</em>'.
	 * @see com.misc.common.moplaf.gis.GisRoutesHolderElement
	 * @generated
	 */
	EClass getGisRoutesHolderElement();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.gis.GisRoutesHolderElement#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see com.misc.common.moplaf.gis.GisRoutesHolderElement#getDescription()
	 * @see #getGisRoutesHolderElement()
	 * @generated
	 */
	EAttribute getGisRoutesHolderElement_Description();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.gis.GisRoutesHolderElement#getToLocation <em>To Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To Location</em>'.
	 * @see com.misc.common.moplaf.gis.GisRoutesHolderElement#getToLocation()
	 * @see #getGisRoutesHolderElement()
	 * @generated
	 */
	EReference getGisRoutesHolderElement_ToLocation();

	/**
	 * Returns the meta object for the container reference '{@link com.misc.common.moplaf.gis.GisRoutesHolderElement#getFromLocation <em>From Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>From Location</em>'.
	 * @see com.misc.common.moplaf.gis.GisRoutesHolderElement#getFromLocation()
	 * @see #getGisRoutesHolderElement()
	 * @generated
	 */
	EReference getGisRoutesHolderElement_FromLocation();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.common.moplaf.gis.GisRoutesHolderElement#getRoutesInfo <em>Routes Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Routes Info</em>'.
	 * @see com.misc.common.moplaf.gis.GisRoutesHolderElement#getRoutesInfo()
	 * @see #getGisRoutesHolderElement()
	 * @generated
	 */
	EReference getGisRoutesHolderElement_RoutesInfo();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.gis.GisRoutesHolderElement#isCalculated <em>Calculated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Calculated</em>'.
	 * @see com.misc.common.moplaf.gis.GisRoutesHolderElement#isCalculated()
	 * @see #getGisRoutesHolderElement()
	 * @generated
	 */
	EAttribute getGisRoutesHolderElement_Calculated();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.gis.GisRoutesHolderElement#update(com.misc.common.moplaf.gis.GisRouteCalculator) <em>Update</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update</em>' operation.
	 * @see com.misc.common.moplaf.gis.GisRoutesHolderElement#update(com.misc.common.moplaf.gis.GisRouteCalculator)
	 * @generated
	 */
	EOperation getGisRoutesHolderElement__Update__GisRouteCalculator();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.gis.GisRoutesHolderElement#refresh() <em>Refresh</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Refresh</em>' operation.
	 * @see com.misc.common.moplaf.gis.GisRoutesHolderElement#refresh()
	 * @generated
	 */
	EOperation getGisRoutesHolderElement__Refresh();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.gis.GisRoutesHolderElement#remove() <em>Remove</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove</em>' operation.
	 * @see com.misc.common.moplaf.gis.GisRoutesHolderElement#remove()
	 * @generated
	 */
	EOperation getGisRoutesHolderElement__Remove();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.gis.GisRouteInfo <em>Route Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Route Info</em>'.
	 * @see com.misc.common.moplaf.gis.GisRouteInfo
	 * @generated
	 */
	EClass getGisRouteInfo();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.gis.GisRouteInfo#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see com.misc.common.moplaf.gis.GisRouteInfo#getDescription()
	 * @see #getGisRouteInfo()
	 * @generated
	 */
	EAttribute getGisRouteInfo_Description();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.gis.GisRouteInfo#getFromLocation <em>From Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From Location</em>'.
	 * @see com.misc.common.moplaf.gis.GisRouteInfo#getFromLocation()
	 * @see #getGisRouteInfo()
	 * @generated
	 */
	EReference getGisRouteInfo_FromLocation();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.gis.GisRouteInfo#getDistance <em>Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Distance</em>'.
	 * @see com.misc.common.moplaf.gis.GisRouteInfo#getDistance()
	 * @see #getGisRouteInfo()
	 * @generated
	 */
	EAttribute getGisRouteInfo_Distance();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.gis.GisRouteInfo#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see com.misc.common.moplaf.gis.GisRouteInfo#getDuration()
	 * @see #getGisRouteInfo()
	 * @generated
	 */
	EAttribute getGisRouteInfo_Duration();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.gis.GisRouteInfo#getToLocation <em>To Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To Location</em>'.
	 * @see com.misc.common.moplaf.gis.GisRouteInfo#getToLocation()
	 * @see #getGisRouteInfo()
	 * @generated
	 */
	EReference getGisRouteInfo_ToLocation();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.gis.GisRouteInfo#isWithGeometry <em>With Geometry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>With Geometry</em>'.
	 * @see com.misc.common.moplaf.gis.GisRouteInfo#isWithGeometry()
	 * @see #getGisRouteInfo()
	 * @generated
	 */
	EAttribute getGisRouteInfo_WithGeometry();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.common.moplaf.gis.GisRouteInfo#getGeometry <em>Geometry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Geometry</em>'.
	 * @see com.misc.common.moplaf.gis.GisRouteInfo#getGeometry()
	 * @see #getGisRouteInfo()
	 * @generated
	 */
	EReference getGisRouteInfo_Geometry();

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
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.gis.GisAddressGeocoded#getAddressGeocoded <em>Address Geocoded</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address Geocoded</em>'.
	 * @see com.misc.common.moplaf.gis.GisAddressGeocoded#getAddressGeocoded()
	 * @see #getGisAddressGeocoded()
	 * @generated
	 */
	EAttribute getGisAddressGeocoded_AddressGeocoded();

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
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.gis.GisLocation#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see com.misc.common.moplaf.gis.GisLocation#getDescription()
	 * @see #getGisLocation()
	 * @generated
	 */
	EAttribute getGisLocation_Description();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.gis.GisLocation#isGeocoded <em>Geocoded</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Geocoded</em>'.
	 * @see com.misc.common.moplaf.gis.GisLocation#isGeocoded()
	 * @see #getGisLocation()
	 * @generated
	 */
	EAttribute getGisLocation_Geocoded();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.common.moplaf.gis.GisLocation#getTools <em>Tools</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tools</em>'.
	 * @see com.misc.common.moplaf.gis.GisLocation#getTools()
	 * @see #getGisLocation()
	 * @generated
	 */
	EReference getGisLocation_Tools();

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
	 * Returns the meta object for the '{@link com.misc.common.moplaf.gis.GisLocation#addTool(com.misc.common.moplaf.gis.GisToolLocation) <em>Add Tool</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Tool</em>' operation.
	 * @see com.misc.common.moplaf.gis.GisLocation#addTool(com.misc.common.moplaf.gis.GisToolLocation)
	 * @generated
	 */
	EOperation getGisLocation__AddTool__GisToolLocation();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.gis.GisLocation#getAddToolFeedback(com.misc.common.moplaf.gis.GisToolLocation) <em>Get Add Tool Feedback</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Add Tool Feedback</em>' operation.
	 * @see com.misc.common.moplaf.gis.GisLocation#getAddToolFeedback(com.misc.common.moplaf.gis.GisToolLocation)
	 * @generated
	 */
	EOperation getGisLocation__GetAddToolFeedback__GisToolLocation();

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
	 * Returns the meta object for class '{@link com.misc.common.moplaf.gis.GisRouteCalculator <em>Route Calculator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Route Calculator</em>'.
	 * @see com.misc.common.moplaf.gis.GisRouteCalculator
	 * @generated
	 */
	EClass getGisRouteCalculator();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.gis.GisAddressStructured <em>Address Structured</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Address Structured</em>'.
	 * @see com.misc.common.moplaf.gis.GisAddressStructured
	 * @generated
	 */
	EClass getGisAddressStructured();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.gis.GisAddressStructured#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Country</em>'.
	 * @see com.misc.common.moplaf.gis.GisAddressStructured#getCountry()
	 * @see #getGisAddressStructured()
	 * @generated
	 */
	EAttribute getGisAddressStructured_Country();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.gis.GisAddressStructured#getAdministrativeArea <em>Administrative Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Administrative Area</em>'.
	 * @see com.misc.common.moplaf.gis.GisAddressStructured#getAdministrativeArea()
	 * @see #getGisAddressStructured()
	 * @generated
	 */
	EAttribute getGisAddressStructured_AdministrativeArea();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.gis.GisAddressStructured#getPostalCode <em>Postal Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Postal Code</em>'.
	 * @see com.misc.common.moplaf.gis.GisAddressStructured#getPostalCode()
	 * @see #getGisAddressStructured()
	 * @generated
	 */
	EAttribute getGisAddressStructured_PostalCode();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.gis.GisAddressStructured#getLocality <em>Locality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Locality</em>'.
	 * @see com.misc.common.moplaf.gis.GisAddressStructured#getLocality()
	 * @see #getGisAddressStructured()
	 * @generated
	 */
	EAttribute getGisAddressStructured_Locality();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.gis.GisAddressStructured#getStreet <em>Street</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Street</em>'.
	 * @see com.misc.common.moplaf.gis.GisAddressStructured#getStreet()
	 * @see #getGisAddressStructured()
	 * @generated
	 */
	EAttribute getGisAddressStructured_Street();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.gis.GisAddressStructured#getBuildingNumber <em>Building Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Building Number</em>'.
	 * @see com.misc.common.moplaf.gis.GisAddressStructured#getBuildingNumber()
	 * @see #getGisAddressStructured()
	 * @generated
	 */
	EAttribute getGisAddressStructured_BuildingNumber();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.gis.GisAddressUnstructured <em>Address Unstructured</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Address Unstructured</em>'.
	 * @see com.misc.common.moplaf.gis.GisAddressUnstructured
	 * @generated
	 */
	EClass getGisAddressUnstructured();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.gis.GisAddressUnstructured#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see com.misc.common.moplaf.gis.GisAddressUnstructured#getAddress()
	 * @see #getGisAddressUnstructured()
	 * @generated
	 */
	EAttribute getGisAddressUnstructured_Address();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.gis.GisRouter <em>Router</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Router</em>'.
	 * @see com.misc.common.moplaf.gis.GisRouter
	 * @generated
	 */
	EClass getGisRouter();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.gis.GisRouter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.misc.common.moplaf.gis.GisRouter#getName()
	 * @see #getGisRouter()
	 * @generated
	 */
	EAttribute getGisRouter_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.gis.GisRouter#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see com.misc.common.moplaf.gis.GisRouter#getDescription()
	 * @see #getGisRouter()
	 * @generated
	 */
	EAttribute getGisRouter_Description();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.gis.GisRouter#getRoute(com.misc.common.moplaf.gis.GisLocation, com.misc.common.moplaf.gis.GisLocation) <em>Get Route</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Route</em>' operation.
	 * @see com.misc.common.moplaf.gis.GisRouter#getRoute(com.misc.common.moplaf.gis.GisLocation, com.misc.common.moplaf.gis.GisLocation)
	 * @generated
	 */
	EOperation getGisRouter__GetRoute__GisLocation_GisLocation();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.gis.GisRouter#getRoutes(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList) <em>Get Routes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Routes</em>' operation.
	 * @see com.misc.common.moplaf.gis.GisRouter#getRoutes(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getGisRouter__GetRoutes__EList_EList();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.gis.GisRouteCalculatorOneToOne <em>Route Calculator One To One</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Route Calculator One To One</em>'.
	 * @see com.misc.common.moplaf.gis.GisRouteCalculatorOneToOne
	 * @generated
	 */
	EClass getGisRouteCalculatorOneToOne();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.gis.GisRouteCalculatorManyToMany <em>Route Calculator Many To Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Route Calculator Many To Many</em>'.
	 * @see com.misc.common.moplaf.gis.GisRouteCalculatorManyToMany
	 * @generated
	 */
	EClass getGisRouteCalculatorManyToMany();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.gis.GisRouteCalculatorOneToMany <em>Route Calculator One To Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Route Calculator One To Many</em>'.
	 * @see com.misc.common.moplaf.gis.GisRouteCalculatorOneToMany
	 * @generated
	 */
	EClass getGisRouteCalculatorOneToMany();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.gis.GisRouterGeodesic <em>Router Geodesic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Router Geodesic</em>'.
	 * @see com.misc.common.moplaf.gis.GisRouterGeodesic
	 * @generated
	 */
	EClass getGisRouterGeodesic();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.gis.GisRouterGeodesic#getSpeed <em>Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Speed</em>'.
	 * @see com.misc.common.moplaf.gis.GisRouterGeodesic#getSpeed()
	 * @see #getGisRouterGeodesic()
	 * @generated
	 */
	EAttribute getGisRouterGeodesic_Speed();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.gis.GisRouterGeodesic#getCorrection <em>Correction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Correction</em>'.
	 * @see com.misc.common.moplaf.gis.GisRouterGeodesic#getCorrection()
	 * @see #getGisRouterGeodesic()
	 * @generated
	 */
	EAttribute getGisRouterGeodesic_Correction();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.gis.GisRouterDefaulted <em>Router Defaulted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Router Defaulted</em>'.
	 * @see com.misc.common.moplaf.gis.GisRouterDefaulted
	 * @generated
	 */
	EClass getGisRouterDefaulted();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.gis.GisRouterDefaulted#getPrimaryRouter <em>Primary Router</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Primary Router</em>'.
	 * @see com.misc.common.moplaf.gis.GisRouterDefaulted#getPrimaryRouter()
	 * @see #getGisRouterDefaulted()
	 * @generated
	 */
	EReference getGisRouterDefaulted_PrimaryRouter();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.gis.GisRouterDefaulted#getSecondaryRouter <em>Secondary Router</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Secondary Router</em>'.
	 * @see com.misc.common.moplaf.gis.GisRouterDefaulted#getSecondaryRouter()
	 * @see #getGisRouterDefaulted()
	 * @generated
	 */
	EReference getGisRouterDefaulted_SecondaryRouter();

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
		 * The meta object literal for the '{@link com.misc.common.moplaf.gis.impl.GisCoordinatesAbstractImpl <em>Coordinates Abstract</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.gis.impl.GisCoordinatesAbstractImpl
		 * @see com.misc.common.moplaf.gis.impl.GisPackageImpl#getGisCoordinatesAbstract()
		 * @generated
		 */
		EClass GIS_COORDINATES_ABSTRACT = eINSTANCE.getGisCoordinatesAbstract();

		/**
		 * The meta object literal for the '<em><b>Longitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GIS_COORDINATES_ABSTRACT__LONGITUDE = eINSTANCE.getGisCoordinatesAbstract_Longitude();

		/**
		 * The meta object literal for the '<em><b>Latitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GIS_COORDINATES_ABSTRACT__LATITUDE = eINSTANCE.getGisCoordinatesAbstract_Latitude();

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
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GIS_COORDINATES__NAME = eINSTANCE.getGisCoordinates_Name();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.gis.impl.GisGeometryImpl <em>Geometry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.gis.impl.GisGeometryImpl
		 * @see com.misc.common.moplaf.gis.impl.GisPackageImpl#getGisGeometry()
		 * @generated
		 */
		EClass GIS_GEOMETRY = eINSTANCE.getGisGeometry();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.gis.impl.GisLocationPinpointedImpl <em>Location Pinpointed</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.gis.impl.GisLocationPinpointedImpl
		 * @see com.misc.common.moplaf.gis.impl.GisPackageImpl#getGisLocationPinpointed()
		 * @generated
		 */
		EClass GIS_LOCATION_PINPOINTED = eINSTANCE.getGisLocationPinpointed();

		/**
		 * The meta object literal for the '<em><b>Distance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GIS_LOCATION_PINPOINTED__DISTANCE = eINSTANCE.getGisLocationPinpointed_Distance();

		/**
		 * The meta object literal for the '<em><b>Location Pinpointed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GIS_LOCATION_PINPOINTED__LOCATION_PINPOINTED = eINSTANCE.getGisLocationPinpointed_LocationPinpointed();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.gis.impl.GisLocationPinpointerImpl <em>Location Pinpointer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.gis.impl.GisLocationPinpointerImpl
		 * @see com.misc.common.moplaf.gis.impl.GisPackageImpl#getGisLocationPinpointer()
		 * @generated
		 */
		EClass GIS_LOCATION_PINPOINTER = eINSTANCE.getGisLocationPinpointer();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.gis.impl.GisToolLocationImpl <em>Tool Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.gis.impl.GisToolLocationImpl
		 * @see com.misc.common.moplaf.gis.impl.GisPackageImpl#getGisToolLocation()
		 * @generated
		 */
		EClass GIS_TOOL_LOCATION = eINSTANCE.getGisToolLocation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GIS_TOOL_LOCATION__NAME = eINSTANCE.getGisToolLocation_Name();

		/**
		 * The meta object literal for the '<em><b>Handle</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GIS_TOOL_LOCATION___HANDLE__GISLOCATIONTOOL = eINSTANCE.getGisToolLocation__Handle__GisLocationTool();

		/**
		 * The meta object literal for the '<em><b>Construct Location Tool</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GIS_TOOL_LOCATION___CONSTRUCT_LOCATION_TOOL = eINSTANCE.getGisToolLocation__ConstructLocationTool();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.gis.impl.GisLocationToolImpl <em>Location Tool</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.gis.impl.GisLocationToolImpl
		 * @see com.misc.common.moplaf.gis.impl.GisPackageImpl#getGisLocationTool()
		 * @generated
		 */
		EClass GIS_LOCATION_TOOL = eINSTANCE.getGisLocationTool();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GIS_LOCATION_TOOL__DESCRIPTION = eINSTANCE.getGisLocationTool_Description();

		/**
		 * The meta object literal for the '<em><b>Tool</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GIS_LOCATION_TOOL__TOOL = eINSTANCE.getGisLocationTool_Tool();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GIS_LOCATION_TOOL__LOCATION = eINSTANCE.getGisLocationTool_Location();

		/**
		 * The meta object literal for the '<em><b>Results</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GIS_LOCATION_TOOL__RESULTS = eINSTANCE.getGisLocationTool_Results();

		/**
		 * The meta object literal for the '<em><b>Last Handling Feedback</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GIS_LOCATION_TOOL__LAST_HANDLING_FEEDBACK = eINSTANCE.getGisLocationTool_LastHandlingFeedback();

		/**
		 * The meta object literal for the '<em><b>Do Tool Feedback</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GIS_LOCATION_TOOL__DO_TOOL_FEEDBACK = eINSTANCE.getGisLocationTool_DoToolFeedback();

		/**
		 * The meta object literal for the '<em><b>Do Tool</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GIS_LOCATION_TOOL___DO_TOOL = eINSTANCE.getGisLocationTool__DoTool();

		/**
		 * The meta object literal for the '<em><b>Flush Results</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GIS_LOCATION_TOOL___FLUSH_RESULTS = eINSTANCE.getGisLocationTool__FlushResults();

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
		 * The meta object literal for the '<em><b>Country Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GIS_ADDRESS__COUNTRY_CODE = eINSTANCE.getGisAddress_CountryCode();

		/**
		 * The meta object literal for the '<em><b>Geocoded Selected</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GIS_ADDRESS__GEOCODED_SELECTED = eINSTANCE.getGisAddress_GeocodedSelected();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GIS_ADDRESS__NAME = eINSTANCE.getGisAddress_Name();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.gis.impl.GisRoutesHolderImpl <em>Routes Holder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.gis.impl.GisRoutesHolderImpl
		 * @see com.misc.common.moplaf.gis.impl.GisPackageImpl#getGisRoutesHolder()
		 * @generated
		 */
		EClass GIS_ROUTES_HOLDER = eINSTANCE.getGisRoutesHolder();

		/**
		 * The meta object literal for the '<em><b>From Locations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GIS_ROUTES_HOLDER__FROM_LOCATIONS = eINSTANCE.getGisRoutesHolder_FromLocations();

		/**
		 * The meta object literal for the '<em><b>To Locations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GIS_ROUTES_HOLDER__TO_LOCATIONS = eINSTANCE.getGisRoutesHolder_ToLocations();

		/**
		 * The meta object literal for the '<em><b>Symmetrical</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GIS_ROUTES_HOLDER__SYMMETRICAL = eINSTANCE.getGisRoutesHolder_Symmetrical();

		/**
		 * The meta object literal for the '<em><b>Calculator</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GIS_ROUTES_HOLDER__CALCULATOR = eINSTANCE.getGisRoutesHolder_Calculator();

		/**
		 * The meta object literal for the '<em><b>Refresh Feedback</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GIS_ROUTES_HOLDER__REFRESH_FEEDBACK = eINSTANCE.getGisRoutesHolder_RefreshFeedback();

		/**
		 * The meta object literal for the '<em><b>Update</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GIS_ROUTES_HOLDER___UPDATE__GISROUTECALCULATOR = eINSTANCE.getGisRoutesHolder__Update__GisRouteCalculator();

		/**
		 * The meta object literal for the '<em><b>Update</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GIS_ROUTES_HOLDER___UPDATE__GISROUTECALCULATOR_ELIST_ELIST = eINSTANCE.getGisRoutesHolder__Update__GisRouteCalculator_EList_EList();

		/**
		 * The meta object literal for the '<em><b>Add From Location</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GIS_ROUTES_HOLDER___ADD_FROM_LOCATION__GISLOCATION = eINSTANCE.getGisRoutesHolder__AddFromLocation__GisLocation();

		/**
		 * The meta object literal for the '<em><b>Add To Location</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GIS_ROUTES_HOLDER___ADD_TO_LOCATION__GISLOCATION = eINSTANCE.getGisRoutesHolder__AddToLocation__GisLocation();

		/**
		 * The meta object literal for the '<em><b>Get From Location</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GIS_ROUTES_HOLDER___GET_FROM_LOCATION__GISLOCATION = eINSTANCE.getGisRoutesHolder__GetFromLocation__GisLocation();

		/**
		 * The meta object literal for the '<em><b>Get To Location</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GIS_ROUTES_HOLDER___GET_TO_LOCATION__GISLOCATION = eINSTANCE.getGisRoutesHolder__GetToLocation__GisLocation();

		/**
		 * The meta object literal for the '<em><b>Refresh</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GIS_ROUTES_HOLDER___REFRESH = eINSTANCE.getGisRoutesHolder__Refresh();

		/**
		 * The meta object literal for the '<em><b>Flush</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GIS_ROUTES_HOLDER___FLUSH = eINSTANCE.getGisRoutesHolder__Flush();

		/**
		 * The meta object literal for the '<em><b>Clear</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GIS_ROUTES_HOLDER___CLEAR = eINSTANCE.getGisRoutesHolder__Clear();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.gis.impl.GisRoutesHolderWaypointImpl <em>Routes Holder Waypoint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.gis.impl.GisRoutesHolderWaypointImpl
		 * @see com.misc.common.moplaf.gis.impl.GisPackageImpl#getGisRoutesHolderWaypoint()
		 * @generated
		 */
		EClass GIS_ROUTES_HOLDER_WAYPOINT = eINSTANCE.getGisRoutesHolderWaypoint();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GIS_ROUTES_HOLDER_WAYPOINT__LOCATION = eINSTANCE.getGisRoutesHolderWaypoint_Location();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GIS_ROUTES_HOLDER_WAYPOINT__DESCRIPTION = eINSTANCE.getGisRoutesHolderWaypoint_Description();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.gis.impl.GisRoutesHolderFromLocationImpl <em>Routes Holder From Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.gis.impl.GisRoutesHolderFromLocationImpl
		 * @see com.misc.common.moplaf.gis.impl.GisPackageImpl#getGisRoutesHolderFromLocation()
		 * @generated
		 */
		EClass GIS_ROUTES_HOLDER_FROM_LOCATION = eINSTANCE.getGisRoutesHolderFromLocation();

		/**
		 * The meta object literal for the '<em><b>To Locations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GIS_ROUTES_HOLDER_FROM_LOCATION__TO_LOCATIONS = eINSTANCE.getGisRoutesHolderFromLocation_ToLocations();

		/**
		 * The meta object literal for the '<em><b>Routes Holder</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GIS_ROUTES_HOLDER_FROM_LOCATION__ROUTES_HOLDER = eINSTANCE.getGisRoutesHolderFromLocation_RoutesHolder();

		/**
		 * The meta object literal for the '<em><b>Get Element</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GIS_ROUTES_HOLDER_FROM_LOCATION___GET_ELEMENT__GISLOCATION = eINSTANCE.getGisRoutesHolderFromLocation__GetElement__GisLocation();

		/**
		 * The meta object literal for the '<em><b>Add Element</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GIS_ROUTES_HOLDER_FROM_LOCATION___ADD_ELEMENT__GISROUTESHOLDERTOLOCATION = eINSTANCE.getGisRoutesHolderFromLocation__AddElement__GisRoutesHolderToLocation();

		/**
		 * The meta object literal for the '<em><b>Update</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GIS_ROUTES_HOLDER_FROM_LOCATION___UPDATE__GISROUTECALCULATOR = eINSTANCE.getGisRoutesHolderFromLocation__Update__GisRouteCalculator();

		/**
		 * The meta object literal for the '<em><b>Refresh</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GIS_ROUTES_HOLDER_FROM_LOCATION___REFRESH = eINSTANCE.getGisRoutesHolderFromLocation__Refresh();

		/**
		 * The meta object literal for the '<em><b>Remove</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GIS_ROUTES_HOLDER_FROM_LOCATION___REMOVE = eINSTANCE.getGisRoutesHolderFromLocation__Remove();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.gis.impl.GisRoutesHolderToLocationImpl <em>Routes Holder To Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.gis.impl.GisRoutesHolderToLocationImpl
		 * @see com.misc.common.moplaf.gis.impl.GisPackageImpl#getGisRoutesHolderToLocation()
		 * @generated
		 */
		EClass GIS_ROUTES_HOLDER_TO_LOCATION = eINSTANCE.getGisRoutesHolderToLocation();

		/**
		 * The meta object literal for the '<em><b>From Locations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GIS_ROUTES_HOLDER_TO_LOCATION__FROM_LOCATIONS = eINSTANCE.getGisRoutesHolderToLocation_FromLocations();

		/**
		 * The meta object literal for the '<em><b>Routes Holder</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GIS_ROUTES_HOLDER_TO_LOCATION__ROUTES_HOLDER = eINSTANCE.getGisRoutesHolderToLocation_RoutesHolder();

		/**
		 * The meta object literal for the '<em><b>Get Element</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GIS_ROUTES_HOLDER_TO_LOCATION___GET_ELEMENT__GISLOCATION = eINSTANCE.getGisRoutesHolderToLocation__GetElement__GisLocation();

		/**
		 * The meta object literal for the '<em><b>Add Element</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GIS_ROUTES_HOLDER_TO_LOCATION___ADD_ELEMENT__GISROUTESHOLDERFROMLOCATION = eINSTANCE.getGisRoutesHolderToLocation__AddElement__GisRoutesHolderFromLocation();

		/**
		 * The meta object literal for the '<em><b>Update</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GIS_ROUTES_HOLDER_TO_LOCATION___UPDATE__GISROUTECALCULATOR = eINSTANCE.getGisRoutesHolderToLocation__Update__GisRouteCalculator();

		/**
		 * The meta object literal for the '<em><b>Refresh</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GIS_ROUTES_HOLDER_TO_LOCATION___REFRESH = eINSTANCE.getGisRoutesHolderToLocation__Refresh();

		/**
		 * The meta object literal for the '<em><b>Remove</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GIS_ROUTES_HOLDER_TO_LOCATION___REMOVE = eINSTANCE.getGisRoutesHolderToLocation__Remove();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.gis.impl.GisRoutesHolderElementImpl <em>Routes Holder Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.gis.impl.GisRoutesHolderElementImpl
		 * @see com.misc.common.moplaf.gis.impl.GisPackageImpl#getGisRoutesHolderElement()
		 * @generated
		 */
		EClass GIS_ROUTES_HOLDER_ELEMENT = eINSTANCE.getGisRoutesHolderElement();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GIS_ROUTES_HOLDER_ELEMENT__DESCRIPTION = eINSTANCE.getGisRoutesHolderElement_Description();

		/**
		 * The meta object literal for the '<em><b>To Location</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GIS_ROUTES_HOLDER_ELEMENT__TO_LOCATION = eINSTANCE.getGisRoutesHolderElement_ToLocation();

		/**
		 * The meta object literal for the '<em><b>From Location</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GIS_ROUTES_HOLDER_ELEMENT__FROM_LOCATION = eINSTANCE.getGisRoutesHolderElement_FromLocation();

		/**
		 * The meta object literal for the '<em><b>Routes Info</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GIS_ROUTES_HOLDER_ELEMENT__ROUTES_INFO = eINSTANCE.getGisRoutesHolderElement_RoutesInfo();

		/**
		 * The meta object literal for the '<em><b>Calculated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GIS_ROUTES_HOLDER_ELEMENT__CALCULATED = eINSTANCE.getGisRoutesHolderElement_Calculated();

		/**
		 * The meta object literal for the '<em><b>Update</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GIS_ROUTES_HOLDER_ELEMENT___UPDATE__GISROUTECALCULATOR = eINSTANCE.getGisRoutesHolderElement__Update__GisRouteCalculator();

		/**
		 * The meta object literal for the '<em><b>Refresh</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GIS_ROUTES_HOLDER_ELEMENT___REFRESH = eINSTANCE.getGisRoutesHolderElement__Refresh();

		/**
		 * The meta object literal for the '<em><b>Remove</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GIS_ROUTES_HOLDER_ELEMENT___REMOVE = eINSTANCE.getGisRoutesHolderElement__Remove();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.gis.impl.GisRouteInfoImpl <em>Route Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.gis.impl.GisRouteInfoImpl
		 * @see com.misc.common.moplaf.gis.impl.GisPackageImpl#getGisRouteInfo()
		 * @generated
		 */
		EClass GIS_ROUTE_INFO = eINSTANCE.getGisRouteInfo();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GIS_ROUTE_INFO__DESCRIPTION = eINSTANCE.getGisRouteInfo_Description();

		/**
		 * The meta object literal for the '<em><b>From Location</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GIS_ROUTE_INFO__FROM_LOCATION = eINSTANCE.getGisRouteInfo_FromLocation();

		/**
		 * The meta object literal for the '<em><b>Distance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GIS_ROUTE_INFO__DISTANCE = eINSTANCE.getGisRouteInfo_Distance();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GIS_ROUTE_INFO__DURATION = eINSTANCE.getGisRouteInfo_Duration();

		/**
		 * The meta object literal for the '<em><b>To Location</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GIS_ROUTE_INFO__TO_LOCATION = eINSTANCE.getGisRouteInfo_ToLocation();

		/**
		 * The meta object literal for the '<em><b>With Geometry</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GIS_ROUTE_INFO__WITH_GEOMETRY = eINSTANCE.getGisRouteInfo_WithGeometry();

		/**
		 * The meta object literal for the '<em><b>Geometry</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GIS_ROUTE_INFO__GEOMETRY = eINSTANCE.getGisRouteInfo_Geometry();

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
		 * The meta object literal for the '<em><b>Address Geocoded</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GIS_ADDRESS_GEOCODED__ADDRESS_GEOCODED = eINSTANCE.getGisAddressGeocoded_AddressGeocoded();

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
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GIS_LOCATION__DESCRIPTION = eINSTANCE.getGisLocation_Description();

		/**
		 * The meta object literal for the '<em><b>Geocoded</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GIS_LOCATION__GEOCODED = eINSTANCE.getGisLocation_Geocoded();

		/**
		 * The meta object literal for the '<em><b>Tools</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GIS_LOCATION__TOOLS = eINSTANCE.getGisLocation_Tools();

		/**
		 * The meta object literal for the '<em><b>Get Coordinates</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GIS_LOCATION___GET_COORDINATES = eINSTANCE.getGisLocation__GetCoordinates();

		/**
		 * The meta object literal for the '<em><b>Add Tool</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GIS_LOCATION___ADD_TOOL__GISTOOLLOCATION = eINSTANCE.getGisLocation__AddTool__GisToolLocation();

		/**
		 * The meta object literal for the '<em><b>Get Add Tool Feedback</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GIS_LOCATION___GET_ADD_TOOL_FEEDBACK__GISTOOLLOCATION = eINSTANCE.getGisLocation__GetAddToolFeedback__GisToolLocation();

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
		 * The meta object literal for the '{@link com.misc.common.moplaf.gis.impl.GisRouteCalculatorImpl <em>Route Calculator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.gis.impl.GisRouteCalculatorImpl
		 * @see com.misc.common.moplaf.gis.impl.GisPackageImpl#getGisRouteCalculator()
		 * @generated
		 */
		EClass GIS_ROUTE_CALCULATOR = eINSTANCE.getGisRouteCalculator();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.gis.impl.GisAddressStructuredImpl <em>Address Structured</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.gis.impl.GisAddressStructuredImpl
		 * @see com.misc.common.moplaf.gis.impl.GisPackageImpl#getGisAddressStructured()
		 * @generated
		 */
		EClass GIS_ADDRESS_STRUCTURED = eINSTANCE.getGisAddressStructured();

		/**
		 * The meta object literal for the '<em><b>Country</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GIS_ADDRESS_STRUCTURED__COUNTRY = eINSTANCE.getGisAddressStructured_Country();

		/**
		 * The meta object literal for the '<em><b>Administrative Area</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GIS_ADDRESS_STRUCTURED__ADMINISTRATIVE_AREA = eINSTANCE.getGisAddressStructured_AdministrativeArea();

		/**
		 * The meta object literal for the '<em><b>Postal Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GIS_ADDRESS_STRUCTURED__POSTAL_CODE = eINSTANCE.getGisAddressStructured_PostalCode();

		/**
		 * The meta object literal for the '<em><b>Locality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GIS_ADDRESS_STRUCTURED__LOCALITY = eINSTANCE.getGisAddressStructured_Locality();

		/**
		 * The meta object literal for the '<em><b>Street</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GIS_ADDRESS_STRUCTURED__STREET = eINSTANCE.getGisAddressStructured_Street();

		/**
		 * The meta object literal for the '<em><b>Building Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GIS_ADDRESS_STRUCTURED__BUILDING_NUMBER = eINSTANCE.getGisAddressStructured_BuildingNumber();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.gis.impl.GisAddressUnstructuredImpl <em>Address Unstructured</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.gis.impl.GisAddressUnstructuredImpl
		 * @see com.misc.common.moplaf.gis.impl.GisPackageImpl#getGisAddressUnstructured()
		 * @generated
		 */
		EClass GIS_ADDRESS_UNSTRUCTURED = eINSTANCE.getGisAddressUnstructured();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GIS_ADDRESS_UNSTRUCTURED__ADDRESS = eINSTANCE.getGisAddressUnstructured_Address();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.gis.impl.GisRouterImpl <em>Router</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.gis.impl.GisRouterImpl
		 * @see com.misc.common.moplaf.gis.impl.GisPackageImpl#getGisRouter()
		 * @generated
		 */
		EClass GIS_ROUTER = eINSTANCE.getGisRouter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GIS_ROUTER__NAME = eINSTANCE.getGisRouter_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GIS_ROUTER__DESCRIPTION = eINSTANCE.getGisRouter_Description();

		/**
		 * The meta object literal for the '<em><b>Get Route</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GIS_ROUTER___GET_ROUTE__GISLOCATION_GISLOCATION = eINSTANCE.getGisRouter__GetRoute__GisLocation_GisLocation();

		/**
		 * The meta object literal for the '<em><b>Get Routes</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GIS_ROUTER___GET_ROUTES__ELIST_ELIST = eINSTANCE.getGisRouter__GetRoutes__EList_EList();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.gis.impl.GisRouteCalculatorOneToOneImpl <em>Route Calculator One To One</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.gis.impl.GisRouteCalculatorOneToOneImpl
		 * @see com.misc.common.moplaf.gis.impl.GisPackageImpl#getGisRouteCalculatorOneToOne()
		 * @generated
		 */
		EClass GIS_ROUTE_CALCULATOR_ONE_TO_ONE = eINSTANCE.getGisRouteCalculatorOneToOne();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.gis.impl.GisRouteCalculatorManyToManyImpl <em>Route Calculator Many To Many</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.gis.impl.GisRouteCalculatorManyToManyImpl
		 * @see com.misc.common.moplaf.gis.impl.GisPackageImpl#getGisRouteCalculatorManyToMany()
		 * @generated
		 */
		EClass GIS_ROUTE_CALCULATOR_MANY_TO_MANY = eINSTANCE.getGisRouteCalculatorManyToMany();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.gis.impl.GisRouteCalculatorOneToManyImpl <em>Route Calculator One To Many</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.gis.impl.GisRouteCalculatorOneToManyImpl
		 * @see com.misc.common.moplaf.gis.impl.GisPackageImpl#getGisRouteCalculatorOneToMany()
		 * @generated
		 */
		EClass GIS_ROUTE_CALCULATOR_ONE_TO_MANY = eINSTANCE.getGisRouteCalculatorOneToMany();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.gis.impl.GisRouterGeodesicImpl <em>Router Geodesic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.gis.impl.GisRouterGeodesicImpl
		 * @see com.misc.common.moplaf.gis.impl.GisPackageImpl#getGisRouterGeodesic()
		 * @generated
		 */
		EClass GIS_ROUTER_GEODESIC = eINSTANCE.getGisRouterGeodesic();

		/**
		 * The meta object literal for the '<em><b>Speed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GIS_ROUTER_GEODESIC__SPEED = eINSTANCE.getGisRouterGeodesic_Speed();

		/**
		 * The meta object literal for the '<em><b>Correction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GIS_ROUTER_GEODESIC__CORRECTION = eINSTANCE.getGisRouterGeodesic_Correction();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.gis.impl.GisRouterDefaultedImpl <em>Router Defaulted</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.gis.impl.GisRouterDefaultedImpl
		 * @see com.misc.common.moplaf.gis.impl.GisPackageImpl#getGisRouterDefaulted()
		 * @generated
		 */
		EClass GIS_ROUTER_DEFAULTED = eINSTANCE.getGisRouterDefaulted();

		/**
		 * The meta object literal for the '<em><b>Primary Router</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GIS_ROUTER_DEFAULTED__PRIMARY_ROUTER = eINSTANCE.getGisRouterDefaulted_PrimaryRouter();

		/**
		 * The meta object literal for the '<em><b>Secondary Router</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GIS_ROUTER_DEFAULTED__SECONDARY_ROUTER = eINSTANCE.getGisRouterDefaulted_SecondaryRouter();

	}

} //GisPackage
