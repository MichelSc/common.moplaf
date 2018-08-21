/**
 */
package com.misc.common.moplaf.analysis.impl;

import com.misc.common.moplaf.analysis.AnalysisPackage;
import com.misc.common.moplaf.analysis.DocComparison;
import com.misc.common.moplaf.datatools.ColumnizerAbstract;
import com.misc.common.moplaf.datatools.Extractor;

import com.misc.common.moplaf.datatools.Match;
import com.misc.common.moplaf.datatools.Matcher;
import com.misc.common.moplaf.job.DocRef;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Doc Comparison</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.analysis.impl.DocComparisonImpl#getExtractor <em>Extractor</em>}</li>
 *   <li>{@link com.misc.common.moplaf.analysis.impl.DocComparisonImpl#getColumnizerCompare <em>Columnizer Compare</em>}</li>
 *   <li>{@link com.misc.common.moplaf.analysis.impl.DocComparisonImpl#getDoc1 <em>Doc1</em>}</li>
 *   <li>{@link com.misc.common.moplaf.analysis.impl.DocComparisonImpl#getDoc2 <em>Doc2</em>}</li>
 *   <li>{@link com.misc.common.moplaf.analysis.impl.DocComparisonImpl#getMatches <em>Matches</em>}</li>
 *   <li>{@link com.misc.common.moplaf.analysis.impl.DocComparisonImpl#getMatcher <em>Matcher</em>}</li>
 *   <li>{@link com.misc.common.moplaf.analysis.impl.DocComparisonImpl#getColumnizerKey <em>Columnizer Key</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DocComparisonImpl extends MinimalEObjectImpl.Container implements DocComparison {
	/**
	 * The cached value of the '{@link #getExtractor() <em>Extractor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtractor()
	 * @generated
	 * @ordered
	 */
	protected Extractor extractor;

	/**
	 * The cached value of the '{@link #getColumnizerCompare() <em>Columnizer Compare</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnizerCompare()
	 * @generated
	 * @ordered
	 */
	protected ColumnizerAbstract columnizerCompare;

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
	 * The cached value of the '{@link #getMatches() <em>Matches</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatches()
	 * @generated
	 * @ordered
	 */
	protected EList<Match> matches;

	/**
	 * The cached value of the '{@link #getMatcher() <em>Matcher</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatcher()
	 * @generated
	 * @ordered
	 */
	protected Matcher matcher;

	/**
	 * The cached value of the '{@link #getColumnizerKey() <em>Columnizer Key</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnizerKey()
	 * @generated
	 * @ordered
	 */
	protected ColumnizerAbstract columnizerKey;

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
		return extractor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExtractor(Extractor newExtractor, NotificationChain msgs) {
		Extractor oldExtractor = extractor;
		extractor = newExtractor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnalysisPackage.DOC_COMPARISON__EXTRACTOR, oldExtractor, newExtractor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtractor(Extractor newExtractor) {
		if (newExtractor != extractor) {
			NotificationChain msgs = null;
			if (extractor != null)
				msgs = ((InternalEObject)extractor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnalysisPackage.DOC_COMPARISON__EXTRACTOR, null, msgs);
			if (newExtractor != null)
				msgs = ((InternalEObject)newExtractor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnalysisPackage.DOC_COMPARISON__EXTRACTOR, null, msgs);
			msgs = basicSetExtractor(newExtractor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysisPackage.DOC_COMPARISON__EXTRACTOR, newExtractor, newExtractor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColumnizerAbstract getColumnizerCompare() {
		return columnizerCompare;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetColumnizerCompare(ColumnizerAbstract newColumnizerCompare, NotificationChain msgs) {
		ColumnizerAbstract oldColumnizerCompare = columnizerCompare;
		columnizerCompare = newColumnizerCompare;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnalysisPackage.DOC_COMPARISON__COLUMNIZER_COMPARE, oldColumnizerCompare, newColumnizerCompare);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumnizerCompare(ColumnizerAbstract newColumnizerCompare) {
		if (newColumnizerCompare != columnizerCompare) {
			NotificationChain msgs = null;
			if (columnizerCompare != null)
				msgs = ((InternalEObject)columnizerCompare).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnalysisPackage.DOC_COMPARISON__COLUMNIZER_COMPARE, null, msgs);
			if (newColumnizerCompare != null)
				msgs = ((InternalEObject)newColumnizerCompare).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnalysisPackage.DOC_COMPARISON__COLUMNIZER_COMPARE, null, msgs);
			msgs = basicSetColumnizerCompare(newColumnizerCompare, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysisPackage.DOC_COMPARISON__COLUMNIZER_COMPARE, newColumnizerCompare, newColumnizerCompare));
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
	public EList<Match> getMatches() {
		if (matches == null) {
			matches = new EObjectContainmentEList<Match>(Match.class, this, AnalysisPackage.DOC_COMPARISON__MATCHES);
		}
		return matches;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Matcher getMatcher() {
		return matcher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMatcher(Matcher newMatcher, NotificationChain msgs) {
		Matcher oldMatcher = matcher;
		matcher = newMatcher;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnalysisPackage.DOC_COMPARISON__MATCHER, oldMatcher, newMatcher);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMatcher(Matcher newMatcher) {
		if (newMatcher != matcher) {
			NotificationChain msgs = null;
			if (matcher != null)
				msgs = ((InternalEObject)matcher).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnalysisPackage.DOC_COMPARISON__MATCHER, null, msgs);
			if (newMatcher != null)
				msgs = ((InternalEObject)newMatcher).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnalysisPackage.DOC_COMPARISON__MATCHER, null, msgs);
			msgs = basicSetMatcher(newMatcher, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysisPackage.DOC_COMPARISON__MATCHER, newMatcher, newMatcher));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColumnizerAbstract getColumnizerKey() {
		return columnizerKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetColumnizerKey(ColumnizerAbstract newColumnizerKey, NotificationChain msgs) {
		ColumnizerAbstract oldColumnizerKey = columnizerKey;
		columnizerKey = newColumnizerKey;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnalysisPackage.DOC_COMPARISON__COLUMNIZER_KEY, oldColumnizerKey, newColumnizerKey);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumnizerKey(ColumnizerAbstract newColumnizerKey) {
		if (newColumnizerKey != columnizerKey) {
			NotificationChain msgs = null;
			if (columnizerKey != null)
				msgs = ((InternalEObject)columnizerKey).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnalysisPackage.DOC_COMPARISON__COLUMNIZER_KEY, null, msgs);
			if (newColumnizerKey != null)
				msgs = ((InternalEObject)newColumnizerKey).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnalysisPackage.DOC_COMPARISON__COLUMNIZER_KEY, null, msgs);
			msgs = basicSetColumnizerKey(newColumnizerKey, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysisPackage.DOC_COMPARISON__COLUMNIZER_KEY, newColumnizerKey, newColumnizerKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AnalysisPackage.DOC_COMPARISON__EXTRACTOR:
				return basicSetExtractor(null, msgs);
			case AnalysisPackage.DOC_COMPARISON__COLUMNIZER_COMPARE:
				return basicSetColumnizerCompare(null, msgs);
			case AnalysisPackage.DOC_COMPARISON__DOC1:
				return basicSetDoc1(null, msgs);
			case AnalysisPackage.DOC_COMPARISON__DOC2:
				return basicSetDoc2(null, msgs);
			case AnalysisPackage.DOC_COMPARISON__MATCHES:
				return ((InternalEList<?>)getMatches()).basicRemove(otherEnd, msgs);
			case AnalysisPackage.DOC_COMPARISON__MATCHER:
				return basicSetMatcher(null, msgs);
			case AnalysisPackage.DOC_COMPARISON__COLUMNIZER_KEY:
				return basicSetColumnizerKey(null, msgs);
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
				return getExtractor();
			case AnalysisPackage.DOC_COMPARISON__COLUMNIZER_COMPARE:
				return getColumnizerCompare();
			case AnalysisPackage.DOC_COMPARISON__DOC1:
				return getDoc1();
			case AnalysisPackage.DOC_COMPARISON__DOC2:
				return getDoc2();
			case AnalysisPackage.DOC_COMPARISON__MATCHES:
				return getMatches();
			case AnalysisPackage.DOC_COMPARISON__MATCHER:
				return getMatcher();
			case AnalysisPackage.DOC_COMPARISON__COLUMNIZER_KEY:
				return getColumnizerKey();
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
			case AnalysisPackage.DOC_COMPARISON__EXTRACTOR:
				setExtractor((Extractor)newValue);
				return;
			case AnalysisPackage.DOC_COMPARISON__COLUMNIZER_COMPARE:
				setColumnizerCompare((ColumnizerAbstract)newValue);
				return;
			case AnalysisPackage.DOC_COMPARISON__DOC1:
				setDoc1((DocRef)newValue);
				return;
			case AnalysisPackage.DOC_COMPARISON__DOC2:
				setDoc2((DocRef)newValue);
				return;
			case AnalysisPackage.DOC_COMPARISON__MATCHES:
				getMatches().clear();
				getMatches().addAll((Collection<? extends Match>)newValue);
				return;
			case AnalysisPackage.DOC_COMPARISON__MATCHER:
				setMatcher((Matcher)newValue);
				return;
			case AnalysisPackage.DOC_COMPARISON__COLUMNIZER_KEY:
				setColumnizerKey((ColumnizerAbstract)newValue);
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
			case AnalysisPackage.DOC_COMPARISON__COLUMNIZER_COMPARE:
				setColumnizerCompare((ColumnizerAbstract)null);
				return;
			case AnalysisPackage.DOC_COMPARISON__DOC1:
				setDoc1((DocRef)null);
				return;
			case AnalysisPackage.DOC_COMPARISON__DOC2:
				setDoc2((DocRef)null);
				return;
			case AnalysisPackage.DOC_COMPARISON__MATCHES:
				getMatches().clear();
				return;
			case AnalysisPackage.DOC_COMPARISON__MATCHER:
				setMatcher((Matcher)null);
				return;
			case AnalysisPackage.DOC_COMPARISON__COLUMNIZER_KEY:
				setColumnizerKey((ColumnizerAbstract)null);
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
			case AnalysisPackage.DOC_COMPARISON__COLUMNIZER_COMPARE:
				return columnizerCompare != null;
			case AnalysisPackage.DOC_COMPARISON__DOC1:
				return doc1 != null;
			case AnalysisPackage.DOC_COMPARISON__DOC2:
				return doc2 != null;
			case AnalysisPackage.DOC_COMPARISON__MATCHES:
				return matches != null && !matches.isEmpty();
			case AnalysisPackage.DOC_COMPARISON__MATCHER:
				return matcher != null;
			case AnalysisPackage.DOC_COMPARISON__COLUMNIZER_KEY:
				return columnizerKey != null;
		}
		return super.eIsSet(featureID);
	}

} //DocComparisonImpl
