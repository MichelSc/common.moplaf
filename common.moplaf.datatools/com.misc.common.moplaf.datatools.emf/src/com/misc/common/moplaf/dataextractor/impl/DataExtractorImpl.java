/**
 */
package com.misc.common.moplaf.dataextractor.impl;

import com.misc.common.moplaf.dataextractor.DataExtractor;
import com.misc.common.moplaf.dataextractor.DataExtractorElement;
import com.misc.common.moplaf.dataextractor.DataSorter;
import com.misc.common.moplaf.dataextractor.DataextractorPackage;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;

import org.eclipse.emf.common.CommonPlugin;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Extractor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.misc.common.moplaf.dataextractor.impl.DataExtractorImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.misc.common.moplaf.dataextractor.impl.DataExtractorImpl#getSourceObject <em>Source Object</em>}</li>
 *   <li>{@link com.misc.common.moplaf.dataextractor.impl.DataExtractorImpl#getNumberOfSelected <em>Number Of Selected</em>}</li>
 *   <li>{@link com.misc.common.moplaf.dataextractor.impl.DataExtractorImpl#getTargetObjects <em>Target Objects</em>}</li>
 *   <li>{@link com.misc.common.moplaf.dataextractor.impl.DataExtractorImpl#getSorters <em>Sorters</em>}</li>
 *   <li>{@link com.misc.common.moplaf.dataextractor.impl.DataExtractorImpl#getSourceType <em>Source Type</em>}</li>
 *   <li>{@link com.misc.common.moplaf.dataextractor.impl.DataExtractorImpl#getTargetType <em>Target Type</em>}</li>
 *   <li>{@link com.misc.common.moplaf.dataextractor.impl.DataExtractorImpl#getExtractors <em>Extractors</em>}</li>
 *   <li>{@link com.misc.common.moplaf.dataextractor.impl.DataExtractorImpl#getLastExtractor <em>Last Extractor</em>}</li>
 *   <li>{@link com.misc.common.moplaf.dataextractor.impl.DataExtractorImpl#getMaxNumberOfSelected <em>Max Number Of Selected</em>}</li>
 *   <li>{@link com.misc.common.moplaf.dataextractor.impl.DataExtractorImpl#isMaxNumberOfSelectedReached <em>Max Number Of Selected Reached</em>}</li>
 *   <li>{@link com.misc.common.moplaf.dataextractor.impl.DataExtractorImpl#getNumberOfExtracted <em>Number Of Extracted</em>}</li>
 *   <li>{@link com.misc.common.moplaf.dataextractor.impl.DataExtractorImpl#getURISave <em>URI Save</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataExtractorImpl extends MinimalEObjectImpl.Container implements DataExtractor {
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
	 * The cached value of the '{@link #getSourceObject() <em>Source Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceObject()
	 * @generated
	 * @ordered
	 */
	protected EObject sourceObject;

	/**
	 * The default value of the '{@link #getNumberOfSelected() <em>Number Of Selected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfSelected()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_OF_SELECTED_EDEFAULT = 0;


	/**
	 * The cached value of the '{@link #getNumberOfSelected() <em>Number Of Selected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfSelected()
	 * @generated
	 * @ordered
	 */
	protected int numberOfSelected = NUMBER_OF_SELECTED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTargetObjects() <em>Target Objects</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetObjects()
	 * @generated
	 * @ordered
	 */
	protected EList<EObject> targetObjects;

	/**
	 * The cached value of the '{@link #getSorters() <em>Sorters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSorters()
	 * @generated
	 * @ordered
	 */
	protected EList<DataSorter> sorters;

	/**
	 * The cached value of the '{@link #getExtractors() <em>Extractors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtractors()
	 * @generated
	 * @ordered
	 */
	protected EList<DataExtractorElement> extractors;

	/**
	 * The default value of the '{@link #getMaxNumberOfSelected() <em>Max Number Of Selected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxNumberOfSelected()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_NUMBER_OF_SELECTED_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxNumberOfSelected() <em>Max Number Of Selected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxNumberOfSelected()
	 * @generated
	 * @ordered
	 */
	protected int maxNumberOfSelected = MAX_NUMBER_OF_SELECTED_EDEFAULT;

	/**
	 * The default value of the '{@link #isMaxNumberOfSelectedReached() <em>Max Number Of Selected Reached</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMaxNumberOfSelectedReached()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MAX_NUMBER_OF_SELECTED_REACHED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMaxNumberOfSelectedReached() <em>Max Number Of Selected Reached</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMaxNumberOfSelectedReached()
	 * @generated
	 * @ordered
	 */
	protected boolean maxNumberOfSelectedReached = MAX_NUMBER_OF_SELECTED_REACHED_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberOfExtracted() <em>Number Of Extracted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfExtracted()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_OF_EXTRACTED_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumberOfExtracted() <em>Number Of Extracted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfExtracted()
	 * @generated
	 * @ordered
	 */
	protected int numberOfExtracted = NUMBER_OF_EXTRACTED_EDEFAULT;

	/**
	 * The default value of the '{@link #getURISave() <em>URI Save</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getURISave()
	 * @generated
	 * @ordered
	 */
	protected static final String URI_SAVE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getURISave() <em>URI Save</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getURISave()
	 * @generated
	 * @ordered
	 */
	protected String uriSave = URI_SAVE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataExtractorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataextractorPackage.Literals.DATA_EXTRACTOR;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataextractorPackage.DATA_EXTRACTOR__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getSourceObject() {
		if (sourceObject != null && sourceObject.eIsProxy()) {
			InternalEObject oldSourceObject = (InternalEObject)sourceObject;
			sourceObject = eResolveProxy(oldSourceObject);
			if (sourceObject != oldSourceObject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataextractorPackage.DATA_EXTRACTOR__SOURCE_OBJECT, oldSourceObject, sourceObject));
			}
		}
		return sourceObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetSourceObject() {
		return sourceObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceObject(EObject newSourceObject) {
		EObject oldSourceObject = sourceObject;
		sourceObject = newSourceObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataextractorPackage.DATA_EXTRACTOR__SOURCE_OBJECT, oldSourceObject, sourceObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumberOfSelected() {
		return numberOfSelected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfSelected(int newNumberOfSelected) {
		int oldNumberOfSelected = numberOfSelected;
		numberOfSelected = newNumberOfSelected;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataextractorPackage.DATA_EXTRACTOR__NUMBER_OF_SELECTED, oldNumberOfSelected, numberOfSelected));
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getTargetObjects() {
		if (targetObjects == null) {
			targetObjects = new EObjectResolvingEList<EObject>(EObject.class, this, DataextractorPackage.DATA_EXTRACTOR__TARGET_OBJECTS);
		}
		return targetObjects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataSorter> getSorters() {
		if (sorters == null) {
			sorters = new EObjectContainmentWithInverseEList<DataSorter>(DataSorter.class, this, DataextractorPackage.DATA_EXTRACTOR__SORTERS, DataextractorPackage.DATA_SORTER__DATA_EXTRACTOR);
		}
		return sorters;
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
		EObject sourceObject = this.getSourceObject();
		if ( sourceObject== null){ return null; }
		EClass sourceType = sourceObject.eClass();
		return sourceType;
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
	 */
	public EClass basicGetTargetType() {
		DataExtractorElement lastExtractor = this.getLastExtractor();
		if ( lastExtractor==null){return null;}
		return lastExtractor.getTargetType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataExtractorElement> getExtractors() {
		if (extractors == null) {
			extractors = new EObjectContainmentWithInverseEList<DataExtractorElement>(DataExtractorElement.class, this, DataextractorPackage.DATA_EXTRACTOR__EXTRACTORS, DataextractorPackage.DATA_EXTRACTOR_ELEMENT__DATA_EXTRACTOR);
		}
		return extractors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataExtractorElement getLastExtractor() {
		DataExtractorElement lastExtractor = basicGetLastExtractor();
		return lastExtractor != null && lastExtractor.eIsProxy() ? (DataExtractorElement)eResolveProxy((InternalEObject)lastExtractor) : lastExtractor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public DataExtractorElement basicGetLastExtractor() {
		if ( this.getExtractors()==null) { return null; }
		if ( this.getExtractors().size()==0 ){ return null; }
		DataExtractorElement lastExtractor = this.getExtractors().get(this.getExtractors().size()-1);
		return lastExtractor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxNumberOfSelected() {
		return maxNumberOfSelected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxNumberOfSelected(int newMaxNumberOfSelected) {
		int oldMaxNumberOfSelected = maxNumberOfSelected;
		maxNumberOfSelected = newMaxNumberOfSelected;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataextractorPackage.DATA_EXTRACTOR__MAX_NUMBER_OF_SELECTED, oldMaxNumberOfSelected, maxNumberOfSelected));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMaxNumberOfSelectedReached() {
		return maxNumberOfSelectedReached;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxNumberOfSelectedReached(boolean newMaxNumberOfSelectedReached) {
		boolean oldMaxNumberOfSelectedReached = maxNumberOfSelectedReached;
		maxNumberOfSelectedReached = newMaxNumberOfSelectedReached;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataextractorPackage.DATA_EXTRACTOR__MAX_NUMBER_OF_SELECTED_REACHED, oldMaxNumberOfSelectedReached, maxNumberOfSelectedReached));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumberOfExtracted() {
		return numberOfExtracted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfExtracted(int newNumberOfExtracted) {
		int oldNumberOfExtracted = numberOfExtracted;
		numberOfExtracted = newNumberOfExtracted;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataextractorPackage.DATA_EXTRACTOR__NUMBER_OF_EXTRACTED, oldNumberOfExtracted, numberOfExtracted));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getURISave() {
		return uriSave;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setURISave(String newURISave) {
		String oldURISave = uriSave;
		uriSave = newURISave;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataextractorPackage.DATA_EXTRACTOR__URI_SAVE, oldURISave, uriSave));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void refresh() {
		// get the to be
		DataExtractorElement lastExtractor = this.getLastExtractor();
		LinkedList<EObject> tobe = new LinkedList<EObject>();
		if ( lastExtractor!=null){
			for ( Object object: lastExtractor.getResultSet()){
				if ( object instanceof EObject){
					tobe.addLast((EObject)object);
				}
			}
		}
		int nofExtracted = tobe.size(); 
		// sort the result
		Comparator<EObject> comparator = new Comparator<EObject>(){
			@Override
			public int compare(EObject arg0, EObject arg1) {
				for ( DataSorter sorter : DataExtractorImpl.this.getSorters()){
					int comparison = sorter.compare(arg0, arg1);
					if ( comparison != 0 ){ return comparison; }
				}
				return 0;
			}
		}; // nested class comparator
		Collections.sort(tobe, comparator);
		// truncate the to be
		boolean maxreached = false;
		int maxToBe = this.getMaxNumberOfSelected();
		while ( tobe.size()>maxToBe){
			tobe.removeLast();
			maxreached = true;
		}
		
        // remove the too much
		HashSet<EObject> setToBe = new HashSet<EObject>(tobe);
		HashSet<EObject> setAsIs = new HashSet<EObject>(this.getTargetObjects());
		this.getTargetObjects().retainAll(setToBe);
		
		// add the too little
		// selectedBuckets is now the intersection of asis and tobe
		// tobe is now the to be added ( tobe - asis)
		tobe.removeAll(setAsIs);
		
		this.getTargetObjects().addAll(tobe);
		this.setNumberOfSelected(this.getTargetObjects().size());
		this.setNumberOfExtracted(nofExtracted);
		this.setMaxNumberOfSelectedReached(maxreached);
		
		// and more sorting
		ECollections.sort(this.getTargetObjects(), comparator);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void save() {
		CommonPlugin.INSTANCE.log("DataExtractor.save: uri="+this.getURISave());
		ResourceSet resourceSet = this.eResource().getResourceSet();
		URI uri = URI.createURI(this.getURISave());
		Resource newResource = resourceSet.createResource(uri);
		EcoreUtil.Copier aCopier = new EcoreUtil.Copier();
		for ( EObject currentObject : this.getTargetObjects()){
			EObject objectCopy = aCopier.copy(currentObject);
			newResource.getContents().add(objectCopy);
		}
		CommonPlugin.INSTANCE.log("DataExtractor.save: done");
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
			case DataextractorPackage.DATA_EXTRACTOR__SORTERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSorters()).basicAdd(otherEnd, msgs);
			case DataextractorPackage.DATA_EXTRACTOR__EXTRACTORS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getExtractors()).basicAdd(otherEnd, msgs);
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
			case DataextractorPackage.DATA_EXTRACTOR__SORTERS:
				return ((InternalEList<?>)getSorters()).basicRemove(otherEnd, msgs);
			case DataextractorPackage.DATA_EXTRACTOR__EXTRACTORS:
				return ((InternalEList<?>)getExtractors()).basicRemove(otherEnd, msgs);
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
			case DataextractorPackage.DATA_EXTRACTOR__NAME:
				return getName();
			case DataextractorPackage.DATA_EXTRACTOR__SOURCE_OBJECT:
				if (resolve) return getSourceObject();
				return basicGetSourceObject();
			case DataextractorPackage.DATA_EXTRACTOR__NUMBER_OF_SELECTED:
				return getNumberOfSelected();
			case DataextractorPackage.DATA_EXTRACTOR__TARGET_OBJECTS:
				return getTargetObjects();
			case DataextractorPackage.DATA_EXTRACTOR__SORTERS:
				return getSorters();
			case DataextractorPackage.DATA_EXTRACTOR__SOURCE_TYPE:
				if (resolve) return getSourceType();
				return basicGetSourceType();
			case DataextractorPackage.DATA_EXTRACTOR__TARGET_TYPE:
				if (resolve) return getTargetType();
				return basicGetTargetType();
			case DataextractorPackage.DATA_EXTRACTOR__EXTRACTORS:
				return getExtractors();
			case DataextractorPackage.DATA_EXTRACTOR__LAST_EXTRACTOR:
				if (resolve) return getLastExtractor();
				return basicGetLastExtractor();
			case DataextractorPackage.DATA_EXTRACTOR__MAX_NUMBER_OF_SELECTED:
				return getMaxNumberOfSelected();
			case DataextractorPackage.DATA_EXTRACTOR__MAX_NUMBER_OF_SELECTED_REACHED:
				return isMaxNumberOfSelectedReached();
			case DataextractorPackage.DATA_EXTRACTOR__NUMBER_OF_EXTRACTED:
				return getNumberOfExtracted();
			case DataextractorPackage.DATA_EXTRACTOR__URI_SAVE:
				return getURISave();
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
			case DataextractorPackage.DATA_EXTRACTOR__NAME:
				setName((String)newValue);
				return;
			case DataextractorPackage.DATA_EXTRACTOR__SOURCE_OBJECT:
				setSourceObject((EObject)newValue);
				return;
			case DataextractorPackage.DATA_EXTRACTOR__NUMBER_OF_SELECTED:
				setNumberOfSelected((Integer)newValue);
				return;
			case DataextractorPackage.DATA_EXTRACTOR__TARGET_OBJECTS:
				getTargetObjects().clear();
				getTargetObjects().addAll((Collection<? extends EObject>)newValue);
				return;
			case DataextractorPackage.DATA_EXTRACTOR__SORTERS:
				getSorters().clear();
				getSorters().addAll((Collection<? extends DataSorter>)newValue);
				return;
			case DataextractorPackage.DATA_EXTRACTOR__EXTRACTORS:
				getExtractors().clear();
				getExtractors().addAll((Collection<? extends DataExtractorElement>)newValue);
				return;
			case DataextractorPackage.DATA_EXTRACTOR__MAX_NUMBER_OF_SELECTED:
				setMaxNumberOfSelected((Integer)newValue);
				return;
			case DataextractorPackage.DATA_EXTRACTOR__MAX_NUMBER_OF_SELECTED_REACHED:
				setMaxNumberOfSelectedReached((Boolean)newValue);
				return;
			case DataextractorPackage.DATA_EXTRACTOR__NUMBER_OF_EXTRACTED:
				setNumberOfExtracted((Integer)newValue);
				return;
			case DataextractorPackage.DATA_EXTRACTOR__URI_SAVE:
				setURISave((String)newValue);
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
			case DataextractorPackage.DATA_EXTRACTOR__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DataextractorPackage.DATA_EXTRACTOR__SOURCE_OBJECT:
				setSourceObject((EObject)null);
				return;
			case DataextractorPackage.DATA_EXTRACTOR__NUMBER_OF_SELECTED:
				setNumberOfSelected(NUMBER_OF_SELECTED_EDEFAULT);
				return;
			case DataextractorPackage.DATA_EXTRACTOR__TARGET_OBJECTS:
				getTargetObjects().clear();
				return;
			case DataextractorPackage.DATA_EXTRACTOR__SORTERS:
				getSorters().clear();
				return;
			case DataextractorPackage.DATA_EXTRACTOR__EXTRACTORS:
				getExtractors().clear();
				return;
			case DataextractorPackage.DATA_EXTRACTOR__MAX_NUMBER_OF_SELECTED:
				setMaxNumberOfSelected(MAX_NUMBER_OF_SELECTED_EDEFAULT);
				return;
			case DataextractorPackage.DATA_EXTRACTOR__MAX_NUMBER_OF_SELECTED_REACHED:
				setMaxNumberOfSelectedReached(MAX_NUMBER_OF_SELECTED_REACHED_EDEFAULT);
				return;
			case DataextractorPackage.DATA_EXTRACTOR__NUMBER_OF_EXTRACTED:
				setNumberOfExtracted(NUMBER_OF_EXTRACTED_EDEFAULT);
				return;
			case DataextractorPackage.DATA_EXTRACTOR__URI_SAVE:
				setURISave(URI_SAVE_EDEFAULT);
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
			case DataextractorPackage.DATA_EXTRACTOR__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DataextractorPackage.DATA_EXTRACTOR__SOURCE_OBJECT:
				return sourceObject != null;
			case DataextractorPackage.DATA_EXTRACTOR__NUMBER_OF_SELECTED:
				return numberOfSelected != NUMBER_OF_SELECTED_EDEFAULT;
			case DataextractorPackage.DATA_EXTRACTOR__TARGET_OBJECTS:
				return targetObjects != null && !targetObjects.isEmpty();
			case DataextractorPackage.DATA_EXTRACTOR__SORTERS:
				return sorters != null && !sorters.isEmpty();
			case DataextractorPackage.DATA_EXTRACTOR__SOURCE_TYPE:
				return basicGetSourceType() != null;
			case DataextractorPackage.DATA_EXTRACTOR__TARGET_TYPE:
				return basicGetTargetType() != null;
			case DataextractorPackage.DATA_EXTRACTOR__EXTRACTORS:
				return extractors != null && !extractors.isEmpty();
			case DataextractorPackage.DATA_EXTRACTOR__LAST_EXTRACTOR:
				return basicGetLastExtractor() != null;
			case DataextractorPackage.DATA_EXTRACTOR__MAX_NUMBER_OF_SELECTED:
				return maxNumberOfSelected != MAX_NUMBER_OF_SELECTED_EDEFAULT;
			case DataextractorPackage.DATA_EXTRACTOR__MAX_NUMBER_OF_SELECTED_REACHED:
				return maxNumberOfSelectedReached != MAX_NUMBER_OF_SELECTED_REACHED_EDEFAULT;
			case DataextractorPackage.DATA_EXTRACTOR__NUMBER_OF_EXTRACTED:
				return numberOfExtracted != NUMBER_OF_EXTRACTED_EDEFAULT;
			case DataextractorPackage.DATA_EXTRACTOR__URI_SAVE:
				return URI_SAVE_EDEFAULT == null ? uriSave != null : !URI_SAVE_EDEFAULT.equals(uriSave);
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
			case DataextractorPackage.DATA_EXTRACTOR___REFRESH:
				refresh();
				return null;
			case DataextractorPackage.DATA_EXTRACTOR___SAVE:
				save();
				return null;
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (Name: ");
		result.append(name);
		result.append(", NumberOfSelected: ");
		result.append(numberOfSelected);
		result.append(", MaxNumberOfSelected: ");
		result.append(maxNumberOfSelected);
		result.append(", MaxNumberOfSelectedReached: ");
		result.append(maxNumberOfSelectedReached);
		result.append(", NumberOfExtracted: ");
		result.append(numberOfExtracted);
		result.append(", URISave: ");
		result.append(uriSave);
		result.append(')');
		return result.toString();
	}

} //DataExtractorImpl
