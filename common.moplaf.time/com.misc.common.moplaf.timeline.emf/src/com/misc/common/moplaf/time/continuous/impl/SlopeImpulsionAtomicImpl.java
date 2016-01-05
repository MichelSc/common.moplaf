/**
 */
package com.misc.common.moplaf.time.continuous.impl;

import com.misc.common.moplaf.time.continuous.ContinuousPackage;
import com.misc.common.moplaf.time.continuous.Distribution;
import com.misc.common.moplaf.time.continuous.DistributionEvent;
import com.misc.common.moplaf.time.continuous.DistributionEventsProvider;
import com.misc.common.moplaf.time.continuous.SlopeImpulsionAtomic;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Slope Impulsion Atomic</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.time.continuous.impl.SlopeImpulsionAtomicImpl#getDistribution <em>Distribution</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.continuous.impl.SlopeImpulsionAtomicImpl#getProvidedEvents <em>Provided Events</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SlopeImpulsionAtomicImpl extends SlopeImpulsionImpl implements SlopeImpulsionAtomic {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SlopeImpulsionAtomicImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContinuousPackage.Literals.SLOPE_IMPULSION_ATOMIC;
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
		EObjectEList list = new EObjectEList(DistributionEvent.class, 
							                this, 
							                ContinuousPackage.DISTRIBUTION_EVENTS_PROVIDER__PROVIDED_EVENTS);
		list.add(this);
		return list;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void refreshEvent() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ContinuousPackage.SLOPE_IMPULSION_ATOMIC__DISTRIBUTION:
				if (resolve) return getDistribution();
				return basicGetDistribution();
			case ContinuousPackage.SLOPE_IMPULSION_ATOMIC__PROVIDED_EVENTS:
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
			case ContinuousPackage.SLOPE_IMPULSION_ATOMIC__DISTRIBUTION:
				return basicGetDistribution() != null;
			case ContinuousPackage.SLOPE_IMPULSION_ATOMIC__PROVIDED_EVENTS:
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
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == DistributionEventsProvider.class) {
			switch (derivedFeatureID) {
				case ContinuousPackage.SLOPE_IMPULSION_ATOMIC__DISTRIBUTION: return ContinuousPackage.DISTRIBUTION_EVENTS_PROVIDER__DISTRIBUTION;
				case ContinuousPackage.SLOPE_IMPULSION_ATOMIC__PROVIDED_EVENTS: return ContinuousPackage.DISTRIBUTION_EVENTS_PROVIDER__PROVIDED_EVENTS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == DistributionEventsProvider.class) {
			switch (baseFeatureID) {
				case ContinuousPackage.DISTRIBUTION_EVENTS_PROVIDER__DISTRIBUTION: return ContinuousPackage.SLOPE_IMPULSION_ATOMIC__DISTRIBUTION;
				case ContinuousPackage.DISTRIBUTION_EVENTS_PROVIDER__PROVIDED_EVENTS: return ContinuousPackage.SLOPE_IMPULSION_ATOMIC__PROVIDED_EVENTS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == DistributionEventsProvider.class) {
			switch (baseOperationID) {
				case ContinuousPackage.DISTRIBUTION_EVENTS_PROVIDER___REFRESH_EVENT: return ContinuousPackage.SLOPE_IMPULSION_ATOMIC___REFRESH_EVENT;
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
			case ContinuousPackage.SLOPE_IMPULSION_ATOMIC___REFRESH_EVENT:
				refreshEvent();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //SlopeImpulsionAtomicImpl
