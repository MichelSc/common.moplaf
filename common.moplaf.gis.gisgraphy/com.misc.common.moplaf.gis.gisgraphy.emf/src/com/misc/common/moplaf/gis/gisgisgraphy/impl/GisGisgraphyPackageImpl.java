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
package com.misc.common.moplaf.gis.gisgisgraphy.impl;

import com.misc.common.moplaf.gis.GisPackage;

import com.misc.common.moplaf.gis.gisgisgraphy.GisAddressGeocoderGisgraphy;
import com.misc.common.moplaf.gis.gisgisgraphy.GisGisgraphyFactory;
import com.misc.common.moplaf.gis.gisgisgraphy.GisGisgraphyPackage;
import com.misc.common.moplaf.gis.gisgisgraphy.Protocol;

import com.misc.common.moplaf.job.JobPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GisGisgraphyPackageImpl extends EPackageImpl implements GisGisgraphyPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gisAddressGeocoderGisgraphyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum protocolEEnum = null;

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
	 * @see com.misc.common.moplaf.gis.gisgisgraphy.GisGisgraphyPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GisGisgraphyPackageImpl() {
		super(eNS_URI, GisGisgraphyFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link GisGisgraphyPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GisGisgraphyPackage init() {
		if (isInited) return (GisGisgraphyPackage)EPackage.Registry.INSTANCE.getEPackage(GisGisgraphyPackage.eNS_URI);

		// Obtain or create and register package
		GisGisgraphyPackageImpl theGisGisgraphyPackage = (GisGisgraphyPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof GisGisgraphyPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new GisGisgraphyPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		GisPackage.eINSTANCE.eClass();
		JobPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theGisGisgraphyPackage.createPackageContents();

		// Initialize created meta-data
		theGisGisgraphyPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGisGisgraphyPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GisGisgraphyPackage.eNS_URI, theGisGisgraphyPackage);
		return theGisGisgraphyPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGisAddressGeocoderGisgraphy() {
		return gisAddressGeocoderGisgraphyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGisAddressGeocoderGisgraphy_Protocol() {
		return (EAttribute)gisAddressGeocoderGisgraphyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGisAddressGeocoderGisgraphy_Host() {
		return (EAttribute)gisAddressGeocoderGisgraphyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGisAddressGeocoderGisgraphy_Port() {
		return (EAttribute)gisAddressGeocoderGisgraphyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGisAddressGeocoderGisgraphy_Path() {
		return (EAttribute)gisAddressGeocoderGisgraphyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getProtocol() {
		return protocolEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GisGisgraphyFactory getGisGisgraphyFactory() {
		return (GisGisgraphyFactory)getEFactoryInstance();
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
		gisAddressGeocoderGisgraphyEClass = createEClass(GIS_ADDRESS_GEOCODER_GISGRAPHY);
		createEAttribute(gisAddressGeocoderGisgraphyEClass, GIS_ADDRESS_GEOCODER_GISGRAPHY__PROTOCOL);
		createEAttribute(gisAddressGeocoderGisgraphyEClass, GIS_ADDRESS_GEOCODER_GISGRAPHY__HOST);
		createEAttribute(gisAddressGeocoderGisgraphyEClass, GIS_ADDRESS_GEOCODER_GISGRAPHY__PORT);
		createEAttribute(gisAddressGeocoderGisgraphyEClass, GIS_ADDRESS_GEOCODER_GISGRAPHY__PATH);

		// Create enums
		protocolEEnum = createEEnum(PROTOCOL);
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
		GisPackage theGisPackage = (GisPackage)EPackage.Registry.INSTANCE.getEPackage(GisPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		gisAddressGeocoderGisgraphyEClass.getESuperTypes().add(theGisPackage.getGisAddressGeocoder());

		// Initialize classes, features, and operations; add parameters
		initEClass(gisAddressGeocoderGisgraphyEClass, GisAddressGeocoderGisgraphy.class, "GisAddressGeocoderGisgraphy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGisAddressGeocoderGisgraphy_Protocol(), this.getProtocol(), "Protocol", "http", 0, 1, GisAddressGeocoderGisgraphy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGisAddressGeocoderGisgraphy_Host(), ecorePackage.getEString(), "Host", "services.gisgraphy.com", 0, 1, GisAddressGeocoderGisgraphy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGisAddressGeocoderGisgraphy_Port(), ecorePackage.getEInt(), "Port", "80", 0, 1, GisAddressGeocoderGisgraphy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGisAddressGeocoderGisgraphy_Path(), ecorePackage.getEString(), "Path", "/geocoding/geocode", 0, 1, GisAddressGeocoderGisgraphy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(protocolEEnum, Protocol.class, "Protocol");
		addEEnumLiteral(protocolEEnum, Protocol.HTTP);
		addEEnumLiteral(protocolEEnum, Protocol.HTTPS);

		// Create resource
		createResource(eNS_URI);
	}

} //GisGisgraphyPackageImpl
