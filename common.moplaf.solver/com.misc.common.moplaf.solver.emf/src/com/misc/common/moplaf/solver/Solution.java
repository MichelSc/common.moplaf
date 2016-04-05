/**
 */
package com.misc.common.moplaf.solver;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Solution</b></em>'.
 * <p>
 * A Solution is some solution to a problem formulation {@link Generator} and is produced by
 * some {@link SolutionProvider}, typically a {@link Solver}.
 * <p>
 * A Solution contains
 * <ul>
 *   <li>the value of the solution: accessor {@link #getValue()}</li>
 *   <li>information relative to the solution for some variable: element {@link SolutionVar}</li>
 *   <li>information relative to the solution for some constraint: element {@link SolutionCons}</li>
 * </ul>
 * <p>
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.solver.Solution#getVar <em>Var</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.Solution#getCons <em>Cons</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.Solution#getProvider <em>Provider</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.Solution#getSolutionNr <em>Solution Nr</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.Solution#getCode <em>Code</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.Solution#getValue <em>Value</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.Solution#getGoal <em>Goal</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.solver.SolverPackage#getSolution()
 * @model
 * @generated
 */
public interface Solution extends EObject {

	/**
	 * Returns the value of the '<em><b>Var</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.solver.SolutionVar}.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.solver.SolutionVar#getSolution <em>Solution</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Var</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var</em>' containment reference list.
	 * @see com.misc.common.moplaf.solver.SolverPackage#getSolution_Var()
	 * @see com.misc.common.moplaf.solver.SolutionVar#getSolution
	 * @model opposite="Solution" containment="true"
	 * @generated
	 */
	EList<SolutionVar> getVar();

	/**
	 * Returns the value of the '<em><b>Cons</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.solver.SolutionCons}.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.solver.SolutionCons#getSolution <em>Solution</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cons</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cons</em>' containment reference list.
	 * @see com.misc.common.moplaf.solver.SolverPackage#getSolution_Cons()
	 * @see com.misc.common.moplaf.solver.SolutionCons#getSolution
	 * @model opposite="Solution" containment="true"
	 * @generated
	 */
	EList<SolutionCons> getCons();

	/**
	 * Returns the value of the '<em><b>Provider</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.solver.SolutionProvider#getSolution <em>Solution</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provider</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provider</em>' container reference.
	 * @see #setProvider(SolutionProvider)
	 * @see com.misc.common.moplaf.solver.SolverPackage#getSolution_Provider()
	 * @see com.misc.common.moplaf.solver.SolutionProvider#getSolution
	 * @model opposite="Solution" required="true" transient="false"
	 * @generated
	 */
	SolutionProvider getProvider();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.Solution#getProvider <em>Provider</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provider</em>' container reference.
	 * @see #getProvider()
	 * @generated
	 */
	void setProvider(SolutionProvider value);

	/**
	 * Returns the value of the '<em><b>Solution Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Solution Nr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Solution Nr</em>' attribute.
	 * @see #setSolutionNr(int)
	 * @see com.misc.common.moplaf.solver.SolverPackage#getSolution_SolutionNr()
	 * @model
	 * @generated
	 */
	int getSolutionNr();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.Solution#getSolutionNr <em>Solution Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Solution Nr</em>' attribute.
	 * @see #getSolutionNr()
	 * @generated
	 */
	void setSolutionNr(int value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see com.misc.common.moplaf.solver.SolverPackage#getSolution_Code()
	 * @model volatile="true" derived="true"
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.Solution#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(float)
	 * @see com.misc.common.moplaf.solver.SolverPackage#getSolution_Value()
	 * @model
	 * @generated
	 */
	float getValue();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.solver.Solution#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(float value);

	/**
	 * Returns the value of the '<em><b>Goal</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.solver.SolutionGoal}.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.solver.SolutionGoal#getSolution <em>Solution</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Goal</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Goal</em>' containment reference list.
	 * @see com.misc.common.moplaf.solver.SolverPackage#getSolution_Goal()
	 * @see com.misc.common.moplaf.solver.SolutionGoal#getSolution
	 * @model opposite="Solution" containment="true"
	 * @generated
	 */
	EList<SolutionGoal> getGoal();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	SolutionVar solutionVarFactory();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	SolutionCons solutionConsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	SolutionCons constructSolutionCons(GeneratorCons cons);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	SolutionVar constructSolutionVar(GeneratorVar var);
} // Solution
