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
			case GisPackage.GIS_COORDINATES: return createGisCoordinates();
			case GisPackage.GIS_DISTANCE_MATRIX: return createGisDistanceMatrix();
			case GisPackage.GIS_DISTANCE_MATRIX_ELEMENT: return createGisDistanceMatrixElement();
			case GisPackage.GIS_DISTANCE_MATRIX_FROM_LOCATION: return createGisDistanceMatrixFromLocation();
			case GisPackage.GIS_DISTANCE_MATRIX_TO_LOCATION: return createGisDistanceMatrixToLocation();
			case GisPackage.GIS_ADDRESS_GEOCODED: return createGisAddressGeocoded();
			case GisPackage.GIS_ADDRESS_GEOCODER: return createGisAddressGeocoder();
			case GisPackage.GIS_ADDRESS_STRUCTURED: return createGisAddressStructured();
			case GisPackage.GIS_ADDRESS_UNSTRUCTURED: return createGisAddressUnstructured();
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
	public GisDistanceMatrix createGisDistanceMatrix() {
		GisDistanceMatrixImpl gisDistanceMatrix = new GisDistanceMatrixImpl();
		return gisDistanceMatrix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GisDistanceMatrixElement createGisDistanceMatrixElement() {
		GisDistanceMatrixElementImpl gisDistanceMatrixElement = new GisDistanceMatrixElementImpl();
		return gisDistanceMatrixElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GisDistanceMatrixFromLocation createGisDistanceMatrixFromLocation() {
		GisDistanceMatrixFromLocationImpl gisDistanceMatrixFromLocation = new GisDistanceMatrixFromLocationImpl();
		return gisDistanceMatrixFromLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GisDistanceMatrixToLocation createGisDistanceMatrixToLocation() {
		GisDistanceMatrixToLocationImpl gisDistanceMatrixToLocation = new GisDistanceMatrixToLocationImpl();
		return gisDistanceMatrixToLocation;
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
	public GisAddressGeocoder createGisAddressGeocoder() {
		GisAddressGeocoderImpl gisAddressGeocoder = new GisAddressGeocoderImpl();
		return gisAddressGeocoder;
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
