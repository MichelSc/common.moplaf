/**
 */
package com.misc.common.moplaf.time.continuous.impl;

import com.misc.common.moplaf.time.continuous.CapacityChange;
import com.misc.common.moplaf.time.continuous.CapacityChangeEnd;
import com.misc.common.moplaf.time.continuous.CapacityChangeStart;
import com.misc.common.moplaf.time.continuous.ContinuousFactory;
import com.misc.common.moplaf.time.continuous.ContinuousPackage;
import com.misc.common.moplaf.time.continuous.Distribution;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Capacity Change</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.time.continuous.impl.CapacityChangeImpl#getStart <em>Start</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.continuous.impl.CapacityChangeImpl#getEnd <em>End</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.continuous.impl.CapacityChangeImpl#getAmount <em>Amount</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.continuous.impl.CapacityChangeImpl#getCapacityChangeStart <em>Capacity Change Start</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.continuous.impl.CapacityChangeImpl#getCapacityChangeEnd <em>Capacity Change End</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CapacityChangeImpl extends CompositeDistributionEventImpl implements CapacityChange {
	/**
	 * The default value of the '{@link #getStart() <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected static final Date START_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStart() <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected Date start = START_EDEFAULT;

	/**
	 * The default value of the '{@link #getEnd() <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected static final Date END_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnd() <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected Date end = END_EDEFAULT;

	/**
	 * The default value of the '{@link #getAmount() <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmount()
	 * @generated
	 * @ordered
	 */
	protected static final float AMOUNT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getAmount() <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmount()
	 * @generated
	 * @ordered
	 */
	protected float amount = AMOUNT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCapacityChangeStart() <em>Capacity Change Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacityChangeStart()
	 * @generated
	 * @ordered
	 */
	protected CapacityChangeStart capacityChangeStart;

	/**
	 * The cached value of the '{@link #getCapacityChangeEnd() <em>Capacity Change End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacityChangeEnd()
	 * @generated
	 * @ordered
	 */
	protected CapacityChangeEnd capacityChangeEnd;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CapacityChangeImpl() {
		super();
	}

	/* (non-Javadoc)
	 * @see com.misc.common.moplaf.time.continuous.impl.DistributionEventImpl#addPropagatorFunctionAdapter()
	@Override
	public void addPropagatorFunctionAdapter() {
	}
	 */

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContinuousPackage.Literals.CAPACITY_CHANGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getStart() {
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStart(Date newStart) {
		Date oldStart = start;
		start = newStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContinuousPackage.CAPACITY_CHANGE__START, oldStart, start));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getEnd() {
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnd(Date newEnd) {
		Date oldEnd = end;
		end = newEnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContinuousPackage.CAPACITY_CHANGE__END, oldEnd, end));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getAmount() {
		return amount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAmount(float newAmount) {
		float oldAmount = amount;
		amount = newAmount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContinuousPackage.CAPACITY_CHANGE__AMOUNT, oldAmount, amount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapacityChangeStart getCapacityChangeStart() {
		return capacityChangeStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCapacityChangeStart(CapacityChangeStart newCapacityChangeStart, NotificationChain msgs) {
		CapacityChangeStart oldCapacityChangeStart = capacityChangeStart;
		capacityChangeStart = newCapacityChangeStart;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ContinuousPackage.CAPACITY_CHANGE__CAPACITY_CHANGE_START, oldCapacityChangeStart, newCapacityChangeStart);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCapacityChangeStart(CapacityChangeStart newCapacityChangeStart) {
		if (newCapacityChangeStart != capacityChangeStart) {
			NotificationChain msgs = null;
			if (capacityChangeStart != null)
				msgs = ((InternalEObject)capacityChangeStart).eInverseRemove(this, ContinuousPackage.CAPACITY_CHANGE_START__CAPACITY_CHANGE, CapacityChangeStart.class, msgs);
			if (newCapacityChangeStart != null)
				msgs = ((InternalEObject)newCapacityChangeStart).eInverseAdd(this, ContinuousPackage.CAPACITY_CHANGE_START__CAPACITY_CHANGE, CapacityChangeStart.class, msgs);
			msgs = basicSetCapacityChangeStart(newCapacityChangeStart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContinuousPackage.CAPACITY_CHANGE__CAPACITY_CHANGE_START, newCapacityChangeStart, newCapacityChangeStart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapacityChangeEnd getCapacityChangeEnd() {
		return capacityChangeEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCapacityChangeEnd(CapacityChangeEnd newCapacityChangeEnd, NotificationChain msgs) {
		CapacityChangeEnd oldCapacityChangeEnd = capacityChangeEnd;
		capacityChangeEnd = newCapacityChangeEnd;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ContinuousPackage.CAPACITY_CHANGE__CAPACITY_CHANGE_END, oldCapacityChangeEnd, newCapacityChangeEnd);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCapacityChangeEnd(CapacityChangeEnd newCapacityChangeEnd) {
		if (newCapacityChangeEnd != capacityChangeEnd) {
			NotificationChain msgs = null;
			if (capacityChangeEnd != null)
				msgs = ((InternalEObject)capacityChangeEnd).eInverseRemove(this, ContinuousPackage.CAPACITY_CHANGE_END__CAPACITY_CHANGE, CapacityChangeEnd.class, msgs);
			if (newCapacityChangeEnd != null)
				msgs = ((InternalEObject)newCapacityChangeEnd).eInverseAdd(this, ContinuousPackage.CAPACITY_CHANGE_END__CAPACITY_CHANGE, CapacityChangeEnd.class, msgs);
			msgs = basicSetCapacityChangeEnd(newCapacityChangeEnd, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContinuousPackage.CAPACITY_CHANGE__CAPACITY_CHANGE_END, newCapacityChangeEnd, newCapacityChangeEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ContinuousPackage.CAPACITY_CHANGE__CAPACITY_CHANGE_START:
				if (capacityChangeStart != null)
					msgs = ((InternalEObject)capacityChangeStart).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ContinuousPackage.CAPACITY_CHANGE__CAPACITY_CHANGE_START, null, msgs);
				return basicSetCapacityChangeStart((CapacityChangeStart)otherEnd, msgs);
			case ContinuousPackage.CAPACITY_CHANGE__CAPACITY_CHANGE_END:
				if (capacityChangeEnd != null)
					msgs = ((InternalEObject)capacityChangeEnd).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ContinuousPackage.CAPACITY_CHANGE__CAPACITY_CHANGE_END, null, msgs);
				return basicSetCapacityChangeEnd((CapacityChangeEnd)otherEnd, msgs);
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
			case ContinuousPackage.CAPACITY_CHANGE__CAPACITY_CHANGE_START:
				return basicSetCapacityChangeStart(null, msgs);
			case ContinuousPackage.CAPACITY_CHANGE__CAPACITY_CHANGE_END:
				return basicSetCapacityChangeEnd(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ContinuousPackage.CAPACITY_CHANGE__START:
				return getStart();
			case ContinuousPackage.CAPACITY_CHANGE__END:
				return getEnd();
			case ContinuousPackage.CAPACITY_CHANGE__AMOUNT:
				return getAmount();
			case ContinuousPackage.CAPACITY_CHANGE__CAPACITY_CHANGE_START:
				return getCapacityChangeStart();
			case ContinuousPackage.CAPACITY_CHANGE__CAPACITY_CHANGE_END:
				return getCapacityChangeEnd();
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
			case ContinuousPackage.CAPACITY_CHANGE__START:
				setStart((Date)newValue);
				return;
			case ContinuousPackage.CAPACITY_CHANGE__END:
				setEnd((Date)newValue);
				return;
			case ContinuousPackage.CAPACITY_CHANGE__AMOUNT:
				setAmount((Float)newValue);
				return;
			case ContinuousPackage.CAPACITY_CHANGE__CAPACITY_CHANGE_START:
				setCapacityChangeStart((CapacityChangeStart)newValue);
				return;
			case ContinuousPackage.CAPACITY_CHANGE__CAPACITY_CHANGE_END:
				setCapacityChangeEnd((CapacityChangeEnd)newValue);
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
			case ContinuousPackage.CAPACITY_CHANGE__START:
				setStart(START_EDEFAULT);
				return;
			case ContinuousPackage.CAPACITY_CHANGE__END:
				setEnd(END_EDEFAULT);
				return;
			case ContinuousPackage.CAPACITY_CHANGE__AMOUNT:
				setAmount(AMOUNT_EDEFAULT);
				return;
			case ContinuousPackage.CAPACITY_CHANGE__CAPACITY_CHANGE_START:
				setCapacityChangeStart((CapacityChangeStart)null);
				return;
			case ContinuousPackage.CAPACITY_CHANGE__CAPACITY_CHANGE_END:
				setCapacityChangeEnd((CapacityChangeEnd)null);
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
			case ContinuousPackage.CAPACITY_CHANGE__START:
				return START_EDEFAULT == null ? start != null : !START_EDEFAULT.equals(start);
			case ContinuousPackage.CAPACITY_CHANGE__END:
				return END_EDEFAULT == null ? end != null : !END_EDEFAULT.equals(end);
			case ContinuousPackage.CAPACITY_CHANGE__AMOUNT:
				return amount != AMOUNT_EDEFAULT;
			case ContinuousPackage.CAPACITY_CHANGE__CAPACITY_CHANGE_START:
				return capacityChangeStart != null;
			case ContinuousPackage.CAPACITY_CHANGE__CAPACITY_CHANGE_END:
				return capacityChangeEnd != null;
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
		result.append(" (Start: ");
		result.append(start);
		result.append(", End: ");
		result.append(end);
		result.append(", Amount: ");
		result.append(amount);
		result.append(')');
		return result.toString();
	}

	/* (non-Javadoc)
	 * @see com.misc.common.moplaf.time.continuous.impl.CompositeDistributionEventImpl#refreshEvent()
	 */
	@Override
	public void refreshEvent() {
		super.refreshEvent();
		Distribution distribution = this.getDistribution();
		if ( distribution == null){
			CapacityChangeStart oldstart = this.getCapacityChangeStart();
			if ( oldstart!=null){				
				oldstart.setDistribution(null);
				this.setCapacityChangeStart(null);
			}
			CapacityChangeEnd oldend = this.getCapacityChangeEnd();
			if ( oldend!=null){
				oldend.setDistribution(null);
				this.setCapacityChangeEnd(null);
			}
		} else {
			if ( this.getCapacityChangeStart()==null){
				CapacityChangeStart newstart = ContinuousFactory.eINSTANCE.createCapacityChangeStart();
				newstart.setDistribution(distribution);
				newstart.setCapacityChange(this);
			}
			if ( this.getCapacityChangeEnd()==null){
				CapacityChangeEnd newend= ContinuousFactory.eINSTANCE.createCapacityChangeEnd();
				newend.setDistribution(distribution);
				newend.setCapacityChange(this);
			}
		}
	}

} //CapacityChangeImpl
