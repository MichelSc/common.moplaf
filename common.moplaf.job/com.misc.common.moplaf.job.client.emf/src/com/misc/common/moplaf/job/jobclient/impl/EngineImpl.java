/**
 */
package com.misc.common.moplaf.job.jobclient.impl;

import com.misc.common.moplaf.job.jobclient.Engine;
import com.misc.common.moplaf.job.jobclient.JobScheduled;
import com.misc.common.moplaf.job.jobclient.JobclientPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Engine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.impl.EngineImpl#getJobschedueled <em>Jobschedueled</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobclient.impl.EngineImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EngineImpl extends MinimalEObjectImpl.Container implements Engine {
	/**
	 * The cached value of the '{@link #getJobschedueled() <em>Jobschedueled</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobschedueled()
	 * @generated
	 * @ordered
	 */
	protected JobScheduled jobschedueled;

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
	protected EngineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JobclientPackage.Literals.ENGINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JobScheduled getJobschedueled() {
		if (jobschedueled != null && jobschedueled.eIsProxy()) {
			InternalEObject oldJobschedueled = (InternalEObject)jobschedueled;
			jobschedueled = (JobScheduled)eResolveProxy(oldJobschedueled);
			if (jobschedueled != oldJobschedueled) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JobclientPackage.ENGINE__JOBSCHEDUELED, oldJobschedueled, jobschedueled));
			}
		}
		return jobschedueled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JobScheduled basicGetJobschedueled() {
		return jobschedueled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJobschedueled(JobScheduled newJobschedueled, NotificationChain msgs) {
		JobScheduled oldJobschedueled = jobschedueled;
		jobschedueled = newJobschedueled;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JobclientPackage.ENGINE__JOBSCHEDUELED, oldJobschedueled, newJobschedueled);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJobschedueled(JobScheduled newJobschedueled) {
		if (newJobschedueled != jobschedueled) {
			NotificationChain msgs = null;
			if (jobschedueled != null)
				msgs = ((InternalEObject)jobschedueled).eInverseRemove(this, JobclientPackage.JOB_SCHEDULED__SCHEDULED_ON, JobScheduled.class, msgs);
			if (newJobschedueled != null)
				msgs = ((InternalEObject)newJobschedueled).eInverseAdd(this, JobclientPackage.JOB_SCHEDULED__SCHEDULED_ON, JobScheduled.class, msgs);
			msgs = basicSetJobschedueled(newJobschedueled, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JobclientPackage.ENGINE__JOBSCHEDUELED, newJobschedueled, newJobschedueled));
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
			eNotify(new ENotificationImpl(this, Notification.SET, JobclientPackage.ENGINE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JobclientPackage.ENGINE__JOBSCHEDUELED:
				if (jobschedueled != null)
					msgs = ((InternalEObject)jobschedueled).eInverseRemove(this, JobclientPackage.JOB_SCHEDULED__SCHEDULED_ON, JobScheduled.class, msgs);
				return basicSetJobschedueled((JobScheduled)otherEnd, msgs);
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
			case JobclientPackage.ENGINE__JOBSCHEDUELED:
				return basicSetJobschedueled(null, msgs);
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
			case JobclientPackage.ENGINE__JOBSCHEDUELED:
				if (resolve) return getJobschedueled();
				return basicGetJobschedueled();
			case JobclientPackage.ENGINE__NAME:
				return getName();
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
			case JobclientPackage.ENGINE__JOBSCHEDUELED:
				setJobschedueled((JobScheduled)newValue);
				return;
			case JobclientPackage.ENGINE__NAME:
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
			case JobclientPackage.ENGINE__JOBSCHEDUELED:
				setJobschedueled((JobScheduled)null);
				return;
			case JobclientPackage.ENGINE__NAME:
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
			case JobclientPackage.ENGINE__JOBSCHEDUELED:
				return jobschedueled != null;
			case JobclientPackage.ENGINE__NAME:
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

} //EngineImpl
