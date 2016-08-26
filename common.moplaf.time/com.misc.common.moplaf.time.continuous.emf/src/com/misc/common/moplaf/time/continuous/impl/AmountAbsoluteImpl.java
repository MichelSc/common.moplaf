/**
 */
package com.misc.common.moplaf.time.continuous.impl;

import com.misc.common.moplaf.propagator.Util;
import com.misc.common.moplaf.time.continuous.AmountAbsolute;
import com.misc.common.moplaf.time.continuous.ContinuousPackage;
import com.misc.common.moplaf.time.continuous.calc.PropagatorCalcAmountAbsoluteAmountAfter;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Amount Absolute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.time.continuous.impl.AmountAbsoluteImpl#getAmountAbsolute <em>Amount Absolute</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AmountAbsoluteImpl extends ProvidedEventImpl implements AmountAbsolute {
	/**
	 * The default value of the '{@link #getAmountAbsolute() <em>Amount Absolute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmountAbsolute()
	 * @generated
	 * @ordered
	 */
	protected static final float AMOUNT_ABSOLUTE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getAmountAbsolute() <em>Amount Absolute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmountAbsolute()
	 * @generated
	 * @ordered
	 */
	protected float amountAbsolute = AMOUNT_ABSOLUTE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AmountAbsoluteImpl() {
		super();
	}


	/* (non-Javadoc)
	 * @see com.misc.common.moplaf.time.continuous.impl.DistributionEventImpl#addPropagatorFunctionAdapter()
	 */
	@Override
	public void addPropagatorFunctionAdapter() {
		super.addPropagatorFunctionAdapter();
		Util.adapt(this, PropagatorCalcAmountAbsoluteAmountAfter.class);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContinuousPackage.Literals.AMOUNT_ABSOLUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getAmountAbsolute() {
		return amountAbsolute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAmountAbsolute(float newAmountAbsolute) {
		float oldAmountAbsolute = amountAbsolute;
		amountAbsolute = newAmountAbsolute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContinuousPackage.AMOUNT_ABSOLUTE__AMOUNT_ABSOLUTE, oldAmountAbsolute, amountAbsolute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void refreshAmountAbsolute() {
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
			case ContinuousPackage.AMOUNT_ABSOLUTE__AMOUNT_ABSOLUTE:
				return getAmountAbsolute();
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
			case ContinuousPackage.AMOUNT_ABSOLUTE__AMOUNT_ABSOLUTE:
				setAmountAbsolute((Float)newValue);
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
			case ContinuousPackage.AMOUNT_ABSOLUTE__AMOUNT_ABSOLUTE:
				setAmountAbsolute(AMOUNT_ABSOLUTE_EDEFAULT);
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
			case ContinuousPackage.AMOUNT_ABSOLUTE__AMOUNT_ABSOLUTE:
				return amountAbsolute != AMOUNT_ABSOLUTE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ContinuousPackage.AMOUNT_ABSOLUTE___REFRESH_AMOUNT_ABSOLUTE:
				refreshAmountAbsolute();
				return null;
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (AmountAbsolute: ");
		result.append(amountAbsolute);
		result.append(')');
		return result.toString();
	}

	/* (non-Javadoc)
	 * @see com.misc.common.moplaf.time.continuous.impl.DistributionEventImpl#refreshAmountAfter()
	 */
	@Override
	public void refreshAmountAfter() {
		float amountAfter = this.getAmountAbsolute();
		this.setAmountAfter(amountAfter);
	}


} //AmountAbsoluteImpl
