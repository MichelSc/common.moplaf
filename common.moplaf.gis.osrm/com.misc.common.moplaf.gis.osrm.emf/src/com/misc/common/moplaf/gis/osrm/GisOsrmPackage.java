/**
 */
package com.misc.common.moplaf.gis.osrm;

import com.misc.common.moplaf.gis.GisPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

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
 * @see com.misc.common.moplaf.gis.osrm.GisOsrmFactory
 * @model kind="package"
 * @generated
 */
public interface GisOsrmPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "osrm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.misc.com/common/moplaf/gis/osrm/model/0.1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "osrm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GisOsrmPackage eINSTANCE = com.misc.common.moplaf.gis.osrm.impl.GisOsrmPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.gis.osrm.impl.GisDistanceMatrixCalculatorOsrmOneToOneImpl <em>Gis Distance Matrix Calculator Osrm One To One</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.gis.osrm.impl.GisDistanceMatrixCalculatorOsrmOneToOneImpl
	 * @see com.misc.common.moplaf.gis.osrm.impl.GisOsrmPackageImpl#getGisDistanceMatrixCalculatorOsrmOneToOne()
	 * @generated
	 */
	int GIS_DISTANCE_MATRIX_CALCULATOR_OSRM_ONE_TO_ONE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_DISTANCE_MATRIX_CALCULATOR_OSRM_ONE_TO_ONE__NAME = GisPackage.GIS_ROUTE_CALCULATOR_ONE_TO_ONE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_DISTANCE_MATRIX_CALCULATOR_OSRM_ONE_TO_ONE__DESCRIPTION = GisPackage.GIS_ROUTE_CALCULATOR_ONE_TO_ONE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_DISTANCE_MATRIX_CALCULATOR_OSRM_ONE_TO_ONE__PROTOCOL = GisPackage.GIS_ROUTE_CALCULATOR_ONE_TO_ONE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_DISTANCE_MATRIX_CALCULATOR_OSRM_ONE_TO_ONE__HOST = GisPackage.GIS_ROUTE_CALCULATOR_ONE_TO_ONE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_DISTANCE_MATRIX_CALCULATOR_OSRM_ONE_TO_ONE__PORT = GisPackage.GIS_ROUTE_CALCULATOR_ONE_TO_ONE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_DISTANCE_MATRIX_CALCULATOR_OSRM_ONE_TO_ONE__PATH = GisPackage.GIS_ROUTE_CALCULATOR_ONE_TO_ONE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Profile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_DISTANCE_MATRIX_CALCULATOR_OSRM_ONE_TO_ONE__PROFILE = GisPackage.GIS_ROUTE_CALCULATOR_ONE_TO_ONE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Overview</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_DISTANCE_MATRIX_CALCULATOR_OSRM_ONE_TO_ONE__OVERVIEW = GisPackage.GIS_ROUTE_CALCULATOR_ONE_TO_ONE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Gis Distance Matrix Calculator Osrm One To One</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_DISTANCE_MATRIX_CALCULATOR_OSRM_ONE_TO_ONE_FEATURE_COUNT = GisPackage.GIS_ROUTE_CALCULATOR_ONE_TO_ONE_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Get Route</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_DISTANCE_MATRIX_CALCULATOR_OSRM_ONE_TO_ONE___GET_ROUTE__GISLOCATION_GISLOCATION = GisPackage.GIS_ROUTE_CALCULATOR_ONE_TO_ONE___GET_ROUTE__GISLOCATION_GISLOCATION;

	/**
	 * The operation id for the '<em>Get Routes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_DISTANCE_MATRIX_CALCULATOR_OSRM_ONE_TO_ONE___GET_ROUTES__ELIST_ELIST = GisPackage.GIS_ROUTE_CALCULATOR_ONE_TO_ONE___GET_ROUTES__ELIST_ELIST;

	/**
	 * The number of operations of the '<em>Gis Distance Matrix Calculator Osrm One To One</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_DISTANCE_MATRIX_CALCULATOR_OSRM_ONE_TO_ONE_OPERATION_COUNT = GisPackage.GIS_ROUTE_CALCULATOR_ONE_TO_ONE_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.gis.osrm.impl.GisDistanceMatrixCalculatorOsrmManyToManyImpl <em>Gis Distance Matrix Calculator Osrm Many To Many</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.gis.osrm.impl.GisDistanceMatrixCalculatorOsrmManyToManyImpl
	 * @see com.misc.common.moplaf.gis.osrm.impl.GisOsrmPackageImpl#getGisDistanceMatrixCalculatorOsrmManyToMany()
	 * @generated
	 */
	int GIS_DISTANCE_MATRIX_CALCULATOR_OSRM_MANY_TO_MANY = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_DISTANCE_MATRIX_CALCULATOR_OSRM_MANY_TO_MANY__NAME = GisPackage.GIS_ROUTE_CALCULATOR_MANY_TO_MANY__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_DISTANCE_MATRIX_CALCULATOR_OSRM_MANY_TO_MANY__DESCRIPTION = GisPackage.GIS_ROUTE_CALCULATOR_MANY_TO_MANY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_DISTANCE_MATRIX_CALCULATOR_OSRM_MANY_TO_MANY__PROTOCOL = GisPackage.GIS_ROUTE_CALCULATOR_MANY_TO_MANY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_DISTANCE_MATRIX_CALCULATOR_OSRM_MANY_TO_MANY__HOST = GisPackage.GIS_ROUTE_CALCULATOR_MANY_TO_MANY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_DISTANCE_MATRIX_CALCULATOR_OSRM_MANY_TO_MANY__PORT = GisPackage.GIS_ROUTE_CALCULATOR_MANY_TO_MANY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_DISTANCE_MATRIX_CALCULATOR_OSRM_MANY_TO_MANY__PATH = GisPackage.GIS_ROUTE_CALCULATOR_MANY_TO_MANY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Profile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_DISTANCE_MATRIX_CALCULATOR_OSRM_MANY_TO_MANY__PROFILE = GisPackage.GIS_ROUTE_CALCULATOR_MANY_TO_MANY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Gis Distance Matrix Calculator Osrm Many To Many</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_DISTANCE_MATRIX_CALCULATOR_OSRM_MANY_TO_MANY_FEATURE_COUNT = GisPackage.GIS_ROUTE_CALCULATOR_MANY_TO_MANY_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Route</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_DISTANCE_MATRIX_CALCULATOR_OSRM_MANY_TO_MANY___GET_ROUTE__GISLOCATION_GISLOCATION = GisPackage.GIS_ROUTE_CALCULATOR_MANY_TO_MANY___GET_ROUTE__GISLOCATION_GISLOCATION;

	/**
	 * The operation id for the '<em>Get Routes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_DISTANCE_MATRIX_CALCULATOR_OSRM_MANY_TO_MANY___GET_ROUTES__ELIST_ELIST = GisPackage.GIS_ROUTE_CALCULATOR_MANY_TO_MANY___GET_ROUTES__ELIST_ELIST;

	/**
	 * The number of operations of the '<em>Gis Distance Matrix Calculator Osrm Many To Many</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_DISTANCE_MATRIX_CALCULATOR_OSRM_MANY_TO_MANY_OPERATION_COUNT = GisPackage.GIS_ROUTE_CALCULATOR_MANY_TO_MANY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.gis.osrm.impl.GisPinpointerOsrmNearestImpl <em>Gis Pinpointer Osrm Nearest</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.gis.osrm.impl.GisPinpointerOsrmNearestImpl
	 * @see com.misc.common.moplaf.gis.osrm.impl.GisOsrmPackageImpl#getGisPinpointerOsrmNearest()
	 * @generated
	 */
	int GIS_PINPOINTER_OSRM_NEAREST = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_PINPOINTER_OSRM_NEAREST__NAME = GisPackage.GIS_LOCATION_PINPOINTER__NAME;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_PINPOINTER_OSRM_NEAREST__PROTOCOL = GisPackage.GIS_LOCATION_PINPOINTER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_PINPOINTER_OSRM_NEAREST__HOST = GisPackage.GIS_LOCATION_PINPOINTER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_PINPOINTER_OSRM_NEAREST__PORT = GisPackage.GIS_LOCATION_PINPOINTER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_PINPOINTER_OSRM_NEAREST__PATH = GisPackage.GIS_LOCATION_PINPOINTER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Profile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_PINPOINTER_OSRM_NEAREST__PROFILE = GisPackage.GIS_LOCATION_PINPOINTER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Max Pinpoints</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_PINPOINTER_OSRM_NEAREST__MAX_PINPOINTS = GisPackage.GIS_LOCATION_PINPOINTER_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Gis Pinpointer Osrm Nearest</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_PINPOINTER_OSRM_NEAREST_FEATURE_COUNT = GisPackage.GIS_LOCATION_PINPOINTER_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Pinpoint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_PINPOINTER_OSRM_NEAREST___PINPOINT__GISLOCATION = GisPackage.GIS_LOCATION_PINPOINTER___PINPOINT__GISLOCATION;

	/**
	 * The number of operations of the '<em>Gis Pinpointer Osrm Nearest</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_PINPOINTER_OSRM_NEAREST_OPERATION_COUNT = GisPackage.GIS_LOCATION_PINPOINTER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.gis.osrm.Protocol <em>Protocol</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.gis.osrm.Protocol
	 * @see com.misc.common.moplaf.gis.osrm.impl.GisOsrmPackageImpl#getProtocol()
	 * @generated
	 */
	int PROTOCOL = 3;


	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.gis.osrm.Overview <em>Overview</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.gis.osrm.Overview
	 * @see com.misc.common.moplaf.gis.osrm.impl.GisOsrmPackageImpl#getOverview()
	 * @generated
	 */
	int OVERVIEW = 4;


	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.gis.osrm.GisDistanceMatrixCalculatorOsrmOneToOne <em>Gis Distance Matrix Calculator Osrm One To One</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gis Distance Matrix Calculator Osrm One To One</em>'.
	 * @see com.misc.common.moplaf.gis.osrm.GisDistanceMatrixCalculatorOsrmOneToOne
	 * @generated
	 */
	EClass getGisDistanceMatrixCalculatorOsrmOneToOne();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.gis.osrm.GisDistanceMatrixCalculatorOsrmOneToOne#getProtocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Protocol</em>'.
	 * @see com.misc.common.moplaf.gis.osrm.GisDistanceMatrixCalculatorOsrmOneToOne#getProtocol()
	 * @see #getGisDistanceMatrixCalculatorOsrmOneToOne()
	 * @generated
	 */
	EAttribute getGisDistanceMatrixCalculatorOsrmOneToOne_Protocol();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.gis.osrm.GisDistanceMatrixCalculatorOsrmOneToOne#getHost <em>Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host</em>'.
	 * @see com.misc.common.moplaf.gis.osrm.GisDistanceMatrixCalculatorOsrmOneToOne#getHost()
	 * @see #getGisDistanceMatrixCalculatorOsrmOneToOne()
	 * @generated
	 */
	EAttribute getGisDistanceMatrixCalculatorOsrmOneToOne_Host();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.gis.osrm.GisDistanceMatrixCalculatorOsrmOneToOne#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see com.misc.common.moplaf.gis.osrm.GisDistanceMatrixCalculatorOsrmOneToOne#getPort()
	 * @see #getGisDistanceMatrixCalculatorOsrmOneToOne()
	 * @generated
	 */
	EAttribute getGisDistanceMatrixCalculatorOsrmOneToOne_Port();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.gis.osrm.GisDistanceMatrixCalculatorOsrmOneToOne#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see com.misc.common.moplaf.gis.osrm.GisDistanceMatrixCalculatorOsrmOneToOne#getPath()
	 * @see #getGisDistanceMatrixCalculatorOsrmOneToOne()
	 * @generated
	 */
	EAttribute getGisDistanceMatrixCalculatorOsrmOneToOne_Path();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.gis.osrm.GisDistanceMatrixCalculatorOsrmOneToOne#getProfile <em>Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Profile</em>'.
	 * @see com.misc.common.moplaf.gis.osrm.GisDistanceMatrixCalculatorOsrmOneToOne#getProfile()
	 * @see #getGisDistanceMatrixCalculatorOsrmOneToOne()
	 * @generated
	 */
	EAttribute getGisDistanceMatrixCalculatorOsrmOneToOne_Profile();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.gis.osrm.GisDistanceMatrixCalculatorOsrmOneToOne#getOverview <em>Overview</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Overview</em>'.
	 * @see com.misc.common.moplaf.gis.osrm.GisDistanceMatrixCalculatorOsrmOneToOne#getOverview()
	 * @see #getGisDistanceMatrixCalculatorOsrmOneToOne()
	 * @generated
	 */
	EAttribute getGisDistanceMatrixCalculatorOsrmOneToOne_Overview();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.gis.osrm.GisDistanceMatrixCalculatorOsrmManyToMany <em>Gis Distance Matrix Calculator Osrm Many To Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gis Distance Matrix Calculator Osrm Many To Many</em>'.
	 * @see com.misc.common.moplaf.gis.osrm.GisDistanceMatrixCalculatorOsrmManyToMany
	 * @generated
	 */
	EClass getGisDistanceMatrixCalculatorOsrmManyToMany();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.gis.osrm.GisDistanceMatrixCalculatorOsrmManyToMany#getProtocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Protocol</em>'.
	 * @see com.misc.common.moplaf.gis.osrm.GisDistanceMatrixCalculatorOsrmManyToMany#getProtocol()
	 * @see #getGisDistanceMatrixCalculatorOsrmManyToMany()
	 * @generated
	 */
	EAttribute getGisDistanceMatrixCalculatorOsrmManyToMany_Protocol();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.gis.osrm.GisDistanceMatrixCalculatorOsrmManyToMany#getHost <em>Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host</em>'.
	 * @see com.misc.common.moplaf.gis.osrm.GisDistanceMatrixCalculatorOsrmManyToMany#getHost()
	 * @see #getGisDistanceMatrixCalculatorOsrmManyToMany()
	 * @generated
	 */
	EAttribute getGisDistanceMatrixCalculatorOsrmManyToMany_Host();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.gis.osrm.GisDistanceMatrixCalculatorOsrmManyToMany#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see com.misc.common.moplaf.gis.osrm.GisDistanceMatrixCalculatorOsrmManyToMany#getPort()
	 * @see #getGisDistanceMatrixCalculatorOsrmManyToMany()
	 * @generated
	 */
	EAttribute getGisDistanceMatrixCalculatorOsrmManyToMany_Port();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.gis.osrm.GisDistanceMatrixCalculatorOsrmManyToMany#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see com.misc.common.moplaf.gis.osrm.GisDistanceMatrixCalculatorOsrmManyToMany#getPath()
	 * @see #getGisDistanceMatrixCalculatorOsrmManyToMany()
	 * @generated
	 */
	EAttribute getGisDistanceMatrixCalculatorOsrmManyToMany_Path();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.gis.osrm.GisDistanceMatrixCalculatorOsrmManyToMany#getProfile <em>Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Profile</em>'.
	 * @see com.misc.common.moplaf.gis.osrm.GisDistanceMatrixCalculatorOsrmManyToMany#getProfile()
	 * @see #getGisDistanceMatrixCalculatorOsrmManyToMany()
	 * @generated
	 */
	EAttribute getGisDistanceMatrixCalculatorOsrmManyToMany_Profile();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.gis.osrm.GisPinpointerOsrmNearest <em>Gis Pinpointer Osrm Nearest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gis Pinpointer Osrm Nearest</em>'.
	 * @see com.misc.common.moplaf.gis.osrm.GisPinpointerOsrmNearest
	 * @generated
	 */
	EClass getGisPinpointerOsrmNearest();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.gis.osrm.GisPinpointerOsrmNearest#getProtocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Protocol</em>'.
	 * @see com.misc.common.moplaf.gis.osrm.GisPinpointerOsrmNearest#getProtocol()
	 * @see #getGisPinpointerOsrmNearest()
	 * @generated
	 */
	EAttribute getGisPinpointerOsrmNearest_Protocol();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.gis.osrm.GisPinpointerOsrmNearest#getHost <em>Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host</em>'.
	 * @see com.misc.common.moplaf.gis.osrm.GisPinpointerOsrmNearest#getHost()
	 * @see #getGisPinpointerOsrmNearest()
	 * @generated
	 */
	EAttribute getGisPinpointerOsrmNearest_Host();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.gis.osrm.GisPinpointerOsrmNearest#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see com.misc.common.moplaf.gis.osrm.GisPinpointerOsrmNearest#getPort()
	 * @see #getGisPinpointerOsrmNearest()
	 * @generated
	 */
	EAttribute getGisPinpointerOsrmNearest_Port();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.gis.osrm.GisPinpointerOsrmNearest#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see com.misc.common.moplaf.gis.osrm.GisPinpointerOsrmNearest#getPath()
	 * @see #getGisPinpointerOsrmNearest()
	 * @generated
	 */
	EAttribute getGisPinpointerOsrmNearest_Path();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.gis.osrm.GisPinpointerOsrmNearest#getProfile <em>Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Profile</em>'.
	 * @see com.misc.common.moplaf.gis.osrm.GisPinpointerOsrmNearest#getProfile()
	 * @see #getGisPinpointerOsrmNearest()
	 * @generated
	 */
	EAttribute getGisPinpointerOsrmNearest_Profile();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.gis.osrm.GisPinpointerOsrmNearest#getMaxPinpoints <em>Max Pinpoints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Pinpoints</em>'.
	 * @see com.misc.common.moplaf.gis.osrm.GisPinpointerOsrmNearest#getMaxPinpoints()
	 * @see #getGisPinpointerOsrmNearest()
	 * @generated
	 */
	EAttribute getGisPinpointerOsrmNearest_MaxPinpoints();

	/**
	 * Returns the meta object for enum '{@link com.misc.common.moplaf.gis.osrm.Protocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Protocol</em>'.
	 * @see com.misc.common.moplaf.gis.osrm.Protocol
	 * @generated
	 */
	EEnum getProtocol();

	/**
	 * Returns the meta object for enum '{@link com.misc.common.moplaf.gis.osrm.Overview <em>Overview</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Overview</em>'.
	 * @see com.misc.common.moplaf.gis.osrm.Overview
	 * @generated
	 */
	EEnum getOverview();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GisOsrmFactory getGisOsrmFactory();

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
		 * The meta object literal for the '{@link com.misc.common.moplaf.gis.osrm.impl.GisDistanceMatrixCalculatorOsrmOneToOneImpl <em>Gis Distance Matrix Calculator Osrm One To One</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.gis.osrm.impl.GisDistanceMatrixCalculatorOsrmOneToOneImpl
		 * @see com.misc.common.moplaf.gis.osrm.impl.GisOsrmPackageImpl#getGisDistanceMatrixCalculatorOsrmOneToOne()
		 * @generated
		 */
		EClass GIS_DISTANCE_MATRIX_CALCULATOR_OSRM_ONE_TO_ONE = eINSTANCE.getGisDistanceMatrixCalculatorOsrmOneToOne();
		/**
		 * The meta object literal for the '<em><b>Protocol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GIS_DISTANCE_MATRIX_CALCULATOR_OSRM_ONE_TO_ONE__PROTOCOL = eINSTANCE.getGisDistanceMatrixCalculatorOsrmOneToOne_Protocol();
		/**
		 * The meta object literal for the '<em><b>Host</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GIS_DISTANCE_MATRIX_CALCULATOR_OSRM_ONE_TO_ONE__HOST = eINSTANCE.getGisDistanceMatrixCalculatorOsrmOneToOne_Host();
		/**
		 * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GIS_DISTANCE_MATRIX_CALCULATOR_OSRM_ONE_TO_ONE__PORT = eINSTANCE.getGisDistanceMatrixCalculatorOsrmOneToOne_Port();
		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GIS_DISTANCE_MATRIX_CALCULATOR_OSRM_ONE_TO_ONE__PATH = eINSTANCE.getGisDistanceMatrixCalculatorOsrmOneToOne_Path();
		/**
		 * The meta object literal for the '<em><b>Profile</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GIS_DISTANCE_MATRIX_CALCULATOR_OSRM_ONE_TO_ONE__PROFILE = eINSTANCE.getGisDistanceMatrixCalculatorOsrmOneToOne_Profile();
		/**
		 * The meta object literal for the '<em><b>Overview</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GIS_DISTANCE_MATRIX_CALCULATOR_OSRM_ONE_TO_ONE__OVERVIEW = eINSTANCE.getGisDistanceMatrixCalculatorOsrmOneToOne_Overview();
		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.gis.osrm.impl.GisDistanceMatrixCalculatorOsrmManyToManyImpl <em>Gis Distance Matrix Calculator Osrm Many To Many</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.gis.osrm.impl.GisDistanceMatrixCalculatorOsrmManyToManyImpl
		 * @see com.misc.common.moplaf.gis.osrm.impl.GisOsrmPackageImpl#getGisDistanceMatrixCalculatorOsrmManyToMany()
		 * @generated
		 */
		EClass GIS_DISTANCE_MATRIX_CALCULATOR_OSRM_MANY_TO_MANY = eINSTANCE.getGisDistanceMatrixCalculatorOsrmManyToMany();
		/**
		 * The meta object literal for the '<em><b>Protocol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GIS_DISTANCE_MATRIX_CALCULATOR_OSRM_MANY_TO_MANY__PROTOCOL = eINSTANCE.getGisDistanceMatrixCalculatorOsrmManyToMany_Protocol();
		/**
		 * The meta object literal for the '<em><b>Host</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GIS_DISTANCE_MATRIX_CALCULATOR_OSRM_MANY_TO_MANY__HOST = eINSTANCE.getGisDistanceMatrixCalculatorOsrmManyToMany_Host();
		/**
		 * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GIS_DISTANCE_MATRIX_CALCULATOR_OSRM_MANY_TO_MANY__PORT = eINSTANCE.getGisDistanceMatrixCalculatorOsrmManyToMany_Port();
		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GIS_DISTANCE_MATRIX_CALCULATOR_OSRM_MANY_TO_MANY__PATH = eINSTANCE.getGisDistanceMatrixCalculatorOsrmManyToMany_Path();
		/**
		 * The meta object literal for the '<em><b>Profile</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GIS_DISTANCE_MATRIX_CALCULATOR_OSRM_MANY_TO_MANY__PROFILE = eINSTANCE.getGisDistanceMatrixCalculatorOsrmManyToMany_Profile();
		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.gis.osrm.impl.GisPinpointerOsrmNearestImpl <em>Gis Pinpointer Osrm Nearest</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.gis.osrm.impl.GisPinpointerOsrmNearestImpl
		 * @see com.misc.common.moplaf.gis.osrm.impl.GisOsrmPackageImpl#getGisPinpointerOsrmNearest()
		 * @generated
		 */
		EClass GIS_PINPOINTER_OSRM_NEAREST = eINSTANCE.getGisPinpointerOsrmNearest();
		/**
		 * The meta object literal for the '<em><b>Protocol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GIS_PINPOINTER_OSRM_NEAREST__PROTOCOL = eINSTANCE.getGisPinpointerOsrmNearest_Protocol();
		/**
		 * The meta object literal for the '<em><b>Host</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GIS_PINPOINTER_OSRM_NEAREST__HOST = eINSTANCE.getGisPinpointerOsrmNearest_Host();
		/**
		 * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GIS_PINPOINTER_OSRM_NEAREST__PORT = eINSTANCE.getGisPinpointerOsrmNearest_Port();
		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GIS_PINPOINTER_OSRM_NEAREST__PATH = eINSTANCE.getGisPinpointerOsrmNearest_Path();
		/**
		 * The meta object literal for the '<em><b>Profile</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GIS_PINPOINTER_OSRM_NEAREST__PROFILE = eINSTANCE.getGisPinpointerOsrmNearest_Profile();
		/**
		 * The meta object literal for the '<em><b>Max Pinpoints</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GIS_PINPOINTER_OSRM_NEAREST__MAX_PINPOINTS = eINSTANCE.getGisPinpointerOsrmNearest_MaxPinpoints();
		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.gis.osrm.Protocol <em>Protocol</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.gis.osrm.Protocol
		 * @see com.misc.common.moplaf.gis.osrm.impl.GisOsrmPackageImpl#getProtocol()
		 * @generated
		 */
		EEnum PROTOCOL = eINSTANCE.getProtocol();
		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.gis.osrm.Overview <em>Overview</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.gis.osrm.Overview
		 * @see com.misc.common.moplaf.gis.osrm.impl.GisOsrmPackageImpl#getOverview()
		 * @generated
		 */
		EEnum OVERVIEW = eINSTANCE.getOverview();

	}

} //GisOsrmPackage
