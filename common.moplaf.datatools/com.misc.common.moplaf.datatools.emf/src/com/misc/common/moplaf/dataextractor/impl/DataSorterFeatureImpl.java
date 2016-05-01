/**
 */
package com.misc.common.moplaf.dataextractor.impl;

import com.misc.common.moplaf.dataextractor.DataSorterFeature;
import com.misc.common.moplaf.dataextractor.DataSorterSense;
import com.misc.common.moplaf.dataextractor.DataextractorPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Sorter Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.dataextractor.impl.DataSorterFeatureImpl#getSortedFeature <em>Sorted Feature</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataSorterFeatureImpl extends DataSorterImpl implements DataSorterFeature {
	/**
	 * The cached value of the '{@link #getSortedFeature() <em>Sorted Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSortedFeature()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature sortedFeature;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataSorterFeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataextractorPackage.Literals.DATA_SORTER_FEATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EStructuralFeature getSortedFeature() {
		if (sortedFeature != null && sortedFeature.eIsProxy()) {
			InternalEObject oldSortedFeature = (InternalEObject)sortedFeature;
			sortedFeature = (EStructuralFeature)eResolveProxy(oldSortedFeature);
			if (sortedFeature != oldSortedFeature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataextractorPackage.DATA_SORTER_FEATURE__SORTED_FEATURE, oldSortedFeature, sortedFeature));
			}
		}
		return sortedFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EStructuralFeature basicGetSortedFeature() {
		return sortedFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSortedFeature(EStructuralFeature newSortedFeature) {
		EStructuralFeature oldSortedFeature = sortedFeature;
		sortedFeature = newSortedFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataextractorPackage.DATA_SORTER_FEATURE__SORTED_FEATURE, oldSortedFeature, sortedFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataextractorPackage.DATA_SORTER_FEATURE__SORTED_FEATURE:
				if (resolve) return getSortedFeature();
				return basicGetSortedFeature();
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
			case DataextractorPackage.DATA_SORTER_FEATURE__SORTED_FEATURE:
				setSortedFeature((EStructuralFeature)newValue);
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
			case DataextractorPackage.DATA_SORTER_FEATURE__SORTED_FEATURE:
				setSortedFeature((EStructuralFeature)null);
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
			case DataextractorPackage.DATA_SORTER_FEATURE__SORTED_FEATURE:
				return sortedFeature != null;
		}
		return super.eIsSet(featureID);
	}

	/* (non-Javadoc)
	 * @see com.misc.common.moplaf.dataextractor.impl.DataSorterElementImpl#getDescription()
	 */
	@Override
	public String getDescription() {
		String baseDescription = super.getDescription();
		String thisDescription = this.getSortedFeature()==null ? "null" : this.getSortedFeature().getName();
		String description = String.format("%s/%s", baseDescription, thisDescription);
		return description;
	}

	/* (non-Javadoc)
	 * @see com.misc.common.moplaf.dataextractor.impl.DataSorterImpl#compare(org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 */
	@Override
	public int compare(EObject object1, EObject object2) {
		EStructuralFeature feature = this.getSortedFeature();
		if ( feature==null)    { return 0; }
		if ( feature.isMany()) { return 0; }
		Object value1 = object1.eGet(feature); 
		Object value2 = object2.eGet(feature);
		if ( value1 instanceof Comparable){
			int comparison = ((Comparable)value1).compareTo(value2);
			if ( comparison != 0){
				if ( this.getSense()==DataSorterSense.ASC){
				return comparison;
				} else {
				return -comparison;
				}
			} 
		}
		return 0;
	}

} //DataSorterFeatureImpl
