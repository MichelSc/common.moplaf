/**
 */
package com.misc.common.moplaf.propagator2;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import com.misc.common.moplaf.propagator2.util.PropagatorFunctionBindings;
import com.misc.common.moplaf.propagator2.util.PropagatorFunctionManagerAdapter;
import org.eclipse.emf.common.notify.Notification;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PropagatorFunction</b></em>'.
 * <p>
 * Manage the refresh of derived data elements. The PropagatorFunction declares or retrieves data elements 
 * this data element depends on, remembers whether out of date, and ultimately calls 
 * methods {@link #doRefresh()} or {@link #doRefresh(EObject)} when the derived elements must be recalculated. 
 * 
 * <p>
 * Listening to changes is delegated to an adapter: {@link PropagatorFunctionBindings}. 
 * 
 * <p>
 * A PropagatorFunction: 
 * <ul>
 * <li>offers two call-backs methods that may be overridden
 * by the concrete PropagatorFunction in order to implement the refresh logic for the derived elements
 * this adapter is responsible for; the whole purpose of the present framework is to call one of these methods 
 * exactly when needed:
 *   <ul>
 *   <li>{@link #doRefresh()}, that will be called when no touching EObject has been tracked
 *   <li>{@link #doRefresh(EObject)}, that will be called for every touching EObject that has been tracked, if any 
 *   </ul>
 * <li>maintains its touched state 
 *   <ul>
 *   <li>whether this PropagatorFunction is up to date or not: method {@link #isTouched()}
 *     <ul>
 *     <li> touched = not proven up to date with respect to its direct antecedents = needs refresh</li>
 *     <li> not touched = up to date with respects to its direct antecedents </li>
 *     </ul>
 *   <li>a collection of touched children of this PropagatorFunction: method {@link #getTouchedChildren()} 
 *   <li>a collection of Notifier's responsible for the touching: method {@link #getTouchers()} 
 *   </ul>
 * <li> offers a method, insuring that this Propagator become up to date: method {@link #refresh()}; this entails
 *   <ul>
 *   <li>refreshing all antecedents ancestors: the parent, the parent's parent, ..., recursively
 *   <li>refreshing all antecedents siblings, antecedent's antecedents sibling, ... recursively 
 *   <li>refreshing all children
 *   <li>refreshing this PropagatorFunction: method {@link #doRefresh()}
 *   </ul>
 * <li>retrieve the direct antecedents of this PropagatorFunction: the collection of PropagatorFunctions that need
 * to be proven up to date in order to update this adapter; this collection is calculated by traversing all the inbound bindings
 * of this PropagatorFunctionAdapter and by looking up other PropagatorFunctions (out) bound to the (in) bound features.
 *   <ul>
 *   <li>see {@link #getAllAntecedents()}: return all the direct antecedents
 *   <li>see {@link #getAntecedents()}: return the direct antecedents that are siblings of this PropagatorFunctionAdapters
 *   </ul>
 * <li>declares  
 *   <ul>
 *   <li>a Parent {@link PropagatorFunction}: method {@link #doGetParent()} 
 *   <li>a collection of siblings {@link PropagatorFunction} it depends on: method {@link #doGetExplicitAntecedents()}
 * that do not need to be derived from the Bindings (i.e. are explicit).  
 *   </ul>
 * satisfying 
 *   <ul>
 *   <li>first the antecedents siblings will be refreshed</li> 
 *   <li>second the children will be refreshed
 *   <li>finally this PropagatorFunction will be refreshed
 *   </ul>
 * </ul>
 * <p>
 * The {@link PropagatorFunction} life cycle is as follows
 * <ul>
 *   <li>It is created by its ObjectWithPropagatorFunctions, typically when it is created, i.e. when
 *   it is owned (by method {@link ObjectWithPropagatorFunctions#onOwned()}, called by the 
 *   method {@link PropagatorFunctionManagerAdapter#onNotifierContained})</li>
 *   <li>It is enabled when the {@link PropagatorFunctionManagerAdapter} is added to the 
 *   scope of the propagation (method {@link #enable()}, called by 
 *   {@link PropagatorFunctionManagerAdapter#onAdapterAdded})</li>
 *   <li>It is disabled when the {@link PropagatorFunctionManagerAdapter} is removed from the 
 *   scope of the propagation(method {@link #disable()}, called by 
 *   {@link PropagatorFunctionManagerAdapter#onAdapterRemoved})</li>
 *   <li>The Parent of the a PropagatorFunction is supposed to be available when the propagator is enabled
 *   (typically when the propagator is owned), and is
 *   supposed never change. Touches are lost with ownership.</li>
 * </ul>
 *   
 *   
 * @author michel
<!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.propagator2.PropagatorFunction#getParent <em>Parent</em>}</li>
 *   <li>{@link com.misc.common.moplaf.propagator2.PropagatorFunction#getAntecedents <em>Antecedents</em>}</li>
 *   <li>{@link com.misc.common.moplaf.propagator2.PropagatorFunction#getAntecedentsSibling <em>Antecedents Sibling</em>}</li>
 *   <li>{@link com.misc.common.moplaf.propagator2.PropagatorFunction#isTouched <em>Touched</em>}</li>
 *   <li>{@link com.misc.common.moplaf.propagator2.PropagatorFunction#getTouchedChildren <em>Touched Children</em>}</li>
 *   <li>{@link com.misc.common.moplaf.propagator2.PropagatorFunction#getTouchers <em>Touchers</em>}</li>
 *   <li>{@link com.misc.common.moplaf.propagator2.PropagatorFunction#isEnabled <em>Enabled</em>}</li>
 *   <li>{@link com.misc.common.moplaf.propagator2.PropagatorFunction#getObjectWithPropagatorFunctions <em>Object With Propagator Functions</em>}</li>
 *   <li>{@link com.misc.common.moplaf.propagator2.PropagatorFunction#getType <em>Type</em>}</li>
 *   <li>{@link com.misc.common.moplaf.propagator2.PropagatorFunction#getObject <em>Object</em>}</li>
 *   <li>{@link com.misc.common.moplaf.propagator2.PropagatorFunction#getInstance <em>Instance</em>}</li>
 *   <li>{@link com.misc.common.moplaf.propagator2.PropagatorFunction#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf.propagator2.PropagatorPackage#getPropagatorFunction()
 * @model
 * @generated
 */
public interface PropagatorFunction extends EObject {
	static BasicEList<PropagatorFunction> EMPTY_LIST = new BasicEList<PropagatorFunction>();

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' reference.
	 * @see com.misc.common.moplaf.propagator2.PropagatorPackage#getPropagatorFunction_Parent()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	PropagatorFunction getParent();

	/**
	 * Returns the value of the '<em><b>Antecedents</b></em>' reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.propagator2.PropagatorFunction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Antecedents</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Antecedents</em>' reference list.
	 * @see com.misc.common.moplaf.propagator2.PropagatorPackage#getPropagatorFunction_Antecedents()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<PropagatorFunction> getAntecedents();

	/**
	 * Returns the value of the '<em><b>Touched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Touched</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Touched</em>' attribute.
	 * @see #setTouched(boolean)
	 * @see com.misc.common.moplaf.propagator2.PropagatorPackage#getPropagatorFunction_Touched()
	 * @model
	 * @generated
	 */
	boolean isTouched();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.propagator2.PropagatorFunction#isTouched <em>Touched</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Touched</em>' attribute.
	 * @see #isTouched()
	 * @generated
	 */
	void setTouched(boolean value);

	/**
	 * Returns the value of the '<em><b>Touched Children</b></em>' reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.propagator2.PropagatorFunction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Touched Children</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Touched Children</em>' reference list.
	 * @see com.misc.common.moplaf.propagator2.PropagatorPackage#getPropagatorFunction_TouchedChildren()
	 * @model
	 * @generated
	 */
	EList<PropagatorFunction> getTouchedChildren();

	/**
	 * Returns the value of the '<em><b>Touchers</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Touchers</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Touchers</em>' reference list.
	 * @see com.misc.common.moplaf.propagator2.PropagatorPackage#getPropagatorFunction_Touchers()
	 * @model
	 * @generated
	 */
	EList<EObject> getTouchers();

	/**
	 * Returns the value of the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enabled</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enabled</em>' attribute.
	 * @see #setEnabled(boolean)
	 * @see com.misc.common.moplaf.propagator2.PropagatorPackage#getPropagatorFunction_Enabled()
	 * @model
	 * @generated
	 */
	boolean isEnabled();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.propagator2.PropagatorFunction#isEnabled <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enabled</em>' attribute.
	 * @see #isEnabled()
	 * @generated
	 */
	void setEnabled(boolean value);

	/**
	 * Returns the value of the '<em><b>Object With Propagator Functions</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf.propagator2.ObjectWithPropagatorFunctions#getPropagatorFunctions <em>Propagator Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object With Propagator Functions</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object With Propagator Functions</em>' container reference.
	 * @see #setObjectWithPropagatorFunctions(ObjectWithPropagatorFunctions)
	 * @see com.misc.common.moplaf.propagator2.PropagatorPackage#getPropagatorFunction_ObjectWithPropagatorFunctions()
	 * @see com.misc.common.moplaf.propagator2.ObjectWithPropagatorFunctions#getPropagatorFunctions
	 * @model opposite="PropagatorFunctions" required="true" transient="false"
	 * @generated
	 */
	ObjectWithPropagatorFunctions getObjectWithPropagatorFunctions();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf.propagator2.PropagatorFunction#getObjectWithPropagatorFunctions <em>Object With Propagator Functions</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object With Propagator Functions</em>' container reference.
	 * @see #getObjectWithPropagatorFunctions()
	 * @generated
	 */
	void setObjectWithPropagatorFunctions(ObjectWithPropagatorFunctions value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see com.misc.common.moplaf.propagator2.PropagatorPackage#getPropagatorFunction_Type()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getType();

	/**
	 * Returns the value of the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object</em>' attribute.
	 * @see com.misc.common.moplaf.propagator2.PropagatorPackage#getPropagatorFunction_Object()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getObject();

	/**
	 * Returns the value of the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance</em>' attribute.
	 * @see com.misc.common.moplaf.propagator2.PropagatorPackage#getPropagatorFunction_Instance()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getInstance();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see com.misc.common.moplaf.propagator2.PropagatorPackage#getPropagatorFunction_Description()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getDescription();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model notificationDataType="com.misc.common.moplaf.propagator2.Notification"
	 * @generated
	 */
	void notifyChangedObject(Notification notification);

	/**
	 * Returns the value of the '<em><b>Antecedents Sibling</b></em>' reference list.
	 * The list contents are of type {@link com.misc.common.moplaf.propagator2.PropagatorFunction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Antecedents Sibling</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Antecedents Sibling</em>' reference list.
	 * @see com.misc.common.moplaf.propagator2.PropagatorPackage#getPropagatorFunction_AntecedentsSibling()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<PropagatorFunction> getAntecedentsSibling();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void touch(EObject toucher);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void untouch();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean refreshAntecedents();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean refreshThis();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean refreshChildrenAndThis();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean refresh();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	PropagatorFunction doGetParent();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void doRefresh();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void doRefresh(EObject toucher);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	PropagatorFunction getScope();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EList<PropagatorFunction> doGetAntecedents();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void enable();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void disable();

} // PropagatorFunction
