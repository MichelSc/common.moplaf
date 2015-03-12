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
public class SpreadsheetpoiFactoryImpl extends EFactoryImpl implements SpreadsheetpoiFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SpreadsheetpoiFactory init() {
		try {
			SpreadsheetpoiFactory theSpreadsheetpoiFactory = (SpreadsheetpoiFactory)EPackage.Registry.INSTANCE.getEFactory(SpreadsheetpoiPackage.eNS_URI);
			if (theSpreadsheetpoiFactory != null) {
				return theSpreadsheetpoiFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SpreadsheetpoiFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpreadsheetpoiFactoryImpl() {
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
			case SpreadsheetpoiPackage.SPREADSHEET_POI: return createSpreadsheetPOI();
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
	public SpreadsheetpoiPackage getSpreadsheetpoiPackage() {
		return (SpreadsheetpoiPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SpreadsheetpoiPackage getPackage() {
		return SpreadsheetpoiPackage.eINSTANCE;
	}

} //SpreadsheetpoiFactoryImpl
