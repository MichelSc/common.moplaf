/**
 */
package com.misc.common.moplaf.gis.impl;

import com.misc.common.moplaf.gis.GisDistanceMatrix;
import com.misc.common.moplaf.gis.GisDistanceMatrixCalculator;
import com.misc.common.moplaf.gis.GisDistanceMatrixElement;
import com.misc.common.moplaf.gis.GisDistanceMatrixFromLocation;
import com.misc.common.moplaf.gis.GisDistanceMatrixToLocation;
import com.misc.common.moplaf.gis.GisFactory;
import com.misc.common.moplaf.gis.GisLocation;
import com.misc.common.moplaf.gis.GisPackage;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.HashMap;

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
 *   <li>{@link com.misc.common.moplaf.gis.impl.GisDistanceMatrixImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GisDistanceMatrixImpl extends MinimalEObjectImpl.Container implements GisDistanceMatrix {
	private HashMap<GisLocation, GisDistanceMatrixFromLocation> fromLocationsIndex = null;
	private HashMap<GisLocation, GisDistanceMatrixToLocation>   toLocationsIndex = null;
	/**
	 * The cached value of the '{@link #getFromLocations() <em>From Locations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromLocations()
	 * @generated
	 * @ordered
	 */
	protected EList<GisDistanceMatrixFromLocation> fromLocations;

	/**
	 * The cached value of the '{@link #getToLocations() <em>To Locations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToLocations()
	 * @generated
	 * @ordered
	 */
	protected EList<GisDistanceMatrixToLocation> toLocations;

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
	public EList<GisDistanceMatrixFromLocation> getFromLocations() {
		if (fromLocations == null) {
			fromLocations = new EObjectContainmentEList<GisDistanceMatrixFromLocation>(GisDistanceMatrixFromLocation.class, this, GisPackage.GIS_DISTANCE_MATRIX__FROM_LOCATIONS);
		}
		return fromLocations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GisDistanceMatrixToLocation> getToLocations() {
		if (toLocations == null) {
			toLocations = new EObjectContainmentEList<GisDistanceMatrixToLocation>(GisDistanceMatrixToLocation.class, this, GisPackage.GIS_DISTANCE_MATRIX__TO_LOCATIONS);
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
			eNotify(new ENotificationImpl(this, Notification.SET, GisPackage.GIS_DISTANCE_MATRIX__NAME, oldName, name));
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
	public GisDistanceMatrixFromLocation addFromLocation(GisLocation location) {
		GisDistanceMatrixFromLocation fromLocation = this.getFromLocation(location);
		if ( fromLocation==null){
			fromLocation = GisFactory.eINSTANCE.createGisDistanceMatrixFromLocation();
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
	public GisDistanceMatrixToLocation addToLocation(GisLocation location) {
		GisDistanceMatrixToLocation toLocation = this.getToLocation(location);
		if ( toLocation==null){
			toLocation = GisFactory.eINSTANCE.createGisDistanceMatrixToLocation();
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
	public GisDistanceMatrixFromLocation getFromLocation(GisLocation location) {
		if ( this.fromLocationsIndex==null){
			this.fromLocationsIndex = new HashMap<GisLocation, GisDistanceMatrixFromLocation>();
			for ( GisDistanceMatrixFromLocation fromLocation : this.getFromLocations()){
				this.fromLocationsIndex.put(fromLocation.getLocation(), fromLocation);
			}
		}
		return this.fromLocationsIndex.get(location);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public GisDistanceMatrixToLocation getToLocation(GisLocation location) {
		if ( this.toLocationsIndex==null){
			this.toLocationsIndex = new HashMap<GisLocation, GisDistanceMatrixToLocation>();
			for ( GisDistanceMatrixToLocation toLocation : this.getToLocations()){
				this.toLocationsIndex.put(toLocation.getLocation(), toLocation);
			}
		}
		return this.toLocationsIndex.get(location);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public GisDistanceMatrixElement getElement(GisLocation fromLocation, GisLocation toLocation) {
		GisDistanceMatrixFromLocation distanceFrom = this.getFromLocation(fromLocation);
		if ( distanceFrom==null) { return null; }
		return distanceFrom.getElement(toLocation);
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
			case GisPackage.GIS_DISTANCE_MATRIX__NAME:
				return getName();
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
				getFromLocations().addAll((Collection<? extends GisDistanceMatrixFromLocation>)newValue);
				return;
			case GisPackage.GIS_DISTANCE_MATRIX__TO_LOCATIONS:
				getToLocations().clear();
				getToLocations().addAll((Collection<? extends GisDistanceMatrixToLocation>)newValue);
				return;
			case GisPackage.GIS_DISTANCE_MATRIX__CALCULATOR:
				setCalculator((GisDistanceMatrixCalculator)newValue);
				return;
			case GisPackage.GIS_DISTANCE_MATRIX__NAME:
				setName((String)newValue);
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
			case GisPackage.GIS_DISTANCE_MATRIX__NAME:
				setName(NAME_EDEFAULT);
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
			case GisPackage.GIS_DISTANCE_MATRIX__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
			case GisPackage.GIS_DISTANCE_MATRIX___ADD_FROM_LOCATION__GISLOCATION:
				return addFromLocation((GisLocation)arguments.get(0));
			case GisPackage.GIS_DISTANCE_MATRIX___ADD_TO_LOCATION__GISLOCATION:
				return addToLocation((GisLocation)arguments.get(0));
			case GisPackage.GIS_DISTANCE_MATRIX___GET_FROM_LOCATION__GISLOCATION:
				return getFromLocation((GisLocation)arguments.get(0));
			case GisPackage.GIS_DISTANCE_MATRIX___GET_TO_LOCATION__GISLOCATION:
				return getToLocation((GisLocation)arguments.get(0));
			case GisPackage.GIS_DISTANCE_MATRIX___GET_ELEMENT__GISLOCATION_GISLOCATION:
				return getElement((GisLocation)arguments.get(0), (GisLocation)arguments.get(1));
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
		result.append(')');
		return result.toString();
	}

} //GisDistanceMatrixImpl
