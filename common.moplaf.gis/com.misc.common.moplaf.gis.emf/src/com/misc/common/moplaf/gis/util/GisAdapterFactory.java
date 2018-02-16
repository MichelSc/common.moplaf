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
package com.misc.common.moplaf.gis.util;

import com.misc.common.moplaf.gis.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.misc.common.moplaf.gis.GisPackage
 * @generated
 */
public class GisAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GisPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GisAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = GisPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GisSwitch<Adapter> modelSwitch =
		new GisSwitch<Adapter>() {
			@Override
			public Adapter caseGisCoordinatesAbstract(GisCoordinatesAbstract object) {
				return createGisCoordinatesAbstractAdapter();
			}
			@Override
			public Adapter caseGisAddress(GisAddress object) {
				return createGisAddressAdapter();
			}
			@Override
			public Adapter caseGisRoutesHolder(GisRoutesHolder object) {
				return createGisRoutesHolderAdapter();
			}
			@Override
			public Adapter caseGisRoutesHolderWaypoint(GisRoutesHolderWaypoint object) {
				return createGisRoutesHolderWaypointAdapter();
			}
			@Override
			public Adapter caseGisRoutesHolderFromLocation(GisRoutesHolderFromLocation object) {
				return createGisRoutesHolderFromLocationAdapter();
			}
			@Override
			public Adapter caseGisRoutesHolderToLocation(GisRoutesHolderToLocation object) {
				return createGisRoutesHolderToLocationAdapter();
			}
			@Override
			public Adapter caseGisRoutesHolderElement(GisRoutesHolderElement object) {
				return createGisRoutesHolderElementAdapter();
			}
			@Override
			public Adapter caseGisRouteInfo(GisRouteInfo object) {
				return createGisRouteInfoAdapter();
			}
			@Override
			public Adapter caseGisAddressGeocoded(GisAddressGeocoded object) {
				return createGisAddressGeocodedAdapter();
			}
			@Override
			public Adapter caseGisLocation(GisLocation object) {
				return createGisLocationAdapter();
			}
			@Override
			public Adapter caseGisAddressGeocoder(GisAddressGeocoder object) {
				return createGisAddressGeocoderAdapter();
			}
			@Override
			public Adapter caseGisRouteCalculator(GisRouteCalculator object) {
				return createGisRouteCalculatorAdapter();
			}
			@Override
			public Adapter caseGisAddressStructured(GisAddressStructured object) {
				return createGisAddressStructuredAdapter();
			}
			@Override
			public Adapter caseGisAddressUnstructured(GisAddressUnstructured object) {
				return createGisAddressUnstructuredAdapter();
			}
			@Override
			public Adapter caseGisRouter(GisRouter object) {
				return createGisRouterAdapter();
			}
			@Override
			public Adapter caseGisRouteCalculatorOneToOne(GisRouteCalculatorOneToOne object) {
				return createGisRouteCalculatorOneToOneAdapter();
			}
			@Override
			public Adapter caseGisRouteCalculatorManyToMany(GisRouteCalculatorManyToMany object) {
				return createGisRouteCalculatorManyToManyAdapter();
			}
			@Override
			public Adapter caseGisRouteCalculatorOneToMany(GisRouteCalculatorOneToMany object) {
				return createGisRouteCalculatorOneToManyAdapter();
			}
			@Override
			public Adapter caseGisRouterGeodesic(GisRouterGeodesic object) {
				return createGisRouterGeodesicAdapter();
			}
			@Override
			public Adapter caseGisRouterDefaulted(GisRouterDefaulted object) {
				return createGisRouterDefaultedAdapter();
			}
			@Override
			public Adapter caseGisCoordinates(GisCoordinates object) {
				return createGisCoordinatesAdapter();
			}
			@Override
			public Adapter caseGisGeometry(GisGeometry object) {
				return createGisGeometryAdapter();
			}
			@Override
			public Adapter caseGisLocationPinpointed(GisLocationPinpointed object) {
				return createGisLocationPinpointedAdapter();
			}
			@Override
			public Adapter caseGisLocationPinpointer(GisLocationPinpointer object) {
				return createGisLocationPinpointerAdapter();
			}
			@Override
			public Adapter caseGisToolLocation(GisToolLocation object) {
				return createGisToolLocationAdapter();
			}
			@Override
			public Adapter caseGisLocationTool(GisLocationTool object) {
				return createGisLocationToolAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.gis.GisCoordinatesAbstract <em>Coordinates Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.gis.GisCoordinatesAbstract
	 * @generated
	 */
	public Adapter createGisCoordinatesAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.gis.GisCoordinates <em>Coordinates</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.gis.GisCoordinates
	 * @generated
	 */
	public Adapter createGisCoordinatesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.gis.GisGeometry <em>Geometry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.gis.GisGeometry
	 * @generated
	 */
	public Adapter createGisGeometryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.gis.GisLocationPinpointed <em>Location Pinpointed</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.gis.GisLocationPinpointed
	 * @generated
	 */
	public Adapter createGisLocationPinpointedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.gis.GisLocationPinpointer <em>Location Pinpointer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.gis.GisLocationPinpointer
	 * @generated
	 */
	public Adapter createGisLocationPinpointerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.gis.GisToolLocation <em>Tool Location</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.gis.GisToolLocation
	 * @generated
	 */
	public Adapter createGisToolLocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.gis.GisLocationTool <em>Location Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.gis.GisLocationTool
	 * @generated
	 */
	public Adapter createGisLocationToolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.gis.GisAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.gis.GisAddress
	 * @generated
	 */
	public Adapter createGisAddressAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.gis.GisRoutesHolder <em>Routes Holder</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.gis.GisRoutesHolder
	 * @generated
	 */
	public Adapter createGisRoutesHolderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.gis.GisRoutesHolderWaypoint <em>Routes Holder Waypoint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.gis.GisRoutesHolderWaypoint
	 * @generated
	 */
	public Adapter createGisRoutesHolderWaypointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.gis.GisRoutesHolderFromLocation <em>Routes Holder From Location</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.gis.GisRoutesHolderFromLocation
	 * @generated
	 */
	public Adapter createGisRoutesHolderFromLocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.gis.GisRoutesHolderToLocation <em>Routes Holder To Location</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.gis.GisRoutesHolderToLocation
	 * @generated
	 */
	public Adapter createGisRoutesHolderToLocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.gis.GisRoutesHolderElement <em>Routes Holder Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.gis.GisRoutesHolderElement
	 * @generated
	 */
	public Adapter createGisRoutesHolderElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.gis.GisRouteInfo <em>Route Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.gis.GisRouteInfo
	 * @generated
	 */
	public Adapter createGisRouteInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.gis.GisAddressGeocoded <em>Address Geocoded</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.gis.GisAddressGeocoded
	 * @generated
	 */
	public Adapter createGisAddressGeocodedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.gis.GisLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.gis.GisLocation
	 * @generated
	 */
	public Adapter createGisLocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.gis.GisAddressGeocoder <em>Address Geocoder</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.gis.GisAddressGeocoder
	 * @generated
	 */
	public Adapter createGisAddressGeocoderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.gis.GisRouteCalculator <em>Route Calculator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.gis.GisRouteCalculator
	 * @generated
	 */
	public Adapter createGisRouteCalculatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.gis.GisAddressStructured <em>Address Structured</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.gis.GisAddressStructured
	 * @generated
	 */
	public Adapter createGisAddressStructuredAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.gis.GisAddressUnstructured <em>Address Unstructured</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.gis.GisAddressUnstructured
	 * @generated
	 */
	public Adapter createGisAddressUnstructuredAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.gis.GisRouter <em>Router</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.gis.GisRouter
	 * @generated
	 */
	public Adapter createGisRouterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.gis.GisRouteCalculatorOneToOne <em>Route Calculator One To One</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.gis.GisRouteCalculatorOneToOne
	 * @generated
	 */
	public Adapter createGisRouteCalculatorOneToOneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.gis.GisRouteCalculatorManyToMany <em>Route Calculator Many To Many</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.gis.GisRouteCalculatorManyToMany
	 * @generated
	 */
	public Adapter createGisRouteCalculatorManyToManyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.gis.GisRouteCalculatorOneToMany <em>Route Calculator One To Many</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.gis.GisRouteCalculatorOneToMany
	 * @generated
	 */
	public Adapter createGisRouteCalculatorOneToManyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.gis.GisRouterGeodesic <em>Router Geodesic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.gis.GisRouterGeodesic
	 * @generated
	 */
	public Adapter createGisRouterGeodesicAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.gis.GisRouterDefaulted <em>Router Defaulted</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.gis.GisRouterDefaulted
	 * @generated
	 */
	public Adapter createGisRouterDefaultedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //GisAdapterFactory
