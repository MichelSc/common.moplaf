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
import com.misc.common.moplaf.macroplanner.LocationResource;
import com.misc.common.moplaf.macroplanner.MacroPlannerFactory;
import com.misc.common.moplaf.macroplanner.MacroPlannerPackage;
import com.misc.common.moplaf.macroplanner.Routing;
import com.misc.common.moplaf.macroplanner.RoutingProduct;
import com.misc.common.moplaf.macroplanner.RoutingResource;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Routing</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.macroplanner.impl.RoutingImpl#getResources <em>Resources</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.impl.RoutingImpl#getProducts <em>Products</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.impl.RoutingImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.impl.RoutingImpl#getCode <em>Code</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.impl.RoutingImpl#getCost <em>Cost</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RoutingImpl extends MacroPlannerDataElementImpl implements Routing {
	/**
	 * The cached value of the '{@link #getResources() <em>Resources</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResources()
	 * @generated
	 * @ordered
	 */
	protected EList<RoutingResource> resources;

	/**
	 * The cached value of the '{@link #getProducts() <em>Products</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProducts()
	 * @generated
	 * @ordered
	 */
	protected EList<RoutingProduct> products;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

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
	 * The cached value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected String code = CODE_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoutingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MacroPlannerPackage.Literals.ROUTING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RoutingResource> getResources() {
		if (resources == null) {
			resources = new EObjectContainmentWithInverseEList<RoutingResource>(RoutingResource.class, this, MacroPlannerPackage.ROUTING__RESOURCES, MacroPlannerPackage.ROUTING_RESOURCE__ROUTING);
		}
		return resources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RoutingProduct> getProducts() {
		if (products == null) {
			products = new EObjectContainmentWithInverseEList<RoutingProduct>(RoutingProduct.class, this, MacroPlannerPackage.ROUTING__PRODUCTS, MacroPlannerPackage.ROUTING_PRODUCT__ROUTING);
		}
		return products;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MacroPlannerPackage.ROUTING__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(String newCode) {
		String oldCode = code;
		code = newCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MacroPlannerPackage.ROUTING__CODE, oldCode, code));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MacroPlannerPackage.ROUTING__COST, oldCost, cost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public RoutingProduct constructRoutingProduct(LocationProduct product) {
		RoutingProduct rp = MacroPlannerFactory.eINSTANCE.createRoutingProduct();
		rp.setLocationProduct(product);
		this.getProducts().add(rp);
		return rp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public RoutingResource constructRoutingResource(LocationResource resource) {
		RoutingResource rr = MacroPlannerFactory.eINSTANCE.createRoutingResource();
		rr.setLocationResource(resource);
		this.getResources().add(rr);
		return rr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MacroPlannerPackage.ROUTING__RESOURCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getResources()).basicAdd(otherEnd, msgs);
			case MacroPlannerPackage.ROUTING__PRODUCTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProducts()).basicAdd(otherEnd, msgs);
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
			case MacroPlannerPackage.ROUTING__RESOURCES:
				return ((InternalEList<?>)getResources()).basicRemove(otherEnd, msgs);
			case MacroPlannerPackage.ROUTING__PRODUCTS:
				return ((InternalEList<?>)getProducts()).basicRemove(otherEnd, msgs);
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
			case MacroPlannerPackage.ROUTING__RESOURCES:
				return getResources();
			case MacroPlannerPackage.ROUTING__PRODUCTS:
				return getProducts();
			case MacroPlannerPackage.ROUTING__NAME:
				return getName();
			case MacroPlannerPackage.ROUTING__CODE:
				return getCode();
			case MacroPlannerPackage.ROUTING__COST:
				return getCost();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MacroPlannerPackage.ROUTING__RESOURCES:
				getResources().clear();
				getResources().addAll((Collection<? extends RoutingResource>)newValue);
				return;
			case MacroPlannerPackage.ROUTING__PRODUCTS:
				getProducts().clear();
				getProducts().addAll((Collection<? extends RoutingProduct>)newValue);
				return;
			case MacroPlannerPackage.ROUTING__NAME:
				setName((String)newValue);
				return;
			case MacroPlannerPackage.ROUTING__CODE:
				setCode((String)newValue);
				return;
			case MacroPlannerPackage.ROUTING__COST:
				setCost((Float)newValue);
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
			case MacroPlannerPackage.ROUTING__RESOURCES:
				getResources().clear();
				return;
			case MacroPlannerPackage.ROUTING__PRODUCTS:
				getProducts().clear();
				return;
			case MacroPlannerPackage.ROUTING__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MacroPlannerPackage.ROUTING__CODE:
				setCode(CODE_EDEFAULT);
				return;
			case MacroPlannerPackage.ROUTING__COST:
				setCost(COST_EDEFAULT);
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
			case MacroPlannerPackage.ROUTING__RESOURCES:
				return resources != null && !resources.isEmpty();
			case MacroPlannerPackage.ROUTING__PRODUCTS:
				return products != null && !products.isEmpty();
			case MacroPlannerPackage.ROUTING__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case MacroPlannerPackage.ROUTING__CODE:
				return CODE_EDEFAULT == null ? code != null : !CODE_EDEFAULT.equals(code);
			case MacroPlannerPackage.ROUTING__COST:
				return cost != COST_EDEFAULT;
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
			case MacroPlannerPackage.ROUTING___CONSTRUCT_ROUTING_PRODUCT__LOCATIONPRODUCT:
				return constructRoutingProduct((LocationProduct)arguments.get(0));
			case MacroPlannerPackage.ROUTING___CONSTRUCT_ROUTING_RESOURCE__LOCATIONRESOURCE:
				return constructRoutingResource((LocationResource)arguments.get(0));
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
		result.append(" (Name: ");
		result.append(name);
		result.append(", Code: ");
		result.append(code);
		result.append(", Cost: ");
		result.append(cost);
		result.append(')');
		return result.toString();
	}

} //RoutingImpl
