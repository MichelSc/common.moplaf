/**
 */
package com.misc.common.moplaf.solver.util;

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
			case SolverPackage.GENERATOR_LP_CONS_COUNT_ELEMENT: {
				GeneratorLpConsCountElement generatorLpConsCountElement = (GeneratorLpConsCountElement)theEObject;
				T result = caseGeneratorLpConsCountElement(generatorLpConsCountElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SolverPackage.GENERATOR_LP_VAR_COUNT_ELEMENT: {
				GeneratorLpVarCountElement generatorLpVarCountElement = (GeneratorLpVarCountElement)theEObject;
				T result = caseGeneratorLpVarCountElement(generatorLpVarCountElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SolverPackage.GENERATOR_LP_VAR_COUNT: {
				GeneratorLpVarCount generatorLpVarCount = (GeneratorLpVarCount)theEObject;
				T result = caseGeneratorLpVarCount(generatorLpVarCount);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SolverPackage.GENERATOR_LP_CONS_COUNT: {
				GeneratorLpConsCount generatorLpConsCount = (GeneratorLpConsCount)theEObject;
				T result = caseGeneratorLpConsCount(generatorLpConsCount);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SolverPackage.GENERATOR_FEATURE_MODE: {
				GeneratorFeatureMode generatorFeatureMode = (GeneratorFeatureMode)theEObject;
				T result = caseGeneratorFeatureMode(generatorFeatureMode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SolverPackage.GENERATOR_CONSTRAINT_ENABLER: {
				GeneratorConstraintEnabler generatorConstraintEnabler = (GeneratorConstraintEnabler)theEObject;
				T result = caseGeneratorConstraintEnabler(generatorConstraintEnabler);
				if (result == null) result = caseGeneratorFeatureMode(generatorConstraintEnabler);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SolverPackage.GENERATOR_VAR_OVERFLOW: {
				GeneratorVarOverflow generatorVarOverflow = (GeneratorVarOverflow)theEObject;
				T result = caseGeneratorVarOverflow(generatorVarOverflow);
				if (result == null) result = caseGeneratorFeatureMode(generatorVarOverflow);
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
				if (result == null) result = caseIGeneratorTool(solutionReader);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SolverPackage.SOLUTION_READER_PATTERN: {
				SolutionReaderPattern solutionReaderPattern = (SolutionReaderPattern)theEObject;
				T result = caseSolutionReaderPattern(solutionReaderPattern);
				if (result == null) result = caseSolutionReader(solutionReaderPattern);
				if (result == null) result = caseSolutionProvider(solutionReaderPattern);
				if (result == null) result = caseIGeneratorTool(solutionReaderPattern);
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
				if (result == null) result = caseIGeneratorTool(solutionProvider);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SolverPackage.SOLVER: {
				Solver solver = (Solver)theEObject;
				T result = caseSolver(solver);
				if (result == null) result = caseSolutionProvider(solver);
				if (result == null) result = caseIGeneratorTool(solver);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SolverPackage.SOLVER_CP: {
				SolverCp solverCp = (SolverCp)theEObject;
				T result = caseSolverCp(solverCp);
				if (result == null) result = caseSolver(solverCp);
				if (result == null) result = caseSolutionProvider(solverCp);
				if (result == null) result = caseIGeneratorTool(solverCp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SolverPackage.SOLVER_LP: {
				SolverLp solverLp = (SolverLp)theEObject;
				T result = caseSolverLp(solverLp);
				if (result == null) result = caseSolver(solverLp);
				if (result == null) result = caseSolutionProvider(solverLp);
				if (result == null) result = caseIGeneratorTool(solverLp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SolverPackage.SOLUTION: {
				Solution solution = (Solution)theEObject;
				T result = caseSolution(solution);
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
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SolverPackage.SOLUTION_LP_VAR: {
				SolutionLpVar solutionLpVar = (SolutionLpVar)theEObject;
				T result = caseSolutionLpVar(solutionLpVar);
				if (result == null) result = caseSolutionVar(solutionLpVar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SolverPackage.SOLUTION_CP_VAR: {
				SolutionCpVar solutionCpVar = (SolutionCpVar)theEObject;
				T result = caseSolutionCpVar(solutionCpVar);
				if (result == null) result = caseSolutionVar(solutionCpVar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SolverPackage.SOLUTION_CONS: {
				SolutionCons solutionCons = (SolutionCons)theEObject;
				T result = caseSolutionCons(solutionCons);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SolverPackage.SOLUTION_LP_CONS: {
				SolutionLpCons solutionLpCons = (SolutionLpCons)theEObject;
				T result = caseSolutionLpCons(solutionLpCons);
				if (result == null) result = caseSolutionCons(solutionLpCons);
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
	 * Returns the result of interpreting the object as an instance of '<em>Generator Lp Cons Count Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generator Lp Cons Count Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneratorLpConsCountElement(GeneratorLpConsCountElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generator Lp Var Count Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generator Lp Var Count Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneratorLpVarCountElement(GeneratorLpVarCountElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generator Lp Var Count</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generator Lp Var Count</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneratorLpVarCount(GeneratorLpVarCount object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generator Lp Cons Count</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generator Lp Cons Count</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneratorLpConsCount(GeneratorLpConsCount object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generator Feature Mode</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generator Feature Mode</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneratorFeatureMode(GeneratorFeatureMode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generator Constraint Enabler</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generator Constraint Enabler</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneratorConstraintEnabler(GeneratorConstraintEnabler object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generator Var Overflow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generator Var Overflow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneratorVarOverflow(GeneratorVarOverflow object) {
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
