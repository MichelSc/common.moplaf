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
package com.misc.common.moplaf.macroplanner.solver.util;

import com.misc.common.moplaf.job.Run;

import com.misc.common.moplaf.job.RunParams;
import com.misc.common.moplaf.macroplanner.solver.*;

import com.misc.common.moplaf.solver.Generator;
import com.misc.common.moplaf.solver.GeneratorElement;
import com.misc.common.moplaf.solver.GeneratorTuple;

import com.misc.common.moplaf.time.discrete.ObjectTimeBucket;
import com.misc.common.moplaf.time.discrete.ObjectWithTimeLine;

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
 * @see com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage
 * @generated
 */
public class MacroPlannerSolverSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MacroPlannerSolverPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MacroPlannerSolverSwitch() {
		if (modelPackage == null) {
			modelPackage = MacroPlannerSolverPackage.eINSTANCE;
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
			case MacroPlannerSolverPackage.SCENARIO: {
				Scenario scenario = (Scenario)theEObject;
				T result = caseScenario(scenario);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MacroPlannerSolverPackage.LP_MACRO_PLANNER: {
				LPMacroPlanner lpMacroPlanner = (LPMacroPlanner)theEObject;
				T result = caseLPMacroPlanner(lpMacroPlanner);
				if (result == null) result = caseGenerator(lpMacroPlanner);
				if (result == null) result = caseRun(lpMacroPlanner);
				if (result == null) result = caseRunParams(lpMacroPlanner);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MacroPlannerSolverPackage.LP_TUPLE: {
				LPTuple lpTuple = (LPTuple)theEObject;
				T result = caseLPTuple(lpTuple);
				if (result == null) result = caseGeneratorTuple(lpTuple);
				if (result == null) result = caseGeneratorElement(lpTuple);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MacroPlannerSolverPackage.LP_TIME_LINE: {
				LPTimeLine lpTimeLine = (LPTimeLine)theEObject;
				T result = caseLPTimeLine(lpTimeLine);
				if (result == null) result = caseLPTuple(lpTimeLine);
				if (result == null) result = caseObjectWithTimeLine(lpTimeLine);
				if (result == null) result = caseGeneratorTuple(lpTimeLine);
				if (result == null) result = caseGeneratorElement(lpTimeLine);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MacroPlannerSolverPackage.LP_TIME_BUCKET: {
				LPTimeBucket lpTimeBucket = (LPTimeBucket)theEObject;
				T result = caseLPTimeBucket(lpTimeBucket);
				if (result == null) result = caseLPTuple(lpTimeBucket);
				if (result == null) result = caseObjectTimeBucket(lpTimeBucket);
				if (result == null) result = caseGeneratorTuple(lpTimeBucket);
				if (result == null) result = caseGeneratorElement(lpTimeBucket);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MacroPlannerSolverPackage.LP_PRODUCT_SET: {
				LPProductSet lpProductSet = (LPProductSet)theEObject;
				T result = caseLPProductSet(lpProductSet);
				if (result == null) result = caseLPTuple(lpProductSet);
				if (result == null) result = caseGeneratorTuple(lpProductSet);
				if (result == null) result = caseGeneratorElement(lpProductSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MacroPlannerSolverPackage.LP_PRODUCT: {
				LPProduct lpProduct = (LPProduct)theEObject;
				T result = caseLPProduct(lpProduct);
				if (result == null) result = caseLPTimeLine(lpProduct);
				if (result == null) result = caseLPTuple(lpProduct);
				if (result == null) result = caseObjectWithTimeLine(lpProduct);
				if (result == null) result = caseGeneratorTuple(lpProduct);
				if (result == null) result = caseGeneratorElement(lpProduct);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MacroPlannerSolverPackage.LP_PRODUCT_BUCKET: {
				LPProductBucket lpProductBucket = (LPProductBucket)theEObject;
				T result = caseLPProductBucket(lpProductBucket);
				if (result == null) result = caseLPTimeBucket(lpProductBucket);
				if (result == null) result = caseLPTuple(lpProductBucket);
				if (result == null) result = caseObjectTimeBucket(lpProductBucket);
				if (result == null) result = caseGeneratorTuple(lpProductBucket);
				if (result == null) result = caseGeneratorElement(lpProductBucket);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MacroPlannerSolverPackage.LP_SUPPLY: {
				LPSupply lpSupply = (LPSupply)theEObject;
				T result = caseLPSupply(lpSupply);
				if (result == null) result = caseLPTimeLine(lpSupply);
				if (result == null) result = caseLPTuple(lpSupply);
				if (result == null) result = caseObjectWithTimeLine(lpSupply);
				if (result == null) result = caseGeneratorTuple(lpSupply);
				if (result == null) result = caseGeneratorElement(lpSupply);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MacroPlannerSolverPackage.LP_SUPPLY_BUCKET: {
				LPSupplyBucket lpSupplyBucket = (LPSupplyBucket)theEObject;
				T result = caseLPSupplyBucket(lpSupplyBucket);
				if (result == null) result = caseLPTimeBucket(lpSupplyBucket);
				if (result == null) result = caseLPTuple(lpSupplyBucket);
				if (result == null) result = caseObjectTimeBucket(lpSupplyBucket);
				if (result == null) result = caseGeneratorTuple(lpSupplyBucket);
				if (result == null) result = caseGeneratorElement(lpSupplyBucket);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MacroPlannerSolverPackage.LP_CAPACITY: {
				LPCapacity lpCapacity = (LPCapacity)theEObject;
				T result = caseLPCapacity(lpCapacity);
				if (result == null) result = caseLPTimeLine(lpCapacity);
				if (result == null) result = caseLPTuple(lpCapacity);
				if (result == null) result = caseObjectWithTimeLine(lpCapacity);
				if (result == null) result = caseGeneratorTuple(lpCapacity);
				if (result == null) result = caseGeneratorElement(lpCapacity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MacroPlannerSolverPackage.LP_CAPACITY_BUCKET: {
				LPCapacityBucket lpCapacityBucket = (LPCapacityBucket)theEObject;
				T result = caseLPCapacityBucket(lpCapacityBucket);
				if (result == null) result = caseLPTimeBucket(lpCapacityBucket);
				if (result == null) result = caseLPTuple(lpCapacityBucket);
				if (result == null) result = caseObjectTimeBucket(lpCapacityBucket);
				if (result == null) result = caseGeneratorTuple(lpCapacityBucket);
				if (result == null) result = caseGeneratorElement(lpCapacityBucket);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MacroPlannerSolverPackage.LP_RESOURCE_SET: {
				LPResourceSet lpResourceSet = (LPResourceSet)theEObject;
				T result = caseLPResourceSet(lpResourceSet);
				if (result == null) result = caseLPTuple(lpResourceSet);
				if (result == null) result = caseGeneratorTuple(lpResourceSet);
				if (result == null) result = caseGeneratorElement(lpResourceSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MacroPlannerSolverPackage.LP_RESOURCE: {
				LPResource lpResource = (LPResource)theEObject;
				T result = caseLPResource(lpResource);
				if (result == null) result = caseLPTimeLine(lpResource);
				if (result == null) result = caseLPTuple(lpResource);
				if (result == null) result = caseObjectWithTimeLine(lpResource);
				if (result == null) result = caseGeneratorTuple(lpResource);
				if (result == null) result = caseGeneratorElement(lpResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MacroPlannerSolverPackage.LP_RESOURCE_BUCKET: {
				LPResourceBucket lpResourceBucket = (LPResourceBucket)theEObject;
				T result = caseLPResourceBucket(lpResourceBucket);
				if (result == null) result = caseLPTimeBucket(lpResourceBucket);
				if (result == null) result = caseLPTuple(lpResourceBucket);
				if (result == null) result = caseObjectTimeBucket(lpResourceBucket);
				if (result == null) result = caseGeneratorTuple(lpResourceBucket);
				if (result == null) result = caseGeneratorElement(lpResourceBucket);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MacroPlannerSolverPackage.LP_AVAILABILITY: {
				LPAvailability lpAvailability = (LPAvailability)theEObject;
				T result = caseLPAvailability(lpAvailability);
				if (result == null) result = caseLPTimeLine(lpAvailability);
				if (result == null) result = caseLPTuple(lpAvailability);
				if (result == null) result = caseObjectWithTimeLine(lpAvailability);
				if (result == null) result = caseGeneratorTuple(lpAvailability);
				if (result == null) result = caseGeneratorElement(lpAvailability);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MacroPlannerSolverPackage.LP_AVAILABILITY_BUCKET: {
				LPAvailabilityBucket lpAvailabilityBucket = (LPAvailabilityBucket)theEObject;
				T result = caseLPAvailabilityBucket(lpAvailabilityBucket);
				if (result == null) result = caseLPTimeBucket(lpAvailabilityBucket);
				if (result == null) result = caseLPTuple(lpAvailabilityBucket);
				if (result == null) result = caseObjectTimeBucket(lpAvailabilityBucket);
				if (result == null) result = caseGeneratorTuple(lpAvailabilityBucket);
				if (result == null) result = caseGeneratorElement(lpAvailabilityBucket);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MacroPlannerSolverPackage.LP_ROUTING_SET: {
				LPRoutingSet lpRoutingSet = (LPRoutingSet)theEObject;
				T result = caseLPRoutingSet(lpRoutingSet);
				if (result == null) result = caseLPTuple(lpRoutingSet);
				if (result == null) result = caseGeneratorTuple(lpRoutingSet);
				if (result == null) result = caseGeneratorElement(lpRoutingSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MacroPlannerSolverPackage.LP_ROUTING: {
				LPRouting lpRouting = (LPRouting)theEObject;
				T result = caseLPRouting(lpRouting);
				if (result == null) result = caseLPTimeLine(lpRouting);
				if (result == null) result = caseLPTuple(lpRouting);
				if (result == null) result = caseObjectWithTimeLine(lpRouting);
				if (result == null) result = caseGeneratorTuple(lpRouting);
				if (result == null) result = caseGeneratorElement(lpRouting);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MacroPlannerSolverPackage.LP_ROUTING_PRODUCT: {
				LPRoutingProduct lpRoutingProduct = (LPRoutingProduct)theEObject;
				T result = caseLPRoutingProduct(lpRoutingProduct);
				if (result == null) result = caseGeneratorTuple(lpRoutingProduct);
				if (result == null) result = caseGeneratorElement(lpRoutingProduct);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MacroPlannerSolverPackage.LP_ROUTING_RESOURCE: {
				LPRoutingResource lpRoutingResource = (LPRoutingResource)theEObject;
				T result = caseLPRoutingResource(lpRoutingResource);
				if (result == null) result = caseGeneratorTuple(lpRoutingResource);
				if (result == null) result = caseGeneratorElement(lpRoutingResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MacroPlannerSolverPackage.LP_ROUTING_BUCKET: {
				LPRoutingBucket lpRoutingBucket = (LPRoutingBucket)theEObject;
				T result = caseLPRoutingBucket(lpRoutingBucket);
				if (result == null) result = caseLPTimeBucket(lpRoutingBucket);
				if (result == null) result = caseLPTuple(lpRoutingBucket);
				if (result == null) result = caseObjectTimeBucket(lpRoutingBucket);
				if (result == null) result = caseGeneratorTuple(lpRoutingBucket);
				if (result == null) result = caseGeneratorElement(lpRoutingBucket);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MacroPlannerSolverPackage.LP_ROUTING_BUCKET_PRODUCT: {
				LPRoutingBucketProduct lpRoutingBucketProduct = (LPRoutingBucketProduct)theEObject;
				T result = caseLPRoutingBucketProduct(lpRoutingBucketProduct);
				if (result == null) result = caseLPTuple(lpRoutingBucketProduct);
				if (result == null) result = caseGeneratorTuple(lpRoutingBucketProduct);
				if (result == null) result = caseGeneratorElement(lpRoutingBucketProduct);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MacroPlannerSolverPackage.LP_ROUTING_BUCKET_RESOURCE: {
				LPRoutingBucketResource lpRoutingBucketResource = (LPRoutingBucketResource)theEObject;
				T result = caseLPRoutingBucketResource(lpRoutingBucketResource);
				if (result == null) result = caseLPTuple(lpRoutingBucketResource);
				if (result == null) result = caseGeneratorTuple(lpRoutingBucketResource);
				if (result == null) result = caseGeneratorElement(lpRoutingBucketResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scenario</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scenario</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScenario(Scenario object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LP Macro Planner</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LP Macro Planner</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLPMacroPlanner(LPMacroPlanner object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LP Tuple</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LP Tuple</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLPTuple(LPTuple object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LP Time Line</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LP Time Line</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLPTimeLine(LPTimeLine object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LP Time Bucket</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LP Time Bucket</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLPTimeBucket(LPTimeBucket object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LP Product Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LP Product Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLPProductSet(LPProductSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LP Product</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LP Product</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLPProduct(LPProduct object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LP Product Bucket</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LP Product Bucket</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLPProductBucket(LPProductBucket object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LP Supply</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LP Supply</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLPSupply(LPSupply object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LP Supply Bucket</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LP Supply Bucket</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLPSupplyBucket(LPSupplyBucket object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LP Capacity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LP Capacity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLPCapacity(LPCapacity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LP Capacity Bucket</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LP Capacity Bucket</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLPCapacityBucket(LPCapacityBucket object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LP Resource Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LP Resource Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLPResourceSet(LPResourceSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LP Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LP Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLPResource(LPResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LP Resource Bucket</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LP Resource Bucket</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLPResourceBucket(LPResourceBucket object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LP Availability</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LP Availability</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLPAvailability(LPAvailability object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LP Availability Bucket</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LP Availability Bucket</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLPAvailabilityBucket(LPAvailabilityBucket object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LP Routing Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LP Routing Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLPRoutingSet(LPRoutingSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LP Routing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LP Routing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLPRouting(LPRouting object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LP Routing Bucket</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LP Routing Bucket</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLPRoutingBucket(LPRoutingBucket object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LP Routing Bucket Product</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LP Routing Bucket Product</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLPRoutingBucketProduct(LPRoutingBucketProduct object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LP Routing Bucket Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LP Routing Bucket Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLPRoutingBucketResource(LPRoutingBucketResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Run Params</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Run Params</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRunParams(RunParams object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LP Routing Product</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LP Routing Product</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLPRoutingProduct(LPRoutingProduct object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LP Routing Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LP Routing Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLPRoutingResource(LPRoutingResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Run</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Run</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRun(Run object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenerator(Generator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generator Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generator Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneratorElement(GeneratorElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generator Tuple</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generator Tuple</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneratorTuple(GeneratorTuple object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object With Time Line</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object With Time Line</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectWithTimeLine(ObjectWithTimeLine object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Time Bucket</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Time Bucket</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectTimeBucket(ObjectTimeBucket object) {
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

} //MacroPlannerSolverSwitch
