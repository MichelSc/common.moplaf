package com.misc.common.moplaf.solver.solverscip.util;

import com.misc.common.moplaf.solver.Solver;
import com.misc.common.moplaf.solver.solverscip.SolverscipFactory;

public class SolverFactory implements com.misc.common.moplaf.solver.util.SolverFactory {

	public SolverFactory() {
	}

	@Override
	public Solver createSolver() {
		return SolverscipFactory.eINSTANCE.createSolverScip();
	}

}
