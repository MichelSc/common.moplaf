/**
 */
package com.misc.common.moplaf.job.impl;

import com.misc.common.moplaf.job.JobPackage;
import com.misc.common.moplaf.job.Setter;
import com.misc.common.moplaf.job.SetterStructuralFeature;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Setter Structural Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.job.impl.SetterStructuralFeatureImpl#getSetter <em>Setter</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.impl.SetterStructuralFeatureImpl#getFeatureToSet <em>Feature To Set</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.impl.SetterStructuralFeatureImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SetterStructuralFeatureImpl extends MinimalEObjectImpl.Container implements SetterStructuralFeature {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SetterStructuralFeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JobPackage.Literals.SETTER_STRUCTURAL_FEATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Setter getSetter() {
		if (eContainerFeatureID() != JobPackage.SETTER_STRUCTURAL_FEATURE__SETTER) return null;
		return (Setter)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSetter(Setter newSetter, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSetter, JobPackage.SETTER_STRUCTURAL_FEATURE__SETTER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSetter(Setter newSetter) {
		if (newSetter != eInternalContainer() || (eContainerFeatureID() != JobPackage.SETTER_STRUCTURAL_FEATURE__SETTER && newSetter != null)) {
			if (EcoreUtil.isAncestor(this, newSetter))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSetter != null)
				msgs = ((InternalEObject)newSetter).eInverseAdd(this, JobPackage.SETTER__FEATURES, Setter.class, msgs);
			msgs = basicSetSetter(newSetter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JobPackage.SETTER_STRUCTURAL_FEATURE__SETTER, newSetter, newSetter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EStructuralFeature getFeatureToSet() {
		EStructuralFeature featureToSet = basicGetFeatureToSet();
		return featureToSet != null && featureToSet.eIsProxy() ? (EStructuralFeature)eResolveProxy((InternalEObject)featureToSet) : featureToSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EStructuralFeature basicGetFeatureToSet() {
		// TODO: implement this method to return the 'Feature To Set' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		// TODO: implement this method to return the 'Description' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void accept(EObject objectToSetFeatures) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JobPackage.SETTER_STRUCTURAL_FEATURE__SETTER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSetter((Setter)otherEnd, msgs);
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
			case JobPackage.SETTER_STRUCTURAL_FEATURE__SETTER:
				return basicSetSetter(null, msgs);
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
			case JobPackage.SETTER_STRUCTURAL_FEATURE__SETTER:
				return eInternalContainer().eInverseRemove(this, JobPackage.SETTER__FEATURES, Setter.class, msgs);
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
			case JobPackage.SETTER_STRUCTURAL_FEATURE__SETTER:
				return getSetter();
			case JobPackage.SETTER_STRUCTURAL_FEATURE__FEATURE_TO_SET:
				if (resolve) return getFeatureToSet();
				return basicGetFeatureToSet();
			case JobPackage.SETTER_STRUCTURAL_FEATURE__DESCRIPTION:
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
			case JobPackage.SETTER_STRUCTURAL_FEATURE__SETTER:
				setSetter((Setter)newValue);
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
			case JobPackage.SETTER_STRUCTURAL_FEATURE__SETTER:
				setSetter((Setter)null);
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
			case JobPackage.SETTER_STRUCTURAL_FEATURE__SETTER:
				return getSetter() != null;
			case JobPackage.SETTER_STRUCTURAL_FEATURE__FEATURE_TO_SET:
				return basicGetFeatureToSet() != null;
			case JobPackage.SETTER_STRUCTURAL_FEATURE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? getDescription() != null : !DESCRIPTION_EDEFAULT.equals(getDescription());
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
			case JobPackage.SETTER_STRUCTURAL_FEATURE___ACCEPT__EOBJECT:
				accept((EObject)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //SetterStructuralFeatureImpl
