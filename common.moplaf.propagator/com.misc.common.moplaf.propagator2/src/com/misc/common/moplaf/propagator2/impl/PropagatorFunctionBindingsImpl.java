/*******************************************************************************
 * Copyright (c) 2017 Michel Schaffers and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Michel Schaffers - initial API and implementation
 *******************************************************************************/
/**
 */
package com.misc.common.moplaf.propagator2.impl;


import com.misc.common.moplaf.common.util.EObjectListDerived;
import com.misc.common.moplaf.propagator2.ObjectWithPropagatorFunctions;
import com.misc.common.moplaf.propagator2.PropagatorFunction;
import com.misc.common.moplaf.propagator2.PropagatorFunctionBindings;
import com.misc.common.moplaf.propagator2.PropagatorPackage;

import com.misc.common.moplaf.propagator2.util.Bindings;
import com.misc.common.moplaf.propagator2.util.PropagatorFunctionAdapter;
import com.misc.common.moplaf.propagator2.util.PropagatorFunctionSource;
import com.misc.common.moplaf.propagator2.util.PropagatorFunctionSourceBindings;
import com.misc.common.moplaf.propagator2.util.Util;

import java.lang.reflect.InvocationTargetException;
import java.util.function.Predicate;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Bindings</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class PropagatorFunctionBindingsImpl extends PropagatorFunctionImpl implements PropagatorFunctionBindings {

	private Bindings bindings = null;
	
	protected Bindings getBindings(){
		if ( this.bindings == null ){
			this.bindings = this.doGetBindings();
		}
		return this.bindings; 
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropagatorFunctionBindingsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PropagatorPackage.Literals.PROPAGATOR_FUNCTION_BINDINGS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Bindings doGetBindings() {
		// default has not binding
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void doCollectExplicitAntecedents(EList<PropagatorFunction> antecedents) {
		// default does nothing
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
			case PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___DO_GET_BINDINGS:
				return doGetBindings();
			case PropagatorPackage.PROPAGATOR_FUNCTION_BINDINGS___DO_COLLECT_EXPLICIT_ANTECEDENTS__ELIST:
				doCollectExplicitAntecedents((EList<PropagatorFunction>)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}
	
	/**
	 * getAntecedents logic
	 */
	/**
	 * Method getAntecedents_prvt
	 * @param antecedents
	 * @param doCollect
	 */
	private void collectAntecedents_prvt(EList<PropagatorFunction> antecedents, Predicate<PropagatorFunction> doCollect) {
		// explicit antecedents
		this.doCollectExplicitAntecedents(antecedents);
		
		// bound antecedents
		Bindings bindings = this.getBindings();
		if ( bindings!=null){
			ObjectWithPropagatorFunctions object = this.getObjectWithPropagatorFunctions();
			PropagatorFunctionAdapter adapter = Util.getPropagatorFunctionAdapter(object);
			PropagatorFunctionSource source = adapter.getSource(this, bindings);
			if ( source==null) {
				// the propagatorFunction is not enabled
				// its sources are not registered
				// the propagatorFunction is not capable of retrieving its antecedents
				// so do nothing
			} else {
				source.collectAntecedents(antecedents, doCollect);
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public EList<PropagatorFunction> getAntecedents() {
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		EList<PropagatorFunction> antecedents = new EObjectListDerived<PropagatorFunction>(PropagatorFunction.class, 
				                                                                           this, 
				                                                                           PropagatorPackage.PROPAGATOR_FUNCTION__ANTECEDENTS, 
				                                                                           true); // skip notifications
		
		this.collectAntecedents_prvt(antecedents, null);
		
		return antecedents;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public EList<PropagatorFunction> getAntecedentsSibling() {
		class IsSiblingPredicate implements Predicate<PropagatorFunction>{

			@Override
			public boolean test(PropagatorFunction arg0) {
				return PropagatorFunctionBindingsImpl.this.getParent()==arg0.getParent();
			}
			
		}
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		EList<PropagatorFunction> antecedents = new EObjectListDerived<PropagatorFunction>(PropagatorFunction.class, 
				                                                                           this, 
				                                                                           PropagatorPackage.PROPAGATOR_FUNCTION__ANTECEDENTS_SIBLING,
				                                                                           true);  // skip notifications
		
		this.collectAntecedents_prvt(antecedents, new IsSiblingPredicate());
		
		return antecedents;
	}
	
	/** Enable Disable logic
	 * 
	 */
	/**
	 * method enable(), to be implemented by the derived class. Responsible for
	 * <ul>
	 * <li>Create the Adapter (listener) and begins the listening</li>
	 * <li>Register this class for the listening</li>
	 * <li>Optionally, init the dependencies</li>
	 * </ul>
	 * 
	 * 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void enable() {
		Bindings bindings = this.getBindings();
		if ( bindings!=null){
			ObjectWithPropagatorFunctions object = this.getObjectWithPropagatorFunctions();
			
			PropagatorFunctionAdapter adapter = Util.getPropagatorFunctionAdapter(object);
			
			PropagatorFunctionSourceBindings source = new PropagatorFunctionSourceBindings(object, this, bindings);
			
			adapter.addSource(source);
		}
		
		super.enable();
		
	}
	
	/** method disable
	 * 
	 */
	public void disable() {
		this.enabled = false;

		// unregister
		Bindings bindings = this.getBindings();
		if ( bindings!=null){
			ObjectWithPropagatorFunctions object = this.getObjectWithPropagatorFunctions();
		
			PropagatorFunctionAdapter adapter = Util.getPropagatorFunctionAdapter(object);
			
			PropagatorFunctionSource source = adapter.getSource(this, bindings);
			
			adapter.removeSource(source);
	
			if ( adapter.sourcesSetEmpty()){
				object.eAdapters().remove(adapter);
			}
		}
	}
}
