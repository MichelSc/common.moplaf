/**
 */
package com.misc.common.moplaf.file;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.misc.common.moplaf.file.FilePackage
 * @generated
 */
public interface FileFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FileFactory eINSTANCE = com.misc.common.moplaf.file.impl.FileFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Local</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Local</em>'.
	 * @generated
	 */
	FileLocal createFileLocal();

	/**
	 * Returns a new object of class '<em>Remote</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Remote</em>'.
	 * @generated
	 */
	FileRemote createFileRemote();

	/**
	 * Returns a new object of class '<em>In Memory</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>In Memory</em>'.
	 * @generated
	 */
	FileInMemory createFileInMemory();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	FilePackage getFilePackage();

} //FileFactory
