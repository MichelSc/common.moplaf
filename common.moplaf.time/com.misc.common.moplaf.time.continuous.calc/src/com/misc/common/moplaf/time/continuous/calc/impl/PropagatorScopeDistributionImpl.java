/**
 */
package com.misc.common.moplaf.time.continuous.calc.impl;

import com.misc.common.moplaf.propagator2.PropagatorFunction;
import com.misc.common.moplaf.time.continuous.Distribution;
import com.misc.common.moplaf.time.continuous.calc.PropagatorScopeDistribution;
import com.misc.common.moplaf.time.continuous.calc.TimeContinuousCalcPackage;
import com.misc.common.moplaf.time.continuous.impl.PropagatorFunctionDistributionImpl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Propagator Scope Distribution</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class PropagatorScopeDistributionImpl extends PropagatorFunctionDistributionImpl implements PropagatorScopeDistribution {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropagatorScopeDistributionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TimeContinuousCalcPackage.Literals.PROPAGATOR_SCOPE_DISTRIBUTION;
	}

	@Override
	public void doCollectExplicitAntecedents(EList<PropagatorFunction> antecedents) {
		super.doCollectExplicitAntecedents(antecedents);
		Distribution distribution = this.basicGetDistribution();

		for ( Distribution childDistribution : distribution.getChildDistribution()){
			PropagatorScopeDistribution scopeChildDistribution= childDistribution.getPropagatorFunction(PropagatorScopeDistribution.class);
			antecedents.add(scopeChildDistribution);
		}
	}

} //PropagatorScopeDistributionImpl
