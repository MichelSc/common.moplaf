/*******************************************************************************
 * Copyright (c) 2017 Michel Schaffers and others.
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
package com.misc.common.moplaf.macroplanner.solver;

import com.misc.common.moplaf.solver.Generator;

import com.misc.common.moplaf.solver.GeneratorLpGoal;
import com.misc.common.moplaf.solver.Solver;
import com.misc.common.moplaf.time.discrete.BucketType;
import com.misc.common.moplaf.time.discrete.TimeLine;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>LP Macro Planner</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.LPMacroPlanner#getBucketSize <em>Bucket Size</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.LPMacroPlanner#getProductSet <em>Product Set</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.LPMacroPlanner#getResourceSet <em>Resource Set</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.LPMacroPlanner#getRoutingSet <em>Routing Set</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.LPMacroPlanner#getScenario <em>Scenario</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.LPMacroPlanner#getTimeLine <em>Time Line</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.LPMacroPlanner#getCostRoutings <em>Cost Routings</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.LPMacroPlanner#getCostSupplies <em>Cost Supplies</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.LPMacroPlanner#getCostCapacities <em>Cost Capacities</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.LPMacroPlanner#getCostAvailabilities <em>Cost Availabilities</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.LPMacroPlanner#getPenaltyCapacities <em>Penalty Capacities</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.LPMacroPlanner#getPenaltyAvailabilities <em>Penalty Availabilities</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.LPMacroPlanner#getSolvers <em>Solvers</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage#getLPMacroPlanner()
 * @model
 * @generated
 */
public interface LPMacroPlanner extends Generator {
	/**
	 * Returns the value of the '<em><b>Bucket Size</b></em>' attribute.
	 * The default value is <code>"Day"</code>.
	 * The literals are from the enumeration {@link com.misc.common.moplaf.time.discrete.BucketType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bucket Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bucket Size</em>' attribute.
	 * @see com.misc.common.moplaf.time.discrete.BucketType
	 * @see #setBucketSize(BucketType)
	 * @see com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage#getLPMacroPlanner_BucketSize()
	 * @model default="Day"
	 * @generated
	 */
	BucketType getBucketSize();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.macroplanner.solver.LPMacroPlanner#getBucketSize <em>Bucket Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bucket Size</em>' attribute.
	 * @see com.misc.common.moplaf.time.discrete.BucketType
	 * @see #getBucketSize()
	 * @generated
	 */
	void setBucketSize(BucketType value);

	/**
	 * Returns the value of the '<em><b>Product Set</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.macroplanner.solver.LPProductSet#getMacroPlanner <em>Macro Planner</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Set</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Set</em>' containment reference.
	 * @see #setProductSet(LPProductSet)
	 * @see com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage#getLPMacroPlanner_ProductSet()
	 * @see com.misc.common.moplaf.macroplanner.solver.LPProductSet#getMacroPlanner
	 * @model opposite="MacroPlanner" containment="true" required="true"
	 * @generated
	 */
	LPProductSet getProductSet();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.macroplanner.solver.LPMacroPlanner#getProductSet <em>Product Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Set</em>' containment reference.
	 * @see #getProductSet()
	 * @generated
	 */
	void setProductSet(LPProductSet value);

	/**
	 * Returns the value of the '<em><b>Resource Set</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.macroplanner.solver.LPResourceSet#getMacroPlanner <em>Macro Planner</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Set</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Set</em>' containment reference.
	 * @see #setResourceSet(LPResourceSet)
	 * @see com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage#getLPMacroPlanner_ResourceSet()
	 * @see com.misc.common.moplaf.macroplanner.solver.LPResourceSet#getMacroPlanner
	 * @model opposite="MacroPlanner" containment="true" required="true"
	 * @generated
	 */
	LPResourceSet getResourceSet();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.macroplanner.solver.LPMacroPlanner#getResourceSet <em>Resource Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Set</em>' containment reference.
	 * @see #getResourceSet()
	 * @generated
	 */
	void setResourceSet(LPResourceSet value);

	/**
	 * Returns the value of the '<em><b>Routing Set</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.macroplanner.solver.LPRoutingSet#getMacroPlanner <em>Macro Planner</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Routing Set</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Routing Set</em>' containment reference.
	 * @see #setRoutingSet(LPRoutingSet)
	 * @see com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage#getLPMacroPlanner_RoutingSet()
	 * @see com.misc.common.moplaf.macroplanner.solver.LPRoutingSet#getMacroPlanner
	 * @model opposite="MacroPlanner" containment="true" required="true"
	 * @generated
	 */
	LPRoutingSet getRoutingSet();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.macroplanner.solver.LPMacroPlanner#getRoutingSet <em>Routing Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Routing Set</em>' containment reference.
	 * @see #getRoutingSet()
	 * @generated
	 */
	void setRoutingSet(LPRoutingSet value);

