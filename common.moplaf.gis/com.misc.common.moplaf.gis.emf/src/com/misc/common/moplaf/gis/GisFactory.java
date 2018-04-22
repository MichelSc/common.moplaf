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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.misc.common.moplaf.gis.GisPackage
 * @generated
 */
public interface GisFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GisFactory eINSTANCE = com.misc.common.moplaf.gis.impl.GisFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Coordinates</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Coordinates</em>'.
	 * @generated
	 */
	GisCoordinates createGisCoordinates();

	/**
	 * Returns a new object of class '<em>Geometry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Geometry</em>'.
	 * @generated
	 */
	GisGeometry createGisGeometry();

	/**
	 * Returns a new object of class '<em>Location Pinpointed</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Location Pinpointed</em>'.
	 * @generated
	 */
	GisLocationPinpointed createGisLocationPinpointed();

	/**
	 * Returns a new object of class '<em>Location Tool</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Location Tool</em>'.
	 * @generated
	 */
	GisLocationTool createGisLocationTool();

	/**
	 * Returns a new object of class '<em>Routes Holder</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Routes Holder</em>'.
	 * @generated
	 */
	GisRoutesHolder createGisRoutesHolder();

	/**
	 * Returns a new object of class '<em>Routes Holder Waypoint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Routes Holder Waypoint</em>'.
	 * @generated
	 */
	GisRoutesHolderWaypoint createGisRoutesHolderWaypoint();

	/**
	 * Returns a new object of class '<em>Routes Holder From Location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Routes Holder From Location</em>'.
	 * @generated
	 */
	GisRoutesHolderFromLocation createGisRoutesHolderFromLocation();

	/**
	 * Returns a new object of class '<em>Routes Holder To Location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Routes Holder To Location</em>'.
	 * @generated
	 */
	GisRoutesHolderToLocation createGisRoutesHolderToLocation();

	/**
	 * Returns a new object of class '<em>Routes Holder Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Routes Holder Element</em>'.
	 * @generated
	 */
	GisRoutesHolderElement createGisRoutesHolderElement();

	/**
	 * Returns a new object of class '<em>Route Info</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Route Info</em>'.
	 * @generated
	 */
	GisRouteInfo createGisRouteInfo();

	/**
	 * Returns a new object of class '<em>Address Geocoded</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Address Geocoded</em>'.
	 * @generated
	 */
	GisAddressGeocoded createGisAddressGeocoded();

	/**
	 * Returns a new object of class '<em>Address Structured</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Address Structured</em>'.
	 * @generated
	 */
	GisAddressStructured createGisAddressStructured();

	/**
	 * Returns a new object of class '<em>Address Unstructured</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Address Unstructured</em>'.
	 * @generated
	 */
	GisAddressUnstructured createGisAddressUnstructured();

	/**
	 * Returns a new object of class '<em>Router Geodesic</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Router Geodesic</em>'.
	 * @generated
	 */
	GisRouterGeodesic createGisRouterGeodesic();

	/**
	 * Returns a new object of class '<em>Router Defaulted</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Router Defaulted</em>'.
	 * @generated
	 */
	GisRouterDefaulted createGisRouterDefaulted();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	GisPackage getGisPackage();

} //GisFactory
