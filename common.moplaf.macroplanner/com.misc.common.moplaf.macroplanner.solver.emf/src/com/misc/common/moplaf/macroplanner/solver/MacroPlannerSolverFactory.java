/**
 */
package com.misc.common.moplaf.macroplanner.solver;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage
 * @generated
 */
public interface MacroPlannerSolverFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MacroPlannerSolverFactory eINSTANCE = com.misc.common.moplaf.macroplanner.solver.impl.MacroPlannerSolverFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Scenario</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scenario</em>'.
	 * @generated
	 */
	Scenario createScenario();

	/**
	 * Returns a new object of class '<em>LP Macro Planner</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>LP Macro Planner</em>'.
	 * @generated
	 */
	LPMacroPlanner createLPMacroPlanner();

	/**
	 * Returns a new object of class '<em>LP Tuple</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>LP Tuple</em>'.
	 * @generated
	 */
	LPTuple createLPTuple();

	/**
	 * Returns a new object of class '<em>LP Time Line</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>LP Time Line</em>'.
	 * @generated
	 */
	LPTimeLine createLPTimeLine();

	/**
	 * Returns a new object of class '<em>LP Time Bucket</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>LP Time Bucket</em>'.
	 * @generated
	 */
	LPTimeBucket createLPTimeBucket();

	/**
	 * Returns a new object of class '<em>LP Product Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>LP Product Set</em>'.
	 * @generated
	 */
	LPProductSet createLPProductSet();

	/**
	 * Returns a new object of class '<em>LP Product</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>LP Product</em>'.
	 * @generated
	 */
	LPProduct createLPProduct();

	/**
	 * Returns a new object of class '<em>LP Product Bucket</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>LP Product Bucket</em>'.
	 * @generated
	 */
	LPProductBucket createLPProductBucket();

	/**
	 * Returns a new object of class '<em>LP Supply</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>LP Supply</em>'.
	 * @generated
	 */
	LPSupply createLPSupply();

	/**
	 * Returns a new object of class '<em>LP Supply Bucket</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>LP Supply Bucket</em>'.
	 * @generated
	 */
	LPSupplyBucket createLPSupplyBucket();

	/**
	 * Returns a new object of class '<em>LP Capacity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>LP Capacity</em>'.
	 * @generated
	 */
	LPCapacity createLPCapacity();

	/**
	 * Returns a new object of class '<em>LP Capacity Bucket</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>LP Capacity Bucket</em>'.
	 * @generated
	 */
	LPCapacityBucket createLPCapacityBucket();

	/**
	 * Returns a new object of class '<em>LP Resource Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>LP Resource Set</em>'.
	 * @generated
	 */
	LPResourceSet createLPResourceSet();

	/**
	 * Returns a new object of class '<em>LP Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>LP Resource</em>'.
	 * @generated
	 */
	LPResource createLPResource();

	/**
	 * Returns a new object of class '<em>LP Resource Bucket</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>LP Resource Bucket</em>'.
	 * @generated
	 */
	LPResourceBucket createLPResourceBucket();

	/**
	 * Returns a new object of class '<em>LP Availability</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>LP Availability</em>'.
	 * @generated
	 */
	LPAvailability createLPAvailability();

	/**
	 * Returns a new object of class '<em>LP Availability Bucket</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>LP Availability Bucket</em>'.
	 * @generated
	 */
	LPAvailabilityBucket createLPAvailabilityBucket();

	/**
	 * Returns a new object of class '<em>LP Routing Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>LP Routing Set</em>'.
	 * @generated
	 */
	LPRoutingSet createLPRoutingSet();

	/**
	 * Returns a new object of class '<em>LP Routing</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>LP Routing</em>'.
	 * @generated
	 */
	LPRouting createLPRouting();

	/**
	 * Returns a new object of class '<em>LP Routing Bucket</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>LP Routing Bucket</em>'.
	 * @generated
	 */
	LPRoutingBucket createLPRoutingBucket();

	/**
	 * Returns a new object of class '<em>LP Routing Bucket Product</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>LP Routing Bucket Product</em>'.
	 * @generated
	 */
	LPRoutingBucketProduct createLPRoutingBucketProduct();

	/**
	 * Returns a new object of class '<em>LP Routing Bucket Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>LP Routing Bucket Resource</em>'.
	 * @generated
	 */
	LPRoutingBucketResource createLPRoutingBucketResource();

	/**
	 * Returns a new object of class '<em>LP Routing Product</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>LP Routing Product</em>'.
	 * @generated
	 */
	LPRoutingProduct createLPRoutingProduct();

	/**
	 * Returns a new object of class '<em>LP Routing Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>LP Routing Resource</em>'.
	 * @generated
	 */
	LPRoutingResource createLPRoutingResource();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MacroPlannerSolverPackage getMacroPlannerSolverPackage();

} //MacroPlannerSolverFactory
