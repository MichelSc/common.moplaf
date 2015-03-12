/**
 */
package com.misc.common.moplaf.dataextractor.util;

import com.misc.common.moplaf.dataextractor.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.misc.common.moplaf.dataextractor.DataextractorPackage
 * @generated
 */
public class DataextractorAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DataextractorPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataextractorAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = DataextractorPackage.eINSTANCE;
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
	protected DataextractorSwitch<Adapter> modelSwitch =
		new DataextractorSwitch<Adapter>() {
			@Override
			public Adapter caseDataExtractor(DataExtractor object) {
				return createDataExtractorAdapter();
			}
			@Override
			public Adapter caseDataSorter(DataSorter object) {
				return createDataSorterAdapter();
			}
			@Override
			public Adapter caseDataSorterFeature(DataSorterFeature object) {
				return createDataSorterFeatureAdapter();
			}
			@Override
			public Adapter caseDataExtractorElement(DataExtractorElement object) {
				return createDataExtractorElementAdapter();
			}
			@Override
			public Adapter caseDataExtractorReference(DataExtractorReference object) {
				return createDataExtractorReferenceAdapter();
			}
			@Override
			public Adapter caseDataSelector(DataSelector object) {
				return createDataSelectorAdapter();
			}
			@Override
			public Adapter caseDataSelectorFeature(DataSelectorFeature object) {
				return createDataSelectorFeatureAdapter();
			}
			@Override
			public Adapter caseDataSelectorBigDecimal(DataSelectorBigDecimal object) {
				return createDataSelectorBigDecimalAdapter();
			}
			@Override
			public Adapter caseDataSelectorDate(DataSelectorDate object) {
				return createDataSelectorDateAdapter();
			}
			@Override
			public Adapter caseDataSelectorString(DataSelectorString object) {
				return createDataSelectorStringAdapter();
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
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.dataextractor.DataExtractor <em>Data Extractor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.dataextractor.DataExtractor
	 * @generated
	 */
	public Adapter createDataExtractorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.dataextractor.DataSorter <em>Data Sorter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.dataextractor.DataSorter
	 * @generated
	 */
	public Adapter createDataSorterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.dataextractor.DataSorterFeature <em>Data Sorter Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.dataextractor.DataSorterFeature
	 * @generated
	 */
	public Adapter createDataSorterFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.dataextractor.DataExtractorElement <em>Data Extractor Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.dataextractor.DataExtractorElement
	 * @generated
	 */
	public Adapter createDataExtractorElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.dataextractor.DataExtractorReference <em>Data Extractor Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.dataextractor.DataExtractorReference
	 * @generated
	 */
	public Adapter createDataExtractorReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.dataextractor.DataSelector <em>Data Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.dataextractor.DataSelector
	 * @generated
	 */
	public Adapter createDataSelectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.dataextractor.DataSelectorFeature <em>Data Selector Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.dataextractor.DataSelectorFeature
	 * @generated
	 */
	public Adapter createDataSelectorFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.dataextractor.DataSelectorBigDecimal <em>Data Selector Big Decimal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.dataextractor.DataSelectorBigDecimal
	 * @generated
	 */
	public Adapter createDataSelectorBigDecimalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.dataextractor.DataSelectorDate <em>Data Selector Date</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.dataextractor.DataSelectorDate
	 * @generated
	 */
	public Adapter createDataSelectorDateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.dataextractor.DataSelectorString <em>Data Selector String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.dataextractor.DataSelectorString
	 * @generated
	 */
	public Adapter createDataSelectorStringAdapter() {
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

} //DataextractorAdapterFactory
