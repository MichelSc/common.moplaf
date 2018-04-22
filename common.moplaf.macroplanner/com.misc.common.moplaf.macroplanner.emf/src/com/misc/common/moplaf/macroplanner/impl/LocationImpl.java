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

import com.misc.common.moplaf.macroplanner.Location;
import com.misc.common.moplaf.macroplanner.LocationProduct;
import com.misc.common.moplaf.macroplanner.LocationResource;
import com.misc.common.moplaf.macroplanner.MacroPlannerFactory;
import com.misc.common.moplaf.macroplanner.MacroPlannerPackage;

import com.misc.common.moplaf.macroplanner.Product;
import com.misc.common.moplaf.macroplanner.Resource;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Location</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.macroplanner.impl.LocationImpl#getProducts <em>Products</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.impl.LocationImpl#getResources <em>Resources</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.impl.LocationImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.impl.LocationImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.impl.LocationImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.impl.LocationImpl#getCode <em>Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LocationImpl extends MinimalEObjectImpl.Container implements Location {
	/**
	 * The cached value of the '{@link #getProducts() <em>Products</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProducts()
	 * @generated
	 * @ordered
	 */
	protected EList<LocationProduct> products;

	/**
	 * The cached value of the '{@link #getResources() <em>Resources</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResources()
	 * @generated
	 * @ordered
	 */
	protected EList<LocationResource> resources;

	/**
	 * The cached value of the '{@link #getChildren() <em>Children</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildren()
	 * @generated
	 * @ordered
	 */
	protected EList<Location> children;

	/**
	 * The cached value of the '{@link #getParent() <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParent()
	 * @generated
	 * @ordered
	 */
	protected Location parent;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MacroPlannerPackage.Literals.LOCATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LocationProduct> getProducts() {
		if (products == null) {
			products = new EObjectContainmentWithInverseEList<LocationProduct>(LocationProduct.class, this, MacroPlannerPackage.LOCATION__PRODUCTS, MacroPlannerPackage.LOCATION_PRODUCT__LOCATION);
		}
		return products;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LocationResource> getResources() {
		if (resources == null) {
			resources = new EObjectContainmentWithInverseEList<LocationResource>(LocationResource.class, this, MacroPlannerPackage.LOCATION__RESOURCES, MacroPlannerPackage.LOCATION_RESOURCE__LOCATION);
		}
		return resources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Location> getChildren() {
		if (children == null) {
			children = new EObjectWithInverseResolvingEList<Location>(Location.class, this, MacroPlannerPackage.LOCATION__CHILDREN, MacroPlannerPackage.LOCATION__PARENT);
		}
		return children;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location getParent() {
		if (parent != null && parent.eIsProxy()) {
			InternalEObject oldParent = (InternalEObject)parent;
			parent = (Location)eResolveProxy(oldParent);
			if (parent != oldParent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MacroPlannerPackage.LOCATION__PARENT, oldParent, parent));
			}
		}
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location basicGetParent() {
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(Location newParent, NotificationChain msgs) {
		Location oldParent = parent;
		parent = newParent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MacroPlannerPackage.LOCATION__PARENT, oldParent, newParent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(Location newParent) {
		if (newParent != parent) {
			NotificationChain msgs = null;
			if (parent != null)
				msgs = ((InternalEObject)parent).eInverseRemove(this, MacroPlannerPackage.LOCATION__CHILDREN, Location.class, msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, MacroPlannerPackage.LOCATION__CHILDREN, Location.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MacroPlannerPackage.LOCATION__PARENT, newParent, newParent));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MacroPlannerPackage.LOCATION__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MacroPlannerPackage.LOCATION__CODE, oldCode, code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public LocationProduct constructLocationProduct(Product product) {
		LocationProduct lp = MacroPlannerFactory.eINSTANCE.createLocationProduct();
		lp.setProduct(product);
		this.getProducts().add(lp); // owning
		return lp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public LocationResource constructLocationResource(Resource resource) {
		LocationResource lr = MacroPlannerFactory.eINSTANCE.createLocationResource();
		lr.setResource(resource);
		this.getResources().add(lr); // owning
		return lr;
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
			case MacroPlannerPackage.LOCATION__PRODUCTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProducts()).basicAdd(otherEnd, msgs);
			case MacroPlannerPackage.LOCATION__RESOURCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getResources()).basicAdd(otherEnd, msgs);
			case MacroPlannerPackage.LOCATION__CHILDREN:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getChildren()).basicAdd(otherEnd, msgs);
			case MacroPlannerPackage.LOCATION__PARENT:
				if (parent != null)
					msgs = ((InternalEObject)parent).eInverseRemove(this, MacroPlannerPackage.LOCATION__CHILDREN, Location.class, msgs);
				return basicSetParent((Location)otherEnd, msgs);
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
			case MacroPlannerPackage.LOCATION__PRODUCTS:
				return ((InternalEList<?>)getProducts()).basicRemove(otherEnd, msgs);
			case MacroPlannerPackage.LOCATION__RESOURCES:
				return ((InternalEList<?>)getResources()).basicRemove(otherEnd, msgs);
			case MacroPlannerPackage.LOCATION__CHILDREN:
				return ((InternalEList<?>)getChildren()).basicRemove(otherEnd, msgs);
			case MacroPlannerPackage.LOCATION__PARENT:
				return basicSetParent(null, msgs);
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
			case MacroPlannerPackage.LOCATION__PRODUCTS:
				return getProducts();
			case MacroPlannerPackage.LOCATION__RESOURCES:
				return getResources();
			case MacroPlannerPackage.LOCATION__CHILDREN:
				return getChildren();
			case MacroPlannerPackage.LOCATION__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
			case MacroPlannerPackage.LOCATION__NAME:
				return getName();
			case MacroPlannerPackage.LOCATION__CODE:
				return getCode();
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
			case MacroPlannerPackage.LOCATION__PRODUCTS:
				getProducts().clear();
				getProducts().addAll((Collection<? extends LocationProduct>)newValue);
				return;
			case MacroPlannerPackage.LOCATION__RESOURCES:
				getResources().clear();
				getResources().addAll((Collection<? extends LocationResource>)newValue);
				return;
			case MacroPlannerPackage.LOCATION__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection<? extends Location>)newValue);
				return;
			case MacroPlannerPackage.LOCATION__PARENT:
				setParent((Location)newValue);
				return;
			case MacroPlannerPackage.LOCATION__NAME:
				setName((String)newValue);
				return;
			case MacroPlannerPackage.LOCATION__CODE:
				setCode((String)newValue);
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
			case MacroPlannerPackage.LOCATION__PRODUCTS:
				getProducts().clear();
				return;
			case MacroPlannerPackage.LOCATION__RESOURCES:
				getResources().clear();
				return;
			case MacroPlannerPackage.LOCATION__CHILDREN:
				getChildren().clear();
				return;
			case MacroPlannerPackage.LOCATION__PARENT:
				setParent((Location)null);
				return;
			case MacroPlannerPackage.LOCATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MacroPlannerPackage.LOCATION__CODE:
				setCode(CODE_EDEFAULT);
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
			case MacroPlannerPackage.LOCATION__PRODUCTS:
				return products != null && !products.isEmpty();
			case MacroPlannerPackage.LOCATION__RESOURCES:
				return resources != null && !resources.isEmpty();
			case MacroPlannerPackage.LOCATION__CHILDREN:
				return children != null && !children.isEmpty();
			case MacroPlannerPackage.LOCATION__PARENT:
				return parent != null;
			case MacroPlannerPackage.LOCATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case MacroPlannerPackage.LOCATION__CODE:
				return CODE_EDEFAULT == null ? code != null : !CODE_EDEFAULT.equals(code);
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
			case MacroPlannerPackage.LOCATION___CONSTRUCT_LOCATION_PRODUCT__PRODUCT:
				return constructLocationProduct((Product)arguments.get(0));
			case MacroPlannerPackage.LOCATION___CONSTRUCT_LOCATION_RESOURCE__RESOURCE:
				return constructLocationResource((Resource)arguments.get(0));
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
		result.append(')');
		return result.toString();
	}

} //LocationImpl
