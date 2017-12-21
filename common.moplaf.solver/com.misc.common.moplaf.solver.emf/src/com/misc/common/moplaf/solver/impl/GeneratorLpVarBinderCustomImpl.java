/**
 */
package com.misc.common.moplaf.solver.impl;

import com.misc.common.moplaf.solver.GeneratorLpVar;
import com.misc.common.moplaf.solver.GeneratorLpVarBinderCustom;
import com.misc.common.moplaf.solver.SolutionLp;
import com.misc.common.moplaf.solver.SolverPackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generator Lp Var Binder Custom</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class GeneratorLpVarBinderCustomImpl extends GeneratorLpVarBinderImpl implements GeneratorLpVarBinderCustom {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneratorLpVarBinderCustomImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SolverPackage.Literals.GENERATOR_LP_VAR_BINDER_CUSTOM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getLowerBound(GeneratorLpVar var, SolutionLp solution) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getUpperBound(GeneratorLpVar var, SolutionLp solution) {
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
			case SolverPackage.GENERATOR_LP_VAR_BINDER_CUSTOM___GET_LOWER_BOUND__GENERATORLPVAR_SOLUTIONLP:
				return getLowerBound((GeneratorLpVar)arguments.get(0), (SolutionLp)arguments.get(1));
			case SolverPackage.GENERATOR_LP_VAR_BINDER_CUSTOM___GET_UPPER_BOUND__GENERATORLPVAR_SOLUTIONLP:
				return getUpperBound((GeneratorLpVar)arguments.get(0), (SolutionLp)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //GeneratorLpVarBinderCustomImpl
