/*******************************************************************************
 * Copyright (c) 2017, 2018 Michel Schaffers and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Michel Schaffers - initial API and implementation
 *******************************************************************************/
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
