/**
 */
package com.misc.common.moplaf.localsearch;

import java.util.Date;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Phase</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An Improvment is supposed to improve a solution. So it receives a solution, that will be modified and be possibly better at the end of the execution.
 * For this, it will execute a set of Actions.
 * An improvment is the unit of execution at the end of which it is evaluated if the current solution is kept or not, and what is the next current solution.
 * The framework will iterate on the improvments. The iterations will limited by a max number of iterations and and maximum duration.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.localsearch.Phase#getName <em>Name</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.Phase#getKeepLevel <em>Keep Level</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.Phase#getMaxSteps <em>Max Steps</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.Phase#getMaxSeconds <em>Max Seconds</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.Phase#getPhaseStart <em>Phase Start</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.Phase#getPhaseEnd <em>Phase End</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.Phase#getNrSteps <em>Nr Steps</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.Phase#getDurationTotal <em>Duration Total</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.Phase#getDurationAverage <em>Duration Average</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.Phase#getStrategy <em>Strategy</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.Phase#getSteps <em>Steps</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.localsearch.LocalSearchPackage#getPhase()
 * @model abstract="true"
 * @generated
 */
public interface Phase extends EObject {
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
	 * @see com.misc.common.moplaf.localsearch.LocalSearchPackage#getPhase_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.localsearch.Phase#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Keep Level</b></em>' attribute.
	 * The literals are from the enumeration {@link com.misc.common.moplaf.localsearch.StrategyLevel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Keep Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Keep Level</em>' attribute.
	 * @see com.misc.common.moplaf.localsearch.StrategyLevel
	 * @see #setKeepLevel(StrategyLevel)
	 * @see com.misc.common.moplaf.localsearch.LocalSearchPackage#getPhase_KeepLevel()
	 * @model
	 * @generated
	 */
	StrategyLevel getKeepLevel();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.localsearch.Phase#getKeepLevel <em>Keep Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Keep Level</em>' attribute.
	 * @see com.misc.common.moplaf.localsearch.StrategyLevel
	 * @see #getKeepLevel()
	 * @generated
	 */
	void setKeepLevel(StrategyLevel value);

	/**
	 * Returns the value of the '<em><b>Max Steps</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Steps</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Steps</em>' attribute.
	 * @see #setMaxSteps(int)
	 * @see com.misc.common.moplaf.localsearch.LocalSearchPackage#getPhase_MaxSteps()
	 * @model
	 * @generated
	 */
	int getMaxSteps();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.localsearch.Phase#getMaxSteps <em>Max Steps</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Steps</em>' attribute.
	 * @see #getMaxSteps()
	 * @generated
	 */
	void setMaxSteps(int value);

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
	 * @see com.misc.common.moplaf.localsearch.LocalSearchPackage#getPhase_MaxSeconds()
	 * @model
	 * @generated
	 */
	float getMaxSeconds();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.localsearch.Phase#getMaxSeconds <em>Max Seconds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Seconds</em>' attribute.
	 * @see #getMaxSeconds()
	 * @generated
	 */
	void setMaxSeconds(float value);

	/**
	 * Returns the value of the '<em><b>Phase Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phase Start</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phase Start</em>' attribute.
	 * @see #setPhaseStart(Date)
	 * @see com.misc.common.moplaf.localsearch.LocalSearchPackage#getPhase_PhaseStart()
	 * @model
	 * @generated
	 */
	Date getPhaseStart();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.localsearch.Phase#getPhaseStart <em>Phase Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phase Start</em>' attribute.
	 * @see #getPhaseStart()
	 * @generated
	 */
	void setPhaseStart(Date value);

	/**
	 * Returns the value of the '<em><b>Phase End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phase End</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phase End</em>' attribute.
	 * @see #setPhaseEnd(Date)
	 * @see com.misc.common.moplaf.localsearch.LocalSearchPackage#getPhase_PhaseEnd()
	 * @model
	 * @generated
	 */
	Date getPhaseEnd();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.localsearch.Phase#getPhaseEnd <em>Phase End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phase End</em>' attribute.
	 * @see #getPhaseEnd()
	 * @generated
	 */
	void setPhaseEnd(Date value);

	/**
	 * Returns the value of the '<em><b>Nr Steps</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nr Steps</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nr Steps</em>' attribute.
	 * @see #setNrSteps(int)
	 * @see com.misc.common.moplaf.localsearch.LocalSearchPackage#getPhase_NrSteps()
	 * @model
	 * @generated
	 */
	int getNrSteps();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.localsearch.Phase#getNrSteps <em>Nr Steps</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nr Steps</em>' attribute.
	 * @see #getNrSteps()
	 * @generated
	 */
	void setNrSteps(int value);

	/**
	 * Returns the value of the '<em><b>Duration Total</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duration Total</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration Total</em>' attribute.
	 * @see #setDurationTotal(float)
	 * @see com.misc.common.moplaf.localsearch.LocalSearchPackage#getPhase_DurationTotal()
	 * @model
	 * @generated
	 */
	float getDurationTotal();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.localsearch.Phase#getDurationTotal <em>Duration Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration Total</em>' attribute.
	 * @see #getDurationTotal()
	 * @generated
	 */
	void setDurationTotal(float value);

	/**
	 * Returns the value of the '<em><b>Duration Average</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duration Average</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration Average</em>' attribute.
	 * @see #setDurationAverage(float)
	 * @see com.misc.common.moplaf.localsearch.LocalSearchPackage#getPhase_DurationAverage()
	 * @model
	 * @generated
	 */
	float getDurationAverage();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.localsearch.Phase#getDurationAverage <em>Duration Average</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration Average</em>' attribute.
	 * @see #getDurationAverage()
	 * @generated
	 */
	void setDurationAverage(float value);

	/**
	 * Returns the value of the '<em><b>Strategy</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.localsearch.Strategy#getPhases <em>Phases</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Strategy</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strategy</em>' container reference.
	 * @see #setStrategy(Strategy)
	 * @see com.misc.common.moplaf.localsearch.LocalSearchPackage#getPhase_Strategy()
	 * @see com.misc.common.moplaf.localsearch.Strategy#getPhases
	 * @model opposite="Phases" required="true" transient="false"
	 * @generated
	 */
	Strategy getStrategy();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.localsearch.Phase#getStrategy <em>Strategy</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strategy</em>' container reference.
	 * @see #getStrategy()
	 * @generated
	 */
	void setStrategy(Strategy value);

	/**
	 * Returns the value of the '<em><b>Steps</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.localsearch.Step}.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.localsearch.Step#getPhase <em>Phase</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Steps</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Steps</em>' containment reference list.
	 * @see com.misc.common.moplaf.localsearch.LocalSearchPackage#getPhase_Steps()
	 * @see com.misc.common.moplaf.localsearch.Step#getPhase
	 * @model opposite="Phase" containment="true"
	 * @generated
	 */
	EList<Step> getSteps();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void doPhase();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void doStep(Step step);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void doAction(Step step, Action action);

} // Phase
