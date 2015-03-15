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
			case GisPackage.GIS_ADDRESS: return createGisAddress();
			case GisPackage.GIS_DISTANCE_MATRIX: return createGisDistanceMatrix();
			case GisPackage.GIS_DISTANCE_MATRIX_ELEMENT: return createGisDistanceMatrixElement();
			case GisPackage.GIS_DISTANCE_FROM_LOCATION: return createGisDistanceFromLocation();
			case GisPackage.GIS_DISTANCE_TO_LOCATION: return createGisDistanceToLocation();
			case GisPackage.GIS_ADDRESS_GEOCODED: return createGisAddressGeocoded();
			case GisPackage.GIS_ADDRESS_GEOCODER: return createGisAddressGeocoder();
			case GisPackage.GIS_DISTANCE_MATRIX_CALCULATOR: return createGisDistanceMatrixCalculator();
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
	public GisAddress createGisAddress() {
		GisAddressImpl gisAddress = new GisAddressImpl();
		return gisAddress;
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
	public GisDistanceFromLocation createGisDistanceFromLocation() {
		GisDistanceFromLocationImpl gisDistanceFromLocation = new GisDistanceFromLocationImpl();
		return gisDistanceFromLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GisDistanceToLocation createGisDistanceToLocation() {
		GisDistanceToLocationImpl gisDistanceToLocation = new GisDistanceToLocationImpl();
		return gisDistanceToLocation;
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
	public GisDistanceMatrixCalculator createGisDistanceMatrixCalculator() {
		GisDistanceMatrixCalculatorImpl gisDistanceMatrixCalculator = new GisDistanceMatrixCalculatorImpl();
		return gisDistanceMatrixCalculator;
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
