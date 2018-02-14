/**
 */
package com.misc.common.moplaf.gis.osrm.impl;

import com.misc.common.moplaf.gis.osrm.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
			case GisOsrmPackage.GIS_DISTANCE_MATRIX_CALCULATOR_OSRM_MANY_TO_MANY: return createGisDistanceMatrixCalculatorOsrmManyToMany();
			case GisOsrmPackage.GIS_PINPOINTER_OSRM_NEAREST: return createGisPinpointerOsrmNearest();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case GisOsrmPackage.PROTOCOL:
				return createProtocolFromString(eDataType, initialValue);
			case GisOsrmPackage.OVERVIEW:
				return createOverviewFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case GisOsrmPackage.PROTOCOL:
				return convertProtocolToString(eDataType, instanceValue);
			case GisOsrmPackage.OVERVIEW:
				return convertOverviewToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
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
	public GisDistanceMatrixCalculatorOsrmManyToMany createGisDistanceMatrixCalculatorOsrmManyToMany() {
		GisDistanceMatrixCalculatorOsrmManyToManyImpl gisDistanceMatrixCalculatorOsrmManyToMany = new GisDistanceMatrixCalculatorOsrmManyToManyImpl();
		return gisDistanceMatrixCalculatorOsrmManyToMany;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GisPinpointerOsrmNearest createGisPinpointerOsrmNearest() {
		GisPinpointerOsrmNearestImpl gisPinpointerOsrmNearest = new GisPinpointerOsrmNearestImpl();
		return gisPinpointerOsrmNearest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Protocol createProtocolFromString(EDataType eDataType, String initialValue) {
		Protocol result = Protocol.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProtocolToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Overview createOverviewFromString(EDataType eDataType, String initialValue) {
		Overview result = Overview.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOverviewToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
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
