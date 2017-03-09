/**
 */
package com.misc.common.moplaf.macroplanner.solver.impl;

import com.misc.common.moplaf.macroplanner.solver.LPAvailabilityBucket;
import com.misc.common.moplaf.macroplanner.solver.LPResource;
import com.misc.common.moplaf.macroplanner.solver.LPResourceBucket;
import com.misc.common.moplaf.macroplanner.solver.LPRoutingBucketResource;
import com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage;

import com.misc.common.moplaf.solver.GeneratorLpCons;
import com.misc.common.moplaf.solver.GeneratorLpVar;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>LP Resource Bucket</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.impl.LPResourceBucketImpl#getResource <em>Resource</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.impl.LPResourceBucketImpl#getAvailabilities <em>Availabilities</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.impl.LPResourceBucketImpl#getReservations <em>Reservations</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.impl.LPResourceBucketImpl#getReserved <em>Reserved</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.impl.LPResourceBucketImpl#getBalance <em>Balance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LPResourceBucketImpl extends LPTimeBucketImpl implements LPResourceBucket {
	/**
	 * The cached value of the '{@link #getAvailabilities() <em>Availabilities</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailabilities()
	 * @generated
	 * @ordered
	 */
	protected EList<LPAvailabilityBucket> availabilities;

	/**
	 * The cached value of the '{@link #getReservations() <em>Reservations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReservations()
	 * @generated
	 * @ordered
	 */
	protected EList<LPRoutingBucketResource> reservations;

	/**
	 * The cached value of the '{@link #getReserved() <em>Reserved</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReserved()
	 * @generated
	 * @ordered
	 */
	protected GeneratorLpVar reserved;

	/**
	 * The cached value of the '{@link #getBalance() <em>Balance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBalance()
	 * @generated
	 * @ordered
	 */
	protected GeneratorLpCons balance;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LPResourceBucketImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MacroPlannerSolverPackage.Literals.LP_RESOURCE_BUCKET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LPResource getResource() {
		if (eContainerFeatureID() != MacroPlannerSolverPackage.LP_RESOURCE_BUCKET__RESOURCE) return null;
		return (LPResource)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResource(LPResource newResource, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newResource, MacroPlannerSolverPackage.LP_RESOURCE_BUCKET__RESOURCE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResource(LPResource newResource) {
		if (newResource != eInternalContainer() || (eContainerFeatureID() != MacroPlannerSolverPackage.LP_RESOURCE_BUCKET__RESOURCE && newResource != null)) {
			if (EcoreUtil.isAncestor(this, newResource))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newResource != null)
				msgs = ((InternalEObject)newResource).eInverseAdd(this, MacroPlannerSolverPackage.LP_RESOURCE__LP_BUCKETS, LPResource.class, msgs);
			msgs = basicSetResource(newResource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MacroPlannerSolverPackage.LP_RESOURCE_BUCKET__RESOURCE, newResource, newResource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LPAvailabilityBucket> getAvailabilities() {
		if (availabilities == null) {
			availabilities = new EObjectWithInverseResolvingEList<LPAvailabilityBucket>(LPAvailabilityBucket.class, this, MacroPlannerSolverPackage.LP_RESOURCE_BUCKET__AVAILABILITIES, MacroPlannerSolverPackage.LP_AVAILABILITY_BUCKET__RESOURCE_BUCKET);
		}
		return availabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LPRoutingBucketResource> getReservations() {
		if (reservations == null) {
			reservations = new EObjectWithInverseResolvingEList<LPRoutingBucketResource>(LPRoutingBucketResource.class, this, MacroPlannerSolverPackage.LP_RESOURCE_BUCKET__RESERVATIONS, MacroPlannerSolverPackage.LP_ROUTING_BUCKET_RESOURCE__RESOURCE_BUCKET);
		}
		return reservations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratorLpVar getReserved() {
		return reserved;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReserved(GeneratorLpVar newReserved, NotificationChain msgs) {
		GeneratorLpVar oldReserved = reserved;
		reserved = newReserved;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MacroPlannerSolverPackage.LP_RESOURCE_BUCKET__RESERVED, oldReserved, newReserved);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReserved(GeneratorLpVar newReserved) {
		if (newReserved != reserved) {
			NotificationChain msgs = null;
			if (reserved != null)
				msgs = ((InternalEObject)reserved).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MacroPlannerSolverPackage.LP_RESOURCE_BUCKET__RESERVED, null, msgs);
			if (newReserved != null)
				msgs = ((InternalEObject)newReserved).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MacroPlannerSolverPackage.LP_RESOURCE_BUCKET__RESERVED, null, msgs);
			msgs = basicSetReserved(newReserved, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MacroPlannerSolverPackage.LP_RESOURCE_BUCKET__RESERVED, newReserved, newReserved));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratorLpCons getBalance() {
		return balance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBalance(GeneratorLpCons newBalance, NotificationChain msgs) {
		GeneratorLpCons oldBalance = balance;
		balance = newBalance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MacroPlannerSolverPackage.LP_RESOURCE_BUCKET__BALANCE, oldBalance, newBalance);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBalance(GeneratorLpCons newBalance) {
		if (newBalance != balance) {
			NotificationChain msgs = null;
			if (balance != null)
				msgs = ((InternalEObject)balance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MacroPlannerSolverPackage.LP_RESOURCE_BUCKET__BALANCE, null, msgs);
			if (newBalance != null)
				msgs = ((InternalEObject)newBalance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MacroPlannerSolverPackage.LP_RESOURCE_BUCKET__BALANCE, null, msgs);
			msgs = basicSetBalance(newBalance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MacroPlannerSolverPackage.LP_RESOURCE_BUCKET__BALANCE, newBalance, newBalance));
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
			case MacroPlannerSolverPackage.LP_RESOURCE_BUCKET__RESOURCE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetResource((LPResource)otherEnd, msgs);
			case MacroPlannerSolverPackage.LP_RESOURCE_BUCKET__AVAILABILITIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAvailabilities()).basicAdd(otherEnd, msgs);
			case MacroPlannerSolverPackage.LP_RESOURCE_BUCKET__RESERVATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReservations()).basicAdd(otherEnd, msgs);
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
			case MacroPlannerSolverPackage.LP_RESOURCE_BUCKET__RESOURCE:
				return basicSetResource(null, msgs);
			case MacroPlannerSolverPackage.LP_RESOURCE_BUCKET__AVAILABILITIES:
				return ((InternalEList<?>)getAvailabilities()).basicRemove(otherEnd, msgs);
			case MacroPlannerSolverPackage.LP_RESOURCE_BUCKET__RESERVATIONS:
				return ((InternalEList<?>)getReservations()).basicRemove(otherEnd, msgs);
			case MacroPlannerSolverPackage.LP_RESOURCE_BUCKET__RESERVED:
				return basicSetReserved(null, msgs);
			case MacroPlannerSolverPackage.LP_RESOURCE_BUCKET__BALANCE:
				return basicSetBalance(null, msgs);
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
			case MacroPlannerSolverPackage.LP_RESOURCE_BUCKET__RESOURCE:
				return eInternalContainer().eInverseRemove(this, MacroPlannerSolverPackage.LP_RESOURCE__LP_BUCKETS, LPResource.class, msgs);
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
			case MacroPlannerSolverPackage.LP_RESOURCE_BUCKET__RESOURCE:
				return getResource();
			case MacroPlannerSolverPackage.LP_RESOURCE_BUCKET__AVAILABILITIES:
				return getAvailabilities();
			case MacroPlannerSolverPackage.LP_RESOURCE_BUCKET__RESERVATIONS:
				return getReservations();
			case MacroPlannerSolverPackage.LP_RESOURCE_BUCKET__RESERVED:
				return getReserved();
			case MacroPlannerSolverPackage.LP_RESOURCE_BUCKET__BALANCE:
				return getBalance();
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
			case MacroPlannerSolverPackage.LP_RESOURCE_BUCKET__RESOURCE:
				setResource((LPResource)newValue);
				return;
			case MacroPlannerSolverPackage.LP_RESOURCE_BUCKET__AVAILABILITIES:
				getAvailabilities().clear();
				getAvailabilities().addAll((Collection<? extends LPAvailabilityBucket>)newValue);
				return;
			case MacroPlannerSolverPackage.LP_RESOURCE_BUCKET__RESERVATIONS:
				getReservations().clear();
				getReservations().addAll((Collection<? extends LPRoutingBucketResource>)newValue);
				return;
			case MacroPlannerSolverPackage.LP_RESOURCE_BUCKET__RESERVED:
				setReserved((GeneratorLpVar)newValue);
				return;
			case MacroPlannerSolverPackage.LP_RESOURCE_BUCKET__BALANCE:
				setBalance((GeneratorLpCons)newValue);
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
			case MacroPlannerSolverPackage.LP_RESOURCE_BUCKET__RESOURCE:
				setResource((LPResource)null);
				return;
			case MacroPlannerSolverPackage.LP_RESOURCE_BUCKET__AVAILABILITIES:
				getAvailabilities().clear();
				return;
			case MacroPlannerSolverPackage.LP_RESOURCE_BUCKET__RESERVATIONS:
				getReservations().clear();
				return;
			case MacroPlannerSolverPackage.LP_RESOURCE_BUCKET__RESERVED:
				setReserved((GeneratorLpVar)null);
				return;
			case MacroPlannerSolverPackage.LP_RESOURCE_BUCKET__BALANCE:
				setBalance((GeneratorLpCons)null);
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
			case MacroPlannerSolverPackage.LP_RESOURCE_BUCKET__RESOURCE:
				return getResource() != null;
			case MacroPlannerSolverPackage.LP_RESOURCE_BUCKET__AVAILABILITIES:
				return availabilities != null && !availabilities.isEmpty();
			case MacroPlannerSolverPackage.LP_RESOURCE_BUCKET__RESERVATIONS:
				return reservations != null && !reservations.isEmpty();
			case MacroPlannerSolverPackage.LP_RESOURCE_BUCKET__RESERVED:
				return reserved != null;
			case MacroPlannerSolverPackage.LP_RESOURCE_BUCKET__BALANCE:
				return balance != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * 
	 */
	@Override
	public void generateTuples() {
		super.generateTuples();
		
		LPResource resource = this.getResource();
		//TimeBucket bucket = this.getBucket();
		
		// logic name
		String name = String.format("%s,%s", resource.getName(), this.getBucketShortName());
		this.setName(name);
	}

	/**
	 * 
	 */
	@Override
	public void generateXReferences() {
		super.generateXReferences();
		
	}
} //LPResourceBucketImpl
