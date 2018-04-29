/*******************************************************************************
 * Copyright (c) 2017, 2018 Michel Schaffers and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Michel Schaffers - initial API and implementation
 *******************************************************************************/
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
 * A Phase is the main loop of the resolution process, while a Step is an iteration of this Loop. A Step is supposed to improve a solution.
 * 
 * The phase will keep iterating up to a max number of iterations or to a max durations.
 * 
 * The execution flow of a Step is 1) to select a solution in the pool as a function of the attribute SelectBestChance, 2) to improve the selected solution by performing Actions, 3) to put the resulting Solution in the pool and 4) to prune the pool of Solution as a function of the attribute SelectWorstChance.
 * 
 * The Actions to be performed in a Step are provided by the concrete class, in the method doStempImpl, that must 1) create the Actions, 2) execute them by calling doAction.
 * 
 * The KeepLevel attribute controls the level of Data to be kept for debugging purposes.
 * 
 * 
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
 *   <li>{@link com.misc.common.moplaf.localsearch.Phase#getSelectBestChance <em>Select Best Chance</em>}</li>
 *   <li>{@link com.misc.common.moplaf.localsearch.Phase#getSelectWorstChance <em>Select Worst Chance</em>}</li>
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
	 * The default value is <code>"10"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Steps</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Steps</em>' attribute.
	 * @see #setMaxSteps(int)
	 * @see com.misc.common.moplaf.localsearch.LocalSearchPackage#getPhase_MaxSteps()
	 * @model default="10"
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
	 * The default value is <code>"60"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Seconds</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Seconds</em>' attribute.
	 * @see #setMaxSeconds(float)
	 * @see com.misc.common.moplaf.localsearch.LocalSearchPackage#getPhase_MaxSeconds()
	 * @model default="60"
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
	 * Returns the value of the '<em><b>Select Best Chance</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Select Best Chance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Select Best Chance</em>' attribute.
	 * @see #setSelectBestChance(double)
	 * @see com.misc.common.moplaf.localsearch.LocalSearchPackage#getPhase_SelectBestChance()
	 * @model default="1.0"
	 * @generated
	 */
	double getSelectBestChance();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.localsearch.Phase#getSelectBestChance <em>Select Best Chance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Select Best Chance</em>' attribute.
	 * @see #getSelectBestChance()
	 * @generated
	 */
	void setSelectBestChance(double value);

	/**
	 * Returns the value of the '<em><b>Select Worst Chance</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Select Worst Chance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Select Worst Chance</em>' attribute.
	 * @see #setSelectWorstChance(double)
	 * @see com.misc.common.moplaf.localsearch.LocalSearchPackage#getPhase_SelectWorstChance()
	 * @model default="1.0"
	 * @generated
	 */
	double getSelectWorstChance();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.localsearch.Phase#getSelectWorstChance <em>Select Worst Chance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Select Worst Chance</em>' attribute.
	 * @see #getSelectWorstChance()
	 * @generated
	 */
	void setSelectWorstChance(double value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void doPhase();

} // Phase
