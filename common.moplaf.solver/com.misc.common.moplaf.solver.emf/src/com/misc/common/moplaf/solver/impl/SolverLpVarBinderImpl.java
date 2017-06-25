/**
 */
package com.misc.common.moplaf.solver.impl;

import com.misc.common.moplaf.solver.GeneratorLpVar;
import com.misc.common.moplaf.solver.GeneratorVarBinder;
import com.misc.common.moplaf.solver.SolverLpVarBinder;
import com.misc.common.moplaf.solver.SolverPackage;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lp Var Binder</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class SolverLpVarBinderImpl extends SolverVarBinderImpl implements SolverLpVarBinder {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SolverLpVarBinderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SolverPackage.Literals.SOLVER_LP_VAR_BINDER;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getLowerBound(GeneratorLpVar var) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getUpperBound(GeneratorLpVar var) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public String getLabel() {
		GeneratorVarBinder binder = this.getVarBinder();
		String name = binder == null ? "null" : binder.getName();
		String label = "Bound "+ name;
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case SolverPackage.SOLVER_LP_VAR_BINDER___GET_LOWER_BOUND__GENERATORLPVAR:
				return getLowerBound((GeneratorLpVar)arguments.get(0));
			case SolverPackage.SOLVER_LP_VAR_BINDER___GET_UPPER_BOUND__GENERATORLPVAR:
				return getUpperBound((GeneratorLpVar)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //SolverLpVarBinderImpl
