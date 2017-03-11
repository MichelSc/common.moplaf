/**
 */
package com.misc.common.moplaf.macroplanner.impl;

import com.misc.common.moplaf.macroplanner.LocationResource;
import com.misc.common.moplaf.macroplanner.MacroPlannerPackage;
import com.misc.common.moplaf.macroplanner.Routing;
import com.misc.common.moplaf.macroplanner.RoutingResource;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Routing Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.macroplanner.impl.RoutingResourceImpl#getRouting <em>Routing</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.impl.RoutingResourceImpl#getLocationResource <em>Location Resource</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.impl.RoutingResourceImpl#getReservation <em>Reservation</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.impl.RoutingResourceImpl#getOffset <em>Offset</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.impl.RoutingResourceImpl#getCode <em>Code</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.impl.RoutingResourceImpl#getFactor <em>Factor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RoutingResourceImpl extends MinimalEObjectImpl.Container implements RoutingResource {
	/**
	 * The cached value of the '{@link #getLocationResource() <em>Location Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationResource()
	 * @generated
	 * @ordered
	 */
	protected LocationResource locationResource;

	/**
	 * The default value of the '{@link #getReservation() <em>Reservation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReservation()
	 * @generated
	 * @ordered
	 */
	protected static final float RESERVATION_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getReservation() <em>Reservation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReservation()
	 * @generated
	 * @ordered
	 */
	protected float reservation = RESERVATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getOffset() <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffset()
	 * @generated
	 * @ordered
	 */
	protected static final float OFFSET_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getOffset() <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffset()
	 * @generated
	 * @ordered
	 */
	protected float offset = OFFSET_EDEFAULT;

	/**
	 * The default value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getFactor() <em>Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFactor()
	 * @generated
	 * @ordered
	 */
	protected static final float FACTOR_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getFactor() <em>Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFactor()
	 * @generated
	 * @ordered
	 */
	protected float factor = FACTOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoutingResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MacroPlannerPackage.Literals.ROUTING_RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Routing getRouting() {
		if (eContainerFeatureID() != MacroPlannerPackage.ROUTING_RESOURCE__ROUTING) return null;
		return (Routing)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRouting(Routing newRouting, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newRouting, MacroPlannerPackage.ROUTING_RESOURCE__ROUTING, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRouting(Routing newRouting) {
		if (newRouting != eInternalContainer() || (eContainerFeatureID() != MacroPlannerPackage.ROUTING_RESOURCE__ROUTING && newRouting != null)) {
			if (EcoreUtil.isAncestor(this, newRouting))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newRouting != null)
				msgs = ((InternalEObject)newRouting).eInverseAdd(this, MacroPlannerPackage.ROUTING__RESOURCES, Routing.class, msgs);
			msgs = basicSetRouting(newRouting, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MacroPlannerPackage.ROUTING_RESOURCE__ROUTING, newRouting, newRouting));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getReservation() {
		return reservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReservation(float newReservation) {
		float oldReservation = reservation;
		reservation = newReservation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MacroPlannerPackage.ROUTING_RESOURCE__RESERVATION, oldReservation, reservation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getOffset() {
		return offset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOffset(float newOffset) {
		float oldOffset = offset;
		offset = newOffset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MacroPlannerPackage.ROUTING_RESOURCE__OFFSET, oldOffset, offset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationResource getLocationResource() {
		if (locationResource != null && locationResource.eIsProxy()) {
			InternalEObject oldLocationResource = (InternalEObject)locationResource;
			locationResource = (LocationResource)eResolveProxy(oldLocationResource);
			if (locationResource != oldLocationResource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MacroPlannerPackage.ROUTING_RESOURCE__LOCATION_RESOURCE, oldLocationResource, locationResource));
			}
		}
		return locationResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationResource basicGetLocationResource() {
		return locationResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocationResource(LocationResource newLocationResource) {
		LocationResource oldLocationResource = locationResource;
		locationResource = newLocationResource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MacroPlannerPackage.ROUTING_RESOURCE__LOCATION_RESOURCE, oldLocationResource, locationResource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public String getCode() {
		String code = String.format("RR(%s,%s)", 
				this.getRouting()==null ? "null": this.getRouting().getCode(),
				this.getLocationResource()==null  ? "null": this.getLocationResource().getCode());
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getFactor() {
		return factor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFactor(float newFactor) {
		float oldFactor = factor;
		factor = newFactor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MacroPlannerPackage.ROUTING_RESOURCE__FACTOR, oldFactor, factor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MacroPlannerPackage.ROUTING_RESOURCE__ROUTING:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetRouting((Routing)otherEnd, msgs);
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
			case MacroPlannerPackage.ROUTING_RESOURCE__ROUTING:
				return basicSetRouting(null, msgs);
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
			case MacroPlannerPackage.ROUTING_RESOURCE__ROUTING:
				return eInternalContainer().eInverseRemove(this, MacroPlannerPackage.ROUTING__RESOURCES, Routing.class, msgs);
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
			case MacroPlannerPackage.ROUTING_RESOURCE__ROUTING:
				return getRouting();
			case MacroPlannerPackage.ROUTING_RESOURCE__LOCATION_RESOURCE:
				if (resolve) return getLocationResource();
				return basicGetLocationResource();
			case MacroPlannerPackage.ROUTING_RESOURCE__RESERVATION:
				return getReservation();
			case MacroPlannerPackage.ROUTING_RESOURCE__OFFSET:
				return getOffset();
			case MacroPlannerPackage.ROUTING_RESOURCE__CODE:
				return getCode();
			case MacroPlannerPackage.ROUTING_RESOURCE__FACTOR:
				return getFactor();
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
			case MacroPlannerPackage.ROUTING_RESOURCE__ROUTING:
				setRouting((Routing)newValue);
				return;
			case MacroPlannerPackage.ROUTING_RESOURCE__LOCATION_RESOURCE:
				setLocationResource((LocationResource)newValue);
				return;
			case MacroPlannerPackage.ROUTING_RESOURCE__RESERVATION:
				setReservation((Float)newValue);
				return;
			case MacroPlannerPackage.ROUTING_RESOURCE__OFFSET:
				setOffset((Float)newValue);
				return;
			case MacroPlannerPackage.ROUTING_RESOURCE__FACTOR:
				setFactor((Float)newValue);
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
			case MacroPlannerPackage.ROUTING_RESOURCE__ROUTING:
				setRouting((Routing)null);
				return;
			case MacroPlannerPackage.ROUTING_RESOURCE__LOCATION_RESOURCE:
				setLocationResource((LocationResource)null);
				return;
			case MacroPlannerPackage.ROUTING_RESOURCE__RESERVATION:
				setReservation(RESERVATION_EDEFAULT);
				return;
			case MacroPlannerPackage.ROUTING_RESOURCE__OFFSET:
				setOffset(OFFSET_EDEFAULT);
				return;
			case MacroPlannerPackage.ROUTING_RESOURCE__FACTOR:
				setFactor(FACTOR_EDEFAULT);
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
			case MacroPlannerPackage.ROUTING_RESOURCE__ROUTING:
				return getRouting() != null;
			case MacroPlannerPackage.ROUTING_RESOURCE__LOCATION_RESOURCE:
				return locationResource != null;
			case MacroPlannerPackage.ROUTING_RESOURCE__RESERVATION:
				return reservation != RESERVATION_EDEFAULT;
			case MacroPlannerPackage.ROUTING_RESOURCE__OFFSET:
				return offset != OFFSET_EDEFAULT;
			case MacroPlannerPackage.ROUTING_RESOURCE__CODE:
				return CODE_EDEFAULT == null ? getCode() != null : !CODE_EDEFAULT.equals(getCode());
			case MacroPlannerPackage.ROUTING_RESOURCE__FACTOR:
				return factor != FACTOR_EDEFAULT;
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
		result.append(" (Reservation: ");
		result.append(reservation);
		result.append(", Offset: ");
		result.append(offset);
		result.append(", Factor: ");
		result.append(factor);
		result.append(')');
		return result.toString();
	}

} //RoutingResourceImpl
