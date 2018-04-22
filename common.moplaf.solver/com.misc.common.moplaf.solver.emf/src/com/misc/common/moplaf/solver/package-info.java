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
/**
 * Provides functions to manage solvers.
 * <ul>
 * <li> {@link com.misc.common.moplaf.solver.Generator}: a problem that can be handled by a solver, and supporting the following concepts  
 * <ul>
 *   <li> {@link com.misc.common.moplaf.solver.GeneratorVar}: a variable, for which the solver will select an (optimal) value </li>  
 *   <li> {@link com.misc.common.moplaf.solver.GeneratorCons}: a constraint, that must be satisfied by the solver </li>  
 *   <li> {@link com.misc.common.moplaf.solver.GeneratorGoal}: a goal, that the solver will try to reach </li>
 * </ul>
 * </li>
 * <li>{@link com.misc.common.moplaf.solver.SolutionProvider}: a mechanism providing solutions for a given problem (a Generator)</li> 
 * <li>{@link com.misc.common.moplaf.solver.SolutionReader}: a SolutionProvider, extracting a solution from a file (as produced by some solver, not integrated in the present framework)</li>
 * <li>{@link com.misc.common.moplaf.solver.Solver}: an engine, capable of solving a problem (a Generator), and providing Solutions</li>
 * </ul>
 * <p>
 * A Solver will be created for a problem (a Generator), will receive one or several goals (GeneratorGoals).
 */




package com.misc.common.moplaf.solver;
