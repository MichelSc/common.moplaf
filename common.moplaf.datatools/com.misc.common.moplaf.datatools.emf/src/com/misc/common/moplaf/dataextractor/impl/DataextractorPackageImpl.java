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
package com.misc.common.moplaf.dataextractor.impl;

import com.misc.common.moplaf.dataextractor.DataExtractor;
import com.misc.common.moplaf.dataextractor.DataExtractorElement;
import com.misc.common.moplaf.dataextractor.DataExtractorReference;
import com.misc.common.moplaf.dataextractor.DataSelector;
import com.misc.common.moplaf.dataextractor.DataSelectorBigDecimal;
import com.misc.common.moplaf.dataextractor.DataSelectorDate;
import com.misc.common.moplaf.dataextractor.DataSelectorFeature;
import com.misc.common.moplaf.dataextractor.DataSelectorString;
import com.misc.common.moplaf.dataextractor.DataSorter;
import com.misc.common.moplaf.dataextractor.DataSorterFeature;
import com.misc.common.moplaf.dataextractor.DataSorterSense;
import com.misc.common.moplaf.dataextractor.DataextractorFactory;
import com.misc.common.moplaf.dataextractor.DataextractorPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DataextractorPackageImpl extends EPackageImpl implements DataextractorPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataExtractorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataSorterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataSorterFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataExtractorElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataExtractorReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataSelectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataSelectorFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataSelectorBigDecimalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataSelectorDateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataSelectorStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dataSorterSenseEEnum = null;

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
	 * @see com.misc.common.moplaf.dataextractor.DataextractorPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DataextractorPackageImpl() {
		super(eNS_URI, DataextractorFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link DataextractorPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DataextractorPackage init() {
		if (isInited) return (DataextractorPackage)EPackage.Registry.INSTANCE.getEPackage(DataextractorPackage.eNS_URI);

		// Obtain or create and register package
		DataextractorPackageImpl theDataextractorPackage = (DataextractorPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DataextractorPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DataextractorPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theDataextractorPackage.createPackageContents();

		// Initialize created meta-data
		theDataextractorPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDataextractorPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DataextractorPackage.eNS_URI, theDataextractorPackage);
		return theDataextractorPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataExtractor() {
		return dataExtractorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataExtractor_Name() {
		return (EAttribute)dataExtractorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataExtractor_SourceObject() {
		return (EReference)dataExtractorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataExtractor_NumberOfSelected() {
		return (EAttribute)dataExtractorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataExtractor_TargetObjects() {
		return (EReference)dataExtractorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataExtractor_Sorters() {
		return (EReference)dataExtractorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataExtractor_SourceType() {
		return (EReference)dataExtractorEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataExtractor_TargetType() {
		return (EReference)dataExtractorEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataExtractor_Extractors() {
		return (EReference)dataExtractorEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataExtractor_LastExtractor() {
		return (EReference)dataExtractorEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataExtractor_MaxNumberOfSelected() {
		return (EAttribute)dataExtractorEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataExtractor_MaxNumberOfSelectedReached() {
		return (EAttribute)dataExtractorEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataExtractor_NumberOfExtracted() {
		return (EAttribute)dataExtractorEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataExtractor_URISave() {
		return (EAttribute)dataExtractorEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataExtractor__Refresh() {
		return dataExtractorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataExtractor__Save() {
		return dataExtractorEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataSorter() {
		return dataSorterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataSorter_Sequence() {
		return (EAttribute)dataSorterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataSorter_Sense() {
		return (EAttribute)dataSorterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataSorter_DataExtractor() {
		return (EReference)dataSorterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataSorter_Description() {
		return (EAttribute)dataSorterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataSorter__Compare__EObject_EObject() {
		return dataSorterEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataSorterFeature() {
		return dataSorterFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataSorterFeature_SortedFeature() {
		return (EReference)dataSorterFeatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataExtractorElement() {
		return dataExtractorElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataExtractorElement_DataExtractor() {
		return (EReference)dataExtractorElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataExtractorElement_Sequence() {
		return (EAttribute)dataExtractorElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataExtractorElement_Description() {
		return (EAttribute)dataExtractorElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataExtractorElement_SourceType() {
		return (EReference)dataExtractorElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataExtractorElement_TargetType() {
		return (EReference)dataExtractorElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataExtractorElement_Previous() {
		return (EReference)dataExtractorElementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataExtractorElement_Selectors() {
		return (EReference)dataExtractorElementEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataExtractorElement__IsSelected__EObject() {
		return dataExtractorElementEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataExtractorElement__GetResultSet() {
		return dataExtractorElementEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataExtractorElement__GetExtractSet() {
		return dataExtractorElementEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataExtractorReference() {
		return dataExtractorReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataExtractorReference_ExtractorReference() {
		return (EReference)dataExtractorReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataSelector() {
		return dataSelectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataSelector_ExtractorElement() {
		return (EReference)dataSelectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataSelector_Description() {
		return (EAttribute)dataSelectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataSelector__IsSelected__EObject() {
		return dataSelectorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataSelectorFeature() {
		return dataSelectorFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataSelectorFeature_Feature() {
		return (EReference)dataSelectorFeatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataSelectorFeature__GetFeatureClassifier() {
		return dataSelectorFeatureEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataSelectorBigDecimal() {
		return dataSelectorBigDecimalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataSelectorBigDecimal_Values() {
		return (EAttribute)dataSelectorBigDecimalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataSelectorDate() {
		return dataSelectorDateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataSelectorDate_Values() {
		return (EAttribute)dataSelectorDateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataSelectorString() {
		return dataSelectorStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataSelectorString_Values() {
		return (EAttribute)dataSelectorStringEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDataSorterSense() {
		return dataSorterSenseEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataextractorFactory getDataextractorFactory() {
		return (DataextractorFactory)getEFactoryInstance();
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
		dataExtractorEClass = createEClass(DATA_EXTRACTOR);
		createEAttribute(dataExtractorEClass, DATA_EXTRACTOR__NAME);
		createEReference(dataExtractorEClass, DATA_EXTRACTOR__SOURCE_OBJECT);
		createEAttribute(dataExtractorEClass, DATA_EXTRACTOR__NUMBER_OF_SELECTED);
		createEReference(dataExtractorEClass, DATA_EXTRACTOR__TARGET_OBJECTS);
		createEReference(dataExtractorEClass, DATA_EXTRACTOR__SORTERS);
		createEReference(dataExtractorEClass, DATA_EXTRACTOR__SOURCE_TYPE);
		createEReference(dataExtractorEClass, DATA_EXTRACTOR__TARGET_TYPE);
		createEReference(dataExtractorEClass, DATA_EXTRACTOR__EXTRACTORS);
		createEReference(dataExtractorEClass, DATA_EXTRACTOR__LAST_EXTRACTOR);
		createEAttribute(dataExtractorEClass, DATA_EXTRACTOR__MAX_NUMBER_OF_SELECTED);
		createEAttribute(dataExtractorEClass, DATA_EXTRACTOR__MAX_NUMBER_OF_SELECTED_REACHED);
		createEAttribute(dataExtractorEClass, DATA_EXTRACTOR__NUMBER_OF_EXTRACTED);
		createEAttribute(dataExtractorEClass, DATA_EXTRACTOR__URI_SAVE);
		createEOperation(dataExtractorEClass, DATA_EXTRACTOR___REFRESH);
		createEOperation(dataExtractorEClass, DATA_EXTRACTOR___SAVE);

		dataSorterEClass = createEClass(DATA_SORTER);
		createEAttribute(dataSorterEClass, DATA_SORTER__SEQUENCE);
		createEAttribute(dataSorterEClass, DATA_SORTER__SENSE);
		createEReference(dataSorterEClass, DATA_SORTER__DATA_EXTRACTOR);
		createEAttribute(dataSorterEClass, DATA_SORTER__DESCRIPTION);
		createEOperation(dataSorterEClass, DATA_SORTER___COMPARE__EOBJECT_EOBJECT);

		dataSorterFeatureEClass = createEClass(DATA_SORTER_FEATURE);
		createEReference(dataSorterFeatureEClass, DATA_SORTER_FEATURE__SORTED_FEATURE);

		dataExtractorElementEClass = createEClass(DATA_EXTRACTOR_ELEMENT);
		createEReference(dataExtractorElementEClass, DATA_EXTRACTOR_ELEMENT__DATA_EXTRACTOR);
		createEAttribute(dataExtractorElementEClass, DATA_EXTRACTOR_ELEMENT__SEQUENCE);
		createEAttribute(dataExtractorElementEClass, DATA_EXTRACTOR_ELEMENT__DESCRIPTION);
		createEReference(dataExtractorElementEClass, DATA_EXTRACTOR_ELEMENT__SOURCE_TYPE);
		createEReference(dataExtractorElementEClass, DATA_EXTRACTOR_ELEMENT__TARGET_TYPE);
		createEReference(dataExtractorElementEClass, DATA_EXTRACTOR_ELEMENT__PREVIOUS);
		createEReference(dataExtractorElementEClass, DATA_EXTRACTOR_ELEMENT__SELECTORS);
		createEOperation(dataExtractorElementEClass, DATA_EXTRACTOR_ELEMENT___IS_SELECTED__EOBJECT);
		createEOperation(dataExtractorElementEClass, DATA_EXTRACTOR_ELEMENT___GET_RESULT_SET);
		createEOperation(dataExtractorElementEClass, DATA_EXTRACTOR_ELEMENT___GET_EXTRACT_SET);

		dataExtractorReferenceEClass = createEClass(DATA_EXTRACTOR_REFERENCE);
		createEReference(dataExtractorReferenceEClass, DATA_EXTRACTOR_REFERENCE__EXTRACTOR_REFERENCE);

		dataSelectorEClass = createEClass(DATA_SELECTOR);
		createEReference(dataSelectorEClass, DATA_SELECTOR__EXTRACTOR_ELEMENT);
		createEAttribute(dataSelectorEClass, DATA_SELECTOR__DESCRIPTION);
		createEOperation(dataSelectorEClass, DATA_SELECTOR___IS_SELECTED__EOBJECT);

		dataSelectorFeatureEClass = createEClass(DATA_SELECTOR_FEATURE);
		createEReference(dataSelectorFeatureEClass, DATA_SELECTOR_FEATURE__FEATURE);
		createEOperation(dataSelectorFeatureEClass, DATA_SELECTOR_FEATURE___GET_FEATURE_CLASSIFIER);

		dataSelectorBigDecimalEClass = createEClass(DATA_SELECTOR_BIG_DECIMAL);
		createEAttribute(dataSelectorBigDecimalEClass, DATA_SELECTOR_BIG_DECIMAL__VALUES);

		dataSelectorDateEClass = createEClass(DATA_SELECTOR_DATE);
		createEAttribute(dataSelectorDateEClass, DATA_SELECTOR_DATE__VALUES);

		dataSelectorStringEClass = createEClass(DATA_SELECTOR_STRING);
		createEAttribute(dataSelectorStringEClass, DATA_SELECTOR_STRING__VALUES);

		// Create enums
		dataSorterSenseEEnum = createEEnum(DATA_SORTER_SENSE);
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
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		dataSorterFeatureEClass.getESuperTypes().add(this.getDataSorter());
		dataExtractorReferenceEClass.getESuperTypes().add(this.getDataExtractorElement());
		dataSelectorFeatureEClass.getESuperTypes().add(this.getDataSelector());
		dataSelectorBigDecimalEClass.getESuperTypes().add(this.getDataSelectorFeature());
		dataSelectorDateEClass.getESuperTypes().add(this.getDataSelectorFeature());
		dataSelectorStringEClass.getESuperTypes().add(this.getDataSelectorFeature());

		// Initialize classes, features, and operations; add parameters
		initEClass(dataExtractorEClass, DataExtractor.class, "DataExtractor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataExtractor_Name(), ecorePackage.getEString(), "Name", null, 0, 1, DataExtractor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataExtractor_SourceObject(), ecorePackage.getEObject(), null, "SourceObject", null, 0, 1, DataExtractor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataExtractor_NumberOfSelected(), ecorePackage.getEInt(), "NumberOfSelected", null, 0, 1, DataExtractor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataExtractor_TargetObjects(), ecorePackage.getEObject(), null, "TargetObjects", null, 0, -1, DataExtractor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataExtractor_Sorters(), this.getDataSorter(), this.getDataSorter_DataExtractor(), "Sorters", null, 0, -1, DataExtractor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataExtractor_SourceType(), theEcorePackage.getEClass(), null, "SourceType", null, 0, 1, DataExtractor.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDataExtractor_TargetType(), theEcorePackage.getEClass(), null, "TargetType", null, 0, 1, DataExtractor.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDataExtractor_Extractors(), this.getDataExtractorElement(), this.getDataExtractorElement_DataExtractor(), "Extractors", null, 0, -1, DataExtractor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataExtractor_LastExtractor(), this.getDataExtractorElement(), null, "LastExtractor", null, 0, 1, DataExtractor.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataExtractor_MaxNumberOfSelected(), ecorePackage.getEInt(), "MaxNumberOfSelected", null, 0, 1, DataExtractor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataExtractor_MaxNumberOfSelectedReached(), ecorePackage.getEBoolean(), "MaxNumberOfSelectedReached", null, 0, 1, DataExtractor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataExtractor_NumberOfExtracted(), ecorePackage.getEInt(), "NumberOfExtracted", null, 0, 1, DataExtractor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataExtractor_URISave(), theEcorePackage.getEString(), "URISave", null, 0, 1, DataExtractor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getDataExtractor__Refresh(), null, "refresh", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDataExtractor__Save(), null, "save", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(dataSorterEClass, DataSorter.class, "DataSorter", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataSorter_Sequence(), ecorePackage.getEInt(), "Sequence", null, 0, 1, DataSorter.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataSorter_Sense(), this.getDataSorterSense(), "Sense", null, 0, 1, DataSorter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataSorter_DataExtractor(), this.getDataExtractor(), this.getDataExtractor_Sorters(), "DataExtractor", null, 1, 1, DataSorter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataSorter_Description(), ecorePackage.getEString(), "Description", null, 0, 1, DataSorter.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getDataSorter__Compare__EObject_EObject(), ecorePackage.getEInt(), "compare", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEObject(), "object1", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEObject(), "object2", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(dataSorterFeatureEClass, DataSorterFeature.class, "DataSorterFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataSorterFeature_SortedFeature(), theEcorePackage.getEStructuralFeature(), null, "SortedFeature", null, 1, 1, DataSorterFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataExtractorElementEClass, DataExtractorElement.class, "DataExtractorElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataExtractorElement_DataExtractor(), this.getDataExtractor(), this.getDataExtractor_Extractors(), "DataExtractor", null, 1, 1, DataExtractorElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataExtractorElement_Sequence(), ecorePackage.getEInt(), "Sequence", null, 0, 1, DataExtractorElement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataExtractorElement_Description(), ecorePackage.getEString(), "Description", null, 0, 1, DataExtractorElement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDataExtractorElement_SourceType(), theEcorePackage.getEClass(), null, "SourceType", null, 0, 1, DataExtractorElement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDataExtractorElement_TargetType(), theEcorePackage.getEClass(), null, "TargetType", null, 0, 1, DataExtractorElement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDataExtractorElement_Previous(), this.getDataExtractorElement(), null, "Previous", null, 0, 1, DataExtractorElement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDataExtractorElement_Selectors(), this.getDataSelector(), this.getDataSelector_ExtractorElement(), "Selectors", null, 0, -1, DataExtractorElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getDataExtractorElement__IsSelected__EObject(), ecorePackage.getEBoolean(), "isSelected", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEObject(), "object", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataExtractorElement__GetResultSet(), null, "getResultSet", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEEList());
		EGenericType g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getDataExtractorElement__GetExtractSet(), null, "getExtractSet", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEEList());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(dataExtractorReferenceEClass, DataExtractorReference.class, "DataExtractorReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataExtractorReference_ExtractorReference(), theEcorePackage.getEReference(), null, "ExtractorReference", null, 0, 1, DataExtractorReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataSelectorEClass, DataSelector.class, "DataSelector", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataSelector_ExtractorElement(), this.getDataExtractorElement(), this.getDataExtractorElement_Selectors(), "ExtractorElement", null, 1, 1, DataSelector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataSelector_Description(), ecorePackage.getEString(), "Description", null, 0, 1, DataSelector.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		op = initEOperation(getDataSelector__IsSelected__EObject(), ecorePackage.getEBoolean(), "isSelected", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEObject(), "object", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(dataSelectorFeatureEClass, DataSelectorFeature.class, "DataSelectorFeature", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataSelectorFeature_Feature(), theEcorePackage.getEStructuralFeature(), null, "Feature", null, 0, 1, DataSelectorFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getDataSelectorFeature__GetFeatureClassifier(), theEcorePackage.getEClassifier(), "getFeatureClassifier", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(dataSelectorBigDecimalEClass, DataSelectorBigDecimal.class, "DataSelectorBigDecimal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataSelectorBigDecimal_Values(), ecorePackage.getEBigDecimal(), "Values", null, 0, -1, DataSelectorBigDecimal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataSelectorDateEClass, DataSelectorDate.class, "DataSelectorDate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataSelectorDate_Values(), theEcorePackage.getEDate(), "Values", null, 0, -1, DataSelectorDate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataSelectorStringEClass, DataSelectorString.class, "DataSelectorString", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataSelectorString_Values(), theEcorePackage.getEString(), "Values", null, 0, -1, DataSelectorString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(dataSorterSenseEEnum, DataSorterSense.class, "DataSorterSense");
		addEEnumLiteral(dataSorterSenseEEnum, DataSorterSense.ASC);
		addEEnumLiteral(dataSorterSenseEEnum, DataSorterSense.DESC);

		// Create resource
		createResource(eNS_URI);
	}

} //DataextractorPackageImpl
