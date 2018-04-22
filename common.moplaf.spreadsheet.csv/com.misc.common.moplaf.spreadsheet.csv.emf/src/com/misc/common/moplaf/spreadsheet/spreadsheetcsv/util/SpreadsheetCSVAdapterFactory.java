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
package com.misc.common.moplaf.spreadsheet.spreadsheetcsv.util;

import com.misc.common.moplaf.file.FileReaderWriter;
import com.misc.common.moplaf.spreadsheet.SpreadsheetReaderWriter;
import com.misc.common.moplaf.spreadsheet.spreadsheetcsv.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.misc.common.moplaf.spreadsheet.spreadsheetcsv.SpreadsheetCSVPackage
 * @generated
 */
public class SpreadsheetCSVAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SpreadsheetCSVPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpreadsheetCSVAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SpreadsheetCSVPackage.eINSTANCE;
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
	protected SpreadsheetCSVSwitch<Adapter> modelSwitch =
		new SpreadsheetCSVSwitch<Adapter>() {
			@Override
			public Adapter caseSpreadsheetCSV(SpreadsheetCSV object) {
				return createSpreadsheetCSVAdapter();
			}
			@Override
			public Adapter caseFileReaderWriter(FileReaderWriter object) {
				return createFileReaderWriterAdapter();
			}
			@Override
			public Adapter caseSpreadsheetReaderWriter(SpreadsheetReaderWriter object) {
				return createSpreadsheetReaderWriterAdapter();
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
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.spreadsheet.spreadsheetcsv.SpreadsheetCSV <em>Spreadsheet CSV</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.spreadsheet.spreadsheetcsv.SpreadsheetCSV
	 * @generated
	 */
	public Adapter createSpreadsheetCSVAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.file.FileReaderWriter <em>Reader Writer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.file.FileReaderWriter
	 * @generated
	 */
	public Adapter createFileReaderWriterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.spreadsheet.SpreadsheetReaderWriter <em>Reader Writer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.spreadsheet.SpreadsheetReaderWriter
	 * @generated
	 */
	public Adapter createSpreadsheetReaderWriterAdapter() {
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

} //SpreadsheetCSVAdapterFactory
