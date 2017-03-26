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
package com.misc.common.moplaf.flock.util;

import com.misc.common.moplaf.flock.*;

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
 * @see com.misc.common.moplaf.flock.FlockPackage
 * @generated
 */
public class FlockSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FlockPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlockSwitch() {
		if (modelPackage == null) {
			modelPackage = FlockPackage.eINSTANCE;
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
			case FlockPackage.FLOCK_SCOPE: {
				FlockScope flockScope = (FlockScope)theEObject;
				T result = caseFlockScope(flockScope);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlockPackage.LOCATION: {
				Location location = (Location)theEObject;
				T result = caseLocation(location);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlockPackage.FLOCK: {
				Flock flock = (Flock)theEObject;
				T result = caseFlock(flock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlockPackage.FLOCK_EVENT: {
				FlockEvent flockEvent = (FlockEvent)theEObject;
				T result = caseFlockEvent(flockEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlockPackage.CHAIN_FLOCK: {
				ChainFlock chainFlock = (ChainFlock)theEObject;
				T result = caseChainFlock(chainFlock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlockPackage.FLOCK_CONFIGURATION: {
				FlockConfiguration flockConfiguration = (FlockConfiguration)theEObject;
				T result = caseFlockConfiguration(flockConfiguration);
				if (result == null) result = caseFlock(flockConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlockPackage.FLOCK_MOVE: {
				FlockMove flockMove = (FlockMove)theEObject;
				T result = caseFlockMove(flockMove);
				if (result == null) result = caseFlock(flockMove);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlockPackage.FLOCK_RIDE: {
				FlockRide flockRide = (FlockRide)theEObject;
				T result = caseFlockRide(flockRide);
				if (result == null) result = caseFlock(flockRide);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlockPackage.FLOCK_WAY_POINT: {
				FlockWayPoint flockWayPoint = (FlockWayPoint)theEObject;
				T result = caseFlockWayPoint(flockWayPoint);
				if (result == null) result = caseFlock(flockWayPoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlockPackage.FLOCK_IDLE: {
				FlockIdle flockIdle = (FlockIdle)theEObject;
				T result = caseFlockIdle(flockIdle);
				if (result == null) result = caseFlock(flockIdle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlockPackage.CHAIN: {
				Chain chain = (Chain)theEObject;
				T result = caseChain(chain);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlockPackage.CHAIN_RIDE: {
				ChainRide chainRide = (ChainRide)theEObject;
				T result = caseChainRide(chainRide);
				if (result == null) result = caseChainFlock(chainRide);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlockPackage.CHAIN_WAY_POINT: {
				ChainWayPoint chainWayPoint = (ChainWayPoint)theEObject;
				T result = caseChainWayPoint(chainWayPoint);
				if (result == null) result = caseChainFlock(chainWayPoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlockPackage.CHAIN_FLOCK_CONFIGURATION: {
				ChainFlockConfiguration chainFlockConfiguration = (ChainFlockConfiguration)theEObject;
				T result = caseChainFlockConfiguration(chainFlockConfiguration);
				if (result == null) result = caseChainFlock(chainFlockConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlockPackage.CHAIN_CONFIGURATION: {
				ChainConfiguration chainConfiguration = (ChainConfiguration)theEObject;
				T result = caseChainConfiguration(chainConfiguration);
				if (result == null) result = caseChainFlockConfiguration(chainConfiguration);
				if (result == null) result = caseChainFlock(chainConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlockPackage.CHAIN_MOUNT: {
				ChainMount chainMount = (ChainMount)theEObject;
				T result = caseChainMount(chainMount);
				if (result == null) result = caseChainFlockConfiguration(chainMount);
				if (result == null) result = caseChainFlock(chainMount);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlockPackage.CHAIN_MOUNTED: {
				ChainMounted chainMounted = (ChainMounted)theEObject;
				T result = caseChainMounted(chainMounted);
				if (result == null) result = caseChainFlockConfiguration(chainMounted);
				if (result == null) result = caseChainFlock(chainMounted);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scope</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scope</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlockScope(FlockScope object) {
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
	public T caseLocation(Location object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flock</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flock</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlock(Flock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlockEvent(FlockEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Chain Flock</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Chain Flock</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChainFlock(ChainFlock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlockConfiguration(FlockConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Move</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Move</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlockMove(FlockMove object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ride</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ride</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlockRide(FlockRide object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Way Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Way Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlockWayPoint(FlockWayPoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Idle</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Idle</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlockIdle(FlockIdle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Chain</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Chain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChain(Chain object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Chain Ride</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Chain Ride</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChainRide(ChainRide object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Chain Way Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Chain Way Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChainWayPoint(ChainWayPoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Chain Flock Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Chain Flock Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChainFlockConfiguration(ChainFlockConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Chain Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Chain Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChainConfiguration(ChainConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Chain Mount</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Chain Mount</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChainMount(ChainMount object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Chain Mounted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Chain Mounted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChainMounted(ChainMounted object) {
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

} //FlockSwitch
