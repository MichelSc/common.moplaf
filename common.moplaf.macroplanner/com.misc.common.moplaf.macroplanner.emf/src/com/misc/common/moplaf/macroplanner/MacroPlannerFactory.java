/**
 */
package com.misc.common.moplaf.macroplanner;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.misc.common.moplaf.macroplanner.MacroPlannerPackage
 * @generated
 */
public interface MacroPlannerFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MacroPlannerFactory eINSTANCE = com.misc.common.moplaf.macroplanner.impl.MacroPlannerFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Supply Chain Master Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Supply Chain Master Data</em>'.
	 * @generated
	 */
	SupplyChainMasterData createSupplyChainMasterData();

	/**
	 * Returns a new object of class '<em>Product</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product</em>'.
	 * @generated
	 */
	Product createProduct();

	/**
	 * Returns a new object of class '<em>Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource</em>'.
	 * @generated
	 */
	Resource createResource();

	/**
	 * Returns a new object of class '<em>Location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Location</em>'.
	 * @generated
	 */
	Location createLocation();

	/**
	 * Returns a new object of class '<em>Location Product</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Location Product</em>'.
	 * @generated
	 */
	LocationProduct createLocationProduct();

	/**
	 * Returns a new object of class '<em>Location Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Location Resource</em>'.
	 * @generated
	 */
	LocationResource createLocationResource();

	/**
	 * Returns a new object of class '<em>Supply Chain Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Supply Chain Data</em>'.
	 * @generated
	 */
	SupplyChainData createSupplyChainData();

	/**
	 * Returns a new object of class '<em>Supply</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Supply</em>'.
	 * @generated
	 */
	Supply createSupply();

	/**
	 * Returns a new object of class '<em>Availability</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Availability</em>'.
	 * @generated
	 */
	Availability createAvailability();

	/**
	 * Returns a new object of class '<em>Capacity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Capacity</em>'.
	 * @generated
	 */
	Capacity createCapacity();

	/**
	 * Returns a new object of class '<em>Supply Chain Routings</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Supply Chain Routings</em>'.
	 * @generated
	 */
	SupplyChainRoutings createSupplyChainRoutings();

	/**
	 * Returns a new object of class '<em>Routing</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Routing</em>'.
	 * @generated
	 */
	Routing createRouting();

	/**
	 * Returns a new object of class '<em>Routing Product</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Routing Product</em>'.
	 * @generated
	 */
	RoutingProduct createRoutingProduct();

	/**
	 * Returns a new object of class '<em>Routing Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Routing Resource</em>'.
	 * @generated
	 */
	RoutingResource createRoutingResource();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MacroPlannerPackage getMacroPlannerPackage();

} //MacroPlannerFactory
