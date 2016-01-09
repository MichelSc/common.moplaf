/**
 */
package com.misc.common.moplaf.time.continuous.impl;

import com.misc.common.moplaf.propagator.Util;
import com.misc.common.moplaf.time.continuous.ContinuousPackage;
import com.misc.common.moplaf.time.continuous.SlopeAbsolute;
import com.misc.common.moplaf.time.continuous.calc.PropagatorCalcSlopeAbsoluteSlopeAfter;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Slope Absolute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.time.continuous.impl.SlopeAbsoluteImpl#getSlopeAbsolute <em>Slope Absolute</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SlopeAbsoluteImpl extends DistributionEventImpl implements SlopeAbsolute {
	/**
	 * The default value of the '{@link #getSlopeAbsolute() <em>Slope Absolute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlopeAbsolute()
	 * @generated
	 * @ordered
	 */
	protected static final float SLOPE_ABSOLUTE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getSlopeAbsolute() <em>Slope Absolute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlopeAbsolute()
	 * @generated
	 * @ordered
	 */
	protected float slopeAbsolute = SLOPE_ABSOLUTE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SlopeAbsoluteImpl() {
		super();
	}

	/* (non-Javadoc)
	 * @see com.misc.common.moplaf.time.continuous.impl.DistributionEventImpl#addPropagatorFunctionAdapter()
	 */
	@Override
	public void addPropagatorFunctionAdapter() {
		super.addPropagatorFunctionAdapter();
		Util.adapt(this, PropagatorCalcSlopeAbsoluteSlopeAfter.class);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContinuousPackage.Literals.SLOPE_ABSOLUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getSlopeAbsolute() {
		return slopeAbsolute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSlopeAbsolute(float newSlopeAbsolute) {
		float oldSlopeAbsolute = slopeAbsolute;
		slopeAbsolute = newSlopeAbsolute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContinuousPackage.SLOPE_ABSOLUTE__SLOPE_ABSOLUTE, oldSlopeAbsolute, slopeAbsolute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void refreshSlopeAbsolute() {
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
			case ContinuousPackage.SLOPE_ABSOLUTE__SLOPE_ABSOLUTE:
				return getSlopeAbsolute();
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
			case ContinuousPackage.SLOPE_ABSOLUTE__SLOPE_ABSOLUTE:
				setSlopeAbsolute((Float)newValue);
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
			case ContinuousPackage.SLOPE_ABSOLUTE__SLOPE_ABSOLUTE:
				setSlopeAbsolute(SLOPE_ABSOLUTE_EDEFAULT);
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
			case ContinuousPackage.SLOPE_ABSOLUTE__SLOPE_ABSOLUTE:
				return slopeAbsolute != SLOPE_ABSOLUTE_EDEFAULT;
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
			case ContinuousPackage.SLOPE_ABSOLUTE___REFRESH_SLOPE_ABSOLUTE:
				refreshSlopeAbsolute();
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
		result.append(" (SlopeAbsolute: ");
		result.append(slopeAbsolute);
		result.append(')');
		return result.toString();
	}

	/* (non-Javadoc)
	 * @see com.misc.common.moplaf.time.continuous.impl.DistributionEventImpl#refreshSlopeAfter()
	 */
	@Override
	public void refreshSlopeAfter() {
		float slopeAfter = this.getSlopeAbsolute();
		this.setSlopeAfter(slopeAfter);
	}
	
	

} //SlopeAbsoluteImpl
