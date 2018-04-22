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

import com.misc.common.moplaf.job.JobFactory;
import com.misc.common.moplaf.job.JobPackage;
import com.misc.common.moplaf.job.Plugin;
import com.misc.common.moplaf.job.Setter;
import com.misc.common.moplaf.job.SetterAttributeFloat;
import com.misc.common.moplaf.job.SetterAttributeInt;
import com.misc.common.moplaf.job.SetterStructuralFeature;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Setter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.job.impl.SetterImpl#getFeatures <em>Features</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.impl.SetterImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.impl.SetterImpl#getRemarks <em>Remarks</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.impl.SetterImpl#getTargetClass <em>Target Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SetterImpl extends MinimalEObjectImpl.Container implements Setter {
	/**
	 * The cached value of the '{@link #getFeatures() <em>Features</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<SetterStructuralFeature> features;

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
	 * The default value of the '{@link #getRemarks() <em>Remarks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemarks()
	 * @generated
	 * @ordered
	 */
	protected static final String REMARKS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRemarks() <em>Remarks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemarks()
	 * @generated
	 * @ordered
	 */
	protected String remarks = REMARKS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTargetClass() <em>Target Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetClass()
	 * @generated
	 * @ordered
	 */
	protected EClass targetClass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SetterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JobPackage.Literals.SETTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SetterStructuralFeature> getFeatures() {
		if (features == null) {
			features = new EObjectContainmentWithInverseEList<SetterStructuralFeature>(SetterStructuralFeature.class, this, JobPackage.SETTER__FEATURES, JobPackage.SETTER_STRUCTURAL_FEATURE__SETTER);
		}
		return features;
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
			eNotify(new ENotificationImpl(this, Notification.SET, JobPackage.SETTER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRemarks() {
		return remarks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemarks(String newRemarks) {
		String oldRemarks = remarks;
		remarks = newRemarks;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JobPackage.SETTER__REMARKS, oldRemarks, remarks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTargetClass() {
		if (targetClass != null && targetClass.eIsProxy()) {
			InternalEObject oldTargetClass = (InternalEObject)targetClass;
			targetClass = (EClass)eResolveProxy(oldTargetClass);
			if (targetClass != oldTargetClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JobPackage.SETTER__TARGET_CLASS, oldTargetClass, targetClass));
			}
		}
		return targetClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass basicGetTargetClass() {
		return targetClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetClass(EClass newTargetClass) {
		EClass oldTargetClass = targetClass;
		targetClass = newTargetClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JobPackage.SETTER__TARGET_CLASS, oldTargetClass, targetClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void accept(EObject objectToSetFeatures) {
		if ( objectToSetFeatures==null ){
			Plugin.INSTANCE.logError("Setter.accept: no object received");
			return;
		}
		
		if ( this.getTargetClass()==null){
			Plugin.INSTANCE.logError("Setter.accept: no target class");
			return;
		}
		
		if ( !this.getTargetClass().isSuperTypeOf(objectToSetFeatures.eClass())){
			Plugin.INSTANCE.logError(String.format("Setter.accept: %s is not a super type of %s",
					this.getTargetClass().getName(),
					objectToSetFeatures.eClass().getName()));
			return;
		}
		
		for ( SetterStructuralFeature feature : this.getFeatures()){
			feature.accept(objectToSetFeatures);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void init(EObject objectToGetFeatures) {
		if ( objectToGetFeatures==null ){
			Plugin.INSTANCE.logError("Setter.init: no object received");
			return;
		}
		
		// flush the existing features
		this.getFeatures().clear();
		
		// fill with new features
		EClass targetClass = objectToGetFeatures.eClass();
		this.setTargetClass(targetClass);
		for ( EStructuralFeature feature : targetClass.getEAllStructuralFeatures()){
			if ( !feature.isDerived() && feature.isChangeable()){
				if ( feature instanceof EAttribute){
					EAttribute attribute = (EAttribute) feature;
					EDataType data_type = attribute.getEAttributeType();
					if ( data_type == EcorePackage.Literals.EINT){
						SetterAttributeInt new_int_feature = JobFactory.eINSTANCE.createSetterAttributeInt();
						new_int_feature.setAttributeToSet(attribute);
						new_int_feature.setValue((Integer)objectToGetFeatures.eGet(attribute));
						this.getFeatures().add(new_int_feature);
					} else if ( data_type == EcorePackage.Literals.EFLOAT){
						SetterAttributeFloat new_float_feature = JobFactory.eINSTANCE.createSetterAttributeFloat();
						new_float_feature.setAttributeToSet(attribute);
						new_float_feature.setValue((Float)objectToGetFeatures.eGet(attribute));
						this.getFeatures().add(new_float_feature);
					}
				}
			}
		}
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
			case JobPackage.SETTER__FEATURES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFeatures()).basicAdd(otherEnd, msgs);
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
			case JobPackage.SETTER__FEATURES:
				return ((InternalEList<?>)getFeatures()).basicRemove(otherEnd, msgs);
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
			case JobPackage.SETTER__FEATURES:
				return getFeatures();
			case JobPackage.SETTER__NAME:
				return getName();
			case JobPackage.SETTER__REMARKS:
				return getRemarks();
			case JobPackage.SETTER__TARGET_CLASS:
				if (resolve) return getTargetClass();
				return basicGetTargetClass();
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
			case JobPackage.SETTER__FEATURES:
				getFeatures().clear();
				getFeatures().addAll((Collection<? extends SetterStructuralFeature>)newValue);
				return;
			case JobPackage.SETTER__NAME:
				setName((String)newValue);
				return;
			case JobPackage.SETTER__REMARKS:
				setRemarks((String)newValue);
				return;
			case JobPackage.SETTER__TARGET_CLASS:
				setTargetClass((EClass)newValue);
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
			case JobPackage.SETTER__FEATURES:
				getFeatures().clear();
				return;
			case JobPackage.SETTER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case JobPackage.SETTER__REMARKS:
				setRemarks(REMARKS_EDEFAULT);
				return;
			case JobPackage.SETTER__TARGET_CLASS:
				setTargetClass((EClass)null);
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
			case JobPackage.SETTER__FEATURES:
				return features != null && !features.isEmpty();
			case JobPackage.SETTER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case JobPackage.SETTER__REMARKS:
				return REMARKS_EDEFAULT == null ? remarks != null : !REMARKS_EDEFAULT.equals(remarks);
			case JobPackage.SETTER__TARGET_CLASS:
				return targetClass != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case JobPackage.SETTER___ACCEPT__EOBJECT:
				accept((EObject)arguments.get(0));
				return null;
			case JobPackage.SETTER___INIT__EOBJECT:
				init((EObject)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(", Remarks: ");
		result.append(remarks);
		result.append(')');
		return result.toString();
	}

} //SetterImpl
