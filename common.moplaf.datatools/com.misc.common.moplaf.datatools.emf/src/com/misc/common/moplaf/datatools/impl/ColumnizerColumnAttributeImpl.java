/**
 */
package com.misc.common.moplaf.datatools.impl;

import com.misc.common.moplaf.datatools.ColumnizerColumnAttribute;
import com.misc.common.moplaf.datatools.DataTool;
import com.misc.common.moplaf.datatools.DataTools;
import com.misc.common.moplaf.datatools.DatatoolsPackage;
import com.misc.common.moplaf.datatools.NavigationAxis;
import com.misc.common.moplaf.datatools.NavigationPath;
import com.misc.common.moplaf.datatools.util.Util;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Columnizer Column Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.datatools.impl.ColumnizerColumnAttributeImpl#getContext <em>Context</em>}</li>
 *   <li>{@link com.misc.common.moplaf.datatools.impl.ColumnizerColumnAttributeImpl#getPathElements <em>Path Elements</em>}</li>
 *   <li>{@link com.misc.common.moplaf.datatools.impl.ColumnizerColumnAttributeImpl#getSourceType <em>Source Type</em>}</li>
 *   <li>{@link com.misc.common.moplaf.datatools.impl.ColumnizerColumnAttributeImpl#getTargetType <em>Target Type</em>}</li>
 *   <li>{@link com.misc.common.moplaf.datatools.impl.ColumnizerColumnAttributeImpl#isMany <em>Many</em>}</li>
 *   <li>{@link com.misc.common.moplaf.datatools.impl.ColumnizerColumnAttributeImpl#getPath <em>Path</em>}</li>
 *   <li>{@link com.misc.common.moplaf.datatools.impl.ColumnizerColumnAttributeImpl#getAttribute <em>Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ColumnizerColumnAttributeImpl extends ColumnizerColumnImpl implements ColumnizerColumnAttribute {
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
	 * The cached value of the '{@link #getSourceType() <em>Source Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceType()
	 * @generated
	 * @ordered
	 */
	protected EClass sourceType;

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
	 * The cached value of the '{@link #getAttribute() <em>Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttribute()
	 * @generated
	 * @ordered
	 */
	protected EAttribute attribute;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ColumnizerColumnAttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatatoolsPackage.Literals.COLUMNIZER_COLUMN_ATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataTools getContext() {
		DataTools context = basicGetContext();
		return context != null && context.eIsProxy() ? (DataTools)eResolveProxy((InternalEObject)context) : context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public DataTools basicGetContext() {
		return this.getColumnizer().getContext();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NavigationAxis> getPathElements() {
		if (pathElements == null) {
			pathElements = new EObjectContainmentWithInverseEList<NavigationAxis>(NavigationAxis.class, this, DatatoolsPackage.COLUMNIZER_COLUMN_ATTRIBUTE__PATH_ELEMENTS, DatatoolsPackage.NAVIGATION_AXIS__PATH);
		}
		return pathElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSourceType() {
		if (sourceType != null && sourceType.eIsProxy()) {
			InternalEObject oldSourceType = (InternalEObject)sourceType;
			sourceType = (EClass)eResolveProxy(oldSourceType);
			if (sourceType != oldSourceType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DatatoolsPackage.COLUMNIZER_COLUMN_ATTRIBUTE__SOURCE_TYPE, oldSourceType, sourceType));
			}
		}
		return sourceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass basicGetSourceType() {
		return sourceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceType(EClass newSourceType) {
		EClass oldSourceType = sourceType;
		sourceType = newSourceType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatoolsPackage.COLUMNIZER_COLUMN_ATTRIBUTE__SOURCE_TYPE, oldSourceType, sourceType));
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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute() {
		if (attribute != null && attribute.eIsProxy()) {
			InternalEObject oldAttribute = (InternalEObject)attribute;
			attribute = (EAttribute)eResolveProxy(oldAttribute);
			if (attribute != oldAttribute) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DatatoolsPackage.COLUMNIZER_COLUMN_ATTRIBUTE__ATTRIBUTE, oldAttribute, attribute));
			}
		}
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute basicGetAttribute() {
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttribute(EAttribute newAttribute) {
		EAttribute oldAttribute = attribute;
		attribute = newAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatoolsPackage.COLUMNIZER_COLUMN_ATTRIBUTE__ATTRIBUTE, oldAttribute, attribute));
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
			case DatatoolsPackage.COLUMNIZER_COLUMN_ATTRIBUTE__PATH_ELEMENTS:
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
			case DatatoolsPackage.COLUMNIZER_COLUMN_ATTRIBUTE__PATH_ELEMENTS:
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
			case DatatoolsPackage.COLUMNIZER_COLUMN_ATTRIBUTE__CONTEXT:
				if (resolve) return getContext();
				return basicGetContext();
			case DatatoolsPackage.COLUMNIZER_COLUMN_ATTRIBUTE__PATH_ELEMENTS:
				return getPathElements();
			case DatatoolsPackage.COLUMNIZER_COLUMN_ATTRIBUTE__SOURCE_TYPE:
				if (resolve) return getSourceType();
				return basicGetSourceType();
			case DatatoolsPackage.COLUMNIZER_COLUMN_ATTRIBUTE__TARGET_TYPE:
				if (resolve) return getTargetType();
				return basicGetTargetType();
			case DatatoolsPackage.COLUMNIZER_COLUMN_ATTRIBUTE__MANY:
				return isMany();
			case DatatoolsPackage.COLUMNIZER_COLUMN_ATTRIBUTE__PATH:
				return getPath();
			case DatatoolsPackage.COLUMNIZER_COLUMN_ATTRIBUTE__ATTRIBUTE:
				if (resolve) return getAttribute();
				return basicGetAttribute();
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
			case DatatoolsPackage.COLUMNIZER_COLUMN_ATTRIBUTE__PATH_ELEMENTS:
				getPathElements().clear();
				getPathElements().addAll((Collection<? extends NavigationAxis>)newValue);
				return;
			case DatatoolsPackage.COLUMNIZER_COLUMN_ATTRIBUTE__SOURCE_TYPE:
				setSourceType((EClass)newValue);
				return;
			case DatatoolsPackage.COLUMNIZER_COLUMN_ATTRIBUTE__ATTRIBUTE:
				setAttribute((EAttribute)newValue);
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
			case DatatoolsPackage.COLUMNIZER_COLUMN_ATTRIBUTE__PATH_ELEMENTS:
				getPathElements().clear();
				return;
			case DatatoolsPackage.COLUMNIZER_COLUMN_ATTRIBUTE__SOURCE_TYPE:
				setSourceType((EClass)null);
				return;
			case DatatoolsPackage.COLUMNIZER_COLUMN_ATTRIBUTE__ATTRIBUTE:
				setAttribute((EAttribute)null);
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
			case DatatoolsPackage.COLUMNIZER_COLUMN_ATTRIBUTE__CONTEXT:
				return basicGetContext() != null;
			case DatatoolsPackage.COLUMNIZER_COLUMN_ATTRIBUTE__PATH_ELEMENTS:
				return pathElements != null && !pathElements.isEmpty();
			case DatatoolsPackage.COLUMNIZER_COLUMN_ATTRIBUTE__SOURCE_TYPE:
				return sourceType != null;
			case DatatoolsPackage.COLUMNIZER_COLUMN_ATTRIBUTE__TARGET_TYPE:
				return basicGetTargetType() != null;
			case DatatoolsPackage.COLUMNIZER_COLUMN_ATTRIBUTE__MANY:
				return isMany() != MANY_EDEFAULT;
			case DatatoolsPackage.COLUMNIZER_COLUMN_ATTRIBUTE__PATH:
				return PATH_EDEFAULT == null ? getPath() != null : !PATH_EDEFAULT.equals(getPath());
			case DatatoolsPackage.COLUMNIZER_COLUMN_ATTRIBUTE__ATTRIBUTE:
				return attribute != null;
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
		if (baseClass == DataTool.class) {
			switch (derivedFeatureID) {
				case DatatoolsPackage.COLUMNIZER_COLUMN_ATTRIBUTE__CONTEXT: return DatatoolsPackage.DATA_TOOL__CONTEXT;
				default: return -1;
			}
		}
		if (baseClass == NavigationPath.class) {
			switch (derivedFeatureID) {
				case DatatoolsPackage.COLUMNIZER_COLUMN_ATTRIBUTE__PATH_ELEMENTS: return DatatoolsPackage.NAVIGATION_PATH__PATH_ELEMENTS;
				case DatatoolsPackage.COLUMNIZER_COLUMN_ATTRIBUTE__SOURCE_TYPE: return DatatoolsPackage.NAVIGATION_PATH__SOURCE_TYPE;
				case DatatoolsPackage.COLUMNIZER_COLUMN_ATTRIBUTE__TARGET_TYPE: return DatatoolsPackage.NAVIGATION_PATH__TARGET_TYPE;
				case DatatoolsPackage.COLUMNIZER_COLUMN_ATTRIBUTE__MANY: return DatatoolsPackage.NAVIGATION_PATH__MANY;
				case DatatoolsPackage.COLUMNIZER_COLUMN_ATTRIBUTE__PATH: return DatatoolsPackage.NAVIGATION_PATH__PATH;
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
		if (baseClass == DataTool.class) {
			switch (baseFeatureID) {
				case DatatoolsPackage.DATA_TOOL__CONTEXT: return DatatoolsPackage.COLUMNIZER_COLUMN_ATTRIBUTE__CONTEXT;
				default: return -1;
			}
		}
		if (baseClass == NavigationPath.class) {
			switch (baseFeatureID) {
				case DatatoolsPackage.NAVIGATION_PATH__PATH_ELEMENTS: return DatatoolsPackage.COLUMNIZER_COLUMN_ATTRIBUTE__PATH_ELEMENTS;
				case DatatoolsPackage.NAVIGATION_PATH__SOURCE_TYPE: return DatatoolsPackage.COLUMNIZER_COLUMN_ATTRIBUTE__SOURCE_TYPE;
				case DatatoolsPackage.NAVIGATION_PATH__TARGET_TYPE: return DatatoolsPackage.COLUMNIZER_COLUMN_ATTRIBUTE__TARGET_TYPE;
				case DatatoolsPackage.NAVIGATION_PATH__MANY: return DatatoolsPackage.COLUMNIZER_COLUMN_ATTRIBUTE__MANY;
				case DatatoolsPackage.NAVIGATION_PATH__PATH: return DatatoolsPackage.COLUMNIZER_COLUMN_ATTRIBUTE__PATH;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ColumnizerColumnAttributeImpl
