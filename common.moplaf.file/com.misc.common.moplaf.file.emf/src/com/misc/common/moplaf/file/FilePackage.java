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
package com.misc.common.moplaf.file;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
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
 * @see com.misc.common.moplaf.file.FileFactory
 * @model kind="package"
 * @generated
 */
public interface FilePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "file";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.misc.com/common/moplaf/file/model/0.1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "file";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FilePackage eINSTANCE = com.misc.common.moplaf.file.impl.FilePackageImpl.init();

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.file.impl.FileImpl <em>File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.file.impl.FileImpl
	 * @see com.misc.common.moplaf.file.impl.FilePackageImpl#getFile()
	 * @generated
	 */
	int FILE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__NAME = 0;

	/**
	 * The number of structural features of the '<em>File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.file.impl.ByteFileImpl <em>Byte File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.file.impl.ByteFileImpl
	 * @see com.misc.common.moplaf.file.impl.FilePackageImpl#getByteFile()
	 * @generated
	 */
	int BYTE_FILE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BYTE_FILE__NAME = FILE__NAME;

	/**
	 * The feature id for the '<em><b>Encoding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BYTE_FILE__ENCODING = FILE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Byte File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BYTE_FILE_FEATURE_COUNT = FILE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Byte File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BYTE_FILE_OPERATION_COUNT = FILE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.file.impl.FileLocalImpl <em>Local</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.file.impl.FileLocalImpl
	 * @see com.misc.common.moplaf.file.impl.FilePackageImpl#getFileLocal()
	 * @generated
	 */
	int FILE_LOCAL = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_LOCAL__NAME = BYTE_FILE__NAME;

	/**
	 * The feature id for the '<em><b>Encoding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_LOCAL__ENCODING = BYTE_FILE__ENCODING;

	/**
	 * The feature id for the '<em><b>File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_LOCAL__FILE_PATH = BYTE_FILE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Local</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_LOCAL_FEATURE_COUNT = BYTE_FILE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Local</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_LOCAL_OPERATION_COUNT = BYTE_FILE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.file.impl.FileRemoteImpl <em>Remote</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.file.impl.FileRemoteImpl
	 * @see com.misc.common.moplaf.file.impl.FilePackageImpl#getFileRemote()
	 * @generated
	 */
	int FILE_REMOTE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_REMOTE__NAME = BYTE_FILE__NAME;

	/**
	 * The feature id for the '<em><b>Encoding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_REMOTE__ENCODING = BYTE_FILE__ENCODING;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_REMOTE__URI = BYTE_FILE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Remote</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_REMOTE_FEATURE_COUNT = BYTE_FILE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Remote</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_REMOTE_OPERATION_COUNT = BYTE_FILE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.file.impl.FileInMemoryImpl <em>In Memory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.file.impl.FileInMemoryImpl
	 * @see com.misc.common.moplaf.file.impl.FilePackageImpl#getFileInMemory()
	 * @generated
	 */
	int FILE_IN_MEMORY = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_IN_MEMORY__NAME = FILE__NAME;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_IN_MEMORY__CONTENT = FILE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>In Memory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_IN_MEMORY_FEATURE_COUNT = FILE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>In Memory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_IN_MEMORY_OPERATION_COUNT = FILE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.file.impl.FileOwnerImpl <em>Owner</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.file.impl.FileOwnerImpl
	 * @see com.misc.common.moplaf.file.impl.FilePackageImpl#getFileOwner()
	 * @generated
	 */
	int FILE_OWNER = 6;

	/**
	 * The feature id for the '<em><b>Files</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_OWNER__FILES = 0;

	/**
	 * The number of structural features of the '<em>Owner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_OWNER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Owner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_OWNER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.file.impl.FileHandlerImpl <em>Handler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.file.impl.FileHandlerImpl
	 * @see com.misc.common.moplaf.file.impl.FilePackageImpl#getFileHandler()
	 * @generated
	 */
	int FILE_HANDLER = 5;

	/**
	 * The feature id for the '<em><b>Files</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_HANDLER__FILES = FILE_OWNER__FILES;

	/**
	 * The feature id for the '<em><b>Selected File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_HANDLER__SELECTED_FILE = FILE_OWNER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Handled File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_HANDLER__HANDLED_FILE = FILE_OWNER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_HANDLER_FEATURE_COUNT = FILE_OWNER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_HANDLER_OPERATION_COUNT = FILE_OWNER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.file.impl.FileReaderWriterImpl <em>Reader Writer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.file.impl.FileReaderWriterImpl
	 * @see com.misc.common.moplaf.file.impl.FilePackageImpl#getFileReaderWriter()
	 * @generated
	 */
	int FILE_READER_WRITER = 4;

	/**
	 * The feature id for the '<em><b>Files</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_READER_WRITER__FILES = FILE_HANDLER__FILES;

	/**
	 * The feature id for the '<em><b>Selected File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_READER_WRITER__SELECTED_FILE = FILE_HANDLER__SELECTED_FILE;

	/**
	 * The feature id for the '<em><b>Handled File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_READER_WRITER__HANDLED_FILE = FILE_HANDLER__HANDLED_FILE;

	/**
	 * The feature id for the '<em><b>Read Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_READER_WRITER__READ_FEEDBACK = FILE_HANDLER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Write Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_READER_WRITER__WRITE_FEEDBACK = FILE_HANDLER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Close Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_READER_WRITER__CLOSE_FEEDBACK = FILE_HANDLER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Open</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_READER_WRITER__OPEN = FILE_HANDLER_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Reader Writer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_READER_WRITER_FEATURE_COUNT = FILE_HANDLER_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Read Feedback</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_READER_WRITER___GET_READ_FEEDBACK__FILE = FILE_HANDLER_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Write Feedback</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_READER_WRITER___GET_WRITE_FEEDBACK__FILE = FILE_HANDLER_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Read File</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_READER_WRITER___READ_FILE = FILE_HANDLER_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Write File</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_READER_WRITER___WRITE_FILE = FILE_HANDLER_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Close</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_READER_WRITER___CLOSE = FILE_HANDLER_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Read File</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_READER_WRITER___READ_FILE__FILE = FILE_HANDLER_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Write File</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_READER_WRITER___WRITE_FILE__FILE = FILE_HANDLER_OPERATION_COUNT + 6;

	/**
	 * The number of operations of the '<em>Reader Writer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_READER_WRITER_OPERATION_COUNT = FILE_HANDLER_OPERATION_COUNT + 7;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.file.impl.FilesImpl <em>Files</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.file.impl.FilesImpl
	 * @see com.misc.common.moplaf.file.impl.FilePackageImpl#getFiles()
	 * @generated
	 */
	int FILES = 7;

	/**
	 * The feature id for the '<em><b>Files</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILES__FILES = FILE_OWNER__FILES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILES__NAME = FILE_OWNER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Files</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILES_FEATURE_COUNT = FILE_OWNER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Files</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILES_OPERATION_COUNT = FILE_OWNER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.file.impl.FileOutputImpl <em>Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.file.impl.FileOutputImpl
	 * @see com.misc.common.moplaf.file.impl.FilePackageImpl#getFileOutput()
	 * @generated
	 */
	int FILE_OUTPUT = 9;

	/**
	 * The feature id for the '<em><b>Files</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_OUTPUT__FILES = FILE_OWNER__FILES;

	/**
	 * The feature id for the '<em><b>Output File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_OUTPUT__OUTPUT_FILE = FILE_OWNER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_OUTPUT_FEATURE_COUNT = FILE_OWNER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_OUTPUT_OPERATION_COUNT = FILE_OWNER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.file.FileEncoding <em>Encoding</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.file.FileEncoding
	 * @see com.misc.common.moplaf.file.impl.FilePackageImpl#getFileEncoding()
	 * @generated
	 */
	int FILE_ENCODING = 10;

	/**
	 * The meta object id for the '<em>Enabled Feedback</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.common.EnabledFeedback
	 * @see com.misc.common.moplaf.file.impl.FilePackageImpl#getEnabledFeedback()
	 * @generated
	 */
	int ENABLED_FEEDBACK = 11;


	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.file.File <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File</em>'.
	 * @see com.misc.common.moplaf.file.File
	 * @generated
	 */
	EClass getFile();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.file.File#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.misc.common.moplaf.file.File#getName()
	 * @see #getFile()
	 * @generated
	 */
	EAttribute getFile_Name();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.file.FileLocal <em>Local</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Local</em>'.
	 * @see com.misc.common.moplaf.file.FileLocal
	 * @generated
	 */
	EClass getFileLocal();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.file.FileLocal#getFilePath <em>File Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File Path</em>'.
	 * @see com.misc.common.moplaf.file.FileLocal#getFilePath()
	 * @see #getFileLocal()
	 * @generated
	 */
	EAttribute getFileLocal_FilePath();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.file.FileRemote <em>Remote</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remote</em>'.
	 * @see com.misc.common.moplaf.file.FileRemote
	 * @generated
	 */
	EClass getFileRemote();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.file.FileRemote#getURI <em>URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>URI</em>'.
	 * @see com.misc.common.moplaf.file.FileRemote#getURI()
	 * @see #getFileRemote()
	 * @generated
	 */
	EAttribute getFileRemote_URI();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.file.FileInMemory <em>In Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>In Memory</em>'.
	 * @see com.misc.common.moplaf.file.FileInMemory
	 * @generated
	 */
	EClass getFileInMemory();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.file.FileInMemory#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see com.misc.common.moplaf.file.FileInMemory#getContent()
	 * @see #getFileInMemory()
	 * @generated
	 */
	EAttribute getFileInMemory_Content();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.file.FileReaderWriter <em>Reader Writer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reader Writer</em>'.
	 * @see com.misc.common.moplaf.file.FileReaderWriter
	 * @generated
	 */
	EClass getFileReaderWriter();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.file.FileReaderWriter#getReadFeedback <em>Read Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Read Feedback</em>'.
	 * @see com.misc.common.moplaf.file.FileReaderWriter#getReadFeedback()
	 * @see #getFileReaderWriter()
	 * @generated
	 */
	EAttribute getFileReaderWriter_ReadFeedback();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.file.FileReaderWriter#getWriteFeedback <em>Write Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Write Feedback</em>'.
	 * @see com.misc.common.moplaf.file.FileReaderWriter#getWriteFeedback()
	 * @see #getFileReaderWriter()
	 * @generated
	 */
	EAttribute getFileReaderWriter_WriteFeedback();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.file.FileReaderWriter#getCloseFeedback <em>Close Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Close Feedback</em>'.
	 * @see com.misc.common.moplaf.file.FileReaderWriter#getCloseFeedback()
	 * @see #getFileReaderWriter()
	 * @generated
	 */
	EAttribute getFileReaderWriter_CloseFeedback();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.file.FileReaderWriter#isOpen <em>Open</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Open</em>'.
	 * @see com.misc.common.moplaf.file.FileReaderWriter#isOpen()
	 * @see #getFileReaderWriter()
	 * @generated
	 */
	EAttribute getFileReaderWriter_Open();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.file.FileReaderWriter#getReadFeedback(com.misc.common.moplaf.file.File) <em>Get Read Feedback</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Read Feedback</em>' operation.
	 * @see com.misc.common.moplaf.file.FileReaderWriter#getReadFeedback(com.misc.common.moplaf.file.File)
	 * @generated
	 */
	EOperation getFileReaderWriter__GetReadFeedback__File();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.file.FileReaderWriter#getWriteFeedback(com.misc.common.moplaf.file.File) <em>Get Write Feedback</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Write Feedback</em>' operation.
	 * @see com.misc.common.moplaf.file.FileReaderWriter#getWriteFeedback(com.misc.common.moplaf.file.File)
	 * @generated
	 */
	EOperation getFileReaderWriter__GetWriteFeedback__File();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.file.FileReaderWriter#readFile() <em>Read File</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Read File</em>' operation.
	 * @see com.misc.common.moplaf.file.FileReaderWriter#readFile()
	 * @generated
	 */
	EOperation getFileReaderWriter__ReadFile();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.file.FileReaderWriter#writeFile() <em>Write File</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Write File</em>' operation.
	 * @see com.misc.common.moplaf.file.FileReaderWriter#writeFile()
	 * @generated
	 */
	EOperation getFileReaderWriter__WriteFile();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.file.FileReaderWriter#close() <em>Close</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Close</em>' operation.
	 * @see com.misc.common.moplaf.file.FileReaderWriter#close()
	 * @generated
	 */
	EOperation getFileReaderWriter__Close();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.file.FileReaderWriter#readFile(com.misc.common.moplaf.file.File) <em>Read File</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Read File</em>' operation.
	 * @see com.misc.common.moplaf.file.FileReaderWriter#readFile(com.misc.common.moplaf.file.File)
	 * @generated
	 */
	EOperation getFileReaderWriter__ReadFile__File();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.file.FileReaderWriter#writeFile(com.misc.common.moplaf.file.File) <em>Write File</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Write File</em>' operation.
	 * @see com.misc.common.moplaf.file.FileReaderWriter#writeFile(com.misc.common.moplaf.file.File)
	 * @generated
	 */
	EOperation getFileReaderWriter__WriteFile__File();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.file.FileHandler <em>Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Handler</em>'.
	 * @see com.misc.common.moplaf.file.FileHandler
	 * @generated
	 */
	EClass getFileHandler();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.file.FileHandler#getSelectedFile <em>Selected File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Selected File</em>'.
	 * @see com.misc.common.moplaf.file.FileHandler#getSelectedFile()
	 * @see #getFileHandler()
	 * @generated
	 */
	EReference getFileHandler_SelectedFile();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.file.FileHandler#getHandledFile <em>Handled File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Handled File</em>'.
	 * @see com.misc.common.moplaf.file.FileHandler#getHandledFile()
	 * @see #getFileHandler()
	 * @generated
	 */
	EReference getFileHandler_HandledFile();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.file.FileOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Owner</em>'.
	 * @see com.misc.common.moplaf.file.FileOwner
	 * @generated
	 */
	EClass getFileOwner();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.common.moplaf.file.FileOwner#getFiles <em>Files</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Files</em>'.
	 * @see com.misc.common.moplaf.file.FileOwner#getFiles()
	 * @see #getFileOwner()
	 * @generated
	 */
	EReference getFileOwner_Files();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.file.Files <em>Files</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Files</em>'.
	 * @see com.misc.common.moplaf.file.Files
	 * @generated
	 */
	EClass getFiles();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.file.Files#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.misc.common.moplaf.file.Files#getName()
	 * @see #getFiles()
	 * @generated
	 */
	EAttribute getFiles_Name();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.file.ByteFile <em>Byte File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Byte File</em>'.
	 * @see com.misc.common.moplaf.file.ByteFile
	 * @generated
	 */
	EClass getByteFile();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.file.ByteFile#getEncoding <em>Encoding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Encoding</em>'.
	 * @see com.misc.common.moplaf.file.ByteFile#getEncoding()
	 * @see #getByteFile()
	 * @generated
	 */
	EAttribute getByteFile_Encoding();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.file.FileOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output</em>'.
	 * @see com.misc.common.moplaf.file.FileOutput
	 * @generated
	 */
	EClass getFileOutput();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf.file.FileOutput#getOutputFile <em>Output File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output File</em>'.
	 * @see com.misc.common.moplaf.file.FileOutput#getOutputFile()
	 * @see #getFileOutput()
	 * @generated
	 */
	EReference getFileOutput_OutputFile();

	/**
	 * Returns the meta object for enum '{@link com.misc.common.moplaf.file.FileEncoding <em>Encoding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Encoding</em>'.
	 * @see com.misc.common.moplaf.file.FileEncoding
	 * @generated
	 */
	EEnum getFileEncoding();

	/**
	 * Returns the meta object for data type '{@link com.misc.common.moplaf.common.EnabledFeedback <em>Enabled Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Enabled Feedback</em>'.
	 * @see com.misc.common.moplaf.common.EnabledFeedback
	 * @model instanceClass="com.misc.common.moplaf.common.EnabledFeedback"
	 * @generated
	 */
	EDataType getEnabledFeedback();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FileFactory getFileFactory();

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
		 * The meta object literal for the '{@link com.misc.common.moplaf.file.impl.FileImpl <em>File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.file.impl.FileImpl
		 * @see com.misc.common.moplaf.file.impl.FilePackageImpl#getFile()
		 * @generated
		 */
		EClass FILE = eINSTANCE.getFile();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE__NAME = eINSTANCE.getFile_Name();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.file.impl.FileLocalImpl <em>Local</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.file.impl.FileLocalImpl
		 * @see com.misc.common.moplaf.file.impl.FilePackageImpl#getFileLocal()
		 * @generated
		 */
		EClass FILE_LOCAL = eINSTANCE.getFileLocal();

		/**
		 * The meta object literal for the '<em><b>File Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_LOCAL__FILE_PATH = eINSTANCE.getFileLocal_FilePath();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.file.impl.FileRemoteImpl <em>Remote</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.file.impl.FileRemoteImpl
		 * @see com.misc.common.moplaf.file.impl.FilePackageImpl#getFileRemote()
		 * @generated
		 */
		EClass FILE_REMOTE = eINSTANCE.getFileRemote();

		/**
		 * The meta object literal for the '<em><b>URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_REMOTE__URI = eINSTANCE.getFileRemote_URI();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.file.impl.FileInMemoryImpl <em>In Memory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.file.impl.FileInMemoryImpl
		 * @see com.misc.common.moplaf.file.impl.FilePackageImpl#getFileInMemory()
		 * @generated
		 */
		EClass FILE_IN_MEMORY = eINSTANCE.getFileInMemory();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_IN_MEMORY__CONTENT = eINSTANCE.getFileInMemory_Content();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.file.impl.FileReaderWriterImpl <em>Reader Writer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.file.impl.FileReaderWriterImpl
		 * @see com.misc.common.moplaf.file.impl.FilePackageImpl#getFileReaderWriter()
		 * @generated
		 */
		EClass FILE_READER_WRITER = eINSTANCE.getFileReaderWriter();

		/**
		 * The meta object literal for the '<em><b>Read Feedback</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_READER_WRITER__READ_FEEDBACK = eINSTANCE.getFileReaderWriter_ReadFeedback();

		/**
		 * The meta object literal for the '<em><b>Write Feedback</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_READER_WRITER__WRITE_FEEDBACK = eINSTANCE.getFileReaderWriter_WriteFeedback();

		/**
		 * The meta object literal for the '<em><b>Close Feedback</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_READER_WRITER__CLOSE_FEEDBACK = eINSTANCE.getFileReaderWriter_CloseFeedback();

		/**
		 * The meta object literal for the '<em><b>Open</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_READER_WRITER__OPEN = eINSTANCE.getFileReaderWriter_Open();

		/**
		 * The meta object literal for the '<em><b>Get Read Feedback</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FILE_READER_WRITER___GET_READ_FEEDBACK__FILE = eINSTANCE.getFileReaderWriter__GetReadFeedback__File();

		/**
		 * The meta object literal for the '<em><b>Get Write Feedback</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FILE_READER_WRITER___GET_WRITE_FEEDBACK__FILE = eINSTANCE.getFileReaderWriter__GetWriteFeedback__File();

		/**
		 * The meta object literal for the '<em><b>Read File</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FILE_READER_WRITER___READ_FILE = eINSTANCE.getFileReaderWriter__ReadFile();

		/**
		 * The meta object literal for the '<em><b>Write File</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FILE_READER_WRITER___WRITE_FILE = eINSTANCE.getFileReaderWriter__WriteFile();

		/**
		 * The meta object literal for the '<em><b>Close</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FILE_READER_WRITER___CLOSE = eINSTANCE.getFileReaderWriter__Close();

		/**
		 * The meta object literal for the '<em><b>Read File</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FILE_READER_WRITER___READ_FILE__FILE = eINSTANCE.getFileReaderWriter__ReadFile__File();

		/**
		 * The meta object literal for the '<em><b>Write File</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FILE_READER_WRITER___WRITE_FILE__FILE = eINSTANCE.getFileReaderWriter__WriteFile__File();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.file.impl.FileHandlerImpl <em>Handler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.file.impl.FileHandlerImpl
		 * @see com.misc.common.moplaf.file.impl.FilePackageImpl#getFileHandler()
		 * @generated
		 */
		EClass FILE_HANDLER = eINSTANCE.getFileHandler();

		/**
		 * The meta object literal for the '<em><b>Selected File</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILE_HANDLER__SELECTED_FILE = eINSTANCE.getFileHandler_SelectedFile();

		/**
		 * The meta object literal for the '<em><b>Handled File</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILE_HANDLER__HANDLED_FILE = eINSTANCE.getFileHandler_HandledFile();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.file.impl.FileOwnerImpl <em>Owner</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.file.impl.FileOwnerImpl
		 * @see com.misc.common.moplaf.file.impl.FilePackageImpl#getFileOwner()
		 * @generated
		 */
		EClass FILE_OWNER = eINSTANCE.getFileOwner();

		/**
		 * The meta object literal for the '<em><b>Files</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILE_OWNER__FILES = eINSTANCE.getFileOwner_Files();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.file.impl.FilesImpl <em>Files</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.file.impl.FilesImpl
		 * @see com.misc.common.moplaf.file.impl.FilePackageImpl#getFiles()
		 * @generated
		 */
		EClass FILES = eINSTANCE.getFiles();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILES__NAME = eINSTANCE.getFiles_Name();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.file.impl.ByteFileImpl <em>Byte File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.file.impl.ByteFileImpl
		 * @see com.misc.common.moplaf.file.impl.FilePackageImpl#getByteFile()
		 * @generated
		 */
		EClass BYTE_FILE = eINSTANCE.getByteFile();

		/**
		 * The meta object literal for the '<em><b>Encoding</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BYTE_FILE__ENCODING = eINSTANCE.getByteFile_Encoding();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.file.impl.FileOutputImpl <em>Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.file.impl.FileOutputImpl
		 * @see com.misc.common.moplaf.file.impl.FilePackageImpl#getFileOutput()
		 * @generated
		 */
		EClass FILE_OUTPUT = eINSTANCE.getFileOutput();

		/**
		 * The meta object literal for the '<em><b>Output File</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILE_OUTPUT__OUTPUT_FILE = eINSTANCE.getFileOutput_OutputFile();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.file.FileEncoding <em>Encoding</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.file.FileEncoding
		 * @see com.misc.common.moplaf.file.impl.FilePackageImpl#getFileEncoding()
		 * @generated
		 */
		EEnum FILE_ENCODING = eINSTANCE.getFileEncoding();

		/**
		 * The meta object literal for the '<em>Enabled Feedback</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.common.EnabledFeedback
		 * @see com.misc.common.moplaf.file.impl.FilePackageImpl#getEnabledFeedback()
		 * @generated
		 */
		EDataType ENABLED_FEEDBACK = eINSTANCE.getEnabledFeedback();

	}

} //FilePackage
