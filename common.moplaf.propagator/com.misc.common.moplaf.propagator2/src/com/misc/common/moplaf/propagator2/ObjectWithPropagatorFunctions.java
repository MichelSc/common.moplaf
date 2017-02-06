/**
 */
package com.misc.common.moplaf.propagator2;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;

/**
 * <!-- begin-user-doc -->
 * The interface that will be supported by all object using {@link PropagatorFunction} for maintaining the state
 * of their derived elements.
 * <p>
 * Concrete object may
 * <ul> 
 * <li> use method {@link #onOwned()} 
 *   <ul> 
 *   <li> to create the PropagatorFunctions
 *   <li> to touch the created PropagatorFunction that need to be calculated at creation time
 *   <li> to do any procedural initialisations 
 *   </ul>
 * <li> use method {@link #onNotOwned()} 
 *   <ul> 
 *   <li> to do any procedural resource release, like clearing cross references 
 *   </ul>
 * </ul>
<!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.propagator2.ObjectWithPropagatorFunctions#getPropagatorFunctions <em>Propagator Functions</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.propagator2.PropagatorPackage#getObjectWithPropagatorFunctions()
 * @model
 * @generated
 */
public interface ObjectWithPropagatorFunctions extends EObject {
	/**
	 * Returns the value of the '<em><b>Propagator Functions</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.propagator2.PropagatorFunction}.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.propagator2.PropagatorFunction#getObjectWithPropagatorFunctions <em>Object With Propagator Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Propagator Functions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Propagator Functions</em>' containment reference list.
	 * @see com.misc.common.moplaf.propagator2.PropagatorPackage#getObjectWithPropagatorFunctions_PropagatorFunctions()
	 * @see com.misc.common.moplaf.propagator2.PropagatorFunction#getObjectWithPropagatorFunctions
	 * @model opposite="ObjectWithPropagatorFunctions" containment="true"
	 * @generated
	 */
	EList<PropagatorFunction> getPropagatorFunctions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addPropagatorFunction(PropagatorFunction propagatorFunction);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	PropagatorFunction getPropagatorFunction(EClass type);

	/**
	 * Convenience method 
	 * @return
	 */
	public <T> T getPropagatorFunction(Class<T> type);

	@Override
	EList<Adapter> eAdapters();

	@Override
	boolean eDeliver();

	@Override
	void eSetDeliver(boolean deliver);

	@Override
	void eNotify(Notification notification);

	@Override
	EClass eClass();

	@Override
	Resource eResource();

	@Override
	EObject eContainer();

	@Override
	EStructuralFeature eContainingFeature();

	@Override
	EReference eContainmentFeature();

	@Override
	EList<EObject> eContents();

	@Override
	TreeIterator<EObject> eAllContents();

	@Override
	boolean eIsProxy();

	@Override
	EList<EObject> eCrossReferences();

	@Override
	Object eGet(EStructuralFeature feature);

	@Override
	Object eGet(EStructuralFeature feature, boolean resolve);

	@Override
	void eSet(EStructuralFeature feature, Object newValue);

	@Override
	boolean eIsSet(EStructuralFeature feature);

	@Override
	void eUnset(EStructuralFeature feature);

	@Override
	Object eInvoke(EOperation operation, EList<?> arguments) throws InvocationTargetException;

} // ObjectWithPropagatorFunctions
