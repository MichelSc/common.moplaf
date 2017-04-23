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
			case MacroPlannerPackage.MACRO_PLANNER_STATIC_DATA: return createMacroPlannerStaticData();
			case MacroPlannerPackage.PRODUCT: return createProduct();
			case MacroPlannerPackage.RESOURCE: return createResource();
			case MacroPlannerPackage.LOCATION: return createLocation();
			case MacroPlannerPackage.LOCATION_PRODUCT: return createLocationProduct();
			case MacroPlannerPackage.LOCATION_RESOURCE: return createLocationResource();
			case MacroPlannerPackage.MACRO_PLANNER_DATA: return createMacroPlannerData();
			case MacroPlannerPackage.AVAILABILITY: return createAvailability();
			case MacroPlannerPackage.CAPACITY: return createCapacity();
			case MacroPlannerPackage.ROUTING: return createRouting();
			case MacroPlannerPackage.ROUTING_PRODUCT: return createRoutingProduct();
			case MacroPlannerPackage.ROUTING_RESOURCE: return createRoutingResource();
			case MacroPlannerPackage.SUPPLY: return createSupply();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MacroPlannerStaticData createMacroPlannerStaticData() {
		MacroPlannerStaticDataImpl macroPlannerStaticData = new MacroPlannerStaticDataImpl();
		return macroPlannerStaticData;
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
	public MacroPlannerData createMacroPlannerData() {
		MacroPlannerDataImpl macroPlannerData = new MacroPlannerDataImpl();
		return macroPlannerData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Supply createSupply() {
		SupplyImpl supply = new SupplyImpl();
		return supply;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Availability createAvailability() {
		AvailabilityImpl availability = new AvailabilityImpl();
		return availability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Capacity createCapacity() {
		CapacityImpl capacity = new CapacityImpl();
		return capacity;
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
