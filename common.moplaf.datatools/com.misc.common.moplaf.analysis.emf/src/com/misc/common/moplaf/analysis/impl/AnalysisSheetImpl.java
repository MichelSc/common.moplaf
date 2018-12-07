/**
 */
package com.misc.common.moplaf.analysis.impl;

import com.misc.common.moplaf.analysis.Analysis;
import com.misc.common.moplaf.analysis.AnalysisElement;
import com.misc.common.moplaf.analysis.AnalysisElementKey;
import com.misc.common.moplaf.analysis.AnalysisPackage;
import com.misc.common.moplaf.analysis.AnalysisSheet;

import com.misc.common.moplaf.datatools.ColumnizerAbstract;

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
 * An implementation of the model object '<em><b>Sheet</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.analysis.impl.AnalysisSheetImpl#getKeys <em>Keys</em>}</li>
 *   <li>{@link com.misc.common.moplaf.analysis.impl.AnalysisSheetImpl#getAnalysis <em>Analysis</em>}</li>
 *   <li>{@link com.misc.common.moplaf.analysis.impl.AnalysisSheetImpl#getColumnizer <em>Columnizer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnalysisSheetImpl extends MinimalEObjectImpl.Container implements AnalysisSheet {
	/**
	 * The cached value of the '{@link #getKeys() <em>Keys</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeys()
	 * @generated
	 * @ordered
	 */
	protected AnalysisElementKey keys;

	/**
	 * The cached value of the '{@link #getColumnizer() <em>Columnizer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnizer()
	 * @generated
	 * @ordered
	 */
	protected ColumnizerAbstract columnizer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnalysisSheetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AnalysisPackage.Literals.ANALYSIS_SHEET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalysisElementKey getKeys() {
		return keys;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKeys(AnalysisElementKey newKeys, NotificationChain msgs) {
		AnalysisElementKey oldKeys = keys;
		keys = newKeys;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnalysisPackage.ANALYSIS_SHEET__KEYS, oldKeys, newKeys);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKeys(AnalysisElementKey newKeys) {
		if (newKeys != keys) {
			NotificationChain msgs = null;
			if (keys != null)
				msgs = ((InternalEObject)keys).eInverseRemove(this, AnalysisPackage.ANALYSIS_ELEMENT_KEY__SHEET, AnalysisElementKey.class, msgs);
			if (newKeys != null)
				msgs = ((InternalEObject)newKeys).eInverseAdd(this, AnalysisPackage.ANALYSIS_ELEMENT_KEY__SHEET, AnalysisElementKey.class, msgs);
			msgs = basicSetKeys(newKeys, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysisPackage.ANALYSIS_SHEET__KEYS, newKeys, newKeys));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Analysis getAnalysis() {
		if (eContainerFeatureID() != AnalysisPackage.ANALYSIS_SHEET__ANALYSIS) return null;
		return (Analysis)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnalysis(Analysis newAnalysis, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newAnalysis, AnalysisPackage.ANALYSIS_SHEET__ANALYSIS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnalysis(Analysis newAnalysis) {
		if (newAnalysis != eInternalContainer() || (eContainerFeatureID() != AnalysisPackage.ANALYSIS_SHEET__ANALYSIS && newAnalysis != null)) {
			if (EcoreUtil.isAncestor(this, newAnalysis))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newAnalysis != null)
				msgs = ((InternalEObject)newAnalysis).eInverseAdd(this, AnalysisPackage.ANALYSIS__SHEETS, Analysis.class, msgs);
			msgs = basicSetAnalysis(newAnalysis, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysisPackage.ANALYSIS_SHEET__ANALYSIS, newAnalysis, newAnalysis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColumnizerAbstract getColumnizer() {
		if (columnizer != null && columnizer.eIsProxy()) {
			InternalEObject oldColumnizer = (InternalEObject)columnizer;
			columnizer = (ColumnizerAbstract)eResolveProxy(oldColumnizer);
			if (columnizer != oldColumnizer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AnalysisPackage.ANALYSIS_SHEET__COLUMNIZER, oldColumnizer, columnizer));
			}
		}
		return columnizer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColumnizerAbstract basicGetColumnizer() {
		return columnizer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumnizer(ColumnizerAbstract newColumnizer) {
		ColumnizerAbstract oldColumnizer = columnizer;
		columnizer = newColumnizer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysisPackage.ANALYSIS_SHEET__COLUMNIZER, oldColumnizer, columnizer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addElement(AnalysisElement element) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeElement(AnalysisElement element) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getKeyValue(EObject element) {
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
			case AnalysisPackage.ANALYSIS_SHEET__KEYS:
				if (keys != null)
					msgs = ((InternalEObject)keys).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnalysisPackage.ANALYSIS_SHEET__KEYS, null, msgs);
				return basicSetKeys((AnalysisElementKey)otherEnd, msgs);
			case AnalysisPackage.ANALYSIS_SHEET__ANALYSIS:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetAnalysis((Analysis)otherEnd, msgs);
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
			case AnalysisPackage.ANALYSIS_SHEET__KEYS:
				return basicSetKeys(null, msgs);
			case AnalysisPackage.ANALYSIS_SHEET__ANALYSIS:
				return basicSetAnalysis(null, msgs);
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
			case AnalysisPackage.ANALYSIS_SHEET__ANALYSIS:
				return eInternalContainer().eInverseRemove(this, AnalysisPackage.ANALYSIS__SHEETS, Analysis.class, msgs);
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
			case AnalysisPackage.ANALYSIS_SHEET__KEYS:
				return getKeys();
			case AnalysisPackage.ANALYSIS_SHEET__ANALYSIS:
				return getAnalysis();
			case AnalysisPackage.ANALYSIS_SHEET__COLUMNIZER:
				if (resolve) return getColumnizer();
				return basicGetColumnizer();
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
			case AnalysisPackage.ANALYSIS_SHEET__KEYS:
				setKeys((AnalysisElementKey)newValue);
				return;
			case AnalysisPackage.ANALYSIS_SHEET__ANALYSIS:
				setAnalysis((Analysis)newValue);
				return;
			case AnalysisPackage.ANALYSIS_SHEET__COLUMNIZER:
				setColumnizer((ColumnizerAbstract)newValue);
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
			case AnalysisPackage.ANALYSIS_SHEET__KEYS:
				setKeys((AnalysisElementKey)null);
				return;
			case AnalysisPackage.ANALYSIS_SHEET__ANALYSIS:
				setAnalysis((Analysis)null);
				return;
			case AnalysisPackage.ANALYSIS_SHEET__COLUMNIZER:
				setColumnizer((ColumnizerAbstract)null);
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
			case AnalysisPackage.ANALYSIS_SHEET__KEYS:
				return keys != null;
			case AnalysisPackage.ANALYSIS_SHEET__ANALYSIS:
				return getAnalysis() != null;
			case AnalysisPackage.ANALYSIS_SHEET__COLUMNIZER:
				return columnizer != null;
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
			case AnalysisPackage.ANALYSIS_SHEET___ADD_ELEMENT__ANALYSISELEMENT:
				addElement((AnalysisElement)arguments.get(0));
				return null;
			case AnalysisPackage.ANALYSIS_SHEET___REMOVE_ELEMENT__ANALYSISELEMENT:
				removeElement((AnalysisElement)arguments.get(0));
				return null;
			case AnalysisPackage.ANALYSIS_SHEET___GET_KEY_VALUE__EOBJECT:
				return getKeyValue((EObject)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //AnalysisSheetImpl
