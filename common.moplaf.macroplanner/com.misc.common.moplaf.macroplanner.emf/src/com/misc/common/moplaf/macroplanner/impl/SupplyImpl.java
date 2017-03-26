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

import com.misc.common.moplaf.macroplanner.LocationProduct;
import com.misc.common.moplaf.macroplanner.MacroPlannerPackage;
import com.misc.common.moplaf.macroplanner.Supply;

import com.misc.common.moplaf.macroplanner.SupplyChainData;
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
 * An implementation of the model object '<em><b>Supply</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.macroplanner.impl.SupplyImpl#getSupplyChainData <em>Supply Chain Data</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.impl.SupplyImpl#getLocationProduct <em>Location Product</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.impl.SupplyImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.impl.SupplyImpl#getFrom <em>From</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.impl.SupplyImpl#getTo <em>To</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.impl.SupplyImpl#getCost <em>Cost</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.impl.SupplyImpl#isEnforce <em>Enforce</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SupplyImpl extends MinimalEObjectImpl.Container implements Supply {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SupplyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MacroPlannerPackage.Literals.SUPPLY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupplyChainData getSupplyChainData() {
		if (eContainerFeatureID() != MacroPlannerPackage.SUPPLY__SUPPLY_CHAIN_DATA) return null;
		return (SupplyChainData)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSupplyChainData(SupplyChainData newSupplyChainData, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSupplyChainData, MacroPlannerPackage.SUPPLY__SUPPLY_CHAIN_DATA, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSupplyChainData(SupplyChainData newSupplyChainData) {
		if (newSupplyChainData != eInternalContainer() || (eContainerFeatureID() != MacroPlannerPackage.SUPPLY__SUPPLY_CHAIN_DATA && newSupplyChainData != null)) {
			if (EcoreUtil.isAncestor(this, newSupplyChainData))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSupplyChainData != null)
				msgs = ((InternalEObject)newSupplyChainData).eInverseAdd(this, MacroPlannerPackage.SUPPLY_CHAIN_DATA__SUPPLIES, SupplyChainData.class, msgs);
			msgs = basicSetSupplyChainData(newSupplyChainData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MacroPlannerPackage.SUPPLY__SUPPLY_CHAIN_DATA, newSupplyChainData, newSupplyChainData));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MacroPlannerPackage.SUPPLY__QUANTITY, oldQuantity, quantity));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MacroPlannerPackage.SUPPLY__FROM, oldFrom, from));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MacroPlannerPackage.SUPPLY__TO, oldTo, to));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MacroPlannerPackage.SUPPLY__COST, oldCost, cost));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MacroPlannerPackage.SUPPLY__LOCATION_PRODUCT, oldLocationProduct, locationProduct));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MacroPlannerPackage.SUPPLY__LOCATION_PRODUCT, oldLocationProduct, newLocationProduct);
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
				msgs = ((InternalEObject)locationProduct).eInverseRemove(this, MacroPlannerPackage.LOCATION_PRODUCT__SUPPLIES, LocationProduct.class, msgs);
			if (newLocationProduct != null)
				msgs = ((InternalEObject)newLocationProduct).eInverseAdd(this, MacroPlannerPackage.LOCATION_PRODUCT__SUPPLIES, LocationProduct.class, msgs);
			msgs = basicSetLocationProduct(newLocationProduct, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MacroPlannerPackage.SUPPLY__LOCATION_PRODUCT, newLocationProduct, newLocationProduct));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MacroPlannerPackage.SUPPLY__ENFORCE, oldEnforce, enforce));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MacroPlannerPackage.SUPPLY__SUPPLY_CHAIN_DATA:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSupplyChainData((SupplyChainData)otherEnd, msgs);
			case MacroPlannerPackage.SUPPLY__LOCATION_PRODUCT:
				if (locationProduct != null)
					msgs = ((InternalEObject)locationProduct).eInverseRemove(this, MacroPlannerPackage.LOCATION_PRODUCT__SUPPLIES, LocationProduct.class, msgs);
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
			case MacroPlannerPackage.SUPPLY__SUPPLY_CHAIN_DATA:
				return basicSetSupplyChainData(null, msgs);
			case MacroPlannerPackage.SUPPLY__LOCATION_PRODUCT:
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
			case MacroPlannerPackage.SUPPLY__SUPPLY_CHAIN_DATA:
				return eInternalContainer().eInverseRemove(this, MacroPlannerPackage.SUPPLY_CHAIN_DATA__SUPPLIES, SupplyChainData.class, msgs);
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
			case MacroPlannerPackage.SUPPLY__SUPPLY_CHAIN_DATA:
				return getSupplyChainData();
			case MacroPlannerPackage.SUPPLY__LOCATION_PRODUCT:
				if (resolve) return getLocationProduct();
				return basicGetLocationProduct();
			case MacroPlannerPackage.SUPPLY__QUANTITY:
				return getQuantity();
			case MacroPlannerPackage.SUPPLY__FROM:
				return getFrom();
			case MacroPlannerPackage.SUPPLY__TO:
				return getTo();
			case MacroPlannerPackage.SUPPLY__COST:
				return getCost();
			case MacroPlannerPackage.SUPPLY__ENFORCE:
				return isEnforce();
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
			case MacroPlannerPackage.SUPPLY__SUPPLY_CHAIN_DATA:
				setSupplyChainData((SupplyChainData)newValue);
				return;
			case MacroPlannerPackage.SUPPLY__LOCATION_PRODUCT:
				setLocationProduct((LocationProduct)newValue);
				return;
			case MacroPlannerPackage.SUPPLY__QUANTITY:
				setQuantity((Float)newValue);
				return;
			case MacroPlannerPackage.SUPPLY__FROM:
				setFrom((Date)newValue);
				return;
			case MacroPlannerPackage.SUPPLY__TO:
				setTo((Date)newValue);
				return;
			case MacroPlannerPackage.SUPPLY__COST:
				setCost((Float)newValue);
				return;
			case MacroPlannerPackage.SUPPLY__ENFORCE:
				setEnforce((Boolean)newValue);
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
			case MacroPlannerPackage.SUPPLY__SUPPLY_CHAIN_DATA:
				setSupplyChainData((SupplyChainData)null);
				return;
			case MacroPlannerPackage.SUPPLY__LOCATION_PRODUCT:
				setLocationProduct((LocationProduct)null);
				return;
			case MacroPlannerPackage.SUPPLY__QUANTITY:
				setQuantity(QUANTITY_EDEFAULT);
				return;
			case MacroPlannerPackage.SUPPLY__FROM:
				setFrom(FROM_EDEFAULT);
				return;
			case MacroPlannerPackage.SUPPLY__TO:
				setTo(TO_EDEFAULT);
				return;
			case MacroPlannerPackage.SUPPLY__COST:
				setCost(COST_EDEFAULT);
				return;
			case MacroPlannerPackage.SUPPLY__ENFORCE:
				setEnforce(ENFORCE_EDEFAULT);
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
			case MacroPlannerPackage.SUPPLY__SUPPLY_CHAIN_DATA:
				return getSupplyChainData() != null;
			case MacroPlannerPackage.SUPPLY__LOCATION_PRODUCT:
				return locationProduct != null;
			case MacroPlannerPackage.SUPPLY__QUANTITY:
				return quantity != QUANTITY_EDEFAULT;
			case MacroPlannerPackage.SUPPLY__FROM:
				return FROM_EDEFAULT == null ? from != null : !FROM_EDEFAULT.equals(from);
			case MacroPlannerPackage.SUPPLY__TO:
				return TO_EDEFAULT == null ? to != null : !TO_EDEFAULT.equals(to);
			case MacroPlannerPackage.SUPPLY__COST:
				return cost != COST_EDEFAULT;
			case MacroPlannerPackage.SUPPLY__ENFORCE:
				return enforce != ENFORCE_EDEFAULT;
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
		result.append(')');
		return result.toString();
	}

} //SupplyImpl
