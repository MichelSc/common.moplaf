package com.misc.common.moplaf.solver.solvergurobi.util;

import com.misc.common.moplaf.solver.Solver;
import com.misc.common.moplaf.solver.solvergurobi.SolvergurobiFactory;

public class SolverFactory implements com.misc.common.moplaf.solver.util.SolverFactory {

	public SolverFactory() {
	}

	@Override
	public Solver createSolver() {
		return SolvergurobiFactory.eINSTANCE.createSolverGurobi();
	}

}
