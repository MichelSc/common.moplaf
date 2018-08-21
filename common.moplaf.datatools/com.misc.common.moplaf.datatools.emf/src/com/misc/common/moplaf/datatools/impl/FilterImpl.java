/**
 */
package com.misc.common.moplaf.datatools.impl;

import com.misc.common.moplaf.datatools.DataToolContext;
import com.misc.common.moplaf.datatools.DataToolType;
import com.misc.common.moplaf.datatools.DatatoolsPackage;
import com.misc.common.moplaf.datatools.Extractor;
import com.misc.common.moplaf.datatools.Filter;
import com.misc.common.moplaf.datatools.FilterCompound;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extractor Filter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.datatools.impl.FilterImpl#isEnabled <em>Enabled</em>}</li>
 *   <li>{@link com.misc.common.moplaf.datatools.impl.FilterImpl#isNegated <em>Negated</em>}</li>
 *   <li>{@link com.misc.common.moplaf.datatools.impl.FilterImpl#getFilteredType <em>Filtered Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class FilterImpl extends DataToolAbstractImpl implements Filter {
	/**
	 * The default value of the '{@link #isEnabled() <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ENABLED_EDEFAULT = true;
	/**
	 * The cached value of the '{@link #isEnabled() <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnabled()
	 * @generated
	 * @ordered
	 */
	protected boolean enabled = ENABLED_EDEFAULT;

	/**
	 * The default value of the '{@link #isNegated() <em>Negated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNegated()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NEGATED_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isNegated() <em>Negated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNegated()
	 * @generated
	 * @ordered
	 */
	protected boolean negated = NEGATED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FilterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatatoolsPackage.Literals.FILTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEnabled() {
		return enabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnabled(boolean newEnabled) {
		boolean oldEnabled = enabled;
		enabled = newEnabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatoolsPackage.FILTER__ENABLED, oldEnabled, enabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNegated() {
		return negated;
	}
	
	

	@Override
	public DataToolType getType() {
		return DataToolType.FILTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNegated(boolean newNegated) {
		boolean oldNegated = negated;
		negated = newNegated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatoolsPackage.FILTER__NEGATED, oldNegated, negated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFilteredType() {
		EClass filteredType = basicGetFilteredType();
		return filteredType != null && filteredType.eIsProxy() ? (EClass)eResolveProxy((InternalEObject)filteredType) : filteredType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public EClass basicGetFilteredType() {
		EObject container = this.eContainer();
		if ( container instanceof FilterCompound ) {
			FilterCompound compound = (FilterCompound)container;
			return compound.getFilteredType();
		}
		if ( container instanceof Extractor ) {
			Extractor extractor = (Extractor)container;
			return extractor.getExtractedType();
		}
		return null;
	}

	
	@Override
	public DataToolContext basicGetContext() {
		EObject container = this.eContainer();
		if ( container instanceof FilterCompound ) {
			FilterCompound compound = (FilterCompound)container;
			return compound.getContext();
		}
		if ( container instanceof Extractor ) {
			Extractor extractor = (Extractor)container;
			return extractor.getContext();
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public boolean satisfiesFilter(EObject object) {
		if ( !this.isEnabled()) {
			return true;
		}
		if ( this.isNegated()) {
			return !this.satisfiesFilterImpl(object);
		} else {
			return this.satisfiesFilterImpl(object);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	protected boolean satisfiesFilterImpl(EObject object) {
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
			case DatatoolsPackage.FILTER__ENABLED:
				return isEnabled();
			case DatatoolsPackage.FILTER__NEGATED:
				return isNegated();
			case DatatoolsPackage.FILTER__FILTERED_TYPE:
				if (resolve) return getFilteredType();
				return basicGetFilteredType();
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
			case DatatoolsPackage.FILTER__ENABLED:
				setEnabled((Boolean)newValue);
				return;
			case DatatoolsPackage.FILTER__NEGATED:
				setNegated((Boolean)newValue);
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
			case DatatoolsPackage.FILTER__ENABLED:
				setEnabled(ENABLED_EDEFAULT);
				return;
			case DatatoolsPackage.FILTER__NEGATED:
				setNegated(NEGATED_EDEFAULT);
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
			case DatatoolsPackage.FILTER__ENABLED:
				return enabled != ENABLED_EDEFAULT;
			case DatatoolsPackage.FILTER__NEGATED:
				return negated != NEGATED_EDEFAULT;
			case DatatoolsPackage.FILTER__FILTERED_TYPE:
				return basicGetFilteredType() != null;
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
			case DatatoolsPackage.FILTER___SATISFIES_FILTER__EOBJECT:
				return satisfiesFilter((EObject)arguments.get(0));
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
		result.append(" (Enabled: ");
		result.append(enabled);
		result.append(", Negated: ");
		result.append(negated);
		result.append(')');
		return result.toString();
	}

} //ExtractorFilterImpl
