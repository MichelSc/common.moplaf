/**
 */
package com.misc.common.moplaf.datatools.impl;

import com.misc.common.moplaf.datatools.DatatoolsPackage;
import com.misc.common.moplaf.datatools.NavigationAxis;

import com.misc.common.moplaf.datatools.NavigationPath;
import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Navigation Axis</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.datatools.impl.NavigationAxisImpl#getSourceType <em>Source Type</em>}</li>
 *   <li>{@link com.misc.common.moplaf.datatools.impl.NavigationAxisImpl#getTargetType <em>Target Type</em>}</li>
 *   <li>{@link com.misc.common.moplaf.datatools.impl.NavigationAxisImpl#getPath <em>Path</em>}</li>
 *   <li>{@link com.misc.common.moplaf.datatools.impl.NavigationAxisImpl#getPrevious <em>Previous</em>}</li>
 *   <li>{@link com.misc.common.moplaf.datatools.impl.NavigationAxisImpl#getPathElement <em>Path Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class NavigationAxisImpl extends MinimalEObjectImpl.Container implements NavigationAxis {
	/**
	 * The default value of the '{@link #getPathElement() <em>Path Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathElement()
	 * @generated
	 * @ordered
	 */
	protected static final String PATH_ELEMENT_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NavigationAxisImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatatoolsPackage.Literals.NAVIGATION_AXIS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSourceType() {
		EClass sourceType = basicGetSourceType();
		return sourceType != null && sourceType.eIsProxy() ? (EClass)eResolveProxy((InternalEObject)sourceType) : sourceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public EClass basicGetSourceType() {
		NavigationAxis previous = this.getPrevious();
		NavigationPath path = this.getPath();
		return previous==null ? path.getSourceType() : previous.getTargetType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTargetType() {
		EClass targetType = basicGetTargetType();
		return targetType != null && targetType.eIsProxy() ? (EClass)eResolveProxy((InternalEObject)targetType) : targetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public EClass basicGetTargetType() {
		// must be overridden by the specialization
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NavigationPath getPath() {
		if (eContainerFeatureID() != DatatoolsPackage.NAVIGATION_AXIS__PATH) return null;
		return (NavigationPath)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPath(NavigationPath newPath, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPath, DatatoolsPackage.NAVIGATION_AXIS__PATH, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPath(NavigationPath newPath) {
		if (newPath != eInternalContainer() || (eContainerFeatureID() != DatatoolsPackage.NAVIGATION_AXIS__PATH && newPath != null)) {
			if (EcoreUtil.isAncestor(this, newPath))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPath != null)
				msgs = ((InternalEObject)newPath).eInverseAdd(this, DatatoolsPackage.NAVIGATION_PATH__PATH_ELEMENTS, NavigationPath.class, msgs);
			msgs = basicSetPath(newPath, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatoolsPackage.NAVIGATION_AXIS__PATH, newPath, newPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NavigationAxis getPrevious() {
		NavigationAxis previous = basicGetPrevious();
		return previous != null && previous.eIsProxy() ? (NavigationAxis)eResolveProxy((InternalEObject)previous) : previous;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public NavigationAxis basicGetPrevious() {
		NavigationPath path = this.getPath();
		int index_this_element = path.getPathElements().indexOf(this);
		if ( index_this_element==0 ) {
			return null;
		}
		return path.getPathElements().get(index_this_element-1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPathElement() {
		// TODO: implement this method to return the 'Path Element' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject naviguate(EObject in) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> naviguateMany(EObject in) {
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
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DatatoolsPackage.NAVIGATION_AXIS__PATH:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetPath((NavigationPath)otherEnd, msgs);
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
			case DatatoolsPackage.NAVIGATION_AXIS__PATH:
				return basicSetPath(null, msgs);
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
			case DatatoolsPackage.NAVIGATION_AXIS__PATH:
				return eInternalContainer().eInverseRemove(this, DatatoolsPackage.NAVIGATION_PATH__PATH_ELEMENTS, NavigationPath.class, msgs);
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
			case DatatoolsPackage.NAVIGATION_AXIS__SOURCE_TYPE:
				if (resolve) return getSourceType();
				return basicGetSourceType();
			case DatatoolsPackage.NAVIGATION_AXIS__TARGET_TYPE:
				if (resolve) return getTargetType();
				return basicGetTargetType();
			case DatatoolsPackage.NAVIGATION_AXIS__PATH:
				return getPath();
			case DatatoolsPackage.NAVIGATION_AXIS__PREVIOUS:
				if (resolve) return getPrevious();
				return basicGetPrevious();
			case DatatoolsPackage.NAVIGATION_AXIS__PATH_ELEMENT:
				return getPathElement();
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
			case DatatoolsPackage.NAVIGATION_AXIS__PATH:
				setPath((NavigationPath)newValue);
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
			case DatatoolsPackage.NAVIGATION_AXIS__PATH:
				setPath((NavigationPath)null);
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
			case DatatoolsPackage.NAVIGATION_AXIS__SOURCE_TYPE:
				return basicGetSourceType() != null;
			case DatatoolsPackage.NAVIGATION_AXIS__TARGET_TYPE:
				return basicGetTargetType() != null;
			case DatatoolsPackage.NAVIGATION_AXIS__PATH:
				return getPath() != null;
			case DatatoolsPackage.NAVIGATION_AXIS__PREVIOUS:
				return basicGetPrevious() != null;
			case DatatoolsPackage.NAVIGATION_AXIS__PATH_ELEMENT:
				return PATH_ELEMENT_EDEFAULT == null ? getPathElement() != null : !PATH_ELEMENT_EDEFAULT.equals(getPathElement());
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
			case DatatoolsPackage.NAVIGATION_AXIS___NAVIGUATE__EOBJECT:
				return naviguate((EObject)arguments.get(0));
			case DatatoolsPackage.NAVIGATION_AXIS___NAVIGUATE_MANY__EOBJECT:
				return naviguateMany((EObject)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //NavigationAxisImpl
