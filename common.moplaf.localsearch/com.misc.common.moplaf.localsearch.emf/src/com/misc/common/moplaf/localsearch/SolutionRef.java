/**
 */
package com.misc.common.moplaf.localsearch;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Solution Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.localsearch.SolutionRef#getRole <em>Role</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.SolutionRef#getSolution <em>Solution</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.localsearch.LocalSearchPackage#getSolutionRef()
 * @model
 * @generated
 */
public interface SolutionRef extends EObject {
	/**
	 * Returns the value of the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' attribute.
	 * @see com.misc.common.moplaf.localsearch.LocalSearchPackage#getSolutionRef_Role()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getRole();

	/**
	 * Returns the value of the '<em><b>Solution</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.localsearch.Solution#getReferences <em>References</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Solution</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Solution</em>' reference.
	 * @see #setSolution(Solution)
	 * @see com.misc.common.moplaf.localsearch.LocalSearchPackage#getSolutionRef_Solution()
	 * @see com.misc.common.moplaf.localsearch.Solution#getReferences
	 * @model opposite="References" required="true"
	 * @generated
	 */
	Solution getSolution();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.localsearch.SolutionRef#getSolution <em>Solution</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Solution</em>' reference.
	 * @see #getSolution()
	 * @generated
	 */
	void setSolution(Solution value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void release();

} // SolutionRef
