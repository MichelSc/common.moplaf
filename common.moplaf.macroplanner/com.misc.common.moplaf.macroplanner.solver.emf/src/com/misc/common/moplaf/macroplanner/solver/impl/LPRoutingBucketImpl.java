/**
 */
package com.misc.common.moplaf.macroplanner.solver.impl;



import com.misc.common.moplaf.macroplanner.RoutingProduct;
import com.misc.common.moplaf.macroplanner.RoutingResource;
import com.misc.common.moplaf.macroplanner.solver.LPProduct;
import com.misc.common.moplaf.macroplanner.solver.LPProductBucket;
import com.misc.common.moplaf.macroplanner.solver.LPResource;
import com.misc.common.moplaf.macroplanner.solver.LPResourceBucket;
import com.misc.common.moplaf.macroplanner.solver.LPRouting;
import com.misc.common.moplaf.macroplanner.solver.LPRoutingBucket;
import com.misc.common.moplaf.macroplanner.solver.LPRoutingBucketProduct;
import com.misc.common.moplaf.macroplanner.solver.LPRoutingBucketResource;
import com.misc.common.moplaf.macroplanner.solver.LPRoutingProduct;
import com.misc.common.moplaf.macroplanner.solver.LPRoutingResource;
import com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverFactory;
import com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage;
import com.misc.common.moplaf.solver.GeneratorLpVar;
import com.misc.common.moplaf.solver.util.Util;
import com.misc.common.moplaf.time.discrete.TimeBucket;
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
 * An implementation of the model object '<em><b>LP Routing Bucket</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.impl.LPRoutingBucketImpl#getRouting <em>Routing</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.impl.LPRoutingBucketImpl#getProducts <em>Products</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.impl.LPRoutingBucketImpl#getResources <em>Resources</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.impl.LPRoutingBucketImpl#getPlanned <em>Planned</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LPRoutingBucketImpl extends LPTimeBucketImpl implements LPRoutingBucket {
	/**
	 * The cached value of the '{@link #getProducts() <em>Products</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProducts()
	 * @generated
	 * @ordered
	 */
	protected EList<LPRoutingBucketProduct> products;

	/**
	 * The cached value of the '{@link #getResources() <em>Resources</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResources()
	 * @generated
	 * @ordered
	 */
	protected EList<LPRoutingBucketResource> resources;

	/**
	 * The cached value of the '{@link #getPlanned() <em>Planned</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanned()
	 * @generated
	 * @ordered
	 */
	protected GeneratorLpVar planned;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LPRoutingBucketImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MacroPlannerSolverPackage.Literals.LP_ROUTING_BUCKET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LPRouting getRouting() {
		if (eContainerFeatureID() != MacroPlannerSolverPackage.LP_ROUTING_BUCKET__ROUTING) return null;
		return (LPRouting)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRouting(LPRouting newRouting, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newRouting, MacroPlannerSolverPackage.LP_ROUTING_BUCKET__ROUTING, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRouting(LPRouting newRouting) {
		if (newRouting != eInternalContainer() || (eContainerFeatureID() != MacroPlannerSolverPackage.LP_ROUTING_BUCKET__ROUTING && newRouting != null)) {
			if (EcoreUtil.isAncestor(this, newRouting))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newRouting != null)
				msgs = ((InternalEObject)newRouting).eInverseAdd(this, MacroPlannerSolverPackage.LP_ROUTING__LP_BUCKETS, LPRouting.class, msgs);
			msgs = basicSetRouting(newRouting, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MacroPlannerSolverPackage.LP_ROUTING_BUCKET__ROUTING, newRouting, newRouting));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LPRoutingBucketProduct> getProducts() {
		if (products == null) {
			products = new EObjectContainmentWithInverseEList<LPRoutingBucketProduct>(LPRoutingBucketProduct.class, this, MacroPlannerSolverPackage.LP_ROUTING_BUCKET__PRODUCTS, MacroPlannerSolverPackage.LP_ROUTING_BUCKET_PRODUCT__ROUTING);
		}
		return products;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LPRoutingBucketResource> getResources() {
		if (resources == null) {
			resources = new EObjectContainmentWithInverseEList<LPRoutingBucketResource>(LPRoutingBucketResource.class, this, MacroPlannerSolverPackage.LP_ROUTING_BUCKET__RESOURCES, MacroPlannerSolverPackage.LP_ROUTING_BUCKET_RESOURCE__ROUTING);
		}
		return resources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratorLpVar getPlanned() {
		return planned;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlanned(GeneratorLpVar newPlanned, NotificationChain msgs) {
		GeneratorLpVar oldPlanned = planned;
		planned = newPlanned;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MacroPlannerSolverPackage.LP_ROUTING_BUCKET__PLANNED, oldPlanned, newPlanned);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlanned(GeneratorLpVar newPlanned) {
		if (newPlanned != planned) {
			NotificationChain msgs = null;
			if (planned != null)
				msgs = ((InternalEObject)planned).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MacroPlannerSolverPackage.LP_ROUTING_BUCKET__PLANNED, null, msgs);
			if (newPlanned != null)
				msgs = ((InternalEObject)newPlanned).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MacroPlannerSolverPackage.LP_ROUTING_BUCKET__PLANNED, null, msgs);
			msgs = basicSetPlanned(newPlanned, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MacroPlannerSolverPackage.LP_ROUTING_BUCKET__PLANNED, newPlanned, newPlanned));
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
			case MacroPlannerSolverPackage.LP_ROUTING_BUCKET__ROUTING:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetRouting((LPRouting)otherEnd, msgs);
			case MacroPlannerSolverPackage.LP_ROUTING_BUCKET__PRODUCTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProducts()).basicAdd(otherEnd, msgs);
			case MacroPlannerSolverPackage.LP_ROUTING_BUCKET__RESOURCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getResources()).basicAdd(otherEnd, msgs);
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
			case MacroPlannerSolverPackage.LP_ROUTING_BUCKET__ROUTING:
				return basicSetRouting(null, msgs);
			case MacroPlannerSolverPackage.LP_ROUTING_BUCKET__PRODUCTS:
				return ((InternalEList<?>)getProducts()).basicRemove(otherEnd, msgs);
			case MacroPlannerSolverPackage.LP_ROUTING_BUCKET__RESOURCES:
				return ((InternalEList<?>)getResources()).basicRemove(otherEnd, msgs);
			case MacroPlannerSolverPackage.LP_ROUTING_BUCKET__PLANNED:
				return basicSetPlanned(null, msgs);
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
			case MacroPlannerSolverPackage.LP_ROUTING_BUCKET__ROUTING:
				return eInternalContainer().eInverseRemove(this, MacroPlannerSolverPackage.LP_ROUTING__LP_BUCKETS, LPRouting.class, msgs);
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
			case MacroPlannerSolverPackage.LP_ROUTING_BUCKET__ROUTING:
				return getRouting();
			case MacroPlannerSolverPackage.LP_ROUTING_BUCKET__PRODUCTS:
				return getProducts();
			case MacroPlannerSolverPackage.LP_ROUTING_BUCKET__RESOURCES:
				return getResources();
			case MacroPlannerSolverPackage.LP_ROUTING_BUCKET__PLANNED:
				return getPlanned();
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
			case MacroPlannerSolverPackage.LP_ROUTING_BUCKET__ROUTING:
				setRouting((LPRouting)newValue);
				return;
			case MacroPlannerSolverPackage.LP_ROUTING_BUCKET__PRODUCTS:
				getProducts().clear();
				getProducts().addAll((Collection<? extends LPRoutingBucketProduct>)newValue);
				return;
			case MacroPlannerSolverPackage.LP_ROUTING_BUCKET__RESOURCES:
				getResources().clear();
				getResources().addAll((Collection<? extends LPRoutingBucketResource>)newValue);
				return;
			case MacroPlannerSolverPackage.LP_ROUTING_BUCKET__PLANNED:
				setPlanned((GeneratorLpVar)newValue);
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
			case MacroPlannerSolverPackage.LP_ROUTING_BUCKET__ROUTING:
				setRouting((LPRouting)null);
				return;
			case MacroPlannerSolverPackage.LP_ROUTING_BUCKET__PRODUCTS:
				getProducts().clear();
				return;
			case MacroPlannerSolverPackage.LP_ROUTING_BUCKET__RESOURCES:
				getResources().clear();
				return;
			case MacroPlannerSolverPackage.LP_ROUTING_BUCKET__PLANNED:
				setPlanned((GeneratorLpVar)null);
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
			case MacroPlannerSolverPackage.LP_ROUTING_BUCKET__ROUTING:
				return getRouting() != null;
			case MacroPlannerSolverPackage.LP_ROUTING_BUCKET__PRODUCTS:
				return products != null && !products.isEmpty();
			case MacroPlannerSolverPackage.LP_ROUTING_BUCKET__RESOURCES:
				return resources != null && !resources.isEmpty();
			case MacroPlannerSolverPackage.LP_ROUTING_BUCKET__PLANNED:
				return planned != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * 
	 */
	@Override
	public void generateTuples() {
		super.generateTuples();
		
		LPRouting lprouting = this.getRouting();
		TimeBucket bucket = this.getBucket();
		
		// logic name
		String name = String.format("%s,%s", lprouting.getName(), this.getBucketShortName());
		this.setName(name);
		
		// routing product bucket
		for( LPRoutingProduct lp_routing_product : lprouting.getProducts()){
			LPProduct lp_product = lp_routing_product.getProduct();
			// apply the offset
			RoutingProduct routing_product = lp_routing_product.getRoutingProduct();
			float offsetInSeconds = routing_product.getOffset()*60.0f*60.0f; // seconds
			TimeBucket consumptionBucket = bucket.getOffset(offsetInSeconds);
			if ( consumptionBucket!=null){
				LPProductBucket product_bucket = (LPProductBucket)lp_product.getBucket(consumptionBucket);
				LPRoutingBucketProduct lp_routing_product_bucket = MacroPlannerSolverFactory.eINSTANCE.createLPRoutingBucketProduct();
				lp_routing_product_bucket.setProductBucket(product_bucket);
				lp_routing_product_bucket.setRoutingProduct(lp_routing_product);
				this.getProducts().add(lp_routing_product_bucket); // owning
			}
		}
		// routing resource bucket
		for( LPRoutingResource lp_routing_resource : lprouting.getResources()){
			LPResource lp_resource = lp_routing_resource.getResource();
			// apply the offset
			RoutingResource routing_resource = lp_routing_resource.getRoutingResource();
			float offsetInSeconds = routing_resource.getOffset()*60.0f*60.0f; // seconds
			TimeBucket reservationBucket = bucket.getOffset(offsetInSeconds);
			if ( reservationBucket!=null){
				LPResourceBucket resource_bucket = (LPResourceBucket)lp_resource.getBucket(reservationBucket);
				LPRoutingBucketResource lp_routing_resource_bucket = MacroPlannerSolverFactory.eINSTANCE.createLPRoutingBucketResource();
				lp_routing_resource_bucket.setResourceBucket(resource_bucket);
				lp_routing_resource_bucket.setRoutingResource(lp_routing_resource);
				this.getResources().add(lp_routing_resource_bucket); // owning
			}
		}
	}

	/**
	 * 
	 */
	@Override
	public void generateXReferences() {
		super.generateXReferences();
		
	}
	/**
	 * 
	 */
	@Override
	public void generateVars() {
		super.generateVars();
		
		// var planned
		{
		GeneratorLpVar var = Util.createGeneratorLpVarRealPositiveUnbounded("planned");
		this.setPlanned(var);  // owning
		}

	}
} //LPRoutingBucketImpl
