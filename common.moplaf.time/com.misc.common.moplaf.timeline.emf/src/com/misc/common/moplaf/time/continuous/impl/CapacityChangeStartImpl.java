/**
 */
package com.misc.common.moplaf.time.continuous.impl;

import com.misc.common.moplaf.propagator.Util;
import com.misc.common.moplaf.time.continuous.CapacityChange;
import com.misc.common.moplaf.time.continuous.CapacityChangeStart;
import com.misc.common.moplaf.time.continuous.ContinuousPackage;
import com.misc.common.moplaf.time.continuous.calc.PropagatorCalcCapacityChangeStartAmountImpulsion;
import com.misc.common.moplaf.time.continuous.calc.PropagatorCalcCapacityChangeStartMoment;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Capacity Change Start</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.misc.common.moplaf.time.continuous.impl.CapacityChangeStartImpl#getCapacityChange <em>Capacity Change</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CapacityChangeStartImpl extends AmountImpulsionImpl implements CapacityChangeStart {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CapacityChangeStartImpl() {
		super();
	}

	/* (non-Javadoc)
	 * @see com.misc.common.moplaf.time.continuous.impl.DistributionEventImpl#addPropagatorFunctionAdapter()
	 */
	@Override
	public void addPropagatorFunctionAdapter() {
		super.addPropagatorFunctionAdapter();
		Util.adapt(this, PropagatorCalcCapacityChangeStartAmountImpulsion.class);
		Util.adapt(this, PropagatorCalcCapacityChangeStartMoment.class);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContinuousPackage.Literals.CAPACITY_CHANGE_START;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapacityChange getCapacityChange() {
		if (eContainerFeatureID() != ContinuousPackage.CAPACITY_CHANGE_START__CAPACITY_CHANGE) return null;
		return (CapacityChange)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCapacityChange(CapacityChange newCapacityChange, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newCapacityChange, ContinuousPackage.CAPACITY_CHANGE_START__CAPACITY_CHANGE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCapacityChange(CapacityChange newCapacityChange) {
		if (newCapacityChange != eInternalContainer() || (eContainerFeatureID() != ContinuousPackage.CAPACITY_CHANGE_START__CAPACITY_CHANGE && newCapacityChange != null)) {
			if (EcoreUtil.isAncestor(this, newCapacityChange))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newCapacityChange != null)
				msgs = ((InternalEObject)newCapacityChange).eInverseAdd(this, ContinuousPackage.CAPACITY_CHANGE__CAPACITY_CHANGE_START, CapacityChange.class, msgs);
			msgs = basicSetCapacityChange(newCapacityChange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContinuousPackage.CAPACITY_CHANGE_START__CAPACITY_CHANGE, newCapacityChange, newCapacityChange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void refreshAmountImpulsion() {
		float amount = this.getCapacityChange().getAmount();
		this.setAmountImpulsion(amount);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void refreshMoment() {
		Date moment = this.getCapacityChange().getStart();
		this.setMoment(moment);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ContinuousPackage.CAPACITY_CHANGE_START__CAPACITY_CHANGE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetCapacityChange((CapacityChange)otherEnd, msgs);
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
			case ContinuousPackage.CAPACITY_CHANGE_START__CAPACITY_CHANGE:
				return basicSetCapacityChange(null, msgs);
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
			case ContinuousPackage.CAPACITY_CHANGE_START__CAPACITY_CHANGE:
				return eInternalContainer().eInverseRemove(this, ContinuousPackage.CAPACITY_CHANGE__CAPACITY_CHANGE_START, CapacityChange.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ContinuousPackage.CAPACITY_CHANGE_START__CAPACITY_CHANGE:
				return getCapacityChange();
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
			case ContinuousPackage.CAPACITY_CHANGE_START__CAPACITY_CHANGE:
				setCapacityChange((CapacityChange)newValue);
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
			case ContinuousPackage.CAPACITY_CHANGE_START__CAPACITY_CHANGE:
				setCapacityChange((CapacityChange)null);
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
			case ContinuousPackage.CAPACITY_CHANGE_START__CAPACITY_CHANGE:
				return getCapacityChange() != null;
		}
		return super.eIsSet(featureID);
	}

} //CapacityChangeStartImpl
