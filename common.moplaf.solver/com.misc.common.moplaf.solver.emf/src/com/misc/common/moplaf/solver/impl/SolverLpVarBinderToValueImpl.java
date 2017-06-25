/**
 */
package com.misc.common.moplaf.solver.impl;

import com.misc.common.moplaf.solver.GeneratorLpVar;
import com.misc.common.moplaf.solver.GeneratorLpVarBinderToValue;
import com.misc.common.moplaf.solver.SolverLpVarBinderToValue;
import com.misc.common.moplaf.solver.SolverPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lp Var Binder To Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class SolverLpVarBinderToValueImpl extends SolverLpVarBinderImpl implements SolverLpVarBinderToValue {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SolverLpVarBinderToValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SolverPackage.Literals.SOLVER_LP_VAR_BINDER_TO_VALUE;
	}

	@Override
	public float getLowerBound(GeneratorLpVar var) {
		GeneratorLpVarBinderToValue binder = (GeneratorLpVarBinderToValue)this.getVarBinder(); 
		float bound = binder.getBoundValue();
		return bound;
	}

	@Override
	public float getUpperBound(GeneratorLpVar var) {
		GeneratorLpVarBinderToValue binder = (GeneratorLpVarBinderToValue)this.getVarBinder(); 
		float bound = binder.getBoundValue();
		return bound;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public String getLabel() {
		GeneratorLpVarBinderToValue binder = (GeneratorLpVarBinderToValue)this.getVarBinder(); 
		String label = String.format("%s to value %f", super.getLabel(), binder.getBoundValue());
		return label;
	}

} //SolverLpVarBinderToValueImpl
