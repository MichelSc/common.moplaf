/**
 */
package com.misc.common.moplaf.datatools.impl;

import com.misc.common.moplaf.datatools.DataToolType;
import com.misc.common.moplaf.datatools.DatatoolsPackage;
import com.misc.common.moplaf.datatools.NavigationAxis;
import com.misc.common.moplaf.datatools.NavigationPath;
import com.misc.common.moplaf.datatools.util.Util;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Navigation Path</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.datatools.impl.NavigationPathImpl#getPathElements <em>Path Elements</em>}</li>
 *   <li>{@link com.misc.common.moplaf.datatools.impl.NavigationPathImpl#getSourceType <em>Source Type</em>}</li>
 *   <li>{@link com.misc.common.moplaf.datatools.impl.NavigationPathImpl#getTargetType <em>Target Type</em>}</li>
 *   <li>{@link com.misc.common.moplaf.datatools.impl.NavigationPathImpl#isMany <em>Many</em>}</li>
 *   <li>{@link com.misc.common.moplaf.datatools.impl.NavigationPathImpl#getPath <em>Path</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class NavigationPathImpl extends DataToolAbstractImpl implements NavigationPath {
	/**
	 * The cached value of the '{@link #getPathElements() <em>Path Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathElements()
	 * @generated
	 * @ordered
	 */
	protected EList<NavigationAxis> pathElements;

	/**
	 * The default value of the '{@link #isMany() <em>Many</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMany()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MANY_EDEFAULT = false;

	/**
	 * The default value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected static final String PATH_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NavigationPathImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatatoolsPackage.Literals.NAVIGATION_PATH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NavigationAxis> getPathElements() {
		if (pathElements == null) {
			pathElements = new EObjectContainmentWithInverseEList<NavigationAxis>(NavigationAxis.class, this, DatatoolsPackage.NAVIGATION_PATH__PATH_ELEMENTS, DatatoolsPackage.NAVIGATION_AXIS__PATH);
		}
		return pathElements;
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
	 * @generated
	 */
	public EClass basicGetSourceType() {
		// TODO: implement this method to return the 'Source Type' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
		return Util.NavigationPathGetTargetType(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public boolean isMany() {
		// TODO: implement this method to return the 'Many' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	
	@Override
	public DataToolType getType() {
		return DataToolType.PATH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public String getPath() {
		return Util.getNavigationPath(this);
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
			case DatatoolsPackage.NAVIGATION_PATH__PATH_ELEMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPathElements()).basicAdd(otherEnd, msgs);
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
			case DatatoolsPackage.NAVIGATION_PATH__PATH_ELEMENTS:
				return ((InternalEList<?>)getPathElements()).basicRemove(otherEnd, msgs);
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
			case DatatoolsPackage.NAVIGATION_PATH__PATH_ELEMENTS:
				return getPathElements();
			case DatatoolsPackage.NAVIGATION_PATH__SOURCE_TYPE:
				if (resolve) return getSourceType();
				return basicGetSourceType();
			case DatatoolsPackage.NAVIGATION_PATH__TARGET_TYPE:
				if (resolve) return getTargetType();
				return basicGetTargetType();
			case DatatoolsPackage.NAVIGATION_PATH__MANY:
				return isMany();
			case DatatoolsPackage.NAVIGATION_PATH__PATH:
				return getPath();
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
			case DatatoolsPackage.NAVIGATION_PATH__PATH_ELEMENTS:
				getPathElements().clear();
				getPathElements().addAll((Collection<? extends NavigationAxis>)newValue);
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
			case DatatoolsPackage.NAVIGATION_PATH__PATH_ELEMENTS:
				getPathElements().clear();
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
			case DatatoolsPackage.NAVIGATION_PATH__PATH_ELEMENTS:
				return pathElements != null && !pathElements.isEmpty();
			case DatatoolsPackage.NAVIGATION_PATH__SOURCE_TYPE:
				return basicGetSourceType() != null;
			case DatatoolsPackage.NAVIGATION_PATH__TARGET_TYPE:
				return basicGetTargetType() != null;
			case DatatoolsPackage.NAVIGATION_PATH__MANY:
				return isMany() != MANY_EDEFAULT;
			case DatatoolsPackage.NAVIGATION_PATH__PATH:
				return PATH_EDEFAULT == null ? getPath() != null : !PATH_EDEFAULT.equals(getPath());
		}
		return super.eIsSet(featureID);
	}

} //NavigationPathImpl
