/**
 */
package com.misc.common.moplaf.job.impl;

import com.misc.common.moplaf.job.Doc;
import com.misc.common.moplaf.job.DocRef;
import com.misc.common.moplaf.job.JobPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Doc Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.job.impl.DocRefImpl#getDoc <em>Doc</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class DocRefImpl extends MinimalEObjectImpl.Container implements DocRef {
	/**
	 * The cached value of the '{@link #getDoc() <em>Doc</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoc()
	 * @generated
	 * @ordered
	 */
	protected Doc doc;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocRefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JobPackage.Literals.DOC_REF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Doc getDoc() {
		if (doc != null && doc.eIsProxy()) {
			InternalEObject oldDoc = (InternalEObject)doc;
			doc = (Doc)eResolveProxy(oldDoc);
			if (doc != oldDoc) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JobPackage.DOC_REF__DOC, oldDoc, doc));
			}
		}
		return doc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Doc basicGetDoc() {
		return doc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDoc(Doc newDoc, NotificationChain msgs) {
		Doc oldDoc = doc;
		doc = newDoc;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JobPackage.DOC_REF__DOC, oldDoc, newDoc);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDoc(Doc newDoc) {
		if (newDoc != doc) {
			NotificationChain msgs = null;
			if (doc != null)
				msgs = ((InternalEObject)doc).eInverseRemove(this, JobPackage.DOC__REFS, Doc.class, msgs);
			if (newDoc != null)
				msgs = ((InternalEObject)newDoc).eInverseAdd(this, JobPackage.DOC__REFS, Doc.class, msgs);
			msgs = basicSetDoc(newDoc, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JobPackage.DOC_REF__DOC, newDoc, newDoc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JobPackage.DOC_REF__DOC:
				if (doc != null)
					msgs = ((InternalEObject)doc).eInverseRemove(this, JobPackage.DOC__REFS, Doc.class, msgs);
				return basicSetDoc((Doc)otherEnd, msgs);
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
			case JobPackage.DOC_REF__DOC:
				return basicSetDoc(null, msgs);
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
			case JobPackage.DOC_REF__DOC:
				if (resolve) return getDoc();
				return basicGetDoc();
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
			case JobPackage.DOC_REF__DOC:
				setDoc((Doc)newValue);
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
			case JobPackage.DOC_REF__DOC:
				setDoc((Doc)null);
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
			case JobPackage.DOC_REF__DOC:
				return doc != null;
		}
		return super.eIsSet(featureID);
	}

} //DocRefImpl
