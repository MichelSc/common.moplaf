/**
 */
package com.misc.common.moplaf.macroplanner.solver.impl;

import com.misc.common.moplaf.macroplanner.Capacity;
import com.misc.common.moplaf.macroplanner.LocationProduct;
import com.misc.common.moplaf.macroplanner.Supply;
import com.misc.common.moplaf.macroplanner.SupplyChainLimits;
import com.misc.common.moplaf.macroplanner.solver.LPCapacity;
import com.misc.common.moplaf.macroplanner.solver.LPMacroPlanner;
import com.misc.common.moplaf.macroplanner.solver.LPProduct;
import com.misc.common.moplaf.macroplanner.solver.LPProductBucket;
import com.misc.common.moplaf.macroplanner.solver.LPProductSet;
import com.misc.common.moplaf.macroplanner.solver.LPSupply;
import com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverFactory;
import com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage;
import com.misc.common.moplaf.macroplanner.solver.Scenario;
import com.misc.common.moplaf.time.discrete.ObjectTimeBucket;
import com.misc.common.moplaf.time.discrete.TimeBucket;
import com.misc.common.moplaf.time.discrete.TimeLine;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>LP Product</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.impl.LPProductImpl#getProductSet <em>Product Set</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.impl.LPProductImpl#getSupplies <em>Supplies</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.impl.LPProductImpl#getCapacities <em>Capacities</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.impl.LPProductImpl#getProduct <em>Product</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.impl.LPProductImpl#getLPBuckets <em>LP Buckets</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LPProductImpl extends LPTimeLineImpl implements LPProduct {
	/**
	 * The cached value of the '{@link #getSupplies() <em>Supplies</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplies()
	 * @generated
	 * @ordered
	 */
	protected EList<LPSupply> supplies;

	/**
	 * The cached value of the '{@link #getCapacities() <em>Capacities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacities()
	 * @generated
	 * @ordered
	 */
	protected EList<LPCapacity> capacities;

	/**
	 * The cached value of the '{@link #getProduct() <em>Product</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProduct()
	 * @generated
	 * @ordered
	 */
	protected LocationProduct product;

	/**
	 * The cached value of the '{@link #getLPBuckets() <em>LP Buckets</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLPBuckets()
	 * @generated
	 * @ordered
	 */
	protected EList<LPProductBucket> lpBuckets;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LPProductImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MacroPlannerSolverPackage.Literals.LP_PRODUCT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LPProductSet getProductSet() {
		if (eContainerFeatureID() != MacroPlannerSolverPackage.LP_PRODUCT__PRODUCT_SET) return null;
		return (LPProductSet)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProductSet(LPProductSet newProductSet, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newProductSet, MacroPlannerSolverPackage.LP_PRODUCT__PRODUCT_SET, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProductSet(LPProductSet newProductSet) {
		if (newProductSet != eInternalContainer() || (eContainerFeatureID() != MacroPlannerSolverPackage.LP_PRODUCT__PRODUCT_SET && newProductSet != null)) {
			if (EcoreUtil.isAncestor(this, newProductSet))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newProductSet != null)
				msgs = ((InternalEObject)newProductSet).eInverseAdd(this, MacroPlannerSolverPackage.LP_PRODUCT_SET__PRODUCTS, LPProductSet.class, msgs);
			msgs = basicSetProductSet(newProductSet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MacroPlannerSolverPackage.LP_PRODUCT__PRODUCT_SET, newProductSet, newProductSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LPSupply> getSupplies() {
		if (supplies == null) {
			supplies = new EObjectContainmentWithInverseEList<LPSupply>(LPSupply.class, this, MacroPlannerSolverPackage.LP_PRODUCT__SUPPLIES, MacroPlannerSolverPackage.LP_SUPPLY__PRODUCT);
		}
		return supplies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LPCapacity> getCapacities() {
		if (capacities == null) {
			capacities = new EObjectContainmentWithInverseEList<LPCapacity>(LPCapacity.class, this, MacroPlannerSolverPackage.LP_PRODUCT__CAPACITIES, MacroPlannerSolverPackage.LP_CAPACITY__PRODUCT);
		}
		return capacities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationProduct getProduct() {
		if (product != null && product.eIsProxy()) {
			InternalEObject oldProduct = (InternalEObject)product;
			product = (LocationProduct)eResolveProxy(oldProduct);
			if (product != oldProduct) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MacroPlannerSolverPackage.LP_PRODUCT__PRODUCT, oldProduct, product));
			}
		}
		return product;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationProduct basicGetProduct() {
		return product;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProduct(LocationProduct newProduct) {
		LocationProduct oldProduct = product;
		product = newProduct;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MacroPlannerSolverPackage.LP_PRODUCT__PRODUCT, oldProduct, product));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LPProductBucket> getLPBuckets() {
		if (lpBuckets == null) {
			lpBuckets = new EObjectContainmentWithInverseEList<LPProductBucket>(LPProductBucket.class, this, MacroPlannerSolverPackage.LP_PRODUCT__LP_BUCKETS, MacroPlannerSolverPackage.LP_PRODUCT_BUCKET__PRODUCT);
		}
		return lpBuckets;
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
			case MacroPlannerSolverPackage.LP_PRODUCT__PRODUCT_SET:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetProductSet((LPProductSet)otherEnd, msgs);
			case MacroPlannerSolverPackage.LP_PRODUCT__SUPPLIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSupplies()).basicAdd(otherEnd, msgs);
			case MacroPlannerSolverPackage.LP_PRODUCT__CAPACITIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCapacities()).basicAdd(otherEnd, msgs);
			case MacroPlannerSolverPackage.LP_PRODUCT__LP_BUCKETS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLPBuckets()).basicAdd(otherEnd, msgs);
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
			case MacroPlannerSolverPackage.LP_PRODUCT__PRODUCT_SET:
				return basicSetProductSet(null, msgs);
			case MacroPlannerSolverPackage.LP_PRODUCT__SUPPLIES:
				return ((InternalEList<?>)getSupplies()).basicRemove(otherEnd, msgs);
			case MacroPlannerSolverPackage.LP_PRODUCT__CAPACITIES:
				return ((InternalEList<?>)getCapacities()).basicRemove(otherEnd, msgs);
			case MacroPlannerSolverPackage.LP_PRODUCT__LP_BUCKETS:
				return ((InternalEList<?>)getLPBuckets()).basicRemove(otherEnd, msgs);
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
			case MacroPlannerSolverPackage.LP_PRODUCT__PRODUCT_SET:
				return eInternalContainer().eInverseRemove(this, MacroPlannerSolverPackage.LP_PRODUCT_SET__PRODUCTS, LPProductSet.class, msgs);
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
			case MacroPlannerSolverPackage.LP_PRODUCT__PRODUCT_SET:
				return getProductSet();
			case MacroPlannerSolverPackage.LP_PRODUCT__SUPPLIES:
				return getSupplies();
			case MacroPlannerSolverPackage.LP_PRODUCT__CAPACITIES:
				return getCapacities();
			case MacroPlannerSolverPackage.LP_PRODUCT__PRODUCT:
				if (resolve) return getProduct();
				return basicGetProduct();
			case MacroPlannerSolverPackage.LP_PRODUCT__LP_BUCKETS:
				return getLPBuckets();
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
			case MacroPlannerSolverPackage.LP_PRODUCT__PRODUCT_SET:
				setProductSet((LPProductSet)newValue);
				return;
			case MacroPlannerSolverPackage.LP_PRODUCT__SUPPLIES:
				getSupplies().clear();
				getSupplies().addAll((Collection<? extends LPSupply>)newValue);
				return;
			case MacroPlannerSolverPackage.LP_PRODUCT__CAPACITIES:
				getCapacities().clear();
				getCapacities().addAll((Collection<? extends LPCapacity>)newValue);
				return;
			case MacroPlannerSolverPackage.LP_PRODUCT__PRODUCT:
				setProduct((LocationProduct)newValue);
				return;
			case MacroPlannerSolverPackage.LP_PRODUCT__LP_BUCKETS:
				getLPBuckets().clear();
				getLPBuckets().addAll((Collection<? extends LPProductBucket>)newValue);
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
			case MacroPlannerSolverPackage.LP_PRODUCT__PRODUCT_SET:
				setProductSet((LPProductSet)null);
				return;
			case MacroPlannerSolverPackage.LP_PRODUCT__SUPPLIES:
				getSupplies().clear();
				return;
			case MacroPlannerSolverPackage.LP_PRODUCT__CAPACITIES:
				getCapacities().clear();
				return;
			case MacroPlannerSolverPackage.LP_PRODUCT__PRODUCT:
				setProduct((LocationProduct)null);
				return;
			case MacroPlannerSolverPackage.LP_PRODUCT__LP_BUCKETS:
				getLPBuckets().clear();
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
			case MacroPlannerSolverPackage.LP_PRODUCT__PRODUCT_SET:
				return getProductSet() != null;
			case MacroPlannerSolverPackage.LP_PRODUCT__SUPPLIES:
				return supplies != null && !supplies.isEmpty();
			case MacroPlannerSolverPackage.LP_PRODUCT__CAPACITIES:
				return capacities != null && !capacities.isEmpty();
			case MacroPlannerSolverPackage.LP_PRODUCT__PRODUCT:
				return product != null;
			case MacroPlannerSolverPackage.LP_PRODUCT__LP_BUCKETS:
				return lpBuckets != null && !lpBuckets.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public ObjectTimeBucket constructObjectTimeBucket() {
		LPProductBucket newbucket = MacroPlannerSolverFactory.eINSTANCE.createLPProductBucket();
		this.getLPBuckets().add(newbucket);
		return newbucket;
	}


	/**
	 * 
	 */
	@Override
	public void generateTuples() {
		super.generateTuples();

		LPProductSet products = this.getProductSet();
		LPMacroPlanner lp = products.getMacroPlanner();
		TimeLine timeline = lp.getTimeLine();
		Scenario scenario = lp.getScenario();
	    EList<SupplyChainLimits> selectedSCLimits= scenario.getSelectedLimits();
		LocationProduct location_product = this.getProduct();
		
		// supplies
		for ( Supply supply : location_product.getSupplies()){
			if ( selectedSCLimits.contains(supply.getSupplyChainData())){
				LPSupply lpsupply = MacroPlannerSolverFactory.eINSTANCE.createLPSupply();
				lpsupply.setSupply(supply);
				String name = String.format("suppl(%s, %tF)", location_product.getCode(), supply.getFrom());
				lpsupply.setName(name);
				this.getSupplies().add(lpsupply); // owning
			}
		}

		// capacities
		for ( Capacity capacity: location_product.getCapacities()){
			if ( selectedSCLimits.contains(capacity.getSupplyChainLimits())){
				LPCapacity lpcapacity= MacroPlannerSolverFactory.eINSTANCE.createLPCapacity();
				lpcapacity.setCapacity(capacity);
				String name = String.format("capac(%s, %tF)", location_product.getCode(), capacity.getFrom());
				lpcapacity.setName(name);
				this.getCapacities().add(lpcapacity); // owning
			}
		}

		// time line
		TimeBucket startOfHorizon = timeline.getFirstBucket();
		TimeBucket endOfHorizon   = timeline.getLastBucket();
		this.setStartBucket(startOfHorizon);
		this.setEndBucket  (endOfHorizon);
		this.refresh();
	}
} //LPProductImpl
