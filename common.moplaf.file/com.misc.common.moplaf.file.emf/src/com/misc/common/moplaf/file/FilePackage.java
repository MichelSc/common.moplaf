/**
 */
package com.misc.common.moplaf.file;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

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
	int FILE_LOCAL__NAME = FILE__NAME;

	/**
	 * The feature id for the '<em><b>File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_LOCAL__FILE_PATH = FILE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Local</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_LOCAL_FEATURE_COUNT = FILE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Local</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_LOCAL_OPERATION_COUNT = FILE_OPERATION_COUNT + 0;

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
	int FILE_REMOTE__NAME = FILE__NAME;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_REMOTE__URI = FILE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Remote</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_REMOTE_FEATURE_COUNT = FILE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Remote</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_REMOTE_OPERATION_COUNT = FILE_OPERATION_COUNT + 0;

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
	 * The meta object id for the '{@link com.misc.common.moplaf.file.FileReader <em>Reader</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.file.FileReader
	 * @see com.misc.common.moplaf.file.impl.FilePackageImpl#getFileReader()
	 * @generated
	 */
	int FILE_READER = 4;

	/**
	 * The number of structural features of the '<em>Reader</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_READER_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Read File</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_READER___READ_FILE__FILE = 0;

	/**
	 * The number of operations of the '<em>Reader</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_READER_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.file.FileWriter <em>Writer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.file.FileWriter
	 * @see com.misc.common.moplaf.file.impl.FilePackageImpl#getFileWriter()
	 * @generated
	 */
	int FILE_WRITER = 5;

	/**
	 * The number of structural features of the '<em>Writer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_WRITER_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Write File</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_WRITER___WRITE_FILE__FILE = 0;

	/**
	 * The number of operations of the '<em>Writer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_WRITER_OPERATION_COUNT = 1;


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
	 * Returns the meta object for class '{@link com.misc.common.moplaf.file.FileReader <em>Reader</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reader</em>'.
	 * @see com.misc.common.moplaf.file.FileReader
	 * @generated
	 */
	EClass getFileReader();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.file.FileReader#readFile(com.misc.common.moplaf.file.File) <em>Read File</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Read File</em>' operation.
	 * @see com.misc.common.moplaf.file.FileReader#readFile(com.misc.common.moplaf.file.File)
	 * @generated
	 */
	EOperation getFileReader__ReadFile__File();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.file.FileWriter <em>Writer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Writer</em>'.
	 * @see com.misc.common.moplaf.file.FileWriter
	 * @generated
	 */
	EClass getFileWriter();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf.file.FileWriter#writeFile(com.misc.common.moplaf.file.File) <em>Write File</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Write File</em>' operation.
	 * @see com.misc.common.moplaf.file.FileWriter#writeFile(com.misc.common.moplaf.file.File)
	 * @generated
	 */
	EOperation getFileWriter__WriteFile__File();

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
		 * The meta object literal for the '{@link com.misc.common.moplaf.file.FileReader <em>Reader</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.file.FileReader
		 * @see com.misc.common.moplaf.file.impl.FilePackageImpl#getFileReader()
		 * @generated
		 */
		EClass FILE_READER = eINSTANCE.getFileReader();

		/**
		 * The meta object literal for the '<em><b>Read File</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FILE_READER___READ_FILE__FILE = eINSTANCE.getFileReader__ReadFile__File();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.file.FileWriter <em>Writer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.file.FileWriter
		 * @see com.misc.common.moplaf.file.impl.FilePackageImpl#getFileWriter()
		 * @generated
		 */
		EClass FILE_WRITER = eINSTANCE.getFileWriter();

		/**
		 * The meta object literal for the '<em><b>Write File</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FILE_WRITER___WRITE_FILE__FILE = eINSTANCE.getFileWriter__WriteFile__File();

	}

} //FilePackage
