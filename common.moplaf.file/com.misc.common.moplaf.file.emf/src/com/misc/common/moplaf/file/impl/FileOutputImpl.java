/**
 */
package com.misc.common.moplaf.file.impl;

import com.misc.common.moplaf.file.File;
import com.misc.common.moplaf.file.FileOutput;
import com.misc.common.moplaf.file.FilePackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Output</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.file.impl.FileOutputImpl#getOutputFile <em>Output File</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class FileOutputImpl extends FileOwnerImpl implements FileOutput {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FileOutputImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FilePackage.Literals.FILE_OUTPUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public File getOutputFile() {
		File outputFile = basicGetOutputFile();
		return outputFile != null && outputFile.eIsProxy() ? (File)eResolveProxy((InternalEObject)outputFile) : outputFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public File basicGetOutputFile() {
		// TODO: implement this method to return the 'Output File' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FilePackage.FILE_OUTPUT__OUTPUT_FILE:
				if (resolve) return getOutputFile();
				return basicGetOutputFile();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case FilePackage.FILE_OUTPUT__OUTPUT_FILE:
				return basicGetOutputFile() != null;
		}
		return super.eIsSet(featureID);
	}

} //FileOutputImpl
