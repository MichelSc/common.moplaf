/**
 */
package com.misc.common.moplaf.time.continuous.impl;

import com.misc.common.moplaf.propagator.ObjectWithPropagatorFunctionAdapter;
import com.misc.common.moplaf.propagator.PropagatorPackage;
import com.misc.common.moplaf.propagator.Util;
import com.misc.common.moplaf.time.continuous.CompositeEvent;
import com.misc.common.moplaf.time.continuous.ContinuousPackage;
import com.misc.common.moplaf.time.continuous.Distribution;
import com.misc.common.moplaf.time.continuous.DistributionEvent;
import com.misc.common.moplaf.time.continuous.calc.PropagatorCalcCompositeEventRefreshEvents;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composite Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.time.continuous.impl.CompositeEventImpl#getDistribution <em>Distribution</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.continuous.impl.CompositeEventImpl#getProvidedEvents <em>Provided Events</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CompositeEventImpl extends MinimalEObjectImpl.Container implements CompositeEvent {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositeEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContinuousPackage.Literals.COMPOSITE_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Distribution getDistribution() {
		Distribution distribution = basicGetDistribution();
		return distribution != null && distribution.eIsProxy() ? (Distribution)eResolveProxy((InternalEObject)distribution) : distribution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Distribution basicGetDistribution() {
		return (Distribution)this.eContainer();
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public EList<DistributionEvent> getProvidedEvents() {
		// implemented by the concrete class
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void refreshEvent() {
		// default does nothing, to be implemented by concrete class
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void addPropagatorFunctionAdapter() {
		Util.adapt(this, PropagatorCalcCompositeEventRefreshEvents.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ContinuousPackage.COMPOSITE_EVENT__DISTRIBUTION:
				if (resolve) return getDistribution();
				return basicGetDistribution();
			case ContinuousPackage.COMPOSITE_EVENT__PROVIDED_EVENTS:
				return getProvidedEvents();
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
			case ContinuousPackage.COMPOSITE_EVENT__DISTRIBUTION:
				return basicGetDistribution() != null;
			case ContinuousPackage.COMPOSITE_EVENT__PROVIDED_EVENTS:
				return !getProvidedEvents().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == ObjectWithPropagatorFunctionAdapter.class) {
			switch (baseOperationID) {
				case PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER___ADD_PROPAGATOR_FUNCTION_ADAPTER: return ContinuousPackage.COMPOSITE_EVENT___ADD_PROPAGATOR_FUNCTION_ADAPTER;
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ContinuousPackage.COMPOSITE_EVENT___REFRESH_EVENT:
				refreshEvent();
				return null;
			case ContinuousPackage.COMPOSITE_EVENT___ADD_PROPAGATOR_FUNCTION_ADAPTER:
				addPropagatorFunctionAdapter();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //CompositeEventImpl
