/**
 */
package com.misc.common.moplaf.solver.impl;

import com.misc.common.moplaf.solver.Generator;
import com.misc.common.moplaf.solver.GeneratorGoal;
import com.misc.common.moplaf.solver.SolverPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generator Goal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.solver.impl.GeneratorGoalImpl#getGenerator <em>Generator</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.impl.GeneratorGoalImpl#getSubGoal <em>Sub Goal</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.impl.GeneratorGoalImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class GeneratorGoalImpl extends MinimalEObjectImpl.Container implements GeneratorGoal {
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
	protected GeneratorGoalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SolverPackage.Literals.GENERATOR_GOAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Generator getGenerator() {
		Generator generator = basicGetGenerator();
		return generator != null && generator.eIsProxy() ? (Generator)eResolveProxy((InternalEObject)generator) : generator;
	}

	private boolean isRoot(){
		return this.eContainer() instanceof Generator; 
	}

	private boolean isSubGoal(){
		return this.eContainer() instanceof GeneratorGoal; 
	}

    private void checkContained(){
		if ( this.isRoot() ) { return; } 
		if ( this.isSubGoal() ) { return; } 
		throw new UnsupportedOperationException("Container of a goal must be a Generator or another goal, and not : "+this.eContainer().eClass().getName());
    }

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Generator basicGetGenerator() {
		this.checkContained();
		Generator generator = (Generator)this.eContainer();
		return generator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratorGoal getSubGoal() {
		GeneratorGoal subGoal = basicGetSubGoal();
		return subGoal != null && subGoal.eIsProxy() ? (GeneratorGoal)eResolveProxy((InternalEObject)subGoal) : subGoal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public GeneratorGoal basicGetSubGoal() {
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		for ( EObject element : this.eContents()){
			if ( element instanceof GeneratorGoal){
				GeneratorGoal goal= (GeneratorGoal)element;
				return goal;
			}
			
		}
		return null;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SolverPackage.GENERATOR_GOAL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SolverPackage.GENERATOR_GOAL__GENERATOR:
				if (resolve) return getGenerator();
				return basicGetGenerator();
			case SolverPackage.GENERATOR_GOAL__SUB_GOAL:
				if (resolve) return getSubGoal();
				return basicGetSubGoal();
			case SolverPackage.GENERATOR_GOAL__NAME:
				return getName();
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
			case SolverPackage.GENERATOR_GOAL__NAME:
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
			case SolverPackage.GENERATOR_GOAL__NAME:
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
			case SolverPackage.GENERATOR_GOAL__GENERATOR:
				return basicGetGenerator() != null;
			case SolverPackage.GENERATOR_GOAL__SUB_GOAL:
				return basicGetSubGoal() != null;
			case SolverPackage.GENERATOR_GOAL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		}
		return super.eIsSet(featureID);
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

} //GeneratorGoalImpl
