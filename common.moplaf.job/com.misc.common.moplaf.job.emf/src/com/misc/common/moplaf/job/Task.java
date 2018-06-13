/**
 */
package com.misc.common.moplaf.job;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.job.Task#getDocs <em>Docs</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.job.JobPackage#getTask()
 * @model abstract="true"
 * @generated
 */
public interface Task extends Run {
	/**
	 * Returns the value of the '<em><b>Docs</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.job.DocRef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Docs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Docs</em>' containment reference list.
	 * @see com.misc.common.moplaf.job.JobPackage#getTask_Docs()
	 * @model containment="true"
	 * @generated
	 */
	EList<DocRef> getDocs();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addDoc(Doc doc);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model docsMany="true"
	 * @generated
	 */
	void addDocs(EList<Doc> docs);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void initOutputs();

} // Task
