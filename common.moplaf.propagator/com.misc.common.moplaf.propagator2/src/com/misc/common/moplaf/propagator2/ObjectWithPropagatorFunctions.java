/**
 */
package com.misc.common.moplaf.propagator2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

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
	 * Returns the value of the '<em><b>Propagator Functions</b></em>' reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.propagator2.PropagatorFunction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Propagator Functions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Propagator Functions</em>' reference list.
	 * @see com.misc.common.moplaf.propagator2.PropagatorPackage#getObjectWithPropagatorFunctions_PropagatorFunctions()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<PropagatorFunction> getPropagatorFunctions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void onOwned();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void onNotOwned();

} // ObjectWithPropagatorFunctions
