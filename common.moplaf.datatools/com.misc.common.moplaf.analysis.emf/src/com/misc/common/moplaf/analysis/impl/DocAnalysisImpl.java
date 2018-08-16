/**
 */
package com.misc.common.moplaf.analysis.impl;

import com.misc.common.moplaf.analysis.AnalysisPackage;
import com.misc.common.moplaf.analysis.DocAnalysis;
import com.misc.common.moplaf.common.EnabledFeedback;
import com.misc.common.moplaf.common.IMoplafObject;
import com.misc.common.moplaf.common.util.EObjectListDerived;
import com.misc.common.moplaf.datatools.Categorizer;
import com.misc.common.moplaf.datatools.ColumnizerAbstract;
import com.misc.common.moplaf.datatools.DataTool;
import com.misc.common.moplaf.datatools.DataToolContext;
import com.misc.common.moplaf.datatools.DatatoolsPackage;
import com.misc.common.moplaf.datatools.Extractor;
import com.misc.common.moplaf.datatools.impl.SuperCategoryImpl;
import com.misc.common.moplaf.datatools.util.ObjectSet;
import com.misc.common.moplaf.job.Doc;
import com.misc.common.moplaf.job.DocRef;
import com.misc.common.moplaf.job.JobPackage;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Doc Analysis</b></em>'.
 * @implements IMoplafObject
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.analysis.impl.DocAnalysisImpl#getDoc <em>Doc</em>}</li>
 *   <li>{@link com.misc.common.moplaf.analysis.impl.DocAnalysisImpl#getExtractor <em>Extractor</em>}</li>
 *   <li>{@link com.misc.common.moplaf.analysis.impl.DocAnalysisImpl#getColumnizer <em>Columnizer</em>}</li>
 *   <li>{@link com.misc.common.moplaf.analysis.impl.DocAnalysisImpl#isComplete <em>Complete</em>}</li>
 *   <li>{@link com.misc.common.moplaf.analysis.impl.DocAnalysisImpl#getMaxElements <em>Max Elements</em>}</li>
 *   <li>{@link com.misc.common.moplaf.analysis.impl.DocAnalysisImpl#getCategorizers <em>Categorizers</em>}</li>
 *   <li>{@link com.misc.common.moplaf.analysis.impl.DocAnalysisImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link com.misc.common.moplaf.analysis.impl.DocAnalysisImpl#getDataTools <em>Data Tools</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DocAnalysisImpl extends SuperCategoryImpl implements DocAnalysis, IMoplafObject {
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
	 * The cached value of the '{@link #getExtractor() <em>Extractor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtractor()
	 * @generated
	 * @ordered
	 */
	protected Extractor extractor;

	/**
	 * The cached value of the '{@link #getColumnizer() <em>Columnizer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnizer()
	 * @generated
	 * @ordered
	 */
	protected ColumnizerAbstract columnizer;

	/**
	 * The default value of the '{@link #isComplete() <em>Complete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isComplete()
	 * @generated
	 * @ordered
	 */
	protected static final boolean COMPLETE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isComplete() <em>Complete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isComplete()
	 * @generated
	 * @ordered
	 */
	protected boolean complete = COMPLETE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxElements() <em>Max Elements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxElements()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_ELEMENTS_EDEFAULT = 1000000;

	/**
	 * The cached value of the '{@link #getMaxElements() <em>Max Elements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxElements()
	 * @generated
	 * @ordered
	 */
	protected int maxElements = MAX_ELEMENTS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCategorizers() <em>Categorizers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorizers()
	 * @generated
	 * @ordered
	 */
	protected EList<Categorizer> categorizers;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnalysisPackage.DOC_ANALYSIS__EXTRACTOR, oldExtractor, newExtractor);
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
				msgs = ((InternalEObject)extractor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnalysisPackage.DOC_ANALYSIS__EXTRACTOR, null, msgs);
			if (newExtractor != null)
				msgs = ((InternalEObject)newExtractor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnalysisPackage.DOC_ANALYSIS__EXTRACTOR, null, msgs);
			msgs = basicSetExtractor(newExtractor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysisPackage.DOC_ANALYSIS__EXTRACTOR, newExtractor, newExtractor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColumnizerAbstract getColumnizer() {
		return columnizer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetColumnizer(ColumnizerAbstract newColumnizer, NotificationChain msgs) {
		ColumnizerAbstract oldColumnizer = columnizer;
		columnizer = newColumnizer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnalysisPackage.DOC_ANALYSIS__COLUMNIZER, oldColumnizer, newColumnizer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumnizer(ColumnizerAbstract newColumnizer) {
		if (newColumnizer != columnizer) {
			NotificationChain msgs = null;
			if (columnizer != null)
				msgs = ((InternalEObject)columnizer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnalysisPackage.DOC_ANALYSIS__COLUMNIZER, null, msgs);
			if (newColumnizer != null)
				msgs = ((InternalEObject)newColumnizer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnalysisPackage.DOC_ANALYSIS__COLUMNIZER, null, msgs);
			msgs = basicSetColumnizer(newColumnizer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysisPackage.DOC_ANALYSIS__COLUMNIZER, newColumnizer, newColumnizer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isComplete() {
		return complete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComplete(boolean newComplete) {
		boolean oldComplete = complete;
		complete = newComplete;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysisPackage.DOC_ANALYSIS__COMPLETE, oldComplete, complete));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxElements() {
		return maxElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxElements(int newMaxElements) {
		int oldMaxElements = maxElements;
		maxElements = newMaxElements;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysisPackage.DOC_ANALYSIS__MAX_ELEMENTS, oldMaxElements, maxElements));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Categorizer> getCategorizers() {
		if (categorizers == null) {
			categorizers = new EObjectContainmentEList<Categorizer>(Categorizer.class, this, AnalysisPackage.DOC_ANALYSIS__CATEGORIZERS);
		}
		return categorizers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public String getDescription() {
		Doc doc = this.getDoc();
		String description = doc==null
				           ? "null"
				           : doc.getDescription();
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public EList<DataTool> getDataTools() {
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		EList<DataTool> newList = new EObjectListDerived<DataTool>(DataTool.class, this, AnalysisPackage.DOC_ANALYSIS__DATA_TOOLS, true);
		
		// Extractor
		Extractor extractor = this.getExtractor();
		if ( extractor!=null) {
			newList.add(extractor);
		}
		
		// Columnizer
		ColumnizerAbstract columnizer = this.getColumnizer();
		if ( columnizer!=null ) {
			newList.add(columnizer);
		}
		
		// Categorizer
		for ( Categorizer categorizer : this.getCategorizers()){
			newList.add(categorizer);
		}
		
		return newList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void refresh() {
		// input
		Doc doc = this.getDoc();
		ObjectSet ins = new ObjectSet();
		ins.add(doc);
		
		// extract
		Extractor extractor = this.getExtractor();
		ObjectSet outs = extractor.extract(ins, this.getMaxElements());
		
		// categorize
		ColumnizerAbstract columnizer = this.getColumnizer();
		this.refreshCats(outs, this.getCategorizers());
		this.setColumnizerAll(columnizer);
		this.setComplete(outs.isComplete());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void addTool(DataTool tool) {
		this.flush();
		DataTool new_tool = tool.clone();
		if ( new_tool instanceof Categorizer ) {
			this.getCategorizers().add((Categorizer)new_tool);
		} else if ( new_tool instanceof ColumnizerAbstract ) {
			this.setColumnizer((ColumnizerAbstract)new_tool);
		} else if ( new_tool instanceof Extractor ) {
		this.setExtractor((Extractor)new_tool);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public EnabledFeedback isValidTool(DataTool tool) {
		if ( tool instanceof Extractor ) {
			return this.isValidExtractor((Extractor)tool);
		} 
		if ( tool instanceof ColumnizerAbstract ) {
			return this.isValidColumnizer((ColumnizerAbstract)tool);
		} 
		if ( tool instanceof Categorizer ) {
			return this.isValidCategorizer((Categorizer)tool);
		} 
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public EnabledFeedback isValidExtractor(Extractor tool) {
		Doc doc = this.getDoc();
		if ( doc==null ) {
			return new EnabledFeedback(false, "No document");
		}
		if ( !tool.isValidRoot(doc)) {
			return new EnabledFeedback(false, String.format("%s is no valid root for extractor %s", this.eClass().getName(), tool.getDescription()));
		}
		return EnabledFeedback.NOFEEDBACK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public EnabledFeedback isValidColumnizer(ColumnizerAbstract tool) {
		Extractor extractor = this.getExtractor();
		if ( extractor==null ) {
			return new EnabledFeedback(false, "No extractor");
		}
		EClass extracted_type = extractor.getExtractedType();
		if ( extracted_type==null ) {
			return new EnabledFeedback(false, "No extracted type");
		}
		if ( !tool.isValidElementType(extracted_type)) {
			return new EnabledFeedback(false, String.format("Extracted type %s is not valid type for columnizer %s", extracted_type.getName(), tool.getDescription()));
		}
		return EnabledFeedback.NOFEEDBACK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public EnabledFeedback isValidCategorizer(Categorizer tool) {
		Extractor extractor = this.getExtractor();
		if ( extractor==null ) {
			return new EnabledFeedback(false, "No extractor");
		}
		EClass extracted_type = extractor.getExtractedType();
		if ( extracted_type==null ) {
			return new EnabledFeedback(false, "No extracted type");
		}
		if ( !tool.isValidElementType(extracted_type)) {
			return new EnabledFeedback(false, String.format("Extracted type %s is not valid type for categorizer %s", extracted_type.getName(), tool.getDescription()));
		}
		return EnabledFeedback.NOFEEDBACK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public EList<EClass> getDomainTypes() {
		BasicEList<EClass> classes = new BasicEList<EClass>();
		Doc doc = this.getDoc();
		if ( doc != null ) {
			EList<EClassifier> classifiers = doc.eClass().getEPackage().getEClassifiers();
			for ( EClassifier classifier : classifiers) {
				if ( classifier instanceof EClass ) {
					classes.add((EClass)classifier);
				}
			}
			return classes;
		}
		return classes;
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
			case AnalysisPackage.DOC_ANALYSIS__EXTRACTOR:
				return basicSetExtractor(null, msgs);
			case AnalysisPackage.DOC_ANALYSIS__COLUMNIZER:
				return basicSetColumnizer(null, msgs);
			case AnalysisPackage.DOC_ANALYSIS__CATEGORIZERS:
				return ((InternalEList<?>)getCategorizers()).basicRemove(otherEnd, msgs);
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
				return getExtractor();
			case AnalysisPackage.DOC_ANALYSIS__COLUMNIZER:
				return getColumnizer();
			case AnalysisPackage.DOC_ANALYSIS__COMPLETE:
				return isComplete();
			case AnalysisPackage.DOC_ANALYSIS__MAX_ELEMENTS:
				return getMaxElements();
			case AnalysisPackage.DOC_ANALYSIS__CATEGORIZERS:
				return getCategorizers();
			case AnalysisPackage.DOC_ANALYSIS__DESCRIPTION:
				return getDescription();
			case AnalysisPackage.DOC_ANALYSIS__DATA_TOOLS:
				return getDataTools();
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
			case AnalysisPackage.DOC_ANALYSIS__COMPLETE:
				setComplete((Boolean)newValue);
				return;
			case AnalysisPackage.DOC_ANALYSIS__MAX_ELEMENTS:
				setMaxElements((Integer)newValue);
				return;
			case AnalysisPackage.DOC_ANALYSIS__CATEGORIZERS:
				getCategorizers().clear();
				getCategorizers().addAll((Collection<? extends Categorizer>)newValue);
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
			case AnalysisPackage.DOC_ANALYSIS__COMPLETE:
				setComplete(COMPLETE_EDEFAULT);
				return;
			case AnalysisPackage.DOC_ANALYSIS__MAX_ELEMENTS:
				setMaxElements(MAX_ELEMENTS_EDEFAULT);
				return;
			case AnalysisPackage.DOC_ANALYSIS__CATEGORIZERS:
				getCategorizers().clear();
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
			case AnalysisPackage.DOC_ANALYSIS__COMPLETE:
				return complete != COMPLETE_EDEFAULT;
			case AnalysisPackage.DOC_ANALYSIS__MAX_ELEMENTS:
				return maxElements != MAX_ELEMENTS_EDEFAULT;
			case AnalysisPackage.DOC_ANALYSIS__CATEGORIZERS:
				return categorizers != null && !categorizers.isEmpty();
			case AnalysisPackage.DOC_ANALYSIS__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? getDescription() != null : !DESCRIPTION_EDEFAULT.equals(getDescription());
			case AnalysisPackage.DOC_ANALYSIS__DATA_TOOLS:
				return !getDataTools().isEmpty();
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
		if (baseClass == DataToolContext.class) {
			switch (derivedFeatureID) {
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
		if (baseClass == DataToolContext.class) {
			switch (baseFeatureID) {
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
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == DocRef.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == DataToolContext.class) {
			switch (baseOperationID) {
				case DatatoolsPackage.DATA_TOOL_CONTEXT___GET_DOMAIN_TYPES: return AnalysisPackage.DOC_ANALYSIS___GET_DOMAIN_TYPES;
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
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
			case AnalysisPackage.DOC_ANALYSIS___ADD_TOOL__DATATOOL:
				addTool((DataTool)arguments.get(0));
				return null;
			case AnalysisPackage.DOC_ANALYSIS___IS_VALID_TOOL__DATATOOL:
				return isValidTool((DataTool)arguments.get(0));
			case AnalysisPackage.DOC_ANALYSIS___IS_VALID_EXTRACTOR__EXTRACTOR:
				return isValidExtractor((Extractor)arguments.get(0));
			case AnalysisPackage.DOC_ANALYSIS___IS_VALID_COLUMNIZER__COLUMNIZERABSTRACT:
				return isValidColumnizer((ColumnizerAbstract)arguments.get(0));
			case AnalysisPackage.DOC_ANALYSIS___IS_VALID_CATEGORIZER__CATEGORIZER:
				return isValidCategorizer((Categorizer)arguments.get(0));
			case AnalysisPackage.DOC_ANALYSIS___GET_DOMAIN_TYPES:
				return getDomainTypes();
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
		result.append(" (Complete: ");
		result.append(complete);
		result.append(", MaxElements: ");
		result.append(maxElements);
		result.append(')');
		return result.toString();
	}

} //DocAnalysisImpl
