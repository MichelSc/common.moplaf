/**
 */
package com.misc.common.moplaf.macroplanner.impl;

import com.misc.common.moplaf.macroplanner.Availability;
import com.misc.common.moplaf.macroplanner.Capacity;
import com.misc.common.moplaf.macroplanner.LocationProduct;
import com.misc.common.moplaf.macroplanner.LocationResource;
import com.misc.common.moplaf.macroplanner.MacroPlannerFactory;
import com.misc.common.moplaf.macroplanner.MacroPlannerPackage;
import com.misc.common.moplaf.macroplanner.SupplyChainLimits;

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
 * An implementation of the model object '<em><b>Supply Chain Limits</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.macroplanner.impl.SupplyChainLimitsImpl#getCapacities <em>Capacities</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.impl.SupplyChainLimitsImpl#getAvailabilities <em>Availabilities</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.impl.SupplyChainLimitsImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SupplyChainLimitsImpl extends MinimalEObjectImpl.Container implements SupplyChainLimits {
	/**
	 * The cached value of the '{@link #getCapacities() <em>Capacities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacities()
	 * @generated
	 * @ordered
	 */
	protected EList<Capacity> capacities;

	/**
	 * The cached value of the '{@link #getAvailabilities() <em>Availabilities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailabilities()
	 * @generated
	 * @ordered
	 */
	protected EList<Availability> availabilities;

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
	protected SupplyChainLimitsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MacroPlannerPackage.Literals.SUPPLY_CHAIN_LIMITS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Capacity> getCapacities() {
		if (capacities == null) {
			capacities = new EObjectContainmentWithInverseEList<Capacity>(Capacity.class, this, MacroPlannerPackage.SUPPLY_CHAIN_LIMITS__CAPACITIES, MacroPlannerPackage.CAPACITY__SUPPLY_CHAIN_LIMITS);
		}
		return capacities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Availability> getAvailabilities() {
		if (availabilities == null) {
			availabilities = new EObjectContainmentWithInverseEList<Availability>(Availability.class, this, MacroPlannerPackage.SUPPLY_CHAIN_LIMITS__AVAILABILITIES, MacroPlannerPackage.AVAILABILITY__SUPPLY_CHAIN_LIMITS);
		}
		return availabilities;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MacroPlannerPackage.SUPPLY_CHAIN_LIMITS__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Capacity constructCapacity(LocationProduct product) {
		Capacity c = MacroPlannerFactory.eINSTANCE.createCapacity();
		c.setLocationProduct(product);
		this.getCapacities().add(c);
		return c;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Availability constructAvailability(LocationResource resource) {
		Availability a = MacroPlannerFactory.eINSTANCE.createAvailability();
		a.setLocationResource(resource);
		this.getAvailabilities().add(a);
		return a;
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
			case MacroPlannerPackage.SUPPLY_CHAIN_LIMITS__CAPACITIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCapacities()).basicAdd(otherEnd, msgs);
			case MacroPlannerPackage.SUPPLY_CHAIN_LIMITS__AVAILABILITIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAvailabilities()).basicAdd(otherEnd, msgs);
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
			case MacroPlannerPackage.SUPPLY_CHAIN_LIMITS__CAPACITIES:
				return ((InternalEList<?>)getCapacities()).basicRemove(otherEnd, msgs);
			case MacroPlannerPackage.SUPPLY_CHAIN_LIMITS__AVAILABILITIES:
				return ((InternalEList<?>)getAvailabilities()).basicRemove(otherEnd, msgs);
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
			case MacroPlannerPackage.SUPPLY_CHAIN_LIMITS__CAPACITIES:
				return getCapacities();
			case MacroPlannerPackage.SUPPLY_CHAIN_LIMITS__AVAILABILITIES:
				return getAvailabilities();
			case MacroPlannerPackage.SUPPLY_CHAIN_LIMITS__NAME:
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
			case MacroPlannerPackage.SUPPLY_CHAIN_LIMITS__CAPACITIES:
				getCapacities().clear();
				getCapacities().addAll((Collection<? extends Capacity>)newValue);
				return;
			case MacroPlannerPackage.SUPPLY_CHAIN_LIMITS__AVAILABILITIES:
				getAvailabilities().clear();
				getAvailabilities().addAll((Collection<? extends Availability>)newValue);
				return;
			case MacroPlannerPackage.SUPPLY_CHAIN_LIMITS__NAME:
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
			case MacroPlannerPackage.SUPPLY_CHAIN_LIMITS__CAPACITIES:
				getCapacities().clear();
				return;
			case MacroPlannerPackage.SUPPLY_CHAIN_LIMITS__AVAILABILITIES:
				getAvailabilities().clear();
				return;
			case MacroPlannerPackage.SUPPLY_CHAIN_LIMITS__NAME:
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
			case MacroPlannerPackage.SUPPLY_CHAIN_LIMITS__CAPACITIES:
				return capacities != null && !capacities.isEmpty();
			case MacroPlannerPackage.SUPPLY_CHAIN_LIMITS__AVAILABILITIES:
				return availabilities != null && !availabilities.isEmpty();
			case MacroPlannerPackage.SUPPLY_CHAIN_LIMITS__NAME:
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
			case MacroPlannerPackage.SUPPLY_CHAIN_LIMITS___CONSTRUCT_CAPACITY__LOCATIONPRODUCT:
				return constructCapacity((LocationProduct)arguments.get(0));
			case MacroPlannerPackage.SUPPLY_CHAIN_LIMITS___CONSTRUCT_AVAILABILITY__LOCATIONRESOURCE:
				return constructAvailability((LocationResource)arguments.get(0));
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
		result.append(')');
		return result.toString();
	}

} //SupplyChainLimitsImpl
