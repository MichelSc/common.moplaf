/**
 */
package com.misc.common.moplaf.time.continuous.impl;

import java.util.Date;

import com.misc.common.moplaf.propagator.Util;
import com.misc.common.moplaf.time.continuous.ContinuousPackage;
import com.misc.common.moplaf.time.continuous.StockChange;
import com.misc.common.moplaf.time.continuous.StockChangeStart;
import com.misc.common.moplaf.time.continuous.calc.PropagatorCalcStockChangeStartMoment;
import com.misc.common.moplaf.time.continuous.calc.PropagatorCalcStockChangeStartSlopeImpulsion;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stock Change Start</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.misc.common.moplaf.time.continuous.impl.StockChangeStartImpl#getStockChange <em>Stock Change</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StockChangeStartImpl extends SlopeImpulsionImpl implements StockChangeStart {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StockChangeStartImpl() {
		super();
	}
	
	/* (non-Javadoc)
	 * @see com.misc.common.moplaf.time.continuous.impl.DistributionEventImpl#addPropagatorFunctionAdapter()
	 */
	@Override
	public void addPropagatorFunctionAdapter() {
		super.addPropagatorFunctionAdapter();
		Util.adapt(this, PropagatorCalcStockChangeStartSlopeImpulsion.class);
		Util.adapt(this, PropagatorCalcStockChangeStartMoment.class);
	}
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContinuousPackage.Literals.STOCK_CHANGE_START;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StockChange getStockChange() {
		if (eContainerFeatureID() != ContinuousPackage.STOCK_CHANGE_START__STOCK_CHANGE) return null;
		return (StockChange)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStockChange(StockChange newStockChange, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newStockChange, ContinuousPackage.STOCK_CHANGE_START__STOCK_CHANGE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStockChange(StockChange newStockChange) {
		if (newStockChange != eInternalContainer() || (eContainerFeatureID() != ContinuousPackage.STOCK_CHANGE_START__STOCK_CHANGE && newStockChange != null)) {
			if (EcoreUtil.isAncestor(this, newStockChange))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newStockChange != null)
				msgs = ((InternalEObject)newStockChange).eInverseAdd(this, ContinuousPackage.STOCK_CHANGE__STOCK_CHANGE_START, StockChange.class, msgs);
			msgs = basicSetStockChange(newStockChange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContinuousPackage.STOCK_CHANGE_START__STOCK_CHANGE, newStockChange, newStockChange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ContinuousPackage.STOCK_CHANGE_START__STOCK_CHANGE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetStockChange((StockChange)otherEnd, msgs);
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
			case ContinuousPackage.STOCK_CHANGE_START__STOCK_CHANGE:
				return basicSetStockChange(null, msgs);
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
			case ContinuousPackage.STOCK_CHANGE_START__STOCK_CHANGE:
				return eInternalContainer().eInverseRemove(this, ContinuousPackage.STOCK_CHANGE__STOCK_CHANGE_START, StockChange.class, msgs);
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
			case ContinuousPackage.STOCK_CHANGE_START__STOCK_CHANGE:
				return getStockChange();
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
			case ContinuousPackage.STOCK_CHANGE_START__STOCK_CHANGE:
				setStockChange((StockChange)newValue);
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
			case ContinuousPackage.STOCK_CHANGE_START__STOCK_CHANGE:
				setStockChange((StockChange)null);
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
			case ContinuousPackage.STOCK_CHANGE_START__STOCK_CHANGE:
				return getStockChange() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public void refreshSlopeImpulsion() {
		float amount = this.getStockChange().getSlope();
		this.setSlopeImpulsion(amount);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public void refreshMoment() {
		Date moment = this.getStockChange().getStart();
		this.setMoment(moment);
	}

} //StockChangeStartImpl
