/**
 */
package com.misc.common.moplaf.localsearch;

import com.misc.common.moplaf.job.Run;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Strategy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Solve the problem.
 * Manage a pool of solutions.
 * Carry out the improvment stetps one be one.
 * For every improvment step:
 *   - iterate a number of times (limited in number or in time)
 *  - select a solution in the pool
 *  - do the improvment
 *  - decide if the new solutions makes it to the pool or not
 *    is this not too early?
 *    should we not iterate a little bit before deciding copy or not copy?
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.localsearch.Strategy#getImprovments <em>Improvments</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.Strategy#getBestSolution <em>Best Solution</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.Strategy#getSolutions <em>Solutions</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.Strategy#getCurrentSolutionNr <em>Current Solution Nr</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.Strategy#getMaxNrSolutions <em>Max Nr Solutions</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.Strategy#getName <em>Name</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.Strategy#getChanceSelectBest <em>Chance Select Best</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.Strategy#getChanceSelectWorst <em>Chance Select Worst</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.localsearch.LocalSearchPackage#getStrategy()
 * @model abstract="true"
 * @generated
 */
public interface Strategy extends Run {
	/**
	 * Returns the value of the '<em><b>Improvments</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.localsearch.Improvment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Improvments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Improvments</em>' containment reference list.
	 * @see com.misc.common.moplaf.localsearch.LocalSearchPackage#getStrategy_Improvments()
	 * @model containment="true"
	 * @generated
	 */
	EList<Improvment> getImprovments();

	/**
	 * Returns the value of the '<em><b>Best Solution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Best Solution</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Best Solution</em>' reference.
	 * @see #setBestSolution(Solution)
	 * @see com.misc.common.moplaf.localsearch.LocalSearchPackage#getStrategy_BestSolution()
	 * @model
	 * @generated
	 */
	Solution getBestSolution();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.localsearch.Strategy#getBestSolution <em>Best Solution</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Best Solution</em>' reference.
	 * @see #getBestSolution()
	 * @generated
	 */
	void setBestSolution(Solution value);

	/**
	 * Returns the value of the '<em><b>Solutions</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.localsearch.Solution}.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.localsearch.Solution#getStrategy <em>Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Solutions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Solutions</em>' containment reference list.
	 * @see com.misc.common.moplaf.localsearch.LocalSearchPackage#getStrategy_Solutions()
	 * @see com.misc.common.moplaf.localsearch.Solution#getStrategy
	 * @model opposite="Strategy" containment="true"
	 * @generated
	 */
	EList<Solution> getSolutions();

	/**
	 * Returns the value of the '<em><b>Current Solution Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current Solution Nr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Solution Nr</em>' attribute.
	 * @see #setCurrentSolutionNr(int)
	 * @see com.misc.common.moplaf.localsearch.LocalSearchPackage#getStrategy_CurrentSolutionNr()
	 * @model
	 * @generated
	 */
	int getCurrentSolutionNr();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.localsearch.Strategy#getCurrentSolutionNr <em>Current Solution Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Solution Nr</em>' attribute.
	 * @see #getCurrentSolutionNr()
	 * @generated
	 */
	void setCurrentSolutionNr(int value);

	/**
	 * Returns the value of the '<em><b>Max Nr Solutions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Nr Solutions</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Nr Solutions</em>' attribute.
	 * @see #setMaxNrSolutions(int)
	 * @see com.misc.common.moplaf.localsearch.LocalSearchPackage#getStrategy_MaxNrSolutions()
	 * @model
	 * @generated
	 */
	int getMaxNrSolutions();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.localsearch.Strategy#getMaxNrSolutions <em>Max Nr Solutions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Nr Solutions</em>' attribute.
	 * @see #getMaxNrSolutions()
	 * @generated
	 */
	void setMaxNrSolutions(int value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.misc.common.moplaf.localsearch.LocalSearchPackage#getStrategy_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.localsearch.Strategy#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Chance Select Best</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Chance Select Best</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Chance Select Best</em>' attribute.
	 * @see #setChanceSelectBest(double)
	 * @see com.misc.common.moplaf.localsearch.LocalSearchPackage#getStrategy_ChanceSelectBest()
	 * @model default="1.0"
	 * @generated
	 */
	double getChanceSelectBest();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.localsearch.Strategy#getChanceSelectBest <em>Chance Select Best</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Chance Select Best</em>' attribute.
	 * @see #getChanceSelectBest()
	 * @generated
	 */
	void setChanceSelectBest(double value);

	/**
	 * Returns the value of the '<em><b>Chance Select Worst</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Chance Select Worst</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Chance Select Worst</em>' attribute.
	 * @see #setChanceSelectWorst(double)
	 * @see com.misc.common.moplaf.localsearch.LocalSearchPackage#getStrategy_ChanceSelectWorst()
	 * @model default="1.0"
	 * @generated
	 */
	double getChanceSelectWorst();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.localsearch.Strategy#getChanceSelectWorst <em>Chance Select Worst</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Chance Select Worst</em>' attribute.
	 * @see #getChanceSelectWorst()
	 * @generated
	 */
	void setChanceSelectWorst(double value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Solution selectGoodSolution();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Solution selectBadSolution();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void sortSolutions();

} // Strategy
