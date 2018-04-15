/**
 */
package com.misc.common.moplaf.file;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Byte File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.file.ByteFile#getEncoding <em>Encoding</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.file.FilePackage#getByteFile()
 * @model
 * @generated
 */
public interface ByteFile extends File {
	/**
	 * Returns the value of the '<em><b>Encoding</b></em>' attribute.
	 * The default value is <code>"UTF-8"</code>.
	 * The literals are from the enumeration {@link com.misc.common.moplaf.file.FileEncoding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Encoding</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Encoding</em>' attribute.
	 * @see com.misc.common.moplaf.file.FileEncoding
	 * @see #setEncoding(FileEncoding)
	 * @see com.misc.common.moplaf.file.FilePackage#getByteFile_Encoding()
	 * @model default="UTF-8"
	 * @generated
	 */
	FileEncoding getEncoding();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.file.ByteFile#getEncoding <em>Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encoding</em>' attribute.
	 * @see com.misc.common.moplaf.file.FileEncoding
	 * @see #getEncoding()
	 * @generated
	 */
	void setEncoding(FileEncoding value);

} // ByteFile
