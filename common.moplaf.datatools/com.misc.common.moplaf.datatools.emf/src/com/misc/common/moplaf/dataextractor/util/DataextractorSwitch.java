/**
 */
package com.misc.common.moplaf.dataextractor.util;

import com.misc.common.moplaf.dataextractor.*;

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
 * @see com.misc.common.moplaf.dataextractor.DataextractorPackage
 * @generated
 */
public class DataextractorSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DataextractorPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataextractorSwitch() {
		if (modelPackage == null) {
			modelPackage = DataextractorPackage.eINSTANCE;
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
			case DataextractorPackage.DATA_EXTRACTOR: {
				DataExtractor dataExtractor = (DataExtractor)theEObject;
				T result = caseDataExtractor(dataExtractor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataextractorPackage.DATA_SORTER: {
				DataSorter dataSorter = (DataSorter)theEObject;
				T result = caseDataSorter(dataSorter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataextractorPackage.DATA_SORTER_FEATURE: {
				DataSorterFeature dataSorterFeature = (DataSorterFeature)theEObject;
				T result = caseDataSorterFeature(dataSorterFeature);
				if (result == null) result = caseDataSorter(dataSorterFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataextractorPackage.DATA_EXTRACTOR_ELEMENT: {
				DataExtractorElement dataExtractorElement = (DataExtractorElement)theEObject;
				T result = caseDataExtractorElement(dataExtractorElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataextractorPackage.DATA_EXTRACTOR_REFERENCE: {
				DataExtractorReference dataExtractorReference = (DataExtractorReference)theEObject;
				T result = caseDataExtractorReference(dataExtractorReference);
				if (result == null) result = caseDataExtractorElement(dataExtractorReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataextractorPackage.DATA_SELECTOR: {
				DataSelector dataSelector = (DataSelector)theEObject;
				T result = caseDataSelector(dataSelector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataextractorPackage.DATA_SELECTOR_FEATURE: {
				DataSelectorFeature dataSelectorFeature = (DataSelectorFeature)theEObject;
				T result = caseDataSelectorFeature(dataSelectorFeature);
				if (result == null) result = caseDataSelector(dataSelectorFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataextractorPackage.DATA_SELECTOR_BIG_DECIMAL: {
				DataSelectorBigDecimal dataSelectorBigDecimal = (DataSelectorBigDecimal)theEObject;
				T result = caseDataSelectorBigDecimal(dataSelectorBigDecimal);
				if (result == null) result = caseDataSelectorFeature(dataSelectorBigDecimal);
				if (result == null) result = caseDataSelector(dataSelectorBigDecimal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataextractorPackage.DATA_SELECTOR_DATE: {
				DataSelectorDate dataSelectorDate = (DataSelectorDate)theEObject;
				T result = caseDataSelectorDate(dataSelectorDate);
				if (result == null) result = caseDataSelectorFeature(dataSelectorDate);
				if (result == null) result = caseDataSelector(dataSelectorDate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataextractorPackage.DATA_SELECTOR_STRING: {
				DataSelectorString dataSelectorString = (DataSelectorString)theEObject;
				T result = caseDataSelectorString(dataSelectorString);
				if (result == null) result = caseDataSelectorFeature(dataSelectorString);
				if (result == null) result = caseDataSelector(dataSelectorString);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Extractor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Extractor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataExtractor(DataExtractor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Sorter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Sorter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataSorter(DataSorter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Sorter Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Sorter Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataSorterFeature(DataSorterFeature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Extractor Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Extractor Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataExtractorElement(DataExtractorElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Extractor Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Extractor Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataExtractorReference(DataExtractorReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Selector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Selector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataSelector(DataSelector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Selector Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Selector Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataSelectorFeature(DataSelectorFeature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Selector Big Decimal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Selector Big Decimal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataSelectorBigDecimal(DataSelectorBigDecimal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Selector Date</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Selector Date</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataSelectorDate(DataSelectorDate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Selector String</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Selector String</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataSelectorString(DataSelectorString object) {
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

} //DataextractorSwitch
