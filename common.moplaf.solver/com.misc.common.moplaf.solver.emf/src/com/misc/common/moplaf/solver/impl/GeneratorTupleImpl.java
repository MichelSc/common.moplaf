/**
 */
package com.misc.common.moplaf.solver.impl;

import com.misc.common.moplaf.solver.Generator;
import com.misc.common.moplaf.solver.GeneratorCons;
import com.misc.common.moplaf.solver.GeneratorTuple;
import com.misc.common.moplaf.solver.GeneratorTupleElement;
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
import org.eclipse.emf.ecore.util.EObjectEList;

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
 *   <li>{@link com.misc.common.moplaf.solver.impl.GeneratorTupleImpl#getCode <em>Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class GeneratorTupleImpl extends GeneratorElementImpl implements GeneratorTuple {
	/**
	 * The default value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected String code = CODE_EDEFAULT;

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
		EObjectEList<GeneratorTuple> newList = new EObjectEList<GeneratorTuple>(GeneratorTuple.class, this, SolverPackage.GENERATOR_TUPLE__TUPLE_ELEMENT);
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
		EList<GeneratorVar> newList = new EObjectEList<GeneratorVar>(GeneratorVar.class, this, SolverPackage.GENERATOR_TUPLE__VAR);
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
		EList<GeneratorCons> newList = new EObjectEList<GeneratorCons>(GeneratorCons.class, this, SolverPackage.GENERATOR_TUPLE__CONS);
		for ( EObject element : this.eContents()){
			if ( element instanceof GeneratorCons){
				GeneratorCons cons = (GeneratorCons)element;
				newList.add(cons);
			}
			
		}
		return newList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(String newCode) {
		String oldCode = code;
		code = newCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverPackage.GENERATOR_TUPLE__CODE, oldCode, code));
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
		
		visitor.visitTuple(this);
		for ( GeneratorTuple elementtuple : this.getTupleElement()){
			elementtuple.visitTuples(visitor);
		}
	}
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void refreshSelectedSolution() {
		for ( EObject object : this.eContents()){
			if ( object instanceof GeneratorTupleElement){
				GeneratorTupleElement element = (GeneratorTupleElement)object;
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
			case SolverPackage.GENERATOR_TUPLE__CODE:
				return getCode();
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
			case SolverPackage.GENERATOR_TUPLE__CODE:
				setCode((String)newValue);
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
			case SolverPackage.GENERATOR_TUPLE__CODE:
				setCode(CODE_EDEFAULT);
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
			case SolverPackage.GENERATOR_TUPLE__CODE:
				return CODE_EDEFAULT == null ? code != null : !CODE_EDEFAULT.equals(code);
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
			case SolverPackage.GENERATOR_TUPLE___GET_GENERATOR:
				return getGenerator();
			case SolverPackage.GENERATOR_TUPLE___VISIT_TUPLES__ITUPLEVISITOR:
				try {
					visitTuples((ITupleVisitor)arguments.get(0));
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case SolverPackage.GENERATOR_TUPLE___REFRESH_SELECTED_SOLUTION:
				refreshSelectedSolution();
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
		result.append(" (Code: ");
		result.append(code);
		result.append(')');
		return result.toString();
	}

} //GeneratorTupleImpl
