/*******************************************************************************
 * Copyright (c) 2017, 2018 Michel Schaffers and others.
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
package com.misc.common.moplaf.solver.impl;


import com.misc.common.moplaf.common.util.EObjectListDerived;
import com.misc.common.moplaf.solver.Generator;
import com.misc.common.moplaf.solver.GeneratorCons;
import com.misc.common.moplaf.solver.GeneratorTuple;
import com.misc.common.moplaf.solver.GeneratorTupleMember;
import com.misc.common.moplaf.solver.GeneratorVar;
import com.misc.common.moplaf.solver.ITupleVisitor;
import com.misc.common.moplaf.solver.SolverPackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generator Tuple</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.solver.impl.GeneratorTupleImpl#getGeneratorAsRoot <em>Generator As Root</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.impl.GeneratorTupleImpl#getTupleElement <em>Tuple Element</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.impl.GeneratorTupleImpl#getTupleContainer <em>Tuple Container</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.impl.GeneratorTupleImpl#getVar <em>Var</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.impl.GeneratorTupleImpl#getCons <em>Cons</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.impl.GeneratorTupleImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.impl.GeneratorTupleImpl#getMembers <em>Members</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class GeneratorTupleImpl extends GeneratorElementImpl implements GeneratorTuple {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneratorTupleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SolverPackage.Literals.GENERATOR_TUPLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Generator getGeneratorAsRoot() {
		Generator generatorAsRoot = basicGetGeneratorAsRoot();
		return generatorAsRoot != null && generatorAsRoot.eIsProxy() ? (Generator)eResolveProxy((InternalEObject)generatorAsRoot) : generatorAsRoot;
	}
	
	private boolean isRoot(){
		return this.eContainer() instanceof Generator; 
	}

	private boolean isElement(){
		return this.eContainer() instanceof GeneratorTuple; 
	}
	
    private void checkContained(){
    	if ( isRoot() ) {
    		return;
    	}
    	if ( isElement() ){
    		return;
    	}
		throw new UnsupportedOperationException("Container of a tuple must be a Generator or another tuple and not : "+this.eContainer().eClass().getName());
    }

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Generator basicGetGeneratorAsRoot() {
		this.checkContained();
		if ( !this.isRoot() ){
			return null;
		}
		Generator generator = (Generator)this.eContainer();
		return generator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public EList<GeneratorTuple> getTupleElement() {
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		EObjectListDerived<GeneratorTuple> newList = new EObjectListDerived<GeneratorTuple>(GeneratorTuple.class, this, SolverPackage.GENERATOR_TUPLE__TUPLE_ELEMENT, true);
		for ( EObject object : this.eContents()){
			if ( object instanceof GeneratorTuple){
				GeneratorTuple tuple = (GeneratorTuple)object;
				newList.addUnique(tuple);
			}
		}
		return newList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratorTuple getTupleContainer() {
		GeneratorTuple tupleContainer = basicGetTupleContainer();
		return tupleContainer != null && tupleContainer.eIsProxy() ? (GeneratorTuple)eResolveProxy((InternalEObject)tupleContainer) : tupleContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public GeneratorTuple basicGetTupleContainer() {
		this.checkContained();
		if ( !this.isElement() ){
			return null;
		}
		GeneratorTuple tuple = (GeneratorTuple)this.eContainer();
		return tuple;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public EList<GeneratorVar> getVar() {
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		EList<GeneratorVar> newList = new EObjectListDerived<GeneratorVar>(GeneratorVar.class, this, SolverPackage.GENERATOR_TUPLE__VAR, true);
		for ( EObject element : this.eContents()){
			if ( element instanceof GeneratorVar){
				GeneratorVar var = (GeneratorVar)element;
				newList.add(var);
			}
			
		}
		return newList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public EList<GeneratorCons> getCons() {
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		EList<GeneratorCons> newList = new EObjectListDerived<GeneratorCons>(GeneratorCons.class, this, SolverPackage.GENERATOR_TUPLE__CONS, true);
		for ( EObject element : this.eContents()){
			if ( element instanceof GeneratorCons){
				GeneratorCons cons = (GeneratorCons)element;
				newList.add(cons);
			}
		}
		return newList;
	}
	
	public String getCode() {
		return this.getName();
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverPackage.GENERATOR_TUPLE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public EList<GeneratorTupleMember> getMembers() {
		EList<GeneratorTupleMember> newList = new EObjectListDerived<GeneratorTupleMember>(GeneratorTupleMember.class, 
				                                                                           this, 
				                                                                           SolverPackage.GENERATOR_TUPLE__MEMBERS,true);
		for ( EObject element : this.eContents()){
			if ( element instanceof GeneratorTupleMember){
				GeneratorTupleMember cons = (GeneratorTupleMember)element;
				newList.add(cons);
			}
		}
		return newList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void generateVars() {
		// default does nothing
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void generateCons() {
		// default does nothing
	}

	/**
	 * <!-- begin-user-doc -->
	 * Generate element tuples of this tuple. Default implementation does nothing.
	 * <!-- end-user-doc -->
	 */
	public void generateTuples() {
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Generator getGenerator() {
		GeneratorTuple tuplecontainer = this.getTupleContainer();
		if ( tuplecontainer!=null){
			return tuplecontainer.getGenerator();
		}
		return this.getGeneratorAsRoot();
	}

	/**
	 * <!-- begin-user-doc -->
	 * Visit the tuples recursively. This tuple is visited before its elements.
	 * <!-- end-user-doc -->
	 */
	public void visitTuples(ITupleVisitor visitor) throws Exception {
		// first this tuples
		visitor.visitTuple(this);
		// second its children (might have been created in the visit of this tuple
		for ( GeneratorTuple elementtuple : this.getTupleElement()){
			elementtuple.visitTuples(visitor);
		}
	}
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void generateXReferences() {
		// default implementation does nothing
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void refreshSelectedSolution() {
		for ( EObject object : this.eContents()){
			if ( object instanceof GeneratorTupleMember){
				GeneratorTupleMember element = (GeneratorTupleMember)object;
				element.refreshSelectedSolution();
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SolverPackage.GENERATOR_TUPLE__GENERATOR_AS_ROOT:
				if (resolve) return getGeneratorAsRoot();
				return basicGetGeneratorAsRoot();
			case SolverPackage.GENERATOR_TUPLE__TUPLE_ELEMENT:
				return getTupleElement();
			case SolverPackage.GENERATOR_TUPLE__TUPLE_CONTAINER:
				if (resolve) return getTupleContainer();
				return basicGetTupleContainer();
			case SolverPackage.GENERATOR_TUPLE__VAR:
				return getVar();
			case SolverPackage.GENERATOR_TUPLE__CONS:
				return getCons();
			case SolverPackage.GENERATOR_TUPLE__NAME:
				return getName();
			case SolverPackage.GENERATOR_TUPLE__MEMBERS:
				return getMembers();
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
			case SolverPackage.GENERATOR_TUPLE__NAME:
				setName((String)newValue);
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
			case SolverPackage.GENERATOR_TUPLE__NAME:
				setName(NAME_EDEFAULT);
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
			case SolverPackage.GENERATOR_TUPLE__GENERATOR_AS_ROOT:
				return basicGetGeneratorAsRoot() != null;
			case SolverPackage.GENERATOR_TUPLE__TUPLE_ELEMENT:
				return !getTupleElement().isEmpty();
			case SolverPackage.GENERATOR_TUPLE__TUPLE_CONTAINER:
				return basicGetTupleContainer() != null;
			case SolverPackage.GENERATOR_TUPLE__VAR:
				return !getVar().isEmpty();
			case SolverPackage.GENERATOR_TUPLE__CONS:
				return !getCons().isEmpty();
			case SolverPackage.GENERATOR_TUPLE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SolverPackage.GENERATOR_TUPLE__MEMBERS:
				return !getMembers().isEmpty();
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
			case SolverPackage.GENERATOR_TUPLE___GENERATE_VARS:
				generateVars();
				return null;
			case SolverPackage.GENERATOR_TUPLE___GENERATE_CONS:
				generateCons();
				return null;
			case SolverPackage.GENERATOR_TUPLE___GENERATE_TUPLES:
				generateTuples();
				return null;
			case SolverPackage.GENERATOR_TUPLE___VISIT_TUPLES__ITUPLEVISITOR:
				try {
					visitTuples((ITupleVisitor)arguments.get(0));
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case SolverPackage.GENERATOR_TUPLE___GENERATE_XREFERENCES:
				generateXReferences();
				return null;
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (Name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //GeneratorTupleImpl
