/**
 */
package GisGoogle.util;

import GisGoogle.*;

import com.misc.common.moplaf.gis.GisAddressGeocoder;
import com.misc.common.moplaf.gis.GisDistanceMatrixCalculator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see GisGoogle.GisGooglePackage
 * @generated
 */
public class GisGoogleSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GisGooglePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GisGoogleSwitch() {
		if (modelPackage == null) {
			modelPackage = GisGooglePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case GisGooglePackage.GIS_DISTANCE_MATRIX_CALCULATOR_GOOGLE_WS: {
				GisDistanceMatrixCalculatorGoogleWS gisDistanceMatrixCalculatorGoogleWS = (GisDistanceMatrixCalculatorGoogleWS)theEObject;
				T result = caseGisDistanceMatrixCalculatorGoogleWS(gisDistanceMatrixCalculatorGoogleWS);
				if (result == null) result = caseGisDistanceMatrixCalculator(gisDistanceMatrixCalculatorGoogleWS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GisGooglePackage.GIS_ADDRESS_GEOCODER_GOOGLE_WS: {
				GisAddressGeocoderGoogleWS gisAddressGeocoderGoogleWS = (GisAddressGeocoderGoogleWS)theEObject;
				T result = caseGisAddressGeocoderGoogleWS(gisAddressGeocoderGoogleWS);
				if (result == null) result = caseGisAddressGeocoder(gisAddressGeocoderGoogleWS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gis Distance Matrix Calculator Google WS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gis Distance Matrix Calculator Google WS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGisDistanceMatrixCalculatorGoogleWS(GisDistanceMatrixCalculatorGoogleWS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gis Address Geocoder Google WS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gis Address Geocoder Google WS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGisAddressGeocoderGoogleWS(GisAddressGeocoderGoogleWS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Address Geocoder</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Address Geocoder</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGisAddressGeocoder(GisAddressGeocoder object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Distance Matrix Calculator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Distance Matrix Calculator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGisDistanceMatrixCalculator(GisDistanceMatrixCalculator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //GisGoogleSwitch
