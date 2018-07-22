/**
 */
package com.misc.common.moplaf.datatools.impl;

import com.misc.common.moplaf.datatools.DatatoolsPackage;
import com.misc.common.moplaf.datatools.Extractor;

import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.Set;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extractor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.datatools.impl.ExtractorImpl#isPartial <em>Partial</em>}</li>
 *   <li>{@link com.misc.common.moplaf.datatools.impl.ExtractorImpl#getMaxNbSelected <em>Max Nb Selected</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ExtractorImpl extends DataToolImpl implements Extractor {
	/**
	 * The default value of the '{@link #isPartial() <em>Partial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPartial()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PARTIAL_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isPartial() <em>Partial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPartial()
	 * @generated
	 * @ordered
	 */
	protected boolean partial = PARTIAL_EDEFAULT;
	/**
	 * The default value of the '{@link #getMaxNbSelected() <em>Max Nb Selected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxNbSelected()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_NB_SELECTED_EDEFAULT = 1000000;
	/**
	 * The cached value of the '{@link #getMaxNbSelected() <em>Max Nb Selected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxNbSelected()
	 * @generated
	 * @ordered
	 */
	protected int maxNbSelected = MAX_NB_SELECTED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtractorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatatoolsPackage.Literals.EXTRACTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPartial() {
		return partial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPartial(boolean newPartial) {
		boolean oldPartial = partial;
		partial = newPartial;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatoolsPackage.EXTRACTOR__PARTIAL, oldPartial, partial));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxNbSelected() {
		return maxNbSelected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxNbSelected(int newMaxNbSelected) {
		int oldMaxNbSelected = maxNbSelected;
		maxNbSelected = newMaxNbSelected;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatoolsPackage.EXTRACTOR__MAX_NB_SELECTED, oldMaxNbSelected, maxNbSelected));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Set<EObject> extract(Set<EObject> ins) {
		Set<EObject> ins2 = this.extractImplInit(ins);
		Set<EObject> outs = this.extractImpl(ins2);
		Set<EObject> outs2 = this.extractImplFinal(outs);
		return outs2;
	}
	
	protected Set<EObject> extractImplInit(Set<EObject> ins) {
		this.setPartial(false);
		return ins;
	}
	
	protected Set<EObject> extractImpl(Set<EObject> ins) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	protected Set<EObject> extractImplFinal(Set<EObject> outs) {
		int too_many = outs.size()-this.getMaxNbSelected();
		if ( too_many>0 ) {
			this.setPartial(true);
			Iterator<EObject> iterator = outs.iterator();
			while ( too_many>0 && iterator.hasNext()) {
				iterator.next();
				iterator.remove();
				too_many--;
			}
		}
		return outs;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isValidRoot(EObject doc) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DatatoolsPackage.EXTRACTOR__PARTIAL:
				return isPartial();
			case DatatoolsPackage.EXTRACTOR__MAX_NB_SELECTED:
				return getMaxNbSelected();
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
			case DatatoolsPackage.EXTRACTOR__PARTIAL:
				setPartial((Boolean)newValue);
				return;
			case DatatoolsPackage.EXTRACTOR__MAX_NB_SELECTED:
				setMaxNbSelected((Integer)newValue);
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
			case DatatoolsPackage.EXTRACTOR__PARTIAL:
				setPartial(PARTIAL_EDEFAULT);
				return;
			case DatatoolsPackage.EXTRACTOR__MAX_NB_SELECTED:
				setMaxNbSelected(MAX_NB_SELECTED_EDEFAULT);
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
			case DatatoolsPackage.EXTRACTOR__PARTIAL:
				return partial != PARTIAL_EDEFAULT;
			case DatatoolsPackage.EXTRACTOR__MAX_NB_SELECTED:
				return maxNbSelected != MAX_NB_SELECTED_EDEFAULT;
		}
		return super.eIsSet(featureID);
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
			case DatatoolsPackage.EXTRACTOR___EXTRACT__SET:
				return extract((Set<EObject>)arguments.get(0));
			case DatatoolsPackage.EXTRACTOR___IS_VALID_ROOT__EOBJECT:
				return isValidRoot((EObject)arguments.get(0));
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
		result.append(" (Partial: ");
		result.append(partial);
		result.append(", MaxNbSelected: ");
		result.append(maxNbSelected);
		result.append(')');
		return result.toString();
	}

} //ExtractorImpl
