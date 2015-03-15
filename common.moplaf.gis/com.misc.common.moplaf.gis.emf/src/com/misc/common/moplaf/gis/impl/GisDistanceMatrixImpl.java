/**
 */
package com.misc.common.moplaf.gis.impl;

import com.misc.common.moplaf.gis.GisCoordinates;
import com.misc.common.moplaf.gis.GisDistanceFromLocation;
import com.misc.common.moplaf.gis.GisDistanceMatrix;
import com.misc.common.moplaf.gis.GisDistanceMatrixCalculator;
import com.misc.common.moplaf.gis.GisDistanceToLocation;
import com.misc.common.moplaf.gis.GisFactory;
import com.misc.common.moplaf.gis.GisPackage;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Distance Matrix</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.misc.common.moplaf.gis.impl.GisDistanceMatrixImpl#getFromLocations <em>From Locations</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.impl.GisDistanceMatrixImpl#getToLocations <em>To Locations</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.impl.GisDistanceMatrixImpl#getCalculator <em>Calculator</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GisDistanceMatrixImpl extends MinimalEObjectImpl.Container implements GisDistanceMatrix {
	/**
	 * The cached value of the '{@link #getFromLocations() <em>From Locations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromLocations()
	 * @generated
	 * @ordered
	 */
	protected EList<GisDistanceFromLocation> fromLocations;

	/**
	 * The cached value of the '{@link #getToLocations() <em>To Locations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToLocations()
	 * @generated
	 * @ordered
	 */
	protected EList<GisDistanceToLocation> toLocations;

	/**
	 * The cached value of the '{@link #getCalculator() <em>Calculator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalculator()
	 * @generated
	 * @ordered
	 */
	protected GisDistanceMatrixCalculator calculator;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GisDistanceMatrixImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GisPackage.Literals.GIS_DISTANCE_MATRIX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GisDistanceFromLocation> getFromLocations() {
		if (fromLocations == null) {
			fromLocations = new EObjectContainmentEList<GisDistanceFromLocation>(GisDistanceFromLocation.class, this, GisPackage.GIS_DISTANCE_MATRIX__FROM_LOCATIONS);
		}
		return fromLocations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GisDistanceToLocation> getToLocations() {
		if (toLocations == null) {
			toLocations = new EObjectContainmentEList<GisDistanceToLocation>(GisDistanceToLocation.class, this, GisPackage.GIS_DISTANCE_MATRIX__TO_LOCATIONS);
		}
		return toLocations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GisDistanceMatrixCalculator getCalculator() {
		if (calculator != null && calculator.eIsProxy()) {
			InternalEObject oldCalculator = (InternalEObject)calculator;
			calculator = (GisDistanceMatrixCalculator)eResolveProxy(oldCalculator);
			if (calculator != oldCalculator) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GisPackage.GIS_DISTANCE_MATRIX__CALCULATOR, oldCalculator, calculator));
			}
		}
		return calculator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GisDistanceMatrixCalculator basicGetCalculator() {
		return calculator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCalculator(GisDistanceMatrixCalculator newCalculator) {
		GisDistanceMatrixCalculator oldCalculator = calculator;
		calculator = newCalculator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GisPackage.GIS_DISTANCE_MATRIX__CALCULATOR, oldCalculator, calculator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void calculate() {
		GisDistanceMatrixCalculator calculator = this.getCalculator();
		if ( calculator!=null){
			calculator.calculate(this);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void addFromLocation(GisCoordinates location) {
		GisDistanceFromLocation fromLocation = GisFactory.eINSTANCE.createGisDistanceFromLocation();
		fromLocation.setLocation(location);
		this.getFromLocations().add(fromLocation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void addToLocation(GisCoordinates location) {
		GisDistanceToLocation toLocation = GisFactory.eINSTANCE.createGisDistanceToLocation();
		toLocation.setLocation(location);
		this.getToLocations().add(toLocation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GisPackage.GIS_DISTANCE_MATRIX__FROM_LOCATIONS:
				return ((InternalEList<?>)getFromLocations()).basicRemove(otherEnd, msgs);
			case GisPackage.GIS_DISTANCE_MATRIX__TO_LOCATIONS:
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
			case GisPackage.GIS_DISTANCE_MATRIX__FROM_LOCATIONS:
				return getFromLocations();
			case GisPackage.GIS_DISTANCE_MATRIX__TO_LOCATIONS:
				return getToLocations();
			case GisPackage.GIS_DISTANCE_MATRIX__CALCULATOR:
				if (resolve) return getCalculator();
				return basicGetCalculator();
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
			case GisPackage.GIS_DISTANCE_MATRIX__FROM_LOCATIONS:
				getFromLocations().clear();
				getFromLocations().addAll((Collection<? extends GisDistanceFromLocation>)newValue);
				return;
			case GisPackage.GIS_DISTANCE_MATRIX__TO_LOCATIONS:
				getToLocations().clear();
				getToLocations().addAll((Collection<? extends GisDistanceToLocation>)newValue);
				return;
			case GisPackage.GIS_DISTANCE_MATRIX__CALCULATOR:
				setCalculator((GisDistanceMatrixCalculator)newValue);
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
			case GisPackage.GIS_DISTANCE_MATRIX__FROM_LOCATIONS:
				getFromLocations().clear();
				return;
			case GisPackage.GIS_DISTANCE_MATRIX__TO_LOCATIONS:
				getToLocations().clear();
				return;
			case GisPackage.GIS_DISTANCE_MATRIX__CALCULATOR:
				setCalculator((GisDistanceMatrixCalculator)null);
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
			case GisPackage.GIS_DISTANCE_MATRIX__FROM_LOCATIONS:
				return fromLocations != null && !fromLocations.isEmpty();
			case GisPackage.GIS_DISTANCE_MATRIX__TO_LOCATIONS:
				return toLocations != null && !toLocations.isEmpty();
			case GisPackage.GIS_DISTANCE_MATRIX__CALCULATOR:
				return calculator != null;
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
			case GisPackage.GIS_DISTANCE_MATRIX___CALCULATE:
				calculate();
				return null;
			case GisPackage.GIS_DISTANCE_MATRIX___ADD_FROM_LOCATION__GISCOORDINATES:
				addFromLocation((GisCoordinates)arguments.get(0));
				return null;
			case GisPackage.GIS_DISTANCE_MATRIX___ADD_TO_LOCATION__GISCOORDINATES:
				addToLocation((GisCoordinates)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //GisDistanceMatrixImpl
