/**
 */
package com.misc.common.moplaf.macroplanner.solver;

import com.misc.common.moplaf.macroplanner.SupplyChainData;
import com.misc.common.moplaf.macroplanner.SupplyChainMasterData;
import com.misc.common.moplaf.macroplanner.SupplyChainRoutings;
import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scenario</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.Scenario#getLPs <em>LPs</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.Scenario#getName <em>Name</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.Scenario#getScenarioStart <em>Scenario Start</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.Scenario#getScenarioEnd <em>Scenario End</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.Scenario#getSelectedMasterData <em>Selected Master Data</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.Scenario#getSelectedData <em>Selected Data</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.Scenario#getSelectedRoutings <em>Selected Routings</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage#getScenario()
 * @model
 * @generated
 */
public interface Scenario extends EObject {
	/**
	 * Returns the value of the '<em><b>LPs</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.macroplanner.solver.LPMacroPlanner}.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.macroplanner.solver.LPMacroPlanner#getScenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>LPs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>LPs</em>' containment reference list.
	 * @see com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage#getScenario_LPs()
	 * @see com.misc.common.moplaf.macroplanner.solver.LPMacroPlanner#getScenario
	 * @model opposite="Scenario" containment="true"
	 * @generated
	 */
	EList<LPMacroPlanner> getLPs();

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
	 * @see com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage#getScenario_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.macroplanner.solver.Scenario#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Scenario Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scenario Start</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scenario Start</em>' attribute.
	 * @see #setScenarioStart(Date)
	 * @see com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage#getScenario_ScenarioStart()
	 * @model
	 * @generated
	 */
	Date getScenarioStart();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.macroplanner.solver.Scenario#getScenarioStart <em>Scenario Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scenario Start</em>' attribute.
	 * @see #getScenarioStart()
	 * @generated
	 */
	void setScenarioStart(Date value);

	/**
	 * Returns the value of the '<em><b>Scenario End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scenario End</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scenario End</em>' attribute.
	 * @see #setScenarioEnd(Date)
	 * @see com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage#getScenario_ScenarioEnd()
	 * @model
	 * @generated
	 */
	Date getScenarioEnd();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.macroplanner.solver.Scenario#getScenarioEnd <em>Scenario End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scenario End</em>' attribute.
	 * @see #getScenarioEnd()
	 * @generated
	 */
	void setScenarioEnd(Date value);

	/**
	 * Returns the value of the '<em><b>Selected Master Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selected Master Data</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selected Master Data</em>' reference.
	 * @see #setSelectedMasterData(SupplyChainMasterData)
	 * @see com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage#getScenario_SelectedMasterData()
	 * @model
	 * @generated
	 */
	SupplyChainMasterData getSelectedMasterData();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.macroplanner.solver.Scenario#getSelectedMasterData <em>Selected Master Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selected Master Data</em>' reference.
	 * @see #getSelectedMasterData()
	 * @generated
	 */
	void setSelectedMasterData(SupplyChainMasterData value);

	/**
	 * Returns the value of the '<em><b>Selected Data</b></em>' reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.macroplanner.SupplyChainData}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selected Data</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selected Data</em>' reference list.
	 * @see com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage#getScenario_SelectedData()
	 * @model
	 * @generated
	 */
	EList<SupplyChainData> getSelectedData();

	/**
	 * Returns the value of the '<em><b>Selected Routings</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selected Routings</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selected Routings</em>' reference.
	 * @see #setSelectedRoutings(SupplyChainRoutings)
	 * @see com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage#getScenario_SelectedRoutings()
	 * @model
	 * @generated
	 */
	SupplyChainRoutings getSelectedRoutings();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.macroplanner.solver.Scenario#getSelectedRoutings <em>Selected Routings</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selected Routings</em>' reference.
	 * @see #getSelectedRoutings()
	 * @generated
	 */
	void setSelectedRoutings(SupplyChainRoutings value);

} // Scenario
