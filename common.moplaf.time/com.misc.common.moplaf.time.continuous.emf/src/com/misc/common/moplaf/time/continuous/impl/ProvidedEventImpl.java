/**
 */
package com.misc.common.moplaf.time.continuous.impl;

import com.misc.common.moplaf.time.continuous.Distribution;
import com.misc.common.moplaf.time.continuous.EventsProviderAbstract;
import com.misc.common.moplaf.time.continuous.ProvidedEvent;

import com.misc.common.moplaf.time.continuous.TimeContinuousPackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Provided Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.time.continuous.impl.ProvidedEventImpl#getEventProvider <em>Event Provider</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ProvidedEventImpl extends DistributionEventImpl implements ProvidedEvent {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProvidedEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TimeContinuousPackage.Literals.PROVIDED_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventsProviderAbstract getEventProvider() {
		EventsProviderAbstract eventProvider = basicGetEventProvider();
		return eventProvider != null && eventProvider.eIsProxy() ? (EventsProviderAbstract)eResolveProxy((InternalEObject)eventProvider) : eventProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public EventsProviderAbstract basicGetEventProvider() {
		return (EventsProviderAbstract)this.eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TimeContinuousPackage.PROVIDED_EVENT__EVENT_PROVIDER:
				if (resolve) return getEventProvider();
				return basicGetEventProvider();
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
			case TimeContinuousPackage.PROVIDED_EVENT__EVENT_PROVIDER:
				return basicGetEventProvider() != null;
		}
		return super.eIsSet(featureID);
	}

	@Override
	public Distribution basicGetDistribution() {
		EventsProviderAbstract provider = this.getEventProvider(); 
		return provider.getDistribution();
	}
	


} //ProvidedEventImpl
