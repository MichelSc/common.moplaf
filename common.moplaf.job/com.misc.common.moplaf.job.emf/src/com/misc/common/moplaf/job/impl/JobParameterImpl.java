/*******************************************************************************
 * Copyright (c) 2017, 2018 Michel Schaffers and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Michel Schaffers - initial API and implementation
 *******************************************************************************/
/**
 */
package com.misc.common.moplaf.job.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import com.misc.common.moplaf.job.JobPackage;
import com.misc.common.moplaf.job.JobParameter;
import com.misc.common.moplaf.job.JobParameterType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Job Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.job.impl.JobParameterImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.impl.JobParameterImpl#getType <em>Type</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.impl.JobParameterImpl#getJobAttribute <em>Job Attribute</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.impl.JobParameterImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JobParameterImpl extends MinimalEObjectImpl.Container implements JobParameter {
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
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final JobParameterType TYPE_EDEFAULT = JobParameterType.JOB_PARAMETER_TYPE_INT;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected JobParameterType type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getJobAttribute() <em>Job Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobAttribute()
	 * @generated
	 * @ordered
	 */
	protected EAttribute jobAttribute;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JobParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JobPackage.Literals.JOB_PARAMETER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, JobPackage.JOB_PARAMETER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JobParameterType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(JobParameterType newType) {
		JobParameterType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JobPackage.JOB_PARAMETER__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJobAttribute() {
		if (jobAttribute != null && jobAttribute.eIsProxy()) {
			InternalEObject oldJobAttribute = (InternalEObject)jobAttribute;
			jobAttribute = (EAttribute)eResolveProxy(oldJobAttribute);
			if (jobAttribute != oldJobAttribute) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JobPackage.JOB_PARAMETER__JOB_ATTRIBUTE, oldJobAttribute, jobAttribute));
			}
		}
		return jobAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute basicGetJobAttribute() {
		return jobAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJobAttribute(EAttribute newJobAttribute) {
		EAttribute oldJobAttribute = jobAttribute;
		jobAttribute = newJobAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JobPackage.JOB_PARAMETER__JOB_ATTRIBUTE, oldJobAttribute, jobAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JobPackage.JOB_PARAMETER__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JobPackage.JOB_PARAMETER__NAME:
				return getName();
			case JobPackage.JOB_PARAMETER__TYPE:
				return getType();
			case JobPackage.JOB_PARAMETER__JOB_ATTRIBUTE:
				if (resolve) return getJobAttribute();
				return basicGetJobAttribute();
			case JobPackage.JOB_PARAMETER__DESCRIPTION:
				return getDescription();
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
			case JobPackage.JOB_PARAMETER__NAME:
				setName((String)newValue);
				return;
			case JobPackage.JOB_PARAMETER__TYPE:
				setType((JobParameterType)newValue);
				return;
			case JobPackage.JOB_PARAMETER__JOB_ATTRIBUTE:
				setJobAttribute((EAttribute)newValue);
				return;
			case JobPackage.JOB_PARAMETER__DESCRIPTION:
				setDescription((String)newValue);
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
			case JobPackage.JOB_PARAMETER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case JobPackage.JOB_PARAMETER__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case JobPackage.JOB_PARAMETER__JOB_ATTRIBUTE:
				setJobAttribute((EAttribute)null);
				return;
			case JobPackage.JOB_PARAMETER__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
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
			case JobPackage.JOB_PARAMETER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case JobPackage.JOB_PARAMETER__TYPE:
				return type != TYPE_EDEFAULT;
			case JobPackage.JOB_PARAMETER__JOB_ATTRIBUTE:
				return jobAttribute != null;
			case JobPackage.JOB_PARAMETER__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (Name: ");
		result.append(name);
		result.append(", Type: ");
		result.append(type);
		result.append(", Description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //JobParameterImpl
