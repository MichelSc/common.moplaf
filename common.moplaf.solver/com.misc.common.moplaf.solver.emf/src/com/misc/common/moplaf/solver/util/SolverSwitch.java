/*******************************************************************************
 * Copyright (c) 2017 Michel Schaffers and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Michel Schaffers - initial API and implementation
 *******************************************************************************/
/**
 */
package com.misc.common.moplaf.solver.util;

import com.misc.common.moplaf.job.Run;
import com.misc.common.moplaf.job.RunParams;
import com.misc.common.moplaf.solver.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see com.misc.common.moplaf.solver.SolverPackage
 * @generated
 */
public class SolverSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SolverPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolverSwitch() {
		if (modelPackage == null) {
			modelPackage = SolverPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case SolverPackage.GENERATOR: {
				Generator generator = (Generator)theEObject;
				T result = caseGenerator(generator);
				if (result == null) result = caseRun(generator);
				if (result == null) result = caseRunParams(generator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SolverPackage.GENERATOR_ELEMENT: {
				GeneratorElement generatorElement = (GeneratorElement)theEObject;
				T result = caseGeneratorElement(generatorElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SolverPackage.GENERATOR_TUPLE: {
				GeneratorTuple generatorTuple = (GeneratorTuple)theEObject;
				T result = caseGeneratorTuple(generatorTuple);
				if (result == null) result = caseGeneratorElement(generatorTuple);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SolverPackage.GENERATOR_TUPLE_MEMBER: {
				GeneratorTupleMember generatorTupleMember = (GeneratorTupleMember)theEObject;
				T result = caseGeneratorTupleMember(generatorTupleMember);
				if (result == null) result = caseGeneratorElement(generatorTupleMember);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SolverPackage.GENERATOR_VAR: {
				GeneratorVar generatorVar = (GeneratorVar)theEObject;
				T result = caseGeneratorVar(generatorVar);
				if (result == null) result = caseGeneratorTupleMember(generatorVar);
				if (result == null) result = caseGeneratorElement(generatorVar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SolverPackage.GENERATOR_LP_VAR: {
				GeneratorLpVar generatorLpVar = (GeneratorLpVar)theEObject;
				T result = caseGeneratorLpVar(generatorLpVar);
				if (result == null) result = caseGeneratorVar(generatorLpVar);
				if (result == null) result = caseGeneratorTupleMember(generatorLpVar);
				if (result == null) result = caseGeneratorElement(generatorLpVar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SolverPackage.GENERATOR_CONS: {
				GeneratorCons generatorCons = (GeneratorCons)theEObject;
				T result = caseGeneratorCons(generatorCons);
				if (result == null) result = caseGeneratorTupleMember(generatorCons);
				if (result == null) result = caseGeneratorElement(generatorCons);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SolverPackage.GENERATOR_LP_CONS: {
				GeneratorLpCons generatorLpCons = (GeneratorLpCons)theEObject;
				T result = caseGeneratorLpCons(generatorLpCons);
				if (result == null) result = caseGeneratorCons(generatorLpCons);
				if (result == null) result = caseGeneratorLpLinear(generatorLpCons);
				if (result == null) result = caseGeneratorTupleMember(generatorLpCons);
				if (result == null) result = caseGeneratorElement(generatorLpCons);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SolverPackage.GENERATOR_LP_TERM: {
				GeneratorLpTerm generatorLpTerm = (GeneratorLpTerm)theEObject;
				T result = caseGeneratorLpTerm(generatorLpTerm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SolverPackage.IGENERATOR_TOOL: {
				IGeneratorTool iGeneratorTool = (IGeneratorTool)theEObject;
				T result = caseIGeneratorTool(iGeneratorTool);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SolverPackage.SOLUTION_READER: {
				SolutionReader solutionReader = (SolutionReader)theEObject;
				T result = caseSolutionReader(solutionReader);
				if (result == null) result = caseSolutionProvider(solutionReader);
				if (result == null) result = caseRun(solutionReader);
				if (result == null) result = caseIGeneratorTool(solutionReader);
				if (result == null) result = caseSolutionProviderParams(solutionReader);
				if (result == null) result = caseRunParams(solutionReader);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SolverPackage.SOLUTION_READER_PATTERN: {
				SolutionReaderPattern solutionReaderPattern = (SolutionReaderPattern)theEObject;
				T result = caseSolutionReaderPattern(solutionReaderPattern);
				if (result == null) result = caseSolutionReader(solutionReaderPattern);
				if (result == null) result = caseSolutionProvider(solutionReaderPattern);
				if (result == null) result = caseRun(solutionReaderPattern);
				if (result == null) result = caseIGeneratorTool(solutionReaderPattern);
				if (result == null) result = caseSolutionProviderParams(solutionReaderPattern);
				if (result == null) result = caseRunParams(solutionReaderPattern);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SolverPackage.ILP_WRITER: {
				ILpWriter iLpWriter = (ILpWriter)theEObject;
				T result = caseILpWriter(iLpWriter);
				if (result == null) result = caseIGeneratorTool(iLpWriter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SolverPackage.SOLUTION_PROVIDER: {
				SolutionProvider solutionProvider = (SolutionProvider)theEObject;
				T result = caseSolutionProvider(solutionProvider);
				if (result == null) result = caseRun(solutionProvider);
				if (result == null) result = caseIGeneratorTool(solutionProvider);
				if (result == null) result = caseSolutionProviderParams(solutionProvider);
				if (result == null) result = caseRunParams(solutionProvider);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SolverPackage.SOLVER: {
				Solver solver = (Solver)theEObject;
				T result = caseSolver(solver);
				if (result == null) result = caseSolutionProvider(solver);
				if (result == null) result = caseSolverParams(solver);
				if (result == null) result = caseRun(solver);
				if (result == null) result = caseIGeneratorTool(solver);
				if (result == null) result = caseSolutionProviderParams(solver);
				if (result == null) result = caseRunParams(solver);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SolverPackage.SOLVER_CP: {
				SolverCp solverCp = (SolverCp)theEObject;
				T result = caseSolverCp(solverCp);
				if (result == null) result = caseSolver(solverCp);
				if (result == null) result = caseSolutionProvider(solverCp);
				if (result == null) result = caseSolverParams(solverCp);
				if (result == null) result = caseRun(solverCp);
				if (result == null) result = caseIGeneratorTool(solverCp);
				if (result == null) result = caseSolutionProviderParams(solverCp);
				if (result == null) result = caseRunParams(solverCp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SolverPackage.SOLVER_LP: {
				SolverLp solverLp = (SolverLp)theEObject;
				T result = caseSolverLp(solverLp);
				if (result == null) result = caseSolver(solverLp);
				if (result == null) result = caseSolverLpParams(solverLp);
				if (result == null) result = caseSolutionProvider(solverLp);
				if (result == null) result = caseSolverParams(solverLp);
				if (result == null) result = caseRun(solverLp);
				if (result == null) result = caseIGeneratorTool(solverLp);
				if (result == null) result = caseSolutionProviderParams(solverLp);
				if (result == null) result = caseRunParams(solverLp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SolverPackage.SOLVER_GOAL: {
				SolverGoal solverGoal = (SolverGoal)theEObject;
				T result = caseSolverGoal(solverGoal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SolverPackage.SOLVER_GENERATOR_GOAL: {
				SolverGeneratorGoal solverGeneratorGoal = (SolverGeneratorGoal)theEObject;
				T result = caseSolverGeneratorGoal(solverGeneratorGoal);
				if (result == null) result = caseSolverGoal(solverGeneratorGoal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SolverPackage.SOLVER_GOAL_PREVIOUS_SOLVER: {
				SolverGoalPreviousSolver solverGoalPreviousSolver = (SolverGoalPreviousSolver)theEObject;
				T result = caseSolverGoalPreviousSolver(solverGoalPreviousSolver);
				if (result == null) result = caseSolverGoal(solverGoalPreviousSolver);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SolverPackage.SOLUTION: {
				Solution solution = (Solution)theEObject;
				T result = caseSolution(solution);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SolverPackage.SOLUTION_ELEMENT: {
				SolutionElement solutionElement = (SolutionElement)theEObject;
				T result = caseSolutionElement(solutionElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SolverPackage.SOLUTION_LP: {
				SolutionLp solutionLp = (SolutionLp)theEObject;
				T result = caseSolutionLp(solutionLp);
				if (result == null) result = caseSolution(solutionLp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SolverPackage.SOLUTION_VAR: {
				SolutionVar solutionVar = (SolutionVar)theEObject;
				T result = caseSolutionVar(solutionVar);
				if (result == null) result = caseSolutionElement(solutionVar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SolverPackage.SOLUTION_LP_VAR: {
				SolutionLpVar solutionLpVar = (SolutionLpVar)theEObject;
				T result = caseSolutionLpVar(solutionLpVar);
				if (result == null) result = caseSolutionVar(solutionLpVar);
				if (result == null) result = caseSolutionElement(solutionLpVar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SolverPackage.SOLUTION_CP_VAR: {
				SolutionCpVar solutionCpVar = (SolutionCpVar)theEObject;
				T result = caseSolutionCpVar(solutionCpVar);
				if (result == null) result = caseSolutionVar(solutionCpVar);
				if (result == null) result = caseSolutionElement(solutionCpVar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SolverPackage.SOLUTION_CONS: {
				SolutionCons solutionCons = (SolutionCons)theEObject;
				T result = caseSolutionCons(solutionCons);
				if (result == null) result = caseSolutionElement(solutionCons);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SolverPackage.SOLUTION_LP_CONS: {
				SolutionLpCons solutionLpCons = (SolutionLpCons)theEObject;
				T result = caseSolutionLpCons(solutionLpCons);
				if (result == null) result = caseSolutionCons(solutionLpCons);
				if (result == null) result = caseSolutionElement(solutionLpCons);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SolverPackage.SOLUTION_GOAL: {
				SolutionGoal solutionGoal = (SolutionGoal)theEObject;
				T result = caseSolutionGoal(solutionGoal);
				if (result == null) result = caseSolutionElement(solutionGoal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SolverPackage.SOLUTION_LP_GOAL: {
				SolutionLpGoal solutionLpGoal = (SolutionLpGoal)theEObject;
				T result = caseSolutionLpGoal(solutionLpGoal);
				if (result == null) result = caseSolutionGoal(solutionLpGoal);
				if (result == null) result = caseSolutionElement(solutionLpGoal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SolverPackage.GENERATOR_CP_CONS: {
				GeneratorCpCons generatorCpCons = (GeneratorCpCons)theEObject;
				T result = caseGeneratorCpCons(generatorCpCons);
				if (result == null) result = caseGeneratorCons(generatorCpCons);
				if (result == null) result = caseGeneratorTupleMember(generatorCpCons);
				if (result == null) result = caseGeneratorElement(generatorCpCons);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SolverPackage.GENERATOR_CP_LINEAR: {
				GeneratorCpLinear generatorCpLinear = (GeneratorCpLinear)theEObject;
				T result = caseGeneratorCpLinear(generatorCpLinear);
				if (result == null) result = caseGeneratorCpCons(generatorCpLinear);
				if (result == null) result = caseGeneratorCons(generatorCpLinear);
				if (result == null) result = caseGeneratorTupleMember(generatorCpLinear);
				if (result == null) result = caseGeneratorElement(generatorCpLinear);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SolverPackage.GENERATOR_CP_LOGICAL: {
				GeneratorCpLogical generatorCpLogical = (GeneratorCpLogical)theEObject;
				T result = caseGeneratorCpLogical(generatorCpLogical);
				if (result == null) result = caseGeneratorCpCons(generatorCpLogical);
				if (result == null) result = caseGeneratorCons(generatorCpLogical);
				if (result == null) result = caseGeneratorTupleMember(generatorCpLogical);
				if (result == null) result = caseGeneratorElement(generatorCpLogical);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SolverPackage.GENERATOR_CP_VAR: {
				GeneratorCpVar generatorCpVar = (GeneratorCpVar)theEObject;
				T result = caseGeneratorCpVar(generatorCpVar);
				if (result == null) result = caseGeneratorVar(generatorCpVar);
				if (result == null) result = caseGeneratorTupleMember(generatorCpVar);
				if (result == null) result = caseGeneratorElement(generatorCpVar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SolverPackage.GENERATOR_CP_VAR_ATOMIC: {
				GeneratorCpVarAtomic generatorCpVarAtomic = (GeneratorCpVarAtomic)theEObject;
				T result = caseGeneratorCpVarAtomic(generatorCpVarAtomic);
				if (result == null) result = caseGeneratorCpVar(generatorCpVarAtomic);
				if (result == null) result = caseGeneratorVar(generatorCpVarAtomic);
				if (result == null) result = caseGeneratorTupleMember(generatorCpVarAtomic);
				if (result == null) result = caseGeneratorElement(generatorCpVarAtomic);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SolverPackage.GENERATOR_CP_LINEAR_TERM: {
				GeneratorCpLinearTerm generatorCpLinearTerm = (GeneratorCpLinearTerm)theEObject;
				T result = caseGeneratorCpLinearTerm(generatorCpLinearTerm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SolverPackage.GENERATOR_CP_LOGICAL_TERM: {
				GeneratorCpLogicalTerm generatorCpLogicalTerm = (GeneratorCpLogicalTerm)theEObject;
				T result = caseGeneratorCpLogicalTerm(generatorCpLogicalTerm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SolverPackage.GENERATOR_GOAL: {
				GeneratorGoal generatorGoal = (GeneratorGoal)theEObject;
				T result = caseGeneratorGoal(generatorGoal);
				if (result == null) result = caseGeneratorElement(generatorGoal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SolverPackage.GENERATOR_LP_GOAL: {
				GeneratorLpGoal generatorLpGoal = (GeneratorLpGoal)theEObject;
				T result = caseGeneratorLpGoal(generatorLpGoal);
				if (result == null) result = caseGeneratorGoal(generatorLpGoal);
				if (result == null) result = caseGeneratorLpLinear(generatorLpGoal);
				if (result == null) result = caseGeneratorElement(generatorLpGoal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SolverPackage.GENERATOR_LP_LINEAR: {
				GeneratorLpLinear generatorLpLinear = (GeneratorLpLinear)theEObject;
				T result = caseGeneratorLpLinear(generatorLpLinear);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SolverPackage.SOLVER_LP_PARAMS: {
				SolverLpParams solverLpParams = (SolverLpParams)theEObject;
				T result = caseSolverLpParams(solverLpParams);
				if (result == null) result = caseSolverParams(solverLpParams);
				if (result == null) result = caseSolutionProviderParams(solverLpParams);
				if (result == null) result = caseRunParams(solverLpParams);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SolverPackage.SOLVER_PARAMS: {
				SolverParams solverParams = (SolverParams)theEObject;
				T result = caseSolverParams(solverParams);
				if (result == null) result = caseSolutionProviderParams(solverParams);
				if (result == null) result = caseRunParams(solverParams);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SolverPackage.SOLUTION_PROVIDER_PARAMS: {
				SolutionProviderParams solutionProviderParams = (SolutionProviderParams)theEObject;
				T result = caseSolutionProviderParams(solutionProviderParams);
				if (result == null) result = caseRunParams(solutionProviderParams);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SolverPackage.GENERATOR_VAR_BINDER: {
				GeneratorVarBinder generatorVarBinder = (GeneratorVarBinder)theEObject;
				T result = caseGeneratorVarBinder(generatorVarBinder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SolverPackage.GENERATOR_LP_VAR_BINDER: {
				GeneratorLpVarBinder generatorLpVarBinder = (GeneratorLpVarBinder)theEObject;
				T result = caseGeneratorLpVarBinder(generatorLpVarBinder);
				if (result == null) result = caseGeneratorVarBinder(generatorLpVarBinder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SolverPackage.GENERATOR_LP_VAR_BINDER_TO_SOLUTION: {
				GeneratorLpVarBinderToSolution generatorLpVarBinderToSolution = (GeneratorLpVarBinderToSolution)theEObject;
				T result = caseGeneratorLpVarBinderToSolution(generatorLpVarBinderToSolution);
				if (result == null) result = caseGeneratorLpVarBinder(generatorLpVarBinderToSolution);
				if (result == null) result = caseGeneratorVarBinder(generatorLpVarBinderToSolution);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SolverPackage.GENERATOR_LP_VAR_BINDER_TO_VALUE: {
				GeneratorLpVarBinderToValue generatorLpVarBinderToValue = (GeneratorLpVarBinderToValue)theEObject;
				T result = caseGeneratorLpVarBinderToValue(generatorLpVarBinderToValue);
				if (result == null) result = caseGeneratorLpVarBinder(generatorLpVarBinderToValue);
				if (result == null) result = caseGeneratorVarBinder(generatorLpVarBinderToValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SolverPackage.SOLVER_VAR_BINDER: {
				SolverVarBinder solverVarBinder = (SolverVarBinder)theEObject;
				T result = caseSolverVarBinder(solverVarBinder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SolverPackage.SOLVER_LP_VAR_BINDER: {
				SolverLpVarBinder solverLpVarBinder = (SolverLpVarBinder)theEObject;
				T result = caseSolverLpVarBinder(solverLpVarBinder);
				if (result == null) result = caseSolverVarBinder(solverLpVarBinder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SolverPackage.SOLVER_LP_VAR_BINDER_TO_SOLUTION: {
				SolverLpVarBinderToSolution solverLpVarBinderToSolution = (SolverLpVarBinderToSolution)theEObject;
				T result = caseSolverLpVarBinderToSolution(solverLpVarBinderToSolution);
				if (result == null) result = caseSolverLpVarBinder(solverLpVarBinderToSolution);
				if (result == null) result = caseSolverVarBinder(solverLpVarBinderToSolution);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SolverPackage.SOLVER_LP_VAR_BINDER_TO_VALUE: {
				SolverLpVarBinderToValue solverLpVarBinderToValue = (SolverLpVarBinderToValue)theEObject;
				T result = caseSolverLpVarBinderToValue(solverLpVarBinderToValue);
				if (result == null) result = caseSolverLpVarBinder(solverLpVarBinderToValue);
				if (result == null) result = caseSolverVarBinder(solverLpVarBinderToValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenerator(Generator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generator Tuple</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generator Tuple</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneratorTuple(GeneratorTuple object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generator Tuple Member</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generator Tuple Member</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneratorTupleMember(GeneratorTupleMember object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generator Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generator Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneratorElement(GeneratorElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generator Goal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generator Goal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneratorGoal(GeneratorGoal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generator Lp Goal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generator Lp Goal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneratorLpGoal(GeneratorLpGoal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generator Lp Linear</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generator Lp Linear</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneratorLpLinear(GeneratorLpLinear object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lp Params</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lp Params</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSolverLpParams(SolverLpParams object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Params</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Params</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSolverParams(SolverParams object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Solution Provider Params</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Solution Provider Params</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSolutionProviderParams(SolutionProviderParams object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generator Var Binder</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generator Var Binder</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneratorVarBinder(GeneratorVarBinder object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generator Lp Var Binder</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generator Lp Var Binder</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneratorLpVarBinder(GeneratorLpVarBinder object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generator Lp Var Binder To Solution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generator Lp Var Binder To Solution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneratorLpVarBinderToSolution(GeneratorLpVarBinderToSolution object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generator Lp Var Binder To Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generator Lp Var Binder To Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneratorLpVarBinderToValue(GeneratorLpVarBinderToValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Var Binder</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Var Binder</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSolverVarBinder(SolverVarBinder object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lp Var Binder</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lp Var Binder</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSolverLpVarBinder(SolverLpVarBinder object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lp Var Binder To Solution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lp Var Binder To Solution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSolverLpVarBinderToSolution(SolverLpVarBinderToSolution object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lp Var Binder To Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lp Var Binder To Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSolverLpVarBinderToValue(SolverLpVarBinderToValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Run Params</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Run Params</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRunParams(RunParams object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Run</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Run</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRun(Run object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Goal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Goal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSolverGoal(SolverGoal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generator Goal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generator Goal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSolverGeneratorGoal(SolverGeneratorGoal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Goal Previous Solver</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Goal Previous Solver</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSolverGoalPreviousSolver(SolverGoalPreviousSolver object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Solution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Solution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSolution(Solution object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Solution Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Solution Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSolutionElement(SolutionElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Solution Lp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Solution Lp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSolutionLp(SolutionLp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generator Var</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generator Var</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneratorVar(GeneratorVar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generator Lp Var</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generator Lp Var</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneratorLpVar(GeneratorLpVar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generator Cons</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generator Cons</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneratorCons(GeneratorCons object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generator Lp Cons</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generator Lp Cons</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneratorLpCons(GeneratorLpCons object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generator Lp Term</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generator Lp Term</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneratorLpTerm(GeneratorLpTerm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Solver</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Solver</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSolver(Solver object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSolverLp(SolverLp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Solution Var</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Solution Var</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSolutionVar(SolutionVar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ILp Writer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ILp Writer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseILpWriter(ILpWriter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Solution Reader</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Solution Reader</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSolutionReader(SolutionReader object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Solution Reader Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Solution Reader Pattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSolutionReaderPattern(SolutionReaderPattern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Solution Lp Var</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Solution Lp Var</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSolutionLpVar(SolutionLpVar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Solution Cons</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Solution Cons</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSolutionCons(SolutionCons object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Solution Lp Cons</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Solution Lp Cons</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSolutionLpCons(SolutionLpCons object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Solution Goal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Solution Goal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSolutionGoal(SolutionGoal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Solution Lp Goal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Solution Lp Goal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSolutionLpGoal(SolutionLpGoal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generator Cp Cons</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generator Cp Cons</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneratorCpCons(GeneratorCpCons object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generator Cp Linear</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generator Cp Linear</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneratorCpLinear(GeneratorCpLinear object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generator Cp Logical</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generator Cp Logical</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneratorCpLogical(GeneratorCpLogical object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generator Cp Var</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generator Cp Var</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneratorCpVar(GeneratorCpVar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generator Cp Var Atomic</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generator Cp Var Atomic</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneratorCpVarAtomic(GeneratorCpVarAtomic object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generator Cp Linear Term</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generator Cp Linear Term</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneratorCpLinearTerm(GeneratorCpLinearTerm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generator Cp Logical Term</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generator Cp Logical Term</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneratorCpLogicalTerm(GeneratorCpLogicalTerm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Solution Cp Var</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Solution Cp Var</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSolutionCpVar(SolutionCpVar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSolverCp(SolverCp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IGenerator Tool</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IGenerator Tool</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIGeneratorTool(IGeneratorTool object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Solution Provider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Solution Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSolutionProvider(SolutionProvider object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //SolverSwitch
