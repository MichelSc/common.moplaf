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

import com.misc.common.moplaf.macroplanner.Availability;
import com.misc.common.moplaf.macroplanner.Capacity;
import com.misc.common.moplaf.macroplanner.LocationProduct;
import com.misc.common.moplaf.macroplanner.LocationResource;
import com.misc.common.moplaf.macroplanner.MacroPlannerData;
import com.misc.common.moplaf.macroplanner.MacroPlannerDataElement;
import com.misc.common.moplaf.macroplanner.MacroPlannerFactory;
import com.misc.common.moplaf.macroplanner.MacroPlannerPackage;

import com.misc.common.moplaf.macroplanner.Supply;
import com.misc.common.moplaf.time.TimeUnit;
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
import org.eclipse.emf.ecore.util.InternalEList;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.macroplanner.impl.MacroPlannerDataImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.impl.MacroPlannerDataImpl#getTimeUnit <em>Time Unit</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.impl.MacroPlannerDataImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MacroPlannerDataImpl extends MinimalEObjectImpl.Container implements MacroPlannerData {
	/**
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected EList<MacroPlannerDataElement> elements;

	/**
	 * The default value of the '{@link #getTimeUnit() <em>Time Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeUnit()
	 * @generated
	 * @ordered
	 */
	protected static final TimeUnit TIME_UNIT_EDEFAULT = TimeUnit.HOUR;

	/**
	 * The cached value of the '{@link #getTimeUnit() <em>Time Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeUnit()
	 * @generated
	 * @ordered
	 */
	protected TimeUnit timeUnit = TIME_UNIT_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MacroPlannerDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MacroPlannerPackage.Literals.MACRO_PLANNER_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MacroPlannerDataElement> getElements() {
		if (elements == null) {
			elements = new EObjectContainmentWithInverseEList<MacroPlannerDataElement>(MacroPlannerDataElement.class, this, MacroPlannerPackage.MACRO_PLANNER_DATA__ELEMENTS, MacroPlannerPackage.MACRO_PLANNER_DATA_ELEMENT__MACRO_PLANNER_DATA);
		}
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeUnit getTimeUnit() {
		return timeUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeUnit(TimeUnit newTimeUnit) {
		TimeUnit oldTimeUnit = timeUnit;
		timeUnit = newTimeUnit == null ? TIME_UNIT_EDEFAULT : newTimeUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MacroPlannerPackage.MACRO_PLANNER_DATA__TIME_UNIT, oldTimeUnit, timeUnit));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MacroPlannerPackage.MACRO_PLANNER_DATA__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public float getDurationTimeUnit(TimeUnit timeUnit) {
		long toTimeUnitMillis = timeUnit.toMillis();
		long fromTimeUnitMillis = this.getTimeUnit().toMillis();
		float duration = (float)toTimeUnitMillis/(float)fromTimeUnitMillis;
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Capacity constructCapacity(LocationProduct product) {
		Capacity c = MacroPlannerFactory.eINSTANCE.createCapacity();
		c.setLocationProduct(product);
		this.getElements().add(c);
		return c;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Availability constructAvailabilty(LocationResource resource) {
		Availability a = MacroPlannerFactory.eINSTANCE.createAvailability();
		a.setLocationResource(resource);
		this.getElements().add(a);
		return a;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Supply constructSupply(LocationProduct product) {
		Supply s = MacroPlannerFactory.eINSTANCE.createSupply();
		s.setLocationProduct(product);
		this.getElements().add(s);
		return s;
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
			case MacroPlannerPackage.MACRO_PLANNER_DATA__ELEMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getElements()).basicAdd(otherEnd, msgs);
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
			case MacroPlannerPackage.MACRO_PLANNER_DATA__ELEMENTS:
				return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
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
			case MacroPlannerPackage.MACRO_PLANNER_DATA__ELEMENTS:
				return getElements();
			case MacroPlannerPackage.MACRO_PLANNER_DATA__TIME_UNIT:
				return getTimeUnit();
			case MacroPlannerPackage.MACRO_PLANNER_DATA__NAME:
				return getName();
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
			case MacroPlannerPackage.MACRO_PLANNER_DATA__ELEMENTS:
				getElements().clear();
				getElements().addAll((Collection<? extends MacroPlannerDataElement>)newValue);
				return;
			case MacroPlannerPackage.MACRO_PLANNER_DATA__TIME_UNIT:
				setTimeUnit((TimeUnit)newValue);
				return;
			case MacroPlannerPackage.MACRO_PLANNER_DATA__NAME:
				setName((String)newValue);
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
			case MacroPlannerPackage.MACRO_PLANNER_DATA__ELEMENTS:
				getElements().clear();
				return;
			case MacroPlannerPackage.MACRO_PLANNER_DATA__TIME_UNIT:
				setTimeUnit(TIME_UNIT_EDEFAULT);
				return;
			case MacroPlannerPackage.MACRO_PLANNER_DATA__NAME:
				setName(NAME_EDEFAULT);
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
			case MacroPlannerPackage.MACRO_PLANNER_DATA__ELEMENTS:
				return elements != null && !elements.isEmpty();
			case MacroPlannerPackage.MACRO_PLANNER_DATA__TIME_UNIT:
				return timeUnit != TIME_UNIT_EDEFAULT;
			case MacroPlannerPackage.MACRO_PLANNER_DATA__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
			case MacroPlannerPackage.MACRO_PLANNER_DATA___GET_DURATION_TIME_UNIT__TIMEUNIT:
				return getDurationTimeUnit((TimeUnit)arguments.get(0));
			case MacroPlannerPackage.MACRO_PLANNER_DATA___CONSTRUCT_CAPACITY__LOCATIONPRODUCT:
				return constructCapacity((LocationProduct)arguments.get(0));
			case MacroPlannerPackage.MACRO_PLANNER_DATA___CONSTRUCT_AVAILABILTY__LOCATIONRESOURCE:
				return constructAvailabilty((LocationResource)arguments.get(0));
			case MacroPlannerPackage.MACRO_PLANNER_DATA___CONSTRUCT_SUPPLY__LOCATIONPRODUCT:
				return constructSupply((LocationProduct)arguments.get(0));
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
		result.append(" (TimeUnit: ");
		result.append(timeUnit);
		result.append(", Name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //MacroPlannerDataImpl