	/**
	 * Returns the value of the '<em><b>Scenario</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.macroplanner.solver.Scenario#getLPs <em>LPs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scenario</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scenario</em>' container reference.
	 * @see #setScenario(Scenario)
	 * @see com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage#getLPMacroPlanner_Scenario()
	 * @see com.misc.common.moplaf.macroplanner.solver.Scenario#getLPs
	 * @model opposite="LPs" required="true" transient="false"
	 * @generated
	 */
	Scenario getScenario();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.macroplanner.solver.LPMacroPlanner#getScenario <em>Scenario</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scenario</em>' container reference.
	 * @see #getScenario()
	 * @generated
	 */
	void setScenario(Scenario value);

	/**
	 * Returns the value of the '<em><b>Time Line</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Line</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Line</em>' containment reference.
	 * @see #setTimeLine(TimeLine)
	 * @see com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage#getLPMacroPlanner_TimeLine()
	 * @model containment="true"
	 * @generated
	 */
	TimeLine getTimeLine();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.macroplanner.solver.LPMacroPlanner#getTimeLine <em>Time Line</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Line</em>' containment reference.
	 * @see #getTimeLine()
	 * @generated
	 */
	void setTimeLine(TimeLine value);

	/**
	 * Returns the value of the '<em><b>Cost Routings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cost Routings</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost Routings</em>' containment reference.
	 * @see #setCostRoutings(GeneratorLpGoal)
	 * @see com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage#getLPMacroPlanner_CostRoutings()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GeneratorLpGoal getCostRoutings();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.macroplanner.solver.LPMacroPlanner#getCostRoutings <em>Cost Routings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost Routings</em>' containment reference.
	 * @see #getCostRoutings()
	 * @generated
	 */
	void setCostRoutings(GeneratorLpGoal value);

	/**
	 * Returns the value of the '<em><b>Cost Supplies</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cost Supplies</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost Supplies</em>' containment reference.
	 * @see #setCostSupplies(GeneratorLpGoal)
	 * @see com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage#getLPMacroPlanner_CostSupplies()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GeneratorLpGoal getCostSupplies();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.macroplanner.solver.LPMacroPlanner#getCostSupplies <em>Cost Supplies</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost Supplies</em>' containment reference.
	 * @see #getCostSupplies()
	 * @generated
	 */
	void setCostSupplies(GeneratorLpGoal value);

	/**
	 * Returns the value of the '<em><b>Cost Capacities</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cost Capacities</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost Capacities</em>' containment reference.
	 * @see #setCostCapacities(GeneratorLpGoal)
	 * @see com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage#getLPMacroPlanner_CostCapacities()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GeneratorLpGoal getCostCapacities();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.macroplanner.solver.LPMacroPlanner#getCostCapacities <em>Cost Capacities</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost Capacities</em>' containment reference.
	 * @see #getCostCapacities()
	 * @generated
	 */
	void setCostCapacities(GeneratorLpGoal value);

	/**
	 * Returns the value of the '<em><b>Cost Availabilities</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cost Availabilities</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost Availabilities</em>' containment reference.
	 * @see #setCostAvailabilities(GeneratorLpGoal)
	 * @see com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage#getLPMacroPlanner_CostAvailabilities()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GeneratorLpGoal getCostAvailabilities();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.macroplanner.solver.LPMacroPlanner#getCostAvailabilities <em>Cost Availabilities</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost Availabilities</em>' containment reference.
	 * @see #getCostAvailabilities()
	 * @generated
	 */
	void setCostAvailabilities(GeneratorLpGoal value);

	/**
	 * Returns the value of the '<em><b>Penalty Capacities</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Penalty Capacities</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Penalty Capacities</em>' containment reference.
	 * @see #setPenaltyCapacities(GeneratorLpGoal)
	 * @see com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage#getLPMacroPlanner_PenaltyCapacities()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GeneratorLpGoal getPenaltyCapacities();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.macroplanner.solver.LPMacroPlanner#getPenaltyCapacities <em>Penalty Capacities</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Penalty Capacities</em>' containment reference.
	 * @see #getPenaltyCapacities()
	 * @generated
	 */
	void setPenaltyCapacities(GeneratorLpGoal value);

	/**
	 * Returns the value of the '<em><b>Penalty Availabilities</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Penalty Availabilities</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Penalty Availabilities</em>' containment reference.
	 * @see #setPenaltyAvailabilities(GeneratorLpGoal)
	 * @see com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage#getLPMacroPlanner_PenaltyAvailabilities()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GeneratorLpGoal getPenaltyAvailabilities();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.macroplanner.solver.LPMacroPlanner#getPenaltyAvailabilities <em>Penalty Availabilities</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Penalty Availabilities</em>' containment reference.
	 * @see #getPenaltyAvailabilities()
	 * @generated
	 */
	void setPenaltyAvailabilities(GeneratorLpGoal value);

	/**
	 * Returns the value of the '<em><b>Solvers</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.solver.Solver}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Solvers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Solvers</em>' containment reference list.
	 * @see com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage#getLPMacroPlanner_Solvers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Solver> getSolvers();

} // LPMacroPlanner
