/**
 */
package com.misc.common.moplaf.job.impl;

import com.misc.common.moplaf.job.Doc;
import com.misc.common.moplaf.job.DocInDocsHolder;
import com.misc.common.moplaf.job.DocsHolder;
import com.misc.common.moplaf.job.JobFactory;
import com.misc.common.moplaf.job.JobPackage;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Docs Holder</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.job.impl.DocsHolderImpl#getDocs <em>Docs</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.impl.DocsHolderImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DocsHolderImpl extends MinimalEObjectImpl.Container implements DocsHolder {
	/**
	 * The cached value of the '{@link #getDocs() <em>Docs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocs()
	 * @generated
	 * @ordered
	 */
	protected EList<DocInDocsHolder> docs;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocsHolderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JobPackage.Literals.DOCS_HOLDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DocInDocsHolder> getDocs() {
		if (docs == null) {
			docs = new EObjectContainmentWithInverseEList<DocInDocsHolder>(DocInDocsHolder.class, this, JobPackage.DOCS_HOLDER__DOCS, JobPackage.DOC_IN_DOCS_HOLDER__DOCS_HOLDER);
		}
		return docs;
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
			eNotify(new ENotificationImpl(this, Notification.SET, JobPackage.DOCS_HOLDER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void addDoc(Doc doc) {
		DocInDocsHolder ref = JobFactory.eINSTANCE.createDocInDocsHolder();
		ref.setDoc(doc);
		this.getDocs().add(ref);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void addDocs(EList<Doc> docs) {
		for(Doc doc : docs) {
			this.addDoc(doc);
		}
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
			case JobPackage.DOCS_HOLDER__DOCS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDocs()).basicAdd(otherEnd, msgs);
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
			case JobPackage.DOCS_HOLDER__DOCS:
				return ((InternalEList<?>)getDocs()).basicRemove(otherEnd, msgs);
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
			case JobPackage.DOCS_HOLDER__DOCS:
				return getDocs();
			case JobPackage.DOCS_HOLDER__NAME:
				return getName();
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
			case JobPackage.DOCS_HOLDER__DOCS:
				getDocs().clear();
				getDocs().addAll((Collection<? extends DocInDocsHolder>)newValue);
				return;
			case JobPackage.DOCS_HOLDER__NAME:
				setName((String)newValue);
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
			case JobPackage.DOCS_HOLDER__DOCS:
				getDocs().clear();
				return;
			case JobPackage.DOCS_HOLDER__NAME:
				setName(NAME_EDEFAULT);
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
			case JobPackage.DOCS_HOLDER__DOCS:
				return docs != null && !docs.isEmpty();
			case JobPackage.DOCS_HOLDER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case JobPackage.DOCS_HOLDER___ADD_DOC__DOC:
				addDoc((Doc)arguments.get(0));
				return null;
			case JobPackage.DOCS_HOLDER___ADD_DOCS__ELIST:
				addDocs((EList<Doc>)arguments.get(0));
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (Name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //DocsHolderImpl
