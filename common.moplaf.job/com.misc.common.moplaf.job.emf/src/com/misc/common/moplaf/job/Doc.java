/**
 */
package com.misc.common.moplaf.job;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Doc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.job.Doc#getRefs <em>Refs</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.Doc#isLoaded <em>Loaded</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.job.JobPackage#getDoc()
 * @model abstract="true"
 * @generated
 */
public interface Doc extends EObject {
	/**
	 * Returns the value of the '<em><b>Refs</b></em>' reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.job.DocRef}.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.job.DocRef#getDoc <em>Doc</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refs</em>' reference list.
	 * @see com.misc.common.moplaf.job.JobPackage#getDoc_Refs()
	 * @see com.misc.common.moplaf.job.DocRef#getDoc
	 * @model opposite="Doc"
	 * @generated
	 */
	EList<DocRef> getRefs();

	/**
	 * Returns the value of the '<em><b>Loaded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Loaded</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loaded</em>' attribute.
	 * @see #setLoaded(boolean)
	 * @see com.misc.common.moplaf.job.JobPackage#getDoc_Loaded()
	 * @model
	 * @generated
	 */
	boolean isLoaded();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.job.Doc#isLoaded <em>Loaded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loaded</em>' attribute.
	 * @see #isLoaded()
	 * @generated
	 */
	void setLoaded(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void save();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void load();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void flush();

} // Doc
