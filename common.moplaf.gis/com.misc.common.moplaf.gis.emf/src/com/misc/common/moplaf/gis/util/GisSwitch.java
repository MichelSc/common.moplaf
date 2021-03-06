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
package com.misc.common.moplaf.gis.util;

import com.misc.common.moplaf.gis.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see com.misc.common.moplaf.gis.GisPackage
 * @generated
 */
public class GisSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GisPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GisSwitch() {
		if (modelPackage == null) {
			modelPackage = GisPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case GisPackage.GIS_LOCATION: {
				GisLocation gisLocation = (GisLocation)theEObject;
				T result = caseGisLocation(gisLocation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GisPackage.GIS_LOCATION_TOOL: {
				GisLocationTool gisLocationTool = (GisLocationTool)theEObject;
				T result = caseGisLocationTool(gisLocationTool);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GisPackage.GIS_TOOL_LOCATION: {
				GisToolLocation gisToolLocation = (GisToolLocation)theEObject;
				T result = caseGisToolLocation(gisToolLocation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GisPackage.GIS_COORDINATES_ABSTRACT: {
				GisCoordinatesAbstract gisCoordinatesAbstract = (GisCoordinatesAbstract)theEObject;
				T result = caseGisCoordinatesAbstract(gisCoordinatesAbstract);
				if (result == null) result = caseGisLocation(gisCoordinatesAbstract);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GisPackage.GIS_COORDINATES: {
				GisCoordinates gisCoordinates = (GisCoordinates)theEObject;
				T result = caseGisCoordinates(gisCoordinates);
				if (result == null) result = caseGisCoordinatesAbstract(gisCoordinates);
				if (result == null) result = caseGisLocation(gisCoordinates);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GisPackage.GIS_ADDRESS: {
				GisAddress gisAddress = (GisAddress)theEObject;
				T result = caseGisAddress(gisAddress);
				if (result == null) result = caseGisLocation(gisAddress);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GisPackage.GIS_ADDRESS_STRUCTURED: {
				GisAddressStructured gisAddressStructured = (GisAddressStructured)theEObject;
				T result = caseGisAddressStructured(gisAddressStructured);
				if (result == null) result = caseGisAddress(gisAddressStructured);
				if (result == null) result = caseGisLocation(gisAddressStructured);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GisPackage.GIS_ADDRESS_UNSTRUCTURED: {
				GisAddressUnstructured gisAddressUnstructured = (GisAddressUnstructured)theEObject;
				T result = caseGisAddressUnstructured(gisAddressUnstructured);
				if (result == null) result = caseGisAddress(gisAddressUnstructured);
				if (result == null) result = caseGisLocation(gisAddressUnstructured);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GisPackage.GIS_ADDRESS_GEOCODED: {
				GisAddressGeocoded gisAddressGeocoded = (GisAddressGeocoded)theEObject;
				T result = caseGisAddressGeocoded(gisAddressGeocoded);
				if (result == null) result = caseGisCoordinatesAbstract(gisAddressGeocoded);
				if (result == null) result = caseGisLocation(gisAddressGeocoded);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GisPackage.GIS_ADDRESS_GEOCODER: {
				GisAddressGeocoder gisAddressGeocoder = (GisAddressGeocoder)theEObject;
				T result = caseGisAddressGeocoder(gisAddressGeocoder);
				if (result == null) result = caseGisToolLocation(gisAddressGeocoder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GisPackage.GIS_ROUTES_HOLDER_WAYPOINT: {
				GisRoutesHolderWaypoint gisRoutesHolderWaypoint = (GisRoutesHolderWaypoint)theEObject;
				T result = caseGisRoutesHolderWaypoint(gisRoutesHolderWaypoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GisPackage.GIS_ROUTES_HOLDER: {
				GisRoutesHolder gisRoutesHolder = (GisRoutesHolder)theEObject;
				T result = caseGisRoutesHolder(gisRoutesHolder);
				if (result == null) result = caseGisRouter(gisRoutesHolder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GisPackage.GIS_ROUTES_HOLDER_FROM_LOCATION: {
				GisRoutesHolderFromLocation gisRoutesHolderFromLocation = (GisRoutesHolderFromLocation)theEObject;
				T result = caseGisRoutesHolderFromLocation(gisRoutesHolderFromLocation);
				if (result == null) result = caseGisRoutesHolderWaypoint(gisRoutesHolderFromLocation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GisPackage.GIS_ROUTES_HOLDER_TO_LOCATION: {
				GisRoutesHolderToLocation gisRoutesHolderToLocation = (GisRoutesHolderToLocation)theEObject;
				T result = caseGisRoutesHolderToLocation(gisRoutesHolderToLocation);
				if (result == null) result = caseGisRoutesHolderWaypoint(gisRoutesHolderToLocation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GisPackage.GIS_ROUTES_HOLDER_ELEMENT: {
				GisRoutesHolderElement gisRoutesHolderElement = (GisRoutesHolderElement)theEObject;
				T result = caseGisRoutesHolderElement(gisRoutesHolderElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GisPackage.GIS_ROUTE_INFO: {
				GisRouteInfo gisRouteInfo = (GisRouteInfo)theEObject;
				T result = caseGisRouteInfo(gisRouteInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GisPackage.GIS_ROUTE_CALCULATOR: {
				GisRouteCalculator gisRouteCalculator = (GisRouteCalculator)theEObject;
				T result = caseGisRouteCalculator(gisRouteCalculator);
				if (result == null) result = caseGisRouter(gisRouteCalculator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GisPackage.GIS_ROUTER: {
				GisRouter gisRouter = (GisRouter)theEObject;
				T result = caseGisRouter(gisRouter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GisPackage.GIS_ROUTE_CALCULATOR_ONE_TO_ONE: {
				GisRouteCalculatorOneToOne gisRouteCalculatorOneToOne = (GisRouteCalculatorOneToOne)theEObject;
				T result = caseGisRouteCalculatorOneToOne(gisRouteCalculatorOneToOne);
				if (result == null) result = caseGisRouteCalculator(gisRouteCalculatorOneToOne);
				if (result == null) result = caseGisRouter(gisRouteCalculatorOneToOne);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GisPackage.GIS_ROUTE_CALCULATOR_MANY_TO_MANY: {
				GisRouteCalculatorManyToMany gisRouteCalculatorManyToMany = (GisRouteCalculatorManyToMany)theEObject;
				T result = caseGisRouteCalculatorManyToMany(gisRouteCalculatorManyToMany);
				if (result == null) result = caseGisRouteCalculator(gisRouteCalculatorManyToMany);
				if (result == null) result = caseGisRouter(gisRouteCalculatorManyToMany);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GisPackage.GIS_ROUTE_CALCULATOR_ONE_TO_MANY: {
				GisRouteCalculatorOneToMany gisRouteCalculatorOneToMany = (GisRouteCalculatorOneToMany)theEObject;
				T result = caseGisRouteCalculatorOneToMany(gisRouteCalculatorOneToMany);
				if (result == null) result = caseGisRouteCalculator(gisRouteCalculatorOneToMany);
				if (result == null) result = caseGisRouter(gisRouteCalculatorOneToMany);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GisPackage.GIS_ROUTER_GEODESIC: {
				GisRouterGeodesic gisRouterGeodesic = (GisRouterGeodesic)theEObject;
				T result = caseGisRouterGeodesic(gisRouterGeodesic);
				if (result == null) result = caseGisRouteCalculatorOneToOne(gisRouterGeodesic);
				if (result == null) result = caseGisRouteCalculator(gisRouterGeodesic);
				if (result == null) result = caseGisRouter(gisRouterGeodesic);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GisPackage.GIS_ROUTER_DEFAULTED: {
				GisRouterDefaulted gisRouterDefaulted = (GisRouterDefaulted)theEObject;
				T result = caseGisRouterDefaulted(gisRouterDefaulted);
				if (result == null) result = caseGisRouter(gisRouterDefaulted);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GisPackage.GIS_GEOMETRY: {
				GisGeometry gisGeometry = (GisGeometry)theEObject;
				T result = caseGisGeometry(gisGeometry);
				if (result == null) result = caseGisCoordinatesAbstract(gisGeometry);
				if (result == null) result = caseGisLocation(gisGeometry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GisPackage.GIS_LOCATION_PINPOINTER: {
				GisLocationPinpointer gisLocationPinpointer = (GisLocationPinpointer)theEObject;
				T result = caseGisLocationPinpointer(gisLocationPinpointer);
				if (result == null) result = caseGisToolLocation(gisLocationPinpointer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GisPackage.GIS_LOCATION_PINPOINTED: {
				GisLocationPinpointed gisLocationPinpointed = (GisLocationPinpointed)theEObject;
				T result = caseGisLocationPinpointed(gisLocationPinpointed);
				if (result == null) result = caseGisCoordinatesAbstract(gisLocationPinpointed);
				if (result == null) result = caseGisLocation(gisLocationPinpointed);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Coordinates Abstract</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coordinates Abstract</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGisCoordinatesAbstract(GisCoordinatesAbstract object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Coordinates</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coordinates</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGisCoordinates(GisCoordinates object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Geometry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Geometry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGisGeometry(GisGeometry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Location Pinpointed</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Location Pinpointed</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGisLocationPinpointed(GisLocationPinpointed object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Location Pinpointer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Location Pinpointer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGisLocationPinpointer(GisLocationPinpointer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tool Location</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tool Location</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGisToolLocation(GisToolLocation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Location Tool</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Location Tool</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGisLocationTool(GisLocationTool object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Address</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Address</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGisAddress(GisAddress object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Routes Holder</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Routes Holder</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGisRoutesHolder(GisRoutesHolder object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Routes Holder Waypoint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Routes Holder Waypoint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGisRoutesHolderWaypoint(GisRoutesHolderWaypoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Routes Holder From Location</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Routes Holder From Location</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGisRoutesHolderFromLocation(GisRoutesHolderFromLocation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Routes Holder To Location</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Routes Holder To Location</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGisRoutesHolderToLocation(GisRoutesHolderToLocation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Routes Holder Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Routes Holder Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGisRoutesHolderElement(GisRoutesHolderElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Route Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Route Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGisRouteInfo(GisRouteInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Address Geocoded</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Address Geocoded</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGisAddressGeocoded(GisAddressGeocoded object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Location</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Location</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGisLocation(GisLocation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Address Geocoder</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Address Geocoder</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGisAddressGeocoder(GisAddressGeocoder object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Route Calculator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Route Calculator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGisRouteCalculator(GisRouteCalculator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Address Structured</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Address Structured</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGisAddressStructured(GisAddressStructured object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Address Unstructured</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Address Unstructured</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGisAddressUnstructured(GisAddressUnstructured object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Router</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Router</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGisRouter(GisRouter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Route Calculator One To One</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Route Calculator One To One</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGisRouteCalculatorOneToOne(GisRouteCalculatorOneToOne object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Route Calculator Many To Many</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Route Calculator Many To Many</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGisRouteCalculatorManyToMany(GisRouteCalculatorManyToMany object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Route Calculator One To Many</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Route Calculator One To Many</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGisRouteCalculatorOneToMany(GisRouteCalculatorOneToMany object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Router Geodesic</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Router Geodesic</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGisRouterGeodesic(GisRouterGeodesic object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Router Defaulted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Router Defaulted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGisRouterDefaulted(GisRouterDefaulted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //GisSwitch
