/*******************************************************************************
 * Copyright (c) 2017, 2018 Michel Schaffers and others.
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
import com.misc.common.moplaf.macroplanner.Routing;
import com.misc.common.moplaf.macroplanner.RoutingProduct;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Routing Product</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.macroplanner.impl.RoutingProductImpl#getRouting <em>Routing</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.impl.RoutingProductImpl#getLocationProduct <em>Location Product</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.impl.RoutingProductImpl#getCode <em>Code</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.impl.RoutingProductImpl#getConsumption <em>Consumption</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.impl.RoutingProductImpl#getOffset <em>Offset</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RoutingProductImpl extends MinimalEObjectImpl.Container implements RoutingProduct {
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
	 * The default value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getConsumption() <em>Consumption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsumption()
	 * @generated
	 * @ordered
	 */
	protected static final double CONSUMPTION_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getConsumption() <em>Consumption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsumption()
	 * @generated
	 * @ordered
	 */
	protected double consumption = CONSUMPTION_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoutingProductImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MacroPlannerPackage.Literals.ROUTING_PRODUCT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Routing getRouting() {
		if (eContainerFeatureID() != MacroPlannerPackage.ROUTING_PRODUCT__ROUTING) return null;
		return (Routing)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRouting(Routing newRouting, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newRouting, MacroPlannerPackage.ROUTING_PRODUCT__ROUTING, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRouting(Routing newRouting) {
		if (newRouting != eInternalContainer() || (eContainerFeatureID() != MacroPlannerPackage.ROUTING_PRODUCT__ROUTING && newRouting != null)) {
			if (EcoreUtil.isAncestor(this, newRouting))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newRouting != null)
				msgs = ((InternalEObject)newRouting).eInverseAdd(this, MacroPlannerPackage.ROUTING__PRODUCTS, Routing.class, msgs);
			msgs = basicSetRouting(newRouting, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MacroPlannerPackage.ROUTING_PRODUCT__ROUTING, newRouting, newRouting));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getConsumption() {
		return consumption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConsumption(double newConsumption) {
		double oldConsumption = consumption;
		consumption = newConsumption;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MacroPlannerPackage.ROUTING_PRODUCT__CONSUMPTION, oldConsumption, consumption));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MacroPlannerPackage.ROUTING_PRODUCT__OFFSET, oldOffset, offset));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MacroPlannerPackage.ROUTING_PRODUCT__LOCATION_PRODUCT, oldLocationProduct, locationProduct));
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
	public void setLocationProduct(LocationProduct newLocationProduct) {
		LocationProduct oldLocationProduct = locationProduct;
		locationProduct = newLocationProduct;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MacroPlannerPackage.ROUTING_PRODUCT__LOCATION_PRODUCT, oldLocationProduct, locationProduct));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public String getCode() {
		String code = String.format("RR(%s,%s)", 
				this.getRouting()==null ? "null": this.getRouting().getCode(),
				this.getLocationProduct()==null  ? "null": this.getLocationProduct().getCode());
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MacroPlannerPackage.ROUTING_PRODUCT__ROUTING:
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
			case MacroPlannerPackage.ROUTING_PRODUCT__ROUTING:
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
			case MacroPlannerPackage.ROUTING_PRODUCT__ROUTING:
				return eInternalContainer().eInverseRemove(this, MacroPlannerPackage.ROUTING__PRODUCTS, Routing.class, msgs);
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
			case MacroPlannerPackage.ROUTING_PRODUCT__ROUTING:
				return getRouting();
			case MacroPlannerPackage.ROUTING_PRODUCT__LOCATION_PRODUCT:
				if (resolve) return getLocationProduct();
				return basicGetLocationProduct();
			case MacroPlannerPackage.ROUTING_PRODUCT__CODE:
				return getCode();
			case MacroPlannerPackage.ROUTING_PRODUCT__CONSUMPTION:
				return getConsumption();
			case MacroPlannerPackage.ROUTING_PRODUCT__OFFSET:
				return getOffset();
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
			case MacroPlannerPackage.ROUTING_PRODUCT__ROUTING:
				setRouting((Routing)newValue);
				return;
			case MacroPlannerPackage.ROUTING_PRODUCT__LOCATION_PRODUCT:
				setLocationProduct((LocationProduct)newValue);
				return;
			case MacroPlannerPackage.ROUTING_PRODUCT__CONSUMPTION:
				setConsumption((Double)newValue);
				return;
			case MacroPlannerPackage.ROUTING_PRODUCT__OFFSET:
				setOffset((Float)newValue);
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
			case MacroPlannerPackage.ROUTING_PRODUCT__ROUTING:
				setRouting((Routing)null);
				return;
			case MacroPlannerPackage.ROUTING_PRODUCT__LOCATION_PRODUCT:
				setLocationProduct((LocationProduct)null);
				return;
			case MacroPlannerPackage.ROUTING_PRODUCT__CONSUMPTION:
				setConsumption(CONSUMPTION_EDEFAULT);
				return;
			case MacroPlannerPackage.ROUTING_PRODUCT__OFFSET:
				setOffset(OFFSET_EDEFAULT);
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
			case MacroPlannerPackage.ROUTING_PRODUCT__ROUTING:
				return getRouting() != null;
			case MacroPlannerPackage.ROUTING_PRODUCT__LOCATION_PRODUCT:
				return locationProduct != null;
			case MacroPlannerPackage.ROUTING_PRODUCT__CODE:
				return CODE_EDEFAULT == null ? getCode() != null : !CODE_EDEFAULT.equals(getCode());
			case MacroPlannerPackage.ROUTING_PRODUCT__CONSUMPTION:
				return consumption != CONSUMPTION_EDEFAULT;
			case MacroPlannerPackage.ROUTING_PRODUCT__OFFSET:
				return offset != OFFSET_EDEFAULT;
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
		result.append(" (Consumption: ");
		result.append(consumption);
		result.append(", Offset: ");
		result.append(offset);
		result.append(')');
		return result.toString();
	}

} //RoutingProductImpl
