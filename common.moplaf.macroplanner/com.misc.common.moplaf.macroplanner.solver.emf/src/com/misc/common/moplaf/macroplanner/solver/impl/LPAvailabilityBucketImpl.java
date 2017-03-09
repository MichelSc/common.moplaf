/**
 */
package com.misc.common.moplaf.macroplanner.solver.impl;

import com.misc.common.moplaf.macroplanner.solver.LPAvailability;
import com.misc.common.moplaf.macroplanner.solver.LPAvailabilityBucket;
import com.misc.common.moplaf.macroplanner.solver.LPResource;
import com.misc.common.moplaf.macroplanner.solver.LPResourceBucket;
import com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage;

import com.misc.common.moplaf.solver.GeneratorLpCons;
import com.misc.common.moplaf.solver.GeneratorLpVar;
import com.misc.common.moplaf.time.discrete.ObjectTimeBucket;
import com.misc.common.moplaf.time.discrete.TimeBucket;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>LP Availability Bucket</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.impl.LPAvailabilityBucketImpl#getAvailability <em>Availability</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.impl.LPAvailabilityBucketImpl#getResourceBucket <em>Resource Bucket</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.impl.LPAvailabilityBucketImpl#getReserved <em>Reserved</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.impl.LPAvailabilityBucketImpl#getSlack <em>Slack</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.impl.LPAvailabilityBucketImpl#getBalance <em>Balance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LPAvailabilityBucketImpl extends LPTimeBucketImpl implements LPAvailabilityBucket {
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
	 * The cached value of the '{@link #getReserved() <em>Reserved</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReserved()
	 * @generated
	 * @ordered
	 */
	protected GeneratorLpVar reserved;

	/**
	 * The cached value of the '{@link #getSlack() <em>Slack</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlack()
	 * @generated
	 * @ordered
	 */
	protected GeneratorLpVar slack;

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
	protected LPAvailabilityBucketImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MacroPlannerSolverPackage.Literals.LP_AVAILABILITY_BUCKET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LPAvailability getAvailability() {
		if (eContainerFeatureID() != MacroPlannerSolverPackage.LP_AVAILABILITY_BUCKET__AVAILABILITY) return null;
		return (LPAvailability)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAvailability(LPAvailability newAvailability, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newAvailability, MacroPlannerSolverPackage.LP_AVAILABILITY_BUCKET__AVAILABILITY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAvailability(LPAvailability newAvailability) {
		if (newAvailability != eInternalContainer() || (eContainerFeatureID() != MacroPlannerSolverPackage.LP_AVAILABILITY_BUCKET__AVAILABILITY && newAvailability != null)) {
			if (EcoreUtil.isAncestor(this, newAvailability))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newAvailability != null)
				msgs = ((InternalEObject)newAvailability).eInverseAdd(this, MacroPlannerSolverPackage.LP_AVAILABILITY__LP_BUCKETS, LPAvailability.class, msgs);
			msgs = basicSetAvailability(newAvailability, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MacroPlannerSolverPackage.LP_AVAILABILITY_BUCKET__AVAILABILITY, newAvailability, newAvailability));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MacroPlannerSolverPackage.LP_AVAILABILITY_BUCKET__RESOURCE_BUCKET, oldResourceBucket, resourceBucket));
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
	public NotificationChain basicSetResourceBucket(LPResourceBucket newResourceBucket, NotificationChain msgs) {
		LPResourceBucket oldResourceBucket = resourceBucket;
		resourceBucket = newResourceBucket;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MacroPlannerSolverPackage.LP_AVAILABILITY_BUCKET__RESOURCE_BUCKET, oldResourceBucket, newResourceBucket);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResourceBucket(LPResourceBucket newResourceBucket) {
		if (newResourceBucket != resourceBucket) {
			NotificationChain msgs = null;
			if (resourceBucket != null)
				msgs = ((InternalEObject)resourceBucket).eInverseRemove(this, MacroPlannerSolverPackage.LP_RESOURCE_BUCKET__AVAILABILITIES, LPResourceBucket.class, msgs);
			if (newResourceBucket != null)
				msgs = ((InternalEObject)newResourceBucket).eInverseAdd(this, MacroPlannerSolverPackage.LP_RESOURCE_BUCKET__AVAILABILITIES, LPResourceBucket.class, msgs);
			msgs = basicSetResourceBucket(newResourceBucket, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MacroPlannerSolverPackage.LP_AVAILABILITY_BUCKET__RESOURCE_BUCKET, newResourceBucket, newResourceBucket));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MacroPlannerSolverPackage.LP_AVAILABILITY_BUCKET__RESERVED, oldReserved, newReserved);
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
				msgs = ((InternalEObject)reserved).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MacroPlannerSolverPackage.LP_AVAILABILITY_BUCKET__RESERVED, null, msgs);
			if (newReserved != null)
				msgs = ((InternalEObject)newReserved).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MacroPlannerSolverPackage.LP_AVAILABILITY_BUCKET__RESERVED, null, msgs);
			msgs = basicSetReserved(newReserved, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MacroPlannerSolverPackage.LP_AVAILABILITY_BUCKET__RESERVED, newReserved, newReserved));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratorLpVar getSlack() {
		return slack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSlack(GeneratorLpVar newSlack, NotificationChain msgs) {
		GeneratorLpVar oldSlack = slack;
		slack = newSlack;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MacroPlannerSolverPackage.LP_AVAILABILITY_BUCKET__SLACK, oldSlack, newSlack);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSlack(GeneratorLpVar newSlack) {
		if (newSlack != slack) {
			NotificationChain msgs = null;
			if (slack != null)
				msgs = ((InternalEObject)slack).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MacroPlannerSolverPackage.LP_AVAILABILITY_BUCKET__SLACK, null, msgs);
			if (newSlack != null)
				msgs = ((InternalEObject)newSlack).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MacroPlannerSolverPackage.LP_AVAILABILITY_BUCKET__SLACK, null, msgs);
			msgs = basicSetSlack(newSlack, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MacroPlannerSolverPackage.LP_AVAILABILITY_BUCKET__SLACK, newSlack, newSlack));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MacroPlannerSolverPackage.LP_AVAILABILITY_BUCKET__BALANCE, oldBalance, newBalance);
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
				msgs = ((InternalEObject)balance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MacroPlannerSolverPackage.LP_AVAILABILITY_BUCKET__BALANCE, null, msgs);
			if (newBalance != null)
				msgs = ((InternalEObject)newBalance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MacroPlannerSolverPackage.LP_AVAILABILITY_BUCKET__BALANCE, null, msgs);
			msgs = basicSetBalance(newBalance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MacroPlannerSolverPackage.LP_AVAILABILITY_BUCKET__BALANCE, newBalance, newBalance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MacroPlannerSolverPackage.LP_AVAILABILITY_BUCKET__AVAILABILITY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetAvailability((LPAvailability)otherEnd, msgs);
			case MacroPlannerSolverPackage.LP_AVAILABILITY_BUCKET__RESOURCE_BUCKET:
				if (resourceBucket != null)
					msgs = ((InternalEObject)resourceBucket).eInverseRemove(this, MacroPlannerSolverPackage.LP_RESOURCE_BUCKET__AVAILABILITIES, LPResourceBucket.class, msgs);
				return basicSetResourceBucket((LPResourceBucket)otherEnd, msgs);
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
			case MacroPlannerSolverPackage.LP_AVAILABILITY_BUCKET__AVAILABILITY:
				return basicSetAvailability(null, msgs);
			case MacroPlannerSolverPackage.LP_AVAILABILITY_BUCKET__RESOURCE_BUCKET:
				return basicSetResourceBucket(null, msgs);
			case MacroPlannerSolverPackage.LP_AVAILABILITY_BUCKET__RESERVED:
				return basicSetReserved(null, msgs);
			case MacroPlannerSolverPackage.LP_AVAILABILITY_BUCKET__SLACK:
				return basicSetSlack(null, msgs);
			case MacroPlannerSolverPackage.LP_AVAILABILITY_BUCKET__BALANCE:
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
			case MacroPlannerSolverPackage.LP_AVAILABILITY_BUCKET__AVAILABILITY:
				return eInternalContainer().eInverseRemove(this, MacroPlannerSolverPackage.LP_AVAILABILITY__LP_BUCKETS, LPAvailability.class, msgs);
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
			case MacroPlannerSolverPackage.LP_AVAILABILITY_BUCKET__AVAILABILITY:
				return getAvailability();
			case MacroPlannerSolverPackage.LP_AVAILABILITY_BUCKET__RESOURCE_BUCKET:
				if (resolve) return getResourceBucket();
				return basicGetResourceBucket();
			case MacroPlannerSolverPackage.LP_AVAILABILITY_BUCKET__RESERVED:
				return getReserved();
			case MacroPlannerSolverPackage.LP_AVAILABILITY_BUCKET__SLACK:
				return getSlack();
			case MacroPlannerSolverPackage.LP_AVAILABILITY_BUCKET__BALANCE:
				return getBalance();
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
			case MacroPlannerSolverPackage.LP_AVAILABILITY_BUCKET__AVAILABILITY:
				setAvailability((LPAvailability)newValue);
				return;
			case MacroPlannerSolverPackage.LP_AVAILABILITY_BUCKET__RESOURCE_BUCKET:
				setResourceBucket((LPResourceBucket)newValue);
				return;
			case MacroPlannerSolverPackage.LP_AVAILABILITY_BUCKET__RESERVED:
				setReserved((GeneratorLpVar)newValue);
				return;
			case MacroPlannerSolverPackage.LP_AVAILABILITY_BUCKET__SLACK:
				setSlack((GeneratorLpVar)newValue);
				return;
			case MacroPlannerSolverPackage.LP_AVAILABILITY_BUCKET__BALANCE:
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
			case MacroPlannerSolverPackage.LP_AVAILABILITY_BUCKET__AVAILABILITY:
				setAvailability((LPAvailability)null);
				return;
			case MacroPlannerSolverPackage.LP_AVAILABILITY_BUCKET__RESOURCE_BUCKET:
				setResourceBucket((LPResourceBucket)null);
				return;
			case MacroPlannerSolverPackage.LP_AVAILABILITY_BUCKET__RESERVED:
				setReserved((GeneratorLpVar)null);
				return;
			case MacroPlannerSolverPackage.LP_AVAILABILITY_BUCKET__SLACK:
				setSlack((GeneratorLpVar)null);
				return;
			case MacroPlannerSolverPackage.LP_AVAILABILITY_BUCKET__BALANCE:
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
			case MacroPlannerSolverPackage.LP_AVAILABILITY_BUCKET__AVAILABILITY:
				return getAvailability() != null;
			case MacroPlannerSolverPackage.LP_AVAILABILITY_BUCKET__RESOURCE_BUCKET:
				return resourceBucket != null;
			case MacroPlannerSolverPackage.LP_AVAILABILITY_BUCKET__RESERVED:
				return reserved != null;
			case MacroPlannerSolverPackage.LP_AVAILABILITY_BUCKET__SLACK:
				return slack != null;
			case MacroPlannerSolverPackage.LP_AVAILABILITY_BUCKET__BALANCE:
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
		
		LPAvailability availability = this.getAvailability();
		//TimeBucket bucket = this.getBucket();
		
		// logic name
		String name = String.format("%s,%s", availability.getName(), this.getBucketShortName());
		this.setName(name);
	}

	/**
	 * 
	 */
	@Override
	public void generateXReferences() {
		
		super.generateXReferences();
		
		LPAvailability availability = this.getAvailability();
		LPResource resource = availability.getResource();
		
		TimeBucket bucket = this.getBucket();
		ObjectTimeBucket resource_bucket = resource.getBucket(bucket);
		this.setResourceBucket((LPResourceBucket) resource_bucket);
	}
} //LPAvailabilityBucketImpl
