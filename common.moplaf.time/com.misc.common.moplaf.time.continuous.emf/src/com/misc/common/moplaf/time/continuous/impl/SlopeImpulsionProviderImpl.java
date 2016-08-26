/**
 */
package com.misc.common.moplaf.time.continuous.impl;

import com.misc.common.moplaf.time.continuous.ContinuousFactory;
import com.misc.common.moplaf.time.continuous.ContinuousPackage;
import com.misc.common.moplaf.time.continuous.Distribution;
import com.misc.common.moplaf.time.continuous.ProvidedEvent;
import com.misc.common.moplaf.time.continuous.SlopeImpulsionAtomic;
import com.misc.common.moplaf.time.continuous.SlopeImpulsionProvider;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Slope Impulsion Provider</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.time.continuous.impl.SlopeImpulsionProviderImpl#getEvent <em>Event</em>}</li>
 *   <li>{@link com.misc.common.moplaf.time.continuous.impl.SlopeImpulsionProviderImpl#getSlopeImpulsion <em>Slope Impulsion</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SlopeImpulsionProviderImpl extends EventProviderImpl implements SlopeImpulsionProvider {
	/**
	 * The cached value of the '{@link #getEvent() <em>Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvent()
	 * @generated
	 * @ordered
	 */
	protected SlopeImpulsionAtomic event;

	/**
	 * The default value of the '{@link #getSlopeImpulsion() <em>Slope Impulsion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlopeImpulsion()
	 * @generated
	 * @ordered
	 */
	protected static final float SLOPE_IMPULSION_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getSlopeImpulsion() <em>Slope Impulsion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlopeImpulsion()
	 * @generated
	 * @ordered
	 */
	protected float slopeImpulsion = SLOPE_IMPULSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SlopeImpulsionProviderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContinuousPackage.Literals.SLOPE_IMPULSION_PROVIDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public ProvidedEvent basicGetProvidedEvent() {
		return this.getEvent();
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SlopeImpulsionAtomic getEvent() {
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEvent(SlopeImpulsionAtomic newEvent, NotificationChain msgs) {
		SlopeImpulsionAtomic oldEvent = event;
		event = newEvent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ContinuousPackage.SLOPE_IMPULSION_PROVIDER__EVENT, oldEvent, newEvent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEvent(SlopeImpulsionAtomic newEvent) {
		if (newEvent != event) {
			NotificationChain msgs = null;
			if (event != null)
				msgs = ((InternalEObject)event).eInverseRemove(this, ContinuousPackage.SLOPE_IMPULSION_ATOMIC__PROVIDER, SlopeImpulsionAtomic.class, msgs);
			if (newEvent != null)
				msgs = ((InternalEObject)newEvent).eInverseAdd(this, ContinuousPackage.SLOPE_IMPULSION_ATOMIC__PROVIDER, SlopeImpulsionAtomic.class, msgs);
			msgs = basicSetEvent(newEvent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContinuousPackage.SLOPE_IMPULSION_PROVIDER__EVENT, newEvent, newEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getSlopeImpulsion() {
		return slopeImpulsion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSlopeImpulsion(float newSlopeImpulsion) {
		float oldSlopeImpulsion = slopeImpulsion;
		slopeImpulsion = newSlopeImpulsion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContinuousPackage.SLOPE_IMPULSION_PROVIDER__SLOPE_IMPULSION, oldSlopeImpulsion, slopeImpulsion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ContinuousPackage.SLOPE_IMPULSION_PROVIDER__EVENT:
				if (event != null)
					msgs = ((InternalEObject)event).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ContinuousPackage.SLOPE_IMPULSION_PROVIDER__EVENT, null, msgs);
				return basicSetEvent((SlopeImpulsionAtomic)otherEnd, msgs);
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
			case ContinuousPackage.SLOPE_IMPULSION_PROVIDER__EVENT:
				return basicSetEvent(null, msgs);
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
			case ContinuousPackage.SLOPE_IMPULSION_PROVIDER__EVENT:
				return getEvent();
			case ContinuousPackage.SLOPE_IMPULSION_PROVIDER__SLOPE_IMPULSION:
				return getSlopeImpulsion();
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
			case ContinuousPackage.SLOPE_IMPULSION_PROVIDER__EVENT:
				setEvent((SlopeImpulsionAtomic)newValue);
				return;
			case ContinuousPackage.SLOPE_IMPULSION_PROVIDER__SLOPE_IMPULSION:
				setSlopeImpulsion((Float)newValue);
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
			case ContinuousPackage.SLOPE_IMPULSION_PROVIDER__EVENT:
				setEvent((SlopeImpulsionAtomic)null);
				return;
			case ContinuousPackage.SLOPE_IMPULSION_PROVIDER__SLOPE_IMPULSION:
				setSlopeImpulsion(SLOPE_IMPULSION_EDEFAULT);
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
			case ContinuousPackage.SLOPE_IMPULSION_PROVIDER__EVENT:
				return event != null;
			case ContinuousPackage.SLOPE_IMPULSION_PROVIDER__SLOPE_IMPULSION:
				return slopeImpulsion != SLOPE_IMPULSION_EDEFAULT;
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
		result.append(" (SlopeImpulsion: ");
		result.append(slopeImpulsion);
		result.append(')');
		return result.toString();
	}

	/* (non-Javadoc)
	 * @see com.misc.common.moplaf.time.continuous.impl.CompositeDistributionEventImpl#refreshEvent()
	 */
	@Override
	public void refreshEvents() {
		Distribution distribution = this.getDistribution();
		if ( distribution == null){
			SlopeImpulsionAtomic event = this.getEvent();
			if ( event!=null){				
				this.setEvent(null);
			}
		} else {
			if ( this.getEvent()==null){
				SlopeImpulsionAtomic newEvent = ContinuousFactory.eINSTANCE.createSlopeImpulsionAtomic();
				newEvent.setProvider(this);
			}
		}
	}

} //SlopeImpulsionProviderImpl
