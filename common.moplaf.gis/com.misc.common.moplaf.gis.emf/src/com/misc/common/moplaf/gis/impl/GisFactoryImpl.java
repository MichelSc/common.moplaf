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
package com.misc.common.moplaf.gis.impl;

import com.misc.common.moplaf.gis.*;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GisFactoryImpl extends EFactoryImpl implements GisFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GisFactory init() {
		try {
			GisFactory theGisFactory = (GisFactory)EPackage.Registry.INSTANCE.getEFactory(GisPackage.eNS_URI);
			if (theGisFactory != null) {
				return theGisFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GisFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GisFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case GisPackage.GIS_ROUTES_HOLDER: return createGisRoutesHolder();
			case GisPackage.GIS_ROUTES_HOLDER_WAYPOINT: return createGisRoutesHolderWaypoint();
			case GisPackage.GIS_ROUTES_HOLDER_FROM_LOCATION: return createGisRoutesHolderFromLocation();
			case GisPackage.GIS_ROUTES_HOLDER_TO_LOCATION: return createGisRoutesHolderToLocation();
			case GisPackage.GIS_ROUTES_HOLDER_ELEMENT: return createGisRoutesHolderElement();
			case GisPackage.GIS_ROUTE_INFO: return createGisRouteInfo();
			case GisPackage.GIS_ADDRESS_GEOCODED: return createGisAddressGeocoded();
			case GisPackage.GIS_ADDRESS_STRUCTURED: return createGisAddressStructured();
			case GisPackage.GIS_ADDRESS_UNSTRUCTURED: return createGisAddressUnstructured();
			case GisPackage.GIS_ROUTER_GEODESIC: return createGisRouterGeodesic();
			case GisPackage.GIS_ROUTER_DEFAULTED: return createGisRouterDefaulted();
			case GisPackage.GIS_COORDINATES: return createGisCoordinates();
			case GisPackage.GIS_GEOMETRY: return createGisGeometry();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GisCoordinates createGisCoordinates() {
		GisCoordinatesImpl gisCoordinates = new GisCoordinatesImpl();
		return gisCoordinates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GisGeometry createGisGeometry() {
		GisGeometryImpl gisGeometry = new GisGeometryImpl();
		return gisGeometry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GisRoutesHolder createGisRoutesHolder() {
		GisRoutesHolderImpl gisRoutesHolder = new GisRoutesHolderImpl();
		return gisRoutesHolder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GisRoutesHolderWaypoint createGisRoutesHolderWaypoint() {
		GisRoutesHolderWaypointImpl gisRoutesHolderWaypoint = new GisRoutesHolderWaypointImpl();
		return gisRoutesHolderWaypoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GisRoutesHolderFromLocation createGisRoutesHolderFromLocation() {
		GisRoutesHolderFromLocationImpl gisRoutesHolderFromLocation = new GisRoutesHolderFromLocationImpl();
		return gisRoutesHolderFromLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GisRoutesHolderToLocation createGisRoutesHolderToLocation() {
		GisRoutesHolderToLocationImpl gisRoutesHolderToLocation = new GisRoutesHolderToLocationImpl();
		return gisRoutesHolderToLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GisRoutesHolderElement createGisRoutesHolderElement() {
		GisRoutesHolderElementImpl gisRoutesHolderElement = new GisRoutesHolderElementImpl();
		return gisRoutesHolderElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GisRouteInfo createGisRouteInfo() {
		GisRouteInfoImpl gisRouteInfo = new GisRouteInfoImpl();
		return gisRouteInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GisAddressGeocoded createGisAddressGeocoded() {
		GisAddressGeocodedImpl gisAddressGeocoded = new GisAddressGeocodedImpl();
		return gisAddressGeocoded;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GisAddressStructured createGisAddressStructured() {
		GisAddressStructuredImpl gisAddressStructured = new GisAddressStructuredImpl();
		return gisAddressStructured;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GisAddressUnstructured createGisAddressUnstructured() {
		GisAddressUnstructuredImpl gisAddressUnstructured = new GisAddressUnstructuredImpl();
		return gisAddressUnstructured;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GisRouterGeodesic createGisRouterGeodesic() {
		GisRouterGeodesicImpl gisRouterGeodesic = new GisRouterGeodesicImpl();
		return gisRouterGeodesic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GisRouterDefaulted createGisRouterDefaulted() {
		GisRouterDefaultedImpl gisRouterDefaulted = new GisRouterDefaultedImpl();
		return gisRouterDefaulted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GisPackage getGisPackage() {
		return (GisPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GisPackage getPackage() {
		return GisPackage.eINSTANCE;
	}

} //GisFactoryImpl
