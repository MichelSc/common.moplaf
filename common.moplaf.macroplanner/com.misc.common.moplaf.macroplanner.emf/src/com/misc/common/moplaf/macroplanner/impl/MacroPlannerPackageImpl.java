/*******************************************************************************
 * Copyright (c) 2017, 2018 Michel Schaffers and others.
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

import com.misc.common.moplaf.macroplanner.Availability;
import com.misc.common.moplaf.macroplanner.Capacity;
import com.misc.common.moplaf.macroplanner.Location;
import com.misc.common.moplaf.macroplanner.LocationProduct;
import com.misc.common.moplaf.macroplanner.LocationResource;
import com.misc.common.moplaf.macroplanner.MacroPlannerData;
import com.misc.common.moplaf.macroplanner.MacroPlannerDataElement;
import com.misc.common.moplaf.macroplanner.MacroPlannerFactory;
import com.misc.common.moplaf.macroplanner.MacroPlannerPackage;
import com.misc.common.moplaf.macroplanner.MacroPlannerStaticData;
import com.misc.common.moplaf.macroplanner.Product;
import com.misc.common.moplaf.macroplanner.Resource;
import com.misc.common.moplaf.macroplanner.Routing;
import com.misc.common.moplaf.macroplanner.RoutingProduct;
import com.misc.common.moplaf.macroplanner.RoutingResource;
import com.misc.common.moplaf.macroplanner.Supply;
import com.misc.common.moplaf.time.TimePackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MacroPlannerPackageImpl extends EPackageImpl implements MacroPlannerPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass macroPlannerStaticDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass macroPlannerDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass macroPlannerDataElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locationProductEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locationResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass supplyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass availabilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass capacityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass routingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass routingProductEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass routingResourceEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see com.misc.common.moplaf.macroplanner.MacroPlannerPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MacroPlannerPackageImpl() {
		super(eNS_URI, MacroPlannerFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link MacroPlannerPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MacroPlannerPackage init() {
		if (isInited) return (MacroPlannerPackage)EPackage.Registry.INSTANCE.getEPackage(MacroPlannerPackage.eNS_URI);

		// Obtain or create and register package
		MacroPlannerPackageImpl theMacroPlannerPackage = (MacroPlannerPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MacroPlannerPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MacroPlannerPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		TimePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theMacroPlannerPackage.createPackageContents();

		// Initialize created meta-data
		theMacroPlannerPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMacroPlannerPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MacroPlannerPackage.eNS_URI, theMacroPlannerPackage);
		return theMacroPlannerPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMacroPlannerStaticData() {
		return macroPlannerStaticDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMacroPlannerStaticData_Products() {
		return (EReference)macroPlannerStaticDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMacroPlannerStaticData_Resources() {
		return (EReference)macroPlannerStaticDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMacroPlannerStaticData_Locations() {
		return (EReference)macroPlannerStaticDataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMacroPlannerStaticData_Name() {
		return (EAttribute)macroPlannerStaticDataEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMacroPlannerData() {
		return macroPlannerDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMacroPlannerData_Elements() {
		return (EReference)macroPlannerDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMacroPlannerData_TimeUnit() {
		return (EAttribute)macroPlannerDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMacroPlannerData_Name() {
		return (EAttribute)macroPlannerDataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMacroPlannerData__GetDurationTimeUnit__TimeUnit() {
		return macroPlannerDataEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMacroPlannerData__ConstructCapacity__LocationProduct() {
		return macroPlannerDataEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMacroPlannerData__ConstructAvailabilty__LocationResource() {
		return macroPlannerDataEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMacroPlannerData__ConstructSupply__LocationProduct() {
		return macroPlannerDataEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMacroPlannerDataElement() {
		return macroPlannerDataElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMacroPlannerDataElement_MacroPlannerData() {
		return (EReference)macroPlannerDataElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProduct() {
		return productEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProduct_Children() {
		return (EReference)productEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProduct_Parent() {
		return (EReference)productEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProduct_Name() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProduct_Code() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResource() {
		return resourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResource_Children() {
		return (EReference)resourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResource_Parent() {
		return (EReference)resourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResource_Name() {
		return (EAttribute)resourceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResource_Code() {
		return (EAttribute)resourceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocation() {
		return locationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocation_Products() {
		return (EReference)locationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocation_Resources() {
		return (EReference)locationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocation_Children() {
		return (EReference)locationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocation_Parent() {
		return (EReference)locationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocation_Name() {
		return (EAttribute)locationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocation_Code() {
		return (EAttribute)locationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLocation__ConstructLocationProduct__Product() {
		return locationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLocation__ConstructLocationResource__Resource() {
		return locationEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocationProduct() {
		return locationProductEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocationProduct_Location() {
		return (EReference)locationProductEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocationProduct_Product() {
		return (EReference)locationProductEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocationProduct_Code() {
		return (EAttribute)locationProductEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocationProduct_Supplies() {
		return (EReference)locationProductEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocationProduct_Capacities() {
		return (EReference)locationProductEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocationResource() {
		return locationResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocationResource_Location() {
		return (EReference)locationResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocationResource_Resource() {
		return (EReference)locationResourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocationResource_Code() {
		return (EAttribute)locationResourceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocationResource_Availabilities() {
		return (EReference)locationResourceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSupply() {
		return supplyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSupply_Quantity() {
		return (EAttribute)supplyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSupply_From() {
		return (EAttribute)supplyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSupply_To() {
		return (EAttribute)supplyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSupply_Cost() {
		return (EAttribute)supplyEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSupply_LocationProduct() {
		return (EReference)supplyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSupply_Description() {
		return (EAttribute)supplyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSupply_Enforce() {
		return (EAttribute)supplyEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAvailability() {
		return availabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAvailability_Quantity() {
		return (EAttribute)availabilityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAvailability_From() {
		return (EAttribute)availabilityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAvailability_To() {
		return (EAttribute)availabilityEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAvailability_Cost() {
		return (EAttribute)availabilityEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAvailability_Enforce() {
		return (EAttribute)availabilityEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAvailability_Penalty() {
		return (EAttribute)availabilityEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAvailability_LocationResource() {
		return (EReference)availabilityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAvailability_Description() {
		return (EAttribute)availabilityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCapacity() {
		return capacityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCapacity_Quantity() {
		return (EAttribute)capacityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCapacity_From() {
		return (EAttribute)capacityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCapacity_To() {
		return (EAttribute)capacityEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCapacity_Cost() {
		return (EAttribute)capacityEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCapacity_Enforce() {
		return (EAttribute)capacityEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCapacity_Penalty() {
		return (EAttribute)capacityEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapacity_LocationProduct() {
		return (EReference)capacityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCapacity_Description() {
		return (EAttribute)capacityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRouting() {
		return routingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRouting_Resources() {
		return (EReference)routingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRouting_Products() {
		return (EReference)routingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRouting_Name() {
		return (EAttribute)routingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRouting_Code() {
		return (EAttribute)routingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRouting_Cost() {
		return (EAttribute)routingEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRouting__ConstructRoutingProduct__LocationProduct() {
		return routingEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRouting__ConstructRoutingResource__LocationResource() {
		return routingEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoutingProduct() {
		return routingProductEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoutingProduct_Routing() {
		return (EReference)routingProductEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoutingProduct_Consumption() {
		return (EAttribute)routingProductEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoutingProduct_Offset() {
		return (EAttribute)routingProductEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoutingProduct_LocationProduct() {
		return (EReference)routingProductEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoutingProduct_Code() {
		return (EAttribute)routingProductEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoutingResource() {
		return routingResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoutingResource_Routing() {
		return (EReference)routingResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoutingResource_Reservation() {
		return (EAttribute)routingResourceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoutingResource_Offset() {
		return (EAttribute)routingResourceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoutingResource_LocationResource() {
		return (EReference)routingResourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoutingResource_Code() {
		return (EAttribute)routingResourceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MacroPlannerFactory getMacroPlannerFactory() {
		return (MacroPlannerFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		macroPlannerStaticDataEClass = createEClass(MACRO_PLANNER_STATIC_DATA);
		createEReference(macroPlannerStaticDataEClass, MACRO_PLANNER_STATIC_DATA__PRODUCTS);
		createEReference(macroPlannerStaticDataEClass, MACRO_PLANNER_STATIC_DATA__RESOURCES);
		createEReference(macroPlannerStaticDataEClass, MACRO_PLANNER_STATIC_DATA__LOCATIONS);
		createEAttribute(macroPlannerStaticDataEClass, MACRO_PLANNER_STATIC_DATA__NAME);

		productEClass = createEClass(PRODUCT);
		createEReference(productEClass, PRODUCT__CHILDREN);
		createEReference(productEClass, PRODUCT__PARENT);
		createEAttribute(productEClass, PRODUCT__NAME);
		createEAttribute(productEClass, PRODUCT__CODE);

		resourceEClass = createEClass(RESOURCE);
		createEReference(resourceEClass, RESOURCE__CHILDREN);
		createEReference(resourceEClass, RESOURCE__PARENT);
		createEAttribute(resourceEClass, RESOURCE__NAME);
		createEAttribute(resourceEClass, RESOURCE__CODE);

		locationEClass = createEClass(LOCATION);
		createEReference(locationEClass, LOCATION__PRODUCTS);
		createEReference(locationEClass, LOCATION__RESOURCES);
		createEReference(locationEClass, LOCATION__CHILDREN);
		createEReference(locationEClass, LOCATION__PARENT);
		createEAttribute(locationEClass, LOCATION__NAME);
		createEAttribute(locationEClass, LOCATION__CODE);
		createEOperation(locationEClass, LOCATION___CONSTRUCT_LOCATION_PRODUCT__PRODUCT);
		createEOperation(locationEClass, LOCATION___CONSTRUCT_LOCATION_RESOURCE__RESOURCE);

		locationProductEClass = createEClass(LOCATION_PRODUCT);
		createEReference(locationProductEClass, LOCATION_PRODUCT__LOCATION);
		createEReference(locationProductEClass, LOCATION_PRODUCT__PRODUCT);
		createEAttribute(locationProductEClass, LOCATION_PRODUCT__CODE);
		createEReference(locationProductEClass, LOCATION_PRODUCT__SUPPLIES);
		createEReference(locationProductEClass, LOCATION_PRODUCT__CAPACITIES);

		locationResourceEClass = createEClass(LOCATION_RESOURCE);
		createEReference(locationResourceEClass, LOCATION_RESOURCE__LOCATION);
		createEReference(locationResourceEClass, LOCATION_RESOURCE__RESOURCE);
		createEAttribute(locationResourceEClass, LOCATION_RESOURCE__CODE);
		createEReference(locationResourceEClass, LOCATION_RESOURCE__AVAILABILITIES);

		macroPlannerDataEClass = createEClass(MACRO_PLANNER_DATA);
		createEReference(macroPlannerDataEClass, MACRO_PLANNER_DATA__ELEMENTS);
		createEAttribute(macroPlannerDataEClass, MACRO_PLANNER_DATA__TIME_UNIT);
		createEAttribute(macroPlannerDataEClass, MACRO_PLANNER_DATA__NAME);
		createEOperation(macroPlannerDataEClass, MACRO_PLANNER_DATA___GET_DURATION_TIME_UNIT__TIMEUNIT);
		createEOperation(macroPlannerDataEClass, MACRO_PLANNER_DATA___CONSTRUCT_CAPACITY__LOCATIONPRODUCT);
		createEOperation(macroPlannerDataEClass, MACRO_PLANNER_DATA___CONSTRUCT_AVAILABILTY__LOCATIONRESOURCE);
		createEOperation(macroPlannerDataEClass, MACRO_PLANNER_DATA___CONSTRUCT_SUPPLY__LOCATIONPRODUCT);

		macroPlannerDataElementEClass = createEClass(MACRO_PLANNER_DATA_ELEMENT);
		createEReference(macroPlannerDataElementEClass, MACRO_PLANNER_DATA_ELEMENT__MACRO_PLANNER_DATA);

		availabilityEClass = createEClass(AVAILABILITY);
		createEReference(availabilityEClass, AVAILABILITY__LOCATION_RESOURCE);
		createEAttribute(availabilityEClass, AVAILABILITY__DESCRIPTION);
		createEAttribute(availabilityEClass, AVAILABILITY__QUANTITY);
		createEAttribute(availabilityEClass, AVAILABILITY__FROM);
		createEAttribute(availabilityEClass, AVAILABILITY__TO);
		createEAttribute(availabilityEClass, AVAILABILITY__COST);
		createEAttribute(availabilityEClass, AVAILABILITY__ENFORCE);
		createEAttribute(availabilityEClass, AVAILABILITY__PENALTY);

		capacityEClass = createEClass(CAPACITY);
		createEReference(capacityEClass, CAPACITY__LOCATION_PRODUCT);
		createEAttribute(capacityEClass, CAPACITY__DESCRIPTION);
		createEAttribute(capacityEClass, CAPACITY__QUANTITY);
		createEAttribute(capacityEClass, CAPACITY__FROM);
		createEAttribute(capacityEClass, CAPACITY__TO);
		createEAttribute(capacityEClass, CAPACITY__COST);
		createEAttribute(capacityEClass, CAPACITY__ENFORCE);
		createEAttribute(capacityEClass, CAPACITY__PENALTY);

		routingEClass = createEClass(ROUTING);
		createEReference(routingEClass, ROUTING__RESOURCES);
		createEReference(routingEClass, ROUTING__PRODUCTS);
		createEAttribute(routingEClass, ROUTING__NAME);
		createEAttribute(routingEClass, ROUTING__CODE);
		createEAttribute(routingEClass, ROUTING__COST);
		createEOperation(routingEClass, ROUTING___CONSTRUCT_ROUTING_PRODUCT__LOCATIONPRODUCT);
		createEOperation(routingEClass, ROUTING___CONSTRUCT_ROUTING_RESOURCE__LOCATIONRESOURCE);

		routingProductEClass = createEClass(ROUTING_PRODUCT);
		createEReference(routingProductEClass, ROUTING_PRODUCT__ROUTING);
		createEReference(routingProductEClass, ROUTING_PRODUCT__LOCATION_PRODUCT);
		createEAttribute(routingProductEClass, ROUTING_PRODUCT__CODE);
		createEAttribute(routingProductEClass, ROUTING_PRODUCT__CONSUMPTION);
		createEAttribute(routingProductEClass, ROUTING_PRODUCT__OFFSET);

		routingResourceEClass = createEClass(ROUTING_RESOURCE);
		createEReference(routingResourceEClass, ROUTING_RESOURCE__ROUTING);
		createEReference(routingResourceEClass, ROUTING_RESOURCE__LOCATION_RESOURCE);
		createEAttribute(routingResourceEClass, ROUTING_RESOURCE__RESERVATION);
		createEAttribute(routingResourceEClass, ROUTING_RESOURCE__OFFSET);
		createEAttribute(routingResourceEClass, ROUTING_RESOURCE__CODE);

		supplyEClass = createEClass(SUPPLY);
		createEReference(supplyEClass, SUPPLY__LOCATION_PRODUCT);
		createEAttribute(supplyEClass, SUPPLY__DESCRIPTION);
		createEAttribute(supplyEClass, SUPPLY__QUANTITY);
		createEAttribute(supplyEClass, SUPPLY__FROM);
		createEAttribute(supplyEClass, SUPPLY__TO);
		createEAttribute(supplyEClass, SUPPLY__COST);
		createEAttribute(supplyEClass, SUPPLY__ENFORCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		TimePackage theTimePackage = (TimePackage)EPackage.Registry.INSTANCE.getEPackage(TimePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		availabilityEClass.getESuperTypes().add(this.getMacroPlannerDataElement());
		capacityEClass.getESuperTypes().add(this.getMacroPlannerDataElement());
		routingEClass.getESuperTypes().add(this.getMacroPlannerDataElement());
		supplyEClass.getESuperTypes().add(this.getMacroPlannerDataElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(macroPlannerStaticDataEClass, MacroPlannerStaticData.class, "MacroPlannerStaticData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMacroPlannerStaticData_Products(), this.getProduct(), null, "Products", null, 0, -1, MacroPlannerStaticData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMacroPlannerStaticData_Resources(), this.getResource(), null, "Resources", null, 0, -1, MacroPlannerStaticData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMacroPlannerStaticData_Locations(), this.getLocation(), null, "Locations", null, 0, -1, MacroPlannerStaticData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMacroPlannerStaticData_Name(), ecorePackage.getEString(), "Name", null, 0, 1, MacroPlannerStaticData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(productEClass, Product.class, "Product", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProduct_Children(), this.getProduct(), this.getProduct_Parent(), "Children", null, 0, -1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProduct_Parent(), this.getProduct(), this.getProduct_Children(), "Parent", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProduct_Name(), ecorePackage.getEString(), "Name", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProduct_Code(), ecorePackage.getEString(), "Code", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceEClass, Resource.class, "Resource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResource_Children(), this.getResource(), this.getResource_Parent(), "Children", null, 0, -1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResource_Parent(), this.getResource(), this.getResource_Children(), "Parent", null, 0, 1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResource_Name(), ecorePackage.getEString(), "Name", null, 0, 1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResource_Code(), ecorePackage.getEString(), "Code", null, 0, 1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(locationEClass, Location.class, "Location", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLocation_Products(), this.getLocationProduct(), this.getLocationProduct_Location(), "Products", null, 0, -1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLocation_Resources(), this.getLocationResource(), this.getLocationResource_Location(), "Resources", null, 0, -1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLocation_Children(), this.getLocation(), this.getLocation_Parent(), "Children", null, 0, -1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLocation_Parent(), this.getLocation(), this.getLocation_Children(), "Parent", null, 0, 1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocation_Name(), ecorePackage.getEString(), "Name", null, 0, 1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocation_Code(), ecorePackage.getEString(), "Code", null, 0, 1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getLocation__ConstructLocationProduct__Product(), this.getLocationProduct(), "constructLocationProduct", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getProduct(), "product", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getLocation__ConstructLocationResource__Resource(), this.getLocationResource(), "constructLocationResource", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getResource(), "resource", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(locationProductEClass, LocationProduct.class, "LocationProduct", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLocationProduct_Location(), this.getLocation(), this.getLocation_Products(), "Location", null, 1, 1, LocationProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLocationProduct_Product(), this.getProduct(), null, "Product", null, 0, 1, LocationProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocationProduct_Code(), ecorePackage.getEString(), "Code", null, 0, 1, LocationProduct.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getLocationProduct_Supplies(), this.getSupply(), this.getSupply_LocationProduct(), "Supplies", null, 0, -1, LocationProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLocationProduct_Capacities(), this.getCapacity(), this.getCapacity_LocationProduct(), "Capacities", null, 0, -1, LocationProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(locationResourceEClass, LocationResource.class, "LocationResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLocationResource_Location(), this.getLocation(), this.getLocation_Resources(), "Location", null, 1, 1, LocationResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLocationResource_Resource(), this.getResource(), null, "Resource", null, 0, 1, LocationResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocationResource_Code(), ecorePackage.getEString(), "Code", null, 0, 1, LocationResource.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getLocationResource_Availabilities(), this.getAvailability(), this.getAvailability_LocationResource(), "Availabilities", null, 0, -1, LocationResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(macroPlannerDataEClass, MacroPlannerData.class, "MacroPlannerData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMacroPlannerData_Elements(), this.getMacroPlannerDataElement(), this.getMacroPlannerDataElement_MacroPlannerData(), "Elements", null, 0, -1, MacroPlannerData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMacroPlannerData_TimeUnit(), theTimePackage.getTimeUnit(), "TimeUnit", null, 0, 1, MacroPlannerData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMacroPlannerData_Name(), ecorePackage.getEString(), "Name", null, 0, 1, MacroPlannerData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getMacroPlannerData__GetDurationTimeUnit__TimeUnit(), ecorePackage.getEFloat(), "getDurationTimeUnit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTimePackage.getTimeUnit(), "timeUnit", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getMacroPlannerData__ConstructCapacity__LocationProduct(), this.getCapacity(), "constructCapacity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getLocationProduct(), "product", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getMacroPlannerData__ConstructAvailabilty__LocationResource(), this.getAvailability(), "constructAvailabilty", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getLocationResource(), "resource", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getMacroPlannerData__ConstructSupply__LocationProduct(), this.getSupply(), "constructSupply", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getLocationProduct(), "product", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(macroPlannerDataElementEClass, MacroPlannerDataElement.class, "MacroPlannerDataElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMacroPlannerDataElement_MacroPlannerData(), this.getMacroPlannerData(), this.getMacroPlannerData_Elements(), "MacroPlannerData", null, 1, 1, MacroPlannerDataElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(availabilityEClass, Availability.class, "Availability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAvailability_LocationResource(), this.getLocationResource(), this.getLocationResource_Availabilities(), "LocationResource", null, 0, 1, Availability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAvailability_Description(), ecorePackage.getEString(), "Description", null, 0, 1, Availability.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getAvailability_Quantity(), ecorePackage.getEFloat(), "Quantity", null, 0, 1, Availability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAvailability_From(), ecorePackage.getEDate(), "From", null, 0, 1, Availability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAvailability_To(), ecorePackage.getEDate(), "To", null, 0, 1, Availability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAvailability_Cost(), ecorePackage.getEFloat(), "Cost", null, 0, 1, Availability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAvailability_Enforce(), ecorePackage.getEBoolean(), "Enforce", null, 0, 1, Availability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAvailability_Penalty(), ecorePackage.getEFloat(), "Penalty", null, 0, 1, Availability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(capacityEClass, Capacity.class, "Capacity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCapacity_LocationProduct(), this.getLocationProduct(), this.getLocationProduct_Capacities(), "LocationProduct", null, 0, 1, Capacity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCapacity_Description(), ecorePackage.getEString(), "Description", null, 0, 1, Capacity.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getCapacity_Quantity(), ecorePackage.getEFloat(), "Quantity", null, 0, 1, Capacity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCapacity_From(), ecorePackage.getEDate(), "From", null, 0, 1, Capacity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCapacity_To(), ecorePackage.getEDate(), "To", null, 0, 1, Capacity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCapacity_Cost(), ecorePackage.getEFloat(), "Cost", null, 0, 1, Capacity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCapacity_Enforce(), ecorePackage.getEBoolean(), "Enforce", null, 0, 1, Capacity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCapacity_Penalty(), ecorePackage.getEFloat(), "Penalty", null, 0, 1, Capacity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(routingEClass, Routing.class, "Routing", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRouting_Resources(), this.getRoutingResource(), this.getRoutingResource_Routing(), "Resources", null, 0, -1, Routing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRouting_Products(), this.getRoutingProduct(), this.getRoutingProduct_Routing(), "Products", null, 0, -1, Routing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRouting_Name(), ecorePackage.getEString(), "Name", null, 0, 1, Routing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRouting_Code(), ecorePackage.getEString(), "Code", null, 0, 1, Routing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRouting_Cost(), ecorePackage.getEFloat(), "Cost", null, 0, 1, Routing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getRouting__ConstructRoutingProduct__LocationProduct(), this.getRoutingProduct(), "constructRoutingProduct", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getLocationProduct(), "product", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRouting__ConstructRoutingResource__LocationResource(), this.getRoutingResource(), "constructRoutingResource", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getLocationResource(), "resource", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(routingProductEClass, RoutingProduct.class, "RoutingProduct", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRoutingProduct_Routing(), this.getRouting(), this.getRouting_Products(), "Routing", null, 1, 1, RoutingProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoutingProduct_LocationProduct(), this.getLocationProduct(), null, "LocationProduct", null, 1, 1, RoutingProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoutingProduct_Code(), ecorePackage.getEString(), "Code", null, 0, 1, RoutingProduct.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoutingProduct_Consumption(), ecorePackage.getEDouble(), "Consumption", null, 0, 1, RoutingProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoutingProduct_Offset(), ecorePackage.getEFloat(), "Offset", null, 0, 1, RoutingProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(routingResourceEClass, RoutingResource.class, "RoutingResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRoutingResource_Routing(), this.getRouting(), this.getRouting_Resources(), "Routing", null, 1, 1, RoutingResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoutingResource_LocationResource(), this.getLocationResource(), null, "LocationResource", null, 0, 1, RoutingResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoutingResource_Reservation(), ecorePackage.getEDouble(), "Reservation", "0.0", 0, 1, RoutingResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoutingResource_Offset(), ecorePackage.getEFloat(), "Offset", null, 0, 1, RoutingResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoutingResource_Code(), ecorePackage.getEString(), "Code", null, 0, 1, RoutingResource.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(supplyEClass, Supply.class, "Supply", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSupply_LocationProduct(), this.getLocationProduct(), this.getLocationProduct_Supplies(), "LocationProduct", null, 0, 1, Supply.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSupply_Description(), ecorePackage.getEString(), "Description", null, 0, 1, Supply.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getSupply_Quantity(), ecorePackage.getEFloat(), "Quantity", null, 0, 1, Supply.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSupply_From(), ecorePackage.getEDate(), "From", null, 0, 1, Supply.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSupply_To(), ecorePackage.getEDate(), "To", null, 0, 1, Supply.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSupply_Cost(), ecorePackage.getEFloat(), "Cost", null, 0, 1, Supply.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSupply_Enforce(), ecorePackage.getEBoolean(), "Enforce", null, 0, 1, Supply.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //MacroPlannerPackageImpl
