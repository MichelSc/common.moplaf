/**
 */
package com.misc.common.moplaf.localsearch;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Improvment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An Improvment is supposed to improve a solution. So it receives a solution, that will be modified and be possible better at the end of the execution.
 * For this, it will execute a set of Actions.
 * An improvment is the unit of execution at the end of which it is evaluated if the current solution is kept or not, and what is the next current solution.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.localsearch.Improvment#getMaxIterations <em>Max Iterations</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.Improvment#getMaxSeconds <em>Max Seconds</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.Improvment#getActions <em>Actions</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.localsearch.LocalSearchPackage#getImprovment()
 * @model abstract="true"
 * @generated
 */
public interface Improvment extends EObject {
	/**
	 * Returns the value of the '<em><b>Max Iterations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Iterations</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Iterations</em>' attribute.
	 * @see #setMaxIterations(int)
	 * @see com.misc.common.moplaf.localsearch.LocalSearchPackage#getImprovment_MaxIterations()
	 * @model
	 * @generated
	 */
	int getMaxIterations();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.localsearch.Improvment#getMaxIterations <em>Max Iterations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Iterations</em>' attribute.
	 * @see #getMaxIterations()
	 * @generated
	 */
	void setMaxIterations(int value);

	/**
	 * Returns the value of the '<em><b>Max Seconds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Seconds</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Seconds</em>' attribute.
	 * @see #setMaxSeconds(float)
	 * @see com.misc.common.moplaf.localsearch.LocalSearchPackage#getImprovment_MaxSeconds()
	 * @model
	 * @generated
	 */
	float getMaxSeconds();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.localsearch.Improvment#getMaxSeconds <em>Max Seconds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Seconds</em>' attribute.
	 * @see #getMaxSeconds()
	 * @generated
	 */
	void setMaxSeconds(float value);

	/**
	 * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.localsearch.Action}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' containment reference list.
	 * @see com.misc.common.moplaf.localsearch.LocalSearchPackage#getImprovment_Actions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Action> getActions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void createActions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void doIteration();

} // Improvment
