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
package com.misc.common.moplaf.serialize;

import com.misc.common.moplaf.file.FilePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.misc.common.moplaf.serialize.SerializeFactory
 * @model kind="package"
 * @generated
 */
public interface SerializePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "serialize";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.misc.com/common/moplaf/serialize/model/0.1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "srlz";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SerializePackage eINSTANCE = com.misc.common.moplaf.serialize.impl.SerializePackageImpl.init();

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.serialize.impl.SerializableImpl <em>Serializable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.serialize.impl.SerializableImpl
	 * @see com.misc.common.moplaf.serialize.impl.SerializePackageImpl#getSerializable()
	 * @generated
	 */
	int SERIALIZABLE = 0;

	/**
	 * The feature id for the '<em><b>Files</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIALIZABLE__FILES = FilePackage.FILE_READER_WRITER__FILES;

	/**
	 * The feature id for the '<em><b>Selected File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIALIZABLE__SELECTED_FILE = FilePackage.FILE_READER_WRITER__SELECTED_FILE;

	/**
	 * The feature id for the '<em><b>Handled File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIALIZABLE__HANDLED_FILE = FilePackage.FILE_READER_WRITER__HANDLED_FILE;

	/**
	 * The feature id for the '<em><b>Read Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIALIZABLE__READ_FEEDBACK = FilePackage.FILE_READER_WRITER__READ_FEEDBACK;

	/**
	 * The feature id for the '<em><b>Write Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIALIZABLE__WRITE_FEEDBACK = FilePackage.FILE_READER_WRITER__WRITE_FEEDBACK;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIALIZABLE__NAME = FilePackage.FILE_READER_WRITER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Scheme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIALIZABLE__SCHEME = FilePackage.FILE_READER_WRITER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Selected Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIALIZABLE__SELECTED_OBJECTS = FilePackage.FILE_READER_WRITER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Serializable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIALIZABLE_FEATURE_COUNT = FilePackage.FILE_READER_WRITER_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Read Feedback</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIALIZABLE___GET_READ_FEEDBACK__FILE = FilePackage.FILE_READER_WRITER___GET_READ_FEEDBACK__FILE;

	/**
	 * The operation id for the '<em>Get Write Feedback</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIALIZABLE___GET_WRITE_FEEDBACK__FILE = FilePackage.FILE_READER_WRITER___GET_WRITE_FEEDBACK__FILE;

	/**
	 * The operation id for the '<em>Read File</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIALIZABLE___READ_FILE = FilePackage.FILE_READER_WRITER___READ_FILE;

	/**
	 * The operation id for the '<em>Write File</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIALIZABLE___WRITE_FILE = FilePackage.FILE_READER_WRITER___WRITE_FILE;

	/**
	 * The operation id for the '<em>Read File</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIALIZABLE___READ_FILE__FILE = FilePackage.FILE_READER_WRITER___READ_FILE__FILE;

	/**
	 * The operation id for the '<em>Write File</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIALIZABLE___WRITE_FILE__FILE = FilePackage.FILE_READER_WRITER___WRITE_FILE__FILE;

	/**
	 * The number of operations of the '<em>Serializable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIALIZABLE_OPERATION_COUNT = FilePackage.FILE_READER_WRITER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.serialize.impl.DeserializableImpl <em>Deserializable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.serialize.impl.DeserializableImpl
	 * @see com.misc.common.moplaf.serialize.impl.SerializePackageImpl#getDeserializable()
	 * @generated
	 */
	int DESERIALIZABLE = 1;

	/**
	 * The feature id for the '<em><b>Files</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESERIALIZABLE__FILES = FilePackage.FILE_READER_WRITER__FILES;

	/**
	 * The feature id for the '<em><b>Selected File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESERIALIZABLE__SELECTED_FILE = FilePackage.FILE_READER_WRITER__SELECTED_FILE;

	/**
	 * The feature id for the '<em><b>Handled File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESERIALIZABLE__HANDLED_FILE = FilePackage.FILE_READER_WRITER__HANDLED_FILE;

	/**
	 * The feature id for the '<em><b>Read Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESERIALIZABLE__READ_FEEDBACK = FilePackage.FILE_READER_WRITER__READ_FEEDBACK;

	/**
	 * The feature id for the '<em><b>Write Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESERIALIZABLE__WRITE_FEEDBACK = FilePackage.FILE_READER_WRITER__WRITE_FEEDBACK;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESERIALIZABLE__NAME = FilePackage.FILE_READER_WRITER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Scheme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESERIALIZABLE__SCHEME = FilePackage.FILE_READER_WRITER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owned Objects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESERIALIZABLE__OWNED_OBJECTS = FilePackage.FILE_READER_WRITER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Deserializable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESERIALIZABLE_FEATURE_COUNT = FilePackage.FILE_READER_WRITER_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Read Feedback</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESERIALIZABLE___GET_READ_FEEDBACK__FILE = FilePackage.FILE_READER_WRITER___GET_READ_FEEDBACK__FILE;

	/**
	 * The operation id for the '<em>Get Write Feedback</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESERIALIZABLE___GET_WRITE_FEEDBACK__FILE = FilePackage.FILE_READER_WRITER___GET_WRITE_FEEDBACK__FILE;

	/**
	 * The operation id for the '<em>Read File</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESERIALIZABLE___READ_FILE = FilePackage.FILE_READER_WRITER___READ_FILE;

	/**
	 * The operation id for the '<em>Write File</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESERIALIZABLE___WRITE_FILE = FilePackage.FILE_READER_WRITER___WRITE_FILE;

	/**
	 * The operation id for the '<em>Read File</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESERIALIZABLE___READ_FILE__FILE = FilePackage.FILE_READER_WRITER___READ_FILE__FILE;

	/**
	 * The operation id for the '<em>Write File</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESERIALIZABLE___WRITE_FILE__FILE = FilePackage.FILE_READER_WRITER___WRITE_FILE__FILE;

	/**
	 * The number of operations of the '<em>Deserializable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESERIALIZABLE_OPERATION_COUNT = FilePackage.FILE_READER_WRITER_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.serialize.Serializable <em>Serializable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Serializable</em>'.
	 * @see com.misc.common.moplaf.serialize.Serializable
	 * @generated
	 */
	EClass getSerializable();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.serialize.Serializable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.misc.common.moplaf.serialize.Serializable#getName()
	 * @see #getSerializable()
	 * @generated
	 */
	EAttribute getSerializable_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.serialize.Serializable#getScheme <em>Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scheme</em>'.
	 * @see com.misc.common.moplaf.serialize.Serializable#getScheme()
	 * @see #getSerializable()
	 * @generated
	 */
	EAttribute getSerializable_Scheme();

	/**
	 * Returns the meta object for the reference list '{@link com.misc.common.moplaf.serialize.Serializable#getSelectedObjects <em>Selected Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Selected Objects</em>'.
	 * @see com.misc.common.moplaf.serialize.Serializable#getSelectedObjects()
	 * @see #getSerializable()
	 * @generated
	 */
	EReference getSerializable_SelectedObjects();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.serialize.Deserializable <em>Deserializable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deserializable</em>'.
	 * @see com.misc.common.moplaf.serialize.Deserializable
	 * @generated
	 */
	EClass getDeserializable();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.serialize.Deserializable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.misc.common.moplaf.serialize.Deserializable#getName()
	 * @see #getDeserializable()
	 * @generated
	 */
	EAttribute getDeserializable_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.serialize.Deserializable#getScheme <em>Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scheme</em>'.
	 * @see com.misc.common.moplaf.serialize.Deserializable#getScheme()
	 * @see #getDeserializable()
	 * @generated
	 */
	EAttribute getDeserializable_Scheme();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.common.moplaf.serialize.Deserializable#getOwnedObjects <em>Owned Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Objects</em>'.
	 * @see com.misc.common.moplaf.serialize.Deserializable#getOwnedObjects()
	 * @see #getDeserializable()
	 * @generated
	 */
	EReference getDeserializable_OwnedObjects();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SerializeFactory getSerializeFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.serialize.impl.SerializableImpl <em>Serializable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.serialize.impl.SerializableImpl
		 * @see com.misc.common.moplaf.serialize.impl.SerializePackageImpl#getSerializable()
		 * @generated
		 */
		EClass SERIALIZABLE = eINSTANCE.getSerializable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERIALIZABLE__NAME = eINSTANCE.getSerializable_Name();

		/**
		 * The meta object literal for the '<em><b>Scheme</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERIALIZABLE__SCHEME = eINSTANCE.getSerializable_Scheme();

		/**
		 * The meta object literal for the '<em><b>Selected Objects</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERIALIZABLE__SELECTED_OBJECTS = eINSTANCE.getSerializable_SelectedObjects();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.serialize.impl.DeserializableImpl <em>Deserializable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.serialize.impl.DeserializableImpl
		 * @see com.misc.common.moplaf.serialize.impl.SerializePackageImpl#getDeserializable()
		 * @generated
		 */
		EClass DESERIALIZABLE = eINSTANCE.getDeserializable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESERIALIZABLE__NAME = eINSTANCE.getDeserializable_Name();

		/**
		 * The meta object literal for the '<em><b>Scheme</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESERIALIZABLE__SCHEME = eINSTANCE.getDeserializable_Scheme();

		/**
		 * The meta object literal for the '<em><b>Owned Objects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESERIALIZABLE__OWNED_OBJECTS = eINSTANCE.getDeserializable_OwnedObjects();

	}

} //SerializePackage
