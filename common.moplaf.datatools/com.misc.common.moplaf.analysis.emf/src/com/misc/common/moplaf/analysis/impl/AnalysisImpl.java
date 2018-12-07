/**
 */
package com.misc.common.moplaf.analysis.impl;

import com.misc.common.moplaf.analysis.AnalysisDomain;
import com.misc.common.moplaf.analysis.AnalysisElement;
import com.misc.common.moplaf.analysis.AnalysisFactory;
import com.misc.common.moplaf.analysis.AnalysisPackage;
import com.misc.common.moplaf.analysis.Analysis;
import com.misc.common.moplaf.analysis.AnalysisColumnizer;
import com.misc.common.moplaf.analysis.AnalysisDoc;
import com.misc.common.moplaf.common.EnabledFeedback;
import com.misc.common.moplaf.common.IMoplafObject;
import com.misc.common.moplaf.common.util.EObjectListDerived;
import com.misc.common.moplaf.datatools.Categorizer;
import com.misc.common.moplaf.datatools.Category;
import com.misc.common.moplaf.datatools.CategoryAbstract;
import com.misc.common.moplaf.datatools.CategoryFactory;
import com.misc.common.moplaf.datatools.ColumnizerAbstract;
import com.misc.common.moplaf.datatools.Columnizers;
import com.misc.common.moplaf.datatools.DataTool;
import com.misc.common.moplaf.datatools.DataToolContext;
import com.misc.common.moplaf.datatools.DatatoolsPackage;
import com.misc.common.moplaf.datatools.Extractor;
import com.misc.common.moplaf.datatools.impl.CategoryAbstractImpl;
import com.misc.common.moplaf.datatools.util.ObjectSet;
import com.misc.common.moplaf.job.Doc;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Iterator;
import java.util.stream.Collectors;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
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
 *   <li>{@link com.misc.common.moplaf.analysis.impl.AnalysisImpl#getColumnizers <em>Columnizers</em>}</li>
 *   <li>{@link com.misc.common.moplaf.analysis.impl.AnalysisImpl#getCategorizers <em>Categorizers</em>}</li>
 *   <li>{@link com.misc.common.moplaf.analysis.impl.AnalysisImpl#getExtractor <em>Extractor</em>}</li>
 *   <li>{@link com.misc.common.moplaf.analysis.impl.AnalysisImpl#isComplete <em>Complete</em>}</li>
 *   <li>{@link com.misc.common.moplaf.analysis.impl.AnalysisImpl#getMaxElements <em>Max Elements</em>}</li>
 *   <li>{@link com.misc.common.moplaf.analysis.impl.AnalysisImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link com.misc.common.moplaf.analysis.impl.AnalysisImpl#getDataTools <em>Data Tools</em>}</li>
 *   <li>{@link com.misc.common.moplaf.analysis.impl.AnalysisImpl#getDomain <em>Domain</em>}</li>
 *   <li>{@link com.misc.common.moplaf.analysis.impl.AnalysisImpl#getRefreshFeedback <em>Refresh Feedback</em>}</li>
 *   <li>{@link com.misc.common.moplaf.analysis.impl.AnalysisImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.misc.common.moplaf.analysis.impl.AnalysisImpl#getRemarks <em>Remarks</em>}</li>
 *   <li>{@link com.misc.common.moplaf.analysis.impl.AnalysisImpl#getDocs <em>Docs</em>}</li>
 *   <li>{@link com.misc.common.moplaf.analysis.impl.AnalysisImpl#getSheets <em>Sheets</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnalysisImpl extends CategoryAbstractImpl implements Analysis, IMoplafObject {
	/**
	 * The cached value of the '{@link #getColumnizers() <em>Columnizers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnizers()
	 * @generated
	 * @ordered
	 */
	protected EList<ColumnizerAbstract> columnizers;

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
	 * The cached value of the '{@link #getExtractor() <em>Extractor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtractor()
	 * @generated
	 * @ordered
	 */
	protected Extractor extractor;

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
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getRefreshFeedback() <em>Refresh Feedback</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefreshFeedback()
	 * @generated
	 * @ordered
	 */
	protected static final EnabledFeedback REFRESH_FEEDBACK_EDEFAULT = null;

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
	 * The default value of the '{@link #getRemarks() <em>Remarks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemarks()
	 * @generated
	 * @ordered
	 */
	protected static final String REMARKS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRemarks() <em>Remarks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemarks()
	 * @generated
	 * @ordered
	 */
	protected String remarks = REMARKS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDocs() <em>Docs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocs()
	 * @generated
	 * @ordered
	 */
	protected EList<AnalysisDoc> docs;

	/**
	 * The cached value of the '{@link #getSheets() <em>Sheets</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSheets()
	 * @generated
	 * @ordered
	 */
	protected EList<AnalysisColumnizer> sheets;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnalysisImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AnalysisPackage.Literals.ANALYSIS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ColumnizerAbstract> getColumnizers() {
		if (columnizers == null) {
			columnizers = new EObjectContainmentEList<ColumnizerAbstract>(ColumnizerAbstract.class, this, AnalysisPackage.ANALYSIS__COLUMNIZERS);
		}
		return columnizers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Columnizers basicGetColumnizerSet() {
		return this;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnalysisPackage.ANALYSIS__EXTRACTOR, oldExtractor, newExtractor);
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
				msgs = ((InternalEObject)extractor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnalysisPackage.ANALYSIS__EXTRACTOR, null, msgs);
			if (newExtractor != null)
				msgs = ((InternalEObject)newExtractor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnalysisPackage.ANALYSIS__EXTRACTOR, null, msgs);
			msgs = basicSetExtractor(newExtractor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysisPackage.ANALYSIS__EXTRACTOR, newExtractor, newExtractor));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysisPackage.ANALYSIS__COMPLETE, oldComplete, complete));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysisPackage.ANALYSIS__MAX_ELEMENTS, oldMaxElements, maxElements));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Categorizer> getCategorizers() {
		if (categorizers == null) {
			categorizers = new EObjectContainmentEList<Categorizer>(Categorizer.class, this, AnalysisPackage.ANALYSIS__CATEGORIZERS);
		}
		return categorizers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public String getDescription() {
		String description = this.getDocs().stream()
				.map(d -> d.getDoc().getDescription())
				.collect(Collectors.joining(","));
		String name = this.getName();
		if ( name!=null && name.length()>0 ) {
			description += String.format(": %s", name);
		}
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
		EList<DataTool> newList = new EObjectListDerived<DataTool>(DataTool.class, this, AnalysisPackage.ANALYSIS__DATA_TOOLS, true);
		
		// Extractor
		Extractor extractor = this.getExtractor();
		if ( extractor!=null) {
			newList.add(extractor);
		}
		
		// Columnizer
		for ( ColumnizerAbstract columnizer : this.getColumnizers()) {
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
	 * @generated
	 */
	public AnalysisDomain getDomain() {
		if (eContainerFeatureID() != AnalysisPackage.ANALYSIS__DOMAIN) return null;
		return (AnalysisDomain)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDomain(AnalysisDomain newDomain, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newDomain, AnalysisPackage.ANALYSIS__DOMAIN, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomain(AnalysisDomain newDomain) {
		if (newDomain != eInternalContainer() || (eContainerFeatureID() != AnalysisPackage.ANALYSIS__DOMAIN && newDomain != null)) {
			if (EcoreUtil.isAncestor(this, newDomain))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDomain != null)
				msgs = ((InternalEObject)newDomain).eInverseAdd(this, AnalysisPackage.ANALYSIS_DOMAIN__ANALYSES, AnalysisDomain.class, msgs);
			msgs = basicSetDomain(newDomain, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysisPackage.ANALYSIS__DOMAIN, newDomain, newDomain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public EnabledFeedback getRefreshFeedback() {
		if ( this.getDocs().isEmpty() ) {
			return new EnabledFeedback(false, "No document");
		}
		Extractor extractor = this.getExtractor();
		if ( extractor==null ) {
			return new EnabledFeedback(false, "No extractor");
		}
		if ( !this.getDocs().stream().allMatch(d -> extractor.isValidRoot(d.getDoc()))){
			return new EnabledFeedback(false, "Extractor not valid for some document");
		}
		return EnabledFeedback.NOFEEDBACK;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysisPackage.ANALYSIS__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRemarks() {
		return remarks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemarks(String newRemarks) {
		String oldRemarks = remarks;
		remarks = newRemarks;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysisPackage.ANALYSIS__REMARKS, oldRemarks, remarks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AnalysisDoc> getDocs() {
		if (docs == null) {
			docs = new EObjectContainmentWithInverseEList<AnalysisDoc>(AnalysisDoc.class, this, AnalysisPackage.ANALYSIS__DOCS, AnalysisPackage.ANALYSIS_DOC__ANALYSIS);
		}
		return docs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AnalysisColumnizer> getSheets() {
		if (sheets == null) {
			sheets = new EObjectContainmentWithInverseEList<AnalysisColumnizer>(AnalysisColumnizer.class, this, AnalysisPackage.ANALYSIS__SHEETS, AnalysisPackage.ANALYSIS_COLUMNIZER__ANALYSIS);
		}
		return sheets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public int getNbElements() {
		return this.getElements().size();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void refresh() {
		Extractor extractor = this.getExtractor();
		boolean complete = true;
		ObjectSet els_tobe = new ObjectSet();

		// for every doc
		for ( AnalysisDoc doc : this.getDocs()) {
			// extract
			ObjectSet ins = new ObjectSet();
			ins.add(doc.getDoc());
			ObjectSet outs = extractor.extract(ins, this.getMaxElements());
			// complete
			boolean doc_is_complete = outs.isComplete();
			doc.setComplete(doc_is_complete);
			complete = complete && doc_is_complete;
			// synch the els
			// remove the too many
			Iterator<AnalysisElement> iterator_asis = doc.getElements().iterator();
			while ( iterator_asis.hasNext()) {
				AnalysisElement asis = iterator_asis.next();
				if ( !outs.remove(asis.getElement())) {
					// the asis is not tobe
					iterator_asis.remove();
				} else {
					els_tobe.add(asis.getElement());
				}
			}
			// add the too few
			for ( EObject to_add : outs) {
				AnalysisElement new_analysis_ele = AnalysisFactory.eINSTANCE.createAnalysisElement();
				new_analysis_ele.setElement(to_add);
				doc.getElements().add(new_analysis_ele);
				els_tobe.add(new_analysis_ele);
			}
		} // traverse the docs
		this.setComplete(complete);
		
		// refresh the set of elements and the categories
		this.refresh(this, els_tobe,  this.getCategorizers(), 0);
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
			this.getColumnizers().add((ColumnizerAbstract)new_tool);
		} else if ( new_tool instanceof Extractor ) {
		this.setExtractor((Extractor)new_tool);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void addDoc(Doc doc) {
		AnalysisDoc analysis_doc = AnalysisFactory.eINSTANCE.createAnalysisDoc();
		analysis_doc.setDoc(doc);
		this.getDocs().add(analysis_doc);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void flush() {
		this.getElements().clear();
		this.getSubCategories().clear();
		for ( AnalysisDoc doc : this.getDocs()) {
			doc.flush();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Category constructCategory() {
		return AnalysisFactory.eINSTANCE.createAnalysisCategory();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void setLeafCategory(EObject object, CategoryAbstract category) {
		AnalysisElement analysis_ele = (AnalysisElement)object;
		analysis_ele.setCategory(category);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public EList<EClass> getDomainTypes() {
		BasicEList<EClass> classes = new BasicEList<EClass>();
		if ( !this.getDocs().isEmpty()) {
			// all the docs should belong to the same domain
			Doc doc = this.getDocs().get(0).getDoc();
			if ( doc != null ) {
				EList<EClassifier> classifiers = doc.eClass().getEPackage().getEClassifiers();
				for ( EClassifier classifier : classifiers) {
					if ( classifier instanceof EClass ) {
						classes.add((EClass)classifier);
					}
				}
			}
		}
		return classes;
	}

	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Columnizers basicGetColumnizers() {
		return this;
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
			case AnalysisPackage.ANALYSIS__DOMAIN:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDomain((AnalysisDomain)otherEnd, msgs);
			case AnalysisPackage.ANALYSIS__DOCS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDocs()).basicAdd(otherEnd, msgs);
			case AnalysisPackage.ANALYSIS__SHEETS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSheets()).basicAdd(otherEnd, msgs);
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
			case AnalysisPackage.ANALYSIS__COLUMNIZERS:
				return ((InternalEList<?>)getColumnizers()).basicRemove(otherEnd, msgs);
			case AnalysisPackage.ANALYSIS__CATEGORIZERS:
				return ((InternalEList<?>)getCategorizers()).basicRemove(otherEnd, msgs);
			case AnalysisPackage.ANALYSIS__EXTRACTOR:
				return basicSetExtractor(null, msgs);
			case AnalysisPackage.ANALYSIS__DOMAIN:
				return basicSetDomain(null, msgs);
			case AnalysisPackage.ANALYSIS__DOCS:
				return ((InternalEList<?>)getDocs()).basicRemove(otherEnd, msgs);
			case AnalysisPackage.ANALYSIS__SHEETS:
				return ((InternalEList<?>)getSheets()).basicRemove(otherEnd, msgs);
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
			case AnalysisPackage.ANALYSIS__DOMAIN:
				return eInternalContainer().eInverseRemove(this, AnalysisPackage.ANALYSIS_DOMAIN__ANALYSES, AnalysisDomain.class, msgs);
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
			case AnalysisPackage.ANALYSIS__COLUMNIZERS:
				return getColumnizers();
			case AnalysisPackage.ANALYSIS__CATEGORIZERS:
				return getCategorizers();
			case AnalysisPackage.ANALYSIS__EXTRACTOR:
				return getExtractor();
			case AnalysisPackage.ANALYSIS__COMPLETE:
				return isComplete();
			case AnalysisPackage.ANALYSIS__MAX_ELEMENTS:
				return getMaxElements();
			case AnalysisPackage.ANALYSIS__DESCRIPTION:
				return getDescription();
			case AnalysisPackage.ANALYSIS__DATA_TOOLS:
				return getDataTools();
			case AnalysisPackage.ANALYSIS__DOMAIN:
				return getDomain();
			case AnalysisPackage.ANALYSIS__REFRESH_FEEDBACK:
				return getRefreshFeedback();
			case AnalysisPackage.ANALYSIS__NAME:
				return getName();
			case AnalysisPackage.ANALYSIS__REMARKS:
				return getRemarks();
			case AnalysisPackage.ANALYSIS__DOCS:
				return getDocs();
			case AnalysisPackage.ANALYSIS__SHEETS:
				return getSheets();
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
			case AnalysisPackage.ANALYSIS__COLUMNIZERS:
				getColumnizers().clear();
				getColumnizers().addAll((Collection<? extends ColumnizerAbstract>)newValue);
				return;
			case AnalysisPackage.ANALYSIS__CATEGORIZERS:
				getCategorizers().clear();
				getCategorizers().addAll((Collection<? extends Categorizer>)newValue);
				return;
			case AnalysisPackage.ANALYSIS__EXTRACTOR:
				setExtractor((Extractor)newValue);
				return;
			case AnalysisPackage.ANALYSIS__COMPLETE:
				setComplete((Boolean)newValue);
				return;
			case AnalysisPackage.ANALYSIS__MAX_ELEMENTS:
				setMaxElements((Integer)newValue);
				return;
			case AnalysisPackage.ANALYSIS__DOMAIN:
				setDomain((AnalysisDomain)newValue);
				return;
			case AnalysisPackage.ANALYSIS__NAME:
				setName((String)newValue);
				return;
			case AnalysisPackage.ANALYSIS__REMARKS:
				setRemarks((String)newValue);
				return;
			case AnalysisPackage.ANALYSIS__DOCS:
				getDocs().clear();
				getDocs().addAll((Collection<? extends AnalysisDoc>)newValue);
				return;
			case AnalysisPackage.ANALYSIS__SHEETS:
				getSheets().clear();
				getSheets().addAll((Collection<? extends AnalysisColumnizer>)newValue);
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
			case AnalysisPackage.ANALYSIS__COLUMNIZERS:
				getColumnizers().clear();
				return;
			case AnalysisPackage.ANALYSIS__CATEGORIZERS:
				getCategorizers().clear();
				return;
			case AnalysisPackage.ANALYSIS__EXTRACTOR:
				setExtractor((Extractor)null);
				return;
			case AnalysisPackage.ANALYSIS__COMPLETE:
				setComplete(COMPLETE_EDEFAULT);
				return;
			case AnalysisPackage.ANALYSIS__MAX_ELEMENTS:
				setMaxElements(MAX_ELEMENTS_EDEFAULT);
				return;
			case AnalysisPackage.ANALYSIS__DOMAIN:
				setDomain((AnalysisDomain)null);
				return;
			case AnalysisPackage.ANALYSIS__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AnalysisPackage.ANALYSIS__REMARKS:
				setRemarks(REMARKS_EDEFAULT);
				return;
			case AnalysisPackage.ANALYSIS__DOCS:
				getDocs().clear();
				return;
			case AnalysisPackage.ANALYSIS__SHEETS:
				getSheets().clear();
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
			case AnalysisPackage.ANALYSIS__COLUMNIZERS:
				return columnizers != null && !columnizers.isEmpty();
			case AnalysisPackage.ANALYSIS__CATEGORIZERS:
				return categorizers != null && !categorizers.isEmpty();
			case AnalysisPackage.ANALYSIS__EXTRACTOR:
				return extractor != null;
			case AnalysisPackage.ANALYSIS__COMPLETE:
				return complete != COMPLETE_EDEFAULT;
			case AnalysisPackage.ANALYSIS__MAX_ELEMENTS:
				return maxElements != MAX_ELEMENTS_EDEFAULT;
			case AnalysisPackage.ANALYSIS__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? getDescription() != null : !DESCRIPTION_EDEFAULT.equals(getDescription());
			case AnalysisPackage.ANALYSIS__DATA_TOOLS:
				return !getDataTools().isEmpty();
			case AnalysisPackage.ANALYSIS__DOMAIN:
				return getDomain() != null;
			case AnalysisPackage.ANALYSIS__REFRESH_FEEDBACK:
				return REFRESH_FEEDBACK_EDEFAULT == null ? getRefreshFeedback() != null : !REFRESH_FEEDBACK_EDEFAULT.equals(getRefreshFeedback());
			case AnalysisPackage.ANALYSIS__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AnalysisPackage.ANALYSIS__REMARKS:
				return REMARKS_EDEFAULT == null ? remarks != null : !REMARKS_EDEFAULT.equals(remarks);
			case AnalysisPackage.ANALYSIS__DOCS:
				return docs != null && !docs.isEmpty();
			case AnalysisPackage.ANALYSIS__SHEETS:
				return sheets != null && !sheets.isEmpty();
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
		if (baseClass == DataToolContext.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Columnizers.class) {
			switch (derivedFeatureID) {
				case AnalysisPackage.ANALYSIS__COLUMNIZERS: return DatatoolsPackage.COLUMNIZERS__COLUMNIZERS;
				default: return -1;
			}
		}
		if (baseClass == CategoryFactory.class) {
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
		if (baseClass == DataToolContext.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Columnizers.class) {
			switch (baseFeatureID) {
				case DatatoolsPackage.COLUMNIZERS__COLUMNIZERS: return AnalysisPackage.ANALYSIS__COLUMNIZERS;
				default: return -1;
			}
		}
		if (baseClass == CategoryFactory.class) {
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
		if (baseClass == DataToolContext.class) {
			switch (baseOperationID) {
				case DatatoolsPackage.DATA_TOOL_CONTEXT___GET_DOMAIN_TYPES: return AnalysisPackage.ANALYSIS___GET_DOMAIN_TYPES;
				default: return -1;
			}
		}
		if (baseClass == Columnizers.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == CategoryFactory.class) {
			switch (baseOperationID) {
				case DatatoolsPackage.CATEGORY_FACTORY___CONSTRUCT_CATEGORY: return AnalysisPackage.ANALYSIS___CONSTRUCT_CATEGORY;
				case DatatoolsPackage.CATEGORY_FACTORY___SET_LEAF_CATEGORY__EOBJECT_CATEGORYABSTRACT: return AnalysisPackage.ANALYSIS___SET_LEAF_CATEGORY__EOBJECT_CATEGORYABSTRACT;
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
			case AnalysisPackage.ANALYSIS___ADD_TOOL__DATATOOL:
				addTool((DataTool)arguments.get(0));
				return null;
			case AnalysisPackage.ANALYSIS___ADD_DOC__DOC:
				addDoc((Doc)arguments.get(0));
				return null;
			case AnalysisPackage.ANALYSIS___REFRESH:
				refresh();
				return null;
			case AnalysisPackage.ANALYSIS___FLUSH:
				flush();
				return null;
			case AnalysisPackage.ANALYSIS___CONSTRUCT_CATEGORY:
				return constructCategory();
			case AnalysisPackage.ANALYSIS___SET_LEAF_CATEGORY__EOBJECT_CATEGORYABSTRACT:
				setLeafCategory((EObject)arguments.get(0), (CategoryAbstract)arguments.get(1));
				return null;
			case AnalysisPackage.ANALYSIS___GET_DOMAIN_TYPES:
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
		result.append(", Name: ");
		result.append(name);
		result.append(", Remarks: ");
		result.append(remarks);
		result.append(')');
		return result.toString();
	}

} //DocAnalysisImpl
