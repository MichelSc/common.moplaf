/**
 */
package com.misc.common.moplaf.time.continuous.calc.impl;

import com.misc.common.moplaf.time.continuous.calc.PropagatorLayerDistributionAmounts;
import com.misc.common.moplaf.time.continuous.calc.PropagatorLayerDistributionDescriptions;
import com.misc.common.moplaf.time.continuous.calc.PropagatorScopeDistribution;
import com.misc.common.moplaf.time.continuous.calc.TimeContinuousCalcPackage;
import com.misc.common.moplaf.time.continuous.impl.PropagatorFunctionDistributionImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Propagator Layer Distribution Descriptions</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.time.continuous.calc.impl.PropagatorLayerDistributionDescriptionsImpl#getConcreteParent <em>Concrete Parent</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.continuous.calc.impl.PropagatorLayerDistributionDescriptionsImpl#getAntecedentLayerDistributionAmounts <em>Antecedent Layer Distribution Amounts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PropagatorLayerDistributionDescriptionsImpl extends PropagatorFunctionDistributionImpl implements PropagatorLayerDistributionDescriptions {
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
	 * The cached value of the '{@link #getAntecedentLayerDistributionAmounts() <em>Antecedent Layer Distribution Amounts</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAntecedentLayerDistributionAmounts()
	 * @generated
	 * @ordered
	 */
	protected PropagatorLayerDistributionAmounts antecedentLayerDistributionAmounts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropagatorLayerDistributionDescriptionsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TimeContinuousCalcPackage.Literals.PROPAGATOR_LAYER_DISTRIBUTION_DESCRIPTIONS;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TimeContinuousCalcPackage.PROPAGATOR_LAYER_DISTRIBUTION_DESCRIPTIONS__CONCRETE_PARENT, oldConcreteParent, concreteParent));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TimeContinuousCalcPackage.PROPAGATOR_LAYER_DISTRIBUTION_DESCRIPTIONS__CONCRETE_PARENT, oldConcreteParent, concreteParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropagatorLayerDistributionAmounts getAntecedentLayerDistributionAmounts() {
		if (antecedentLayerDistributionAmounts != null && antecedentLayerDistributionAmounts.eIsProxy()) {
			InternalEObject oldAntecedentLayerDistributionAmounts = (InternalEObject)antecedentLayerDistributionAmounts;
			antecedentLayerDistributionAmounts = (PropagatorLayerDistributionAmounts)eResolveProxy(oldAntecedentLayerDistributionAmounts);
			if (antecedentLayerDistributionAmounts != oldAntecedentLayerDistributionAmounts) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TimeContinuousCalcPackage.PROPAGATOR_LAYER_DISTRIBUTION_DESCRIPTIONS__ANTECEDENT_LAYER_DISTRIBUTION_AMOUNTS, oldAntecedentLayerDistributionAmounts, antecedentLayerDistributionAmounts));
			}
		}
		return antecedentLayerDistributionAmounts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropagatorLayerDistributionAmounts basicGetAntecedentLayerDistributionAmounts() {
		return antecedentLayerDistributionAmounts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAntecedentLayerDistributionAmounts(PropagatorLayerDistributionAmounts newAntecedentLayerDistributionAmounts) {
		PropagatorLayerDistributionAmounts oldAntecedentLayerDistributionAmounts = antecedentLayerDistributionAmounts;
		antecedentLayerDistributionAmounts = newAntecedentLayerDistributionAmounts;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimeContinuousCalcPackage.PROPAGATOR_LAYER_DISTRIBUTION_DESCRIPTIONS__ANTECEDENT_LAYER_DISTRIBUTION_AMOUNTS, oldAntecedentLayerDistributionAmounts, antecedentLayerDistributionAmounts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TimeContinuousCalcPackage.PROPAGATOR_LAYER_DISTRIBUTION_DESCRIPTIONS__CONCRETE_PARENT:
				if (resolve) return getConcreteParent();
				return basicGetConcreteParent();
			case TimeContinuousCalcPackage.PROPAGATOR_LAYER_DISTRIBUTION_DESCRIPTIONS__ANTECEDENT_LAYER_DISTRIBUTION_AMOUNTS:
				if (resolve) return getAntecedentLayerDistributionAmounts();
				return basicGetAntecedentLayerDistributionAmounts();
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
			case TimeContinuousCalcPackage.PROPAGATOR_LAYER_DISTRIBUTION_DESCRIPTIONS__CONCRETE_PARENT:
				setConcreteParent((PropagatorScopeDistribution)newValue);
				return;
			case TimeContinuousCalcPackage.PROPAGATOR_LAYER_DISTRIBUTION_DESCRIPTIONS__ANTECEDENT_LAYER_DISTRIBUTION_AMOUNTS:
				setAntecedentLayerDistributionAmounts((PropagatorLayerDistributionAmounts)newValue);
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
			case TimeContinuousCalcPackage.PROPAGATOR_LAYER_DISTRIBUTION_DESCRIPTIONS__CONCRETE_PARENT:
				setConcreteParent((PropagatorScopeDistribution)null);
				return;
			case TimeContinuousCalcPackage.PROPAGATOR_LAYER_DISTRIBUTION_DESCRIPTIONS__ANTECEDENT_LAYER_DISTRIBUTION_AMOUNTS:
				setAntecedentLayerDistributionAmounts((PropagatorLayerDistributionAmounts)null);
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
			case TimeContinuousCalcPackage.PROPAGATOR_LAYER_DISTRIBUTION_DESCRIPTIONS__CONCRETE_PARENT:
				return concreteParent != null;
			case TimeContinuousCalcPackage.PROPAGATOR_LAYER_DISTRIBUTION_DESCRIPTIONS__ANTECEDENT_LAYER_DISTRIBUTION_AMOUNTS:
				return antecedentLayerDistributionAmounts != null;
		}
		return super.eIsSet(featureID);
	}

} //PropagatorLayerDistributionDescriptionsImpl
