/**
 */
package com.misc.common.moplaf.solver.impl;

import com.misc.common.moplaf.solver.GeneratorVarOverflow;
import com.misc.common.moplaf.solver.SolverPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generator Var Overflow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.misc.common.moplaf.solver.impl.GeneratorVarOverflowImpl#getCostOverFlow <em>Cost Over Flow</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.impl.GeneratorVarOverflowImpl#isMaxEnforce <em>Max Enforce</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GeneratorVarOverflowImpl extends GeneratorFeatureModeImpl implements GeneratorVarOverflow {
	/**
	 * The default value of the '{@link #getCostOverFlow() <em>Cost Over Flow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCostOverFlow()
	 * @generated
	 * @ordered
	 */
	protected static final float COST_OVER_FLOW_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCostOverFlow() <em>Cost Over Flow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCostOverFlow()
	 * @generated
	 * @ordered
	 */
	protected float costOverFlow = COST_OVER_FLOW_EDEFAULT;

	/**
	 * The default value of the '{@link #isMaxEnforce() <em>Max Enforce</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMaxEnforce()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MAX_ENFORCE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMaxEnforce() <em>Max Enforce</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMaxEnforce()
	 * @generated
	 * @ordered
	 */
	protected boolean maxEnforce = MAX_ENFORCE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneratorVarOverflowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SolverPackage.Literals.GENERATOR_VAR_OVERFLOW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getCostOverFlow() {
		return costOverFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCostOverFlow(float newCostOverFlow) {
		float oldCostOverFlow = costOverFlow;
		costOverFlow = newCostOverFlow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverPackage.GENERATOR_VAR_OVERFLOW__COST_OVER_FLOW, oldCostOverFlow, costOverFlow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMaxEnforce() {
		return maxEnforce;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxEnforce(boolean newMaxEnforce) {
		boolean oldMaxEnforce = maxEnforce;
		maxEnforce = newMaxEnforce;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverPackage.GENERATOR_VAR_OVERFLOW__MAX_ENFORCE, oldMaxEnforce, maxEnforce));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SolverPackage.GENERATOR_VAR_OVERFLOW__COST_OVER_FLOW:
				return getCostOverFlow();
			case SolverPackage.GENERATOR_VAR_OVERFLOW__MAX_ENFORCE:
				return isMaxEnforce();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SolverPackage.GENERATOR_VAR_OVERFLOW__COST_OVER_FLOW:
				setCostOverFlow((Float)newValue);
				return;
			case SolverPackage.GENERATOR_VAR_OVERFLOW__MAX_ENFORCE:
				setMaxEnforce((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SolverPackage.GENERATOR_VAR_OVERFLOW__COST_OVER_FLOW:
				setCostOverFlow(COST_OVER_FLOW_EDEFAULT);
				return;
			case SolverPackage.GENERATOR_VAR_OVERFLOW__MAX_ENFORCE:
				setMaxEnforce(MAX_ENFORCE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SolverPackage.GENERATOR_VAR_OVERFLOW__COST_OVER_FLOW:
				return costOverFlow != COST_OVER_FLOW_EDEFAULT;
			case SolverPackage.GENERATOR_VAR_OVERFLOW__MAX_ENFORCE:
				return maxEnforce != MAX_ENFORCE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (CostOverFlow: ");
		result.append(costOverFlow);
		result.append(", MaxEnforce: ");
		result.append(maxEnforce);
		result.append(')');
		return result.toString();
	}

} //GeneratorVarOverflowImpl
