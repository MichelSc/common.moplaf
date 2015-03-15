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
			public Adapter caseGisCoordinates(GisCoordinates object) {
				return createGisCoordinatesAdapter();
			}
			@Override
			public Adapter caseGisAddress(GisAddress object) {
				return createGisAddressAdapter();
			}
			@Override
			public Adapter caseGisDistanceMatrix(GisDistanceMatrix object) {
				return createGisDistanceMatrixAdapter();
			}
			@Override
			public Adapter caseGisDistanceMatrixElement(GisDistanceMatrixElement object) {
				return createGisDistanceMatrixElementAdapter();
			}
			@Override
			public Adapter caseGisDistanceFromLocation(GisDistanceFromLocation object) {
				return createGisDistanceFromLocationAdapter();
			}
			@Override
			public Adapter caseGisDistanceToLocation(GisDistanceToLocation object) {
				return createGisDistanceToLocationAdapter();
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
			public Adapter caseGisDistanceMatrixCalculator(GisDistanceMatrixCalculator object) {
				return createGisDistanceMatrixCalculatorAdapter();
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
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.gis.GisDistanceMatrix <em>Distance Matrix</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.gis.GisDistanceMatrix
	 * @generated
	 */
	public Adapter createGisDistanceMatrixAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.gis.GisDistanceMatrixElement <em>Distance Matrix Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.gis.GisDistanceMatrixElement
	 * @generated
	 */
	public Adapter createGisDistanceMatrixElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.gis.GisDistanceFromLocation <em>Distance From Location</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.gis.GisDistanceFromLocation
	 * @generated
	 */
	public Adapter createGisDistanceFromLocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.gis.GisDistanceToLocation <em>Distance To Location</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.gis.GisDistanceToLocation
	 * @generated
	 */
	public Adapter createGisDistanceToLocationAdapter() {
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
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.gis.GisDistanceMatrixCalculator <em>Distance Matrix Calculator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.gis.GisDistanceMatrixCalculator
	 * @generated
	 */
	public Adapter createGisDistanceMatrixCalculatorAdapter() {
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
