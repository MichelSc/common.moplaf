/**
 */
package com.misc.common.moplaf.time.continuous.calc.impl;

import com.misc.common.moplaf.propagator2.PropagatorFunction;
import com.misc.common.moplaf.propagator2.util.Bindings;
import com.misc.common.moplaf.time.continuous.Distribution;
import com.misc.common.moplaf.time.continuous.EventsProviderAbstract;
import com.misc.common.moplaf.time.continuous.TimeContinuousPackage;
import com.misc.common.moplaf.time.continuous.calc.PropagatorCalcEventsProviderRefreshEvents;
import com.misc.common.moplaf.time.continuous.calc.PropagatorLayerCompositeEventRefresh;
import com.misc.common.moplaf.time.continuous.calc.PropagatorScopeDistribution;
import com.misc.common.moplaf.time.continuous.calc.TimeContinuousCalcPackage;
import com.misc.common.moplaf.time.continuous.impl.PropagatorFunctionEventsProviderImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Propagator Calc Events Provider Refresh Events</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.time.continuous.calc.impl.PropagatorCalcEventsProviderRefreshEventsImpl#getConcreteParent <em>Concrete Parent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PropagatorCalcEventsProviderRefreshEventsImpl extends PropagatorFunctionEventsProviderImpl implements PropagatorCalcEventsProviderRefreshEvents {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropagatorCalcEventsProviderRefreshEventsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TimeContinuousCalcPackage.Literals.PROPAGATOR_CALC_EVENTS_PROVIDER_REFRESH_EVENTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropagatorLayerCompositeEventRefresh getConcreteParent() {
		PropagatorLayerCompositeEventRefresh concreteParent = basicGetConcreteParent();
		return concreteParent != null && concreteParent.eIsProxy() ? (PropagatorLayerCompositeEventRefresh)eResolveProxy((InternalEObject)concreteParent) : concreteParent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public PropagatorLayerCompositeEventRefresh basicGetConcreteParent() {
		EventsProviderAbstract provider = this.getEventsProvider();
		Distribution distribution = provider.getDistribution();
		PropagatorLayerCompositeEventRefresh parent = distribution.getPropagatorFunction(PropagatorLayerCompositeEventRefresh.class);
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TimeContinuousCalcPackage.PROPAGATOR_CALC_EVENTS_PROVIDER_REFRESH_EVENTS__CONCRETE_PARENT:
				if (resolve) return getConcreteParent();
				return basicGetConcreteParent();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TimeContinuousCalcPackage.PROPAGATOR_CALC_EVENTS_PROVIDER_REFRESH_EVENTS__CONCRETE_PARENT:
				return basicGetConcreteParent() != null;
		}
		return super.eIsSet(featureID);
	}

	protected static Bindings providerBindings = Bindings.constructBindings()
			.addInboundBinding(TimeContinuousPackage.Literals.EVENTS_PROVIDER_ABSTRACT__DISTRIBUTION);
	
	/*
	 * (non-Javadoc)
	 * @see com.misc.common.moplaf.propagator2.impl.PropagatorFunctionImpl#doGetParent()
	 */
	@Override
	public PropagatorFunction doGetParent() {
		return this.getConcreteParent();
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.misc.common.moplaf.propagator2.impl.PropagatorFunctionBindingsImpl#doGetBindings()
	 */
	@Override
	public Bindings doGetBindings() {
		return providerBindings;
	}

	@Override
	public void doRefresh() {
		EventsProviderAbstract provider = this.getEventsProvider();
		provider.refreshEvents();
	}

} //PropagatorCalcEventsProviderRefreshEventsImpl
