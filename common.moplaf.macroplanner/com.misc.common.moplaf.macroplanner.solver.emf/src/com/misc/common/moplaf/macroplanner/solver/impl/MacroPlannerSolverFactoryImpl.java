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
package com.misc.common.moplaf.macroplanner.solver.impl;

import com.misc.common.moplaf.macroplanner.solver.*;

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
public class MacroPlannerSolverFactoryImpl extends EFactoryImpl implements MacroPlannerSolverFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MacroPlannerSolverFactory init() {
		try {
			MacroPlannerSolverFactory theMacroPlannerSolverFactory = (MacroPlannerSolverFactory)EPackage.Registry.INSTANCE.getEFactory(MacroPlannerSolverPackage.eNS_URI);
			if (theMacroPlannerSolverFactory != null) {
				return theMacroPlannerSolverFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MacroPlannerSolverFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MacroPlannerSolverFactoryImpl() {
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
			case MacroPlannerSolverPackage.SCENARIO: return createScenario();
			case MacroPlannerSolverPackage.LP_MACRO_PLANNER: return createLPMacroPlanner();
			case MacroPlannerSolverPackage.LP_TUPLE: return createLPTuple();
			case MacroPlannerSolverPackage.LP_TIME_LINE: return createLPTimeLine();
			case MacroPlannerSolverPackage.LP_TIME_BUCKET: return createLPTimeBucket();
			case MacroPlannerSolverPackage.LP_PRODUCT_SET: return createLPProductSet();
			case MacroPlannerSolverPackage.LP_PRODUCT: return createLPProduct();
			case MacroPlannerSolverPackage.LP_PRODUCT_BUCKET: return createLPProductBucket();
			case MacroPlannerSolverPackage.LP_SUPPLY: return createLPSupply();
			case MacroPlannerSolverPackage.LP_SUPPLY_BUCKET: return createLPSupplyBucket();
			case MacroPlannerSolverPackage.LP_CAPACITY: return createLPCapacity();
			case MacroPlannerSolverPackage.LP_CAPACITY_BUCKET: return createLPCapacityBucket();
			case MacroPlannerSolverPackage.LP_RESOURCE_SET: return createLPResourceSet();
			case MacroPlannerSolverPackage.LP_RESOURCE: return createLPResource();
			case MacroPlannerSolverPackage.LP_RESOURCE_BUCKET: return createLPResourceBucket();
			case MacroPlannerSolverPackage.LP_AVAILABILITY: return createLPAvailability();
			case MacroPlannerSolverPackage.LP_AVAILABILITY_BUCKET: return createLPAvailabilityBucket();
			case MacroPlannerSolverPackage.LP_ROUTING_SET: return createLPRoutingSet();
			case MacroPlannerSolverPackage.LP_ROUTING: return createLPRouting();
			case MacroPlannerSolverPackage.LP_ROUTING_PRODUCT: return createLPRoutingProduct();
			case MacroPlannerSolverPackage.LP_ROUTING_RESOURCE: return createLPRoutingResource();
			case MacroPlannerSolverPackage.LP_ROUTING_BUCKET: return createLPRoutingBucket();
			case MacroPlannerSolverPackage.LP_ROUTING_BUCKET_PRODUCT: return createLPRoutingBucketProduct();
			case MacroPlannerSolverPackage.LP_ROUTING_BUCKET_RESOURCE: return createLPRoutingBucketResource();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scenario createScenario() {
		ScenarioImpl scenario = new ScenarioImpl();
		return scenario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LPMacroPlanner createLPMacroPlanner() {
		LPMacroPlannerImpl lpMacroPlanner = new LPMacroPlannerImpl();
		return lpMacroPlanner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LPTuple createLPTuple() {
		LPTupleImpl lpTuple = new LPTupleImpl();
		return lpTuple;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LPTimeLine createLPTimeLine() {
		LPTimeLineImpl lpTimeLine = new LPTimeLineImpl();
		return lpTimeLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LPTimeBucket createLPTimeBucket() {
		LPTimeBucketImpl lpTimeBucket = new LPTimeBucketImpl();
		return lpTimeBucket;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LPProductSet createLPProductSet() {
		LPProductSetImpl lpProductSet = new LPProductSetImpl();
		return lpProductSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LPProduct createLPProduct() {
		LPProductImpl lpProduct = new LPProductImpl();
		return lpProduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LPProductBucket createLPProductBucket() {
		LPProductBucketImpl lpProductBucket = new LPProductBucketImpl();
		return lpProductBucket;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LPSupply createLPSupply() {
		LPSupplyImpl lpSupply = new LPSupplyImpl();
		return lpSupply;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LPSupplyBucket createLPSupplyBucket() {
		LPSupplyBucketImpl lpSupplyBucket = new LPSupplyBucketImpl();
		return lpSupplyBucket;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LPCapacity createLPCapacity() {
		LPCapacityImpl lpCapacity = new LPCapacityImpl();
		return lpCapacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LPCapacityBucket createLPCapacityBucket() {
		LPCapacityBucketImpl lpCapacityBucket = new LPCapacityBucketImpl();
		return lpCapacityBucket;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LPResourceSet createLPResourceSet() {
		LPResourceSetImpl lpResourceSet = new LPResourceSetImpl();
		return lpResourceSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LPResource createLPResource() {
		LPResourceImpl lpResource = new LPResourceImpl();
		return lpResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LPResourceBucket createLPResourceBucket() {
		LPResourceBucketImpl lpResourceBucket = new LPResourceBucketImpl();
		return lpResourceBucket;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LPAvailability createLPAvailability() {
		LPAvailabilityImpl lpAvailability = new LPAvailabilityImpl();
		return lpAvailability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LPAvailabilityBucket createLPAvailabilityBucket() {
		LPAvailabilityBucketImpl lpAvailabilityBucket = new LPAvailabilityBucketImpl();
		return lpAvailabilityBucket;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LPRoutingSet createLPRoutingSet() {
		LPRoutingSetImpl lpRoutingSet = new LPRoutingSetImpl();
		return lpRoutingSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LPRouting createLPRouting() {
		LPRoutingImpl lpRouting = new LPRoutingImpl();
		return lpRouting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LPRoutingBucket createLPRoutingBucket() {
		LPRoutingBucketImpl lpRoutingBucket = new LPRoutingBucketImpl();
		return lpRoutingBucket;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LPRoutingBucketProduct createLPRoutingBucketProduct() {
		LPRoutingBucketProductImpl lpRoutingBucketProduct = new LPRoutingBucketProductImpl();
		return lpRoutingBucketProduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LPRoutingBucketResource createLPRoutingBucketResource() {
		LPRoutingBucketResourceImpl lpRoutingBucketResource = new LPRoutingBucketResourceImpl();
		return lpRoutingBucketResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LPRoutingProduct createLPRoutingProduct() {
		LPRoutingProductImpl lpRoutingProduct = new LPRoutingProductImpl();
		return lpRoutingProduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LPRoutingResource createLPRoutingResource() {
		LPRoutingResourceImpl lpRoutingResource = new LPRoutingResourceImpl();
		return lpRoutingResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MacroPlannerSolverPackage getMacroPlannerSolverPackage() {
		return (MacroPlannerSolverPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MacroPlannerSolverPackage getPackage() {
		return MacroPlannerSolverPackage.eINSTANCE;
	}

} //MacroPlannerSolverFactoryImpl
