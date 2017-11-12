/**
 */
package com.misc.common.moplaf.localsearch;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Solution Change</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.localsearch.SolutionChange#getStartSolution <em>Start Solution</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.SolutionChange#getEndSolution <em>End Solution</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.SolutionChange#getNewSolutionOwned <em>New Solution Owned</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.SolutionChange#getPreviousChange <em>Previous Change</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.SolutionChange#getLevel <em>Level</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.SolutionChange#getSolutions <em>Solutions</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.SolutionChange#getSubChanges <em>Sub Changes</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.SolutionChange#getCurrentSolution <em>Current Solution</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.SolutionChange#isKeepSolutions <em>Keep Solutions</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.SolutionChange#isNewSolution <em>New Solution</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.SolutionChange#getSuperChange <em>Super Change</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.localsearch.LocalSearchPackage#getSolutionChange()
 * @model abstract="true"
 * @generated
 */
public interface SolutionChange extends EObject {
	/**
	 * Returns the value of the '<em><b>Start Solution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Solution</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Solution</em>' reference.
	 * @see com.misc.common.moplaf.localsearch.LocalSearchPackage#getSolutionChange_StartSolution()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	Solution getStartSolution();

	/**
	 * Returns the value of the '<em><b>End Solution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Solution</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Solution</em>' reference.
	 * @see com.misc.common.moplaf.localsearch.LocalSearchPackage#getSolutionChange_EndSolution()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	Solution getEndSolution();

	/**
	 * Returns the value of the '<em><b>New Solution Owned</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New Solution Owned</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Solution Owned</em>' containment reference.
	 * @see #setNewSolutionOwned(Solution)
	 * @see com.misc.common.moplaf.localsearch.LocalSearchPackage#getSolutionChange_NewSolutionOwned()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Solution getNewSolutionOwned();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.localsearch.SolutionChange#getNewSolutionOwned <em>New Solution Owned</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Solution Owned</em>' containment reference.
	 * @see #getNewSolutionOwned()
	 * @generated
	 */
	void setNewSolutionOwned(Solution value);

	/**
	 * Returns the value of the '<em><b>Previous Change</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Previous Change</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Previous Change</em>' reference.
	 * @see com.misc.common.moplaf.localsearch.LocalSearchPackage#getSolutionChange_PreviousChange()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	SolutionChange getPreviousChange();

	/**
	 * Returns the value of the '<em><b>Level</b></em>' attribute.
	 * The literals are from the enumeration {@link com.misc.common.moplaf.localsearch.StrategyLevel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level</em>' attribute.
	 * @see com.misc.common.moplaf.localsearch.StrategyLevel
	 * @see com.misc.common.moplaf.localsearch.LocalSearchPackage#getSolutionChange_Level()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	StrategyLevel getLevel();

	/**
	 * Returns the value of the '<em><b>Solutions</b></em>' reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.localsearch.Solution}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Solutions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Solutions</em>' reference list.
	 * @see com.misc.common.moplaf.localsearch.LocalSearchPackage#getSolutionChange_Solutions()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<Solution> getSolutions();

	/**
	 * Returns the value of the '<em><b>Sub Changes</b></em>' reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.localsearch.SolutionChange}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Changes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Changes</em>' reference list.
	 * @see com.misc.common.moplaf.localsearch.LocalSearchPackage#getSolutionChange_SubChanges()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<SolutionChange> getSubChanges();

	/**
	 * Returns the value of the '<em><b>Current Solution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current Solution</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Solution</em>' reference.
	 * @see #setCurrentSolution(Solution)
	 * @see com.misc.common.moplaf.localsearch.LocalSearchPackage#getSolutionChange_CurrentSolution()
	 * @model
	 * @generated
	 */
	Solution getCurrentSolution();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.localsearch.SolutionChange#getCurrentSolution <em>Current Solution</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Solution</em>' reference.
	 * @see #getCurrentSolution()
	 * @generated
	 */
	void setCurrentSolution(Solution value);

	/**
	 * Returns the value of the '<em><b>Keep Solutions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Keep Solutions</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Keep Solutions</em>' attribute.
	 * @see com.misc.common.moplaf.localsearch.LocalSearchPackage#getSolutionChange_KeepSolutions()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	boolean isKeepSolutions();

	/**
	 * Returns the value of the '<em><b>New Solution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New Solution</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Solution</em>' attribute.
	 * @see com.misc.common.moplaf.localsearch.LocalSearchPackage#getSolutionChange_NewSolution()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	boolean isNewSolution();

	/**
	 * Returns the value of the '<em><b>Super Change</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super Change</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Change</em>' reference.
	 * @see com.misc.common.moplaf.localsearch.LocalSearchPackage#getSolutionChange_SuperChange()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	SolutionChange getSuperChange();

} // SolutionChange
