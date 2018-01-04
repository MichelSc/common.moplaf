/**
 */
package com.misc.common.moplaf.solver.impl;

import com.misc.common.moplaf.solver.GeneratorVar;
import com.misc.common.moplaf.solver.GeneratorVarBinderToValue;
import com.misc.common.moplaf.solver.SolverPackage;
import com.misc.common.moplaf.solver.SolverVarBinder;
import com.misc.common.moplaf.solver.SolverVarBinderToValue;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generator Var Binder To Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class GeneratorVarBinderToValueImpl extends GeneratorVarBinderImpl implements GeneratorVarBinderToValue {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneratorVarBinderToValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SolverPackage.Literals.GENERATOR_VAR_BINDER_TO_VALUE;
	}

	/**
	 * Specified by GeneratorVarBinder
	 */
	@Override
	public double getBoundValue(GeneratorVar var, SolverVarBinder binder) {
		SolverVarBinderToValue binder_value = (SolverVarBinderToValue)binder;
		return binder_value.getBoundValue();
	}
	
	

} //GeneratorVarBinderToValueImpl
