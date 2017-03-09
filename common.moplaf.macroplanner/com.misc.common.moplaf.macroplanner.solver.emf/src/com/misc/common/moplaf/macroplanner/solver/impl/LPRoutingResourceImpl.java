/**
 */
package com.misc.common.moplaf.macroplanner.solver.impl;

import com.misc.common.moplaf.macroplanner.RoutingResource;
import com.misc.common.moplaf.macroplanner.solver.LPResource;
import com.misc.common.moplaf.macroplanner.solver.LPRouting;
import com.misc.common.moplaf.macroplanner.solver.LPRoutingBucketResource;
import com.misc.common.moplaf.macroplanner.solver.LPRoutingResource;
import com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage;

import com.misc.common.moplaf.solver.impl.GeneratorTupleImpl;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>LP Routing Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.impl.LPRoutingResourceImpl#getRouting <em>Routing</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.impl.LPRoutingResourceImpl#getResource <em>Resource</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.impl.LPRoutingResourceImpl#getRoutingResource <em>Routing Resource</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.impl.LPRoutingResourceImpl#getLPBucket <em>LP Bucket</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LPRoutingResourceImpl extends GeneratorTupleImpl implements LPRoutingResource {
	/**
	 * The cached value of the '{@link #getResource() <em>Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResource()
	 * @generated
	 * @ordered
	 */
	protected LPResource resource;

	/**
	 * The cached value of the '{@link #getRoutingResource() <em>Routing Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoutingResource()
	 * @generated
	 * @ordered
	 */
	protected RoutingResource routingResource;
	/**
	 * The cached value of the '{@link #getLPBucket() <em>LP Bucket</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLPBucket()
	 * @generated
	 * @ordered
	 */
	protected LPRoutingBucketResource lpBucket;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LPRoutingResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MacroPlannerSolverPackage.Literals.LP_ROUTING_RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LPRouting getRouting() {
		if (eContainerFeatureID() != MacroPlannerSolverPackage.LP_ROUTING_RESOURCE__ROUTING) return null;
		return (LPRouting)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRouting(LPRouting newRouting, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newRouting, MacroPlannerSolverPackage.LP_ROUTING_RESOURCE__ROUTING, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRouting(LPRouting newRouting) {
		if (newRouting != eInternalContainer() || (eContainerFeatureID() != MacroPlannerSolverPackage.LP_ROUTING_RESOURCE__ROUTING && newRouting != null)) {
			if (EcoreUtil.isAncestor(this, newRouting))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newRouting != null)
				msgs = ((InternalEObject)newRouting).eInverseAdd(this, MacroPlannerSolverPackage.LP_ROUTING__RESOURCES, LPRouting.class, msgs);
			msgs = basicSetRouting(newRouting, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MacroPlannerSolverPackage.LP_ROUTING_RESOURCE__ROUTING, newRouting, newRouting));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LPResource getResource() {
		if (resource != null && resource.eIsProxy()) {
			InternalEObject oldResource = (InternalEObject)resource;
			resource = (LPResource)eResolveProxy(oldResource);
			if (resource != oldResource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MacroPlannerSolverPackage.LP_ROUTING_RESOURCE__RESOURCE, oldResource, resource));
			}
		}
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LPResource basicGetResource() {
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResource(LPResource newResource) {
		LPResource oldResource = resource;
		resource = newResource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MacroPlannerSolverPackage.LP_ROUTING_RESOURCE__RESOURCE, oldResource, resource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoutingResource getRoutingResource() {
		if (routingResource != null && routingResource.eIsProxy()) {
			InternalEObject oldRoutingResource = (InternalEObject)routingResource;
			routingResource = (RoutingResource)eResolveProxy(oldRoutingResource);
			if (routingResource != oldRoutingResource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MacroPlannerSolverPackage.LP_ROUTING_RESOURCE__ROUTING_RESOURCE, oldRoutingResource, routingResource));
			}
		}
		return routingResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoutingResource basicGetRoutingResource() {
		return routingResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoutingResource(RoutingResource newRoutingResource) {
		RoutingResource oldRoutingResource = routingResource;
		routingResource = newRoutingResource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MacroPlannerSolverPackage.LP_ROUTING_RESOURCE__ROUTING_RESOURCE, oldRoutingResource, routingResource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LPRoutingBucketResource getLPBucket() {
		if (lpBucket != null && lpBucket.eIsProxy()) {
			InternalEObject oldLPBucket = (InternalEObject)lpBucket;
			lpBucket = (LPRoutingBucketResource)eResolveProxy(oldLPBucket);
			if (lpBucket != oldLPBucket) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MacroPlannerSolverPackage.LP_ROUTING_RESOURCE__LP_BUCKET, oldLPBucket, lpBucket));
			}
		}
		return lpBucket;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LPRoutingBucketResource basicGetLPBucket() {
		return lpBucket;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLPBucket(LPRoutingBucketResource newLPBucket, NotificationChain msgs) {
		LPRoutingBucketResource oldLPBucket = lpBucket;
		lpBucket = newLPBucket;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MacroPlannerSolverPackage.LP_ROUTING_RESOURCE__LP_BUCKET, oldLPBucket, newLPBucket);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLPBucket(LPRoutingBucketResource newLPBucket) {
		if (newLPBucket != lpBucket) {
			NotificationChain msgs = null;
			if (lpBucket != null)
				msgs = ((InternalEObject)lpBucket).eInverseRemove(this, MacroPlannerSolverPackage.LP_ROUTING_BUCKET_RESOURCE__ROUTING_RESOURCE, LPRoutingBucketResource.class, msgs);
			if (newLPBucket != null)
				msgs = ((InternalEObject)newLPBucket).eInverseAdd(this, MacroPlannerSolverPackage.LP_ROUTING_BUCKET_RESOURCE__ROUTING_RESOURCE, LPRoutingBucketResource.class, msgs);
			msgs = basicSetLPBucket(newLPBucket, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MacroPlannerSolverPackage.LP_ROUTING_RESOURCE__LP_BUCKET, newLPBucket, newLPBucket));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MacroPlannerSolverPackage.LP_ROUTING_RESOURCE__ROUTING:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetRouting((LPRouting)otherEnd, msgs);
			case MacroPlannerSolverPackage.LP_ROUTING_RESOURCE__LP_BUCKET:
				if (lpBucket != null)
					msgs = ((InternalEObject)lpBucket).eInverseRemove(this, MacroPlannerSolverPackage.LP_ROUTING_BUCKET_RESOURCE__ROUTING_RESOURCE, LPRoutingBucketResource.class, msgs);
				return basicSetLPBucket((LPRoutingBucketResource)otherEnd, msgs);
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
			case MacroPlannerSolverPackage.LP_ROUTING_RESOURCE__ROUTING:
				return basicSetRouting(null, msgs);
			case MacroPlannerSolverPackage.LP_ROUTING_RESOURCE__LP_BUCKET:
				return basicSetLPBucket(null, msgs);
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
			case MacroPlannerSolverPackage.LP_ROUTING_RESOURCE__ROUTING:
				return eInternalContainer().eInverseRemove(this, MacroPlannerSolverPackage.LP_ROUTING__RESOURCES, LPRouting.class, msgs);
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
			case MacroPlannerSolverPackage.LP_ROUTING_RESOURCE__ROUTING:
				return getRouting();
			case MacroPlannerSolverPackage.LP_ROUTING_RESOURCE__RESOURCE:
				if (resolve) return getResource();
				return basicGetResource();
			case MacroPlannerSolverPackage.LP_ROUTING_RESOURCE__ROUTING_RESOURCE:
				if (resolve) return getRoutingResource();
				return basicGetRoutingResource();
			case MacroPlannerSolverPackage.LP_ROUTING_RESOURCE__LP_BUCKET:
				if (resolve) return getLPBucket();
				return basicGetLPBucket();
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
			case MacroPlannerSolverPackage.LP_ROUTING_RESOURCE__ROUTING:
				setRouting((LPRouting)newValue);
				return;
			case MacroPlannerSolverPackage.LP_ROUTING_RESOURCE__RESOURCE:
				setResource((LPResource)newValue);
				return;
			case MacroPlannerSolverPackage.LP_ROUTING_RESOURCE__ROUTING_RESOURCE:
				setRoutingResource((RoutingResource)newValue);
				return;
			case MacroPlannerSolverPackage.LP_ROUTING_RESOURCE__LP_BUCKET:
				setLPBucket((LPRoutingBucketResource)newValue);
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
			case MacroPlannerSolverPackage.LP_ROUTING_RESOURCE__ROUTING:
				setRouting((LPRouting)null);
				return;
			case MacroPlannerSolverPackage.LP_ROUTING_RESOURCE__RESOURCE:
				setResource((LPResource)null);
				return;
			case MacroPlannerSolverPackage.LP_ROUTING_RESOURCE__ROUTING_RESOURCE:
				setRoutingResource((RoutingResource)null);
				return;
			case MacroPlannerSolverPackage.LP_ROUTING_RESOURCE__LP_BUCKET:
				setLPBucket((LPRoutingBucketResource)null);
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
			case MacroPlannerSolverPackage.LP_ROUTING_RESOURCE__ROUTING:
				return getRouting() != null;
			case MacroPlannerSolverPackage.LP_ROUTING_RESOURCE__RESOURCE:
				return resource != null;
			case MacroPlannerSolverPackage.LP_ROUTING_RESOURCE__ROUTING_RESOURCE:
				return routingResource != null;
			case MacroPlannerSolverPackage.LP_ROUTING_RESOURCE__LP_BUCKET:
				return lpBucket != null;
		}
		return super.eIsSet(featureID);
	}

} //LPRoutingResourceImpl
