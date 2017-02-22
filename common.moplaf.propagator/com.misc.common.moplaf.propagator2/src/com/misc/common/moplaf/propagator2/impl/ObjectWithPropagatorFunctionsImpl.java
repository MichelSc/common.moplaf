/**
 */
package com.misc.common.moplaf.propagator2.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
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
	 * The cached value of the '{@link #getPropagatorFunctions() <em>Propagator Functions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropagatorFunctions()
	 * @generated
	 * @ordered
	 */
	protected EList<PropagatorFunction> propagatorFunctions;

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
	 * @generated
	 */
	public EList<PropagatorFunction> getPropagatorFunctions() {
		if (propagatorFunctions == null) {
			propagatorFunctions = new EObjectContainmentWithInverseEList<PropagatorFunction>(PropagatorFunction.class, this, PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS__PROPAGATOR_FUNCTIONS, PropagatorPackage.PROPAGATOR_FUNCTION__OBJECT_WITH_PROPAGATOR_FUNCTIONS);
		}
		return propagatorFunctions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void addPropagatorFunction(PropagatorFunction propagatorFunction, EObject toucher) {
		PropagatorFunction pf = this.getPropagatorFunction(propagatorFunction.getClass());
		if ( pf!=null) { return; }
		this.getPropagatorFunctions().add(propagatorFunction);
		propagatorFunction.init();
		propagatorFunction.touch(toucher);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void addPropagatorFunction(PropagatorFunction propagatorFunction, boolean touch) {
		PropagatorFunction pf = this.getPropagatorFunction(propagatorFunction.getClass());
		if ( pf!=null) { return; }
		this.getPropagatorFunctions().add(propagatorFunction);
		propagatorFunction.init();
		if ( !touch) { return; }
		propagatorFunction.touch(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void addPropagatorFunction(PropagatorFunction propagatorFunction) {
		this.addPropagatorFunction(propagatorFunction, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public PropagatorFunction getPropagatorFunction(EClass type) {
		for ( PropagatorFunction propagatorFunction: this.getPropagatorFunctions()){
			if ( type.isSuperTypeOf(propagatorFunction.eClass())){
				return propagatorFunction;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public PropagatorFunction getPropagatorFunction(Object type) {
		for ( PropagatorFunction propagatorFunction: this.getPropagatorFunctions()){
			if ( ((Class<?>)type).isInstance(propagatorFunction) ){
				return propagatorFunction;
			}
		}
		return null;
	}
	
	/**
	 * Convenience method 
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public <T> T getPropagatorFunction(Class<T> type){
		Object classObject = type;
		return (T) this.getPropagatorFunction(classObject);	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS__PROPAGATOR_FUNCTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPropagatorFunctions()).basicAdd(otherEnd, msgs);
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
			case PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS__PROPAGATOR_FUNCTIONS:
				return ((InternalEList<?>)getPropagatorFunctions()).basicRemove(otherEnd, msgs);
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
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS__PROPAGATOR_FUNCTIONS:
				getPropagatorFunctions().clear();
				getPropagatorFunctions().addAll((Collection<? extends PropagatorFunction>)newValue);
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
			case PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS__PROPAGATOR_FUNCTIONS:
				getPropagatorFunctions().clear();
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
			case PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS__PROPAGATOR_FUNCTIONS:
				return propagatorFunctions != null && !propagatorFunctions.isEmpty();
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
			case PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS___ADD_PROPAGATOR_FUNCTION__PROPAGATORFUNCTION_EOBJECT:
				addPropagatorFunction((PropagatorFunction)arguments.get(0), (EObject)arguments.get(1));
				return null;
			case PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS___ADD_PROPAGATOR_FUNCTION__PROPAGATORFUNCTION_BOOLEAN:
				addPropagatorFunction((PropagatorFunction)arguments.get(0), (Boolean)arguments.get(1));
				return null;
			case PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS___ADD_PROPAGATOR_FUNCTION__PROPAGATORFUNCTION:
				addPropagatorFunction((PropagatorFunction)arguments.get(0));
				return null;
			case PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTIONS___GET_PROPAGATOR_FUNCTION__ECLASS:
				return getPropagatorFunction((EClass)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //ObjectWithPropagatorFunctionsImpl
