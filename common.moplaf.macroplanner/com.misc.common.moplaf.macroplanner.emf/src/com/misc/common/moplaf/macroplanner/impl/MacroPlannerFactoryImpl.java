/**
 */
package com.misc.common.moplaf.macroplanner.impl;

import com.misc.common.moplaf.macroplanner.*;

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
public class MacroPlannerFactoryImpl extends EFactoryImpl implements MacroPlannerFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MacroPlannerFactory init() {
		try {
			MacroPlannerFactory theMacroPlannerFactory = (MacroPlannerFactory)EPackage.Registry.INSTANCE.getEFactory(MacroPlannerPackage.eNS_URI);
			if (theMacroPlannerFactory != null) {
				return theMacroPlannerFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MacroPlannerFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MacroPlannerFactoryImpl() {
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
			case MacroPlannerPackage.SUPPLY_CHAIN_MASTER_DATA: return createSupplyChainMasterData();
			case MacroPlannerPackage.PRODUCT: return createProduct();
			case MacroPlannerPackage.RESOURCE: return createResource();
			case MacroPlannerPackage.LOCATION: return createLocation();
			case MacroPlannerPackage.LOCATION_PRODUCT: return createLocationProduct();
			case MacroPlannerPackage.LOCATION_RESOURCE: return createLocationResource();
			case MacroPlannerPackage.SUPPLY_CHAIN_DATA: return createSupplyChainData();
			case MacroPlannerPackage.PRODUCT_SUPPLY: return createProductSupply();
			case MacroPlannerPackage.RESOURCE_AVAILABLE: return createResourceAvailable();
			case MacroPlannerPackage.SUPPLY_CHAIN_ROUTINGS: return createSupplyChainRoutings();
			case MacroPlannerPackage.ROUTING: return createRouting();
			case MacroPlannerPackage.ROUTING_PRODUCT: return createRoutingProduct();
			case MacroPlannerPackage.ROUTING_RESOURCE: return createRoutingResource();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupplyChainMasterData createSupplyChainMasterData() {
		SupplyChainMasterDataImpl supplyChainMasterData = new SupplyChainMasterDataImpl();
		return supplyChainMasterData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Product createProduct() {
		ProductImpl product = new ProductImpl();
		return product;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource createResource() {
		ResourceImpl resource = new ResourceImpl();
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location createLocation() {
		LocationImpl location = new LocationImpl();
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationProduct createLocationProduct() {
		LocationProductImpl locationProduct = new LocationProductImpl();
		return locationProduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationResource createLocationResource() {
		LocationResourceImpl locationResource = new LocationResourceImpl();
		return locationResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupplyChainData createSupplyChainData() {
		SupplyChainDataImpl supplyChainData = new SupplyChainDataImpl();
		return supplyChainData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductSupply createProductSupply() {
		ProductSupplyImpl productSupply = new ProductSupplyImpl();
		return productSupply;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceAvailable createResourceAvailable() {
		ResourceAvailableImpl resourceAvailable = new ResourceAvailableImpl();
		return resourceAvailable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupplyChainRoutings createSupplyChainRoutings() {
		SupplyChainRoutingsImpl supplyChainRoutings = new SupplyChainRoutingsImpl();
		return supplyChainRoutings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Routing createRouting() {
		RoutingImpl routing = new RoutingImpl();
		return routing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoutingProduct createRoutingProduct() {
		RoutingProductImpl routingProduct = new RoutingProductImpl();
		return routingProduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoutingResource createRoutingResource() {
		RoutingResourceImpl routingResource = new RoutingResourceImpl();
		return routingResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MacroPlannerPackage getMacroPlannerPackage() {
		return (MacroPlannerPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MacroPlannerPackage getPackage() {
		return MacroPlannerPackage.eINSTANCE;
	}

} //MacroPlannerFactoryImpl
