/**
 */
package com.misc.common.moplaf.job;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Docs</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.job.Docs#getDocs <em>Docs</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.job.JobPackage#getDocs()
 * @model
 * @generated
 */
public interface Docs extends EObject {
	/**
	 * Returns the value of the '<em><b>Docs</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.job.Doc}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Docs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Docs</em>' containment reference list.
	 * @see com.misc.common.moplaf.job.JobPackage#getDocs_Docs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Doc> getDocs();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void garbageCollect();

} // Docs
