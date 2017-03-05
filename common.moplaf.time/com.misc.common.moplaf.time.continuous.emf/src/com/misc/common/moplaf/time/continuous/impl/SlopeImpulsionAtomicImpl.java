/**
 */
package com.misc.common.moplaf.time.continuous.impl;


import com.misc.common.moplaf.time.continuous.Distribution;
import com.misc.common.moplaf.time.continuous.EventsProviderAbstract;
import com.misc.common.moplaf.time.continuous.SlopeImpulsionAtomic;
import com.misc.common.moplaf.time.continuous.SlopeImpulsionProvider;
import com.misc.common.moplaf.time.continuous.TimeContinuousPackage;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Slope Impulsion Atomic</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.time.continuous.impl.SlopeImpulsionAtomicImpl#getProvider <em>Provider</em>}</li>
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
		return TimeContinuousPackage.Literals.SLOPE_IMPULSION_ATOMIC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SlopeImpulsionProvider getProvider() {
		if (eContainerFeatureID() != TimeContinuousPackage.SLOPE_IMPULSION_ATOMIC__PROVIDER) return null;
		return (SlopeImpulsionProvider)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProvider(SlopeImpulsionProvider newProvider, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newProvider, TimeContinuousPackage.SLOPE_IMPULSION_ATOMIC__PROVIDER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProvider(SlopeImpulsionProvider newProvider) {
		if (newProvider != eInternalContainer() || (eContainerFeatureID() != TimeContinuousPackage.SLOPE_IMPULSION_ATOMIC__PROVIDER && newProvider != null)) {
			if (EcoreUtil.isAncestor(this, newProvider))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newProvider != null)
				msgs = ((InternalEObject)newProvider).eInverseAdd(this, TimeContinuousPackage.SLOPE_IMPULSION_PROVIDER__EVENT, SlopeImpulsionProvider.class, msgs);
			msgs = basicSetProvider(newProvider, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimeContinuousPackage.SLOPE_IMPULSION_ATOMIC__PROVIDER, newProvider, newProvider));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TimeContinuousPackage.SLOPE_IMPULSION_ATOMIC__PROVIDER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetProvider((SlopeImpulsionProvider)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TimeContinuousPackage.SLOPE_IMPULSION_ATOMIC__PROVIDER:
				return basicSetProvider(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case TimeContinuousPackage.SLOPE_IMPULSION_ATOMIC__PROVIDER:
				return eInternalContainer().eInverseRemove(this, TimeContinuousPackage.SLOPE_IMPULSION_PROVIDER__EVENT, SlopeImpulsionProvider.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Distribution basicGetDistribution() {
		EventsProviderAbstract eventProvider = this.getEventProvider();
		Distribution distribution = eventProvider.getDistribution(); 
		return distribution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TimeContinuousPackage.SLOPE_IMPULSION_ATOMIC__PROVIDER:
				return getProvider();
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
			case TimeContinuousPackage.SLOPE_IMPULSION_ATOMIC__PROVIDER:
				setProvider((SlopeImpulsionProvider)newValue);
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
			case TimeContinuousPackage.SLOPE_IMPULSION_ATOMIC__PROVIDER:
				setProvider((SlopeImpulsionProvider)null);
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
			case TimeContinuousPackage.SLOPE_IMPULSION_ATOMIC__PROVIDER:
				return getProvider() != null;
		}
		return super.eIsSet(featureID);
	}

	@Override
	public void refreshMoment() {
		Date moment = this.getProvider().getMoment();
		this.setMoment(moment);
	}

	@Override
	public void refreshSlopeImpulsion() {
		float impulsion = this.getProvider().getSlopeImpulsion();
		this.setSlopeImpulsion(impulsion);
	}
	
	
} //SlopeImpulsionAtomicImpl
