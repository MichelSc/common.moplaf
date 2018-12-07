/**
 */
package com.misc.common.moplaf.analysis.impl;

import com.misc.common.moplaf.analysis.AnalysisColumnizer;
import com.misc.common.moplaf.analysis.AnalysisElement;
import com.misc.common.moplaf.analysis.AnalysisElementKey;
import com.misc.common.moplaf.analysis.AnalysisPackage;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element Key</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.analysis.impl.AnalysisElementKeyImpl#getSheet <em>Sheet</em>}</li>
 *   <li>{@link com.misc.common.moplaf.analysis.impl.AnalysisElementKeyImpl#getDocs <em>Docs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnalysisElementKeyImpl extends MinimalEObjectImpl.Container implements AnalysisElementKey {
	/**
	 * The cached value of the '{@link #getDocs() <em>Docs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocs()
	 * @generated
	 * @ordered
	 */
	protected EList<AnalysisElement> docs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnalysisElementKeyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AnalysisPackage.Literals.ANALYSIS_ELEMENT_KEY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalysisColumnizer getSheet() {
		if (eContainerFeatureID() != AnalysisPackage.ANALYSIS_ELEMENT_KEY__SHEET) return null;
		return (AnalysisColumnizer)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSheet(AnalysisColumnizer newSheet, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSheet, AnalysisPackage.ANALYSIS_ELEMENT_KEY__SHEET, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSheet(AnalysisColumnizer newSheet) {
		if (newSheet != eInternalContainer() || (eContainerFeatureID() != AnalysisPackage.ANALYSIS_ELEMENT_KEY__SHEET && newSheet != null)) {
			if (EcoreUtil.isAncestor(this, newSheet))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSheet != null)
				msgs = ((InternalEObject)newSheet).eInverseAdd(this, AnalysisPackage.ANALYSIS_COLUMNIZER__KEYS, AnalysisColumnizer.class, msgs);
			msgs = basicSetSheet(newSheet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysisPackage.ANALYSIS_ELEMENT_KEY__SHEET, newSheet, newSheet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AnalysisElement> getDocs() {
		if (docs == null) {
			docs = new EObjectWithInverseResolvingEList<AnalysisElement>(AnalysisElement.class, this, AnalysisPackage.ANALYSIS_ELEMENT_KEY__DOCS, AnalysisPackage.ANALYSIS_ELEMENT__KEY);
		}
		return docs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getKeyValue() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
			case AnalysisPackage.ANALYSIS_ELEMENT_KEY__SHEET:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSheet((AnalysisColumnizer)otherEnd, msgs);
			case AnalysisPackage.ANALYSIS_ELEMENT_KEY__DOCS:
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
			case AnalysisPackage.ANALYSIS_ELEMENT_KEY__SHEET:
				return basicSetSheet(null, msgs);
			case AnalysisPackage.ANALYSIS_ELEMENT_KEY__DOCS:
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
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case AnalysisPackage.ANALYSIS_ELEMENT_KEY__SHEET:
				return eInternalContainer().eInverseRemove(this, AnalysisPackage.ANALYSIS_COLUMNIZER__KEYS, AnalysisColumnizer.class, msgs);
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
			case AnalysisPackage.ANALYSIS_ELEMENT_KEY__SHEET:
				return getSheet();
			case AnalysisPackage.ANALYSIS_ELEMENT_KEY__DOCS:
				return getDocs();
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
			case AnalysisPackage.ANALYSIS_ELEMENT_KEY__SHEET:
				setSheet((AnalysisColumnizer)newValue);
				return;
			case AnalysisPackage.ANALYSIS_ELEMENT_KEY__DOCS:
				getDocs().clear();
				getDocs().addAll((Collection<? extends AnalysisElement>)newValue);
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
			case AnalysisPackage.ANALYSIS_ELEMENT_KEY__SHEET:
				setSheet((AnalysisColumnizer)null);
				return;
			case AnalysisPackage.ANALYSIS_ELEMENT_KEY__DOCS:
				getDocs().clear();
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
			case AnalysisPackage.ANALYSIS_ELEMENT_KEY__SHEET:
				return getSheet() != null;
			case AnalysisPackage.ANALYSIS_ELEMENT_KEY__DOCS:
				return docs != null && !docs.isEmpty();
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
			case AnalysisPackage.ANALYSIS_ELEMENT_KEY___GET_KEY_VALUE:
				return getKeyValue();
		}
		return super.eInvoke(operationID, arguments);
	}

} //AnalysisElementKeyImpl
