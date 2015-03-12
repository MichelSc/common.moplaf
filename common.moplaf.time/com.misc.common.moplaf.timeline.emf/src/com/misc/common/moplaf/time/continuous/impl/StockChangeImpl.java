/**
 */
package com.misc.common.moplaf.time.continuous.impl;

import com.misc.common.moplaf.time.continuous.ContinuousFactory;
import com.misc.common.moplaf.time.continuous.ContinuousPackage;
import com.misc.common.moplaf.time.continuous.Distribution;
import com.misc.common.moplaf.time.continuous.StockChange;
import com.misc.common.moplaf.time.continuous.StockChangeEnd;
import com.misc.common.moplaf.time.continuous.StockChangeStart;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stock Change</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.misc.common.moplaf.time.continuous.impl.StockChangeImpl#getStart <em>Start</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.continuous.impl.StockChangeImpl#getEnd <em>End</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.continuous.impl.StockChangeImpl#getSlope <em>Slope</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.continuous.impl.StockChangeImpl#getStockChangeStart <em>Stock Change Start</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.continuous.impl.StockChangeImpl#getStockChangeEnd <em>Stock Change End</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StockChangeImpl extends CompositeDistributionEventImpl implements StockChange {
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
	 * The default value of the '{@link #getSlope() <em>Slope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlope()
	 * @generated
	 * @ordered
	 */
	protected static final float SLOPE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getSlope() <em>Slope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlope()
	 * @generated
	 * @ordered
	 */
	protected float slope = SLOPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStockChangeStart() <em>Stock Change Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStockChangeStart()
	 * @generated
	 * @ordered
	 */
	protected StockChangeStart stockChangeStart;

	/**
	 * The cached value of the '{@link #getStockChangeEnd() <em>Stock Change End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStockChangeEnd()
	 * @generated
	 * @ordered
	 */
	protected StockChangeEnd stockChangeEnd;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StockChangeImpl() {
		super();
	}

	
	/* (non-Javadoc)
	 * @see com.misc.common.moplaf.time.continuous.impl.DistributionEventImpl#addPropagatorFunctionAdapter()
	@Override
	public void addPropagatorFunctionAdapter() {
		super.addPropagatorFunctionAdapter();
	}
	 */

	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContinuousPackage.Literals.STOCK_CHANGE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ContinuousPackage.STOCK_CHANGE__START, oldStart, start));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ContinuousPackage.STOCK_CHANGE__END, oldEnd, end));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getSlope() {
		return slope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSlope(float newSlope) {
		float oldSlope = slope;
		slope = newSlope;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContinuousPackage.STOCK_CHANGE__SLOPE, oldSlope, slope));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StockChangeStart getStockChangeStart() {
		return stockChangeStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStockChangeStart(StockChangeStart newStockChangeStart, NotificationChain msgs) {
		StockChangeStart oldStockChangeStart = stockChangeStart;
		stockChangeStart = newStockChangeStart;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ContinuousPackage.STOCK_CHANGE__STOCK_CHANGE_START, oldStockChangeStart, newStockChangeStart);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStockChangeStart(StockChangeStart newStockChangeStart) {
		if (newStockChangeStart != stockChangeStart) {
			NotificationChain msgs = null;
			if (stockChangeStart != null)
				msgs = ((InternalEObject)stockChangeStart).eInverseRemove(this, ContinuousPackage.STOCK_CHANGE_START__STOCK_CHANGE, StockChangeStart.class, msgs);
			if (newStockChangeStart != null)
				msgs = ((InternalEObject)newStockChangeStart).eInverseAdd(this, ContinuousPackage.STOCK_CHANGE_START__STOCK_CHANGE, StockChangeStart.class, msgs);
			msgs = basicSetStockChangeStart(newStockChangeStart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContinuousPackage.STOCK_CHANGE__STOCK_CHANGE_START, newStockChangeStart, newStockChangeStart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StockChangeEnd getStockChangeEnd() {
		return stockChangeEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStockChangeEnd(StockChangeEnd newStockChangeEnd, NotificationChain msgs) {
		StockChangeEnd oldStockChangeEnd = stockChangeEnd;
		stockChangeEnd = newStockChangeEnd;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ContinuousPackage.STOCK_CHANGE__STOCK_CHANGE_END, oldStockChangeEnd, newStockChangeEnd);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStockChangeEnd(StockChangeEnd newStockChangeEnd) {
		if (newStockChangeEnd != stockChangeEnd) {
			NotificationChain msgs = null;
			if (stockChangeEnd != null)
				msgs = ((InternalEObject)stockChangeEnd).eInverseRemove(this, ContinuousPackage.STOCK_CHANGE_END__STOCK_CHANGE, StockChangeEnd.class, msgs);
			if (newStockChangeEnd != null)
				msgs = ((InternalEObject)newStockChangeEnd).eInverseAdd(this, ContinuousPackage.STOCK_CHANGE_END__STOCK_CHANGE, StockChangeEnd.class, msgs);
			msgs = basicSetStockChangeEnd(newStockChangeEnd, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContinuousPackage.STOCK_CHANGE__STOCK_CHANGE_END, newStockChangeEnd, newStockChangeEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ContinuousPackage.STOCK_CHANGE__STOCK_CHANGE_START:
				if (stockChangeStart != null)
					msgs = ((InternalEObject)stockChangeStart).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ContinuousPackage.STOCK_CHANGE__STOCK_CHANGE_START, null, msgs);
				return basicSetStockChangeStart((StockChangeStart)otherEnd, msgs);
			case ContinuousPackage.STOCK_CHANGE__STOCK_CHANGE_END:
				if (stockChangeEnd != null)
					msgs = ((InternalEObject)stockChangeEnd).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ContinuousPackage.STOCK_CHANGE__STOCK_CHANGE_END, null, msgs);
				return basicSetStockChangeEnd((StockChangeEnd)otherEnd, msgs);
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
			case ContinuousPackage.STOCK_CHANGE__STOCK_CHANGE_START:
				return basicSetStockChangeStart(null, msgs);
			case ContinuousPackage.STOCK_CHANGE__STOCK_CHANGE_END:
				return basicSetStockChangeEnd(null, msgs);
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
			case ContinuousPackage.STOCK_CHANGE__START:
				return getStart();
			case ContinuousPackage.STOCK_CHANGE__END:
				return getEnd();
			case ContinuousPackage.STOCK_CHANGE__SLOPE:
				return getSlope();
			case ContinuousPackage.STOCK_CHANGE__STOCK_CHANGE_START:
				return getStockChangeStart();
			case ContinuousPackage.STOCK_CHANGE__STOCK_CHANGE_END:
				return getStockChangeEnd();
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
			case ContinuousPackage.STOCK_CHANGE__START:
				setStart((Date)newValue);
				return;
			case ContinuousPackage.STOCK_CHANGE__END:
				setEnd((Date)newValue);
				return;
			case ContinuousPackage.STOCK_CHANGE__SLOPE:
				setSlope((Float)newValue);
				return;
			case ContinuousPackage.STOCK_CHANGE__STOCK_CHANGE_START:
				setStockChangeStart((StockChangeStart)newValue);
				return;
			case ContinuousPackage.STOCK_CHANGE__STOCK_CHANGE_END:
				setStockChangeEnd((StockChangeEnd)newValue);
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
			case ContinuousPackage.STOCK_CHANGE__START:
				setStart(START_EDEFAULT);
				return;
			case ContinuousPackage.STOCK_CHANGE__END:
				setEnd(END_EDEFAULT);
				return;
			case ContinuousPackage.STOCK_CHANGE__SLOPE:
				setSlope(SLOPE_EDEFAULT);
				return;
			case ContinuousPackage.STOCK_CHANGE__STOCK_CHANGE_START:
				setStockChangeStart((StockChangeStart)null);
				return;
			case ContinuousPackage.STOCK_CHANGE__STOCK_CHANGE_END:
				setStockChangeEnd((StockChangeEnd)null);
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
			case ContinuousPackage.STOCK_CHANGE__START:
				return START_EDEFAULT == null ? start != null : !START_EDEFAULT.equals(start);
			case ContinuousPackage.STOCK_CHANGE__END:
				return END_EDEFAULT == null ? end != null : !END_EDEFAULT.equals(end);
			case ContinuousPackage.STOCK_CHANGE__SLOPE:
				return slope != SLOPE_EDEFAULT;
			case ContinuousPackage.STOCK_CHANGE__STOCK_CHANGE_START:
				return stockChangeStart != null;
			case ContinuousPackage.STOCK_CHANGE__STOCK_CHANGE_END:
				return stockChangeEnd != null;
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
		result.append(", Slope: ");
		result.append(slope);
		result.append(')');
		return result.toString();
	}

	@Override
	public void refreshEvent() {
		super.refreshEvent();
		Distribution distribution = this.getDistribution();
		if ( distribution == null){
			StockChangeStart oldstart = this.getStockChangeStart();
			if ( oldstart!=null){				
				oldstart.setDistribution(null);
				this.setStockChangeStart(null);
			}
			StockChangeEnd oldend = this.getStockChangeEnd();
			if ( oldend!=null){
				oldend.setDistribution(null);
				this.setStockChangeEnd(null);
			}
		} else {
			if ( this.getStockChangeStart()==null){
				StockChangeStart newstart = ContinuousFactory.eINSTANCE.createStockChangeStart();
				newstart.setDistribution(distribution);
				newstart.setStockChange(this);
			}
			if ( this.getStockChangeEnd()==null){
				StockChangeEnd newend= ContinuousFactory.eINSTANCE.createStockChangeEnd();
				newend.setDistribution(distribution);
				newend.setStockChange(this);
			}
		}
	}
} //StockChangeImpl
