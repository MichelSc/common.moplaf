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
 * <li>{@link com.misc.common.moplaf.solver.SolutionProvider}: a mechanism providing solutions for a given proble (a Generator)</li> 
 * <li>{@link com.misc.common.moplaf.solver.SolutionReader}: a SolutionProvider, extracting a solution from a file (as produced by some solver, not integrated in the present framework)</li>
 * <li>{@link com.misc.common.moplaf.solver.Solver}: an engine, capable of solving a proble (a Generator), and providing Solutions</li>
 * A Solver will be created for a problem (a Generator), will receive one or several goals (GeneratorGoals).
 * </ul>
 */




package com.misc.common.moplaf.solver;
