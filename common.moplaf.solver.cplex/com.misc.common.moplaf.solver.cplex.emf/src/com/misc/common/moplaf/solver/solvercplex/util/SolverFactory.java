package com.misc.common.moplaf.solver.solvercplex.util;

import com.misc.common.moplaf.solver.Solver;
import com.misc.common.moplaf.solver.solvercplex.SolvercplexFactory;

public class SolverFactory implements com.misc.common.moplaf.solver.util.SolverFactory {

	public SolverFactory() {
	}

	@Override
	public Solver createSolver() {
		return SolvercplexFactory.eINSTANCE.createSolverCplex();
	}

}
