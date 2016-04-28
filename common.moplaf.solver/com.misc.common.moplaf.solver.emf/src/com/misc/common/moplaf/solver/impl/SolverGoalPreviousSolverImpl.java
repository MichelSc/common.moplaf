/**
 */
package com.misc.common.moplaf.solver.impl;

import com.misc.common.moplaf.solver.EnumGoalType;
import com.misc.common.moplaf.solver.GeneratorGoal;
import com.misc.common.moplaf.solver.Plugin;
import com.misc.common.moplaf.solver.Solution;
import com.misc.common.moplaf.solver.SolutionGoal;
import com.misc.common.moplaf.solver.Solver;
import com.misc.common.moplaf.solver.SolverGoalPreviousSolver;
import com.misc.common.moplaf.solver.SolverPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Goal Previous Solver</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.solver.impl.SolverGoalPreviousSolverImpl#getPreviousSolver <em>Previous Solver</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.impl.SolverGoalPreviousSolverImpl#getPreviousSolution <em>Previous Solution</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SolverGoalPreviousSolverImpl extends SolverGoalImpl implements SolverGoalPreviousSolver {
	/**
	 * The cached value of the '{@link #getPreviousSolver() <em>Previous Solver</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreviousSolver()
	 * @generated
	 * @ordered
	 */
	protected Solver previousSolver;

	/**
	 * The cached value of the '{@link #getPreviousSolution() <em>Previous Solution</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreviousSolution()
	 * @generated
	 * @ordered
	 */
	protected Solution previousSolution;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SolverGoalPreviousSolverImpl() {
		super();
	}
	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public void buildGoal() throws Exception {
		Solver previousSolver = this.getPreviousSolver();
		if ( previousSolver==null){
			Plugin.INSTANCE.logWarning("Solver, buildGoal: no previous solver, goal ignored");
			return;
		}
		Solution solution = this.getPreviousSolution();
		if ( solution==null){
			Plugin.INSTANCE.logWarning("Solver, buildGoal: no previous solution, arbitrary solution taken");
			solution = previousSolver.getSolution().get(0); 
		}
		if ( solution== null) {
			Plugin.INSTANCE.logWarning("Solver, buildGoal: no previous solution, goal ignored");
			return;
		}
		Solver solver = this.getSolver();
		for ( SolutionGoal solutionGoal: solution.getGoals()){
			if ( solutionGoal.getType()==EnumGoalType.ENUM_LITERAL_GOAL_TYPE_FREE){
				// ignore the goal
			} else {
				GeneratorGoal goal = solutionGoal.getGoal();
				goal.buildCons(solutionGoal, solver);
			}
		}
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SolverPackage.Literals.SOLVER_GOAL_PREVIOUS_SOLVER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Solver getPreviousSolver() {
		if (previousSolver != null && previousSolver.eIsProxy()) {
			InternalEObject oldPreviousSolver = (InternalEObject)previousSolver;
			previousSolver = (Solver)eResolveProxy(oldPreviousSolver);
			if (previousSolver != oldPreviousSolver) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SolverPackage.SOLVER_GOAL_PREVIOUS_SOLVER__PREVIOUS_SOLVER, oldPreviousSolver, previousSolver));
			}
		}
		return previousSolver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Solver basicGetPreviousSolver() {
		return previousSolver;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public String getLabel() {
		Solution solution = this.getPreviousSolution();
		Solver solver = this.getPreviousSolver();
		String label = "Refine "+(solver==null ? "null" : (solution==null ? solver.getCode() : solution.getCode()));
		return label;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreviousSolver(Solver newPreviousSolver) {
		Solver oldPreviousSolver = previousSolver;
		previousSolver = newPreviousSolver;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverPackage.SOLVER_GOAL_PREVIOUS_SOLVER__PREVIOUS_SOLVER, oldPreviousSolver, previousSolver));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Solution getPreviousSolution() {
		if (previousSolution != null && previousSolution.eIsProxy()) {
			InternalEObject oldPreviousSolution = (InternalEObject)previousSolution;
			previousSolution = (Solution)eResolveProxy(oldPreviousSolution);
			if (previousSolution != oldPreviousSolution) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SolverPackage.SOLVER_GOAL_PREVIOUS_SOLVER__PREVIOUS_SOLUTION, oldPreviousSolution, previousSolution));
			}
		}
		return previousSolution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Solution basicGetPreviousSolution() {
		return previousSolution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreviousSolution(Solution newPreviousSolution) {
		Solution oldPreviousSolution = previousSolution;
		previousSolution = newPreviousSolution;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverPackage.SOLVER_GOAL_PREVIOUS_SOLVER__PREVIOUS_SOLUTION, oldPreviousSolution, previousSolution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SolverPackage.SOLVER_GOAL_PREVIOUS_SOLVER__PREVIOUS_SOLVER:
				if (resolve) return getPreviousSolver();
				return basicGetPreviousSolver();
			case SolverPackage.SOLVER_GOAL_PREVIOUS_SOLVER__PREVIOUS_SOLUTION:
				if (resolve) return getPreviousSolution();
				return basicGetPreviousSolution();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SolverPackage.SOLVER_GOAL_PREVIOUS_SOLVER__PREVIOUS_SOLVER:
				setPreviousSolver((Solver)newValue);
				return;
			case SolverPackage.SOLVER_GOAL_PREVIOUS_SOLVER__PREVIOUS_SOLUTION:
				setPreviousSolution((Solution)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SolverPackage.SOLVER_GOAL_PREVIOUS_SOLVER__PREVIOUS_SOLVER:
				setPreviousSolver((Solver)null);
				return;
			case SolverPackage.SOLVER_GOAL_PREVIOUS_SOLVER__PREVIOUS_SOLUTION:
				setPreviousSolution((Solution)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SolverPackage.SOLVER_GOAL_PREVIOUS_SOLVER__PREVIOUS_SOLVER:
				return previousSolver != null;
			case SolverPackage.SOLVER_GOAL_PREVIOUS_SOLVER__PREVIOUS_SOLUTION:
				return previousSolution != null;
		}
		return super.eIsSet(featureID);
	}

} //SolverGoalPreviousSolverImpl
