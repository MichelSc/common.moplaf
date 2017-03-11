/**
 */
package com.misc.common.moplaf.macroplanner.impl;

import com.misc.common.moplaf.macroplanner.Location;
import com.misc.common.moplaf.macroplanner.MacroPlannerPackage;
import com.misc.common.moplaf.macroplanner.Product;
import com.misc.common.moplaf.macroplanner.Resource;
import com.misc.common.moplaf.macroplanner.SupplyChainMasterData;

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
 * An implementation of the model object '<em><b>Supply Chain Master Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.macroplanner.impl.SupplyChainMasterDataImpl#getProducts <em>Products</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.impl.SupplyChainMasterDataImpl#getResources <em>Resources</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.impl.SupplyChainMasterDataImpl#getLocations <em>Locations</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.impl.SupplyChainMasterDataImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SupplyChainMasterDataImpl extends MinimalEObjectImpl.Container implements SupplyChainMasterData {
	/**
	 * The cached value of the '{@link #getProducts() <em>Products</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProducts()
	 * @generated
	 * @ordered
	 */
	protected EList<Product> products;

	/**
	 * The cached value of the '{@link #getResources() <em>Resources</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResources()
	 * @generated
	 * @ordered
	 */
	protected EList<Resource> resources;

	/**
	 * The cached value of the '{@link #getLocations() <em>Locations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocations()
	 * @generated
	 * @ordered
	 */
	protected EList<Location> locations;

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
	protected SupplyChainMasterDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MacroPlannerPackage.Literals.SUPPLY_CHAIN_MASTER_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Product> getProducts() {
		if (products == null) {
			products = new EObjectContainmentEList<Product>(Product.class, this, MacroPlannerPackage.SUPPLY_CHAIN_MASTER_DATA__PRODUCTS);
		}
		return products;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Location> getLocations() {
		if (locations == null) {
			locations = new EObjectContainmentEList<Location>(Location.class, this, MacroPlannerPackage.SUPPLY_CHAIN_MASTER_DATA__LOCATIONS);
		}
		return locations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resource> getResources() {
		if (resources == null) {
			resources = new EObjectContainmentEList<Resource>(Resource.class, this, MacroPlannerPackage.SUPPLY_CHAIN_MASTER_DATA__RESOURCES);
		}
		return resources;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MacroPlannerPackage.SUPPLY_CHAIN_MASTER_DATA__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MacroPlannerPackage.SUPPLY_CHAIN_MASTER_DATA__PRODUCTS:
				return ((InternalEList<?>)getProducts()).basicRemove(otherEnd, msgs);
			case MacroPlannerPackage.SUPPLY_CHAIN_MASTER_DATA__RESOURCES:
				return ((InternalEList<?>)getResources()).basicRemove(otherEnd, msgs);
			case MacroPlannerPackage.SUPPLY_CHAIN_MASTER_DATA__LOCATIONS:
				return ((InternalEList<?>)getLocations()).basicRemove(otherEnd, msgs);
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
			case MacroPlannerPackage.SUPPLY_CHAIN_MASTER_DATA__PRODUCTS:
				return getProducts();
			case MacroPlannerPackage.SUPPLY_CHAIN_MASTER_DATA__RESOURCES:
				return getResources();
			case MacroPlannerPackage.SUPPLY_CHAIN_MASTER_DATA__LOCATIONS:
				return getLocations();
			case MacroPlannerPackage.SUPPLY_CHAIN_MASTER_DATA__NAME:
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
			case MacroPlannerPackage.SUPPLY_CHAIN_MASTER_DATA__PRODUCTS:
				getProducts().clear();
				getProducts().addAll((Collection<? extends Product>)newValue);
				return;
			case MacroPlannerPackage.SUPPLY_CHAIN_MASTER_DATA__RESOURCES:
				getResources().clear();
				getResources().addAll((Collection<? extends Resource>)newValue);
				return;
			case MacroPlannerPackage.SUPPLY_CHAIN_MASTER_DATA__LOCATIONS:
				getLocations().clear();
				getLocations().addAll((Collection<? extends Location>)newValue);
				return;
			case MacroPlannerPackage.SUPPLY_CHAIN_MASTER_DATA__NAME:
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
			case MacroPlannerPackage.SUPPLY_CHAIN_MASTER_DATA__PRODUCTS:
				getProducts().clear();
				return;
			case MacroPlannerPackage.SUPPLY_CHAIN_MASTER_DATA__RESOURCES:
				getResources().clear();
				return;
			case MacroPlannerPackage.SUPPLY_CHAIN_MASTER_DATA__LOCATIONS:
				getLocations().clear();
				return;
			case MacroPlannerPackage.SUPPLY_CHAIN_MASTER_DATA__NAME:
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
			case MacroPlannerPackage.SUPPLY_CHAIN_MASTER_DATA__PRODUCTS:
				return products != null && !products.isEmpty();
			case MacroPlannerPackage.SUPPLY_CHAIN_MASTER_DATA__RESOURCES:
				return resources != null && !resources.isEmpty();
			case MacroPlannerPackage.SUPPLY_CHAIN_MASTER_DATA__LOCATIONS:
				return locations != null && !locations.isEmpty();
			case MacroPlannerPackage.SUPPLY_CHAIN_MASTER_DATA__NAME:
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

} //SupplyChainMasterDataImpl
