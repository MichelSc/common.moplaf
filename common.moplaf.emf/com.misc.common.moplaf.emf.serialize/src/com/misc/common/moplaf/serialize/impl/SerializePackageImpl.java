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
package com.misc.common.moplaf.serialize.impl;

import com.misc.common.moplaf.file.FilePackage;

import com.misc.common.moplaf.serialize.Deserializable;
import com.misc.common.moplaf.serialize.Serializable;
import com.misc.common.moplaf.serialize.SerializeFactory;
import com.misc.common.moplaf.serialize.SerializePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SerializePackageImpl extends EPackageImpl implements SerializePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serializableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deserializableEClass = null;

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
	 * @see com.misc.common.moplaf.serialize.SerializePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SerializePackageImpl() {
		super(eNS_URI, SerializeFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SerializePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SerializePackage init() {
		if (isInited) return (SerializePackage)EPackage.Registry.INSTANCE.getEPackage(SerializePackage.eNS_URI);

		// Obtain or create and register package
		SerializePackageImpl theSerializePackage = (SerializePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SerializePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SerializePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		FilePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSerializePackage.createPackageContents();

		// Initialize created meta-data
		theSerializePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSerializePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SerializePackage.eNS_URI, theSerializePackage);
		return theSerializePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSerializable() {
		return serializableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSerializable_Name() {
		return (EAttribute)serializableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSerializable_Scheme() {
		return (EAttribute)serializableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSerializable_SelectedObjects() {
		return (EReference)serializableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeserializable() {
		return deserializableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeserializable_Name() {
		return (EAttribute)deserializableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeserializable_Scheme() {
		return (EAttribute)deserializableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeserializable_OwnedObjects() {
		return (EReference)deserializableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SerializeFactory getSerializeFactory() {
		return (SerializeFactory)getEFactoryInstance();
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
		serializableEClass = createEClass(SERIALIZABLE);
		createEAttribute(serializableEClass, SERIALIZABLE__NAME);
		createEAttribute(serializableEClass, SERIALIZABLE__SCHEME);
		createEReference(serializableEClass, SERIALIZABLE__SELECTED_OBJECTS);

		deserializableEClass = createEClass(DESERIALIZABLE);
		createEAttribute(deserializableEClass, DESERIALIZABLE__NAME);
		createEAttribute(deserializableEClass, DESERIALIZABLE__SCHEME);
		createEReference(deserializableEClass, DESERIALIZABLE__OWNED_OBJECTS);
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
		FilePackage theFilePackage = (FilePackage)EPackage.Registry.INSTANCE.getEPackage(FilePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		serializableEClass.getESuperTypes().add(theFilePackage.getFileReaderWriter());
		deserializableEClass.getESuperTypes().add(theFilePackage.getFileReaderWriter());

		// Initialize classes, features, and operations; add parameters
		initEClass(serializableEClass, Serializable.class, "Serializable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSerializable_Name(), ecorePackage.getEString(), "Name", null, 0, 1, Serializable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSerializable_Scheme(), ecorePackage.getEString(), "Scheme", "com.misc.common.moplaf.emf.serialize.xmi.schemes.xmi", 0, 1, Serializable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSerializable_SelectedObjects(), ecorePackage.getEObject(), null, "SelectedObjects", null, 0, -1, Serializable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deserializableEClass, Deserializable.class, "Deserializable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDeserializable_Name(), ecorePackage.getEString(), "Name", null, 0, 1, Deserializable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeserializable_Scheme(), ecorePackage.getEString(), "Scheme", "com.misc.common.moplaf.emf.serialize.xmi.schemes.xmi", 0, 1, Deserializable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeserializable_OwnedObjects(), ecorePackage.getEObject(), null, "OwnedObjects", null, 0, -1, Deserializable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //SerializePackageImpl
