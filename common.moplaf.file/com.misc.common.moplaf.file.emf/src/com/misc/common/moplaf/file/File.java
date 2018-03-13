/**
 */
package com.misc.common.moplaf.file;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.file.File#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.file.FilePackage#getFile()
 * @model abstract="true"
 * @generated
 */
public interface File extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.misc.common.moplaf.file.FilePackage#getFile_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.file.File#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);
	
	/**
	 * For reading characters files
	 */
	public default Reader getReader() {
		return null;
	}
	
	/**
	 * For reading raw data files
	 */
	public default InputStream getInputStream() {
		return null;
	}

	/**
	 * For writing characters files
	 */
	public default Writer getWriter() {
		return null;
	}
	
	/**
	 * For writing raw data files
	 */
	public default OutputStream getOutputStream() {
		return null;
	}

} // File
