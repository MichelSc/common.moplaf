/**
 */
package GisGoogle.impl;

import GisGoogle.*;

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
public class GisGoogleFactoryImpl extends EFactoryImpl implements GisGoogleFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GisGoogleFactory init() {
		try {
			GisGoogleFactory theGisGoogleFactory = (GisGoogleFactory)EPackage.Registry.INSTANCE.getEFactory(GisGooglePackage.eNS_URI);
			if (theGisGoogleFactory != null) {
				return theGisGoogleFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GisGoogleFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GisGoogleFactoryImpl() {
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
			case GisGooglePackage.GIS_DISTANCE_MATRIX_CALCULATOR_GOOGLE_WS: return createGisDistanceMatrixCalculatorGoogleWS();
			case GisGooglePackage.GIS_ADDRESS_GEOCODER_GOOGLE_WS: return createGisAddressGeocoderGoogleWS();
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
			case GisGooglePackage.PROTOCOL:
				return createProtocolFromString(eDataType, initialValue);
			case GisGooglePackage.TRAVEL_MODE:
				return createTravelModeFromString(eDataType, initialValue);
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
			case GisGooglePackage.PROTOCOL:
				return convertProtocolToString(eDataType, instanceValue);
			case GisGooglePackage.TRAVEL_MODE:
				return convertTravelModeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GisDistanceMatrixCalculatorGoogleWS createGisDistanceMatrixCalculatorGoogleWS() {
		GisDistanceMatrixCalculatorGoogleWSImpl gisDistanceMatrixCalculatorGoogleWS = new GisDistanceMatrixCalculatorGoogleWSImpl();
		return gisDistanceMatrixCalculatorGoogleWS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GisAddressGeocoderGoogleWS createGisAddressGeocoderGoogleWS() {
		GisAddressGeocoderGoogleWSImpl gisAddressGeocoderGoogleWS = new GisAddressGeocoderGoogleWSImpl();
		return gisAddressGeocoderGoogleWS;
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
	public TravelMode createTravelModeFromString(EDataType eDataType, String initialValue) {
		TravelMode result = TravelMode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTravelModeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GisGooglePackage getGisGooglePackage() {
		return (GisGooglePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GisGooglePackage getPackage() {
		return GisGooglePackage.eINSTANCE;
	}

} //GisGoogleFactoryImpl
