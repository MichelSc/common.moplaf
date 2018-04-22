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
package com.misc.common.moplaf.gis.osrm.util;

import com.misc.common.moplaf.gis.GisLocationPinpointer;
import com.misc.common.moplaf.gis.GisRouteCalculator;
import com.misc.common.moplaf.gis.GisRouteCalculatorManyToMany;
import com.misc.common.moplaf.gis.GisRouteCalculatorOneToOne;
import com.misc.common.moplaf.gis.GisRouter;

import com.misc.common.moplaf.gis.GisToolLocation;
import com.misc.common.moplaf.gis.osrm.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.misc.common.moplaf.gis.osrm.GisOsrmPackage
 * @generated
 */
public class GisOsrmAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GisOsrmPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GisOsrmAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = GisOsrmPackage.eINSTANCE;
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
	protected GisOsrmSwitch<Adapter> modelSwitch =
		new GisOsrmSwitch<Adapter>() {
			@Override
			public Adapter caseGisDistanceMatrixCalculatorOsrmOneToOne(GisDistanceMatrixCalculatorOsrmOneToOne object) {
				return createGisDistanceMatrixCalculatorOsrmOneToOneAdapter();
			}
			@Override
			public Adapter caseGisDistanceMatrixCalculatorOsrmManyToMany(GisDistanceMatrixCalculatorOsrmManyToMany object) {
				return createGisDistanceMatrixCalculatorOsrmManyToManyAdapter();
			}
			@Override
			public Adapter caseGisPinpointerOsrmNearest(GisPinpointerOsrmNearest object) {
				return createGisPinpointerOsrmNearestAdapter();
			}
			@Override
			public Adapter caseGisRouter(GisRouter object) {
				return createGisRouterAdapter();
			}
			@Override
			public Adapter caseGisRouteCalculator(GisRouteCalculator object) {
				return createGisRouteCalculatorAdapter();
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
			public Adapter caseGisToolLocation(GisToolLocation object) {
				return createGisToolLocationAdapter();
			}
			@Override
			public Adapter caseGisLocationPinpointer(GisLocationPinpointer object) {
				return createGisLocationPinpointerAdapter();
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
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.gis.osrm.GisDistanceMatrixCalculatorOsrmOneToOne <em>Gis Distance Matrix Calculator Osrm One To One</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.gis.osrm.GisDistanceMatrixCalculatorOsrmOneToOne
	 * @generated
	 */
	public Adapter createGisDistanceMatrixCalculatorOsrmOneToOneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.gis.osrm.GisDistanceMatrixCalculatorOsrmManyToMany <em>Gis Distance Matrix Calculator Osrm Many To Many</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.gis.osrm.GisDistanceMatrixCalculatorOsrmManyToMany
	 * @generated
	 */
	public Adapter createGisDistanceMatrixCalculatorOsrmManyToManyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.gis.osrm.GisPinpointerOsrmNearest <em>Gis Pinpointer Osrm Nearest</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.gis.osrm.GisPinpointerOsrmNearest
	 * @generated
	 */
	public Adapter createGisPinpointerOsrmNearestAdapter() {
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

} //GisOsrmAdapterFactory
