/**
 */
package com.misc.common.moplaf.gis.kml.impl;

import com.misc.common.moplaf.gis.kml.Geometry;
import com.misc.common.moplaf.gis.kml.KmlPackage;

import com.misc.common.moplaf.gis.kml.Placemark;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Geometry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.gis.kml.impl.GeometryImpl#getPlacemark <em>Placemark</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class GeometryImpl extends MinimalEObjectImpl.Container implements Geometry {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeometryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KmlPackage.Literals.GEOMETRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Placemark getPlacemark() {
		if (eContainerFeatureID() != KmlPackage.GEOMETRY__PLACEMARK) return null;
		return (Placemark)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlacemark(Placemark newPlacemark, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPlacemark, KmlPackage.GEOMETRY__PLACEMARK, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlacemark(Placemark newPlacemark) {
		if (newPlacemark != eInternalContainer() || (eContainerFeatureID() != KmlPackage.GEOMETRY__PLACEMARK && newPlacemark != null)) {
			if (EcoreUtil.isAncestor(this, newPlacemark))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPlacemark != null)
				msgs = ((InternalEObject)newPlacemark).eInverseAdd(this, KmlPackage.PLACEMARK__GEOMETRY, Placemark.class, msgs);
			msgs = basicSetPlacemark(newPlacemark, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmlPackage.GEOMETRY__PLACEMARK, newPlacemark, newPlacemark));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KmlPackage.GEOMETRY__PLACEMARK:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetPlacemark((Placemark)otherEnd, msgs);
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
			case KmlPackage.GEOMETRY__PLACEMARK:
				return basicSetPlacemark(null, msgs);
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
			case KmlPackage.GEOMETRY__PLACEMARK:
				return eInternalContainer().eInverseRemove(this, KmlPackage.PLACEMARK__GEOMETRY, Placemark.class, msgs);
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
			case KmlPackage.GEOMETRY__PLACEMARK:
				return getPlacemark();
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
			case KmlPackage.GEOMETRY__PLACEMARK:
				setPlacemark((Placemark)newValue);
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
			case KmlPackage.GEOMETRY__PLACEMARK:
				setPlacemark((Placemark)null);
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
			case KmlPackage.GEOMETRY__PLACEMARK:
				return getPlacemark() != null;
		}
		return super.eIsSet(featureID);
	}

} //GeometryImpl
