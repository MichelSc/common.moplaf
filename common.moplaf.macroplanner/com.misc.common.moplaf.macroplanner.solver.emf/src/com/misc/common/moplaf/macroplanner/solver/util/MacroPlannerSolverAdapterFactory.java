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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage
 * @generated
 */
public class MacroPlannerSolverAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MacroPlannerSolverPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MacroPlannerSolverAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = MacroPlannerSolverPackage.eINSTANCE;
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
	protected MacroPlannerSolverSwitch<Adapter> modelSwitch =
		new MacroPlannerSolverSwitch<Adapter>() {
			@Override
			public Adapter caseScenario(Scenario object) {
				return createScenarioAdapter();
			}
			@Override
			public Adapter caseLPMacroPlanner(LPMacroPlanner object) {
				return createLPMacroPlannerAdapter();
			}
			@Override
			public Adapter caseLPTuple(LPTuple object) {
				return createLPTupleAdapter();
			}
			@Override
			public Adapter caseLPTimeLine(LPTimeLine object) {
				return createLPTimeLineAdapter();
			}
			@Override
			public Adapter caseLPTimeBucket(LPTimeBucket object) {
				return createLPTimeBucketAdapter();
			}
			@Override
			public Adapter caseLPProductSet(LPProductSet object) {
				return createLPProductSetAdapter();
			}
			@Override
			public Adapter caseLPProduct(LPProduct object) {
				return createLPProductAdapter();
			}
			@Override
			public Adapter caseLPProductBucket(LPProductBucket object) {
				return createLPProductBucketAdapter();
			}
			@Override
			public Adapter caseLPSupply(LPSupply object) {
				return createLPSupplyAdapter();
			}
			@Override
			public Adapter caseLPSupplyBucket(LPSupplyBucket object) {
				return createLPSupplyBucketAdapter();
			}
			@Override
			public Adapter caseLPCapacity(LPCapacity object) {
				return createLPCapacityAdapter();
			}
			@Override
			public Adapter caseLPCapacityBucket(LPCapacityBucket object) {
				return createLPCapacityBucketAdapter();
			}
			@Override
			public Adapter caseLPResourceSet(LPResourceSet object) {
				return createLPResourceSetAdapter();
			}
			@Override
			public Adapter caseLPResource(LPResource object) {
				return createLPResourceAdapter();
			}
			@Override
			public Adapter caseLPResourceBucket(LPResourceBucket object) {
				return createLPResourceBucketAdapter();
			}
			@Override
			public Adapter caseLPAvailability(LPAvailability object) {
				return createLPAvailabilityAdapter();
			}
			@Override
			public Adapter caseLPAvailabilityBucket(LPAvailabilityBucket object) {
				return createLPAvailabilityBucketAdapter();
			}
			@Override
			public Adapter caseLPRoutingSet(LPRoutingSet object) {
				return createLPRoutingSetAdapter();
			}
			@Override
			public Adapter caseLPRouting(LPRouting object) {
				return createLPRoutingAdapter();
			}
			@Override
			public Adapter caseLPRoutingProduct(LPRoutingProduct object) {
				return createLPRoutingProductAdapter();
			}
			@Override
			public Adapter caseLPRoutingResource(LPRoutingResource object) {
				return createLPRoutingResourceAdapter();
			}
			@Override
			public Adapter caseLPRoutingBucket(LPRoutingBucket object) {
				return createLPRoutingBucketAdapter();
			}
			@Override
			public Adapter caseLPRoutingBucketProduct(LPRoutingBucketProduct object) {
				return createLPRoutingBucketProductAdapter();
			}
			@Override
			public Adapter caseLPRoutingBucketResource(LPRoutingBucketResource object) {
				return createLPRoutingBucketResourceAdapter();
			}
			@Override
			public Adapter caseRunParams(RunParams object) {
				return createRunParamsAdapter();
			}
			@Override
			public Adapter caseRun(Run object) {
				return createRunAdapter();
			}
			@Override
			public Adapter caseGenerator(Generator object) {
				return createGeneratorAdapter();
			}
			@Override
			public Adapter caseGeneratorElement(GeneratorElement object) {
				return createGeneratorElementAdapter();
			}
			@Override
			public Adapter caseGeneratorTuple(GeneratorTuple object) {
				return createGeneratorTupleAdapter();
			}
			@Override
			public Adapter caseObjectWithTimeLine(ObjectWithTimeLine object) {
				return createObjectWithTimeLineAdapter();
			}
			@Override
			public Adapter caseObjectTimeBucket(ObjectTimeBucket object) {
				return createObjectTimeBucketAdapter();
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
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.macroplanner.solver.Scenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.macroplanner.solver.Scenario
	 * @generated
	 */
	public Adapter createScenarioAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.macroplanner.solver.LPMacroPlanner <em>LP Macro Planner</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.macroplanner.solver.LPMacroPlanner
	 * @generated
	 */
	public Adapter createLPMacroPlannerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.macroplanner.solver.LPTuple <em>LP Tuple</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.macroplanner.solver.LPTuple
	 * @generated
	 */
	public Adapter createLPTupleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.macroplanner.solver.LPTimeLine <em>LP Time Line</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.macroplanner.solver.LPTimeLine
	 * @generated
	 */
	public Adapter createLPTimeLineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.macroplanner.solver.LPTimeBucket <em>LP Time Bucket</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.macroplanner.solver.LPTimeBucket
	 * @generated
	 */
	public Adapter createLPTimeBucketAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.macroplanner.solver.LPProductSet <em>LP Product Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.macroplanner.solver.LPProductSet
	 * @generated
	 */
	public Adapter createLPProductSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.macroplanner.solver.LPProduct <em>LP Product</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.macroplanner.solver.LPProduct
	 * @generated
	 */
	public Adapter createLPProductAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.macroplanner.solver.LPProductBucket <em>LP Product Bucket</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.macroplanner.solver.LPProductBucket
	 * @generated
	 */
	public Adapter createLPProductBucketAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.macroplanner.solver.LPSupply <em>LP Supply</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.macroplanner.solver.LPSupply
	 * @generated
	 */
	public Adapter createLPSupplyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.macroplanner.solver.LPSupplyBucket <em>LP Supply Bucket</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.macroplanner.solver.LPSupplyBucket
	 * @generated
	 */
	public Adapter createLPSupplyBucketAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.macroplanner.solver.LPCapacity <em>LP Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.macroplanner.solver.LPCapacity
	 * @generated
	 */
	public Adapter createLPCapacityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.macroplanner.solver.LPCapacityBucket <em>LP Capacity Bucket</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.macroplanner.solver.LPCapacityBucket
	 * @generated
	 */
	public Adapter createLPCapacityBucketAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.macroplanner.solver.LPResourceSet <em>LP Resource Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.macroplanner.solver.LPResourceSet
	 * @generated
	 */
	public Adapter createLPResourceSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.macroplanner.solver.LPResource <em>LP Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.macroplanner.solver.LPResource
	 * @generated
	 */
	public Adapter createLPResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.macroplanner.solver.LPResourceBucket <em>LP Resource Bucket</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.macroplanner.solver.LPResourceBucket
	 * @generated
	 */
	public Adapter createLPResourceBucketAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.macroplanner.solver.LPAvailability <em>LP Availability</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.macroplanner.solver.LPAvailability
	 * @generated
	 */
	public Adapter createLPAvailabilityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.macroplanner.solver.LPAvailabilityBucket <em>LP Availability Bucket</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.macroplanner.solver.LPAvailabilityBucket
	 * @generated
	 */
	public Adapter createLPAvailabilityBucketAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.macroplanner.solver.LPRoutingSet <em>LP Routing Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.macroplanner.solver.LPRoutingSet
	 * @generated
	 */
	public Adapter createLPRoutingSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.macroplanner.solver.LPRouting <em>LP Routing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.macroplanner.solver.LPRouting
	 * @generated
	 */
	public Adapter createLPRoutingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.macroplanner.solver.LPRoutingBucket <em>LP Routing Bucket</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.macroplanner.solver.LPRoutingBucket
	 * @generated
	 */
	public Adapter createLPRoutingBucketAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.macroplanner.solver.LPRoutingBucketProduct <em>LP Routing Bucket Product</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.macroplanner.solver.LPRoutingBucketProduct
	 * @generated
	 */
	public Adapter createLPRoutingBucketProductAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.macroplanner.solver.LPRoutingBucketResource <em>LP Routing Bucket Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.macroplanner.solver.LPRoutingBucketResource
	 * @generated
	 */
	public Adapter createLPRoutingBucketResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.job.RunParams <em>Run Params</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.job.RunParams
	 * @generated
	 */
	public Adapter createRunParamsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.macroplanner.solver.LPRoutingProduct <em>LP Routing Product</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.macroplanner.solver.LPRoutingProduct
	 * @generated
	 */
	public Adapter createLPRoutingProductAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.macroplanner.solver.LPRoutingResource <em>LP Routing Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.macroplanner.solver.LPRoutingResource
	 * @generated
	 */
	public Adapter createLPRoutingResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.job.Run <em>Run</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.job.Run
	 * @generated
	 */
	public Adapter createRunAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.solver.Generator <em>Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.solver.Generator
	 * @generated
	 */
	public Adapter createGeneratorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.solver.GeneratorElement <em>Generator Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.solver.GeneratorElement
	 * @generated
	 */
	public Adapter createGeneratorElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.solver.GeneratorTuple <em>Generator Tuple</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.solver.GeneratorTuple
	 * @generated
	 */
	public Adapter createGeneratorTupleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.time.discrete.ObjectWithTimeLine <em>Object With Time Line</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.time.discrete.ObjectWithTimeLine
	 * @generated
	 */
	public Adapter createObjectWithTimeLineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.time.discrete.ObjectTimeBucket <em>Object Time Bucket</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.time.discrete.ObjectTimeBucket
	 * @generated
	 */
	public Adapter createObjectTimeBucketAdapter() {
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

} //MacroPlannerSolverAdapterFactory
