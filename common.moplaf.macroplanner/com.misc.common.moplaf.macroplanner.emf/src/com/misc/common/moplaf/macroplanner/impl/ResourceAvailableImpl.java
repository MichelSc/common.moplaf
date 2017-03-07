/**
 */
package com.misc.common.moplaf.macroplanner.impl;

import com.misc.common.moplaf.macroplanner.LocationResource;
import com.misc.common.moplaf.macroplanner.MacroPlannerPackage;
import com.misc.common.moplaf.macroplanner.ResourceAvailable;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Available</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.macroplanner.impl.ResourceAvailableImpl#getAvailable <em>Available</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.impl.ResourceAvailableImpl#getFrom <em>From</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.impl.ResourceAvailableImpl#getTo <em>To</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.impl.ResourceAvailableImpl#getCost <em>Cost</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.impl.ResourceAvailableImpl#getLocationResource <em>Location Resource</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResourceAvailableImpl extends MinimalEObjectImpl.Container implements ResourceAvailable {
	/**
	 * The default value of the '{@link #getAvailable() <em>Available</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailable()
	 * @generated
	 * @ordered
	 */
	protected static final float AVAILABLE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getAvailable() <em>Available</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailable()
	 * @generated
	 * @ordered
	 */
	protected float available = AVAILABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFrom() <em>From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected static final Date FROM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFrom() <em>From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected Date from = FROM_EDEFAULT;

	/**
	 * The default value of the '{@link #getTo() <em>To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected static final Date TO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTo() <em>To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected Date to = TO_EDEFAULT;

	/**
	 * The default value of the '{@link #getCost() <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCost()
	 * @generated
	 * @ordered
	 */
	protected static final float COST_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCost() <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCost()
	 * @generated
	 * @ordered
	 */
	protected float cost = COST_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceAvailableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MacroPlannerPackage.Literals.RESOURCE_AVAILABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getAvailable() {
		return available;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAvailable(float newAvailable) {
		float oldAvailable = available;
		available = newAvailable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MacroPlannerPackage.RESOURCE_AVAILABLE__AVAILABLE, oldAvailable, available));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getFrom() {
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrom(Date newFrom) {
		Date oldFrom = from;
		from = newFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MacroPlannerPackage.RESOURCE_AVAILABLE__FROM, oldFrom, from));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getTo() {
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTo(Date newTo) {
		Date oldTo = to;
		to = newTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MacroPlannerPackage.RESOURCE_AVAILABLE__TO, oldTo, to));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getCost() {
		return cost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCost(float newCost) {
		float oldCost = cost;
		cost = newCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MacroPlannerPackage.RESOURCE_AVAILABLE__COST, oldCost, cost));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MacroPlannerPackage.RESOURCE_AVAILABLE__LOCATION_RESOURCE, oldLocationResource, locationResource));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MacroPlannerPackage.RESOURCE_AVAILABLE__LOCATION_RESOURCE, oldLocationResource, locationResource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MacroPlannerPackage.RESOURCE_AVAILABLE__AVAILABLE:
				return getAvailable();
			case MacroPlannerPackage.RESOURCE_AVAILABLE__FROM:
				return getFrom();
			case MacroPlannerPackage.RESOURCE_AVAILABLE__TO:
				return getTo();
			case MacroPlannerPackage.RESOURCE_AVAILABLE__COST:
				return getCost();
			case MacroPlannerPackage.RESOURCE_AVAILABLE__LOCATION_RESOURCE:
				if (resolve) return getLocationResource();
				return basicGetLocationResource();
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
			case MacroPlannerPackage.RESOURCE_AVAILABLE__AVAILABLE:
				setAvailable((Float)newValue);
				return;
			case MacroPlannerPackage.RESOURCE_AVAILABLE__FROM:
				setFrom((Date)newValue);
				return;
			case MacroPlannerPackage.RESOURCE_AVAILABLE__TO:
				setTo((Date)newValue);
				return;
			case MacroPlannerPackage.RESOURCE_AVAILABLE__COST:
				setCost((Float)newValue);
				return;
			case MacroPlannerPackage.RESOURCE_AVAILABLE__LOCATION_RESOURCE:
				setLocationResource((LocationResource)newValue);
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
			case MacroPlannerPackage.RESOURCE_AVAILABLE__AVAILABLE:
				setAvailable(AVAILABLE_EDEFAULT);
				return;
			case MacroPlannerPackage.RESOURCE_AVAILABLE__FROM:
				setFrom(FROM_EDEFAULT);
				return;
			case MacroPlannerPackage.RESOURCE_AVAILABLE__TO:
				setTo(TO_EDEFAULT);
				return;
			case MacroPlannerPackage.RESOURCE_AVAILABLE__COST:
				setCost(COST_EDEFAULT);
				return;
			case MacroPlannerPackage.RESOURCE_AVAILABLE__LOCATION_RESOURCE:
				setLocationResource((LocationResource)null);
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
			case MacroPlannerPackage.RESOURCE_AVAILABLE__AVAILABLE:
				return available != AVAILABLE_EDEFAULT;
			case MacroPlannerPackage.RESOURCE_AVAILABLE__FROM:
				return FROM_EDEFAULT == null ? from != null : !FROM_EDEFAULT.equals(from);
			case MacroPlannerPackage.RESOURCE_AVAILABLE__TO:
				return TO_EDEFAULT == null ? to != null : !TO_EDEFAULT.equals(to);
			case MacroPlannerPackage.RESOURCE_AVAILABLE__COST:
				return cost != COST_EDEFAULT;
			case MacroPlannerPackage.RESOURCE_AVAILABLE__LOCATION_RESOURCE:
				return locationResource != null;
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
		result.append(" (Available: ");
		result.append(available);
		result.append(", From: ");
		result.append(from);
		result.append(", To: ");
		result.append(to);
		result.append(", Cost: ");
		result.append(cost);
		result.append(')');
		return result.toString();
	}

} //ResourceAvailableImpl
