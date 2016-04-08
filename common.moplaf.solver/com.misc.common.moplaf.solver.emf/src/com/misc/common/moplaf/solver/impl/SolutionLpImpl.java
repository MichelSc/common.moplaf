/**
 */
package com.misc.common.moplaf.solver.impl;

import com.misc.common.moplaf.solver.SolutionCons;
import com.misc.common.moplaf.solver.SolutionGoal;
import com.misc.common.moplaf.solver.SolutionLp;
import com.misc.common.moplaf.solver.SolutionVar;
import com.misc.common.moplaf.solver.SolverFactory;
import com.misc.common.moplaf.solver.SolverPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Solution Lp</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class SolutionLpImpl extends SolutionImpl implements SolutionLp {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SolutionLpImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SolverPackage.Literals.SOLUTION_LP;
	}

	@Override
	public SolutionVar solutionVarFactory() {
		SolutionVar newSolutionVar = SolverFactory.eINSTANCE.createSolutionLpVar();
		return newSolutionVar;
	}

	@Override
	public SolutionCons solutionConsFactory() {
		SolutionCons newSolutionCons = SolverFactory.eINSTANCE.createSolutionLpCons();
		return newSolutionCons;
	}

	@Override
	public SolutionGoal solutionGoalFactory() {
		SolutionGoal newSolutionGoal = SolverFactory.eINSTANCE.createSolutionLpGoal();
		return newSolutionGoal;
	}
	
	

} //SolutionLpImpl
