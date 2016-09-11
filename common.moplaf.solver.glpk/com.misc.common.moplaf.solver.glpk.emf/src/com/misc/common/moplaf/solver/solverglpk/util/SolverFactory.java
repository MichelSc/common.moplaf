package com.misc.common.moplaf.solver.solverglpk.util;

import com.misc.common.moplaf.solver.Solver;
import com.misc.common.moplaf.solver.solverglpk.SolverglpkFactory;

public class SolverFactory implements com.misc.common.moplaf.solver.util.SolverFactory {

	public SolverFactory() {
	}

	@Override
	public Solver createSolver() {
		return SolverglpkFactory.eINSTANCE.createSolverGLPK();
	}

}
