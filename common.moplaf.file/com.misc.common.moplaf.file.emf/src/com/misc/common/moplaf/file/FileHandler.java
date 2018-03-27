/**
 */
package com.misc.common.moplaf.file;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Handler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.file.FileHandler#getSelectedFile <em>Selected File</em>}</li>
 *   <li>{@link com.misc.common.moplaf.file.FileHandler#getHandledFile <em>Handled File</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.file.FilePackage#getFileHandler()
 * @model abstract="true"
 * @generated
 */
public interface FileHandler extends FileOwner {
	/**
	 * Returns the value of the '<em><b>Selected File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selected File</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selected File</em>' reference.
	 * @see #setSelectedFile(File)
	 * @see com.misc.common.moplaf.file.FilePackage#getFileHandler_SelectedFile()
	 * @model
	 * @generated
	 */
	File getSelectedFile();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.file.FileHandler#getSelectedFile <em>Selected File</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selected File</em>' reference.
	 * @see #getSelectedFile()
	 * @generated
	 */
	void setSelectedFile(File value);

	/**
	 * Returns the value of the '<em><b>Handled File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Handled File</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Handled File</em>' reference.
	 * @see com.misc.common.moplaf.file.FilePackage#getFileHandler_HandledFile()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	File getHandledFile();

} // FileHandler
