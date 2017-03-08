/**
 */
package com.misc.common.moplaf.macroplanner.solver.impl;

import com.misc.common.moplaf.macroplanner.Availability;
import com.misc.common.moplaf.macroplanner.solver.LPAvailability;
import com.misc.common.moplaf.macroplanner.solver.LPAvailabilityBucket;
import com.misc.common.moplaf.macroplanner.solver.LPMacroPlanner;
import com.misc.common.moplaf.macroplanner.solver.LPResource;
import com.misc.common.moplaf.macroplanner.solver.LPResourceSet;
import com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverFactory;
import com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage;
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
 * An implementation of the model object '<em><b>LP Availability</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.impl.LPAvailabilityImpl#getResource <em>Resource</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.impl.LPAvailabilityImpl#getAvailability <em>Availability</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.impl.LPAvailabilityImpl#getLPBuckets <em>LP Buckets</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LPAvailabilityImpl extends LPTimeLineImpl implements LPAvailability {
	/**
	 * The cached value of the '{@link #getAvailability() <em>Availability</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailability()
	 * @generated
	 * @ordered
	 */
	protected Availability availability;

	/**
	 * The cached value of the '{@link #getLPBuckets() <em>LP Buckets</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLPBuckets()
	 * @generated
	 * @ordered
	 */
	protected EList<LPAvailabilityBucket> lpBuckets;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LPAvailabilityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MacroPlannerSolverPackage.Literals.LP_AVAILABILITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LPResource getResource() {
		if (eContainerFeatureID() != MacroPlannerSolverPackage.LP_AVAILABILITY__RESOURCE) return null;
		return (LPResource)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResource(LPResource newResource, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newResource, MacroPlannerSolverPackage.LP_AVAILABILITY__RESOURCE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResource(LPResource newResource) {
		if (newResource != eInternalContainer() || (eContainerFeatureID() != MacroPlannerSolverPackage.LP_AVAILABILITY__RESOURCE && newResource != null)) {
			if (EcoreUtil.isAncestor(this, newResource))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newResource != null)
				msgs = ((InternalEObject)newResource).eInverseAdd(this, MacroPlannerSolverPackage.LP_RESOURCE__AVAILABILITIES, LPResource.class, msgs);
			msgs = basicSetResource(newResource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MacroPlannerSolverPackage.LP_AVAILABILITY__RESOURCE, newResource, newResource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Availability getAvailability() {
		if (availability != null && availability.eIsProxy()) {
			InternalEObject oldAvailability = (InternalEObject)availability;
			availability = (Availability)eResolveProxy(oldAvailability);
			if (availability != oldAvailability) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MacroPlannerSolverPackage.LP_AVAILABILITY__AVAILABILITY, oldAvailability, availability));
			}
		}
		return availability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Availability basicGetAvailability() {
		return availability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAvailability(Availability newAvailability) {
		Availability oldAvailability = availability;
		availability = newAvailability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MacroPlannerSolverPackage.LP_AVAILABILITY__AVAILABILITY, oldAvailability, availability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LPAvailabilityBucket> getLPBuckets() {
		if (lpBuckets == null) {
			lpBuckets = new EObjectContainmentWithInverseEList<LPAvailabilityBucket>(LPAvailabilityBucket.class, this, MacroPlannerSolverPackage.LP_AVAILABILITY__LP_BUCKETS, MacroPlannerSolverPackage.LP_AVAILABILITY_BUCKET__AVAILABILITY);
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
			case MacroPlannerSolverPackage.LP_AVAILABILITY__RESOURCE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetResource((LPResource)otherEnd, msgs);
			case MacroPlannerSolverPackage.LP_AVAILABILITY__LP_BUCKETS:
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
			case MacroPlannerSolverPackage.LP_AVAILABILITY__RESOURCE:
				return basicSetResource(null, msgs);
			case MacroPlannerSolverPackage.LP_AVAILABILITY__LP_BUCKETS:
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
			case MacroPlannerSolverPackage.LP_AVAILABILITY__RESOURCE:
				return eInternalContainer().eInverseRemove(this, MacroPlannerSolverPackage.LP_RESOURCE__AVAILABILITIES, LPResource.class, msgs);
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
			case MacroPlannerSolverPackage.LP_AVAILABILITY__RESOURCE:
				return getResource();
			case MacroPlannerSolverPackage.LP_AVAILABILITY__AVAILABILITY:
				if (resolve) return getAvailability();
				return basicGetAvailability();
			case MacroPlannerSolverPackage.LP_AVAILABILITY__LP_BUCKETS:
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
			case MacroPlannerSolverPackage.LP_AVAILABILITY__RESOURCE:
				setResource((LPResource)newValue);
				return;
			case MacroPlannerSolverPackage.LP_AVAILABILITY__AVAILABILITY:
				setAvailability((Availability)newValue);
				return;
			case MacroPlannerSolverPackage.LP_AVAILABILITY__LP_BUCKETS:
				getLPBuckets().clear();
				getLPBuckets().addAll((Collection<? extends LPAvailabilityBucket>)newValue);
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
			case MacroPlannerSolverPackage.LP_AVAILABILITY__RESOURCE:
				setResource((LPResource)null);
				return;
			case MacroPlannerSolverPackage.LP_AVAILABILITY__AVAILABILITY:
				setAvailability((Availability)null);
				return;
			case MacroPlannerSolverPackage.LP_AVAILABILITY__LP_BUCKETS:
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
			case MacroPlannerSolverPackage.LP_AVAILABILITY__RESOURCE:
				return getResource() != null;
			case MacroPlannerSolverPackage.LP_AVAILABILITY__AVAILABILITY:
				return availability != null;
			case MacroPlannerSolverPackage.LP_AVAILABILITY__LP_BUCKETS:
				return lpBuckets != null && !lpBuckets.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public ObjectTimeBucket constructObjectTimeBucket() {
		LPAvailabilityBucket newbucket = MacroPlannerSolverFactory.eINSTANCE.createLPAvailabilityBucket();
		this.getLPBuckets().add(newbucket);
		return newbucket;
	}


	/**
	 * 
	 */
	@Override
	public void generateTuples() {
		super.generateTuples();

		LPResource resource = this.getResource();
		LPResourceSet resources = resource.getResourceSet();
		LPMacroPlanner lp = resources.getMacroPlanner();
		TimeLine timeline = lp.getTimeLine();
		Availability availability = this.getAvailability();

		// time line
		TimeBucket startOfHorizon = timeline.getBucketFloor(availability.getFrom());
		TimeBucket endOfHorizon   = timeline.getBucketCeil(availability.getTo());
		this.setStartBucket(startOfHorizon);
		this.setEndBucket  (endOfHorizon);
		this.refresh();
	}
} //LPAvailabilityImpl
