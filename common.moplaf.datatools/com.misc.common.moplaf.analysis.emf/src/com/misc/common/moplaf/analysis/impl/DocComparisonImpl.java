/**
 */
package com.misc.common.moplaf.analysis.impl;

import com.misc.common.moplaf.analysis.AnalysisPackage;
import com.misc.common.moplaf.analysis.DocComparison;

import com.misc.common.moplaf.datatools.Categorizer;
import com.misc.common.moplaf.datatools.Columnizer;
import com.misc.common.moplaf.datatools.Extractor;

import com.misc.common.moplaf.datatools.impl.MatcherImpl;

import com.misc.common.moplaf.job.DocRef;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Doc Comparison</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.analysis.impl.DocComparisonImpl#getExtractor <em>Extractor</em>}</li>
 *   <li>{@link com.misc.common.moplaf.analysis.impl.DocComparisonImpl#getColumnizer <em>Columnizer</em>}</li>
 *   <li>{@link com.misc.common.moplaf.analysis.impl.DocComparisonImpl#getDoc1 <em>Doc1</em>}</li>
 *   <li>{@link com.misc.common.moplaf.analysis.impl.DocComparisonImpl#getDoc2 <em>Doc2</em>}</li>
 *   <li>{@link com.misc.common.moplaf.analysis.impl.DocComparisonImpl#getCategorizer <em>Categorizer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DocComparisonImpl extends MatcherImpl implements DocComparison {
	/**
	 * The cached value of the '{@link #getExtractor() <em>Extractor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtractor()
	 * @generated
	 * @ordered
	 */
	protected Extractor extractor;

	/**
	 * The cached value of the '{@link #getColumnizer() <em>Columnizer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnizer()
	 * @generated
	 * @ordered
	 */
	protected Columnizer columnizer;

	/**
	 * The cached value of the '{@link #getDoc1() <em>Doc1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoc1()
	 * @generated
	 * @ordered
	 */
	protected DocRef doc1;

	/**
	 * The cached value of the '{@link #getDoc2() <em>Doc2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoc2()
	 * @generated
	 * @ordered
	 */
	protected DocRef doc2;

	/**
	 * The cached value of the '{@link #getCategorizer() <em>Categorizer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorizer()
	 * @generated
	 * @ordered
	 */
	protected Categorizer categorizer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocComparisonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AnalysisPackage.Literals.DOC_COMPARISON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Extractor getExtractor() {
		if (extractor != null && extractor.eIsProxy()) {
			InternalEObject oldExtractor = (InternalEObject)extractor;
			extractor = (Extractor)eResolveProxy(oldExtractor);
			if (extractor != oldExtractor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AnalysisPackage.DOC_COMPARISON__EXTRACTOR, oldExtractor, extractor));
			}
		}
		return extractor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Extractor basicGetExtractor() {
		return extractor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtractor(Extractor newExtractor) {
		Extractor oldExtractor = extractor;
		extractor = newExtractor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysisPackage.DOC_COMPARISON__EXTRACTOR, oldExtractor, extractor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Columnizer getColumnizer() {
		if (columnizer != null && columnizer.eIsProxy()) {
			InternalEObject oldColumnizer = (InternalEObject)columnizer;
			columnizer = (Columnizer)eResolveProxy(oldColumnizer);
			if (columnizer != oldColumnizer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AnalysisPackage.DOC_COMPARISON__COLUMNIZER, oldColumnizer, columnizer));
			}
		}
		return columnizer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Columnizer basicGetColumnizer() {
		return columnizer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumnizer(Columnizer newColumnizer) {
		Columnizer oldColumnizer = columnizer;
		columnizer = newColumnizer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysisPackage.DOC_COMPARISON__COLUMNIZER, oldColumnizer, columnizer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocRef getDoc1() {
		return doc1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDoc1(DocRef newDoc1, NotificationChain msgs) {
		DocRef oldDoc1 = doc1;
		doc1 = newDoc1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnalysisPackage.DOC_COMPARISON__DOC1, oldDoc1, newDoc1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDoc1(DocRef newDoc1) {
		if (newDoc1 != doc1) {
			NotificationChain msgs = null;
			if (doc1 != null)
				msgs = ((InternalEObject)doc1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnalysisPackage.DOC_COMPARISON__DOC1, null, msgs);
			if (newDoc1 != null)
				msgs = ((InternalEObject)newDoc1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnalysisPackage.DOC_COMPARISON__DOC1, null, msgs);
			msgs = basicSetDoc1(newDoc1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysisPackage.DOC_COMPARISON__DOC1, newDoc1, newDoc1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocRef getDoc2() {
		return doc2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDoc2(DocRef newDoc2, NotificationChain msgs) {
		DocRef oldDoc2 = doc2;
		doc2 = newDoc2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnalysisPackage.DOC_COMPARISON__DOC2, oldDoc2, newDoc2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDoc2(DocRef newDoc2) {
		if (newDoc2 != doc2) {
			NotificationChain msgs = null;
			if (doc2 != null)
				msgs = ((InternalEObject)doc2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnalysisPackage.DOC_COMPARISON__DOC2, null, msgs);
			if (newDoc2 != null)
				msgs = ((InternalEObject)newDoc2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnalysisPackage.DOC_COMPARISON__DOC2, null, msgs);
			msgs = basicSetDoc2(newDoc2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysisPackage.DOC_COMPARISON__DOC2, newDoc2, newDoc2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Categorizer getCategorizer() {
		if (categorizer != null && categorizer.eIsProxy()) {
			InternalEObject oldCategorizer = (InternalEObject)categorizer;
			categorizer = (Categorizer)eResolveProxy(oldCategorizer);
			if (categorizer != oldCategorizer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AnalysisPackage.DOC_COMPARISON__CATEGORIZER, oldCategorizer, categorizer));
			}
		}
		return categorizer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Categorizer basicGetCategorizer() {
		return categorizer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorizer(Categorizer newCategorizer) {
		Categorizer oldCategorizer = categorizer;
		categorizer = newCategorizer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysisPackage.DOC_COMPARISON__CATEGORIZER, oldCategorizer, categorizer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AnalysisPackage.DOC_COMPARISON__DOC1:
				return basicSetDoc1(null, msgs);
			case AnalysisPackage.DOC_COMPARISON__DOC2:
				return basicSetDoc2(null, msgs);
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
			case AnalysisPackage.DOC_COMPARISON__EXTRACTOR:
				if (resolve) return getExtractor();
				return basicGetExtractor();
			case AnalysisPackage.DOC_COMPARISON__COLUMNIZER:
				if (resolve) return getColumnizer();
				return basicGetColumnizer();
			case AnalysisPackage.DOC_COMPARISON__DOC1:
				return getDoc1();
			case AnalysisPackage.DOC_COMPARISON__DOC2:
				return getDoc2();
			case AnalysisPackage.DOC_COMPARISON__CATEGORIZER:
				if (resolve) return getCategorizer();
				return basicGetCategorizer();
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
			case AnalysisPackage.DOC_COMPARISON__EXTRACTOR:
				setExtractor((Extractor)newValue);
				return;
			case AnalysisPackage.DOC_COMPARISON__COLUMNIZER:
				setColumnizer((Columnizer)newValue);
				return;
			case AnalysisPackage.DOC_COMPARISON__DOC1:
				setDoc1((DocRef)newValue);
				return;
			case AnalysisPackage.DOC_COMPARISON__DOC2:
				setDoc2((DocRef)newValue);
				return;
			case AnalysisPackage.DOC_COMPARISON__CATEGORIZER:
				setCategorizer((Categorizer)newValue);
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
			case AnalysisPackage.DOC_COMPARISON__EXTRACTOR:
				setExtractor((Extractor)null);
				return;
			case AnalysisPackage.DOC_COMPARISON__COLUMNIZER:
				setColumnizer((Columnizer)null);
				return;
			case AnalysisPackage.DOC_COMPARISON__DOC1:
				setDoc1((DocRef)null);
				return;
			case AnalysisPackage.DOC_COMPARISON__DOC2:
				setDoc2((DocRef)null);
				return;
			case AnalysisPackage.DOC_COMPARISON__CATEGORIZER:
				setCategorizer((Categorizer)null);
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
			case AnalysisPackage.DOC_COMPARISON__EXTRACTOR:
				return extractor != null;
			case AnalysisPackage.DOC_COMPARISON__COLUMNIZER:
				return columnizer != null;
			case AnalysisPackage.DOC_COMPARISON__DOC1:
				return doc1 != null;
			case AnalysisPackage.DOC_COMPARISON__DOC2:
				return doc2 != null;
			case AnalysisPackage.DOC_COMPARISON__CATEGORIZER:
				return categorizer != null;
		}
		return super.eIsSet(featureID);
	}

} //DocComparisonImpl
