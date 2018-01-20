/**
 */
package com.misc.common.moplaf.gis.impl;

import com.misc.common.moplaf.gis.GisPackage;
import com.misc.common.moplaf.gis.GisRouter;
import com.misc.common.moplaf.gis.GisRouterDefaulted;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Router Defaulted</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.gis.impl.GisRouterDefaultedImpl#getPrimaryRouter <em>Primary Router</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.impl.GisRouterDefaultedImpl#getSecondaryRouter <em>Secondary Router</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GisRouterDefaultedImpl extends GisRouterImpl implements GisRouterDefaulted {
	/**
	 * The cached value of the '{@link #getPrimaryRouter() <em>Primary Router</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaryRouter()
	 * @generated
	 * @ordered
	 */
	protected GisRouter primaryRouter;

	/**
	 * The cached value of the '{@link #getSecondaryRouter() <em>Secondary Router</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondaryRouter()
	 * @generated
	 * @ordered
	 */
	protected GisRouter secondaryRouter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GisRouterDefaultedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GisPackage.Literals.GIS_ROUTER_DEFAULTED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GisRouter getPrimaryRouter() {
		if (primaryRouter != null && primaryRouter.eIsProxy()) {
			InternalEObject oldPrimaryRouter = (InternalEObject)primaryRouter;
			primaryRouter = (GisRouter)eResolveProxy(oldPrimaryRouter);
			if (primaryRouter != oldPrimaryRouter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GisPackage.GIS_ROUTER_DEFAULTED__PRIMARY_ROUTER, oldPrimaryRouter, primaryRouter));
			}
		}
		return primaryRouter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GisRouter basicGetPrimaryRouter() {
		return primaryRouter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrimaryRouter(GisRouter newPrimaryRouter) {
		GisRouter oldPrimaryRouter = primaryRouter;
		primaryRouter = newPrimaryRouter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GisPackage.GIS_ROUTER_DEFAULTED__PRIMARY_ROUTER, oldPrimaryRouter, primaryRouter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GisRouter getSecondaryRouter() {
		if (secondaryRouter != null && secondaryRouter.eIsProxy()) {
			InternalEObject oldSecondaryRouter = (InternalEObject)secondaryRouter;
			secondaryRouter = (GisRouter)eResolveProxy(oldSecondaryRouter);
			if (secondaryRouter != oldSecondaryRouter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GisPackage.GIS_ROUTER_DEFAULTED__SECONDARY_ROUTER, oldSecondaryRouter, secondaryRouter));
			}
		}
		return secondaryRouter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GisRouter basicGetSecondaryRouter() {
		return secondaryRouter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecondaryRouter(GisRouter newSecondaryRouter) {
		GisRouter oldSecondaryRouter = secondaryRouter;
		secondaryRouter = newSecondaryRouter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GisPackage.GIS_ROUTER_DEFAULTED__SECONDARY_ROUTER, oldSecondaryRouter, secondaryRouter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GisPackage.GIS_ROUTER_DEFAULTED__PRIMARY_ROUTER:
				if (resolve) return getPrimaryRouter();
				return basicGetPrimaryRouter();
			case GisPackage.GIS_ROUTER_DEFAULTED__SECONDARY_ROUTER:
				if (resolve) return getSecondaryRouter();
				return basicGetSecondaryRouter();
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
			case GisPackage.GIS_ROUTER_DEFAULTED__PRIMARY_ROUTER:
				setPrimaryRouter((GisRouter)newValue);
				return;
			case GisPackage.GIS_ROUTER_DEFAULTED__SECONDARY_ROUTER:
				setSecondaryRouter((GisRouter)newValue);
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
			case GisPackage.GIS_ROUTER_DEFAULTED__PRIMARY_ROUTER:
				setPrimaryRouter((GisRouter)null);
				return;
			case GisPackage.GIS_ROUTER_DEFAULTED__SECONDARY_ROUTER:
				setSecondaryRouter((GisRouter)null);
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
			case GisPackage.GIS_ROUTER_DEFAULTED__PRIMARY_ROUTER:
				return primaryRouter != null;
			case GisPackage.GIS_ROUTER_DEFAULTED__SECONDARY_ROUTER:
				return secondaryRouter != null;
		}
		return super.eIsSet(featureID);
	}

} //GisRouterDefaultedImpl
