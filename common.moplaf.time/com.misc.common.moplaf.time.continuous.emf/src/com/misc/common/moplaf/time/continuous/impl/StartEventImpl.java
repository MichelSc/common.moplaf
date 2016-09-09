/**
 */
package com.misc.common.moplaf.time.continuous.impl;

import java.util.Date;

import com.misc.common.moplaf.propagator.Util;
import com.misc.common.moplaf.time.continuous.ContinuousPackage;
import com.misc.common.moplaf.time.continuous.StartEvent;
import com.misc.common.moplaf.time.continuous.calc.PropagatorCalcStartEventAmountAfter;
import com.misc.common.moplaf.time.continuous.calc.PropagatorCalcStartEventMoment;
import com.misc.common.moplaf.time.continuous.calc.PropagatorCalcStartEventSlopeAfter;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Start Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.time.continuous.impl.StartEventImpl#getAmountAtStart <em>Amount At Start</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.continuous.impl.StartEventImpl#getSlopeAtStart <em>Slope At Start</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StartEventImpl extends OwnedEventImpl implements StartEvent {
	/**
	 * The default value of the '{@link #getAmountAtStart() <em>Amount At Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmountAtStart()
	 * @generated
	 * @ordered
	 */
	protected static final float AMOUNT_AT_START_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getAmountAtStart() <em>Amount At Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmountAtStart()
	 * @generated
	 * @ordered
	 */
	protected float amountAtStart = AMOUNT_AT_START_EDEFAULT;

	/**
	 * The default value of the '{@link #getSlopeAtStart() <em>Slope At Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlopeAtStart()
	 * @generated
	 * @ordered
	 */
	protected static final float SLOPE_AT_START_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getSlopeAtStart() <em>Slope At Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlopeAtStart()
	 * @generated
	 * @ordered
	 */
	protected float slopeAtStart = SLOPE_AT_START_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StartEventImpl() {
		super();
	}

	/* (non-Javadoc)
	 * @see com.misc.common.moplaf.time.continuous.impl.DistributionEventImpl#addPropagatorFunctionAdapter()
	 */
	@Override
	public void addPropagatorFunctionAdapter() {
		super.addPropagatorFunctionAdapter();
		Util.adapt(this, PropagatorCalcStartEventSlopeAfter.class);
		Util.adapt(this, PropagatorCalcStartEventAmountAfter.class);
		Util.adapt(this, PropagatorCalcStartEventMoment.class);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContinuousPackage.Literals.START_EVENT;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getAmountAtStart() {
		return amountAtStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAmountAtStart(float newAmountAtStart) {
		float oldAmountAtStart = amountAtStart;
		amountAtStart = newAmountAtStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContinuousPackage.START_EVENT__AMOUNT_AT_START, oldAmountAtStart, amountAtStart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getSlopeAtStart() {
		return slopeAtStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSlopeAtStart(float newSlopeAtStart) {
		float oldSlopeAtStart = slopeAtStart;
		slopeAtStart = newSlopeAtStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContinuousPackage.START_EVENT__SLOPE_AT_START, oldSlopeAtStart, slopeAtStart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ContinuousPackage.START_EVENT__AMOUNT_AT_START:
				return getAmountAtStart();
			case ContinuousPackage.START_EVENT__SLOPE_AT_START:
				return getSlopeAtStart();
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
			case ContinuousPackage.START_EVENT__AMOUNT_AT_START:
				setAmountAtStart((Float)newValue);
				return;
			case ContinuousPackage.START_EVENT__SLOPE_AT_START:
				setSlopeAtStart((Float)newValue);
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
			case ContinuousPackage.START_EVENT__AMOUNT_AT_START:
				setAmountAtStart(AMOUNT_AT_START_EDEFAULT);
				return;
			case ContinuousPackage.START_EVENT__SLOPE_AT_START:
				setSlopeAtStart(SLOPE_AT_START_EDEFAULT);
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
			case ContinuousPackage.START_EVENT__AMOUNT_AT_START:
				return amountAtStart != AMOUNT_AT_START_EDEFAULT;
			case ContinuousPackage.START_EVENT__SLOPE_AT_START:
				return slopeAtStart != SLOPE_AT_START_EDEFAULT;
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
		result.append(" (AmountAtStart: ");
		result.append(amountAtStart);
		result.append(", SlopeAtStart: ");
		result.append(slopeAtStart);
		result.append(')');
		return result.toString();
	}

	/* (non-Javadoc)
	 * @see com.misc.common.moplaf.time.continuous.impl.DistributionEventImpl#refreshAmountBefore()
	 */
	@Override
	public void refreshAmountBefore() {
		float amountBefore = 0.0f;
		this.setAmountBefore(amountBefore);
	}

	/* (non-Javadoc)
	 * @see com.misc.common.moplaf.time.continuous.impl.DistributionEventImpl#refreshAmountAfter()
	 */
	@Override
	public void refreshAmountAfter() {
		float amountAfter = this.getAmountAtStart();
		this.setAmountAfter(amountAfter);
	}

	/* (non-Javadoc)
	 * @see com.misc.common.moplaf.time.continuous.impl.DistributionEventImpl#refreshSlopeBefore()
	 */
	@Override
	public void refreshSlopeBefore() {
		float slopeBefore = 0.0f;
		this.setSlopeBefore(slopeBefore);
	}

	/* (non-Javadoc)
	 * @see com.misc.common.moplaf.time.continuous.impl.DistributionEventImpl#refreshSlopeAfter()
	 */
	@Override
	public void refreshSlopeAfter() {
		float slopeAfter = this.getSlopeAtStart();
		this.setSlopeAfter(slopeAfter);
	}

	/* (non-Javadoc)
	 * @see com.misc.common.moplaf.time.continuous.impl.DistributionEventImpl#refreshMoment()
	 */
	@Override
	public void refreshMoment() {
		Date moment = this.getDistribution().getHorizonStart();
		this.setMoment(moment);;
	}

} //StartEventImpl