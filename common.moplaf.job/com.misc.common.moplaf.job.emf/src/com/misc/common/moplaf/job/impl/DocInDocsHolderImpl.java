/**
 */
package com.misc.common.moplaf.job.impl;

import com.misc.common.moplaf.job.DocInDocsHolder;
import com.misc.common.moplaf.job.DocsHolder;
import com.misc.common.moplaf.job.JobPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Doc In Docs Holder</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.job.impl.DocInDocsHolderImpl#getDocsHolder <em>Docs Holder</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DocInDocsHolderImpl extends DocRefImpl implements DocInDocsHolder {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocInDocsHolderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JobPackage.Literals.DOC_IN_DOCS_HOLDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocsHolder getDocsHolder() {
		if (eContainerFeatureID() != JobPackage.DOC_IN_DOCS_HOLDER__DOCS_HOLDER) return null;
		return (DocsHolder)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDocsHolder(DocsHolder newDocsHolder, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newDocsHolder, JobPackage.DOC_IN_DOCS_HOLDER__DOCS_HOLDER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocsHolder(DocsHolder newDocsHolder) {
		if (newDocsHolder != eInternalContainer() || (eContainerFeatureID() != JobPackage.DOC_IN_DOCS_HOLDER__DOCS_HOLDER && newDocsHolder != null)) {
			if (EcoreUtil.isAncestor(this, newDocsHolder))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDocsHolder != null)
				msgs = ((InternalEObject)newDocsHolder).eInverseAdd(this, JobPackage.DOCS_HOLDER__DOCS, DocsHolder.class, msgs);
			msgs = basicSetDocsHolder(newDocsHolder, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JobPackage.DOC_IN_DOCS_HOLDER__DOCS_HOLDER, newDocsHolder, newDocsHolder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JobPackage.DOC_IN_DOCS_HOLDER__DOCS_HOLDER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDocsHolder((DocsHolder)otherEnd, msgs);
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
			case JobPackage.DOC_IN_DOCS_HOLDER__DOCS_HOLDER:
				return basicSetDocsHolder(null, msgs);
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
			case JobPackage.DOC_IN_DOCS_HOLDER__DOCS_HOLDER:
				return eInternalContainer().eInverseRemove(this, JobPackage.DOCS_HOLDER__DOCS, DocsHolder.class, msgs);
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
			case JobPackage.DOC_IN_DOCS_HOLDER__DOCS_HOLDER:
				return getDocsHolder();
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
			case JobPackage.DOC_IN_DOCS_HOLDER__DOCS_HOLDER:
				setDocsHolder((DocsHolder)newValue);
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
			case JobPackage.DOC_IN_DOCS_HOLDER__DOCS_HOLDER:
				setDocsHolder((DocsHolder)null);
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
			case JobPackage.DOC_IN_DOCS_HOLDER__DOCS_HOLDER:
				return getDocsHolder() != null;
		}
		return super.eIsSet(featureID);
	}

} //DocInDocsHolderImpl
