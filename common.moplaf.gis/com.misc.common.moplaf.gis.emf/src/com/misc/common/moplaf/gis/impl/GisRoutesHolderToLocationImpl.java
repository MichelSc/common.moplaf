/**
 */
package com.misc.common.moplaf.gis.impl;

import com.misc.common.moplaf.gis.GisLocation;
import com.misc.common.moplaf.gis.GisPackage;
import com.misc.common.moplaf.gis.GisRoutesHolder;
import com.misc.common.moplaf.gis.GisRoutesHolderElement;
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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Routes Holder To Location</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.gis.impl.GisRoutesHolderToLocationImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.impl.GisRoutesHolderToLocationImpl#getFromLocations <em>From Locations</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.impl.GisRoutesHolderToLocationImpl#getRoutesHolder <em>Routes Holder</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.impl.GisRoutesHolderToLocationImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GisRoutesHolderToLocationImpl extends MinimalEObjectImpl.Container implements GisRoutesHolderToLocation {
	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected GisLocation location;

	/**
	 * The cached value of the '{@link #getFromLocations() <em>From Locations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromLocations()
	 * @generated
	 * @ordered
	 */
	protected EList<GisRoutesHolderElement> fromLocations;

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
	protected GisRoutesHolderToLocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GisPackage.Literals.GIS_ROUTES_HOLDER_TO_LOCATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GisLocation getLocation() {
		if (location != null && location.eIsProxy()) {
			InternalEObject oldLocation = (InternalEObject)location;
			location = (GisLocation)eResolveProxy(oldLocation);
			if (location != oldLocation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GisPackage.GIS_ROUTES_HOLDER_TO_LOCATION__LOCATION, oldLocation, location));
			}
		}
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GisLocation basicGetLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(GisLocation newLocation) {
		GisLocation oldLocation = location;
		location = newLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GisPackage.GIS_ROUTES_HOLDER_TO_LOCATION__LOCATION, oldLocation, location));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GisRoutesHolderElement> getFromLocations() {
		if (fromLocations == null) {
			fromLocations = new EObjectWithInverseResolvingEList<GisRoutesHolderElement>(GisRoutesHolderElement.class, this, GisPackage.GIS_ROUTES_HOLDER_TO_LOCATION__FROM_LOCATIONS, GisPackage.GIS_ROUTES_HOLDER_ELEMENT__TO_LOCATION);
		}
		return fromLocations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GisRoutesHolder getRoutesHolder() {
		if (eContainerFeatureID() != GisPackage.GIS_ROUTES_HOLDER_TO_LOCATION__ROUTES_HOLDER) return null;
		return (GisRoutesHolder)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRoutesHolder(GisRoutesHolder newRoutesHolder, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newRoutesHolder, GisPackage.GIS_ROUTES_HOLDER_TO_LOCATION__ROUTES_HOLDER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoutesHolder(GisRoutesHolder newRoutesHolder) {
		if (newRoutesHolder != eInternalContainer() || (eContainerFeatureID() != GisPackage.GIS_ROUTES_HOLDER_TO_LOCATION__ROUTES_HOLDER && newRoutesHolder != null)) {
			if (EcoreUtil.isAncestor(this, newRoutesHolder))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newRoutesHolder != null)
				msgs = ((InternalEObject)newRoutesHolder).eInverseAdd(this, GisPackage.GIS_ROUTES_HOLDER__TO_LOCATIONS, GisRoutesHolder.class, msgs);
			msgs = basicSetRoutesHolder(newRoutesHolder, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GisPackage.GIS_ROUTES_HOLDER_TO_LOCATION__ROUTES_HOLDER, newRoutesHolder, newRoutesHolder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public String getDescription() {
		String description = String.format("To %s", this.getLocation().getDescription());
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public GisRoutesHolderElement getElement(GisLocation fromLocation) {
		GisRoutesHolder holder = this.getRoutesHolder();
		GisRoutesHolderFromLocation from_holder = holder.getFromLocation(fromLocation);
		return from_holder.getElement(this.getLocation());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public GisRoutesHolderElement addElement(GisRoutesHolderFromLocation fromLocation) {
		return fromLocation.addElement(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void remove() {
		for ( GisRoutesHolderElement element : this.getFromLocations()) {
			element.remove();
		}
		this.setRoutesHolder(null); // owning
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
			case GisPackage.GIS_ROUTES_HOLDER_TO_LOCATION__FROM_LOCATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFromLocations()).basicAdd(otherEnd, msgs);
			case GisPackage.GIS_ROUTES_HOLDER_TO_LOCATION__ROUTES_HOLDER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetRoutesHolder((GisRoutesHolder)otherEnd, msgs);
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
			case GisPackage.GIS_ROUTES_HOLDER_TO_LOCATION__FROM_LOCATIONS:
				return ((InternalEList<?>)getFromLocations()).basicRemove(otherEnd, msgs);
			case GisPackage.GIS_ROUTES_HOLDER_TO_LOCATION__ROUTES_HOLDER:
				return basicSetRoutesHolder(null, msgs);
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
			case GisPackage.GIS_ROUTES_HOLDER_TO_LOCATION__ROUTES_HOLDER:
				return eInternalContainer().eInverseRemove(this, GisPackage.GIS_ROUTES_HOLDER__TO_LOCATIONS, GisRoutesHolder.class, msgs);
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
			case GisPackage.GIS_ROUTES_HOLDER_TO_LOCATION__LOCATION:
				if (resolve) return getLocation();
				return basicGetLocation();
			case GisPackage.GIS_ROUTES_HOLDER_TO_LOCATION__FROM_LOCATIONS:
				return getFromLocations();
			case GisPackage.GIS_ROUTES_HOLDER_TO_LOCATION__ROUTES_HOLDER:
				return getRoutesHolder();
			case GisPackage.GIS_ROUTES_HOLDER_TO_LOCATION__DESCRIPTION:
				return getDescription();
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
			case GisPackage.GIS_ROUTES_HOLDER_TO_LOCATION__LOCATION:
				setLocation((GisLocation)newValue);
				return;
			case GisPackage.GIS_ROUTES_HOLDER_TO_LOCATION__FROM_LOCATIONS:
				getFromLocations().clear();
				getFromLocations().addAll((Collection<? extends GisRoutesHolderElement>)newValue);
				return;
			case GisPackage.GIS_ROUTES_HOLDER_TO_LOCATION__ROUTES_HOLDER:
				setRoutesHolder((GisRoutesHolder)newValue);
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
			case GisPackage.GIS_ROUTES_HOLDER_TO_LOCATION__LOCATION:
				setLocation((GisLocation)null);
				return;
			case GisPackage.GIS_ROUTES_HOLDER_TO_LOCATION__FROM_LOCATIONS:
				getFromLocations().clear();
				return;
			case GisPackage.GIS_ROUTES_HOLDER_TO_LOCATION__ROUTES_HOLDER:
				setRoutesHolder((GisRoutesHolder)null);
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
			case GisPackage.GIS_ROUTES_HOLDER_TO_LOCATION__LOCATION:
				return location != null;
			case GisPackage.GIS_ROUTES_HOLDER_TO_LOCATION__FROM_LOCATIONS:
				return fromLocations != null && !fromLocations.isEmpty();
			case GisPackage.GIS_ROUTES_HOLDER_TO_LOCATION__ROUTES_HOLDER:
				return getRoutesHolder() != null;
			case GisPackage.GIS_ROUTES_HOLDER_TO_LOCATION__DESCRIPTION:
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
			case GisPackage.GIS_ROUTES_HOLDER_TO_LOCATION___GET_ELEMENT__GISLOCATION:
				return getElement((GisLocation)arguments.get(0));
			case GisPackage.GIS_ROUTES_HOLDER_TO_LOCATION___ADD_ELEMENT__GISROUTESHOLDERFROMLOCATION:
				return addElement((GisRoutesHolderFromLocation)arguments.get(0));
			case GisPackage.GIS_ROUTES_HOLDER_TO_LOCATION___REMOVE:
				remove();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //GisRoutesHolderToLocationImpl
