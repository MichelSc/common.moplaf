/**
 */
package com.misc.common.moplaf.solver.impl;

import com.misc.common.moplaf.solver.Generator;
import com.misc.common.moplaf.solver.GeneratorGoal;
import com.misc.common.moplaf.solver.Solution;
import com.misc.common.moplaf.solver.SolutionGoal;
import com.misc.common.moplaf.solver.Solver;
import com.misc.common.moplaf.solver.SolverPackage;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generator Goal</b></em>'.
 * <p>
 * A goal is passed to a solver as goal (indeed) to be achieved: the goal for solving.
 * <p>
 * A goal may have a subGoal, which will have to be solved after this goal has been solved.
 * 
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.solver.impl.GeneratorGoalImpl#getGenerator <em>Generator</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.impl.GeneratorGoalImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.impl.GeneratorGoalImpl#getSelectedSolutionDisplay <em>Selected Solution Display</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.impl.GeneratorGoalImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.impl.GeneratorGoalImpl#getSolution <em>Solution</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class GeneratorGoalImpl extends GeneratorElementImpl implements GeneratorGoal {
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
	 * The default value of the '{@link #getSelectedSolutionDisplay() <em>Selected Solution Display</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectedSolutionDisplay()
	 * @generated
	 * @ordered
	 */
	protected static final String SELECTED_SOLUTION_DISPLAY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSelectedSolutionDisplay() <em>Selected Solution Display</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectedSolutionDisplay()
	 * @generated
	 * @ordered
	 */
	protected String selectedSolutionDisplay = SELECTED_SOLUTION_DISPLAY_EDEFAULT;

	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSolution() <em>Solution</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolution()
	 * @generated
	 * @ordered
	 */
	protected EList<SolutionGoal> solution;

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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Generator basicGetGenerator() {
		this.checkContained();
		return (Generator)this.eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public SolutionGoal getSolutionGoal(Solution solution) {
		for(SolutionGoal currentsol : this.getSolution()) {
			if ( currentsol.getSolution()==solution) {
				return currentsol;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SolverPackage.GENERATOR_GOAL__SOLUTION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSolution()).basicAdd(otherEnd, msgs);
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
			case SolverPackage.GENERATOR_GOAL__SOLUTION:
				return ((InternalEList<?>)getSolution()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	private boolean isRoot(){
		return this.eContainer() instanceof Generator; 
	}

    private void checkContained(){
		if ( this.isRoot() ) { return; } 
		String container = this.eContainer()==null ? "null" : this.eContainer().eClass().getName();
		throw new UnsupportedOperationException("Container of a goal must be a Generator , and not : "+ container);
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
			eNotify(new ENotificationImpl(this, Notification.SET, SolverPackage.GENERATOR_GOAL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSelectedSolutionDisplay() {
		return selectedSolutionDisplay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelectedSolutionDisplay(String newSelectedSolutionDisplay) {
		String oldSelectedSolutionDisplay = selectedSolutionDisplay;
		selectedSolutionDisplay = newSelectedSolutionDisplay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverPackage.GENERATOR_GOAL__SELECTED_SOLUTION_DISPLAY, oldSelectedSolutionDisplay, selectedSolutionDisplay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public String getLabel() {
		Generator generator = this.getGenerator();
		Solution solution = generator.getSelected();
		if ( solution != null ){
			return this.getSelectedSolutionDisplay();
		}
		return this.getCode();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SolutionGoal> getSolution() {
		if (solution == null) {
			solution = new EObjectWithInverseResolvingEList<SolutionGoal>(SolutionGoal.class, this, SolverPackage.GENERATOR_GOAL__SOLUTION, SolverPackage.SOLUTION_GOAL__GOAL);
		}
		return solution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void build(Solver builder, float weight) throws Exception {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void buildCons(Solver builder, float rhs) throws Exception {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
			case SolverPackage.GENERATOR_GOAL__NAME:
				return getName();
			case SolverPackage.GENERATOR_GOAL__SELECTED_SOLUTION_DISPLAY:
				return getSelectedSolutionDisplay();
			case SolverPackage.GENERATOR_GOAL__LABEL:
				return getLabel();
			case SolverPackage.GENERATOR_GOAL__SOLUTION:
				return getSolution();
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
			case SolverPackage.GENERATOR_GOAL__SELECTED_SOLUTION_DISPLAY:
				setSelectedSolutionDisplay((String)newValue);
				return;
			case SolverPackage.GENERATOR_GOAL__SOLUTION:
				getSolution().clear();
				getSolution().addAll((Collection<? extends SolutionGoal>)newValue);
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
			case SolverPackage.GENERATOR_GOAL__SELECTED_SOLUTION_DISPLAY:
				setSelectedSolutionDisplay(SELECTED_SOLUTION_DISPLAY_EDEFAULT);
				return;
			case SolverPackage.GENERATOR_GOAL__SOLUTION:
				getSolution().clear();
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
			case SolverPackage.GENERATOR_GOAL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SolverPackage.GENERATOR_GOAL__SELECTED_SOLUTION_DISPLAY:
				return SELECTED_SOLUTION_DISPLAY_EDEFAULT == null ? selectedSolutionDisplay != null : !SELECTED_SOLUTION_DISPLAY_EDEFAULT.equals(selectedSolutionDisplay);
			case SolverPackage.GENERATOR_GOAL__LABEL:
				return LABEL_EDEFAULT == null ? getLabel() != null : !LABEL_EDEFAULT.equals(getLabel());
			case SolverPackage.GENERATOR_GOAL__SOLUTION:
				return solution != null && !solution.isEmpty();
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
			case SolverPackage.GENERATOR_GOAL___BUILD__SOLVER_FLOAT:
				try {
					build((Solver)arguments.get(0), (Float)arguments.get(1));
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case SolverPackage.GENERATOR_GOAL___BUILD_CONS__SOLVER_FLOAT:
				try {
					buildCons((Solver)arguments.get(0), (Float)arguments.get(1));
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case SolverPackage.GENERATOR_GOAL___GET_SOLUTION_GOAL__SOLUTION:
				return getSolutionGoal((Solution)arguments.get(0));
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
		result.append(", SelectedSolutionDisplay: ");
		result.append(selectedSolutionDisplay);
		result.append(')');
		return result.toString();
	}

} //GeneratorGoalImpl
