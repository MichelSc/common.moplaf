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
 * A PropagatorFunction maintains a collection of {@link PropagatorFunction}, responsible for
 * maintaining specific derived elements. They can be added by calling following methods
 * <ul> 
 * <li> method {@link #addPropagatorFunction(PropagatorFunction)} 
 * <li> method {@link #addPropagatorFunction(PropagatorFunction, boolean)}
 * <li> method {@link #addPropagatorFunction(PropagatorFunction, EObject)}
 * </ul>
 * The extra parameter can be used to indicate if the newly added PropagatorFunction
 * must be touched at addition time.
 * <p>
 * A given {@link PropagatorFunction} attached to this {@link ObjectWithPropagatorFunctions} may
 * be retrieved by the methods
 * <ul> 
 * <li> method {@link #getPropagatorFunction(EClass)}
 * <li> method {@link #getPropagatorFunction(Class)}
 * </ul>
 * using the type of the to be retrieved PropagatorFunction as key. Presently, only the type
 * of the PropagatorFunction can be used as key.
 * <!-- end-user-doc -->
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
	void addPropagatorFunction(PropagatorFunction propagatorFunction, EObject toucher);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addPropagatorFunction(PropagatorFunction propagatorFunction, boolean touch);

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
