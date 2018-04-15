/**
 */
package com.misc.common.moplaf.file.impl;

import com.misc.common.moplaf.common.EnabledFeedback;
import com.misc.common.moplaf.file.ByteFile;
import com.misc.common.moplaf.file.File;
import com.misc.common.moplaf.file.FileEncoding;
import com.misc.common.moplaf.file.FileFactory;
import com.misc.common.moplaf.file.FileHandler;
import com.misc.common.moplaf.file.FileInMemory;
import com.misc.common.moplaf.file.FileLocal;
import com.misc.common.moplaf.file.FileOutput;
import com.misc.common.moplaf.file.FileOwner;
import com.misc.common.moplaf.file.FilePackage;
import com.misc.common.moplaf.file.FileReaderWriter;
import com.misc.common.moplaf.file.FileRemote;
import com.misc.common.moplaf.file.Files;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FilePackageImpl extends EPackageImpl implements FilePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileLocalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileRemoteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileInMemoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileReaderWriterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileHandlerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileOwnerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass filesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass byteFileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileOutputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum fileEncodingEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enabledFeedbackEDataType = null;

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
	 * @see com.misc.common.moplaf.file.FilePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FilePackageImpl() {
		super(eNS_URI, FileFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link FilePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static FilePackage init() {
		if (isInited) return (FilePackage)EPackage.Registry.INSTANCE.getEPackage(FilePackage.eNS_URI);

		// Obtain or create and register package
		FilePackageImpl theFilePackage = (FilePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof FilePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new FilePackageImpl());

		isInited = true;

		// Create package meta-data objects
		theFilePackage.createPackageContents();

		// Initialize created meta-data
		theFilePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theFilePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(FilePackage.eNS_URI, theFilePackage);
		return theFilePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFile() {
		return fileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFile_Name() {
		return (EAttribute)fileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFileLocal() {
		return fileLocalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFileLocal_FilePath() {
		return (EAttribute)fileLocalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFileRemote() {
		return fileRemoteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFileRemote_URI() {
		return (EAttribute)fileRemoteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFileInMemory() {
		return fileInMemoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFileInMemory_Content() {
		return (EAttribute)fileInMemoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFileReaderWriter() {
		return fileReaderWriterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFileReaderWriter_ReadFeedback() {
		return (EAttribute)fileReaderWriterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFileReaderWriter_WriteFeedback() {
		return (EAttribute)fileReaderWriterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFileReaderWriter__GetReadFeedback__File() {
		return fileReaderWriterEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFileReaderWriter__GetWriteFeedback__File() {
		return fileReaderWriterEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFileReaderWriter__ReadFile() {
		return fileReaderWriterEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFileReaderWriter__WriteFile() {
		return fileReaderWriterEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFileReaderWriter__ReadFile__File() {
		return fileReaderWriterEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFileReaderWriter__WriteFile__File() {
		return fileReaderWriterEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFileHandler() {
		return fileHandlerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFileHandler_SelectedFile() {
		return (EReference)fileHandlerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFileHandler_HandledFile() {
		return (EReference)fileHandlerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFileOwner() {
		return fileOwnerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFileOwner_Files() {
		return (EReference)fileOwnerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFiles() {
		return filesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFiles_Name() {
		return (EAttribute)filesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getByteFile() {
		return byteFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getByteFile_Encoding() {
		return (EAttribute)byteFileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFileOutput() {
		return fileOutputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFileOutput_OutputFile() {
		return (EReference)fileOutputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFileEncoding() {
		return fileEncodingEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEnabledFeedback() {
		return enabledFeedbackEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileFactory getFileFactory() {
		return (FileFactory)getEFactoryInstance();
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
		fileEClass = createEClass(FILE);
		createEAttribute(fileEClass, FILE__NAME);

		fileLocalEClass = createEClass(FILE_LOCAL);
		createEAttribute(fileLocalEClass, FILE_LOCAL__FILE_PATH);

		fileRemoteEClass = createEClass(FILE_REMOTE);
		createEAttribute(fileRemoteEClass, FILE_REMOTE__URI);

		fileInMemoryEClass = createEClass(FILE_IN_MEMORY);
		createEAttribute(fileInMemoryEClass, FILE_IN_MEMORY__CONTENT);

		fileReaderWriterEClass = createEClass(FILE_READER_WRITER);
		createEAttribute(fileReaderWriterEClass, FILE_READER_WRITER__READ_FEEDBACK);
		createEAttribute(fileReaderWriterEClass, FILE_READER_WRITER__WRITE_FEEDBACK);
		createEOperation(fileReaderWriterEClass, FILE_READER_WRITER___GET_READ_FEEDBACK__FILE);
		createEOperation(fileReaderWriterEClass, FILE_READER_WRITER___GET_WRITE_FEEDBACK__FILE);
		createEOperation(fileReaderWriterEClass, FILE_READER_WRITER___READ_FILE);
		createEOperation(fileReaderWriterEClass, FILE_READER_WRITER___WRITE_FILE);
		createEOperation(fileReaderWriterEClass, FILE_READER_WRITER___READ_FILE__FILE);
		createEOperation(fileReaderWriterEClass, FILE_READER_WRITER___WRITE_FILE__FILE);

		fileHandlerEClass = createEClass(FILE_HANDLER);
		createEReference(fileHandlerEClass, FILE_HANDLER__SELECTED_FILE);
		createEReference(fileHandlerEClass, FILE_HANDLER__HANDLED_FILE);

		fileOwnerEClass = createEClass(FILE_OWNER);
		createEReference(fileOwnerEClass, FILE_OWNER__FILES);

		filesEClass = createEClass(FILES);
		createEAttribute(filesEClass, FILES__NAME);

		byteFileEClass = createEClass(BYTE_FILE);
		createEAttribute(byteFileEClass, BYTE_FILE__ENCODING);

		fileOutputEClass = createEClass(FILE_OUTPUT);
		createEReference(fileOutputEClass, FILE_OUTPUT__OUTPUT_FILE);

		// Create enums
		fileEncodingEEnum = createEEnum(FILE_ENCODING);

		// Create data types
		enabledFeedbackEDataType = createEDataType(ENABLED_FEEDBACK);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		fileLocalEClass.getESuperTypes().add(this.getByteFile());
		fileRemoteEClass.getESuperTypes().add(this.getByteFile());
		fileInMemoryEClass.getESuperTypes().add(this.getFile());
		fileReaderWriterEClass.getESuperTypes().add(this.getFileHandler());
		fileHandlerEClass.getESuperTypes().add(this.getFileOwner());
		filesEClass.getESuperTypes().add(this.getFileOwner());
		byteFileEClass.getESuperTypes().add(this.getFile());
		fileOutputEClass.getESuperTypes().add(this.getFileOwner());

		// Initialize classes, features, and operations; add parameters
		initEClass(fileEClass, File.class, "File", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFile_Name(), ecorePackage.getEString(), "Name", null, 0, 1, File.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fileLocalEClass, FileLocal.class, "FileLocal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFileLocal_FilePath(), ecorePackage.getEString(), "FilePath", "", 0, 1, FileLocal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fileRemoteEClass, FileRemote.class, "FileRemote", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFileRemote_URI(), ecorePackage.getEString(), "URI", "", 0, 1, FileRemote.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fileInMemoryEClass, FileInMemory.class, "FileInMemory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFileInMemory_Content(), ecorePackage.getEString(), "Content", "", 0, 1, FileInMemory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fileReaderWriterEClass, FileReaderWriter.class, "FileReaderWriter", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFileReaderWriter_ReadFeedback(), this.getEnabledFeedback(), "ReadFeedback", null, 0, 1, FileReaderWriter.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getFileReaderWriter_WriteFeedback(), this.getEnabledFeedback(), "WriteFeedback", null, 0, 1, FileReaderWriter.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getFileReaderWriter__GetReadFeedback__File(), this.getEnabledFeedback(), "getReadFeedback", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getFile(), "file", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getFileReaderWriter__GetWriteFeedback__File(), this.getEnabledFeedback(), "getWriteFeedback", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getFile(), "file", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getFileReaderWriter__ReadFile(), null, "readFile", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getFileReaderWriter__WriteFile(), null, "writeFile", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getFileReaderWriter__ReadFile__File(), null, "readFile", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getFile(), "file", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getFileReaderWriter__WriteFile__File(), null, "writeFile", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getFile(), "file", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(fileHandlerEClass, FileHandler.class, "FileHandler", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFileHandler_SelectedFile(), this.getFile(), null, "SelectedFile", null, 0, 1, FileHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFileHandler_HandledFile(), this.getFile(), null, "HandledFile", null, 0, 1, FileHandler.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(fileOwnerEClass, FileOwner.class, "FileOwner", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFileOwner_Files(), this.getFile(), null, "Files", null, 0, -1, FileOwner.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(filesEClass, Files.class, "Files", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFiles_Name(), ecorePackage.getEString(), "Name", null, 0, 1, Files.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(byteFileEClass, ByteFile.class, "ByteFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getByteFile_Encoding(), this.getFileEncoding(), "Encoding", "UTF-8", 0, 1, ByteFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fileOutputEClass, FileOutput.class, "FileOutput", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFileOutput_OutputFile(), this.getFile(), null, "OutputFile", null, 0, 1, FileOutput.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(fileEncodingEEnum, FileEncoding.class, "FileEncoding");
		addEEnumLiteral(fileEncodingEEnum, FileEncoding.US_ASCII);
		addEEnumLiteral(fileEncodingEEnum, FileEncoding.ISO_8859_1);
		addEEnumLiteral(fileEncodingEEnum, FileEncoding.UTF_8);
		addEEnumLiteral(fileEncodingEEnum, FileEncoding.UTF_16);
		addEEnumLiteral(fileEncodingEEnum, FileEncoding.UTF_16BE);
		addEEnumLiteral(fileEncodingEEnum, FileEncoding.UTF_16LE);

		// Initialize data types
		initEDataType(enabledFeedbackEDataType, EnabledFeedback.class, "EnabledFeedback", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //FilePackageImpl
