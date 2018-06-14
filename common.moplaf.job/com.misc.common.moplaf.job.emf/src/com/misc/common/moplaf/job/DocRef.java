/**
 */
package com.misc.common.moplaf.job;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Doc Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.job.DocRef#getDoc <em>Doc</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.job.JobPackage#getDocRef()
 * @model abstract="true"
 * @generated
 */
public interface DocRef extends EObject {
	/**
	 * Returns the value of the '<em><b>Doc</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.job.Doc#getRefs <em>Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Doc</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Doc</em>' reference.
	 * @see #setDoc(Doc)
	 * @see com.misc.common.moplaf.job.JobPackage#getDocRef_Doc()
	 * @see com.misc.common.moplaf.job.Doc#getRefs
	 * @model opposite="Refs" required="true"
	 * @generated
	 */
	Doc getDoc();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.job.DocRef#getDoc <em>Doc</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Doc</em>' reference.
	 * @see #getDoc()
	 * @generated
	 */
	void setDoc(Doc value);

} // DocRef
