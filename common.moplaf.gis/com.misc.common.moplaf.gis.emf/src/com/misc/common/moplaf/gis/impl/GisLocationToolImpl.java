/**
 */
package com.misc.common.moplaf.gis.impl;

import com.misc.common.moplaf.common.EnabledFeedback;

import com.misc.common.moplaf.gis.GisLocation;
import com.misc.common.moplaf.gis.GisLocationTool;
import com.misc.common.moplaf.gis.GisPackage;
import com.misc.common.moplaf.gis.GisToolLocation;

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
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Location Tool</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.gis.impl.GisLocationToolImpl#getTool <em>Tool</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.impl.GisLocationToolImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.impl.GisLocationToolImpl#getResults <em>Results</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.impl.GisLocationToolImpl#getLastHandlingFeedback <em>Last Handling Feedback</em>}</li>
 *   <li>{@link com.misc.common.moplaf.gis.impl.GisLocationToolImpl#getDoToolFeedback <em>Do Tool Feedback</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GisLocationToolImpl extends MinimalEObjectImpl.Container implements GisLocationTool {
	/**
	 * The cached value of the '{@link #getTool() <em>Tool</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTool()
	 * @generated
	 * @ordered
	 */
	protected GisToolLocation tool;

	/**
	 * The cached value of the '{@link #getResults() <em>Results</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResults()
	 * @generated
	 * @ordered
	 */
	protected EList<GisLocation> results;

	/**
	 * The default value of the '{@link #getLastHandlingFeedback() <em>Last Handling Feedback</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastHandlingFeedback()
	 * @generated
	 * @ordered
	 */
	protected static final String LAST_HANDLING_FEEDBACK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastHandlingFeedback() <em>Last Handling Feedback</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastHandlingFeedback()
	 * @generated
	 * @ordered
	 */
	protected String lastHandlingFeedback = LAST_HANDLING_FEEDBACK_EDEFAULT;

	/**
	 * The default value of the '{@link #getDoToolFeedback() <em>Do Tool Feedback</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoToolFeedback()
	 * @generated
	 * @ordered
	 */
	protected static final EnabledFeedback DO_TOOL_FEEDBACK_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GisLocationToolImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GisPackage.Literals.GIS_LOCATION_TOOL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GisToolLocation getTool() {
		if (tool != null && tool.eIsProxy()) {
			InternalEObject oldTool = (InternalEObject)tool;
			tool = (GisToolLocation)eResolveProxy(oldTool);
			if (tool != oldTool) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GisPackage.GIS_LOCATION_TOOL__TOOL, oldTool, tool));
			}
		}
		return tool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GisToolLocation basicGetTool() {
		return tool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTool(GisToolLocation newTool) {
		GisToolLocation oldTool = tool;
		tool = newTool;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GisPackage.GIS_LOCATION_TOOL__TOOL, oldTool, tool));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GisLocation getLocation() {
		if (eContainerFeatureID() != GisPackage.GIS_LOCATION_TOOL__LOCATION) return null;
		return (GisLocation)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocation(GisLocation newLocation, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newLocation, GisPackage.GIS_LOCATION_TOOL__LOCATION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(GisLocation newLocation) {
		if (newLocation != eInternalContainer() || (eContainerFeatureID() != GisPackage.GIS_LOCATION_TOOL__LOCATION && newLocation != null)) {
			if (EcoreUtil.isAncestor(this, newLocation))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newLocation != null)
				msgs = ((InternalEObject)newLocation).eInverseAdd(this, GisPackage.GIS_LOCATION__TOOLS, GisLocation.class, msgs);
			msgs = basicSetLocation(newLocation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GisPackage.GIS_LOCATION_TOOL__LOCATION, newLocation, newLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GisLocation> getResults() {
		if (results == null) {
			results = new EObjectContainmentEList<GisLocation>(GisLocation.class, this, GisPackage.GIS_LOCATION_TOOL__RESULTS);
		}
		return results;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLastHandlingFeedback() {
		return lastHandlingFeedback;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastHandlingFeedback(String newLastHandlingFeedback) {
		String oldLastHandlingFeedback = lastHandlingFeedback;
		lastHandlingFeedback = newLastHandlingFeedback;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GisPackage.GIS_LOCATION_TOOL__LAST_HANDLING_FEEDBACK, oldLastHandlingFeedback, lastHandlingFeedback));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public EnabledFeedback getDoToolFeedback() {
		if ( this.getTool()==null ) {
			return new EnabledFeedback(false, "No Tool");
		}
		return EnabledFeedback.NOFEEDBACK;
	}
		
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void doTool() {
		this.getTool().handle(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void flushResults() {
		this.getResults().clear();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GisPackage.GIS_LOCATION_TOOL__LOCATION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetLocation((GisLocation)otherEnd, msgs);
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
			case GisPackage.GIS_LOCATION_TOOL__LOCATION:
				return basicSetLocation(null, msgs);
			case GisPackage.GIS_LOCATION_TOOL__RESULTS:
				return ((InternalEList<?>)getResults()).basicRemove(otherEnd, msgs);
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
			case GisPackage.GIS_LOCATION_TOOL__LOCATION:
				return eInternalContainer().eInverseRemove(this, GisPackage.GIS_LOCATION__TOOLS, GisLocation.class, msgs);
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
			case GisPackage.GIS_LOCATION_TOOL__TOOL:
				if (resolve) return getTool();
				return basicGetTool();
			case GisPackage.GIS_LOCATION_TOOL__LOCATION:
				return getLocation();
			case GisPackage.GIS_LOCATION_TOOL__RESULTS:
				return getResults();
			case GisPackage.GIS_LOCATION_TOOL__LAST_HANDLING_FEEDBACK:
				return getLastHandlingFeedback();
			case GisPackage.GIS_LOCATION_TOOL__DO_TOOL_FEEDBACK:
				return getDoToolFeedback();
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
			case GisPackage.GIS_LOCATION_TOOL__TOOL:
				setTool((GisToolLocation)newValue);
				return;
			case GisPackage.GIS_LOCATION_TOOL__LOCATION:
				setLocation((GisLocation)newValue);
				return;
			case GisPackage.GIS_LOCATION_TOOL__RESULTS:
				getResults().clear();
				getResults().addAll((Collection<? extends GisLocation>)newValue);
				return;
			case GisPackage.GIS_LOCATION_TOOL__LAST_HANDLING_FEEDBACK:
				setLastHandlingFeedback((String)newValue);
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
			case GisPackage.GIS_LOCATION_TOOL__TOOL:
				setTool((GisToolLocation)null);
				return;
			case GisPackage.GIS_LOCATION_TOOL__LOCATION:
				setLocation((GisLocation)null);
				return;
			case GisPackage.GIS_LOCATION_TOOL__RESULTS:
				getResults().clear();
				return;
			case GisPackage.GIS_LOCATION_TOOL__LAST_HANDLING_FEEDBACK:
				setLastHandlingFeedback(LAST_HANDLING_FEEDBACK_EDEFAULT);
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
			case GisPackage.GIS_LOCATION_TOOL__TOOL:
				return tool != null;
			case GisPackage.GIS_LOCATION_TOOL__LOCATION:
				return getLocation() != null;
			case GisPackage.GIS_LOCATION_TOOL__RESULTS:
				return results != null && !results.isEmpty();
			case GisPackage.GIS_LOCATION_TOOL__LAST_HANDLING_FEEDBACK:
				return LAST_HANDLING_FEEDBACK_EDEFAULT == null ? lastHandlingFeedback != null : !LAST_HANDLING_FEEDBACK_EDEFAULT.equals(lastHandlingFeedback);
			case GisPackage.GIS_LOCATION_TOOL__DO_TOOL_FEEDBACK:
				return DO_TOOL_FEEDBACK_EDEFAULT == null ? getDoToolFeedback() != null : !DO_TOOL_FEEDBACK_EDEFAULT.equals(getDoToolFeedback());
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
			case GisPackage.GIS_LOCATION_TOOL___DO_TOOL:
				doTool();
				return null;
			case GisPackage.GIS_LOCATION_TOOL___FLUSH_RESULTS:
				flushResults();
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
		result.append(" (LastHandlingFeedback: ");
		result.append(lastHandlingFeedback);
		result.append(')');
		return result.toString();
	}

} //GisLocationToolImpl
