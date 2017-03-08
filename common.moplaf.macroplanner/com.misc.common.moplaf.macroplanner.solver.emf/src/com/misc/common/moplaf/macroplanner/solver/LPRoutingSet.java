/**
 */
package com.misc.common.moplaf.macroplanner.solver;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>LP Routing Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.LPRoutingSet#getMacroPlanner <em>Macro Planner</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.LPRoutingSet#getRoutings <em>Routings</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage#getLPRoutingSet()
 * @model
 * @generated
 */
public interface LPRoutingSet extends LPTuple {
	/**
	 * Returns the value of the '<em><b>Macro Planner</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.macroplanner.solver.LPMacroPlanner#getRoutingSet <em>Routing Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Macro Planner</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Macro Planner</em>' container reference.
	 * @see #setMacroPlanner(LPMacroPlanner)
	 * @see com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage#getLPRoutingSet_MacroPlanner()
	 * @see com.misc.common.moplaf.macroplanner.solver.LPMacroPlanner#getRoutingSet
	 * @model opposite="RoutingSet" required="true" transient="false"
	 * @generated
	 */
	LPMacroPlanner getMacroPlanner();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.macroplanner.solver.LPRoutingSet#getMacroPlanner <em>Macro Planner</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Macro Planner</em>' container reference.
	 * @see #getMacroPlanner()
	 * @generated
	 */
	void setMacroPlanner(LPMacroPlanner value);

	/**
	 * Returns the value of the '<em><b>Routings</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.macroplanner.solver.LPRouting}.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.macroplanner.solver.LPRouting#getRoutingSet <em>Routing Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Routings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Routings</em>' containment reference list.
	 * @see com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage#getLPRoutingSet_Routings()
	 * @see com.misc.common.moplaf.macroplanner.solver.LPRouting#getRoutingSet
	 * @model opposite="RoutingSet" containment="true"
	 * @generated
	 */
	EList<LPRouting> getRoutings();

} // LPRoutingSet
