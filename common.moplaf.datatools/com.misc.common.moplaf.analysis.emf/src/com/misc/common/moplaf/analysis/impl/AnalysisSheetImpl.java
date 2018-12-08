/**
 */
package com.misc.common.moplaf.analysis.impl;

import com.misc.common.moplaf.analysis.Analysis;
import com.misc.common.moplaf.analysis.AnalysisElement;
import com.misc.common.moplaf.analysis.AnalysisElementKey;
import com.misc.common.moplaf.analysis.AnalysisFactory;
import com.misc.common.moplaf.analysis.AnalysisPackage;
import com.misc.common.moplaf.analysis.AnalysisSheet;

import com.misc.common.moplaf.analysis.ElementKey;
import com.misc.common.moplaf.common.IPropertiesProvider;
import com.misc.common.moplaf.datatools.ColumnizerAbstract;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

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
	 * Index on the key objects
	 */
	private HashMap<ElementKey, AnalysisElementKey> analysisKeyIndex = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	private void indexAnalysisKey(AnalysisElementKey element_key, ElementKey key) {
		if ( this.analysisKeyIndex!=null){
			this.analysisKeyIndex.put(key, element_key);
			element_key.setIndexKey(key);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	private void unindexAnalysisKey(AnalysisElementKey element_key) {
		if ( analysisKeyIndex!=null){
			this.analysisKeyIndex.remove(element_key.getIndexKey());
			element_key.setIndexKey(null);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	private void refreshIndex() {
		// brute force refresh
		// we will do beter when we will know how the refresh is needed
		this.analysisKeyIndex = new HashMap<ElementKey, AnalysisElementKey>();
		for ( AnalysisElementKey element_key : this.getKeys()){
			ElementKey key = this.getKeyValue(element_key);
			this.indexAnalysisKey(element_key, key);
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	private AnalysisElementKey getAnalysisElementKey(ElementKey key) {
		if ( this.analysisKeyIndex==null){
			this.refreshIndex();
		}
		AnalysisElementKey element_key = this.analysisKeyIndex.get(key);
		return element_key;
	}

	/**
	 * The cached value of the '{@link #getKeys() <em>Keys</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeys()
	 * @generated
	 * @ordered
	 */
	protected EList<AnalysisElementKey> keys;

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
	public EList<AnalysisElementKey> getKeys() {
		if (keys == null) {
			keys = new EObjectContainmentWithInverseEList<AnalysisElementKey>(AnalysisElementKey.class, this, AnalysisPackage.ANALYSIS_SHEET__KEYS, AnalysisPackage.ANALYSIS_ELEMENT_KEY__SHEET);
		}
		return keys;
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
	 */
	public void addElement(AnalysisElement element) {
		ElementKey key = this.getKeyValue(element.getElement());
		AnalysisElementKey  element_key = this.getAnalysisElementKey(key);
		if ( element_key == null) {
			element_key = AnalysisFactory.eINSTANCE.createAnalysisElementKey();
			this.getKeys().add(element_key);
			this.indexAnalysisKey(element_key, key);
		}
		element_key.getDocs().add(element);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void removeElement(AnalysisElement element) {
		ElementKey key = this.getKeyValue(element);
		AnalysisElementKey  element_key = this.getAnalysisElementKey(key);
		element_key.getDocs().remove(element);
		if ( element_key.getDocs().size()==0 ) {
			this.unindexAnalysisKey(element_key);
			this.getKeys().remove(element_key);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public ElementKey getKeyValue(EObject element) {
		IPropertiesProvider properties = this.getColumnizer().getPropertiesProvider();
		ArrayList<Object> keys = new ArrayList<>();
		for ( Object property : properties.getProperties()) {
			if ( properties.isPropertyKey(property) ) {
				keys.add(properties.getPropertyValue(element, property));
			}
		}
		if ( keys.size()==0 ) {
			keys.add(element);
		}
		return new ElementKey(keys.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void flush() {
		this.getKeys().clear();
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
			case AnalysisPackage.ANALYSIS_SHEET__KEYS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getKeys()).basicAdd(otherEnd, msgs);
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
				return ((InternalEList<?>)getKeys()).basicRemove(otherEnd, msgs);
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
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AnalysisPackage.ANALYSIS_SHEET__KEYS:
				getKeys().clear();
				getKeys().addAll((Collection<? extends AnalysisElementKey>)newValue);
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
				getKeys().clear();
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
				return keys != null && !keys.isEmpty();
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
			case AnalysisPackage.ANALYSIS_SHEET___FLUSH:
				flush();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //AnalysisSheetImpl
