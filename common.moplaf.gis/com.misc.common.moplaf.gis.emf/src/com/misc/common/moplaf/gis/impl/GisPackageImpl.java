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
package com.misc.common.moplaf.gis.impl;

import com.misc.common.moplaf.gis.GisAddress;
import com.misc.common.moplaf.gis.GisAddressGeocoded;
import com.misc.common.moplaf.gis.GisAddressGeocoder;
import com.misc.common.moplaf.gis.GisAddressStructured;
import com.misc.common.moplaf.gis.GisAddressUnstructured;
import com.misc.common.moplaf.gis.GisCoordinates;
import com.misc.common.moplaf.gis.GisCoordinatesAbstract;
import com.misc.common.moplaf.gis.GisFactory;
import com.misc.common.moplaf.gis.GisGeometry;
import com.misc.common.moplaf.gis.GisLocation;
import com.misc.common.moplaf.gis.GisLocationPinpointed;
import com.misc.common.moplaf.gis.GisLocationPinpointer;
import com.misc.common.moplaf.gis.GisLocationTool;
import com.misc.common.moplaf.gis.GisPackage;
import com.misc.common.moplaf.gis.GisRouteCalculator;
import com.misc.common.moplaf.gis.GisRouteCalculatorManyToMany;
import com.misc.common.moplaf.gis.GisRouteCalculatorOneToMany;
import com.misc.common.moplaf.gis.GisRouteCalculatorOneToOne;
import com.misc.common.moplaf.gis.GisRouteInfo;
import com.misc.common.moplaf.gis.GisRouter;
import com.misc.common.moplaf.gis.GisRouterDefaulted;
import com.misc.common.moplaf.gis.GisRouterGeodesic;
import com.misc.common.moplaf.gis.GisRoutesHolder;
import com.misc.common.moplaf.gis.GisRoutesHolderElement;
import com.misc.common.moplaf.gis.GisRoutesHolderFromLocation;
import com.misc.common.moplaf.gis.GisRoutesHolderToLocation;
import com.misc.common.moplaf.gis.GisRoutesHolderWaypoint;
import com.misc.common.moplaf.gis.GisToolLocation;
import com.misc.common.moplaf.job.JobPackage;
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
public class GisPackageImpl extends EPackageImpl implements GisPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gisCoordinatesAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gisCoordinatesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gisGeometryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gisLocationPinpointedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gisLocationPinpointerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gisToolLocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gisLocationToolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gisAddressEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gisRoutesHolderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gisRoutesHolderWaypointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gisRoutesHolderFromLocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gisRoutesHolderToLocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gisRoutesHolderElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gisRouteInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gisAddressGeocodedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gisLocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gisAddressGeocoderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gisRouteCalculatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gisAddressStructuredEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gisAddressUnstructuredEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gisRouterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gisRouteCalculatorOneToOneEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gisRouteCalculatorManyToManyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gisRouteCalculatorOneToManyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gisRouterGeodesicEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gisRouterDefaultedEClass = null;

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
	 * @see com.misc.common.moplaf.gis.GisPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GisPackageImpl() {
		super(eNS_URI, GisFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link GisPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GisPackage init() {
		if (isInited) return (GisPackage)EPackage.Registry.INSTANCE.getEPackage(GisPackage.eNS_URI);

		// Obtain or create and register package
		GisPackageImpl theGisPackage = (GisPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof GisPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new GisPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		JobPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theGisPackage.createPackageContents();

		// Initialize created meta-data
		theGisPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGisPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GisPackage.eNS_URI, theGisPackage);
		return theGisPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGisCoordinatesAbstract() {
		return gisCoordinatesAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGisCoordinatesAbstract_Longitude() {
		return (EAttribute)gisCoordinatesAbstractEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGisCoordinatesAbstract_Latitude() {
		return (EAttribute)gisCoordinatesAbstractEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGisCoordinates() {
		return gisCoordinatesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGisCoordinates_Name() {
		return (EAttribute)gisCoordinatesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGisGeometry() {
		return gisGeometryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGisLocationPinpointed() {
		return gisLocationPinpointedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGisLocationPinpointed_Distance() {
		return (EAttribute)gisLocationPinpointedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGisLocationPinpointed_LocationPinpointed() {
		return (EAttribute)gisLocationPinpointedEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGisLocationPinpointer() {
		return gisLocationPinpointerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGisToolLocation() {
		return gisToolLocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGisToolLocation_Name() {
		return (EAttribute)gisToolLocationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGisToolLocation__Handle__GisLocationTool() {
		return gisToolLocationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGisToolLocation__ConstructLocationTool() {
		return gisToolLocationEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGisLocationTool() {
		return gisLocationToolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGisLocationTool_Description() {
		return (EAttribute)gisLocationToolEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGisLocationTool_Tool() {
		return (EReference)gisLocationToolEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGisLocationTool_Location() {
		return (EReference)gisLocationToolEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGisLocationTool_Results() {
		return (EReference)gisLocationToolEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGisLocationTool_LastHandlingFeedback() {
		return (EAttribute)gisLocationToolEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGisLocationTool_DoToolFeedback() {
		return (EAttribute)gisLocationToolEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGisLocationTool__DoTool() {
		return gisLocationToolEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGisLocationTool__FlushResults() {
		return gisLocationToolEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGisAddress() {
		return gisAddressEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGisAddress_CountryCode() {
		return (EAttribute)gisAddressEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGisAddress_GeocodedSelected() {
		return (EReference)gisAddressEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGisAddress_Name() {
		return (EAttribute)gisAddressEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGisRoutesHolder() {
		return gisRoutesHolderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGisRoutesHolder_FromLocations() {
		return (EReference)gisRoutesHolderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGisRoutesHolder_ToLocations() {
		return (EReference)gisRoutesHolderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGisRoutesHolder_Symmetrical() {
		return (EAttribute)gisRoutesHolderEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGisRoutesHolder_Calculator() {
		return (EReference)gisRoutesHolderEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGisRoutesHolder_RefreshFeedback() {
		return (EAttribute)gisRoutesHolderEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGisRoutesHolder__Update__GisRouteCalculator() {
		return gisRoutesHolderEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGisRoutesHolder__Update__GisRouteCalculator_EList_EList() {
		return gisRoutesHolderEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGisRoutesHolder__AddFromLocation__GisLocation() {
		return gisRoutesHolderEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGisRoutesHolder__AddToLocation__GisLocation() {
		return gisRoutesHolderEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGisRoutesHolder__GetFromLocation__GisLocation() {
		return gisRoutesHolderEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGisRoutesHolder__GetToLocation__GisLocation() {
		return gisRoutesHolderEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGisRoutesHolder__Refresh() {
		return gisRoutesHolderEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGisRoutesHolder__Flush() {
		return gisRoutesHolderEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGisRoutesHolder__Clear() {
		return gisRoutesHolderEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGisRoutesHolderWaypoint() {
		return gisRoutesHolderWaypointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGisRoutesHolderWaypoint_Location() {
		return (EReference)gisRoutesHolderWaypointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGisRoutesHolderWaypoint_Description() {
		return (EAttribute)gisRoutesHolderWaypointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGisRoutesHolderFromLocation() {
		return gisRoutesHolderFromLocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGisRoutesHolderFromLocation_ToLocations() {
		return (EReference)gisRoutesHolderFromLocationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGisRoutesHolderFromLocation_RoutesHolder() {
		return (EReference)gisRoutesHolderFromLocationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGisRoutesHolderFromLocation__GetElement__GisLocation() {
		return gisRoutesHolderFromLocationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGisRoutesHolderFromLocation__AddElement__GisRoutesHolderToLocation() {
		return gisRoutesHolderFromLocationEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGisRoutesHolderFromLocation__Update__GisRouteCalculator() {
		return gisRoutesHolderFromLocationEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGisRoutesHolderFromLocation__Refresh() {
		return gisRoutesHolderFromLocationEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGisRoutesHolderFromLocation__Remove() {
		return gisRoutesHolderFromLocationEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGisRoutesHolderToLocation() {
		return gisRoutesHolderToLocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGisRoutesHolderToLocation_FromLocations() {
		return (EReference)gisRoutesHolderToLocationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGisRoutesHolderToLocation_RoutesHolder() {
		return (EReference)gisRoutesHolderToLocationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGisRoutesHolderToLocation__GetElement__GisLocation() {
		return gisRoutesHolderToLocationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGisRoutesHolderToLocation__AddElement__GisRoutesHolderFromLocation() {
		return gisRoutesHolderToLocationEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGisRoutesHolderToLocation__Update__GisRouteCalculator() {
		return gisRoutesHolderToLocationEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGisRoutesHolderToLocation__Refresh() {
		return gisRoutesHolderToLocationEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGisRoutesHolderToLocation__Remove() {
		return gisRoutesHolderToLocationEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGisRoutesHolderElement() {
		return gisRoutesHolderElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGisRoutesHolderElement_Description() {
		return (EAttribute)gisRoutesHolderElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGisRoutesHolderElement_ToLocation() {
		return (EReference)gisRoutesHolderElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGisRoutesHolderElement_FromLocation() {
		return (EReference)gisRoutesHolderElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGisRoutesHolderElement_RoutesInfo() {
		return (EReference)gisRoutesHolderElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGisRoutesHolderElement_Calculated() {
		return (EAttribute)gisRoutesHolderElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGisRoutesHolderElement__Update__GisRouteCalculator() {
		return gisRoutesHolderElementEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGisRoutesHolderElement__Refresh() {
		return gisRoutesHolderElementEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGisRoutesHolderElement__Remove() {
		return gisRoutesHolderElementEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGisRouteInfo() {
		return gisRouteInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGisRouteInfo_Description() {
		return (EAttribute)gisRouteInfoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGisRouteInfo_FromLocation() {
		return (EReference)gisRouteInfoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGisRouteInfo_Distance() {
		return (EAttribute)gisRouteInfoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGisRouteInfo_Duration() {
		return (EAttribute)gisRouteInfoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGisRouteInfo_ToLocation() {
		return (EReference)gisRouteInfoEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGisRouteInfo_WithGeometry() {
		return (EAttribute)gisRouteInfoEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGisRouteInfo_Geometry() {
		return (EReference)gisRouteInfoEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGisAddressGeocoded() {
		return gisAddressGeocodedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGisAddressGeocoded_Score() {
		return (EAttribute)gisAddressGeocodedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGisAddressGeocoded_AddressGeocoded() {
		return (EAttribute)gisAddressGeocodedEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGisLocation() {
		return gisLocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGisLocation_Description() {
		return (EAttribute)gisLocationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGisLocation_Geocoded() {
		return (EAttribute)gisLocationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGisLocation_Tools() {
		return (EReference)gisLocationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGisLocation__GetCoordinates() {
		return gisLocationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGisLocation__AddTool__GisToolLocation() {
		return gisLocationEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGisLocation__GetAddToolFeedback__GisToolLocation() {
		return gisLocationEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGisAddressGeocoder() {
		return gisAddressGeocoderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGisRouteCalculator() {
		return gisRouteCalculatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGisAddressStructured() {
		return gisAddressStructuredEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGisAddressStructured_Country() {
		return (EAttribute)gisAddressStructuredEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGisAddressStructured_AdministrativeArea() {
		return (EAttribute)gisAddressStructuredEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGisAddressStructured_PostalCode() {
		return (EAttribute)gisAddressStructuredEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGisAddressStructured_Locality() {
		return (EAttribute)gisAddressStructuredEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGisAddressStructured_Street() {
		return (EAttribute)gisAddressStructuredEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGisAddressStructured_BuildingNumber() {
		return (EAttribute)gisAddressStructuredEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGisAddressUnstructured() {
		return gisAddressUnstructuredEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGisAddressUnstructured_Address() {
		return (EAttribute)gisAddressUnstructuredEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGisRouter() {
		return gisRouterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGisRouter_Name() {
		return (EAttribute)gisRouterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGisRouter_Description() {
		return (EAttribute)gisRouterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGisRouter__GetRoute__GisLocation_GisLocation() {
		return gisRouterEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGisRouter__GetRoutes__EList_EList() {
		return gisRouterEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGisRouteCalculatorOneToOne() {
		return gisRouteCalculatorOneToOneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGisRouteCalculatorManyToMany() {
		return gisRouteCalculatorManyToManyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGisRouteCalculatorOneToMany() {
		return gisRouteCalculatorOneToManyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGisRouterGeodesic() {
		return gisRouterGeodesicEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGisRouterGeodesic_Speed() {
		return (EAttribute)gisRouterGeodesicEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGisRouterGeodesic_Correction() {
		return (EAttribute)gisRouterGeodesicEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGisRouterDefaulted() {
		return gisRouterDefaultedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGisRouterDefaulted_PrimaryRouter() {
		return (EReference)gisRouterDefaultedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGisRouterDefaulted_SecondaryRouter() {
		return (EReference)gisRouterDefaultedEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GisFactory getGisFactory() {
		return (GisFactory)getEFactoryInstance();
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
		gisLocationEClass = createEClass(GIS_LOCATION);
		createEAttribute(gisLocationEClass, GIS_LOCATION__DESCRIPTION);
		createEAttribute(gisLocationEClass, GIS_LOCATION__GEOCODED);
		createEReference(gisLocationEClass, GIS_LOCATION__TOOLS);
		createEOperation(gisLocationEClass, GIS_LOCATION___GET_COORDINATES);
		createEOperation(gisLocationEClass, GIS_LOCATION___ADD_TOOL__GISTOOLLOCATION);
		createEOperation(gisLocationEClass, GIS_LOCATION___GET_ADD_TOOL_FEEDBACK__GISTOOLLOCATION);

		gisLocationToolEClass = createEClass(GIS_LOCATION_TOOL);
		createEAttribute(gisLocationToolEClass, GIS_LOCATION_TOOL__DESCRIPTION);
		createEAttribute(gisLocationToolEClass, GIS_LOCATION_TOOL__DO_TOOL_FEEDBACK);
		createEAttribute(gisLocationToolEClass, GIS_LOCATION_TOOL__LAST_HANDLING_FEEDBACK);
		createEReference(gisLocationToolEClass, GIS_LOCATION_TOOL__TOOL);
		createEReference(gisLocationToolEClass, GIS_LOCATION_TOOL__LOCATION);
		createEReference(gisLocationToolEClass, GIS_LOCATION_TOOL__RESULTS);
		createEOperation(gisLocationToolEClass, GIS_LOCATION_TOOL___DO_TOOL);
		createEOperation(gisLocationToolEClass, GIS_LOCATION_TOOL___FLUSH_RESULTS);

		gisToolLocationEClass = createEClass(GIS_TOOL_LOCATION);
		createEAttribute(gisToolLocationEClass, GIS_TOOL_LOCATION__NAME);
		createEOperation(gisToolLocationEClass, GIS_TOOL_LOCATION___HANDLE__GISLOCATIONTOOL);
		createEOperation(gisToolLocationEClass, GIS_TOOL_LOCATION___CONSTRUCT_LOCATION_TOOL);

		gisCoordinatesAbstractEClass = createEClass(GIS_COORDINATES_ABSTRACT);
		createEAttribute(gisCoordinatesAbstractEClass, GIS_COORDINATES_ABSTRACT__LONGITUDE);
		createEAttribute(gisCoordinatesAbstractEClass, GIS_COORDINATES_ABSTRACT__LATITUDE);

		gisCoordinatesEClass = createEClass(GIS_COORDINATES);
		createEAttribute(gisCoordinatesEClass, GIS_COORDINATES__NAME);

		gisAddressEClass = createEClass(GIS_ADDRESS);
		createEAttribute(gisAddressEClass, GIS_ADDRESS__NAME);
		createEAttribute(gisAddressEClass, GIS_ADDRESS__COUNTRY_CODE);
		createEReference(gisAddressEClass, GIS_ADDRESS__GEOCODED_SELECTED);

		gisAddressStructuredEClass = createEClass(GIS_ADDRESS_STRUCTURED);
		createEAttribute(gisAddressStructuredEClass, GIS_ADDRESS_STRUCTURED__COUNTRY);
		createEAttribute(gisAddressStructuredEClass, GIS_ADDRESS_STRUCTURED__ADMINISTRATIVE_AREA);
		createEAttribute(gisAddressStructuredEClass, GIS_ADDRESS_STRUCTURED__LOCALITY);
		createEAttribute(gisAddressStructuredEClass, GIS_ADDRESS_STRUCTURED__POSTAL_CODE);
		createEAttribute(gisAddressStructuredEClass, GIS_ADDRESS_STRUCTURED__STREET);
		createEAttribute(gisAddressStructuredEClass, GIS_ADDRESS_STRUCTURED__BUILDING_NUMBER);

		gisAddressUnstructuredEClass = createEClass(GIS_ADDRESS_UNSTRUCTURED);
		createEAttribute(gisAddressUnstructuredEClass, GIS_ADDRESS_UNSTRUCTURED__ADDRESS);

		gisAddressGeocodedEClass = createEClass(GIS_ADDRESS_GEOCODED);
		createEAttribute(gisAddressGeocodedEClass, GIS_ADDRESS_GEOCODED__SCORE);
		createEAttribute(gisAddressGeocodedEClass, GIS_ADDRESS_GEOCODED__ADDRESS_GEOCODED);

		gisAddressGeocoderEClass = createEClass(GIS_ADDRESS_GEOCODER);

		gisRoutesHolderWaypointEClass = createEClass(GIS_ROUTES_HOLDER_WAYPOINT);
		createEReference(gisRoutesHolderWaypointEClass, GIS_ROUTES_HOLDER_WAYPOINT__LOCATION);
		createEAttribute(gisRoutesHolderWaypointEClass, GIS_ROUTES_HOLDER_WAYPOINT__DESCRIPTION);

		gisRoutesHolderEClass = createEClass(GIS_ROUTES_HOLDER);
		createEReference(gisRoutesHolderEClass, GIS_ROUTES_HOLDER__FROM_LOCATIONS);
		createEReference(gisRoutesHolderEClass, GIS_ROUTES_HOLDER__TO_LOCATIONS);
		createEAttribute(gisRoutesHolderEClass, GIS_ROUTES_HOLDER__SYMMETRICAL);
		createEReference(gisRoutesHolderEClass, GIS_ROUTES_HOLDER__CALCULATOR);
		createEAttribute(gisRoutesHolderEClass, GIS_ROUTES_HOLDER__REFRESH_FEEDBACK);
		createEOperation(gisRoutesHolderEClass, GIS_ROUTES_HOLDER___UPDATE__GISROUTECALCULATOR);
		createEOperation(gisRoutesHolderEClass, GIS_ROUTES_HOLDER___UPDATE__GISROUTECALCULATOR_ELIST_ELIST);
		createEOperation(gisRoutesHolderEClass, GIS_ROUTES_HOLDER___ADD_FROM_LOCATION__GISLOCATION);
		createEOperation(gisRoutesHolderEClass, GIS_ROUTES_HOLDER___ADD_TO_LOCATION__GISLOCATION);
		createEOperation(gisRoutesHolderEClass, GIS_ROUTES_HOLDER___GET_FROM_LOCATION__GISLOCATION);
		createEOperation(gisRoutesHolderEClass, GIS_ROUTES_HOLDER___GET_TO_LOCATION__GISLOCATION);
		createEOperation(gisRoutesHolderEClass, GIS_ROUTES_HOLDER___REFRESH);
		createEOperation(gisRoutesHolderEClass, GIS_ROUTES_HOLDER___FLUSH);
		createEOperation(gisRoutesHolderEClass, GIS_ROUTES_HOLDER___CLEAR);

		gisRoutesHolderFromLocationEClass = createEClass(GIS_ROUTES_HOLDER_FROM_LOCATION);
		createEReference(gisRoutesHolderFromLocationEClass, GIS_ROUTES_HOLDER_FROM_LOCATION__TO_LOCATIONS);
		createEReference(gisRoutesHolderFromLocationEClass, GIS_ROUTES_HOLDER_FROM_LOCATION__ROUTES_HOLDER);
		createEOperation(gisRoutesHolderFromLocationEClass, GIS_ROUTES_HOLDER_FROM_LOCATION___GET_ELEMENT__GISLOCATION);
		createEOperation(gisRoutesHolderFromLocationEClass, GIS_ROUTES_HOLDER_FROM_LOCATION___ADD_ELEMENT__GISROUTESHOLDERTOLOCATION);
		createEOperation(gisRoutesHolderFromLocationEClass, GIS_ROUTES_HOLDER_FROM_LOCATION___UPDATE__GISROUTECALCULATOR);
		createEOperation(gisRoutesHolderFromLocationEClass, GIS_ROUTES_HOLDER_FROM_LOCATION___REFRESH);
		createEOperation(gisRoutesHolderFromLocationEClass, GIS_ROUTES_HOLDER_FROM_LOCATION___REMOVE);

		gisRoutesHolderToLocationEClass = createEClass(GIS_ROUTES_HOLDER_TO_LOCATION);
		createEReference(gisRoutesHolderToLocationEClass, GIS_ROUTES_HOLDER_TO_LOCATION__FROM_LOCATIONS);
		createEReference(gisRoutesHolderToLocationEClass, GIS_ROUTES_HOLDER_TO_LOCATION__ROUTES_HOLDER);
		createEOperation(gisRoutesHolderToLocationEClass, GIS_ROUTES_HOLDER_TO_LOCATION___GET_ELEMENT__GISLOCATION);
		createEOperation(gisRoutesHolderToLocationEClass, GIS_ROUTES_HOLDER_TO_LOCATION___ADD_ELEMENT__GISROUTESHOLDERFROMLOCATION);
		createEOperation(gisRoutesHolderToLocationEClass, GIS_ROUTES_HOLDER_TO_LOCATION___UPDATE__GISROUTECALCULATOR);
		createEOperation(gisRoutesHolderToLocationEClass, GIS_ROUTES_HOLDER_TO_LOCATION___REFRESH);
		createEOperation(gisRoutesHolderToLocationEClass, GIS_ROUTES_HOLDER_TO_LOCATION___REMOVE);

		gisRoutesHolderElementEClass = createEClass(GIS_ROUTES_HOLDER_ELEMENT);
		createEAttribute(gisRoutesHolderElementEClass, GIS_ROUTES_HOLDER_ELEMENT__DESCRIPTION);
		createEReference(gisRoutesHolderElementEClass, GIS_ROUTES_HOLDER_ELEMENT__TO_LOCATION);
		createEReference(gisRoutesHolderElementEClass, GIS_ROUTES_HOLDER_ELEMENT__FROM_LOCATION);
		createEReference(gisRoutesHolderElementEClass, GIS_ROUTES_HOLDER_ELEMENT__ROUTES_INFO);
		createEAttribute(gisRoutesHolderElementEClass, GIS_ROUTES_HOLDER_ELEMENT__CALCULATED);
		createEOperation(gisRoutesHolderElementEClass, GIS_ROUTES_HOLDER_ELEMENT___UPDATE__GISROUTECALCULATOR);
		createEOperation(gisRoutesHolderElementEClass, GIS_ROUTES_HOLDER_ELEMENT___REFRESH);
		createEOperation(gisRoutesHolderElementEClass, GIS_ROUTES_HOLDER_ELEMENT___REMOVE);

		gisRouteInfoEClass = createEClass(GIS_ROUTE_INFO);
		createEAttribute(gisRouteInfoEClass, GIS_ROUTE_INFO__DESCRIPTION);
		createEReference(gisRouteInfoEClass, GIS_ROUTE_INFO__FROM_LOCATION);
		createEAttribute(gisRouteInfoEClass, GIS_ROUTE_INFO__DISTANCE);
		createEAttribute(gisRouteInfoEClass, GIS_ROUTE_INFO__DURATION);
		createEReference(gisRouteInfoEClass, GIS_ROUTE_INFO__TO_LOCATION);
		createEAttribute(gisRouteInfoEClass, GIS_ROUTE_INFO__WITH_GEOMETRY);
		createEReference(gisRouteInfoEClass, GIS_ROUTE_INFO__GEOMETRY);

		gisRouteCalculatorEClass = createEClass(GIS_ROUTE_CALCULATOR);

		gisRouterEClass = createEClass(GIS_ROUTER);
		createEAttribute(gisRouterEClass, GIS_ROUTER__NAME);
		createEAttribute(gisRouterEClass, GIS_ROUTER__DESCRIPTION);
		createEOperation(gisRouterEClass, GIS_ROUTER___GET_ROUTE__GISLOCATION_GISLOCATION);
		createEOperation(gisRouterEClass, GIS_ROUTER___GET_ROUTES__ELIST_ELIST);

		gisRouteCalculatorOneToOneEClass = createEClass(GIS_ROUTE_CALCULATOR_ONE_TO_ONE);

		gisRouteCalculatorManyToManyEClass = createEClass(GIS_ROUTE_CALCULATOR_MANY_TO_MANY);

		gisRouteCalculatorOneToManyEClass = createEClass(GIS_ROUTE_CALCULATOR_ONE_TO_MANY);

		gisRouterGeodesicEClass = createEClass(GIS_ROUTER_GEODESIC);
		createEAttribute(gisRouterGeodesicEClass, GIS_ROUTER_GEODESIC__SPEED);
		createEAttribute(gisRouterGeodesicEClass, GIS_ROUTER_GEODESIC__CORRECTION);

		gisRouterDefaultedEClass = createEClass(GIS_ROUTER_DEFAULTED);
		createEReference(gisRouterDefaultedEClass, GIS_ROUTER_DEFAULTED__PRIMARY_ROUTER);
		createEReference(gisRouterDefaultedEClass, GIS_ROUTER_DEFAULTED__SECONDARY_ROUTER);

		gisGeometryEClass = createEClass(GIS_GEOMETRY);

		gisLocationPinpointerEClass = createEClass(GIS_LOCATION_PINPOINTER);

		gisLocationPinpointedEClass = createEClass(GIS_LOCATION_PINPOINTED);
		createEAttribute(gisLocationPinpointedEClass, GIS_LOCATION_PINPOINTED__DISTANCE);
		createEAttribute(gisLocationPinpointedEClass, GIS_LOCATION_PINPOINTED__LOCATION_PINPOINTED);
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
		JobPackage theJobPackage = (JobPackage)EPackage.Registry.INSTANCE.getEPackage(JobPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		gisCoordinatesAbstractEClass.getESuperTypes().add(this.getGisLocation());
		gisCoordinatesEClass.getESuperTypes().add(this.getGisCoordinatesAbstract());
		gisAddressEClass.getESuperTypes().add(this.getGisLocation());
		gisAddressStructuredEClass.getESuperTypes().add(this.getGisAddress());
		gisAddressUnstructuredEClass.getESuperTypes().add(this.getGisAddress());
		gisAddressGeocodedEClass.getESuperTypes().add(this.getGisCoordinatesAbstract());
		gisAddressGeocoderEClass.getESuperTypes().add(this.getGisToolLocation());
		gisRoutesHolderEClass.getESuperTypes().add(this.getGisRouter());
		gisRoutesHolderFromLocationEClass.getESuperTypes().add(this.getGisRoutesHolderWaypoint());
		gisRoutesHolderToLocationEClass.getESuperTypes().add(this.getGisRoutesHolderWaypoint());
		gisRouteCalculatorEClass.getESuperTypes().add(this.getGisRouter());
		gisRouteCalculatorOneToOneEClass.getESuperTypes().add(this.getGisRouteCalculator());
		gisRouteCalculatorManyToManyEClass.getESuperTypes().add(this.getGisRouteCalculator());
		gisRouteCalculatorOneToManyEClass.getESuperTypes().add(this.getGisRouteCalculator());
		gisRouterGeodesicEClass.getESuperTypes().add(this.getGisRouteCalculatorOneToOne());
		gisRouterDefaultedEClass.getESuperTypes().add(this.getGisRouter());
		gisGeometryEClass.getESuperTypes().add(this.getGisCoordinatesAbstract());
		gisLocationPinpointerEClass.getESuperTypes().add(this.getGisToolLocation());
		gisLocationPinpointedEClass.getESuperTypes().add(this.getGisCoordinatesAbstract());

		// Initialize classes, features, and operations; add parameters
		initEClass(gisLocationEClass, GisLocation.class, "GisLocation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGisLocation_Description(), ecorePackage.getEString(), "Description", null, 0, 1, GisLocation.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getGisLocation_Geocoded(), ecorePackage.getEBoolean(), "Geocoded", null, 0, 1, GisLocation.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getGisLocation_Tools(), this.getGisLocationTool(), this.getGisLocationTool_Location(), "Tools", null, 0, -1, GisLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getGisLocation__GetCoordinates(), this.getGisCoordinatesAbstract(), "getCoordinates", 0, 1, IS_UNIQUE, IS_ORDERED);

		EOperation op = initEOperation(getGisLocation__AddTool__GisToolLocation(), this.getGisLocationTool(), "addTool", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getGisToolLocation(), "tool", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getGisLocation__GetAddToolFeedback__GisToolLocation(), theJobPackage.getEnabledFeedback(), "getAddToolFeedback", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getGisToolLocation(), "tool", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(gisLocationToolEClass, GisLocationTool.class, "GisLocationTool", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGisLocationTool_Description(), ecorePackage.getEString(), "Description", null, 0, 1, GisLocationTool.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getGisLocationTool_DoToolFeedback(), theJobPackage.getEnabledFeedback(), "DoToolFeedback", null, 0, 1, GisLocationTool.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getGisLocationTool_LastHandlingFeedback(), ecorePackage.getEString(), "LastHandlingFeedback", null, 0, 1, GisLocationTool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGisLocationTool_Tool(), this.getGisToolLocation(), null, "Tool", null, 1, 1, GisLocationTool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGisLocationTool_Location(), this.getGisLocation(), this.getGisLocation_Tools(), "Location", null, 1, 1, GisLocationTool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGisLocationTool_Results(), this.getGisLocation(), null, "Results", null, 0, -1, GisLocationTool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getGisLocationTool__DoTool(), null, "doTool", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getGisLocationTool__FlushResults(), null, "flushResults", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(gisToolLocationEClass, GisToolLocation.class, "GisToolLocation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGisToolLocation_Name(), ecorePackage.getEString(), "Name", null, 0, 1, GisToolLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getGisToolLocation__Handle__GisLocationTool(), null, "handle", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getGisLocationTool(), "location", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getGisToolLocation__ConstructLocationTool(), this.getGisLocationTool(), "constructLocationTool", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(gisCoordinatesAbstractEClass, GisCoordinatesAbstract.class, "GisCoordinatesAbstract", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGisCoordinatesAbstract_Longitude(), ecorePackage.getEDouble(), "Longitude", null, 0, 1, GisCoordinatesAbstract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGisCoordinatesAbstract_Latitude(), ecorePackage.getEDouble(), "Latitude", null, 0, 1, GisCoordinatesAbstract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gisCoordinatesEClass, GisCoordinates.class, "GisCoordinates", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGisCoordinates_Name(), ecorePackage.getEString(), "Name", null, 0, 1, GisCoordinates.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gisAddressEClass, GisAddress.class, "GisAddress", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGisAddress_Name(), ecorePackage.getEString(), "Name", null, 0, 1, GisAddress.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGisAddress_CountryCode(), ecorePackage.getEString(), "CountryCode", null, 0, 1, GisAddress.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGisAddress_GeocodedSelected(), this.getGisAddressGeocoded(), null, "GeocodedSelected", null, 0, 1, GisAddress.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gisAddressStructuredEClass, GisAddressStructured.class, "GisAddressStructured", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGisAddressStructured_Country(), ecorePackage.getEString(), "Country", null, 0, 1, GisAddressStructured.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGisAddressStructured_AdministrativeArea(), ecorePackage.getEString(), "AdministrativeArea", null, 0, 1, GisAddressStructured.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGisAddressStructured_Locality(), ecorePackage.getEString(), "Locality", null, 0, 1, GisAddressStructured.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGisAddressStructured_PostalCode(), ecorePackage.getEString(), "PostalCode", null, 0, 1, GisAddressStructured.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGisAddressStructured_Street(), ecorePackage.getEString(), "Street", null, 0, 1, GisAddressStructured.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGisAddressStructured_BuildingNumber(), ecorePackage.getEString(), "BuildingNumber", null, 0, 1, GisAddressStructured.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gisAddressUnstructuredEClass, GisAddressUnstructured.class, "GisAddressUnstructured", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGisAddressUnstructured_Address(), ecorePackage.getEString(), "Address", null, 0, 1, GisAddressUnstructured.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gisAddressGeocodedEClass, GisAddressGeocoded.class, "GisAddressGeocoded", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGisAddressGeocoded_Score(), ecorePackage.getEFloat(), "Score", null, 0, 1, GisAddressGeocoded.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGisAddressGeocoded_AddressGeocoded(), ecorePackage.getEString(), "AddressGeocoded", null, 0, 1, GisAddressGeocoded.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gisAddressGeocoderEClass, GisAddressGeocoder.class, "GisAddressGeocoder", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(gisRoutesHolderWaypointEClass, GisRoutesHolderWaypoint.class, "GisRoutesHolderWaypoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGisRoutesHolderWaypoint_Location(), this.getGisLocation(), null, "Location", null, 1, 1, GisRoutesHolderWaypoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGisRoutesHolderWaypoint_Description(), ecorePackage.getEString(), "Description", null, 0, 1, GisRoutesHolderWaypoint.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(gisRoutesHolderEClass, GisRoutesHolder.class, "GisRoutesHolder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGisRoutesHolder_FromLocations(), this.getGisRoutesHolderFromLocation(), this.getGisRoutesHolderFromLocation_RoutesHolder(), "FromLocations", null, 0, -1, GisRoutesHolder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGisRoutesHolder_ToLocations(), this.getGisRoutesHolderToLocation(), this.getGisRoutesHolderToLocation_RoutesHolder(), "ToLocations", null, 0, -1, GisRoutesHolder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGisRoutesHolder_Symmetrical(), ecorePackage.getEBooleanObject(), "Symmetrical", null, 0, 1, GisRoutesHolder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGisRoutesHolder_Calculator(), this.getGisRouteCalculator(), null, "Calculator", null, 0, 1, GisRoutesHolder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGisRoutesHolder_RefreshFeedback(), theJobPackage.getEnabledFeedback(), "RefreshFeedback", null, 0, 1, GisRoutesHolder.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		op = initEOperation(getGisRoutesHolder__Update__GisRouteCalculator(), null, "update", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getGisRouteCalculator(), "calculator", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getGisRoutesHolder__Update__GisRouteCalculator_EList_EList(), null, "update", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getGisRouteCalculator(), "calculator", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getGisLocation(), "froms", 1, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getGisLocation(), "tos", 1, -1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getGisRoutesHolder__AddFromLocation__GisLocation(), this.getGisRoutesHolderFromLocation(), "addFromLocation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getGisLocation(), "location", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getGisRoutesHolder__AddToLocation__GisLocation(), this.getGisRoutesHolderToLocation(), "addToLocation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getGisLocation(), "location", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getGisRoutesHolder__GetFromLocation__GisLocation(), this.getGisRoutesHolderFromLocation(), "getFromLocation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getGisLocation(), "location", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getGisRoutesHolder__GetToLocation__GisLocation(), this.getGisRoutesHolderToLocation(), "getToLocation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getGisLocation(), "location", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getGisRoutesHolder__Refresh(), null, "refresh", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getGisRoutesHolder__Flush(), null, "flush", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getGisRoutesHolder__Clear(), null, "clear", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(gisRoutesHolderFromLocationEClass, GisRoutesHolderFromLocation.class, "GisRoutesHolderFromLocation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGisRoutesHolderFromLocation_ToLocations(), this.getGisRoutesHolderElement(), this.getGisRoutesHolderElement_FromLocation(), "ToLocations", null, 0, -1, GisRoutesHolderFromLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGisRoutesHolderFromLocation_RoutesHolder(), this.getGisRoutesHolder(), this.getGisRoutesHolder_FromLocations(), "RoutesHolder", null, 1, 1, GisRoutesHolderFromLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getGisRoutesHolderFromLocation__GetElement__GisLocation(), this.getGisRoutesHolderElement(), "getElement", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getGisLocation(), "toLocation", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getGisRoutesHolderFromLocation__AddElement__GisRoutesHolderToLocation(), this.getGisRoutesHolderElement(), "addElement", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getGisRoutesHolderToLocation(), "toLocation", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getGisRoutesHolderFromLocation__Update__GisRouteCalculator(), null, "update", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getGisRouteCalculator(), "calculator", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getGisRoutesHolderFromLocation__Refresh(), null, "refresh", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getGisRoutesHolderFromLocation__Remove(), null, "remove", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(gisRoutesHolderToLocationEClass, GisRoutesHolderToLocation.class, "GisRoutesHolderToLocation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGisRoutesHolderToLocation_FromLocations(), this.getGisRoutesHolderElement(), this.getGisRoutesHolderElement_ToLocation(), "FromLocations", null, 0, -1, GisRoutesHolderToLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGisRoutesHolderToLocation_RoutesHolder(), this.getGisRoutesHolder(), this.getGisRoutesHolder_ToLocations(), "RoutesHolder", null, 1, 1, GisRoutesHolderToLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getGisRoutesHolderToLocation__GetElement__GisLocation(), this.getGisRoutesHolderElement(), "getElement", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getGisLocation(), "fromLocation", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getGisRoutesHolderToLocation__AddElement__GisRoutesHolderFromLocation(), this.getGisRoutesHolderElement(), "addElement", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getGisRoutesHolderFromLocation(), "fromLocation", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getGisRoutesHolderToLocation__Update__GisRouteCalculator(), null, "update", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getGisRouteCalculator(), "calculator", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getGisRoutesHolderToLocation__Refresh(), null, "refresh", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getGisRoutesHolderToLocation__Remove(), null, "remove", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(gisRoutesHolderElementEClass, GisRoutesHolderElement.class, "GisRoutesHolderElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGisRoutesHolderElement_Description(), ecorePackage.getEString(), "Description", null, 0, 1, GisRoutesHolderElement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getGisRoutesHolderElement_ToLocation(), this.getGisRoutesHolderToLocation(), this.getGisRoutesHolderToLocation_FromLocations(), "ToLocation", null, 1, 1, GisRoutesHolderElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGisRoutesHolderElement_FromLocation(), this.getGisRoutesHolderFromLocation(), this.getGisRoutesHolderFromLocation_ToLocations(), "FromLocation", null, 1, 1, GisRoutesHolderElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGisRoutesHolderElement_RoutesInfo(), this.getGisRouteInfo(), null, "RoutesInfo", null, 0, -1, GisRoutesHolderElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGisRoutesHolderElement_Calculated(), ecorePackage.getEBoolean(), "Calculated", null, 0, 1, GisRoutesHolderElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getGisRoutesHolderElement__Update__GisRouteCalculator(), null, "update", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getGisRouteCalculator(), "calculator", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getGisRoutesHolderElement__Refresh(), null, "refresh", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getGisRoutesHolderElement__Remove(), null, "remove", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(gisRouteInfoEClass, GisRouteInfo.class, "GisRouteInfo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGisRouteInfo_Description(), ecorePackage.getEString(), "Description", null, 0, 1, GisRouteInfo.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getGisRouteInfo_FromLocation(), this.getGisLocation(), null, "FromLocation", null, 1, 1, GisRouteInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGisRouteInfo_Distance(), ecorePackage.getEDouble(), "Distance", null, 0, 1, GisRouteInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGisRouteInfo_Duration(), ecorePackage.getEDouble(), "Duration", null, 0, 1, GisRouteInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGisRouteInfo_ToLocation(), this.getGisLocation(), null, "ToLocation", null, 1, 1, GisRouteInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGisRouteInfo_WithGeometry(), ecorePackage.getEBoolean(), "WithGeometry", null, 0, 1, GisRouteInfo.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getGisRouteInfo_Geometry(), this.getGisLocation(), null, "Geometry", null, 0, -1, GisRouteInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gisRouteCalculatorEClass, GisRouteCalculator.class, "GisRouteCalculator", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(gisRouterEClass, GisRouter.class, "GisRouter", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGisRouter_Name(), ecorePackage.getEString(), "Name", null, 0, 1, GisRouter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGisRouter_Description(), ecorePackage.getEString(), "Description", null, 0, 1, GisRouter.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		op = initEOperation(getGisRouter__GetRoute__GisLocation_GisLocation(), this.getGisRouteInfo(), "getRoute", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getGisLocation(), "from", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getGisLocation(), "to", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getGisRouter__GetRoutes__EList_EList(), this.getGisRouteInfo(), "getRoutes", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getGisLocation(), "froms", 1, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getGisLocation(), "tos", 1, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(gisRouteCalculatorOneToOneEClass, GisRouteCalculatorOneToOne.class, "GisRouteCalculatorOneToOne", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(gisRouteCalculatorManyToManyEClass, GisRouteCalculatorManyToMany.class, "GisRouteCalculatorManyToMany", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(gisRouteCalculatorOneToManyEClass, GisRouteCalculatorOneToMany.class, "GisRouteCalculatorOneToMany", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(gisRouterGeodesicEClass, GisRouterGeodesic.class, "GisRouterGeodesic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGisRouterGeodesic_Speed(), ecorePackage.getEDouble(), "Speed", "50.0", 0, 1, GisRouterGeodesic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGisRouterGeodesic_Correction(), ecorePackage.getEDouble(), "Correction", "1.3", 0, 1, GisRouterGeodesic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gisRouterDefaultedEClass, GisRouterDefaulted.class, "GisRouterDefaulted", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGisRouterDefaulted_PrimaryRouter(), this.getGisRouter(), null, "PrimaryRouter", null, 1, 1, GisRouterDefaulted.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGisRouterDefaulted_SecondaryRouter(), this.getGisRouter(), null, "SecondaryRouter", null, 1, 1, GisRouterDefaulted.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gisGeometryEClass, GisGeometry.class, "GisGeometry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(gisLocationPinpointerEClass, GisLocationPinpointer.class, "GisLocationPinpointer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(gisLocationPinpointedEClass, GisLocationPinpointed.class, "GisLocationPinpointed", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGisLocationPinpointed_Distance(), ecorePackage.getEDouble(), "Distance", null, 0, 1, GisLocationPinpointed.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGisLocationPinpointed_LocationPinpointed(), ecorePackage.getEString(), "LocationPinpointed", null, 0, 1, GisLocationPinpointed.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //GisPackageImpl
