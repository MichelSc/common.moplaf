/**
 */
package com.misc.common.moplaf.datatools.impl;

import com.misc.common.moplaf.datatools.ColumnizerColumn;
import com.misc.common.moplaf.datatools.ColumnizerExplicit;
import com.misc.common.moplaf.datatools.ColumnizerGrid;
import com.misc.common.moplaf.datatools.DatatoolsPackage;

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
 * An implementation of the model object '<em><b>Columnizer Column</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.datatools.impl.ColumnizerColumnImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.misc.common.moplaf.datatools.impl.ColumnizerColumnImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link com.misc.common.moplaf.datatools.impl.ColumnizerColumnImpl#getGrids <em>Grids</em>}</li>
 *   <li>{@link com.misc.common.moplaf.datatools.impl.ColumnizerColumnImpl#getColumnizer <em>Columnizer</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ColumnizerColumnImpl extends MinimalEObjectImpl.Container implements ColumnizerColumn {
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
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final int WIDTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected int width = WIDTH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGrids() <em>Grids</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrids()
	 * @generated
	 * @ordered
	 */
	protected ColumnizerGrid grids;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ColumnizerColumnImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatatoolsPackage.Literals.COLUMNIZER_COLUMN;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DatatoolsPackage.COLUMNIZER_COLUMN__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidth(int newWidth) {
		int oldWidth = width;
		width = newWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatoolsPackage.COLUMNIZER_COLUMN__WIDTH, oldWidth, width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColumnizerGrid getGrids() {
		if (grids != null && grids.eIsProxy()) {
			InternalEObject oldGrids = (InternalEObject)grids;
			grids = (ColumnizerGrid)eResolveProxy(oldGrids);
			if (grids != oldGrids) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DatatoolsPackage.COLUMNIZER_COLUMN__GRIDS, oldGrids, grids));
			}
		}
		return grids;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColumnizerGrid basicGetGrids() {
		return grids;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGrids(ColumnizerGrid newGrids, NotificationChain msgs) {
		ColumnizerGrid oldGrids = grids;
		grids = newGrids;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DatatoolsPackage.COLUMNIZER_COLUMN__GRIDS, oldGrids, newGrids);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGrids(ColumnizerGrid newGrids) {
		if (newGrids != grids) {
			NotificationChain msgs = null;
			if (grids != null)
				msgs = ((InternalEObject)grids).eInverseRemove(this, DatatoolsPackage.COLUMNIZER_GRID__COLUMNS, ColumnizerGrid.class, msgs);
			if (newGrids != null)
				msgs = ((InternalEObject)newGrids).eInverseAdd(this, DatatoolsPackage.COLUMNIZER_GRID__COLUMNS, ColumnizerGrid.class, msgs);
			msgs = basicSetGrids(newGrids, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatoolsPackage.COLUMNIZER_COLUMN__GRIDS, newGrids, newGrids));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColumnizerExplicit getColumnizer() {
		if (eContainerFeatureID() != DatatoolsPackage.COLUMNIZER_COLUMN__COLUMNIZER) return null;
		return (ColumnizerExplicit)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetColumnizer(ColumnizerExplicit newColumnizer, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newColumnizer, DatatoolsPackage.COLUMNIZER_COLUMN__COLUMNIZER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumnizer(ColumnizerExplicit newColumnizer) {
		if (newColumnizer != eInternalContainer() || (eContainerFeatureID() != DatatoolsPackage.COLUMNIZER_COLUMN__COLUMNIZER && newColumnizer != null)) {
			if (EcoreUtil.isAncestor(this, newColumnizer))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newColumnizer != null)
				msgs = ((InternalEObject)newColumnizer).eInverseAdd(this, DatatoolsPackage.COLUMNIZER_EXPLICIT__COLUMNS, ColumnizerExplicit.class, msgs);
			msgs = basicSetColumnizer(newColumnizer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatoolsPackage.COLUMNIZER_COLUMN__COLUMNIZER, newColumnizer, newColumnizer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getValue(EObject object) {
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
			case DatatoolsPackage.COLUMNIZER_COLUMN__GRIDS:
				if (grids != null)
					msgs = ((InternalEObject)grids).eInverseRemove(this, DatatoolsPackage.COLUMNIZER_GRID__COLUMNS, ColumnizerGrid.class, msgs);
				return basicSetGrids((ColumnizerGrid)otherEnd, msgs);
			case DatatoolsPackage.COLUMNIZER_COLUMN__COLUMNIZER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetColumnizer((ColumnizerExplicit)otherEnd, msgs);
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
			case DatatoolsPackage.COLUMNIZER_COLUMN__GRIDS:
				return basicSetGrids(null, msgs);
			case DatatoolsPackage.COLUMNIZER_COLUMN__COLUMNIZER:
				return basicSetColumnizer(null, msgs);
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
			case DatatoolsPackage.COLUMNIZER_COLUMN__COLUMNIZER:
				return eInternalContainer().eInverseRemove(this, DatatoolsPackage.COLUMNIZER_EXPLICIT__COLUMNS, ColumnizerExplicit.class, msgs);
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
			case DatatoolsPackage.COLUMNIZER_COLUMN__NAME:
				return getName();
			case DatatoolsPackage.COLUMNIZER_COLUMN__WIDTH:
				return getWidth();
			case DatatoolsPackage.COLUMNIZER_COLUMN__GRIDS:
				if (resolve) return getGrids();
				return basicGetGrids();
			case DatatoolsPackage.COLUMNIZER_COLUMN__COLUMNIZER:
				return getColumnizer();
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
			case DatatoolsPackage.COLUMNIZER_COLUMN__NAME:
				setName((String)newValue);
				return;
			case DatatoolsPackage.COLUMNIZER_COLUMN__WIDTH:
				setWidth((Integer)newValue);
				return;
			case DatatoolsPackage.COLUMNIZER_COLUMN__GRIDS:
				setGrids((ColumnizerGrid)newValue);
				return;
			case DatatoolsPackage.COLUMNIZER_COLUMN__COLUMNIZER:
				setColumnizer((ColumnizerExplicit)newValue);
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
			case DatatoolsPackage.COLUMNIZER_COLUMN__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DatatoolsPackage.COLUMNIZER_COLUMN__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case DatatoolsPackage.COLUMNIZER_COLUMN__GRIDS:
				setGrids((ColumnizerGrid)null);
				return;
			case DatatoolsPackage.COLUMNIZER_COLUMN__COLUMNIZER:
				setColumnizer((ColumnizerExplicit)null);
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
			case DatatoolsPackage.COLUMNIZER_COLUMN__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DatatoolsPackage.COLUMNIZER_COLUMN__WIDTH:
				return width != WIDTH_EDEFAULT;
			case DatatoolsPackage.COLUMNIZER_COLUMN__GRIDS:
				return grids != null;
			case DatatoolsPackage.COLUMNIZER_COLUMN__COLUMNIZER:
				return getColumnizer() != null;
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
			case DatatoolsPackage.COLUMNIZER_COLUMN___GET_VALUE__EOBJECT:
				return getValue((EObject)arguments.get(0));
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (Name: ");
		result.append(name);
		result.append(", Width: ");
		result.append(width);
		result.append(')');
		return result.toString();
	}

} //ColumnizerColumnImpl
