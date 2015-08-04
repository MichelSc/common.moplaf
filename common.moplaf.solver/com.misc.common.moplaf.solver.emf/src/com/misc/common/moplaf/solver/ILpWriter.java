/**
 */
package com.misc.common.moplaf.solver;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ILp Writer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.solver.ILpWriter#getFilePath <em>File Path</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.ILpWriter#getFileFormat <em>File Format</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.ILpWriter#isFileCompressed <em>File Compressed</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.solver.SolverPackage#getILpWriter()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface ILpWriter extends IGeneratorTool {
	/**
	 * Returns the value of the '<em><b>File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File Path</em>' attribute.
	 * @see #setFilePath(String)
	 * @see com.misc.common.moplaf.solver.SolverPackage#getILpWriter_FilePath()
	 * @model
	 * @generated
	 */
	String getFilePath();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.ILpWriter#getFilePath <em>File Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Path</em>' attribute.
	 * @see #getFilePath()
	 * @generated
	 */
	void setFilePath(String value);

	/**
	 * Returns the value of the '<em><b>File Format</b></em>' attribute.
	 * The literals are from the enumeration {@link com.misc.common.moplaf.solver.EnumLpFileFormat}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File Format</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File Format</em>' attribute.
	 * @see com.misc.common.moplaf.solver.EnumLpFileFormat
	 * @see #setFileFormat(EnumLpFileFormat)
	 * @see com.misc.common.moplaf.solver.SolverPackage#getILpWriter_FileFormat()
	 * @model
	 * @generated
	 */
	EnumLpFileFormat getFileFormat();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.ILpWriter#getFileFormat <em>File Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Format</em>' attribute.
	 * @see com.misc.common.moplaf.solver.EnumLpFileFormat
	 * @see #getFileFormat()
	 * @generated
	 */
	void setFileFormat(EnumLpFileFormat value);

	/**
	 * Returns the value of the '<em><b>File Compressed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File Compressed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File Compressed</em>' attribute.
	 * @see #setFileCompressed(boolean)
	 * @see com.misc.common.moplaf.solver.SolverPackage#getILpWriter_FileCompressed()
	 * @model
	 * @generated
	 */
	boolean isFileCompressed();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.ILpWriter#isFileCompressed <em>File Compressed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Compressed</em>' attribute.
	 * @see #isFileCompressed()
	 * @generated
	 */
	void setFileCompressed(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void writeLpToFile();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getLpAsString();

} // ILpWriter
