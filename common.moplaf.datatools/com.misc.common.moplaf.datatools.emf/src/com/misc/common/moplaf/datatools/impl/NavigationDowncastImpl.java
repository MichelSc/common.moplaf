/**
 */
package com.misc.common.moplaf.datatools.impl;

import com.misc.common.moplaf.datatools.DatatoolsPackage;
import com.misc.common.moplaf.datatools.NavigationDowncast;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Navigation Downcast</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.datatools.impl.NavigationDowncastImpl#getDowncastType <em>Downcast Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NavigationDowncastImpl extends NavigationAxisImpl implements NavigationDowncast {
	/**
	 * The cached value of the '{@link #getDowncastType() <em>Downcast Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDowncastType()
	 * @generated
	 * @ordered
	 */
	protected EClass downcastType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NavigationDowncastImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatatoolsPackage.Literals.NAVIGATION_DOWNCAST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDowncastType() {
		if (downcastType != null && downcastType.eIsProxy()) {
			InternalEObject oldDowncastType = (InternalEObject)downcastType;
			downcastType = (EClass)eResolveProxy(oldDowncastType);
			if (downcastType != oldDowncastType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DatatoolsPackage.NAVIGATION_DOWNCAST__DOWNCAST_TYPE, oldDowncastType, downcastType));
			}
		}
		return downcastType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass basicGetDowncastType() {
		return downcastType;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public EClass basicGetTargetType() {
		return this.getDowncastType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public String getPathElement() {
		return this.getDowncastType()==null ? "null" : this.getDowncastType().getName();
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDowncastType(EClass newDowncastType) {
		EClass oldDowncastType = downcastType;
		downcastType = newDowncastType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatoolsPackage.NAVIGATION_DOWNCAST__DOWNCAST_TYPE, oldDowncastType, downcastType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DatatoolsPackage.NAVIGATION_DOWNCAST__DOWNCAST_TYPE:
				if (resolve) return getDowncastType();
				return basicGetDowncastType();
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
			case DatatoolsPackage.NAVIGATION_DOWNCAST__DOWNCAST_TYPE:
				setDowncastType((EClass)newValue);
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
			case DatatoolsPackage.NAVIGATION_DOWNCAST__DOWNCAST_TYPE:
				setDowncastType((EClass)null);
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
			case DatatoolsPackage.NAVIGATION_DOWNCAST__DOWNCAST_TYPE:
				return downcastType != null;
		}
		return super.eIsSet(featureID);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public EObject navigate(EObject in) {
		EClass type = this.getDowncastType();
		if ( type == null ) {
			return null;
		}
		if ( !type.isInstance(in) ) {
			return null;
		}
		return in;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public EList<EObject> navigateMany(EObject in) {
		EObject out = this.navigate(in);
		if( out==null) {
			return null;
		}
		BasicEList<EObject> list = new BasicEList<EObject>();
		list.add(out);
		return list;
	}


} //NavigationDowncastImpl
