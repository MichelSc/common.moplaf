/**
 */
package com.misc.common.moplaf.analysis.impl;

import com.misc.common.moplaf.analysis.AnalysisPackage;
import com.misc.common.moplaf.analysis.DocAnalysis;
import com.misc.common.moplaf.datatools.ColumnizerAbstract;
import com.misc.common.moplaf.datatools.Extractor;
import com.misc.common.moplaf.datatools.impl.SuperCategoryImpl;
import com.misc.common.moplaf.job.Doc;
import com.misc.common.moplaf.job.DocRef;
import com.misc.common.moplaf.job.JobPackage;
import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Doc Analysis</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.analysis.impl.DocAnalysisImpl#getDoc <em>Doc</em>}</li>
 *   <li>{@link com.misc.common.moplaf.analysis.impl.DocAnalysisImpl#getExtractor <em>Extractor</em>}</li>
 *   <li>{@link com.misc.common.moplaf.analysis.impl.DocAnalysisImpl#getColumnizer <em>Columnizer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DocAnalysisImpl extends SuperCategoryImpl implements DocAnalysis {
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
	protected ColumnizerAbstract columnizer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocAnalysisImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AnalysisPackage.Literals.DOC_ANALYSIS;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AnalysisPackage.DOC_ANALYSIS__DOC, oldDoc, doc));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnalysisPackage.DOC_ANALYSIS__DOC, oldDoc, newDoc);
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
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysisPackage.DOC_ANALYSIS__DOC, newDoc, newDoc));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AnalysisPackage.DOC_ANALYSIS__EXTRACTOR, oldExtractor, extractor));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysisPackage.DOC_ANALYSIS__EXTRACTOR, oldExtractor, extractor));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AnalysisPackage.DOC_ANALYSIS__COLUMNIZER, oldColumnizer, columnizer));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysisPackage.DOC_ANALYSIS__COLUMNIZER, oldColumnizer, columnizer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void refresh() {
		// input
		Doc doc = this.getDoc();
		HashSet<EObject> ins = new HashSet<>();
		ins.add(doc);
		
		// extract
		Extractor extractor = this.getExtractor();
		Set<EObject> outs = extractor.extract(ins);
		
		// categorize
		ColumnizerAbstract columnizer = this.getColumnizer();
		this.refreshCats(outs);
		this.setColumnizerAll(columnizer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AnalysisPackage.DOC_ANALYSIS__DOC:
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
			case AnalysisPackage.DOC_ANALYSIS__DOC:
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
			case AnalysisPackage.DOC_ANALYSIS__DOC:
				if (resolve) return getDoc();
				return basicGetDoc();
			case AnalysisPackage.DOC_ANALYSIS__EXTRACTOR:
				if (resolve) return getExtractor();
				return basicGetExtractor();
			case AnalysisPackage.DOC_ANALYSIS__COLUMNIZER:
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
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AnalysisPackage.DOC_ANALYSIS__DOC:
				setDoc((Doc)newValue);
				return;
			case AnalysisPackage.DOC_ANALYSIS__EXTRACTOR:
				setExtractor((Extractor)newValue);
				return;
			case AnalysisPackage.DOC_ANALYSIS__COLUMNIZER:
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
			case AnalysisPackage.DOC_ANALYSIS__DOC:
				setDoc((Doc)null);
				return;
			case AnalysisPackage.DOC_ANALYSIS__EXTRACTOR:
				setExtractor((Extractor)null);
				return;
			case AnalysisPackage.DOC_ANALYSIS__COLUMNIZER:
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
			case AnalysisPackage.DOC_ANALYSIS__DOC:
				return doc != null;
			case AnalysisPackage.DOC_ANALYSIS__EXTRACTOR:
				return extractor != null;
			case AnalysisPackage.DOC_ANALYSIS__COLUMNIZER:
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
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == DocRef.class) {
			switch (derivedFeatureID) {
				case AnalysisPackage.DOC_ANALYSIS__DOC: return JobPackage.DOC_REF__DOC;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == DocRef.class) {
			switch (baseFeatureID) {
				case JobPackage.DOC_REF__DOC: return AnalysisPackage.DOC_ANALYSIS__DOC;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
			case AnalysisPackage.DOC_ANALYSIS___REFRESH:
				refresh();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //DocAnalysisImpl
