/**
 */
package com.misc.common.moplaf.analysis.impl;

import com.misc.common.moplaf.analysis.Analysis;
import com.misc.common.moplaf.analysis.AnalysisDoc;
import com.misc.common.moplaf.analysis.AnalysisElement;
import com.misc.common.moplaf.analysis.AnalysisPackage;
import com.misc.common.moplaf.common.IPropertiesProvider;
import com.misc.common.moplaf.datatools.CategoryAbstract;
import com.misc.common.moplaf.job.impl.DocRefImpl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.stream.Collectors;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Doc</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.analysis.impl.AnalysisDocImpl#getAnalysis <em>Analysis</em>}</li>
 *   <li>{@link com.misc.common.moplaf.analysis.impl.AnalysisDocImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link com.misc.common.moplaf.analysis.impl.AnalysisDocImpl#isComplete <em>Complete</em>}</li>
 *   <li>{@link com.misc.common.moplaf.analysis.impl.AnalysisDocImpl#getNbElements <em>Nb Elements</em>}</li>
 *   <li>{@link com.misc.common.moplaf.analysis.impl.AnalysisDocImpl#getDocIndex <em>Doc Index</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnalysisDocImpl extends DocRefImpl implements AnalysisDoc {
	/**
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected EList<AnalysisElement> elements;

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
	 * The default value of the '{@link #getNbElements() <em>Nb Elements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbElements()
	 * @generated
	 * @ordered
	 */
	protected static final int NB_ELEMENTS_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getDocIndex() <em>Doc Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocIndex()
	 * @generated
	 * @ordered
	 */
	protected static final int DOC_INDEX_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDocIndex() <em>Doc Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocIndex()
	 * @generated
	 * @ordered
	 */
	protected int docIndex = DOC_INDEX_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnalysisDocImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AnalysisPackage.Literals.ANALYSIS_DOC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Analysis getAnalysis() {
		if (eContainerFeatureID() != AnalysisPackage.ANALYSIS_DOC__ANALYSIS) return null;
		return (Analysis)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnalysis(Analysis newAnalysis, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newAnalysis, AnalysisPackage.ANALYSIS_DOC__ANALYSIS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnalysis(Analysis newAnalysis) {
		if (newAnalysis != eInternalContainer() || (eContainerFeatureID() != AnalysisPackage.ANALYSIS_DOC__ANALYSIS && newAnalysis != null)) {
			if (EcoreUtil.isAncestor(this, newAnalysis))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newAnalysis != null)
				msgs = ((InternalEObject)newAnalysis).eInverseAdd(this, AnalysisPackage.ANALYSIS__DOCS, Analysis.class, msgs);
			msgs = basicSetAnalysis(newAnalysis, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysisPackage.ANALYSIS_DOC__ANALYSIS, newAnalysis, newAnalysis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AnalysisElement> getElements() {
		if (elements == null) {
			elements = new EObjectContainmentWithInverseEList<AnalysisElement>(AnalysisElement.class, this, AnalysisPackage.ANALYSIS_DOC__ELEMENTS, AnalysisPackage.ANALYSIS_ELEMENT__DOC);
		}
		return elements;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysisPackage.ANALYSIS_DOC__COMPLETE, oldComplete, complete));
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
	 * @generated
	 */
	public int getDocIndex() {
		return docIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocIndex(int newDocIndex) {
		int oldDocIndex = docIndex;
		docIndex = newDocIndex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysisPackage.ANALYSIS_DOC__DOC_INDEX, oldDocIndex, docIndex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public EList<EObject> getElements(CategoryAbstract category) {
		// we must select all the elements belonging to this doc and this category
		// we can start from this doc: no good, as we will traverse the whole doc each time
		// we can start form the category: good, as this is a smaller set
		EList<EObject> objects = category.getElements().stream()
					.map(e->(AnalysisElement)e)
					.filter(e->e.getDoc()==doc)
					.map(e->e.getElement())
					.collect(Collectors.toCollection(BasicEList::new));	
		return objects;
		}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void flush() {
		this.getElements().clear();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Object getPropertyAggregation(IPropertiesProvider provider, Object property, CategoryAbstract category) {
		EList<EObject> objects = this.getElements(category);
		
		Object value = property==null
				? objects.size()
				: provider.getAggregationValue(objects, property);
				
		return value;
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
			case AnalysisPackage.ANALYSIS_DOC__ANALYSIS:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetAnalysis((Analysis)otherEnd, msgs);
			case AnalysisPackage.ANALYSIS_DOC__ELEMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getElements()).basicAdd(otherEnd, msgs);
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
			case AnalysisPackage.ANALYSIS_DOC__ANALYSIS:
				return basicSetAnalysis(null, msgs);
			case AnalysisPackage.ANALYSIS_DOC__ELEMENTS:
				return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
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
			case AnalysisPackage.ANALYSIS_DOC__ANALYSIS:
				return eInternalContainer().eInverseRemove(this, AnalysisPackage.ANALYSIS__DOCS, Analysis.class, msgs);
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
			case AnalysisPackage.ANALYSIS_DOC__ANALYSIS:
				return getAnalysis();
			case AnalysisPackage.ANALYSIS_DOC__ELEMENTS:
				return getElements();
			case AnalysisPackage.ANALYSIS_DOC__COMPLETE:
				return isComplete();
			case AnalysisPackage.ANALYSIS_DOC__NB_ELEMENTS:
				return getNbElements();
			case AnalysisPackage.ANALYSIS_DOC__DOC_INDEX:
				return getDocIndex();
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
			case AnalysisPackage.ANALYSIS_DOC__ANALYSIS:
				setAnalysis((Analysis)newValue);
				return;
			case AnalysisPackage.ANALYSIS_DOC__ELEMENTS:
				getElements().clear();
				getElements().addAll((Collection<? extends AnalysisElement>)newValue);
				return;
			case AnalysisPackage.ANALYSIS_DOC__COMPLETE:
				setComplete((Boolean)newValue);
				return;
			case AnalysisPackage.ANALYSIS_DOC__DOC_INDEX:
				setDocIndex((Integer)newValue);
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
			case AnalysisPackage.ANALYSIS_DOC__ANALYSIS:
				setAnalysis((Analysis)null);
				return;
			case AnalysisPackage.ANALYSIS_DOC__ELEMENTS:
				getElements().clear();
				return;
			case AnalysisPackage.ANALYSIS_DOC__COMPLETE:
				setComplete(COMPLETE_EDEFAULT);
				return;
			case AnalysisPackage.ANALYSIS_DOC__DOC_INDEX:
				setDocIndex(DOC_INDEX_EDEFAULT);
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
			case AnalysisPackage.ANALYSIS_DOC__ANALYSIS:
				return getAnalysis() != null;
			case AnalysisPackage.ANALYSIS_DOC__ELEMENTS:
				return elements != null && !elements.isEmpty();
			case AnalysisPackage.ANALYSIS_DOC__COMPLETE:
				return complete != COMPLETE_EDEFAULT;
			case AnalysisPackage.ANALYSIS_DOC__NB_ELEMENTS:
				return getNbElements() != NB_ELEMENTS_EDEFAULT;
			case AnalysisPackage.ANALYSIS_DOC__DOC_INDEX:
				return docIndex != DOC_INDEX_EDEFAULT;
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
			case AnalysisPackage.ANALYSIS_DOC___GET_ELEMENTS__CATEGORYABSTRACT:
				return getElements((CategoryAbstract)arguments.get(0));
			case AnalysisPackage.ANALYSIS_DOC___FLUSH:
				flush();
				return null;
			case AnalysisPackage.ANALYSIS_DOC___GET_PROPERTY_AGGREGATION__IPROPERTIESPROVIDER_OBJECT_CATEGORYABSTRACT:
				return getPropertyAggregation((IPropertiesProvider)arguments.get(0), arguments.get(1), (CategoryAbstract)arguments.get(2));
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
		result.append(", DocIndex: ");
		result.append(docIndex);
		result.append(')');
		return result.toString();
	}

} //AnalysisDocImpl
