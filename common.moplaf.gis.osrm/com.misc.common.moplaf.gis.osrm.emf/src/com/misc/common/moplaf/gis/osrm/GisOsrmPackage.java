/**
 */
package com.misc.common.moplaf.gis.osrm;

import com.misc.common.moplaf.gis.GisPackage;

import org.eclipse.emf.ecore.EClass;
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
	 * The number of structural features of the '<em>Gis Distance Matrix Calculator Osrm One To One</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_DISTANCE_MATRIX_CALCULATOR_OSRM_ONE_TO_ONE_FEATURE_COUNT = GisPackage.GIS_ROUTE_CALCULATOR_ONE_TO_ONE_FEATURE_COUNT + 0;

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
	 * Returns the meta object for class '{@link com.misc.common.moplaf.gis.osrm.GisDistanceMatrixCalculatorOsrmOneToOne <em>Gis Distance Matrix Calculator Osrm One To One</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gis Distance Matrix Calculator Osrm One To One</em>'.
	 * @see com.misc.common.moplaf.gis.osrm.GisDistanceMatrixCalculatorOsrmOneToOne
	 * @generated
	 */
	EClass getGisDistanceMatrixCalculatorOsrmOneToOne();

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

	}

} //GisOsrmPackage
