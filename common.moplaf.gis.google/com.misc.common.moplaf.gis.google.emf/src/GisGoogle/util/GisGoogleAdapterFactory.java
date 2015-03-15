/**
 */
package GisGoogle.util;

import GisGoogle.*;

import com.misc.common.moplaf.gis.GisAddressGeocoder;
import com.misc.common.moplaf.gis.GisDistanceMatrixCalculator;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see GisGoogle.GisGooglePackage
 * @generated
 */
public class GisGoogleAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GisGooglePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GisGoogleAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = GisGooglePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GisGoogleSwitch<Adapter> modelSwitch =
		new GisGoogleSwitch<Adapter>() {
			@Override
			public Adapter caseGisDistanceMatrixCalculatorGoogleWS(GisDistanceMatrixCalculatorGoogleWS object) {
				return createGisDistanceMatrixCalculatorGoogleWSAdapter();
			}
			@Override
			public Adapter caseGisAddressGeocoderGoogleWS(GisAddressGeocoderGoogleWS object) {
				return createGisAddressGeocoderGoogleWSAdapter();
			}
			@Override
			public Adapter caseGisDistanceMatrixCalculator(GisDistanceMatrixCalculator object) {
				return createGisDistanceMatrixCalculatorAdapter();
			}
			@Override
			public Adapter caseGisAddressGeocoder(GisAddressGeocoder object) {
				return createGisAddressGeocoderAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link GisGoogle.GisDistanceMatrixCalculatorGoogleWS <em>Gis Distance Matrix Calculator Google WS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GisGoogle.GisDistanceMatrixCalculatorGoogleWS
	 * @generated
	 */
	public Adapter createGisDistanceMatrixCalculatorGoogleWSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GisGoogle.GisAddressGeocoderGoogleWS <em>Gis Address Geocoder Google WS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GisGoogle.GisAddressGeocoderGoogleWS
	 * @generated
	 */
	public Adapter createGisAddressGeocoderGoogleWSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.gis.GisAddressGeocoder <em>Address Geocoder</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.gis.GisAddressGeocoder
	 * @generated
	 */
	public Adapter createGisAddressGeocoderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.gis.GisDistanceMatrixCalculator <em>Distance Matrix Calculator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.gis.GisDistanceMatrixCalculator
	 * @generated
	 */
	public Adapter createGisDistanceMatrixCalculatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //GisGoogleAdapterFactory
