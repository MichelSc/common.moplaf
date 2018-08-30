/**
 */
package com.misc.common.moplaf.datatools.impl;

import com.misc.common.moplaf.datatools.CategorizerStructuralFeature;
import com.misc.common.moplaf.datatools.DatatoolsPackage;
import com.misc.common.moplaf.datatools.NavigationAxis;
import com.misc.common.moplaf.datatools.NavigationPath;
import com.misc.common.moplaf.datatools.util.Util;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Categorizer Structural Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.datatools.impl.CategorizerStructuralFeatureImpl#getPathElements <em>Path Elements</em>}</li>
 *   <li>{@link com.misc.common.moplaf.datatools.impl.CategorizerStructuralFeatureImpl#getSourceType <em>Source Type</em>}</li>
 *   <li>{@link com.misc.common.moplaf.datatools.impl.CategorizerStructuralFeatureImpl#getTargetType <em>Target Type</em>}</li>
 *   <li>{@link com.misc.common.moplaf.datatools.impl.CategorizerStructuralFeatureImpl#isMany <em>Many</em>}</li>
 *   <li>{@link com.misc.common.moplaf.datatools.impl.CategorizerStructuralFeatureImpl#getPath <em>Path</em>}</li>
 *   <li>{@link com.misc.common.moplaf.datatools.impl.CategorizerStructuralFeatureImpl#getFeature <em>Feature</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CategorizerStructuralFeatureImpl extends CategorizerImpl implements CategorizerStructuralFeature {
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
	 * The cached value of the '{@link #getFeature() <em>Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeature()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature feature;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CategorizerStructuralFeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatatoolsPackage.Literals.CATEGORIZER_STRUCTURAL_FEATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NavigationAxis> getPathElements() {
		if (pathElements == null) {
			pathElements = new EObjectContainmentWithInverseEList<NavigationAxis>(NavigationAxis.class, this, DatatoolsPackage.CATEGORIZER_STRUCTURAL_FEATURE__PATH_ELEMENTS, DatatoolsPackage.NAVIGATION_AXIS__PATH);
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
		return this.getCategorizedType();
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
		return false;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public String getPath() {
		return Util.getNavigationPath(this);
	}
	
	@Override
	protected void collectParamsDescription(List<String> params) {
		params.add(String.format("path: %s", this.getPath()));
	}

	@Override
	protected String getTypeDescription() {
		String feature = this.getFeature()==null ? "null" : this.getFeature().getName();
		return String.format("Categorizer feature %s", feature);
	}

	/** 
	 * Specified by Categorizer
	 * 
	 */
	@Override
	public Object getCategoryValue(EObject object) {
		EClass target_type = this.getTargetType();
		if ( target_type==null ) {
			return null;
		}
		if ( !target_type.isSuperTypeOf(object.eClass())) {
			return null;
		}
		EStructuralFeature feature = this.getFeature();
		if ( feature == null ) {
			return null;
		}
		return object.eGet(feature);
	}

	
	
	/** 
	 * Specified by Categorizer
	 * 
	 */
	@Override
	protected boolean isValidElementTypeImpl(EClass type) {
		if ( this.getSourceType()==null ) {
			return false;
		}
		return this.getSourceType().isSuperTypeOf(type);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EStructuralFeature getFeature() {
		if (feature != null && feature.eIsProxy()) {
			InternalEObject oldFeature = (InternalEObject)feature;
			feature = (EStructuralFeature)eResolveProxy(oldFeature);
			if (feature != oldFeature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DatatoolsPackage.CATEGORIZER_STRUCTURAL_FEATURE__FEATURE, oldFeature, feature));
			}
		}
		return feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EStructuralFeature basicGetFeature() {
		return feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeature(EStructuralFeature newFeature) {
		EStructuralFeature oldFeature = feature;
		feature = newFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatoolsPackage.CATEGORIZER_STRUCTURAL_FEATURE__FEATURE, oldFeature, feature));
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
			case DatatoolsPackage.CATEGORIZER_STRUCTURAL_FEATURE__PATH_ELEMENTS:
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
			case DatatoolsPackage.CATEGORIZER_STRUCTURAL_FEATURE__PATH_ELEMENTS:
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
			case DatatoolsPackage.CATEGORIZER_STRUCTURAL_FEATURE__PATH_ELEMENTS:
				return getPathElements();
			case DatatoolsPackage.CATEGORIZER_STRUCTURAL_FEATURE__SOURCE_TYPE:
				if (resolve) return getSourceType();
				return basicGetSourceType();
			case DatatoolsPackage.CATEGORIZER_STRUCTURAL_FEATURE__TARGET_TYPE:
				if (resolve) return getTargetType();
				return basicGetTargetType();
			case DatatoolsPackage.CATEGORIZER_STRUCTURAL_FEATURE__MANY:
				return isMany();
			case DatatoolsPackage.CATEGORIZER_STRUCTURAL_FEATURE__PATH:
				return getPath();
			case DatatoolsPackage.CATEGORIZER_STRUCTURAL_FEATURE__FEATURE:
				if (resolve) return getFeature();
				return basicGetFeature();
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
			case DatatoolsPackage.CATEGORIZER_STRUCTURAL_FEATURE__PATH_ELEMENTS:
				getPathElements().clear();
				getPathElements().addAll((Collection<? extends NavigationAxis>)newValue);
				return;
			case DatatoolsPackage.CATEGORIZER_STRUCTURAL_FEATURE__FEATURE:
				setFeature((EStructuralFeature)newValue);
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
			case DatatoolsPackage.CATEGORIZER_STRUCTURAL_FEATURE__PATH_ELEMENTS:
				getPathElements().clear();
				return;
			case DatatoolsPackage.CATEGORIZER_STRUCTURAL_FEATURE__FEATURE:
				setFeature((EStructuralFeature)null);
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
			case DatatoolsPackage.CATEGORIZER_STRUCTURAL_FEATURE__PATH_ELEMENTS:
				return pathElements != null && !pathElements.isEmpty();
			case DatatoolsPackage.CATEGORIZER_STRUCTURAL_FEATURE__SOURCE_TYPE:
				return basicGetSourceType() != null;
			case DatatoolsPackage.CATEGORIZER_STRUCTURAL_FEATURE__TARGET_TYPE:
				return basicGetTargetType() != null;
			case DatatoolsPackage.CATEGORIZER_STRUCTURAL_FEATURE__MANY:
				return isMany() != MANY_EDEFAULT;
			case DatatoolsPackage.CATEGORIZER_STRUCTURAL_FEATURE__PATH:
				return PATH_EDEFAULT == null ? getPath() != null : !PATH_EDEFAULT.equals(getPath());
			case DatatoolsPackage.CATEGORIZER_STRUCTURAL_FEATURE__FEATURE:
				return feature != null;
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
				case DatatoolsPackage.CATEGORIZER_STRUCTURAL_FEATURE__PATH_ELEMENTS: return DatatoolsPackage.NAVIGATION_PATH__PATH_ELEMENTS;
				case DatatoolsPackage.CATEGORIZER_STRUCTURAL_FEATURE__SOURCE_TYPE: return DatatoolsPackage.NAVIGATION_PATH__SOURCE_TYPE;
				case DatatoolsPackage.CATEGORIZER_STRUCTURAL_FEATURE__TARGET_TYPE: return DatatoolsPackage.NAVIGATION_PATH__TARGET_TYPE;
				case DatatoolsPackage.CATEGORIZER_STRUCTURAL_FEATURE__MANY: return DatatoolsPackage.NAVIGATION_PATH__MANY;
				case DatatoolsPackage.CATEGORIZER_STRUCTURAL_FEATURE__PATH: return DatatoolsPackage.NAVIGATION_PATH__PATH;
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
				case DatatoolsPackage.NAVIGATION_PATH__PATH_ELEMENTS: return DatatoolsPackage.CATEGORIZER_STRUCTURAL_FEATURE__PATH_ELEMENTS;
				case DatatoolsPackage.NAVIGATION_PATH__SOURCE_TYPE: return DatatoolsPackage.CATEGORIZER_STRUCTURAL_FEATURE__SOURCE_TYPE;
				case DatatoolsPackage.NAVIGATION_PATH__TARGET_TYPE: return DatatoolsPackage.CATEGORIZER_STRUCTURAL_FEATURE__TARGET_TYPE;
				case DatatoolsPackage.NAVIGATION_PATH__MANY: return DatatoolsPackage.CATEGORIZER_STRUCTURAL_FEATURE__MANY;
				case DatatoolsPackage.NAVIGATION_PATH__PATH: return DatatoolsPackage.CATEGORIZER_STRUCTURAL_FEATURE__PATH;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //CategorizerStructuralFeatureImpl
