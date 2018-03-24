/**
 */
package com.misc.common.moplaf.serialize.impl;

import com.misc.common.moplaf.common.EnabledFeedback;
import com.misc.common.moplaf.file.File;
import com.misc.common.moplaf.file.Plugin;
import com.misc.common.moplaf.file.impl.FileReaderWriterImpl;
import com.misc.common.moplaf.serialize.Deserializable;
import com.misc.common.moplaf.serialize.SerializePackage;
import com.misc.common.moplaf.serialize.util.Util;

import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deserializable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.serialize.impl.DeserializableImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.misc.common.moplaf.serialize.impl.DeserializableImpl#getScheme <em>Scheme</em>}</li>
 *   <li>{@link com.misc.common.moplaf.serialize.impl.DeserializableImpl#getOwnedObjects <em>Owned Objects</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeserializableImpl extends FileReaderWriterImpl implements Deserializable {
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
	 * The cached value of the '{@link #getOwnedObjects() <em>Owned Objects</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedObjects()
	 * @generated
	 * @ordered
	 */
	protected EList<EObject> ownedObjects;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeserializableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SerializePackage.Literals.DESERIALIZABLE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SerializePackage.DESERIALIZABLE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SerializePackage.DESERIALIZABLE__SCHEME, oldScheme, scheme));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getOwnedObjects() {
		if (ownedObjects == null) {
			ownedObjects = new EObjectContainmentEList<EObject>(EObject.class, this, SerializePackage.DESERIALIZABLE__OWNED_OBJECTS);
		}
		return ownedObjects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public void writeFile(File file) {
		Writer writer = file.getWriter();
		Util.serialize(this.getScheme(), this.getOwnedObjects(), writer);
		try {
			writer.close();
		} catch (IOException e) {
			Plugin.INSTANCE.logError("Deserialize.writeFile, exception "+e.getMessage());
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public void readFile(File file) {
		Reader reader = file.getReader();
		Util.deserialize(this.getScheme(), this.getOwnedObjects(), reader);
		try {
			reader.close();
		} catch (IOException e) {
			Plugin.INSTANCE.logError("Deserialize.readFile, exception "+e.getMessage());
		}
	}

	@Override
	public EnabledFeedback getReadFeedbackImpl(File file) {
		return EnabledFeedback.NOFEEDBACK;
	}

	@Override
	public EnabledFeedback getWriteFeedbackImpl(File file) {
		return EnabledFeedback.NOFEEDBACK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SerializePackage.DESERIALIZABLE__OWNED_OBJECTS:
				return ((InternalEList<?>)getOwnedObjects()).basicRemove(otherEnd, msgs);
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
			case SerializePackage.DESERIALIZABLE__NAME:
				return getName();
			case SerializePackage.DESERIALIZABLE__SCHEME:
				return getScheme();
			case SerializePackage.DESERIALIZABLE__OWNED_OBJECTS:
				return getOwnedObjects();
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
			case SerializePackage.DESERIALIZABLE__NAME:
				setName((String)newValue);
				return;
			case SerializePackage.DESERIALIZABLE__SCHEME:
				setScheme((String)newValue);
				return;
			case SerializePackage.DESERIALIZABLE__OWNED_OBJECTS:
				getOwnedObjects().clear();
				getOwnedObjects().addAll((Collection<? extends EObject>)newValue);
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
			case SerializePackage.DESERIALIZABLE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SerializePackage.DESERIALIZABLE__SCHEME:
				setScheme(SCHEME_EDEFAULT);
				return;
			case SerializePackage.DESERIALIZABLE__OWNED_OBJECTS:
				getOwnedObjects().clear();
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
			case SerializePackage.DESERIALIZABLE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SerializePackage.DESERIALIZABLE__SCHEME:
				return SCHEME_EDEFAULT == null ? scheme != null : !SCHEME_EDEFAULT.equals(scheme);
			case SerializePackage.DESERIALIZABLE__OWNED_OBJECTS:
				return ownedObjects != null && !ownedObjects.isEmpty();
		}
		return super.eIsSet(featureID);
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

} //DeserializableImpl
