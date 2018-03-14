/**
 */
package com.misc.common.moplaf.serialize.impl;

import com.misc.common.moplaf.file.File;

import com.misc.common.moplaf.serialize.Serializable;
import com.misc.common.moplaf.serialize.SerializePackage;
import com.misc.common.moplaf.serialize.Util;

import java.io.IOException;
import java.io.Writer;
import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Serializable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.serialize.impl.SerializableImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.misc.common.moplaf.serialize.impl.SerializableImpl#getScheme <em>Scheme</em>}</li>
 *   <li>{@link com.misc.common.moplaf.serialize.impl.SerializableImpl#getSelectedObjects <em>Selected Objects</em>}</li>
 *   <li>{@link com.misc.common.moplaf.serialize.impl.SerializableImpl#getFiles <em>Files</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SerializableImpl extends MinimalEObjectImpl.Container implements Serializable {
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
	 * The default value of the '{@link #getScheme() <em>Scheme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheme()
	 * @generated
	 * @ordered
	 */
	protected static final String SCHEME_EDEFAULT = "com.misc.common.moplaf.emf.serialize.xmi.schemes.xmi";

	/**
	 * The cached value of the '{@link #getScheme() <em>Scheme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheme()
	 * @generated
	 * @ordered
	 */
	protected String scheme = SCHEME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSelectedObjects() <em>Selected Objects</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectedObjects()
	 * @generated
	 * @ordered
	 */
	protected EList<EObject> selectedObjects;

	/**
	 * The cached value of the '{@link #getFiles() <em>Files</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFiles()
	 * @generated
	 * @ordered
	 */
	protected EList<File> files;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SerializableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SerializePackage.Literals.SERIALIZABLE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SerializePackage.SERIALIZABLE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<File> getFiles() {
		if (files == null) {
			files = new EObjectContainmentEList<File>(File.class, this, SerializePackage.SERIALIZABLE__FILES);
		}
		return files;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getScheme() {
		return scheme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScheme(String newScheme) {
		String oldScheme = scheme;
		scheme = newScheme;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SerializePackage.SERIALIZABLE__SCHEME, oldScheme, scheme));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getSelectedObjects() {
		if (selectedObjects == null) {
			selectedObjects = new EObjectResolvingEList<EObject>(EObject.class, this, SerializePackage.SERIALIZABLE__SELECTED_OBJECTS);
		}
		return selectedObjects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void writeFile(File file) {
		Writer writer = file.getWriter();
		Util.serialize(this.getScheme(), this.getSelectedObjects(), writer);
		try {
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SerializePackage.SERIALIZABLE__FILES:
				return ((InternalEList<?>)getFiles()).basicRemove(otherEnd, msgs);
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
			case SerializePackage.SERIALIZABLE__NAME:
				return getName();
			case SerializePackage.SERIALIZABLE__SCHEME:
				return getScheme();
			case SerializePackage.SERIALIZABLE__SELECTED_OBJECTS:
				return getSelectedObjects();
			case SerializePackage.SERIALIZABLE__FILES:
				return getFiles();
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
			case SerializePackage.SERIALIZABLE__NAME:
				setName((String)newValue);
				return;
			case SerializePackage.SERIALIZABLE__SCHEME:
				setScheme((String)newValue);
				return;
			case SerializePackage.SERIALIZABLE__SELECTED_OBJECTS:
				getSelectedObjects().clear();
				getSelectedObjects().addAll((Collection<? extends EObject>)newValue);
				return;
			case SerializePackage.SERIALIZABLE__FILES:
				getFiles().clear();
				getFiles().addAll((Collection<? extends File>)newValue);
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
			case SerializePackage.SERIALIZABLE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SerializePackage.SERIALIZABLE__SCHEME:
				setScheme(SCHEME_EDEFAULT);
				return;
			case SerializePackage.SERIALIZABLE__SELECTED_OBJECTS:
				getSelectedObjects().clear();
				return;
			case SerializePackage.SERIALIZABLE__FILES:
				getFiles().clear();
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
			case SerializePackage.SERIALIZABLE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SerializePackage.SERIALIZABLE__SCHEME:
				return SCHEME_EDEFAULT == null ? scheme != null : !SCHEME_EDEFAULT.equals(scheme);
			case SerializePackage.SERIALIZABLE__SELECTED_OBJECTS:
				return selectedObjects != null && !selectedObjects.isEmpty();
			case SerializePackage.SERIALIZABLE__FILES:
				return files != null && !files.isEmpty();
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
			case SerializePackage.SERIALIZABLE___WRITE_FILE__FILE:
				writeFile((File)arguments.get(0));
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
		result.append(" (Name: ");
		result.append(name);
		result.append(", Scheme: ");
		result.append(scheme);
		result.append(')');
		return result.toString();
	}

} //SerializableImpl
