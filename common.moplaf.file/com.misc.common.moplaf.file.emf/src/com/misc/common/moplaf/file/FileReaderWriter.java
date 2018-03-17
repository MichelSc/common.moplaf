/**
 */
package com.misc.common.moplaf.file;

import com.misc.common.moplaf.common.EnabledFeedback;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reader Writer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.file.FileReaderWriter#getFiles <em>Files</em>}</li>
 *   <li>{@link com.misc.common.moplaf.file.FileReaderWriter#getSelectedFile <em>Selected File</em>}</li>
 *   <li>{@link com.misc.common.moplaf.file.FileReaderWriter#getHandledFile <em>Handled File</em>}</li>
 *   <li>{@link com.misc.common.moplaf.file.FileReaderWriter#getReadFeedback <em>Read Feedback</em>}</li>
 *   <li>{@link com.misc.common.moplaf.file.FileReaderWriter#getWriteFeedback <em>Write Feedback</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.file.FilePackage#getFileReaderWriter()
 * @model abstract="true"
 * @generated
 */
public interface FileReaderWriter extends EObject {
	/**
	 * Returns the value of the '<em><b>Files</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.file.File}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Files</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Files</em>' containment reference list.
	 * @see com.misc.common.moplaf.file.FilePackage#getFileReaderWriter_Files()
	 * @model containment="true"
	 * @generated
	 */
	EList<File> getFiles();

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
	 * @see com.misc.common.moplaf.file.FilePackage#getFileReaderWriter_SelectedFile()
	 * @model
	 * @generated
	 */
	File getSelectedFile();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.file.FileReaderWriter#getSelectedFile <em>Selected File</em>}' reference.
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
	 * @see com.misc.common.moplaf.file.FilePackage#getFileReaderWriter_HandledFile()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	File getHandledFile();

	/**
	 * Returns the value of the '<em><b>Read Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Read Feedback</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Read Feedback</em>' attribute.
	 * @see com.misc.common.moplaf.file.FilePackage#getFileReaderWriter_ReadFeedback()
	 * @model dataType="com.misc.common.moplaf.file.EnabledFeedback" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EnabledFeedback getReadFeedback();

	/**
	 * Returns the value of the '<em><b>Write Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Write Feedback</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Write Feedback</em>' attribute.
	 * @see com.misc.common.moplaf.file.FilePackage#getFileReaderWriter_WriteFeedback()
	 * @model dataType="com.misc.common.moplaf.file.EnabledFeedback" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EnabledFeedback getWriteFeedback();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="com.misc.common.moplaf.file.EnabledFeedback"
	 * @generated
	 */
	EnabledFeedback getReadFeedback(File file);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="com.misc.common.moplaf.file.EnabledFeedback"
	 * @generated
	 */
	EnabledFeedback getWriteFeedback(File file);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void readFile();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void writeFile();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void readFile(File file);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void writeFile(File file);

} // FileReaderWriter
