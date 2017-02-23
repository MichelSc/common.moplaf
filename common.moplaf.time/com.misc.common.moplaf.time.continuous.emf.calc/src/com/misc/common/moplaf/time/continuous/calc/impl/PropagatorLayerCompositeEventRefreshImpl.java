/**
 */
package com.misc.common.moplaf.time.continuous.calc.impl;

import com.misc.common.moplaf.time.continuous.calc.PropagatorCalcDistributionInitialization;
import com.misc.common.moplaf.time.continuous.calc.PropagatorLayerCompositeEventRefresh;
import com.misc.common.moplaf.time.continuous.calc.PropagatorScopeDistribution;
import com.misc.common.moplaf.time.continuous.calc.TimeContinuousCalcPackage;
import com.misc.common.moplaf.time.continuous.impl.PropagatorFunctionDistributionImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Propagator Layer Composite Event Refresh</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.time.continuous.calc.impl.PropagatorLayerCompositeEventRefreshImpl#getConcreteParent <em>Concrete Parent</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.continuous.calc.impl.PropagatorLayerCompositeEventRefreshImpl#getAntecedenCalcDistributionInitialization <em>Anteceden Calc Distribution Initialization</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PropagatorLayerCompositeEventRefreshImpl extends PropagatorFunctionDistributionImpl implements PropagatorLayerCompositeEventRefresh {
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
	 * The cached value of the '{@link #getAntecedenCalcDistributionInitialization() <em>Anteceden Calc Distribution Initialization</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAntecedenCalcDistributionInitialization()
	 * @generated
	 * @ordered
	 */
	protected PropagatorCalcDistributionInitialization antecedenCalcDistributionInitialization;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropagatorLayerCompositeEventRefreshImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TimeContinuousCalcPackage.Literals.PROPAGATOR_LAYER_COMPOSITE_EVENT_REFRESH;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TimeContinuousCalcPackage.PROPAGATOR_LAYER_COMPOSITE_EVENT_REFRESH__CONCRETE_PARENT, oldConcreteParent, concreteParent));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TimeContinuousCalcPackage.PROPAGATOR_LAYER_COMPOSITE_EVENT_REFRESH__CONCRETE_PARENT, oldConcreteParent, concreteParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropagatorCalcDistributionInitialization getAntecedenCalcDistributionInitialization() {
		if (antecedenCalcDistributionInitialization != null && antecedenCalcDistributionInitialization.eIsProxy()) {
			InternalEObject oldAntecedenCalcDistributionInitialization = (InternalEObject)antecedenCalcDistributionInitialization;
			antecedenCalcDistributionInitialization = (PropagatorCalcDistributionInitialization)eResolveProxy(oldAntecedenCalcDistributionInitialization);
			if (antecedenCalcDistributionInitialization != oldAntecedenCalcDistributionInitialization) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TimeContinuousCalcPackage.PROPAGATOR_LAYER_COMPOSITE_EVENT_REFRESH__ANTECEDEN_CALC_DISTRIBUTION_INITIALIZATION, oldAntecedenCalcDistributionInitialization, antecedenCalcDistributionInitialization));
			}
		}
		return antecedenCalcDistributionInitialization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropagatorCalcDistributionInitialization basicGetAntecedenCalcDistributionInitialization() {
		return antecedenCalcDistributionInitialization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAntecedenCalcDistributionInitialization(PropagatorCalcDistributionInitialization newAntecedenCalcDistributionInitialization) {
		PropagatorCalcDistributionInitialization oldAntecedenCalcDistributionInitialization = antecedenCalcDistributionInitialization;
		antecedenCalcDistributionInitialization = newAntecedenCalcDistributionInitialization;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimeContinuousCalcPackage.PROPAGATOR_LAYER_COMPOSITE_EVENT_REFRESH__ANTECEDEN_CALC_DISTRIBUTION_INITIALIZATION, oldAntecedenCalcDistributionInitialization, antecedenCalcDistributionInitialization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TimeContinuousCalcPackage.PROPAGATOR_LAYER_COMPOSITE_EVENT_REFRESH__CONCRETE_PARENT:
				if (resolve) return getConcreteParent();
				return basicGetConcreteParent();
			case TimeContinuousCalcPackage.PROPAGATOR_LAYER_COMPOSITE_EVENT_REFRESH__ANTECEDEN_CALC_DISTRIBUTION_INITIALIZATION:
				if (resolve) return getAntecedenCalcDistributionInitialization();
				return basicGetAntecedenCalcDistributionInitialization();
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
			case TimeContinuousCalcPackage.PROPAGATOR_LAYER_COMPOSITE_EVENT_REFRESH__CONCRETE_PARENT:
				setConcreteParent((PropagatorScopeDistribution)newValue);
				return;
			case TimeContinuousCalcPackage.PROPAGATOR_LAYER_COMPOSITE_EVENT_REFRESH__ANTECEDEN_CALC_DISTRIBUTION_INITIALIZATION:
				setAntecedenCalcDistributionInitialization((PropagatorCalcDistributionInitialization)newValue);
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
			case TimeContinuousCalcPackage.PROPAGATOR_LAYER_COMPOSITE_EVENT_REFRESH__CONCRETE_PARENT:
				setConcreteParent((PropagatorScopeDistribution)null);
				return;
			case TimeContinuousCalcPackage.PROPAGATOR_LAYER_COMPOSITE_EVENT_REFRESH__ANTECEDEN_CALC_DISTRIBUTION_INITIALIZATION:
				setAntecedenCalcDistributionInitialization((PropagatorCalcDistributionInitialization)null);
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
			case TimeContinuousCalcPackage.PROPAGATOR_LAYER_COMPOSITE_EVENT_REFRESH__CONCRETE_PARENT:
				return concreteParent != null;
			case TimeContinuousCalcPackage.PROPAGATOR_LAYER_COMPOSITE_EVENT_REFRESH__ANTECEDEN_CALC_DISTRIBUTION_INITIALIZATION:
				return antecedenCalcDistributionInitialization != null;
		}
		return super.eIsSet(featureID);
	}

} //PropagatorLayerCompositeEventRefreshImpl
