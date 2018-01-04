/**
 */
package com.misc.common.moplaf.solver.impl;

import com.misc.common.moplaf.solver.GeneratorVar;
import com.misc.common.moplaf.solver.GeneratorVarBinderToSolution;
import com.misc.common.moplaf.solver.Solution;
import com.misc.common.moplaf.solver.SolverPackage;
import com.misc.common.moplaf.solver.SolverVarBinder;
import com.misc.common.moplaf.solver.SolverVarBinderToSolution;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generator Var Binder To Solution</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class GeneratorVarBinderToSolutionImpl extends GeneratorVarBinderImpl implements GeneratorVarBinderToSolution {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneratorVarBinderToSolutionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SolverPackage.Literals.GENERATOR_VAR_BINDER_TO_SOLUTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getBoundValue(GeneratorVar var, Solution solution) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case SolverPackage.GENERATOR_VAR_BINDER_TO_SOLUTION___GET_BOUND_VALUE__GENERATORVAR_SOLUTION:
				return getBoundValue((GeneratorVar)arguments.get(0), (Solution)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}
	
	/**
	 * Specified by GeneratorVarBinder
	 */
	@Override
	public double getBoundValue(GeneratorVar var, SolverVarBinder binder) {
		SolverVarBinderToSolution binder_solution= (SolverVarBinderToSolution)binder;
		Solution solution = binder_solution.getSelectedSolution();
		double bound_value = this.getBoundValue(var,  solution);
		return bound_value;
	}


} //GeneratorVarBinderToSolutionImpl
