/**
 */
package com.misc.common.moplaf.job.impl;

import com.misc.common.moplaf.job.DomainTask;
import com.misc.common.moplaf.job.JobPackage;
import com.misc.common.moplaf.job.Plugin;
import com.misc.common.moplaf.job.TaskDomain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.job.impl.DomainTaskImpl#getDomain <em>Domain</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class DomainTaskImpl extends TaskImpl implements DomainTask {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainTaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JobPackage.Literals.DOMAIN_TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskDomain getDomain() {
		TaskDomain domain = basicGetDomain();
		return domain != null && domain.eIsProxy() ? (TaskDomain)eResolveProxy((InternalEObject)domain) : domain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public TaskDomain basicGetDomain() {
		InternalEObject container = this.eContainer;
		if ( container instanceof TaskDomain ) {
			return (TaskDomain)container;
		}
		Plugin.INSTANCE.logError(String.format("The owner of a DomainTask should be a TaskDomain, and not a %s", container.getClass().getName()));
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JobPackage.DOMAIN_TASK__DOMAIN:
				if (resolve) return getDomain();
				return basicGetDomain();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case JobPackage.DOMAIN_TASK__DOMAIN:
				return basicGetDomain() != null;
		}
		return super.eIsSet(featureID);
	}

} //DomainTaskImpl
