/*******************************************************************************
 * Copyright (c) 2017 Michel Schaffers and others.
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
package com.misc.common.moplaf.spreadsheet.spreadsheetcsv.impl;

import com.misc.common.moplaf.file.FilePackage;
import com.misc.common.moplaf.spreadsheet.SpreadsheetPackage;
import com.misc.common.moplaf.spreadsheet.spreadsheetcsv.FormatCSV;
import com.misc.common.moplaf.spreadsheet.spreadsheetcsv.SpreadsheetCSV;
import com.misc.common.moplaf.spreadsheet.spreadsheetcsv.SpreadsheetCSVFactory;
import com.misc.common.moplaf.spreadsheet.spreadsheetcsv.SpreadsheetCSVPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SpreadsheetCSVPackageImpl extends EPackageImpl implements SpreadsheetCSVPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spreadsheetCSVEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum formatCSVEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see com.misc.common.moplaf.spreadsheet.spreadsheetcsv.SpreadsheetCSVPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SpreadsheetCSVPackageImpl() {
		super(eNS_URI, SpreadsheetCSVFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link SpreadsheetCSVPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SpreadsheetCSVPackage init() {
		if (isInited) return (SpreadsheetCSVPackage)EPackage.Registry.INSTANCE.getEPackage(SpreadsheetCSVPackage.eNS_URI);

		// Obtain or create and register package
		SpreadsheetCSVPackageImpl theSpreadsheetCSVPackage = (SpreadsheetCSVPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SpreadsheetCSVPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SpreadsheetCSVPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		SpreadsheetPackage.eINSTANCE.eClass();
		FilePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSpreadsheetCSVPackage.createPackageContents();

		// Initialize created meta-data
		theSpreadsheetCSVPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSpreadsheetCSVPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SpreadsheetCSVPackage.eNS_URI, theSpreadsheetCSVPackage);
		return theSpreadsheetCSVPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpreadsheetCSV() {
		return spreadsheetCSVEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpreadsheetCSV_Format() {
		return (EAttribute)spreadsheetCSVEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpreadsheetCSV_Delimiter() {
		return (EAttribute)spreadsheetCSVEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpreadsheetCSV_QuoteCharacter() {
		return (EAttribute)spreadsheetCSVEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFormatCSV() {
		return formatCSVEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpreadsheetCSVFactory getSpreadsheetCSVFactory() {
		return (SpreadsheetCSVFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		spreadsheetCSVEClass = createEClass(SPREADSHEET_CSV);
		createEAttribute(spreadsheetCSVEClass, SPREADSHEET_CSV__FORMAT);
		createEAttribute(spreadsheetCSVEClass, SPREADSHEET_CSV__DELIMITER);
		createEAttribute(spreadsheetCSVEClass, SPREADSHEET_CSV__QUOTE_CHARACTER);

		// Create enums
		formatCSVEEnum = createEEnum(FORMAT_CSV);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		SpreadsheetPackage theSpreadsheetPackage = (SpreadsheetPackage)EPackage.Registry.INSTANCE.getEPackage(SpreadsheetPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		spreadsheetCSVEClass.getESuperTypes().add(theSpreadsheetPackage.getSpreadsheetReaderWriter());

		// Initialize classes, features, and operations; add parameters
		initEClass(spreadsheetCSVEClass, SpreadsheetCSV.class, "SpreadsheetCSV", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSpreadsheetCSV_Format(), this.getFormatCSV(), "Format", null, 0, 1, SpreadsheetCSV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpreadsheetCSV_Delimiter(), ecorePackage.getEString(), "Delimiter", null, 0, 1, SpreadsheetCSV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpreadsheetCSV_QuoteCharacter(), ecorePackage.getEString(), "QuoteCharacter", null, 0, 1, SpreadsheetCSV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(formatCSVEEnum, FormatCSV.class, "FormatCSV");
		addEEnumLiteral(formatCSVEEnum, FormatCSV.ENUM_LITERAL_CSV_FORMAT_DEFAULT);
		addEEnumLiteral(formatCSVEEnum, FormatCSV.ENUM_LITERAL_CSV_FORMAT_EXCEL);
		addEEnumLiteral(formatCSVEEnum, FormatCSV.ENUM_LITERAL_CSV_FORMAT_MYSQL);
		addEEnumLiteral(formatCSVEEnum, FormatCSV.ENUM_LITERAL_CSV_FORMAT_RFC4180);
		addEEnumLiteral(formatCSVEEnum, FormatCSV.ENUM_LITERAL_CSV_FORMAT_TDF);

		// Create resource
		createResource(eNS_URI);
	}

} //SpreadsheetCSVPackageImpl
