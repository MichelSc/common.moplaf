/**
 */
package com.misc.common.moplaf.datatools.impl;

import com.misc.common.moplaf.datatools.DatatoolsPackage;
import com.misc.common.moplaf.datatools.Match;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Match</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.datatools.impl.MatchImpl#getObject1 <em>Object1</em>}</li>
 *   <li>{@link com.misc.common.moplaf.datatools.impl.MatchImpl#getObject2 <em>Object2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MatchImpl extends MinimalEObjectImpl.Container implements Match {
	/**
	 * The cached value of the '{@link #getObject1() <em>Object1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObject1()
	 * @generated
	 * @ordered
	 */
	protected EObject object1;

	/**
	 * The cached value of the '{@link #getObject2() <em>Object2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObject2()
	 * @generated
	 * @ordered
	 */
	protected EObject object2;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MatchImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatatoolsPackage.Literals.MATCH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getObject1() {
		if (object1 != null && object1.eIsProxy()) {
			InternalEObject oldObject1 = (InternalEObject)object1;
			object1 = eResolveProxy(oldObject1);
			if (object1 != oldObject1) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DatatoolsPackage.MATCH__OBJECT1, oldObject1, object1));
			}
		}
		return object1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetObject1() {
		return object1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObject1(EObject newObject1) {
		EObject oldObject1 = object1;
		object1 = newObject1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatoolsPackage.MATCH__OBJECT1, oldObject1, object1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getObject2() {
		if (object2 != null && object2.eIsProxy()) {
			InternalEObject oldObject2 = (InternalEObject)object2;
			object2 = eResolveProxy(oldObject2);
			if (object2 != oldObject2) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DatatoolsPackage.MATCH__OBJECT2, oldObject2, object2));
			}
		}
		return object2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetObject2() {
		return object2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObject2(EObject newObject2) {
		EObject oldObject2 = object2;
		object2 = newObject2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatoolsPackage.MATCH__OBJECT2, oldObject2, object2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DatatoolsPackage.MATCH__OBJECT1:
				if (resolve) return getObject1();
				return basicGetObject1();
			case DatatoolsPackage.MATCH__OBJECT2:
				if (resolve) return getObject2();
				return basicGetObject2();
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
			case DatatoolsPackage.MATCH__OBJECT1:
				setObject1((EObject)newValue);
				return;
			case DatatoolsPackage.MATCH__OBJECT2:
				setObject2((EObject)newValue);
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
			case DatatoolsPackage.MATCH__OBJECT1:
				setObject1((EObject)null);
				return;
			case DatatoolsPackage.MATCH__OBJECT2:
				setObject2((EObject)null);
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
			case DatatoolsPackage.MATCH__OBJECT1:
				return object1 != null;
			case DatatoolsPackage.MATCH__OBJECT2:
				return object2 != null;
		}
		return super.eIsSet(featureID);
	}

} //MatchImpl
