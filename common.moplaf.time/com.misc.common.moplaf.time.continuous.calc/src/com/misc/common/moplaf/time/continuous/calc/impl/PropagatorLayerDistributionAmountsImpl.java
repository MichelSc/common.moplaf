/**
 */
package com.misc.common.moplaf.time.continuous.calc.impl;

import com.misc.common.moplaf.time.continuous.calc.PropagatorLayerDistributionAmounts;
import com.misc.common.moplaf.time.continuous.calc.PropagatorLayerDistributionSlopes;
import com.misc.common.moplaf.time.continuous.calc.PropagatorScopeDistribution;
import com.misc.common.moplaf.time.continuous.calc.TimeContinuousCalcPackage;
import com.misc.common.moplaf.time.continuous.impl.PropagatorFunctionDistributionImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Propagator Layer Distribution Amounts</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.time.continuous.calc.impl.PropagatorLayerDistributionAmountsImpl#getConcreteParent <em>Concrete Parent</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.continuous.calc.impl.PropagatorLayerDistributionAmountsImpl#getAntecedentLayerDistributionSlopes <em>Antecedent Layer Distribution Slopes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PropagatorLayerDistributionAmountsImpl extends PropagatorFunctionDistributionImpl implements PropagatorLayerDistributionAmounts {
	/**
	 * The cached value of the '{@link #getConcreteParent() <em>Concrete Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcreteParent()
	 * @generated
	 * @ordered
	 */
	protected PropagatorScopeDistribution concreteParent;
	/**
	 * The cached value of the '{@link #getAntecedentLayerDistributionSlopes() <em>Antecedent Layer Distribution Slopes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAntecedentLayerDistributionSlopes()
	 * @generated
	 * @ordered
	 */
	protected PropagatorLayerDistributionSlopes antecedentLayerDistributionSlopes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropagatorLayerDistributionAmountsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TimeContinuousCalcPackage.Literals.PROPAGATOR_LAYER_DISTRIBUTION_AMOUNTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropagatorScopeDistribution getConcreteParent() {
		if (concreteParent != null && concreteParent.eIsProxy()) {
			InternalEObject oldConcreteParent = (InternalEObject)concreteParent;
			concreteParent = (PropagatorScopeDistribution)eResolveProxy(oldConcreteParent);
			if (concreteParent != oldConcreteParent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TimeContinuousCalcPackage.PROPAGATOR_LAYER_DISTRIBUTION_AMOUNTS__CONCRETE_PARENT, oldConcreteParent, concreteParent));
			}
		}
		return concreteParent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropagatorScopeDistribution basicGetConcreteParent() {
		return concreteParent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConcreteParent(PropagatorScopeDistribution newConcreteParent) {
		PropagatorScopeDistribution oldConcreteParent = concreteParent;
		concreteParent = newConcreteParent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimeContinuousCalcPackage.PROPAGATOR_LAYER_DISTRIBUTION_AMOUNTS__CONCRETE_PARENT, oldConcreteParent, concreteParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropagatorLayerDistributionSlopes getAntecedentLayerDistributionSlopes() {
		if (antecedentLayerDistributionSlopes != null && antecedentLayerDistributionSlopes.eIsProxy()) {
			InternalEObject oldAntecedentLayerDistributionSlopes = (InternalEObject)antecedentLayerDistributionSlopes;
			antecedentLayerDistributionSlopes = (PropagatorLayerDistributionSlopes)eResolveProxy(oldAntecedentLayerDistributionSlopes);
			if (antecedentLayerDistributionSlopes != oldAntecedentLayerDistributionSlopes) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TimeContinuousCalcPackage.PROPAGATOR_LAYER_DISTRIBUTION_AMOUNTS__ANTECEDENT_LAYER_DISTRIBUTION_SLOPES, oldAntecedentLayerDistributionSlopes, antecedentLayerDistributionSlopes));
			}
		}
		return antecedentLayerDistributionSlopes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropagatorLayerDistributionSlopes basicGetAntecedentLayerDistributionSlopes() {
		return antecedentLayerDistributionSlopes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAntecedentLayerDistributionSlopes(PropagatorLayerDistributionSlopes newAntecedentLayerDistributionSlopes) {
		PropagatorLayerDistributionSlopes oldAntecedentLayerDistributionSlopes = antecedentLayerDistributionSlopes;
		antecedentLayerDistributionSlopes = newAntecedentLayerDistributionSlopes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimeContinuousCalcPackage.PROPAGATOR_LAYER_DISTRIBUTION_AMOUNTS__ANTECEDENT_LAYER_DISTRIBUTION_SLOPES, oldAntecedentLayerDistributionSlopes, antecedentLayerDistributionSlopes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TimeContinuousCalcPackage.PROPAGATOR_LAYER_DISTRIBUTION_AMOUNTS__CONCRETE_PARENT:
				if (resolve) return getConcreteParent();
				return basicGetConcreteParent();
			case TimeContinuousCalcPackage.PROPAGATOR_LAYER_DISTRIBUTION_AMOUNTS__ANTECEDENT_LAYER_DISTRIBUTION_SLOPES:
				if (resolve) return getAntecedentLayerDistributionSlopes();
				return basicGetAntecedentLayerDistributionSlopes();
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
			case TimeContinuousCalcPackage.PROPAGATOR_LAYER_DISTRIBUTION_AMOUNTS__CONCRETE_PARENT:
				setConcreteParent((PropagatorScopeDistribution)newValue);
				return;
			case TimeContinuousCalcPackage.PROPAGATOR_LAYER_DISTRIBUTION_AMOUNTS__ANTECEDENT_LAYER_DISTRIBUTION_SLOPES:
				setAntecedentLayerDistributionSlopes((PropagatorLayerDistributionSlopes)newValue);
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
			case TimeContinuousCalcPackage.PROPAGATOR_LAYER_DISTRIBUTION_AMOUNTS__CONCRETE_PARENT:
				setConcreteParent((PropagatorScopeDistribution)null);
				return;
			case TimeContinuousCalcPackage.PROPAGATOR_LAYER_DISTRIBUTION_AMOUNTS__ANTECEDENT_LAYER_DISTRIBUTION_SLOPES:
				setAntecedentLayerDistributionSlopes((PropagatorLayerDistributionSlopes)null);
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
			case TimeContinuousCalcPackage.PROPAGATOR_LAYER_DISTRIBUTION_AMOUNTS__CONCRETE_PARENT:
				return concreteParent != null;
			case TimeContinuousCalcPackage.PROPAGATOR_LAYER_DISTRIBUTION_AMOUNTS__ANTECEDENT_LAYER_DISTRIBUTION_SLOPES:
				return antecedentLayerDistributionSlopes != null;
		}
		return super.eIsSet(featureID);
	}

} //PropagatorLayerDistributionAmountsImpl
