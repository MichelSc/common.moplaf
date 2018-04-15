/**
 */
package com.misc.common.moplaf.file;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Local</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.file.FileLocal#getFilePath <em>File Path</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.file.FilePackage#getFileLocal()
 * @model
 * @generated
 */
public interface FileLocal extends ByteFile {
	/**
	 * Returns the value of the '<em><b>File Path</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File Path</em>' attribute.
	 * @see #setFilePath(String)
	 * @see com.misc.common.moplaf.file.FilePackage#getFileLocal_FilePath()
	 * @model default=""
	 * @generated
	 */
	String getFilePath();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.file.FileLocal#getFilePath <em>File Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Path</em>' attribute.
	 * @see #getFilePath()
	 * @generated
	 */
	void setFilePath(String value);

} // FileLocal
