/**
 */
package com.misc.common.moplaf.datatools.impl;

import com.misc.common.moplaf.datatools.DatatoolsPackage;
import com.misc.common.moplaf.datatools.ExtractorPath;
import com.misc.common.moplaf.datatools.NavigationAxis;
import com.misc.common.moplaf.datatools.NavigationPath;
import com.misc.common.moplaf.datatools.util.ObjectSet;
import com.misc.common.moplaf.datatools.util.Util;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extractor Path</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.datatools.impl.ExtractorPathImpl#getPathElements <em>Path Elements</em>}</li>
 *   <li>{@link com.misc.common.moplaf.datatools.impl.ExtractorPathImpl#getSourceType <em>Source Type</em>}</li>
 *   <li>{@link com.misc.common.moplaf.datatools.impl.ExtractorPathImpl#getTargetType <em>Target Type</em>}</li>
 *   <li>{@link com.misc.common.moplaf.datatools.impl.ExtractorPathImpl#isMany <em>Many</em>}</li>
 *   <li>{@link com.misc.common.moplaf.datatools.impl.ExtractorPathImpl#getPath <em>Path</em>}</li>
 *   <li>{@link com.misc.common.moplaf.datatools.impl.ExtractorPathImpl#getRootType <em>Root Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExtractorPathImpl extends ExtractorImpl implements ExtractorPath {
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
	 * The cached value of the '{@link #getRootType() <em>Root Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootType()
	 * @generated
	 * @ordered
	 */
	protected EClass rootType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtractorPathImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatatoolsPackage.Literals.EXTRACTOR_PATH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NavigationAxis> getPathElements() {
		if (pathElements == null) {
			pathElements = new EObjectContainmentWithInverseEList<NavigationAxis>(NavigationAxis.class, this, DatatoolsPackage.EXTRACTOR_PATH__PATH_ELEMENTS, DatatoolsPackage.NAVIGATION_AXIS__PATH);
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
	 */
	public EClass basicGetSourceType() {
		return this.getRootType();
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
		return true;
	}
	
	@Override
	public EClass basicGetExtractedType() {
		return this.getTargetType();
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
	public EClass getRootType() {
		if (rootType != null && rootType.eIsProxy()) {
			InternalEObject oldRootType = (InternalEObject)rootType;
			rootType = (EClass)eResolveProxy(oldRootType);
			if (rootType != oldRootType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DatatoolsPackage.EXTRACTOR_PATH__ROOT_TYPE, oldRootType, rootType));
			}
		}
		return rootType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass basicGetRootType() {
		return rootType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRootType(EClass newRootType) {
		EClass oldRootType = rootType;
		rootType = newRootType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatoolsPackage.EXTRACTOR_PATH__ROOT_TYPE, oldRootType, rootType));
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
			case DatatoolsPackage.EXTRACTOR_PATH__PATH_ELEMENTS:
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
			case DatatoolsPackage.EXTRACTOR_PATH__PATH_ELEMENTS:
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
			case DatatoolsPackage.EXTRACTOR_PATH__PATH_ELEMENTS:
				return getPathElements();
			case DatatoolsPackage.EXTRACTOR_PATH__SOURCE_TYPE:
				if (resolve) return getSourceType();
				return basicGetSourceType();
			case DatatoolsPackage.EXTRACTOR_PATH__TARGET_TYPE:
				if (resolve) return getTargetType();
				return basicGetTargetType();
			case DatatoolsPackage.EXTRACTOR_PATH__MANY:
				return isMany();
			case DatatoolsPackage.EXTRACTOR_PATH__PATH:
				return getPath();
			case DatatoolsPackage.EXTRACTOR_PATH__ROOT_TYPE:
				if (resolve) return getRootType();
				return basicGetRootType();
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
			case DatatoolsPackage.EXTRACTOR_PATH__PATH_ELEMENTS:
				getPathElements().clear();
				getPathElements().addAll((Collection<? extends NavigationAxis>)newValue);
				return;
			case DatatoolsPackage.EXTRACTOR_PATH__ROOT_TYPE:
				setRootType((EClass)newValue);
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
			case DatatoolsPackage.EXTRACTOR_PATH__PATH_ELEMENTS:
				getPathElements().clear();
				return;
			case DatatoolsPackage.EXTRACTOR_PATH__ROOT_TYPE:
				setRootType((EClass)null);
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
			case DatatoolsPackage.EXTRACTOR_PATH__PATH_ELEMENTS:
				return pathElements != null && !pathElements.isEmpty();
			case DatatoolsPackage.EXTRACTOR_PATH__SOURCE_TYPE:
				return basicGetSourceType() != null;
			case DatatoolsPackage.EXTRACTOR_PATH__TARGET_TYPE:
				return basicGetTargetType() != null;
			case DatatoolsPackage.EXTRACTOR_PATH__MANY:
				return isMany() != MANY_EDEFAULT;
			case DatatoolsPackage.EXTRACTOR_PATH__PATH:
				return PATH_EDEFAULT == null ? getPath() != null : !PATH_EDEFAULT.equals(getPath());
			case DatatoolsPackage.EXTRACTOR_PATH__ROOT_TYPE:
				return rootType != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == NavigationPath.class) {
			switch (derivedFeatureID) {
				case DatatoolsPackage.EXTRACTOR_PATH__PATH_ELEMENTS: return DatatoolsPackage.NAVIGATION_PATH__PATH_ELEMENTS;
				case DatatoolsPackage.EXTRACTOR_PATH__SOURCE_TYPE: return DatatoolsPackage.NAVIGATION_PATH__SOURCE_TYPE;
				case DatatoolsPackage.EXTRACTOR_PATH__TARGET_TYPE: return DatatoolsPackage.NAVIGATION_PATH__TARGET_TYPE;
				case DatatoolsPackage.EXTRACTOR_PATH__MANY: return DatatoolsPackage.NAVIGATION_PATH__MANY;
				case DatatoolsPackage.EXTRACTOR_PATH__PATH: return DatatoolsPackage.NAVIGATION_PATH__PATH;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == NavigationPath.class) {
			switch (baseFeatureID) {
				case DatatoolsPackage.NAVIGATION_PATH__PATH_ELEMENTS: return DatatoolsPackage.EXTRACTOR_PATH__PATH_ELEMENTS;
				case DatatoolsPackage.NAVIGATION_PATH__SOURCE_TYPE: return DatatoolsPackage.EXTRACTOR_PATH__SOURCE_TYPE;
				case DatatoolsPackage.NAVIGATION_PATH__TARGET_TYPE: return DatatoolsPackage.EXTRACTOR_PATH__TARGET_TYPE;
				case DatatoolsPackage.NAVIGATION_PATH__MANY: return DatatoolsPackage.EXTRACTOR_PATH__MANY;
				case DatatoolsPackage.NAVIGATION_PATH__PATH: return DatatoolsPackage.EXTRACTOR_PATH__PATH;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public boolean isValidRoot(EObject doc) {
		EClass source_type = this.getSourceType();
		if ( source_type==null ) {
			return false;
		}
		if ( !source_type.isInstance(doc)) {
			return false;
		}
		return true;
	}

	@Override
	protected void collectParamsDescription(List<String> params) {
		params.add(String.format("path: %s", this.getPath()));
	}

	@Override
	protected String getTypeDescription() {
		return "Extractor path";
	}

	@Override
	protected ObjectSet extractImpl(ObjectSet ins, int max_elements) {
		return Util.navigate(this,  ins, max_elements);
	}

} //ExtractorPathImpl
