/**
 */
package com.misc.common.moplaf.file.impl;

import com.misc.common.moplaf.file.*;

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
public class FileFactoryImpl extends EFactoryImpl implements FileFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FileFactory init() {
		try {
			FileFactory theFileFactory = (FileFactory)EPackage.Registry.INSTANCE.getEFactory(FilePackage.eNS_URI);
			if (theFileFactory != null) {
				return theFileFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FileFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileFactoryImpl() {
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
			case FilePackage.FILE_LOCAL: return createFileLocal();
			case FilePackage.FILE_REMOTE: return createFileRemote();
			case FilePackage.FILE_IN_MEMORY: return createFileInMemory();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileLocal createFileLocal() {
		FileLocalImpl fileLocal = new FileLocalImpl();
		return fileLocal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileRemote createFileRemote() {
		FileRemoteImpl fileRemote = new FileRemoteImpl();
		return fileRemote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileInMemory createFileInMemory() {
		FileInMemoryImpl fileInMemory = new FileInMemoryImpl();
		return fileInMemory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilePackage getFilePackage() {
		return (FilePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FilePackage getPackage() {
		return FilePackage.eINSTANCE;
	}

} //FileFactoryImpl