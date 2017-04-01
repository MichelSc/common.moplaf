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
package com.misc.common.moplaf.macroplanner;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.misc.common.moplaf.macroplanner.MacroPlannerFactory
 * @model kind="package"
 * @generated
 */
public interface MacroPlannerPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "macroplanner";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.misc.com/common/moplaf/macroplanner/model/0.1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mp";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MacroPlannerPackage eINSTANCE = com.misc.common.moplaf.macroplanner.impl.MacroPlannerPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.macroplanner.impl.MacroPlannerDataImpl <em>Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.macroplanner.impl.MacroPlannerDataImpl
	 * @see com.misc.common.moplaf.macroplanner.impl.MacroPlannerPackageImpl#getMacroPlannerData()
	 * @generated
	 */
	int MACRO_PLANNER_DATA = 0;

	/**
	 * The feature id for the '<em><b>Time Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACRO_PLANNER_DATA__TIME_UNIT = 0;

	/**
	 * The number of structural features of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACRO_PLANNER_DATA_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Get Duration Time Unit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACRO_PLANNER_DATA___GET_DURATION_TIME_UNIT__TIMEUNIT = 0;

	/**
	 * The number of operations of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACRO_PLANNER_DATA_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.macroplanner.impl.SupplyChainMasterDataImpl <em>Supply Chain Master Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.macroplanner.impl.SupplyChainMasterDataImpl
	 * @see com.misc.common.moplaf.macroplanner.impl.MacroPlannerPackageImpl#getSupplyChainMasterData()
	 * @generated
	 */
	int SUPPLY_CHAIN_MASTER_DATA = 1;

	/**
	 * The feature id for the '<em><b>Time Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLY_CHAIN_MASTER_DATA__TIME_UNIT = MACRO_PLANNER_DATA__TIME_UNIT;

	/**
	 * The feature id for the '<em><b>Products</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLY_CHAIN_MASTER_DATA__PRODUCTS = MACRO_PLANNER_DATA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLY_CHAIN_MASTER_DATA__RESOURCES = MACRO_PLANNER_DATA_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLY_CHAIN_MASTER_DATA__LOCATIONS = MACRO_PLANNER_DATA_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLY_CHAIN_MASTER_DATA__NAME = MACRO_PLANNER_DATA_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Supply Chain Master Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLY_CHAIN_MASTER_DATA_FEATURE_COUNT = MACRO_PLANNER_DATA_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Duration Time Unit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLY_CHAIN_MASTER_DATA___GET_DURATION_TIME_UNIT__TIMEUNIT = MACRO_PLANNER_DATA___GET_DURATION_TIME_UNIT__TIMEUNIT;

	/**
	 * The number of operations of the '<em>Supply Chain Master Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLY_CHAIN_MASTER_DATA_OPERATION_COUNT = MACRO_PLANNER_DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.macroplanner.impl.ProductImpl <em>Product</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.macroplanner.impl.ProductImpl
	 * @see com.misc.common.moplaf.macroplanner.impl.MacroPlannerPackageImpl#getProduct()
	 * @generated
	 */
	int PRODUCT = 2;

	/**
	 * The feature id for the '<em><b>Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__CHILDREN = 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__PARENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__NAME = 2;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__CODE = 3;

	/**
	 * The number of structural features of the '<em>Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.macroplanner.impl.ResourceImpl <em>Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.macroplanner.impl.ResourceImpl
	 * @see com.misc.common.moplaf.macroplanner.impl.MacroPlannerPackageImpl#getResource()
	 * @generated
	 */
	int RESOURCE = 3;

	/**
	 * The feature id for the '<em><b>Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__CHILDREN = 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__PARENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__NAME = 2;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__CODE = 3;

	/**
	 * The number of structural features of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.macroplanner.impl.LocationImpl <em>Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.macroplanner.impl.LocationImpl
	 * @see com.misc.common.moplaf.macroplanner.impl.MacroPlannerPackageImpl#getLocation()
	 * @generated
	 */
	int LOCATION = 4;

	/**
	 * The feature id for the '<em><b>Products</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__PRODUCTS = 0;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__RESOURCES = 1;

	/**
	 * The feature id for the '<em><b>Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__CHILDREN = 2;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__PARENT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__NAME = 4;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__CODE = 5;

	/**
	 * The number of structural features of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_FEATURE_COUNT = 6;

	/**
	 * The operation id for the '<em>Construct Location Product</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION___CONSTRUCT_LOCATION_PRODUCT__PRODUCT = 0;

	/**
	 * The operation id for the '<em>Construct Location Resource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION___CONSTRUCT_LOCATION_RESOURCE__RESOURCE = 1;

	/**
	 * The number of operations of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.macroplanner.impl.LocationProductImpl <em>Location Product</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.macroplanner.impl.LocationProductImpl
	 * @see com.misc.common.moplaf.macroplanner.impl.MacroPlannerPackageImpl#getLocationProduct()
	 * @generated
	 */
	int LOCATION_PRODUCT = 5;

	/**
	 * The feature id for the '<em><b>Location</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_PRODUCT__LOCATION = 0;

	/**
	 * The feature id for the '<em><b>Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_PRODUCT__PRODUCT = 1;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_PRODUCT__CODE = 2;

	/**
	 * The feature id for the '<em><b>Supplies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_PRODUCT__SUPPLIES = 3;

	/**
	 * The feature id for the '<em><b>Capacities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_PRODUCT__CAPACITIES = 4;

	/**
	 * The number of structural features of the '<em>Location Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_PRODUCT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Location Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_PRODUCT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.macroplanner.impl.LocationResourceImpl <em>Location Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.macroplanner.impl.LocationResourceImpl
	 * @see com.misc.common.moplaf.macroplanner.impl.MacroPlannerPackageImpl#getLocationResource()
	 * @generated
	 */
	int LOCATION_RESOURCE = 6;

	/**
	 * The feature id for the '<em><b>Location</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_RESOURCE__LOCATION = 0;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_RESOURCE__RESOURCE = 1;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_RESOURCE__CODE = 2;

	/**
	 * The feature id for the '<em><b>Availabilities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_RESOURCE__AVAILABILITIES = 3;

	/**
	 * The number of structural features of the '<em>Location Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_RESOURCE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Location Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_RESOURCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.macroplanner.impl.SupplyChainLimitsImpl <em>Supply Chain Limits</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.macroplanner.impl.SupplyChainLimitsImpl
	 * @see com.misc.common.moplaf.macroplanner.impl.MacroPlannerPackageImpl#getSupplyChainLimits()
	 * @generated
	 */
	int SUPPLY_CHAIN_LIMITS = 7;

	/**
	 * The feature id for the '<em><b>Time Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLY_CHAIN_LIMITS__TIME_UNIT = MACRO_PLANNER_DATA__TIME_UNIT;

	/**
	 * The feature id for the '<em><b>Capacities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLY_CHAIN_LIMITS__CAPACITIES = MACRO_PLANNER_DATA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Availabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLY_CHAIN_LIMITS__AVAILABILITIES = MACRO_PLANNER_DATA_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLY_CHAIN_LIMITS__NAME = MACRO_PLANNER_DATA_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Supply Chain Limits</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLY_CHAIN_LIMITS_FEATURE_COUNT = MACRO_PLANNER_DATA_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Duration Time Unit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLY_CHAIN_LIMITS___GET_DURATION_TIME_UNIT__TIMEUNIT = MACRO_PLANNER_DATA___GET_DURATION_TIME_UNIT__TIMEUNIT;

	/**
	 * The operation id for the '<em>Construct Capacity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLY_CHAIN_LIMITS___CONSTRUCT_CAPACITY__LOCATIONPRODUCT = MACRO_PLANNER_DATA_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Construct Availability</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLY_CHAIN_LIMITS___CONSTRUCT_AVAILABILITY__LOCATIONRESOURCE = MACRO_PLANNER_DATA_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Supply Chain Limits</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLY_CHAIN_LIMITS_OPERATION_COUNT = MACRO_PLANNER_DATA_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.macroplanner.impl.SupplyChainDataImpl <em>Supply Chain Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.macroplanner.impl.SupplyChainDataImpl
	 * @see com.misc.common.moplaf.macroplanner.impl.MacroPlannerPackageImpl#getSupplyChainData()
	 * @generated
	 */
	int SUPPLY_CHAIN_DATA = 14;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.macroplanner.impl.SupplyImpl <em>Supply</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.macroplanner.impl.SupplyImpl
	 * @see com.misc.common.moplaf.macroplanner.impl.MacroPlannerPackageImpl#getSupply()
	 * @generated
	 */
	int SUPPLY = 15;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.macroplanner.impl.AvailabilityImpl <em>Availability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.macroplanner.impl.AvailabilityImpl
	 * @see com.misc.common.moplaf.macroplanner.impl.MacroPlannerPackageImpl#getAvailability()
	 * @generated
	 */
	int AVAILABILITY = 8;

	/**
	 * The feature id for the '<em><b>Supply Chain Limits</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABILITY__SUPPLY_CHAIN_LIMITS = 0;

	/**
	 * The feature id for the '<em><b>Location Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABILITY__LOCATION_RESOURCE = 1;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABILITY__QUANTITY = 2;

	/**
	 * The feature id for the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABILITY__FROM = 3;

	/**
	 * The feature id for the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABILITY__TO = 4;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABILITY__COST = 5;

	/**
	 * The feature id for the '<em><b>Enforce</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABILITY__ENFORCE = 6;

	/**
	 * The feature id for the '<em><b>Penalty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABILITY__PENALTY = 7;

	/**
	 * The number of structural features of the '<em>Availability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABILITY_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Availability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABILITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.macroplanner.impl.CapacityImpl <em>Capacity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.macroplanner.impl.CapacityImpl
	 * @see com.misc.common.moplaf.macroplanner.impl.MacroPlannerPackageImpl#getCapacity()
	 * @generated
	 */
	int CAPACITY = 9;

	/**
	 * The feature id for the '<em><b>Supply Chain Limits</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY__SUPPLY_CHAIN_LIMITS = 0;

	/**
	 * The feature id for the '<em><b>Location Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY__LOCATION_PRODUCT = 1;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY__QUANTITY = 2;

	/**
	 * The feature id for the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY__FROM = 3;

	/**
	 * The feature id for the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY__TO = 4;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY__COST = 5;

	/**
	 * The feature id for the '<em><b>Enforce</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY__ENFORCE = 6;

	/**
	 * The feature id for the '<em><b>Penalty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY__PENALTY = 7;

	/**
	 * The number of structural features of the '<em>Capacity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Capacity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.macroplanner.impl.SupplyChainRoutingsImpl <em>Supply Chain Routings</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.macroplanner.impl.SupplyChainRoutingsImpl
	 * @see com.misc.common.moplaf.macroplanner.impl.MacroPlannerPackageImpl#getSupplyChainRoutings()
	 * @generated
	 */
	int SUPPLY_CHAIN_ROUTINGS = 10;

	/**
	 * The feature id for the '<em><b>Time Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLY_CHAIN_ROUTINGS__TIME_UNIT = MACRO_PLANNER_DATA__TIME_UNIT;

	/**
	 * The feature id for the '<em><b>Routings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLY_CHAIN_ROUTINGS__ROUTINGS = MACRO_PLANNER_DATA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLY_CHAIN_ROUTINGS__NAME = MACRO_PLANNER_DATA_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Supply Chain Routings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLY_CHAIN_ROUTINGS_FEATURE_COUNT = MACRO_PLANNER_DATA_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Duration Time Unit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLY_CHAIN_ROUTINGS___GET_DURATION_TIME_UNIT__TIMEUNIT = MACRO_PLANNER_DATA___GET_DURATION_TIME_UNIT__TIMEUNIT;

	/**
	 * The number of operations of the '<em>Supply Chain Routings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLY_CHAIN_ROUTINGS_OPERATION_COUNT = MACRO_PLANNER_DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.macroplanner.impl.RoutingImpl <em>Routing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.macroplanner.impl.RoutingImpl
	 * @see com.misc.common.moplaf.macroplanner.impl.MacroPlannerPackageImpl#getRouting()
	 * @generated
	 */
	int ROUTING = 11;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTING__RESOURCES = 0;

	/**
	 * The feature id for the '<em><b>Products</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTING__PRODUCTS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTING__NAME = 2;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTING__CODE = 3;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTING__COST = 4;

	/**
	 * The feature id for the '<em><b>Supply Chain Routings</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTING__SUPPLY_CHAIN_ROUTINGS = 5;

	/**
	 * The number of structural features of the '<em>Routing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTING_FEATURE_COUNT = 6;

	/**
	 * The operation id for the '<em>Construct Routing Product</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTING___CONSTRUCT_ROUTING_PRODUCT__LOCATIONPRODUCT = 0;

	/**
	 * The operation id for the '<em>Construct Routing Resource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTING___CONSTRUCT_ROUTING_RESOURCE__LOCATIONRESOURCE = 1;

	/**
	 * The number of operations of the '<em>Routing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTING_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.macroplanner.impl.RoutingProductImpl <em>Routing Product</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.macroplanner.impl.RoutingProductImpl
	 * @see com.misc.common.moplaf.macroplanner.impl.MacroPlannerPackageImpl#getRoutingProduct()
	 * @generated
	 */
	int ROUTING_PRODUCT = 12;

	/**
	 * The feature id for the '<em><b>Routing</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTING_PRODUCT__ROUTING = 0;

	/**
	 * The feature id for the '<em><b>Location Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTING_PRODUCT__LOCATION_PRODUCT = 1;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTING_PRODUCT__CODE = 2;

	/**
	 * The feature id for the '<em><b>Consumption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTING_PRODUCT__CONSUMPTION = 3;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTING_PRODUCT__OFFSET = 4;

	/**
	 * The number of structural features of the '<em>Routing Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTING_PRODUCT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Routing Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTING_PRODUCT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.macroplanner.impl.RoutingResourceImpl <em>Routing Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.macroplanner.impl.RoutingResourceImpl
	 * @see com.misc.common.moplaf.macroplanner.impl.MacroPlannerPackageImpl#getRoutingResource()
	 * @generated
	 */
	int ROUTING_RESOURCE = 13;

	/**
	 * The feature id for the '<em><b>Routing</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTING_RESOURCE__ROUTING = 0;

	/**
	 * The feature id for the '<em><b>Location Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTING_RESOURCE__LOCATION_RESOURCE = 1;

	/**
	 * The feature id for the '<em><b>Reservation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTING_RESOURCE__RESERVATION = 2;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTING_RESOURCE__OFFSET = 3;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTING_RESOURCE__CODE = 4;

	/**
	 * The number of structural features of the '<em>Routing Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTING_RESOURCE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Routing Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTING_RESOURCE_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Time Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLY_CHAIN_DATA__TIME_UNIT = MACRO_PLANNER_DATA__TIME_UNIT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLY_CHAIN_DATA__NAME = MACRO_PLANNER_DATA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Supplies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLY_CHAIN_DATA__SUPPLIES = MACRO_PLANNER_DATA_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Supply Chain Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLY_CHAIN_DATA_FEATURE_COUNT = MACRO_PLANNER_DATA_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Duration Time Unit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLY_CHAIN_DATA___GET_DURATION_TIME_UNIT__TIMEUNIT = MACRO_PLANNER_DATA___GET_DURATION_TIME_UNIT__TIMEUNIT;

	/**
	 * The operation id for the '<em>Construct Supply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLY_CHAIN_DATA___CONSTRUCT_SUPPLY__LOCATIONPRODUCT = MACRO_PLANNER_DATA_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Supply Chain Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLY_CHAIN_DATA_OPERATION_COUNT = MACRO_PLANNER_DATA_OPERATION_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Supply Chain Data</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLY__SUPPLY_CHAIN_DATA = 0;

	/**
	 * The feature id for the '<em><b>Location Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLY__LOCATION_PRODUCT = 1;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLY__QUANTITY = 2;

	/**
	 * The feature id for the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLY__FROM = 3;

	/**
	 * The feature id for the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLY__TO = 4;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLY__COST = 5;

	/**
	 * The feature id for the '<em><b>Enforce</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLY__ENFORCE = 6;

	/**
	 * The number of structural features of the '<em>Supply</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLY_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Supply</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLY_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.macroplanner.MacroPlannerData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data</em>'.
	 * @see com.misc.common.moplaf.macroplanner.MacroPlannerData
	 * @generated
	 */
	EClass getMacroPlannerData();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.macroplanner.MacroPlannerData#getTimeUnit <em>Time Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Unit</em>'.
	 * @see com.misc.common.moplaf.macroplanner.MacroPlannerData#getTimeUnit()
	 * @see #getMacroPlannerData()
	 * @generated
	 */
	EAttribute getMacroPlannerData_TimeUnit();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.macroplanner.MacroPlannerData#getDurationTimeUnit(com.misc.common.moplaf.time.TimeUnit) <em>Get Duration Time Unit</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Duration Time Unit</em>' operation.
	 * @see com.misc.common.moplaf.macroplanner.MacroPlannerData#getDurationTimeUnit(com.misc.common.moplaf.time.TimeUnit)
	 * @generated
	 */
	EOperation getMacroPlannerData__GetDurationTimeUnit__TimeUnit();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.macroplanner.SupplyChainMasterData <em>Supply Chain Master Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Supply Chain Master Data</em>'.
	 * @see com.misc.common.moplaf.macroplanner.SupplyChainMasterData
	 * @generated
	 */
	EClass getSupplyChainMasterData();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.common.moplaf.macroplanner.SupplyChainMasterData#getProducts <em>Products</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Products</em>'.
	 * @see com.misc.common.moplaf.macroplanner.SupplyChainMasterData#getProducts()
	 * @see #getSupplyChainMasterData()
	 * @generated
	 */
	EReference getSupplyChainMasterData_Products();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.common.moplaf.macroplanner.SupplyChainMasterData#getLocations <em>Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Locations</em>'.
	 * @see com.misc.common.moplaf.macroplanner.SupplyChainMasterData#getLocations()
	 * @see #getSupplyChainMasterData()
	 * @generated
	 */
	EReference getSupplyChainMasterData_Locations();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.common.moplaf.macroplanner.SupplyChainMasterData#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resources</em>'.
	 * @see com.misc.common.moplaf.macroplanner.SupplyChainMasterData#getResources()
	 * @see #getSupplyChainMasterData()
	 * @generated
	 */
	EReference getSupplyChainMasterData_Resources();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.macroplanner.SupplyChainMasterData#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.misc.common.moplaf.macroplanner.SupplyChainMasterData#getName()
	 * @see #getSupplyChainMasterData()
	 * @generated
	 */
	EAttribute getSupplyChainMasterData_Name();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.macroplanner.Product <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product</em>'.
	 * @see com.misc.common.moplaf.macroplanner.Product
	 * @generated
	 */
	EClass getProduct();

	/**
	 * Returns the meta object for the reference list '{@link com.misc.common.moplaf.macroplanner.Product#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Children</em>'.
	 * @see com.misc.common.moplaf.macroplanner.Product#getChildren()
	 * @see #getProduct()
	 * @generated
	 */
	EReference getProduct_Children();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.macroplanner.Product#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see com.misc.common.moplaf.macroplanner.Product#getParent()
	 * @see #getProduct()
	 * @generated
	 */
	EReference getProduct_Parent();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.macroplanner.Product#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.misc.common.moplaf.macroplanner.Product#getName()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.macroplanner.Product#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see com.misc.common.moplaf.macroplanner.Product#getCode()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_Code();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.macroplanner.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource</em>'.
	 * @see com.misc.common.moplaf.macroplanner.Resource
	 * @generated
	 */
	EClass getResource();

	/**
	 * Returns the meta object for the reference list '{@link com.misc.common.moplaf.macroplanner.Resource#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Children</em>'.
	 * @see com.misc.common.moplaf.macroplanner.Resource#getChildren()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_Children();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.macroplanner.Resource#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see com.misc.common.moplaf.macroplanner.Resource#getParent()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_Parent();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.macroplanner.Resource#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.misc.common.moplaf.macroplanner.Resource#getName()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.macroplanner.Resource#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see com.misc.common.moplaf.macroplanner.Resource#getCode()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_Code();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.macroplanner.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location</em>'.
	 * @see com.misc.common.moplaf.macroplanner.Location
	 * @generated
	 */
	EClass getLocation();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.common.moplaf.macroplanner.Location#getProducts <em>Products</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Products</em>'.
	 * @see com.misc.common.moplaf.macroplanner.Location#getProducts()
	 * @see #getLocation()
	 * @generated
	 */
	EReference getLocation_Products();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.common.moplaf.macroplanner.Location#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resources</em>'.
	 * @see com.misc.common.moplaf.macroplanner.Location#getResources()
	 * @see #getLocation()
	 * @generated
	 */
	EReference getLocation_Resources();

	/**
	 * Returns the meta object for the reference list '{@link com.misc.common.moplaf.macroplanner.Location#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Children</em>'.
	 * @see com.misc.common.moplaf.macroplanner.Location#getChildren()
	 * @see #getLocation()
	 * @generated
	 */
	EReference getLocation_Children();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.macroplanner.Location#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see com.misc.common.moplaf.macroplanner.Location#getParent()
	 * @see #getLocation()
	 * @generated
	 */
	EReference getLocation_Parent();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.macroplanner.Location#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.misc.common.moplaf.macroplanner.Location#getName()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.macroplanner.Location#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see com.misc.common.moplaf.macroplanner.Location#getCode()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_Code();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.macroplanner.Location#constructLocationProduct(com.misc.common.moplaf.macroplanner.Product) <em>Construct Location Product</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Construct Location Product</em>' operation.
	 * @see com.misc.common.moplaf.macroplanner.Location#constructLocationProduct(com.misc.common.moplaf.macroplanner.Product)
	 * @generated
	 */
	EOperation getLocation__ConstructLocationProduct__Product();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.macroplanner.Location#constructLocationResource(com.misc.common.moplaf.macroplanner.Resource) <em>Construct Location Resource</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Construct Location Resource</em>' operation.
	 * @see com.misc.common.moplaf.macroplanner.Location#constructLocationResource(com.misc.common.moplaf.macroplanner.Resource)
	 * @generated
	 */
	EOperation getLocation__ConstructLocationResource__Resource();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.macroplanner.LocationProduct <em>Location Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location Product</em>'.
	 * @see com.misc.common.moplaf.macroplanner.LocationProduct
	 * @generated
	 */
	EClass getLocationProduct();

	/**
	 * Returns the meta object for the container reference '{@link com.misc.common.moplaf.macroplanner.LocationProduct#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Location</em>'.
	 * @see com.misc.common.moplaf.macroplanner.LocationProduct#getLocation()
	 * @see #getLocationProduct()
	 * @generated
	 */
	EReference getLocationProduct_Location();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.macroplanner.LocationProduct#getProduct <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product</em>'.
	 * @see com.misc.common.moplaf.macroplanner.LocationProduct#getProduct()
	 * @see #getLocationProduct()
	 * @generated
	 */
	EReference getLocationProduct_Product();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.macroplanner.LocationProduct#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see com.misc.common.moplaf.macroplanner.LocationProduct#getCode()
	 * @see #getLocationProduct()
	 * @generated
	 */
	EAttribute getLocationProduct_Code();

	/**
	 * Returns the meta object for the reference list '{@link com.misc.common.moplaf.macroplanner.LocationProduct#getSupplies <em>Supplies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Supplies</em>'.
	 * @see com.misc.common.moplaf.macroplanner.LocationProduct#getSupplies()
	 * @see #getLocationProduct()
	 * @generated
	 */
	EReference getLocationProduct_Supplies();

	/**
	 * Returns the meta object for the reference list '{@link com.misc.common.moplaf.macroplanner.LocationProduct#getCapacities <em>Capacities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Capacities</em>'.
	 * @see com.misc.common.moplaf.macroplanner.LocationProduct#getCapacities()
	 * @see #getLocationProduct()
	 * @generated
	 */
	EReference getLocationProduct_Capacities();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.macroplanner.LocationResource <em>Location Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location Resource</em>'.
	 * @see com.misc.common.moplaf.macroplanner.LocationResource
	 * @generated
	 */
	EClass getLocationResource();

	/**
	 * Returns the meta object for the container reference '{@link com.misc.common.moplaf.macroplanner.LocationResource#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Location</em>'.
	 * @see com.misc.common.moplaf.macroplanner.LocationResource#getLocation()
	 * @see #getLocationResource()
	 * @generated
	 */
	EReference getLocationResource_Location();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.macroplanner.LocationResource#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resource</em>'.
	 * @see com.misc.common.moplaf.macroplanner.LocationResource#getResource()
	 * @see #getLocationResource()
	 * @generated
	 */
	EReference getLocationResource_Resource();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.macroplanner.LocationResource#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see com.misc.common.moplaf.macroplanner.LocationResource#getCode()
	 * @see #getLocationResource()
	 * @generated
	 */
	EAttribute getLocationResource_Code();

	/**
	 * Returns the meta object for the reference list '{@link com.misc.common.moplaf.macroplanner.LocationResource#getAvailabilities <em>Availabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Availabilities</em>'.
	 * @see com.misc.common.moplaf.macroplanner.LocationResource#getAvailabilities()
	 * @see #getLocationResource()
	 * @generated
	 */
	EReference getLocationResource_Availabilities();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.macroplanner.SupplyChainLimits <em>Supply Chain Limits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Supply Chain Limits</em>'.
	 * @see com.misc.common.moplaf.macroplanner.SupplyChainLimits
	 * @generated
	 */
	EClass getSupplyChainLimits();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.common.moplaf.macroplanner.SupplyChainLimits#getCapacities <em>Capacities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Capacities</em>'.
	 * @see com.misc.common.moplaf.macroplanner.SupplyChainLimits#getCapacities()
	 * @see #getSupplyChainLimits()
	 * @generated
	 */
	EReference getSupplyChainLimits_Capacities();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.common.moplaf.macroplanner.SupplyChainLimits#getAvailabilities <em>Availabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Availabilities</em>'.
	 * @see com.misc.common.moplaf.macroplanner.SupplyChainLimits#getAvailabilities()
	 * @see #getSupplyChainLimits()
	 * @generated
	 */
	EReference getSupplyChainLimits_Availabilities();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.macroplanner.SupplyChainLimits#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.misc.common.moplaf.macroplanner.SupplyChainLimits#getName()
	 * @see #getSupplyChainLimits()
	 * @generated
	 */
	EAttribute getSupplyChainLimits_Name();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.macroplanner.SupplyChainLimits#constructCapacity(com.misc.common.moplaf.macroplanner.LocationProduct) <em>Construct Capacity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Construct Capacity</em>' operation.
	 * @see com.misc.common.moplaf.macroplanner.SupplyChainLimits#constructCapacity(com.misc.common.moplaf.macroplanner.LocationProduct)
	 * @generated
	 */
	EOperation getSupplyChainLimits__ConstructCapacity__LocationProduct();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.macroplanner.SupplyChainLimits#constructAvailability(com.misc.common.moplaf.macroplanner.LocationResource) <em>Construct Availability</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Construct Availability</em>' operation.
	 * @see com.misc.common.moplaf.macroplanner.SupplyChainLimits#constructAvailability(com.misc.common.moplaf.macroplanner.LocationResource)
	 * @generated
	 */
	EOperation getSupplyChainLimits__ConstructAvailability__LocationResource();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.macroplanner.SupplyChainData <em>Supply Chain Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Supply Chain Data</em>'.
	 * @see com.misc.common.moplaf.macroplanner.SupplyChainData
	 * @generated
	 */
	EClass getSupplyChainData();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.common.moplaf.macroplanner.SupplyChainData#getSupplies <em>Supplies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Supplies</em>'.
	 * @see com.misc.common.moplaf.macroplanner.SupplyChainData#getSupplies()
	 * @see #getSupplyChainData()
	 * @generated
	 */
	EReference getSupplyChainData_Supplies();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.macroplanner.SupplyChainData#constructSupply(com.misc.common.moplaf.macroplanner.LocationProduct) <em>Construct Supply</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Construct Supply</em>' operation.
	 * @see com.misc.common.moplaf.macroplanner.SupplyChainData#constructSupply(com.misc.common.moplaf.macroplanner.LocationProduct)
	 * @generated
	 */
	EOperation getSupplyChainData__ConstructSupply__LocationProduct();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.macroplanner.SupplyChainData#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.misc.common.moplaf.macroplanner.SupplyChainData#getName()
	 * @see #getSupplyChainData()
	 * @generated
	 */
	EAttribute getSupplyChainData_Name();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.macroplanner.Supply <em>Supply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Supply</em>'.
	 * @see com.misc.common.moplaf.macroplanner.Supply
	 * @generated
	 */
	EClass getSupply();

	/**
	 * Returns the meta object for the container reference '{@link com.misc.common.moplaf.macroplanner.Supply#getSupplyChainData <em>Supply Chain Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Supply Chain Data</em>'.
	 * @see com.misc.common.moplaf.macroplanner.Supply#getSupplyChainData()
	 * @see #getSupply()
	 * @generated
	 */
	EReference getSupply_SupplyChainData();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.macroplanner.Supply#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see com.misc.common.moplaf.macroplanner.Supply#getQuantity()
	 * @see #getSupply()
	 * @generated
	 */
	EAttribute getSupply_Quantity();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.macroplanner.Supply#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From</em>'.
	 * @see com.misc.common.moplaf.macroplanner.Supply#getFrom()
	 * @see #getSupply()
	 * @generated
	 */
	EAttribute getSupply_From();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.macroplanner.Supply#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To</em>'.
	 * @see com.misc.common.moplaf.macroplanner.Supply#getTo()
	 * @see #getSupply()
	 * @generated
	 */
	EAttribute getSupply_To();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.macroplanner.Supply#getCost <em>Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cost</em>'.
	 * @see com.misc.common.moplaf.macroplanner.Supply#getCost()
	 * @see #getSupply()
	 * @generated
	 */
	EAttribute getSupply_Cost();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.macroplanner.Supply#getLocationProduct <em>Location Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Location Product</em>'.
	 * @see com.misc.common.moplaf.macroplanner.Supply#getLocationProduct()
	 * @see #getSupply()
	 * @generated
	 */
	EReference getSupply_LocationProduct();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.macroplanner.Supply#isEnforce <em>Enforce</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enforce</em>'.
	 * @see com.misc.common.moplaf.macroplanner.Supply#isEnforce()
	 * @see #getSupply()
	 * @generated
	 */
	EAttribute getSupply_Enforce();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.macroplanner.Availability <em>Availability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Availability</em>'.
	 * @see com.misc.common.moplaf.macroplanner.Availability
	 * @generated
	 */
	EClass getAvailability();

	/**
	 * Returns the meta object for the container reference '{@link com.misc.common.moplaf.macroplanner.Availability#getSupplyChainLimits <em>Supply Chain Limits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Supply Chain Limits</em>'.
	 * @see com.misc.common.moplaf.macroplanner.Availability#getSupplyChainLimits()
	 * @see #getAvailability()
	 * @generated
	 */
	EReference getAvailability_SupplyChainLimits();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.macroplanner.Availability#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see com.misc.common.moplaf.macroplanner.Availability#getQuantity()
	 * @see #getAvailability()
	 * @generated
	 */
	EAttribute getAvailability_Quantity();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.macroplanner.Availability#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From</em>'.
	 * @see com.misc.common.moplaf.macroplanner.Availability#getFrom()
	 * @see #getAvailability()
	 * @generated
	 */
	EAttribute getAvailability_From();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.macroplanner.Availability#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To</em>'.
	 * @see com.misc.common.moplaf.macroplanner.Availability#getTo()
	 * @see #getAvailability()
	 * @generated
	 */
	EAttribute getAvailability_To();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.macroplanner.Availability#getCost <em>Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cost</em>'.
	 * @see com.misc.common.moplaf.macroplanner.Availability#getCost()
	 * @see #getAvailability()
	 * @generated
	 */
	EAttribute getAvailability_Cost();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.macroplanner.Availability#isEnforce <em>Enforce</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enforce</em>'.
	 * @see com.misc.common.moplaf.macroplanner.Availability#isEnforce()
	 * @see #getAvailability()
	 * @generated
	 */
	EAttribute getAvailability_Enforce();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.macroplanner.Availability#getPenalty <em>Penalty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Penalty</em>'.
	 * @see com.misc.common.moplaf.macroplanner.Availability#getPenalty()
	 * @see #getAvailability()
	 * @generated
	 */
	EAttribute getAvailability_Penalty();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.macroplanner.Availability#getLocationResource <em>Location Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Location Resource</em>'.
	 * @see com.misc.common.moplaf.macroplanner.Availability#getLocationResource()
	 * @see #getAvailability()
	 * @generated
	 */
	EReference getAvailability_LocationResource();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.macroplanner.Capacity <em>Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Capacity</em>'.
	 * @see com.misc.common.moplaf.macroplanner.Capacity
	 * @generated
	 */
	EClass getCapacity();

	/**
	 * Returns the meta object for the container reference '{@link com.misc.common.moplaf.macroplanner.Capacity#getSupplyChainLimits <em>Supply Chain Limits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Supply Chain Limits</em>'.
	 * @see com.misc.common.moplaf.macroplanner.Capacity#getSupplyChainLimits()
	 * @see #getCapacity()
	 * @generated
	 */
	EReference getCapacity_SupplyChainLimits();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.macroplanner.Capacity#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see com.misc.common.moplaf.macroplanner.Capacity#getQuantity()
	 * @see #getCapacity()
	 * @generated
	 */
	EAttribute getCapacity_Quantity();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.macroplanner.Capacity#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From</em>'.
	 * @see com.misc.common.moplaf.macroplanner.Capacity#getFrom()
	 * @see #getCapacity()
	 * @generated
	 */
	EAttribute getCapacity_From();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.macroplanner.Capacity#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To</em>'.
	 * @see com.misc.common.moplaf.macroplanner.Capacity#getTo()
	 * @see #getCapacity()
	 * @generated
	 */
	EAttribute getCapacity_To();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.macroplanner.Capacity#getCost <em>Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cost</em>'.
	 * @see com.misc.common.moplaf.macroplanner.Capacity#getCost()
	 * @see #getCapacity()
	 * @generated
	 */
	EAttribute getCapacity_Cost();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.macroplanner.Capacity#isEnforce <em>Enforce</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enforce</em>'.
	 * @see com.misc.common.moplaf.macroplanner.Capacity#isEnforce()
	 * @see #getCapacity()
	 * @generated
	 */
	EAttribute getCapacity_Enforce();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.macroplanner.Capacity#getPenalty <em>Penalty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Penalty</em>'.
	 * @see com.misc.common.moplaf.macroplanner.Capacity#getPenalty()
	 * @see #getCapacity()
	 * @generated
	 */
	EAttribute getCapacity_Penalty();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.macroplanner.Capacity#getLocationProduct <em>Location Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Location Product</em>'.
	 * @see com.misc.common.moplaf.macroplanner.Capacity#getLocationProduct()
	 * @see #getCapacity()
	 * @generated
	 */
	EReference getCapacity_LocationProduct();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.macroplanner.SupplyChainRoutings <em>Supply Chain Routings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Supply Chain Routings</em>'.
	 * @see com.misc.common.moplaf.macroplanner.SupplyChainRoutings
	 * @generated
	 */
	EClass getSupplyChainRoutings();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.common.moplaf.macroplanner.SupplyChainRoutings#getRoutings <em>Routings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Routings</em>'.
	 * @see com.misc.common.moplaf.macroplanner.SupplyChainRoutings#getRoutings()
	 * @see #getSupplyChainRoutings()
	 * @generated
	 */
	EReference getSupplyChainRoutings_Routings();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.macroplanner.SupplyChainRoutings#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.misc.common.moplaf.macroplanner.SupplyChainRoutings#getName()
	 * @see #getSupplyChainRoutings()
	 * @generated
	 */
	EAttribute getSupplyChainRoutings_Name();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.macroplanner.Routing <em>Routing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Routing</em>'.
	 * @see com.misc.common.moplaf.macroplanner.Routing
	 * @generated
	 */
	EClass getRouting();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.common.moplaf.macroplanner.Routing#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resources</em>'.
	 * @see com.misc.common.moplaf.macroplanner.Routing#getResources()
	 * @see #getRouting()
	 * @generated
	 */
	EReference getRouting_Resources();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.common.moplaf.macroplanner.Routing#getProducts <em>Products</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Products</em>'.
	 * @see com.misc.common.moplaf.macroplanner.Routing#getProducts()
	 * @see #getRouting()
	 * @generated
	 */
	EReference getRouting_Products();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.macroplanner.Routing#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.misc.common.moplaf.macroplanner.Routing#getName()
	 * @see #getRouting()
	 * @generated
	 */
	EAttribute getRouting_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.macroplanner.Routing#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see com.misc.common.moplaf.macroplanner.Routing#getCode()
	 * @see #getRouting()
	 * @generated
	 */
	EAttribute getRouting_Code();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.macroplanner.Routing#getCost <em>Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cost</em>'.
	 * @see com.misc.common.moplaf.macroplanner.Routing#getCost()
	 * @see #getRouting()
	 * @generated
	 */
	EAttribute getRouting_Cost();

	/**
	 * Returns the meta object for the container reference '{@link com.misc.common.moplaf.macroplanner.Routing#getSupplyChainRoutings <em>Supply Chain Routings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Supply Chain Routings</em>'.
	 * @see com.misc.common.moplaf.macroplanner.Routing#getSupplyChainRoutings()
	 * @see #getRouting()
	 * @generated
	 */
	EReference getRouting_SupplyChainRoutings();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.macroplanner.Routing#constructRoutingProduct(com.misc.common.moplaf.macroplanner.LocationProduct) <em>Construct Routing Product</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Construct Routing Product</em>' operation.
	 * @see com.misc.common.moplaf.macroplanner.Routing#constructRoutingProduct(com.misc.common.moplaf.macroplanner.LocationProduct)
	 * @generated
	 */
	EOperation getRouting__ConstructRoutingProduct__LocationProduct();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.macroplanner.Routing#constructRoutingResource(com.misc.common.moplaf.macroplanner.LocationResource) <em>Construct Routing Resource</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Construct Routing Resource</em>' operation.
	 * @see com.misc.common.moplaf.macroplanner.Routing#constructRoutingResource(com.misc.common.moplaf.macroplanner.LocationResource)
	 * @generated
	 */
	EOperation getRouting__ConstructRoutingResource__LocationResource();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.macroplanner.RoutingProduct <em>Routing Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Routing Product</em>'.
	 * @see com.misc.common.moplaf.macroplanner.RoutingProduct
	 * @generated
	 */
	EClass getRoutingProduct();

	/**
	 * Returns the meta object for the container reference '{@link com.misc.common.moplaf.macroplanner.RoutingProduct#getRouting <em>Routing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Routing</em>'.
	 * @see com.misc.common.moplaf.macroplanner.RoutingProduct#getRouting()
	 * @see #getRoutingProduct()
	 * @generated
	 */
	EReference getRoutingProduct_Routing();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.macroplanner.RoutingProduct#getConsumption <em>Consumption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Consumption</em>'.
	 * @see com.misc.common.moplaf.macroplanner.RoutingProduct#getConsumption()
	 * @see #getRoutingProduct()
	 * @generated
	 */
	EAttribute getRoutingProduct_Consumption();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.macroplanner.RoutingProduct#getOffset <em>Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Offset</em>'.
	 * @see com.misc.common.moplaf.macroplanner.RoutingProduct#getOffset()
	 * @see #getRoutingProduct()
	 * @generated
	 */
	EAttribute getRoutingProduct_Offset();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.macroplanner.RoutingProduct#getLocationProduct <em>Location Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Location Product</em>'.
	 * @see com.misc.common.moplaf.macroplanner.RoutingProduct#getLocationProduct()
	 * @see #getRoutingProduct()
	 * @generated
	 */
	EReference getRoutingProduct_LocationProduct();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.macroplanner.RoutingProduct#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see com.misc.common.moplaf.macroplanner.RoutingProduct#getCode()
	 * @see #getRoutingProduct()
	 * @generated
	 */
	EAttribute getRoutingProduct_Code();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.macroplanner.RoutingResource <em>Routing Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Routing Resource</em>'.
	 * @see com.misc.common.moplaf.macroplanner.RoutingResource
	 * @generated
	 */
	EClass getRoutingResource();

	/**
	 * Returns the meta object for the container reference '{@link com.misc.common.moplaf.macroplanner.RoutingResource#getRouting <em>Routing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Routing</em>'.
	 * @see com.misc.common.moplaf.macroplanner.RoutingResource#getRouting()
	 * @see #getRoutingResource()
	 * @generated
	 */
	EReference getRoutingResource_Routing();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.macroplanner.RoutingResource#getReservation <em>Reservation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reservation</em>'.
	 * @see com.misc.common.moplaf.macroplanner.RoutingResource#getReservation()
	 * @see #getRoutingResource()
	 * @generated
	 */
	EAttribute getRoutingResource_Reservation();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.macroplanner.RoutingResource#getOffset <em>Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Offset</em>'.
	 * @see com.misc.common.moplaf.macroplanner.RoutingResource#getOffset()
	 * @see #getRoutingResource()
	 * @generated
	 */
	EAttribute getRoutingResource_Offset();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.macroplanner.RoutingResource#getLocationResource <em>Location Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Location Resource</em>'.
	 * @see com.misc.common.moplaf.macroplanner.RoutingResource#getLocationResource()
	 * @see #getRoutingResource()
	 * @generated
	 */
	EReference getRoutingResource_LocationResource();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.macroplanner.RoutingResource#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see com.misc.common.moplaf.macroplanner.RoutingResource#getCode()
	 * @see #getRoutingResource()
	 * @generated
	 */
	EAttribute getRoutingResource_Code();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MacroPlannerFactory getMacroPlannerFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.macroplanner.impl.MacroPlannerDataImpl <em>Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.macroplanner.impl.MacroPlannerDataImpl
		 * @see com.misc.common.moplaf.macroplanner.impl.MacroPlannerPackageImpl#getMacroPlannerData()
		 * @generated
		 */
		EClass MACRO_PLANNER_DATA = eINSTANCE.getMacroPlannerData();

		/**
		 * The meta object literal for the '<em><b>Time Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACRO_PLANNER_DATA__TIME_UNIT = eINSTANCE.getMacroPlannerData_TimeUnit();

		/**
		 * The meta object literal for the '<em><b>Get Duration Time Unit</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MACRO_PLANNER_DATA___GET_DURATION_TIME_UNIT__TIMEUNIT = eINSTANCE.getMacroPlannerData__GetDurationTimeUnit__TimeUnit();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.macroplanner.impl.SupplyChainMasterDataImpl <em>Supply Chain Master Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.macroplanner.impl.SupplyChainMasterDataImpl
		 * @see com.misc.common.moplaf.macroplanner.impl.MacroPlannerPackageImpl#getSupplyChainMasterData()
		 * @generated
		 */
		EClass SUPPLY_CHAIN_MASTER_DATA = eINSTANCE.getSupplyChainMasterData();

		/**
		 * The meta object literal for the '<em><b>Products</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUPPLY_CHAIN_MASTER_DATA__PRODUCTS = eINSTANCE.getSupplyChainMasterData_Products();

		/**
		 * The meta object literal for the '<em><b>Locations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUPPLY_CHAIN_MASTER_DATA__LOCATIONS = eINSTANCE.getSupplyChainMasterData_Locations();

		/**
		 * The meta object literal for the '<em><b>Resources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUPPLY_CHAIN_MASTER_DATA__RESOURCES = eINSTANCE.getSupplyChainMasterData_Resources();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPPLY_CHAIN_MASTER_DATA__NAME = eINSTANCE.getSupplyChainMasterData_Name();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.macroplanner.impl.ProductImpl <em>Product</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.macroplanner.impl.ProductImpl
		 * @see com.misc.common.moplaf.macroplanner.impl.MacroPlannerPackageImpl#getProduct()
		 * @generated
		 */
		EClass PRODUCT = eINSTANCE.getProduct();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT__CHILDREN = eINSTANCE.getProduct_Children();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT__PARENT = eINSTANCE.getProduct_Parent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__NAME = eINSTANCE.getProduct_Name();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__CODE = eINSTANCE.getProduct_Code();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.macroplanner.impl.ResourceImpl <em>Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.macroplanner.impl.ResourceImpl
		 * @see com.misc.common.moplaf.macroplanner.impl.MacroPlannerPackageImpl#getResource()
		 * @generated
		 */
		EClass RESOURCE = eINSTANCE.getResource();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE__CHILDREN = eINSTANCE.getResource_Children();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE__PARENT = eINSTANCE.getResource_Parent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__NAME = eINSTANCE.getResource_Name();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__CODE = eINSTANCE.getResource_Code();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.macroplanner.impl.LocationImpl <em>Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.macroplanner.impl.LocationImpl
		 * @see com.misc.common.moplaf.macroplanner.impl.MacroPlannerPackageImpl#getLocation()
		 * @generated
		 */
		EClass LOCATION = eINSTANCE.getLocation();

		/**
		 * The meta object literal for the '<em><b>Products</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCATION__PRODUCTS = eINSTANCE.getLocation_Products();

		/**
		 * The meta object literal for the '<em><b>Resources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCATION__RESOURCES = eINSTANCE.getLocation_Resources();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCATION__CHILDREN = eINSTANCE.getLocation_Children();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCATION__PARENT = eINSTANCE.getLocation_Parent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__NAME = eINSTANCE.getLocation_Name();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__CODE = eINSTANCE.getLocation_Code();

		/**
		 * The meta object literal for the '<em><b>Construct Location Product</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LOCATION___CONSTRUCT_LOCATION_PRODUCT__PRODUCT = eINSTANCE.getLocation__ConstructLocationProduct__Product();

		/**
		 * The meta object literal for the '<em><b>Construct Location Resource</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LOCATION___CONSTRUCT_LOCATION_RESOURCE__RESOURCE = eINSTANCE.getLocation__ConstructLocationResource__Resource();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.macroplanner.impl.LocationProductImpl <em>Location Product</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.macroplanner.impl.LocationProductImpl
		 * @see com.misc.common.moplaf.macroplanner.impl.MacroPlannerPackageImpl#getLocationProduct()
		 * @generated
		 */
		EClass LOCATION_PRODUCT = eINSTANCE.getLocationProduct();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCATION_PRODUCT__LOCATION = eINSTANCE.getLocationProduct_Location();

		/**
		 * The meta object literal for the '<em><b>Product</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCATION_PRODUCT__PRODUCT = eINSTANCE.getLocationProduct_Product();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION_PRODUCT__CODE = eINSTANCE.getLocationProduct_Code();

		/**
		 * The meta object literal for the '<em><b>Supplies</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCATION_PRODUCT__SUPPLIES = eINSTANCE.getLocationProduct_Supplies();

		/**
		 * The meta object literal for the '<em><b>Capacities</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCATION_PRODUCT__CAPACITIES = eINSTANCE.getLocationProduct_Capacities();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.macroplanner.impl.LocationResourceImpl <em>Location Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.macroplanner.impl.LocationResourceImpl
		 * @see com.misc.common.moplaf.macroplanner.impl.MacroPlannerPackageImpl#getLocationResource()
		 * @generated
		 */
		EClass LOCATION_RESOURCE = eINSTANCE.getLocationResource();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCATION_RESOURCE__LOCATION = eINSTANCE.getLocationResource_Location();

		/**
		 * The meta object literal for the '<em><b>Resource</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCATION_RESOURCE__RESOURCE = eINSTANCE.getLocationResource_Resource();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION_RESOURCE__CODE = eINSTANCE.getLocationResource_Code();

		/**
		 * The meta object literal for the '<em><b>Availabilities</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCATION_RESOURCE__AVAILABILITIES = eINSTANCE.getLocationResource_Availabilities();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.macroplanner.impl.SupplyChainLimitsImpl <em>Supply Chain Limits</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.macroplanner.impl.SupplyChainLimitsImpl
		 * @see com.misc.common.moplaf.macroplanner.impl.MacroPlannerPackageImpl#getSupplyChainLimits()
		 * @generated
		 */
		EClass SUPPLY_CHAIN_LIMITS = eINSTANCE.getSupplyChainLimits();

		/**
		 * The meta object literal for the '<em><b>Capacities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUPPLY_CHAIN_LIMITS__CAPACITIES = eINSTANCE.getSupplyChainLimits_Capacities();

		/**
		 * The meta object literal for the '<em><b>Availabilities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUPPLY_CHAIN_LIMITS__AVAILABILITIES = eINSTANCE.getSupplyChainLimits_Availabilities();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPPLY_CHAIN_LIMITS__NAME = eINSTANCE.getSupplyChainLimits_Name();

		/**
		 * The meta object literal for the '<em><b>Construct Capacity</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SUPPLY_CHAIN_LIMITS___CONSTRUCT_CAPACITY__LOCATIONPRODUCT = eINSTANCE.getSupplyChainLimits__ConstructCapacity__LocationProduct();

		/**
		 * The meta object literal for the '<em><b>Construct Availability</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SUPPLY_CHAIN_LIMITS___CONSTRUCT_AVAILABILITY__LOCATIONRESOURCE = eINSTANCE.getSupplyChainLimits__ConstructAvailability__LocationResource();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.macroplanner.impl.SupplyChainDataImpl <em>Supply Chain Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.macroplanner.impl.SupplyChainDataImpl
		 * @see com.misc.common.moplaf.macroplanner.impl.MacroPlannerPackageImpl#getSupplyChainData()
		 * @generated
		 */
		EClass SUPPLY_CHAIN_DATA = eINSTANCE.getSupplyChainData();

		/**
		 * The meta object literal for the '<em><b>Supplies</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUPPLY_CHAIN_DATA__SUPPLIES = eINSTANCE.getSupplyChainData_Supplies();

		/**
		 * The meta object literal for the '<em><b>Construct Supply</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SUPPLY_CHAIN_DATA___CONSTRUCT_SUPPLY__LOCATIONPRODUCT = eINSTANCE.getSupplyChainData__ConstructSupply__LocationProduct();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPPLY_CHAIN_DATA__NAME = eINSTANCE.getSupplyChainData_Name();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.macroplanner.impl.SupplyImpl <em>Supply</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.macroplanner.impl.SupplyImpl
		 * @see com.misc.common.moplaf.macroplanner.impl.MacroPlannerPackageImpl#getSupply()
		 * @generated
		 */
		EClass SUPPLY = eINSTANCE.getSupply();

		/**
		 * The meta object literal for the '<em><b>Supply Chain Data</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUPPLY__SUPPLY_CHAIN_DATA = eINSTANCE.getSupply_SupplyChainData();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPPLY__QUANTITY = eINSTANCE.getSupply_Quantity();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPPLY__FROM = eINSTANCE.getSupply_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPPLY__TO = eINSTANCE.getSupply_To();

		/**
		 * The meta object literal for the '<em><b>Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPPLY__COST = eINSTANCE.getSupply_Cost();

		/**
		 * The meta object literal for the '<em><b>Location Product</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUPPLY__LOCATION_PRODUCT = eINSTANCE.getSupply_LocationProduct();

		/**
		 * The meta object literal for the '<em><b>Enforce</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPPLY__ENFORCE = eINSTANCE.getSupply_Enforce();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.macroplanner.impl.AvailabilityImpl <em>Availability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.macroplanner.impl.AvailabilityImpl
		 * @see com.misc.common.moplaf.macroplanner.impl.MacroPlannerPackageImpl#getAvailability()
		 * @generated
		 */
		EClass AVAILABILITY = eINSTANCE.getAvailability();

		/**
		 * The meta object literal for the '<em><b>Supply Chain Limits</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AVAILABILITY__SUPPLY_CHAIN_LIMITS = eINSTANCE.getAvailability_SupplyChainLimits();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AVAILABILITY__QUANTITY = eINSTANCE.getAvailability_Quantity();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AVAILABILITY__FROM = eINSTANCE.getAvailability_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AVAILABILITY__TO = eINSTANCE.getAvailability_To();

		/**
		 * The meta object literal for the '<em><b>Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AVAILABILITY__COST = eINSTANCE.getAvailability_Cost();

		/**
		 * The meta object literal for the '<em><b>Enforce</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AVAILABILITY__ENFORCE = eINSTANCE.getAvailability_Enforce();

		/**
		 * The meta object literal for the '<em><b>Penalty</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AVAILABILITY__PENALTY = eINSTANCE.getAvailability_Penalty();

		/**
		 * The meta object literal for the '<em><b>Location Resource</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AVAILABILITY__LOCATION_RESOURCE = eINSTANCE.getAvailability_LocationResource();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.macroplanner.impl.CapacityImpl <em>Capacity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.macroplanner.impl.CapacityImpl
		 * @see com.misc.common.moplaf.macroplanner.impl.MacroPlannerPackageImpl#getCapacity()
		 * @generated
		 */
		EClass CAPACITY = eINSTANCE.getCapacity();

		/**
		 * The meta object literal for the '<em><b>Supply Chain Limits</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPACITY__SUPPLY_CHAIN_LIMITS = eINSTANCE.getCapacity_SupplyChainLimits();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAPACITY__QUANTITY = eINSTANCE.getCapacity_Quantity();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAPACITY__FROM = eINSTANCE.getCapacity_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAPACITY__TO = eINSTANCE.getCapacity_To();

		/**
		 * The meta object literal for the '<em><b>Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAPACITY__COST = eINSTANCE.getCapacity_Cost();

		/**
		 * The meta object literal for the '<em><b>Enforce</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAPACITY__ENFORCE = eINSTANCE.getCapacity_Enforce();

		/**
		 * The meta object literal for the '<em><b>Penalty</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAPACITY__PENALTY = eINSTANCE.getCapacity_Penalty();

		/**
		 * The meta object literal for the '<em><b>Location Product</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPACITY__LOCATION_PRODUCT = eINSTANCE.getCapacity_LocationProduct();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.macroplanner.impl.SupplyChainRoutingsImpl <em>Supply Chain Routings</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.macroplanner.impl.SupplyChainRoutingsImpl
		 * @see com.misc.common.moplaf.macroplanner.impl.MacroPlannerPackageImpl#getSupplyChainRoutings()
		 * @generated
		 */
		EClass SUPPLY_CHAIN_ROUTINGS = eINSTANCE.getSupplyChainRoutings();

		/**
		 * The meta object literal for the '<em><b>Routings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUPPLY_CHAIN_ROUTINGS__ROUTINGS = eINSTANCE.getSupplyChainRoutings_Routings();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPPLY_CHAIN_ROUTINGS__NAME = eINSTANCE.getSupplyChainRoutings_Name();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.macroplanner.impl.RoutingImpl <em>Routing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.macroplanner.impl.RoutingImpl
		 * @see com.misc.common.moplaf.macroplanner.impl.MacroPlannerPackageImpl#getRouting()
		 * @generated
		 */
		EClass ROUTING = eINSTANCE.getRouting();

		/**
		 * The meta object literal for the '<em><b>Resources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROUTING__RESOURCES = eINSTANCE.getRouting_Resources();

		/**
		 * The meta object literal for the '<em><b>Products</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROUTING__PRODUCTS = eINSTANCE.getRouting_Products();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROUTING__NAME = eINSTANCE.getRouting_Name();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROUTING__CODE = eINSTANCE.getRouting_Code();

		/**
		 * The meta object literal for the '<em><b>Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROUTING__COST = eINSTANCE.getRouting_Cost();

		/**
		 * The meta object literal for the '<em><b>Supply Chain Routings</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROUTING__SUPPLY_CHAIN_ROUTINGS = eINSTANCE.getRouting_SupplyChainRoutings();

		/**
		 * The meta object literal for the '<em><b>Construct Routing Product</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROUTING___CONSTRUCT_ROUTING_PRODUCT__LOCATIONPRODUCT = eINSTANCE.getRouting__ConstructRoutingProduct__LocationProduct();

		/**
		 * The meta object literal for the '<em><b>Construct Routing Resource</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROUTING___CONSTRUCT_ROUTING_RESOURCE__LOCATIONRESOURCE = eINSTANCE.getRouting__ConstructRoutingResource__LocationResource();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.macroplanner.impl.RoutingProductImpl <em>Routing Product</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.macroplanner.impl.RoutingProductImpl
		 * @see com.misc.common.moplaf.macroplanner.impl.MacroPlannerPackageImpl#getRoutingProduct()
		 * @generated
		 */
		EClass ROUTING_PRODUCT = eINSTANCE.getRoutingProduct();

		/**
		 * The meta object literal for the '<em><b>Routing</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROUTING_PRODUCT__ROUTING = eINSTANCE.getRoutingProduct_Routing();

		/**
		 * The meta object literal for the '<em><b>Consumption</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROUTING_PRODUCT__CONSUMPTION = eINSTANCE.getRoutingProduct_Consumption();

		/**
		 * The meta object literal for the '<em><b>Offset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROUTING_PRODUCT__OFFSET = eINSTANCE.getRoutingProduct_Offset();

		/**
		 * The meta object literal for the '<em><b>Location Product</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROUTING_PRODUCT__LOCATION_PRODUCT = eINSTANCE.getRoutingProduct_LocationProduct();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROUTING_PRODUCT__CODE = eINSTANCE.getRoutingProduct_Code();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.macroplanner.impl.RoutingResourceImpl <em>Routing Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.macroplanner.impl.RoutingResourceImpl
		 * @see com.misc.common.moplaf.macroplanner.impl.MacroPlannerPackageImpl#getRoutingResource()
		 * @generated
		 */
		EClass ROUTING_RESOURCE = eINSTANCE.getRoutingResource();

		/**
		 * The meta object literal for the '<em><b>Routing</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROUTING_RESOURCE__ROUTING = eINSTANCE.getRoutingResource_Routing();

		/**
		 * The meta object literal for the '<em><b>Reservation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROUTING_RESOURCE__RESERVATION = eINSTANCE.getRoutingResource_Reservation();

		/**
		 * The meta object literal for the '<em><b>Offset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROUTING_RESOURCE__OFFSET = eINSTANCE.getRoutingResource_Offset();

		/**
		 * The meta object literal for the '<em><b>Location Resource</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROUTING_RESOURCE__LOCATION_RESOURCE = eINSTANCE.getRoutingResource_LocationResource();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROUTING_RESOURCE__CODE = eINSTANCE.getRoutingResource_Code();

	}

} //MacroPlannerPackage
