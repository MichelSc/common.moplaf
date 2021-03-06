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
			case SpreadsheetPOIPackage.SPREADSHEET_PO_IX: return createSpreadsheetPOIx();
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
	public SpreadsheetPOIx createSpreadsheetPOIx() {
		SpreadsheetPOIxImpl spreadsheetPOIx = new SpreadsheetPOIxImpl();
		return spreadsheetPOIx;
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
