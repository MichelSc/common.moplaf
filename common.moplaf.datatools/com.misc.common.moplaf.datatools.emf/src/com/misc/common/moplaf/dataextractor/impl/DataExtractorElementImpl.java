/**
 */
package com.misc.common.moplaf.dataextractor.impl;

import com.misc.common.moplaf.dataextractor.DataExtractor;
import com.misc.common.moplaf.dataextractor.DataExtractorElement;
import com.misc.common.moplaf.dataextractor.DataSelector;
import com.misc.common.moplaf.dataextractor.DataextractorPackage;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
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
 * An implementation of the model object '<em><b>Data Extractor Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.dataextractor.impl.DataExtractorElementImpl#getDataExtractor <em>Data Extractor</em>}</li>
 *   <li>{@link com.misc.common.moplaf.dataextractor.impl.DataExtractorElementImpl#getSequence <em>Sequence</em>}</li>
 *   <li>{@link com.misc.common.moplaf.dataextractor.impl.DataExtractorElementImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link com.misc.common.moplaf.dataextractor.impl.DataExtractorElementImpl#getSourceType <em>Source Type</em>}</li>
 *   <li>{@link com.misc.common.moplaf.dataextractor.impl.DataExtractorElementImpl#getTargetType <em>Target Type</em>}</li>
 *   <li>{@link com.misc.common.moplaf.dataextractor.impl.DataExtractorElementImpl#getPrevious <em>Previous</em>}</li>
 *   <li>{@link com.misc.common.moplaf.dataextractor.impl.DataExtractorElementImpl#getSelectors <em>Selectors</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class DataExtractorElementImpl extends MinimalEObjectImpl.Container implements DataExtractorElement {
	/**
	 * The default value of the '{@link #getSequence() <em>Sequence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequence()
	 * @generated
	 * @ordered
	 */
	protected static final int SEQUENCE_EDEFAULT = 0;

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
	 * The cached value of the '{@link #getSelectors() <em>Selectors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectors()
	 * @generated
	 * @ordered
	 */
	protected EList<DataSelector> selectors;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataExtractorElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataextractorPackage.Literals.DATA_EXTRACTOR_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataExtractor getDataExtractor() {
		if (eContainerFeatureID() != DataextractorPackage.DATA_EXTRACTOR_ELEMENT__DATA_EXTRACTOR) return null;
		return (DataExtractor)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataExtractor(DataExtractor newDataExtractor, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newDataExtractor, DataextractorPackage.DATA_EXTRACTOR_ELEMENT__DATA_EXTRACTOR, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataExtractor(DataExtractor newDataExtractor) {
		if (newDataExtractor != eInternalContainer() || (eContainerFeatureID() != DataextractorPackage.DATA_EXTRACTOR_ELEMENT__DATA_EXTRACTOR && newDataExtractor != null)) {
			if (EcoreUtil.isAncestor(this, newDataExtractor))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDataExtractor != null)
				msgs = ((InternalEObject)newDataExtractor).eInverseAdd(this, DataextractorPackage.DATA_EXTRACTOR__EXTRACTORS, DataExtractor.class, msgs);
			msgs = basicSetDataExtractor(newDataExtractor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataextractorPackage.DATA_EXTRACTOR_ELEMENT__DATA_EXTRACTOR, newDataExtractor, newDataExtractor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public int getSequence() {
		DataExtractor dataExtractor = this.getDataExtractor();
		int sequence = dataExtractor == null ? 0 : dataExtractor.getExtractors().indexOf(this);
		return sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public String getDescription() {
		String description = String.format("%d", this.getSequence());
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSourceType() {
		EClass sourceType = basicGetSourceType();
		return sourceType != null && sourceType.eIsProxy() ? (EClass)eResolveProxy((InternalEObject)sourceType) : sourceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public EClass basicGetSourceType() {
		DataExtractor dataExtractor = this.getDataExtractor();
		DataExtractorElement previous = this.getPrevious();
		if ( previous == null ) {
			return dataExtractor.getSourceType();
		} else {
			return previous.getTargetType();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTargetType() {
		EClass targetType = basicGetTargetType();
		return targetType != null && targetType.eIsProxy() ? (EClass)eResolveProxy((InternalEObject)targetType) : targetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass basicGetTargetType() {
		// TODO: implement this method to return the 'Target Type' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataExtractorElement getPrevious() {
		DataExtractorElement previous = basicGetPrevious();
		return previous != null && previous.eIsProxy() ? (DataExtractorElement)eResolveProxy((InternalEObject)previous) : previous;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public DataExtractorElement basicGetPrevious() {
		int thisSequence = this.getSequence();
		DataExtractor dataExtractor = this.getDataExtractor();
		if ( thisSequence == 0 ) { return null; }
		DataExtractorElement previous = dataExtractor.getExtractors().get(thisSequence-1);
		return previous;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataSelector> getSelectors() {
		if (selectors == null) {
			selectors = new EObjectContainmentWithInverseEList<DataSelector>(DataSelector.class, this, DataextractorPackage.DATA_EXTRACTOR_ELEMENT__SELECTORS, DataextractorPackage.DATA_SELECTOR__EXTRACTOR_ELEMENT);
		}
		return selectors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public boolean isSelected(EObject object) {
		for ( DataSelector selector : this.getSelectors()){
			if ( !selector.isSelected(object)){
				return false;
			}
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public EList<?> getResultSet() {
		// get the extract set
		EList<?> extractSet = this.getExtractSet();
		// build this result set
		EList<EObject> resultSet = new BasicEList<EObject>();
		for ( Object extracted : extractSet){
			if ( extracted instanceof EObject){
				EObject eExtracted = (EObject) extracted;
				if ( this.isSelected(eExtracted)){
					resultSet.add(eExtracted);
				}
			}
		}
		return resultSet;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<?> getExtractSet() {
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
			case DataextractorPackage.DATA_EXTRACTOR_ELEMENT__DATA_EXTRACTOR:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDataExtractor((DataExtractor)otherEnd, msgs);
			case DataextractorPackage.DATA_EXTRACTOR_ELEMENT__SELECTORS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSelectors()).basicAdd(otherEnd, msgs);
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
			case DataextractorPackage.DATA_EXTRACTOR_ELEMENT__DATA_EXTRACTOR:
				return basicSetDataExtractor(null, msgs);
			case DataextractorPackage.DATA_EXTRACTOR_ELEMENT__SELECTORS:
				return ((InternalEList<?>)getSelectors()).basicRemove(otherEnd, msgs);
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
			case DataextractorPackage.DATA_EXTRACTOR_ELEMENT__DATA_EXTRACTOR:
				return eInternalContainer().eInverseRemove(this, DataextractorPackage.DATA_EXTRACTOR__EXTRACTORS, DataExtractor.class, msgs);
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
			case DataextractorPackage.DATA_EXTRACTOR_ELEMENT__DATA_EXTRACTOR:
				return getDataExtractor();
			case DataextractorPackage.DATA_EXTRACTOR_ELEMENT__SEQUENCE:
				return getSequence();
			case DataextractorPackage.DATA_EXTRACTOR_ELEMENT__DESCRIPTION:
				return getDescription();
			case DataextractorPackage.DATA_EXTRACTOR_ELEMENT__SOURCE_TYPE:
				if (resolve) return getSourceType();
				return basicGetSourceType();
			case DataextractorPackage.DATA_EXTRACTOR_ELEMENT__TARGET_TYPE:
				if (resolve) return getTargetType();
				return basicGetTargetType();
			case DataextractorPackage.DATA_EXTRACTOR_ELEMENT__PREVIOUS:
				if (resolve) return getPrevious();
				return basicGetPrevious();
			case DataextractorPackage.DATA_EXTRACTOR_ELEMENT__SELECTORS:
				return getSelectors();
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
			case DataextractorPackage.DATA_EXTRACTOR_ELEMENT__DATA_EXTRACTOR:
				setDataExtractor((DataExtractor)newValue);
				return;
			case DataextractorPackage.DATA_EXTRACTOR_ELEMENT__SELECTORS:
				getSelectors().clear();
				getSelectors().addAll((Collection<? extends DataSelector>)newValue);
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
			case DataextractorPackage.DATA_EXTRACTOR_ELEMENT__DATA_EXTRACTOR:
				setDataExtractor((DataExtractor)null);
				return;
			case DataextractorPackage.DATA_EXTRACTOR_ELEMENT__SELECTORS:
				getSelectors().clear();
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
			case DataextractorPackage.DATA_EXTRACTOR_ELEMENT__DATA_EXTRACTOR:
				return getDataExtractor() != null;
			case DataextractorPackage.DATA_EXTRACTOR_ELEMENT__SEQUENCE:
				return getSequence() != SEQUENCE_EDEFAULT;
			case DataextractorPackage.DATA_EXTRACTOR_ELEMENT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? getDescription() != null : !DESCRIPTION_EDEFAULT.equals(getDescription());
			case DataextractorPackage.DATA_EXTRACTOR_ELEMENT__SOURCE_TYPE:
				return basicGetSourceType() != null;
			case DataextractorPackage.DATA_EXTRACTOR_ELEMENT__TARGET_TYPE:
				return basicGetTargetType() != null;
			case DataextractorPackage.DATA_EXTRACTOR_ELEMENT__PREVIOUS:
				return basicGetPrevious() != null;
			case DataextractorPackage.DATA_EXTRACTOR_ELEMENT__SELECTORS:
				return selectors != null && !selectors.isEmpty();
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
			case DataextractorPackage.DATA_EXTRACTOR_ELEMENT___IS_SELECTED__EOBJECT:
				return isSelected((EObject)arguments.get(0));
			case DataextractorPackage.DATA_EXTRACTOR_ELEMENT___GET_RESULT_SET:
				return getResultSet();
			case DataextractorPackage.DATA_EXTRACTOR_ELEMENT___GET_EXTRACT_SET:
				return getExtractSet();
		}
		return super.eInvoke(operationID, arguments);
	}

} //DataExtractorElementImpl
