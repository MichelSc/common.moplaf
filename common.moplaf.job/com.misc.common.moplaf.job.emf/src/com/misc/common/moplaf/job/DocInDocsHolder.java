/**
 */
package com.misc.common.moplaf.job;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Doc In Docs Holder</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.job.DocInDocsHolder#getDocsHolder <em>Docs Holder</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.job.JobPackage#getDocInDocsHolder()
 * @model
 * @generated
 */
public interface DocInDocsHolder extends DocRef {
	/**
	 * Returns the value of the '<em><b>Docs Holder</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.job.DocsHolder#getDocs <em>Docs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Docs Holder</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Docs Holder</em>' container reference.
	 * @see #setDocsHolder(DocsHolder)
	 * @see com.misc.common.moplaf.job.JobPackage#getDocInDocsHolder_DocsHolder()
	 * @see com.misc.common.moplaf.job.DocsHolder#getDocs
	 * @model opposite="Docs" required="true" transient="false"
	 * @generated
	 */
	DocsHolder getDocsHolder();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.job.DocInDocsHolder#getDocsHolder <em>Docs Holder</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Docs Holder</em>' container reference.
	 * @see #getDocsHolder()
	 * @generated
	 */
	void setDocsHolder(DocsHolder value);

} // DocInDocsHolder
