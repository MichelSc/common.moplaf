/*******************************************************************************
 * Copyright (c) 2017 Michel Schaffers and others.
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
	int GIS_LOCATION = 8;

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
	 * The feature id for the '<em><b>Country Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ADDRESS__COUNTRY_CODE = GIS_LOCATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Geocoded Addresses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ADDRESS__GEOCODED_ADDRESSES = GIS_LOCATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Selected Geocoded Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ADDRESS__SELECTED_GEOCODED_LOCATION = GIS_LOCATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Geocoder</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ADDRESS__GEOCODER = GIS_LOCATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Geocoding Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ADDRESS__GEOCODING_FEEDBACK = GIS_LOCATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Refresh Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ADDRESS__REFRESH_FEEDBACK = GIS_LOCATION_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Address</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ADDRESS_FEATURE_COUNT = GIS_LOCATION_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Get Coordinates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ADDRESS___GET_COORDINATES = GIS_LOCATION___GET_COORDINATES;

	/**
	 * The operation id for the '<em>Refresh Geocoded</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ADDRESS___REFRESH_GEOCODED = GIS_LOCATION_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Flush Geocoded</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ADDRESS___FLUSH_GEOCODED = GIS_LOCATION_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Address</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ADDRESS_OPERATION_COUNT = GIS_LOCATION_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.gis.impl.GisRouterImpl <em>Router</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.gis.impl.GisRouterImpl
	 * @see com.misc.common.moplaf.gis.impl.GisPackageImpl#getGisRouter()
	 * @generated
	 */
	int GIS_ROUTER = 13;

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
	 * The meta object id for the '{@link com.misc.common.moplaf.gis.impl.GisRoutesHolderImpl <em>Routes Holder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.gis.impl.GisRoutesHolderImpl
	 * @see com.misc.common.moplaf.gis.impl.GisPackageImpl#getGisRoutesHolder()
	 * @generated
	 */
	int GIS_ROUTES_HOLDER = 2;

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
	 * The number of operations of the '<em>Routes Holder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ROUTES_HOLDER_OPERATION_COUNT = GIS_ROUTER_OPERATION_COUNT + 7;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.gis.impl.GisRoutesHolderFromLocationImpl <em>Routes Holder From Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.gis.impl.GisRoutesHolderFromLocationImpl
	 * @see com.misc.common.moplaf.gis.impl.GisPackageImpl#getGisRoutesHolderFromLocation()
	 * @generated
	 */
	int GIS_ROUTES_HOLDER_FROM_LOCATION = 3;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ROUTES_HOLDER_FROM_LOCATION__LOCATION = 0;

	/**
	 * The feature id for the '<em><b>To Locations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ROUTES_HOLDER_FROM_LOCATION__TO_LOCATIONS = 1;

	/**
	 * The feature id for the '<em><b>Routes Holder</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ROUTES_HOLDER_FROM_LOCATION__ROUTES_HOLDER = 2;

	/**
	 * The number of structural features of the '<em>Routes Holder From Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ROUTES_HOLDER_FROM_LOCATION_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Get Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ROUTES_HOLDER_FROM_LOCATION___GET_ELEMENT__GISLOCATION = 0;

	/**
	 * The operation id for the '<em>Add Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ROUTES_HOLDER_FROM_LOCATION___ADD_ELEMENT__GISROUTESHOLDERTOLOCATION = 1;

	/**
	 * The operation id for the '<em>Remove</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ROUTES_HOLDER_FROM_LOCATION___REMOVE = 2;

	/**
	 * The number of operations of the '<em>Routes Holder From Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ROUTES_HOLDER_FROM_LOCATION_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.gis.impl.GisRoutesHolderToLocationImpl <em>Routes Holder To Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.gis.impl.GisRoutesHolderToLocationImpl
	 * @see com.misc.common.moplaf.gis.impl.GisPackageImpl#getGisRoutesHolderToLocation()
	 * @generated
	 */
	int GIS_ROUTES_HOLDER_TO_LOCATION = 4;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ROUTES_HOLDER_TO_LOCATION__LOCATION = 0;

	/**
	 * The feature id for the '<em><b>From Locations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ROUTES_HOLDER_TO_LOCATION__FROM_LOCATIONS = 1;

	/**
	 * The feature id for the '<em><b>Routes Holder</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ROUTES_HOLDER_TO_LOCATION__ROUTES_HOLDER = 2;

	/**
	 * The number of structural features of the '<em>Routes Holder To Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ROUTES_HOLDER_TO_LOCATION_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Get Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ROUTES_HOLDER_TO_LOCATION___GET_ELEMENT__GISLOCATION = 0;

	/**
	 * The operation id for the '<em>Add Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ROUTES_HOLDER_TO_LOCATION___ADD_ELEMENT__GISROUTESHOLDERFROMLOCATION = 1;

	/**
	 * The operation id for the '<em>Remove</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ROUTES_HOLDER_TO_LOCATION___REMOVE = 2;

	/**
	 * The number of operations of the '<em>Routes Holder To Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ROUTES_HOLDER_TO_LOCATION_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.gis.impl.GisRoutesHolderElementImpl <em>Routes Holder Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.gis.impl.GisRoutesHolderElementImpl
	 * @see com.misc.common.moplaf.gis.impl.GisPackageImpl#getGisRoutesHolderElement()
	 * @generated
	 */
	int GIS_ROUTES_HOLDER_ELEMENT = 5;

	/**
	 * The feature id for the '<em><b>To Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ROUTES_HOLDER_ELEMENT__TO_LOCATION = 0;

	/**
	 * The feature id for the '<em><b>From Location</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ROUTES_HOLDER_ELEMENT__FROM_LOCATION = 1;

	/**
	 * The feature id for the '<em><b>Routes Info</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ROUTES_HOLDER_ELEMENT__ROUTES_INFO = 2;

	/**
	 * The feature id for the '<em><b>Calculated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ROUTES_HOLDER_ELEMENT__CALCULATED = 3;

	/**
	 * The number of structural features of the '<em>Routes Holder Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ROUTES_HOLDER_ELEMENT_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Remove</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ROUTES_HOLDER_ELEMENT___REMOVE = 0;

	/**
	 * The number of operations of the '<em>Routes Holder Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ROUTES_HOLDER_ELEMENT_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.gis.impl.GisRouteInfoImpl <em>Route Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.gis.impl.GisRouteInfoImpl
	 * @see com.misc.common.moplaf.gis.impl.GisPackageImpl#getGisRouteInfo()
	 * @generated
	 */
	int GIS_ROUTE_INFO = 6;

	/**
	 * The feature id for the '<em><b>From Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ROUTE_INFO__FROM_LOCATION = 0;

	/**
	 * The feature id for the '<em><b>Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ROUTE_INFO__DISTANCE = 1;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ROUTE_INFO__DURATION = 2;

	/**
	 * The feature id for the '<em><b>To Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ROUTE_INFO__TO_LOCATION = 3;

	/**
	 * The number of structural features of the '<em>Route Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ROUTE_INFO_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Route Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ROUTE_INFO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.gis.impl.GisAddressGeocodedImpl <em>Address Geocoded</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.gis.impl.GisAddressGeocodedImpl
	 * @see com.misc.common.moplaf.gis.impl.GisPackageImpl#getGisAddressGeocoded()
	 * @generated
	 */
	int GIS_ADDRESS_GEOCODED = 7;

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
	 * The feature id for the '<em><b>Address</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ADDRESS_GEOCODED__ADDRESS = GIS_COORDINATES_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Address Geocoded</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ADDRESS_GEOCODED_FEATURE_COUNT = GIS_COORDINATES_FEATURE_COUNT + 3;

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
	int GIS_ADDRESS_GEOCODER = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ADDRESS_GEOCODER__NAME = 0;

	/**
	 * The number of structural features of the '<em>Address Geocoder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ADDRESS_GEOCODER_FEATURE_COUNT = 1;

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
	 * The meta object id for the '{@link com.misc.common.moplaf.gis.impl.GisRouteCalculatorImpl <em>Route Calculator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.gis.impl.GisRouteCalculatorImpl
	 * @see com.misc.common.moplaf.gis.impl.GisPackageImpl#getGisRouteCalculator()
	 * @generated
	 */
	int GIS_ROUTE_CALCULATOR = 10;

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
	 * The meta object id for the '{@link com.misc.common.moplaf.gis.impl.GisAddressStructuredImpl <em>Address Structured</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.gis.impl.GisAddressStructuredImpl
	 * @see com.misc.common.moplaf.gis.impl.GisPackageImpl#getGisAddressStructured()
	 * @generated
	 */
	int GIS_ADDRESS_STRUCTURED = 11;

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
	 * The feature id for the '<em><b>Geocoded Addresses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ADDRESS_STRUCTURED__GEOCODED_ADDRESSES = GIS_ADDRESS__GEOCODED_ADDRESSES;

	/**
	 * The feature id for the '<em><b>Selected Geocoded Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ADDRESS_STRUCTURED__SELECTED_GEOCODED_LOCATION = GIS_ADDRESS__SELECTED_GEOCODED_LOCATION;

	/**
	 * The feature id for the '<em><b>Geocoder</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ADDRESS_STRUCTURED__GEOCODER = GIS_ADDRESS__GEOCODER;

	/**
	 * The feature id for the '<em><b>Geocoding Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ADDRESS_STRUCTURED__GEOCODING_FEEDBACK = GIS_ADDRESS__GEOCODING_FEEDBACK;

	/**
	 * The feature id for the '<em><b>Refresh Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ADDRESS_STRUCTURED__REFRESH_FEEDBACK = GIS_ADDRESS__REFRESH_FEEDBACK;

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
	 * The operation id for the '<em>Refresh Geocoded</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ADDRESS_STRUCTURED___REFRESH_GEOCODED = GIS_ADDRESS___REFRESH_GEOCODED;

	/**
	 * The operation id for the '<em>Flush Geocoded</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ADDRESS_STRUCTURED___FLUSH_GEOCODED = GIS_ADDRESS___FLUSH_GEOCODED;

	/**
	 * The number of operations of the '<em>Address Structured</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ADDRESS_STRUCTURED_OPERATION_COUNT = GIS_ADDRESS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.gis.impl.GisAddressUnstructuredImpl <em>Address Unstructured</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.gis.impl.GisAddressUnstructuredImpl
	 * @see com.misc.common.moplaf.gis.impl.GisPackageImpl#getGisAddressUnstructured()
	 * @generated
	 */
	int GIS_ADDRESS_UNSTRUCTURED = 12;

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
	 * The feature id for the '<em><b>Geocoded Addresses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ADDRESS_UNSTRUCTURED__GEOCODED_ADDRESSES = GIS_ADDRESS__GEOCODED_ADDRESSES;

	/**
	 * The feature id for the '<em><b>Selected Geocoded Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ADDRESS_UNSTRUCTURED__SELECTED_GEOCODED_LOCATION = GIS_ADDRESS__SELECTED_GEOCODED_LOCATION;

	/**
	 * The feature id for the '<em><b>Geocoder</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ADDRESS_UNSTRUCTURED__GEOCODER = GIS_ADDRESS__GEOCODER;

	/**
	 * The feature id for the '<em><b>Geocoding Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ADDRESS_UNSTRUCTURED__GEOCODING_FEEDBACK = GIS_ADDRESS__GEOCODING_FEEDBACK;

	/**
	 * The feature id for the '<em><b>Refresh Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ADDRESS_UNSTRUCTURED__REFRESH_FEEDBACK = GIS_ADDRESS__REFRESH_FEEDBACK;

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
	 * The operation id for the '<em>Refresh Geocoded</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ADDRESS_UNSTRUCTURED___REFRESH_GEOCODED = GIS_ADDRESS___REFRESH_GEOCODED;

	/**
	 * The operation id for the '<em>Flush Geocoded</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ADDRESS_UNSTRUCTURED___FLUSH_GEOCODED = GIS_ADDRESS___FLUSH_GEOCODED;

	/**
	 * The number of operations of the '<em>Address Unstructured</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ADDRESS_UNSTRUCTURED_OPERATION_COUNT = GIS_ADDRESS_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.gis.impl.GisRouteCalculatorOneToOneImpl <em>Route Calculator One To One</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.gis.impl.GisRouteCalculatorOneToOneImpl
	 * @see com.misc.common.moplaf.gis.impl.GisPackageImpl#getGisRouteCalculatorOneToOne()
	 * @generated
	 */
	int GIS_ROUTE_CALCULATOR_ONE_TO_ONE = 14;

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
	 * The meta object id for the '{@link com.misc.common.moplaf.gis.impl.GisRouteCalculatorManyToManyImpl <em>Route Calculator Many To Many</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.gis.impl.GisRouteCalculatorManyToManyImpl
	 * @see com.misc.common.moplaf.gis.impl.GisPackageImpl#getGisRouteCalculatorManyToMany()
	 * @generated
	 */
	int GIS_ROUTE_CALCULATOR_MANY_TO_MANY = 15;

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
	 * The meta object id for the '{@link com.misc.common.moplaf.gis.impl.GisRouteCalculatorOneToManyImpl <em>Route Calculator One To Many</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.gis.impl.GisRouteCalculatorOneToManyImpl
	 * @see com.misc.common.moplaf.gis.impl.GisPackageImpl#getGisRouteCalculatorOneToMany()
	 * @generated
	 */
	int GIS_ROUTE_CALCULATOR_ONE_TO_MANY = 16;

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
	 * The meta object id for the '{@link com.misc.common.moplaf.gis.impl.GisRouterGeodesicImpl <em>Router Geodesic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.gis.impl.GisRouterGeodesicImpl
	 * @see com.misc.common.moplaf.gis.impl.GisPackageImpl#getGisRouterGeodesic()
	 * @generated
	 */
	int GIS_ROUTER_GEODESIC = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ROUTER_GEODESIC__NAME = GIS_ROUTER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ROUTER_GEODESIC__DESCRIPTION = GIS_ROUTER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ROUTER_GEODESIC__SPEED = GIS_ROUTER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Correction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ROUTER_GEODESIC__CORRECTION = GIS_ROUTER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Router Geodesic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ROUTER_GEODESIC_FEATURE_COUNT = GIS_ROUTER_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Route</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ROUTER_GEODESIC___GET_ROUTE__GISLOCATION_GISLOCATION = GIS_ROUTER___GET_ROUTE__GISLOCATION_GISLOCATION;

	/**
	 * The operation id for the '<em>Get Routes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ROUTER_GEODESIC___GET_ROUTES__ELIST_ELIST = GIS_ROUTER___GET_ROUTES__ELIST_ELIST;

	/**
	 * The number of operations of the '<em>Router Geodesic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ROUTER_GEODESIC_OPERATION_COUNT = GIS_ROUTER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.gis.impl.GisRouterDefaultedImpl <em>Router Defaulted</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.gis.impl.GisRouterDefaultedImpl
	 * @see com.misc.common.moplaf.gis.impl.GisPackageImpl#getGisRouterDefaulted()
	 * @generated
	 */
	int GIS_ROUTER_DEFAULTED = 18;

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
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.gis.GisAddress#getGeocodingFeedback <em>Geocoding Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Geocoding Feedback</em>'.
	 * @see com.misc.common.moplaf.gis.GisAddress#getGeocodingFeedback()
	 * @see #getGisAddress()
	 * @generated
	 */
	EAttribute getGisAddress_GeocodingFeedback();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.gis.GisAddress#getRefreshFeedback <em>Refresh Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Refresh Feedback</em>'.
	 * @see com.misc.common.moplaf.gis.GisAddress#getRefreshFeedback()
	 * @see #getGisAddress()
	 * @generated
	 */
	EAttribute getGisAddress_RefreshFeedback();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.gis.GisAddress#refreshGeocoded() <em>Refresh Geocoded</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Refresh Geocoded</em>' operation.
	 * @see com.misc.common.moplaf.gis.GisAddress#refreshGeocoded()
	 * @generated
	 */
	EOperation getGisAddress__RefreshGeocoded();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.gis.GisAddress#flushGeocoded() <em>Flush Geocoded</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Flush Geocoded</em>' operation.
	 * @see com.misc.common.moplaf.gis.GisAddress#flushGeocoded()
	 * @generated
	 */
	EOperation getGisAddress__FlushGeocoded();

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
	 * Returns the meta object for class '{@link com.misc.common.moplaf.gis.GisRoutesHolderFromLocation <em>Routes Holder From Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Routes Holder From Location</em>'.
	 * @see com.misc.common.moplaf.gis.GisRoutesHolderFromLocation
	 * @generated
	 */
	EClass getGisRoutesHolderFromLocation();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.gis.GisRoutesHolderFromLocation#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Location</em>'.
	 * @see com.misc.common.moplaf.gis.GisRoutesHolderFromLocation#getLocation()
	 * @see #getGisRoutesHolderFromLocation()
	 * @generated
	 */
	EReference getGisRoutesHolderFromLocation_Location();

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
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.gis.GisRoutesHolderToLocation#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Location</em>'.
	 * @see com.misc.common.moplaf.gis.GisRoutesHolderToLocation#getLocation()
	 * @see #getGisRoutesHolderToLocation()
	 * @generated
	 */
	EReference getGisRoutesHolderToLocation_Location();

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
	 * Returns the meta object for the container reference '{@link com.misc.common.moplaf.gis.GisAddressGeocoded#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Address</em>'.
	 * @see com.misc.common.moplaf.gis.GisAddressGeocoded#getAddress()
	 * @see #getGisAddressGeocoded()
	 * @generated
	 */
	EReference getGisAddressGeocoded_Address();

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
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.gis.GisAddressGeocoder#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.misc.common.moplaf.gis.GisAddressGeocoder#getName()
	 * @see #getGisAddressGeocoder()
	 * @generated
	 */
	EAttribute getGisAddressGeocoder_Name();

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
		 * The meta object literal for the '<em><b>Country Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GIS_ADDRESS__COUNTRY_CODE = eINSTANCE.getGisAddress_CountryCode();

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
		 * The meta object literal for the '<em><b>Geocoding Feedback</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GIS_ADDRESS__GEOCODING_FEEDBACK = eINSTANCE.getGisAddress_GeocodingFeedback();

		/**
		 * The meta object literal for the '<em><b>Refresh Feedback</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GIS_ADDRESS__REFRESH_FEEDBACK = eINSTANCE.getGisAddress_RefreshFeedback();

		/**
		 * The meta object literal for the '<em><b>Refresh Geocoded</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GIS_ADDRESS___REFRESH_GEOCODED = eINSTANCE.getGisAddress__RefreshGeocoded();

		/**
		 * The meta object literal for the '<em><b>Flush Geocoded</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GIS_ADDRESS___FLUSH_GEOCODED = eINSTANCE.getGisAddress__FlushGeocoded();

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
		 * The meta object literal for the '{@link com.misc.common.moplaf.gis.impl.GisRoutesHolderFromLocationImpl <em>Routes Holder From Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.gis.impl.GisRoutesHolderFromLocationImpl
		 * @see com.misc.common.moplaf.gis.impl.GisPackageImpl#getGisRoutesHolderFromLocation()
		 * @generated
		 */
		EClass GIS_ROUTES_HOLDER_FROM_LOCATION = eINSTANCE.getGisRoutesHolderFromLocation();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GIS_ROUTES_HOLDER_FROM_LOCATION__LOCATION = eINSTANCE.getGisRoutesHolderFromLocation_Location();

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
		 * The meta object literal for the '<em><b>Location</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GIS_ROUTES_HOLDER_TO_LOCATION__LOCATION = eINSTANCE.getGisRoutesHolderToLocation_Location();

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
		 * The meta object literal for the '<em><b>Address</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GIS_ADDRESS_GEOCODED__ADDRESS = eINSTANCE.getGisAddressGeocoded_Address();

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
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GIS_ADDRESS_GEOCODER__NAME = eINSTANCE.getGisAddressGeocoder_Name();

		/**
		 * The meta object literal for the '<em><b>Geocode</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GIS_ADDRESS_GEOCODER___GEOCODE__GISADDRESS = eINSTANCE.getGisAddressGeocoder__Geocode__GisAddress();

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
