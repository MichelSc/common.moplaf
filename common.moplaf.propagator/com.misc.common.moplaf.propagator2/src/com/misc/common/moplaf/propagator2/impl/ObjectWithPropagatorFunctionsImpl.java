/**
 */
package com.misc.common.moplaf.propagator2.impl;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectEList;

import com.misc.common.moplaf.propagator2.ObjectWithPropagatorFunctions;
import com.misc.common.moplaf.propagator2.PropagatorFunction;
import com.misc.common.moplaf.propagator2.PropagatorPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object With Propagator Functions</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.propagator2.impl.ObjectWithPropagatorFunctionsImpl#getPropagatorFunctions <em>Propagator Functions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObjectWithPropagatorFunctionsImpl extends MinimalEObjectImpl.Container implements ObjectWithPropagatorFunctions {
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectWithPropagatorFunctionsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PropagatorPackage.Literals.OBJECT_WITH_PROPAGATOR_FUNCTIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public EList<PropagatorFunction> getPropagatorFunctions() {
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		//EList<PropagatorFunction> propagatorFunctions = new BasicEList<PropagatorFunction>();
		EObjectEList<PropagatorFunction> propagatorFunctions = new EObjectEList<PropagatorFunction>(PropagatorFunction.class, this, PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS__PROPAGATOR_FUNCTIONS){

			@Override
			protected boolean isNotificationRequired() {
				return false;
			}
			
		};
		
		for ( EObject element : this.eContents()){
			if ( element instanceof PropagatorFunction){
				PropagatorFunction progatorFunction= (PropagatorFunction)element;
				propagatorFunctions.addUnique(progatorFunction);
			}
		}
		
		return propagatorFunctions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Default implementation does nothing
	 * <!-- end-user-doc -->
	 */
	public void onOwned() {
	}

	/**
	 * <!-- begin-user-doc -->
	 * Method called when the owning relation is reset.
	 * Default implementation does nothing 
	 * <!-- end-user-doc -->
	 */
	public void onNotOwned() {
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS__PROPAGATOR_FUNCTIONS:
				return getPropagatorFunctions();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS__PROPAGATOR_FUNCTIONS:
				return !getPropagatorFunctions().isEmpty();
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
			case PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS___ON_OWNED:
				onOwned();
				return null;
			case PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS___ON_NOT_OWNED:
				onNotOwned();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //ObjectWithPropagatorFunctionsImpl
