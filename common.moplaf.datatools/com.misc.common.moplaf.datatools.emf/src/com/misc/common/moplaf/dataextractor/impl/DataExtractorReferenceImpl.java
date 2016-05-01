/**
 */
package com.misc.common.moplaf.dataextractor.impl;

import com.misc.common.moplaf.dataextractor.DataExtractor;
import com.misc.common.moplaf.dataextractor.DataExtractorElement;
import com.misc.common.moplaf.dataextractor.DataExtractorReference;
import com.misc.common.moplaf.dataextractor.DataextractorPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Extractor Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.dataextractor.impl.DataExtractorReferenceImpl#getExtractorReference <em>Extractor Reference</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataExtractorReferenceImpl extends DataExtractorElementImpl implements DataExtractorReference {
	/**
	 * The cached value of the '{@link #getExtractorReference() <em>Extractor Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtractorReference()
	 * @generated
	 * @ordered
	 */
	protected EReference extractorReference;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataExtractorReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataextractorPackage.Literals.DATA_EXTRACTOR_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtractorReference() {
		if (extractorReference != null && extractorReference.eIsProxy()) {
			InternalEObject oldExtractorReference = (InternalEObject)extractorReference;
			extractorReference = (EReference)eResolveProxy(oldExtractorReference);
			if (extractorReference != oldExtractorReference) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataextractorPackage.DATA_EXTRACTOR_REFERENCE__EXTRACTOR_REFERENCE, oldExtractorReference, extractorReference));
			}
		}
		return extractorReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference basicGetExtractorReference() {
		return extractorReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtractorReference(EReference newExtractorReference) {
		EReference oldExtractorReference = extractorReference;
		extractorReference = newExtractorReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataextractorPackage.DATA_EXTRACTOR_REFERENCE__EXTRACTOR_REFERENCE, oldExtractorReference, extractorReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataextractorPackage.DATA_EXTRACTOR_REFERENCE__EXTRACTOR_REFERENCE:
				if (resolve) return getExtractorReference();
				return basicGetExtractorReference();
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
			case DataextractorPackage.DATA_EXTRACTOR_REFERENCE__EXTRACTOR_REFERENCE:
				setExtractorReference((EReference)newValue);
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
			case DataextractorPackage.DATA_EXTRACTOR_REFERENCE__EXTRACTOR_REFERENCE:
				setExtractorReference((EReference)null);
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
			case DataextractorPackage.DATA_EXTRACTOR_REFERENCE__EXTRACTOR_REFERENCE:
				return extractorReference != null;
		}
		return super.eIsSet(featureID);
	}

	/* (non-Javadoc)
	 * @see com.misc.common.moplaf.dataextractor.impl.DataExtractorElementImpl#getDescription()
	 */
	@Override
	public String getDescription() {
		String baseDescription = super.getDescription();
		String thisDescription = this.getExtractorReference()==null ? "null" : this.getExtractorReference().getName();
		String description = String.format("%s/%s", baseDescription, thisDescription);
		return description;
	}

	/* (non-Javadoc)
	 * @see com.misc.common.moplaf.dataextractor.impl.DataExtractorElementImpl#basicGetTargetType()
	 */
	@Override
	public EClass basicGetTargetType() {
		if ( this.getExtractorReference()==null){ return null; }
		return this.getExtractorReference().getEReferenceType();
	}

	/* (non-Javadoc)
	 * @see com.misc.common.moplaf.dataextractor.impl.DataExtractorElementImpl#getResultSet()
	 */
	@Override
	public EList<?> getExtractSet() {
		// get the previous result set
		EList<?> previousResultSet;
		DataExtractor dataExtractor = this.getDataExtractor();
		EReference extractorRef = this.getExtractorReference();
		DataExtractorElement previousExtractor = this.getPrevious();
		if ( previousExtractor==null){
			BasicEList<EObject> tmpSet = new BasicEList<EObject>();
			if ( dataExtractor.getSourceObject()!=null){
				tmpSet.add(dataExtractor.getSourceObject());
			}
			previousResultSet = tmpSet;
		}
		else {
			previousResultSet = previousExtractor.getResultSet();
		}
		// build this extract set
		EList<EObject> resultSet = new BasicEList<EObject>();
		for ( Object sourceElement : previousResultSet){
			EObject sourceObject = (EObject)sourceElement;
			Object referenced = sourceObject.eGet(extractorRef);
			if ( referenced instanceof EList<?> ){
				EList<? extends EObject> referencedList = (EList<? extends EObject>)referenced;
				resultSet.addAll(referencedList);
			} else if ( referenced instanceof EObject){
				EObject referencedObject = (EObject)referenced;
				resultSet.add(referencedObject);
			}
		}
		return resultSet;
	}
	
	

} //DataExtractorReferenceImpl
