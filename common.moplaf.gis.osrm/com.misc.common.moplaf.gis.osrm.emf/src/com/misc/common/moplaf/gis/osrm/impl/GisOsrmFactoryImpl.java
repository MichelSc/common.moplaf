/**
 */
package com.misc.common.moplaf.gis.osrm.impl;

import com.misc.common.moplaf.gis.osrm.*;

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
public class GisOsrmFactoryImpl extends EFactoryImpl implements GisOsrmFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GisOsrmFactory init() {
		try {
			GisOsrmFactory theGisOsrmFactory = (GisOsrmFactory)EPackage.Registry.INSTANCE.getEFactory(GisOsrmPackage.eNS_URI);
			if (theGisOsrmFactory != null) {
				return theGisOsrmFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GisOsrmFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GisOsrmFactoryImpl() {
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
			case GisOsrmPackage.GIS_DISTANCE_MATRIX_CALCULATOR_OSRM_ONE_TO_ONE: return createGisDistanceMatrixCalculatorOsrmOneToOne();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GisDistanceMatrixCalculatorOsrmOneToOne createGisDistanceMatrixCalculatorOsrmOneToOne() {
		GisDistanceMatrixCalculatorOsrmOneToOneImpl gisDistanceMatrixCalculatorOsrmOneToOne = new GisDistanceMatrixCalculatorOsrmOneToOneImpl();
		return gisDistanceMatrixCalculatorOsrmOneToOne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GisOsrmPackage getGisOsrmPackage() {
		return (GisOsrmPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GisOsrmPackage getPackage() {
		return GisOsrmPackage.eINSTANCE;
	}

} //GisOsrmFactoryImpl