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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.misc.common.moplaf.solver.SolverPackage
 * @generated
 */
public class SolverAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SolverPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolverAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SolverPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SolverSwitch<Adapter> modelSwitch =
		new SolverSwitch<Adapter>() {
			@Override
			public Adapter caseGenerator(Generator object) {
				return createGeneratorAdapter();
			}
			@Override
			public Adapter caseGeneratorElement(GeneratorElement object) {
				return createGeneratorElementAdapter();
			}
			@Override
			public Adapter caseGeneratorTuple(GeneratorTuple object) {
				return createGeneratorTupleAdapter();
			}
			@Override
			public Adapter caseGeneratorTupleMember(GeneratorTupleMember object) {
				return createGeneratorTupleMemberAdapter();
			}
			@Override
			public Adapter caseGeneratorVar(GeneratorVar object) {
				return createGeneratorVarAdapter();
			}
			@Override
			public Adapter caseGeneratorLpVar(GeneratorLpVar object) {
				return createGeneratorLpVarAdapter();
			}
			@Override
			public Adapter caseGeneratorCons(GeneratorCons object) {
				return createGeneratorConsAdapter();
			}
			@Override
			public Adapter caseGeneratorLpCons(GeneratorLpCons object) {
				return createGeneratorLpConsAdapter();
			}
			@Override
			public Adapter caseGeneratorLpTerm(GeneratorLpTerm object) {
				return createGeneratorLpTermAdapter();
			}
			@Override
			public Adapter caseIGeneratorTool(IGeneratorTool object) {
				return createIGeneratorToolAdapter();
			}
			@Override
			public Adapter caseSolutionReader(SolutionReader object) {
				return createSolutionReaderAdapter();
			}
			@Override
			public Adapter caseSolutionReaderPattern(SolutionReaderPattern object) {
				return createSolutionReaderPatternAdapter();
			}
			@Override
			public Adapter caseILpWriter(ILpWriter object) {
				return createILpWriterAdapter();
			}
			@Override
			public Adapter caseSolutionProvider(SolutionProvider object) {
				return createSolutionProviderAdapter();
			}
			@Override
			public Adapter caseSolver(Solver object) {
				return createSolverAdapter();
			}
			@Override
			public Adapter caseSolverCp(SolverCp object) {
				return createSolverCpAdapter();
			}
			@Override
			public Adapter caseSolverLp(SolverLp object) {
				return createSolverLpAdapter();
			}
			@Override
			public Adapter caseSolverGoal(SolverGoal object) {
				return createSolverGoalAdapter();
			}
			@Override
			public Adapter caseSolverGeneratorGoal(SolverGeneratorGoal object) {
				return createSolverGeneratorGoalAdapter();
			}
			@Override
			public Adapter caseSolution(Solution object) {
				return createSolutionAdapter();
			}
			@Override
			public Adapter caseSolutionElement(SolutionElement object) {
				return createSolutionElementAdapter();
			}
			@Override
			public Adapter caseSolutionLp(SolutionLp object) {
				return createSolutionLpAdapter();
			}
			@Override
			public Adapter caseSolutionVar(SolutionVar object) {
				return createSolutionVarAdapter();
			}
			@Override
			public Adapter caseSolutionLpVar(SolutionLpVar object) {
				return createSolutionLpVarAdapter();
			}
			@Override
			public Adapter caseSolutionCpVar(SolutionCpVar object) {
				return createSolutionCpVarAdapter();
			}
			@Override
			public Adapter caseSolutionCons(SolutionCons object) {
				return createSolutionConsAdapter();
			}
			@Override
			public Adapter caseSolutionLpCons(SolutionLpCons object) {
				return createSolutionLpConsAdapter();
			}
			@Override
			public Adapter caseSolutionGoal(SolutionGoal object) {
				return createSolutionGoalAdapter();
			}
			@Override
			public Adapter caseSolutionLpGoal(SolutionLpGoal object) {
				return createSolutionLpGoalAdapter();
			}
			@Override
			public Adapter caseGeneratorCpCons(GeneratorCpCons object) {
				return createGeneratorCpConsAdapter();
			}
			@Override
			public Adapter caseGeneratorCpLinear(GeneratorCpLinear object) {
				return createGeneratorCpLinearAdapter();
			}
			@Override
			public Adapter caseGeneratorCpLogical(GeneratorCpLogical object) {
				return createGeneratorCpLogicalAdapter();
			}
			@Override
			public Adapter caseGeneratorCpVar(GeneratorCpVar object) {
				return createGeneratorCpVarAdapter();
			}
			@Override
			public Adapter caseGeneratorCpVarAtomic(GeneratorCpVarAtomic object) {
				return createGeneratorCpVarAtomicAdapter();
			}
			@Override
			public Adapter caseGeneratorCpLinearTerm(GeneratorCpLinearTerm object) {
				return createGeneratorCpLinearTermAdapter();
			}
			@Override
			public Adapter caseGeneratorCpLogicalTerm(GeneratorCpLogicalTerm object) {
				return createGeneratorCpLogicalTermAdapter();
			}
			@Override
			public Adapter caseGeneratorGoal(GeneratorGoal object) {
				return createGeneratorGoalAdapter();
			}
			@Override
			public Adapter caseGeneratorLpGoal(GeneratorLpGoal object) {
				return createGeneratorLpGoalAdapter();
			}
			@Override
			public Adapter caseGeneratorLpLinear(GeneratorLpLinear object) {
				return createGeneratorLpLinearAdapter();
			}
			@Override
			public Adapter caseSolverLpParams(SolverLpParams object) {
				return createSolverLpParamsAdapter();
			}
			@Override
			public Adapter caseSolverParams(SolverParams object) {
				return createSolverParamsAdapter();
			}
			@Override
			public Adapter caseSolutionProviderParams(SolutionProviderParams object) {
				return createSolutionProviderParamsAdapter();
			}
			@Override
			public Adapter caseGeneratorVarBinder(GeneratorVarBinder object) {
				return createGeneratorVarBinderAdapter();
			}
			@Override
			public Adapter caseGeneratorLpVarBinder(GeneratorLpVarBinder object) {
				return createGeneratorLpVarBinderAdapter();
			}
			@Override
			public Adapter caseGeneratorLpVarBinderToSolution(GeneratorLpVarBinderToSolution object) {
				return createGeneratorLpVarBinderToSolutionAdapter();
			}
			@Override
			public Adapter caseGeneratorLpVarBinderToValue(GeneratorLpVarBinderToValue object) {
				return createGeneratorLpVarBinderToValueAdapter();
			}
			@Override
			public Adapter caseSolverVarBinder(SolverVarBinder object) {
				return createSolverVarBinderAdapter();
			}
			@Override
			public Adapter caseSolverLpVarBinder(SolverLpVarBinder object) {
				return createSolverLpVarBinderAdapter();
			}
			@Override
			public Adapter caseSolverLpVarBinderToSolution(SolverLpVarBinderToSolution object) {
				return createSolverLpVarBinderToSolutionAdapter();
			}
			@Override
			public Adapter caseSolverLpVarBinderToValue(SolverLpVarBinderToValue object) {
				return createSolverLpVarBinderToValueAdapter();
			}
			@Override
			public Adapter caseGeneratorLpVarBinderCustom(GeneratorLpVarBinderCustom object) {
				return createGeneratorLpVarBinderCustomAdapter();
			}
			@Override
			public Adapter caseSolverLpVarBinderCustom(SolverLpVarBinderCustom object) {
				return createSolverLpVarBinderCustomAdapter();
			}
			@Override
			public Adapter caseRunParams(RunParams object) {
				return createRunParamsAdapter();
			}
			@Override
			public Adapter caseRun(Run object) {
				return createRunAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.solver.Generator <em>Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.solver.Generator
	 * @generated
	 */
	public Adapter createGeneratorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.solver.GeneratorTuple <em>Generator Tuple</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.solver.GeneratorTuple
	 * @generated
	 */
	public Adapter createGeneratorTupleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.solver.GeneratorTupleMember <em>Generator Tuple Member</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.solver.GeneratorTupleMember
	 * @generated
	 */
	public Adapter createGeneratorTupleMemberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.solver.GeneratorElement <em>Generator Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.solver.GeneratorElement
	 * @generated
	 */
	public Adapter createGeneratorElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.solver.GeneratorGoal <em>Generator Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.solver.GeneratorGoal
	 * @generated
	 */
	public Adapter createGeneratorGoalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.solver.GeneratorLpGoal <em>Generator Lp Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.solver.GeneratorLpGoal
	 * @generated
	 */
	public Adapter createGeneratorLpGoalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.solver.GeneratorLpLinear <em>Generator Lp Linear</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.solver.GeneratorLpLinear
	 * @generated
	 */
	public Adapter createGeneratorLpLinearAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.solver.SolverLpParams <em>Lp Params</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.solver.SolverLpParams
	 * @generated
	 */
	public Adapter createSolverLpParamsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.solver.SolverParams <em>Params</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.solver.SolverParams
	 * @generated
	 */
	public Adapter createSolverParamsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.solver.SolutionProviderParams <em>Solution Provider Params</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.solver.SolutionProviderParams
	 * @generated
	 */
	public Adapter createSolutionProviderParamsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.solver.GeneratorVarBinder <em>Generator Var Binder</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.solver.GeneratorVarBinder
	 * @generated
	 */
	public Adapter createGeneratorVarBinderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.solver.GeneratorLpVarBinder <em>Generator Lp Var Binder</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.solver.GeneratorLpVarBinder
	 * @generated
	 */
	public Adapter createGeneratorLpVarBinderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.solver.GeneratorLpVarBinderToSolution <em>Generator Lp Var Binder To Solution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.solver.GeneratorLpVarBinderToSolution
	 * @generated
	 */
	public Adapter createGeneratorLpVarBinderToSolutionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.solver.GeneratorLpVarBinderToValue <em>Generator Lp Var Binder To Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.solver.GeneratorLpVarBinderToValue
	 * @generated
	 */
	public Adapter createGeneratorLpVarBinderToValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.solver.SolverVarBinder <em>Var Binder</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.solver.SolverVarBinder
	 * @generated
	 */
	public Adapter createSolverVarBinderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.solver.SolverLpVarBinder <em>Lp Var Binder</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.solver.SolverLpVarBinder
	 * @generated
	 */
	public Adapter createSolverLpVarBinderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.solver.SolverLpVarBinderToSolution <em>Lp Var Binder To Solution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.solver.SolverLpVarBinderToSolution
	 * @generated
	 */
	public Adapter createSolverLpVarBinderToSolutionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.solver.SolverLpVarBinderToValue <em>Lp Var Binder To Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.solver.SolverLpVarBinderToValue
	 * @generated
	 */
	public Adapter createSolverLpVarBinderToValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.solver.GeneratorLpVarBinderCustom <em>Generator Lp Var Binder Custom</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.solver.GeneratorLpVarBinderCustom
	 * @generated
	 */
	public Adapter createGeneratorLpVarBinderCustomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.solver.SolverLpVarBinderCustom <em>Lp Var Binder Custom</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.solver.SolverLpVarBinderCustom
	 * @generated
	 */
	public Adapter createSolverLpVarBinderCustomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.job.RunParams <em>Run Params</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.job.RunParams
	 * @generated
	 */
	public Adapter createRunParamsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.job.Run <em>Run</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.job.Run
	 * @generated
	 */
	public Adapter createRunAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.solver.SolverGoal <em>Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.solver.SolverGoal
	 * @generated
	 */
	public Adapter createSolverGoalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.solver.SolverGeneratorGoal <em>Generator Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.solver.SolverGeneratorGoal
	 * @generated
	 */
	public Adapter createSolverGeneratorGoalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.solver.Solution <em>Solution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.solver.Solution
	 * @generated
	 */
	public Adapter createSolutionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.solver.SolutionElement <em>Solution Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.solver.SolutionElement
	 * @generated
	 */
	public Adapter createSolutionElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.solver.SolutionLp <em>Solution Lp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.solver.SolutionLp
	 * @generated
	 */
	public Adapter createSolutionLpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.solver.GeneratorVar <em>Generator Var</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.solver.GeneratorVar
	 * @generated
	 */
	public Adapter createGeneratorVarAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.solver.GeneratorLpVar <em>Generator Lp Var</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.solver.GeneratorLpVar
	 * @generated
	 */
	public Adapter createGeneratorLpVarAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.solver.GeneratorCons <em>Generator Cons</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.solver.GeneratorCons
	 * @generated
	 */
	public Adapter createGeneratorConsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.solver.GeneratorLpCons <em>Generator Lp Cons</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.solver.GeneratorLpCons
	 * @generated
	 */
	public Adapter createGeneratorLpConsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.solver.GeneratorLpTerm <em>Generator Lp Term</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.solver.GeneratorLpTerm
	 * @generated
	 */
	public Adapter createGeneratorLpTermAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.solver.Solver <em>Solver</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.solver.Solver
	 * @generated
	 */
	public Adapter createSolverAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.solver.SolverLp <em>Lp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.solver.SolverLp
	 * @generated
	 */
	public Adapter createSolverLpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.solver.SolutionVar <em>Solution Var</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.solver.SolutionVar
	 * @generated
	 */
	public Adapter createSolutionVarAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.solver.ILpWriter <em>ILp Writer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.solver.ILpWriter
	 * @generated
	 */
	public Adapter createILpWriterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.solver.SolutionReader <em>Solution Reader</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.solver.SolutionReader
	 * @generated
	 */
	public Adapter createSolutionReaderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.solver.SolutionReaderPattern <em>Solution Reader Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.solver.SolutionReaderPattern
	 * @generated
	 */
	public Adapter createSolutionReaderPatternAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.solver.SolutionLpVar <em>Solution Lp Var</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.solver.SolutionLpVar
	 * @generated
	 */
	public Adapter createSolutionLpVarAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.solver.SolutionCons <em>Solution Cons</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.solver.SolutionCons
	 * @generated
	 */
	public Adapter createSolutionConsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.solver.SolutionLpCons <em>Solution Lp Cons</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.solver.SolutionLpCons
	 * @generated
	 */
	public Adapter createSolutionLpConsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.solver.SolutionGoal <em>Solution Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.solver.SolutionGoal
	 * @generated
	 */
	public Adapter createSolutionGoalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.solver.SolutionLpGoal <em>Solution Lp Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.solver.SolutionLpGoal
	 * @generated
	 */
	public Adapter createSolutionLpGoalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.solver.GeneratorCpCons <em>Generator Cp Cons</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.solver.GeneratorCpCons
	 * @generated
	 */
	public Adapter createGeneratorCpConsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.solver.GeneratorCpLinear <em>Generator Cp Linear</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.solver.GeneratorCpLinear
	 * @generated
	 */
	public Adapter createGeneratorCpLinearAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.solver.GeneratorCpLogical <em>Generator Cp Logical</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.solver.GeneratorCpLogical
	 * @generated
	 */
	public Adapter createGeneratorCpLogicalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.solver.GeneratorCpVar <em>Generator Cp Var</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.solver.GeneratorCpVar
	 * @generated
	 */
	public Adapter createGeneratorCpVarAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.solver.GeneratorCpVarAtomic <em>Generator Cp Var Atomic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.solver.GeneratorCpVarAtomic
	 * @generated
	 */
	public Adapter createGeneratorCpVarAtomicAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.solver.GeneratorCpLinearTerm <em>Generator Cp Linear Term</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.solver.GeneratorCpLinearTerm
	 * @generated
	 */
	public Adapter createGeneratorCpLinearTermAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.solver.GeneratorCpLogicalTerm <em>Generator Cp Logical Term</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.solver.GeneratorCpLogicalTerm
	 * @generated
	 */
	public Adapter createGeneratorCpLogicalTermAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.solver.SolutionCpVar <em>Solution Cp Var</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.solver.SolutionCpVar
	 * @generated
	 */
	public Adapter createSolutionCpVarAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.solver.SolverCp <em>Cp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.solver.SolverCp
	 * @generated
	 */
	public Adapter createSolverCpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.solver.IGeneratorTool <em>IGenerator Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.solver.IGeneratorTool
	 * @generated
	 */
	public Adapter createIGeneratorToolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.misc.common.moplaf.solver.SolutionProvider <em>Solution Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.misc.common.moplaf.solver.SolutionProvider
	 * @generated
	 */
	public Adapter createSolutionProviderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //SolverAdapterFactory
