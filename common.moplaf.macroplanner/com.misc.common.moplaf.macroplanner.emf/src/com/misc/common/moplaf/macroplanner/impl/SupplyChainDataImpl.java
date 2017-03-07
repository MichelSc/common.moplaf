/**
 */
package com.misc.common.moplaf.macroplanner.impl;

import com.misc.common.moplaf.macroplanner.MacroPlannerPackage;
import com.misc.common.moplaf.macroplanner.ProductSupply;
import com.misc.common.moplaf.macroplanner.ResourceAvailable;
import com.misc.common.moplaf.macroplanner.SupplyChainData;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Supply Chain Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.macroplanner.impl.SupplyChainDataImpl#getSuppliesAndDemands <em>Supplies And Demands</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.impl.SupplyChainDataImpl#getAvailabilitiesAndReservations <em>Availabilities And Reservations</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.impl.SupplyChainDataImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SupplyChainDataImpl extends MinimalEObjectImpl.Container implements SupplyChainData {
	/**
	 * The cached value of the '{@link #getSuppliesAndDemands() <em>Supplies And Demands</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuppliesAndDemands()
	 * @generated
	 * @ordered
	 */
	protected EList<ProductSupply> suppliesAndDemands;

	/**
	 * The cached value of the '{@link #getAvailabilitiesAndReservations() <em>Availabilities And Reservations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailabilitiesAndReservations()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceAvailable> availabilitiesAndReservations;

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
	protected SupplyChainDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MacroPlannerPackage.Literals.SUPPLY_CHAIN_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProductSupply> getSuppliesAndDemands() {
		if (suppliesAndDemands == null) {
			suppliesAndDemands = new EObjectContainmentEList<ProductSupply>(ProductSupply.class, this, MacroPlannerPackage.SUPPLY_CHAIN_DATA__SUPPLIES_AND_DEMANDS);
		}
		return suppliesAndDemands;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceAvailable> getAvailabilitiesAndReservations() {
		if (availabilitiesAndReservations == null) {
			availabilitiesAndReservations = new EObjectContainmentEList<ResourceAvailable>(ResourceAvailable.class, this, MacroPlannerPackage.SUPPLY_CHAIN_DATA__AVAILABILITIES_AND_RESERVATIONS);
		}
		return availabilitiesAndReservations;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MacroPlannerPackage.SUPPLY_CHAIN_DATA__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MacroPlannerPackage.SUPPLY_CHAIN_DATA__SUPPLIES_AND_DEMANDS:
				return ((InternalEList<?>)getSuppliesAndDemands()).basicRemove(otherEnd, msgs);
			case MacroPlannerPackage.SUPPLY_CHAIN_DATA__AVAILABILITIES_AND_RESERVATIONS:
				return ((InternalEList<?>)getAvailabilitiesAndReservations()).basicRemove(otherEnd, msgs);
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
			case MacroPlannerPackage.SUPPLY_CHAIN_DATA__SUPPLIES_AND_DEMANDS:
				return getSuppliesAndDemands();
			case MacroPlannerPackage.SUPPLY_CHAIN_DATA__AVAILABILITIES_AND_RESERVATIONS:
				return getAvailabilitiesAndReservations();
			case MacroPlannerPackage.SUPPLY_CHAIN_DATA__NAME:
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
			case MacroPlannerPackage.SUPPLY_CHAIN_DATA__SUPPLIES_AND_DEMANDS:
				getSuppliesAndDemands().clear();
				getSuppliesAndDemands().addAll((Collection<? extends ProductSupply>)newValue);
				return;
			case MacroPlannerPackage.SUPPLY_CHAIN_DATA__AVAILABILITIES_AND_RESERVATIONS:
				getAvailabilitiesAndReservations().clear();
				getAvailabilitiesAndReservations().addAll((Collection<? extends ResourceAvailable>)newValue);
				return;
			case MacroPlannerPackage.SUPPLY_CHAIN_DATA__NAME:
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
			case MacroPlannerPackage.SUPPLY_CHAIN_DATA__SUPPLIES_AND_DEMANDS:
				getSuppliesAndDemands().clear();
				return;
			case MacroPlannerPackage.SUPPLY_CHAIN_DATA__AVAILABILITIES_AND_RESERVATIONS:
				getAvailabilitiesAndReservations().clear();
				return;
			case MacroPlannerPackage.SUPPLY_CHAIN_DATA__NAME:
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
			case MacroPlannerPackage.SUPPLY_CHAIN_DATA__SUPPLIES_AND_DEMANDS:
				return suppliesAndDemands != null && !suppliesAndDemands.isEmpty();
			case MacroPlannerPackage.SUPPLY_CHAIN_DATA__AVAILABILITIES_AND_RESERVATIONS:
				return availabilitiesAndReservations != null && !availabilitiesAndReservations.isEmpty();
			case MacroPlannerPackage.SUPPLY_CHAIN_DATA__NAME:
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
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (Name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //SupplyChainDataImpl
