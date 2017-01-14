/**
 */
package com.misc.common.moplaf.time.continuous.impl;

import com.misc.common.moplaf.time.continuous.ContinuousPackage;
import com.misc.common.moplaf.time.continuous.Distribution;
import com.misc.common.moplaf.time.continuous.OwnedEvent;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Owned Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class OwnedEventImpl extends DistributionEventImpl implements OwnedEvent {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OwnedEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContinuousPackage.Literals.OWNED_EVENT;
	}

	@Override
	public Distribution basicGetDistribution() {
		return (Distribution)this.eContainer();
	}
	
	

} //OwnedEventImpl
