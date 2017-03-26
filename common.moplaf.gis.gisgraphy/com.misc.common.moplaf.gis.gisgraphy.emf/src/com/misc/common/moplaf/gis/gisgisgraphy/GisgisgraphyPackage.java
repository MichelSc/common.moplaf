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
package com.misc.common.moplaf.gis.gisgisgraphy;

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
 * @see com.misc.common.moplaf.gis.gisgisgraphy.GisgisgraphyFactory
 * @model kind="package"
 * @generated
 */
public interface GisgisgraphyPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "gisgisgraphy";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.misc.com/common.moplaf.gisgisgraphy.emf";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "gsgr";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GisgisgraphyPackage eINSTANCE = com.misc.common.moplaf.gis.gisgisgraphy.impl.GisgisgraphyPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.gis.gisgisgraphy.impl.GisAddressGeocoderGisgraphyImpl <em>Gis Address Geocoder Gisgraphy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.gis.gisgisgraphy.impl.GisAddressGeocoderGisgraphyImpl
	 * @see com.misc.common.moplaf.gis.gisgisgraphy.impl.GisgisgraphyPackageImpl#getGisAddressGeocoderGisgraphy()
	 * @generated
	 */
	int GIS_ADDRESS_GEOCODER_GISGRAPHY = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ADDRESS_GEOCODER_GISGRAPHY__NAME = GisPackage.GIS_ADDRESS_GEOCODER__NAME;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ADDRESS_GEOCODER_GISGRAPHY__PROTOCOL = GisPackage.GIS_ADDRESS_GEOCODER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ADDRESS_GEOCODER_GISGRAPHY__HOST = GisPackage.GIS_ADDRESS_GEOCODER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ADDRESS_GEOCODER_GISGRAPHY__PORT = GisPackage.GIS_ADDRESS_GEOCODER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ADDRESS_GEOCODER_GISGRAPHY__PATH = GisPackage.GIS_ADDRESS_GEOCODER_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Gis Address Geocoder Gisgraphy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ADDRESS_GEOCODER_GISGRAPHY_FEATURE_COUNT = GisPackage.GIS_ADDRESS_GEOCODER_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Geocode</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ADDRESS_GEOCODER_GISGRAPHY___GEOCODE__GISADDRESS = GisPackage.GIS_ADDRESS_GEOCODER___GEOCODE__GISADDRESS;

	/**
	 * The number of operations of the '<em>Gis Address Geocoder Gisgraphy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIS_ADDRESS_GEOCODER_GISGRAPHY_OPERATION_COUNT = GisPackage.GIS_ADDRESS_GEOCODER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.gis.gisgisgraphy.Protocol <em>Protocol</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.gis.gisgisgraphy.Protocol
	 * @see com.misc.common.moplaf.gis.gisgisgraphy.impl.GisgisgraphyPackageImpl#getProtocol()
	 * @generated
	 */
	int PROTOCOL = 1;


	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.gis.gisgisgraphy.GisAddressGeocoderGisgraphy <em>Gis Address Geocoder Gisgraphy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gis Address Geocoder Gisgraphy</em>'.
	 * @see com.misc.common.moplaf.gis.gisgisgraphy.GisAddressGeocoderGisgraphy
	 * @generated
	 */
	EClass getGisAddressGeocoderGisgraphy();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.gis.gisgisgraphy.GisAddressGeocoderGisgraphy#getProtocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Protocol</em>'.
	 * @see com.misc.common.moplaf.gis.gisgisgraphy.GisAddressGeocoderGisgraphy#getProtocol()
	 * @see #getGisAddressGeocoderGisgraphy()
	 * @generated
	 */
	EAttribute getGisAddressGeocoderGisgraphy_Protocol();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.gis.gisgisgraphy.GisAddressGeocoderGisgraphy#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see com.misc.common.moplaf.gis.gisgisgraphy.GisAddressGeocoderGisgraphy#getPort()
	 * @see #getGisAddressGeocoderGisgraphy()
	 * @generated
	 */
	EAttribute getGisAddressGeocoderGisgraphy_Port();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.gis.gisgisgraphy.GisAddressGeocoderGisgraphy#getHost <em>Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host</em>'.
	 * @see com.misc.common.moplaf.gis.gisgisgraphy.GisAddressGeocoderGisgraphy#getHost()
	 * @see #getGisAddressGeocoderGisgraphy()
	 * @generated
	 */
	EAttribute getGisAddressGeocoderGisgraphy_Host();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.gis.gisgisgraphy.GisAddressGeocoderGisgraphy#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see com.misc.common.moplaf.gis.gisgisgraphy.GisAddressGeocoderGisgraphy#getPath()
	 * @see #getGisAddressGeocoderGisgraphy()
	 * @generated
	 */
	EAttribute getGisAddressGeocoderGisgraphy_Path();

	/**
	 * Returns the meta object for enum '{@link com.misc.common.moplaf.gis.gisgisgraphy.Protocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Protocol</em>'.
	 * @see com.misc.common.moplaf.gis.gisgisgraphy.Protocol
	 * @generated
	 */
	EEnum getProtocol();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GisgisgraphyFactory getGisgisgraphyFactory();

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
		 * The meta object literal for the '{@link com.misc.common.moplaf.gis.gisgisgraphy.impl.GisAddressGeocoderGisgraphyImpl <em>Gis Address Geocoder Gisgraphy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.gis.gisgisgraphy.impl.GisAddressGeocoderGisgraphyImpl
		 * @see com.misc.common.moplaf.gis.gisgisgraphy.impl.GisgisgraphyPackageImpl#getGisAddressGeocoderGisgraphy()
		 * @generated
		 */
		EClass GIS_ADDRESS_GEOCODER_GISGRAPHY = eINSTANCE.getGisAddressGeocoderGisgraphy();

		/**
		 * The meta object literal for the '<em><b>Protocol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GIS_ADDRESS_GEOCODER_GISGRAPHY__PROTOCOL = eINSTANCE.getGisAddressGeocoderGisgraphy_Protocol();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GIS_ADDRESS_GEOCODER_GISGRAPHY__PORT = eINSTANCE.getGisAddressGeocoderGisgraphy_Port();

		/**
		 * The meta object literal for the '<em><b>Host</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GIS_ADDRESS_GEOCODER_GISGRAPHY__HOST = eINSTANCE.getGisAddressGeocoderGisgraphy_Host();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GIS_ADDRESS_GEOCODER_GISGRAPHY__PATH = eINSTANCE.getGisAddressGeocoderGisgraphy_Path();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.gis.gisgisgraphy.Protocol <em>Protocol</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.gis.gisgisgraphy.Protocol
		 * @see com.misc.common.moplaf.gis.gisgisgraphy.impl.GisgisgraphyPackageImpl#getProtocol()
		 * @generated
		 */
		EEnum PROTOCOL = eINSTANCE.getProtocol();

	}

} //GisgisgraphyPackage
