package com.misc.common.moplaf.solver.solverlpsolve.util;

import com.misc.common.moplaf.solver.Solver;
import com.misc.common.moplaf.solver.solverlpsolve.SolverlpsolveFactory;

public class SolverFactory implements com.misc.common.moplaf.solver.util.SolverFactory {

	public SolverFactory() {
	}

	@Override
	public Solver createSolver() {
		return SolverlpsolveFactory.eINSTANCE.createSolverLpSolve();
	}

}
