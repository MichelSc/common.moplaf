/**
 */
package com.misc.common.moplaf.job.impl;

import com.misc.common.moplaf.job.JobFactory;
import com.misc.common.moplaf.job.JobPackage;
import com.misc.common.moplaf.job.KeyIndicator;
import com.misc.common.moplaf.job.KeyIndicators;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Key Indicators</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.job.impl.KeyIndicatorsImpl#getIndicators <em>Indicators</em>}</li>
 * </ul>
 *
 * @generated
 */
public class KeyIndicatorsImpl extends MinimalEObjectImpl.Container implements KeyIndicators {
	/**
	 * The cached value of the '{@link #getIndicators() <em>Indicators</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndicators()
	 * @generated
	 * @ordered
	 */
	protected EList<KeyIndicator> indicators;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KeyIndicatorsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JobPackage.Literals.KEY_INDICATORS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<KeyIndicator> getIndicators() {
		if (indicators == null) {
			indicators = new EObjectContainmentEList<KeyIndicator>(KeyIndicator.class, this, JobPackage.KEY_INDICATORS__INDICATORS);
		}
		return indicators;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public KeyIndicator getKeyIndicator(String name) {
		KeyIndicator indicator = this.getIndicators()
				.stream()
				.filter(i -> i.getName().equals(name))
				.findAny()
				.orElse(null);
		return indicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public KeyIndicator getOrCreateKeyIndicator(String name) {
		KeyIndicator indicator = this.getKeyIndicator(name);
		if ( indicator==null ) {
			indicator = JobFactory.eINSTANCE.createKeyIndicator();
			indicator.setName(name);
			this.getIndicators().add(indicator);
		}
		return indicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public KeyIndicator updateKeyIndicator(String name, double value) {
		KeyIndicator indicator = this.getOrCreateKeyIndicator(name);
		indicator.setValue(value);
		return indicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void refreshKeyIndicators() {
		// default does nothing
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JobPackage.KEY_INDICATORS__INDICATORS:
				return ((InternalEList<?>)getIndicators()).basicRemove(otherEnd, msgs);
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
			case JobPackage.KEY_INDICATORS__INDICATORS:
				return getIndicators();
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
			case JobPackage.KEY_INDICATORS__INDICATORS:
				getIndicators().clear();
				getIndicators().addAll((Collection<? extends KeyIndicator>)newValue);
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
			case JobPackage.KEY_INDICATORS__INDICATORS:
				getIndicators().clear();
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
			case JobPackage.KEY_INDICATORS__INDICATORS:
				return indicators != null && !indicators.isEmpty();
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
			case JobPackage.KEY_INDICATORS___GET_KEY_INDICATOR__STRING:
				return getKeyIndicator((String)arguments.get(0));
			case JobPackage.KEY_INDICATORS___GET_OR_CREATE_KEY_INDICATOR__STRING:
				return getOrCreateKeyIndicator((String)arguments.get(0));
			case JobPackage.KEY_INDICATORS___UPDATE_KEY_INDICATOR__STRING_DOUBLE:
				return updateKeyIndicator((String)arguments.get(0), (Double)arguments.get(1));
			case JobPackage.KEY_INDICATORS___REFRESH_KEY_INDICATORS:
				refreshKeyIndicators();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //KeyIndicatorsImpl
