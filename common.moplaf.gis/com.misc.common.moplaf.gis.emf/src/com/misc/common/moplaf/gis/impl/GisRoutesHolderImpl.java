/**
 */
package com.misc.common.moplaf.gis.impl;

import com.misc.common.moplaf.common.EnabledFeedback;
import com.misc.common.moplaf.gis.GisFactory;
import com.misc.common.moplaf.gis.GisLocation;
import com.misc.common.moplaf.gis.GisPackage;
import com.misc.common.moplaf.gis.GisRouteCalculator;
import com.misc.common.moplaf.gis.GisRouter;
import com.misc.common.moplaf.gis.GisRoutesHolder;
import com.misc.common.moplaf.gis.GisRoutesHolderFromLocation;
import com.misc.common.moplaf.gis.GisRoutesHolderToLocation;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.HashMap;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
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
 *   <li>{@link com.misc.common.moplaf.gis.impl.GisRoutesHolderImpl#getCalculator <em>Calculator</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.impl.GisRoutesHolderImpl#getRefreshFeedback <em>Refresh Feedback</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GisRoutesHolderImpl extends GisRouterImpl implements GisRoutesHolder {
	private HashMap<GisLocation, GisRoutesHolderFromLocation> fromLocationsIndex = null;
	private HashMap<GisLocation, GisRoutesHolderToLocation>   toLocationsIndex = null;
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
	 * The cached value of the '{@link #getCalculator() <em>Calculator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalculator()
	 * @generated
	 * @ordered
	 */
	protected GisRouter calculator;

	/**
	 * The default value of the '{@link #getRefreshFeedback() <em>Refresh Feedback</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefreshFeedback()
	 * @generated
	 * @ordered
	 */
	protected static final EnabledFeedback REFRESH_FEEDBACK_EDEFAULT = null;
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
			fromLocations = new EObjectContainmentWithInverseEList<GisRoutesHolderFromLocation>(GisRoutesHolderFromLocation.class, this, GisPackage.GIS_ROUTES_HOLDER__FROM_LOCATIONS, GisPackage.GIS_ROUTES_HOLDER_FROM_LOCATION__ROUTES_HOLDER);
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
			toLocations = new EObjectContainmentWithInverseEList<GisRoutesHolderToLocation>(GisRoutesHolderToLocation.class, this, GisPackage.GIS_ROUTES_HOLDER__TO_LOCATIONS, GisPackage.GIS_ROUTES_HOLDER_TO_LOCATION__ROUTES_HOLDER);
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
	public GisRouter getCalculator() {
		if (calculator != null && calculator.eIsProxy()) {
			InternalEObject oldCalculator = (InternalEObject)calculator;
			calculator = (GisRouter)eResolveProxy(oldCalculator);
			if (calculator != oldCalculator) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GisPackage.GIS_ROUTES_HOLDER__CALCULATOR, oldCalculator, calculator));
			}
		}
		return calculator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GisRouter basicGetCalculator() {
		return calculator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCalculator(GisRouter newCalculator) {
		GisRouter oldCalculator = calculator;
		calculator = newCalculator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GisPackage.GIS_ROUTES_HOLDER__CALCULATOR, oldCalculator, calculator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnabledFeedback getRefreshFeedback() {
		// TODO: implement this method to return the 'Refresh Feedback' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
	 */
	public GisRoutesHolderFromLocation addFromLocation(GisLocation location) {
		GisRoutesHolderFromLocation fromLocation = this.getFromLocation(location);
		if ( fromLocation==null){
			fromLocation = GisFactory.eINSTANCE.createGisRoutesHolderFromLocation();
			fromLocation.setLocation(location);
			this.getFromLocations().add(fromLocation);
			this.fromLocationsIndex.put(location, fromLocation);
		}
		return fromLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public GisRoutesHolderToLocation addToLocation(GisLocation location) {
		GisRoutesHolderToLocation toLocation = this.getToLocation(location);
		if ( toLocation==null){
			toLocation = GisFactory.eINSTANCE.createGisRoutesHolderToLocation();
			toLocation.setLocation(location);
			this.getToLocations().add(toLocation);
			this.toLocationsIndex.put(location, toLocation);
		}
		return toLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public GisRoutesHolderFromLocation getFromLocation(GisLocation location) {
		if ( this.fromLocationsIndex==null){
			this.fromLocationsIndex = new HashMap<GisLocation, GisRoutesHolderFromLocation>();
			for ( GisRoutesHolderFromLocation fromLocation : this.getFromLocations()){
				this.fromLocationsIndex.put(fromLocation.getLocation(), fromLocation);
			}
		}
		return this.fromLocationsIndex.get(location);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public GisRoutesHolderToLocation getToLocation(GisLocation location) {
		if ( this.toLocationsIndex==null){
			this.toLocationsIndex = new HashMap<GisLocation, GisRoutesHolderToLocation>();
			for ( GisRoutesHolderToLocation toLocation : this.getToLocations()){
				this.toLocationsIndex.put(toLocation.getLocation(), toLocation);
			}
		}
		return this.toLocationsIndex.get(location);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void refresh() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
			case GisPackage.GIS_ROUTES_HOLDER__FROM_LOCATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFromLocations()).basicAdd(otherEnd, msgs);
			case GisPackage.GIS_ROUTES_HOLDER__TO_LOCATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getToLocations()).basicAdd(otherEnd, msgs);
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
			case GisPackage.GIS_ROUTES_HOLDER__CALCULATOR:
				if (resolve) return getCalculator();
				return basicGetCalculator();
			case GisPackage.GIS_ROUTES_HOLDER__REFRESH_FEEDBACK:
				return getRefreshFeedback();
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
			case GisPackage.GIS_ROUTES_HOLDER__CALCULATOR:
				setCalculator((GisRouter)newValue);
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
			case GisPackage.GIS_ROUTES_HOLDER__CALCULATOR:
				setCalculator((GisRouter)null);
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
			case GisPackage.GIS_ROUTES_HOLDER__CALCULATOR:
				return calculator != null;
			case GisPackage.GIS_ROUTES_HOLDER__REFRESH_FEEDBACK:
				return REFRESH_FEEDBACK_EDEFAULT == null ? getRefreshFeedback() != null : !REFRESH_FEEDBACK_EDEFAULT.equals(getRefreshFeedback());
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
			case GisPackage.GIS_ROUTES_HOLDER___REFRESH:
				refresh();
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
		result.append(" (Symmetrical: ");
		result.append(symmetrical);
		result.append(')');
		return result.toString();
	}

} //GisRoutesHolderImpl
