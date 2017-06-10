/**
 */
package com.misc.common.moplaf.spreadsheet.spreadsheetpoi.impl;

import com.misc.common.moplaf.spreadsheet.spreadsheetpoi.*;

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
public class SpreadsheetPOIFactoryImpl extends EFactoryImpl implements SpreadsheetPOIFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SpreadsheetPOIFactory init() {
		try {
			SpreadsheetPOIFactory theSpreadsheetPOIFactory = (SpreadsheetPOIFactory)EPackage.Registry.INSTANCE.getEFactory(SpreadsheetPOIPackage.eNS_URI);
			if (theSpreadsheetPOIFactory != null) {
				return theSpreadsheetPOIFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SpreadsheetPOIFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpreadsheetPOIFactoryImpl() {
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
			case SpreadsheetPOIPackage.SPREADSHEET_POI: return createSpreadsheetPOI();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpreadsheetPOI createSpreadsheetPOI() {
		SpreadsheetPOIImpl spreadsheetPOI = new SpreadsheetPOIImpl();
		return spreadsheetPOI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpreadsheetPOIPackage getSpreadsheetPOIPackage() {
		return (SpreadsheetPOIPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SpreadsheetPOIPackage getPackage() {
		return SpreadsheetPOIPackage.eINSTANCE;
	}

} //SpreadsheetPOIFactoryImpl
