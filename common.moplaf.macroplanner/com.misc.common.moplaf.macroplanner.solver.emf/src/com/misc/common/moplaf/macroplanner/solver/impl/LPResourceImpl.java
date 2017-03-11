/**
 */
package com.misc.common.moplaf.macroplanner.solver.impl;

import com.misc.common.moplaf.macroplanner.LocationResource;
import com.misc.common.moplaf.macroplanner.Availability;
import com.misc.common.moplaf.macroplanner.SupplyChainLimits;
import com.misc.common.moplaf.macroplanner.solver.LPAvailability;
import com.misc.common.moplaf.macroplanner.solver.LPMacroPlanner;
import com.misc.common.moplaf.macroplanner.solver.LPResource;
import com.misc.common.moplaf.macroplanner.solver.LPResourceBucket;
import com.misc.common.moplaf.macroplanner.solver.LPResourceSet;
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
 * An implementation of the model object '<em><b>LP Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.impl.LPResourceImpl#getResourceSet <em>Resource Set</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.impl.LPResourceImpl#getAvailabilities <em>Availabilities</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.impl.LPResourceImpl#getResource <em>Resource</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.impl.LPResourceImpl#getLPBuckets <em>LP Buckets</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LPResourceImpl extends LPTimeLineImpl implements LPResource {
	/**
	 * The cached value of the '{@link #getAvailabilities() <em>Availabilities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailabilities()
	 * @generated
	 * @ordered
	 */
	protected EList<LPAvailability> availabilities;

	/**
	 * The cached value of the '{@link #getResource() <em>Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResource()
	 * @generated
	 * @ordered
	 */
	protected LocationResource resource;

	/**
	 * The cached value of the '{@link #getLPBuckets() <em>LP Buckets</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLPBuckets()
	 * @generated
	 * @ordered
	 */
	protected EList<LPResourceBucket> lpBuckets;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LPResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MacroPlannerSolverPackage.Literals.LP_RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LPAvailability> getAvailabilities() {
		if (availabilities == null) {
			availabilities = new EObjectContainmentWithInverseEList<LPAvailability>(LPAvailability.class, this, MacroPlannerSolverPackage.LP_RESOURCE__AVAILABILITIES, MacroPlannerSolverPackage.LP_AVAILABILITY__RESOURCE);
		}
		return availabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LPResourceSet getResourceSet() {
		if (eContainerFeatureID() != MacroPlannerSolverPackage.LP_RESOURCE__RESOURCE_SET) return null;
		return (LPResourceSet)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResourceSet(LPResourceSet newResourceSet, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newResourceSet, MacroPlannerSolverPackage.LP_RESOURCE__RESOURCE_SET, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResourceSet(LPResourceSet newResourceSet) {
		if (newResourceSet != eInternalContainer() || (eContainerFeatureID() != MacroPlannerSolverPackage.LP_RESOURCE__RESOURCE_SET && newResourceSet != null)) {
			if (EcoreUtil.isAncestor(this, newResourceSet))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newResourceSet != null)
				msgs = ((InternalEObject)newResourceSet).eInverseAdd(this, MacroPlannerSolverPackage.LP_RESOURCE_SET__RESOURCES, LPResourceSet.class, msgs);
			msgs = basicSetResourceSet(newResourceSet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MacroPlannerSolverPackage.LP_RESOURCE__RESOURCE_SET, newResourceSet, newResourceSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationResource getResource() {
		if (resource != null && resource.eIsProxy()) {
			InternalEObject oldResource = (InternalEObject)resource;
			resource = (LocationResource)eResolveProxy(oldResource);
			if (resource != oldResource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MacroPlannerSolverPackage.LP_RESOURCE__RESOURCE, oldResource, resource));
			}
		}
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationResource basicGetResource() {
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResource(LocationResource newResource) {
		LocationResource oldResource = resource;
		resource = newResource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MacroPlannerSolverPackage.LP_RESOURCE__RESOURCE, oldResource, resource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LPResourceBucket> getLPBuckets() {
		if (lpBuckets == null) {
			lpBuckets = new EObjectContainmentWithInverseEList<LPResourceBucket>(LPResourceBucket.class, this, MacroPlannerSolverPackage.LP_RESOURCE__LP_BUCKETS, MacroPlannerSolverPackage.LP_RESOURCE_BUCKET__RESOURCE);
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
			case MacroPlannerSolverPackage.LP_RESOURCE__RESOURCE_SET:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetResourceSet((LPResourceSet)otherEnd, msgs);
			case MacroPlannerSolverPackage.LP_RESOURCE__AVAILABILITIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAvailabilities()).basicAdd(otherEnd, msgs);
			case MacroPlannerSolverPackage.LP_RESOURCE__LP_BUCKETS:
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
			case MacroPlannerSolverPackage.LP_RESOURCE__RESOURCE_SET:
				return basicSetResourceSet(null, msgs);
			case MacroPlannerSolverPackage.LP_RESOURCE__AVAILABILITIES:
				return ((InternalEList<?>)getAvailabilities()).basicRemove(otherEnd, msgs);
			case MacroPlannerSolverPackage.LP_RESOURCE__LP_BUCKETS:
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
			case MacroPlannerSolverPackage.LP_RESOURCE__RESOURCE_SET:
				return eInternalContainer().eInverseRemove(this, MacroPlannerSolverPackage.LP_RESOURCE_SET__RESOURCES, LPResourceSet.class, msgs);
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
			case MacroPlannerSolverPackage.LP_RESOURCE__RESOURCE_SET:
				return getResourceSet();
			case MacroPlannerSolverPackage.LP_RESOURCE__AVAILABILITIES:
				return getAvailabilities();
			case MacroPlannerSolverPackage.LP_RESOURCE__RESOURCE:
				if (resolve) return getResource();
				return basicGetResource();
			case MacroPlannerSolverPackage.LP_RESOURCE__LP_BUCKETS:
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
			case MacroPlannerSolverPackage.LP_RESOURCE__RESOURCE_SET:
				setResourceSet((LPResourceSet)newValue);
				return;
			case MacroPlannerSolverPackage.LP_RESOURCE__AVAILABILITIES:
				getAvailabilities().clear();
				getAvailabilities().addAll((Collection<? extends LPAvailability>)newValue);
				return;
			case MacroPlannerSolverPackage.LP_RESOURCE__RESOURCE:
				setResource((LocationResource)newValue);
				return;
			case MacroPlannerSolverPackage.LP_RESOURCE__LP_BUCKETS:
				getLPBuckets().clear();
				getLPBuckets().addAll((Collection<? extends LPResourceBucket>)newValue);
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
			case MacroPlannerSolverPackage.LP_RESOURCE__RESOURCE_SET:
				setResourceSet((LPResourceSet)null);
				return;
			case MacroPlannerSolverPackage.LP_RESOURCE__AVAILABILITIES:
				getAvailabilities().clear();
				return;
			case MacroPlannerSolverPackage.LP_RESOURCE__RESOURCE:
				setResource((LocationResource)null);
				return;
			case MacroPlannerSolverPackage.LP_RESOURCE__LP_BUCKETS:
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
			case MacroPlannerSolverPackage.LP_RESOURCE__RESOURCE_SET:
				return getResourceSet() != null;
			case MacroPlannerSolverPackage.LP_RESOURCE__AVAILABILITIES:
				return availabilities != null && !availabilities.isEmpty();
			case MacroPlannerSolverPackage.LP_RESOURCE__RESOURCE:
				return resource != null;
			case MacroPlannerSolverPackage.LP_RESOURCE__LP_BUCKETS:
				return lpBuckets != null && !lpBuckets.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public ObjectTimeBucket constructObjectTimeBucket() {
		LPResourceBucket newbucket = MacroPlannerSolverFactory.eINSTANCE.createLPResourceBucket();
		this.getLPBuckets().add(newbucket);
		return newbucket;
	}


	/**
	 * 
	 */
	@Override
	public void generateTuples() {
		super.generateTuples();

		LPResourceSet resources = this.getResourceSet();
		LPMacroPlanner lp = resources.getMacroPlanner();
		TimeLine timeline = lp.getTimeLine();
		Scenario scenario = lp.getScenario();
	    EList<SupplyChainLimits> selectedSCLimits= scenario.getSelectedLimits();
		LocationResource location_resource = this.getResource();
		
		// availabilities
		for ( Availability availability: location_resource.getAvailabilities()){
			if ( selectedSCLimits.contains(availability.getSupplyChainLimits())){
				LPAvailability lpavailability = MacroPlannerSolverFactory.eINSTANCE.createLPAvailability();
				lpavailability.setAvailability(availability);
				String name = String.format("avail(%s, %tF)", location_resource.getCode(), availability.getFrom());
				lpavailability.setName(name);
				this.getAvailabilities().add(lpavailability); // owning
			}
		}

		// time line
		TimeBucket startOfHorizon = timeline.getFirstBucket();
		TimeBucket endOfHorizon   = timeline.getLastBucket();
		this.setStartBucket(startOfHorizon);
		this.setEndBucket  (endOfHorizon);
		this.refresh();
	}
} //LPResourceImpl
