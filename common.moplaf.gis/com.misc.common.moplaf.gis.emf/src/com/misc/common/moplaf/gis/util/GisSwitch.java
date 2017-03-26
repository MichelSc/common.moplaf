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
	 * @parameter ePackage the package in question.
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
			case GisPackage.GIS_COORDINATES: {
				GisCoordinates gisCoordinates = (GisCoordinates)theEObject;
				T result = caseGisCoordinates(gisCoordinates);
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
			case GisPackage.GIS_DISTANCE_MATRIX: {
				GisDistanceMatrix gisDistanceMatrix = (GisDistanceMatrix)theEObject;
				T result = caseGisDistanceMatrix(gisDistanceMatrix);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GisPackage.GIS_DISTANCE_MATRIX_ELEMENT: {
				GisDistanceMatrixElement gisDistanceMatrixElement = (GisDistanceMatrixElement)theEObject;
				T result = caseGisDistanceMatrixElement(gisDistanceMatrixElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GisPackage.GIS_DISTANCE_MATRIX_FROM_LOCATION: {
				GisDistanceMatrixFromLocation gisDistanceMatrixFromLocation = (GisDistanceMatrixFromLocation)theEObject;
				T result = caseGisDistanceMatrixFromLocation(gisDistanceMatrixFromLocation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GisPackage.GIS_DISTANCE_MATRIX_TO_LOCATION: {
				GisDistanceMatrixToLocation gisDistanceMatrixToLocation = (GisDistanceMatrixToLocation)theEObject;
				T result = caseGisDistanceMatrixToLocation(gisDistanceMatrixToLocation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GisPackage.GIS_ADDRESS_GEOCODED: {
				GisAddressGeocoded gisAddressGeocoded = (GisAddressGeocoded)theEObject;
				T result = caseGisAddressGeocoded(gisAddressGeocoded);
				if (result == null) result = caseGisCoordinates(gisAddressGeocoded);
				if (result == null) result = caseGisLocation(gisAddressGeocoded);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GisPackage.GIS_LOCATION: {
				GisLocation gisLocation = (GisLocation)theEObject;
				T result = caseGisLocation(gisLocation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GisPackage.GIS_ADDRESS_GEOCODER: {
				GisAddressGeocoder gisAddressGeocoder = (GisAddressGeocoder)theEObject;
				T result = caseGisAddressGeocoder(gisAddressGeocoder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GisPackage.GIS_DISTANCE_MATRIX_CALCULATOR: {
				GisDistanceMatrixCalculator gisDistanceMatrixCalculator = (GisDistanceMatrixCalculator)theEObject;
				T result = caseGisDistanceMatrixCalculator(gisDistanceMatrixCalculator);
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
			default: return defaultCase(theEObject);
		}
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
	 * Returns the result of interpreting the object as an instance of '<em>Distance Matrix</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Distance Matrix</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGisDistanceMatrix(GisDistanceMatrix object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Distance Matrix Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Distance Matrix Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGisDistanceMatrixElement(GisDistanceMatrixElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Distance Matrix From Location</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Distance Matrix From Location</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGisDistanceMatrixFromLocation(GisDistanceMatrixFromLocation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Distance Matrix To Location</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Distance Matrix To Location</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGisDistanceMatrixToLocation(GisDistanceMatrixToLocation object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Distance Matrix Calculator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Distance Matrix Calculator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGisDistanceMatrixCalculator(GisDistanceMatrixCalculator object) {
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
