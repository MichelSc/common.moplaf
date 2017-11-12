/**
 */
package com.misc.common.moplaf.localsearch;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.localsearch.Step#getActions <em>Actions</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.Step#getStepNr <em>Step Nr</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.Step#getPhase <em>Phase</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.Step#getStartSolutionOwned <em>Start Solution Owned</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.localsearch.LocalSearchPackage#getStep()
 * @model
 * @generated
 */
public interface Step extends SolutionChange {
	/**
	 * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.localsearch.Action}.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.localsearch.Action#getStep <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' containment reference list.
	 * @see com.misc.common.moplaf.localsearch.LocalSearchPackage#getStep_Actions()
	 * @see com.misc.common.moplaf.localsearch.Action#getStep
	 * @model opposite="Step" containment="true"
	 * @generated
	 */
	EList<Action> getActions();

	/**
	 * Returns the value of the '<em><b>Step Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Step Nr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step Nr</em>' attribute.
	 * @see #setStepNr(int)
	 * @see com.misc.common.moplaf.localsearch.LocalSearchPackage#getStep_StepNr()
	 * @model
	 * @generated
	 */
	int getStepNr();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.localsearch.Step#getStepNr <em>Step Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Step Nr</em>' attribute.
	 * @see #getStepNr()
	 * @generated
	 */
	void setStepNr(int value);

	/**
	 * Returns the value of the '<em><b>Phase</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.localsearch.Phase#getSteps <em>Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phase</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phase</em>' container reference.
	 * @see #setPhase(Phase)
	 * @see com.misc.common.moplaf.localsearch.LocalSearchPackage#getStep_Phase()
	 * @see com.misc.common.moplaf.localsearch.Phase#getSteps
	 * @model opposite="Steps" required="true" transient="false"
	 * @generated
	 */
	Phase getPhase();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.localsearch.Step#getPhase <em>Phase</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phase</em>' container reference.
	 * @see #getPhase()
	 * @generated
	 */
	void setPhase(Phase value);

	/**
	 * Returns the value of the '<em><b>Start Solution Owned</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Solution Owned</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Solution Owned</em>' containment reference.
	 * @see #setStartSolutionOwned(Solution)
	 * @see com.misc.common.moplaf.localsearch.LocalSearchPackage#getStep_StartSolutionOwned()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Solution getStartSolutionOwned();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.localsearch.Step#getStartSolutionOwned <em>Start Solution Owned</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Solution Owned</em>' containment reference.
	 * @see #getStartSolutionOwned()
	 * @generated
	 */
	void setStartSolutionOwned(Solution value);

} // Step
