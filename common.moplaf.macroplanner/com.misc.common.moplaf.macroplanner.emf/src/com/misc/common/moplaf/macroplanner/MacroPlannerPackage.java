/**
 */
package com.misc.common.moplaf.macroplanner;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
	 * The meta object id for the '{@link com.misc.common.moplaf.macroplanner.impl.SupplyChainMasterDataImpl <em>Supply Chain Master Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.macroplanner.impl.SupplyChainMasterDataImpl
	 * @see com.misc.common.moplaf.macroplanner.impl.MacroPlannerPackageImpl#getSupplyChainMasterData()
	 * @generated
	 */
	int SUPPLY_CHAIN_MASTER_DATA = 0;

	/**
	 * The feature id for the '<em><b>Products</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLY_CHAIN_MASTER_DATA__PRODUCTS = 0;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLY_CHAIN_MASTER_DATA__LOCATIONS = 1;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLY_CHAIN_MASTER_DATA__RESOURCES = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLY_CHAIN_MASTER_DATA__NAME = 3;

	/**
	 * The number of structural features of the '<em>Supply Chain Master Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLY_CHAIN_MASTER_DATA_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Supply Chain Master Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLY_CHAIN_MASTER_DATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.macroplanner.impl.ProductImpl <em>Product</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.macroplanner.impl.ProductImpl
	 * @see com.misc.common.moplaf.macroplanner.impl.MacroPlannerPackageImpl#getProduct()
	 * @generated
	 */
	int PRODUCT = 1;

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
	int RESOURCE = 2;

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
	int LOCATION = 3;

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
	 * The number of operations of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.macroplanner.impl.LocationProductImpl <em>Location Product</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.macroplanner.impl.LocationProductImpl
	 * @see com.misc.common.moplaf.macroplanner.impl.MacroPlannerPackageImpl#getLocationProduct()
	 * @generated
	 */
	int LOCATION_PRODUCT = 4;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_PRODUCT__RESOURCE = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_PRODUCT__CODE = 1;

	/**
	 * The number of structural features of the '<em>Location Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_PRODUCT_FEATURE_COUNT = 2;

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
	int LOCATION_RESOURCE = 5;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_RESOURCE__RESOURCE = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_RESOURCE__CODE = 1;

	/**
	 * The number of structural features of the '<em>Location Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_RESOURCE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Location Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_RESOURCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.macroplanner.impl.SupplyChainDataImpl <em>Supply Chain Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.macroplanner.impl.SupplyChainDataImpl
	 * @see com.misc.common.moplaf.macroplanner.impl.MacroPlannerPackageImpl#getSupplyChainData()
	 * @generated
	 */
	int SUPPLY_CHAIN_DATA = 6;

	/**
	 * The feature id for the '<em><b>Supplies And Demands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLY_CHAIN_DATA__SUPPLIES_AND_DEMANDS = 0;

	/**
	 * The feature id for the '<em><b>Availabilities And Reservations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLY_CHAIN_DATA__AVAILABILITIES_AND_RESERVATIONS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLY_CHAIN_DATA__NAME = 2;

	/**
	 * The number of structural features of the '<em>Supply Chain Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLY_CHAIN_DATA_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Supply Chain Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLY_CHAIN_DATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.macroplanner.impl.ProductSupplyImpl <em>Product Supply</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.macroplanner.impl.ProductSupplyImpl
	 * @see com.misc.common.moplaf.macroplanner.impl.MacroPlannerPackageImpl#getProductSupply()
	 * @generated
	 */
	int PRODUCT_SUPPLY = 7;

	/**
	 * The feature id for the '<em><b>Supplied</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SUPPLY__SUPPLIED = 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SUPPLY__FROM = 1;

	/**
	 * The feature id for the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SUPPLY__TO = 2;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SUPPLY__COST = 3;

	/**
	 * The feature id for the '<em><b>Location Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SUPPLY__LOCATION_PRODUCT = 4;

	/**
	 * The number of structural features of the '<em>Product Supply</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SUPPLY_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Product Supply</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SUPPLY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.macroplanner.impl.ResourceAvailableImpl <em>Resource Available</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.macroplanner.impl.ResourceAvailableImpl
	 * @see com.misc.common.moplaf.macroplanner.impl.MacroPlannerPackageImpl#getResourceAvailable()
	 * @generated
	 */
	int RESOURCE_AVAILABLE = 8;

	/**
	 * The feature id for the '<em><b>Available</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_AVAILABLE__AVAILABLE = 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_AVAILABLE__FROM = 1;

	/**
	 * The feature id for the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_AVAILABLE__TO = 2;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_AVAILABLE__COST = 3;

	/**
	 * The feature id for the '<em><b>Location Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_AVAILABLE__LOCATION_RESOURCE = 4;

	/**
	 * The number of structural features of the '<em>Resource Available</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_AVAILABLE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Resource Available</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_AVAILABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.macroplanner.impl.SupplyChainRoutingsImpl <em>Supply Chain Routings</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.macroplanner.impl.SupplyChainRoutingsImpl
	 * @see com.misc.common.moplaf.macroplanner.impl.MacroPlannerPackageImpl#getSupplyChainRoutings()
	 * @generated
	 */
	int SUPPLY_CHAIN_ROUTINGS = 9;

	/**
	 * The feature id for the '<em><b>Routings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLY_CHAIN_ROUTINGS__ROUTINGS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLY_CHAIN_ROUTINGS__NAME = 1;

	/**
	 * The number of structural features of the '<em>Supply Chain Routings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLY_CHAIN_ROUTINGS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Supply Chain Routings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLY_CHAIN_ROUTINGS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.macroplanner.impl.RoutingImpl <em>Routing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.macroplanner.impl.RoutingImpl
	 * @see com.misc.common.moplaf.macroplanner.impl.MacroPlannerPackageImpl#getRouting()
	 * @generated
	 */
	int ROUTING = 10;

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
	 * The number of structural features of the '<em>Routing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTING_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Routing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.macroplanner.impl.RoutingProductImpl <em>Routing Product</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.macroplanner.impl.RoutingProductImpl
	 * @see com.misc.common.moplaf.macroplanner.impl.MacroPlannerPackageImpl#getRoutingProduct()
	 * @generated
	 */
	int ROUTING_PRODUCT = 11;

	/**
	 * The feature id for the '<em><b>Consumption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTING_PRODUCT__CONSUMPTION = 0;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTING_PRODUCT__OFFSET = 1;

	/**
	 * The feature id for the '<em><b>Location Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTING_PRODUCT__LOCATION_PRODUCT = 2;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTING_PRODUCT__CODE = 3;

	/**
	 * The number of structural features of the '<em>Routing Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTING_PRODUCT_FEATURE_COUNT = 4;

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
	int ROUTING_RESOURCE = 12;

	/**
	 * The feature id for the '<em><b>Reservation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTING_RESOURCE__RESERVATION = 0;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTING_RESOURCE__OFFSET = 1;

	/**
	 * The feature id for the '<em><b>Location Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTING_RESOURCE__LOCATION_RESOURCE = 2;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTING_RESOURCE__CODE = 3;

	/**
	 * The number of structural features of the '<em>Routing Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTING_RESOURCE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Routing Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTING_RESOURCE_OPERATION_COUNT = 0;


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
	 * Returns the meta object for class '{@link com.misc.common.moplaf.macroplanner.LocationProduct <em>Location Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location Product</em>'.
	 * @see com.misc.common.moplaf.macroplanner.LocationProduct
	 * @generated
	 */
	EClass getLocationProduct();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.macroplanner.LocationProduct#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resource</em>'.
	 * @see com.misc.common.moplaf.macroplanner.LocationProduct#getResource()
	 * @see #getLocationProduct()
	 * @generated
	 */
	EReference getLocationProduct_Resource();

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
	 * Returns the meta object for class '{@link com.misc.common.moplaf.macroplanner.LocationResource <em>Location Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location Resource</em>'.
	 * @see com.misc.common.moplaf.macroplanner.LocationResource
	 * @generated
	 */
	EClass getLocationResource();

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
	 * Returns the meta object for class '{@link com.misc.common.moplaf.macroplanner.SupplyChainData <em>Supply Chain Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Supply Chain Data</em>'.
	 * @see com.misc.common.moplaf.macroplanner.SupplyChainData
	 * @generated
	 */
	EClass getSupplyChainData();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.common.moplaf.macroplanner.SupplyChainData#getSuppliesAndDemands <em>Supplies And Demands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Supplies And Demands</em>'.
	 * @see com.misc.common.moplaf.macroplanner.SupplyChainData#getSuppliesAndDemands()
	 * @see #getSupplyChainData()
	 * @generated
	 */
	EReference getSupplyChainData_SuppliesAndDemands();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.common.moplaf.macroplanner.SupplyChainData#getAvailabilitiesAndReservations <em>Availabilities And Reservations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Availabilities And Reservations</em>'.
	 * @see com.misc.common.moplaf.macroplanner.SupplyChainData#getAvailabilitiesAndReservations()
	 * @see #getSupplyChainData()
	 * @generated
	 */
	EReference getSupplyChainData_AvailabilitiesAndReservations();

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
	 * Returns the meta object for class '{@link com.misc.common.moplaf.macroplanner.ProductSupply <em>Product Supply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Supply</em>'.
	 * @see com.misc.common.moplaf.macroplanner.ProductSupply
	 * @generated
	 */
	EClass getProductSupply();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.macroplanner.ProductSupply#getSupplied <em>Supplied</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Supplied</em>'.
	 * @see com.misc.common.moplaf.macroplanner.ProductSupply#getSupplied()
	 * @see #getProductSupply()
	 * @generated
	 */
	EAttribute getProductSupply_Supplied();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.macroplanner.ProductSupply#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From</em>'.
	 * @see com.misc.common.moplaf.macroplanner.ProductSupply#getFrom()
	 * @see #getProductSupply()
	 * @generated
	 */
	EAttribute getProductSupply_From();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.macroplanner.ProductSupply#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To</em>'.
	 * @see com.misc.common.moplaf.macroplanner.ProductSupply#getTo()
	 * @see #getProductSupply()
	 * @generated
	 */
	EAttribute getProductSupply_To();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.macroplanner.ProductSupply#getCost <em>Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cost</em>'.
	 * @see com.misc.common.moplaf.macroplanner.ProductSupply#getCost()
	 * @see #getProductSupply()
	 * @generated
	 */
	EAttribute getProductSupply_Cost();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.macroplanner.ProductSupply#getLocationProduct <em>Location Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Location Product</em>'.
	 * @see com.misc.common.moplaf.macroplanner.ProductSupply#getLocationProduct()
	 * @see #getProductSupply()
	 * @generated
	 */
	EReference getProductSupply_LocationProduct();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.macroplanner.ResourceAvailable <em>Resource Available</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Available</em>'.
	 * @see com.misc.common.moplaf.macroplanner.ResourceAvailable
	 * @generated
	 */
	EClass getResourceAvailable();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.macroplanner.ResourceAvailable#getAvailable <em>Available</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Available</em>'.
	 * @see com.misc.common.moplaf.macroplanner.ResourceAvailable#getAvailable()
	 * @see #getResourceAvailable()
	 * @generated
	 */
	EAttribute getResourceAvailable_Available();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.macroplanner.ResourceAvailable#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From</em>'.
	 * @see com.misc.common.moplaf.macroplanner.ResourceAvailable#getFrom()
	 * @see #getResourceAvailable()
	 * @generated
	 */
	EAttribute getResourceAvailable_From();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.macroplanner.ResourceAvailable#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To</em>'.
	 * @see com.misc.common.moplaf.macroplanner.ResourceAvailable#getTo()
	 * @see #getResourceAvailable()
	 * @generated
	 */
	EAttribute getResourceAvailable_To();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.macroplanner.ResourceAvailable#getCost <em>Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cost</em>'.
	 * @see com.misc.common.moplaf.macroplanner.ResourceAvailable#getCost()
	 * @see #getResourceAvailable()
	 * @generated
	 */
	EAttribute getResourceAvailable_Cost();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.macroplanner.ResourceAvailable#getLocationResource <em>Location Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Location Resource</em>'.
	 * @see com.misc.common.moplaf.macroplanner.ResourceAvailable#getLocationResource()
	 * @see #getResourceAvailable()
	 * @generated
	 */
	EReference getResourceAvailable_LocationResource();

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
	 * Returns the meta object for class '{@link com.misc.common.moplaf.macroplanner.RoutingProduct <em>Routing Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Routing Product</em>'.
	 * @see com.misc.common.moplaf.macroplanner.RoutingProduct
	 * @generated
	 */
	EClass getRoutingProduct();

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
		 * The meta object literal for the '{@link com.misc.common.moplaf.macroplanner.impl.LocationProductImpl <em>Location Product</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.macroplanner.impl.LocationProductImpl
		 * @see com.misc.common.moplaf.macroplanner.impl.MacroPlannerPackageImpl#getLocationProduct()
		 * @generated
		 */
		EClass LOCATION_PRODUCT = eINSTANCE.getLocationProduct();

		/**
		 * The meta object literal for the '<em><b>Resource</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCATION_PRODUCT__RESOURCE = eINSTANCE.getLocationProduct_Resource();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION_PRODUCT__CODE = eINSTANCE.getLocationProduct_Code();

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
		 * The meta object literal for the '{@link com.misc.common.moplaf.macroplanner.impl.SupplyChainDataImpl <em>Supply Chain Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.macroplanner.impl.SupplyChainDataImpl
		 * @see com.misc.common.moplaf.macroplanner.impl.MacroPlannerPackageImpl#getSupplyChainData()
		 * @generated
		 */
		EClass SUPPLY_CHAIN_DATA = eINSTANCE.getSupplyChainData();

		/**
		 * The meta object literal for the '<em><b>Supplies And Demands</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUPPLY_CHAIN_DATA__SUPPLIES_AND_DEMANDS = eINSTANCE.getSupplyChainData_SuppliesAndDemands();

		/**
		 * The meta object literal for the '<em><b>Availabilities And Reservations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUPPLY_CHAIN_DATA__AVAILABILITIES_AND_RESERVATIONS = eINSTANCE.getSupplyChainData_AvailabilitiesAndReservations();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPPLY_CHAIN_DATA__NAME = eINSTANCE.getSupplyChainData_Name();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.macroplanner.impl.ProductSupplyImpl <em>Product Supply</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.macroplanner.impl.ProductSupplyImpl
		 * @see com.misc.common.moplaf.macroplanner.impl.MacroPlannerPackageImpl#getProductSupply()
		 * @generated
		 */
		EClass PRODUCT_SUPPLY = eINSTANCE.getProductSupply();

		/**
		 * The meta object literal for the '<em><b>Supplied</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_SUPPLY__SUPPLIED = eINSTANCE.getProductSupply_Supplied();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_SUPPLY__FROM = eINSTANCE.getProductSupply_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_SUPPLY__TO = eINSTANCE.getProductSupply_To();

		/**
		 * The meta object literal for the '<em><b>Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_SUPPLY__COST = eINSTANCE.getProductSupply_Cost();

		/**
		 * The meta object literal for the '<em><b>Location Product</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_SUPPLY__LOCATION_PRODUCT = eINSTANCE.getProductSupply_LocationProduct();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.macroplanner.impl.ResourceAvailableImpl <em>Resource Available</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.macroplanner.impl.ResourceAvailableImpl
		 * @see com.misc.common.moplaf.macroplanner.impl.MacroPlannerPackageImpl#getResourceAvailable()
		 * @generated
		 */
		EClass RESOURCE_AVAILABLE = eINSTANCE.getResourceAvailable();

		/**
		 * The meta object literal for the '<em><b>Available</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_AVAILABLE__AVAILABLE = eINSTANCE.getResourceAvailable_Available();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_AVAILABLE__FROM = eINSTANCE.getResourceAvailable_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_AVAILABLE__TO = eINSTANCE.getResourceAvailable_To();

		/**
		 * The meta object literal for the '<em><b>Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_AVAILABLE__COST = eINSTANCE.getResourceAvailable_Cost();

		/**
		 * The meta object literal for the '<em><b>Location Resource</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_AVAILABLE__LOCATION_RESOURCE = eINSTANCE.getResourceAvailable_LocationResource();

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
		 * The meta object literal for the '{@link com.misc.common.moplaf.macroplanner.impl.RoutingProductImpl <em>Routing Product</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.macroplanner.impl.RoutingProductImpl
		 * @see com.misc.common.moplaf.macroplanner.impl.MacroPlannerPackageImpl#getRoutingProduct()
		 * @generated
		 */
		EClass ROUTING_PRODUCT = eINSTANCE.getRoutingProduct();

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
