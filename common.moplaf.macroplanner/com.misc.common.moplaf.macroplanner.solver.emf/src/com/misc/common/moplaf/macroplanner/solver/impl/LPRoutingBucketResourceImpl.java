/**
 */
package com.misc.common.moplaf.macroplanner.solver.impl;

import com.misc.common.moplaf.macroplanner.solver.LPResourceBucket;
import com.misc.common.moplaf.macroplanner.solver.LPRoutingBucketResource;
import com.misc.common.moplaf.macroplanner.solver.LPRoutingResource;
import com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>LP Routing Bucket Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.impl.LPRoutingBucketResourceImpl#getResourceBucket <em>Resource Bucket</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.impl.LPRoutingBucketResourceImpl#getRoutingResource <em>Routing Resource</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LPRoutingBucketResourceImpl extends LPTupleImpl implements LPRoutingBucketResource {
	/**
	 * The cached value of the '{@link #getResourceBucket() <em>Resource Bucket</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceBucket()
	 * @generated
	 * @ordered
	 */
	protected LPResourceBucket resourceBucket;

	/**
	 * The cached value of the '{@link #getRoutingResource() <em>Routing Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoutingResource()
	 * @generated
	 * @ordered
	 */
	protected LPRoutingResource routingResource;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LPRoutingBucketResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MacroPlannerSolverPackage.Literals.LP_ROUTING_BUCKET_RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LPResourceBucket getResourceBucket() {
		if (resourceBucket != null && resourceBucket.eIsProxy()) {
			InternalEObject oldResourceBucket = (InternalEObject)resourceBucket;
			resourceBucket = (LPResourceBucket)eResolveProxy(oldResourceBucket);
			if (resourceBucket != oldResourceBucket) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MacroPlannerSolverPackage.LP_ROUTING_BUCKET_RESOURCE__RESOURCE_BUCKET, oldResourceBucket, resourceBucket));
			}
		}
		return resourceBucket;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LPResourceBucket basicGetResourceBucket() {
		return resourceBucket;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResourceBucket(LPResourceBucket newResourceBucket) {
		LPResourceBucket oldResourceBucket = resourceBucket;
		resourceBucket = newResourceBucket;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MacroPlannerSolverPackage.LP_ROUTING_BUCKET_RESOURCE__RESOURCE_BUCKET, oldResourceBucket, resourceBucket));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LPRoutingResource getRoutingResource() {
		if (routingResource != null && routingResource.eIsProxy()) {
			InternalEObject oldRoutingResource = (InternalEObject)routingResource;
			routingResource = (LPRoutingResource)eResolveProxy(oldRoutingResource);
			if (routingResource != oldRoutingResource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MacroPlannerSolverPackage.LP_ROUTING_BUCKET_RESOURCE__ROUTING_RESOURCE, oldRoutingResource, routingResource));
			}
		}
		return routingResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LPRoutingResource basicGetRoutingResource() {
		return routingResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRoutingResource(LPRoutingResource newRoutingResource, NotificationChain msgs) {
		LPRoutingResource oldRoutingResource = routingResource;
		routingResource = newRoutingResource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MacroPlannerSolverPackage.LP_ROUTING_BUCKET_RESOURCE__ROUTING_RESOURCE, oldRoutingResource, newRoutingResource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoutingResource(LPRoutingResource newRoutingResource) {
		if (newRoutingResource != routingResource) {
			NotificationChain msgs = null;
			if (routingResource != null)
				msgs = ((InternalEObject)routingResource).eInverseRemove(this, MacroPlannerSolverPackage.LP_ROUTING_RESOURCE__LP_BUCKET, LPRoutingResource.class, msgs);
			if (newRoutingResource != null)
				msgs = ((InternalEObject)newRoutingResource).eInverseAdd(this, MacroPlannerSolverPackage.LP_ROUTING_RESOURCE__LP_BUCKET, LPRoutingResource.class, msgs);
			msgs = basicSetRoutingResource(newRoutingResource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MacroPlannerSolverPackage.LP_ROUTING_BUCKET_RESOURCE__ROUTING_RESOURCE, newRoutingResource, newRoutingResource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MacroPlannerSolverPackage.LP_ROUTING_BUCKET_RESOURCE__ROUTING_RESOURCE:
				if (routingResource != null)
					msgs = ((InternalEObject)routingResource).eInverseRemove(this, MacroPlannerSolverPackage.LP_ROUTING_RESOURCE__LP_BUCKET, LPRoutingResource.class, msgs);
				return basicSetRoutingResource((LPRoutingResource)otherEnd, msgs);
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
			case MacroPlannerSolverPackage.LP_ROUTING_BUCKET_RESOURCE__ROUTING_RESOURCE:
				return basicSetRoutingResource(null, msgs);
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
			case MacroPlannerSolverPackage.LP_ROUTING_BUCKET_RESOURCE__RESOURCE_BUCKET:
				if (resolve) return getResourceBucket();
				return basicGetResourceBucket();
			case MacroPlannerSolverPackage.LP_ROUTING_BUCKET_RESOURCE__ROUTING_RESOURCE:
				if (resolve) return getRoutingResource();
				return basicGetRoutingResource();
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
			case MacroPlannerSolverPackage.LP_ROUTING_BUCKET_RESOURCE__RESOURCE_BUCKET:
				setResourceBucket((LPResourceBucket)newValue);
				return;
			case MacroPlannerSolverPackage.LP_ROUTING_BUCKET_RESOURCE__ROUTING_RESOURCE:
				setRoutingResource((LPRoutingResource)newValue);
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
			case MacroPlannerSolverPackage.LP_ROUTING_BUCKET_RESOURCE__RESOURCE_BUCKET:
				setResourceBucket((LPResourceBucket)null);
				return;
			case MacroPlannerSolverPackage.LP_ROUTING_BUCKET_RESOURCE__ROUTING_RESOURCE:
				setRoutingResource((LPRoutingResource)null);
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
			case MacroPlannerSolverPackage.LP_ROUTING_BUCKET_RESOURCE__RESOURCE_BUCKET:
				return resourceBucket != null;
			case MacroPlannerSolverPackage.LP_ROUTING_BUCKET_RESOURCE__ROUTING_RESOURCE:
				return routingResource != null;
		}
		return super.eIsSet(featureID);
	}

} //LPRoutingBucketResourceImpl
