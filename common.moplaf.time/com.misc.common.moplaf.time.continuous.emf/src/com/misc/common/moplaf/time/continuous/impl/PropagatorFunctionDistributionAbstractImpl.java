/**
 */
package com.misc.common.moplaf.time.continuous.impl;

import com.misc.common.moplaf.propagator2.impl.PropagatorFunctionBindingsImpl;
import com.misc.common.moplaf.time.continuous.PropagatorFunctionDistribution;
import com.misc.common.moplaf.time.continuous.PropagatorFunctionDistributionAbstract;
import com.misc.common.moplaf.time.continuous.TimeContinuousPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Propagator Function Distribution Abstract</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class PropagatorFunctionDistributionAbstractImpl extends PropagatorFunctionBindingsImpl implements PropagatorFunctionDistributionAbstract {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropagatorFunctionDistributionAbstractImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TimeContinuousPackage.Literals.PROPAGATOR_FUNCTION_DISTRIBUTION_ABSTRACT;
	}

	@Override
	public String getFactoryID() {
		return PropagatorFunctionDistribution.PropagatorFunctionFactoryID;
	}
} //PropagatorFunctionDistributionAbstractImpl
