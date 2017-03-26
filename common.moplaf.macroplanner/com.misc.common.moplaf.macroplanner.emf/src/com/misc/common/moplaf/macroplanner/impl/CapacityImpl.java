/*******************************************************************************
 * Copyright (c) 2017 Michel Schaffers and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Michel Schaffers - initial API and implementation
 *******************************************************************************/
/**
 */
package com.misc.common.moplaf.macroplanner.impl;

import com.misc.common.moplaf.macroplanner.Capacity;
import com.misc.common.moplaf.macroplanner.LocationProduct;
import com.misc.common.moplaf.macroplanner.MacroPlannerPackage;
import com.misc.common.moplaf.macroplanner.SupplyChainLimits;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Capacity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.macroplanner.impl.CapacityImpl#getSupplyChainLimits <em>Supply Chain Limits</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.impl.CapacityImpl#getLocationProduct <em>Location Product</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.impl.CapacityImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.impl.CapacityImpl#getFrom <em>From</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.impl.CapacityImpl#getTo <em>To</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.impl.CapacityImpl#getCost <em>Cost</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.impl.CapacityImpl#isEnforce <em>Enforce</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.impl.CapacityImpl#getPenalty <em>Penalty</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CapacityImpl extends MinimalEObjectImpl.Container implements Capacity {
	/**
	 * The cached value of the '{@link #getLocationProduct() <em>Location Product</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationProduct()
	 * @generated
	 * @ordered
	 */
	protected LocationProduct locationProduct;

	/**
	 * The default value of the '{@link #getQuantity() <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected static final float QUANTITY_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getQuantity() <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected float quantity = QUANTITY_EDEFAULT;

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
	 * The default value of the '{@link #isEnforce() <em>Enforce</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnforce()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ENFORCE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEnforce() <em>Enforce</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnforce()
	 * @generated
	 * @ordered
	 */
	protected boolean enforce = ENFORCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPenalty() <em>Penalty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPenalty()
	 * @generated
	 * @ordered
	 */
	protected static final float PENALTY_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPenalty() <em>Penalty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPenalty()
	 * @generated
	 * @ordered
	 */
	protected float penalty = PENALTY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CapacityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MacroPlannerPackage.Literals.CAPACITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupplyChainLimits getSupplyChainLimits() {
		if (eContainerFeatureID() != MacroPlannerPackage.CAPACITY__SUPPLY_CHAIN_LIMITS) return null;
		return (SupplyChainLimits)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSupplyChainLimits(SupplyChainLimits newSupplyChainLimits, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSupplyChainLimits, MacroPlannerPackage.CAPACITY__SUPPLY_CHAIN_LIMITS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSupplyChainLimits(SupplyChainLimits newSupplyChainLimits) {
		if (newSupplyChainLimits != eInternalContainer() || (eContainerFeatureID() != MacroPlannerPackage.CAPACITY__SUPPLY_CHAIN_LIMITS && newSupplyChainLimits != null)) {
			if (EcoreUtil.isAncestor(this, newSupplyChainLimits))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSupplyChainLimits != null)
				msgs = ((InternalEObject)newSupplyChainLimits).eInverseAdd(this, MacroPlannerPackage.SUPPLY_CHAIN_LIMITS__CAPACITIES, SupplyChainLimits.class, msgs);
			msgs = basicSetSupplyChainLimits(newSupplyChainLimits, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MacroPlannerPackage.CAPACITY__SUPPLY_CHAIN_LIMITS, newSupplyChainLimits, newSupplyChainLimits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getQuantity() {
		return quantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantity(float newQuantity) {
		float oldQuantity = quantity;
		quantity = newQuantity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MacroPlannerPackage.CAPACITY__QUANTITY, oldQuantity, quantity));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MacroPlannerPackage.CAPACITY__FROM, oldFrom, from));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MacroPlannerPackage.CAPACITY__TO, oldTo, to));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MacroPlannerPackage.CAPACITY__COST, oldCost, cost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEnforce() {
		return enforce;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnforce(boolean newEnforce) {
		boolean oldEnforce = enforce;
		enforce = newEnforce;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MacroPlannerPackage.CAPACITY__ENFORCE, oldEnforce, enforce));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getPenalty() {
		return penalty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPenalty(float newPenalty) {
		float oldPenalty = penalty;
		penalty = newPenalty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MacroPlannerPackage.CAPACITY__PENALTY, oldPenalty, penalty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationProduct getLocationProduct() {
		if (locationProduct != null && locationProduct.eIsProxy()) {
			InternalEObject oldLocationProduct = (InternalEObject)locationProduct;
			locationProduct = (LocationProduct)eResolveProxy(oldLocationProduct);
			if (locationProduct != oldLocationProduct) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MacroPlannerPackage.CAPACITY__LOCATION_PRODUCT, oldLocationProduct, locationProduct));
			}
		}
		return locationProduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationProduct basicGetLocationProduct() {
		return locationProduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocationProduct(LocationProduct newLocationProduct, NotificationChain msgs) {
		LocationProduct oldLocationProduct = locationProduct;
		locationProduct = newLocationProduct;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MacroPlannerPackage.CAPACITY__LOCATION_PRODUCT, oldLocationProduct, newLocationProduct);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocationProduct(LocationProduct newLocationProduct) {
		if (newLocationProduct != locationProduct) {
			NotificationChain msgs = null;
			if (locationProduct != null)
				msgs = ((InternalEObject)locationProduct).eInverseRemove(this, MacroPlannerPackage.LOCATION_PRODUCT__CAPACITIES, LocationProduct.class, msgs);
			if (newLocationProduct != null)
				msgs = ((InternalEObject)newLocationProduct).eInverseAdd(this, MacroPlannerPackage.LOCATION_PRODUCT__CAPACITIES, LocationProduct.class, msgs);
			msgs = basicSetLocationProduct(newLocationProduct, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MacroPlannerPackage.CAPACITY__LOCATION_PRODUCT, newLocationProduct, newLocationProduct));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MacroPlannerPackage.CAPACITY__SUPPLY_CHAIN_LIMITS:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSupplyChainLimits((SupplyChainLimits)otherEnd, msgs);
			case MacroPlannerPackage.CAPACITY__LOCATION_PRODUCT:
				if (locationProduct != null)
					msgs = ((InternalEObject)locationProduct).eInverseRemove(this, MacroPlannerPackage.LOCATION_PRODUCT__CAPACITIES, LocationProduct.class, msgs);
				return basicSetLocationProduct((LocationProduct)otherEnd, msgs);
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
			case MacroPlannerPackage.CAPACITY__SUPPLY_CHAIN_LIMITS:
				return basicSetSupplyChainLimits(null, msgs);
			case MacroPlannerPackage.CAPACITY__LOCATION_PRODUCT:
				return basicSetLocationProduct(null, msgs);
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
			case MacroPlannerPackage.CAPACITY__SUPPLY_CHAIN_LIMITS:
				return eInternalContainer().eInverseRemove(this, MacroPlannerPackage.SUPPLY_CHAIN_LIMITS__CAPACITIES, SupplyChainLimits.class, msgs);
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
			case MacroPlannerPackage.CAPACITY__SUPPLY_CHAIN_LIMITS:
				return getSupplyChainLimits();
			case MacroPlannerPackage.CAPACITY__LOCATION_PRODUCT:
				if (resolve) return getLocationProduct();
				return basicGetLocationProduct();
			case MacroPlannerPackage.CAPACITY__QUANTITY:
				return getQuantity();
			case MacroPlannerPackage.CAPACITY__FROM:
				return getFrom();
			case MacroPlannerPackage.CAPACITY__TO:
				return getTo();
			case MacroPlannerPackage.CAPACITY__COST:
				return getCost();
			case MacroPlannerPackage.CAPACITY__ENFORCE:
				return isEnforce();
			case MacroPlannerPackage.CAPACITY__PENALTY:
				return getPenalty();
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
			case MacroPlannerPackage.CAPACITY__SUPPLY_CHAIN_LIMITS:
				setSupplyChainLimits((SupplyChainLimits)newValue);
				return;
			case MacroPlannerPackage.CAPACITY__LOCATION_PRODUCT:
				setLocationProduct((LocationProduct)newValue);
				return;
			case MacroPlannerPackage.CAPACITY__QUANTITY:
				setQuantity((Float)newValue);
				return;
			case MacroPlannerPackage.CAPACITY__FROM:
				setFrom((Date)newValue);
				return;
			case MacroPlannerPackage.CAPACITY__TO:
				setTo((Date)newValue);
				return;
			case MacroPlannerPackage.CAPACITY__COST:
				setCost((Float)newValue);
				return;
			case MacroPlannerPackage.CAPACITY__ENFORCE:
				setEnforce((Boolean)newValue);
				return;
			case MacroPlannerPackage.CAPACITY__PENALTY:
				setPenalty((Float)newValue);
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
			case MacroPlannerPackage.CAPACITY__SUPPLY_CHAIN_LIMITS:
				setSupplyChainLimits((SupplyChainLimits)null);
				return;
			case MacroPlannerPackage.CAPACITY__LOCATION_PRODUCT:
				setLocationProduct((LocationProduct)null);
				return;
			case MacroPlannerPackage.CAPACITY__QUANTITY:
				setQuantity(QUANTITY_EDEFAULT);
				return;
			case MacroPlannerPackage.CAPACITY__FROM:
				setFrom(FROM_EDEFAULT);
				return;
			case MacroPlannerPackage.CAPACITY__TO:
				setTo(TO_EDEFAULT);
				return;
			case MacroPlannerPackage.CAPACITY__COST:
				setCost(COST_EDEFAULT);
				return;
			case MacroPlannerPackage.CAPACITY__ENFORCE:
				setEnforce(ENFORCE_EDEFAULT);
				return;
			case MacroPlannerPackage.CAPACITY__PENALTY:
				setPenalty(PENALTY_EDEFAULT);
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
			case MacroPlannerPackage.CAPACITY__SUPPLY_CHAIN_LIMITS:
				return getSupplyChainLimits() != null;
			case MacroPlannerPackage.CAPACITY__LOCATION_PRODUCT:
				return locationProduct != null;
			case MacroPlannerPackage.CAPACITY__QUANTITY:
				return quantity != QUANTITY_EDEFAULT;
			case MacroPlannerPackage.CAPACITY__FROM:
				return FROM_EDEFAULT == null ? from != null : !FROM_EDEFAULT.equals(from);
			case MacroPlannerPackage.CAPACITY__TO:
				return TO_EDEFAULT == null ? to != null : !TO_EDEFAULT.equals(to);
			case MacroPlannerPackage.CAPACITY__COST:
				return cost != COST_EDEFAULT;
			case MacroPlannerPackage.CAPACITY__ENFORCE:
				return enforce != ENFORCE_EDEFAULT;
			case MacroPlannerPackage.CAPACITY__PENALTY:
				return penalty != PENALTY_EDEFAULT;
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
		result.append(" (Quantity: ");
		result.append(quantity);
		result.append(", From: ");
		result.append(from);
		result.append(", To: ");
		result.append(to);
		result.append(", Cost: ");
		result.append(cost);
		result.append(", Enforce: ");
		result.append(enforce);
		result.append(", Penalty: ");
		result.append(penalty);
		result.append(')');
		return result.toString();
	}

} //CapacityImpl
