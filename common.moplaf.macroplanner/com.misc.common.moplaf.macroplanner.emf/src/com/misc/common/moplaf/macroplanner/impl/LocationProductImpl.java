/**
 */
package com.misc.common.moplaf.macroplanner.impl;

import com.misc.common.moplaf.macroplanner.Capacity;
import com.misc.common.moplaf.macroplanner.Location;
import com.misc.common.moplaf.macroplanner.LocationProduct;
import com.misc.common.moplaf.macroplanner.MacroPlannerPackage;
import com.misc.common.moplaf.macroplanner.Product;

import com.misc.common.moplaf.macroplanner.Supply;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Location Product</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.macroplanner.impl.LocationProductImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.impl.LocationProductImpl#getProduct <em>Product</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.impl.LocationProductImpl#getCode <em>Code</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.impl.LocationProductImpl#getSupplies <em>Supplies</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.impl.LocationProductImpl#getCapacities <em>Capacities</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LocationProductImpl extends MinimalEObjectImpl.Container implements LocationProduct {
	/**
	 * The cached value of the '{@link #getProduct() <em>Product</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProduct()
	 * @generated
	 * @ordered
	 */
	protected Product product;

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
	 * The cached value of the '{@link #getSupplies() <em>Supplies</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplies()
	 * @generated
	 * @ordered
	 */
	protected EList<Supply> supplies;

	/**
	 * The cached value of the '{@link #getCapacities() <em>Capacities</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacities()
	 * @generated
	 * @ordered
	 */
	protected EList<Capacity> capacities;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocationProductImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MacroPlannerPackage.Literals.LOCATION_PRODUCT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location getLocation() {
		if (eContainerFeatureID() != MacroPlannerPackage.LOCATION_PRODUCT__LOCATION) return null;
		return (Location)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocation(Location newLocation, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newLocation, MacroPlannerPackage.LOCATION_PRODUCT__LOCATION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(Location newLocation) {
		if (newLocation != eInternalContainer() || (eContainerFeatureID() != MacroPlannerPackage.LOCATION_PRODUCT__LOCATION && newLocation != null)) {
			if (EcoreUtil.isAncestor(this, newLocation))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newLocation != null)
				msgs = ((InternalEObject)newLocation).eInverseAdd(this, MacroPlannerPackage.LOCATION__PRODUCTS, Location.class, msgs);
			msgs = basicSetLocation(newLocation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MacroPlannerPackage.LOCATION_PRODUCT__LOCATION, newLocation, newLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Product getProduct() {
		if (product != null && product.eIsProxy()) {
			InternalEObject oldProduct = (InternalEObject)product;
			product = (Product)eResolveProxy(oldProduct);
			if (product != oldProduct) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MacroPlannerPackage.LOCATION_PRODUCT__PRODUCT, oldProduct, product));
			}
		}
		return product;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Product basicGetProduct() {
		return product;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProduct(Product newProduct) {
		Product oldProduct = product;
		product = newProduct;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MacroPlannerPackage.LOCATION_PRODUCT__PRODUCT, oldProduct, product));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public String getCode() {
		String code = String.format("LP(%s,%s)", 
				this.getLocation()==null ? "null": this.getLocation().getCode(),
				this.getProduct()==null  ? "null": this.getProduct().getCode());
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Supply> getSupplies() {
		if (supplies == null) {
			supplies = new EObjectWithInverseResolvingEList<Supply>(Supply.class, this, MacroPlannerPackage.LOCATION_PRODUCT__SUPPLIES, MacroPlannerPackage.SUPPLY__LOCATION_PRODUCT);
		}
		return supplies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Capacity> getCapacities() {
		if (capacities == null) {
			capacities = new EObjectWithInverseResolvingEList<Capacity>(Capacity.class, this, MacroPlannerPackage.LOCATION_PRODUCT__CAPACITIES, MacroPlannerPackage.CAPACITY__LOCATION_PRODUCT);
		}
		return capacities;
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
			case MacroPlannerPackage.LOCATION_PRODUCT__LOCATION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetLocation((Location)otherEnd, msgs);
			case MacroPlannerPackage.LOCATION_PRODUCT__SUPPLIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSupplies()).basicAdd(otherEnd, msgs);
			case MacroPlannerPackage.LOCATION_PRODUCT__CAPACITIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCapacities()).basicAdd(otherEnd, msgs);
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
			case MacroPlannerPackage.LOCATION_PRODUCT__LOCATION:
				return basicSetLocation(null, msgs);
			case MacroPlannerPackage.LOCATION_PRODUCT__SUPPLIES:
				return ((InternalEList<?>)getSupplies()).basicRemove(otherEnd, msgs);
			case MacroPlannerPackage.LOCATION_PRODUCT__CAPACITIES:
				return ((InternalEList<?>)getCapacities()).basicRemove(otherEnd, msgs);
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
			case MacroPlannerPackage.LOCATION_PRODUCT__LOCATION:
				return eInternalContainer().eInverseRemove(this, MacroPlannerPackage.LOCATION__PRODUCTS, Location.class, msgs);
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
			case MacroPlannerPackage.LOCATION_PRODUCT__LOCATION:
				return getLocation();
			case MacroPlannerPackage.LOCATION_PRODUCT__PRODUCT:
				if (resolve) return getProduct();
				return basicGetProduct();
			case MacroPlannerPackage.LOCATION_PRODUCT__CODE:
				return getCode();
			case MacroPlannerPackage.LOCATION_PRODUCT__SUPPLIES:
				return getSupplies();
			case MacroPlannerPackage.LOCATION_PRODUCT__CAPACITIES:
				return getCapacities();
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
			case MacroPlannerPackage.LOCATION_PRODUCT__LOCATION:
				setLocation((Location)newValue);
				return;
			case MacroPlannerPackage.LOCATION_PRODUCT__PRODUCT:
				setProduct((Product)newValue);
				return;
			case MacroPlannerPackage.LOCATION_PRODUCT__SUPPLIES:
				getSupplies().clear();
				getSupplies().addAll((Collection<? extends Supply>)newValue);
				return;
			case MacroPlannerPackage.LOCATION_PRODUCT__CAPACITIES:
				getCapacities().clear();
				getCapacities().addAll((Collection<? extends Capacity>)newValue);
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
			case MacroPlannerPackage.LOCATION_PRODUCT__LOCATION:
				setLocation((Location)null);
				return;
			case MacroPlannerPackage.LOCATION_PRODUCT__PRODUCT:
				setProduct((Product)null);
				return;
			case MacroPlannerPackage.LOCATION_PRODUCT__SUPPLIES:
				getSupplies().clear();
				return;
			case MacroPlannerPackage.LOCATION_PRODUCT__CAPACITIES:
				getCapacities().clear();
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
			case MacroPlannerPackage.LOCATION_PRODUCT__LOCATION:
				return getLocation() != null;
			case MacroPlannerPackage.LOCATION_PRODUCT__PRODUCT:
				return product != null;
			case MacroPlannerPackage.LOCATION_PRODUCT__CODE:
				return CODE_EDEFAULT == null ? getCode() != null : !CODE_EDEFAULT.equals(getCode());
			case MacroPlannerPackage.LOCATION_PRODUCT__SUPPLIES:
				return supplies != null && !supplies.isEmpty();
			case MacroPlannerPackage.LOCATION_PRODUCT__CAPACITIES:
				return capacities != null && !capacities.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LocationProductImpl
