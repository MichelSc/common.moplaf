/**
 */
package com.misc.common.moplaf.gis.impl;

import com.misc.common.moplaf.gis.GisLocation;
import com.misc.common.moplaf.gis.GisPackage;
import com.misc.common.moplaf.gis.GisRouteCalculator;
import com.misc.common.moplaf.gis.GisRoutesHolder;
import com.misc.common.moplaf.gis.GisRoutesHolderFromLocation;
import com.misc.common.moplaf.gis.GisRoutesHolderToLocation;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Routes Holder</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.gis.impl.GisRoutesHolderImpl#getFromLocations <em>From Locations</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.impl.GisRoutesHolderImpl#getToLocations <em>To Locations</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.impl.GisRoutesHolderImpl#getSymmetrical <em>Symmetrical</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GisRoutesHolderImpl extends GisRouterImpl implements GisRoutesHolder {
	/**
	 * The cached value of the '{@link #getFromLocations() <em>From Locations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromLocations()
	 * @generated
	 * @ordered
	 */
	protected EList<GisRoutesHolderFromLocation> fromLocations;

	/**
	 * The cached value of the '{@link #getToLocations() <em>To Locations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToLocations()
	 * @generated
	 * @ordered
	 */
	protected EList<GisRoutesHolderToLocation> toLocations;

	/**
	 * The default value of the '{@link #getSymmetrical() <em>Symmetrical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymmetrical()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean SYMMETRICAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSymmetrical() <em>Symmetrical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymmetrical()
	 * @generated
	 * @ordered
	 */
	protected Boolean symmetrical = SYMMETRICAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GisRoutesHolderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GisPackage.Literals.GIS_ROUTES_HOLDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GisRoutesHolderFromLocation> getFromLocations() {
		if (fromLocations == null) {
			fromLocations = new EObjectContainmentEList<GisRoutesHolderFromLocation>(GisRoutesHolderFromLocation.class, this, GisPackage.GIS_ROUTES_HOLDER__FROM_LOCATIONS);
		}
		return fromLocations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GisRoutesHolderToLocation> getToLocations() {
		if (toLocations == null) {
			toLocations = new EObjectContainmentEList<GisRoutesHolderToLocation>(GisRoutesHolderToLocation.class, this, GisPackage.GIS_ROUTES_HOLDER__TO_LOCATIONS);
		}
		return toLocations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getSymmetrical() {
		return symmetrical;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSymmetrical(Boolean newSymmetrical) {
		Boolean oldSymmetrical = symmetrical;
		symmetrical = newSymmetrical;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GisPackage.GIS_ROUTES_HOLDER__SYMMETRICAL, oldSymmetrical, symmetrical));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void update(GisRouteCalculator calculator) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void update(GisRouteCalculator calculator, EList<GisLocation> froms, EList<GisLocation> tos) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GisRoutesHolderFromLocation addFromLocation(GisLocation location) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GisRoutesHolderToLocation addToLocation(GisLocation location) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GisRoutesHolderFromLocation getFromLocation(GisLocation location) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GisRoutesHolderToLocation getToLocation(GisLocation location) {
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GisPackage.GIS_ROUTES_HOLDER__FROM_LOCATIONS:
				return ((InternalEList<?>)getFromLocations()).basicRemove(otherEnd, msgs);
			case GisPackage.GIS_ROUTES_HOLDER__TO_LOCATIONS:
				return ((InternalEList<?>)getToLocations()).basicRemove(otherEnd, msgs);
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
			case GisPackage.GIS_ROUTES_HOLDER__FROM_LOCATIONS:
				return getFromLocations();
			case GisPackage.GIS_ROUTES_HOLDER__TO_LOCATIONS:
				return getToLocations();
			case GisPackage.GIS_ROUTES_HOLDER__SYMMETRICAL:
				return getSymmetrical();
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
			case GisPackage.GIS_ROUTES_HOLDER__FROM_LOCATIONS:
				getFromLocations().clear();
				getFromLocations().addAll((Collection<? extends GisRoutesHolderFromLocation>)newValue);
				return;
			case GisPackage.GIS_ROUTES_HOLDER__TO_LOCATIONS:
				getToLocations().clear();
				getToLocations().addAll((Collection<? extends GisRoutesHolderToLocation>)newValue);
				return;
			case GisPackage.GIS_ROUTES_HOLDER__SYMMETRICAL:
				setSymmetrical((Boolean)newValue);
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
			case GisPackage.GIS_ROUTES_HOLDER__FROM_LOCATIONS:
				getFromLocations().clear();
				return;
			case GisPackage.GIS_ROUTES_HOLDER__TO_LOCATIONS:
				getToLocations().clear();
				return;
			case GisPackage.GIS_ROUTES_HOLDER__SYMMETRICAL:
				setSymmetrical(SYMMETRICAL_EDEFAULT);
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
			case GisPackage.GIS_ROUTES_HOLDER__FROM_LOCATIONS:
				return fromLocations != null && !fromLocations.isEmpty();
			case GisPackage.GIS_ROUTES_HOLDER__TO_LOCATIONS:
				return toLocations != null && !toLocations.isEmpty();
			case GisPackage.GIS_ROUTES_HOLDER__SYMMETRICAL:
				return SYMMETRICAL_EDEFAULT == null ? symmetrical != null : !SYMMETRICAL_EDEFAULT.equals(symmetrical);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case GisPackage.GIS_ROUTES_HOLDER___UPDATE__GISROUTECALCULATOR:
				update((GisRouteCalculator)arguments.get(0));
				return null;
			case GisPackage.GIS_ROUTES_HOLDER___UPDATE__GISROUTECALCULATOR_ELIST_ELIST:
				update((GisRouteCalculator)arguments.get(0), (EList<GisLocation>)arguments.get(1), (EList<GisLocation>)arguments.get(2));
				return null;
			case GisPackage.GIS_ROUTES_HOLDER___ADD_FROM_LOCATION__GISLOCATION:
				return addFromLocation((GisLocation)arguments.get(0));
			case GisPackage.GIS_ROUTES_HOLDER___ADD_TO_LOCATION__GISLOCATION:
				return addToLocation((GisLocation)arguments.get(0));
			case GisPackage.GIS_ROUTES_HOLDER___GET_FROM_LOCATION__GISLOCATION:
				return getFromLocation((GisLocation)arguments.get(0));
			case GisPackage.GIS_ROUTES_HOLDER___GET_TO_LOCATION__GISLOCATION:
				return getToLocation((GisLocation)arguments.get(0));
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
		result.append(" (Symmetrical: ");
		result.append(symmetrical);
		result.append(')');
		return result.toString();
	}

} //GisRoutesHolderImpl
